package com.example.demo.Driver;

import javax.persistence.*;

/**
 * Created by Bauka on 01-Oct-19
 */
@Entity
@Table(name = "driver")
public class Driver {
    private Long id;
    private String address;
    private String info;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
