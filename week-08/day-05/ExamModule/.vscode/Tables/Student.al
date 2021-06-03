table 50101 Student
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; StudentName; Text[40])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()

            begin
                if StrLen(Rec.StudentName) < 4 then begin
                    FieldError(StudentName, 'Invalid name ');
                end;
            end;

        }
        field(3; Email; Text[40])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()

            begin
                if Email.Contains('@') then begin
                    exit
                end
                else begin
                    FieldError(Email, 'Invalid email address');
                end;
            end;

        }
        field(4; Gender; Text[10])
        {
            DataClassification = ToBeClassified;
            // trigger OnValidate()
            // var
            //     Female: Text[10];
            //     Male: Text[10];

            // begin
            //     case Gender of
            //     Gender :=  Female;



            //     end;
            // end;
        }
        field(5; DateOfBirth; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            var
                myInt: Integer;
            begin
                if DateOfBirth > Today then begin
                    FieldError(DateOfBirth, 'Invalid date of birth');
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