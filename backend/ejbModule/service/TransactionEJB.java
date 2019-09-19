package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.TransactionEntity;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {


	@PersistenceContext
	private EntityManager em;
	
    public TransactionEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(TransactionEntity transactionEntity)
    {
    	System.out.println("============================");
    	System.out.println(transactionEntity.getName());
    	//System.out.println(transactionEntity.getSourcePassport());
    	//System.out.println(transactionEntity.getDestinationPassport());
    	//System.out.println(transactionEntity.getDestinationBank());
    	//System.out.println(transactionEntity.getDestinationCountry());
    	//System.out.println(transactionEntity.getAccountNumber());
    		System.out.println(transactionEntity.getAmount());
    	em.persist(transactionEntity);
    	System.out.println("============================");
    }

}
