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
 *  minecraft.class00864
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03707
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
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
import minecraft.class00864;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03707;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;

public class class07013
extends class00864
implements class00873 {
    public static final MapCodec<class07013> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03707.N.fieldOf("tree").forGetter(class070132 -> class070132.L), (App)class07013.t()).apply(instance, class07013::new));
    public static final class08071 y = class06665.Nh;
    private static final class00494 u = class00891.y((double)12.0, (double)0.0, (double)12.0);
    protected final class03707 L;

    public class07013(class03707 class037072, class01362 class013622) {
        super(class013622);
        this.L = class037072;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.U(class072092.method_10084()) >= 9 && class060692.y(7) == 0) {
            this.N(class047822, class072092, class005002, class060692);
        }
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        this.N(class047822, class072092, class005002, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public MapCodec<? extends class07013> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u;
    }

    public void N(class04782 class047822, class07209 class072092, class00500 class005002, class06069 class060692) {
        if ((Integer)class005002.L((class08092)y) == 0) {
            class047822.method_8652(class072092, (class00500)class005002.N((class08092)y), 260);
        } else {
            this.L.N(class047822, class047822.method_14178().U(), class072092, class005002, class060692);
        }
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return (double)class072992.field_9229.z() < 0.45;
    }
}

