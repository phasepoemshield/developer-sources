/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11126;
import java.util.Arrays;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07438;

public class class11143
extends class11126 {
    public static Object N_0;

    public class11143(String string, boolean bl) {
        super(string, bl);
    }

    static {
        class11143.N();
        N_0 = List.of(class06570.Gw, class06570.la);
    }

    private float N(class07438 class074382) {
        float f = 0.0f;
        f += ((class04453)class06202.Nq().T_4).method_5739((class07049)class074382) / 3.0f;
        f += class074382.method_6032() / 20.0f;
        long l = Arrays.stream(class07050.values()).filter(class070502 -> ((List)N_0).contains(class074382.method_5998(class070502).B())).count();
        return f += (float)l / 2.0f;
    }

    @Override
    public int compare(class07438 class074382, class07438 class074383) {
        return Float.compare(this.N(class074382), this.N(class074383));
    }

    private static void N() {
        N_0 = null;
    }
}

