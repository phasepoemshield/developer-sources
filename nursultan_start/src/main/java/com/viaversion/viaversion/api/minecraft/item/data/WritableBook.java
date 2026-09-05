/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.FilterableString
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.FilterableString;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record WritableBook(FilterableString[] pages) implements Copyable
{
    public static final Type<WritableBook> TYPE = new Type<WritableBook>(WritableBook.class){

        @Override
        public void write(Ops ops, WritableBook writableBook) {
            ops.writeMap(map -> map.writeOptional("pages", FilterableString.ARRAY_TYPE, (Object)writableBook.pages, (Object)new FilterableString[0]));
        }

        @Override
        public void write(ByteBuf buffer, WritableBook value) {
            FilterableString.ARRAY_TYPE.write(buffer, value.pages);
        }

        @Override
        public WritableBook read(ByteBuf buffer) {
            return new WritableBook((FilterableString[])FilterableString.ARRAY_TYPE.read(buffer));
        }
    };

    public WritableBook copy() {
        return new WritableBook((FilterableString[])Copyable.copy((Object)this.pages));
    }
}

