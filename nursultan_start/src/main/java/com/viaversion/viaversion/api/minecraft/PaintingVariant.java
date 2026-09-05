/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record PaintingVariant(int width, int height, String assetId, @Nullable Tag title, @Nullable Tag author) {
    public static HolderType<PaintingVariant> TYPE1_21 = new HolderType<PaintingVariant>(){

        public PaintingVariant readDirect(ByteBuf buffer) {
            int width = Types.VAR_INT.readPrimitive(buffer);
            int height = Types.VAR_INT.readPrimitive(buffer);
            String assetId = (String)Types.STRING.read(buffer);
            return new PaintingVariant(width, height, assetId);
        }

        public void writeDirect(ByteBuf buffer, PaintingVariant variant) {
            Types.VAR_INT.writePrimitive(buffer, variant.width());
            Types.VAR_INT.writePrimitive(buffer, variant.height());
            Types.STRING.write(buffer, (Object)variant.assetId());
        }
    };
    public static HolderType<PaintingVariant> TYPE1_21_2 = new HolderType<PaintingVariant>(){

        public PaintingVariant readDirect(ByteBuf buffer) {
            int width = Types.VAR_INT.readPrimitive(buffer);
            int height = Types.VAR_INT.readPrimitive(buffer);
            String assetId = (String)Types.STRING.read(buffer);
            Tag title = (Tag)Types.TRUSTED_OPTIONAL_TAG.read(buffer);
            Tag author = (Tag)Types.TRUSTED_OPTIONAL_TAG.read(buffer);
            return new PaintingVariant(width, height, assetId, title, author);
        }

        protected Key identifier(Ops ops, int id) {
            return ops.context().registryAccess().registryKey("painting_variant", id);
        }

        public void writeDirect(Ops ops, PaintingVariant value) {
            ops.writeMap(map -> map.write("width", (Type)Types.INT, (Object)value.width()).write("height", (Type)Types.INT, (Object)value.height()).write("asset_id", Types.IDENTIFIER, (Object)Key.of((String)value.assetId())).writeOptional("title", Types.TRUSTED_TAG, (Object)value.title()).writeOptional("author", Types.TRUSTED_TAG, (Object)value.author()));
        }

        public void writeDirect(ByteBuf buffer, PaintingVariant variant) {
            Types.VAR_INT.writePrimitive(buffer, variant.width());
            Types.VAR_INT.writePrimitive(buffer, variant.height());
            Types.STRING.write(buffer, (Object)variant.assetId());
            Types.TRUSTED_OPTIONAL_TAG.write(buffer, (Object)variant.title());
            Types.TRUSTED_OPTIONAL_TAG.write(buffer, (Object)variant.author());
        }
    };

    public PaintingVariant(int width, int height, String assetId) {
        this(width, height, assetId, null, null);
    }
}

