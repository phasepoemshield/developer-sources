/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06505
 *  minecraft.class07536
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class03474;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06505;
import minecraft.class07536;
import minecraft.class07693;

public class class03496
extends class06505 {
    public static final MapCodec<class03496> i = class03496.N(class03496::new);
    public static final Codec<class03496> R = class03496.y(class03496::new);

    class03496(List<class05957> list) {
        super(list, class07536.N(list));
    }

    public static class03496 N(List<class05957> list) {
        return new class03496(List.copyOf(list));
    }

    public static class03474 N(class05952 ... class05952Array) {
        return new class03474(class05952Array);
    }

    public class05955 N() {
        return class07693.L;
    }
}

