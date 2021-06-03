table 50100 Book
{
    DataClassification = ToBeClassified;
    DataCaptionFields = Id, Title, PageCount;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
            //AutoIncrement =true;
        }
        field(2; Title; Text[100])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                Message('OnValidate has run');
                if StrLen(Rec.Title) = 0 then begin
                    Error('The title must have a value');
                end;
            end;
        }
        field(3; PageCount; integer)
        {
            DataClassification = ToBeClassified;
        }
        field(4; HoursToRead; Decimal)
        {
            DataClassification = ToBeClassified;
        }
        field(5; AuthorId; integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Author;
        }
        field(6; HardCover; Boolean)
        {
            DataClassification = ToBeClassified;

        }
        field(7; NumOfHarcoverBooks; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Book where(HardCover = const(true)));
        }
        field(8; NumOfBooks; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Book);
        }
        field(9; TotalHoursOfRead; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = sum(Book.HoursToRead);
        }

    }

    keys
    {
        key(pm; id)
        {
            Clustered = true;
        }
    }

    trigger OnInsert()
    begin
        //Message('OnInsert trigger run.');
        Validate(Rec.Title);
        Rec.HoursToRead := (Rec.PageCount * 2) / 60;
    end;

    trigger OnModify();
    var
        Text001: Label 'Hello World';
    begin
        Message(Text001);
        Rec.HoursToRead := (Rec.PageCount * 2) / 60;
    end;

    trigger OnDelete()
    var
        Text002: Label 'OnDelete trigger run';
    begin
        Message(Text002);
    end;

    trigger OnRename()
    var
        Text003: Label 'OnRename trigger run';
    begin
        Message(Text003);
    end;

}