import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Locale; 

public class Concecionaria {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeCarros;  

        System.out.println("Quantos carros deseja adicionar?");
        quantidadeCarros = sc.nextInt();
        List <Carro> listaCarros = new ArrayList<Carro>(quantidadeCarros); // Instanciando lista
        sc.nextLine();  

        for(int cont = 0; cont < quantidadeCarros; cont ++){
            int numSerie;
            Carro verificarNumSerie; 
            System.out.println("Carro #" + (cont + 1));            
            System.out.println("Digite o nome do Carro");                   
            String nome = sc.nextLine();               
            System.out.println("Digite a marca do Carro");
            String marca = sc.nextLine();
            System.out.println("Digite a cor do Carro");
            String cor = sc.nextLine();
            System.out.println("Digite o valor do Carro");
            double preco = sc.nextDouble();
            do{       
                System.out.println("Digite o numero de serie do " + nome);
                numSerie = sc.nextInt();    
                verificarNumSerie = verificadorNumSerie(listaCarros, numSerie);             
                if(verificarNumSerie != null){
                    System.out.println("Numero de Serie já existente, Digite outro Numero de Serie diferente de " + numSerie);
                    System.out.println("--------------------------------------------");
                }
            }while(verificarNumSerie != null);            
            System.out.println("--------------------------------");
            sc.nextLine();
            Carro carro = new Carro(nome, marca, cor, preco, numSerie);
            listaCarros.add(carro);
        }

        for(Carro x : listaCarros){
            System.out.println(x);
            System.out.println("---------------------------------");
        }

        sc.close();

    }

    public static Carro verificadorNumSerie(List<Carro> listaCarros,int numSerie){
        Carro listaCarro = listaCarros.stream().filter(x -> x.getNumSerie() == numSerie).findFirst().orElse(null);
        if(listaCarro != null){
            return listaCarro;
        }
        return null;
    }
}
