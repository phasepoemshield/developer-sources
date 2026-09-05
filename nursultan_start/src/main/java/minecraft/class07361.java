/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class01929
 *  minecraft.class02999
 *  minecraft.class03032
 *  minecraft.class03322
 *  minecraft.class03556
 *  minecraft.class04310
 *  minecraft.class04327
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04748
 *  minecraft.class04932
 *  minecraft.class05015
 *  minecraft.class05163
 *  minecraft.class05474
 *  minecraft.class05688
 *  minecraft.class05795
 *  minecraft.class06614
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class07841
 *  minecraft.class08050
 *  minecraft.class08094
 *  minecraft.class08303
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class01929;
import minecraft.class02999;
import minecraft.class03032;
import minecraft.class03322;
import minecraft.class03556;
import minecraft.class04310;
import minecraft.class04327;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04748;
import minecraft.class04932;
import minecraft.class05015;
import minecraft.class05163;
import minecraft.class05474;
import minecraft.class05688;
import minecraft.class05795;
import minecraft.class06614;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class07371;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class08050;
import minecraft.class08094;
import minecraft.class08303;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07361
extends class08050 {
    private static final Logger W = LogUtils.getLogger();
    private volatile @Nullable class05795 m;
    private volatile class00549 P = class00549.L;
    private final List<class07001> s = Lists.newArrayList();
    private @Nullable class03322 T;
    private @Nullable class02999 b;
    private final class05688<class00891> j;
    private final class05688<class04651> v;

    public class05474 w() {
        if (this.d()) {
            return class02999.y;
        }
        return this;
    }

    public class04327<class00891> P() {
        return this.j;
    }

    public class04310<class00891> K() {
        return class07361.N(this.j);
    }

    public class00500 method_8320(class07209 class072092) {
        int n = class072092.method_10264();
        if (this.method_31601(n)) {
            return class00869.mh.W();
        }
        class00554 class005542 = this.y(this.method_31602(n));
        if (class005542.L()) {
            return class00869.N.W();
        }
        return class005542.N(class072092.method_10263() & 0xF, n & 0xF, class072092.method_10260() & 0xF);
    }

    public class04688 method_8316(class07209 class072092) {
        int n = class072092.method_10264();
        if (this.method_31601(n)) {
            return class04684.N.M();
        }
        class00554 class005542 = this.y(this.method_31602(n));
        if (class005542.L()) {
            return class04684.N.M();
        }
        return class005542.y(class072092.method_10263() & 0xF, n & 0xF, class072092.method_10260() & 0xF);
    }

    public class07361(class07321 class073212, class07371 class073712, class05474 class054742, class06614 class066142, @Nullable class03032 class030322) {
        this(class073212, class073712, null, (class05688<class00891>)new class05688(), (class05688<class04651>)new class05688(), class054742, class066142, class030322);
    }

    public class07361(class07321 class073212, class07371 class073712, class00554 @Nullable [] class00554Array, class05688<class00891> class056882, class05688<class04651> class056883, class05474 class054742, class06614 class066142, @Nullable class03032 class030322) {
        super(class073212, class073712, class054742, class066142, 0L, class00554Array, class030322);
        this.j = class056882;
        this.v = class056883;
    }

    public Map<class07209, class00394> J() {
        return this.z;
    }

    public class04310<class04651> V() {
        return class07361.N(this.v);
    }

    public class04327<class04651> s() {
        return this.v;
    }

    public @Nullable class02999 l() {
        return this.b;
    }

    public List<class07001> o() {
        return this.s;
    }

    public class03322 g() {
        if (this.T == null) {
            this.T = new class03322(this.method_31605(), this.method_31607());
        }
        return this.T;
    }

    public Map<class07209, class07001> q() {
        return Collections.unmodifiableMap(this.Z);
    }

    public void u(class07209 class072092) {
        if (!this.method_31606(class072092)) {
            class08050.N((ShortList[])this.y, (int)this.method_31602(class072092.method_10264())).add(class07361.R(class072092));
        }
    }

    public void y(class07001 class070012) {
        this.s.add(class070012);
    }

    public class00549 E() {
        return this.P;
    }

    public void N(class03322 class033222) {
        this.T = class033222;
    }

    public void N(class07209 class072092) {
        this.z.remove(class072092);
        this.Z.remove(class072092);
    }

    public class08094 N(long l) {
        return new class08094(this.j.N(l), this.v.N(l));
    }

    private static <T> class04310<T> N(class05688<T> class056882) {
        return new class04310(class056882.y());
    }

    public void N(@Nullable class02999 class029992) {
        this.b = class029992;
    }

    public void N(class05795 class057952) {
        this.m = class057952;
    }

    public static class07209 N(short s, int n, class07321 class073212) {
        int n2 = class01296.N((int)class073212.B, (int)(s & 0xF));
        int n3 = class01296.N((int)n, (int)(s >>> 4 & 0xF));
        int n4 = class01296.N((int)class073212.Z, (int)(s >>> 8 & 0xF));
        return new class07209(n2, n3, n4);
    }

    public @Nullable class00500 N(class07209 class072092, class00500 class005002, int n) {
        EnumSet<class07830> var15;
        int n2 = class072092.method_10263();
        int n3 = class072092.method_10264();
        int n4 = class072092.method_10260();
        if (this.method_31601(n3)) {
            return class00869.mh.W();
        }
        int n5 = this.method_31602(n3);
        class00554 class005542 = this.y(n5);
        boolean bl = class005542.L();
        if (bl && class005002.N(class00869.N)) {
            return class005002;
        }
        int n6 = class01296.y((int)n2);
        int n7 = class01296.y((int)n3);
        int n8 = class01296.y((int)n4);
        class00500 class005003 = class005542.N(n6, n7, n8, class005002);
        if (this.P.N(class00549.U)) {
            boolean bl2 = class005542.L();
            if (bl2 != bl) {
                this.m.N(class072092, bl2);
            }
            if (class05015.N((class00500)class005003, (class00500)class005002)) {
                this.B.N((class07290)this, n6, n3, n8);
                this.m.N(class072092);
            }
        }
        EnumSet var14 = this.E().i();
        Object var15_16 = null;
        for (class07830 class078302 : var14) {
            if ((class07841)this.M.get(class078302) != null) continue;
            if (var15_16 == null) {
                var15 = EnumSet.noneOf(class07830.class);
            }
            var15.add(class078302);
        }
        if (var15 != null) {
            class07841.N((class08050)this, (Set)var15);
        }
        for (class07830 class078302 : var14) {
            ((class07841)this.M.get(class078302)).N(n6, n3, n8, class005002);
        }
        return class005003;
    }

    public void N(class04748 class047482, class04932 class049322) {
        if (this.l() != null && class049322.y()) {
            class05163 class051632 = class049322.N();
            class05474 class054742 = this.w();
            if (class051632.Z() < class054742.method_31607() || class051632.E() > class054742.method_31600()) {
                return;
            }
        }
        super.N(class047482, class049322);
    }

    public void N(class00549 class005492) {
        this.P = class005492;
        if (this.b != null && class005492.N(this.b.N())) {
            this.N((class02999)null);
        }
        this.Z();
    }

    public @Nullable class07001 N(class07209 class072092, class01929 class019292) {
        class00394 class003942 = this.method_8321(class072092);
        if (class003942 != null) {
            return class003942.y_2(class019292);
        }
        return (class07001)this.Z.get(class072092);
    }

    public void N(class07049 class070492) {
        if (class070492.method_5765()) {
            return;
        }
        try (class04495 class044952 = new class04495(class070492.method_71370(), W);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class070492.method_56673());
            class070492.method_5662((class08329)class083032);
            this.y(class083032.y());
        }
    }

    public void N(class00394 class003942) {
        this.Z.remove(class003942.d());
        this.z.put(class003942.d(), class003942);
    }

    public void N(ShortList shortList, int n) {
        class08050.N((ShortList[])this.y, (int)n).addAll(shortList);
    }

    public static short R(class07209 class072092) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        int n4 = n & 0xF;
        int n5 = n2 & 0xF;
        int n6 = n3 & 0xF;
        return (short)(n4 | n5 << 4 | n6 << 8);
    }

    public @Nullable class03322 O() {
        return this.T;
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return (class00394)this.z.get(class072092);
    }

    public class03556<class00780> method_16359(int n, int n2, int n3) {
        if (this.W().N(class00549.R)) {
            return super.method_16359(n, n2, n3);
        }
        throw new IllegalStateException("Asking for biomes before we have biomes");
    }
}

