/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class01687
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02294
 *  minecraft.class02721
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06249
 *  minecraft.class06271
 *  minecraft.class08468
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01687;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02294;
import minecraft.class02721;
import minecraft.class04995;
import minecraft.class05522;
import minecraft.class06069;
import minecraft.class06249;
import minecraft.class06271;
import minecraft.class08468;
import org.joml.Quaternionfc;

public abstract class class05506<M extends class02721, S>
extends class06249<class08468, M> {
    private final class06271<S> N;
    private final S y;
    private final class01894 L;
    private final class05522 u;

    public class05506(class02294<?, class08468, M> class022942, class06271<S> class062712, S s, class01894 class018942, class05522 class055222) {
        super(class022942);
        this.N = class062712;
        this.y = s;
        this.L = class018942;
        this.u = class055222;
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2) {
        int n2 = this.N(class084682);
        if (n2 <= 0) {
            return;
        }
        class06069 class060692 = class06069.y((long)class084682.NO);
        for (int i = 0; i < n2; ++i) {
            class014212.N();
            class01686 class016862 = ((class02721)this.u()).N(class060692);
            class01687 class016872 = class016862.N(class060692);
            class016862.N(class014212);
            float f3 = class060692.z();
            float f4 = class060692.z();
            float f5 = class060692.z();
            if (this.u == class05522.field_53233) {
                switch (class060692.y(3)) {
                    case 0: {
                        f3 = class05506.N(f3);
                        break;
                    }
                    case 1: {
                        f4 = class05506.N(f4);
                        break;
                    }
                    default: {
                        f5 = class05506.N(f5);
                    }
                }
            }
            class014212.N(class04995.B((float)f3, (float)class016872.y, (float)class016872.i) / 16.0f, class04995.B((float)f4, (float)class016872.L, (float)class016872.R) / 16.0f, class04995.B((float)f5, (float)class016872.u, (float)class016872.M) / 16.0f);
            this.N(class014212, class012372, n, -(f3 * 2.0f - 1.0f), -(f4 * 2.0f - 1.0f), -(f5 * 2.0f - 1.0f), class084682.l);
            class014212.y();
        }
    }

    private static float N(float f) {
        return f > 0.5f ? 1.0f : 0.5f;
    }

    private void N(class01421 class014212, class01237 class012372, int n, float f, float f2, float f3, int n2) {
        float f4 = class04995.N((float)(f * f + f3 * f3));
        float f5 = (float)(Math.atan2(f, f3) * 57.2957763671875);
        float f6 = (float)(Math.atan2(f2, f4) * 57.2957763671875);
        class014212.N((Quaternionfc)class02058.u.N(f5 - 90.0f));
        class014212.N((Quaternionfc)class02058.R.N(f6));
        class012372.N(this.N, this.y, class014212, this.N.method_23500(this.L), n, class01384.u, n2, null);
    }

    protected abstract int N(class08468 var1);
}

