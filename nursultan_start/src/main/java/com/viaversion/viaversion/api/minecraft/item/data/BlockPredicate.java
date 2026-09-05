/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentMatchers
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentMatchers$DataComponentMatchersType
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate
 *  com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentMatchers;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate;
import com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;
import org.checkerframework.checker.nullness.qual.Nullable;

public record BlockPredicate(@Nullable HolderSet holderSet, StatePropertyMatcher @Nullable [] propertyMatchers, @Nullable CompoundTag tag, DataComponentMatchers dataMatchers) implements Copyable,
Rewritable
{
    public static final Type<BlockPredicate> TYPE1_20_5 = new /* Unavailable Anonymous Inner Class!! */;
    public static final Type<BlockPredicate[]> ARRAY_TYPE1_20_5 = new ArrayType(TYPE1_20_5);

    public BlockPredicate(@Nullable HolderSet holderSet, StatePropertyMatcher @Nullable [] propertyMatchers, @Nullable CompoundTag tag) {
        this(holderSet, propertyMatchers, tag, new DataComponentMatchers(new StructuredData[0], new DataComponentPredicate[0]));
    }

    public BlockPredicate copy() {
        return new BlockPredicate(this.holderSet, (StatePropertyMatcher[])Copyable.copy((Object)this.propertyMatchers), this.tag == null ? null : this.tag.copy());
    }

    public BlockPredicate rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        if (this.holderSet == null || this.holderSet.hasTagKey()) {
            return this;
        }
        HolderSet updatedHolders = this.holderSet.rewrite(Rewritable.blockRewriteFunction(protocol, (boolean)clientbound));
        return new BlockPredicate(updatedHolders, this.propertyMatchers, this.tag);
    }

    public static final class BlockPredicateType1_21_5
    extends Type<BlockPredicate> {
        private final Type<DataComponentMatchers> matchersType;

        public BlockPredicateType1_21_5(Type<StructuredData<?>[]> dataArrayType, Type<DataComponentPredicate[]> predicateArrayType) {
            super(BlockPredicate.class);
            this.matchersType = new DataComponentMatchers.DataComponentMatchersType(dataArrayType, predicateArrayType);
        }

        public void write(ByteBuf buffer, BlockPredicate value) {
            Types.OPTIONAL_HOLDER_SET.write(buffer, (Object)value.holderSet);
            buffer.writeBoolean(value.propertyMatchers != null);
            if (value.propertyMatchers != null) {
                StatePropertyMatcher.ARRAY_TYPE.write(buffer, (Object)value.propertyMatchers);
            }
            Types.OPTIONAL_COMPOUND_TAG.write(buffer, (Object)value.tag);
            this.matchersType.write(buffer, (Object)value.dataMatchers);
        }

        public BlockPredicate read(ByteBuf buffer) {
            HolderSet holders = (HolderSet)Types.OPTIONAL_HOLDER_SET.read(buffer);
            StatePropertyMatcher[] propertyMatchers = buffer.readBoolean() ? (StatePropertyMatcher[])StatePropertyMatcher.ARRAY_TYPE.read(buffer) : null;
            CompoundTag tag = (CompoundTag)Types.OPTIONAL_COMPOUND_TAG.read(buffer);
            DataComponentMatchers matchers = (DataComponentMatchers)this.matchersType.read(buffer);
            return new BlockPredicate(holders, propertyMatchers, tag, matchers);
        }
    }
}

