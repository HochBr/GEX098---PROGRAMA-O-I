package Pacote;

import java.util.Vector;

public class Medico extends Pessoa {

  private Vector<Paciente> pacientes;
  private String especialidade;
  public int sala;

  //Construtor
  public Medico(String especialidade, int sala, int idade, String nome) {
    super(nome,idade);
    setEspecialidade(especialidade);
    setSala(sala);
    pacientes = new Vector<Paciente>();
  }

  // Getters
  public String getEspecialidade() {
    return especialidade;
  }
  public int getSala() {
    return sala;
  }
  public Vector<Paciente> getPacientes() {
    return new Vector<Paciente>(pacientes);
  }

  // Setters
  public void setEspecialidade(String especialidade) {
    //ele ve se a especialidade do medico existe
    this.especialidade = especialidade;
  }
  public void setSala(int sala) {
    this.sala = sala;
  }
  public void setPacientes(Vector<Paciente> pacientes) {
    this.pacientes = pacientes;
  }
  
}