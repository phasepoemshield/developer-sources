/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  java.lang.runtime.SwitchBootstraps
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 */
package net.irisshaders.iris.shaderpack.properties;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.shaderpack.parsing.DirectiveHolder;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives$RenderTargetSettings;

public class PackRenderTargetDirectives {
    public static final ImmutableList<String> LEGACY_RENDER_TARGETS = ImmutableList.of((Object)"gcolor", (Object)"gdepth", (Object)"gnormal", (Object)"composite", (Object)"gaux1", (Object)"gaux2", (Object)"gaux3", (Object)"gaux4");
    public static final Set<Integer> BASELINE_SUPPORTED_RENDER_TARGETS;
    private final Int2ObjectMap<PackRenderTargetDirectives$RenderTargetSettings> renderTargetSettings = new Int2ObjectOpenHashMap();

    PackRenderTargetDirectives(Set<Integer> set) {
        set.forEach(n -> this.renderTargetSettings.put(n.intValue(), (Object)new PackRenderTargetDirectives$RenderTargetSettings()));
    }

    static {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (int i = 0; i < 32; ++i) {
            builder.add((Object)i);
        }
        BASELINE_SUPPORTED_RENDER_TARGETS = builder.build();
    }

    private static /* synthetic */ void lambda$getBuffersToBeCleared$1(IntList intList, int n, PackRenderTargetDirectives$RenderTargetSettings packRenderTargetDirectives$RenderTargetSettings) {
        if (packRenderTargetDirectives$RenderTargetSettings.shouldClear()) {
            intList.add(n);
        }
    }

    public IntList getBuffersToBeCleared() {
        IntArrayList intArrayList = new IntArrayList();
        this.renderTargetSettings.forEach((arg_0, arg_1) -> PackRenderTargetDirectives.lambda$getBuffersToBeCleared$1((IntList)intArrayList, arg_0, arg_1));
        return intArrayList;
    }

    public Map<Integer, PackRenderTargetDirectives$RenderTargetSettings> getRenderTargetSettings() {
        return Collections.unmodifiableMap(this.renderTargetSettings);
    }

    public void acceptDirectives(DirectiveHolder directiveHolder) {
        Optional.ofNullable((PackRenderTargetDirectives$RenderTargetSettings)this.renderTargetSettings.get(7)).ifPresent(packRenderTargetDirectives$RenderTargetSettings -> directiveHolder.acceptCommentStringDirective("GAUX4FORMAT", string -> {
            String string2 = string;
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{"RGBA32F", "RGB32F", "RGB16"}, (Object)string2, (int)n)) {
                case 0: {
                    packRenderTargetDirectives$RenderTargetSettings.requestedFormat = InternalTextureFormat.RGBA32F;
                    break;
                }
                case 1: {
                    packRenderTargetDirectives$RenderTargetSettings.requestedFormat = InternalTextureFormat.RGB32F;
                    break;
                }
                case 2: {
                    packRenderTargetDirectives$RenderTargetSettings.requestedFormat = InternalTextureFormat.RGB16;
                    break;
                }
                default: {
                    Iris.logger.warn("Ignoring GAUX4FORMAT directive /* GAUX4FORMAT:" + string + "*/ because " + string + " must be RGBA32F, RGB32F, or RGB16. Use `const int colortex7Format = " + string + ";` + instead.");
                }
            }
        }));
        Optional.ofNullable((PackRenderTargetDirectives$RenderTargetSettings)this.renderTargetSettings.get(1)).ifPresent(packRenderTargetDirectives$RenderTargetSettings -> directiveHolder.acceptUniformDirective("gdepth", () -> {
            if (packRenderTargetDirectives$RenderTargetSettings.requestedFormat == InternalTextureFormat.RGBA) {
                packRenderTargetDirectives$RenderTargetSettings.requestedFormat = InternalTextureFormat.RGBA32F;
            }
        }));
        this.renderTargetSettings.forEach((n, packRenderTargetDirectives$RenderTargetSettings) -> {
            this.acceptBufferDirectives(directiveHolder, (PackRenderTargetDirectives$RenderTargetSettings)packRenderTargetDirectives$RenderTargetSettings, "colortex" + n);
            if (n < LEGACY_RENDER_TARGETS.size()) {
                this.acceptBufferDirectives(directiveHolder, (PackRenderTargetDirectives$RenderTargetSettings)packRenderTargetDirectives$RenderTargetSettings, (String)LEGACY_RENDER_TARGETS.get(n));
            }
        });
    }

    private void acceptBufferDirectives(DirectiveHolder directiveHolder, PackRenderTargetDirectives$RenderTargetSettings packRenderTargetDirectives$RenderTargetSettings, String string) {
        directiveHolder.acceptConstStringDirective(string + "Format", string2 -> {
            Optional optional = InternalTextureFormat.fromString((String)string2);
            if (optional.isPresent()) {
                packRenderTargetDirectives$RenderTargetSettings.requestedFormat = (InternalTextureFormat)optional.get();
            } else {
                Iris.logger.warn("Unrecognized internal texture format " + string2 + " specified for " + string + "Format, ignoring.");
            }
        });
        directiveHolder.acceptConstBooleanDirective(string + "Clear", bl -> {
            packRenderTargetDirectives$RenderTargetSettings.clear = bl;
        });
        directiveHolder.acceptConstVec4Directive(string + "ClearColor", vector4f -> {
            packRenderTargetDirectives$RenderTargetSettings.clearColor = vector4f;
        });
    }
}

