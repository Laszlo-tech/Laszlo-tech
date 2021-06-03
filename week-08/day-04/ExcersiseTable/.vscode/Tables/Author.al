table 50101 Author
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
        }
        // field(3; NumberOfBooksWritten; Integer)
        // {
        //     FieldClass = FlowField;
        //     CalcFormula = count(Book where(AuthorId = field(Id)));
        // }
    }

    keys
    {
        key(pm; Id)
        {
            Clustered = true;
        }
    }
}