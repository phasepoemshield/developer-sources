/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00869
 *  minecraft.class01286
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class07062
 *  minecraft.class07084
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.function.ToIntFunction;
import minecraft.class00869;
import minecraft.class01286;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class07062;
import minecraft.class07084;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class08036;

public class class02185
extends class07084 {
    private final ToIntFunction<class06069> L;

    public class02185(class01286 class012862, int n, ToIntFunction<class06069> toIntFunction) {
        super(class012862, n, (class07126)class07107.r);
        this.L = toIntFunction;
    }

    public void N(class04782 class047822, class07438 class074382, int n, class07062 class070622) {
        if (class070622 == class07062.field_26998 && (class074382 instanceof class08036 || ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue())) {
            this.N(class047822, class074382.method_59922(), class074382.method_24515());
        }
    }

    private void N(class04782 class047822, class06069 class060692, class07209 class072092) {
        HashSet hashSet = Sets.newHashSet();
        int n = this.L.applyAsInt(class060692);
        for (class07209 class072093 : class07209.method_34848((class06069)class060692, (int)15, (class07209)class072092, (int)1)) {
            class07209 class072094 = class072093.method_10074();
            if (hashSet.contains(class072093) || !class047822.method_8320(class072093).d() || !class047822.method_8320(class072094).L((class07290)class047822, class072094, class07211.field_11036)) continue;
            hashSet.add(class072093.method_10062());
            if (hashSet.size() < n) continue;
            break;
        }
        for (class07209 class072093 : hashSet) {
            class047822.method_8652(class072093, class00869.yw.W(), 3);
            class047822.N(3018, class072093, 0);
        }
    }
}

