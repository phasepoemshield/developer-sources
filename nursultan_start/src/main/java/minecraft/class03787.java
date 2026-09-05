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
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07036
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07267
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
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
import minecraft.class03792;
import minecraft.class03795;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class05904;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07036;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07267;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class03787
extends class07036 {
    public static final MapCodec<class03787> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05904.N.fieldOf("wood_type").forGetter(class07036::L), (App)class03787.t()).apply(instance, class03787::new));
    public static final class08071 L = class06665.yR;
    public static final class06667 u = class06665.N;
    private static final class00494 i = class00891.y((double)10.0, (double)0.0, (double)16.0);
    private static final Map<Integer, class00494> R = class00389.L((class00494)class00891.N((double)14.0, (double)2.0, (double)0.0, (double)10.0)).entrySet().stream().collect(Collectors.toMap(entry -> class03795.N((class07211)entry.getKey()), Map.Entry::getValue));

    public class03787(class05904 class059042, class01362 class013622) {
        super(class059042, class013622.N(class059042.i()));
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    public float U(class00500 class005002) {
        return class03795.y((Integer)class005002.L((class08092)L));
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        return this.N(class005002, class072902, class072092, class06092.N());
    }

    public MapCodec<class03787> N() {
        return y;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class03786(class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u, N});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(class071112.N(((Integer)class005002.L((class08092)L)).intValue(), 16)));
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class03787.N(class004042, (class00404)class00404.field_40330, class07267::N);
    }

    private boolean N(class08036 class080362, class06183 class061832, class07267 class072672, class06584 class065842) {
        return !class072672.N(class072672.N(class080362), class080362) && class065842.B() instanceof class03759 && class061832.i().equals((Object)class07211.field_11033);
    }

    public class00500 N(class06942 class069422) {
        boolean bl;
        class07299 class072992 = class069422.method_8045();
        class04688 class046882 = class072992.method_8316(class069422.method_8037());
        class07209 class072092 = class069422.method_8037().method_10084();
        class00500 class005002 = class072992.method_8320(class072092);
        boolean bl2 = class005002.N(class01210.NX);
        class07211 class072112 = class07211.N((double)class069422.method_8044());
        boolean bl3 = bl = !class00891.N((class00494)class005002.M((class07290)class072992, class072092), (class07211)class07211.field_11033) || class069422.method_8046();
        if (bl2 && !class069422.method_8046()) {
            Optional<class07211> var9;
            if (class005002.y(class03792.L)) {
                class07211 class072113 = (class07211)class005002.L(class03792.L);
                if (class072113.z().test(class072112)) {
                    bl = false;
                }
            } else if (class005002.y((class08092)L) && (var9 = class03795.N((Integer)class005002.L((class08092)L))).isPresent() && var9.get().z().test(class072112)) {
                bl = false;
            }
        }
        int n = !bl ? class03795.N(class072112.b()) : class03795.N(class069422.method_8044() + 180.0f);
        return (class00500)((class00500)((class00500)this.W().y((class08092)u, (Comparable)Boolean.valueOf(bl))).y((class08092)L, (Comparable)Integer.valueOf(n))).y((class08092)N, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R.getOrDefault(class005002.L((class08092)L), i);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(class069932.N(((Integer)class005002.L((class08092)L)).intValue(), 16)));
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        class07267 class072672;
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07267 && this.N(class080362, class061832, class072672 = (class07267)class003942, class065842)) {
            return class07082.i;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && !this.a_(class005002, class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10084()).N((class07290)class054872, class072092.method_10084(), class07211.field_11033, class01020.field_25823);
    }
}

