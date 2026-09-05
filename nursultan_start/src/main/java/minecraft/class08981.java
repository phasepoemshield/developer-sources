/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class02774
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
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
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class02774;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import minecraft.class08965;
import minecraft.class08973;
import org.jspecify.annotations.Nullable;

public class class08981
extends class07796
implements class06084 {
    public static final MapCodec<class08981> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02774.field_46493.fieldOf("weathering_state").forGetter(class08981::y), (App)class08981.t()).apply(instance, class08981::new));
    public static final class08064<class07211> y = class06665.f;
    public static final class08064<class08973> L = class06665.yK;
    public static final class06667 u = class06665.q;
    private static final class00494 i = class00891.y((double)10.0, (double)0.0, (double)14.0);
    private final class02774 R;

    public class08981(class02774 class027742, class01362 class013622) {
        super(class013622);
        this.R = class027742;
        this.P((class00500)((class00500)((class00500)this.W().y(y, (Comparable)class07211.field_11043)).y(L, (Comparable)((Object)class08973.field_61414))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    public boolean i(class00500 class005002) {
        return class005002.N(class01210.NW);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public class02774 y() {
        return this.R;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        class00394 class003942 = class054872.method_8321(class072092);
        if (class003942 instanceof class08965) {
            return ((class08965)class003942).N(this.B().E(), (class08973)((Object)class005002.L(L)));
        }
        return super.N(class054872, class072092, class005002, bl);
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return ((class08973)((Object)class005002.L(L))).ordinal() + 1;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class047822.method_8455(class072092, class005002.i());
    }

    public MapCodec<? extends class08981> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        return (class00500)((class00500)this.W().y(y, (Comparable)class069422.method_8042().b())).y((class08092)u, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        super.N(class005172);
        class005172.N(new class08092[]{y, L, u});
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class08965(class072092, class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return class087912 == class08791.field_48 && class005002.Y().N(class01231.N);
    }

    void N(class07299 class072992, class00500 class005002, class07209 class072092, class08036 class080362) {
        class072992.N(null, class072092, class04909.MH, class04911.field_15245);
        class072992.method_8652(class072092, (class00500)class005002.y(L, (Comparable)((Object)((class08973)((Object)class005002.L(L))).N())), 3);
        class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (class065842.N(class01226.Ly)) {
            return class07082.i;
        }
        this.N(class072992, class005002, class072092, class080362);
        return class07082.N;
    }
}

