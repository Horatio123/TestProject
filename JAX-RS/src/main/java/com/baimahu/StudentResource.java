package com.baimahu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("student")
public class StudentResource {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Student getStudent(){
        System.out.println("get into getStudent class");
        Student stu = new Student();
        stu.setId(1);
        stu.setName("Horatio");
        return stu;
    }
}
