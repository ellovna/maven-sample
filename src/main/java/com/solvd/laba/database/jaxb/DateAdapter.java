package com.solvd.laba.database.jaxb;

import org.apache.commons.lang3.time.DateParser;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateAdapter extends XmlAdapter<String, Date> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date unmarshal(String dateStr) throws ParseException {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.parse(dateStr);
    }

    @Override
    public String marshal(Date date){
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}

