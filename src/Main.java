import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n\n");

        Empresa empresa = new Empresa();
        empresa.setId(1);
        empresa.setNome("Empresa");

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setMatricula(1);
        funcionario1.setNome("Ricardo");
        funcionario1.setAnoNascimento(1974);
        funcionario1.setSalario(5000);
        funcionarios.add(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setMatricula(2);
        funcionario2.setNome("Luiza");
        funcionario2.setAnoNascimento(1975);
        funcionario2.setSalario(4009);
        funcionarios.add(funcionario2);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setMatricula(3);
        funcionario3.setNome("Walter");
        funcionario3.setAnoNascimento(1980);
        funcionario3.setSalario(3000);
        funcionarios.add(funcionario3);

        Funcionario funcionario4 = new Funcionario();
        funcionario4.setMatricula(4);
        funcionario4.setNome("Alexandre");
        funcionario4.setAnoNascimento(1985);
        funcionario4.setSalario(2009);
        funcionarios.add(funcionario4);

        Funcionario funcionario5 = new Funcionario();
        funcionario5.setMatricula(5);
        funcionario5.setNome("Thalita");
        funcionario5.setAnoNascimento(1990);
        funcionario5.setSalario(2000);
        funcionarios.add(funcionario5);

        Funcionario funcionario6 = new Funcionario();
        funcionario6.setMatricula(6);
        funcionario6.setNome("Roberto");
        funcionario6.setAnoNascimento(2003);
        funcionario6.setSalario(5000);
        funcionarios.add(funcionario6);

        Funcionario funcionario7 = new Funcionario();
        funcionario7.setMatricula(7);
        funcionario7.setNome("Rosângela");
        funcionario7.setAnoNascimento(2001);
        funcionario7.setSalario(4999);
        funcionarios.add(funcionario7);

        Funcionario funcionario8 = new Funcionario();
        funcionario8.setMatricula(8);
        funcionario8.setNome("Patrícia");
        funcionario8.setAnoNascimento(2002);
        funcionario8.setSalario(3000);
        funcionarios.add(funcionario8);

        Funcionario funcionario9 = new Funcionario();
        funcionario9.setMatricula(9);
        funcionario9.setNome("Ângela");
        funcionario9.setAnoNascimento(2003);
        funcionario9.setSalario(1000);
        funcionarios.add(funcionario9);

        empresa.setFuncionarios(funcionarios);

        funcionarios.forEach(f -> {
            System.out.println(f.toString());
        });

        System.out.println("\n");

        funcionarios.forEach(f -> {
            if (f.getSalario() <= 3000) {
                System.out.println(f.toString());
            }
        });

        List<Integer> listaInteiros = new ArrayList<Integer>();
        listaInteiros.add(1);
        listaInteiros.add(3);
        listaInteiros.add(4);
        listaInteiros.add(6);
        listaInteiros.add(5);
        listaInteiros.add(2);
        listaInteiros.add(8);

        System.out.println(listaInteiros + "\n");

        List<Integer> pares = listaInteiros.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        System.out.println(pares + "\n");

        int soma = 0;

        for (Integer inteiro : pares) {
            soma += inteiro;
        }

        System.out.println(soma + "\n");

        funcionarios.forEach(f -> {
            if ((Year.now().getValue() < (f.getAnoNascimento() + 25)) && (f.getSalario() >= 3000)) {
                System.out.println(f.toString());
            }
        });
    }
}