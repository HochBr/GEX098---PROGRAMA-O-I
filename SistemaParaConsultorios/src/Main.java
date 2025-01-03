import Pacote.Doenca;
import Pacote.Paciente;
import Pacote.Medico;
import Pacote.Consulta;
import java.util.Scanner;
import Pacote.Utils;

public class Main {
    public static void main(String[] args) {
        Medico[] medicos = {
                new Medico("Clínica médica", 101, 35, "Dr. Hans Xucrute"),
                new Medico("Infectologia", 102, 40, "Dr. House"),
                new Medico("Otorrinolaringologia", 103, 45, "Dr. Derek Shepherd"),
                new Medico("Oftalmologia", 104, 38, "Dr. Shaun Murphy"),
                new Medico("Alergologia", 105, 42, "Dr. Леонардо"),
                new Medico("Pneumologia", 106, 39, "Dr. Gino Cológico"),
                new Medico("Gastroenterologia", 107, 47, "Dra. Carla"),
                new Medico("Urinária", 108, 41, "Dr. Rafael"),
                new Medico("Hepatologia", 109, 44, "Dra. Fernanda"),
                new Medico("Dermatologia", 110, 36, "Dr. Miguel"),
                new Medico("Proctologia", 111, 43, "Dra. Laura"),
                new Medico("Urologia", 314, 55, "Dr. Takaguia Nokara"),
                new Medico("Ortopedia", 112, 37, "Dr. Sedoe Eukuro"),
                new Medico("Reumatologia", 113, 46, "Dra. Isabela"),
                new Medico("Psicologia", 114, 34, "Dr. Daniel"),
                new Medico("Psiquiatria", 4937, 49, "Dra. Correia Nere"),
                new Medico("Hematologia", 116, 32, "Dr. Thiago"),
                new Medico("Endocrinologia", 117, 48, "Dra. Camila"),
                new Medico("Cardiologia", 118, 31, "Dr. Victor"),
                new Medico("Neurologia", 119, 50, "Dra. Patricia")
        };
        
        Utils.Armazenamento<Paciente> ListaEspera = new Utils.Armazenamento<Paciente>();

        Scanner scanner = new Scanner(System.in);
        Scanner inteiro = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        Scanner flotoante = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            Utils.printMenu();
            System.out.printf("\nDigite a opção desejada: ");
            int entrada = scanner.nextInt();
            scanner.nextLine();
            
            switch (entrada) {
 
                case 1:
                    System.out.println("\nCadastro de Paciente:");
                    
                    System.out.print("Nome: ");
                    String nome = string.nextLine();
                    
                    System.out.print("Idade: ");
                    int idade = inteiro.nextInt();
                    
                    System.out.print("Tipo Sanguíneo: ");
                    String tipoSanguineo = string.nextLine();
                    
                    System.out.print("Pressão: ");
                    float pressao = flotoante.nextFloat();
                    
                    System.out.print("Altura: ");
                    float altura = flotoante.nextFloat();
                    
                    System.out.print("Peso: ");
                    float peso = flotoante.nextFloat();
                    
                    System.out.print("Possui plano de saúde (S/N): ");
                    boolean planoSaude = string.nextLine().equalsIgnoreCase("S");
                    
                    Paciente paciente = new Paciente(tipoSanguineo, pressao, altura, planoSaude, peso, nome,idade);

                    System.out.print("\nDeseja colocar informaçoes adicionais? (S/N): ");
                    boolean opcaoSN = string.nextLine().equalsIgnoreCase("S");
                    
                    if(opcaoSN){
                        System.out.print("Telefone: ");
                        String telefone = string.nextLine();
                        
                        System.out.print("Endereço: ");
                        String endereco = string.nextLine();
                        
                        System.out.print("Sexo: ");
                        String sexo = string.nextLine();

                        System.out.print("\n");
                        
                        paciente.aviso();
                        
                        // Define as informações adicionais no objeto paciente
                        paciente.setTelefone(telefone);
                        paciente.setEndereco(endereco);
                        paciente.setSexo(sexo);
                    }
                    
                    System.out.print("\nPaciente cadastrado com sucesso!\n");
                    ListaEspera.append(paciente);
                    break;

                case 2:
                    System.out.println("\nPacientes na Lista de Espera\n");

                    if(ListaEspera.isEmpty()){
                        System.out.println("Não há nenhum paciente na lista de espera\n");
                    } else {

                        for(int i = 0; i < ListaEspera.size(); i++){
                            Paciente p = ListaEspera.get(i);
                            System.out.println(i + ": " + p.getNome());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nListar Medicos\n");
                    for(int i = 0; i < medicos.length; i++){
                        Medico m = medicos[i];
                        System.out.println(i + ": " + m.getNome() + " Especidalidade - " + m.getEspecialidade());
                    }
                    break;

                case 4:
                    System.out.println("\nDados do Paciente");

                    Paciente pacienteDados = selecionarPaciente(scanner, ListaEspera);
                    
                    if(pacienteDados == null){
                        System.out.println("Paciente não encontrado.\n");
                    } else{
                        System.out.println(pacienteDados);
                        pacienteDados.aviso();
                    }
                    break;

                case 5: 
                    System.out.println("\nTransferir Paciente para a Consulta");

                    if(ListaEspera.isEmpty()){
                        System.out.println("Não há nenhum paciente na lista de espera\n");
                        return;
                    }

                    Paciente pacienteParaConsulta = selecionarPaciente(scanner, ListaEspera);
                    if (pacienteParaConsulta == null){
                        System.out.println("Paciente não encontrado.\n");
                        break;
                    }
                    
                    realizarConsulta(scanner, medicos, pacienteParaConsulta);

                    // Remove o paciente da lista de espera após a consulta
                    ListaEspera.remove(pacienteParaConsulta);
                    System.out.println("\nPaciente " + pacienteParaConsulta.getNome() + " removido da lista de espera apos a consulta.");
                    
                    break;
                    
                case 0:
                    System.out.println("\nEncerrando o Programa\n");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Fecha os scanners
        scanner.close();
        inteiro.close();
        string.close();
        flotoante.close();

    }

    // Método para selecionar um paciente na lista de espera pelo nome
    public static Paciente selecionarPaciente(Scanner scanner, Utils.Armazenamento<Paciente> ListaEspera) {
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        for(int i = 0; i < ListaEspera.size(); i++){
            Paciente paciente = ListaEspera.get(i);
            if(paciente.getNome().equalsIgnoreCase(nomePaciente)){
                return paciente;
            }
        }
        return null;
    }

    // Método para selecionar um médico pela especialidade
    public static Medico selecionarMedicoEspecialidade(Medico[] medicos, String especialidade){
        for(Medico medico : medicos){
            if(medico.getEspecialidade().equalsIgnoreCase(especialidade)){
                return medico;
            }
        }
        return null;
    }
    
    // Método para realizar a consulta com um paciente
    public static void realizarConsulta(Scanner scanner, Medico[] medicos, Paciente paciente) {
        Doenca doenca = Doenca.randomDoenca();
        String especialidade = doenca.getEspecialidade();

        // Seleciona o médico baseado na especialidade da doença
        Medico medico = selecionarMedicoEspecialidade(medicos, especialidade);
        if(medico == null){
            System.out.println("Não há médicos disponíveis para a especialidade " + especialidade);
            return;
        }

        Consulta consulta = new Consulta(medico, "Tratamento inicial");
        
        System.out.println("\nDiagnóstico do Médico: ");
        System.out.println("Doença: " + doenca.getNome());
        System.out.println("Especialidade: " + doenca.getEspecialidade());
        System.out.println("Gravidade: " + doenca.getGravidade());

        consulta.setRecomendacaoBaseadaNaGravidade(doenca.getGravidade());
        System.out.println("\nMédico da especialidade " + especialidade + ": " + medico.getNome());
        
        System.out.println("\nConsulta realizada com sucesso!");
    }

}