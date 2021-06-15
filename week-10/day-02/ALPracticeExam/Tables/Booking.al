table 50102 Booking
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Days; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            var
                myInt: Integer;
            begin
                if Rec.Days <= 0 then begin
                    FieldError(Days, 'Invalid input');
                end;
            end;
        }
        field(3; HotelRoomId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = HotelRoom;
            trigger OnValidate()
            var
                BookingRecord: Record Booking;
            begin
                If Rec.HotelRoomId <= 0 then begin
                    FieldError(HotelRoomId, 'Invalid input');
                end;
            end;
        }
        field(4; HotelName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(HotelRoom.HotelName where(Id = field(HotelRoomId)));
        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    begin
        Validate(Days);
        Validate(HotelRoomId);
    end;

    trigger OnModify()
    begin
        Validate(Days);
        Validate(HotelRoomId);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}