/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.type.types.item;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.item.StructuredDataTypeBase;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import org.checkerframework.checker.nullness.qual.Nullable;

public class StructuredDataType
extends Type<StructuredData<?>>
implements StructuredDataTypeBase {
    private StructuredDataKey<?>[] types;

    public StructuredDataType() {
        super(StructuredData.class);
    }

    public void write(Ops ops, StructuredData<?> data) {
        if (data.isPresent() && ops.context().isSupported(data.key())) {
            this.writeGeneric(ops, data);
        }
    }

    @Override
    public void write(ByteBuf buffer, StructuredData<?> object) {
        Types.VAR_INT.writePrimitive(buffer, object.id());
        object.write(buffer);
    }

    @Override
    public @Nullable StructuredDataKey<?> key(int id) {
        return id >= 0 && id < this.types.length ? this.types[id] : null;
    }

    @Override
    public StructuredData<?> read(ByteBuf buffer) {
        Preconditions.checkNotNull(this.types, (Object)"StructuredDataType has not been initialized");
        int id = Types.VAR_INT.readPrimitive(buffer);
        StructuredDataKey<?> key = this.key(id);
        if (key == null) {
            throw new IllegalArgumentException("No data component serializer found for id " + id);
        }
        return this.readData(buffer, key, id);
    }

    public DataFiller filler(Protocol<?, ?, ?, ?> protocol) {
        DataFiller filler = new DataFiller(protocol);
        if (protocol.mappedTypes() != null) {
            filler.add(protocol.mappedTypes().structuredDataKeys().keys());
        }
        return filler;
    }

    <T> StructuredData<T> readData(ByteBuf buffer, StructuredDataKey<T> key, int id) {
        return StructuredData.of(key, (Object)key.type().read(buffer), (int)id);
    }

    private <V> void writeGeneric(Ops ops, StructuredData<V> data) {
        data.key().type().write(ops, data.value());
    }

    public final class DataFiller {
        private final FullMappings mappings;

        private DataFiller(Protocol<?, ?, ?, ?> protocol) {
            this.mappings = protocol.getMappingData().getDataComponentSerializerMappings();
            Preconditions.checkArgument((this.mappings != null ? 1 : 0) != 0, (String)"No mappings found for protocol %s", (Object[])new Object[]{protocol.getClass()});
            Preconditions.checkArgument((StructuredDataType.this.types == null ? 1 : 0) != 0, (Object)"StructuredDataType has already been initialized");
            StructuredDataType.this.types = new StructuredDataKey[this.mappings.mappedSize()];
        }

        public DataFiller add(Collection<StructuredDataKey<?>> keys) {
            for (StructuredDataKey<?> key : keys) {
                this.add(key);
            }
            return this;
        }

        public DataFiller add(StructuredDataKey<?> ... keys) {
            for (StructuredDataKey<?> key : keys) {
                this.add(key);
            }
            return this;
        }

        public DataFiller add(StructuredDataKey<?> key) {
            int id = this.mappings.mappedId(key.identifier());
            Preconditions.checkArgument((id != -1 ? 1 : 0) != 0, (String)"No mapped id found for %s", (Object[])new Object[]{key.identifier()});
            Preconditions.checkArgument((StructuredDataType.this.types[id] == null ? 1 : 0) != 0, (String)"Data component serializer already exists for id %s", (Object[])new Object[]{id});
            StructuredDataType.this.types[id] = key;
            return this;
        }
    }
}

