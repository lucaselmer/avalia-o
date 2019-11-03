import java.util.ArrayList;

/**
 * Cliente
 */
public class Cliente {

    int Id;
    String NomeCliente;
    String DataNascimento;
    String Cpf;
    int DiasDevolucao;

    ArrayList<Locacao>locacoes;

    public Cliente(){
        locacoes = new ArrayList<Locacao>(); // iniciando
    }

    Cliente(String NomeCliente){
        this.NomeCliente = NomeCliente;
        }

    void CalcularFilmesLocados(Locacao locacao){
        this.locacoes.add(locacao);
        locacao.clientes.add(this);

    }



    public int CalcularFilmesLocados(){
    return locacoes.size();
    }


}