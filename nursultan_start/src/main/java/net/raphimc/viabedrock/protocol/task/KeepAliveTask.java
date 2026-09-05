/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  net.raphimc.viabedrock.protocol.BedrockProtocol
 */
package net.raphimc.viabedrock.protocol.task;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import java.util.concurrent.ThreadLocalRandom;
import net.raphimc.viabedrock.protocol.BedrockProtocol;

public class KeepAliveTask
implements Runnable {
    @Override
    public void run() {
        for (UserConnection info : Via.getManager().getConnectionManager().getConnections()) {
            State state = info.getProtocolInfo().getServerState();
            if (state != State.PLAY && state != State.CONFIGURATION || !info.getProtocolInfo().getPipeline().contains(BedrockProtocol.class)) continue;
            info.getChannel().eventLoop().submit(() -> {
                if (!info.getChannel().isActive()) {
                    return;
                }
                try {
                    PacketWrapper keepAlive = PacketWrapper.create((PacketType)(info.getProtocolInfo().getServerState() == State.PLAY ? ClientboundPackets26_1.KEEP_ALIVE : ClientboundConfigurationPackets1_21_9.KEEP_ALIVE), (UserConnection)info);
                    keepAlive.write((Type)Types.LONG, (Object)ThreadLocalRandom.current().nextLong());
                    keepAlive.send(BedrockProtocol.class);
                }
                catch (Throwable e) {
                    BedrockProtocol.kickForIllegalState((UserConnection)info, (String)"Error sending keep alive packet. See console for details.", (Throwable)e);
                }
            });
        }
    }
}

