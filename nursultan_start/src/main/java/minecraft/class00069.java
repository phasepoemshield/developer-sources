/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import minecraft.class00051;

public interface class00069 {
    public static final Codec<class00069> N = class00051.field_60142.dispatch(class00069::N, class000512 -> class000512.field_60144);

    public void N(Std140Builder var1);

    public class00051 N();

    public void N(Std140SizeCalculator var1);
}

