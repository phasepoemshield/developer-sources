/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 */
package net.raphimc.vialegacy.protocol.classic.c0_0_15a_1toc0_0_16a_02;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.classic.c0_0_15a_1toc0_0_16a_02.packet.ClientboundPacketsc0_15a;
import net.raphimc.vialegacy.protocol.classic.c0_0_15a_1toc0_0_16a_02.packet.ServerboundPacketsc0_15a;
import net.raphimc.vialegacy.protocol.classic.c0_0_19a_06toc0_0_20a_27.packet.ClientboundPacketsc0_19a;
import net.raphimc.vialegacy.protocol.classic.c0_0_19a_06toc0_0_20a_27.packet.ServerboundPacketsc0_19a;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.types.Typesc0_30;

public class Protocolc0_0_15a_1Toc0_0_16a_02
extends StatelessProtocol<ClientboundPacketsc0_15a, ClientboundPacketsc0_19a, ServerboundPacketsc0_15a, ServerboundPacketsc0_19a> {
    public Protocolc0_0_15a_1Toc0_0_16a_02() {
        super(ClientboundPacketsc0_15a.class, ClientboundPacketsc0_19a.class, ServerboundPacketsc0_15a.class, ServerboundPacketsc0_19a.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolc0_0_15a_1Toc0_0_16a_02.class, ClientboundPacketsc0_15a::getPacket));
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsc0_15a.LOGIN, wrapper -> {
            String username = (String)wrapper.read(Typesc0_30.STRING);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write(Typesc0_30.STRING, (Object)"c0.0.15a Server");
            wrapper.write(Typesc0_30.STRING, (Object)("Logged in as: " + username));
        });
        this.registerClientbound(ClientboundPacketsc0_15a.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte entityId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    byte yaw = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    byte pitch = (Byte)wrapper.get((Type)Types.BYTE, 2);
                    PacketWrapper entityRotation = PacketWrapper.create((PacketType)ClientboundPacketsc0_19a.MOVE_ENTITY_ROT, (UserConnection)wrapper.user());
                    entityRotation.write((Type)Types.BYTE, (Object)entityId);
                    entityRotation.write((Type)Types.BYTE, (Object)yaw);
                    entityRotation.write((Type)Types.BYTE, (Object)pitch);
                    wrapper.send(Protocolc0_0_15a_1Toc0_0_16a_02.class);
                    entityRotation.send(Protocolc0_0_15a_1Toc0_0_16a_02.class);
                    wrapper.cancel();
                });
            }
        });
        this.registerServerbound(ServerboundPacketsc0_19a.LOGIN, wrapper -> {
            wrapper.clearPacket();
            wrapper.write(Typesc0_30.STRING, (Object)wrapper.user().getProtocolInfo().getUsername());
        });
        this.cancelServerbound(ServerboundPacketsc0_19a.CHAT);
    }
}

