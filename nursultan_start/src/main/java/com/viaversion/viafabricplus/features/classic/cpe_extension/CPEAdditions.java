/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.buffer.ByteBuf
 *  minecraft.class06570
 *  minecraft.class06581
 *  net.lenni0451.reflect.Enums
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.packet.ClientboundPacketsc0_30cpe
 */
package com.viaversion.viafabricplus.features.classic.cpe_extension;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class06570;
import minecraft.class06581;
import net.lenni0451.reflect.Enums;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.packet.ClientboundPacketsc0_30cpe;

public final class CPEAdditions {
    public static final List<ClassicProtocolExtension> ALLOWED_EXTENSIONS = new ArrayList<ClassicProtocolExtension>();
    public static final Map<Integer, ClientboundPacketsc0_30cpe> CUSTOM_PACKETS = new HashMap<Integer, ClientboundPacketsc0_30cpe>();
    public static final List<class06581> EXTENDED_CLASSIC_ITEMS = new ArrayList<class06581>();
    public static ClientboundPacketsc0_30cpe EXT_WEATHER_TYPE;
    private static boolean snowing;

    static {
        snowing = false;
    }

    public static void init() {
        EXTENDED_CLASSIC_ITEMS.add(class06570.iQ);
        EXTENDED_CLASSIC_ITEMS.add(class06570.Lr);
        EXTENDED_CLASSIC_ITEMS.add(class06570.Lp);
        EXTENDED_CLASSIC_ITEMS.add(class06570.Rw);
        EXTENDED_CLASSIC_ITEMS.add(class06570.RU);
        EXTENDED_CLASSIC_ITEMS.add(class06570.ub);
        EXTENDED_CLASSIC_ITEMS.add(class06570.Rk);
        EXTENDED_CLASSIC_ITEMS.add(class06570.Br);
        EXTENDED_CLASSIC_ITEMS.add(class06570.NO);
        EXTENDED_CLASSIC_ITEMS.add(class06570.ZL);
        EXTENDED_CLASSIC_ITEMS.add(class06570.RI);
        EXTENDED_CLASSIC_ITEMS.add(class06570.ME);
        CPEAdditions.allowExtension(ClassicProtocolExtension.ENV_WEATHER_TYPE);
        EXT_WEATHER_TYPE = CPEAdditions.createNewPacket(ClassicProtocolExtension.ENV_WEATHER_TYPE, 31, (userConnection, byteBuf) -> byteBuf.readByte());
    }

    public static void allowExtension(ClassicProtocolExtension classicProtocolExtension) {
        ALLOWED_EXTENSIONS.add(classicProtocolExtension);
    }

    public static ClientboundPacketsc0_30cpe createNewPacket(ClassicProtocolExtension classicProtocolExtension, int n, BiConsumer<UserConnection, ByteBuf> biConsumer) {
        ClientboundPacketsc0_30cpe clientboundPacketsc0_30cpe = (ClientboundPacketsc0_30cpe)Enums.newInstance(ClientboundPacketsc0_30cpe.class, (String)classicProtocolExtension.getName(), (int)ClassicProtocolExtension.values().length, (Class[])new Class[]{Integer.TYPE, BiConsumer.class}, (Object[])new Object[]{n, biConsumer});
        Enums.addEnumInstance(ClientboundPacketsc0_30cpe.class, (Enum)clientboundPacketsc0_30cpe);
        CUSTOM_PACKETS.put(n, clientboundPacketsc0_30cpe);
        return clientboundPacketsc0_30cpe;
    }

    public static boolean isSnowing() {
        return ProtocolTranslator.getTargetVersion().equals((Object)LegacyProtocolVersion.c0_30cpe) && snowing;
    }

    public static void setSnowing(boolean bl) {
        snowing = bl;
    }
}

