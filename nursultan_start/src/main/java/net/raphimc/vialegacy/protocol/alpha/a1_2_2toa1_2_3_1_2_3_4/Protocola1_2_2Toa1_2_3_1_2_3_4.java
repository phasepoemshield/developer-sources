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
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 */
package net.raphimc.vialegacy.protocol.alpha.a1_2_2toa1_2_3_1_2_3_4;

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
import net.raphimc.vialegacy.protocol.alpha.a1_2_2toa1_2_3_1_2_3_4.packet.ClientboundPacketsa1_2_2;
import net.raphimc.vialegacy.protocol.alpha.a1_2_2toa1_2_3_1_2_3_4.packet.ServerboundPacketsa1_2_2;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_1_2_3_4toa1_2_3_5_1_2_6.packet.ClientboundPacketsa1_2_3;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.packet.ServerboundPacketsa1_2_6;

public class Protocola1_2_2Toa1_2_3_1_2_3_4
extends StatelessProtocol<ClientboundPacketsa1_2_2, ClientboundPacketsa1_2_3, ServerboundPacketsa1_2_2, ServerboundPacketsa1_2_6> {
    public Protocola1_2_2Toa1_2_3_1_2_3_4() {
        super(ClientboundPacketsa1_2_2.class, ClientboundPacketsa1_2_3.class, ServerboundPacketsa1_2_2.class, ServerboundPacketsa1_2_6.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocola1_2_2Toa1_2_3_1_2_3_4.class, ClientboundPacketsa1_2_2::getPacket));
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsa1_2_2.LOGIN, wrapper -> {
            PacketWrapper updateHealth = PacketWrapper.create((PacketType)ClientboundPacketsa1_2_3.SET_HEALTH, (UserConnection)wrapper.user());
            updateHealth.write((Type)Types.BYTE, (Object)20);
            wrapper.send(Protocola1_2_2Toa1_2_3_1_2_3_4.class);
            updateHealth.send(Protocola1_2_2Toa1_2_3_1_2_3_4.class);
            wrapper.cancel();
        });
        this.registerServerbound(ServerboundPacketsa1_2_6.INTERACT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.read((Type)Types.BYTE);
            }
        });
        this.cancelServerbound(ServerboundPacketsa1_2_6.RESPAWN);
    }
}

