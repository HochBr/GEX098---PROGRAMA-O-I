package Pacote;
import java.util.Vector;

public class Utils{

  //Classe interna para armazenar objetos genéricos.
  public static class Armazenamento<T> {
    
    private Vector<T> vetor;

    //Construtor padrão.
    public Armazenamento(){
      vetor = new Vector<T>();
    }
    
    //Adiciona um objeto ao vetor.
    public void append(T object){
      vetor.add(object);
    }

    //Remove um objeto do vetor.
    public void remove(T object){
      vetor.remove(object);
    }

    //Retorna o tamanho do vetor.
    public int size(){
      return vetor.size();
    }

    //Verifica se o vetor está vazio
    public boolean isEmpty(){
      return vetor.isEmpty();
    }

    //Retorna o objeto no índice especificado.
    public T get(int index){
      return vetor.get(index);
    }

  }

  //Menu
  public static void printMenu(){
    System.out.println("\nMenu:");
    System.out.println("1. Adicionar Paciente na lista de espera");
    System.out.println("2. Listar Pacientes");
    System.out.println("3. Listar Medicos");
    System.out.println("4. Dados do Paciente");
    System.out.println("5. Transferir Paciente para a Consulta");
    System.out.println("0. Sair\n");
  }
  
}

