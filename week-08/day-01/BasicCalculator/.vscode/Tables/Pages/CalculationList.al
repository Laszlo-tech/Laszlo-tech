page 50100 CalculationList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Calculation;
    CardPageId = CalculationCard;

    layout
    {
        area(Content)
        {
            repeater(General)
            {
                field(Id; rec.Id)
                {
                    ApplicationArea = All;

                }
                field(FirstNumber; rec.FirstNumber)
                {
                    ApplicationArea = All;

                }
                field(SecondNumber; rec.SecondNumber)
                {
                    ApplicationArea = All;

                }
                field(Result; Rec.Result)
                {
                    ApplicationArea = All;

                }

            }
        }
    }

}