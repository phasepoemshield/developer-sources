/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.helpers.OptionalBoolean
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shaderpack.properties;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Optional;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.helpers.OptionalBoolean;
import net.irisshaders.iris.shaderpack.parsing.DirectiveHolder;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$DepthSamplingSettings;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$SamplingSettings;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;
import net.irisshaders.iris.shaderpack.properties.ShadowCullState;
import org.joml.Vector4f;

public class PackShadowDirectives {
    public static final int MAX_SHADOW_COLOR_BUFFERS_IRIS = 8;
    public static final int MAX_SHADOW_COLOR_BUFFERS_OF = 2;
    private final OptionalBoolean shadowEnabled;
    private final OptionalBoolean dhShadowEnabled;
    private final boolean shouldRenderTerrain;
    private final boolean shouldRenderTranslucent;
    private final boolean shouldRenderEntities;
    private final boolean shouldRenderPlayer;
    private final boolean shouldRenderBlockEntities;
    private final boolean shouldRenderLightBlockEntities;
    private final ShadowCullState cullingState;
    private final ImmutableList<PackShadowDirectives$DepthSamplingSettings> depthSamplingSettings;
    private final Int2ObjectMap<PackShadowDirectives$SamplingSettings> colorSamplingSettings;
    private int resolution;
    private Float fov;
    private float distance;
    private float nearPlane;
    private float farPlane;
    private float voxelDistance;
    private float distanceRenderMul;
    private float entityShadowDistanceMul;
    private boolean explicitRenderDistance;
    private float intervalSize;

    public float getFarPlane() {
        return this.farPlane;
    }

    public float getNearPlane() {
        return this.nearPlane;
    }

    public PackShadowDirectives(ShaderProperties shaderProperties) {
        this.resolution = 1024;
        this.fov = null;
        this.distance = 160.0f;
        this.nearPlane = -100.05f;
        this.farPlane = 156.0f;
        this.voxelDistance = 0.0f;
        this.distanceRenderMul = -1.0f;
        this.entityShadowDistanceMul = 1.0f;
        this.explicitRenderDistance = false;
        this.intervalSize = 2.0f;
        this.shouldRenderTerrain = shaderProperties.getShadowTerrain().orElse(true);
        this.shouldRenderTranslucent = shaderProperties.getShadowTranslucent().orElse(true);
        this.shouldRenderEntities = shaderProperties.getShadowEntities().orElse(true);
        this.shouldRenderPlayer = shaderProperties.getShadowPlayer().orElse(false);
        this.shouldRenderBlockEntities = shaderProperties.getShadowBlockEntities().orElse(true);
        this.shouldRenderLightBlockEntities = shaderProperties.getShadowLightBlockEntities().orElse(false);
        this.cullingState = shaderProperties.getShadowCulling();
        this.shadowEnabled = shaderProperties.getShadowEnabled();
        this.dhShadowEnabled = shaderProperties.getDhShadowEnabled();
        this.depthSamplingSettings = ImmutableList.of((Object)new PackShadowDirectives$DepthSamplingSettings(), (Object)new PackShadowDirectives$DepthSamplingSettings());
        ImmutableList.Builder builder = ImmutableList.builder();
        this.colorSamplingSettings = new Int2ObjectArrayMap();
    }

    public PackShadowDirectives(PackShadowDirectives packShadowDirectives) {
        this.resolution = packShadowDirectives.resolution;
        this.fov = packShadowDirectives.fov;
        this.distance = packShadowDirectives.distance;
        this.nearPlane = packShadowDirectives.nearPlane;
        this.farPlane = packShadowDirectives.farPlane;
        this.voxelDistance = packShadowDirectives.voxelDistance;
        this.distanceRenderMul = packShadowDirectives.distanceRenderMul;
        this.entityShadowDistanceMul = packShadowDirectives.entityShadowDistanceMul;
        this.explicitRenderDistance = packShadowDirectives.explicitRenderDistance;
        this.intervalSize = packShadowDirectives.intervalSize;
        this.shouldRenderTerrain = packShadowDirectives.shouldRenderTerrain;
        this.shouldRenderTranslucent = packShadowDirectives.shouldRenderTranslucent;
        this.shouldRenderEntities = packShadowDirectives.shouldRenderEntities;
        this.shouldRenderPlayer = packShadowDirectives.shouldRenderPlayer;
        this.shouldRenderBlockEntities = packShadowDirectives.shouldRenderBlockEntities;
        this.shouldRenderLightBlockEntities = packShadowDirectives.shouldRenderLightBlockEntities;
        this.cullingState = packShadowDirectives.cullingState;
        this.depthSamplingSettings = packShadowDirectives.depthSamplingSettings;
        this.colorSamplingSettings = packShadowDirectives.colorSamplingSettings;
        this.shadowEnabled = packShadowDirectives.shadowEnabled;
        this.dhShadowEnabled = packShadowDirectives.dhShadowEnabled;
    }

    public String toString() {
        return "PackShadowDirectives{resolution=" + this.resolution + ", fov=" + this.fov + ", distance=" + this.distance + ", distanceRenderMul=" + this.distanceRenderMul + ", entityDistanceRenderMul=" + this.entityShadowDistanceMul + ", intervalSize=" + this.intervalSize + ", depthSamplingSettings=" + String.valueOf(this.depthSamplingSettings) + ", colorSamplingSettings=" + String.valueOf(this.colorSamplingSettings) + "}";
    }

    public boolean isDistanceRenderMulExplicit() {
        return this.explicitRenderDistance;
    }

    private static void acceptDepthFilteringSettings(DirectiveHolder directiveHolder, ImmutableList<PackShadowDirectives$DepthSamplingSettings> immutableList) {
        if (!immutableList.isEmpty()) {
            directiveHolder.acceptConstBooleanDirective("shadowtexNearest", ((PackShadowDirectives$DepthSamplingSettings)immutableList.getFirst())::setNearest);
        }
        for (int i = 0; i < immutableList.size(); ++i) {
            String string = "shadowtex" + i + "Nearest";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$DepthSamplingSettings)immutableList.get(i))::setNearest);
            string = "shadow" + i + "MinMagNearest";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$DepthSamplingSettings)immutableList.get(i))::setNearest);
        }
    }

    private static void acceptColorFilteringSettings(DirectiveHolder directiveHolder, Int2ObjectMap<PackShadowDirectives$SamplingSettings> int2ObjectMap) {
        for (int i = 0; i < 8; ++i) {
            String string = "shadowcolor" + i + "Nearest";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(i, n -> new PackShadowDirectives$SamplingSettings()))::setNearest);
            string = "shadowColor" + i + "Nearest";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(i, n -> new PackShadowDirectives$SamplingSettings()))::setNearest);
            string = "shadowColor" + i + "MinMagNearest";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(i, n -> new PackShadowDirectives$SamplingSettings()))::setNearest);
        }
    }

    private static void acceptHardwareFilteringSettings(DirectiveHolder directiveHolder, ImmutableList<PackShadowDirectives$DepthSamplingSettings> immutableList) {
        directiveHolder.acceptConstBooleanDirective("shadowHardwareFiltering", bl -> {
            for (PackShadowDirectives$DepthSamplingSettings packShadowDirectives$DepthSamplingSettings : immutableList) {
                packShadowDirectives$DepthSamplingSettings.setHardwareFiltering(bl);
            }
        });
        for (int i = 0; i < immutableList.size(); ++i) {
            String string = "shadowHardwareFiltering" + i;
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$DepthSamplingSettings)immutableList.get(i))::setHardwareFiltering);
        }
    }

    public boolean shouldRenderLightBlockEntities() {
        return this.shouldRenderLightBlockEntities;
    }

    public OptionalBoolean isDhShadowEnabled() {
        return this.dhShadowEnabled;
    }

    public int getResolution() {
        return this.resolution;
    }

    public OptionalBoolean isShadowEnabled() {
        return this.shadowEnabled;
    }

    public float getDistance() {
        return this.distance;
    }

    public float getDistanceRenderMul() {
        return this.distanceRenderMul;
    }

    public Float getFov() {
        return this.fov;
    }

    public void acceptDirectives(DirectiveHolder directiveHolder) {
        directiveHolder.acceptCommentIntDirective("SHADOWRES", n -> {
            this.resolution = n;
        });
        directiveHolder.acceptConstIntDirective("shadowMapResolution", n -> {
            this.resolution = n;
        });
        directiveHolder.acceptCommentFloatDirective("SHADOWFOV", f -> {
            this.fov = Float.valueOf(f);
        });
        directiveHolder.acceptConstFloatDirective("shadowMapFov", f -> {
            this.fov = Float.valueOf(f);
        });
        directiveHolder.acceptCommentFloatDirective("SHADOWHPL", f -> {
            this.distance = f;
        });
        directiveHolder.acceptConstFloatDirective("shadowDistance", f -> {
            this.distance = f;
        });
        directiveHolder.acceptConstFloatDirective("shadowNearPlane", f -> {
            this.nearPlane = f;
        });
        directiveHolder.acceptConstFloatDirective("shadowFarPlane", f -> {
            this.farPlane = f;
        });
        directiveHolder.acceptConstFloatDirective("voxelDistance", f -> {
            this.voxelDistance = f;
        });
        directiveHolder.acceptConstFloatDirective("entityShadowDistanceMul", f -> {
            this.entityShadowDistanceMul = f;
        });
        directiveHolder.acceptConstFloatDirective("shadowDistanceRenderMul", f -> {
            this.distanceRenderMul = f;
            this.explicitRenderDistance = true;
        });
        directiveHolder.acceptConstFloatDirective("shadowIntervalSize", f -> {
            this.intervalSize = f;
        });
        PackShadowDirectives.acceptHardwareFilteringSettings(directiveHolder, this.depthSamplingSettings);
        PackShadowDirectives.acceptDepthMipmapSettings(directiveHolder, this.depthSamplingSettings);
        PackShadowDirectives.acceptColorMipmapSettings(directiveHolder, this.colorSamplingSettings);
        PackShadowDirectives.acceptDepthFilteringSettings(directiveHolder, this.depthSamplingSettings);
        PackShadowDirectives.acceptColorFilteringSettings(directiveHolder, this.colorSamplingSettings);
        this.acceptBufferDirectives(directiveHolder, this.colorSamplingSettings);
    }

    public boolean shouldRenderPlayer() {
        return this.shouldRenderPlayer;
    }

    public ShadowCullState getCullingState() {
        return this.cullingState;
    }

    public float getIntervalSize() {
        return this.intervalSize;
    }

    public float getVoxelDistance() {
        return this.voxelDistance;
    }

    public boolean shouldRenderTranslucent() {
        return this.shouldRenderTranslucent;
    }

    public ImmutableList<PackShadowDirectives$DepthSamplingSettings> getDepthSamplingSettings() {
        return this.depthSamplingSettings;
    }

    public Int2ObjectMap<PackShadowDirectives$SamplingSettings> getColorSamplingSettings() {
        return this.colorSamplingSettings;
    }

    private void acceptBufferDirectives(DirectiveHolder directiveHolder, Int2ObjectMap<PackShadowDirectives$SamplingSettings> int2ObjectMap) {
        int n = 0;
        while (n < 8) {
            String string = "shadowcolor" + n;
            int n2 = n++;
            directiveHolder.acceptConstStringDirective(string + "Format", string2 -> {
                Optional optional = InternalTextureFormat.fromString((String)string2);
                if (optional.isPresent()) {
                    ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(n2, n -> new PackShadowDirectives$SamplingSettings())).setFormat((InternalTextureFormat)optional.get());
                } else {
                    Iris.logger.warn("Unrecognized internal texture format " + string2 + " specified for " + string + "Format, ignoring.");
                }
            });
            directiveHolder.acceptConstBooleanDirective(string + "Clear", bl -> ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(n2, n -> new PackShadowDirectives$SamplingSettings())).setClear(bl));
            directiveHolder.acceptConstVec4Directive(string + "ClearColor", vector4f -> ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(n2, n -> new PackShadowDirectives$SamplingSettings())).setClearColor((Vector4f)vector4f));
        }
    }

    public boolean shouldRenderEntities() {
        return this.shouldRenderEntities;
    }

    private static void acceptDepthMipmapSettings(DirectiveHolder directiveHolder, ImmutableList<PackShadowDirectives$DepthSamplingSettings> immutableList) {
        directiveHolder.acceptConstBooleanDirective("generateShadowMipmap", bl -> {
            for (PackShadowDirectives$SamplingSettings packShadowDirectives$SamplingSettings : immutableList) {
                packShadowDirectives$SamplingSettings.setMipmap(bl);
            }
        });
        if (!immutableList.isEmpty()) {
            directiveHolder.acceptConstBooleanDirective("shadowtexMipmap", ((PackShadowDirectives$DepthSamplingSettings)immutableList.getFirst())::setMipmap);
        }
        for (int i = 0; i < immutableList.size(); ++i) {
            String string = "shadowtex" + i + "Mipmap";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$DepthSamplingSettings)immutableList.get(i))::setMipmap);
        }
    }

    private static void acceptColorMipmapSettings(DirectiveHolder directiveHolder, Int2ObjectMap<PackShadowDirectives$SamplingSettings> int2ObjectMap) {
        directiveHolder.acceptConstBooleanDirective("generateShadowColorMipmap", bl -> int2ObjectMap.forEach((n, packShadowDirectives$SamplingSettings) -> packShadowDirectives$SamplingSettings.setMipmap(bl)));
        for (int i = 0; i < 8; ++i) {
            String string = "shadowcolor" + i + "Mipmap";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(i, n -> new PackShadowDirectives$SamplingSettings()))::setMipmap);
            string = "shadowColor" + i + "Mipmap";
            directiveHolder.acceptConstBooleanDirective(string, ((PackShadowDirectives$SamplingSettings)int2ObjectMap.computeIfAbsent(i, n -> new PackShadowDirectives$SamplingSettings()))::setMipmap);
        }
    }

    public float getEntityShadowDistanceMul() {
        return this.entityShadowDistanceMul;
    }

    public boolean shouldRenderTerrain() {
        return this.shouldRenderTerrain;
    }

    public boolean shouldRenderBlockEntities() {
        return this.shouldRenderBlockEntities;
    }
}

