/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09700
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.channel.ChannelConfig
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  minecraft.class00381
 *  minecraft.class02372
 */
package minecraft;

import Nursultan.class09700;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import minecraft.class00381;
import minecraft.class02372;

public interface class01671 {
    public static void y(ChannelHandlerContext channelHandlerContext, class00381<?> class003812) {
        if (class003812.R()) {
            channelHandlerContext.pipeline().addAfter(channelHandlerContext.name(), "outbound_config", (ChannelHandler)new class09700());
            channelHandlerContext.pipeline().remove(channelHandlerContext.name());
        }
    }

    private static ChannelConfig N(ChannelConfig channelConfig, boolean bl, Operation operation) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            return null;
        }
        return (ChannelConfig)operation.call(new Object[]{channelConfig, bl});
    }

    public static void N(ChannelHandlerContext channelHandlerContext, class00381<?> class003812) {
        if (class003812.R()) {
            class01671.N(channelHandlerContext.channel().config(), false, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[io.netty.channel.ChannelConfig, boolean]");
                return ((ChannelConfig)objectArray[0]).setAutoRead(((Boolean)objectArray[1]).booleanValue());
            });
            channelHandlerContext.pipeline().addBefore(channelHandlerContext.name(), "inbound_config", (ChannelHandler)new class02372());
            channelHandlerContext.pipeline().remove(channelHandlerContext.name());
        }
    }
}

