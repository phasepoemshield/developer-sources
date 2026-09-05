/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class01017
 *  minecraft.class01031
 *  minecraft.class01042
 *  minecraft.class01203
 *  minecraft.class01224
 *  minecraft.class01894
 *  minecraft.class02216
 *  minecraft.class02610
 *  minecraft.class03098
 *  minecraft.class03291
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class04227
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05236
 *  minecraft.class05248
 *  minecraft.class05281
 *  minecraft.class05324
 *  minecraft.class05474
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07003
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class07836
 *  minecraft.class08088
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class01017;
import minecraft.class01031;
import minecraft.class01042;
import minecraft.class01203;
import minecraft.class01224;
import minecraft.class01894;
import minecraft.class02216;
import minecraft.class02610;
import minecraft.class03098;
import minecraft.class03291;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class04227;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04782;
import minecraft.class04863;
import minecraft.class04867;
import minecraft.class04869;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05236;
import minecraft.class05248;
import minecraft.class05281;
import minecraft.class05324;
import minecraft.class05474;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07003;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class07836;
import minecraft.class08088;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class class04848 {
    static final Logger N = LogUtils.getLogger();
    private static final int y = Integer.MIN_VALUE;

    public static boolean N(class04782 class047822, class03556<class05281> class035563, class01894 class018942, int n, class07209 class072092, boolean bl) {
        class08088 class080882 = class047822.method_14178().U();
        class01224 class012242 = class047822.method_14183();
        class05324 class053242 = class047822.method_27056();
        class06069 class060692 = class047822.method_8409();
        Optional<class04780> var11 = class04848.N(new class04764(class047822.method_30349(), class080882, class080882.u(), class047822.method_14178().W(), class012242, class047822.method_8412(), new class07321(class072092), (class05474)class047822, class035562 -> true), class035563, Optional.of(class018942), n, class072092, false, Optional.empty(), new class01031(128), class03098.N, class01017.N, class01017.y);
        if (var11.isPresent()) {
            for (class04890 class048902 : var11.get().N().N().L()) {
                if (!(class048902 instanceof class05236)) continue;
                ((class05236)class048902).N((class05974)class047822, class053242, class080882, class060692, class05163.N(), class072092, bl);
            }
            return true;
        }
        return false;
    }

    private static boolean N(class05474 class054742, class02216 class022162, class05163 class051632) {
        if (class022162 == class02216.y) {
            return false;
        }
        int n = class054742.method_31607() + class022162.y();
        int n2 = class054742.method_31600() - class022162.L();
        return class051632.Z() < n || class051632.E() > n2;
    }

    private static Optional<class07209> N(class05248 class052482, class01894 class018942, class07209 class072092, class06993 class069932, class01224 class012242, class07836 class078362) {
        for (class01203 class012032 : class052482.N(class012242, class072092, class069932, (class06069)class078362)) {
            if (!class018942.equals((Object)class012032.L())) continue;
            return Optional.of(class012032.N().N());
        }
        return Optional.empty();
    }

    private static void N(class04084 class040842, int n, boolean bl, class08088 class080882, class01224 class012242, class05474 class054742, class06069 class060692, class00751<class05281> class007512, class05236 class052362, List<class05236> list, class00494 class004942, class03098 class030982, class02610 class026102) {
        class04863 class048632 = new class04863(class007512, n, class080882, class012242, list, class060692);
        class048632.N(class052362, (MutableObject<class00494>)new MutableObject((Object)class004942), 0, bl, class054742, class040842, class030982, class026102);
        while (class048632.N.hasNext()) {
            class04867 class048672 = (class04867)((Object)class048632.N.next());
            class048632.N(class048672.N(), class048672.y(), class048672.L(), bl, class054742, class040842, class030982, class026102);
        }
    }

    public static Optional<class04780> N(class04764 class047642, class03556<class05281> class035562, Optional<class01894> optional, int n, class07209 class072092, boolean bl, Optional<class07830> optional2, class01031 class010312, class03098 class030982, class02216 class022162, class02610 class026102) {
        class07209 class072093;
        class01894 class018942;
        class01042 class010422 = class047642.N();
        class08088 class080882 = class047642.y();
        class01224 class012242 = class047642.i();
        class05474 class054742 = class047642.Z();
        class07836 class078362 = class047642.R();
        class00751 class007512 = class010422.L(class04227.yv);
        class06993 class069932 = class06993.N((class06069)class078362);
        class05248 class052482 = class035562.i().flatMap(class059462 -> class007512.M(class030982.lookup(class059462))).orElse((class05281)class035562.N()).N((class06069)class078362);
        if (class052482 == class04869.y) {
            return Optional.empty();
        }
        if (optional.isPresent()) {
            class018942 = optional.get();
            Optional<class07209> var22 = class04848.N(class052482, class018942, class072092, class069932, class012242, class078362);
            if (var22.isEmpty()) {
                N.error("No starting jigsaw {} found in start pool {}", (Object)class018942, (Object)class035562.i().map(class059462 -> class059462.N().toString()).orElse("<unregistered>"));
                return Optional.empty();
            }
            class072093 = var22.get();
        } else {
            class072093 = class072092;
        }
        class018942 = class072093.method_10059((class00753)class072092);
        class07209 class072094 = class072092.method_10059((class00753)class018942);
        class05236 class052362 = new class05236(class012242, class052482, class072094, class052482.B(), class069932, class052482.N(class012242, class072094, class069932), class026102);
        class05163 class051632 = class052362.L();
        int n2 = (class051632.U() + class051632.B()) / 2;
        int n3 = (class051632.W() + class051632.z()) / 2;
        int n4 = optional2.isEmpty() ? class072094.method_10264() : class072092.method_10264() + class080882.y(n2, n3, optional2.get(), class054742, class047642.u());
        int n5 = class051632.Z() + class052362.z();
        class052362.N(0, n4 - n5, 0);
        if (class04848.N(class054742, class022162, class052362.L())) {
            N.debug("Center piece {} with bounding box {} does not fit dimension padding {}", new Object[]{class052482, class052362.L(), class022162});
            return Optional.empty();
        }
        int n6 = n4 + class018942.method_10264();
        return Optional.of(new class04780(new class07209(n2, n6, n3), class032912 -> {
            ArrayList arrayList = Lists.newArrayList();
            arrayList.add(class052362);
            if (n <= 0) {
                return;
            }
            class00494 class004942 = class00389.N((class00494)class00389.N((class00734)new class00734((double)(n2 - class010312.N()), (double)Math.max(n6 - class010312.y(), class054742.method_31607() + class022162.y()), (double)(n3 - class010312.N()), (double)(n2 + class010312.N() + 1), (double)Math.min(n6 + class010312.y() + 1, class054742.method_31600() + 1 - class022162.L()), (double)(n3 + class010312.N() + 1))), (class00494)class00389.N((class00734)class00734.N((class05163)class051632)), (class07003)class07003.i);
            class04848.N(class047642.u(), n, bl, class080882, class012242, class054742, (class06069)class078362, (class00751<class05281>)class007512, class052362, arrayList, class004942, class030982, class026102);
            arrayList.forEach(arg_0 -> ((class03291)class032912).N(arg_0));
        }));
    }
}

