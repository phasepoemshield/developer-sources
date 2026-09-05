/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.ViaAprilFools
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.configuration.Config
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.ProtocolManager
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viaaprilfools.platform;

import com.viaversion.viaaprilfools.ViaAprilFools;
import com.viaversion.viaaprilfools.api.AprilFoolsProtocolVersion;
import com.viaversion.viaaprilfools.platform.ViaAprilFoolsConfig;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.Protocol20w14infiniteTo1_16;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.Protocol25w14craftmineTo1_21_5;
import com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.Protocol3D_SharewareTo1_14;
import com.viaversion.viaaprilfools.protocol.scombattest8ctov1_16_2.ProtocolCombatTest8cTo1_16_2;
import com.viaversion.viaaprilfools.protocol.v1_14tos3d_shareware.Protocol1_14To3D_Shareware;
import com.viaversion.viaaprilfools.protocol.v1_16_2toscombattest8c.Protocol1_16_2ToCombatTest8c;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.Protocol1_21_5To_25w14craftmine;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.configuration.Config;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.ProtocolManager;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.File;
import java.util.logging.Logger;

public interface ViaAprilFoolsPlatform {
    default public void init(File configFile) {
        this.init(new com.viaversion.viaaprilfools.ViaAprilFoolsConfig(configFile, this.getLogger()));
    }

    default public void init(ViaAprilFoolsConfig config) {
        config.reload();
        ViaAprilFools.init((ViaAprilFoolsPlatform)this, (ViaAprilFoolsConfig)config);
        Via.getManager().getConfigurationProvider().register((Config)config);
        Via.getManager().getSubPlatforms().add("${impl_version}");
        ProtocolManager protocolManager = Via.getManager().getProtocolManager();
        protocolManager.registerProtocol((Protocol)new Protocol1_14To3D_Shareware(), AprilFoolsProtocolVersion.s3d_shareware, ProtocolVersion.v1_14);
        protocolManager.registerProtocol((Protocol)new Protocol3D_SharewareTo1_14(), ProtocolVersion.v1_14, AprilFoolsProtocolVersion.s3d_shareware);
        protocolManager.registerProtocol((Protocol)new Protocol20w14infiniteTo1_16(), ProtocolVersion.v1_16, AprilFoolsProtocolVersion.s20w14infinite);
        protocolManager.registerProtocol((Protocol)new Protocol1_16_2ToCombatTest8c(), AprilFoolsProtocolVersion.sCombatTest8c, ProtocolVersion.v1_16_2);
        protocolManager.registerProtocol((Protocol)new ProtocolCombatTest8cTo1_16_2(), ProtocolVersion.v1_16_2, AprilFoolsProtocolVersion.sCombatTest8c);
        protocolManager.registerProtocol((Protocol)new Protocol1_21_5To_25w14craftmine(), AprilFoolsProtocolVersion.s25w14craftMine, ProtocolVersion.v1_21_5);
        protocolManager.registerProtocol((Protocol)new Protocol25w14craftmineTo1_21_5(), ProtocolVersion.v1_21_5, AprilFoolsProtocolVersion.s25w14craftMine);
    }

    public Logger getLogger();

    public File getDataFolder();
}

