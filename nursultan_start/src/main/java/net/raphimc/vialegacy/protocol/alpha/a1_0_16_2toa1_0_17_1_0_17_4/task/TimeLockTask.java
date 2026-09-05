/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.storage.TimeLockStorage
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.Protocolr1_5_2Tor1_6_1
 *  net.raphimc.vialegacy.protocol.release.r1_6_1tor1_6_2.packet.ClientboundPackets1_6_1
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage
 */
package net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.Protocola1_0_16_2Toa1_0_17_1_0_17_4;
import net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.storage.TimeLockStorage;
import net.raphimc.vialegacy.protocol.alpha.a1_0_17_1_0_17_4toa1_1_0_1_1_2_1.packet.ClientboundPacketsa1_0_17;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.Protocolr1_5_2Tor1_6_1;
import net.raphimc.vialegacy.protocol.release.r1_6_1tor1_6_2.packet.ClientboundPackets1_6_1;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage;

public class TimeLockTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            TimeLockStorage timeLockStorage = (TimeLockStorage)info.get(TimeLockStorage.class);
            PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)info.get(PlayerInfoStorage.class);
            if (timeLockStorage == null || playerInfoStorage == null || playerInfoStorage.entityId == -1) continue;
            info.getChannel().eventLoop().submit(() -> {
                if (!info.getChannel().isActive()) {
                    return;
                }
                try {
                    if (info.getProtocolInfo().getPipeline().contains(Protocolr1_5_2Tor1_6_1.class)) {
                        if (timeLockStorage.getTime() == 0L) {
                            timeLockStorage.setTime(1L);
                        }
                        PacketWrapper updateTime = PacketWrapper.create((PacketType)ClientboundPackets1_6_1.SET_TIME, (UserConnection)info);
                        updateTime.write((Type)Types.LONG, (Object)timeLockStorage.getTime());
                        updateTime.write((Type)Types.LONG, (Object)(-(timeLockStorage.getTime() % 24000L)));
                        updateTime.send(Protocolr1_5_2Tor1_6_1.class);
                    } else {
                        PacketWrapper updateTime = PacketWrapper.create((PacketType)ClientboundPacketsa1_0_17.SET_TIME, (UserConnection)info);
                        updateTime.write((Type)Types.LONG, (Object)timeLockStorage.getTime());
                        updateTime.send(Protocola1_0_16_2Toa1_0_17_1_0_17_4.class);
                    }
                }
                catch (Throwable e) {
                    ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Error sending time update", e);
                }
            });
        }
    }
}

