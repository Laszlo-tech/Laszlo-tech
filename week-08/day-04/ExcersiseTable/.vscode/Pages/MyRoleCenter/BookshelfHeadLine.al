page 50105 BookshelfHeadLine
{
    PageType = HeadlinePart;



    layout
    {
        area(Content)
        {
            group(HeadLinePart)
            {
                field(FirstHeadLine; FirstHeadLine)
                {
                    ApplicationArea = All;

                }
                field(SecondHeadLine; SecondHeadLine)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    var
        FirstHeadLine: Label 'This is the first head line';
        SecondHeadLine: label 'Second head llllline';
}