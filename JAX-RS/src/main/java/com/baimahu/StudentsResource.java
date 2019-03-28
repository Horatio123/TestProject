package com.baimahu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("students")
public class StudentsResource {
    StudentsRepository repo = new StudentsRepository();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Student> getStudents(){
        System.out.println("get into getStudents class");

        return repo.getStudents();
    }
}
