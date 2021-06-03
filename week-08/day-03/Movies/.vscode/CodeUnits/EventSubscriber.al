codeunit 50101 EventSubscriber
{
    trigger OnRun()
    begin

    end;

    [EventSubscriber(ObjectType::Table, Database::Movie, 'OnAfterInsertEvent', '', true, true)]
    local procedure WelcomeMovie(var Rec: Record Movie)

    begin
        if Rec.DirectorId <> 0 then begin
            ShowMovieDirectorAndNumberOfMovies(Rec.DirectorId);
        end
        else begin
            ShowLongestMovieTitleAndLength();
        end;
    end;

    local procedure ShowMovieDirectorAndNumberOfMovies(DirectorId: Integer)
    var
        DirectorRecord: Record Director;
    begin
        DirectorRecord.Get(DirectorId);
        DirectorRecord.CalcFields(TotalMovies);
        Message('Name: %1, Number of directed movies: %2', DirectorRecord.Name, DirectorRecord.TotalMovies);
    end;

    local procedure ShowLongestMovieTitleAndLength()
    var
        MovieRecord: Record Movie;
        MaxLength: Integer;
        Title: Text;
    begin
        if MovieRecord.FindFirst() then begin
            MaxLength := MovieRecord.LengthInMinutes;
            Title := MovieRecord.Title;
            while MovieRecord.LengthInMinutes > MaxLength do begin
                MaxLength := MovieRecord.LengthInMinutes;
                Title := MovieRecord.Title;
            end
        end;
        Message('The title of the movie is: %1, and length is: %2', Title, MaxLength);
    end;
}