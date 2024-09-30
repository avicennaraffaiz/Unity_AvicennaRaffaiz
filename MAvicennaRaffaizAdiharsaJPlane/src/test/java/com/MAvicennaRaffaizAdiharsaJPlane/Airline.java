package com.MAvicennaRaffaizAdiharsaJPlane;

import jakarta.persistence.*;

@Entity
@Table(name = "airlines")

public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private Account admin;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @ManyToOne
    @JoinColumn(name = "plane_id", nullable = true)
    private Plane plane;

    public Airline(Account admin, String companyName) {
        this.admin = null;
        this.companyName = "";
        this.plane = null;
    }

    @Override
    public String toString() {
        return "Airline{" + "id=" + id + ", admin=" + (admin != null) +
                ",name=" + companyName + ", plane=" + (plane != null ? plane.toString(): "null")
                + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAdmin() {
        return admin;
    }

    public void setAdmin(Account admin) {
        this.admin = admin;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
