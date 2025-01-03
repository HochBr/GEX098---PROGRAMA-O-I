package Pacote;
import java.util.Random;

public class Doenca {
    private String nome;
    private String especialidade;
    private int gravidade;


    public Doenca(String nome, String especialidade, int gravidade){
        setNome(nome);
        setEspecialidade(especialidade);
        setGravidade(gravidade);
    }
    
    //Getters
    public String getEspecialidade() {
        return especialidade;
    }
    public int getGravidade() {
        return gravidade;
    }
    public String getNome() {
        return nome;
    }
    
    
    //Setters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    //Métodos

    public static Doenca randomDoenca(){
        Random random = new Random();
        int qtd = random.nextInt(50);
        
        Doenca[] doencas = {
            new Doenca("Resfriado Comum", "Clínica Médica", 1),
            new Doenca("Gripe", "Clínica Médica", 1),
            new Doenca("Dengue", "Infectologia", 1),
            new Doenca("Infecção de Ouvido", "Otorrinolaringologia", 2),
            new Doenca("Conjuntivite", "Oftalmologia", 1),
            new Doenca("Amigdalite", "Otorrinolaringologia", 2),
            new Doenca("Rinite Alérgica", "Alergologia", 1),
            new Doenca("Bronquite", "Pneumologia", 2),
            new Doenca("Sinusite", "Otorrinolaringologia", 2),
            new Doenca("Gastrite", "Gastroenterologia", 1),
            new Doenca("Pneumonia", "Pneumologia", 3),
            new Doenca("Infecção Urinária", "Urologia", 2),
            new Doenca("Hepatite", "Hepatologia", 3),
            new Doenca("Otite", "Otorrinolaringologia", 2),
            new Doenca("Caxumba", "Clínica Médica", 2),
            new Doenca("Catapora", "Infectologia", 2),
            new Doenca("Herpes Labial", "Dermatologia", 1),
            new Doenca("Herpes Zóster", "Dermatologia", 2),
            new Doenca("Mononucleose", "Clínica Médica", 3),
            new Doenca("Hemorroidas", "Proctologia", 1),
            new Doenca("Tendinite", "Ortopedia", 2),
            new Doenca("Fibromialgia", "Reumatologia", 2),
            new Doenca("Lúpus", "Reumatologia", 3),
            new Doenca("Faringite", "Otorrinolaringologia", 1),
            new Doenca("Estresse", "Psicologia", 1),
            new Doenca("Depressão", "Psiquiatria", 3),
            new Doenca("Anemia", "Hematologia", 1),
            new Doenca("Diabetes Tipo 2", "Endocrinologia", 2),
            new Doenca("Hipertensão", "Cardiologia", 2),
            new Doenca("Enxaqueca", "Neurologia", 2),
            new Doenca("Eczema", "Dermatologia", 1),
            new Doenca("Artrite Reumatoide", "Reumatologia", 3),
            new Doenca("Asma", "Pneumologia", 2),
            new Doenca("Cálculo Renal", "Urologia", 3),
            new Doenca("Cistite", "Urologia", 2),
            new Doenca("Pólipo Nasal", "Otorrinolaringologia", 1),
            new Doenca("Gastrite Nervosa", "Gastroenterologia", 2),
            new Doenca("Síndrome do Intestino Irritável", "Gastroenterologia", 2),
            new Doenca("Hipercolesterolemia", "Cardiologia", 1),
            new Doenca("Ressaca", "Clínica Médica", 1),
            new Doenca("Insônia", "Psicologia", 2),
            new Doenca("Ansiedade", "Psicologia", 2),
            new Doenca("Infecção por Salmonella", "Infectologia", 2),
            new Doenca("Infecção por E. coli", "Infectologia", 2),
            new Doenca("Infecção por Staphylococcus", "Infectologia", 2),
            new Doenca("Infecção por Streptococcus", "Infectologia", 2),
            new Doenca("Colesterol Alto", "Cardiologia", 1),
            new Doenca("Obesidade", "Endocrinologia", 3),
            new Doenca("Apneia do Sono", "Pneumologia", 3),
            new Doenca("Bruxismo", "Odontologia", 1),
            new Doenca("Doença de Alzheimer", "Neurologia", 3),
            new Doenca("Doença de Parkinson", "Neurologia", 3)
        };
        
        return doencas[qtd];

    }
}
    
