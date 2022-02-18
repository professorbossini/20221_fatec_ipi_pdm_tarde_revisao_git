import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class TesteEmpregado {

    
   

    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();

        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);

        e1.setSalario(2000);
        e2.setSalario(1700);
        e2.setComissao(0.7);
        e3.setSalario(1500);
        e3.setBonus(350);

        List <Empregado> emps = Arrays.asList(e1, e2, e3);
        for (Empregado e: emps){
            System.out.println(e.calcularSalario());
        }
    }
}
