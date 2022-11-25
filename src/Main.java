import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("POO");
        curso1.setDescricao("JAVA ORIENTAÇÃO A OBJETOS");
        curso1.setCargaHoraria(24);
        System.out.println(curso1);

        System.out.println("-----------");

        Curso curso2 = new Curso();
        curso2.setTitulo("HTML");
        curso2.setDescricao("HTML SEMANTICO");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        System.out.println("---------------");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aprendendo POO com Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        System.out.println(" ----------------- ");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Beginners");
        bootcamp.setDescricao("Você aprenderá Java Básico");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev desenvolvedorJoao = new Dev();
        desenvolvedorJoao.setNome("João Victor");
        desenvolvedorJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao: " + desenvolvedorJoao.getConteudosInscritos());

        desenvolvedorJoao.progredir();

        System.out.println("Conteúdos inscritos Joao: " + desenvolvedorJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joao: " + desenvolvedorJoao.getConteudosConcluidos());
        System.out.println("xp: " + desenvolvedorJoao.calcularXp());


        System.out.println(" --------------------------------------------- ");

        Dev desenvolvedorCamila = new Dev();
        desenvolvedorCamila.setNome("Camila");
        desenvolvedorCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + desenvolvedorCamila.getConteudosInscritos());

        desenvolvedorCamila.progredir();
        desenvolvedorCamila.progredir();
        desenvolvedorCamila.progredir();

        System.out.println("Conteúdos inscritos Camila: " + desenvolvedorCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + desenvolvedorCamila.getConteudosConcluidos());





    }
}