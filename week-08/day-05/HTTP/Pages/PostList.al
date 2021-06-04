page 50100 PostList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Post;



    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(id; Rec.Id)
                {
                    ApplicationArea = All;

                }
                field(UserId; Rec.UserId)
                {
                    ApplicationArea = All;

                }
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;

                }
                field(Body; Rec.Body)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(LoadPosts)
            {
                ApplicationArea = All;
                Caption = 'Load Posts';

                trigger OnAction()
                var
                    APIService: Codeunit APIService;
                begin
                    APIService.GetAllPosts();
                end;
            }
        }
    }

    var
        myInt: Integer;
}