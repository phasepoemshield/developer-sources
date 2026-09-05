/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06069
 *  minecraft.class06942
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07215
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06069;
import minecraft.class06942;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07215;
import minecraft.class07299;
import minecraft.class08092;

public class class01106
extends class07215 {
    public static final MapCodec<class01106> N = class01106.y(class01106::new);

    public class01106(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)class07211.field_11036));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public MapCodec<class01106> N() {
        return N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class07211 class072112 = (class07211)class005002.L((class08092)y);
        double d = (double)class072092.method_10263() + 0.55 - (double)(class060692.z() * 0.1f);
        double d2 = (double)class072092.method_10264() + 0.55 - (double)(class060692.z() * 0.1f);
        double d3 = (double)class072092.method_10260() + 0.55 - (double)(class060692.z() * 0.1f);
        double d4 = 0.4f - (class060692.z() + class060692.z()) * 0.4f;
        if (class060692.y(5) == 0) {
            class072992.method_8406((class07126)class07107.n, d + (double)class072112.P() * d4, d2 + (double)class072112.s() * d4, d3 + (double)class072112.T() * d4, class060692.E() * 0.005, class060692.E() * 0.005, class060692.E() * 0.005);
        }
    }

    public class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.method_8038();
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037().method_10093(class072112.b()));
        if (class005002.N((class00891)this) && class005002.L((class08092)y) == class072112) {
            return (class00500)this.W().y((class08092)y, (Comparable)class072112.b());
        }
        return (class00500)this.W().y((class08092)y, (Comparable)class072112);
    }
}

