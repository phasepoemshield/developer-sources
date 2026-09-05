/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00392
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class03965
 *  minecraft.class05880
 *  minecraft.class06146
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00392;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class03965;
import minecraft.class05880;
import minecraft.class06092;
import minecraft.class06146;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class06118
extends class00891 {
    public static final MapCodec<class06118> N = class06118.y(class06118::new);
    private static final class00392 L = class00392.L((String)"container.stonecutter");
    public static final class08064<class07211> y = class07101.R;
    private static final class00494 u = class00891.y((double)16.0, (double)0.0, (double)9.0);

    public class06118(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.method_8042().b());
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            class080362.method_17355(class005002.N(class072992, class072092));
            class080362.method_7281(class01235.Nk);
        }
        return class07082.N;
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        return new class03965((n, class080442, class080362) -> new class06146(n, class080442, class05880.N((class07299)class072992, (class07209)class072092)), L);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u;
    }

    public MapCodec<class06118> N() {
        return N;
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

