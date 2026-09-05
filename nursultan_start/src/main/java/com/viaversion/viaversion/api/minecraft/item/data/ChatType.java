/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType$ChatTypeDecoration
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record ChatType(ChatTypeDecoration chatDecoration, ChatTypeDecoration narrationDecoration) implements Copyable
{
    public static final HolderType<ChatType> TYPE = new HolderType<ChatType>(){

        public ChatType readDirect(ByteBuf buffer) {
            ChatTypeDecoration chatDecoration = (ChatTypeDecoration)ChatTypeDecoration.TYPE.read(buffer);
            ChatTypeDecoration narrationDecoration = (ChatTypeDecoration)ChatTypeDecoration.TYPE.read(buffer);
            return new ChatType(chatDecoration, narrationDecoration);
        }

        public void writeDirect(ByteBuf buffer, ChatType value) {
            ChatTypeDecoration.TYPE.write(buffer, (Object)value.chatDecoration());
            ChatTypeDecoration.TYPE.write(buffer, (Object)value.narrationDecoration());
        }
    };

    public ChatType copy() {
        return new ChatType(this.chatDecoration.copy(), this.narrationDecoration.copy());
    }
}

