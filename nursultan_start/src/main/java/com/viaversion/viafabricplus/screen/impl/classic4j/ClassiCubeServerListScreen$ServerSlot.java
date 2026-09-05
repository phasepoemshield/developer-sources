/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  de.florianreuth.classic4j.model.classicube.server.CCServerInfo
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusClassicMPPassProvider;
import com.viaversion.viafabricplus.screen.VFPListEntry;
import com.viaversion.viafabricplus.settings.impl.AuthenticationSettings;
import com.viaversion.viafabricplus.util.ConnectionUtil;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianreuth.classic4j.model.classicube.server.CCServerInfo;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public class ClassiCubeServerListScreen$ServerSlot
extends VFPListEntry {
    private final CCServerInfo classiCubeServerInfo;

    public ClassiCubeServerListScreen$ServerSlot(CCServerInfo cCServerInfo) {
        this.classiCubeServerInfo = cCServerInfo;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        boolean bl = (Boolean)AuthenticationSettings.INSTANCE.automaticallySelectCPEInClassiCubeServerList.getValue();
        ViaFabricPlusClassicMPPassProvider.classicubeMPPass = this.classiCubeServerInfo.mpPass();
        ConnectionUtil.connect(this.classiCubeServerInfo.name(), this.classiCubeServerInfo.ip() + ":" + this.classiCubeServerInfo.port(), (ProtocolVersion)(bl ? LegacyProtocolVersion.c0_30cpe : null));
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        String string = this.classiCubeServerInfo.name();
        int n7 = n3 / 2;
        int n8 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.N(class015902, string, n7, n8 - 9 / 2, -1);
        class010542.y(class015902, this.classiCubeServerInfo.software().replace('&', '\u00a7'), 1, 1, -1);
        String string2 = this.classiCubeServerInfo.players() + "/" + this.classiCubeServerInfo.maxPlayers();
        class010542.y(class015902, string2, n3 - class015902.y(string2) - 1, 1, -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)this.classiCubeServerInfo.name());
    }
}

