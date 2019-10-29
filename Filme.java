/**
 * Filme
 */
public class Filme {

   String FilmeNome;
   int FilmeId;
   String DataLancamento;
   float ValorLocacao;
   String Sinopse;
   int Estoque;

}








/**
 * - Identificador Único (ID)
    - Nome
    - Data de Lançamento
    - Sinópse
    - Valor para Locação
    - Estoque
 * 
 * 
 *  Resumidamente, ele quer que você diga qual classe contém qual classe

Exemplo:

Você vai criar duas classes:
- Cliente
- Locacao

O relacionamento 1-N que te pediram seria traduzido na seguinte forma:
A sua classe Cliente vai ter uma lista de Locacao
Exemplo:

public class Cliente {
   private String Nome;
   private ArrayList<Locacao> Locacoes;
  /* Getters e setters */


/*public class Locacao {
   private String Nome;
   /* Getters e setters*/

