package com.anywhere.fitness.repositories;

import com.anywhere.fitness.models.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long>
{
    List<Course> findByCoursenameContainingIgnoreCase(String name);

    List<Course> findCoursesByInstructor_Username(String username);

    List<Course> findByStarttime(int starttime);
}