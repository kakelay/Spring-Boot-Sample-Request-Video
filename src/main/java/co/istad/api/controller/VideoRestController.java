package co.istad.api.controller;

import co.istad.api.model.Video;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller

// call as public for GetMapping without using @ResponseBody
//@GetMapping
@RequestMapping("api/videos")
public class VideoRestController {

    @GetMapping
    @ResponseBody
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
     @ResponseBody
     String findVideoByUuid(){
         return "Video found by UUID";
     }
}
