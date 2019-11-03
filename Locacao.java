import java.util.ArrayList;

public class Locacao {

    int QuantidadeFilme;


    ArrayList<Cliente>clientes;

    public Locacao(){
        clientes = new ArrayList<Cliente>();
    }

    Locacao (int QuantidadeFilme ) {
        this.QuantidadeFilme=QuantidadeFilme;
    }

    void CalcularQuantidadeFilme(Cliente cliente){
        this.clientes.add(cliente);
        cliente.locacoes.add(this);

    }
    
}