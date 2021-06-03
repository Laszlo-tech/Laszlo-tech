query 50100 MyQuery
{
    QueryType = Normal;

    elements
    {
        dataitem(AuthorTable; Author)
        {
            column(AuthorName; Name)
            {

            }
            dataitem(BookTable; Book)
            {
                DataItemLink = AuthorId = AuthorTable.Id;
                SqlJoinType = InnerJoin;
                column(SumBookPageCount; PageCount)
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

    end;
}