/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  minecraft.class00891
 *  minecraft.class01339
 *  minecraft.class04206
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.block.v1.FabricBlockState
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import minecraft.class00891;
import minecraft.class01339;
import minecraft.class04206;
import minecraft.class08092;
import net.fabricmc.fabric.api.block.v1.FabricBlockState;

public class class00500
extends class01339
implements FabricBlockState {
    public static final Codec<class00500> N = class00500.N((Codec)class04206.i.T(), class00891::W).stable();

    public class00500(class00891 class008912, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> reference2ObjectArrayMap, MapCodec<class00500> mapCodec) {
        super(class008912, reference2ObjectArrayMap, mapCodec);
    }

    protected class00500 N() {
        return this;
    }
}

