/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.platform.ViaDecodeHandler
 *  io.netty.channel.ChannelHandlerContext
 *  minecraft.class00392
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.protocoltranslator.netty;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.platform.ViaDecodeHandler;
import io.netty.channel.ChannelHandlerContext;
import minecraft.class00392;
import minecraft.class06541;

public final class ViaFabricPlusDecoder
extends ViaDecodeHandler {
    public ViaFabricPlusDecoder(UserConnection userConnection) {
        super(userConnection);
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        try {
            super.channelRead(channelHandlerContext, object);
        }
        catch (Throwable throwable) {
            if (throwable instanceof CancelCodecException) {
                return;
            }
            int n = GeneralSettings.INSTANCE.ignorePacketTranslationErrors.getIndex();
            if (n > 0) {
                ViaFabricPlusImpl.INSTANCE.getLogger().error("Error occurred while decoding packet in ViaFabricPlus decoder", throwable);
                if (n == 1) {
                    ChatUtil.sendPrefixedMessage((class00392)class00392.L((String)"translation.viafabricplus.packet_error").N(class06541.field_1061));
                }
            }
            throw throwable;
        }
    }
}

