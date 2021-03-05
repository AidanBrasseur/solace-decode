package com.example.solace.decode.model;

import lombok.*;

import javax.persistence.Id;

import javax.persistence.*;

@Data
@Entity
public class ChannelCategory {
    @Id
    private String id;

    @Column(nullable=false)
    private Integer channelId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Integer confidence;

}