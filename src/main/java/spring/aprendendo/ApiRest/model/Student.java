package spring.aprendendo.ApiRest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String nome;
    private int idade;
    private String curso;
    private int id;
    public static List<Student> StudentList = new ArrayList<>();

    static {
        StudentList.add(new Student(1, "Robert", 26, "Engenharia de Software"));
        StudentList.add(new Student(2, "Lucas", 21, "Engenharia de Software"));
        StudentList.add(new Student(1, "Gustavo", 23,"Engenharia de Software"));
        StudentList.add(new Student(1, "Eider", 22, "Engenharia de Software"));

    }

    public Student(int id, String nome, int idade, String curso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

}
