table 50102 Exam
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; DueDate; Date)
        {
            DataClassification = ToBeClassified;

        }
        field(3; MaxScore; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; Subject; Text[40])
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

    var
        myInt: Integer;

    trigger OnInsert()
    begin

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