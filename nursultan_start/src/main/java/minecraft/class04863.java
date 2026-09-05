/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class01019
 *  minecraft.class01203
 *  minecraft.class01224
 *  minecraft.class01228
 *  minecraft.class02610
 *  minecraft.class03098
 *  minecraft.class03119
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class05163
 *  minecraft.class05236
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05281
 *  minecraft.class05474
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07003
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07830
 *  minecraft.class08088
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class01019;
import minecraft.class01203;
import minecraft.class01224;
import minecraft.class01228;
import minecraft.class02610;
import minecraft.class03098;
import minecraft.class03119;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class04844;
import minecraft.class04848;
import minecraft.class04867;
import minecraft.class04869;
import minecraft.class04884;
import minecraft.class05163;
import minecraft.class05236;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05281;
import minecraft.class05474;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07003;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07830;
import minecraft.class08088;
import org.apache.commons.lang3.mutable.MutableObject;

final class class04863 {
    private final class00751<class05281> y;
    private final int L;
    private final class08088 u;
    private final class01224 i;
    private final List<? super class05236> R;
    private final class06069 M;
    final class03119<class04867> N = new class03119();

    class04863(class00751<class05281> class007512, int n, class08088 class080882, class01224 class012242, List<? super class05236> list, class06069 class060692) {
        this.y = class007512;
        this.L = n;
        this.u = class080882;
        this.i = class012242;
        this.R = list;
        this.M = class060692;
    }

    void N(class05236 class052362, MutableObject<class00494> mutableObject, int n, boolean bl, class05474 class054742, class04084 class040842, class03098 class030982, class02610 class026102) {
        class05248 class052482 = class052362.y();
        class07209 class072092 = class052362.Z();
        class06993 class069932 = class052362.R();
        class05246 class052462 = class052482.M();
        boolean bl2 = class052462 == class05246.field_16687;
        MutableObject<class00494> mutableObject2 = new MutableObject<class00494>();
        class05163 class051632 = class052362.L();
        int n2 = class051632.Z();
        block0: for (class01203 class012033 : class052482.N(this.i, class072092, class069932, this.M)) {
            class05248 class052483;
            MutableObject<class00494> mutableObject3;
            class01228 class012282 = class012033.N();
            class07211 class072112 = class04884.U(class012282.y());
            class07209 class072093 = class012282.N();
            class07209 class072094 = class072093.method_10093(class072112);
            int n3 = class072093.method_10264() - n2;
            int n4 = Integer.MIN_VALUE;
            class05946 var25 = class030982.lookup(class012033.u());
            Optional var26 = this.y.N(var25);
            if (var26.isEmpty()) {
                class04848.N.warn("Empty or non-existent pool: {}", (Object)var25.N());
                continue;
            }
            class03556 var27 = (class03556)var26.get();
            if (((class05281)var27.N()).L() == 0 && !var27.N(class01019.N)) {
                class04848.N.warn("Empty or non-existent pool: {}", (Object)var25.N());
                continue;
            }
            class03556 var28 = ((class05281)var27.N()).y();
            if (((class05281)var28.N()).L() == 0 && !var28.N(class01019.N)) {
                class04848.N.warn("Empty or non-existent fallback pool: {}", (Object)var28.i().map(class059462 -> class059462.N().toString()).orElse("<unregistered>"));
                continue;
            }
            if (class051632.y((class00753)class072094)) {
                mutableObject3 = mutableObject2;
                if (mutableObject2.get() == null) {
                    mutableObject2.setValue((Object)class00389.N((class00734)class00734.N((class05163)class051632)));
                }
            } else {
                mutableObject3 = mutableObject;
            }
            ArrayList arrayList = Lists.newArrayList();
            if (n != this.L) {
                arrayList.addAll(((class05281)var27.N()).y(this.M));
            }
            arrayList.addAll(((class05281)var28.N()).y(this.M));
            int n5 = class012033.R();
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext() && (class052483 = (class05248)iterator.next()) != class04869.y) {
                for (class06993 class069933 : class06993.y((class06069)this.M)) {
                    List var37 = class052483.N(this.i, class07209.field_10980, class069933, this.M);
                    class05163 class051633 = class052483.N(this.i, class07209.field_10980, class069933);
                    int n6 = !bl || class051633.i() > 16 ? 0 : var37.stream().mapToInt(class012032 -> {
                        class01228 class012282 = class012032.N();
                        if (!class051633.y((class00753)class012282.N().method_10093(class04884.U(class012282.y())))) {
                            return 0;
                        }
                        class05946 var5 = class030982.lookup(class012032.u());
                        Optional var6 = this.y.N(var5);
                        Optional<class03556> optional = var6.map(class035562 -> ((class05281)class035562.N()).y());
                        int n = var6.map(class035562 -> ((class05281)class035562.N()).N(this.i)).orElse(0);
                        int n2 = optional.map(class035562 -> ((class05281)class035562.N()).N(this.i)).orElse(0);
                        return Math.max(n, n2);
                    }).max().orElse(0);
                    for (class01203 class012034 : var37) {
                        int n7;
                        int n8;
                        int n9;
                        if (!class04884.N(class012033, class012034)) continue;
                        class07209 class072095 = class012034.N().N();
                        class07209 class072096 = class072094.method_10059((class00753)class072095);
                        class05163 class051634 = class052483.N(this.i, class072096, class069933);
                        int n10 = class051634.Z();
                        class05246 class052463 = class052483.M();
                        boolean bl3 = class052463 == class05246.field_16687;
                        int n11 = class072095.method_10264();
                        int n12 = n3 - n11 + class04884.U(class012282.y()).s();
                        if (bl2 && bl3) {
                            n9 = n2 + n12;
                        } else {
                            if (n4 == Integer.MIN_VALUE) {
                                n4 = this.u.y(class072093.method_10263(), class072093.method_10260(), class07830.field_13194, class054742, class040842);
                            }
                            n9 = n4 - n11;
                        }
                        int n13 = n9 - n10;
                        class05163 class051635 = class051634.y(0, n13, 0);
                        class07209 class072097 = class072096.method_10069(0, n13, 0);
                        if (n6 > 0) {
                            n8 = Math.max(n6 + 1, class051635.E() - class051635.Z());
                            class051635.N(new class07209(class051635.B(), class051635.Z() + n8, class051635.z()));
                        }
                        if (class00389.L((class00494)((class00494)mutableObject3.get()), (class00494)class00389.N((class00734)class00734.N((class05163)class051635).B(0.25)), (class07003)class07003.L)) continue;
                        mutableObject3.setValue((Object)class00389.y((class00494)((class00494)mutableObject3.get()), (class00494)class00389.N((class00734)class00734.N((class05163)class051635)), (class07003)class07003.i));
                        n8 = class052362.z();
                        int n14 = bl3 ? n8 - n12 : class052483.B();
                        class05236 class052363 = new class05236(this.i, class052483, class072097, n14, class069933, class051635, class026102);
                        if (bl2) {
                            n7 = n2 + n3;
                        } else if (bl3) {
                            n7 = n9 + n11;
                        } else {
                            if (n4 == Integer.MIN_VALUE) {
                                n4 = this.u.y(class072093.method_10263(), class072093.method_10260(), class07830.field_13194, class054742, class040842);
                            }
                            n7 = n4 + n12 / 2;
                        }
                        class052362.N(new class04844(class072094.method_10263(), n7 - n3 + n8, class072094.method_10260(), n12, class052463));
                        class052363.N(new class04844(class072093.method_10263(), n7 - n11 + n14, class072093.method_10260(), -n12, class052462));
                        this.R.add((class05236)class052363);
                        if (n + 1 > this.L) continue block0;
                        class04867 class048672 = new class04867(class052363, mutableObject3, n + 1);
                        this.N.N((Object)class048672, n5);
                        continue block0;
                    }
                }
            }
        }
    }
}

