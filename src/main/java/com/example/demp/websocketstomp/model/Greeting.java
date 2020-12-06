package com.example.demp.websocketstomp.model;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Greeting {
    @Getter
    private String content;
}