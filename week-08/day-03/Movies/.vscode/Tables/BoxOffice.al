table 50102 BoxOffice
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Rating; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(3; DomesticSales; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()

            begin
                If Rec.DomesticSales < 0 then begin
                    Error('Can not be negative number!');
                end;
            end;

        }
        field(4; InternationalSales; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()

            begin
                If Rec.InternationalSales < 0 then begin
                    Error('Can not be negative number!');
                end;
            end;

        }
        field(5; MovieId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Movie.MovieId;

        }
        field(6; MovieTitle; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.Title where(MovieId = field(MovieId)));

        }
        field(7; DirectorId; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.DirectorId where(MovieId = field(MovieId)));

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
        Validate(InternationalSales);
        Validate(DomesticSales);

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