table 50100 Hotel
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
                If StrLen(Name) <= 0 then begin
                    FieldError(Name, 'Invalid input');
                end;
            end;
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
    end;

    trigger OnModify()
    begin
        Validate(Name);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}