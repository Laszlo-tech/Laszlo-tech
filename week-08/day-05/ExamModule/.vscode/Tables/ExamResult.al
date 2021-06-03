table 50103 ExamResult
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; StudentId; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(3; StudenScore; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(4; ExamId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Exam.Id;

        }

        field(5; ExamDate; Date)
        {
            DataClassification = ToBeClassified;
            TableRelation = Exam.DueDate;

        }

        field(6; Attend; Boolean)
        {
            DataClassification = ToBeClassified;

        }
    }

    keys
    {
        key(Pk; Id)
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