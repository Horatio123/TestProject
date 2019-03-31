package com.baimahu;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("students")
public class StudentsResource {
    // StudentsRepository repo = new StudentsRepository();
    StudentsRepositoryJDBC repo = new StudentsRepositoryJDBC();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Student> getStudents(){
        System.out.println("get into getStudents class");

        return repo.getStudents();
    }
    @POST
    @Path("student")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Student createStudent(Student student){
        System.out.println(student);
        repo.createStudent(student);
        return student;
    }
    @PUT
    @Path("student")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Student updateStudent(Student student){
        System.out.println(student);
        repo.updateStudent(student);
        return student;
    }
    @GET
    @Path("student/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student getStudent(@PathParam("id") int id){
        System.out.println("getStudent of identify id");
        return repo.getStudent(id);
    }
    @DELETE
    @Path("student/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void killStudent(@PathParam("id") int id){
        System.out.println("killStudent of identify id");
        repo.killStudent(id);
    }

}
