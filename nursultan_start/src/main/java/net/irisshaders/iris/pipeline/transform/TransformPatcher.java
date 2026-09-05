/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Profile
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.Version
 *  io.github.douira.glsl_transformer.ast.print.PrintType
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.index.PrefixIdentifierIndex
 *  io.github.douira.glsl_transformer.ast.transform.EnumASTTransformer
 *  io.github.douira.glsl_transformer.ast.transform.TransformationException
 *  io.github.douira.glsl_transformer.parser.ParsingException
 *  io.github.douira.glsl_transformer.token_filter.TokenChannel
 *  io.github.douira.glsl_transformer.token_filter.TokenFilter
 *  io.github.douira.glsl_transformer.util.LRUCache
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 *  net.irisshaders.iris.gl.state.ShaderAttributeInputs
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.irisshaders.iris.pipeline.transform;

import io.github.douira.glsl_transformer.ast.node.Profile;
import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.Version;
import io.github.douira.glsl_transformer.ast.print.PrintType;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.index.PrefixIdentifierIndex;
import io.github.douira.glsl_transformer.ast.transform.EnumASTTransformer;
import io.github.douira.glsl_transformer.ast.transform.TransformationException;
import io.github.douira.glsl_transformer.parser.ParsingException;
import io.github.douira.glsl_transformer.token_filter.TokenChannel;
import io.github.douira.glsl_transformer.token_filter.TokenFilter;
import io.github.douira.glsl_transformer.util.LRUCache;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gl.state.ShaderAttributeInputs;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.pipeline.transform.Patch;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher$1;
import net.irisshaders.iris.pipeline.transform.TransformPatcher$2;
import net.irisshaders.iris.pipeline.transform.TransformPatcher$3;
import net.irisshaders.iris.pipeline.transform.TransformPatcher$CacheKey;
import net.irisshaders.iris.pipeline.transform.parameter.ComputeParameters;
import net.irisshaders.iris.pipeline.transform.parameter.DHParameters;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.parameter.SodiumParameters;
import net.irisshaders.iris.pipeline.transform.parameter.TextureStageParameters;
import net.irisshaders.iris.pipeline.transform.parameter.VanillaParameters;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.CompatibilityTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.CompositeCoreTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.CompositeTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.DHGenericTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.DHTerrainTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.SodiumCoreTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.SodiumTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.TextureTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.VanillaCoreTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.VanillaTransformer;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransformPatcher {
    static final TokenFilter<Parameters> parseTokenFilter = new TransformPatcher$1(TokenChannel.PREPROCESSOR);
    private static final boolean useCache = true;
    private static final Map<TransformPatcher$CacheKey, Map<PatchShaderType, String>> cache = new LRUCache(400);
    private static final List<String> internalPrefixes = List.of("iris_", "irisMain", "moj_import");
    static final Pattern versionPattern = Pattern.compile("#version\\s+(\\d+)", 32);
    static final EnumASTTransformer<Parameters, PatchShaderType> transformer;
    static Logger LOGGER;

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void lambda$static$1(TranslationUnit var0, Parameters var1_1, Root var2_2) {
        block19: {
            block18: {
                var3_3 = var0.getVersionStatement();
                if (var3_3 == null) {
                    throw new IllegalStateException("Missing the version statement!");
                }
                var4_4 = var3_3.profile;
                var5_5 = var3_3.version;
                if (Objects.requireNonNull(var1_1.patch) != Patch.COMPUTE) break block18;
                var3_3.profile = Profile.CORE;
                CommonTransformer.transform(TransformPatcher.transformer, var0, var2_2, var1_1, true);
                break block19;
            }
            v0 = var6_6 = var1_1.patch == Patch.VANILLA && ((VanillaParameters)var1_1).isLines() != false;
            if (var4_4 == Profile.CORE) ** GOTO lbl19
            if (var5_5.number >= 150 && var4_4 == null) ** GOTO lbl19
            if (var6_6) {
lbl19:
                // 3 sources

                if (var5_5.number < 330) {
                    var3_3.version = Version.GLSL33;
                }
                switch (TransformPatcher$3.$SwitchMap$net$irisshaders$iris$pipeline$transform$Patch[var1_1.patch.ordinal()]) {
                    case 1: {
                        CompositeCoreTransformer.transform(TransformPatcher.transformer, var0, var2_2, var1_1);
                        break;
                    }
                    case 2: {
                        var7_7 = (SodiumParameters)var1_1;
                        SodiumCoreTransformer.transform(TransformPatcher.transformer, var0, var2_2, var7_7);
                        break;
                    }
                    case 3: {
                        VanillaCoreTransformer.transform(TransformPatcher.transformer, var0, var2_2, (VanillaParameters)var1_1);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException("Unknown patch type: " + String.valueOf((Object)var1_1.patch));
                    }
                }
                if (var1_1.type == PatchShaderType.FRAGMENT) {
                    CompatibilityTransformer.transformFragmentCore(TransformPatcher.transformer, var0, var2_2, var1_1);
                }
            } else {
                if (var5_5.number < 330) {
                    var3_3.version = Version.GLSL33;
                }
                var3_3.profile = Profile.CORE;
                switch (TransformPatcher$3.$SwitchMap$net$irisshaders$iris$pipeline$transform$Patch[var1_1.patch.ordinal()]) {
                    case 1: {
                        CompositeTransformer.transform(TransformPatcher.transformer, var0, var2_2, var1_1);
                        break;
                    }
                    case 2: {
                        var7_8 = (SodiumParameters)var1_1;
                        SodiumTransformer.transform(TransformPatcher.transformer, var0, var2_2, var7_8);
                        break;
                    }
                    case 3: {
                        VanillaTransformer.transform(TransformPatcher.transformer, var0, var2_2, (VanillaParameters)var1_1);
                        break;
                    }
                    case 4: {
                        DHTerrainTransformer.transform(TransformPatcher.transformer, var0, var2_2, var1_1);
                        break;
                    }
                    case 5: {
                        DHGenericTransformer.transform(TransformPatcher.transformer, var0, var2_2, var1_1);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException("Unknown patch type: " + String.valueOf((Object)var1_1.patch));
                    }
                }
            }
        }
        TextureTransformer.transform(TransformPatcher.transformer, var0, var2_2, var1_1.getTextureStage(), var1_1.getTextureMap());
        CompatibilityTransformer.transformEach(TransformPatcher.transformer, var0, var2_2, var1_1);
    }

    static {
        LOGGER = LogManager.getLogger(TransformPatcher.class);
        transformer = new TransformPatcher$2(PatchShaderType.class);
        transformer.setTransformation((enumMap, parameters) -> {
            for (PatchShaderType patchShaderType : PatchShaderType.values()) {
                TranslationUnit translationUnit = (TranslationUnit)enumMap.get((Object)patchShaderType);
                if (translationUnit == null) continue;
                translationUnit.outputOptions.enablePrintInfo();
                parameters.type = patchShaderType;
                Root root = translationUnit.getRoot();
                internalPrefixes.stream().flatMap(arg_0 -> ((PrefixIdentifierIndex)root.getPrefixIdentifierIndex()).prefixQueryFlat(arg_0)).findAny().ifPresent(identifier -> {
                    throw new IllegalArgumentException("Detected a potential reference to unstable and internal Iris shader interfaces (iris_, irisMain and moj_import). This isn't currently supported. Violation: " + identifier.getName() + ". See debugging.md for more information.");
                });
                root.indexBuildSession(() -> TransformPatcher.lambda$static$1(translationUnit, parameters, root));
            }
            CompatibilityTransformer.transformGrouped(transformer, enumMap, parameters);
        });
        transformer.setTokenFilter(parseTokenFilter);
    }

    private static Map<PatchShaderType, String> transform(String string, String string2, String string3, String string4, String string5, String string6, Parameters parameters) {
        if (string2 == null && string3 == null && string4 == null && string5 == null && string6 == null) {
            return null;
        }
        Map<PatchShaderType, String> map = null;
        TransformPatcher$CacheKey transformPatcher$CacheKey = new TransformPatcher$CacheKey(parameters, string2, string3, string4, string5, string6);
        if (cache.containsKey(transformPatcher$CacheKey)) {
            map = cache.get(transformPatcher$CacheKey);
        }
        if (map == null) {
            transformer.setPrintType(Iris.getIrisConfig().areDebugOptionsEnabled() ? PrintType.INDENTED : PrintType.SIMPLE);
            EnumMap<PatchShaderType, String> enumMap = new EnumMap<PatchShaderType, String>(PatchShaderType.class);
            enumMap.put(PatchShaderType.VERTEX, string2);
            enumMap.put(PatchShaderType.GEOMETRY, string3);
            enumMap.put(PatchShaderType.TESS_CONTROL, string4);
            enumMap.put(PatchShaderType.TESS_EVAL, string5);
            enumMap.put(PatchShaderType.FRAGMENT, string6);
            map = TransformPatcher.transformInternal(string, enumMap, parameters);
            cache.put(transformPatcher$CacheKey, map);
        }
        return map;
    }

    public static Map<PatchShaderType, String> patchSodium(String string, String string2, String string3, String string4, String string5, String string6, AlphaTest alphaTest, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        return TransformPatcher.transform(string, string2, string3, string4, string5, string6, new SodiumParameters(Patch.SODIUM, object2ObjectMap, alphaTest));
    }

    public static Map<PatchShaderType, String> patchDHGeneric(String string, String string2, String string3, String string4, String string5, String string6, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        return TransformPatcher.transform(string, string2, string5, string3, string4, string6, new DHParameters(Patch.DH_GENERIC, object2ObjectMap));
    }

    public static Map<PatchShaderType, String> patchDHTerrain(String string, String string2, String string3, String string4, String string5, String string6, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        return TransformPatcher.transform(string, string2, string5, string3, string4, string6, new DHParameters(Patch.DH_TERRAIN, object2ObjectMap));
    }

    public static Map<PatchShaderType, String> patchComposite(String string, String string2, String string3, String string4, TextureStage textureStage, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        return TransformPatcher.transform(string, string2, string3, null, null, string4, new TextureStageParameters(Patch.COMPOSITE, textureStage, object2ObjectMap));
    }

    public static String patchCompute(String string, String string2, TextureStage textureStage, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        return TransformPatcher.transformCompute(string, string2, new ComputeParameters(Patch.COMPUTE, textureStage, object2ObjectMap)).getOrDefault((Object)PatchShaderType.COMPUTE, null);
    }

    public static Map<PatchShaderType, String> patchVanilla(String string, String string2, String string3, String string4, String string5, String string6, AlphaTest alphaTest, boolean bl, boolean bl2, boolean bl3, ShaderAttributeInputs shaderAttributeInputs, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        return TransformPatcher.transform(string, string2, string3, string4, string5, string6, new VanillaParameters(Patch.VANILLA, object2ObjectMap, alphaTest, bl, bl2, bl3, shaderAttributeInputs, string3 != null, string4 != null || string5 != null));
    }

    private static Map<PatchShaderType, String> transformCompute(String string, String string2, Parameters parameters) {
        if (string2 == null) {
            return null;
        }
        Map<PatchShaderType, String> map = null;
        TransformPatcher$CacheKey transformPatcher$CacheKey = new TransformPatcher$CacheKey(parameters, string2);
        if (cache.containsKey(transformPatcher$CacheKey)) {
            map = cache.get(transformPatcher$CacheKey);
        }
        if (map == null) {
            transformer.setPrintType(Iris.getIrisConfig().areDebugOptionsEnabled() ? PrintType.INDENTED : PrintType.SIMPLE);
            EnumMap<PatchShaderType, String> enumMap = new EnumMap<PatchShaderType, String>(PatchShaderType.class);
            enumMap.put(PatchShaderType.COMPUTE, string2);
            map = TransformPatcher.transformInternal(string, enumMap, parameters);
            cache.put(transformPatcher$CacheKey, map);
        }
        return map;
    }

    private static Map<PatchShaderType, String> transformInternal(String string, Map<PatchShaderType, String> map, Parameters parameters) {
        try {
            parameters.name = string;
            return (Map)transformer.transform(map, (Object)parameters);
        }
        catch (TransformationException | ParsingException | IllegalArgumentException | IllegalStateException throwable) {
            ShaderPrinter.printProgram("errored_" + string).addSources(map).print();
            throw new ShaderCompileException(string, (Exception)throwable);
        }
    }
}

