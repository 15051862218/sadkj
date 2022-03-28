package com.syk.boot.entit;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

/**
 * @Author 沈永康
 * @Date 2022/3/28 15:53
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    private String id;
    private String category;
    private Integer userId;
    private  String title;
    private String cover;
    private String content;
    private String url;
    private String crateTime;
    private String totalWords;
    private Integer duration;
    private Integer pageView;
     private String summary;
     @Serial
    private static  final Long serialVersionUID =1L;

}
