codeunit 50102 EventSubscirber
{
    //Every time a new book gets inserted to the database a message should popup with the Author's name and the sum of pages he wrote.

    //If the book doesn't have an Author then the message should show the title of the book with the highest page count and the page count itself.
    trigger OnRun()
    begin

    end;

    [EventSubscriber(ObjectType::Table, Database::Book, 'OnAfterInsertEvent', '', true, true)]
    local procedure MyProcedure(var Rec: Record Book)
    var
        myQuery: Query MyQuery;
        Name: Text[40];
        AuthorRecord: Record Author;
        TotalPagesWritenBy: Integer;
    begin
        AuthorRecord.Get(Rec.AuthorId);
        myQuery.SetFilter(AuthorName, '=%1', AuthorRecord.Name);
        Name := AuthorRecord.Name;
        Message('The name of the author is: 1%', Name);
    end;
}