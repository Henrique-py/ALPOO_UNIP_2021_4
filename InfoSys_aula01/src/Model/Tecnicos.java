package Model;

public class Tecnicos {
    private String nome = null;
    private String salario = null;
    private String valorH = null;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getValorH() {
        return valorH;
    }

    public void setValorH(String valorH) {
        this.valorH = valorH;
    }
    public Tecnicos(String nome,String salario,String valorH){
        setNome(nome);
        setSalario(salario);
        setValorH(valorH);
        }
    @Override
    public String toString() {
        String ret = null;
        ret = "Cliente.: [" + getNome() + "]\n" +
              "CPF.....: [" + getSalario()  + "]\n" +
              "Telefone: [" + getValorH()  + "]\n";
        return ret;
    }
}
