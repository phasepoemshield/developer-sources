/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06657
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06657;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07126;
import minecraft.class07138;
import minecraft.class07193;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class07127
extends class07193 {
    public static final MapCodec<class07127> N = class07127.y(class07127::new);
    public static final class06667 y = class06665.k;
    private final Function<class00500, class00494> u;

    private void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        class07211 class072112;
        class02733 class027332 = class02752.N((class07299)class072992, (class07211)class072112, (class07211)((class072112 = class07127.U(class005002).b()).z().L() ? class07211.field_11036 : (class07211)((Object)class005002.L((class08092)R))));
        class072992.method_8452(class072092, (class00891)this, class027332);
        class072992.method_8452(class072092.method_10093(class072112), (class00891)this, class027332);
    }

    public class07127(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)((Object)class07211.field_11043))).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)class06657.field_12471));
        this.u = this.y();
    }

    public void y_8(class00500 class005002, class07299 class072992, class07209 class072092, @Nullable class08036 class080362) {
        class005002 = (class00500)class005002.N((class08092)y);
        class072992.method_8652(class072092, class005002, 3);
        this.L(class005002, class072992, class072092);
        class07127.N(class080362, (class07284)class072992, class072092, class005002);
        class072992.N((class07049)class080362, (class03556)((Boolean)class005002.L((class08092)y) != false ? class01194.N : class01194.i), class072092);
    }

    private Function<class00500, class00494> y() {
        Map map = class00389.i((class00494)class00891.y((double)6.0, (double)8.0, (double)10.0, (double)16.0));
        return this.N((T class005002) -> (class00494)((Map)map.get(class005002.L((class08092)L))).get(class005002.L((class08092)R)), new class08092[]{y});
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && class07127.U(class005002) == class072112) {
            return 15;
        }
        return 0;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Boolean)class005002.L((class08092)y) != false ? 15 : 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl && ((Boolean)class005002.L((class08092)y)).booleanValue()) {
            this.L(class005002, (class07299)class047822, class072092);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, R, y});
    }

    public MapCodec<class07127> N() {
        return N;
    }

    protected static void N(@Nullable class08036 class080362, class07284 class072842, class07209 class072092, class00500 class005002) {
        float f = (Boolean)class005002.L((class08092)y) != false ? 0.6f : 0.5f;
        class072842.method_8396((class07049)class080362, class072092, class04909.Ti, class04911.field_15245, 0.3f, f);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M()) {
            this.y_8(class005002, (class07299)class047822, class072092, null);
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (class072992.method_8608()) {
            class00500 class005003 = (class00500)class005002.N((class08092)y);
            if (((Boolean)class005003.L((class08092)y)).booleanValue()) {
                class07127.N(class005003, (class07284)class072992, class072092, 1.0f);
            }
        } else {
            this.y_8(class005002, class072992, class072092, null);
        }
        return class07082.N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.u.apply(class005002);
    }

    private static void N(class00500 class005002, class07284 class072842, class07209 class072092, float f) {
        class07211 class072112 = ((class07211)((Object)class005002.L((class08092)R))).b();
        class07211 class072113 = class07127.U(class005002).b();
        double d = (double)class072092.method_10263() + 0.5 + 0.1 * (double)class072112.P() + 0.2 * (double)class072113.P();
        double d2 = (double)class072092.method_10264() + 0.5 + 0.1 * (double)class072112.s() + 0.2 * (double)class072113.s();
        double d3 = (double)class072092.method_10260() + 0.5 + 0.1 * (double)class072112.T() + 0.2 * (double)class072113.T();
        class072842.method_8406((class07126)((Object)new class07138(0xFF0000, f)), d, d2, d3, 0.0, 0.0, 0.0);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && class060692.z() < 0.25f) {
            class07127.N(class005002, (class07284)class072992, class072092, 0.5f);
        }
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

