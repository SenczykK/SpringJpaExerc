package com.example1.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ColorConverter implements AttributeConverter<Color, String> {

	@Override
	public String convertToDatabaseColumn(Color attribute) {
		if(attribute == Color.BLUE)
		return "b";
		else if(attribute == Color.GREEN)
			return "g";
		else
			return "r";
	}

	@Override
	public Color convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		return null;
	}

}
