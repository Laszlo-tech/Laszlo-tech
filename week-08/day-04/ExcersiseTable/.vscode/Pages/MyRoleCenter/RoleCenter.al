page 50104 RoleCenter
{
    PageType = RoleCenter;


    layout
    {
        area(RoleCenter)
        {
            part(HeadLinePart; BookshelfHeadLine)
            {
                ApplicationArea = All;
            }
            part(BookStatsPart; RoleCenterBookCardPart)
            {
                ApplicationArea = All;
            }
        }
    }

    actions
    {
        area(Sections)
        {
            group(BookShelf)
            {
                Caption = 'My Bookshelf!';
                action(BookList)
                {
                    ApplicationArea = All;
                    Caption = ' Book List';
                    RunObject = page BookList;
                }
                action(AuthorList)
                {
                    ApplicationArea = All;
                    Caption = 'Author List';
                    RunObject = page AuthorList;
                }
            }
        }
        area(Embedding)
        {
            action(Authors)
            {
                ApplicationArea = All;
                Caption = 'The List of Authors';
                RunObject = page AuthorList;
            }
        }
        area(Creation)
        {
            action(Books)
            {
                ApplicationArea = All;
                Caption = 'Create a new book';
                RunObject = page BookCard;
            }
        }
    }
}
profile BookshelfProfile
{
    Description = 'This is my first profile';
    Caption = 'Bookshelf profile';
    RoleCenter = RoleCenter;
}