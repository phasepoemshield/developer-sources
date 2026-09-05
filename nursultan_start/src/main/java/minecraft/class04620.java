/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00429
 *  minecraft.class00447
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00756
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05497
 *  minecraft.class05534
 *  minecraft.class05847
 *  minecraft.class06990
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08588
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00429;
import minecraft.class00447;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00756;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class03556;
import minecraft.class04593;
import minecraft.class04626;
import minecraft.class04630;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05497;
import minecraft.class05534;
import minecraft.class05847;
import minecraft.class06990;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08588;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04620
extends class00394 {
    static final Logger N = LogUtils.getLogger();
    private static final String i = "flower_pos";
    private static final String R = "bees";
    static final List<String> y = Arrays.asList("Air", "drop_chances", "equipment", "Brain", "CanPickUpLoot", "DeathTime", "fall_distance", "FallFlying", "Fire", "HurtByTimestamp", "HurtTime", "LeftHanded", "Motion", "NoGravity", "OnGround", "PortalCooldown", "Pos", "Rotation", "sleeping_pos", "CannotEnterHiveTicks", "TicksSincePollination", "CropsGrownSincePollination", "hive_pos", "Passengers", "leash", "UUID");
    public static final int L = 3;
    private static final int M = 400;
    private static final int B = 2400;
    public static final int u = 600;
    private final List<class04630> Z = Lists.newArrayList();
    private @Nullable class07209 m;

    public boolean L() {
        return this.Z.isEmpty();
    }

    public boolean M() {
        return class05847.N((class07299)this.z, (class07209)this.d());
    }

    public class04620(class07209 class072092, class00500 class005002) {
        super(class00404.field_20431, class072092, class005002);
    }

    private boolean B() {
        return this.m != null;
    }

    private List<class05534> Z() {
        return this.Z.stream().map(class04630::y).toList();
    }

    public boolean u() {
        return this.Z.size() == 3;
    }

    public void y(class08329 class083292) {
        super.y(class083292);
        class083292.L(R);
    }

    private List<class07049> N(class00500 class005002, class05497 class054972) {
        ArrayList arrayList = Lists.newArrayList();
        this.Z.removeIf(class046302 -> class04620.N(this.z, this.U, class005002, class046302.y(), arrayList, class054972, this.m));
        if (!arrayList.isEmpty()) {
            super.method_5431();
        }
        return arrayList;
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.Nd, (Object)new class08588(this.Z()));
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.Z.clear();
        ((class08588)class026662.a_(class02484.Nd, (Object)class08588.L)).N().forEach(this::N);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N(R, class05534.u, this.Z());
        class083292.y(i, class07209.field_25064, (Object)this.m);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class04620 class046202) {
        class04620.N(class072992, class072092, class005002, class046202.Z, class046202.m);
        if (!class046202.Z.isEmpty() && class072992.method_8409().U() < 0.005) {
            double d = (double)class072092.method_10263() + 0.5;
            double d2 = class072092.method_10264();
            double d3 = (double)class072092.method_10260() + 0.5;
            class072992.method_43128(null, d, d2, d3, class04909.LU, class04911.field_15245, 1.0f, 1.0f);
        }
    }

    public void N(@Nullable class08036 class080362, class00500 class005002, class05497 class054972) {
        List<class07049> var4 = this.N(class005002, class054972);
        if (class080362 != null) {
            for (class07049 class070492 : var4) {
                if (!(class070492 instanceof class04626)) continue;
                class04626 class046262 = (class04626)class070492;
                if (!(class080362.method_73189().M(class070492.method_73189()) <= 16.0)) continue;
                if (!this.M()) {
                    class046262.y((class07438)class080362);
                    continue;
                }
                class046262.N(400);
            }
        }
    }

    private static boolean N(class07299 class072992, class07209 class072092, class00500 class005002, class05534 class055342, @Nullable List<class07049> list, class05497 class054972, @Nullable class07209 class072093) {
        boolean bl;
        if (((Boolean)class072992.method_75728().N(class00608.X, class072092)).booleanValue() && class054972 != class05497.field_21052) {
            return false;
        }
        class07211 class072112 = (class07211)class005002.L(class04593.y);
        class07209 class072094 = class072092.method_10093(class072112);
        boolean bl2 = bl = !class072992.method_8320(class072094).M((class07290)class072992, class072094).method_1110();
        if (bl && class054972 != class05497.field_21052) {
            return false;
        }
        class07049 class070492 = class055342.N(class072992, class072092);
        if (class070492 != null) {
            if (class070492 instanceof class04626) {
                class04626 class046262 = (class04626)class070492;
                if (class072093 != null && !class046262.v() && class072992.field_9229.z() < 0.9f) {
                    class046262.y(class072093);
                }
                if (class054972 == class05497.field_20428) {
                    int n;
                    class046262.Nq();
                    if (class005002.N(class01210.NC, class013392 -> class013392.y((class08092)class04593.L)) && (n = class04620.N(class005002)) < 5) {
                        int n2;
                        int n3 = n2 = class072992.field_9229.y(100) == 0 ? 2 : 1;
                        if (n + n2 > 5) {
                            --n2;
                        }
                        class072992.method_8501(class072092, (class00500)class005002.y((class08092)class04593.L, (Comparable)Integer.valueOf(n + n2)));
                    }
                }
                if (list != null) {
                    list.add((class07049)class046262);
                }
                float f = class070492.method_17681();
                double d = bl ? 0.0 : 0.55 + (double)(f / 2.0f);
                double d2 = (double)class072092.method_10263() + 0.5 + d * (double)class072112.P();
                double d3 = (double)class072092.method_10264() + 0.5 - (double)(class070492.method_17682() / 2.0f);
                double d4 = (double)class072092.method_10260() + 0.5 + d * (double)class072112.T();
                class070492.method_5808(d2, d3, d4, class070492.method_36454(), class070492.method_36455());
            }
            class072992.method_8396(null, class072092, class04909.LZ, class04911.field_15245, 1.0f, 1.0f);
            class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class070492, (class00500)class072992.method_8320(class072092)));
            return class072992.method_8649(class070492);
        }
        return false;
    }

    public static int N(class00500 class005002) {
        return (Integer)class005002.L((class08092)class04593.L);
    }

    public void N(class05534 class055342) {
        this.Z.add(new class04630(class055342));
    }

    public void N(class04626 class046262) {
        if (this.Z.size() >= 3) {
            return;
        }
        class046262.method_5848();
        class046262.method_5772();
        class046262.yU();
        this.N(class05534.N((class07049)class046262));
        if (this.z != null) {
            if (class046262.v() && (!this.B() || this.z.field_9229.Z())) {
                this.m = class046262.m();
            }
            class07209 class072092 = this.d();
            this.z.method_43128(null, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.LB, class04911.field_15245, 1.0f, 1.0f);
            this.z.N((class03556)class01194.L, class072092, class01164.N((class07049)class046262, (class00500)this.w()));
        }
        class046262.method_31472();
        super.method_5431();
    }

    public boolean N() {
        if (this.z == null) {
            return false;
        }
        for (class07209 class072092 : class07209.method_10097((class07209)this.U.method_10069(-1, -1, -1), (class07209)this.U.method_10069(1, 1, 1))) {
            if (!(this.z.method_8320(class072092).i() instanceof class00756)) continue;
            return true;
        }
        return false;
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, List<class04630> list, @Nullable class07209 class072093) {
        boolean bl = false;
        Iterator<class04630> iterator = list.iterator();
        while (iterator.hasNext()) {
            class05497 class054972;
            class04630 class046302 = iterator.next();
            if (!class046302.N()) continue;
            class05497 class054973 = class054972 = class046302.L() ? class05497.field_20428 : class05497.field_20429;
            if (!class04620.N(class072992, class072092, class005002, class046302.y(), null, class054972, class072093)) continue;
            bl = true;
            iterator.remove();
        }
        if (bl) {
            class04620.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.Z.clear();
        class082992.N(R, class05534.u).orElse(List.of()).forEach(this::N);
        this.m = class082992.N(i, class07209.field_25064).orElse(null);
    }

    public void method_5431() {
        if (this.N()) {
            this.N(null, this.z.method_8320(this.d()), class05497.field_21052);
        }
        super.method_5431();
    }

    public int R() {
        return this.Z.size();
    }

    public void method_74589(class04782 class047822, class06990 class069902) {
        class069902.N(class00429.B, () -> class00447.N((class04620)this));
    }
}

