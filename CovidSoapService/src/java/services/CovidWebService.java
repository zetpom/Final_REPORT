/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Covidtables;

/**
 *
 * @author ZETPOM
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapServicePU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findCovidByID")
    public Covidtables findCovidByID(@WebParam(name = "id") int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapServicePU");
        EntityManager em = emf.createEntityManager();
        Covidtables cc = em.find(Covidtables.class,id);
        return cc;
    }

}
