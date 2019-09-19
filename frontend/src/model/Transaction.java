package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.TransactionEntity;

@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String Name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestationCountry;
	private String AccountNumber;
	private String Amount;
	
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String SourcePassport) {
		this.SourcePassport = SourcePassport;
	}
	
	
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String DestinationPassport) {
		this.DestinationPassport = DestinationPassport;
	}
	
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String DestinationBank) {
		this.DestinationBank = DestinationBank;
	}
	
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String DestationCountry) {
		this.DestationCountry = DestationCountry;
	}
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String Amount) {
		this.Amount = Amount;
	}
	
	
	
	
	public TransactionEntity getEntity()
	{
		TransactionEntity TransactionEntity = new TransactionEntity();
	
		TransactionEntity.setName(Name);
		TransactionEntity.setSourcePassport(SourcePassport);
		TransactionEntity.setDestinationPassport(DestinationPassport);
		TransactionEntity.setDestinationBank(DestinationBank);
		TransactionEntity.setDestinationCountry(DestationCountry);
		TransactionEntity.setAccountNumber(AccountNumber);
		TransactionEntity.setAmount(Amount);
		return TransactionEntity;
	}
	
	
	

}
