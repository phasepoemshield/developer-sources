/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05672
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08041
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Set;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08041;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06281
extends class05355<class08041> {
    private static final int N = 40;

    public class06281() {
        super(40);
    }

    private void N(class04782 class047822, class08041 class080412, CallbackInfo callbackInfo) {
        if (((class05672)class080412.t().y().N()).i().isEmpty()) {
            class080412.method_18868().y(class05378.R);
            callbackInfo.cancel();
        }
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.R);
    }

    protected void N(class04782 class047822, class08041 class080412) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class047822, class080412, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class05946 var3 = class047822.method_27983();
        class07209 class072092 = class080412.method_24515();
        ArrayList arrayList = Lists.newArrayList();
        int n = 4;
        for (int i = -4; i <= 4; ++i) {
            for (int j = -2; j <= 2; ++j) {
                for (int k = -4; k <= 4; ++k) {
                    class07209 class072093 = class072092.method_10069(i, j, k);
                    if (!((class05672)class080412.t().y().N()).i().contains((Object)class047822.method_8320(class072093).i())) continue;
                    arrayList.add(class06289.N((class05946<class07299>)var3, class072093));
                }
            }
        }
        class01289 var7 = class080412.method_18868();
        if (!arrayList.isEmpty()) {
            var7.N(class05378.R, (Object)arrayList);
        } else {
            var7.y(class05378.R);
        }
    }
}

