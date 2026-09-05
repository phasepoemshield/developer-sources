/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09652
 *  Nursultan.class09658
 *  com.mojang.brigadier.StringReader
 *  it.unimi.dsi.fastutil.chars.CharList
 *  minecraft.class02315
 */
package minecraft;

import Nursultan.class09652;
import Nursultan.class09658;
import com.mojang.brigadier.StringReader;
import it.unimi.dsi.fastutil.chars.CharList;
import minecraft.class02176;
import minecraft.class02315;

public interface class02179 {
    public static StringReader N(String string, int n) {
        StringReader stringReader = new StringReader(string);
        stringReader.setCursor(n);
        return stringReader;
    }

    public static class02315<StringReader> N(char c, char c2) {
        return new class09652(CharList.of((char)c, (char)c2), c, c2);
    }

    public static class02315<StringReader> N(char c) {
        return new class09658(CharList.of((char)c), c);
    }

    public static class02315<StringReader> N(String string) {
        return new class02176(string);
    }
}

