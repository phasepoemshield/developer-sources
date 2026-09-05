/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.features.FeatureFlags
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.shaderpack.ShaderPack
 *  net.irisshaders.iris.shaderpack.include.AbsolutePackPath
 *  net.irisshaders.iris.shaderpack.loading.ProgramArrayId
 *  net.irisshaders.iris.shaderpack.loading.ProgramId
 */
package net.irisshaders.iris.shaderpack.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.features.FeatureFlags;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.shaderpack.ShaderPack;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.loading.ProgramArrayId;
import net.irisshaders.iris.shaderpack.loading.ProgramId;
import net.irisshaders.iris.shaderpack.parsing.ComputeDirectiveParser;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$ConstDirective;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$Type;
import net.irisshaders.iris.shaderpack.parsing.DispatchingDirectiveHolder;
import net.irisshaders.iris.shaderpack.programs.ComputeSource;
import net.irisshaders.iris.shaderpack.programs.ProgramSetInterface;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public class ProgramSet
implements ProgramSetInterface {
    private final PackDirectives packDirectives;
    private final ComputeSource[] shadowCompute;
    private final ComputeSource[] finalCompute;
    private final ComputeSource[] setup;
    private final ShaderPack pack;
    private final EnumMap<ProgramId, ProgramSource> gbufferPrograms = new EnumMap(ProgramId.class);
    private final EnumMap<ProgramArrayId, ProgramSource[]> compositePrograms = new EnumMap(ProgramArrayId.class);
    private final EnumMap<ProgramArrayId, ComputeSource[][]> computePrograms = new EnumMap(ProgramArrayId.class);

    public ProgramSet(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, ShaderProperties shaderProperties, ShaderPack shaderPack) {
        this.packDirectives = new PackDirectives(PackRenderTargetDirectives.BASELINE_SUPPORTED_RENDER_TARGETS, shaderProperties);
        this.pack = shaderPack;
        boolean bl = shaderPack.hasFeature(FeatureFlags.TESSELLATION_SHADERS);
        this.shadowCompute = this.readComputeArray(absolutePackPath, function, "shadow", shaderProperties);
        this.setup = this.readProgramArray(absolutePackPath, function, "setup", shaderProperties);
        try (ExecutorService executorService = Executors.newFixedThreadPool(10);){
            for (ProgramArrayId programArrayId : ProgramArrayId.values()) {
                ProgramId programId = this.readProgramArray(absolutePackPath, function, programArrayId.getSourcePrefix(), shaderProperties, bl);
                this.compositePrograms.put(programArrayId, (ProgramSource[])programId);
                ComputeSource[][] computeSourceArrayArray = new ComputeSource[programArrayId.getNumPrograms()][];
                boolean bl2 = true;
                for (int i = 0; i < programArrayId.getNumPrograms(); ++i) {
                    computeSourceArrayArray[i] = this.readComputeArray(absolutePackPath, function, programArrayId.getSourcePrefix() + String.valueOf(i == 0 ? "" : Integer.valueOf(i)), shaderProperties);
                    if (computeSourceArrayArray[i].length <= 0) continue;
                    bl2 = false;
                }
                this.computePrograms.put(programArrayId, bl2 ? new ComputeSource[][]{} : computeSourceArrayArray);
            }
            Future[] futureArray = new Future[ProgramId.values().length];
            for (ProgramId programId : ProgramId.values()) {
                futureArray[programId.ordinal()] = executorService.submit(() -> ProgramSet.readProgramSource(absolutePackPath, function, programId.getSourceName(), this, shaderProperties, programId.getBlendModeOverride(), bl));
            }
            for (ProgramId programId : ProgramId.values()) {
                this.gbufferPrograms.put(programId, (ProgramSource)futureArray[programId.ordinal()].get());
            }
        }
        catch (InterruptedException | ExecutionException exception) {
            throw new RuntimeException(exception);
        }
        this.finalCompute = this.readComputeArray(absolutePackPath, function, "final", shaderProperties);
        this.locateDirectives();
    }

    public Optional<ProgramSource> get(ProgramId programId) {
        ProgramSource programSource = this.gbufferPrograms.getOrDefault(programId, null);
        if (programSource != null) {
            return programSource.requireValid();
        }
        return Optional.empty();
    }

    public ComputeSource[] getFinalCompute() {
        return this.finalCompute;
    }

    public PackDirectives getPackDirectives() {
        return this.packDirectives;
    }

    public ProgramSource[] getComposite(ProgramArrayId programArrayId) {
        return this.compositePrograms.getOrDefault(programArrayId, new ProgramSource[programArrayId.getNumPrograms()]);
    }

    public ComputeSource[] getShadowCompute() {
        return this.shadowCompute;
    }

    public ComputeSource[][] getCompute(ProgramArrayId programArrayId) {
        return this.computePrograms.getOrDefault(programArrayId, new ComputeSource[0][0]);
    }

    public ShaderPack getPack() {
        return this.pack;
    }

    public ComputeSource[] getSetup() {
        return this.setup;
    }

    private static ComputeSource readComputeSource(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, String string, ProgramSet programSet, ShaderProperties shaderProperties) {
        AbsolutePackPath absolutePackPath2 = absolutePackPath.resolve(string + ".csh");
        String string2 = function.apply(absolutePackPath2);
        if (string2 == null) {
            return null;
        }
        return new ComputeSource(string, string2, programSet, shaderProperties);
    }

    private void locateDirectives() {
        ArrayList<ProgramSource> arrayList = new ArrayList<ProgramSource>();
        ArrayList<ComputeSource> arrayList2 = new ArrayList<ComputeSource>();
        arrayList.addAll(Arrays.asList(this.getComposite(ProgramArrayId.ShadowComposite)));
        arrayList.addAll(Arrays.asList(this.getComposite(ProgramArrayId.Begin)));
        arrayList.addAll(Arrays.asList(this.getComposite(ProgramArrayId.Prepare)));
        for (ComputeSource[][] computeSourceArray : this.computePrograms.values()) {
            for (ComputeSource[] computeSourceArray2 : computeSourceArray) {
                arrayList2.addAll(Arrays.asList(computeSourceArray2));
            }
        }
        arrayList.addAll(this.gbufferPrograms.values());
        for (ComputeSource computeSource : this.setup) {
            if (computeSource == null) continue;
            arrayList2.add(computeSource);
        }
        arrayList.addAll(Arrays.asList(this.getComposite(ProgramArrayId.Deferred)));
        arrayList.addAll(Arrays.asList(this.getComposite(ProgramArrayId.Composite)));
        Collections.addAll(arrayList2, this.finalCompute);
        Collections.addAll(arrayList2, this.shadowCompute);
        for (ComputeSource computeSource : arrayList2) {
            if (computeSource == null) continue;
            computeSource.getSource().map(ConstDirectiveParser::findDirectives).ifPresent(list -> {
                for (ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective : list) {
                    if (constDirectiveParser$ConstDirective.getType() == ConstDirectiveParser$Type.IVEC3 && constDirectiveParser$ConstDirective.getKey().equals("workGroups")) {
                        ComputeDirectiveParser.setComputeWorkGroups(computeSource, constDirectiveParser$ConstDirective);
                        continue;
                    }
                    if (constDirectiveParser$ConstDirective.getType() != ConstDirectiveParser$Type.VEC2 || !constDirectiveParser$ConstDirective.getKey().equals("workGroupsRender")) continue;
                    ComputeDirectiveParser.setComputeWorkGroupsRelative(computeSource, constDirectiveParser$ConstDirective);
                }
            });
        }
        DispatchingDirectiveHolder dispatchingDirectiveHolder = new DispatchingDirectiveHolder();
        this.packDirectives.acceptDirectivesFrom(dispatchingDirectiveHolder);
        for (ProgramSource programSource : arrayList) {
            if (programSource == null) continue;
            programSource.getFragmentSource().map(ConstDirectiveParser::findDirectives).ifPresent(list -> {
                for (ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective : list) {
                    dispatchingDirectiveHolder.processDirective(constDirectiveParser$ConstDirective);
                }
            });
        }
        this.packDirectives.getRenderTargetDirectives().getRenderTargetSettings().forEach((n, packRenderTargetDirectives$RenderTargetSettings) -> Iris.logger.debug("Render target settings for colortex" + n + ": " + String.valueOf(packRenderTargetDirectives$RenderTargetSettings)));
    }

    private ComputeSource[] readComputeArray(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, String string, ShaderProperties shaderProperties) {
        ComputeSource[] computeSourceArray = new ComputeSource[27];
        computeSourceArray[0] = ProgramSet.readComputeSource(absolutePackPath, function, string, this, shaderProperties);
        for (char c = 'a'; c <= 'z'; c = (char)(c + '\u0001')) {
            String string2 = "_" + c;
            computeSourceArray[c - 96] = ProgramSet.readComputeSource(absolutePackPath, function, string + string2, this, shaderProperties);
            if (computeSourceArray[c - 96] == null) break;
        }
        if (Arrays.stream(computeSourceArray).allMatch(Objects::isNull)) {
            return new ComputeSource[0];
        }
        return computeSourceArray;
    }

    private ProgramSource[] readProgramArray(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, String string, ShaderProperties shaderProperties, boolean bl) {
        ProgramSource[] programSourceArray = new ProgramSource[100];
        for (int i = 0; i < programSourceArray.length; ++i) {
            String string2 = i == 0 ? "" : Integer.toString(i);
            programSourceArray[i] = ProgramSet.readProgramSource(absolutePackPath, function, string + string2, this, shaderProperties, bl);
        }
        return programSourceArray;
    }

    private ComputeSource[] readProgramArray(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, String string, ShaderProperties shaderProperties) {
        ComputeSource[] computeSourceArray = new ComputeSource[100];
        for (int i = 0; i < computeSourceArray.length; ++i) {
            String string2 = i == 0 ? "" : Integer.toString(i);
            computeSourceArray[i] = ProgramSet.readComputeSource(absolutePackPath, function, string + string2, this, shaderProperties);
        }
        return computeSourceArray;
    }

    private static ProgramSource readProgramSource(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, String string, ProgramSet programSet, ShaderProperties shaderProperties, BlendModeOverride blendModeOverride, boolean bl) {
        String string2;
        AbsolutePackPath absolutePackPath2;
        AbsolutePackPath absolutePackPath3 = absolutePackPath.resolve(string + ".vsh");
        String string3 = function.apply(absolutePackPath3);
        AbsolutePackPath absolutePackPath4 = absolutePackPath.resolve(string + ".gsh");
        String string4 = function.apply(absolutePackPath4);
        String string5 = null;
        String string6 = null;
        if (bl) {
            absolutePackPath2 = absolutePackPath.resolve(string + ".tcs");
            string5 = function.apply(absolutePackPath2);
            string2 = absolutePackPath.resolve(string + ".tes");
            string6 = function.apply((AbsolutePackPath)string2);
        }
        absolutePackPath2 = absolutePackPath.resolve(string + ".fsh");
        string2 = function.apply(absolutePackPath2);
        if (string3 == null && string2 != null) {
            Iris.logger.warn("Found a program (" + string + ") that has a fragment shader but no vertex shader? This is very legacy behavior and might not work right.");
            string3 = "#version 120\n\nvarying vec4 irs_texCoords[3];\nvarying vec4 irs_Color;\n\nvoid main() {\n\tgl_Position = ftransform();\n\tirs_texCoords[0] = gl_TextureMatrix[0] * gl_MultiTexCoord0;\n\tirs_texCoords[1] = gl_TextureMatrix[1] * gl_MultiTexCoord1;\n\tirs_texCoords[2] = gl_TextureMatrix[1] * gl_MultiTexCoord2;\n\tirs_Color = gl_Color;\n}\n";
        }
        return new ProgramSource(string, string3, string4, string5, string6, string2, programSet, shaderProperties, blendModeOverride);
    }

    private static ProgramSource readProgramSource(AbsolutePackPath absolutePackPath, Function<AbsolutePackPath, String> function, String string, ProgramSet programSet, ShaderProperties shaderProperties, boolean bl) {
        return ProgramSet.readProgramSource(absolutePackPath, function, string, programSet, shaderProperties, null, bl);
    }
}

