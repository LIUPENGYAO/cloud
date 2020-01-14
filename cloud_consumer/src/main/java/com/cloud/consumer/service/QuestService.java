package com.cloud.consumer.service;


import com.cloud.common.vo.R;
import com.cloud.entity.Quest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@FeignClient("xph-provider")  //  需要在yml中加入 main: allow-bean-definition-overriding: true 不然这个@FeignClient("xph-provider")只能用一次
@Service
public interface QuestService {
    //新增
    @PostMapping("/provider/quest/save.do")
    R save(@RequestBody Quest quest);
    //R save(Quest quest);
    //删除  @RequestParam(value = "id") 不加后边的value=..启动会报错 表示将前台传入的名字为id的参数的值 赋给这里定义的形参 名字可以不同
    @DeleteMapping("/provider/quest/del.do")
    R del(@RequestParam(value = "id") int id);
    //查询
    @GetMapping("/provider/quest/all.do")
    R all();
}
