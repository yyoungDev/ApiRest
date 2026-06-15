package spring.aprendendo.ApiRest.service;



import java.util.List;
import java.util.Arrays;

import spring.aprendendo.ApiRest.model.Student;

public class StudentService {


    public List<Student> CriarStudent(int id, String nome, int idade, String curso){

        Student criado = new Student(id, nome, idade, curso);
        return Arrays.asList(criado);
        }
}
