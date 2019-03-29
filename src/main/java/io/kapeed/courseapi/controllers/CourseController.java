package io.kapeed.courseapi.controllers;


import io.kapeed.courseapi.domain.Course;
import io.kapeed.courseapi.domain.Topic;
import io.kapeed.courseapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics/{topicId}/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/")
    public List<Course> getAllCourses(@PathVariable String topicId){

        return courseService.getAllCourses(topicId);

    }

    @RequestMapping("/{id}")
    public Course getCourse(@PathVariable String topicId, @PathVariable String id ){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, " ", " "));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateCourse(@RequestBody Course course,  @PathVariable String topicId, @PathVariable String id){
        course.setTopic(new Topic(topicId, " ", " "));
        courseService.updateCourse(course);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }

}
