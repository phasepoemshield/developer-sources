/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import minecraft.class00751;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class05946;

public interface class04116<T> {
    public class03529<T> N(class05946<T> var1, T var2, Lifecycle var3);

    default public class03529<T> N(class05946<T> class059462, T t) {
        return this.N(class059462, t, Lifecycle.stable());
    }

    public <S> class02055<S> N(class05946<? extends class00751<? extends S>> var1);
}

