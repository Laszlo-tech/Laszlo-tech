table 50101 HotelRoom
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Name; Text[100])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            var
                myInt: Integer;
            begin
                if StrLen(Name) <= 0 then begin
                    FieldError(Name, 'Invalid input');
                end;
            end;
        }
        field(3; PriceForNight; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()

            begin
                if Rec.PriceForNight = 0 then begin
                    FieldError(PriceForNight, 'Invalid input');
                end
            end;
        }
        field(4; HotelId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Hotel;
        }
        field(5; HotelName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Hotel.Name where(Id = field(HotelId)));
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
    begin
        Validate(Name);
        Validate(PriceForNight);
    end;

    trigger OnModify()
    begin
        Validate(Name);
        Validate(PriceForNight);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}