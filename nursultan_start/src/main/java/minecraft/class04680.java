/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class06086
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04650;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class06086;
import org.jspecify.annotations.Nullable;

public interface class04680 {
    public static final Object y = new Object();
    public static final int L = 160;
    public static final int u = 32;

    default public int L() {
        return 160;
    }

    default public int M() {
        return class04995.R((int)this.u(), (int)32);
    }

    public class04650 i();

    default public int u() {
        return 32;
    }

    default public void y() {
    }

    default public float N(int n) {
        return n * this.u();
    }

    public void N(class06086 var1, long var2);

    default public float N(int n, float f) {
        return (float)n - (float)this.L() * f;
    }

    public void N(class01054 var1, class01590 var2, long var3);

    default public Object R() {
        return y;
    }

    default public @Nullable class04891 I_() {
        return null;
    }
}

