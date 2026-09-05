/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03795
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06563
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07685
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03795;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06563;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07685;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class07800
extends class07685 {
    public static final MapCodec<class07800> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.fieldOf("color").forGetter(class07685::y), (App)class07800.t()).apply(instance, class07800::new));
    public static final class08071 y = class06665.yR;
    private static final Map<class06563, class00891> L = Maps.newHashMap();
    private static final class00494 u = class00891.y((double)8.0, (double)0.0, (double)16.0);

    public class07800(class06563 class065632, class01362 class013622) {
        super(class065632, class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
        L.put(class065632, (class00891)this);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public static class00891 N(class06563 class065632) {
        return L.getOrDefault(class065632, class00869.zY);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(class071112.N(((Integer)class005002.L((class08092)y)).intValue(), 16)));
    }

    public MapCodec<class07800> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u;
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)y, (Comparable)Integer.valueOf(class03795.N((float)(class069422.method_8044() + 180.0f))));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(class069932.N(((Integer)class005002.L((class08092)y)).intValue(), 16)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10074()).B();
    }
}

