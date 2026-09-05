/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08280
 *  minecraft.class08829
 *  net.fabricmc.loader.api.ModContainer
 *  org.apache.commons.lang3.Validate
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class01894;
import minecraft.class08280;
import minecraft.class08829;
import net.fabricmc.loader.api.ModContainer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricIconHandler
implements Closeable {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Mod Menu | FabricIconHandler");
    private final Map<Path, class08829> modIconCache = new HashMap<Path, class08829>();

    @Override
    public void close() {
        for (class08829 class088292 : this.modIconCache.values()) {
            class088292.close();
        }
    }

    class08829 getCachedModIcon(Path path) {
        return this.modIconCache.get(path);
    }

    void cacheModIcon(Path path, class08829 class088292) {
        this.modIconCache.put(path, class088292);
    }

    public class08829 createIcon(ModContainer modContainer, String string) {
        class08829 class088292;
        block13: {
            Path path = modContainer.getPath(string);
            class08829 class088293 = this.getCachedModIcon(path);
            if (class088293 != null) {
                return class088293;
            }
            class088293 = this.getCachedModIcon(path);
            if (class088293 != null) {
                return class088293;
            }
            InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                class08280 class082802 = class08280.N((InputStream)Objects.requireNonNull(inputStream));
                Validate.validState((class082802.y() == class082802.N() ? 1 : 0) != 0, (String)"Must be square icon", (Object[])new Object[0]);
                class08829 class088294 = new class08829(() -> class01894.N((String)"modmenu", (String)path.toString()).toString(), class082802);
                this.cacheModIcon(path, class088294);
                class088292 = class088294;
                if (inputStream == null) break block13;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IllegalStateException illegalStateException) {
                    if (illegalStateException.getMessage().equals("Must be square icon")) {
                        LOGGER.error("Mod icon must be a square for icon source {}: {}", (Object)modContainer.getMetadata().getId(), (Object)string);
                    }
                    return null;
                }
                catch (Throwable throwable3) {
                    if (!string.equals("assets/" + modContainer.getMetadata().getId() + "/icon.png")) {
                        LOGGER.error("Invalid mod icon for icon source {}: {}", (Object)modContainer.getMetadata().getId(), (Object)string);
                    }
                    return null;
                }
            }
            inputStream.close();
        }
        return class088292;
    }
}

