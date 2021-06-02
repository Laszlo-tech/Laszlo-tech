table 50101 Movie
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; MovieId; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Title; Text[100])
        {
            DataClassification = ToBeClassified;

        }
        field(3; LengthInMinutes; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.LengthInMinutes < 60 then begin
                    Error('Too short movie');
                end;
            end;

        }
        field(4; DirectorId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Director.Id;

        }
        field(5; DirectorName; Text[40])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Director.Name where(Id = field(DirectorId)));
        }

        field(6; Year; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.Year < 1900 then begin
                    Error('Wrong date');

                end;
            end;
        }
    }

    keys
    {
        key(PK; MovieId)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    begin
        Validate(Year);
        Validate(LengthInMinutes);
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