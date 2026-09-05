/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.EntityData;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record Bee(EntityData entityData, int ticksInHive, int minTicksInHive) implements Copyable
{
    public static final Type<Bee> TYPE1_20_5 = new Type<Bee>(Bee.class){

        public void write(Ops ops, Bee value) {
            ops.writeMap(map -> map.writeOptional("entity_data", Types.COMPOUND_TAG, (Object)value.entityData.tag(), (Object)new CompoundTag()).write("ticks_in_hive", (Type)Types.INT, (Object)value.ticksInHive).write("min_ticks_in_hive", (Type)Types.INT, (Object)value.minTicksInHive));
        }

        public void write(ByteBuf buffer, Bee value) {
            Types.COMPOUND_TAG.write(buffer, (Object)value.entityData.tag());
            Types.VAR_INT.writePrimitive(buffer, value.ticksInHive);
            Types.VAR_INT.writePrimitive(buffer, value.minTicksInHive);
        }

        public Bee read(ByteBuf buffer) {
            CompoundTag entityData = (CompoundTag)Types.COMPOUND_TAG.read(buffer);
            int ticksInHive = Types.VAR_INT.readPrimitive(buffer);
            int minTicksInHive = Types.VAR_INT.readPrimitive(buffer);
            return new Bee(new EntityData(-1, entityData), ticksInHive, minTicksInHive);
        }
    };
    public static final Type<Bee[]> ARRAY_TYPE1_20_5 = new ArrayType(TYPE1_20_5);
    public static final Type<Bee> TYPE1_21_9 = new Type<Bee>(Bee.class){

        public void write(Ops ops, Bee value) {
            ops.writeMap(map -> map.write("entity_data", EntityData.TYPE, (Object)value.entityData).write("ticks_in_hive", (Type)Types.INT, (Object)value.ticksInHive).write("min_ticks_in_hive", (Type)Types.INT, (Object)value.minTicksInHive));
        }

        public void write(ByteBuf buffer, Bee value) {
            EntityData.TYPE.write(buffer, (Object)value.entityData);
            Types.VAR_INT.writePrimitive(buffer, value.ticksInHive);
            Types.VAR_INT.writePrimitive(buffer, value.minTicksInHive);
        }

        public Bee read(ByteBuf buffer) {
            EntityData entityData = (EntityData)((Object)EntityData.TYPE.read(buffer));
            int ticksInHive = Types.VAR_INT.readPrimitive(buffer);
            int minTicksInHive = Types.VAR_INT.readPrimitive(buffer);
            return new Bee(entityData, ticksInHive, minTicksInHive);
        }
    };
    public static final Type<Bee[]> ARRAY_TYPE1_21_9 = new ArrayType(TYPE1_21_9);

    public Bee(CompoundTag entityData, int ticksInHive, int minTicksInHive) {
        this(new EntityData(-1, entityData), ticksInHive, minTicksInHive);
    }

    public Bee copy() {
        return new Bee(this.entityData.copy(), this.ticksInHive, this.minTicksInHive);
    }
}

