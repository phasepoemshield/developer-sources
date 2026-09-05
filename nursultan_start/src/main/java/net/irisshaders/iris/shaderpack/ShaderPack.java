/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.stream.JsonReader
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class06202
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.api.v0.IrisApi
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.buffer.BuiltShaderStorageInfo
 *  net.irisshaders.iris.gl.buffer.ShaderStorageInfo
 *  net.irisshaders.iris.gl.texture.TextureDefinition
 *  net.irisshaders.iris.gl.texture.TextureDefinition$PNGDefinition
 *  net.irisshaders.iris.gl.texture.TextureDefinition$RawDefinition
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.gui.FeatureMissingErrorScreen
 *  net.irisshaders.iris.gui.screen.ShaderPackScreen
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.pathways.colorspace.ColorSpace
 *  net.irisshaders.iris.shaderpack.option.OptionSet
 *  net.irisshaders.iris.shaderpack.option.OrderBackedProperties
 *  net.irisshaders.iris.shaderpack.option.ProfileSet
 *  net.irisshaders.iris.shaderpack.option.ProfileSet$ProfileResult
 *  net.irisshaders.iris.shaderpack.option.ShaderPackOptions
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer
 *  net.irisshaders.iris.shaderpack.option.values.MutableOptionValues
 *  net.irisshaders.iris.shaderpack.option.values.OptionValues
 *  net.irisshaders.iris.shaderpack.parsing.BooleanParser
 *  net.irisshaders.iris.shaderpack.preprocessor.JcppProcessor
 *  net.irisshaders.iris.shaderpack.preprocessor.PropertiesPreprocessor
 *  net.irisshaders.iris.shaderpack.programs.ProgramSet
 *  net.irisshaders.iris.shaderpack.programs.ProgramSetInterface
 *  net.irisshaders.iris.shaderpack.programs.ProgramSetInterface$Empty
 *  net.irisshaders.iris.shaderpack.properties.ShaderProperties
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$LightmapMarker
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$PngData
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData1D
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData2D
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData3D
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawDataRect
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$ResourceData
 *  net.irisshaders.iris.shaderpack.texture.TextureFilteringData
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms$Builder
 *  org.apache.commons.lang3.SystemUtils
 */
package net.irisshaders.iris.shaderpack;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class06202;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.api.v0.IrisApi;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.buffer.BuiltShaderStorageInfo;
import net.irisshaders.iris.gl.buffer.ShaderStorageInfo;
import net.irisshaders.iris.gl.texture.TextureDefinition;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.gui.FeatureMissingErrorScreen;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.pathways.colorspace.ColorSpace;
import net.irisshaders.iris.shaderpack.DimensionId;
import net.irisshaders.iris.shaderpack.IdMap;
import net.irisshaders.iris.shaderpack.ImageInformation;
import net.irisshaders.iris.shaderpack.IrisDefines;
import net.irisshaders.iris.shaderpack.LanguageMap;
import net.irisshaders.iris.shaderpack.error.RusticError;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.include.IncludeGraph;
import net.irisshaders.iris.shaderpack.include.IncludeProcessor;
import net.irisshaders.iris.shaderpack.include.ShaderPackSourceNames;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.OrderBackedProperties;
import net.irisshaders.iris.shaderpack.option.ProfileSet;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;
import net.irisshaders.iris.shaderpack.parsing.BooleanParser;
import net.irisshaders.iris.shaderpack.preprocessor.JcppProcessor;
import net.irisshaders.iris.shaderpack.preprocessor.PropertiesPreprocessor;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.shaderpack.programs.ProgramSetInterface;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import org.apache.commons.lang3.SystemUtils;

public class ShaderPack {
    private static final Gson GSON = new Gson();
    public final CustomUniforms.Builder customUniforms;
    private final ProgramSet base;
    private final Map<NamespacedId, ProgramSetInterface> overrides;
    private final IdMap idMap;
    private final LanguageMap languageMap;
    private final EnumMap<TextureStage, Object2ObjectMap<String, CustomTextureData>> customTextureDataMap = new EnumMap(TextureStage.class);
    private final Object2ObjectMap<String, CustomTextureData> irisCustomTextureDataMap = new Object2ObjectOpenHashMap();
    private final CustomTextureData customNoiseTexture;
    private final ShaderPackOptions shaderPackOptions;
    private final OptionMenuContainer menuContainer;
    private final ProfileSet.ProfileResult profile;
    private final String profileInfo;
    private final List<ImageInformation> irisCustomImages;
    private final Set<FeatureFlags> activeFeatures;
    private final Function<AbsolutePackPath, String> sourceProvider;
    private final ShaderProperties shaderProperties;
    private final List<String> dimensionIds;
    private final Int2ObjectArrayMap<BuiltShaderStorageInfo> bufferObjects;
    private Map<NamespacedId, String> dimensionMap;

    public Map<NamespacedId, String> getDimensionMap() {
        return this.dimensionMap;
    }

    public ProgramSet getProgramSet(NamespacedId namespacedId) {
        ProgramSetInterface programSetInterface = this.overrides.computeIfAbsent(namespacedId, namespacedId2 -> {
            if (this.dimensionMap.containsKey(namespacedId)) {
                String string = this.dimensionMap.get(namespacedId);
                if (this.dimensionIds.contains(string)) {
                    return new ProgramSet(AbsolutePackPath.fromAbsolutePath("/" + string), this.sourceProvider, this.shaderProperties, this);
                }
                Iris.logger.error("Attempted to load dimension folder " + string + " for dimension " + String.valueOf(namespacedId) + ", but it does not exist!");
                return ProgramSetInterface.Empty.INSTANCE;
            }
            return ProgramSetInterface.Empty.INSTANCE;
        });
        if (programSetInterface instanceof ProgramSet) {
            return (ProgramSet)programSetInterface;
        }
        return this.base;
    }

    public boolean hasFeature(FeatureFlags featureFlags) {
        return this.activeFeatures.contains(featureFlags);
    }

    public ShaderPack(Path path, ImmutableList<StringPair> immutableList, boolean bl) throws IOException, IllegalStateException {
        this(path, Collections.emptyMap(), immutableList, bl);
    }

    public ShaderPack(Path path, Map<String, String> map, ImmutableList<StringPair> immutableList, boolean bl) throws IOException, IllegalStateException {
        Object object;
        int n;
        Object object22;
        Object object32;
        Objects.requireNonNull(path);
        ArrayList<StringPair> arrayList = new ArrayList<StringPair>((Collection<StringPair>)immutableList);
        arrayList.addAll((Collection<StringPair>)IrisDefines.createIrisReplacements());
        immutableList = ImmutableList.copyOf(arrayList);
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList<String> immutableList2 = ShaderPackSourceNames.POTENTIAL_STARTS;
        ShaderPackSourceNames.findPresentSources((ImmutableList.Builder<AbsolutePackPath>)builder, path, AbsolutePackPath.fromAbsolutePath("/"), immutableList2);
        this.dimensionIds = new ArrayList<String>();
        this.bufferObjects = new Int2ObjectArrayMap();
        boolean[] blArray = new boolean[]{false};
        List list = ShaderPack.loadProperties(path, "dimension.properties", (Iterable<StringPair>)immutableList).map(properties -> {
            blArray[0] = !properties.isEmpty();
            this.dimensionMap = ShaderPack.parseDimensionMap(properties, "dimension.", "dimension.properties");
            return this.parseDimensionIds((Properties)properties, "dimension.");
        }).orElse(new ArrayList());
        if (!blArray[0]) {
            this.dimensionMap = new Object2ObjectArrayMap();
            if (Files.exists(path.resolve("world0"), new LinkOption[0])) {
                list.add("world0");
                this.dimensionMap.putIfAbsent(DimensionId.OVERWORLD, "world0");
                this.dimensionMap.putIfAbsent(new NamespacedId("*", "*"), "world0");
            }
            if (Files.exists(path.resolve("world-1"), new LinkOption[0])) {
                list.add("world-1");
                this.dimensionMap.putIfAbsent(DimensionId.NETHER, "world-1");
            }
            if (Files.exists(path.resolve("world1"), new LinkOption[0])) {
                list.add("world1");
                this.dimensionMap.putIfAbsent(DimensionId.END, "world1");
            }
        }
        for (Object object32 : list) {
            if (!ShaderPackSourceNames.findPresentSources((ImmutableList.Builder<AbsolutePackPath>)builder, path, AbsolutePackPath.fromAbsolutePath("/" + (String)object32), immutableList2)) continue;
            this.dimensionIds.add((String)object32);
        }
        Object object4 = new IncludeGraph(path, (ImmutableList<AbsolutePackPath>)builder.build(), bl);
        if (!((IncludeGraph)object4).getFailures().isEmpty()) {
            throw new IOException(String.join((CharSequence)"\n", (CharSequence[])((IncludeGraph)object4).getFailures().values().stream().map(RusticError::toString).toArray(String[]::new)));
        }
        this.languageMap = new LanguageMap(path.resolve("lang"));
        this.shaderPackOptions = new ShaderPackOptions((IncludeGraph)object4, map);
        object4 = this.shaderPackOptions.getIncludes();
        object32 = new ArrayList(List.copyOf(immutableList));
        for (Object object22 : FeatureFlags.values()) {
            if (!object22.isUsable()) continue;
            object32.add(new StringPair("IRIS_FEATURE_" + object22.name(), ""));
        }
        this.shaderProperties = ShaderPack.loadProperties(path, "shaders.properties").map(arg_0 -> this.lambda$new$2((List)object32, arg_0)).orElseGet(ShaderProperties::empty);
        for (Int2ObjectMap.Entry entry : this.shaderProperties.getBufferObjects().int2ObjectEntrySet()) {
            ShaderStorageInfo shaderStorageInfo = (ShaderStorageInfo)entry.getValue();
            if (shaderStorageInfo.name() == null) {
                this.bufferObjects.put(entry.getIntKey(), (Object)new BuiltShaderStorageInfo(shaderStorageInfo.size(), shaderStorageInfo.relative(), shaderStorageInfo.scaleX(), shaderStorageInfo.scaleY(), null));
                continue;
            }
            object22 = shaderStorageInfo.name();
            try {
                byte[] byArray;
                if (((String)object22).startsWith("/")) {
                    object22 = ((String)object22).substring(1);
                }
                if ((long)(byArray = Files.readAllBytes(path.resolve((String)object22))).length > shaderStorageInfo.size()) {
                    throw new IllegalStateException("Tried to load a shader storage file with no space in the buffer! Increase the buffer size.");
                }
                this.bufferObjects.put(entry.getIntKey(), (Object)new BuiltShaderStorageInfo(shaderStorageInfo.size(), shaderStorageInfo.relative(), shaderStorageInfo.scaleX(), shaderStorageInfo.scaleY(), byArray));
            }
            catch (IOException iOException) {
                Iris.logger.error("Shader storage buffer with index " + entry.getIntKey() + " and path " + (String)object22 + " could not be read.", (Throwable)iOException);
            }
        }
        this.activeFeatures = new HashSet<FeatureFlags>();
        for (n = 0; n < this.shaderProperties.getRequiredFeatureFlags().size(); ++n) {
            this.activeFeatures.add(FeatureFlags.getValue((String)((String)this.shaderProperties.getRequiredFeatureFlags().get(n))));
        }
        for (n = 0; n < this.shaderProperties.getOptionalFeatureFlags().size(); ++n) {
            this.activeFeatures.add(FeatureFlags.getValue((String)((String)this.shaderProperties.getOptionalFeatureFlags().get(n))));
        }
        if (!this.activeFeatures.contains(FeatureFlags.SSBO) && !this.shaderProperties.getBufferObjects().isEmpty()) {
            throw new IllegalStateException("An SSBO is being used, but the feature flag for SSBO's hasn't been set! Please set either a requirement or check for the SSBO feature using \"iris.features.required/optional = ssbo\".");
        }
        if (!this.activeFeatures.contains(FeatureFlags.CUSTOM_IMAGES) && !this.shaderProperties.getIrisCustomImages().isEmpty()) {
            throw new IllegalStateException("Custom images are being used, but the feature flag for custom images hasn't been set! Please set either a requirement or check for custom images' feature flag using \"iris.features.required/optional = CUSTOM_IMAGES\".");
        }
        List list2 = this.shaderProperties.getRequiredFeatureFlags().stream().filter(FeatureFlags::isInvalid).map(FeatureFlags::getValue).collect(Collectors.toList());
        List list3 = list2.stream().map(FeatureFlags::getHumanReadableName).toList();
        if (!list3.isEmpty()) {
            if ((class05096)class06202.Nq().v_3 instanceof ShaderPackScreen) {
                class05216 class052162 = class00392.N((String)"iris.unsupported.pack.description", (Object[])new Object[]{FeatureFlags.getInvalidStatus(list2), list3.stream().collect(Collectors.joining(", ", ": ", "."))});
                if (SystemUtils.IS_OS_MAC) {
                    class052162 = class052162.y((class00392)class00392.L((String)"iris.unsupported.pack.macos"));
                }
                class06202.Nq().N((class05096)new FeatureMissingErrorScreen((class05096)class06202.Nq().v_3, (class00392)class00392.L((String)"iris.unsupported.pack"), (class00392)class052162));
            }
            IrisApi.getInstance().getConfig().setShadersEnabledAndApply(false);
        }
        ArrayList<StringPair> arrayList2 = new ArrayList<StringPair>((Collection<StringPair>)immutableList);
        if (this.shaderProperties.supportsColorCorrection().orElse(false)) {
            object22 = ColorSpace.values();
            int n2 = ((Object)object22).length;
            for (int i = 0; i < n2; ++i) {
                object = object22[i];
                arrayList2.add(new StringPair("COLOR_SPACE_" + object.name(), String.valueOf(object.ordinal())));
            }
        }
        if (!(object22 = this.shaderProperties.getOptionalFeatureFlags().stream().filter(string -> !FeatureFlags.isInvalid((String)string)).toList()).isEmpty()) {
            object22.forEach(string -> arrayList2.add(new StringPair("IRIS_FEATURE_" + string, "")));
        }
        immutableList = ImmutableList.copyOf(arrayList2);
        ProfileSet profileSet = ProfileSet.fromTree((Map)this.shaderProperties.getProfiles(), (OptionSet)this.shaderPackOptions.getOptionSet());
        this.profile = profileSet.scan(this.shaderPackOptions.getOptionSet(), this.shaderPackOptions.getOptionValues());
        ArrayList arrayList3 = new ArrayList();
        this.profile.current.ifPresent(profile -> arrayList3.addAll(profile.disabledPrograms));
        this.shaderProperties.getConditionallyEnabledPrograms().forEach((string, string2) -> {
            if (!BooleanParser.parse((String)string2, (OptionValues)this.shaderPackOptions.getOptionValues())) {
                arrayList3.add(string);
            }
        });
        this.menuContainer = new OptionMenuContainer(this.shaderProperties, this.shaderPackOptions, profileSet);
        object = this.getCurrentProfileName();
        MutableOptionValues mutableOptionValues = new MutableOptionValues(this.shaderPackOptions.getOptionSet(), (Map)this.profile.current.map(profile -> profile.optionValues).orElse(new HashMap()));
        int n3 = this.shaderPackOptions.getOptionValues().getOptionsChanged() - mutableOptionValues.getOptionsChanged();
        this.profileInfo = "Profile: " + (String)object + " (+" + n3 + " option" + (n3 == 1 ? "" : "s") + " changed by user)";
        Iris.logger.info(this.profileInfo);
        object = new IncludeProcessor((IncludeGraph)object4);
        mutableOptionValues = immutableList;
        this.sourceProvider = arg_0 -> ShaderPack.lambda$new$8(arrayList3, (IncludeProcessor)object, (Iterable)mutableOptionValues, arg_0);
        this.base = new ProgramSet(AbsolutePackPath.fromAbsolutePath("/" + this.dimensionMap.getOrDefault(new NamespacedId("*", "*"), "")), this.sourceProvider, this.shaderProperties, this);
        this.overrides = new HashMap<NamespacedId, ProgramSetInterface>();
        this.idMap = new IdMap(path, this.shaderPackOptions, (Iterable<StringPair>)immutableList);
        this.customNoiseTexture = this.shaderProperties.getNoiseTexturePath().map(string -> {
            try {
                return this.readTexture(path, (TextureDefinition)new TextureDefinition.PNGDefinition(string));
            }
            catch (IOException iOException) {
                Iris.logger.error("Unable to read the custom noise texture at " + string, (Throwable)iOException);
                return null;
            }
        }).orElse(null);
        this.shaderProperties.getCustomTextures().forEach((textureStage, object2ObjectMap) -> {
            Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
            object2ObjectMap.forEach((arg_0, arg_1) -> this.lambda$new$10((Object2ObjectMap)object2ObjectOpenHashMap, path, arg_0, arg_1));
            this.customTextureDataMap.put((TextureStage)textureStage, (Object2ObjectMap<String, CustomTextureData>)object2ObjectOpenHashMap);
        });
        this.irisCustomImages = this.shaderProperties.getIrisCustomImages();
        this.customUniforms = this.shaderProperties.getCustomUniforms();
        this.shaderProperties.getIrisCustomTextures().forEach((string, textureDefinition) -> {
            try {
                this.irisCustomTextureDataMap.put(string, (Object)this.readTexture(path, (TextureDefinition)textureDefinition));
            }
            catch (IOException iOException) {
                Iris.logger.error("Unable to read the custom texture at " + textureDefinition.getName(), (Throwable)iOException);
            }
        });
    }

    private /* synthetic */ ShaderProperties lambda$new$2(List list, String string) {
        return new ShaderProperties(string, this.shaderPackOptions, (Iterable)list);
    }

    private static Optional<String> loadProperties(Path path, String string) {
        String string2 = ShaderPack.readProperties(path, string);
        if (string2 == null) {
            return Optional.empty();
        }
        return Optional.of(string2);
    }

    private static Optional<Properties> loadProperties(Path path, String string, Iterable<StringPair> iterable) {
        String string2 = ShaderPack.readProperties(path, string);
        if (string2 == null) {
            return Optional.empty();
        }
        String string3 = PropertiesPreprocessor.preprocessSource((String)string2, iterable);
        StringReader stringReader = new StringReader(string3);
        OrderBackedProperties orderBackedProperties = new OrderBackedProperties();
        try {
            orderBackedProperties.load(stringReader);
        }
        catch (IOException iOException) {
            Iris.logger.error("Error loading " + string + " at " + String.valueOf(path), (Throwable)iOException);
            return Optional.empty();
        }
        return Optional.of(orderBackedProperties);
    }

    public String getProfileInfo() {
        return this.profileInfo;
    }

    public Object2ObjectMap<String, CustomTextureData> getIrisCustomTextureDataMap() {
        return this.irisCustomTextureDataMap;
    }

    private static /* synthetic */ void lambda$parseDimensionMap$13(String string, Map map, Object object, Object object2) {
        String string2 = (String)object;
        String string3 = (String)object2;
        if (!string2.startsWith(string)) {
            return;
        }
        string2 = string2.substring(string.length());
        for (String string4 : string3.split("\\s+")) {
            if (string4.equals("*")) {
                map.put(new NamespacedId("*", "*"), string2);
            }
            map.put(new NamespacedId(string4), string2);
        }
    }

    public Int2ObjectArrayMap<BuiltShaderStorageInfo> getBufferObjects() {
        return this.bufferObjects;
    }

    public LanguageMap getLanguageMap() {
        return this.languageMap;
    }

    public ShaderPackOptions getShaderPackOptions() {
        return this.shaderPackOptions;
    }

    public OptionMenuContainer getMenuContainer() {
        return this.menuContainer;
    }

    public List<ImageInformation> getIrisCustomImages() {
        return this.irisCustomImages;
    }

    public EnumMap<TextureStage, Object2ObjectMap<String, CustomTextureData>> getCustomTextureDataMap() {
        return this.customTextureDataMap;
    }

    public CustomTextureData getCustomNoiseTexture() {
        return this.customNoiseTexture;
    }

    public IdMap getIdMap() {
        return this.idMap;
    }

    private /* synthetic */ void lambda$new$10(Object2ObjectMap object2ObjectMap, Path path, String string, TextureDefinition textureDefinition) {
        try {
            object2ObjectMap.put((Object)string, (Object)this.readTexture(path, textureDefinition));
        }
        catch (IOException iOException) {
            Iris.logger.error("Unable to read the custom texture at " + String.valueOf(textureDefinition), (Throwable)iOException);
        }
    }

    private static /* synthetic */ String lambda$new$8(List list, IncludeProcessor includeProcessor, Iterable iterable, AbsolutePackPath absolutePackPath) {
        String string;
        String string2 = string.substring((string = absolutePackPath.getPathString()).indexOf("/") == 0 ? 1 : 0, string.lastIndexOf("."));
        if (list.contains(string2)) {
            return null;
        }
        ImmutableList<String> immutableList = includeProcessor.getIncludedFile(absolutePackPath);
        if (immutableList == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : immutableList) {
            stringBuilder.append(string3);
            stringBuilder.append('\n');
        }
        Object object = stringBuilder.toString();
        object = JcppProcessor.glslPreprocessSource((String)object, (Iterable)iterable);
        return object;
    }

    private static String readProperties(Path path, String string) {
        try {
            return Files.readString(path.resolve(string), StandardCharsets.ISO_8859_1);
        }
        catch (NoSuchFileException noSuchFileException) {
            Iris.logger.debug("An " + string + " file was not found in the current shaderpack");
            return null;
        }
        catch (IOException iOException) {
            Iris.logger.error("An IOException occurred reading " + string + " from the current shaderpack", (Throwable)iOException);
            return null;
        }
    }

    private JsonObject loadMcMeta(Path path) throws IOException, JsonParseException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(path, new OpenOption[0]), StandardCharsets.UTF_8));){
            JsonReader jsonReader = new JsonReader((Reader)bufferedReader);
            JsonObject jsonObject = (JsonObject)GSON.getAdapter(JsonObject.class).read(jsonReader);
            return jsonObject;
        }
    }

    private List<String> parseDimensionIds(Properties properties, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
            String string2 = (String)object;
            if (!string2.startsWith(string)) {
                return;
            }
            string2 = string2.substring(string.length());
            arrayList.add(string2);
        }));
        return arrayList;
    }

    public CustomTextureData readTexture(Path path, TextureDefinition textureDefinition) throws IOException {
        Object object;
        String string = textureDefinition.getName();
        if (string.contains(":")) {
            String[] stringArray = string.split(":");
            if (stringArray.length > 2) {
                Iris.logger.warn("Resource location " + string + " contained more than two parts?");
            }
            object = stringArray[0].equals("minecraft") && (stringArray[1].equals("dynamic/lightmap_1") || stringArray[1].equals("dynamic/light_map_1")) ? new CustomTextureData.LightmapMarker() : new CustomTextureData.ResourceData(stringArray[0], stringArray[1]);
        } else {
            Object object2;
            if (string.startsWith("/")) {
                string = string.substring(1);
            }
            boolean bl = textureDefinition instanceof TextureDefinition.RawDefinition;
            boolean bl2 = textureDefinition instanceof TextureDefinition.RawDefinition;
            String string2 = string + ".mcmeta";
            Path path2 = path.resolve(string2);
            if (Files.exists(path2, new LinkOption[0])) {
                try {
                    object2 = this.loadMcMeta(path2);
                    if (object2.get("texture") != null) {
                        if (object2.get("texture").getAsJsonObject().get("blur") != null) {
                            bl = object2.get("texture").getAsJsonObject().get("blur").getAsBoolean();
                        }
                        if (object2.get("texture").getAsJsonObject().get("clamp") != null) {
                            bl2 = object2.get("texture").getAsJsonObject().get("clamp").getAsBoolean();
                        }
                    }
                }
                catch (IOException iOException) {
                    Iris.logger.error("Unable to read the custom texture mcmeta at " + string2 + ", ignoring: " + String.valueOf(iOException));
                }
            }
            object2 = Files.readAllBytes(path.resolve(string));
            if (textureDefinition instanceof TextureDefinition.PNGDefinition) {
                object = new CustomTextureData.PngData(new TextureFilteringData(bl, bl2), (byte[])object2);
            } else if (textureDefinition instanceof TextureDefinition.RawDefinition) {
                TextureDefinition.RawDefinition rawDefinition = (TextureDefinition.RawDefinition)textureDefinition;
                object = switch (rawDefinition.getTarget()) {
                    default -> throw new MatchException(null, null);
                    case TextureType.TEXTURE_1D -> new CustomTextureData.RawData1D((byte[])object2, new TextureFilteringData(bl, bl2), rawDefinition.getInternalFormat(), rawDefinition.getFormat(), rawDefinition.getPixelType(), rawDefinition.getSizeX());
                    case TextureType.TEXTURE_2D -> new CustomTextureData.RawData2D((byte[])object2, new TextureFilteringData(bl, bl2), rawDefinition.getInternalFormat(), rawDefinition.getFormat(), rawDefinition.getPixelType(), rawDefinition.getSizeX(), rawDefinition.getSizeY());
                    case TextureType.TEXTURE_3D -> new CustomTextureData.RawData3D((byte[])object2, new TextureFilteringData(bl, bl2), rawDefinition.getInternalFormat(), rawDefinition.getFormat(), rawDefinition.getPixelType(), rawDefinition.getSizeX(), rawDefinition.getSizeY(), rawDefinition.getSizeZ());
                    case TextureType.TEXTURE_RECTANGLE -> new CustomTextureData.RawDataRect((byte[])object2, new TextureFilteringData(bl, bl2), rawDefinition.getInternalFormat(), rawDefinition.getFormat(), rawDefinition.getPixelType(), rawDefinition.getSizeX(), rawDefinition.getSizeY());
                };
            } else {
                object = null;
            }
        }
        return object;
    }

    private static Map<NamespacedId, String> parseDimensionMap(Properties properties, String string, String string2) {
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(arg_0, arg_1) -> ShaderPack.lambda$parseDimensionMap$13(string, (Map)object2ObjectArrayMap, arg_0, arg_1)));
        return object2ObjectArrayMap;
    }

    private static ProgramSet loadOverrides(boolean bl, AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, ShaderProperties shaderProperties, ShaderPack shaderPack) {
        if (bl) {
            return new ProgramSet(absolutePackPath, function, shaderProperties, shaderPack);
        }
        return null;
    }

    private String getCurrentProfileName() {
        return this.profile.current.map(profile -> profile.name).orElse("Custom");
    }
}

