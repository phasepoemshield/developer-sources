/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import io.netty.buffer.ByteBuf;

public record WolfVariant(String wildTexture, String tameTexture, String angryTexture, HolderSet biomes) {
    public static HolderType<WolfVariant> TYPE = new HolderType<WolfVariant>(){

        public WolfVariant readDirect(ByteBuf buffer) {
            String wildTexture = (String)Types.STRING.read(buffer);
            String tameTexture = (String)Types.STRING.read(buffer);
            String angryTexture = (String)Types.STRING.read(buffer);
            HolderSet biomes = (HolderSet)Types.HOLDER_SET.read(buffer);
            return new WolfVariant(wildTexture, tameTexture, angryTexture, biomes);
        }

        public void writeDirect(ByteBuf buffer, WolfVariant variant) {
            Types.STRING.write(buffer, (Object)variant.wildTexture());
            Types.STRING.write(buffer, (Object)variant.tameTexture());
            Types.STRING.write(buffer, (Object)variant.angryTexture());
            Types.HOLDER_SET.write(buffer, (Object)variant.biomes());
        }
    };
}

