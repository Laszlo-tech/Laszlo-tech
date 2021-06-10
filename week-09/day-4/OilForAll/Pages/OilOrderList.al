page 50104 OilOrderList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilOrder;
    CardPageId = OilOrderCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }
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