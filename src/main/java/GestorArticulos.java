
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joel
 */
@ApplicationScoped//Es singleton cuando alguien pide inyecion, esto se guarda en ambito aplicacion y compartida
//@SessionScoped// variable por sesión
public class GestorArticulos implements Serializable{
    
    @PersistenceUnit(unitName="ArticulosPU") private EntityManagerFactory emf;
    
}
