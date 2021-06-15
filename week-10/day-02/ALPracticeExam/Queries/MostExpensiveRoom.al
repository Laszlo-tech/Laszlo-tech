query 50100 MostExpensive
{
    QueryType = Normal;
    OrderBy = descending(PriceFornight);

    elements
    {
        dataitem(HotelRoom; HotelRoom)
        {
            column(Id; Id)
            {

            }
            column(PriceForNight; PriceForNight)
            {

            }

        }
    }


    trigger OnBeforeOpen()
    begin
        TopNumberOfRows(1);
    end;
}