/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01020
 *  minecraft.class01118
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class05904
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07036
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07267
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01020;
import minecraft.class01118;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03759;
import minecraft.class03786;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class05904;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07036;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07267;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class03792
extends class07036 {
    public static final MapCodec<class03792> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05904.N.fieldOf("wood_type").forGetter(class07036::L), (App)class03792.t()).apply(instance, class03792::new));
    public static final class08064<class07211> L = class07101.R;
    private static final Map<class07185, class00494> u = class00389.N((class00494)class00891.N((double)16.0, (double)4.0, (double)14.0, (double)16.0));
    private static final Map<class07185, class00494> i = class00389.N((class00494)class00389.N((class00494)u.get(class07185.field_11051), (class00494)class00891.N((double)14.0, (double)2.0, (double)0.0, (double)10.0)));

    public class03792(class05904 class059042, class01362 class013622) {
        super(class059042, class013622.N(class059042.i()));
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class07211.field_11043)).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    public float U(class00500 class005002) {
        return ((class07211)class005002.L(L)).U();
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        return this.N(class005002, class072902, class072092, class06092.N());
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u.get(((class07211)class005002.L(L)).z());
    }

    public boolean y(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07211 class072112 = ((class07211)class005002.L(L)).R();
        class07211 class072113 = ((class07211)class005002.L(L)).M();
        return this.N(class054872, class005002, class072092.method_10093(class072112), class072113) || this.N(class054872, class005002, class072092.method_10093(class072113), class072112);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, N});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(L)));
    }

    public MapCodec<class03792> N() {
        return y;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(L, (Comparable)class069932.N((class07211)class005002.L(L)));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class03792.N(class004042, (class00404)class00404.field_40330, class07267::N);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class03786(class072092, class005002);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i.get(((class07211)class005002.L(L)).z());
    }

    private boolean N(class06183 class061832, class00500 class005002) {
        return class061832.i().z() == ((class07211)class005002.L(L)).z();
    }

    private boolean N(class00500 class005002, class08036 class080362, class06183 class061832, class07267 class072672, class06584 class065842) {
        return !class072672.N(class072672.N(class080362), class080362) && class065842.B() instanceof class03759 && !this.N(class061832, class005002);
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        class07267 class072672;
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07267 && this.N(class005002, class080362, class061832, class072672 = (class07267)class003942, class065842)) {
            return class07082.i;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    public boolean N(class05487 class054872, class00500 class005002, class07209 class072092, class07211 class072112) {
        class00500 class005003 = class054872.method_8320(class072092);
        if (class005003.N(class01210.Nc)) {
            return ((class07211)class005003.L(L)).z().test((class07211)class005002.L(L));
        }
        return class005003.N((class07290)class054872, class072092, class072112, class01020.field_25822);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = this.W();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            class07211 class072113;
            if (!class072112.z().L() || class072112.z().test(class069422.method_8038()) || !(class005002 = (class00500)class005002.y(L, (Comparable)(class072113 = class072112.b()))).N((class05487)class072992, class072092) || !this.y(class005002, (class05487)class072992, class072092)) continue;
            return (class00500)class005002.y((class08092)N, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.z() == ((class07211)class005002.L(L)).R().z() && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }
}

