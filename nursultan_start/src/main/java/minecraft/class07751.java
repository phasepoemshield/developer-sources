/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03795
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class05904
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07036
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03795;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class05904;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07036;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class07751
extends class07036 {
    public static final MapCodec<class07751> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05904.N.fieldOf("wood_type").forGetter(class07036::L), (App)class07751.t()).apply(instance, class07751::new));
    public static final class08071 L = class06665.yR;

    public class07751(class05904 class059042, class01362 class013622) {
        super(class059042, class013622.N(class059042.u()));
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0))).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    public float U(class00500 class005002) {
        return class03795.y((int)((Integer)class005002.L((class08092)L)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(class071112.N(((Integer)class005002.L((class08092)L)).intValue(), 16)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, N});
    }

    public MapCodec<class07751> N() {
        return y;
    }

    public class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        return (class00500)((class00500)this.W().y((class08092)L, (Comparable)Integer.valueOf(class03795.N((float)(class069422.method_8044() + 180.0f))))).y((class08092)N, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !this.a_(class005002, class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(class069932.N(((Integer)class005002.L((class08092)L)).intValue(), 16)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10074()).B();
    }
}

