page 50103 StudentCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Student;
    AutoSplitKey = true;
    DelayedInsert = true;
    Editable = false;
    Caption = 'Add Student';

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(StudentName; Rec.StudentName)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;

                }
                field(Email; Rec.Email)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;

                }
                field(Gender; Rec.Gender)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;

                }
                field(DateOfBirth; Rec.DateOfBirth)
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