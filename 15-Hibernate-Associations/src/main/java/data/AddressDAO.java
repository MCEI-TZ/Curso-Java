package data;

import domain.Address;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class AddressDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public AddressDAO() {
        emf = Persistence.createEntityManagerFactory("HibernateJPA-PU");
        em = emf.createEntityManager();
    }

    public void listAddress(){
        String hql = "SELECT p FROM Address p";
        Query query = em.createQuery(hql);
        List<Address> addresses = query.getResultList();
        for (Address address : addresses){
            System.out.println(address);
        }
    }

    public Address searchAddressById(Address ad){
        Address address = em.find(Address.class, ad.getIdAdress());
        System.out.println(address);
        return address;
    }

    public void addAddress(Address ad){
        em.getTransaction().begin();
        em.persist(ad);
        em.getTransaction().commit();
    }

    public void updateAddress(Address ad){
        try{
            em.getTransaction().begin();
            em.merge(ad);
            em.getTransaction().commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
    }

    public void deleteAddress(Address ad){
        try{
            em.getTransaction().begin();
            Address address = em.find(Address.class, ad.getIdAdress());
            em.remove(address);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
    }
}
