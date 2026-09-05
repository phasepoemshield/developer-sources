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
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07107
 *  minecraft.class07111
 *  minecraft.class07126
 *  minecraft.class07134
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
import minecraft.class00670;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07107;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class00651
extends class00670 {
    public static final MapCodec<class00651> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)N.forGetter(class006512 -> class006512.L), (App)class00651.t()).apply(instance, class00651::new));
    public static final class08064<class07211> i = class07101.R;
    private static final Map<class07211, class00494> R = class00389.L((class00494)class00891.N((double)5.0, (double)3.0, (double)13.0, (double)11.0, (double)16.0));

    public class00651(class07134 class071342, class01362 class013622) {
        super(class071342, class013622);
        this.P((class00500)((class00500)this.Q.y()).y(i, (Comparable)class07211.field_11043));
    }

    public static class00494 U(class00500 class005002) {
        return R.get(class005002.L(i));
    }

    public static boolean y(class05487 class054872, class07209 class072092, class07211 class072112) {
        class07209 class072093 = class072092.method_10093(class072112.b());
        return class054872.method_8320(class072093).L((class07290)class054872, class072093, class072112);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(i, (Comparable)class069932.N((class07211)class005002.L(i)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(i)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{i});
    }

    public MapCodec<class00651> N() {
        return u;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00651.U(class005002);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = this.W();
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            class07211 class072113;
            if (!class072112.z().L() || !(class005002 = (class00500)class005002.y(i, (Comparable)(class072113 = class072112.b()))).N((class05487)class072992, class072092)) continue;
            return class005002;
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.b() == class005002.L(i) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return class005002;
    }

    @Override
    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class07211 class072112 = (class07211)class005002.L(i);
        double d = (double)class072092.method_10263() + 0.5;
        double d2 = (double)class072092.method_10264() + 0.7;
        double d3 = (double)class072092.method_10260() + 0.5;
        double d4 = 0.22;
        double d5 = 0.27;
        class07211 class072113 = class072112.b();
        class072992.method_8406((class07126)class07107.NZ, d + 0.27 * (double)class072113.P(), d2 + 0.22, d3 + 0.27 * (double)class072113.T(), 0.0, 0.0, 0.0);
        class072992.method_8406((class07126)this.L, d + 0.27 * (double)class072113.P(), d2 + 0.22, d3 + 0.27 * (double)class072113.T(), 0.0, 0.0, 0.0);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class00651.y(class054872, class072092, (class07211)class005002.L(i));
    }
}

