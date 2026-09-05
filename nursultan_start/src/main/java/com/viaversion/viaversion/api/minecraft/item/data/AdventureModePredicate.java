/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate;
import com.viaversion.viaversion.api.minecraft.item.data.BlockPredicate;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record AdventureModePredicate(BlockPredicate[] predicates, boolean showInTooltip) implements Copyable,
Rewritable
{
    public static final Type<AdventureModePredicate> TYPE1_20_5 = new Type<AdventureModePredicate>(AdventureModePredicate.class){

        public void write(ByteBuf buffer, AdventureModePredicate value) {
            BlockPredicate.ARRAY_TYPE1_20_5.write(buffer, (Object)value.predicates);
            buffer.writeBoolean(value.showInTooltip);
        }

        public AdventureModePredicate read(ByteBuf buffer) {
            BlockPredicate[] predicates = (BlockPredicate[])BlockPredicate.ARRAY_TYPE1_20_5.read(buffer);
            boolean showInTooltip = buffer.readBoolean();
            return new AdventureModePredicate(predicates, showInTooltip);
        }
    };

    public AdventureModePredicate(BlockPredicate[] predicates) {
        this(predicates, true);
    }

    public AdventureModePredicate rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        BlockPredicate[] predicates = new BlockPredicate[this.predicates.length];
        for (int i = 0; i < predicates.length; ++i) {
            predicates[i] = this.predicates[i].rewrite(connection, protocol, clientbound);
        }
        return new AdventureModePredicate(predicates, this.showInTooltip);
    }

    public AdventureModePredicate copy() {
        return new AdventureModePredicate((BlockPredicate[])Copyable.copy((Object)this.predicates), this.showInTooltip);
    }

    public static final class AdventureModePredicateType1_21_5
    extends Type<AdventureModePredicate> {
        private final Type<BlockPredicate[]> blockPredicateType;

        public AdventureModePredicateType1_21_5(Type<StructuredData<?>[]> dataArrayType, Type<DataComponentPredicate[]> predicateArrayType) {
            super(AdventureModePredicate.class);
            this.blockPredicateType = new ArrayType((Type)new BlockPredicate.BlockPredicateType1_21_5(dataArrayType, predicateArrayType));
        }

        public void write(ByteBuf buffer, AdventureModePredicate value) {
            this.blockPredicateType.write(buffer, (Object)value.predicates);
        }

        public AdventureModePredicate read(ByteBuf buffer) {
            BlockPredicate[] predicates = (BlockPredicate[])this.blockPredicateType.read(buffer);
            return new AdventureModePredicate(predicates);
        }
    }
}

