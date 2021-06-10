table 50100 OilField
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; MaxOilBarrel; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.MaxOilBarrel < 10000 then begin
                    Error('Invalid input');
                end;
            end;

        }
        field(3; IncomeOil; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.IncomeOil <= 0 then begin
                    Error('Invalid input');
                end;
            end;

        }
        field(4; Expenses; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.Expenses <= 0 then begin
                    Error('Invalid input');
                end;
            end;

        }
        field(5; Location; Text[100])
        {
            DataClassification = ToBeClassified;

        }
        field(6; Name; Text[100])
        {
            DataClassification = ToBeClassified;

        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }
    fieldgroups
    {
        fieldgroup(DropDown; Name) { }
    }

    var
        myInt: Integer;

    trigger OnInsert()

    begin
        Validate(Expenses);
        Validate(IncomeOil);
        Validate(MaxOilBarrel);
        if Expenses > IncomeOil * 4 * 10 then begin
            Error('It would be a profitloss');
        end;
    end;

    trigger OnModify()
    begin

    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}