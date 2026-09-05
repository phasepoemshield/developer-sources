/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09444
 *  Nursultan.class09451
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00515
 *  minecraft.class00698
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class01929
 *  minecraft.class02055
 *  minecraft.class03136
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04688
 *  minecraft.class04853
 *  minecraft.class04884
 *  minecraft.class05163
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class06890
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07019
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07111
 *  minecraft.class07132
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07529
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07720
 *  minecraft.class07739
 *  minecraft.class07741
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08329
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09444;
import Nursultan.class09451;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00515;
import minecraft.class00698;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01203;
import minecraft.class01204;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class01929;
import minecraft.class02055;
import minecraft.class03136;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04688;
import minecraft.class04853;
import minecraft.class04884;
import minecraft.class05163;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class06890;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07019;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07111;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07529;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07720;
import minecraft.class07739;
import minecraft.class07741;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08329;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01207 {
    private static final Logger E = LogUtils.getLogger();
    public static final String N = "palette";
    public static final String y = "palettes";
    public static final String L = "entities";
    public static final String u = "blocks";
    public static final String i = "pos";
    public static final String R = "state";
    public static final String M = "nbt";
    public static final String B = "pos";
    public static final String Z = "blockPos";
    public static final String z = "nbt";
    public static final String U = "size";
    private final List<class09444> W = Lists.newArrayList();
    private final List<class09451> m = Lists.newArrayList();
    private class00753 P = class00753.field_11176;
    private String s = "?";

    public class05163 y(class01233 class012332, class07209 class072092) {
        return this.N(class072092, class012332.u(), class012332.i(), class012332.L());
    }

    public String y() {
        return this.s;
    }

    public static class04853 N(class07001 class070012, class00500 class005002) {
        return class070012.N_15("joint", (Codec)class04853.field_54790).orElseGet(() -> class01207.N(class005002));
    }

    private class07741 N(int ... nArray) {
        class07741 class077412 = new class07741();
        for (int n : nArray) {
            class077412.add((Object)class07720.N((int)n));
        }
        return class077412;
    }

    private class07741 N(double ... dArray) {
        class07741 class077412 = new class07741();
        for (double d : dArray) {
            class077412.add((Object)class07019.N((double)d));
        }
        return class077412;
    }

    public static class04853 N(class00500 class005002) {
        return class04884.U((class00500)class005002).z().L() ? class04853.field_23330 : class04853.field_23329;
    }

    private static void N(class01228 class012282, List<class01228> list, List<class01228> list2, List<class01228> list3) {
        if (class012282.L() != null) {
            list2.add(class012282);
        } else if (!class012282.y().i().m() && class012282.y().W((class07290)class00515.field_12294, class07209.field_10980)) {
            list.add(class012282);
        } else {
            list3.add(class012282);
        }
    }

    protected static class05163 N(class07209 class072092, class06993 class069932, class07209 class072093, class07111 class071112, class00753 class007532) {
        class00753 class007533 = class007532.method_34592(-1, -1, -1);
        class07209 class072094 = class01207.N(class07209.field_10980, class071112, class069932, class072093);
        class07209 class072095 = class01207.N(class07209.field_10980.method_10081(class007533), class071112, class069932, class072093);
        return class05163.N((class00753)class072094, (class00753)class072095).N((class00753)class072092);
    }

    /*
     * WARNING - void declaration
     */
    public class07001 N(class07001 class070012) {
        ArrayList arrayList;
        if (this.W.isEmpty()) {
            class070012.N(u, (class07709)new class07741());
            class070012.N(N, (class07709)new class07741());
        } else {
            Object object;
            void class077412;
            arrayList = Lists.newArrayList();
            class01204 class012042 = new class01204();
            arrayList.add(class012042);
            boolean i = true;
            while (class077412 < this.W.size()) {
                arrayList.add(new class01204());
                ++class077412;
            }
            class07741 class077413 = new class07741();
            List var5 = this.W.get(0).y();
            for (int j = 0; j < var5.size(); ++j) {
                class01228 class012282 = (class01228)var5.get(j);
                Object object2 = new class07001();
                object2.N("pos", (class07709)this.N(class012282.N().method_10263(), class012282.N().method_10264(), class012282.N().method_10260()));
                int n = class012042.N(class012282.y());
                object2.N(R, n);
                if (class012282.L() != null) {
                    object2.N("nbt", (class07709)class012282.L());
                }
                class077413.add(object2);
                for (int k = 1; k < this.W.size(); ++k) {
                    object = (class01204)arrayList.get(k);
                    ((class01204)object).N(((class01228)this.W.get(k).y().get(j)).y(), n);
                }
            }
            class070012.N(u, (class07709)class077413);
            if (arrayList.size() == 1) {
                var6_11 = new class07741();
                for (Object object2 : class012042) {
                    var6_11.add((Object)class07717.N((class00500)object2));
                }
                class070012.N(N, (class07709)var6_11);
            } else {
                var6_11 = new class07741();
                for (Object object2 : arrayList) {
                    class07741 class077414 = new class07741();
                    Iterator<class00500> var10 = ((class01204)object2).iterator();
                    while (var10.hasNext()) {
                        object = var10.next();
                        class077414.add((Object)class07717.N((class00500)object));
                    }
                    var6_11.add((Object)class077414);
                }
                class070012.N(y, (class07709)var6_11);
            }
        }
        arrayList = new class07741();
        for (class09451 class094512 : this.m) {
            class07001 class070013 = new class07001();
            class070013.N("pos", (class07709)this.N(class094512.N.M, class094512.N.B, class094512.N.Z));
            class070013.N(Z, (class07709)this.N(class094512.y.method_10263(), class094512.y.method_10264(), class094512.y.method_10260()));
            if (class094512.L != null) {
                class070013.N("nbt", (class07709)class094512.L);
            }
            arrayList.add(class070013);
        }
        class070012.N(L, (class07709)arrayList);
        class070012.N(U, (class07709)this.N(this.P.method_10263(), this.P.method_10264(), this.P.method_10260()));
        return class07717.i((class07001)class070012);
    }

    public void N(class02055<class00891> class020552, class07001 class070012) {
        this.W.clear();
        this.m.clear();
        class07741 class077412 = class070012.s(U);
        this.P = new class00753(class077412.N(0, 0), class077412.N(1, 0), class077412.N(2, 0));
        class07741 class077413 = class070012.s(u);
        Optional var5 = class070012.P(y);
        if (var5.isPresent()) {
            for (int i = 0; i < ((class07741)var5.get()).size(); ++i) {
                this.N(class020552, ((class07741)var5.get()).R(i), class077413);
            }
        } else {
            this.N(class020552, class070012.s(N), class077413);
        }
        class070012.s(L).z().forEach(class070013 -> {
            class07741 class077412 = class070013.s("pos");
            class06889 class068892 = new class06889(class077412.N(0, 0.0), class077412.N(1, 0.0), class077412.N(2, 0.0));
            class07741 class077413 = class070013.s(Z);
            class07209 class072092 = new class07209(class077413.N(0, 0), class077413.N(1, 0), class077413.N(2, 0));
            class070013.W("nbt").ifPresent(class070012 -> this.m.add(new class09451(class068892, class072092, class070012)));
        });
    }

    private void N(class02055<class00891> class020552, class07741 class077412, class07741 class077413) {
        class01204 class012042 = new class01204();
        for (int i = 0; i < class077412.size(); ++i) {
            class012042.N(class07717.N(class020552, (class07001)class077412.y(i)), i);
        }
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        class077413.z().forEach(class070012 -> {
            class07741 class077412 = class070012.s("pos");
            class07209 class072092 = new class07209(class077412.N(0, 0), class077412.N(1, 0), class077412.N(2, 0));
            class00500 class005002 = class012042.N(class070012.y(R, 0));
            class07001 class070013 = class070012.W("nbt").orElse(null);
            class01207.N(new class01228(class072092, class005002, class070013), arrayList, arrayList2, arrayList3);
        });
        List<class01228> var8 = class01207.N(arrayList, arrayList2, arrayList3);
        this.W.add(new class09444(var8));
    }

    public class00753 N() {
        return this.P;
    }

    public class07209 N(class07209 class072092, class07111 class071112, class06993 class069932) {
        return class01207.N(class072092, class071112, class069932, this.N().method_10263(), this.N().method_10260());
    }

    public void N(class07299 class072992, class07209 class072092, class00753 class007532, boolean bl, List<class00891> list) {
        if (class007532.method_10263() < 1 || class007532.method_10264() < 1 || class007532.method_10260() < 1) {
            return;
        }
        class07209 class072093 = class072092.method_10081(class007532).method_10069(-1, -1, -1);
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        class07209 class072094 = new class07209(Math.min(class072092.method_10263(), class072093.method_10263()), Math.min(class072092.method_10264(), class072093.method_10264()), Math.min(class072092.method_10260(), class072093.method_10260()));
        class07209 class072095 = new class07209(Math.max(class072092.method_10263(), class072093.method_10263()), Math.max(class072092.method_10264(), class072093.method_10264()), Math.max(class072092.method_10260(), class072093.method_10260()));
        this.P = class007532;
        try (class04495 class044952 = new class04495(E);){
            for (class07209 class072096 : class07209.method_10097((class07209)class072094, (class07209)class072095)) {
                class01228 class012282;
                class07209 class072097 = class072096.method_10059((class00753)class072094);
                class00500 class005002 = class072992.method_8320(class072096);
                if (list.stream().anyMatch(arg_0 -> ((class00500)class005002).N(arg_0))) continue;
                class00394 class003942 = class072992.method_8321(class072096);
                if (class003942 != null) {
                    class08303 class083032 = class08303.N((class04490)class044952, (class01929)class072992.method_30349());
                    class003942.u((class08329)class083032);
                    class012282 = new class01228(class072097, class005002, class083032.y());
                } else {
                    class012282 = new class01228(class072097, class005002, null);
                }
                class01207.N(class012282, arrayList, arrayList2, arrayList3);
            }
            List<class01228> var13 = class01207.N(arrayList, arrayList2, arrayList3);
            this.W.clear();
            this.W.add(new class09444(var13));
            if (bl) {
                this.N(class072992, class072094, class072095, (class04490)class044952);
            } else {
                this.m.clear();
            }
        }
    }

    public static class07209 N(class01233 class012332, class07209 class072092) {
        return class01207.N(class072092, class012332.L(), class012332.u(), class012332.i());
    }

    public boolean N(class01001 class010012, class07209 class072092, class07209 class072093, class01233 class012332, class06069 class060692, int n) {
        if (this.W.isEmpty()) {
            return false;
        }
        List var7 = class012332.N(this.W, class072092).y();
        if (var7.isEmpty() && (class012332.R() || this.m.isEmpty()) || this.P.method_10263() < 1 || this.P.method_10264() < 1 || this.P.method_10260() < 1) {
            return false;
        }
        class05163 class051632 = class012332.M();
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)(class012332.z() ? var7.size() : 0));
        ArrayList arrayList2 = Lists.newArrayListWithCapacity((int)(class012332.z() ? var7.size() : 0));
        ArrayList arrayList3 = Lists.newArrayListWithCapacity((int)var7.size());
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MAX_VALUE;
        int n5 = Integer.MIN_VALUE;
        int n6 = Integer.MIN_VALUE;
        int n7 = Integer.MIN_VALUE;
        List<class01228> var18 = class01207.N(class010012, class072092, class072093, class012332, var7);
        try (class04495 class044952 = new class04495(E);){
            class04688 class046882;
            Object object;
            class00500 n9;
            class04688 n8;
            Object object2;
            for (class01228 class07211Array2 : var18) {
                class00394 i;
                object2 = class07211Array2.N();
                if (class051632 != null && !class051632.y((class00753)object2)) continue;
                n8 = class012332.z() ? class010012.method_8316((class07209)object2) : null;
                n9 = class07211Array2.y().N(class012332.L()).N(class012332.u());
                if (class07211Array2.L() != null) {
                    class010012.method_8652((class07209)object2, class00869.ZX.W(), 820);
                }
                if (!class010012.method_8652((class07209)object2, n9, n)) continue;
                n2 = Math.min(n2, object2.method_10263());
                n3 = Math.min(n3, object2.method_10264());
                n4 = Math.min(n4, object2.method_10260());
                n5 = Math.max(n5, object2.method_10263());
                n6 = Math.max(n6, object2.method_10264());
                n7 = Math.max(n7, object2.method_10260());
                arrayList3.add(Pair.of((Object)object2, (Object)class07211Array2.L()));
                if (class07211Array2.L() != null && (i = class010012.method_8321((class07209)object2)) != null) {
                    if (!class07529.K && i instanceof class03136) {
                        class07211Array2.L().N("LootTableSeed", class060692.B());
                    }
                    i.y_1(class08308.N((class04490)class044952.N_46(i.J()), (class01929)class010012.method_30349(), (class07001)class07211Array2.L()));
                }
                if (n8 == null) continue;
                if (n9.Y().u()) {
                    arrayList2.add(object2);
                    continue;
                }
                if (!(n9.i() instanceof class07132)) continue;
                ((class07132)n9.i()).N((class07284)class010012, (class07209)object2, n9, n8);
                if (n8.u()) continue;
                arrayList.add(object2);
            }
            boolean bl = true;
            class07211[] class07211Array = new class07211[]{class07211.field_11036, class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039};
            while (bl && !arrayList.isEmpty()) {
                bl = false;
                object2 = arrayList.iterator();
                while (object2.hasNext()) {
                    class00500 n10;
                    n8 = (class07209)object2.next();
                    n9 = class010012.method_8316((class07209)n8);
                    for (int class005003 = 0; class005003 < class07211Array.length && !n9.u(); ++class005003) {
                        object = n8.method_10093(class07211Array[class005003]);
                        class046882 = class010012.method_8316((class07209)object);
                        if (!class046882.u() || arrayList2.contains(object)) continue;
                        n9 = class046882;
                    }
                    if (!n9.u() || !((object = (n10 = class010012.method_8320((class07209)n8)).i()) instanceof class07132)) continue;
                    ((class07132)object).N((class07284)class010012, (class07209)n8, n10, (class04688)n9);
                    bl = true;
                    object2.remove();
                }
            }
            if (n2 <= n5) {
                if (!class012332.B()) {
                    object2 = new class06890(n5 - n2 + 1, n6 - n3 + 1, n7 - n4 + 1);
                    int pair = n2;
                    int class072095 = n3;
                    int class005004 = n4;
                    object = arrayList3.iterator();
                    while (object.hasNext()) {
                        class046882 = (Pair)object.next();
                        class07209 class072094 = (class07209)class046882.getFirst();
                        object2.method_1049(class072094.method_10263() - pair, class072094.method_10264() - class072095, class072094.method_10260() - class005004);
                    }
                    class01207.N((class07284)class010012, n, (class07739)object2, pair, class072095, class005004);
                }
                for (Pair pair : arrayList3) {
                    class00394 class003942;
                    class07209 class072095 = (class07209)pair.getFirst();
                    if (!class012332.B()) {
                        class00500 class003943 = class010012.method_8320(class072095);
                        if (class003943 != (object = class00891.a_((class00500)class003943, (class07284)class010012, (class07209)class072095))) {
                            class010012.method_8652(class072095, (class00500)object, n & 0xFFFFFFFE | 0x10);
                        }
                        class010012.method_8408(class072095, object.i());
                    }
                    if (pair.getSecond() == null || (class003942 = class010012.method_8321(class072095)) == null) continue;
                    class003942.method_5431();
                }
            }
            if (!class012332.R()) {
                this.N(class010012, class072092, class012332.L(), class012332.u(), class012332.i(), class051632, class012332.U(), (class04490)class044952);
            }
        }
        return true;
    }

    public static void N(class07284 class072842, int n, class07739 class077392, class07209 class072092) {
        class01207.N(class072842, n, class077392, class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public static void N(class07284 class072842, int n, class07739 class077392, int n2, int n3, int n4) {
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        class077392.method_1046((class072112, n5, n6, n7) -> {
            class00500 class005002;
            class072182.N(n2 + n5, n3 + n6, n4 + n7);
            class072183.N((class00753)class072182, class072112);
            class00500 class005003 = class072842.method_8320((class07209)class072182);
            class00500 class005004 = class072842.method_8320((class07209)class072183);
            class00500 class005005 = class005003.N((class05487)class072842, (class08713)class072842, (class07209)class072182, class072112, (class07209)class072183, class005004, class072842.method_8409());
            if (class005003 != class005005) {
                class072842.method_8652((class07209)class072182, class005005, n & 0xFFFFFFFE);
            }
            if (class005004 != (class005002 = class005004.N((class05487)class072842, (class08713)class072842, (class07209)class072183, class072112.b(), (class07209)class072182, class005005, class072842.method_8409()))) {
                class072842.method_8652((class07209)class072183, class005002, n & 0xFFFFFFFE);
            }
        });
    }

    public static List<class01228> N(class01001 class010012, class07209 class072092, class07209 class072093, class01233 class012332, List<class01228> list) {
        List<class01228> var6;
        ArrayList<class01228> arrayList = new ArrayList<class01228>();
        ArrayList<class01228> arrayList2 = new ArrayList<class01228>();
        for (class01228 object : list) {
            class07209 class072094 = class01207.N(class012332, object.N()).method_10081((class00753)class072092);
            class01228 class012282 = new class01228(class072094, object.y(), object.L() != null ? object.L().N() : null);
            Iterator var11 = class012332.Z().iterator();
            while (class012282 != null && var11.hasNext()) {
                class012282 = ((class01219)var11.next()).N((class05487)class010012, class072092, class072093, object, class012282, class012332);
            }
            if (class012282 == null) continue;
            arrayList2.add(class012282);
            arrayList.add(object);
        }
        for (class01219 class012192 : class012332.Z()) {
            var6 = class012192.N(class010012, class072092, class072093, arrayList, arrayList2, class012332);
        }
        return var6;
    }

    private void N(class07299 class072992, class07209 class072092, class07209 class072093, class04490 class044902) {
        List var5 = class072992.N(class07049.class, class00734.N((class07209)class072092, (class07209)class072093), (T class070492) -> !(class070492 instanceof class08036));
        this.m.clear();
        for (class07049 class070493 : var5) {
            class06889 class068892 = new class06889(class070493.method_23317() - (double)class072092.method_10263(), class070493.method_23318() - (double)class072092.method_10264(), class070493.method_23321() - (double)class072092.method_10260());
            class08303 class083032 = class08303.N((class04490)class044902.N_46(class070493.method_71370()), (class01929)class070493.method_56673());
            class070493.method_5662((class08329)class083032);
            class07209 class072094 = class070493 instanceof class00698 ? ((class00698)class070493).s().method_10059((class00753)class072092) : class07209.method_49638((class00737)class068892);
            this.m.add(new class09451(class068892, class072094, class083032.y().N()));
        }
    }

    public List<class01228> N(class07209 class072092, class01233 class012332, class00891 class008912) {
        return this.N(class072092, class012332, class008912, true);
    }

    public List<class01203> N(class07209 class072092, class06993 class069932) {
        if (this.W.isEmpty()) {
            return new ArrayList<class01203>();
        }
        class01233 class012332 = new class01233().N(class069932);
        List var4 = class012332.N(this.W, class072092).N();
        ArrayList<class01203> arrayList = new ArrayList<class01203>(var4.size());
        for (class01203 class012032 : var4) {
            class01228 class012282 = class012032.N();
            arrayList.add(class012032.y(new class01228(class01207.N(class012332, class012282.N()).method_10081((class00753)class072092), class012282.y().N(class012332.u()), class012282.L())));
        }
        return arrayList;
    }

    public ObjectArrayList<class01228> N(class07209 class072092, class01233 class012332, class00891 class008912, boolean bl) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        class05163 class051632 = class012332.M();
        if (this.W.isEmpty()) {
            return objectArrayList;
        }
        for (class01228 class012282 : class012332.N(this.W, class072092).N(class008912)) {
            class07209 class072093;
            class07209 class072094 = class072093 = bl ? class01207.N(class012332, class012282.N()).method_10081((class00753)class072092) : class012282.N();
            if (class051632 != null && !class051632.y((class00753)class072093)) continue;
            objectArrayList.add((Object)new class01228(class072093, class012282.y().N(class012332.u()), class012282.L()));
        }
        return objectArrayList;
    }

    public class07209 N(class01233 class012332, class07209 class072092, class01233 class012333, class07209 class072093) {
        class07209 class072094 = class01207.N(class012332, class072092);
        class07209 class072095 = class01207.N(class012333, class072093);
        return class072094.method_10059((class00753)class072095);
    }

    public static class06889 N(class06889 class068892, class07111 class071112, class06993 class069932, class07209 class072092) {
        double d = class068892.M;
        double d2 = class068892.B;
        double d3 = class068892.Z;
        boolean bl = true;
        switch (class071112) {
            case field_11300: {
                d3 = 1.0 - d3;
                break;
            }
            case field_11301: {
                d = 1.0 - d;
                break;
            }
            default: {
                bl = false;
            }
        }
        int n = class072092.method_10263();
        int n2 = class072092.method_10260();
        switch (class069932) {
            case field_11464: {
                return new class06889((double)(n + n + 1) - d, d2, (double)(n2 + n2 + 1) - d3);
            }
            case field_11465: {
                return new class06889((double)(n - n2) + d3, d2, (double)(n + n2 + 1) - d);
            }
            case field_11463: {
                return new class06889((double)(n + n2 + 1) - d3, d2, (double)(n2 - n) + d);
            }
        }
        return bl ? new class06889(d, d2, d3) : class068892;
    }

    public void N(String string) {
        this.s = string;
    }

    public static class07209 N(class07209 class072092, class07111 class071112, class06993 class069932, int n, int n2) {
        int n3 = class071112 == class07111.field_11301 ? --n : 0;
        int n4 = class071112 == class07111.field_11300 ? --n2 : 0;
        class07209 class072093 = class072092;
        switch (class069932) {
            case field_11467: {
                class072093 = class072092.method_10069(n3, 0, n4);
                break;
            }
            case field_11463: {
                class072093 = class072092.method_10069(n2 - n4, 0, n3);
                break;
            }
            case field_11464: {
                class072093 = class072092.method_10069(n - n3, 0, n2 - n4);
                break;
            }
            case field_11465: {
                class072093 = class072092.method_10069(n4, 0, n - n3);
            }
        }
        return class072093;
    }

    private static List<class01228> N(List<class01228> list, List<class01228> list2, List<class01228> list3) {
        Comparator<class01228> comparator = Comparator.comparingInt(class012282 -> class012282.N().method_10264()).thenComparingInt(class012282 -> class012282.N().method_10263()).thenComparingInt(class012282 -> class012282.N().method_10260());
        list.sort(comparator);
        list3.sort(comparator);
        list2.sort(comparator);
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list3);
        arrayList.addAll(list2);
        return arrayList;
    }

    public class05163 N(class07209 class072092, class06993 class069932, class07209 class072093, class07111 class071112) {
        return class01207.N(class072092, class069932, class072093, class071112, this.P);
    }

    private void N(class01001 class010012, class07209 class072092, class07111 class071112, class06993 class069932, class07209 class072093, @Nullable class05163 class051632, boolean bl, class04490 class044902) {
        for (class09451 class094512 : this.m) {
            class07209 class072094 = class01207.N(class094512.y, class071112, class069932, class072093).method_10081((class00753)class072092);
            if (class051632 != null && !class051632.y((class00753)class072094)) continue;
            class07001 class070012 = class094512.L.N();
            class06889 class068892 = class01207.N(class094512.N, class071112, class069932, class072093).y((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
            class07741 class077412 = new class07741();
            class077412.add((Object)class07019.N((double)class068892.M));
            class077412.add((Object)class07019.N((double)class068892.B));
            class077412.add((Object)class07019.N((double)class068892.Z));
            class070012.N("Pos", (class07709)class077412);
            class070012.b("UUID");
            class01207.N(class044902, class010012, class070012).ifPresent(class070492 -> {
                float f = class070492.method_5832(class069932);
                class070492.method_5808(class068892.M, class068892.B, class068892.Z, f += class070492.method_5763(class071112) - class070492.method_36454(), class070492.method_36455());
                class070492.method_5636(f);
                class070492.method_5847(f);
                if (bl && class070492 instanceof class07079) {
                    ((class07079)class070492).N(class010012, class010012.method_8404(class07209.method_49638((class00737)class068892)), class06113.field_16474, null);
                }
                class010012.y(class070492);
            });
        }
    }

    private static Optional<class07049> N(class04490 class044902, class01001 class010012, class07001 class070012) {
        try {
            return class07078.N((class08299)class08308.N((class04490)class044902, (class01929)class010012.method_30349(), (class07001)class070012), (class07299)class010012.method_8410(), (class06113)class06113.field_16474);
        }
        catch (Exception exception) {
            return Optional.empty();
        }
    }

    public class00753 N(class06993 class069932) {
        switch (class069932) {
            case field_11465: 
            case field_11463: {
                return new class00753(this.P.method_10260(), this.P.method_10264(), this.P.method_10263());
            }
        }
        return this.P;
    }

    public static class07209 N(class07209 class072092, class07111 class071112, class06993 class069932, class07209 class072093) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        boolean bl = true;
        switch (class071112) {
            case field_11300: {
                n3 = -n3;
                break;
            }
            case field_11301: {
                n = -n;
                break;
            }
            default: {
                bl = false;
            }
        }
        int n4 = class072093.method_10263();
        int n5 = class072093.method_10260();
        switch (class069932) {
            case field_11464: {
                return new class07209(n4 + n4 - n, n2, n5 + n5 - n3);
            }
            case field_11465: {
                return new class07209(n4 - n5 + n3, n2, n4 + n5 - n);
            }
            case field_11463: {
                return new class07209(n4 + n5 - n3, n2, n5 - n4 + n);
            }
        }
        return bl ? new class07209(n, n2, n3) : class072092;
    }
}

