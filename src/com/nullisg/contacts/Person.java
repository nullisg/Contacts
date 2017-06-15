package com.nullisg.contacts;

import java.util.ArrayList;
import java.util.Date;

public class Person implements IDisplayable{
	private String title, forename, surname, type;
	private Date dateOfBirth;
	private boolean deceased, vatRegistered, main;
	
	public Person(Contact contact, String type, String title, String forename, String surname, 
	Date dateOfBirth, boolean deceased, boolean vatRegistered, boolean main){
		contact.addProperty(this);
		setType(type);
		setTitle(title);
		setForename(forename);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		setDeceased(deceased);
		setVatRegistered(vatRegistered);
		setMain(main);
		
		if(main){
			if(!contact.mainExists()){
				contact.setIdent(getName());
			}
		}
	}
	
	public boolean isMain() {
		return main;
	}

	public void setMain(boolean main) {
		this.main = main;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isDeceased() {
		return deceased;
	}

	public void setDeceased(boolean deceased) {
		this.deceased = deceased;
	}

	public boolean isVatRegistered() {
		return vatRegistered;
	}

	public void setVatRegistered(boolean vatRegistered) {
		this.vatRegistered = vatRegistered;
	}
	
	public String getName(){
		
		StringBuilder str = new StringBuilder();
		
		str.append(getTitle().equals("") ? "" : getTitle() + " ");
		str.append(getForename().equals("") ? "" : getForename() + " ");
		str.append(getSurname());
		
		return getTitle() + " " + getForename() + " " + getSurname();
	}

	@Override
	public String getDisplayString() {

		StringBuilder str = new StringBuilder();
		
		str.append("Title: " + getTitle() + String.format("%n", ""));
		str.append("Forename: " + getForename() + String.format("%n", ""));
		str.append("Surname: " + getSurname() + String.format("%n", ""));
		str.append("Date of Birth: " + getDateOfBirth() + String.format("%n", ""));
		str.append("VAT Registered: " + isVatRegistered() ? "Yes" : "No");
		str.append(String.format("%n", ""));
		str.append("Deceased: " + isDeceased() ? "Yes" : "No");
		
		
		return null;
	}

	@Override
	public ArrayList<IDisplayable> getDisplayableChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayableType() {
		return type;
	}
}
