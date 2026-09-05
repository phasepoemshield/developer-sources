/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate$PredicateType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.data.predicate;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.data.predicate.DataComponentPredicate;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import io.netty.buffer.ByteBuf;

/*
 * Exception performing whole class analysis ignored.
 */
public record DataComponentPredicate(PredicateType type, Tag predicate) {
    public static final Type<DataComponentPredicate> TYPE1_21_5 = new Type<DataComponentPredicate>(DataComponentPredicate.class){

        public void write(ByteBuf buffer, DataComponentPredicate value) {
            Types.VAR_INT.writePrimitive(buffer, value.type().id());
            Types.TAG.write(buffer, (Object)value.predicate());
        }

        public DataComponentPredicate read(ByteBuf buffer) {
            int id = Types.VAR_INT.readPrimitive(buffer);
            Tag predicate = (Tag)Types.TAG.read(buffer);
            return new DataComponentPredicate(id, predicate);
        }
    };
    public static final Type<DataComponentPredicate[]> ARRAY_TYPE1_21_5 = new ArrayType(TYPE1_21_5, 64);
    public static final Type<DataComponentPredicate> TYPE1_21_11 = new Type<DataComponentPredicate>(DataComponentPredicate.class){

        public void write(ByteBuf buffer, DataComponentPredicate value) {
            Types.BOOLEAN.write(buffer, Boolean.valueOf(value.type().isPredicateType()));
            Types.VAR_INT.writePrimitive(buffer, value.type().id());
            Types.TAG.write(buffer, (Object)value.predicate());
        }

        public DataComponentPredicate read(ByteBuf buffer) {
            boolean isPredicateType = Types.BOOLEAN.read(buffer);
            PredicateType type = new PredicateType(Types.VAR_INT.readPrimitive(buffer), isPredicateType);
            Tag predicate = (Tag)Types.TAG.read(buffer);
            return new DataComponentPredicate(type, predicate);
        }
    };
    public static final Type<DataComponentPredicate[]> ARRAY_TYPE1_21_11 = new ArrayType(TYPE1_21_11, 64);

    public DataComponentPredicate(int predicateType, Tag predicate) {
        this(PredicateType.ofPredicateType((int)predicateType), predicate);
    }
}

