page 50102 PetrolStationList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = PetrolStation;
    CardPageId = PetrolStationCard;

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
                field(Name; Rec.Name)
                {
                    ApplicationArea = All;

                }
                field(Budget; Rec.Budget)
                {
                    ApplicationArea = All;

                }
                field(StartOfCont; Rec.StartOfCont)
                {
                    ApplicationArea = All;

                }
                field(EndOfCont; Rec.EndOfCont)
                {
                    ApplicationArea = All;

                }
                field(OilFieldId; Rec.OilFieldId)
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