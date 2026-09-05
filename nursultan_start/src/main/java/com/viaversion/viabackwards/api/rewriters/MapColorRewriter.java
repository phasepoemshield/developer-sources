/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.IdRewriteFunction
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.IdRewriteFunction;

public final class MapColorRewriter {
    public static void rewriteMapColors(PacketWrapper wrapper, IdRewriteFunction rewriter, int iconCount) {
        for (int i = 0; i < iconCount; ++i) {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough(Types.OPTIONAL_COMPONENT);
        }
        short columns = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
        if (columns < 1) {
            return;
        }
        wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
        wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
        wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
        byte[] data = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
        for (int i = 0; i < data.length; ++i) {
            int color = data[i] & 0xFF;
            int mappedColor = rewriter.rewrite(color);
            if (mappedColor == -1) continue;
            data[i] = (byte)mappedColor;
        }
    }

    public static PacketHandler getRewriteHandler(IdRewriteFunction rewriter) {
        return wrapper -> MapColorRewriter.rewriteMapColors(wrapper, rewriter, (Integer)wrapper.passthrough((Type)Types.VAR_INT));
    }
}

