/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02666
 */
package minecraft;

import minecraft.class02477;
import minecraft.class02500;
import minecraft.class02666;

public interface class02465<T>
extends class02500 {
    public class02477<T> y();

    @Override
    default public boolean N(class02666 class026662) {
        Object object = class026662.method_58694(this.y());
        return object != null && this.N(object);
    }

    public boolean N(T var1);
}

