/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.protocol.ProtocolManagerImpl
 */
package net.raphimc.vialegacy;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.protocol.ProtocolManagerImpl;
import java.io.File;
import java.util.logging.Logger;
import net.raphimc.vialegacy.platform.ViaLegacyPlatform;

public class ViaLegacyPlatformImpl
implements ViaLegacyPlatform {
    private final Logger logger = Via.getPlatform().createLogger("ViaLegacy");

    public ViaLegacyPlatformImpl() {
        this.init(new File(this.getDataFolder(), "vialegacy.yml"));
        Via.getManager().addPostEnableListener(() -> {
            Via.getManager().getProtocolManager().setMaxProtocolPathSize(Integer.MAX_VALUE);
            Via.getManager().getProtocolManager().setMaxPathDeltaIncrease(-1);
            ((ProtocolManagerImpl)Via.getManager().getProtocolManager()).refreshVersions();
        });
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public File getDataFolder() {
        return Via.getPlatform().getDataFolder();
    }
}

