package com.nullisg.contacts;

import java.util.ArrayList;

public class Contact implements IDisplayable{
	private String ident, type;
	private ArrayList<IDisplayable> properties;
	
	public Contact(String ident, String type){
		setIdent(ident);
		setType(type);
		properties = new ArrayList<IDisplayable>();
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getDisplayString() {
		StringBuilder str = new StringBuilder();
		
		str.append(getDisplayableType() + " - " + ident + String.format("%n", ""));
		str.append(String.format("%n", ""));
		
		for(IDisplayable property : properties){
			str.append(property.getDisplayString() + String.format("%n", ""));
			
		}
		return null;
	}

	@Override
	public ArrayList<IDisplayable> getDisplayableChildren() {
		return properties;
	}

	@Override
	public String getDisplayableType() {
		return type;
	}
	
	public void addProperty(IDisplayable property){
		properties.add(property);
	}
	
	public boolean mainExists(){
		for(IDisplayable property : properties){
			if
		}
	}
}
