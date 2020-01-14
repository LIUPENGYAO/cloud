package com.cloud.consumer.controller;


import com.cloud.common.vo.R;
import com.cloud.consumer.service.QuestService;
import com.cloud.entity.Quest;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: Cloud1908
 * @description:
 * @author: Feri
 * @create: 2019-12-24 10:48
 */
@Api(value = "实现面试题的操作",tags = "实现面试题的操作")
@RestController
public class QuestController {
    @Autowired
    private QuestService questService;
    //新增
    @PostMapping("/api/quest/save.do")
    public R save(@RequestBody Quest quest){  //把这里的注解去掉后 也收到前台的参数 但传给提供者后就变Null
    //public R save(Quest quest){
        return questService.save(quest);
    }
    //删除
    @DeleteMapping("/api/quest/del.do")
    public R del(@RequestParam(value = "id") int id){
        return questService.del(id);
    }
    //查询
    @GetMapping("/api/quest/all.do")
    public R all(){
        return questService.all();
    }
}
