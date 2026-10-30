package com.seiyrikon.taskmanager.shared;

import lombok.Getter;

public class Principal {
    @Getter
    public static String id;

    public static void setId(String id) {
        Principal.id = id;
    }
}
