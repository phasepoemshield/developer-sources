/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.ArmorTypes1_8
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07085
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 */
package com.viaversion.viafabricplus.features.networking.armor_hud;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.ArmorTypes1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import java.util.UUID;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07085;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public final class ArmorHudEmulation1_8 {
    private static final UUID ARMOR_POINTS_UUID = UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150");
    private static final class07085[] ARMOR_SLOTS = new class07085[]{class07085.field_6169, class07085.field_6174, class07085.field_6172, class07085.field_6166};
    private static double previousArmorPoints = 0.0;

    public static void init() {
        ClientTickEvents.START_WORLD_TICK.register(class034482 -> {
            if (!DebugSettings.INSTANCE.emulateArmorHud.isEnabled()) {
                return;
            }
            if ((class04453)class06202.Nq().T_4 != null) {
                UserConnection userConnection = ProtocolTranslator.getPlayNetworkUserConnection();
                if (userConnection != null) {
                    try {
                        ArmorHudEmulation1_8.sendArmorUpdate(userConnection);
                    }
                    catch (Throwable throwable) {
                        ViaFabricPlusImpl.INSTANCE.getLogger().error("Error sending armor update", throwable);
                    }
                }
            } else {
                previousArmorPoints = 0.0;
            }
        });
    }

    private static void sendArmorUpdate(UserConnection userConnection) {
        int n = 0;
        for (class07085 class070852 : ARMOR_SLOTS) {
            class06584 class065842 = ((class04453)class06202.Nq().T_4).method_31548().U.N(class070852);
            if (class065842.R()) continue;
            String string = class04206.B.y((Object)class065842.B()).toString();
            n += ArmorTypes1_8.findByType((String)string).getArmorPoints();
        }
        if ((double)n == previousArmorPoints) {
            return;
        }
        previousArmorPoints = n;
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9.UPDATE_ATTRIBUTES, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)((class04453)class06202.Nq().T_4).method_5628());
        packetWrapper.write((Type)Types.INT, (Object)1);
        packetWrapper.write(Types.STRING, (Object)"generic.armor");
        packetWrapper.write((Type)Types.DOUBLE, (Object)0.0);
        packetWrapper.write((Type)Types.VAR_INT, (Object)1);
        packetWrapper.write(Types.UUID, (Object)ARMOR_POINTS_UUID);
        packetWrapper.write((Type)Types.DOUBLE, (Object)n);
        packetWrapper.write((Type)Types.BYTE, (Object)0);
        packetWrapper.scheduleSend(Protocol1_8To1_9.class);
    }
}

