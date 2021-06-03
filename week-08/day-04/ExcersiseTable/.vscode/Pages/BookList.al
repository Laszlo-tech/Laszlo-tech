page 50101 BookList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Book;
    CardPageId = BookCard;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;


                }
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;

                }
                field(PageCount; Rec.PageCount)
                {
                    ApplicationArea = All;

                }
                field(HoursToRead; Rec.HoursToRead)
                {
                    ApplicationArea = All;

                }
                field(AuthorId; Rec.AuthorId)
                {
                    ApplicationArea = All;

                }
            }
        }
        area(FactBoxes)
        {
            systempart(Links; Links)
            {
                ApplicationArea = All;
            }
            systempart(Notes; Notes)
            {
                ApplicationArea = All;
            }

        }
    }
    actions
    {
        area(Navigation)
        {
            action(AuthorList)
            {
                ApplicationArea = All;
                Caption = 'To Author List';
                RunObject = page AuthorList;
                RunPageMode = View;
            }
        }
        area(Reporting)
        {
            action(CreateReport)
            {
                ApplicationArea = All;
                Caption = 'Create Report';
                RunObject = page AuthorList;
            }
        }
    }
}