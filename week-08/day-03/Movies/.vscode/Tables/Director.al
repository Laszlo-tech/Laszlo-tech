table 50100 Director
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;


        }
        field(2; Name; Text[40])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()

            begin
                if StrLen(Rec.Name) < 3 then begin
                    Message('Must be at least 3 characters');
                end;
            end;

        }


        field(3; Birth; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; DomesticSalesIncome; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = sum(BoxOffice.DomesticSales where(DirectorId = field(Id)));

        }
        field(5; AvarageRating; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = average(BoxOffice.Rating where(DirectorId = field(Id)));

        }
        field(6; TotalMovies; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Movie where(DirectorId = field(Id)));

        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    trigger OnInsert()

    begin
        Validate(Rec.Name);
        Rec.Name := UpperCase(Name);

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