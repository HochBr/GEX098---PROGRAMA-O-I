package Pacote;
import java.util.Vector;
import java.lang.Math;

public class Paciente extends Pessoa{   

    private String tipoSanguineo;
    private float pressao;
    private float altura;
    private boolean planoSaude;
    private float peso;
    private int risco;
    private Vector<Doenca> doencas; 

    public Paciente(String tipoSanguineo, float pressao, float altura, boolean planoSaude, float peso,String nome,int idade){
        super(nome, idade);
        setTipoSanguineo(tipoSanguineo);
        setPressao(pressao);
        setAltura(altura);
        setPlanoSaude(planoSaude);
        setPeso(peso);
    }

    //Getters
    public String getTipoSanguineo(){
        return tipoSanguineo;
    }
    public float getPressao(){
        return pressao;
    }
    public float getAltura(){
        return altura;
    }
    public boolean getPlanoSaude(){
        return planoSaude;
    }
    public float getPeso(){
        return peso;
    }
    public int getRisco(){
        return risco;
    }
    public Vector<Doenca> getDoencas(){
        return new Vector<Doenca>(doencas);
    }

    //Setters
    public void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }
    public void setPressao(float pressao){
        this.pressao = pressao;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setPlanoSaude(boolean planoSaude){
        this.planoSaude = planoSaude;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }  
    public void setDoenca(Vector<Doenca> doencas){
        this.doencas = doencas;
    }


    //Métodos

    @Override
    public String toString() {
        return "\nPaciente\n" + "Nome = " + getNome() + "\nIdade = " + getIdade() + "\nTipo Sanguineo = " + tipoSanguineo + "\nPressao = " + pressao + "\nAltura = " + altura + "\nPlano Saude = " + planoSaude + "\nPeso = " + peso + "\nTelefone = " + getTelefone() + "\nEndereco = " + getEndereco() + "\nSexo = " + getSexo() + "\n";
    }

    
    //Complemento na hora de imprimir ou criar o paciente
    public void aviso(){
        float IMC = getPeso() / (getAltura() * getAltura());
        
        if(IMC < 16.0){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está com Magreza Grau III\n", getNome(), IMC);
        }
        else if(IMC >= 16.0 && IMC < 16.9){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está com Magreza Grau II\n", getNome(), IMC);
        }
        else if(IMC >= 17.0 && IMC < 18.4){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está com Magreza Grau I\n", getNome(), IMC);
        }
        else if(IMC >= 18.5 && IMC < 24.9){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está Adequado\n", getNome(), IMC);
        }
        else if(IMC >= 25.0 && IMC < 29.9){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está Pré-Obeso\n", getNome(), IMC);
        }
        else if(IMC >= 30.0 && IMC < 34.9){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está com Obesidade Grau I\n", getNome(), IMC);
        }
        else if(IMC >= 35.0 && IMC < 39.9){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está com Obesidade Grau II\n", getNome(), IMC);
        }
        else if(IMC >= 40.0){
            System.out.printf("O paciente %s está com IMC de %.2f, portanto, está com Obesidade Grau III\n", getNome(), IMC);
        }
        
        float BSA = (float) (0.007184 * Math.pow(getAltura(), 0.725) * Math.pow(getPeso(), 0.425));
        System.out.printf("O paciente %s tem a Área de Superfície Corporal de %.2f\n", getNome(), BSA);
        
     
  }   
}
