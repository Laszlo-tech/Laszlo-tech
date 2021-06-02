page 50103 MovieCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Movie;
    DelayedInsert = true;
    AutoSplitKey = true;
    Caption = 'Add Movie';


    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;

                }
                field(Year; Rec.Year)
                {
                    ApplicationArea = All;

                }
                field(LengthInMinutes; Rec.LengthInMinutes)
                {
                    ApplicationArea = All;

                }
                field(DirectorId; Rec.DirectorId)
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