/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.runtime.SwitchBootstraps
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.AlphaTestFunction
 *  net.irisshaders.iris.gl.blending.BlendMode
 *  net.irisshaders.iris.gl.blending.BlendModeFunction
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.BufferBlendInformation
 *  net.irisshaders.iris.gl.buffer.ShaderStorageInfo
 *  net.irisshaders.iris.gl.framebuffer.ViewportData
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 *  net.irisshaders.iris.gl.texture.TextureDefinition
 *  net.irisshaders.iris.gl.texture.TextureDefinition$PNGDefinition
 *  net.irisshaders.iris.gl.texture.TextureDefinition$RawDefinition
 *  net.irisshaders.iris.gl.texture.TextureScaleOverride
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.OptionalBoolean
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  net.irisshaders.iris.shaderpack.ImageInformation
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms$Builder
 */
package net.irisshaders.iris.shaderpack.properties;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.io.StringReader;
import java.lang.runtime.SwitchBootstraps;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.AlphaTestFunction;
import net.irisshaders.iris.gl.blending.BlendMode;
import net.irisshaders.iris.gl.blending.BlendModeFunction;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BufferBlendInformation;
import net.irisshaders.iris.gl.buffer.ShaderStorageInfo;
import net.irisshaders.iris.gl.framebuffer.ViewportData;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.gl.texture.TextureDefinition;
import net.irisshaders.iris.gl.texture.TextureScaleOverride;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.OptionalBoolean;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.ImageInformation;
import net.irisshaders.iris.shaderpack.option.OrderBackedProperties;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.preprocessor.PropertiesPreprocessor;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import net.irisshaders.iris.shaderpack.properties.IndirectPointer;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings;
import net.irisshaders.iris.shaderpack.properties.ShadowCullState;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;

public class ShaderProperties {
    final CustomUniforms.Builder customUniforms = new CustomUniforms.Builder();
    private final Map<String, List<String>> profiles = new LinkedHashMap<String, List<String>>();
    private final Map<String, List<String>> subScreenOptions = new HashMap<String, List<String>>();
    private final Map<String, Integer> subScreenColumnCount = new HashMap<String, Integer>();
    private final Object2ObjectMap<String, AlphaTest> alphaTestOverrides = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, ViewportData> viewportScaleOverrides = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, TextureScaleOverride> textureScaleOverrides = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, BlendModeOverride> blendModeOverrides = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, IndirectPointer> indirectPointers = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, ArrayList<BufferBlendInformation>> bufferBlendOverrides = new Object2ObjectOpenHashMap();
    private final EnumMap<TextureStage, Object2ObjectMap<String, TextureDefinition>> customTextures = new EnumMap(TextureStage.class);
    private final Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> customTexturePatching = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, TextureDefinition> irisCustomTextures = new Object2ObjectOpenHashMap();
    private final List<ImageInformation> irisCustomImages = new ArrayList<ImageInformation>();
    private final Int2ObjectArrayMap<ShaderStorageInfo> bufferObjects = new Int2ObjectArrayMap();
    private final Object2ObjectMap<String, Object2BooleanMap<String>> explicitFlips = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, String> conditionallyEnabledPrograms = new Object2ObjectOpenHashMap();
    private int customTexAmount;
    private CloudSetting cloudSetting = CloudSetting.DEFAULT;
    private CloudSetting dhCloudSetting = CloudSetting.DEFAULT;
    private OptionalBoolean weather = OptionalBoolean.DEFAULT;
    private OptionalBoolean weatherParticles = OptionalBoolean.DEFAULT;
    private OptionalBoolean oldHandLight = OptionalBoolean.DEFAULT;
    private OptionalBoolean dynamicHandLight = OptionalBoolean.DEFAULT;
    private OptionalBoolean supportsColorCorrection = OptionalBoolean.DEFAULT;
    private OptionalBoolean oldLighting = OptionalBoolean.DEFAULT;
    private OptionalBoolean shadowTerrain = OptionalBoolean.DEFAULT;
    private OptionalBoolean shadowTranslucent = OptionalBoolean.DEFAULT;
    private OptionalBoolean shadowEntities = OptionalBoolean.DEFAULT;
    private OptionalBoolean shadowPlayer = OptionalBoolean.DEFAULT;
    private OptionalBoolean shadowBlockEntities = OptionalBoolean.DEFAULT;
    private OptionalBoolean shadowLightBlockEntities = OptionalBoolean.DEFAULT;
    private OptionalBoolean underwaterOverlay = OptionalBoolean.DEFAULT;
    private OptionalBoolean sun = OptionalBoolean.DEFAULT;
    private OptionalBoolean moon = OptionalBoolean.DEFAULT;
    private OptionalBoolean stars = OptionalBoolean.DEFAULT;
    private OptionalBoolean sky = OptionalBoolean.DEFAULT;
    private OptionalBoolean vignette = OptionalBoolean.DEFAULT;
    private OptionalBoolean backFaceSolid = OptionalBoolean.DEFAULT;
    private OptionalBoolean backFaceCutout = OptionalBoolean.DEFAULT;
    private OptionalBoolean backFaceCutoutMipped = OptionalBoolean.DEFAULT;
    private OptionalBoolean backFaceTranslucent = OptionalBoolean.DEFAULT;
    private OptionalBoolean rainDepth = OptionalBoolean.DEFAULT;
    private OptionalBoolean concurrentCompute = OptionalBoolean.DEFAULT;
    private OptionalBoolean beaconBeamDepth = OptionalBoolean.DEFAULT;
    private OptionalBoolean separateAo = OptionalBoolean.DEFAULT;
    private OptionalBoolean breaksAnisotropy = OptionalBoolean.DEFAULT;
    private OptionalBoolean voxelizeLightBlocks = OptionalBoolean.DEFAULT;
    private OptionalBoolean separateEntityDraws = OptionalBoolean.DEFAULT;
    private OptionalBoolean skipAllRendering = OptionalBoolean.DEFAULT;
    private OptionalBoolean frustumCulling = OptionalBoolean.DEFAULT;
    private OptionalBoolean supportsEndFlash = OptionalBoolean.DEFAULT;
    private OptionalBoolean occlusionCulling = OptionalBoolean.DEFAULT;
    private ShadowCullState shadowCulling = ShadowCullState.DEFAULT;
    private OptionalBoolean shadowEnabled = OptionalBoolean.DEFAULT;
    private OptionalBoolean dhShadowEnabled = OptionalBoolean.DEFAULT;
    private ParticleRenderingSettings particleRenderingSettings = ParticleRenderingSettings.UNSET;
    private OptionalBoolean prepareBeforeShadow = OptionalBoolean.DEFAULT;
    private List<String> sliderOptions = new ArrayList<String>();
    private List<String> mainScreenOptions = null;
    private Integer mainScreenColumnCount = null;
    private int fallbackTex = 0;
    private String noiseTexturePath = null;
    private List<String> requiredFeatureFlags = new ArrayList<String>();
    private List<String> optionalFeatureFlags = new ArrayList<String>();

    public CloudSetting getCloudSetting() {
        return this.cloudSetting;
    }

    public OptionalBoolean breaksAnisotropy() {
        return this.breaksAnisotropy;
    }

    public OptionalBoolean supportsEndFlash() {
        return this.supportsEndFlash;
    }

    private ShaderProperties() {
    }

    public ShaderProperties(String string, ShaderPackOptions shaderPackOptions, Iterable<StringPair> iterable) {
        String string2 = PropertiesPreprocessor.preprocessSource(string, shaderPackOptions, iterable);
        if (Iris.getIrisConfig().areDebugOptionsEnabled()) {
            try {
                Files.writeString(IrisPlatformHelpers.getInstance().getGameDir().resolve("preprocessed.properties"), (CharSequence)string2, new OpenOption[0]);
                Files.writeString(IrisPlatformHelpers.getInstance().getGameDir().resolve("original.properties"), (CharSequence)string, new OpenOption[0]);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        OrderBackedProperties orderBackedProperties = new OrderBackedProperties();
        OrderBackedProperties orderBackedProperties2 = new OrderBackedProperties();
        try {
            orderBackedProperties.load(new StringReader(string2));
            orderBackedProperties2.load(new StringReader(string));
        }
        catch (IOException iOException) {
            Iris.logger.error("Error loading shaders.properties!", (Throwable)iOException);
        }
        ((Properties)orderBackedProperties).forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
            int n2;
            String[] stringArray;
            String string = (String)object;
            String[] stringArray2 = (String[])object2;
            if ("texture.noise".equals(string)) {
                this.noiseTexturePath = stringArray2;
                return;
            }
            if ("clouds".equals(string)) {
                stringArray = stringArray2;
                n2 = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{"off", "fast", "fancy"}, (Object)stringArray, (int)n2)) {
                    case 0: {
                        this.cloudSetting = CloudSetting.OFF;
                        break;
                    }
                    case 1: {
                        this.cloudSetting = CloudSetting.FAST;
                        break;
                    }
                    case 2: {
                        this.cloudSetting = CloudSetting.FANCY;
                        break;
                    }
                    default: {
                        Iris.logger.error("Unrecognized clouds setting: " + (String)stringArray2);
                    }
                }
            }
            if ("dhClouds".equals(string)) {
                if ("off".equals(stringArray2)) {
                    this.dhCloudSetting = CloudSetting.OFF;
                } else if ("on".equals(stringArray2) || "fancy".equals(stringArray2)) {
                    this.dhCloudSetting = CloudSetting.FANCY;
                } else {
                    Iris.logger.error("Unrecognized DH clouds setting (need off, on): " + (String)stringArray2);
                }
            }
            if ("shadow.culling".equals(string)) {
                stringArray = stringArray2;
                n2 = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{"false", "true", "reversed", "safe_zone"}, (Object)stringArray, (int)n2)) {
                    case 0: {
                        this.shadowCulling = ShadowCullState.DISTANCE;
                        break;
                    }
                    case 1: {
                        this.shadowCulling = ShadowCullState.ADVANCED;
                        break;
                    }
                    case 2: 
                    case 3: {
                        this.shadowCulling = ShadowCullState.SAFE_ZONE;
                        break;
                    }
                    default: {
                        Iris.logger.error("Unrecognized shadow culling setting: " + (String)stringArray2);
                    }
                }
            }
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "oldHandLight", optionalBoolean -> {
                this.oldHandLight = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "dynamicHandLight", optionalBoolean -> {
                this.dynamicHandLight = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "oldLighting", optionalBoolean -> {
                this.oldLighting = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadowTerrain", optionalBoolean -> {
                this.shadowTerrain = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadowTranslucent", optionalBoolean -> {
                this.shadowTranslucent = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadowEntities", optionalBoolean -> {
                this.shadowEntities = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadowPlayer", optionalBoolean -> {
                this.shadowPlayer = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadowBlockEntities", optionalBoolean -> {
                this.shadowBlockEntities = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadowLightBlockEntities", optionalBoolean -> {
                this.shadowLightBlockEntities = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "underwaterOverlay", optionalBoolean -> {
                this.underwaterOverlay = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "sun", optionalBoolean -> {
                this.sun = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "moon", optionalBoolean -> {
                this.moon = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "stars", optionalBoolean -> {
                this.stars = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "sky", optionalBoolean -> {
                this.sky = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "vignette", optionalBoolean -> {
                this.vignette = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "backFace.solid", optionalBoolean -> {
                this.backFaceSolid = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "backFace.cutout", optionalBoolean -> {
                this.backFaceCutout = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "backFace.cutoutMipped", optionalBoolean -> {
                this.backFaceCutoutMipped = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "backFace.translucent", optionalBoolean -> {
                this.backFaceTranslucent = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "rain.depth", optionalBoolean -> {
                this.rainDepth = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "allowConcurrentCompute", optionalBoolean -> {
                this.concurrentCompute = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "beacon.beam.depth", optionalBoolean -> {
                this.beaconBeamDepth = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "separateAo", optionalBoolean -> {
                this.separateAo = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "breaksAnisotropy", optionalBoolean -> {
                this.breaksAnisotropy = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "voxelizeLightBlocks", optionalBoolean -> {
                this.voxelizeLightBlocks = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "separateEntityDraws", optionalBoolean -> {
                this.separateEntityDraws = optionalBoolean;
                this.particleRenderingSettings = ParticleRenderingSettings.MIXED;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "frustum.culling", optionalBoolean -> {
                this.frustumCulling = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "endFlashShadows", optionalBoolean -> {
                this.supportsEndFlash = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "occlusion.culling", optionalBoolean -> {
                this.occlusionCulling = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "shadow.enabled", optionalBoolean -> {
                this.shadowEnabled = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "skipAllRendering", optionalBoolean -> {
                this.skipAllRendering = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "dhShadow.enabled", optionalBoolean -> {
                this.dhShadowEnabled = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "particles.before.deferred", optionalBoolean -> {
                if (optionalBoolean.orElse(false) && this.particleRenderingSettings == ParticleRenderingSettings.UNSET) {
                    this.particleRenderingSettings = ParticleRenderingSettings.BEFORE;
                }
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "prepareBeforeShadow", optionalBoolean -> {
                this.prepareBeforeShadow = optionalBoolean;
            });
            ShaderProperties.handleBooleanDirective(string, (String)stringArray2, "supportsColorCorrection", optionalBoolean -> {
                this.supportsColorCorrection = optionalBoolean;
            });
            ShaderProperties.handleIntDirective(string, (String)stringArray2, "fallbackTex", n -> {
                this.fallbackTex = n;
            });
            if (string.startsWith("particles.ordering")) {
                this.particleRenderingSettings = ParticleRenderingSettings.fromString(stringArray2.trim().toUpperCase(Locale.US));
            }
            ShaderProperties.handlePassDirective("scale.", string, (String)stringArray2, arg_0 -> this.lambda$new$36((String)stringArray2, arg_0));
            if ("weather".equals(string)) {
                stringArray = stringArray2.split(" ");
                OptionalBoolean optionalBoolean2 = this.weather = stringArray[0].equals("true") ? OptionalBoolean.TRUE : OptionalBoolean.FALSE;
                if (stringArray.length > 1) {
                    this.weatherParticles = stringArray[1].equals("true") ? OptionalBoolean.TRUE : OptionalBoolean.FALSE;
                }
            }
            ShaderProperties.handlePassDirective("size.buffer.", string, (String)stringArray2, arg_0 -> this.lambda$new$37((String)stringArray2, arg_0));
            ShaderProperties.handlePassDirective("alphaTest.", string, (String)stringArray2, arg_0 -> this.lambda$new$38((String)stringArray2, arg_0));
            ShaderProperties.handlePassDirective("blend.", string, (String)stringArray2, arg_0 -> this.lambda$new$41((String)stringArray2, arg_0));
            ShaderProperties.handlePassDirective("indirect.", string, (String)stringArray2, arg_0 -> this.lambda$new$42((String)stringArray2, arg_0));
            ShaderProperties.handleProgramEnabledDirective("program.", string, (String)stringArray2, arg_0 -> this.lambda$new$43((String)stringArray2, arg_0));
            ShaderProperties.handlePassDirective("bufferObject.", string, (String)stringArray2, arg_0 -> this.lambda$new$44((String)stringArray2, arg_0));
            ShaderProperties.handleTwoArgDirective("texture.", string, (String)stringArray2, (arg_0, arg_1) -> this.lambda$new$46((String)stringArray2, string, arg_0, arg_1));
            ShaderProperties.handlePassDirective("customTexture.", string, (String)stringArray2, arg_0 -> this.lambda$new$47((String)stringArray2, string, arg_0));
            ShaderProperties.handlePassDirective("image.", string, (String)stringArray2, arg_0 -> this.lambda$new$48((String)stringArray2, string, arg_0));
            ShaderProperties.handleTwoArgDirective("flip.", string, (String)stringArray2, (arg_0, arg_1) -> this.lambda$new$51(string, (String)stringArray2, arg_0, arg_1));
            ShaderProperties.handlePassDirective("variable.", string, (String)stringArray2, arg_0 -> this.lambda$new$52(string, (String)stringArray2, arg_0));
            ShaderProperties.handlePassDirective("uniform.", string, (String)stringArray2, arg_0 -> this.lambda$new$53(string, (String)stringArray2, arg_0));
        }));
        ((Properties)orderBackedProperties2).forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
            String string = (String)object;
            String string2 = (String)object2;
            ShaderProperties.handleWhitespacedListDirective(string, string2, "iris.features.required", list -> {
                this.requiredFeatureFlags = list;
            });
            ShaderProperties.handleWhitespacedListDirective(string, string2, "iris.features.optional", list -> {
                this.optionalFeatureFlags = list;
            });
            ShaderProperties.handleWhitespacedListDirective(string, string2, "sliders", list -> {
                this.sliderOptions = list;
            });
            ShaderProperties.handlePrefixedWhitespacedListDirective("profile.", string, string2, this.profiles::put);
            if (ShaderProperties.handleIntDirective(string, string2, "screen.columns", n -> {
                this.mainScreenColumnCount = n;
            })) {
                return;
            }
            if (ShaderProperties.handleAffixedIntDirective("screen.", ".columns", string, string2, this.subScreenColumnCount::put)) {
                return;
            }
            ShaderProperties.handleWhitespacedListDirective(string, string2, "screen", list -> {
                this.mainScreenOptions = list;
            });
            ShaderProperties.handlePrefixedWhitespacedListDirective("screen.", string, string2, this.subScreenOptions::put);
        }));
    }

    public static ShaderProperties empty() {
        return new ShaderProperties();
    }

    public ParticleRenderingSettings getParticleRenderingSettings() {
        return this.particleRenderingSettings;
    }

    public Object2ObjectMap<String, String> getConditionallyEnabledPrograms() {
        return this.conditionallyEnabledPrograms;
    }

    private static void handleWhitespacedListDirective(String string, String string2, String string3, Consumer<List<String>> consumer) {
        if (!string3.equals(string)) {
            return;
        }
        String[] stringArray = string2.split(" +");
        consumer.accept(Arrays.asList(stringArray));
    }

    public OptionalBoolean getShadowLightBlockEntities() {
        return this.shadowLightBlockEntities;
    }

    private static void handleProgramEnabledDirective(String string, String string2, String string3, Consumer<String> consumer) {
        if (string2.startsWith(string)) {
            String string4 = string2.substring(string.length(), string2.indexOf(".", string.length()));
            consumer.accept(string4);
        }
    }

    private static void handlePrefixedWhitespacedListDirective(String string, String string2, String string3, BiConsumer<String, List<String>> biConsumer) {
        if (string2.startsWith(string)) {
            String string4 = string2.substring(string.length());
            String[] stringArray = string3.split(" +");
            biConsumer.accept(string4, Arrays.asList(stringArray));
        }
    }

    public CloudSetting getDHCloudSetting() {
        return this.dhCloudSetting;
    }

    public CustomUniforms.Builder getCustomUniforms() {
        return this.customUniforms;
    }

    public Object2ObjectMap<String, Object2BooleanMap<String>> getExplicitFlips() {
        return this.explicitFlips;
    }

    public Int2ObjectArrayMap<ShaderStorageInfo> getBufferObjects() {
        return this.bufferObjects;
    }

    public int getFallbackTex() {
        return this.fallbackTex;
    }

    public OptionalBoolean skipAllRendering() {
        return this.skipAllRendering;
    }

    public Object2ObjectMap<String, ArrayList<BufferBlendInformation>> getBufferBlendOverrides() {
        return this.bufferBlendOverrides;
    }

    public Object2ObjectMap<String, TextureDefinition> getIrisCustomTextures() {
        return this.irisCustomTextures;
    }

    public OptionalBoolean getConcurrentCompute() {
        return this.concurrentCompute;
    }

    public List<ImageInformation> getIrisCustomImages() {
        return this.irisCustomImages;
    }

    public OptionalBoolean supportsColorCorrection() {
        return this.supportsColorCorrection;
    }

    private /* synthetic */ void lambda$new$48(String string, String string2, String string3) {
        ImageInformation imageInformation;
        String[] stringArray = string.split(" ");
        String string4 = string2.substring(6);
        if (this.irisCustomImages.size() > 15) {
            Iris.logger.error("Only up to 16 images are allowed, but tried to add another image! " + string2);
            return;
        }
        String string5 = stringArray[0];
        if (string5.equals("none")) {
            string5 = null;
        }
        PixelFormat pixelFormat = PixelFormat.fromString((String)stringArray[1]).orElse(null);
        InternalTextureFormat internalTextureFormat = InternalTextureFormat.fromString((String)stringArray[2]).orElse(null);
        PixelType pixelType = PixelType.fromString((String)stringArray[3]).orElse(null);
        if (pixelFormat == null || internalTextureFormat == null || pixelType == null) {
            Iris.logger.error("Image " + string4 + " is invalid! Format: " + String.valueOf(pixelFormat) + " Internal format: " + String.valueOf(internalTextureFormat) + " Pixel type: " + String.valueOf(pixelType));
        }
        boolean bl = Boolean.parseBoolean(stringArray[4]);
        boolean bl2 = Boolean.parseBoolean(stringArray[5]);
        if (bl2) {
            float f = Float.parseFloat(stringArray[6]);
            float f2 = Float.parseFloat(stringArray[7]);
            imageInformation = new ImageInformation(string4, string5, TextureType.TEXTURE_2D, pixelFormat, internalTextureFormat, pixelType, 0, 0, 0, bl, true, f, f2);
        } else {
            int n;
            int n2;
            int n3;
            TextureType textureType;
            if (stringArray.length == 7) {
                textureType = TextureType.TEXTURE_1D;
                n3 = Integer.parseInt(stringArray[6]);
                n2 = 0;
                n = 0;
            } else if (stringArray.length == 8) {
                textureType = TextureType.TEXTURE_2D;
                n3 = Integer.parseInt(stringArray[6]);
                n2 = Integer.parseInt(stringArray[7]);
                n = 0;
            } else if (stringArray.length == 9) {
                textureType = TextureType.TEXTURE_3D;
                n3 = Integer.parseInt(stringArray[6]);
                n2 = Integer.parseInt(stringArray[7]);
                n = Integer.parseInt(stringArray[8]);
            } else {
                Iris.logger.error("Unknown image type! " + string4 + " = " + string);
                return;
            }
            imageInformation = new ImageInformation(string4, string5, textureType, pixelFormat, internalTextureFormat, pixelType, n3, n2, n, bl, false, 0.0f, 0.0f);
        }
        this.irisCustomImages.add(imageInformation);
    }

    private /* synthetic */ void lambda$new$46(String string, String string2, String string3, String string4) {
        String[] stringArray = string.split(" ");
        string4 = string4.split("\\.")[0];
        Optional<TextureStage> optional = TextureStage.parse(string3);
        if (optional.isEmpty()) {
            Iris.logger.warn("Unknown texture stage \"" + string3 + "\", ignoring custom texture directive for " + string2);
            return;
        }
        TextureStage textureStage2 = optional.get();
        if (stringArray.length > 1) {
            String string5 = "customtex" + this.customTexAmount;
            ++this.customTexAmount;
            TextureType textureType = null;
            if (stringArray.length == 6) {
                textureType = TextureType.TEXTURE_1D;
                this.irisCustomTextures.put((Object)string5, (Object)new TextureDefinition.RawDefinition(stringArray[0], TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT)), (InternalTextureFormat)InternalTextureFormat.fromString((String)stringArray[2]).orElseThrow(IllegalArgumentException::new), Integer.parseInt(stringArray[3]), 0, 0, (PixelFormat)PixelFormat.fromString((String)stringArray[4]).orElseThrow(IllegalArgumentException::new), (PixelType)PixelType.fromString((String)stringArray[5]).orElseThrow(IllegalArgumentException::new)));
            } else if (stringArray.length == 7) {
                textureType = TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT));
                this.irisCustomTextures.put((Object)string5, (Object)new TextureDefinition.RawDefinition(stringArray[0], TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT)), (InternalTextureFormat)InternalTextureFormat.fromString((String)stringArray[2]).orElseThrow(IllegalArgumentException::new), Integer.parseInt(stringArray[3]), Integer.parseInt(stringArray[4]), 0, (PixelFormat)PixelFormat.fromString((String)stringArray[5]).orElseThrow(IllegalArgumentException::new), (PixelType)PixelType.fromString((String)stringArray[6]).orElseThrow(IllegalArgumentException::new)));
            } else if (stringArray.length == 8) {
                textureType = TextureType.TEXTURE_3D;
                this.irisCustomTextures.put((Object)string5, (Object)new TextureDefinition.RawDefinition(stringArray[0], TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT)), (InternalTextureFormat)InternalTextureFormat.fromString((String)stringArray[2]).orElseThrow(IllegalArgumentException::new), Integer.parseInt(stringArray[3]), Integer.parseInt(stringArray[4]), Integer.parseInt(stringArray[5]), (PixelFormat)PixelFormat.fromString((String)stringArray[6]).orElseThrow(IllegalArgumentException::new), (PixelType)PixelType.fromString((String)stringArray[7]).orElseThrow(IllegalArgumentException::new)));
            } else {
                Iris.logger.warn("Unknown texture directive for " + string2 + ": " + string);
            }
            this.customTexturePatching.put((Object)new Tri((Object)string4, (Object)textureType, (Object)textureStage2), (Object)string5);
            return;
        }
        this.customTextures.computeIfAbsent(textureStage2, textureStage -> new Object2ObjectOpenHashMap()).put((Object)string4, (Object)new TextureDefinition.PNGDefinition(string));
    }

    private /* synthetic */ void lambda$new$52(String string, String string2, String string3) {
        String[] stringArray = string3.split("\\.");
        if (stringArray.length != 2) {
            Iris.logger.warn("Custom variables should take the form of `variable.<type>.<name> = <expression>. Ignoring " + string);
            return;
        }
        this.customUniforms.addVariable(stringArray[0], stringArray[1], string2, false);
    }

    private /* synthetic */ void lambda$new$53(String string, String string2, String string3) {
        String[] stringArray = string3.split("\\.");
        if (stringArray.length != 2) {
            Iris.logger.warn("Custom uniforms should take the form of `uniform.<type>.<name> = <expression>. Ignoring " + string);
            return;
        }
        this.customUniforms.addVariable(stringArray[0], stringArray[1], string2, true);
    }

    private /* synthetic */ void lambda$new$44(String string, String string2) {
        String[] stringArray = string.split(" ");
        if (stringArray.length <= 2) {
            long l;
            int n;
            try {
                n = Integer.parseInt(string2);
                l = Long.parseLong(stringArray[0]);
            }
            catch (NumberFormatException numberFormatException) {
                Iris.logger.error("Number format exception parsing SSBO index/size!", (Throwable)numberFormatException);
                return;
            }
            String string3 = null;
            if (stringArray.length > 1) {
                string3 = stringArray[1];
            }
            if (n > 12) {
                Iris.logger.fatal("SSBO's cannot use buffer numbers higher than 12, they're reserved!");
                return;
            }
            if (l < 1L) {
                return;
            }
            this.bufferObjects.put(n, (Object)new ShaderStorageInfo(l, false, 0.0f, 0.0f, string3));
        } else {
            float f;
            float f2;
            boolean bl;
            long l;
            int n;
            try {
                n = Integer.parseInt(string2);
                l = Long.parseLong(stringArray[0]);
                bl = Boolean.parseBoolean(stringArray[1]);
                f2 = Float.parseFloat(stringArray[2]);
                f = Float.parseFloat(stringArray[3]);
            }
            catch (ArrayIndexOutOfBoundsException | NumberFormatException runtimeException) {
                Iris.logger.error("Number format exception parsing SSBO index/size, or not correct format!", (Throwable)runtimeException);
                return;
            }
            if (n > 12) {
                Iris.logger.fatal("SSBO's cannot use buffer numbers higher than 12, they're reserved!");
                return;
            }
            if (l < 1L) {
                return;
            }
            this.bufferObjects.put(n, (Object)new ShaderStorageInfo(l, bl, f2, f, null));
        }
    }

    private /* synthetic */ void lambda$new$38(String string, String string2) {
        float f;
        if ("off".equals(string) || "false".equals(string)) {
            this.alphaTestOverrides.put((Object)string2, (Object)AlphaTest.ALWAYS);
            return;
        }
        String[] stringArray = string.split(" ");
        if (stringArray.length > 2) {
            Iris.logger.warn("Weird alpha test directive for " + string2 + " contains more parts than we expected: " + string);
        } else if (stringArray.length < 2) {
            Iris.logger.error("Invalid alpha test directive for " + string2 + ": " + string);
            return;
        }
        Optional optional = AlphaTestFunction.fromString((String)stringArray[0]);
        if (optional.isEmpty()) {
            Iris.logger.error("Unable to parse alpha test directive for " + string2 + ", unknown alpha test function " + stringArray[0] + ": " + string);
            return;
        }
        try {
            f = Float.parseFloat(stringArray[1]);
        }
        catch (NumberFormatException numberFormatException) {
            Iris.logger.error("Unable to parse alpha test directive for " + string2 + ": " + string, (Throwable)numberFormatException);
            return;
        }
        this.alphaTestOverrides.put((Object)string2, (Object)new AlphaTest((AlphaTestFunction)optional.get(), f));
    }

    private /* synthetic */ void lambda$new$51(String string, String string2, String string3, String string4) {
        ShaderProperties.handleBooleanValue(string, string2, bl -> ((Object2BooleanMap)this.explicitFlips.computeIfAbsent((Object)string3, object -> new Object2BooleanOpenHashMap())).put((Object)string4, bl));
    }

    private /* synthetic */ void lambda$new$36(String string, String string2) {
        float f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        String[] stringArray = string.split(" ");
        try {
            f = Float.parseFloat(stringArray[0]);
            if (stringArray.length > 1) {
                f2 = Float.parseFloat(stringArray[1]);
                f3 = Float.parseFloat(stringArray[2]);
            }
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException runtimeException) {
            Iris.logger.error("Unable to parse scale directive for " + string2 + ": " + string, (Throwable)runtimeException);
            return;
        }
        this.viewportScaleOverrides.put((Object)string2, (Object)new ViewportData(f, f2, f3));
    }

    private /* synthetic */ void lambda$new$42(String string, String string2) {
        try {
            String[] stringArray = string.split(" ");
            this.indirectPointers.put((Object)string2, (Object)new IndirectPointer(Integer.parseInt(stringArray[0]), Long.parseLong(stringArray[1])));
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException runtimeException) {
            Iris.logger.fatal("Failed to parse indirect command for " + string2 + "! " + string);
        }
    }

    private /* synthetic */ void lambda$new$43(String string, String string2) {
        this.conditionallyEnabledPrograms.put((Object)string2, (Object)string);
    }

    private /* synthetic */ void lambda$new$47(String string, String string2, String string3) {
        String[] stringArray = string.split(" ");
        if (stringArray.length > 1) {
            if (stringArray.length == 6) {
                this.irisCustomTextures.put((Object)string3, (Object)new TextureDefinition.RawDefinition(stringArray[0], TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT)), (InternalTextureFormat)InternalTextureFormat.fromString((String)stringArray[2]).orElseThrow(IllegalArgumentException::new), Integer.parseInt(stringArray[3]), 0, 0, (PixelFormat)PixelFormat.fromString((String)stringArray[4]).orElseThrow(IllegalArgumentException::new), (PixelType)PixelType.fromString((String)stringArray[5]).orElseThrow(IllegalArgumentException::new)));
            } else if (stringArray.length == 7) {
                this.irisCustomTextures.put((Object)string3, (Object)new TextureDefinition.RawDefinition(stringArray[0], TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT)), (InternalTextureFormat)InternalTextureFormat.fromString((String)stringArray[2]).orElseThrow(IllegalArgumentException::new), Integer.parseInt(stringArray[3]), Integer.parseInt(stringArray[4]), 0, (PixelFormat)PixelFormat.fromString((String)stringArray[5]).orElseThrow(IllegalArgumentException::new), (PixelType)PixelType.fromString((String)stringArray[6]).orElseThrow(IllegalArgumentException::new)));
            } else if (stringArray.length == 8) {
                this.irisCustomTextures.put((Object)string3, (Object)new TextureDefinition.RawDefinition(stringArray[0], TextureType.valueOf((String)stringArray[1].toUpperCase(Locale.ROOT)), (InternalTextureFormat)InternalTextureFormat.fromString((String)stringArray[2]).orElseThrow(IllegalArgumentException::new), Integer.parseInt(stringArray[3]), Integer.parseInt(stringArray[4]), Integer.parseInt(stringArray[5]), (PixelFormat)PixelFormat.fromString((String)stringArray[6]).orElseThrow(IllegalArgumentException::new), (PixelType)PixelType.fromString((String)stringArray[7]).orElseThrow(IllegalArgumentException::new)));
            } else {
                Iris.logger.warn("Unknown texture directive for " + string2 + ": " + string);
            }
            return;
        }
        this.irisCustomTextures.put((Object)string3, (Object)new TextureDefinition.PNGDefinition(string));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void lambda$new$41(String string, String string2) {
        void var8_16;
        if (string2.contains(".")) {
            Object object2;
            if (!IrisRenderSystem.supportsBufferBlending()) {
                throw new RuntimeException("Buffer blending is not supported on this platform, however it was attempted to be used!");
            }
            String[] stringArray = string2.split("\\.");
            int n = PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.indexOf((Object)stringArray[1]);
            if (n == -1 && stringArray[1].startsWith("colortex")) {
                object2 = stringArray[1].substring("colortex".length());
                try {
                    n = Integer.parseInt((String)object2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new RuntimeException("Failed to parse buffer blend!", numberFormatException);
                }
            }
            if (n == -1) {
                throw new RuntimeException("Failed to parse buffer blend! index = " + n);
            }
            if ("off".equals(string)) {
                ((ArrayList)this.bufferBlendOverrides.computeIfAbsent((Object)stringArray[0], object -> new ArrayList())).add(new BufferBlendInformation(n, null));
                return;
            }
            object2 = string.split(" ");
            int[] nArray = new int[((String[])object2).length];
            int n2 = 0;
            for (String string3 : object2) {
                nArray[n2] = ((BlendModeFunction)BlendModeFunction.fromString((String)string3).get()).getGlId();
                ++n2;
            }
            ((ArrayList)this.bufferBlendOverrides.computeIfAbsent((Object)stringArray[0], object -> new ArrayList())).add(new BufferBlendInformation(n, new BlendMode(nArray[0], nArray[1], nArray[2], nArray[3])));
            return;
        }
        if ("off".equals(string)) {
            this.blendModeOverrides.put((Object)string2, (Object)BlendModeOverride.OFF);
            return;
        }
        String[] stringArray = string.split(" ");
        int[] nArray = new int[stringArray.length];
        int n = 0;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        boolean bl = false;
        while (var8_16 < n2) {
            String string4 = stringArray2[var8_16];
            nArray[n] = ((BlendModeFunction)BlendModeFunction.fromString((String)string4).get()).getGlId();
            ++n;
            ++var8_16;
        }
        this.blendModeOverrides.put((Object)string2, (Object)new BlendModeOverride(new BlendMode(nArray[0], nArray[1], nArray[2], nArray[3])));
    }

    private /* synthetic */ void lambda$new$37(String string, String string2) {
        String[] stringArray = string.split(" ");
        if (stringArray.length != 2) {
            Iris.logger.error("Unable to parse size.buffer directive for " + string2 + ": " + string);
            return;
        }
        this.textureScaleOverrides.put((Object)string2, (Object)new TextureScaleOverride(stringArray[0], stringArray[1]));
    }

    public OptionalBoolean getSky() {
        return this.sky;
    }

    public OptionalBoolean getSun() {
        return this.sun;
    }

    public OptionalBoolean getMoon() {
        return this.moon;
    }

    public OptionalBoolean getWeather() {
        return this.weather;
    }

    public OptionalBoolean getStars() {
        return this.stars;
    }

    public Map<String, List<String>> getProfiles() {
        return this.profiles;
    }

    public EnumMap<TextureStage, Object2ObjectMap<String, TextureDefinition>> getCustomTextures() {
        return this.customTextures;
    }

    public List<String> getSliderOptions() {
        return this.sliderOptions;
    }

    public OptionalBoolean getVignette() {
        return this.vignette;
    }

    public OptionalBoolean getRainDepth() {
        return this.rainDepth;
    }

    public OptionalBoolean getSeparateAo() {
        return this.separateAo;
    }

    public OptionalBoolean getFrustumCulling() {
        return this.frustumCulling;
    }

    public OptionalBoolean getShadowTerrain() {
        return this.shadowTerrain;
    }

    public OptionalBoolean getBackFaceCutout() {
        return this.backFaceCutout;
    }

    public OptionalBoolean getOldLighting() {
        return this.oldLighting;
    }

    public ShadowCullState getShadowCulling() {
        return this.shadowCulling;
    }

    public OptionalBoolean getShadowPlayer() {
        return this.shadowPlayer;
    }

    public OptionalBoolean getOldHandLight() {
        return this.oldHandLight;
    }

    public OptionalBoolean getShadowEntities() {
        return this.shadowEntities;
    }

    public OptionalBoolean getShadowEnabled() {
        return this.shadowEnabled;
    }

    public OptionalBoolean getDhShadowEnabled() {
        return this.dhShadowEnabled;
    }

    private static void handleBooleanValue(String string, String string2, BooleanConsumer booleanConsumer) {
        if ("true".equals(string2) || "1".equals(string2)) {
            booleanConsumer.accept(true);
        } else if ("false".equals(string2) || "0".equals(string2)) {
            booleanConsumer.accept(false);
        } else {
            Iris.logger.warn("Unexpected value for boolean key " + string + " in shaders.properties: got " + string2 + ", but expected either true or false");
        }
    }

    public OptionalBoolean getBeaconBeamDepth() {
        return this.beaconBeamDepth;
    }

    private static boolean handleIntDirective(String string, String string2, String string3, Consumer<Integer> consumer) {
        if (!string3.equals(string)) {
            return false;
        }
        try {
            int n = Integer.parseInt(string2);
            consumer.accept(n);
        }
        catch (NumberFormatException numberFormatException) {
            Iris.logger.warn("Unexpected value for integer key " + string + " in shaders.properties: got " + string2 + ", but expected an integer");
        }
        return true;
    }

    public OptionalBoolean getBackFaceSolid() {
        return this.backFaceSolid;
    }

    public List<String> getOptionalFeatureFlags() {
        return this.optionalFeatureFlags;
    }

    public List<String> getRequiredFeatureFlags() {
        return this.requiredFeatureFlags;
    }

    public Optional<String> getNoiseTexturePath() {
        return Optional.ofNullable(this.noiseTexturePath);
    }

    public Map<String, List<String>> getSubScreenOptions() {
        return this.subScreenOptions;
    }

    public Map<String, Integer> getSubScreenColumnCount() {
        return this.subScreenColumnCount;
    }

    public Optional<List<String>> getMainScreenOptions() {
        return Optional.ofNullable(this.mainScreenOptions);
    }

    public Optional<Integer> getMainScreenColumnCount() {
        return Optional.ofNullable(this.mainScreenColumnCount);
    }

    public Object2ObjectMap<String, IndirectPointer> getIndirectPointers() {
        return this.indirectPointers;
    }

    public Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> getCustomTexturePatching() {
        return this.customTexturePatching;
    }

    public OptionalBoolean getSeparateEntityDraws() {
        return this.separateEntityDraws;
    }

    public OptionalBoolean getPrepareBeforeShadow() {
        return this.prepareBeforeShadow;
    }

    public OptionalBoolean getShadowBlockEntities() {
        return this.shadowBlockEntities;
    }

    public OptionalBoolean getVoxelizeLightBlocks() {
        return this.voxelizeLightBlocks;
    }

    public OptionalBoolean getWeatherParticles() {
        return this.weatherParticles;
    }

    public Object2ObjectMap<String, TextureScaleOverride> getTextureScaleOverrides() {
        return this.textureScaleOverrides;
    }

    public OptionalBoolean getUnderwaterOverlay() {
        return this.underwaterOverlay;
    }

    public OptionalBoolean getOcclusionCulling() {
        return this.occlusionCulling;
    }

    public OptionalBoolean getShadowTranslucent() {
        return this.shadowTranslucent;
    }

    private static void handleBooleanDirective(String string, String string2, String string3, Consumer<OptionalBoolean> consumer) {
        if (!string3.equals(string)) {
            return;
        }
        if ("true".equals(string2) || "1".equals(string2)) {
            consumer.accept(OptionalBoolean.TRUE);
        } else if ("false".equals(string2) || "0".equals(string2)) {
            consumer.accept(OptionalBoolean.FALSE);
        } else {
            Iris.logger.warn("Unexpected value for boolean key " + string + " in shaders.properties: got " + string2 + ", but expected either true or false");
        }
    }

    public Object2ObjectMap<String, BlendModeOverride> getBlendModeOverrides() {
        return this.blendModeOverrides;
    }

    public Object2ObjectMap<String, ViewportData> getViewportScaleOverrides() {
        return this.viewportScaleOverrides;
    }

    public OptionalBoolean getBackFaceCutoutMipped() {
        return this.backFaceCutoutMipped;
    }

    public Object2ObjectMap<String, AlphaTest> getAlphaTestOverrides() {
        return this.alphaTestOverrides;
    }

    private static boolean handleAffixedIntDirective(String string, String string2, String string3, String string4, BiConsumer<String, Integer> biConsumer) {
        if (string3.startsWith(string) && string3.endsWith(string2)) {
            int n = string.length();
            int n2 = string3.length() - string2.length();
            if (n2 <= n) {
                return false;
            }
            String string5 = string3.substring(n, n2);
            try {
                int n3 = Integer.parseInt(string4);
                biConsumer.accept(string5, n3);
            }
            catch (NumberFormatException numberFormatException) {
                Iris.logger.warn("Unexpected value for integer key " + string3 + " in shaders.properties: got " + string4 + ", but expected an integer");
            }
            return true;
        }
        return false;
    }

    public OptionalBoolean getDynamicHandLight() {
        return this.dynamicHandLight;
    }

    private static void handleTwoArgDirective(String string, String string2, String string3, BiConsumer<String, String> biConsumer) {
        if (string2.startsWith(string)) {
            int n = string2.indexOf(".", string.length());
            String string4 = string2.substring(string.length(), n);
            String string5 = string2.substring(n + 1);
            biConsumer.accept(string4, string5);
        }
    }

    private static void handlePassDirective(String string, String string2, String string3, Consumer<String> consumer) {
        if (string2.startsWith(string)) {
            String string4 = string2.substring(string.length());
            consumer.accept(string4);
        }
    }

    public OptionalBoolean getBackFaceTranslucent() {
        return this.backFaceTranslucent;
    }
}

