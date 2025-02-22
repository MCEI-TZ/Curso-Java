package domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "id_Address")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdress;

    @Column(name = "street")
    private String street;

    @Column(name = "n_Street")
    private String nAddress;

    private String country;

    public Address() {}

    public Address(Integer idAdress){
        this.idAdress = idAdress;
    }

    public Integer getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(Integer idAdress) {
        this.idAdress = idAdress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getnAddress() {
        return nAddress;
    }

    public void setnAddress(String nAddress) {
        this.nAddress = nAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "idAdress=" + idAdress +
                ", street='" + street + '\'' +
                ", nAddress='" + nAddress + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(idAdress, address.idAdress) && Objects.equals(street, address.street) && Objects.equals(nAddress, address.nAddress) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdress, street, nAddress, country);
    }
}
