package com.cloud.provider.controller;


import com.cloud.common.vo.R;
import com.cloud.entity.Quest;
import com.cloud.provider.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: Cloud1908
 * @description:
 * @author: Feri
 * @create: 2019-12-24 10:22
 */
@RestController
public class QuestController {
    @Autowired
    private QuestService questService;

    //新增
    @PostMapping("/provider/quest/save.do")
    public R save(@RequestBody Quest quest){ //经打断点 把这里的requestbody去掉后 接收到的消费者传来的实体类参数都变成Null
        //public R save(Quest quest){
        return questService.save(quest);
    }
    //删除 @RequestParam(光标放这里点击ctrl+p可出现提示)
    @DeleteMapping("/provider/quest/del.do")
    public R del(@RequestParam(value = "id") int id){
        return questService.del(id);
    }
    //查询
    @GetMapping("/provider/quest/all.do")
    public R all(){
        return questService.queryAll();
    }
}
