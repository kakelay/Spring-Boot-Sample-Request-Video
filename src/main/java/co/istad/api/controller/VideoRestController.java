package co.istad.api.controller;

import co.istad.api.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("api/videos")
public class VideoRestController {

    // Endpoint: /api/videos
    @GetMapping
    @ResponseBody
    public List<Video> findAllVideo() {
        return Arrays.asList(
                new Video(UUID.randomUUID().toString(), "Title 1", "Description 1"),
                new Video(UUID.randomUUID().toString(), "Title 2", "Description 2"),
                new Video(UUID.randomUUID().toString(), "Title 3", "Description 3"),
                new Video(UUID.randomUUID().toString(), "Title 4", "Description 4"),
                new Video(UUID.randomUUID().toString(), "Title 5", "Description 5")
        );
    }

    // Endpoint: /api/videos/playlists
    @GetMapping("/playlists")
    @ResponseBody
    public List<Playlist> findAllPlaylist() {
        return Arrays.asList(
                new Playlist("PL001", "Chill Vibes"),
                new Playlist("PL002", "Workout Hits"),
                new Playlist("PL003", "Top 40")
        );
    }

    // Endpoint: /api/videos/youtube-videos
    @GetMapping("/youtube-videos")
    @ResponseBody
    public List<YoutubeVideo> findAllYoutubeVideos() {
        return Arrays.asList(
                new YoutubeVideo("YV001", "Spring Boot Basics", "Learn Spring Boot from scratch", "https://youtube.com/video1"),
                new YoutubeVideo("YV002", "Java Streams", "Comprehensive guide to Java Streams", "https://youtube.com/video2"),
                new YoutubeVideo("YV003", "REST API Design", "Best practices for designing REST APIs", "https://youtube.com/video3")
        );
    }

    // Endpoint: /api/videos/youtube-channels
    @GetMapping("/youtube-channels")
    @ResponseBody
    public List<YoutubeChannel> findAllYoutubeChannels() {
        return Arrays.asList(
                new YoutubeChannel("YC001", "Code Academy", "Learn programming with fun", 120000),
                new YoutubeChannel("YC002", "Tech Tutorials", "Explore the latest tech tutorials", 85000),
                new YoutubeChannel("YC003", "Java Mastery", "Master Java programming", 45000)
        );
    }

    // Endpoint: /api/videos/youtube-playlists
    @GetMapping("/youtube-playlists")
    @ResponseBody
    public List<YoutubePlaylist> findAllYoutubePlaylists() {
        return Arrays.asList(
                new YoutubePlaylist(
                        "YP001",
                        "Java Basics",
                        "A playlist for Java beginners",
                        Arrays.asList(
                                new YoutubeVideo("YV001", "Spring Boot Basics", "Learn Spring Boot from scratch", "https://youtube.com/video1"),
                                new YoutubeVideo("YV002", "Java Streams", "Comprehensive guide to Java Streams", "https://youtube.com/video2")
                        )
                ),
                new YoutubePlaylist(
                        "YP002",
                        "REST API Mastery",
                        "A playlist to master REST APIs",
                        Arrays.asList(
                                new YoutubeVideo("YV003", "REST API Design", "Best practices for designing REST APIs", "https://youtube.com/video3")
                        )
                )
        );
    }
}
