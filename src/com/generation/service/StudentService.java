package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }



    public boolean isSubscribed( String studentId )
    {
       for(Map.Entry check: students.entrySet()){
            return true;
       }
        return false;
    }

    public void showSummary()
    {
        students.forEach((k,v) -> {
            System.out.println(v);
        });

    }

    public void enrollToCourse(String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
