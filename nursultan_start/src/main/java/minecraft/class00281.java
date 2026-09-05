/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01328
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class07078
 *  minecraft.class07309
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00734;
import minecraft.class01328;
import minecraft.class03530;
import minecraft.class04782;
import minecraft.class07078;
import minecraft.class07309;
import minecraft.class07438;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public interface class00281
extends class07309 {
    default public <T extends class07438> List<T> N(Class<T> clazz, class01328 class013282, class07438 class074383, class00734 class007342) {
        List list = this.N(clazz, class007342, class074382 -> true);
        ArrayList<class07438> arrayList = new ArrayList<class07438>();
        for (class07438 class074384 : list) {
            if (!class013282.N(this.method_8410(), class074383, class074384)) continue;
            arrayList.add(class074384);
        }
        return arrayList;
    }

    default public List<class08036> N(class01328 class013282, class07438 class074382, class00734 class007342) {
        ArrayList<class08036> arrayList = new ArrayList<class08036>();
        for (class08036 class080362 : this.method_18456()) {
            if (!class007342.i(class080362.method_23317(), class080362.method_23318(), class080362.method_23321()) || !class013282.N(this.method_8410(), class074382, (class07438)class080362)) continue;
            arrayList.add(class080362);
        }
        return arrayList;
    }

    default public <T extends class07438> @Nullable T N(List<? extends T> list, class01328 class013282, @Nullable class07438 class074382, double d, double d2, double d3) {
        double d4 = -1.0;
        class07438 class074383 = null;
        for (class07438 class074384 : list) {
            if (!class013282.N(this.method_8410(), class074382, class074384)) continue;
            double d5 = class074384.method_5649(d, d2, d3);
            if (d4 != -1.0 && !(d5 < d4)) continue;
            d4 = d5;
            class074383 = class074384;
        }
        return (T)class074383;
    }

    default public @Nullable class08036 N(class01328 class013282, class07438 class074382) {
        return (class08036)this.N(this.method_18456(), class013282, class074382, class074382.method_23317(), class074382.method_23318(), class074382.method_23321());
    }

    default public @Nullable class08036 N(class01328 class013282, class07438 class074382, double d, double d2, double d3) {
        return (class08036)this.N(this.method_18456(), class013282, class074382, d, d2, d3);
    }

    default public @Nullable class08036 N(class01328 class013282, double d, double d2, double d3) {
        return (class08036)this.N(this.method_18456(), class013282, null, d, d2, d3);
    }

    default public <T extends class07438> @Nullable T N(Class<? extends T> clazz, class01328 class013282, @Nullable class07438 class074383, double d, double d2, double d3, class00734 class007342) {
        return this.N(this.N(clazz, class007342, class074382 -> true), class013282, class074383, d, d2, d3);
    }

    default public @Nullable class07438 N(class03530<class07078<?>> class035302, class01328 class013282, @Nullable class07438 class074383, double d, double d2, double d3, class00734 class007342) {
        double d4 = Double.MAX_VALUE;
        class07438 class074384 = null;
        for (class07438 class074385 : this.N(class07438.class, class007342, class074382 -> class074382.method_5864().N(class035302))) {
            double d5;
            if (!class013282.N(this.method_8410(), class074383, class074385) || !((d5 = class074385.method_5649(d, d2, d3)) < d4)) continue;
            d4 = d5;
            class074384 = class074385;
        }
        return class074384;
    }

    public class04782 method_8410();
}

