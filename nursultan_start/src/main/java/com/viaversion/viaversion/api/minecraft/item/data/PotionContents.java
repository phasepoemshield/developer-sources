/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.EnumTypes
 *  com.viaversion.viaversion.api.minecraft.item.data.PotionEffect
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.EnumTypes;
import com.viaversion.viaversion.api.minecraft.item.data.PotionEffect;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record PotionContents(@Nullable Integer potion, @Nullable Integer customColor, PotionEffect[] customEffects, @Nullable String customName) implements Copyable
{
    public static final Type<PotionContents> TYPE1_20_5 = new Type<PotionContents>(PotionContents.class){

        @Override
        public void write(ByteBuf buffer, PotionContents value) {
            buffer.writeBoolean(value.potion != null);
            if (value.potion != null) {
                Types.VAR_INT.writePrimitive(buffer, value.potion.intValue());
            }
            buffer.writeBoolean(value.customColor != null);
            if (value.customColor != null) {
                buffer.writeInt(value.customColor.intValue());
            }
            PotionEffect.ARRAY_TYPE.write(buffer, value.customEffects);
        }

        @Override
        public PotionContents read(ByteBuf buffer) {
            Integer potion = buffer.readBoolean() ? Integer.valueOf(Types.VAR_INT.readPrimitive(buffer)) : null;
            Integer customColor = buffer.readBoolean() ? Integer.valueOf(buffer.readInt()) : null;
            PotionEffect[] customEffects = (PotionEffect[])PotionEffect.ARRAY_TYPE.read(buffer);
            return new PotionContents(potion, customColor, customEffects, null);
        }
    };
    public static final Type<PotionContents> TYPE1_21_2 = new Type<PotionContents>(PotionContents.class){

        @Override
        public void write(Ops ops, PotionContents value) {
            ops.writeMap(map -> map.writeOptional("potion", (Type)EnumTypes.POTION, (Object)value.potion).writeOptional("custom_color", (Type)Types.INT, (Object)value.customColor).writeOptional("custom_effects", PotionEffect.ARRAY_TYPE, (Object)value.customEffects, (Object)new PotionEffect[0]).writeOptional("custom_name", Types.STRING, (Object)value.customName));
        }

        @Override
        public void write(ByteBuf buffer, PotionContents value) {
            buffer.writeBoolean(value.potion != null);
            if (value.potion != null) {
                Types.VAR_INT.writePrimitive(buffer, value.potion.intValue());
            }
            buffer.writeBoolean(value.customColor != null);
            if (value.customColor != null) {
                buffer.writeInt(value.customColor.intValue());
            }
            PotionEffect.ARRAY_TYPE.write(buffer, value.customEffects);
            Types.OPTIONAL_STRING.write(buffer, value.customName);
        }

        @Override
        public PotionContents read(ByteBuf buffer) {
            Integer potion = buffer.readBoolean() ? Integer.valueOf(Types.VAR_INT.readPrimitive(buffer)) : null;
            Integer customColor = buffer.readBoolean() ? Integer.valueOf(buffer.readInt()) : null;
            PotionEffect[] customEffects = (PotionEffect[])PotionEffect.ARRAY_TYPE.read(buffer);
            String customName = (String)Types.OPTIONAL_STRING.read(buffer);
            return new PotionContents(potion, customColor, customEffects, customName);
        }
    };

    public PotionContents(@Nullable Integer potion, @Nullable Integer customColor, PotionEffect[] customEffects) {
        this(potion, customColor, customEffects, null);
    }

    public PotionContents copy() {
        return new PotionContents(this.potion, this.customColor, (PotionEffect[])Copyable.copy((Object)this.customEffects), this.customName);
    }
}

