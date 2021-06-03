report 50102 BoxOfficeReport
{
    UsageCategory = Administration;
    ApplicationArea = All;
    UseRequestPage = true;
    DefaultLayout = RDLC;
    RDLCLayout = 'FullReport.rdl';


    dataset
    {
        dataitem(BoxOfficeTable; BoxOffice)
        {
            column(Id; Id)
            {

            }
            column(Rating; Rating)
            {

            }
            column(DomesticSales; DomesticSales)
            {

            }
            column(InternationalSales; InternationalSales)
            {

            }
            dataitem(MovieTable; Movie)
            {
                DataItemLinkReference = BoxOfficeTable;
                DataItemLink = MovieId = field(MovieId);

                column(Title; Title)
                {

                }
                dataitem(DirectorTable; Director)
                {
                    DataItemLinkReference = MovieTable;
                    DataItemLink = Id = field(DirectorId);

                    column(Name; Name)
                    {

                    }
                }

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
                    field(Id; BoxOfficeTable.Id)
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