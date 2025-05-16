package com.example.event.dto;

import lombok.Data;
import java.util.List;

@Data
public class EventDTO {
    private String eventName;
    private ArgsDTO args;
    private String address;
    private List<String> topics;
    private String data;
    private String blockHash;
    private String blockNumber;
    private String blockTimestamp;
    private String transactionHash;
    private Integer transactionIndex;
    private Integer logIndex;
    private Boolean removed;
} 