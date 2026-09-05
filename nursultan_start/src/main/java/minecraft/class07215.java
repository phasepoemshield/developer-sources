/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class06760
 *  minecraft.class06993
 *  minecraft.class07290
 *  minecraft.class08092
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class06760;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08791;

public abstract class class07215
extends class06760 {
    private static final Map<class07185, class00494> N = class00389.y((class00494)class00891.N((double)4.0, (double)4.0, (double)16.0));

    public class07215(class01362 class013622) {
        super(class013622);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)y, (Comparable)((Object)class069932.N((class07211)((Object)class005002.L((class08092)y)))));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y((class08092)y, (Comparable)((Object)class071112.y((class07211)((Object)class005002.L((class08092)y)))));
    }

    protected abstract MapCodec<? extends class07215> N();

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return N.get(((class07211)((Object)class005002.L((class08092)y))).z());
    }
}

