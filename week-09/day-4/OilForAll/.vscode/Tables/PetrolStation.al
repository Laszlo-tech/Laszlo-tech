table 50101 PetrolStation
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
            begin
                if StrLen(Name) < 0 then begin
                    Error('Invalid Name');
                end;

            end;

        }
        field(3; Budget; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; StartOfCont; Date)
        {
            DataClassification = ToBeClassified;


        }
        field(5; EndOfCont; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if EndOfCont < StartOfCont then begin
                    Error('Invalid date');
                end;
            end;

        }

        field(7; OilFieldId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = OilField;




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
        Validate(Name);
        Validate(EndOfCont);
        if Rec.EndOfCont - Rec.StartOfCont < 6 then begin
            Error('Contract must be at least 6 days');
        end;
        if Rec.Budget < (Rec.EndOfCont - Rec.StartOfCont) * 1500 then begin
            Error('Not enough money');
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