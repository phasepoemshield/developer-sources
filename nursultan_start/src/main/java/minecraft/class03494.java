/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06505
 *  minecraft.class07536
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class03489;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06505;
import minecraft.class07536;
import minecraft.class07693;

public class class03494
extends class06505 {
    public static final MapCodec<class03494> i = class03494.N(class03494::new);

    class03494(List<class05957> list) {
        super(list, class07536.y(list));
    }

    public class05955 N() {
        return class07693.y;
    }

    public static class03489 N(class05952 ... class05952Array) {
        return new class03489(class05952Array);
    }
}

