/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  net.raphimc.viabedrock.platform.ViaBedrockPlatform
 */
package net.raphimc.viabedrock;

import com.viaversion.viaversion.api.Via;
import java.io.File;
import java.util.logging.Logger;
import net.raphimc.viabedrock.platform.ViaBedrockPlatform;

public class ViaBedrockPlatformImpl
implements ViaBedrockPlatform {
    private final Logger logger = Via.getPlatform().createLogger("ViaBedrock");

    public ViaBedrockPlatformImpl() {
        this.init(new File(this.getDataFolder(), "viabedrock.yml"));
    }

    public Logger getLogger() {
        return this.logger;
    }

    public File getDataFolder() {
        return Via.getPlatform().getDataFolder();
    }
}

