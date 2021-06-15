page 50101 BookingCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Booking;
    DelayedInsert = true;
    AutoSplitKey = true;


    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Days; Rec.Days)
                {
                    ApplicationArea = All;

                }
                field(HotelRoomId; Rec.HotelRoomId)
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