/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00336;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public interface class00372<T> {
    public @Nullable T y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5);

    public Codec<T> y();

    public class00336<? extends class00372<T>, T> N();
}

