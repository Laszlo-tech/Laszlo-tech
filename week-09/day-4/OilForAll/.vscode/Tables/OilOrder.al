table 50102 OilOrder
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; PetrolStationId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = PetrolStation;

        }
        field(3; AmountOfBarrel; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; PriceForABarrel; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(5; Indicator; Boolean)
        {
            DataClassification = ToBeClassified;

        }
        field(6; PetrolStationBudget; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(PetrolStation.Budget where(id = field(PetrolStationId)));

        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    var
        PetrolStationRecord: Record PetrolStation;
        Cost: Integer;
    begin
        if PetrolStationRecord.Get(Rec.PetrolStationId) then begin
            If Rec.AmountOfBarrel * Rec.PriceForABarrel > PetrolStationRecord.Budget then begin
                Error('Not enough budget to buy that much barrel of oil');
            end;
        end;
        Cost := Rec.AmountOfBarrel * Rec.PriceForABarrel;
        if PetrolStationRecord.Get(Rec.PetrolStationId) then begin

            if Indicator then begin
                PetrolStationRecord.Budget := PetrolStationRecord.Budget - Cost;
                PetrolStationRecord.Modify();


            end;
        end;
    end;

    trigger OnModify()
    var
        PetrolStationRecord: Record PetrolStation;
        Cost: Integer;
    begin
        Cost := Rec.AmountOfBarrel * Rec.PriceForABarrel;
        if PetrolStationRecord.Get(Rec.PetrolStationId) then begin

            if Indicator then begin
                PetrolStationRecord.Budget -= Cost;


            end;
        end;
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}