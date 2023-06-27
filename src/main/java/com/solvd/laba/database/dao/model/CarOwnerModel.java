package com.solvd.laba.database.dao.model;

public class CarOwnerModel {
    int car_id;
    String owner_name;
    int owner_contact_number;
    String owner_email;

    public CarOwnerModel(int car_id, String owner_name, int owner_contact_number, String owner_email) {
        this.car_id = car_id;
        this.owner_name = owner_name;
        this.owner_contact_number = owner_contact_number;
        this.owner_email = owner_email;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public int getOwner_contact_number() {
        return owner_contact_number;
    }

    public void setOwner_contact_number(int owner_contact_number) {
        this.owner_contact_number = owner_contact_number;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    @Override
    public String toString() {
        return "CarOwnerModel{" +
                "car_id=" + car_id +
                ", owner_name='" + owner_name + '\'' +
                ", owner_contact_number=" + owner_contact_number +
                ", owner_email='" + owner_email + '\'' +
                '}';
    }

    public void add(CarOwnerModel carOwner) {
    }
}
