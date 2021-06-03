page 50102 StudentList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Student;
    CardPageId = StudentCard;
    Caption = 'List of students';



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
                field(StudentName; Rec.StudentName)
                {
                    ApplicationArea = All;

                }
                field(Email; Rec.Email)
                {
                    ApplicationArea = All;

                }
                field(Gender; Rec.Gender)
                {
                    ApplicationArea = All;

                }
                field(DateOfBirth; Rec.DateOfBirth)
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