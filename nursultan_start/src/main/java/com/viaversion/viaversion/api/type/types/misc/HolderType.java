/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.data.MappingData$MappingType
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class HolderType<T>
extends Type<Holder<T>> {
    private final MappingData.MappingType mappingType;

    public abstract T readDirect(ByteBuf var1);

    protected HolderType() {
        this(null);
    }

    protected HolderType(MappingData.MappingType mappingType) {
        super(Holder.class);
        this.mappingType = mappingType;
    }

    public void write(Ops ops, Holder<T> value) {
        if (value.hasId()) {
            ops.write(Types.IDENTIFIER, (Object)this.identifier(ops, value.id()));
        } else {
            this.writeDirect(ops, value.value());
        }
    }

    public void write(ByteBuf buffer, Holder<T> object) {
        if (object.hasId()) {
            Types.VAR_INT.writePrimitive(buffer, object.id() + 1);
        } else {
            Types.VAR_INT.writePrimitive(buffer, 0);
            this.writeDirect(buffer, object.value());
        }
    }

    public Holder<T> read(ByteBuf buffer) {
        int id = Types.VAR_INT.readPrimitive(buffer) - 1;
        if (id == -1) {
            return Holder.of(this.readDirect(buffer));
        }
        return Holder.of((int)id);
    }

    protected Key identifier(Ops ops, int id) {
        Preconditions.checkArgument((this.mappingType != null ? 1 : 0) != 0, (Object)("Mapping type is not defined for this HolderType: " + ((Object)((Object)this)).getClass().getName()));
        return ops.context().registryAccess().key(this.mappingType, id);
    }

    public void writeDirect(Ops ops, T value) {
        throw new UnsupportedOperationException("Write operation not supported for type: " + this.getTypeName());
    }

    public abstract void writeDirect(ByteBuf var1, T var2);

    public static abstract class OptionalHolderType<T>
    extends HolderType<T> {
        private final HolderType<T> type;

        @Override
        public @Nullable T readDirect(ByteBuf buffer) {
            return this.type.readDirect(buffer);
        }

        protected OptionalHolderType(HolderType<T> type) {
            this.type = type;
        }

        @Override
        public void write(ByteBuf buffer, Holder<T> object) {
            if (object != null) {
                buffer.writeBoolean(true);
                super.write(buffer, object);
            } else {
                buffer.writeBoolean(false);
            }
        }

        @Override
        public Holder<T> read(ByteBuf buffer) {
            return buffer.readBoolean() ? super.read(buffer) : null;
        }

        @Override
        public void writeDirect(ByteBuf buffer, @Nullable T value) {
            this.type.writeDirect(buffer, value);
        }
    }
}

