report 50100 MyReport
{
    UsageCategory = Administration;
    ApplicationArea = All;
    DefaultLayout = RDLC;
    RDLCLayout = 'OilOrderReport.rdl';
    UseRequestPage = true;


    dataset
    {
        dataitem(OilOrder; OilOrder)
        {
            RequestFilterFields = Indicator;
            column(Id; Id)
            {

            }
            column(PetrolStationId; PetrolStationId)
            {

            }
            column(AmountOfBarrel; AmountOfBarrel)
            {

            }
            column(PriceForABarrel; PriceForABarrel)
            {

            }
            column(Indicator; Indicator)
            {

            }
        }
    }

    /*requestpage
    {
        layout
        {
            area(Content)
            {
                group(GroupName)
                {
                    field(Id; OilOrder.Id)
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
        */
}