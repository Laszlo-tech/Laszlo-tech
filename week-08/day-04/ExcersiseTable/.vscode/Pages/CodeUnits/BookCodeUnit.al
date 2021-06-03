codeunit 50101 BookCodeUnit
{
    Subtype = Install;
    trigger OnInstallAppPerCompany()
    var
        BookRecord: Record Book;
    begin
        if BookRecord.IsEmpty then begin
            InsertBook(1, 'Harry Potter', 1, 400, true);
        end;
    end;

    procedure InsertBook(BookId: integer; Title: Text[100]; AuthorId: Integer; PageCount: Integer; HardCover: boolean)
    var
        BookRecord: Record Book;
    begin
        BookRecord.Id := BookId;
        BookRecord.Title := Title;
        BookRecord.AuthorId := AuthorId;
        BookRecord.PageCount := PageCount;
        BookRecord.HardCover := HardCover;
        BookRecord.Insert();
    end;

}