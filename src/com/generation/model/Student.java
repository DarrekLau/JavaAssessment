package com.generation.model;

import com.sun.tools.javac.jvm.Code;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();
    //list all the course student want to register

    private final Map<String, Course> approvedCourses = new HashMap<>();
    // list of approved course

    public Student(String id, String name, String email, Date birthDate)
    {
        super( id, name, email, birthDate);
    }

    public void enrollToCourse( Course course )
    {

        //TODO implement this method
        if(isCourseApproved(course.getCode())) {
            courses.add(course);
        }
    }

    public void registerApprovedCourse( Course course )
    {

        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {

      if(courses == getApprovedCourses()){
              return true;
          }

        return false;

    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
        //TODO implement this method
        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {

        approvedCourses.forEach((k,v) -> {
            courses.add(Integer.parseInt(k), v);
        });

        return courses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
