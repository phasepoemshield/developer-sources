/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaaprilfools.api.minecraft.item;

import com.viaversion.viaaprilfools.api.types.VAFTypes;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public record MobTrophyInfo(Holder<String> type, boolean shiny) {
    public static final Type<MobTrophyInfo> TYPE = new Type<MobTrophyInfo>(MobTrophyInfo.class){

        public void write(ByteBuf byteBuf, MobTrophyInfo mobTrophyInfo) {
            VAFTypes.HOLDER_STRING.write(byteBuf, mobTrophyInfo.type());
            byteBuf.writeBoolean(mobTrophyInfo.shiny());
        }

        public MobTrophyInfo read(ByteBuf byteBuf) {
            Holder type = VAFTypes.HOLDER_STRING.read(byteBuf);
            boolean shiny = byteBuf.readBoolean();
            return new MobTrophyInfo((Holder<String>)type, shiny);
        }
    };
}

