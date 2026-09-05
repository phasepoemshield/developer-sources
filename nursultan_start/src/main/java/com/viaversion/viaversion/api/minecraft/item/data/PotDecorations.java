/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.TransformingType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;

public record PotDecorations(int[] itemIds) implements Copyable,
Rewritable
{
    public static final Type<PotDecorations> TYPE = new TransformingType<int[], PotDecorations>(Types.VAR_INT_ARRAY_PRIMITIVE, PotDecorations.class, PotDecorations::new, PotDecorations::itemIds){

        public void write(Ops ops, PotDecorations value) {
            ops.writeList(list -> {
                for (int itemId : value.itemIds) {
                    list.write(Types.IDENTIFIER, (Object)ops.context().registryAccess().item(itemId));
                }
            });
        }
    };

    public PotDecorations(int backItem, int leftItem, int rightItem, int frontItem) {
        this(new int[]{backItem, leftItem, rightItem, frontItem});
    }

    public int backItem() {
        return this.item(0);
    }

    public int leftItem() {
        return this.item(1);
    }

    public int rightItem() {
        return this.item(2);
    }

    public int frontItem() {
        return this.item(3);
    }

    private int item(int index) {
        return index < 0 || index >= this.itemIds.length ? -1 : this.itemIds[index];
    }

    public PotDecorations rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        int[] newItems = new int[this.itemIds.length];
        for (int i = 0; i < this.itemIds.length; ++i) {
            newItems[i] = Rewritable.rewriteItem(protocol, (boolean)clientbound, (int)this.itemIds[i]);
        }
        return new PotDecorations(newItems);
    }

    public PotDecorations copy() {
        return new PotDecorations((int[])Copyable.copy((Object)this.itemIds));
    }
}

