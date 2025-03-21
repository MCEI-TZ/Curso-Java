package zona_fit.data;

import zona_fit.conection.Conection;
import zona_fit.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listClients() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = Conection.getConection();
        var sql = "SELECT * FROM Cliente ORDER BY IdCliente";
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var client = new Cliente();
                client.setIdCliente(rs.getInt("IdCliente"));
                client.setName(rs.getString("name"));
                client.setLastName(rs.getString("lastName"));
                client.setMembresy(rs.getInt("membresy"));

                clientes.add(client);
            }
        }
        catch (Exception e){
            System.out.println(" Error to create the Client: "+ e.getMessage());
        }
        finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return clientes;
    }

    @Override
    public boolean listById(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = Conection.getConection();
        var sql = "SELECT * FROM Cliente WHERE IdCliente = ?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,cliente.getIdCliente());
            rs = ps.executeQuery();
            if(rs.next()){
                ps = conn.prepareStatement(sql);
                ps.setInt(1,cliente.getIdCliente());
                rs = ps.executeQuery();
                if(rs.next()){
                    cliente.setName(rs.getString("name"));
                    cliente.setLastName(rs.getString("lastName"));
                    cliente.setMembresy(rs.getInt("membresy"));
                    return true;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error to find the idClient");
            e.printStackTrace();
        }
        finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public boolean addCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection conn = Conection.getConection();
        var sql = "INSERT INTO Cliente(name, lastName, membresy) VALUES (?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,cliente.getName());
            ps.setString(2,cliente.getLastName());
            ps.setInt(3,cliente.getMembresy());

            int rowsUpdated = ps.executeUpdate();

            return rowsUpdated > 0;
        }
        catch (Exception e) {
            System.out.println("Error to add the Client: "+ e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (conn!= null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection conn = Conection.getConection();
        var sql = "UPDATE Cliente SET name=?, lastName=?, membresy=? WHERE IdCliente=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,cliente.getName());
            ps.setString(2,cliente.getLastName());
            ps.setInt(3,cliente.getMembresy());
            ps.setInt(4,cliente.getIdCliente());

            int rowsUpdated = ps.executeUpdate();

            return rowsUpdated > 0;
        }
        catch (Exception e){
            System.out.println("Error to update the Client: "+ e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (conn!= null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return  false;
    }

    @Override
    public boolean deleteCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection conn = Conection.getConection();
        var sql = "DELETE FROM Cliente WHERE IdCliente=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,cliente.getIdCliente());

            int rowsUpdated = ps.executeUpdate();

            return rowsUpdated > 0;
        }
        catch (Exception e){
            System.out.println("Error to delete the Client: "+ e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}
