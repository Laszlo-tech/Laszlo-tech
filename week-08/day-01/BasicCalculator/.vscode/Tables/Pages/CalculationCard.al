page 50101 CalculationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Calculation;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(FirstNumber; rec.FirstNumber)
                {
                    ApplicationArea = All;

                }
                field(SecondNumber; rec.SecondNumber)
                {
                    ApplicationArea = All;

                }
                field(Operator; rec.Operator)
                {
                    ApplicationArea = All;

                }
            }
        }
    }
}