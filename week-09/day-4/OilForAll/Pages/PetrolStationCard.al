page 50103 PetrolStationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = PetrolStation;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
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