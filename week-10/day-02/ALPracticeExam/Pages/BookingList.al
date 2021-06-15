page 50100 BookingList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Booking;
    CardPageId = BookingCard;
    Editable = false;

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
            action(GetMostExpensiveRoom)
            {
                ApplicationArea = All;

                trigger OnAction()
                var
                    MostExpensiveRoomQuery: Query MostExpensive;
                begin
                    if MostExpensiveRoomQuery.Open() then begin
                        if MostExpensiveRoomQuery.Read() then begin
                            Message('The most expensive room is %1 and the price is %2', MostExpensiveRoomQuery.Id, MostExpensiveRoomQuery.PriceForNight);
                        end;
                    end;
                end;
            }
            action(GetMostFrequentlyUsedRoom)
            {
                ApplicationArea = All;

                trigger OnAction()
                var
                    MostFrequentlyUsedQuery: Query MostFrequentlyUsedRoom;
                begin
                    if MostFrequentlyUsedQuery.Open() then begin
                        if MostFrequentlyUsedQuery.Read() then begin
                            Message('The most frequently booked room is %1', MostFrequentlyUsedQuery.Name);
                        end;
                    end;
                end;
            }
        }
    }

    var
        myInt: Integer;
}