/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01603
 *  minecraft.class01894
 *  minecraft.class01929
 *  net.fabricmc.fabric.api.resource.v1.DataResourceLoader
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import minecraft.class01081;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class01929;
import net.fabricmc.fabric.api.resource.v1.DataResourceLoader;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl;
import net.fabricmc.fabric.impl.resource.SetupMarkerResourceReloader;
import org.jspecify.annotations.Nullable;

public final class DataResourceLoaderImpl
extends ResourceLoaderImpl
implements DataResourceLoader {
    public static final DataResourceLoaderImpl INSTANCE = new DataResourceLoaderImpl();
    private final Map<class01894, Function<class01929, class01081>> addedReloaderFactories = new LinkedHashMap<class01894, Function<class01929, class01081>>();

    private DataResourceLoaderImpl() {
        super(class01603.field_14190);
    }

    @Override
    protected boolean hasResourceReloader(class01894 class018942) {
        return super.hasResourceReloader(class018942) || this.addedReloaderFactories.containsKey(class018942);
    }

    @Override
    protected Set<Map.Entry<class01894, class01081>> collectReloadersToAdd(@Nullable SetupMarkerResourceReloader setupMarkerResourceReloader) {
        if (setupMarkerResourceReloader == null) {
            throw new IllegalStateException("The setup marker should not be null for data resource loading.");
        }
        class01929 class019292 = setupMarkerResourceReloader.registries();
        Set<Map.Entry<class01894, class01081>> set = super.collectReloadersToAdd(setupMarkerResourceReloader);
        for (Map.Entry<class01894, Function<class01929, class01081>> entry : this.addedReloaderFactories.entrySet()) {
            class01081 class010812 = entry.getValue().apply(class019292);
            set.add(Map.entry(entry.getKey(), class010812));
        }
        return set;
    }

    public void registerReloader(class01894 class018942, Function<class01929, class01081> function) {
        Objects.requireNonNull(class018942, "The reloader identifier should not be null.");
        Objects.requireNonNull(function, "The reloader factory should not be null.");
        this.checkUniqueResourceReloader(class018942);
        for (Map.Entry<class01894, Function<class01929, class01081>> entry : this.addedReloaderFactories.entrySet()) {
            if (entry.getValue() != function) continue;
            throw new IllegalStateException("Resource reloader factory with ID %s already in resource reloader factory set with ID %s!".formatted(new Object[]{class018942, entry.getKey()}));
        }
        this.addedReloaderFactories.put(class018942, function);
    }
}

