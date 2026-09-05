/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class03063
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import minecraft.class00457;
import minecraft.class00734;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03063;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class08222;
import minecraft.class08230;
import org.apache.commons.lang3.mutable.MutableInt;

public class class08206
implements class01857 {
    private final class06202 N;

    public class08206(class06202 class062022) {
        this.N = class062022;
    }

    private static float N(long l, float f) {
        float f2 = 0.1f;
        return class04995.M((float)(f * (float)l)) * 0.9f + 0.1f;
    }

    private void N(class08222 class082222, int n, boolean bl, MutableInt mutableInt, boolean bl2) {
        class00734 class007342 = class082222.y();
        long l = Math.round(class007342.y() / 16.0);
        if (l == 1L) {
            mutableInt.add(1);
            int n2 = bl2 ? -16711936 : -1;
            class06724.N((String)String.valueOf(mutableInt.intValue()), (class06889)class007342.R(), (class06715)class06715.N((int)n2).N(4.8f));
        }
        long l2 = l + 5L;
        class06724.N((class00734)class007342.B(0.1 * (double)n), (class06747)class06747.N((int)class02566.N((float)(bl ? 0.4f : 1.0f), (float)class08206.N(l2, 0.3f), (float)class08206.N(l2, 0.8f), (float)class08206.N(l2, 0.5f))));
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class08230 class082302 = ((class03063)this.N.B_2).n().L();
        MutableInt mutableInt = new MutableInt(0);
        class082302.N((class082222, bl, n, bl2) -> this.N(class082222, n, bl, mutableInt, bl2), class013832, 32);
    }
}

