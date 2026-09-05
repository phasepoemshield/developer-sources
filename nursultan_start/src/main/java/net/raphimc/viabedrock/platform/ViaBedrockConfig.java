/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.configuration.Config
 *  net.raphimc.viabedrock.protocol.provider.impl.NoOpResourcePackProvider
 */
package net.raphimc.viabedrock.platform;

import com.viaversion.viaversion.api.configuration.Config;
import java.util.function.Supplier;
import net.raphimc.viabedrock.protocol.provider.BlobCacheProvider;
import net.raphimc.viabedrock.protocol.provider.ResourcePackProvider;
import net.raphimc.viabedrock.protocol.provider.impl.DiskBlobCacheProvider;
import net.raphimc.viabedrock.protocol.provider.impl.DiskResourcePackProvider;
import net.raphimc.viabedrock.protocol.provider.impl.InMemoryBlobCacheProvider;
import net.raphimc.viabedrock.protocol.provider.impl.InMemoryResourcePackProvider;
import net.raphimc.viabedrock.protocol.provider.impl.NoOpBlobCacheProvider;
import net.raphimc.viabedrock.protocol.provider.impl.NoOpResourcePackProvider;

public interface ViaBedrockConfig
extends Config {
    public boolean shouldTranslateShowCoordinatesGameRule();

    public PackCacheMode getPackCacheMode();

    public String getResourcePackUrl();

    public BlobCacheMode getBlobCacheMode();

    public int getResourcePackPort();

    public String getResourcePackHost();

    public boolean shouldTranslateResourcePacks();

    public boolean shouldDisableServerBlacklist();

    public boolean shouldEnableExperimentalFeatures();

    public static enum PackCacheMode {
        DISABLED(NoOpResourcePackProvider::new),
        MEMORY(InMemoryResourcePackProvider::new),
        DISK(DiskResourcePackProvider::new);

        private final Supplier<ResourcePackProvider> providerSupplier;

        private PackCacheMode(Supplier<ResourcePackProvider> providerSupplier) {
            this.providerSupplier = providerSupplier;
        }

        public static PackCacheMode byName(String name) {
            for (PackCacheMode mode : PackCacheMode.values()) {
                if (!mode.name().equalsIgnoreCase(name)) continue;
                return mode;
            }
            return DISABLED;
        }

        public ResourcePackProvider createProvider() {
            return this.providerSupplier.get();
        }
    }

    public static enum BlobCacheMode {
        DISABLED(NoOpBlobCacheProvider::new),
        MEMORY(InMemoryBlobCacheProvider::new),
        DISK(DiskBlobCacheProvider::new);

        private final Supplier<BlobCacheProvider> providerSupplier;

        private BlobCacheMode(Supplier<BlobCacheProvider> providerSupplier) {
            this.providerSupplier = providerSupplier;
        }

        public static BlobCacheMode byName(String name) {
            for (BlobCacheMode mode : BlobCacheMode.values()) {
                if (!mode.name().equalsIgnoreCase(name)) continue;
                return mode;
            }
            return DISABLED;
        }

        public BlobCacheProvider createProvider() {
            return this.providerSupplier.get();
        }
    }
}

