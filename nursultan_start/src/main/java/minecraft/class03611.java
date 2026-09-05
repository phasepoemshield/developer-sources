/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00964
 *  minecraft.class00985
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01965
 *  minecraft.class02058
 *  minecraft.class03063
 *  minecraft.class03082
 *  minecraft.class03358
 *  minecraft.class03662
 *  minecraft.class04811
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class08092
 *  minecraft.class08141
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00964;
import minecraft.class00985;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01965;
import minecraft.class02058;
import minecraft.class03063;
import minecraft.class03082;
import minecraft.class03358;
import minecraft.class03662;
import minecraft.class04811;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class08092;
import minecraft.class08141;
import minecraft.class08943;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class03611
implements class03358<class01965, class00964> {
    private final class08943 N;

    public class03611(class04811 class048112) {
        this.N = class048112.L();
    }

    private float[] N(class07211 class072112, int n) {
        float[] fArray = new float[]{0.5f, 0.0f, 0.5f};
        float f = (float)n / 10.0f * 0.75f;
        switch (class072112) {
            case field_11034: {
                fArray[0] = 0.73f + f;
                break;
            }
            case field_11039: {
                fArray[0] = 0.25f - f;
                break;
            }
            case field_11036: {
                fArray[1] = 0.25f + f;
                break;
            }
            case field_11033: {
                fArray[1] = -0.23f - f;
                break;
            }
            case field_11043: {
                fArray[2] = 0.25f - f;
                break;
            }
            case field_11035: {
                fArray[2] = 0.73f + f;
            }
        }
        return fArray;
    }

    public class00964 i() {
        return new class00964();
    }

    public void N(class00964 class009642, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class009642.y <= 0 || class009642.L == null || class009642.N.i()) {
            return;
        }
        class014212.N();
        class014212.N(0.0f, 0.5f, 0.0f);
        float[] fArray = this.N(class009642.L, class009642.y);
        class014212.N(fArray[0], fArray[1], fArray[2]);
        class014212.N((Quaternionfc)class02058.u.N(75.0f));
        boolean bl = class009642.L == class07211.field_11034 || class009642.L == class07211.field_11039;
        class014212.N((Quaternionfc)class02058.u.N((float)((bl ? 90 : 0) + 11)));
        class014212.y(0.5f, 0.5f, 0.5f);
        class009642.N.N(class014212, class012372, class009642.Z, class01384.u, 0);
        class014212.y();
    }

    public void N(class01965 class019652, class00964 class009642, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class019652, (class00985)class009642, f, class068892, class081412);
        class009642.L = class019652.L();
        class009642.y = (Integer)class019652.w().L((class08092)class06665.yk);
        if (class019652.G() != null && class019652.L() != null) {
            class009642.Z = class03063.N((class03082)class03082.N, (class07295)class019652.G(), (class00500)class019652.w(), (class07209)class019652.d().method_10093(class019652.L()));
        }
        this.N.N(class009642.N, class019652.u(), class03662.field_4319, class019652.G(), null, 0);
    }
}

