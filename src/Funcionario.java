public class Funcionario {
    private int matricula;
    private String nome;
    private int anoNascimento;
    private float salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + String.valueOf(matricula) +
                ", nome='" + nome + '\'' +
                ", anoNascimento=" + String.valueOf(anoNascimento) +
                ", salario=" + String.valueOf(salario) +
                '}';
    }
}
