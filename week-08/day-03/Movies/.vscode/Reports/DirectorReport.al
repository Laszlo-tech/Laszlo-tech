report 50101 DirectorReport
{
    UsageCategory = Administration;
    ApplicationArea = All;
    UseRequestPage = true;
    DefaultLayout = RDLC;
    RDLCLayout = 'DirectorReport.rdl';


    dataset
    {
        dataitem(DirectorTable; Director)
        {
            column(Name; Name)
            {

            }
            column(Birth; Birth)
            {

            }

        }
    }

    requestpage
    {
        layout
        {
            area(Content)
            {
                group(GroupName)
                {
                    field(Name; DirectorTable.Name)
                    {
                        ApplicationArea = All;

                    }
                }
            }
        }

        actions
        {
            area(processing)
            {
                action(ActionName)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    var
        myInt: Integer;
}