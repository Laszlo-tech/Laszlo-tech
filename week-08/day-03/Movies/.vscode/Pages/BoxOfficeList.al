page 50105 BoxOfficeList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = BoxOffice;
    CardPageId = BoxOfficeCard;


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
                field(Rating; Rec.Rating)
                {
                    ApplicationArea = All;

                }
                field(DomesticSales; Rec.DomesticSales)
                {
                    ApplicationArea = All;

                }
                field(InternationalSales; Rec.InternationalSales)
                {
                    ApplicationArea = All;

                }
                field(MovieId; Rec.MovieId)
                {
                    ApplicationArea = All;

                }
                field(MovieTitle; Rec.MovieTitle)
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
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction()
                begin

                end;
            }
        }
    }

    var
        myInt: Integer;
}