package com.cloud.provider.dao;

import com.cloud.entity.Quest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QuestDao {
    @Insert("insert into t_quest(title,answer,type,ctime) values(#{title},#{answer},#{type},now())")
    int insert(Quest quest);
    @Select("select * from t_quest order by ctime desc")
    List<Quest> selectAll();
    @Delete("delete from t_quest where id=#{id}")
    int delte(int id);


}
