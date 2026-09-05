/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06665
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07760
 *  minecraft.class08064
 *  minecraft.class08080
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06665;
import minecraft.class06897;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07760;
import minecraft.class08064;
import minecraft.class08080;
import minecraft.class08092;

public class class06892
extends class07760 {
    public static final MapCodec<class06892> y = class06892.y(class06892::new);
    public static final class08064<class08080> L = class06665.NU;

    public class08092<class08080> L() {
        return L;
    }

    public class06892(class01362 class013622) {
        super(false, class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class08080.field_12665)).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    public MapCodec<class06892> N() {
        return y;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, N});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        class08080 class080802 = (class08080)class005002.L(L);
        class08080 class080803 = this.N(class080802, class071112);
        return (class00500)class005002.y(L, (Comparable)class080803);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        class08080 class080802 = (class08080)class005002.L(L);
        class08080 class080803 = this.N(class080802, class069932);
        return (class00500)class005002.y(L, (Comparable)class080803);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912) {
        if (class008912.W().j() && new class06897(class072992, class072092, class005002).y() == 3) {
            this.N(class072992, class072092, class005002, false);
        }
    }
}

