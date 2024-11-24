package co.istad.api.model;

import java.util.List;

public record YoutubePlaylist(String id, String title, String description, List<YoutubeVideo> videos) {
}
