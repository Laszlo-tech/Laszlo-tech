page 50101 DirectorsCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Director;
    DelayedInsert = true;
    AutoSplitKey = true;
    Caption = 'Add Director';


    layout
    {
        area(Content)
        {
            group(Something)
            {

                field(Name; Rec.Name)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;
                    NotBlank = true;

                }
                field(Birth; Rec.Birth)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;


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