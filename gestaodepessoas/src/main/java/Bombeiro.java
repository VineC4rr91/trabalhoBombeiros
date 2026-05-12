package gestaopessoas;


import java.util.Date;

/*
    Feito por Vine e Txuli
 */
public class Bombeiro {
    private String nome;
    private String cpf;
    private String matricula;
    private Date dataNascimento;
    private Patente patente;
    private String especialidade;
    private String contato;
    private String status;
}
public void cadastrar(){
}
public void atualizar(){
}
public void consultar(){
}
public String getNome(String nome) {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCpf(String cpf) {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getMatricula(String matricula) {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public Date getDataNascimento(Date dataNascimento) {
    return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

public Patente getPatente(Patente patente) {
    return patente;
}

public void setPatente(Patente patente) {
    this.patente = patente;
}

public String getEspecialidade(String especialidade) {
    return especialidade;
}

public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}

public String getContato(String contato) {
    return contato;
}

public void setContato(String contato) {
    this.contato = contato;
}

public String getStatus(String status) {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}
