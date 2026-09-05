/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class02484
 *  minecraft.class02710
 *  minecraft.class02715
 *  minecraft.class03275
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04977
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05851
 *  minecraft.class05865
 *  minecraft.class05880
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class07804
 *  minecraft.class08036
 *  minecraft.class08044
 *  net.fabricmc.fabric.api.item.v1.EnchantingContext
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class02715;
import minecraft.class03275;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04977;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05851;
import minecraft.class05865;
import minecraft.class05880;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class07804;
import minecraft.class08036;
import minecraft.class08044;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07497
extends class04977 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 2;
    private static final Logger n = LogUtils.getLogger();
    private static final boolean t = false;
    public static final int u = 50;
    private int G;
    private @Nullable String l;
    private final class05865 d = class05865.N();
    private boolean w = false;
    private static final int k = 0;
    private static final int Y = 1;
    private static final int Q = 1;
    private static final int O = 1;
    private static final int g = 2;
    private static final int I = 1;
    private static final int J = 1;
    private static final int o = 27;
    private static final int q = 76;
    private static final int K = 134;
    private static final int V = 47;

    private static class03275 P() {
        return class03275.N().N(0, 27, 47, class065842 -> true).N(1, 76, 47, class065842 -> true).N(2, 134, 47).N();
    }

    public class07497(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class07497(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17329, n, class080442, class058802, class07497.P());
        this.N(this.d);
    }

    private static @Nullable String y(String string) {
        String string2 = class05018.M((String)string);
        if (string2.length() <= 50) {
            return string2;
        }
        return null;
    }

    public void E() {
        int n9;
        class06584 class065842 = this.j.method_5438(0);
        this.w = false;
        this.d.N(1);
        int n3 = 0;
        long l = 0L;
        int n4 = 0;
        if (class065842.R() || !class07323.N((class06584)class065842)) {
            this.v.method_5447(0, class06584.E);
            this.d.N(0);
            return;
        }
        class06584 class065843 = class065842.t();
        class06584 class065844 = this.j.method_5438(1);
        class02715 class027152 = new class02715(class07323.y((class06584)class065843));
        l += (long)((Integer)class065842.a_(class02484.n, (Object)0)).intValue() + (long)((Integer)class065844.a_(class02484.n, (Object)0)).intValue();
        this.G = 0;
        if (!class065844.R()) {
            boolean n2 = class065844.L(class02484.p);
            if (class065843.W() && class065842.L(class065844)) {
                int n8;
                n9 = Math.min(class065843.P(), class065843.s() / 4);
                if (n9 <= 0) {
                    this.v.method_5447(0, class06584.E);
                    this.d.N(0);
                    return;
                }
                for (n8 = 0; n9 > 0 && n8 < class065844.c(); ++n8) {
                    int n7 = class065843.P() - n9;
                    class065843.y(n7);
                    ++n3;
                    n9 = Math.min(class065843.P(), class065843.s() / 4);
                }
                this.G = n8;
            } else {
                int n;
                int n5;
                if (!(n2 || class065843.N(class065844.B()) && class065843.W())) {
                    this.v.method_5447(0, class06584.E);
                    this.d.N(0);
                    return;
                }
                if (class065843.W() && !n2) {
                    int class027102 = class065842.s() - class065842.P();
                    n5 = class065844.s() - class065844.P();
                    n = n5 + class065843.s() * 12 / 100;
                    int n6 = class027102 + n;
                    int entry = class065843.s() - n6;
                    if (entry < 0) {
                        entry = 0;
                    }
                    if (entry < class065843.P()) {
                        class065843.y(entry);
                        n3 += 2;
                    }
                }
                class02710 class027102 = class07323.y((class06584)class065844);
                n5 = 0;
                n = 0;
                for (Object2IntMap.Entry entry : class027102.y()) {
                    int n7;
                    class03556 var15 = (class03556)entry.getKey();
                    int n8 = class027152.N(var15);
                    n7 = n8 == (n7 = entry.getIntValue()) ? n7 + 1 : Math.max(n7, n8);
                    class07304 class073042 = (class07304)var15.N();
                    class06584 class065845 = class065842;
                    class07304 class073043 = class073042;
                    LocalRefImpl localRefImpl = new LocalRefImpl();
                    localRefImpl.init((Object)var15);
                    class03556 class035562 = (class03556)localRefImpl.dispose();
                    boolean bl = this.N(class073043, class065845, (LocalRef)localRefImpl);
                    if (this.R.method_56992() || class065842.N(class06570.Gq)) {
                        bl = true;
                    }
                    for (class03556 var21 : class027152.N()) {
                        if (var21.equals((Object)class035562) || class07304.N((class03556)class035562, (class03556)var21)) continue;
                        bl = false;
                        ++n3;
                    }
                    if (!bl) {
                        n = 1;
                        continue;
                    }
                    n5 = 1;
                    if (n7 > class073042.i()) {
                        n7 = class073042.i();
                    }
                    class027152.N(class035562, n7);
                    int n10 = class073042.L();
                    if (n2) {
                        n10 = Math.max(1, n10 / 2);
                    }
                    n3 += n10 * n7;
                    if (class065842.c() <= 1) continue;
                    n3 = 40;
                }
                if (n != 0 && n5 == 0) {
                    this.v.method_5447(0, class06584.E);
                    this.d.N(0);
                    return;
                }
            }
        }
        if (this.l == null || class05018.B((String)this.l)) {
            if (class065842.L(class02484.B)) {
                n4 = 1;
                n3 += n4;
                class065843.y(class02484.B);
            }
        } else if (!this.l.equals(class065842.d().getString())) {
            n4 = 1;
            n3 += n4;
            class065843.N(class02484.B, (Object)class00392.y((String)this.l));
        }
        int n = n3 <= 0 ? 0 : (int)class04995.N((long)(l + (long)n3), (long)0L, (long)Integer.MAX_VALUE);
        this.d.N(n);
        if (n3 <= 0) {
            class065843 = class06584.E;
        }
        if (n4 == n3 && n4 > 0) {
            if (this.d.y() >= 40) {
                this.d.N(39);
            }
            this.w = true;
        }
        if (this.d.y() >= 40 && !this.R.method_56992()) {
            class065843 = class06584.E;
        }
        if (!class065843.R()) {
            n9 = (Integer)class065843.a_(class02484.n, (Object)0);
            if (n9 < (Integer)class065844.a_(class02484.n, (Object)0)) {
                n9 = (Integer)class065844.a_(class02484.n, (Object)0);
            }
            if (n4 != n3 || n4 == 0) {
                n9 = class07497.N(n9);
            }
            class065843.N(class02484.n, (Object)n9);
            class07323.N((class06584)class065843, (class02710)class027152.y());
        }
        this.v.method_5447(0, class065843);
        this.u();
    }

    private boolean N(class07304 class073042, class06584 class065842, LocalRef localRef) {
        return this.N(class073042, class065842, (class03556)localRef.get());
    }

    private boolean N(class07304 class073042, class06584 class065842, class03556 class035562) {
        return class065842.canBeEnchantedWith(class035562, EnchantingContext.ACCEPTABLE);
    }

    protected boolean N(class08036 class080362, boolean bl) {
        return (class080362.method_56992() || class080362.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= this.d.y()) && this.d.y() > 0;
    }

    protected boolean N(class00500 class005002) {
        return class005002.N(class01210.V);
    }

    public static int N(int n) {
        return (int)Math.min((long)n * 2L + 1L, Integer.MAX_VALUE);
    }

    public boolean N(String string) {
        String string2 = class07497.y(string);
        if (string2 == null || string2.equals(this.l)) {
            return false;
        }
        this.l = string2;
        if (this.L(2).R()) {
            class06584 class065842 = this.L(2).i();
            if (class05018.B((String)string2)) {
                class065842.y(class02484.B);
            } else {
                class065842.N(class02484.B, (Object)class00392.y((String)string2));
            }
        }
        this.E();
        return true;
    }

    protected void N(class08036 class080362, class06584 class065842) {
        class06584 class065843;
        if (!class080362.method_56992()) {
            class080362.method_7316(-this.d.y());
        }
        if (this.G > 0) {
            class065843 = this.j.method_5438(1);
            if (!class065843.R() && class065843.c() > this.G) {
                class065843.B(this.G);
                this.j.method_5447(1, class065843);
            } else {
                this.j.method_5447(1, class06584.E);
            }
        } else if (!this.w) {
            this.j.method_5447(1, class06584.E);
        }
        this.d.N(0);
        if (class080362 instanceof class04770) {
            class065843 = (class04770)class080362;
            if (!class05018.B((String)this.l) && !this.j.method_5438(0).d().getString().equals(this.l)) {
                class065843.method_31273().N(this.l);
            }
        }
        this.j.method_5447(0, class06584.E);
        this.i.N_53((class072992, class072092) -> {
            class00500 class005002 = class072992.method_8320(class072092);
            if (!class080362.method_56992() && class005002.N(class01210.V) && class080362.method_59922().z() < 0.12f) {
                class00500 class005003 = class07804.Z((class00500)class005002);
                if (class005003 == null) {
                    class072992.method_8650(class072092, false);
                    class072992.N(1029, class072092, 0);
                } else {
                    class072992.method_8652(class072092, class005003, 2);
                    class072992.N(1030, class072092, 0);
                }
            } else {
                class072992.N(1030, class072092, 0);
            }
        });
    }

    public int W() {
        return this.d.y();
    }
}

