/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class07004
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class07004;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08092;

public class class00723
extends class07004 {
    public static final MapCodec<class00723> N = class00723.y(class00723::new);

    public class00723(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)class07185.field_11052));
    }

    public MapCodec<class00723> N() {
        return N;
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        class070492.method_5747(d, 0.2f, class072992.method_48963().E());
    }
}

