package co.istad.api.controller;

import co.istad.api.model.Video;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
//Base url
@RequestMapping("/videos")
public class VideoRestController {
    @GetMapping
    List<Video> findAllVideo()
    {
       return Arrays.asList(
               new Video(UUID.randomUUID().toString(),"Title 1","Description 1"),
               new Video(UUID.randomUUID().toString(),"Title 2","Description 2"),
               new Video(UUID.randomUUID().toString(),"Title 3","Description 3"),
               new Video(UUID.randomUUID().toString(),"Title 4","Description 4"),
               new Video(UUID.randomUUID().toString(),"Title 5","Description 5")
       );
    }
    //EndPoint :   find
     @GetMapping("/find")
     String findVideoByUuid(){

         return "Video found by UUID";
     }
}
