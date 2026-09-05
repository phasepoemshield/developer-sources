/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  dev.kastle.netty.channel.nethernet.config.NetherNetAddress
 *  minecraft.class03420
 *  minecraft.class04568
 *  minecraft.class04585
 *  minecraft.class05096
 *  minecraft.class05763
 *  minecraft.class06202
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 */
package com.viaversion.viafabricplus.util;

import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import minecraft.class03420;
import minecraft.class04568;
import minecraft.class04585;
import minecraft.class05096;
import minecraft.class05763;
import minecraft.class06202;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;

public final class ConnectionUtil {
    public static void connect(String string, String string2, ProtocolVersion protocolVersion) {
        class03420 class034202 = class03420.N((String)string2);
        class04568 class045682 = new class04568(string, class034202.N(), class04585.field_45611);
        if (protocolVersion != null) {
            ((IServerData)class045682).viaFabricPlus$forceVersion(protocolVersion);
        }
        class05763.N((class05096)((class05096)class06202.Nq().v_3), (class06202)class06202.Nq(), (class03420)class034202, (class04568)class045682, (boolean)false, null);
    }

    public static void connect(String string, String string2) {
        ConnectionUtil.connect(string, string2, null);
    }

    public static void connect(String string, ProtocolVersion protocolVersion) {
        ConnectionUtil.connect(string, string, protocolVersion);
    }

    public static void connectNetherNet(NetherNetAddress netherNetAddress) {
        class03420 class034202 = class03420.N((String)(netherNetAddress.getNetworkId() + ".nethernet.viafabricplus.localhost"));
        ((IServerAddress)class034202).viaFabricPlus$setNetherNetAddress(netherNetAddress);
        class04568 class045682 = new class04568("Bedrock Realm " + netherNetAddress.getNetworkId(), class034202.N(), class04585.field_45611);
        ((IServerData)class045682).viaFabricPlus$forceVersion(BedrockProtocolVersion.bedrockLatest);
        class05763.N((class05096)((class05096)class06202.Nq().v_3), (class06202)class06202.Nq(), (class03420)class034202, (class04568)class045682, (boolean)false, null);
    }
}

