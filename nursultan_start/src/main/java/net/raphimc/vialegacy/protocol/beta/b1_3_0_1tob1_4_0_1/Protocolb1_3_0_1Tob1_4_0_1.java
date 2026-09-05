/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 */
package net.raphimc.vialegacy.protocol.beta.b1_3_0_1tob1_4_0_1;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.beta.b1_3_0_1tob1_4_0_1.packet.ClientboundPacketsb1_3;
import net.raphimc.vialegacy.protocol.beta.b1_4_0_1tob1_5_0_2.packet.ClientboundPacketsb1_4;
import net.raphimc.vialegacy.protocol.beta.b1_4_0_1tob1_5_0_2.packet.ServerboundPacketsb1_4;

public class Protocolb1_3_0_1Tob1_4_0_1
extends StatelessProtocol<ClientboundPacketsb1_3, ClientboundPacketsb1_4, ServerboundPacketsb1_4, ServerboundPacketsb1_4> {
    public Protocolb1_3_0_1Tob1_4_0_1() {
        super(ClientboundPacketsb1_3.class, ClientboundPacketsb1_4.class, ServerboundPacketsb1_4.class, ServerboundPacketsb1_4.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolb1_3_0_1Tob1_4_0_1.class, ClientboundPacketsb1_3::getPacket));
    }
}

