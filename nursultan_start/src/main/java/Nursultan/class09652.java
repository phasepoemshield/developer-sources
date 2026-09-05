/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.chars.CharList
 *  minecraft.class02165
 */
package Nursultan;

import it.unimi.dsi.fastutil.chars.CharList;
import minecraft.class02165;

public class class09652
extends class02165 {
    final /* synthetic */ char N;
    final /* synthetic */ char y;

    public class09652(CharList charList, char c, char c2) {
        this.N = c;
        this.y = c2;
        super(charList);
    }

    protected boolean N(char c) {
        return c == this.N || c == this.y;
    }
}

