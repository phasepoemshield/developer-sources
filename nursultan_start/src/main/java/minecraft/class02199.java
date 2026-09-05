/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01128
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class01128;
import minecraft.class07078;
import minecraft.class07438;

@FunctionalInterface
public interface class02199 {
    public int count(int var1);

    public static class02199 N(class07438 class074382) {
        return n -> {
            ArrayList arrayList = new ArrayList();
            class074382.method_73183().method_47575((class01128)class07078.ys, class074382.method_5829().M(2.0), class071622 -> class071622 != class074382, arrayList, n);
            return arrayList.size();
        };
    }
}

