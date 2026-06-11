package spring.aprendendo.ApiRest.endpoint;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import spring.aprendendo.ApiRest.model.Student;

@RestController
@RequestMapping("Student")
public class StudentEndPoint {

    @RequestMapping(method = RequestMethod.GET, path = "/ListAllStudents")
    public List<Student> ListAllStudents(){
        return Arrays.asList(new Student("João", 19, "ADS"), new Student("robert", 26, "Engenharia de Software"), new Student("Eider", 21, "ENG Sft"));
    }

}
