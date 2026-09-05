/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.data.MappingData$MappingType
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.VarIntArrayType;
import com.viaversion.viaversion.api.type.types.misc.RegistryValueType;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;

public class HolderSetType
extends Type<HolderSet> {
    private final RegistryKey registryKey;

    public HolderSetType() {
        this(null);
    }

    public HolderSetType(RegistryKey registryKey) {
        super(HolderSet.class);
        this.registryKey = registryKey;
    }

    public void write(Ops ops, HolderSet value) {
        if (value.hasTagKey()) {
            ops.write(Types.TAG_KEY, (Object)Key.of((String)value.tagKey()));
        } else {
            Preconditions.checkArgument((this.registryKey != null ? 1 : 0) != 0, (Object)"Cannot write HolderSet with direct ids without a mapping type");
            if (value.ids().length == 1) {
                ops.write(Types.IDENTIFIER, (Object)this.key(ops, value.ids()[0]));
                return;
            }
            ops.writeList(list -> {
                for (int id : value.ids()) {
                    list.write(Types.IDENTIFIER, (Object)this.key(ops, id));
                }
            });
        }
    }

    public void write(ByteBuf buffer, HolderSet object) {
        if (object.hasTagKey()) {
            Types.VAR_INT.writePrimitive(buffer, 0);
            Types.STRING.write(buffer, (Object)object.tagKey());
        } else {
            int[] values = object.ids();
            Types.VAR_INT.writePrimitive(buffer, values.length + 1);
            for (int value : values) {
                Types.VAR_INT.writePrimitive(buffer, value);
            }
        }
    }

    private Key key(Ops ops, int id) {
        RegistryKey registryKey = this.registryKey;
        if (registryKey instanceof MappingData.MappingType) {
            MappingData.MappingType mappingType = (MappingData.MappingType)registryKey;
            return ops.context().registryAccess().key(mappingType, id);
        }
        registryKey = this.registryKey;
        if (registryKey instanceof RegistryValueType) {
            RegistryValueType registryValueType = (RegistryValueType)registryKey;
            return Key.of((String)registryValueType.byId(id));
        }
        return ops.context().registryAccess().registryKey(this.registryKey.key().toString(), id);
    }

    public HolderSet read(ByteBuf buffer) {
        int size = Types.VAR_INT.readPrimitive(buffer) - 1;
        if (size == -1) {
            String tag = (String)Types.STRING.read(buffer);
            return HolderSet.of((String)tag);
        }
        return HolderSet.of((int[])new VarIntArrayType(size).read(buffer));
    }

    public static final class OptionalHolderSetType
    extends OptionalType<HolderSet> {
        public OptionalHolderSetType() {
            super(Types.HOLDER_SET);
        }
    }
}

