/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package minecraft;

import minecraft.class00308;
import minecraft.class03556;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

public interface class00287<T>
extends class00308<T> {
    public T y(class06584 var1);

    default public T N(class06581 class065812) {
        return this.y(new class06584((class07310)class065812));
    }

    default public T N(class03556<class06581> class035562) {
        return this.y(new class06584(class035562));
    }
}

