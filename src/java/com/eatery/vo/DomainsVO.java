package com.eatery.vo;

import java.util.Date;

public class DomainsVO {

    private Integer Id;
    private Integer Code;
    private String Name;
    private Date creation_date;
    private Date created_by;
    private Integer value;
    private String domain_type;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Date created_by) {
        this.created_by = created_by;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDomain_type() {
        return domain_type;
    }

    public void setDomain_type(String domain_type) {
        this.domain_type = domain_type;
    }

}
