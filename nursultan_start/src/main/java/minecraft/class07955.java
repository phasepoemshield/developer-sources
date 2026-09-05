/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00783
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01763
 *  minecraft.class02119
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class04604
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07131
 *  minecraft.class07185
 *  minecraft.class07188
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07322
 *  minecraft.class07760
 *  minecraft.class08092
 *  minecraft.class08791
 *  net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache
 *  net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00783;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01763;
import minecraft.class02119;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class04604;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07131;
import minecraft.class07185;
import minecraft.class07188;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07322;
import minecraft.class07760;
import minecraft.class08092;
import minecraft.class08791;
import net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07955
extends class02119 {
    public static final double y = 0.5;
    private static final double N = 1.125;
    private final Long2ObjectMap<class04425> W = new Long2ObjectOpenHashMap();
    private final Object2BooleanMap<class00734> m = new Object2BooleanOpenHashMap();
    private final class01763[] P = new class01763[class07221.field_11062.y()];

    protected boolean L() {
        return false;
    }

    protected double L(class07209 class072092) {
        class07322 class073222 = this.L.N();
        if ((this.R() || this.L()) && class073222.method_8316(class072092).N(class01231.N)) {
            return (double)class072092.method_10264() + 0.5;
        }
        return class07955.N((class07290)class073222, class072092);
    }

    private double B() {
        return Math.max(1.125, (double)this.u.method_49476());
    }

    private class01763 u(int n, int n2, int n3) {
        for (int i = n2 - 1; i >= this.u.method_73183().method_31607(); --i) {
            if (n2 - i > this.u.method_5850()) {
                return this.y(n, i, n3);
            }
            class04425 class044252 = this.N(n, i, n3);
            float f = this.u.N(class044252);
            if (class044252 == class04425.field_7) continue;
            if (f >= 0.0f) {
                return this.N(n, i, n3, class044252, f);
            }
            return this.y(n, i, n3);
        }
        return this.y(n, n2, n3);
    }

    private boolean y(class01763 class017632) {
        class00734 class007342 = this.u.method_5829();
        class06889 class068892 = new class06889((double)class017632.N - this.u.method_23317() + class007342.y() / 2.0, (double)class017632.y - this.u.method_23318() + class007342.L() / 2.0, (double)class017632.L - this.u.method_23321() + class007342.u() / 2.0);
        int n = class04995.L((double)(class068892.M() / class007342.N()));
        class068892 = class068892.L((double)(1.0f / (float)n));
        for (int i = 1; i <= n; ++i) {
            if (!this.N(class007342 = class007342.L(class068892))) continue;
            return false;
        }
        return true;
    }

    private static void y(class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, class00500 class005002) {
        class04425 class044252 = LandPathNodeTypesRegistry.getPathNodeType((class00500)class005002, (class07290)class072902, (class07209)class072092, (boolean)false);
        if (class044252 != null) {
            callbackInfoReturnable.setReturnValue((Object)class044252);
        }
    }

    private static class04425 y(class02682 class026822, int n, int n2, int n3, class04425 class044252) {
        return PathNodeCache.getNodeTypeFromNeighbors((class02682)class026822, (int)n, (int)n2, (int)n3, (class04425)class044252);
    }

    public static class04425 y(class07290 class072902, class07209 class072092) {
        class00500 class005002 = class072902.method_8320(class072092);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class07955.N(class072902, class072092, callbackInfoReturnable, class005002);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04425)callbackInfoReturnable.getReturnValue();
        }
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        class07955.y(class072902, class072092, callbackInfoReturnable2, class005002);
        if (callbackInfoReturnable2.isCancelled()) {
            return (class04425)callbackInfoReturnable2.getReturnValue();
        }
        class00891 class008912 = class005002.i();
        if (class005002.P()) {
            return class04425.field_7;
        }
        if (class005002.N(class01210.X) || class005002.N(class00869.RS) || class005002.N(class00869.nL)) {
            return class04425.field_19;
        }
        if (class005002.N(class00869.ba)) {
            return class04425.field_33534;
        }
        if (class005002.N(class00869.ij) || class005002.N(class00869.sM)) {
            return class04425.field_17;
        }
        if (class005002.N(class00869.TM)) {
            return class04425.field_21326;
        }
        if (class005002.N(class00869.Mb)) {
            return class04425.field_21516;
        }
        if (class005002.N(class00869.Lm) || class005002.N(class00869.vp)) {
            return class04425.field_43351;
        }
        class04688 class046882 = class005002.Y();
        if (class046882.N(class01231.y)) {
            return class04425.field_14;
        }
        if (class07955.N((class00500)class005002)) {
            return class04425.field_3;
        }
        if (class008912 instanceof class07196) {
            class07196 class071962 = (class07196)class008912;
            if (((Boolean)class005002.L((class08092)class07196.i)).booleanValue()) {
                return class04425.field_15;
            }
            return class071962.y().L() ? class04425.field_23 : class04425.field_8;
        }
        if (class008912 instanceof class07760) {
            return class04425.field_21;
        }
        if (class008912 instanceof class07131) {
            return class04425.field_6;
        }
        if (class005002.N(class01210.A) || class005002.N(class01210.q) || class008912 instanceof class07188 && !((Boolean)class005002.L((class08092)class07188.y)).booleanValue()) {
            return class04425.field_10;
        }
        if (!class005002.N(class08791.field_50)) {
            return class04425.field_22;
        }
        if (class046882.N(class01231.N)) {
            return class04425.field_18;
        }
        return class04425.field_7;
    }

    private class01763 y(int n, int n2, int n3) {
        class01763 class017632 = this.L(n, n2, n3);
        class017632.E = class04425.field_22;
        class017632.U = -1.0f;
        return class017632;
    }

    public Set<class04425> y(class02682 class026822, int n, int n2, int n3) {
        EnumSet<class04425> var5 = EnumSet.noneOf(class04425.class);
        for (int i = 0; i < this.R; ++i) {
            for (int j = 0; j < this.M; ++j) {
                for (int k = 0; k < this.B; ++k) {
                    int n4 = i + n;
                    int n5 = j + n2;
                    int n6 = k + n3;
                    class04425 class044252 = this.N(class026822, n4, n5, n6);
                    class07209 class072092 = this.u.method_24515();
                    boolean bl = this.u();
                    if (class044252 == class04425.field_23 && this.i() && bl) {
                        class044252 = class04425.field_26446;
                    }
                    if (class044252 == class04425.field_15 && !bl) {
                        class044252 = class04425.field_22;
                    }
                    if (class044252 == class04425.field_21 && this.N(class026822, class072092.method_10263(), class072092.method_10264(), class072092.method_10260()) != class04425.field_21 && this.N(class026822, class072092.method_10263(), class072092.method_10264() - 1, class072092.method_10260()) != class04425.field_21) {
                        class044252 = class04425.field_25418;
                    }
                    var5.add(class044252);
                }
            }
        }
        return var5;
    }

    protected boolean y(class07209 class072092) {
        class04425 class044252 = this.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
        return class044252 != class04425.field_7 && this.u.N(class044252) >= 0.0f;
    }

    public class01763 y() {
        class07209 class072092;
        class07218 class072182 = new class07218();
        int n = this.u.method_31478();
        class00500 class005002 = this.L.N((class07209)class072182.N(this.u.method_23317(), (double)n, this.u.method_23321()));
        if (this.u.method_26319(class005002.Y())) {
            while (this.u.method_26319(class005002.Y())) {
                class005002 = this.L.N((class07209)class072182.N(this.u.method_23317(), (double)(++n), this.u.method_23321()));
            }
            --n;
        } else if (this.R() && this.u.method_5799()) {
            while (class005002.N(class00869.K) || class005002.Y() == class04684.L.N(false)) {
                class005002 = this.L.N((class07209)class072182.N(this.u.method_23317(), (double)(++n), this.u.method_23321()));
            }
            --n;
        } else if (this.u.method_24828()) {
            n = class04995.N((double)(this.u.method_23318() + 0.5));
        } else {
            class072182.N(this.u.method_23317(), this.u.method_23318() + 1.0, this.u.method_23321());
            while (class072182.method_10264() > this.L.N().method_31607()) {
                n = class072182.method_10264();
                class072182.method_10099(class072182.method_10264() - 1);
                class072092 = this.L.N((class07209)class072182);
                if (class072092.P() || class072092.N(class08791.field_50)) continue;
                break;
            }
        }
        class072092 = this.u.method_24515();
        if (!this.y((class07209)class072182.N(class072092.method_10263(), n, class072092.method_10260()))) {
            class00734 class007342 = this.u.method_5829();
            if (this.y((class07209)class072182.N(class007342.N, (double)n, class007342.L)) || this.y((class07209)class072182.N(class007342.N, (double)n, class007342.R)) || this.y((class07209)class072182.N(class007342.u, (double)n, class007342.L)) || this.y((class07209)class072182.N(class007342.u, (double)n, class007342.R))) {
                return this.N((class07209)class072182);
            }
        }
        return this.N(new class07209(class072092.method_10263(), n, class072092.method_10260()));
    }

    public static class04425 N(class07079 class070792, class07209 class072092) {
        return class07955.N(new class02682((class07322)class070792.method_73183(), class070792), class072092.method_25503());
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3) {
        return class07955.N(class026822, new class07218(n, n2, n3));
    }

    public static class04425 N(class02682 class026822, class07218 class072182) {
        int n;
        int n2;
        int n3 = class072182.method_10263();
        class04425 class044252 = class026822.N(n3, n2 = class072182.method_10264(), n = class072182.method_10260());
        if (class044252 != class04425.field_7 || n2 < class026822.N().method_31607() + 1) {
            return class044252;
        }
        return switch (class026822.N(n3, n2 - 1, n)) {
            case class04425.field_7, class04425.field_18, class04425.field_14, class04425.field_12 -> class04425.field_7;
            case class04425.field_3 -> class04425.field_3;
            case class04425.field_17 -> class04425.field_17;
            case class04425.field_21326 -> class04425.field_21326;
            case class04425.field_33534 -> class04425.field_36432;
            case class04425.field_43351 -> class04425.field_43351;
            case class04425.field_19 -> class04425.field_47413;
            default -> class07955.y(class026822, n3, n2, n, class04425.field_12);
        };
    }

    protected class01763 N(class07209 class072092) {
        class01763 class017632 = this.u(class072092);
        class017632.E = this.N(class017632.N, class017632.y, class017632.L);
        class017632.U = this.u.N(class017632.E);
        return class017632;
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3, class07079 class070792) {
        Set<class04425> var6 = this.y(class026822, n, n2, n3);
        if (var6.contains(class04425.field_10)) {
            return class04425.field_10;
        }
        if (var6.contains(class04425.field_25418)) {
            return class04425.field_25418;
        }
        class04425 class044252 = class04425.field_22;
        for (class04425 class044253 : var6) {
            if (class070792.N(class044253) < 0.0f) {
                return class044253;
            }
            if (!(class070792.N(class044253) >= class070792.N(class044252))) continue;
            class044252 = class044253;
        }
        if (this.R <= 1 && class044252 != class04425.field_7 && class070792.N(class044252) == 0.0f && this.N(class026822, n, n2, n3) == class04425.field_7) {
            return class04425.field_7;
        }
        return class044252;
    }

    protected class04425 N(int n, int n2, int n3) {
        return (class04425)this.W.computeIfAbsent(class07209.method_10064((int)n, (int)n2, (int)n3), l -> this.N(this.L, n, n2, n3, this.u));
    }

    private static void N(class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, class00500 class005002) {
        class04425 class044252 = PathNodeCache.getPathNodeType((class00500)class005002);
        if (class044252 != null) {
            callbackInfoReturnable.setReturnValue((Object)class044252);
        }
    }

    private static void N(class02682 class026822, int n, int n2, int n3, class04425 class044252, CallbackInfoReturnable callbackInfoReturnable, int n4, int n5, int n6) {
        if (class044252 == null && (n4 != -1 || n5 != -1 || n6 != -1)) {
            callbackInfoReturnable.setReturnValue(null);
        }
    }

    public void N() {
        this.u.a();
        this.W.clear();
        this.m.clear();
        super.N();
    }

    public void N(class00783 class007832, class07079 class070792) {
        super.N(class007832, class070792);
        class070792.X();
    }

    public static class04425 N(class02682 class026822, int n, int n2, int n3, class04425 class044252) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    if (i == 0 && k == 0) continue;
                    CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
                    class07955.N(class026822, n, n2, n3, class044252, callbackInfoReturnable, i, j, k);
                    if (callbackInfoReturnable.isCancelled()) {
                        return (class04425)callbackInfoReturnable.getReturnValue();
                    }
                    class04425 class044253 = class026822.N(n + i, n2 + j, n3 + k);
                    if (class044253 == class04425.field_17) {
                        return class04425.field_5;
                    }
                    if (class044253 == class04425.field_3 || class044253 == class04425.field_14) {
                        return class04425.field_9;
                    }
                    if (class044253 == class04425.field_18) {
                        return class04425.field_4;
                    }
                    if (class044253 != class04425.field_43351) continue;
                    return class04425.field_43351;
                }
            }
        }
        return class044252;
    }

    public static double N(class07290 class072902, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00494 class004942 = class072902.method_8320(class072093).M(class072902, class072093);
        return (double)class072093.method_10264() + (class004942.method_1110() ? 0.0 : class004942.method_1105(class07185.field_11052));
    }

    protected boolean N(@Nullable class01763 class017632, class01763 class017633) {
        return class017632 != null && !class017632.Z && (class017632.U >= 0.0f || class017633.U < 0.0f);
    }

    protected @Nullable class01763 N(int n, int n2, int n3, int n4, double d, class07211 class072112, class04425 class044252) {
        class01763 class017632 = null;
        class07218 class072182 = new class07218();
        if (this.L((class07209)class072182.N(n, n2, n3)) - d > this.B()) {
            return null;
        }
        class04425 class044253 = this.N(n, n2, n3);
        float f = this.u.N(class044253);
        if (f >= 0.0f) {
            class017632 = this.N(n, n2, n3, class044253, f);
        }
        if (class07955.N(class044252) && class017632 != null && class017632.U >= 0.0f && !this.y(class017632)) {
            class017632 = null;
        }
        if (class044253 == class04425.field_12 || this.L() && class044253 == class04425.field_18) {
            return class017632;
        }
        if ((class017632 == null || class017632.U < 0.0f) && n4 > 0 && (class044253 != class04425.field_10 || this.M()) && class044253 != class04425.field_25418 && class044253 != class04425.field_19 && class044253 != class04425.field_33534) {
            class017632 = this.N(n, n2, n3, n4, d, class072112, class044252, class072182);
        } else if (!this.L() && class044253 == class04425.field_18 && !this.R()) {
            class017632 = this.N(n, n2, n3, class017632);
        } else if (class044253 == class04425.field_7) {
            class017632 = this.u(n, n2, n3);
        } else if (class07955.N(class044253) && class017632 == null) {
            class017632 = this.N(n, n2, n3, class044253);
        }
        return class017632;
    }

    public int N(class01763[] class01763Array, class01763 class017632) {
        class07211 class072112;
        int n = 0;
        int n2 = 0;
        class04425 class044252 = this.N(class017632.N, class017632.y + 1, class017632.L);
        class04425 class044253 = this.N(class017632.N, class017632.y, class017632.L);
        if (this.u.N(class044252) >= 0.0f && class044253 != class04425.field_21326) {
            n2 = class04995.y((float)Math.max(1.0f, this.u.method_49476()));
        }
        double d = this.L(new class07209(class017632.N, class017632.y, class017632.L));
        for (class07211 class072113 : class07221.field_11062) {
            class072112 = this.N(class017632.N + class072113.P(), class017632.y, class017632.L + class072113.T(), n2, d, class072113, class044253);
            this.P[class072113.u()] = class072112;
            if (!this.N((class01763)class072112, class017632)) continue;
            class01763Array[n++] = class072112;
        }
        for (class07211 class072113 : class07221.field_11062) {
            class01763 class017633;
            class072112 = class072113.R();
            if (!this.N(class017632, this.P[class072113.u()], this.P[class072112.u()]) || !this.N(class017633 = this.N(class017632.N + class072113.P() + class072112.P(), class017632.y, class017632.L + class072113.T() + class072112.T(), n2, d, class072113, class044253))) continue;
            class01763Array[n++] = class017633;
        }
        return n;
    }

    protected boolean N(class01763 class017632, @Nullable class01763 class017633, @Nullable class01763 class017634) {
        if (class017634 == null || class017633 == null || class017634.y > class017632.y || class017633.y > class017632.y) {
            return false;
        }
        if (class017633.E == class04425.field_26446 || class017634.E == class04425.field_26446) {
            return false;
        }
        boolean bl = class017634.E == class04425.field_10 && class017633.E == class04425.field_10 && (double)this.u.method_17681() < 0.5;
        return (class017634.y < class017632.y || class017634.U >= 0.0f || bl) && (class017633.y < class017632.y || class017633.U >= 0.0f || bl);
    }

    protected boolean N(@Nullable class01763 class017632) {
        if (class017632 == null || class017632.Z) {
            return false;
        }
        if (class017632.E == class04425.field_26446) {
            return false;
        }
        return class017632.U >= 0.0f;
    }

    private static boolean N(class04425 class044252) {
        return class044252 == class04425.field_10 || class044252 == class04425.field_23 || class044252 == class04425.field_8;
    }

    private boolean N(class00734 class007342) {
        return this.m.computeIfAbsent((Object)class007342, object -> !this.L.N().method_8587((class07049)this.u, class007342));
    }

    private @Nullable class01763 N(int n, int n2, int n3, @Nullable class01763 class017632) {
        --n2;
        while (n2 > this.u.method_73183().method_31607()) {
            class04425 class044252 = this.N(n, n2, n3);
            if (class044252 != class04425.field_18) {
                return class017632;
            }
            class017632 = this.N(n, n2, n3, class044252, this.u.N(class044252));
            --n2;
        }
        return class017632;
    }

    private @Nullable class01763 N(int n, int n2, int n3, int n4, double d, class07211 class072112, class04425 class044252, class07218 class072182) {
        class01763 class017632 = this.N(n, n2 + 1, n3, n4 - 1, d, class072112, class044252);
        if (class017632 == null) {
            return null;
        }
        if (this.u.method_17681() >= 1.0f) {
            return class017632;
        }
        if (class017632.E != class04425.field_7 && class017632.E != class04425.field_12) {
            return class017632;
        }
        double d2 = (double)(n - class072112.P()) + 0.5;
        double d3 = (double)(n3 - class072112.T()) + 0.5;
        double d4 = (double)this.u.method_17681() / 2.0;
        class00734 class007342 = new class00734(d2 - d4, this.L((class07209)class072182.N(d2, (double)(n2 + 1), d3)) + 0.001, d3 - d4, d2 + d4, (double)this.u.method_17682() + this.L((class07209)class072182.N((double)class017632.N, (double)class017632.y, (double)class017632.L)) - 0.002, d3 + d4);
        return this.N(class007342) ? null : class017632;
    }

    private class01763 N(int n, int n2, int n3, class04425 class044252) {
        class01763 class017632 = this.L(n, n2, n3);
        class017632.Z = true;
        class017632.E = class044252;
        class017632.U = class044252.N();
        return class017632;
    }

    public class04604 N(double d, double d2, double d3) {
        return this.y(d, d2, d3);
    }

    private class01763 N(int n, int n2, int n3, class04425 class044252, float f) {
        class01763 class017632 = this.L(n, n2, n3);
        class017632.E = class044252;
        class017632.U = Math.max(class017632.U, f);
        return class017632;
    }
}

