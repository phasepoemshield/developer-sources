/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 *  minecraft.class03448
 *  minecraft.class07299
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 */
package net.fabricmc.fabric.impl.attachment.client;

import minecraft.class01659;
import minecraft.class03448;
import minecraft.class07299;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSyncException;
import net.fabricmc.fabric.impl.attachment.sync.s2c.AttachmentSyncPayloadS2C;
import net.fabricmc.fabric.impl.attachment.sync.s2c.RequestAcceptedAttachmentsPayloadS2C;

@Environment(value=EnvType.CLIENT)
public class AttachmentSyncClient
implements ClientModInitializer {
    public void onInitializeClient() {
        ClientConfigurationNetworking.registerGlobalReceiver(RequestAcceptedAttachmentsPayloadS2C.ID, (requestAcceptedAttachmentsPayloadS2C, context) -> context.responseSender().sendPacket((class01659)AttachmentSync.createResponsePayload()));
        ClientPlayNetworking.registerGlobalReceiver(AttachmentSyncPayloadS2C.ID, (attachmentSyncPayloadS2C, context) -> {
            for (AttachmentChange attachmentChange : attachmentSyncPayloadS2C.attachments()) {
                try {
                    attachmentChange.tryApply((class07299)((class03448)context.client().T_3));
                }
                catch (AttachmentSyncException attachmentSyncException) {
                    AttachmentEntrypoint.LOGGER.error("Error accepting attachment changes", (Throwable)attachmentSyncException);
                    context.responseSender().disconnect(attachmentSyncException.getText());
                    break;
                }
            }
        });
    }
}

