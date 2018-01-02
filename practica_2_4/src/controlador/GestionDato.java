/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Aeropuerto;
import Modelo.Avion;
import Modelo.Boleto;
import Modelo.Pasajero;
import Modelo.ProgramaVuelo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eduardo
 */
public class GestionDato {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("practica_2_4PU");

    public boolean insertAeropuerto(Aeropuerto a) {

        boolean retorno = false;

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return retorno;

    }

    public boolean insertAvion(Avion a) {

        boolean retorno = false;

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return retorno;

    }

    public boolean insertBoleto(Boleto b) {

        boolean retorno = false;

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(b);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return retorno;

    }

    public boolean insertPasajero(Pasajero p) {

        boolean retorno = false;

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return retorno;

    }

    public boolean insertProgramaVuelo(ProgramaVuelo pV) {

        boolean retorno = false;

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(pV);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return retorno;

    }

}
