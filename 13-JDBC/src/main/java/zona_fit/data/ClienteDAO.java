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
                client.setName(rs.getString("Name"));
                client.setLasName(rs.getString("LastName"));
                client.setMembresy(rs.getInt("Membresy"));

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
                    cliente.setLasName(rs.getString("LastName"));
                    cliente.setMembresy(rs.getInt("Membresy"));
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
        return false;
    }

    @Override
    public boolean updateCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean deleteCliente(Cliente cliente) {
        return false;
    }

    public static void main(String[] args) {
        //* List CLients
        ClienteDAO clienteDAO = new ClienteDAO();
//        List<Cliente> clientes = clienteDAO.listClients();
//        clientes.forEach(System.out::println);

        //* List Client By Id
        var client = new Cliente(7);
        System.out.println("client before research = " + client);
        var find = clienteDAO.listById(client);
        if(find) System.out.println("found client" + client);
        else System.out.println("client not found " + client.getIdCliente());
    }
}
