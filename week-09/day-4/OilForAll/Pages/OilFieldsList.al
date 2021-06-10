page 50100 OilFieldsList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilField;
    CardPageId = OilFieldsCard;


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
                field(MaxOilBarrel; Rec.MaxOilBarrel)
                {
                    ApplicationArea = All;

                }
                field(IncomeOil; Rec.IncomeOil)
                {
                    ApplicationArea = All;

                }
                field(Expenses; Rec.Expenses)
                {
                    ApplicationArea = All;

                }
                field(Location; Rec.Location)
                {
                    ApplicationArea = All;

                }
                field(Name; Rec.Name)
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