import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev dev = new Dev();


        System.out.print("Digite o nome do curso: ");
        String tituloCurso = sc.next();
        curso.setTitulo(tituloCurso);

        System.out.print("Digite a descrição: ");
        String descricaoCurso = sc.next();
        curso.setDescricao(descricaoCurso);

        System.out.print("Qual a carga horária: ");
        int cargaHorariaCurso = sc.nextInt();
        curso.setCargaHoraria(cargaHorariaCurso);

        System.out.print("A mentoria será de qual curso: ");
        String tituloMentoria = sc.next();
        mentoria.setTitulo(tituloMentoria);

        System.out.print("Digite a descrição da mentoria: ");
        String descricaoMentoria = sc.next();
        mentoria.setDescricao(descricaoMentoria);

        mentoria.setData(LocalDate.now());
        System.out.print("Data da mentoria: "+ mentoria.getData());
        System.out.println();

        System.out.print("Titulo do bootcamp: ");
        String tituloBootCamp = sc.next();
        bootcamp.setNome(tituloBootCamp);

        System.out.print("Descrição do bootcamp: ");
        String descricaoBootcamp = sc.next();
        bootcamp.setNome(descricaoBootcamp);

        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        System.out.print("Nome do Dev: ");
        String nomeDoDev = sc.next();
        bootcamp.setNome(nomeDoDev);

        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + nomeDoDev + ": " + dev.getConteudosInscritos());

        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + nomeDoDev + ": " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos " + nomeDoDev + ": " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println(curso);



        //System.out.println(curso1);
    }
}
