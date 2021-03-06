package Model;

import javax.swing.JFrame;


public class Cliente extends JFrame {
    private String nome = null;
    private String cpf = null;
    private String fone = null;
    private String celular = null;
    private String email = null;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nome,String cpf,String fone,String celular,String email){
        setNome(nome);
        setCpf(cpf);
        setFone(fone);
        setCelular(celular);
        setEmail(email);
        }

    @Override
    public String toString() {
        String ret = null;
        ret = "Cliente.: [" + getNome() + "]\n" +
              "CPF.....: [" + getCpf()  + "]\n" +
              "Telefone: [" + getFone()  + "]\n" +
              "Celular.: [" + getCelular()  + "]\n" +
              "Email...: [" + getEmail()  + "]\n";
        return ret;
    }
    
}
