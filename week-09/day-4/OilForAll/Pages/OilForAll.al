page 50106 OilForAll
{
    PageType = RoleCenter;

    layout
    {

    }

    actions
    {
        area(Sections)
        {
            group(Some)
            {
                Caption = 'Lists';
                action(OilFieldsList)
                {
                    ApplicationArea = All;
                    Caption = 'List of Oil Fields';
                    RunObject = page OilFieldsList;

                }
                action(PetrolStationList)
                {
                    ApplicationArea = All;
                    Caption = 'List of Petrol Stations';
                    RunObject = page PetrolStationList;

                }
                action(OilOrderList)
                {
                    ApplicationArea = All;
                    Caption = 'List of Orders';
                    RunObject = page OilOrderList;

                }
            }
        }
        area(Embedding)
        {

            action(Cards)
            {
                ApplicationArea = All;
                Caption = 'Add Oil Field';
                RunObject = page OilFieldsCard;
            }
            action(PetrolCard)
            {
                ApplicationArea = All;
                Caption = 'Add Petrol Station';
                RunObject = page PetrolStationCard;
            }
            action(OilOrder)
            {
                ApplicationArea = All;
                Caption = 'Add Oil Order';
                RunObject = page OilOrderCard;
            }
            action(OilOrderReport)
            {
                ApplicationArea = All;
                Caption = 'Order Report';
                RunObject = report MyReport;
            }

        }
    }


}
profile OilForAll
{
    Description = 'Oil For All profile';
    Caption = 'Oil For All';
    RoleCenter = OilForAll;
}