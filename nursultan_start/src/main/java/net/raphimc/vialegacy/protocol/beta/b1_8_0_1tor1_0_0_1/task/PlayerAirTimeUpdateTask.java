/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.data.BlockList1_6
 *  net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.storage.PlayerAirTimeStorage
 *  net.raphimc.vialegacy.protocol.release.r1_0_0_1tor1_1.packet.ClientboundPackets1_0_0
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.EntityDataTypes1_3_1
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage
 */
package net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.task;

import com.google.common.collect.Lists;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.IdAndData;
import java.util.Objects;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.BlockList1_6;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.Protocolb1_8_0_1tor1_0_0_1;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.storage.PlayerAirTimeStorage;
import net.raphimc.vialegacy.protocol.release.r1_0_0_1tor1_1.packet.ClientboundPackets1_0_0;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.EntityDataTypes1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage;

public class PlayerAirTimeUpdateTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            PlayerInfoStorage playerInfoStorage;
            PlayerAirTimeStorage playerAirTimeStorage = (PlayerAirTimeStorage)info.get(PlayerAirTimeStorage.class);
            if (playerAirTimeStorage == null || (playerInfoStorage = (PlayerInfoStorage)info.get(PlayerInfoStorage.class)) == null) continue;
            info.getChannel().eventLoop().submit(() -> {
                if (!info.getChannel().isActive()) {
                    return;
                }
                try {
                    IdAndData headBlock = ((ChunkTracker)info.get(ChunkTracker.class)).getBlockNotNull(PlayerAirTimeUpdateTask.floor(playerInfoStorage.posX), PlayerAirTimeUpdateTask.floor(playerInfoStorage.posY + (double)1.62f), PlayerAirTimeUpdateTask.floor(playerInfoStorage.posZ));
                    if (headBlock.getId() == BlockList1_6.waterMoving.blockId() || headBlock.getId() == BlockList1_6.waterStill.blockId()) {
                        playerAirTimeStorage.sentPacket = false;
                        --playerAirTimeStorage.air;
                        if (playerAirTimeStorage.air < 0) {
                            playerAirTimeStorage.air = 0;
                        }
                        this.sendAirTime(playerInfoStorage, playerAirTimeStorage, info);
                    } else if (!playerAirTimeStorage.sentPacket) {
                        playerAirTimeStorage.sentPacket = true;
                        Objects.requireNonNull(playerAirTimeStorage);
                        playerAirTimeStorage.air = 300;
                        this.sendAirTime(playerInfoStorage, playerAirTimeStorage, info);
                    }
                }
                catch (Throwable e) {
                    ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Error updating air time", e);
                }
            });
        }
    }

    private static int floor(double f) {
        int i = (int)f;
        return f < (double)i ? i - 1 : i;
    }

    private void sendAirTime(PlayerInfoStorage playerInfoStorage, PlayerAirTimeStorage playerAirTimeStorage, UserConnection userConnection) {
        PacketWrapper updateAirTime = PacketWrapper.create((PacketType)ClientboundPackets1_0_0.SET_ENTITY_DATA, (UserConnection)userConnection);
        updateAirTime.write((Type)Types.INT, (Object)playerInfoStorage.entityId);
        updateAirTime.write(Types1_3_1.ENTITY_DATA_LIST, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(1, (EntityDataType)EntityDataTypes1_3_1.SHORT, (Object)Integer.valueOf(playerAirTimeStorage.air).shortValue())}));
        updateAirTime.send(Protocolb1_8_0_1tor1_0_0_1.class);
    }
}

