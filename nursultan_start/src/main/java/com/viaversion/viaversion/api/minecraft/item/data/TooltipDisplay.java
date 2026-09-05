/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.libs.fastutil.ints.IntBidirectionalIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.IntBidirectionalIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record TooltipDisplay(boolean hideTooltip, IntSortedSet hiddenComponents) implements Rewritable
{
    public static final Type<TooltipDisplay> TYPE = new Type<TooltipDisplay>(TooltipDisplay.class){

        @Override
        public void write(Ops ops, TooltipDisplay value) {
            Key[] hiddenComponents = (Key[])value.hiddenComponents.intStream().mapToObj(id -> ops.context().registryAccess().dataComponentType(id)).toArray(Key[]::new);
            ops.writeMap(map -> map.writeOptional("hide_tooltip", (Type)Types.BOOLEAN, (Object)value.hideTooltip, (Object)false).writeOptional("hidden_components", Types.IDENTIFIER_ARRAY, (Object)hiddenComponents, (Object)new Key[0]));
        }

        @Override
        public void write(ByteBuf buffer, TooltipDisplay value) {
            buffer.writeBoolean(value.hideTooltip());
            Types.VAR_INT.writePrimitive(buffer, value.hiddenComponents().size());
            IntBidirectionalIterator intBidirectionalIterator = value.hiddenComponents().iterator();
            while (intBidirectionalIterator.hasNext()) {
                int hiddenComponent = (Integer)intBidirectionalIterator.next();
                Types.VAR_INT.writePrimitive(buffer, hiddenComponent);
            }
        }

        @Override
        public TooltipDisplay read(ByteBuf buffer) {
            boolean hideTooltip = buffer.readBoolean();
            IntLinkedOpenHashSet hiddenComponents = new IntLinkedOpenHashSet();
            int size = Types.VAR_INT.readPrimitive(buffer);
            for (int i = 0; i < size; ++i) {
                hiddenComponents.add(Types.VAR_INT.readPrimitive(buffer));
            }
            return new TooltipDisplay(hideTooltip, (IntSortedSet)hiddenComponents);
        }
    };

    public TooltipDisplay rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        if (this.hiddenComponents.isEmpty()) {
            return this;
        }
        IntLinkedOpenHashSet newHiddenComponents = new IntLinkedOpenHashSet();
        IntBidirectionalIterator intBidirectionalIterator = this.hiddenComponents.iterator();
        while (intBidirectionalIterator.hasNext()) {
            int hiddenComponent = (Integer)intBidirectionalIterator.next();
            int mappedId = Rewritable.rewriteDataComponentType(protocol, (boolean)clientbound, (int)hiddenComponent);
            if (mappedId == -1) continue;
            newHiddenComponents.add(mappedId);
        }
        return new TooltipDisplay(this.hideTooltip, (IntSortedSet)newHiddenComponents);
    }
}

