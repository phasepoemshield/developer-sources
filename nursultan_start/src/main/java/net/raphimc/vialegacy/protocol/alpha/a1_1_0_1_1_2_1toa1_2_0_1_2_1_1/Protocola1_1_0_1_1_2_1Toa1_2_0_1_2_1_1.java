/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.types.Typesb1_7_0_3
 */
package net.raphimc.vialegacy.protocol.alpha.a1_1_0_1_1_2_1toa1_2_0_1_2_1_1;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.alpha.a1_1_0_1_1_2_1toa1_2_0_1_2_1_1.packet.ClientboundPacketsa1_1_0;
import net.raphimc.vialegacy.protocol.alpha.a1_1_0_1_1_2_1toa1_2_0_1_2_1_1.packet.ServerboundPacketsa1_1_0;
import net.raphimc.vialegacy.protocol.alpha.a1_2_0_1_2_1_1toa1_2_2.packet.ClientboundPacketsa1_2_0;
import net.raphimc.vialegacy.protocol.alpha.a1_2_0_1_2_1_1toa1_2_2.packet.ServerboundPacketsa1_2_0;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.types.Typesb1_7_0_3;

public class Protocola1_1_0_1_1_2_1Toa1_2_0_1_2_1_1
extends StatelessProtocol<ClientboundPacketsa1_1_0, ClientboundPacketsa1_2_0, ServerboundPacketsa1_1_0, ServerboundPacketsa1_2_0> {
    public Protocola1_1_0_1_1_2_1Toa1_2_0_1_2_1_1() {
        super(ClientboundPacketsa1_1_0.class, ClientboundPacketsa1_2_0.class, ServerboundPacketsa1_1_0.class, ServerboundPacketsa1_2_0.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocola1_1_0_1_1_2_1Toa1_2_0_1_2_1_1.class, ClientboundPacketsa1_1_0::getPacket));
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsa1_1_0.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Typesb1_7_0_3.STRING);
                this.map(Typesb1_7_0_3.STRING);
                this.create((Type)Types.LONG, 0L);
                this.create((Type)Types.BYTE, (byte)0);
            }
        });
        this.registerServerbound(ServerboundPacketsa1_2_0.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Typesb1_7_0_3.STRING);
                this.map(Typesb1_7_0_3.STRING);
                this.read((Type)Types.LONG);
                this.read((Type)Types.BYTE);
            }
        });
    }
}

