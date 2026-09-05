/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.channel.ChannelConfig
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInboundHandler
 *  io.netty.channel.ChannelOutboundHandler
 *  minecraft.class00638
 *  minecraft.class00657
 *  minecraft.class00658
 *  minecraft.class02400
 *  minecraft.class02403
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import minecraft.class00638;
import minecraft.class00657;
import minecraft.class00658;
import minecraft.class02400;
import minecraft.class02403;
import minecraft.class04275;

public class class04285 {
    public static <T extends class00638> class02400 y(class04275<T> class042752) {
        return class04285.N((ChannelOutboundHandler)new class00657(class042752));
    }

    private static ChannelConfig N(ChannelConfig channelConfig, boolean bl, Operation operation) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            return null;
        }
        return (ChannelConfig)operation.call(new Object[]{channelConfig, bl});
    }

    private static class02400 N(ChannelOutboundHandler channelOutboundHandler) {
        return channelHandlerContext -> channelHandlerContext.pipeline().replace(channelHandlerContext.name(), "encoder", (ChannelHandler)channelOutboundHandler);
    }

    private static class02403 N(ChannelInboundHandler channelInboundHandler) {
        return channelHandlerContext -> {
            channelHandlerContext.pipeline().replace(channelHandlerContext.name(), "decoder", (ChannelHandler)channelInboundHandler);
            class04285.N(channelHandlerContext.channel().config(), true, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[io.netty.channel.ChannelConfig, boolean]");
                return ((ChannelConfig)objectArray[0]).setAutoRead(((Boolean)objectArray[1]).booleanValue());
            });
        };
    }

    public static <T extends class00638> class02403 N(class04275<T> class042752) {
        return class04285.N((ChannelInboundHandler)new class00658(class042752));
    }
}

