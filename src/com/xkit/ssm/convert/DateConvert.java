package com.xkit.ssm.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {

	public Date convert(String arg0) {
		SimpleDateFormat df = new SimpleDateFormat();
		try {
			Date d = df.parse(arg0);
			return d;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
