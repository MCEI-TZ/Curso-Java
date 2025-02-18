package zona_fit.data;

import zona_fit.domain.Cliente;

import java.util.List;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<String> listClients() {
        return List.of();
    }

    @Override
    public boolean listById(Cliente cliente) {
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
}
