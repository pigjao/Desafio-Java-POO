import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("POO");
        curso1.setDescricao("JAVA ORIENTAÇÃO A OBJETOS");
        curso1.setCargaHoraria(24);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("HTML");
        curso2.setDescricao("HTML SEMANTICO");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aprendendo POO com Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);


    }
}