/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00040;
import minecraft.class00044;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;

public final class class06977 {
    private static @Nullable class00044 N;
    private static @Nullable class04911 y;

    private static boolean N(class09033 class090332) {
        return N == null || !class090332.L(N);
    }

    private static void N(class09033 class090332, class04911 class049112) {
        if (y != class049112) {
            y = class049112;
            if (N != null) {
                class090332.y(N);
            }
        }
    }

    public static void N(class09033 class090332, class04911 class049112, float f) {
        class06977.N(class090332, class049112);
        if (class06977.N(class090332)) {
            class04891 class048912;
            switch (class049112) {
                case field_15247: {
                    class04891 class048913 = (class04891)class04909.nw.N();
                    break;
                }
                case field_15252: {
                    class04891 class048913 = class04909.TM;
                    break;
                }
                case field_15245: {
                    class04891 class048913 = class04909.WD;
                    break;
                }
                case field_15251: {
                    class04891 class048913 = class04909.Jo;
                    break;
                }
                case field_15254: {
                    class04891 class048913 = class04909.BM;
                    break;
                }
                case field_15248: {
                    class04891 class048913 = (class04891)class04909.EF.N();
                    break;
                }
                case field_15256: {
                    class04891 class048913 = (class04891)class04909.B.N();
                    break;
                }
                case field_61058: {
                    class04891 class048913 = (class04891)class04909.OK.N();
                    break;
                }
                default: {
                    class04891 class048913 = class048912 = class04909.vk;
                }
            }
            if (class048912 != class04909.vk) {
                N = class00040.N((class04891)class048912, (float)1.0f, (float)f);
                class090332.N(N);
            }
        }
    }
}

