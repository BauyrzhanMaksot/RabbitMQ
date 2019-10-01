package com.example.demo.Order;

import com.example.demo.Client.Client;
import com.example.demo.Driver.Driver;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

/**
 * Created by Bauka on 01-Oct-19
 */
@Entity
@Table(name = "booking")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Order.class)
public class Order {
    private Long id;
    private String pointA;
    private String pointB;
    private Driver driver;
    private Client client;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "point_a")
    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    @Column(name = "point_b")
    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    @OneToOne
    @JoinColumn(name = "driver_id")
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @OneToOne
    @JoinColumn(name = "client_id")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", pointA='" + pointA + '\'' +
                ", pointB='" + pointB + '\'' +
                ", driver=" + driver +
                ", client=" + client +
                '}';
    }
}
