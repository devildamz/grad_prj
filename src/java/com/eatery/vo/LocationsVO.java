package com.eatery.vo;

public class LocationsVO {

    private Integer Id;
    private String Name;
    private Integer status;
    private String Phone;
    private String Website;
    private Boolean smokingArea;
    private Boolean Shisha;
    private Integer price_Range;
    private Double longitude;
    private Double latitude;
    private Boolean WIFI;

    public Boolean getWIFI() {
        return WIFI;
    }

    public void setWIFI(Boolean WIFI) {
        this.WIFI = WIFI;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public Boolean getSmokingArea() {
        return smokingArea;
    }

    public void setSmokingArea(Boolean smokingArea) {
        this.smokingArea = smokingArea;
    }

    public Boolean getShisha() {
        return Shisha;
    }

    public void setShisha(Boolean Shisha) {
        this.Shisha = Shisha;
    }

    public Integer getPrice_Range() {
        return price_Range;
    }

    public void setPrice_Range(Integer priceRange) {
        this.price_Range = priceRange;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

}
