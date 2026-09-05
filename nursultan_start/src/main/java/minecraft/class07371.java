/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  minecraft.class00500
 *  minecraft.class00515
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00753
 *  minecraft.class00758
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class04206
 *  minecraft.class04306
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class05474
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07709
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrays;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00515;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00753;
import minecraft.class00758;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class04206;
import minecraft.class04306;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class05474;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07347;
import minecraft.class07348;
import minecraft.class07355;
import minecraft.class07709;
import org.slf4j.Logger;

public class class07371 {
    private static final Logger u = LogUtils.getLogger();
    public static final class07371 N = new class07371((class05474)class00515.field_12294);
    private static final String i = "Indices";
    private static final class00758[] R = class00758.values();
    private static final Codec<List<class04306<class00891>>> M = class04306.N((Codec)class04206.i.T().orElse((Object)class00869.N)).listOf();
    private static final Codec<List<class04306<class04651>>> B = class04306.N((Codec)class04206.L.T().orElse((Object)class04684.N)).listOf();
    private final EnumSet<class00758> Z = EnumSet.noneOf(class00758.class);
    private final List<class04306<class00891>> z = Lists.newArrayList();
    private final List<class04306<class04651>> U = Lists.newArrayList();
    private final int[][] E;
    static final Map<class00891, class07347> y = new IdentityHashMap<class00891, class07347>();
    static final Set<class07347> L = Sets.newHashSet();

    public class07371 L() {
        if (this == N) {
            return N;
        }
        return new class07371(this);
    }

    private class07371(class07371 class073712) {
        this.Z.addAll(class073712.Z);
        this.z.addAll(class073712.z);
        this.U.addAll(class073712.U);
        this.E = new int[class073712.E.length][];
        for (int i = 0; i < class073712.E.length; ++i) {
            int[] nArray = class073712.E[i];
            this.E[i] = nArray != null ? IntArrays.copy((int[])nArray) : null;
        }
    }

    public class07371(class07001 class070013, class05474 class054742) {
        this(class054742);
        class070013.W(i).ifPresent(class070012 -> {
            for (int i = 0; i < this.E.length; ++i) {
                this.E[i] = class070012.U(String.valueOf(i)).orElse(null);
            }
        });
        int n = class070013.y("Sides", 0);
        for (class00758 class007582 : class00758.values()) {
            if ((n & 1 << class007582.ordinal()) == 0) continue;
            this.Z.add(class007582);
        }
        class070013.N_15("neighbor_block_ticks", M).ifPresent(this.z::addAll);
        class070013.N_15("neighbor_fluid_ticks", B).ifPresent(this.U::addAll);
    }

    private class07371(class05474 class054742) {
        this.E = new int[class054742.method_32890()][];
    }

    private void y(class00570 class005702) {
        int n;
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        class07321 class073212 = class005702.R();
        class07299 class072992 = class005702.J();
        for (n = 0; n < this.E.length; ++n) {
            class00554 class005542 = class005702.y(n);
            int[] nArray = this.E[n];
            this.E[n] = null;
            if (nArray == null || nArray.length <= 0) continue;
            class07211[] class07211Array = class07211.values();
            class07348 var10 = class005542.B();
            int n2 = class01296.L((int)class005702.method_31604(n));
            for (int n3 : nArray) {
                class00500 class005002;
                int n4 = n3 & 0xF;
                int n5 = n3 >> 8 & 0xF;
                int n6 = n3 >> 4 & 0xF;
                class072182.N(class073212.i() + n4, n2 + n5, class073212.R() + n6);
                class00500 class005003 = class005002 = (class00500)var10.N(n3);
                for (class07211 class072112 : class07211Array) {
                    class072183.N((class00753)class072182, class072112);
                    if (class01296.N((int)class072182.method_10263()) != class073212.B || class01296.N((int)class072182.method_10260()) != class073212.Z) continue;
                    class005003 = class07371.N(class005003, class072112, (class07284)class072992, (class07209)class072182, (class07209)class072183);
                }
                class00891.N((class00500)class005002, (class00500)class005003, (class07284)class072992, (class07209)class072182, (int)18);
            }
        }
        for (n = 0; n < this.E.length; ++n) {
            if (this.E[n] != null) {
                u.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{class072992.method_31604(n), class073212.B, class073212.Z});
            }
            this.E[n] = null;
        }
    }

    public class07001 y() {
        int n;
        class07001 class070012 = new class07001();
        class07001 class070013 = new class07001();
        for (n = 0; n < this.E.length; ++n) {
            String string = String.valueOf(n);
            if (this.E[n] == null || this.E[n].length == 0) continue;
            class070013.N(string, this.E[n]);
        }
        if (!class070013.z()) {
            class070012.N(i, (class07709)class070013);
        }
        n = 0;
        for (class00758 class007582 : this.Z) {
            n |= 1 << class007582.ordinal();
        }
        class070012.N("Sides", (byte)n);
        if (!this.z.isEmpty()) {
            class070012.N("neighbor_block_ticks", M, this.z);
        }
        if (!this.U.isEmpty()) {
            class070012.N("neighbor_fluid_ticks", B, this.U);
        }
        return class070012;
    }

    public boolean N() {
        int[][] nArray = this.E;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == null) continue;
            return false;
        }
        return this.Z.isEmpty();
    }

    private static class00500 N(class00500 class005002, class07211 class072112, class07284 class072842, class07209 class072092, class07209 class072093) {
        return y.getOrDefault(class005002.i(), class07355.field_12962).N(class005002, class072112, class072842.method_8320(class072093), class072842, class072092, class072093);
    }

    private static void N(class00570 class005702, class00758 class007582) {
        class07299 class072992 = class005702.J();
        if (!class005702.b().Z.remove(class007582)) {
            return;
        }
        Set var3 = class007582.N();
        boolean bl = false;
        int n = 15;
        boolean bl2 = var3.contains(class07211.field_11034);
        boolean bl3 = var3.contains(class07211.field_11039);
        boolean bl4 = var3.contains(class07211.field_11035);
        boolean bl5 = var3.contains(class07211.field_11043);
        boolean bl6 = var3.size() == 1;
        class07321 class073212 = class005702.R();
        int n2 = class073212.i() + (bl6 && (bl5 || bl4) ? 1 : (bl3 ? 0 : 15));
        int n3 = class073212.i() + (bl6 && (bl5 || bl4) ? 14 : (bl3 ? 0 : 15));
        int n4 = class073212.R() + (bl6 && (bl2 || bl3) ? 1 : (bl5 ? 0 : 15));
        int n5 = class073212.R() + (bl6 && (bl2 || bl3) ? 14 : (bl5 ? 0 : 15));
        class07211[] class07211Array = class07211.values();
        class07218 class072182 = new class07218();
        for (class07209 class072092 : class07209.method_10094((int)n2, (int)class072992.method_31607(), (int)n4, (int)n3, (int)class072992.method_31600(), (int)n5)) {
            class00500 class005002;
            class00500 class005003 = class005002 = class072992.method_8320(class072092);
            for (class07211 class072112 : class07211Array) {
                class072182.N((class00753)class072092, class072112);
                class005003 = class07371.N(class005003, class072112, (class07284)class072992, class072092, (class07209)class072182);
            }
            class00891.N((class00500)class005002, (class00500)class005003, (class07284)class072992, (class07209)class072092, (int)18);
        }
    }

    public void N(class00570 class005702) {
        this.y(class005702);
        for (class00758 class007582 : R) {
            class07371.N(class005702, class007582);
        }
        class07299 class072992 = class005702.J();
        this.z.forEach(class043062 -> {
            class00891 class008912 = class043062.N() == class00869.N ? class072992.method_8320(class043062.y()).i() : (class00891)class043062.N();
            class072992.N(class043062.y(), class008912, class043062.L(), class043062.u());
        });
        this.U.forEach(class043062 -> {
            class04651 class046512 = class043062.N() == class04684.N ? class072992.method_8316(class043062.y()).N() : (class04651)class043062.N();
            class072992.N(class043062.y(), class046512, class043062.L(), class043062.u());
        });
        L.forEach(class073472 -> class073472.N((class07284)class072992));
    }
}

