/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01372
 *  minecraft.class03965
 *  minecraft.class05262
 *  minecraft.class05487
 *  minecraft.class05880
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06657
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07193
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01372;
import minecraft.class03965;
import minecraft.class05262;
import minecraft.class05487;
import minecraft.class05880;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06657;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07193;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08791;

public class class06121
extends class07193 {
    public static final MapCodec<class06121> N = class06121.y(class06121::new);
    private static final class00392 y = class00392.L((String)"container.grindstone_title");
    private final Function<class00500, class00494> u;

    private class00494 T(class00500 class005002) {
        return this.u.apply(class005002);
    }

    public class06121(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)class06657.field_12471));
        this.u = this.y();
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.T(class005002);
    }

    private Function<class00500, class00494> y() {
        class00494 class004942 = class00389.N((class00494)class00891.N((double)2.0, (double)6.0, (double)7.0, (double)4.0, (double)10.0, (double)16.0), (class00494)class00891.N((double)2.0, (double)5.0, (double)3.0, (double)4.0, (double)11.0, (double)9.0));
        class00494 class004943 = class00389.N((class00494)class004942, (class01372)class01372.field_23323);
        Map var4 = class00389.i((class00494)class00389.N((class00494)class00891.N((double)8.0, (double)2.0, (double)14.0, (double)0.0, (double)12.0), (class00494[])new class00494[]{class004942, class004943}));
        return this.N(class005002 -> (class00494)((Map)var4.get(class005002.L((class08092)L))).get(class005002.L((class08092)R)));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, L});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L((class08092)R)));
    }

    public MapCodec<class06121> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.T(class005002);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            class080362.method_17355(class005002.N(class072992, class072092));
            class080362.method_7281(class01235.NI);
        }
        return class07082.N;
    }

    protected class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        return new class03965((n, class080442, class080362) -> new class05262(n, class080442, class05880.N((class07299)class072992, (class07209)class072092)), y);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)R, (Comparable)class069932.N((class07211)class005002.L((class08092)R)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return true;
    }
}

