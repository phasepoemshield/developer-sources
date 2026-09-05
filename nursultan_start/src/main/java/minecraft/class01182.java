/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class02362
 *  minecraft.class04206
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01155;
import minecraft.class01161;
import minecraft.class01177;
import minecraft.class01189;
import minecraft.class01190;
import minecraft.class02362;
import minecraft.class04206;
import minecraft.class04247;

public interface class01182<T extends class01190> {
    public static final class01182<class01155> N = class01182.N("block", new class01189());
    public static final class01182<class01177> y = class01182.N("entity", new class01161());

    public class02362<? super class04247, T> y();

    public MapCodec<T> N();

    public static <S extends class01182<T>, T extends class01190> S N(String string, S s) {
        return (S)((class01182)class00751.N((class00751)class04206.n, (String)string, s));
    }
}

