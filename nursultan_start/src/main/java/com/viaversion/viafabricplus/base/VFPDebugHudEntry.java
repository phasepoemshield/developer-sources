/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IRakSessionCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.util.ChatUtil
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.channel.Channel
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class05834
 *  minecraft.class06541
 *  minecraft.class07299
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.SeedStorage
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.EntityTracker
 *  org.cloudburstmc.netty.channel.raknet.RakClientChannel
 *  org.cloudburstmc.netty.handler.codec.raknet.common.RakSessionCodec
 */
package com.viaversion.viafabricplus.base;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IChunkTracker;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IRakSessionCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.channel.Channel;
import java.util.ArrayList;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class05834;
import minecraft.class06541;
import minecraft.class07299;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.SeedStorage;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.EntityTracker;
import org.cloudburstmc.netty.channel.raknet.RakClientChannel;
import org.cloudburstmc.netty.handler.codec.raknet.common.RakSessionCodec;

public final class VFPDebugHudEntry
implements class01285 {
    public static final class01894 ID = class01894.N((String)"viafabricplus", (String)"viafabricplus");

    public void method_72751(class05834 class058342, class07299 class072992, class00570 class005702, class00570 class005703) {
        Channel channel;
        int n;
        IChunkTracker iChunkTracker;
        ChunkTracker chunkTracker;
        ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage;
        SeedStorage seedStorage;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatUtil.PREFIX + String.valueOf(class06541.field_1070) + " " + ViaFabricPlusImpl.INSTANCE.getVersion());
        UserConnection userConnection = ProtocolTranslator.getPlayNetworkUserConnection();
        if (userConnection == null) {
            class058342.y((String)arrayList.getFirst());
            return;
        }
        ProtocolInfo protocolInfo = userConnection.getProtocolInfo();
        arrayList.add("P: " + protocolInfo.getPipeline().pipes().size() + " C: " + String.valueOf(protocolInfo.protocolVersion()) + " S: " + String.valueOf(protocolInfo.serverProtocolVersion()));
        EntityTracker entityTracker = (EntityTracker)userConnection.get(EntityTracker.class);
        if (entityTracker != null) {
            arrayList.add("1.7 Entities: " + entityTracker.getTrackedEntities().size() + ", Virtual holograms: " + entityTracker.getVirtualHolograms().size());
        }
        if ((seedStorage = (SeedStorage)userConnection.get(SeedStorage.class)) != null && userConnection.getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(LegacyProtocolVersion.a1_2_0toa1_2_1_1)) {
            arrayList.add("World Seed: " + seedStorage.seed);
        }
        if ((extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)userConnection.get(ExtensionProtocolMetadataStorage.class)) != null) {
            arrayList.add("CPE extensions: " + extensionProtocolMetadataStorage.getExtensionCount());
        }
        if ((chunkTracker = (ChunkTracker)userConnection.get(ChunkTracker.class)) != null) {
            iChunkTracker = (IChunkTracker)chunkTracker;
            int n2 = iChunkTracker.viaFabricPlus$getSubChunkRequests();
            int n3 = iChunkTracker.viaFabricPlus$getPendingSubChunks();
            n = iChunkTracker.viaFabricPlus$getChunks();
            arrayList.add("Chunk Tracker: R: " + n2 + ", P: " + n3 + ", C: " + n);
        }
        if ((channel = userConnection.getChannel()) instanceof RakClientChannel && (channel = (RakSessionCodec)(iChunkTracker = (RakClientChannel)channel).parent().pipeline().get(RakSessionCodec.class)) != null) {
            IRakSessionCodec iRakSessionCodec = (IRakSessionCodec)channel;
            n = iRakSessionCodec.viaFabricPlus$getOutgoingPackets();
            int n4 = iRakSessionCodec.viaFabricPlus$SentDatagrams();
            arrayList.add("RTT: " + Math.round(channel.getRTT()) + " ms, P: " + channel.getPing() + " ms, TQ: " + n + ", RTQ: " + n4);
        }
        class058342.N(ID, arrayList);
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

