page 50102 MovieList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Movie;
    CardPageId = MovieCard;
    Editable = false;
    Caption = 'List of Movies';

    layout
    {
        area(Content)
        {
            repeater(GroupName)
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
                field(DirectorName; Rec.DirectorName)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    actions
    {
        area(Reporting)
        {
            action(GetReport)
            {
                ApplicationArea = All;
                Caption = 'All movies';

                trigger OnAction()
                begin
                    Report.Run(Report::MovieReport);
                end;
            }
        }
    }

    var
        myInt: Integer;
}