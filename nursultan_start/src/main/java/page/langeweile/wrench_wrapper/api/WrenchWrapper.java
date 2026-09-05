/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  org.jspecify.annotations.NonNull
 *  org.quiltmc.config.api.ReflectiveConfig
 *  org.quiltmc.config.implementor_api.ConfigEnvironment
 */
package page.langeweile.wrench_wrapper.api;

import net.fabricmc.loader.api.FabricLoader;
import org.jspecify.annotations.NonNull;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.implementor_api.ConfigEnvironment;
import page.langeweile.wrench_wrapper.impl.fabric.FabricWrapper;
import page.langeweile.wrench_wrapper.impl.quilt.QuiltWrapper;

public class WrenchWrapper {
    public static <C extends ReflectiveConfig> @NonNull C create(String string, String string2, Class<C> clazz) {
        if (FabricLoader.getInstance().isModLoaded("quilt_loader")) {
            return QuiltWrapper.create(string, string2, clazz);
        }
        return FabricWrapper.create(string, string2, clazz);
    }

    public static @NonNull ConfigEnvironment getConfigEnvironment() {
        if (FabricLoader.getInstance().isModLoaded("quilt_loader")) {
            return QuiltWrapper.getConfigEnvironment();
        }
        return FabricWrapper.getConfigEnvironment();
    }
}

