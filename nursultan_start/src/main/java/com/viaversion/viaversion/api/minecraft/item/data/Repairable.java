/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData$MappingType
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.types.misc.HolderSetType
 *  com.viaversion.viaversion.util.Rewritable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderSetType;
import com.viaversion.viaversion.util.Rewritable;

public record Repairable(HolderSet items) implements Rewritable
{
    public static final Type<Repairable> TYPE = new TransformingType<HolderSet, Repairable>(Types.HOLDER_SET, Repairable.class, Repairable::new, Repairable::items){

        @Override
        public void write(Ops ops, Repairable value) {
            ops.writeMap(map -> map.write("items", (Type)new HolderSetType((RegistryKey)MappingData.MappingType.ITEM), (Object)value.items));
        }
    };

    public Repairable rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        HolderSet items = this.items.rewrite(Rewritable.itemRewriteFunction(protocol, (boolean)clientbound));
        return this.items == items ? this : new Repairable(items);
    }
}

