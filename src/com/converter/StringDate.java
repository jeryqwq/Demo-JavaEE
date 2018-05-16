package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.format.Formatter;

public class StringDate implements  Formatter<Date>{

	  private SimpleDateFormat sdf;
	     String datePattern="yyyy-MM-dd HH:mm:ss";
	    
	    
	    @Override
	    public String print(Date object, Locale locale) {

	        return new SimpleDateFormat().format(object);
	    }
	    @Override
	    public Date parse(String text, Locale locale) throws ParseException {
	    	 sdf=new SimpleDateFormat(datePattern);
	        return sdf.parse(text);
	    }
	    

}