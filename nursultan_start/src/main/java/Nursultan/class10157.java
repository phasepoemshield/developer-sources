/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03182
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04417
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class06202
 *  minecraft.class06898
 *  minecraft.class07105
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class03182;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class06202;
import minecraft.class06898;
import minecraft.class07105;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class10157
implements class04417<class07105> {
    private final class06143 N;

    public class10157(class06143 class061432) {
        this.N = class061432;
    }

    public @Nullable class04406 method_3090(class07105 class071052, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        class00500 class005002 = class071052.N();
        if (!class005002.P() && class005002.b() == class06898.field_11455) {
            return null;
        }
        class07209 class072092 = class07209.method_49637((double)d, (double)d2, (double)d3);
        int n = class06202.Nq().d().N(class005002, (class07299)class034482, class072092);
        if (class005002.i() instanceof class07204) {
            n = ((class07204)class005002.i()).N(class005002, (class07290)class034482, class072092);
        }
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        return new class03182(class034482, d, d2, d3, f, f2, f3, this.N);
    }
}

