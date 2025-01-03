package Pacote;

public class Consulta {

    private Medico medico;
    private String diagnostico;
    private String recomendacao;

    //Construtor
    public Consulta(Medico medico, String diagnostico) {
        setMedico(medico);
        setDiagnostico(diagnostico);
        this.recomendacao = "";
    }
    

    // Getters
    public Medico getMedico() {
        return medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getRecomendacao(){
        return recomendacao;
    }

    // Setters
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setRecomendacao(String recomendacao){
        this.recomendacao = recomendacao;
    }

    // Métodos

    public String verificarDiagnostico() {
        return recomendacao;
    }

    public void setRecomendacaoBaseadaNaGravidade(int gravidade) {
        switch (gravidade) {
            case 1:
                recomendacao = "Tratamento leve recomendado: descanso, hidratação, e medicamentos simples.";
                break;
            case 2:
                recomendacao = "Tratamento moderado recomendado: medicamentos específicos, repouso e acompanhamento médico.";
                break;
            case 3:
                recomendacao = "Tratamento intenso recomendado: hospitalização, tratamentos avançados, e acompanhamento contínuo.";
                break;
            default:
                recomendacao = "Gravidade desconhecida.";
                break;
        }
    }
    
}
