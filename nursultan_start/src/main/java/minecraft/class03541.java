/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01281
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00751;
import minecraft.class01281;
import minecraft.class03521;
import minecraft.class03539;
import minecraft.class03543;
import minecraft.class05946;

public class class03541 {
    public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> class059462, boolean bl) {
        return class03521.N(class059462, class03539.N(class059462), bl);
    }

    public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> class059462) {
        return class03541.N(class059462, false);
    }

    public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> class059462, Codec<E> codec, boolean bl) {
        return class03521.N(class059462, class01281.N(class059462, codec), bl);
    }

    public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> class059462, Codec<E> codec) {
        return class03541.N(class059462, codec, false);
    }
}

