package ru.javarush.golf.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.Year;

import static java.util.Objects.isNull;

@Converter(autoApply = true)
public class YearAttributeConverter implements AttributeConverter<Year, Short> {
    @Override
    public Short convertToDatabaseColumn(Year attribute) {
        if (isNull(attribute)) {
            return null;
        } else {
            return (short) attribute.getValue();
        }
    }

    @Override
    public Year convertToEntityAttribute(Short dbData) {
        if (isNull(dbData)) {
            return null;
        } else {
            return Year.of(dbData);
        }
    }
}
