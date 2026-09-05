/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00783
 *  minecraft.class00869
 *  minecraft.class01763
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class04604
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07955
 *  net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00783;
import minecraft.class00869;
import minecraft.class01763;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class04604;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07955;
import net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache;
import org.jspecify.annotations.Nullable;

public class class04525
extends class07955 {
    private final Long2ObjectMap<class04425> N = new Long2ObjectOpenHashMap();
    private static final float W = 1.0f;
    private static final float m = 1.1f;
    private static final int P = 10;

    private boolean L(@Nullable class01763 class017632) {
        return class017632 != null && !class017632.Z;
    }

    private boolean y(@Nullable class01763 class017632) {
        return class017632 != null && class017632.U >= 0.0f;
    }

    protected @Nullable class01763 y(int n, int n2, int n3) {
        class01763 class017632 = null;
        class04425 class044252 = this.N(n, n2, n3);
        float f = this.u.N(class044252);
        if (f >= 0.0f) {
            class017632 = this.L(n, n2, n3);
            class017632.E = class044252;
            class017632.U = Math.max(class017632.U, f);
            if (class044252 == class04425.field_12) {
                class017632.U += 1.0f;
            }
        }
        return class017632;
    }

    private class04425 y(class02682 class026822, int n, int n2, int n3, class04425 class044252) {
        return PathNodeCache.getNodeTypeFromNeighbors((class02682)class026822, (int)n, (int)n2, (int)n3, (class04425)class044252);
    }

    protected boolean y(class07209 class072092) {
        class04425 class044252 = this.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
        return this.u.N(class044252) >= 0.0f;
    }

    public class01763 y() {
        class07209 class072092;
        int n;
        if (this.R() && this.u.method_5799()) {
            n = this.u.method_31478();
            class072092 = new class07218(this.u.method_23317(), (double)n, this.u.method_23321());
            class00500 class005002 = this.L.N(class072092);
            while (class005002.N(class00869.K)) {
                class072092.N(this.u.method_23317(), (double)(++n), this.u.method_23321());
                class005002 = this.L.N(class072092);
            }
        } else {
            n = class04995.N((double)(this.u.method_23318() + 0.5));
        }
        if (!this.y(class072092 = class07209.method_49637((double)this.u.method_23317(), (double)n, (double)this.u.method_23321()))) {
            for (class07209 class072093 : this.N(this.u)) {
                if (!this.y(class072093)) continue;
                return super.N(class072093);
            }
        }
        return super.N(class072092);
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3) {
        class04425 class044252 = class026822.N(n, n2, n3);
        if (class044252 == class04425.field_7 && n2 >= class026822.N().method_31607() + 1) {
            class07209 class072092 = new class07209(n, n2 - 1, n3);
            class04425 class044253 = class026822.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
            if (class044253 == class04425.field_3 || class044253 == class04425.field_14) {
                class044252 = class04425.field_3;
            } else if (class044253 == class04425.field_17) {
                class044252 = class04425.field_17;
            } else if (class044253 == class04425.field_21516) {
                class044252 = class04425.field_21516;
            } else if (class044253 == class04425.field_10) {
                if (!class072092.equals((Object)class026822.y())) {
                    class044252 = class04425.field_10;
                }
            } else {
                class04425 class044254 = class044252 = class044253 == class04425.field_12 || class044253 == class04425.field_7 || class044253 == class04425.field_18 ? class04425.field_7 : class04425.field_12;
            }
        }
        if (class044252 == class04425.field_12 || class044252 == class04425.field_7) {
            class04425 class044255 = class044252;
            int n4 = n3;
            int n5 = n2;
            int n6 = n;
            class02682 class026823 = class026822;
            class044252 = this.y(class026823, n6, n5, n4, class044255);
        }
        return class044252;
    }

    private Iterable<class07209> N(class07079 class070792) {
        class00734 class007342 = class070792.method_5829();
        if (!(class007342.N() < 1.0)) {
            return List.of(class07209.method_49637((double)class007342.N, (double)class070792.method_31478(), (double)class007342.L), class07209.method_49637((double)class007342.N, (double)class070792.method_31478(), (double)class007342.R), class07209.method_49637((double)class007342.u, (double)class070792.method_31478(), (double)class007342.L), class07209.method_49637((double)class007342.u, (double)class070792.method_31478(), (double)class007342.R));
        }
        double d = Math.max(0.0, (double)1.1f - class007342.u());
        double d2 = Math.max(0.0, (double)1.1f - class007342.y());
        double d3 = Math.max(0.0, (double)1.1f - class007342.L());
        class00734 class007343 = class007342.L(d2, d3, d);
        return class07209.method_27156((class06069)class070792.method_59922(), (int)10, (int)class04995.N((double)class007343.N), (int)class04995.N((double)class007343.y), (int)class04995.N((double)class007343.L), (int)class04995.N((double)class007343.u), (int)class04995.N((double)class007343.i), (int)class04995.N((double)class007343.R));
    }

    public void N(class00783 class007832, class07079 class070792) {
        super.N(class007832, class070792);
        this.N.clear();
        class070792.X();
    }

    public class04604 N(double d, double d2, double d3) {
        return this.y(d, d2, d3);
    }

    public int N(class01763[] class01763Array, class01763 class017632) {
        class01763 class017633;
        class01763 class017634;
        class01763 class017635;
        class01763 class017636;
        class01763 class017637;
        class01763 class017638;
        class01763 class017639;
        class01763 class0176310;
        class01763 class0176311;
        class01763 class0176312;
        class01763 class0176313;
        class01763 class0176314;
        class01763 class0176315;
        class01763 class0176316;
        class01763 class0176317;
        class01763 class0176318;
        class01763 class0176319;
        class01763 class0176320;
        class01763 class0176321;
        class01763 class0176322;
        class01763 class0176323;
        class01763 class0176324;
        class01763 class0176325;
        class01763 class0176326;
        class01763 class0176327;
        int n = 0;
        class01763 class0176328 = this.y(class017632.N, class017632.y, class017632.L + 1);
        if (this.L(class0176328)) {
            class01763Array[n++] = class0176328;
        }
        if (this.L(class0176327 = this.y(class017632.N - 1, class017632.y, class017632.L))) {
            class01763Array[n++] = class0176327;
        }
        if (this.L(class0176326 = this.y(class017632.N + 1, class017632.y, class017632.L))) {
            class01763Array[n++] = class0176326;
        }
        if (this.L(class0176325 = this.y(class017632.N, class017632.y, class017632.L - 1))) {
            class01763Array[n++] = class0176325;
        }
        if (this.L(class0176324 = this.y(class017632.N, class017632.y + 1, class017632.L))) {
            class01763Array[n++] = class0176324;
        }
        if (this.L(class0176323 = this.y(class017632.N, class017632.y - 1, class017632.L))) {
            class01763Array[n++] = class0176323;
        }
        if (this.L(class0176322 = this.y(class017632.N, class017632.y + 1, class017632.L + 1)) && this.y(class0176328) && this.y(class0176324)) {
            class01763Array[n++] = class0176322;
        }
        if (this.L(class0176321 = this.y(class017632.N - 1, class017632.y + 1, class017632.L)) && this.y(class0176327) && this.y(class0176324)) {
            class01763Array[n++] = class0176321;
        }
        if (this.L(class0176320 = this.y(class017632.N + 1, class017632.y + 1, class017632.L)) && this.y(class0176326) && this.y(class0176324)) {
            class01763Array[n++] = class0176320;
        }
        if (this.L(class0176319 = this.y(class017632.N, class017632.y + 1, class017632.L - 1)) && this.y(class0176325) && this.y(class0176324)) {
            class01763Array[n++] = class0176319;
        }
        if (this.L(class0176318 = this.y(class017632.N, class017632.y - 1, class017632.L + 1)) && this.y(class0176328) && this.y(class0176323)) {
            class01763Array[n++] = class0176318;
        }
        if (this.L(class0176317 = this.y(class017632.N - 1, class017632.y - 1, class017632.L)) && this.y(class0176327) && this.y(class0176323)) {
            class01763Array[n++] = class0176317;
        }
        if (this.L(class0176316 = this.y(class017632.N + 1, class017632.y - 1, class017632.L)) && this.y(class0176326) && this.y(class0176323)) {
            class01763Array[n++] = class0176316;
        }
        if (this.L(class0176315 = this.y(class017632.N, class017632.y - 1, class017632.L - 1)) && this.y(class0176325) && this.y(class0176323)) {
            class01763Array[n++] = class0176315;
        }
        if (this.L(class0176314 = this.y(class017632.N + 1, class017632.y, class017632.L - 1)) && this.y(class0176325) && this.y(class0176326)) {
            class01763Array[n++] = class0176314;
        }
        if (this.L(class0176313 = this.y(class017632.N + 1, class017632.y, class017632.L + 1)) && this.y(class0176328) && this.y(class0176326)) {
            class01763Array[n++] = class0176313;
        }
        if (this.L(class0176312 = this.y(class017632.N - 1, class017632.y, class017632.L - 1)) && this.y(class0176325) && this.y(class0176327)) {
            class01763Array[n++] = class0176312;
        }
        if (this.L(class0176311 = this.y(class017632.N - 1, class017632.y, class017632.L + 1)) && this.y(class0176328) && this.y(class0176327)) {
            class01763Array[n++] = class0176311;
        }
        if (this.L(class0176310 = this.y(class017632.N + 1, class017632.y + 1, class017632.L - 1)) && this.y(class0176314) && this.y(class0176325) && this.y(class0176326) && this.y(class0176324) && this.y(class0176319) && this.y(class0176320)) {
            class01763Array[n++] = class0176310;
        }
        if (this.L(class017639 = this.y(class017632.N + 1, class017632.y + 1, class017632.L + 1)) && this.y(class0176313) && this.y(class0176328) && this.y(class0176326) && this.y(class0176324) && this.y(class0176322) && this.y(class0176320)) {
            class01763Array[n++] = class017639;
        }
        if (this.L(class017638 = this.y(class017632.N - 1, class017632.y + 1, class017632.L - 1)) && this.y(class0176312) && this.y(class0176325) && this.y(class0176327) && this.y(class0176324) && this.y(class0176319) && this.y(class0176321)) {
            class01763Array[n++] = class017638;
        }
        if (this.L(class017637 = this.y(class017632.N - 1, class017632.y + 1, class017632.L + 1)) && this.y(class0176311) && this.y(class0176328) && this.y(class0176327) && this.y(class0176324) && this.y(class0176322) && this.y(class0176321)) {
            class01763Array[n++] = class017637;
        }
        if (this.L(class017636 = this.y(class017632.N + 1, class017632.y - 1, class017632.L - 1)) && this.y(class0176314) && this.y(class0176325) && this.y(class0176326) && this.y(class0176323) && this.y(class0176315) && this.y(class0176316)) {
            class01763Array[n++] = class017636;
        }
        if (this.L(class017635 = this.y(class017632.N + 1, class017632.y - 1, class017632.L + 1)) && this.y(class0176313) && this.y(class0176328) && this.y(class0176326) && this.y(class0176323) && this.y(class0176318) && this.y(class0176316)) {
            class01763Array[n++] = class017635;
        }
        if (this.L(class017634 = this.y(class017632.N - 1, class017632.y - 1, class017632.L - 1)) && this.y(class0176312) && this.y(class0176325) && this.y(class0176327) && this.y(class0176323) && this.y(class0176315) && this.y(class0176317)) {
            class01763Array[n++] = class017634;
        }
        if (this.L(class017633 = this.y(class017632.N - 1, class017632.y - 1, class017632.L + 1)) && this.y(class0176311) && this.y(class0176328) && this.y(class0176327) && this.y(class0176323) && this.y(class0176318) && this.y(class0176317)) {
            class01763Array[n++] = class017633;
        }
        return n;
    }

    public void N() {
        this.u.a();
        this.N.clear();
        super.N();
    }

    protected class04425 N(int n, int n2, int n3) {
        return (class04425)this.N.computeIfAbsent(class07209.method_10064((int)n, (int)n2, (int)n3), l -> this.N(this.L, n, n2, n3, this.u));
    }
}

