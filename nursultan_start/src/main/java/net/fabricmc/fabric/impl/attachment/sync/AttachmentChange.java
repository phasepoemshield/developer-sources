/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  minecraft.class00392
 *  minecraft.class00667
 *  minecraft.class01042
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class04770
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.api.networking.v1.PacketByteBufs
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 *  net.fabricmc.fabric.mixin.attachment.ServerboundCustomPayloadPacketAccessor
 *  net.fabricmc.fabric.mixin.attachment.VarIntAccessor
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.attachment.sync;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import minecraft.class00392;
import minecraft.class00667;
import minecraft.class01042;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class04770;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class07299;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSyncException;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.SupportedAttachmentsClientConnection;
import net.fabricmc.fabric.impl.attachment.sync.s2c.AttachmentSyncPayloadS2C;
import net.fabricmc.fabric.mixin.attachment.ServerboundCustomPayloadPacketAccessor;
import net.fabricmc.fabric.mixin.attachment.VarIntAccessor;
import net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public record AttachmentChange(AttachmentTargetInfo<?> targetInfo, AttachmentType<?> type, byte[] data) {
    public static final class02362<class00667, AttachmentChange> PACKET_CODEC;
    private static final int MAX_PADDING_SIZE_IN_BYTES = 265;
    private static final int MAX_DATA_SIZE_IN_BYTES;
    private static final boolean DISCONNECT_ON_UNKNOWN_TARGETS;
    private static Logger LOGGER;

    public static AttachmentChange create(AttachmentTargetInfo<?> attachmentTargetInfo, AttachmentType<?> attachmentType, @Nullable Object object, class01042 class010422) {
        class02362 class023622 = ((AttachmentTypeImpl)attachmentType).packetCodec();
        Objects.requireNonNull(class023622, "attachment packet codec cannot be null");
        Objects.requireNonNull(class010422, "dynamic registry manager cannot be null");
        class04247 class042472 = new class04247((ByteBuf)PacketByteBufs.create(), class010422);
        if (object != null) {
            class042472.N(true);
            class023622.encode((Object)class042472, object);
        } else {
            class042472.N(false);
        }
        byte[] byArray = class042472.array();
        if (byArray.length > MAX_DATA_SIZE_IN_BYTES) {
            throw new IllegalArgumentException("Data for attachment '%s' was too big (%d bytes, over maximum %d)".formatted(new Object[]{attachmentType.identifier(), byArray.length, MAX_DATA_SIZE_IN_BYTES}));
        }
        return new AttachmentChange(attachmentTargetInfo, attachmentType, byArray);
    }

    public void tryApply(class07299 class072992) throws AttachmentSyncException {
        AttachmentTarget attachmentTarget = this.targetInfo.getTarget(class072992);
        Object object = this.decodeValue(class072992.method_30349());
        if (attachmentTarget == null) {
            class05216 class052162 = class00392.i();
            class052162.y((class00392)class00392.L((String)"fabric-data-attachment-api-v1.unknown-target.title").N(class06541.field_1061)).y(class05220.n);
            class052162.y(class05220.n);
            class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.attachment-identifier", (Object[])new Object[]{class00392.y((String)String.valueOf(this.type.identifier())).N(class06541.field_1054)})).y(class05220.n);
            class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.world", (Object[])new Object[]{class00392.y((String)String.valueOf(class072992.method_27983().N())).N(class06541.field_1054)})).y(class05220.n);
            this.targetInfo.appendDebugInformation(class052162);
            if (DISCONNECT_ON_UNKNOWN_TARGETS) {
                throw new AttachmentSyncException((class00392)class052162);
            }
            LOGGER.warn(class052162.getString().trim());
            return;
        }
        attachmentTarget.setAttached(this.type, object);
    }

    public static void partitionAndSendPackets(List<AttachmentChange> list, class04770 class047702) {
        int n;
        Set<class01894> set = ((SupportedAttachmentsClientConnection)((ServerCommonPacketListenerImplAccessor)class047702.field_13987).getConnection()).fabric_getSupportedAttachments();
        list.sort(Comparator.comparingInt(attachmentChange -> attachmentChange.data().length));
        ArrayList<AttachmentChange> arrayList = new ArrayList<AttachmentChange>();
        int n2 = n = VarIntAccessor.getMaxByteSize();
        for (AttachmentChange attachmentChange2 : list) {
            if (!set.contains(attachmentChange2.type.identifier())) continue;
            int n3 = 265 + attachmentChange2.data.length;
            if (!arrayList.isEmpty() && n2 + n3 > MAX_DATA_SIZE_IN_BYTES) {
                ServerPlayNetworking.send((class04770)class047702, (class01659)new AttachmentSyncPayloadS2C(List.copyOf(arrayList)));
                arrayList.clear();
                n2 = n;
            }
            arrayList.add(attachmentChange2);
            n2 += n3;
        }
        if (!arrayList.isEmpty()) {
            ServerPlayNetworking.send((class04770)class047702, (class01659)new AttachmentSyncPayloadS2C(arrayList));
        }
    }

    public @Nullable Object decodeValue(class01042 class010422) {
        class02362 class023622 = ((AttachmentTypeImpl)this.type).packetCodec();
        Objects.requireNonNull(class023622, "codec was null");
        Objects.requireNonNull(class010422, "dynamic registry manager cannot be null");
        class04247 class042472 = new class04247(Unpooled.copiedBuffer((byte[])this.data), class010422);
        if (!class042472.readBoolean()) {
            return null;
        }
        return class023622.decode((Object)class042472);
    }

    static {
        LOGGER = LoggerFactory.getLogger((String)"net.fabricmc.fabric.impl.attachment.sync.AttachmentChange");
        PACKET_CODEC = class02362.N(AttachmentTargetInfo.PACKET_CODEC, AttachmentChange::targetInfo, (class02362)class01894.y.N_10(class018942 -> Objects.requireNonNull(AttachmentRegistryImpl.get(class018942)), AttachmentType::identifier), AttachmentChange::type, (class02362)class02389.m, AttachmentChange::data, AttachmentChange::new);
        MAX_DATA_SIZE_IN_BYTES = ServerboundCustomPayloadPacketAccessor.getMaxPayloadSize() - 265;
    }
}

