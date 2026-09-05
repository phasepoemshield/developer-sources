/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class06069
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07732
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class06069;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07732;

public class class07093
extends class07732 {
    public static final MapCodec<class07093> N = class07093.y(class07093::new);

    public class07093(class01362 class013622) {
        super(class013622);
    }

    public MapCodec<class07093> N() {
        return N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        super.N_20(class005002, class072992, class072092, class060692);
        if (class060692.y(10) == 0) {
            class072992.method_8406((class07126)class07107.Nu, (double)class072092.method_10263() + class060692.U(), (double)class072092.method_10264() + 1.1, (double)class072092.method_10260() + class060692.U(), 0.0, 0.0, 0.0);
        }
    }
}

