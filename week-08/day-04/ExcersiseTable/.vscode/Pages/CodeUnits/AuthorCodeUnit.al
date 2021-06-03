codeunit 50100 AuthorCodeUnit

{
    Subtype = Install;
    trigger OnInstallAppPerCompany()
    var
        AuthorRecord: Record Author;
    begin
        if AuthorRecord.IsEmpty then begin
            InsertAuthor(1, 'J.K.Rowling');
        end;
    end;

    procedure InsertAuthor(Id: integer; AuthorName: Text[40])
    var
        AuthorRecord: Record Author;

    begin
        AuthorRecord.Id := Id;
        AuthorRecord.Name := AuthorName;
        AuthorRecord.Insert();

    end;
}