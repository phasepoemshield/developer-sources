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
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06788
 *  minecraft.class06901
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00637;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06788;
import minecraft.class06901;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;

public class class00664
extends class00891 {
    public static final MapCodec<class00664> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("hook").forGetter(class006642 -> class006642.f), (App)class00664.t()).apply(instance, class00664::new));
    public static final class06667 y = class06665.k;
    public static final class06667 L = class06665.N;
    public static final class06667 u = class06665.M;
    public static final class06667 i = class06901.y;
    public static final class06667 R = class06901.L;
    public static final class06667 M = class06901.u;
    public static final class06667 B = class06901.i;
    private static final Map<class07211, class06667> Z = class06788.M;
    private static final class00494 O = class00891.y((double)16.0, (double)1.0, (double)2.5);
    private static final class00494 F = class00891.y((double)16.0, (double)0.0, (double)8.0);
    private static final int A = 10;
    private final class00891 f;

    public class00664(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false))).y((class08092)M, (Comparable)Boolean.valueOf(false))).y((class08092)B, (Comparable)Boolean.valueOf(false)));
        this.f = class008912;
    }

    public boolean N(class00500 class005002, class07211 class072112) {
        if (class005002.N(this.f)) {
            return class005002.L(class00637.y) == class072112.b();
        }
        return class005002.N((class00891)this);
    }

    private void N(class07299 class072992, class07209 class072092, List<? extends class07049> list) {
        class00500 class005002 = class072992.method_8320(class072092);
        boolean bl = (Boolean)class005002.L((class08092)y);
        boolean bl2 = false;
        if (!list.isEmpty()) {
            Iterator<? extends class07049> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().method_5696()) continue;
                bl2 = true;
                break;
            }
        }
        if (bl2 != bl) {
            class005002 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(bl2));
            class072992.method_8652(class072092, class005002, 3);
            this.N(class072992, class072092, class005002);
        }
        if (bl2) {
            class072992.N(new class07209((class00753)class072092), (class00891)this, 10);
        }
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        switch (class069932) {
            case field_11464: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)M)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)B)))).y((class08092)M, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)B, (Comparable)((Boolean)class005002.L((class08092)R)));
            }
            case field_11465: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)M)))).y((class08092)M, (Comparable)((Boolean)class005002.L((class08092)B)))).y((class08092)B, (Comparable)((Boolean)class005002.L((class08092)i)));
            }
            case field_11463: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)B)))).y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)M, (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)B, (Comparable)((Boolean)class005002.L((class08092)M)));
            }
        }
        return class005002;
    }

    private void N(class07299 class072992, class07209 class072092) {
        class00500 class005002 = class072992.method_8320(class072092);
        List list = class072992.N_70(null, class005002.R((class07290)class072992, class072092).method_1107().N(class072092));
        this.N(class072992, class072092, list);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class047822.method_8320(class072092).L((class08092)y)).booleanValue()) {
            return;
        }
        this.N((class07299)class047822, class072092);
    }

    public MapCodec<class00664> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i, R, B, M});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        switch (class071112) {
            case field_11300: {
                return (class00500)((class00500)class005002.y((class08092)i, (Comparable)((Boolean)class005002.L((class08092)M)))).y((class08092)M, (Comparable)((Boolean)class005002.L((class08092)i)));
            }
            case field_11301: {
                return (class00500)((class00500)class005002.y((class08092)R, (Comparable)((Boolean)class005002.L((class08092)B)))).y((class08092)B, (Comparable)((Boolean)class005002.L((class08092)R)));
            }
        }
        return super.N(class005002, class071112);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl) {
            this.N((class07299)class047822, class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)));
        }
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        this.N(class072992, class072092, class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.z().L()) {
            return (class00500)class005002.y((class08092)Z.get(class072112), (Comparable)Boolean.valueOf(this.N(class005003, class072112)));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        return (class00500)((class00500)((class00500)((class00500)this.W().y((class08092)i, (Comparable)Boolean.valueOf(this.N(class072992.method_8320(class072092.method_10095()), class07211.field_11043)))).y((class08092)R, (Comparable)Boolean.valueOf(this.N(class072992.method_8320(class072092.method_10078()), class07211.field_11034)))).y((class08092)M, (Comparable)Boolean.valueOf(this.N(class072992.method_8320(class072092.method_10072()), class07211.field_11035)))).y((class08092)B, (Comparable)Boolean.valueOf(this.N(class072992.method_8320(class072092.method_10067()), class07211.field_11039)));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (Boolean)class005002.L((class08092)L) != false ? O : F;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return;
        }
        this.N(class072992, class072092, List.of(class070492));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class07049 class070492) {
        return class005002.R(class072902, class072092);
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        block0: for (class07211 class072112 : new class07211[]{class07211.field_11035, class07211.field_11039}) {
            for (int i = 1; i < 42; ++i) {
                class07209 class072093 = class072092.method_10079(class072112, i);
                class00500 class005003 = class072992.method_8320(class072093);
                if (class005003.N(this.f)) {
                    if (class005003.L(class00637.y) != class072112.b()) continue block0;
                    class00637.N(class072992, class072093, class005003, false, true, i, class005002);
                    continue block0;
                }
                if (!class005003.N((class00891)this)) continue block0;
            }
        }
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (!class072992.method_8608() && !class080362.method_6047().R() && class080362.method_6047().N(class06570.vr)) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(true)), 260);
            class072992.N((class07049)class080362, (class03556)class01194.H, class072092);
        }
        return super.N(class072992, class072092, class005002, class080362);
    }
}

