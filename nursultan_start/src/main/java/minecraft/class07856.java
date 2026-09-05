/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Range
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00549
 *  minecraft.class00570
 *  minecraft.class00676
 *  minecraft.class00690
 *  minecraft.class00702
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01058
 *  minecraft.class01076
 *  minecraft.class01624
 *  minecraft.class03155
 *  minecraft.class03238
 *  minecraft.class04227
 *  minecraft.class04763
 *  minecraft.class04770
 *  minecraft.class04774
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06386
 *  minecraft.class06403
 *  minecraft.class06646
 *  minecraft.class06649
 *  minecraft.class06650
 *  minecraft.class06653
 *  minecraft.class06684
 *  minecraft.class06685
 *  minecraft.class06702
 *  minecraft.class06912
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07279
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockPatternExtended
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00549;
import minecraft.class00570;
import minecraft.class00676;
import minecraft.class00690;
import minecraft.class00702;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01058;
import minecraft.class01076;
import minecraft.class01624;
import minecraft.class03155;
import minecraft.class03238;
import minecraft.class04227;
import minecraft.class04763;
import minecraft.class04770;
import minecraft.class04774;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06386;
import minecraft.class06403;
import minecraft.class06646;
import minecraft.class06649;
import minecraft.class06650;
import minecraft.class06653;
import minecraft.class06684;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class06912;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07279;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class07826;
import minecraft.class07830;
import minecraft.class07855;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockPatternExtended;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07856 {
    private static final Logger u = LogUtils.getLogger();
    private static final int i = 1200;
    private static final int R = 100;
    public static final int N = 20;
    private static final int M = 8;
    public static final int y = 9;
    private static final int B = 20;
    private static final int Z = 96;
    public static final int L = 128;
    private final Predicate<class07049> z;
    private final class04774 U = (class04774)new class04774((class00392)class00392.L((String)"entity.minecraft.ender_dragon"), class06685.field_5788, class06702.field_5795).y(true).L(true);
    private final class04782 E;
    private final class07209 W;
    private final ObjectArrayList<Integer> m = new ObjectArrayList();
    private final class06649 P;
    private int s;
    private int T;
    private int b;
    private int j = 21;
    private boolean v;
    private boolean n;
    private boolean t = false;
    private @Nullable UUID G;
    private boolean l = true;
    private @Nullable class07209 d;
    private @Nullable class07855 w;
    private int k;
    private @Nullable List<class00676> Y;

    public void L() {
        this.U.u(!this.v);
        if (++this.j >= 20) {
            this.P();
            this.j = 0;
        }
        if (!this.U.s().isEmpty()) {
            this.E.method_14178().y(class01624.Z, new class07321(0, 0), 9);
            boolean bl = this.m();
            if (this.l && bl) {
                this.z();
                this.l = false;
            }
            if (this.w != null) {
                if (this.Y == null && bl) {
                    this.w = null;
                    this.M();
                }
                this.w.N(this.E, this, this.Y, this.k++, this.d);
            }
            if (!this.v) {
                if ((this.G == null || ++this.s >= 1200) && bl) {
                    this.U();
                    this.s = 0;
                }
                if (++this.b >= 100 && bl) {
                    this.s();
                    this.b = 0;
                }
            }
        } else {
            this.E.method_14178().L(class01624.Z, new class07321(0, 0), 9);
        }
    }

    public void M() {
        if (this.v && this.w == null) {
            ArrayList arrayList;
            class07209 class072092 = this.d;
            if (class072092 == null) {
                u.debug("Tried to respawn, but need to find the portal first.");
                arrayList = this.W();
                if (arrayList == null) {
                    u.debug("Couldn't find a portal, so we made one.");
                    this.N(true);
                } else {
                    u.debug("Found the exit portal & saved its location for next time.");
                }
                class072092 = this.d;
            }
            arrayList = Lists.newArrayList();
            class07209 class072093 = class072092.method_10086(1);
            for (class07211 class072112 : class07221.field_11062) {
                List var6 = this.E.N(class00676.class, new class00734(class072093.method_10079(class072112, 2)));
                if (var6.isEmpty()) {
                    return;
                }
                arrayList.addAll(var6);
            }
            u.debug("Found all crystals, respawning dragon.");
            this.N(arrayList);
        }
    }

    private void P() {
        HashSet hashSet = Sets.newHashSet();
        for (Object object : this.E.method_18766(this.z)) {
            this.U.N((class04770)object);
            hashSet.add(object);
        }
        HashSet hashSet2 = Sets.newHashSet((Iterable)this.U.s());
        hashSet2.removeAll(hashSet);
        for (class04770 class047702 : hashSet2) {
            this.U.y(class047702);
        }
    }

    private void T() {
        if (this.m.isEmpty()) {
            return;
        }
        int n = (Integer)this.m.remove(this.m.size() - 1);
        int n2 = class04995.N((double)(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)n))));
        int n3 = class04995.N((double)(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)n))));
        this.N(new class07209(n2, 75, n3));
    }

    public class07856(class04782 class047822, long l, class07826 class078262) {
        this(class047822, l, class078262, class07209.field_10980);
    }

    public class07856(class04782 class047822, long l, class07826 class078262, class07209 class072092) {
        this.E = class047822;
        this.W = class072092;
        this.z = class07042.N.and(class07042.N((double)class072092.method_10263(), (double)(128 + class072092.method_10264()), (double)class072092.method_10260(), (double)192.0));
        this.l = class078262.N();
        this.G = class078262.i().orElse(null);
        this.v = class078262.y();
        this.n = class078262.L();
        if (class078262.u()) {
            this.w = class07855.field_13097;
        }
        this.d = class078262.R().orElse(null);
        this.m.addAll((Collection)class078262.M().orElseGet(() -> {
            ObjectArrayList objectArrayList = new ObjectArrayList((Collection)ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(20)), (DiscreteDomain)DiscreteDomain.integers()));
            class07536.L((List)objectArrayList, (class06069)class06069.y((long)l));
            return objectArrayList;
        }));
        this.P = class06684.N().N(new String[]{"       ", "       ", "       ", "   #   ", "       ", "       ", "       "}).N(new String[]{"       ", "       ", "       ", "   #   ", "       ", "       ", "       "}).N(new String[]{"       ", "       ", "       ", "   #   ", "       ", "       ", "       "}).N(new String[]{"  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  "}).N(new String[]{"       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       "}).N('#', class06646.N((Predicate)class06650.N((class00891)class00869.q))).y();
        this.N(class047822, l, class078262, class072092, null);
    }

    public void B() {
        for (class01076 class010762 : class01058.N((class05974)this.E)) {
            for (class00676 class006762 : this.E.N(class00676.class, class010762.R())) {
                class006762.method_5684(false);
                class006762.N(null);
            }
        }
    }

    public @Nullable UUID Z() {
        return this.G;
    }

    public int i() {
        return this.T;
    }

    private @Nullable class00690 b() {
        this.E.method_8500(new class07209(this.W.method_10263(), 128 + this.W.method_10264(), this.W.method_10260()));
        class00690 class006902 = (class00690)class07078.f.N((class07299)this.E, class06113.field_16467);
        if (class006902 != null) {
            class006902.N(this);
            class006902.N(this.W);
            class006902.W().N(class00702.N);
            class006902.method_5808((double)this.W.method_10263(), (double)(128 + this.W.method_10264()), (double)this.W.method_10260(), this.E.field_9229.z() * 360.0f, 0.0f);
            this.E.method_8649((class07049)class006902);
            this.G = class006902.method_5667();
        }
        return class006902;
    }

    private void s() {
        this.b = 0;
        this.T = 0;
        for (class01076 class010762 : class01058.N((class05974)this.E)) {
            this.T += this.E.N(class00676.class, class010762.R()).size();
        }
        u.debug("Found {} end crystals still alive", (Object)this.T);
    }

    private boolean m() {
        if (this.t) {
            return true;
        }
        class07321 class073212 = new class07321(this.W);
        for (int i = -8 + class073212.B; i <= 8 + class073212.B; ++i) {
            for (int j = 8 + class073212.Z; j <= 8 + class073212.Z; ++j) {
                class08050 class080502 = this.E.method_8402(i, j, class00549.m, false);
                if (!(class080502 instanceof class00570)) {
                    return false;
                }
                if (((class00570)class080502).g().N(class04763.field_44856)) continue;
                return false;
            }
        }
        return true;
    }

    private void U() {
        List var1 = this.E.method_18776();
        if (var1.isEmpty()) {
            u.debug("Haven't seen the dragon, respawning it");
            this.b();
        } else {
            u.debug("Haven't seen our dragon, but found another one to use.");
            this.G = ((class00690)var1.get(0)).method_5667();
        }
    }

    private void z() {
        u.info("Scanning for legacy world dragon fight...");
        boolean bl = this.E();
        if (bl) {
            u.info("Found that the dragon has been killed in this world already.");
            this.n = true;
        } else {
            u.info("Found that the dragon has not yet been killed in this world.");
            this.n = false;
            if (this.W() == null) {
                this.N(false);
            }
        }
        List var2 = this.E.method_18776();
        if (var2.isEmpty()) {
            this.v = true;
        } else {
            class00690 class006902 = (class00690)var2.get(0);
            this.G = class006902.method_5667();
            u.info("Found that there's a dragon still alive ({})", (Object)class006902);
            this.v = false;
            if (!bl) {
                u.info("But we didn't have a portal, let's remove it.");
                class006902.method_31472();
                this.G = null;
            }
        }
        if (!this.n && this.v) {
            this.v = false;
        }
    }

    @Deprecated
    public void u() {
        this.m.clear();
    }

    public void y(class00690 class006902) {
        if (class006902.method_5667().equals(this.G)) {
            this.U.N(class006902.method_6032() / class006902.method_6063());
            this.s = 0;
            if (class006902.method_16914()) {
                this.U.N(class006902.method_5476());
            }
        }
    }

    public class07826 y() {
        return new class07826(this.l, this.v, this.n, false, Optional.ofNullable(this.G), Optional.ofNullable(this.d), Optional.of(this.m));
    }

    private boolean E() {
        for (int i = -8; i <= 8; ++i) {
            for (int j = -8; j <= 8; ++j) {
                Iterator var4 = this.E.method_8497(i, j).o().values().iterator();
                while (var4.hasNext()) {
                    if (!((class00394)var4.next() instanceof class07279)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private void N(class04782 class047822, long l, class07826 class078262, class07209 class072092, CallbackInfo callbackInfo) {
        ((BlockPatternExtended)this.P).lithium$setRequiredBlock(class00869.q, 41);
    }

    private void N(List<class00676> list) {
        if (this.v && this.w == null) {
            class06653 class066532 = this.W();
            while (class066532 != null) {
                for (int i = 0; i < this.P.L(); ++i) {
                    for (int j = 0; j < this.P.y(); ++j) {
                        for (int k = 0; k < this.P.N(); ++k) {
                            class06646 class066462 = class066532.N(i, j, k);
                            if (!class066462.N().N(class00869.q) && !class066462.N().N(class00869.MW)) continue;
                            this.E.method_8501(class066462.u(), class00869.MP.W());
                        }
                    }
                }
                class066532 = this.W();
            }
            this.w = class07855.field_13097;
            this.k = 0;
            this.N(false);
            this.Y = list;
        }
    }

    protected void N(class07855 class078552) {
        if (this.w == null) {
            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
        }
        this.k = 0;
        if (class078552 == class07855.field_13099) {
            this.w = null;
            this.v = false;
            class00690 class006902 = this.b();
            if (class006902 != null) {
                for (class04770 class047702 : this.U.s()) {
                    class06912.P.N(class047702, (class07049)class006902);
                }
            }
        } else {
            this.w = class078552;
        }
    }

    @Deprecated
    public void N() {
        this.t = true;
    }

    private void N(class07209 class072092) {
        this.E.N(3000, class072092, 0);
        this.E.method_30349().method_46759(class04227.Nh).flatMap(class007512 -> class007512.N(class03155.u)).ifPresent(class035292 -> ((class03238)class035292.N()).N((class05974)this.E, this.E.method_14178().U(), class06069.u(), class072092));
    }

    private void N(boolean bl) {
        class06403 class064032 = new class06403(bl);
        if (this.d == null) {
            this.d = this.E.N(class07830.field_13203, class06403.N((class07209)this.W)).method_10074();
            while (this.E.method_8320(this.d).N(class00869.q) && this.d.method_10264() > 63) {
                this.d = this.d.method_10074();
            }
            this.d = this.d.method_33096(Math.max(this.E.method_31607() + 1, this.d.method_10264()));
        }
        if (class064032.N((class06386)class06386.R, (class05974)this.E, this.E.method_14178().U(), class06069.u(), this.d)) {
            int n = class04995.R((int)4, (int)16);
            this.E.method_14178().L.N(new class07321(this.d), n);
        }
    }

    public void N(class00676 class006762, class07072 class070722) {
        if (this.w != null && this.Y.contains(class006762)) {
            u.debug("Aborting respawn sequence");
            this.w = null;
            this.k = 0;
            this.B();
            this.N(true);
        } else {
            this.s();
            class07049 class070492 = this.E.method_66347(this.G);
            if (class070492 instanceof class00690) {
                ((class00690)class070492).N(this.E, class006762, class006762.method_24515(), class070722);
            }
        }
    }

    public void N(class00690 class006902) {
        if (class006902.method_5667().equals(this.G)) {
            this.U.N(0.0f);
            this.U.u(false);
            this.N(true);
            this.T();
            if (!this.n) {
                this.E.method_8501(this.E.N(class07830.field_13197, class06403.N((class07209)this.W)), class00869.Ms.W());
            }
            this.n = true;
            this.v = true;
        }
    }

    private @Nullable class06653 W() {
        int n;
        class07321 class073212 = new class07321(this.W);
        for (int i = -8 + class073212.B; i <= 8 + class073212.B; ++i) {
            for (n = -8 + class073212.Z; n <= 8 + class073212.Z; ++n) {
                class00570 class005702 = this.E.method_8497(i, n);
                for (class00394 class003942 : class005702.o().values()) {
                    class06653 class066532;
                    if (!(class003942 instanceof class07279) || (class066532 = this.P.N((class05487)this.E, class003942.d())) == null) continue;
                    class07209 class072092 = class066532.N(3, 3, 3).u();
                    if (this.d == null) {
                        this.d = class072092;
                    }
                    return class066532;
                }
            }
        }
        class07209 class072093 = class06403.N((class07209)this.W);
        for (int i = n = this.E.N(class07830.field_13197, class072093).method_10264(); i >= this.E.method_31607(); --i) {
            class06653 class066533 = this.P.N((class05487)this.E, new class07209(class072093.method_10263(), i, class072093.method_10260()));
            if (class066533 == null) continue;
            if (this.d == null) {
                this.d = class066533.N(3, 3, 3).u();
            }
            return class066533;
        }
        return null;
    }

    public boolean R() {
        return this.n;
    }
}

