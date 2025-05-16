package com.example.event.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
@TableName("events")
public class Event {
    @TableId
    @TableField("transaction_hash")
    private String transactionHash;
    
    @TableField("event_name")
    private String eventName;
    
    @TableField("`from`")
    private String from;
    
    @TableField("`to`")
    private String to;
    
    private String value;
    private String address;
    private String topics;
    private String data;
    
    @TableField("block_hash")
    private String blockHash;
    
    @TableField("block_number")
    private String blockNumber;
    
    @TableField("block_timestamp")
    private String blockTimestamp;
    
    @TableField("transaction_index")
    private Integer transactionIndex;
    
    @TableField("log_index")
    private Integer logIndex;
    
    private Boolean removed;
} 