package com.mycompany.trackhabitsapp2.abstractions;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public abstract class AbstractEntyty {
    
    private String name = "";
    private String nameLabel = "";
    
    private String value = "";
    private String valueLabel = "";
    
    private String offer = "";
    
    private String specification = "";
    private String specificationLabel = "";
    
    private Date date = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(String nameLabel) {
        this.nameLabel = nameLabel;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueLabel() {
        return valueLabel;
    }

    public void setValueLabel(String valueLabel) {
        this.valueLabel = valueLabel;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getSpecificationLabel() {
        return specificationLabel;
    }

    public void setSpecificationLabel(String specificationLabel) {
        this.specificationLabel = specificationLabel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   
    public String toString() {
        String c = "";
        c += "\t| " + nameLabel + ": " + name;
        c += "\t| " + valueLabel + ": " + value;
        c += "\t| " + specificationLabel + ": " + specification;
        c += "\t| Дата: " + date;
        return c;
    }
    
    public boolean isTheNameEmpty() {
        return name.equals("");
    }
    
    public boolean isTheValueEmpty() {
        return value.equals("");
    }
}
