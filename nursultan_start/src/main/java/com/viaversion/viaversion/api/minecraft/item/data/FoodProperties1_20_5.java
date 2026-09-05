/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5$FoodEffect
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.FoodProperties1_20_5;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record FoodProperties1_20_5(int nutrition, float saturationModifier, boolean canAlwaysEat, float eatSeconds, @Nullable Item usingConvertsTo, FoodEffect[] possibleEffects) implements Copyable
{
    public static final Type<FoodProperties1_20_5> TYPE1_20_5 = new Type<FoodProperties1_20_5>(FoodProperties1_20_5.class){

        public void write(ByteBuf buffer, FoodProperties1_20_5 value) {
            Types.VAR_INT.writePrimitive(buffer, value.nutrition);
            buffer.writeFloat(value.saturationModifier);
            buffer.writeBoolean(value.canAlwaysEat);
            buffer.writeFloat(value.eatSeconds);
            FoodEffect.ARRAY_TYPE.write(buffer, (Object)value.possibleEffects);
        }

        public FoodProperties1_20_5 read(ByteBuf buffer) {
            int nutrition = Types.VAR_INT.readPrimitive(buffer);
            float saturationModifier = buffer.readFloat();
            boolean canAlwaysEat = buffer.readBoolean();
            float eatSeconds = buffer.readFloat();
            FoodEffect[] possibleEffects = (FoodEffect[])FoodEffect.ARRAY_TYPE.read(buffer);
            return new FoodProperties1_20_5(nutrition, saturationModifier, canAlwaysEat, eatSeconds, null, possibleEffects);
        }
    };
    public static final Type<FoodProperties1_20_5> TYPE1_21 = new Type<FoodProperties1_20_5>(FoodProperties1_20_5.class){

        public void write(ByteBuf buffer, FoodProperties1_20_5 value) {
            Types.VAR_INT.writePrimitive(buffer, value.nutrition);
            buffer.writeFloat(value.saturationModifier);
            buffer.writeBoolean(value.canAlwaysEat);
            buffer.writeFloat(value.eatSeconds);
            VersionedTypes.V1_21.optionalItem.write(buffer, (Object)value.usingConvertsTo);
            FoodEffect.ARRAY_TYPE.write(buffer, (Object)value.possibleEffects);
        }

        public FoodProperties1_20_5 read(ByteBuf buffer) {
            int nutrition = Types.VAR_INT.readPrimitive(buffer);
            float saturationModifier = buffer.readFloat();
            boolean canAlwaysEat = buffer.readBoolean();
            float eatSeconds = buffer.readFloat();
            Item usingConvertsTo = (Item)VersionedTypes.V1_21.optionalItem.read(buffer);
            FoodEffect[] possibleEffects = (FoodEffect[])FoodEffect.ARRAY_TYPE.read(buffer);
            return new FoodProperties1_20_5(nutrition, saturationModifier, canAlwaysEat, eatSeconds, usingConvertsTo, possibleEffects);
        }
    };

    public FoodProperties1_20_5 copy() {
        return new FoodProperties1_20_5(this.nutrition, this.saturationModifier, this.canAlwaysEat, this.eatSeconds, (Item)(this.usingConvertsTo == null ? null : this.usingConvertsTo.copy()), (FoodEffect[])Copyable.copy((Object)this.possibleEffects));
    }
}

