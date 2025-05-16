package com.example.event.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.event.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface EventMapper extends BaseMapper<Event> {
    @Select("SELECT * FROM events WHERE `from` = #{from}")
    List<Event> findByFrom(String from);

    default boolean saveOrUpdate(Event event) {
        if (selectById(event.getTransactionHash()) != null) {
            return updateById(event) > 0;
        } else {
            return insert(event) > 0;
        }
    }
} 