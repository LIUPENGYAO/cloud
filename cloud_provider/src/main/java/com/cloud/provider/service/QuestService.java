package com.cloud.provider.service;


import com.cloud.common.vo.R;
import com.cloud.entity.Quest;

public interface QuestService {
    R save(Quest quest);
    R del(int id);
    R queryAll();
}
