/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01284
 *  minecraft.class01338
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07307
 */
package Nursultan;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01284;
import minecraft.class01338;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07307;

public class class09468
extends class01284 {
    final /* synthetic */ class07209 N;
    final /* synthetic */ boolean y;

    public class09468(class01338 class013382, class07209 class072092, boolean bl) {
        this.N = class072092;
        this.y = bl;
    }

    public Optional<Float> N(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (class072092.equals((Object)this.N) && this.y) {
            return Optional.of(Float.valueOf(class00869.K.R()));
        }
        return super.N(class073072, class072902, class072092, class005002, class046882);
    }
}

