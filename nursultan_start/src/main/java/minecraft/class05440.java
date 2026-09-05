/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05465;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class05440
extends class05465
implements class06084 {
    public static final MapCodec<class05440> L = class05440.y(class05440::new);
    public static final int u = 1;
    public static final int i = 4;
    public static final class08071 R = class06665.NO;
    public static final class06667 M = class05465.y;
    public static final class06667 B = class06665.q;
    public static final ToIntFunction<class00500> Z = class005002 -> (Boolean)class005002.L((class08092)M) != false ? 3 * (Integer)class005002.L((class08092)R) : 0;
    private static final Int2ObjectMap<List<class06889>> O = (Int2ObjectMap)class07536.N((Object)new Int2ObjectOpenHashMap(4), int2ObjectOpenHashMap -> {
        float f = 0.0625f;
        int2ObjectOpenHashMap.put(1, List.of(new class06889(8.0, 8.0, 8.0).L(0.0625)));
        int2ObjectOpenHashMap.put(2, List.of(new class06889(6.0, 7.0, 8.0).L(0.0625), new class06889(10.0, 8.0, 7.0).L(0.0625)));
        int2ObjectOpenHashMap.put(3, List.of(new class06889(8.0, 5.0, 10.0).L(0.0625), new class06889(6.0, 7.0, 8.0).L(0.0625), new class06889(9.0, 8.0, 7.0).L(0.0625)));
        int2ObjectOpenHashMap.put(4, List.of(new class06889(7.0, 5.0, 9.0).L(0.0625), new class06889(10.0, 7.0, 9.0).L(0.0625), new class06889(6.0, 7.0, 6.0).L(0.0625), new class06889(9.0, 8.0, 6.0).L(0.0625)));
    });
    private static final class00494[] F = new class00494[]{class00891.y((double)2.0, (double)0.0, (double)6.0), class00891.N((double)5.0, (double)0.0, (double)6.0, (double)11.0, (double)6.0, (double)9.0), class00891.N((double)5.0, (double)0.0, (double)6.0, (double)10.0, (double)6.0, (double)11.0), class00891.N((double)5.0, (double)0.0, (double)5.0, (double)11.0, (double)6.0, (double)10.0)};

    public class05440(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)Integer.valueOf(1))).y((class08092)M, (Comparable)Boolean.valueOf(false))).y((class08092)B, (Comparable)Boolean.valueOf(false)));
    }

    @Override
    protected boolean b(class00500 class005002) {
        return (Boolean)class005002.L((class08092)B) == false && super.b(class005002);
    }

    public static boolean v(class00500 class005002) {
        return class005002.N(class01210.C, class013392 -> class013392.y((class08092)M) && class013392.y((class08092)B)) && (Boolean)class005002.L((class08092)M) == false && (Boolean)class005002.L((class08092)B) == false;
    }

    @Override
    protected Iterable<class06889> U(class00500 class005002) {
        return (Iterable)O.get(((Integer)class005002.L((class08092)R)).intValue());
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)B)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public MapCodec<class05440> N() {
        return L;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)B)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037());
        if (class005002.N((class00891)this)) {
            return (class00500)class005002.N((class08092)R);
        }
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        return (class00500)super.N(class069422).y((class08092)B, (Comparable)Boolean.valueOf(bl));
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        if (!class069422.method_8046() && class069422.method_8041().B() == this.B() && (Integer)class005002.L((class08092)R) < 4) {
            return true;
        }
        return super.N(class005002, class069422);
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (class065842.R() && class080362.method_31549().i && ((Boolean)class005002.L((class08092)M)).booleanValue()) {
            class05440.N(class080362, class005002, (class07284)class072992, class072092);
            return class07082.N;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (((Boolean)class005002.L((class08092)B)).booleanValue() || class046882.N() != class04684.L) {
            return false;
        }
        class00500 class005003 = (class00500)class005002.y((class08092)B, (Comparable)Boolean.valueOf(true));
        if (((Boolean)class005002.L((class08092)M)).booleanValue()) {
            class05440.N(null, class005003, class072842, class072092);
        } else {
            class072842.method_8652(class072092, class005003, 3);
        }
        class072842.N(class072092, class046882.N(), class046882.N().N((class05487)class072842));
        return true;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return F[(Integer)class005002.L((class08092)R) - 1];
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, M, B});
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class00891.N_6((class05487)class054872, (class07209)class072092.method_10074(), (class07211)class07211.field_11036);
    }
}

