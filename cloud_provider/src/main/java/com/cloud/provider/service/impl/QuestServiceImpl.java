package com.cloud.provider.service.impl;


import com.cloud.common.vo.R;
import com.cloud.entity.Quest;
import com.cloud.provider.dao.QuestDao;
import com.cloud.provider.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: Cloud1908
 * @description:
 * @author: Feri
 * @create: 2019-12-24 10:17
 */
@Service
public class QuestServiceImpl implements QuestService {
    @Autowired
    private QuestDao questDao;
    @Override
    public R save(Quest quest) {
        if(questDao.insert(quest)>0){
            return new R(0,"OK");
        }else {
            return new R(10010,"新增失败");
        }
    }

    @Override
    public R del(int id) {
        if(questDao.delte(id)>0){
            return new R(0,"OK");
        }else {
            return new R(10010,"删除失败");
        }
    }

    @Override
    public R queryAll() {
        return new R(0,"OK",questDao.selectAll());
    }
}
