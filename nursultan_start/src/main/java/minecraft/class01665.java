/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00426
 *  minecraft.class00429
 *  minecraft.class00431
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class05163
 *  minecraft.class06724
 *  minecraft.class06747
 */
package minecraft;

import minecraft.class00426;
import minecraft.class00429;
import minecraft.class00431;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class05163;
import minecraft.class06724;
import minecraft.class06747;

public class class01665
implements class01857 {
    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class004572.N(class00429.W, (T class073212, U list) -> {
            for (class00431 class004312 : list) {
                class06724.N((class00734)class00734.N((class05163)class004312.N()), (class06747)class06747.N((int)class02566.N((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f)));
                for (class00426 class004262 : class004312.y()) {
                    if (class004262.y()) {
                        class06724.N((class00734)class00734.N((class05163)class004262.N()), (class06747)class06747.N((int)class02566.N((float)1.0f, (float)0.0f, (float)1.0f, (float)0.0f)));
                        continue;
                    }
                    class06724.N((class00734)class00734.N((class05163)class004262.N()), (class06747)class06747.N((int)class02566.N((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f)));
                }
            }
        });
    }
}

