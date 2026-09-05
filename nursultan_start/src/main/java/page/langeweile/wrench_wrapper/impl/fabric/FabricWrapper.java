/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  org.quiltmc.config.api.ReflectiveConfig
 *  org.quiltmc.config.api.Serializer
 *  org.quiltmc.config.api.serializers.Json5Serializer
 *  org.quiltmc.config.implementor_api.ConfigEnvironment
 *  org.quiltmc.config.implementor_api.ConfigFactory
 */
package page.langeweile.wrench_wrapper.impl.fabric;

import net.fabricmc.loader.api.FabricLoader;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.Serializer;
import org.quiltmc.config.api.serializers.Json5Serializer;
import org.quiltmc.config.implementor_api.ConfigEnvironment;
import org.quiltmc.config.implementor_api.ConfigFactory;

public class FabricWrapper {
    private static final ConfigEnvironment CONFIG_ENVIRONMENT = new ConfigEnvironment(FabricLoader.getInstance().getConfigDir(), (Serializer)Json5Serializer.INSTANCE, new Serializer[]{Json5Serializer.INSTANCE});

    public static <C extends ReflectiveConfig> C create(String string, String string2, Class<C> clazz) {
        return (C)ConfigFactory.create((ConfigEnvironment)CONFIG_ENVIRONMENT, (String)string, (String)string2, clazz);
    }

    public static ConfigEnvironment getConfigEnvironment() {
        return CONFIG_ENVIRONMENT;
    }
}

