package com.nullisg.contacts;

import java.util.ArrayList;

public interface IDisplayable {
	public String getDisplayString();
	
	public ArrayList<IDisplayable> getDisplayableChildren();
	
	public String getDisplayableType();
}
