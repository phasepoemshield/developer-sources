/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00982
 *  minecraft.class00985
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class03358
 *  minecraft.class03662
 *  minecraft.class04811
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class08141
 *  minecraft.class08898
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00394;
import minecraft.class00982;
import minecraft.class00985;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class03662;
import minecraft.class04811;
import minecraft.class05847;
import minecraft.class05875;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class08141;
import minecraft.class08898;
import minecraft.class08943;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class05841
implements class03358<class05875, class00982> {
    private static final float N = 0.375f;
    private final class08943 y;

    public class05841(class04811 class048112) {
        this.y = class048112.L();
    }

    public void N(class00982 class009822, class01421 class014212, class01237 class012372, class06959 class069592) {
        class07211 class072112 = class009822.y;
        List var6 = class009822.N;
        for (int i = 0; i < var6.size(); ++i) {
            class08898 class088982 = (class08898)var6.get(i);
            if (class088982.i()) continue;
            class014212.N();
            class014212.N(0.5f, 0.44921875f, 0.5f);
            float f = -class07211.y((int)((i + class072112.u()) % 4)).U();
            class014212.N((Quaternionfc)class02058.u.N(f));
            class014212.N((Quaternionfc)class02058.y.N(90.0f));
            class014212.N(-0.3125f, -0.3125f, 0.0f);
            class014212.y(0.375f, 0.375f, 0.375f);
            class088982.N(class014212, class012372, class009822.Z, class01384.u, 0);
            class014212.y();
        }
    }

    public class00982 i() {
        return new class00982();
    }

    public void N(class05875 class058752, class00982 class009822, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class058752, (class00985)class009822, f, class068892, class081412);
        class009822.y = (class07211)class058752.w().L(class05847.i);
        int n = (int)class058752.d().method_10063();
        class009822.N = new ArrayList();
        for (int i = 0; i < class058752.N().size(); ++i) {
            class08898 class088982 = new class08898();
            this.y.N(class088982, (class06584)class058752.N().get(i), class03662.field_4319, class058752.G(), null, n + i);
            class009822.N.add(class088982);
        }
    }
}

