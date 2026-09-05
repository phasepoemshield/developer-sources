/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.BufferBlendInformation
 *  net.irisshaders.iris.gl.framebuffer.ViewportData
 */
package net.irisshaders.iris.shaderpack.properties;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BufferBlendInformation;
import net.irisshaders.iris.gl.framebuffer.ViewportData;
import net.irisshaders.iris.shaderpack.parsing.CommentDirective;
import net.irisshaders.iris.shaderpack.parsing.CommentDirective$Type;
import net.irisshaders.iris.shaderpack.parsing.CommentDirectiveParser;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$ConstDirective;
import net.irisshaders.iris.shaderpack.parsing.DispatchingDirectiveHolder;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public class ProgramDirectives {
    private static final ImmutableList<String> LEGACY_RENDER_TARGETS = PackRenderTargetDirectives.LEGACY_RENDER_TARGETS;
    private final int[] drawBuffers;
    private final ViewportData viewportScale;
    private final AlphaTest alphaTestOverride;
    private final Optional<BlendModeOverride> blendModeOverride;
    private final List<BufferBlendInformation> bufferBlendInformations;
    private final ImmutableSet<Integer> mipmappedBuffers;
    private final ImmutableMap<Integer, Boolean> explicitFlips;
    private boolean unknownDrawBuffers;

    private static int[] parseDigits(char[] cArray) {
        int[] nArray = new int[cArray.length];
        int n = 0;
        for (char c : cArray) {
            nArray[n++] = Character.digit(c, 10);
        }
        return nArray;
    }

    private ProgramDirectives(int[] nArray, ViewportData viewportData, AlphaTest alphaTest, Optional<BlendModeOverride> optional, List<BufferBlendInformation> list, ImmutableSet<Integer> immutableSet, ImmutableMap<Integer, Boolean> immutableMap) {
        this.drawBuffers = nArray;
        this.viewportScale = viewportData;
        this.alphaTestOverride = alphaTest;
        this.blendModeOverride = optional;
        this.bufferBlendInformations = list;
        this.mipmappedBuffers = immutableSet;
        this.explicitFlips = immutableMap;
        this.unknownDrawBuffers = false;
    }

    public ProgramDirectives(ProgramSource programSource, ShaderProperties shaderProperties, Set<Integer> set, BlendModeOverride blendModeOverride) {
        List list;
        BlendModeOverride blendModeOverride2;
        Optional<CommentDirective> optional = ProgramDirectives.findDrawbuffersDirective(programSource.getFragmentSource());
        Optional<CommentDirective> optional2 = ProgramDirectives.findRendertargetsDirective(programSource.getFragmentSource());
        Optional<CommentDirective> optional3 = ProgramDirectives.getAppliedDirective(optional, optional2);
        this.drawBuffers = optional3.map(commentDirective -> {
            if (commentDirective.getType() == CommentDirective$Type.DRAWBUFFERS) {
                return ProgramDirectives.parseDigits(commentDirective.getDirective().toCharArray());
            }
            if (commentDirective.getType() == CommentDirective$Type.RENDERTARGETS) {
                return ProgramDirectives.parseDigitList(commentDirective.getDirective());
            }
            throw new IllegalStateException("Unhandled comment directive type!");
        }).orElseGet(() -> {
            this.unknownDrawBuffers = true;
            return new int[]{0};
        });
        if (shaderProperties != null) {
            this.viewportScale = (ViewportData)shaderProperties.getViewportScaleOverrides().getOrDefault((Object)programSource.getName(), (Object)ViewportData.defaultValue());
            this.alphaTestOverride = (AlphaTest)shaderProperties.getAlphaTestOverrides().get((Object)programSource.getName());
            blendModeOverride2 = (BlendModeOverride)shaderProperties.getBlendModeOverrides().get((Object)programSource.getName());
            list = (List)shaderProperties.getBufferBlendOverrides().get((Object)programSource.getName());
            this.blendModeOverride = Optional.ofNullable(blendModeOverride2 != null ? blendModeOverride2 : blendModeOverride);
            this.bufferBlendInformations = list != null ? list : Collections.emptyList();
            this.explicitFlips = programSource.getParent().getPackDirectives().getExplicitFlips(programSource.getName());
        } else {
            this.viewportScale = ViewportData.defaultValue();
            this.alphaTestOverride = null;
            this.blendModeOverride = Optional.ofNullable(blendModeOverride);
            this.bufferBlendInformations = Collections.emptyList();
            this.explicitFlips = ImmutableMap.of();
        }
        blendModeOverride2 = new HashSet();
        list = new DispatchingDirectiveHolder();
        set.forEach(arg_0 -> ProgramDirectives.lambda$new$3((HashSet)blendModeOverride2, (DispatchingDirectiveHolder)((Object)list), arg_0));
        programSource.getFragmentSource().map(ConstDirectiveParser::findDirectives).ifPresent(arg_0 -> ProgramDirectives.lambda$new$4((DispatchingDirectiveHolder)((Object)list), arg_0));
        this.mipmappedBuffers = ImmutableSet.copyOf((Collection)blendModeOverride2);
    }

    private static /* synthetic */ void lambda$new$3(HashSet hashSet, DispatchingDirectiveHolder dispatchingDirectiveHolder, Integer n) {
        BooleanConsumer booleanConsumer = bl -> {
            if (bl) {
                hashSet.add(n);
            } else {
                hashSet.remove(n);
            }
        };
        dispatchingDirectiveHolder.acceptConstBooleanDirective("colortex" + n + "MipmapEnabled", booleanConsumer);
        if (n < LEGACY_RENDER_TARGETS.size()) {
            dispatchingDirectiveHolder.acceptConstBooleanDirective((String)LEGACY_RENDER_TARGETS.get(n.intValue()) + "MipmapEnabled", booleanConsumer);
        }
    }

    public int[] getDrawBuffers() {
        return this.drawBuffers;
    }

    public ImmutableMap<Integer, Boolean> getExplicitFlips() {
        return this.explicitFlips;
    }

    public ViewportData getViewportScale() {
        return this.viewportScale;
    }

    public Optional<BlendModeOverride> getBlendModeOverride() {
        return this.blendModeOverride;
    }

    public List<BufferBlendInformation> getBufferBlendOverrides() {
        return this.bufferBlendInformations;
    }

    public ImmutableSet<Integer> getMipmappedBuffers() {
        return this.mipmappedBuffers;
    }

    public Optional<AlphaTest> getAlphaTestOverride() {
        return Optional.ofNullable(this.alphaTestOverride);
    }

    public boolean hasUnknownDrawBuffers() {
        return this.unknownDrawBuffers;
    }

    private static /* synthetic */ void lambda$new$4(DispatchingDirectiveHolder dispatchingDirectiveHolder, List list) {
        for (ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective : list) {
            dispatchingDirectiveHolder.processDirective(constDirectiveParser$ConstDirective);
        }
    }

    private static int[] parseDigitList(String string) {
        return Arrays.stream(string.split(",")).mapToInt(Integer::parseInt).toArray();
    }

    private static Optional<CommentDirective> findDrawbuffersDirective(Optional<String> optional) {
        return optional.flatMap(string -> CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS));
    }

    private static Optional<CommentDirective> findRendertargetsDirective(Optional<String> optional) {
        return optional.flatMap(string -> CommentDirectiveParser.findDirective(string, CommentDirective$Type.RENDERTARGETS));
    }

    private static Optional<CommentDirective> getAppliedDirective(Optional<CommentDirective> optional, Optional<CommentDirective> optional2) {
        if (optional.isPresent() && optional2.isPresent()) {
            if (optional.get().getLocation() > optional2.get().getLocation()) {
                return optional;
            }
            return optional2;
        }
        if (optional.isPresent()) {
            return optional;
        }
        return optional2;
    }

    public ProgramDirectives withOverriddenDrawBuffers(int[] nArray) {
        return new ProgramDirectives(nArray, this.viewportScale, this.alphaTestOverride, this.blendModeOverride, this.bufferBlendInformations, this.mipmappedBuffers, this.explicitFlips);
    }
}

