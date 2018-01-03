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
import Modelo.Vuelo;
import java.util.List;
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

    public boolean insertVuelo(Vuelo v) {

        boolean retorno = false;

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return retorno;

    }

    public List<Avion> leerAvion() {
        List<Avion> retorno = null;
        EntityManager em = this.emf.createEntityManager();
        retorno = em.createQuery("SELECT a FROM Avion a ORDER BY a.id").getResultList();
        em.close();
        return retorno;
    }

    public List<Aeropuerto> leerAeropuerto() {
        List<Aeropuerto> retorno = null;
        EntityManager em = this.emf.createEntityManager();
        retorno = em.createQuery("SELECT a FROM Aeropuerto a ORDER BY a.id").getResultList();
        em.close();
        return retorno;
    }

    public List<Boleto> leerBoleto() {
        List<Boleto> retorno = null;
        EntityManager em = this.emf.createEntityManager();
        retorno = em.createQuery("SELECT a FROM Boleto a ORDER BY a.id").getResultList();
        em.close();
        return retorno;
    }

    public List<Pasajero> leerPasajero() {
        List<Pasajero> retorno = null;
        EntityManager em = this.emf.createEntityManager();
        retorno = em.createQuery("SELECT a FROM Pasajero a ORDER BY a.id").getResultList();
        em.close();
        return retorno;
    }

    public List<ProgramaVuelo> leerProgramaVuelo() {
        List<ProgramaVuelo> retorno = null;
        EntityManager em = this.emf.createEntityManager();
        retorno = em.createQuery("SELECT a FROM ProgramaVuelo a ORDER BY a.id").getResultList();
        em.close();
        return retorno;
    }

    public List<Vuelo> leerVuelo() {
        List<Vuelo> retorno = null;
        EntityManager em = this.emf.createEntityManager();
        retorno = em.createQuery("SELECT a FROM Vuelo a ORDER BY a.id").getResultList();
        em.close();
        return retorno;
    }

    public Vuelo buscarVuelo(int txt) {
        Vuelo retorno = null;
        int i = 0;
        for (Vuelo v : this.leerVuelo()) {
            if (v.getId()== txt) {
                i++;
                return v;
            }
        }
        return retorno;
    }

    public Aeropuerto buscarAeropuerto(int txt) {
        Aeropuerto retorno = null;
        int i = 0;
        for (Aeropuerto ae : this.leerAeropuerto()) {
            if (ae.getId() == txt) {
                i++;
                return ae;
            }
        }
        return retorno;
    }
    public Vuelo buscarVuelo2(int i) {
        Vuelo retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Vuelo.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public Aeropuerto buscarAeropuerto2(int i) {
        Aeropuerto retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Aeropuerto.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
    public Pasajero buscarPasajero2(int i) {
        Pasajero retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Pasajero.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
    public Avion buscarAvion2(int i) {
        Avion retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Avion.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
}
