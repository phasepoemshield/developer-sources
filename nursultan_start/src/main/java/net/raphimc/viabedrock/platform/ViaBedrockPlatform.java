/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.configuration.Config
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.ProtocolManager
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.ViaBedrockConfig
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 */
package net.raphimc.viabedrock.platform;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.configuration.Config;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.ProtocolManager;
import java.io.File;
import java.util.logging.Logger;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.platform.ViaBedrockConfig;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.data.ProtocolConstants;

public interface ViaBedrockPlatform {
    default public void init(File configFile) {
        this.init((ViaBedrockConfig)new net.raphimc.viabedrock.ViaBedrockConfig(configFile, this.getLogger()));
    }

    default public void init(ViaBedrockConfig config) {
        config.reload();
        Via.getManager().getConfigurationProvider().register((Config)config);
        ViaBedrock.init((ViaBedrockPlatform)this, (ViaBedrockConfig)config);
        Via.getManager().getSubPlatforms().add("git-ViaBedrock-0.0.27-SNAPSHOT:449686c8");
        ProtocolManager protocolManager = Via.getManager().getProtocolManager();
        protocolManager.registerProtocol((Protocol)new BedrockProtocol(), ProtocolConstants.JAVA_VERSION, BedrockProtocolVersion.bedrockLatest);
        this.getServerPacksFolder().mkdirs();
        this.getBlobCacheFolder().mkdirs();
    }

    public Logger getLogger();

    public File getDataFolder();

    default public File getBlobCacheFolder() {
        return new File(this.getDataCacheFolder(), "blob_cache");
    }

    default public File getDataCacheFolder() {
        return new File(this.getDataFolder(), "viabedrock");
    }

    default public File getServerPacksFolder() {
        return new File(this.getDataCacheFolder(), "server_packs");
    }
}

