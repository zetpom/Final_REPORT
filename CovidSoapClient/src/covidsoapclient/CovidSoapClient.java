/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import services.Covidtables;

/**
 *
 * @author ZETPOM
 */
public class CovidSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Covidtables cov = findCovidByID(1);
        System.out.println(cov.getNewDeath());
    }

    private static Covidtables findCovidByID(int id) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.findCovidByID(id);
    }
    
}
