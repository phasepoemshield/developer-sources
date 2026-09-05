/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 *  net.fabricmc.loader.api.FabricLoader
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.client.indigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.function.Function;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.fabric.impl.client.indigo.IndigoMixinConfigPlugin;
import net.fabricmc.fabric.impl.client.indigo.renderer.IndigoRenderer;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoConfig;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class Indigo
implements ClientModInitializer {
    public static final AoConfig AMBIENT_OCCLUSION_MODE;
    public static final boolean DEBUG_COMPARE_LIGHTING;
    public static final boolean FIX_SMOOTH_LIGHTING_OFFSET;
    public static final boolean FIX_MEAN_LIGHT_CALCULATION;
    public static final boolean FIX_EXTERIOR_VERTEX_LIGHTING;
    public static final boolean FIX_LUMINOUS_AO_SHADE;
    public static final Logger LOGGER;

    private static boolean asBoolean(String string, boolean bl) {
        switch (Indigo.asTriState(string)) {
            case TRUE: {
                return true;
            }
            case FALSE: {
                return false;
            }
        }
        return bl;
    }

    private static TriState asTriState(String string) {
        if (string == null || string.isEmpty()) {
            return TriState.DEFAULT;
        }
        switch (string.toLowerCase(Locale.ROOT)) {
            case "true": {
                return TriState.TRUE;
            }
            case "false": {
                return TriState.FALSE;
            }
        }
        return TriState.DEFAULT;
    }

    private static <T extends Enum> T asEnum(String string, T t) {
        if (string == null || string.isEmpty()) {
            return t;
        }
        for (Enum enum_ : (Enum[])t.getClass().getEnumConstants()) {
            if (!string.equalsIgnoreCase(enum_.name())) continue;
            return (T)enum_;
        }
        return t;
    }

    public void onInitializeClient() {
        if (IndigoMixinConfigPlugin.shouldApplyIndigo()) {
            LOGGER.info("[Indigo] Registering Indigo renderer!");
            Renderer.register((Renderer)IndigoRenderer.INSTANCE);
        } else {
            LOGGER.info("[Indigo] Different rendering plugin detected; not applying Indigo.");
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(Indigo.class);
        File configDir = FabricLoader.getInstance().getConfigDir().resolve("fabric").toFile();
        if (!configDir.exists() && !configDir.mkdir()) {
            LOGGER.warn("[Indigo] Could not create configuration directory: " + configDir.getAbsolutePath());
        }
        File configFile = new File(configDir, "indigo-renderer.properties");
        Properties properties = new Properties();
        if (configFile.exists()) {
            try (FileInputStream stream = new FileInputStream(configFile);){
                properties.load(stream);
            }
            catch (IOException e) {
                LOGGER.warn("[Indigo] Could not read property file '" + configFile.getAbsolutePath() + "'", (Throwable)e);
            }
        }
        AMBIENT_OCCLUSION_MODE = Indigo.asEnum((String)properties.computeIfAbsent("ambient-occlusion-mode", (Function<? super Object, ?>)((Function<Object, Object>)object -> "hybrid")), AoConfig.HYBRID);
        DEBUG_COMPARE_LIGHTING = Indigo.asBoolean((String)properties.computeIfAbsent("debug-compare-lighting", (Function<? super Object, ?>)((Function<Object, Object>)object -> "auto")), false);
        FIX_SMOOTH_LIGHTING_OFFSET = Indigo.asBoolean((String)properties.computeIfAbsent("fix-smooth-lighting-offset", (Function<? super Object, ?>)((Function<Object, Object>)object -> "auto")), true);
        boolean fixMeanLightCalculation = Indigo.asBoolean((String)properties.computeIfAbsent("fix-mean-light-calculation", (Function<? super Object, ?>)((Function<Object, Object>)object -> "auto")), true);
        FIX_EXTERIOR_VERTEX_LIGHTING = Indigo.asBoolean((String)properties.computeIfAbsent("fix-exterior-vertex-lighting", (Function<? super Object, ?>)((Function<Object, Object>)object -> "auto")), true);
        FIX_LUMINOUS_AO_SHADE = Indigo.asBoolean((String)properties.computeIfAbsent("fix-luminous-block-ambient-occlusion", (Function<? super Object, ?>)((Function<Object, Object>)object -> "auto")), false);
        if (fixMeanLightCalculation && !FIX_SMOOTH_LIGHTING_OFFSET) {
            fixMeanLightCalculation = false;
            LOGGER.warn("[Indigo] Config enabled 'fix-mean-light-calculation' but disabled 'fix-smooth-lighting-offset'; this is not supported! 'fix-mean-light-calculation' will be considered disabled.");
        }
        FIX_MEAN_LIGHT_CALCULATION = fixMeanLightCalculation;
        try (FileOutputStream stream = new FileOutputStream(configFile);){
            properties.store(stream, "Indigo properties file");
        }
        catch (IOException e) {
            LOGGER.warn("[Indigo] Could not store property file '" + configFile.getAbsolutePath() + "'", (Throwable)e);
        }
    }
}

