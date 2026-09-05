/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaaprilfools.api.types;

import com.viaversion.viaaprilfools.api.minecraft.item.StructuredDataKeys25w14craftmine;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import io.netty.buffer.ByteBuf;

public final class VAFTypes {
    public static final HolderType<String> HOLDER_STRING = new HolderType<String>(){

        public String readDirect(ByteBuf byteBuf) {
            return (String)Types.STRING.read(byteBuf);
        }

        public void writeDirect(ByteBuf byteBuf, String s) {
            Types.STRING.write(byteBuf, (Object)s);
        }
    };
    public static final Types1_20_5<StructuredDataKeys25w14craftmine, EntityDataTypes1_21_5> V25W14CRAFTMINE = new Types1_20_5(StructuredDataKeys25w14craftmine::new, EntityDataTypes1_21_5::new);
}

