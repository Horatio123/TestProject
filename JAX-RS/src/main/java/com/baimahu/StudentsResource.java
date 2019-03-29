package com.baimahu;

import javax.ws.rs.*;
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
    @POST
    @Path("student")
    public Student createStudent(Student student){
        System.out.println(student);
        repo.createStudent(student);
        return student;
    }
    @GET
    @Path("student/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student getStudent(@PathParam("id") int id){
        System.out.println("getStudent of identify id");
        return repo.getStudent(id);
    }
}
