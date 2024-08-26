package com.sky.pojo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 *  录入 短链接和 长链接 信息
 */
@Data
@Builder
public class ShotUri {
    private Long id;
    private String baseUrl; //  域名
    private String shotUrl; //  短链码
    private String fullUrl; //  完整链接
    private String fullUrlMd5; //  场链接md5加密值
    private String shotCode;
    private String remarks;
    private String isEffect;
    private String maker;
    private LocalDateTime expireTime;

}
