package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.faces.bean.SessionScoped;


import model.Transaction;
import service.TransactionEJB;

@ManagedBean(name = "transactioncontroller")
@SessionScoped
public class TransactionController{
 
    @EJB
    private TransactionEJB transactionEJB;
    
  //from form
  	@ManagedProperty(value="#{transaction}")
    private Transaction transaction;
  	
    private List<Transaction> transactionList = new ArrayList<>();
 
   public List<Transaction> getTransactionList() {
      
        return transactionList;
    }
 
   public String viewTransaction(){
        return "transactionList.xhtml";
    }
   
    public String addNewTransaction() {
    	transactionEJB.addNew(transaction.getEntity());
 
        return "transactionList.xhtml";
    }

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
    
    
}