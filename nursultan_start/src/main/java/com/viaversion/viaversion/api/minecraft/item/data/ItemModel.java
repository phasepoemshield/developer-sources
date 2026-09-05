/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.TransformingType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;

public record ItemModel(Key key) implements Rewritable
{
    public static final Type<ItemModel> TYPE = TransformingType.of((Type)Types.IDENTIFIER, ItemModel.class, ItemModel::new, ItemModel::key);

    public ItemModel rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        String type = this.key().toString();
        String mappedType = Rewritable.rewriteItem(protocol, (boolean)clientbound, (String)type);
        return mappedType == null || type.equals(mappedType) ? this : new ItemModel(Key.of((String)mappedType));
    }
}

