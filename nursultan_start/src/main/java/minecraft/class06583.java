/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class03704
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class03704;
import minecraft.class06516;
import minecraft.class06588;
import minecraft.class06915;

public interface class06583<T extends class06516> {
    public void y(class03704 var1, class06588<T> var2);

    default public class06915<T> N(T t) {
        return new class06915(this, t);
    }

    public Codec<T> N();

    public void N(class03704 var1);

    public void N(class03704 var1, class06588<T> var2);
}

