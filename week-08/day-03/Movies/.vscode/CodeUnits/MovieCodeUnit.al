codeunit 50100 MovieCodeUnit
{
    Subtype = Install;
    trigger OnInstallAppPerCompany()
    var
        DirectorRecord: Record Director;
        MovieRecord: Record Movie;


    begin
        if DirectorRecord.IsEmpty then begin
            InsertDirector(1, 'Jordan Peterson');
            InsertDirector(2, 'Kolompar Jeno');
            InsertDirector(3, 'Mekk Elek');
        end;
        if MovieRecord.IsEmpty then begin
            InsertMovie(1, 'The return of Donkey', 3, 1999);
            InsertMovie(2, 'The blind man blink!', 2, 2002);

        end;

    end;


    procedure InsertDirector(Id: integer; Name: Text[40])
    var
        DirectorRecord: Record Director;

    begin

        DirectorRecord.Id := Id;
        DirectorRecord.Name := Name;
        DirectorRecord.Insert();
    end;

    local procedure InsertMovie(Id: Integer; Title: Text[100]; DirectorId: Integer; Year: Integer)
    var
        MovieRecord: Record Movie;
    begin
        MovieRecord.MovieId := Id;
        MovieRecord.Title := Title;
        MovieRecord.DirectorId := DirectorId;
        MovieRecord.Year := Year;
        MovieRecord.Insert();
    end;

}