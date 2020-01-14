package com.cloud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: Cloud1908
 * @description:
 * @author: Feri
 * @create: 2019-12-24 09:58
 */
@Data
public class Quest {
    private Integer id;
    private String title;
    private String answer;
    //Spring给出的 用于将前台的请求转换为json格式 不加会报错
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") //请求
    //jackson 给出的 转换成String生效   返给前台string格式的
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") //响应
    private Date ctime;
    private String type;
}