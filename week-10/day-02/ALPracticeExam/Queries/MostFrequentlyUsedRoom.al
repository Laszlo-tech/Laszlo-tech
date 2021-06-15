query 50101 MostFrequentlyUsedRoom
{
    QueryType = Normal;
    OrderBy = descending(SumOfDays);

    elements
    {
        dataitem(HotelRoom; HotelRoom)
        {
            column(Name; Name)
            {

            }
            dataitem(Booking; Booking)
            {
                DataItemLink = HotelRoomId = HotelRoom.Id;
                SqlJoinType = InnerJoin;

                column(SumOfDays; Days)
                {
                    Method = Sum;
                }
            }
        }
    }

    var
        myInt: Integer;

    trigger OnBeforeOpen()
    begin
        TopNumberOfRows(1);
    end;
}