/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08392
 *  org.apache.commons.lang3.StringUtils
 */
package net.irisshaders.iris.features;

import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import minecraft.class08392;
import net.irisshaders.iris.gl.IrisRenderSystem;
import org.apache.commons.lang3.StringUtils;

public enum FeatureFlags {
    SEPARATE_HARDWARE_SAMPLERS(() -> true, () -> true),
    HIGHER_SHADOWCOLOR(() -> true, () -> true),
    CUSTOM_IMAGES(() -> true, IrisRenderSystem::supportsImageLoadStore),
    PER_BUFFER_BLENDING(() -> true, IrisRenderSystem::supportsBufferBlending),
    COMPUTE_SHADERS(() -> true, IrisRenderSystem::supportsCompute),
    TESSELLATION_SHADERS(() -> true, IrisRenderSystem::supportsTesselation),
    ENTITY_TRANSLUCENT(() -> true, () -> true),
    REVERSED_CULLING(() -> true, () -> true),
    BLOCK_EMISSION_ATTRIBUTE(() -> true, () -> true),
    CAN_DISABLE_WEATHER(() -> true, () -> true),
    SSBO(() -> true, IrisRenderSystem::supportsSSBO),
    FADE_VARIABLE(() -> true, () -> true),
    TEXTURE_FILTERING(() -> true, () -> true),
    UNKNOWN(() -> false, () -> false);

    private final BooleanSupplier irisRequirement;
    private final BooleanSupplier hardwareRequirement;

    private FeatureFlags(BooleanSupplier booleanSupplier, BooleanSupplier booleanSupplier2) {
        this.irisRequirement = booleanSupplier;
        this.hardwareRequirement = booleanSupplier2;
    }

    public static FeatureFlags getValue(String string) {
        if (string.equalsIgnoreCase("TESSELATION_SHADERS")) {
            string = "TESSELLATION_SHADERS";
        }
        try {
            return FeatureFlags.valueOf(string.toUpperCase(Locale.US));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return UNKNOWN;
        }
    }

    public static boolean isInvalid(String string) {
        try {
            return !FeatureFlags.valueOf(string.toUpperCase(Locale.US)).isUsable();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return true;
        }
    }

    public static String getInvalidStatus(List<FeatureFlags> list) {
        FeatureFlags[] featureFlagsArray;
        boolean bl = false;
        boolean bl2 = false;
        for (FeatureFlags featureFlags : featureFlagsArray = list.toArray(new FeatureFlags[0])) {
            bl2 |= !featureFlags.irisRequirement.getAsBoolean();
            bl |= !featureFlags.hardwareRequirement.getAsBoolean();
        }
        if (bl2) {
            if (bl) {
                return class08392.N((String)"iris.unsupported.irisorpc", (Object[])new Object[0]);
            }
            return class08392.N((String)"iris.unsupported.iris", (Object[])new Object[0]);
        }
        if (bl) {
            return class08392.N((String)"iris.unsupported.pc", (Object[])new Object[0]);
        }
        return null;
    }

    public String getHumanReadableName() {
        return StringUtils.capitalize((String)this.name().replace("_", " ").toLowerCase());
    }

    public boolean isUsable() {
        return this.irisRequirement.getAsBoolean() && this.hardwareRequirement.getAsBoolean();
    }
}

