/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01659
 *  minecraft.class04159
 *  minecraft.class04188
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 */
package net.fabricmc.fabric.impl.attachment.sync;

import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class01659;
import minecraft.class04159;
import minecraft.class04188;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.impl.attachment.sync.s2c.RequestAcceptedAttachmentsPayloadS2C;

record AttachmentSync$AttachmentSyncTask() implements class04188
{
    public static final class04159 KEY = new class04159(RequestAcceptedAttachmentsPayloadS2C.PACKET_ID.toString());

    public class04159 method_52375() {
        return KEY;
    }

    public void method_52376(Consumer<class00381<?>> consumer) {
        consumer.accept(ServerConfigurationNetworking.createS2CPacket((class01659)RequestAcceptedAttachmentsPayloadS2C.INSTANCE));
    }
}

