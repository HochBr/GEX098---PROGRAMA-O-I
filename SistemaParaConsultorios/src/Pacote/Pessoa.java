package Pacote;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private String telefone;
    private String endereco;

    //Construtor Padrão
    public Pessoa(){}

    //Todos os pacientes tem que ter esse construtor obrigatoriamente
    public Pessoa(String nome,int idade){
        setNome(nome);
        setIdade(idade);
    }
    
    //Caso o usuario peca mais informaçao
    public Pessoa(String telefone, String endereco,String sexo){
        setTelefone(telefone);
        setEndereco(endereco);
        setSexo(sexo);
    }

    //Todos as informações completas
    public Pessoa(String nome, int idade, String sexo, String telefone, String endereco){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

}
