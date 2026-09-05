/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.FilterableComponent
 *  com.viaversion.viaversion.api.minecraft.item.data.FilterableString
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.FilterableComponent;
import com.viaversion.viaversion.api.minecraft.item.data.FilterableString;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record WrittenBook(FilterableString title, String author, int generation, FilterableComponent[] pages, boolean resolved) implements Copyable
{
    public static final Type<WrittenBook> TYPE = new Type<WrittenBook>(WrittenBook.class){

        @Override
        public void write(Ops ops, WrittenBook value) {
            ops.writeMap(map -> map.write("title", FilterableString.TYPE, (Object)value.title).write("author", Types.STRING, (Object)value.author).writeOptional("generation", (Type)Types.INT, (Object)value.generation, (Object)0).writeOptional("pages", FilterableComponent.ARRAY_TYPE, (Object)value.pages, (Object)new FilterableComponent[0]).writeOptional("resolved", (Type)Types.BOOLEAN, (Object)value.resolved, (Object)false));
        }

        @Override
        public void write(ByteBuf buffer, WrittenBook value) {
            FilterableString.TYPE.write(buffer, value.title);
            Types.STRING.write(buffer, value.author);
            Types.VAR_INT.writePrimitive(buffer, value.generation);
            FilterableComponent.ARRAY_TYPE.write(buffer, value.pages);
            buffer.writeBoolean(value.resolved);
        }

        @Override
        public WrittenBook read(ByteBuf buffer) {
            FilterableString title = (FilterableString)FilterableString.TYPE.read(buffer);
            String author = (String)Types.STRING.read(buffer);
            int generation = Types.VAR_INT.readPrimitive(buffer);
            FilterableComponent[] pages = (FilterableComponent[])FilterableComponent.ARRAY_TYPE.read(buffer);
            boolean resolved = buffer.readBoolean();
            return new WrittenBook(title, author, generation, pages, resolved);
        }
    };

    public WrittenBook copy() {
        return new WrittenBook(this.title, this.author, this.generation, (FilterableComponent[])Copyable.copy((Object)this.pages), this.resolved);
    }
}

