/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01894
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class08800;

public abstract class class01430<S extends class08800, M extends class06078<S>>
extends class06249<S, M> {
    protected abstract M L();

    public class01430(class06252<S, M> class062522) {
        super(class062522);
    }

    protected abstract float N(float var1);

    protected abstract class01894 N();

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        if (!this.N(s)) {
            return;
        }
        float f3 = ((class08800)s).P;
        M m = this.L();
        class012372.N(1).N(m, s, class014212, class06851.y((class01894)this.N(), (float)(this.N(f3) % 1.0f), (float)(f3 * 0.01f % 1.0f)), n, class01384.u, -8355712, null, ((class08800)s).l, null);
    }

    protected abstract boolean N(S var1);
}

