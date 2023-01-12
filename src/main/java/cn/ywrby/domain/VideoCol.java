package cn.ywrby.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VideoCol {
    private int id;
    private String vc_name;
    private String vc_path;
    private String vc_desc;
    private List<Video> video_list;
}