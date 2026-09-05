/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.data.predicate;

import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public record DataComponentMatchers(StructuredData<?>[] exactPredicates, DataComponentPredicate[] predicates) {

    public static final class DataComponentMatchersType
    extends Type<DataComponentMatchers> {
        private final Type<StructuredData<?>[]> dataArrayType;
        private final Type<DataComponentPredicate[]> predicateArrayType;

        public DataComponentMatchersType(Type<StructuredData<?>[]> dataArrayType, Type<DataComponentPredicate[]> predicateArrayType) {
            super(DataComponentMatchers.class);
            this.dataArrayType = dataArrayType;
            this.predicateArrayType = predicateArrayType;
        }

        public void write(ByteBuf buffer, DataComponentMatchers value) {
            this.dataArrayType.write(buffer, value.exactPredicates());
            this.predicateArrayType.write(buffer, (Object)value.predicates());
        }

        public DataComponentMatchers read(ByteBuf buffer) {
            StructuredData[] exactPredicates = (StructuredData[])this.dataArrayType.read(buffer);
            DataComponentPredicate[] partialPredicates = (DataComponentPredicate[])this.predicateArrayType.read(buffer);
            return new DataComponentMatchers(exactPredicates, partialPredicates);
        }
    }
}

