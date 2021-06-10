page 50105 OilOrderCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilOrder;
    AutoSplitKey = true;
    DelayedInsert = true;
    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(PetrolStationId; Rec.PetrolStationId)
                {
                    ApplicationArea = All;

                }
                field(AmountOfBarrel; Rec.AmountOfBarrel)
                {
                    ApplicationArea = All;

                }
                field(PriceForABarrel; Rec.PriceForABarrel)
                {
                    ApplicationArea = All;

                }
                field(Indicator; Rec.Indicator)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction()
                begin

                end;
            }
        }
    }

    var
        myInt: Integer;
}