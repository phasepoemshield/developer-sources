/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09069
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class09343
 *  Nursultan.class10961
 *  Nursultan.class11025
 *  Nursultan.class11030
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11184
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11215
 *  Nursultan.class11216
 *  Nursultan.class11380
 *  Nursultan.class11507
 *  Nursultan.class11511
 *  Nursultan.class11512
 *  Nursultan.class11519
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class12036
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00481
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00514
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00891
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07259
 *  minecraft.class07261
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class08066
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09069;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class09343;
import Nursultan.class10961;
import Nursultan.class11025;
import Nursultan.class11030;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11184;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11215;
import Nursultan.class11216;
import Nursultan.class11380;
import Nursultan.class11507;
import Nursultan.class11511;
import Nursultan.class11512;
import Nursultan.class11519;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12036;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import minecraft.class00381;
import minecraft.class00481;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00514;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07259;
import minecraft.class07261;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class08066;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@class11080(L="BlockESP", y=class11072.VISUAL, N=class11106.WORLD)
public class BlockESP
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;

    private void L(long l) {
        class07209 class072092;
        this.k();
        Set set = (Set)((Map)this.u_3).get(l);
        if (set == null || (class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        Map map = (Map)this.u_0;
        IntArrayList intArrayList = new IntArrayList();
        IntArrayList intArrayList2 = new IntArrayList();
        int n = class07321.N((long)l) << 4;
        int n2 = class07321.y((long)l) << 4;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            class072092 = (class07209)iterator.next();
            class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
            class11025 class110252 = (class11025)map.get(class005002.i());
            if (class110252 == null) {
                iterator.remove();
                continue;
            }
            class00494 class004942 = class005002.R((class07290)((class03448)((class06202)this.y_0).T_3), class072092);
            if (class004942.method_1110()) continue;
            int n3 = class072092.method_10263() - n;
            int n4 = class072092.method_10260() - n2;
            if (class00891.N((class00494)class004942)) {
                this.N(intArrayList2, n3, (double)class072092.method_10264(), (double)n4, class110252.y());
                continue;
            }
            this.N(intArrayList, class004942, n3, class072092.method_10264(), n4, class110252.y());
        }
        if (set.isEmpty()) {
            ((Map)this.u_3).remove(l);
        }
        if ((class072092 = new class11030(intArrayList.toIntArray(), intArrayList2.toIntArray())).u()) {
            ((Map)this.u_2).remove(l);
        } else {
            ((Map)this.u_2).put(l, class072092);
        }
        this.u_5 = true;
    }

    public void P() {
        this.k();
        this.u_0 = Map.of();
        this.n();
        this.Y();
    }

    public BlockESP() {
        this.k();
        this.u_0 = Map.of();
        this.u_1 = (class11507)class11524.N((class11512)this, (String)"delta-mode", (boolean)false).N_6((class115362, bl) -> this.l());
        this.u_2 = new HashMap();
        this.u_3 = new HashMap();
        this.u_4 = new LinkedHashSet();
        this.u_7 = class06889.L;
        this.i_0 = class11213.N((class09087)((class09087)class09063.N_0), (int)65536, (int)0);
        this.i_1 = class11213.N((class09087)((class09087)L_1), (int)16384);
        this.i_2 = class11204.L().N((class12036)class11215.N_0).N((class09322)class11185.N_4).N(1).N();
        this.i_3 = class11204.L().N((class12036)class11215.N_0).N((class09322)class11185.z_1).N(1).N();
        this.i_4 = new Matrix4f();
    }

    static {
        BlockESP.v();
        L_1 = new class09087(new class09069[]{class09069.N((int)3).R(), class09069.y().R()});
    }

    public boolean Z() {
        this.k();
        this.u_5 = true;
        if (!((Boolean)((class11507)this.u_1).i()).booleanValue()) {
            this.j();
        }
        return true;
    }

    public boolean i() {
        this.k();
        ((Set)this.u_4).clear();
        ((Map)this.u_2).clear();
        ((Map)this.u_3).clear();
        this.u_5 = true;
        return true;
    }

    private void b() {
        this.k();
        ((Set)this.u_4).removeIf(l -> this.N((long)l) == null);
        ((Map)this.u_3).keySet().removeIf(l -> this.N((long)l) == null);
        if (((Map)this.u_2).keySet().removeIf(l -> this.N((long)l) == null)) {
            this.u_5 = true;
        }
    }

    private void n() {
        this.k();
        ((Map)this.u_2).clear();
        this.u_5 = true;
        if (((Boolean)((class11507)this.u_1).i()).booleanValue()) {
            List.copyOf(((Map)this.u_3).keySet()).forEach(this::L);
        } else {
            this.j();
        }
    }

    private void l() {
        this.k();
        ((Set)this.u_4).clear();
        ((Map)this.u_3).clear();
        this.n();
    }

    public Collection<class11025> m() {
        this.k();
        return ((Map)this.u_0).values();
    }

    private void k() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_5 = false;
            this.u_6 = 0;
        }
    }

    private static void v() {
        L_0 = -1;
        L_1 = null;
        L_2 = 24;
        L_3 = 20;
    }

    private void j() {
        this.k();
        if ((class03448)((class06202)this.y_0).T_3 == null || (class04453)((class06202)this.y_0).T_4 == null) {
            return;
        }
        class07321 class073212 = ((class04453)((class06202)this.y_0).T_4).method_31476();
        int n = (Integer)((class05630)((class06202)this.y_0).i_7).i().method_41753() + 1;
        for (int i = class073212.B - n; i <= class073212.B + n; ++i) {
            for (int j = class073212.Z - n; j <= class073212.Z + n; ++j) {
                if (((class03448)((class06202)this.y_0).T_3).method_8398().N(i, j, class00549.m, false) == null) continue;
                ((Set)this.u_4).add(class07321.u((int)i, (int)j));
            }
        }
    }

    private void y(class00570 class005702) {
        this.k();
        Map map = (Map)this.u_0;
        IntArrayList intArrayList = new IntArrayList();
        IntArrayList intArrayList2 = new IntArrayList();
        class07321 class073212 = class005702.R();
        class00554[] class00554Array = class005702.u();
        class07218 class072182 = new class07218();
        for (int i = 0; i < class00554Array.length; ++i) {
            class00554 class005542 = class00554Array[i];
            if (class005542.L() || !class005542.N(class005002 -> map.containsKey(class005002.i()))) continue;
            int n = class005702.method_31604(i) << 4;
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    for (int i2 = 0; i2 < 16; ++i2) {
                        class00500 class005003 = class005542.N(i2, j, k);
                        class11025 class110252 = (class11025)map.get(class005003.i());
                        if (class110252 == null) continue;
                        class072182.N(class073212.i() + i2, n + j, class073212.R() + k);
                        class00494 class004942 = class005003.R((class07290)class005702, (class07209)class072182);
                        if (class004942.method_1110()) continue;
                        if (class00891.N((class00494)class004942)) {
                            this.N(intArrayList2, i2, (double)(n + j), (double)k, class110252.y());
                            continue;
                        }
                        this.N(intArrayList, class004942, i2, n + j, k, class110252.y());
                    }
                }
            }
        }
        long l = class073212.y();
        class11030 class110302 = new class11030(intArrayList.toIntArray(), intArrayList2.toIntArray());
        ((class06202)this.y_0).execute(() -> this.N(l, class110302));
    }

    private void y(class07261 class072612) {
        this.k();
        if (!((Boolean)((class11507)this.u_1).i()).booleanValue()) {
            class072612.N((class072092, class005002) -> {
                this.k();
                ((Set)this.u_4).add(class07321.N((class07209)class072092));
            });
            return;
        }
        if ((class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        Map map = (Map)this.u_0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        class072612.N((class072092, class005002) -> {
            this.k();
            long l2 = class07321.N((class07209)class072092);
            if (map.containsKey(class005002.i())) {
                ((Map)this.u_3).computeIfAbsent(l2, l -> new HashSet()).add(class072092.method_10062());
                linkedHashSet.add(l2);
            } else {
                Set set2 = (Set)((Map)this.u_3).get(l2);
                if (set2 != null && set2.remove(class072092)) {
                    linkedHashSet.add(l2);
                }
            }
        });
        linkedHashSet.forEach(this::L);
    }

    public class11025 y(class00891 class008912) {
        this.k();
        return (class11025)((Map)this.u_0).get(class008912);
    }

    private void y(long l) {
        ((class06202)this.y_0).execute(() -> {
            this.k();
            if (!((Boolean)((class11507)this.u_1).i()).booleanValue()) {
                ((Set)this.u_4).add(l);
            }
        });
    }

    public void y(Collection<class11025> collection) {
        this.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        collection.forEach(class110252 -> linkedHashMap.put(class110252.N(), class110252));
        this.u_0 = Collections.unmodifiableMap(linkedHashMap);
        this.n();
    }

    public boolean N(class00891 class008912) {
        this.k();
        if (!((Map)this.u_0).containsKey(class008912)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map)this.u_0);
        linkedHashMap.remove(class008912);
        this.u_0 = Collections.unmodifiableMap(linkedHashMap);
        this.n();
        this.Y();
        return true;
    }

    private void N(class06889 class068892) {
        this.k();
        this.u_5 = false;
        this.u_7 = class068892;
        class11184 class111842 = ((class11213)this.i_0).M();
        class11184 class111843 = ((class11213)this.i_1).M();
        class111842.N();
        class111843.N();
        for (Map.Entry entry : ((Map)this.u_2).entrySet()) {
            long l = (Long)entry.getKey();
            float f = (float)((double)(class07321.N((long)l) << 4) - ((class06889)this.u_7).M);
            float f2 = (float)(-((class06889)this.u_7).B);
            float f3 = (float)((double)(class07321.y((long)l) << 4) - ((class06889)this.u_7).Z);
            this.N(class111842, ((class11030)entry.getValue()).y(), f, f2, f3);
            this.N(class111843, ((class11030)entry.getValue()).N(), f, f2, f3);
        }
        ((class11213)this.i_0).N(class111842, 35048);
        ((class11213)this.i_1).N(class111843, 35048);
    }

    private void N(class11184 class111842, int[] nArray, float f, float f2, float f3) {
        for (int i = 0; i < nArray.length; i += 4) {
            class111842.N(Float.intBitsToFloat(nArray[i]) + f).N(Float.intBitsToFloat(nArray[i + 1]) + f2).N(Float.intBitsToFloat(nArray[i + 2]) + f3).N(nArray[i + 3]);
            class111842.y();
        }
    }

    private class00570 N(long l) {
        return ((class03448)((class06202)this.y_0).T_3).method_8398().N(class07321.N((long)l), class07321.y((long)l), class00549.m, false);
    }

    private void N(IntArrayList intArrayList, class00494 class004942, int n, int n2, int n3, int n4) {
        class004942.method_1104((d, d2, d3, d4, d5, d6) -> {
            this.N(intArrayList, (double)n + d, (double)n2 + d2, (double)n3 + d3, n4);
            this.N(intArrayList, (double)n + d4, (double)n2 + d5, (double)n3 + d6, n4);
        });
    }

    public void N(Collection<class11025> collection) {
        this.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map)this.u_0);
        collection.forEach(class110252 -> linkedHashMap.put(class110252.N(), class110252));
        this.u_0 = Collections.unmodifiableMap(linkedHashMap);
        this.n();
        this.Y();
    }

    @class11782
    public void N(class09343 class093432) {
        this.k();
        ((Set)this.u_4).clear();
        ((Map)this.u_2).clear();
        ((Map)this.u_3).clear();
        this.u_5 = true;
    }

    private void N(long l, class11030 class110302) {
        this.k();
        if (!this.U() || (class03448)((class06202)this.y_0).T_3 == null || ((Boolean)((class11507)this.u_1).i()).booleanValue()) {
            return;
        }
        if (class110302.u()) {
            if (((Map)this.u_2).remove(l) != null) {
                this.u_5 = true;
            }
            return;
        }
        ((Map)this.u_2).put(l, class110302);
        this.u_5 = true;
    }

    public void N(class11025 class110252) {
        this.k();
        LinkedHashMap<class00891, class11025> linkedHashMap = new LinkedHashMap<class00891, class11025>((Map)this.u_0);
        linkedHashMap.put(class110252.N(), class110252);
        this.u_0 = Collections.unmodifiableMap(linkedHashMap);
        this.n();
        this.Y();
    }

    @class11782
    public void N(class10961 class109612) {
        class00381 class003812 = class109612.N();
        Objects.requireNonNull(class003812);
        class00381 var2 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00514.class, class07259.class, class07261.class, class00481.class}, (Object)var2, (int)n)) {
            case 0: {
                class00514 class005142 = (class00514)var2;
                this.y(class07321.u((int)class005142.N(), (int)class005142.y()));
                break;
            }
            case 1: {
                class07259 class072592 = (class07259)var2;
                this.y(class07321.N((class07209)class072592.y()));
                break;
            }
            case 2: {
                class07261 class072612 = (class07261)var2;
                ((class06202)this.y_0).execute(() -> this.y(class072612));
                break;
            }
            case 3: {
                class00481 class004812 = (class00481)var2;
                ((class06202)this.y_0).execute(() -> {
                    this.k();
                    long l = class004812.N().y();
                    ((Set)this.u_4).remove(l);
                    ((Map)this.u_3).remove(l);
                    if (((Map)this.u_2).remove(l) != null) {
                        this.u_5 = true;
                    }
                });
                break;
            }
        }
    }

    @class11782
    public void N(class09321 class093212) {
        this.k();
        class06889 class068892 = class093212.y().y();
        if (((Boolean)this.u_5).booleanValue()) {
            this.N(class068892);
        }
        if (((class11213)this.i_0).B() && ((class11213)this.i_1).B()) {
            return;
        }
        class11925.N((class08066)((class06202)this.y_0).e(), (boolean)true);
        ((Matrix4f)this.i_4).set((Matrix4fc)class093212.N()).translate((float)(((class06889)this.u_7).M - class068892.M), (float)(((class06889)this.u_7).B - class068892.B), (float)(((class06889)this.u_7).Z - class068892.Z));
        ((class11216)class11925.L_6).N(class093212.i(), (Matrix4f)this.i_4);
        if (!((class11213)this.i_0).B()) {
            ((class11204)this.i_2).y();
            ((class11213)this.i_0).N(((class11204)this.i_2).i());
        }
        if (!((class11213)this.i_1).B()) {
            ((class11204)this.i_3).y();
            ((class11213)this.i_1).N(((class11204)this.i_3).i(), 24, ((class11213)this.i_1).y());
        }
    }

    private void N(IntArrayList intArrayList, double d, double d2, double d3, int n) {
        intArrayList.add(Float.floatToRawIntBits((float)d));
        intArrayList.add(Float.floatToRawIntBits((float)d2));
        intArrayList.add(Float.floatToRawIntBits((float)d3));
        intArrayList.add(n);
    }

    @class11782
    public void N(class11380 class113802) {
        this.k();
        if ((class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        if (!((Boolean)((class11507)this.u_1).i()).booleanValue()) {
            Iterator iterator = ((Set)this.u_4).iterator();
            while (iterator.hasNext()) {
                long l = (Long)iterator.next();
                class00570 class005702 = this.N(l);
                if (class005702 == null) continue;
                iterator.remove();
                ((ExecutorService)class11938.L_1).execute(() -> this.y(class005702));
            }
        }
        int n = (Integer)this.u_6 + 1;
        this.u_6 = n;
        if (n >= 20) {
            this.u_6 = 0;
            this.b();
        }
    }

    private void Y() {
        class11519.y(class11511.class);
    }
}

