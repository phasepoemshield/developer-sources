/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08446
 *  minecraft.class08800
 *  minecraft.class08810
 *  minecraft.class08898
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class00717;
import minecraft.class00734;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08446;
import minecraft.class08800;
import minecraft.class08810;
import minecraft.class08898;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class02893
extends class04507<class00717, class08446> {
    private static final float N = 0.0625f;
    private static final float y = 0.15f;
    private static final float L = 0.0625f;
    private final class08943 u;
    private final class06069 i = class06069.u();

    public class02893(class04832 class048322) {
        super(class048322);
        this.u = class048322.y();
        this.field_4673 = 0.15f;
        this.field_4672 = 0.75f;
    }

    public static void y(class01421 class014212, class01237 class012372, int n, class08810 class088102, class06069 class060692) {
        class00734 class007342 = class088102.y.M();
        int n2 = class088102.L;
        if (n2 == 0) {
            return;
        }
        class060692.N((long)class088102.u);
        class08898 class088982 = class088102.y;
        float f = (float)class007342.u();
        if (f > 0.0625f) {
            class088982.N(class014212, class012372, n, class01384.u, class088102.l);
            for (int i = 1; i < n2; ++i) {
                class014212.N();
                float f2 = (class060692.z() * 2.0f - 1.0f) * 0.15f;
                float f3 = (class060692.z() * 2.0f - 1.0f) * 0.15f;
                float f4 = (class060692.z() * 2.0f - 1.0f) * 0.15f;
                class014212.N(f2, f3, f4);
                class088982.N(class014212, class012372, n, class01384.u, class088102.l);
                class014212.y();
            }
        } else {
            float f5 = f * 1.5f;
            class014212.N(0.0f, 0.0f, -(f5 * (float)(n2 - 1) / 2.0f));
            class088982.N(class014212, class012372, n, class01384.u, class088102.l);
            class014212.N(0.0f, 0.0f, f5);
            for (int i = 1; i < n2; ++i) {
                class014212.N();
                float f6 = (class060692.z() * 2.0f - 1.0f) * 0.15f * 0.5f;
                float f7 = (class060692.z() * 2.0f - 1.0f) * 0.15f * 0.5f;
                class014212.N(f6, f7, 0.0f);
                class088982.N(class014212, class012372, n, class01384.u, class088102.l);
                class014212.y();
                class014212.N(0.0f, 0.0f, f5);
            }
        }
    }

    public static void N(class01421 class014212, class01237 class012372, int n, class08810 class088102, class06069 class060692) {
        class02893.N(class014212, class012372, n, class088102, class060692, class088102.y.M());
    }

    public static void N(class01421 class014212, class01237 class012372, int n, class08810 class088102, class06069 class060692, class00734 class007342) {
        int n2 = class088102.L;
        if (n2 == 0) {
            return;
        }
        class060692.N((long)class088102.u);
        class08898 class088982 = class088102.y;
        float f = (float)class007342.u();
        if (f > 0.0625f) {
            class088982.N(class014212, class012372, n, class01384.u, class088102.l);
            for (int i = 1; i < n2; ++i) {
                class014212.N();
                float f2 = (class060692.z() * 2.0f - 1.0f) * 0.15f;
                float f3 = (class060692.z() * 2.0f - 1.0f) * 0.15f;
                float f4 = (class060692.z() * 2.0f - 1.0f) * 0.15f;
                class014212.N(f2, f3, f4);
                class088982.N(class014212, class012372, n, class01384.u, class088102.l);
                class014212.y();
            }
        } else {
            float f5 = f * 1.5f;
            class014212.N(0.0f, 0.0f, -(f5 * (float)(n2 - 1) / 2.0f));
            class088982.N(class014212, class012372, n, class01384.u, class088102.l);
            class014212.N(0.0f, 0.0f, f5);
            for (int i = 1; i < n2; ++i) {
                class014212.N();
                float f6 = (class060692.z() * 2.0f - 1.0f) * 0.15f * 0.5f;
                float f7 = (class060692.z() * 2.0f - 1.0f) * 0.15f * 0.5f;
                class014212.N(f6, f7, 0.0f);
                class088982.N(class014212, class012372, n, class01384.u, class088102.l);
                class014212.y();
                class014212.N(0.0f, 0.0f, f5);
            }
        }
    }

    public class08446 method_55269() {
        return new class08446();
    }

    public void method_62354(class00717 class007172, class08446 class084462, float f) {
        super.method_62354((class07049)class007172, (class08800)class084462, f);
        class084462.N = class007172.y;
        class084462.N((class07049)class007172, class007172.N(), this.u);
    }

    public void method_3936(class08446 class084462, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class084462.y.i()) {
            return;
        }
        class014212.N();
        class00734 class007342 = class084462.y.M();
        float f = -((float)class007342.y) + 0.0625f;
        float f2 = class04995.m((double)(class084462.P / 10.0f + class084462.N)) * 0.1f + 0.1f;
        class014212.N(0.0f, f2 + f, 0.0f);
        float f3 = class00717.N((float)class084462.P, (float)class084462.N);
        class014212.N((Quaternionfc)class02058.u.rotation(f3));
        class02893.N(class014212, class012372, class084462.G, (class08810)class084462, this.i, class007342);
        class014212.y();
        super.method_3936((class08800)class084462, class014212, class012372, class069592);
    }
}

