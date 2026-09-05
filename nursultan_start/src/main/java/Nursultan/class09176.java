/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class08522
 *  minecraft.class08524
 *  minecraft.class08876
 */
package Nursultan;

import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import minecraft.class08522;
import minecraft.class08524;
import minecraft.class08876;

public class class09176
extends class08522 {
    public class09176(int n) {
        super(n, n, class08524.N((DynamicCommandExceptionType)class08876.N, (String)String.valueOf(n)));
    }

    protected boolean N(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
        };
    }
}

