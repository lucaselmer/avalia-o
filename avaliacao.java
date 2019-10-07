import java.util.Scanner;
import java.util.function.Function;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.awt.www.content.audio.x_aiff;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.insertionSort;

public class avaliacao {

    public static void main(String[] args) {     

        // Try catch para fazer a leitura do txt.
        try {
            BufferedReader leitura = new BufferedReader(new FileReader("teste2.txt")); // Leitor de arquivo nesse caso txt.
            String value = "";  
            int x=0;
            while (true) {        
                if (value != null)
                    System.out.println(value);
                }
                else{
                    x--;
                    break;
                }
                value = leitura.readLine();
                x++;
                
            }
            leitura.close();
            System.out.println("\nLinhas do txt : "+x);
        }catch(

    IOException exception)
    {
        System.out.println("Erro de exceção I/O: " + exception.getMessage()); // se ocorrer erro para ler o arquivo txt
    }

    // InsertionSort para fazer a ordenação
    public static void insertionSort(v) {
        int aux,i, j; // o aux é para ajudar na troca da posição dos valores | o i é a posição 0 e o j a posição 1.
        for(i =1;i < v.length;i++){    // O for é para fazer a validação da posição 1 com a posição seguinte.
            aux=v[i]; // o aux é para ajudar a reposicionar que vai iniciar na pocição i ( a segunda(1 pq começa em 0) posição do vetor )
            j=i - 1; // o j vai iniciar com i - 1
            while ((j>=0)&& v[j] > aux){   // estrutura de repetição para empurrar o maior numero para direita a posição j for maior vai ir para direita e o menor vai para frente.
                v[i+1]=v[j]; // empurrando para direita e o outro para esquerda.
                j=j-1; // j empurado.
            }
            v[j+1]=aux; // se o j não for maior ocorre isso para manter a posição do j e voltar para a repetição.
        }            
        }
        // Gerando uma Collections
        Object obj = new Object(); // criando a lista
        obj.add(Array); // adicionando valor a lista
        Collections.sort(array);    // para fazer ordenação da collections    
        // Gerando o texto da array depois de estar ordenado 
        try{
            BufferedWriter escrita = new BufferedWriter(new FileWriter("testenew2.txt"));  // vai gerar o arquivo de texto.          
            escrita.append("\n "+array); // Escrevendo a array no txt.
            escrita.append("\n "+obj);  // Escrevendo a collections no txt.
            
            escrita.close();
        } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage()); // caso ocorra erro ao gerar o texto.
        }


    }
}