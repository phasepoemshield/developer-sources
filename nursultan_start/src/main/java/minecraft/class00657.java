/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  minecraft.class00381
 *  minecraft.class01671
 *  minecraft.class01834
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04275
 *  net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket
 *  net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync
 *  net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection
 *  net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import minecraft.class00381;
import minecraft.class00636;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01671;
import minecraft.class01834;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04275;
import net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync;
import net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection;
import net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00657<T extends class00638>
extends MessageToByteEncoder<class00381<T>>
implements PacketEncoderAccessor {
    private static final Logger N = LogUtils.getLogger();
    private final class04275<T> y;

    private void L(ChannelHandlerContext channelHandlerContext, class00381 class003812, ByteBuf byteBuf, CallbackInfo callbackInfo) {
        CustomIngredientSync.CURRENT_SUPPORTED_INGREDIENTS.set(null);
    }

    public class00657(class04275<T> class042752) {
        this.y = class042752;
    }

    private void y(ChannelHandlerContext channelHandlerContext, class00381 class003812, ByteBuf byteBuf, CallbackInfo callbackInfo) {
        ChannelHandler channelHandler = channelHandlerContext.pipeline().get("packet_handler");
        if (channelHandler instanceof SupportedIngredientsClientConnection) {
            CustomIngredientSync.CURRENT_SUPPORTED_INGREDIENTS.set(((SupportedIngredientsClientConnection)channelHandler).fabric_getSupportedCustomIngredients());
        }
    }

    private void N(ChannelHandlerContext channelHandlerContext, class00381 class003812, ByteBuf byteBuf, CallbackInfo callbackInfo) {
        if (class003812 instanceof PassthroughPacket) {
            PassthroughPacket passthroughPacket = (PassthroughPacket)class003812;
            byteBuf.writeBytes(passthroughPacket.buf());
            callbackInfo.cancel();
        }
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, class00381<T> class003812, ByteBuf byteBuf) throws Exception {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(channelHandlerContext, class003812, byteBuf, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class02897 class028972 = class003812.method_65080();
        try {
            class02362 class023622 = this.y.L();
            this.y(channelHandlerContext, class003812, byteBuf, null);
            class023622.encode((Object)byteBuf, class003812);
            this.L(channelHandlerContext, class003812, byteBuf, null);
            int n = byteBuf.readableBytes();
            if (N.isDebugEnabled()) {
                N.debug(class00642.field_36380, "OUT: [{}:{}] {} -> {} bytes", new Object[]{this.y.N().N(), class028972, class003812.getClass().getName(), n});
            }
            class01834.M.y(this.y.N(), class028972, channelHandlerContext.channel().remoteAddress(), n);
        }
        catch (Throwable throwable) {
            N.error("Error sending packet {}", (Object)class028972, (Object)throwable);
            this.L(channelHandlerContext, class003812, byteBuf, null);
            if (class003812.i()) {
                throw new class00636(throwable);
            }
            throw throwable;
        }
        finally {
            class01671.y((ChannelHandlerContext)channelHandlerContext, class003812);
        }
    }

    public /* synthetic */ void fabric_encode(ChannelHandlerContext channelHandlerContext, class00381 class003812, ByteBuf byteBuf) {
        this.encode(channelHandlerContext, class003812, byteBuf);
    }
}

