/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.array;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Array;

public class ArrayType<T>
extends Type<T[]> {
    private final Type<T> elementType;
    private final Type<? extends Number> lengthType;

    public ArrayType(Type<T> type, Type<? extends Number> lengthType) {
        super(type.getTypeName() + " " + lengthType.getTypeName() + "Array", com.viaversion.viaversion.api.type.types.ArrayType.getArrayClass((Class)type.getOutputClass()));
        if (!(lengthType instanceof TypeConverter)) {
            throw new IllegalArgumentException("Length type must be a TypeConverter<? extends Number>");
        }
        this.elementType = type;
        this.lengthType = lengthType;
    }

    public void write(ByteBuf buffer, T[] value) {
        Type<? extends Number> lengthType = this.lengthType;
        lengthType.write(buffer, (Object)((Number)((TypeConverter)lengthType).from((Object)value.length)));
        for (T v : value) {
            this.elementType.write(buffer, v);
        }
    }

    public T[] read(ByteBuf buffer) {
        int length = ((Number)this.lengthType.read(buffer)).intValue();
        Object[] array = (Object[])Array.newInstance(this.elementType.getOutputClass(), length);
        for (int i = 0; i < length; ++i) {
            array[i] = this.elementType.read(buffer);
        }
        return array;
    }
}

