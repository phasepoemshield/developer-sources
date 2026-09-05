/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00642
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class04176
 *  minecraft.class04188
 *  minecraft.class04770
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents
 *  net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents
 *  net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor
 */
package net.fabricmc.fabric.impl.attachment.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00642;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class04176;
import minecraft.class04188;
import minecraft.class04770;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync$AttachmentSyncTask;
import net.fabricmc.fabric.impl.attachment.sync.SupportedAttachmentsClientConnection;
import net.fabricmc.fabric.impl.attachment.sync.c2s.AcceptedAttachmentsPayloadC2S;
import net.fabricmc.fabric.impl.attachment.sync.s2c.AttachmentSyncPayloadS2C;
import net.fabricmc.fabric.impl.attachment.sync.s2c.RequestAcceptedAttachmentsPayloadS2C;
import net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor;

public class AttachmentSync
implements ModInitializer {
    public static final int MAX_IDENTIFIER_SIZE = 256;

    public static void trySync(AttachmentChange attachmentChange, class04770 class047702) {
        if (class047702.field_13987 == null) {
            return;
        }
        Set<class01894> set = ((SupportedAttachmentsClientConnection)((ServerCommonPacketListenerImplAccessor)class047702.field_13987).getConnection()).fabric_getSupportedAttachments();
        if (set.contains(attachmentChange.type().identifier())) {
            ServerPlayNetworking.send((class04770)class047702, (class01659)new AttachmentSyncPayloadS2C(List.of(attachmentChange)));
        }
    }

    private static Set<class01894> decodeResponsePayload(AcceptedAttachmentsPayloadC2S acceptedAttachmentsPayloadC2S) {
        Set<class01894> set = acceptedAttachmentsPayloadC2S.acceptedAttachments();
        Set<class01894> set2 = AttachmentRegistryImpl.getSyncableAttachments();
        set.retainAll(set2);
        if (set.size() < set2.size()) {
            AttachmentEntrypoint.LOGGER.warn("Client does not support the syncable attachments {}", (Object)set2.stream().filter(class018942 -> !set.contains(class018942)).map(class01894::toString).collect(Collectors.joining(", ")));
        }
        return set;
    }

    public static AcceptedAttachmentsPayloadC2S createResponsePayload() {
        return new AcceptedAttachmentsPayloadC2S(AttachmentRegistryImpl.getSyncableAttachments());
    }

    public void onInitialize() {
        PayloadTypeRegistry.configurationC2S().register(AcceptedAttachmentsPayloadC2S.ID, AcceptedAttachmentsPayloadC2S.CODEC);
        PayloadTypeRegistry.configurationS2C().register(RequestAcceptedAttachmentsPayloadS2C.ID, RequestAcceptedAttachmentsPayloadS2C.CODEC);
        ServerConfigurationConnectionEvents.CONFIGURE.register((class041762, class027962) -> {
            if (ServerConfigurationNetworking.canSend((class04176)class041762, (class01894)RequestAcceptedAttachmentsPayloadS2C.PACKET_ID)) {
                class041762.addTask((class04188)new AttachmentSync$AttachmentSyncTask());
            } else {
                AttachmentEntrypoint.LOGGER.debug("Couldn't send attachment configuration packet to client, as the client cannot receive the payload.");
            }
        });
        ServerConfigurationNetworking.registerGlobalReceiver(AcceptedAttachmentsPayloadC2S.ID, (acceptedAttachmentsPayloadC2S, context) -> {
            Set<class01894> set = AttachmentSync.decodeResponsePayload(acceptedAttachmentsPayloadC2S);
            class00642 class006422 = ((ServerCommonPacketListenerImplAccessor)context.networkHandler()).getConnection();
            ((SupportedAttachmentsClientConnection)class006422).fabric_setSupportedAttachments(set);
            context.networkHandler().completeTask(AttachmentSync$AttachmentSyncTask.KEY);
        });
        PayloadTypeRegistry.playS2C().register(AttachmentSyncPayloadS2C.ID, AttachmentSyncPayloadS2C.CODEC);
        ServerPlayerEvents.JOIN.register(class047702 -> {
            ArrayList<AttachmentChange> arrayList = new ArrayList<AttachmentChange>();
            ((AttachmentTargetImpl)class047702.method_51469()).fabric_computeInitialSyncChanges(class047702, arrayList::add);
            ((AttachmentTargetImpl)class047702).fabric_computeInitialSyncChanges(class047702, arrayList::add);
            if (!arrayList.isEmpty()) {
                AttachmentChange.partitionAndSendPackets(arrayList, class047702);
            }
        });
        ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.register((class047702, class047822, class047823) -> {
            ArrayList<AttachmentChange> arrayList = new ArrayList<AttachmentChange>();
            ((AttachmentTargetImpl)class047823).fabric_computeInitialSyncChanges(class047702, arrayList::add);
            if (!arrayList.isEmpty()) {
                AttachmentChange.partitionAndSendPackets(arrayList, class047702);
            }
        });
        EntityTrackingEvents.START_TRACKING.register((class070492, class047702) -> {
            ArrayList<AttachmentChange> arrayList = new ArrayList<AttachmentChange>();
            ((AttachmentTargetImpl)class070492).fabric_computeInitialSyncChanges(class047702, arrayList::add);
            if (!arrayList.isEmpty()) {
                AttachmentChange.partitionAndSendPackets(arrayList, class047702);
            }
        });
    }
}

