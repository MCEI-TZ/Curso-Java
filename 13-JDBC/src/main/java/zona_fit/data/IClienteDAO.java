package zona_fit.data;

import zona_fit.domain.Cliente;

import java.util.List;

public interface IClienteDAO {
    List<Cliente> listClients();
    boolean listById(Cliente cliente);
    boolean addCliente(Cliente cliente);
    boolean updateCliente(Cliente cliente);
    boolean deleteCliente(Cliente cliente);
}
