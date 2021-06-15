codeunit 50101 EventSubscriber
{
    trigger OnRun()
    begin

    end;

    [EventSubscriber(ObjectType::Table, Database::Booking, 'OnAfterInsertEvent', '', true, true)]
    local procedure PricePopUp(var Rec: Record Booking)
    var
        HotelRoomRecord: Record HotelRoom;
        Result: Integer;
    begin
        if Rec.Days <> 0 then begin
            HotelRoomRecord.Get(Rec.HotelRoomId);
            Result := Rec.Days * HotelRoomRecord.PriceForNight;
            Message('The price of your booking is: %1 !', Result);
        end;

    end;

    var
        myInt: Integer;
}