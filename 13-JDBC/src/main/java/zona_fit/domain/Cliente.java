package zona_fit.domain;

import java.util.Objects;

public class Cliente {
    private  int IdCliente;
    private  String name;
    private  String lastName;
    private int membresy;

    public Cliente(){}

    public Cliente(int idCliente){
        this.IdCliente = idCliente;
    }

    public Cliente(String name, String lastName, int membresy){
        this.name = name;
        this.lastName = lastName;
        this.membresy = membresy;
    }

    public Cliente(int idCliente, String name, String lastName, int membresy){
        this(name, lastName, membresy);
        this.IdCliente = idCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        this.IdCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMembresy() {
        return membresy;
    }

    public void setMembresy(int membresy) {
        this.membresy = membresy;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "IdCliente=" + IdCliente +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", membresy=" + membresy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return IdCliente == cliente.IdCliente && membresy == cliente.membresy && Objects.equals(name, cliente.name) && Objects.equals(lastName, cliente.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdCliente, name, lastName, membresy);
    }
}
