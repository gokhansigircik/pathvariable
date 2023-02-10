package com.gokhan.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
  @RequestMapping("/")
  public String index(@RequestParam(value = "q") String searchQuery) {
    if (searchQuery == null) {
      return "You searched for: nothing";
    } else {
      return "You searched for: " + searchQuery;

    }
  }

  @RequestMapping("/m/{track}/{module}/{lesson}")
  public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module,
      @PathVariable("lesson") String lesson) {
    return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
  }
}
