/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01295
 *  minecraft.class04654
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01295;
import minecraft.class02109;
import minecraft.class02123;
import minecraft.class04654;
import org.jspecify.annotations.Nullable;

public interface class02106 {
    public void N(boolean var1);

    public class04654 N();

    public static class02106 N(class04654 class046542, class01295 ... class01295Array) {
        class02106 class021062 = class02106.N(class046542);
        class01295[] class01295Array2 = class01295Array;
        int n = class01295Array2.length;
        for (int i = 0; i < n; ++i) {
            class021062 = class02106.N(class01295Array2[i], class021062);
        }
        return class021062;
    }

    public static @Nullable class02106 N(class01295 class012952, @Nullable class02106 class021062) {
        if (class021062 == null) {
            return null;
        }
        return new class02123(class012952, class021062);
    }

    public static class02106 N(class04654 class046542) {
        return new class02109(class046542);
    }
}

