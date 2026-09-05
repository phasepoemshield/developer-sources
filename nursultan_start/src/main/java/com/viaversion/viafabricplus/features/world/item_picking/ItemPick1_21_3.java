/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class05487
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06918
 *  minecraft.class07050
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class08044
 *  minecraft.class08303
 *  minecraft.class08329
 *  org.slf4j.Logger
 */
package com.viaversion.viafabricplus.features.world.item_picking;

import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class05487;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06918;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class08044;
import minecraft.class08303;
import minecraft.class08329;
import org.slf4j.Logger;

public final class ItemPick1_21_3 {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static void doItemPick(class06202 class062022) {
        class06584 class065842;
        class00891 class008912;
        class07209 class072092;
        boolean bl = ((class04453)class062022.T_4).method_31549().u;
        class07089 class070892 = (class07089)class062022.M_3;
        if (class070892.N() == class07113.field_1332) {
            class00394 class003942;
            class072092 = ((class06183)class070892).u();
            class00500 class005002 = ((class03448)class062022.T_3).method_8320(class072092);
            if (class005002.P()) {
                return;
            }
            class008912 = class005002.i();
            class065842 = class008912.N((class05487)((class03448)class062022.T_3), class072092, class005002, false);
            if (class065842.R()) {
                return;
            }
            if (bl && class062022.s() && class005002.k() && (class003942 = ((class03448)class062022.T_3).method_8321(class072092)) != null) {
                ItemPick1_21_3.addBlockEntityNbt(class065842, class003942, ((class03448)class062022.T_3).method_30349());
            }
        } else {
            if (class070892.N() != class07113.field_1331 || !bl) {
                return;
            }
            class072092 = ((class06145)class070892).L();
            class065842 = class072092.method_31480();
            if (class065842 == null) {
                return;
            }
        }
        if (class065842.R()) {
            return;
        }
        class072092 = ((class04453)class062022.T_4).method_31548();
        int n = class072092.u(class065842);
        if (bl) {
            ItemPick1_21_3.addPickBlock((class08044)class072092, class065842);
            ((class03443)class062022.T_2).N(((class04453)class062022.T_4).method_5998(class07050.field_5808), 36 + class072092.N());
        } else if (n != -1) {
            if (class08044.L((int)n)) {
                class072092.N(n);
                return;
            }
            class008912 = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.PICK_ITEM, (UserConnection)ProtocolTranslator.getPlayNetworkUserConnection());
            class008912.write((Type)Types.VAR_INT, (Object)n);
            class008912.scheduleSendToServer(Protocol1_21_2To1_21_4.class);
        }
    }

    private static void addBlockEntityNbt(class06584 class065842, class00394 class003942, class01042 class010422) {
        try (class04495 class044952 = new class04495(class003942.J(), LOGGER);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class010422);
            class003942.M((class08329)class083032);
            class06918.N((class06584)class065842, (class00404)class003942.O(), (class08303)class083032);
            class065842.y(class003942.g());
        }
    }

    private static void addPickBlock(class08044 class080442, class06584 class065842) {
        int n = class080442.u(class065842);
        if (class08044.L((int)n)) {
            class080442.N(n);
        } else if (n != -1) {
            class080442.y(n);
        } else {
            class080442.L(class065842);
        }
    }
}

