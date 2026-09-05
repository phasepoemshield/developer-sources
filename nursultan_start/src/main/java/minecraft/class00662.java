/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class05904
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07036
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class05904;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07036;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00662
extends class07036 {
    public static final MapCodec<class00662> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05904.N.fieldOf("wood_type").forGetter(class07036::L), (App)class00662.t()).apply(instance, class00662::new));
    public static final class08064<class07211> L = class07101.R;
    private static final Map<class07211, class00494> u = class00389.L((class00494)class00891.N((double)16.0, (double)4.5, (double)12.5, (double)14.0, (double)16.0));

    public class06889 T(class00500 class005002) {
        return u.get(class005002.L(L)).method_1107().R();
    }

    public class00662(class05904 class059042, class01362 class013622) {
        super(class059042, class013622.N(class059042.u()));
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class07211.field_11043)).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    public float U(class00500 class005002) {
        return ((class07211)class005002.L(L)).U();
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(L, (Comparable)class069932.N((class07211)class005002.L(L)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(L)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, N});
    }

    public MapCodec<class00662> N() {
        return y;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = this.W();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            class07211 class072113;
            if (!class072112.z().L() || !(class005002 = (class00500)class005002.y(L, (Comparable)(class072113 = class072112.b()))).N((class05487)class072992, class072092)) continue;
            return (class00500)class005002.y((class08092)N, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.b() == class005002.L(L) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u.get(class005002.L(L));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10093(((class07211)class005002.L(L)).b())).B();
    }
}

