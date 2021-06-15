codeunit 50100 DataSeed
{
    Subtype = Install;
    trigger OnInstallAppPerCompany()
    var
        HotelRecord: Record Hotel;
        HotelRoomsRecord: Record HotelRoom;
    begin
        if HotelRecord.IsEmpty then begin
            InsertHotels(1, 'Seven Sisters Hotel');
            InsertHotels(2, 'Holborn Hotel');
            InsertHotels(3, 'Covent Garden Hotel');
        end;
        if HotelRoomsRecord.IsEmpty then begin
            InsertHotelRooms(1, 'Double', 3000, 1);
            InsertHotelRooms(2, 'Single', 2000, 1);
            InsertHotelRooms(3, 'King', 5000, 3);
        end;
    end;

    local procedure InsertHotels(Id: Integer; Name: Text[100])
    var
        HotelRecord: Record Hotel;
    begin
        HotelRecord.Id := Id;
        HotelRecord.Name := Name;
        HotelRecord.Insert();
    end;

    local procedure InsertHotelRooms(Id: Integer; Name: Text[100]; PriceForNight: Integer; HotelId: Integer)
    var
        HotelRoomRecord: Record HotelRoom;
    begin
        HotelRoomRecord.Id := Id;
        HotelRoomRecord.Name := Name;
        HotelRoomRecord.PriceForNight := PriceForNight;
        HotelRoomRecord.HotelId := HotelId;
        HotelRoomRecord.Insert();
    end;
}