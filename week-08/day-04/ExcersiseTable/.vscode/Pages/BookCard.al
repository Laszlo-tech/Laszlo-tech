page 50100 BookCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Book;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;

                }
                field(Author; Rec.AuthorId)
                {
                    ApplicationArea = All;

                }

            }
            group(Details)
            {
                field(PageCount; Rec.PageCount)
                {
                    ApplicationArea = All;

                }
            }
        }
    }
}