/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03795
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07688
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03795;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07688;
import minecraft.class08071;
import minecraft.class08092;

public class class07000
extends class07688 {
    public static final MapCodec<class07000> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07030.y.fieldOf("kind").forGetter(class07688::y), (App)class07000.t()).apply(instance, class07000::new));
    public static final int u = class03795.N();
    private static final int y = u + 1;
    public static final class08071 i = class06665.yR;
    private static final class00494 R = class00891.y((double)8.0, (double)0.0, (double)8.0);
    private static final class00494 M = class00891.y((double)10.0, (double)0.0, (double)8.0);

    public class07000(class07030 class070302, class01362 class013622) {
        super(class070302, class013622);
        this.P((class00500)this.W().y((class08092)i, (Comparable)Integer.valueOf(0)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        super.N(class005172);
        class005172.N(new class08092[]{i});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y((class08092)i, (Comparable)Integer.valueOf(class071112.N(((Integer)class005002.L((class08092)i)).intValue(), y)));
    }

    public MapCodec<? extends class07000> N() {
        return L;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)i, (Comparable)Integer.valueOf(class069932.N((Integer)class005002.L((class08092)i), y)));
    }

    public class00500 N(class06942 class069422) {
        return (class00500)super.N(class069422).y((class08092)i, (Comparable)Integer.valueOf(class03795.N((float)class069422.method_8044())));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.y() == class07032.field_41313 ? M : R;
    }
}

