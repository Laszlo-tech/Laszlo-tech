page 50106 RoleCenterBookCardPart
{
    PageType = CardPart;
    SourceTable = Book;


    layout
    {
        area(Content)
        {

            cuegroup(Calculation)
            {
                Caption = 'Calculation review';
                field(NumOfHarcoverBooks; Rec.NumOfHarcoverBooks)
                {
                    ApplicationArea = All;
                    Caption = 'Number of Hardcover books';
                }
                field(NumOfBooks; Rec.NumOfBooks)
                {
                    ApplicationArea = All;
                    Caption = 'Number of  books';
                }
                field(TotalHoursOfRead; Rec.TotalHoursOfRead)
                {
                    ApplicationArea = All;
                    Caption = 'Hours it takes to read all';
                }
            }
        }
    }

}