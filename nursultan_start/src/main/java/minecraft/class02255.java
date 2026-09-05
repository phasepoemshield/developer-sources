/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10883
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.logging.LogUtils
 *  java.lang.MatchException
 *  minecraft.class02669
 *  minecraft.class06202
 *  minecraft.class07332
 *  minecraft.class07341
 *  minecraft.class07345
 *  minecraft.class07353
 *  minecraft.class08238
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.compat.SkipList
 *  net.irisshaders.iris.gl.blending.DepthColorStorage
 *  net.irisshaders.iris.mixinterface.ShaderInstanceInterface
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.ShaderRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.pipeline.programs.ExtendedShader
 *  net.irisshaders.iris.pipeline.programs.FallbackShader
 *  net.irisshaders.iris.pipeline.programs.IrisProgram
 *  net.irisshaders.iris.shadows.ShadowRenderer
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.opengl.GL31C
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10883;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import minecraft.class02669;
import minecraft.class06202;
import minecraft.class07332;
import minecraft.class07341;
import minecraft.class07345;
import minecraft.class07353;
import minecraft.class08238;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.SkipList;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.mixinterface.ShaderInstanceInterface;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.ShaderRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ExtendedShader;
import net.irisshaders.iris.pipeline.programs.FallbackShader;
import net.irisshaders.iris.pipeline.programs.IrisProgram;
import net.irisshaders.iris.shadows.ShadowRenderer;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL31C;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02255
implements AutoCloseable,
ShaderInstanceInterface {
    private static final Logger field_58041 = LogUtils.getLogger();
    public static Set<String> field_57863 = Sets.newHashSet((Object[])new String[]{"Projection", "Lighting", "Fog", "Globals"});
    public static class02255 field_57864 = new class02255(-1, "invalid");
    public final Map<String, class07345> field_53841 = new HashMap<String, class07345>();
    private final int field_29493;
    private final String field_57865;
    private static final ImmutableSet ATTRIBUTE_LIST = ImmutableSet.of((Object)"Position", (Object)"Color", (Object)"Normal", (Object)"UV0", (Object)"UV1", (Object)"UV2", (Object[])new String[0]);
    private static class02255 lastAppliedShader;
    private MethodHandle shouldSkip;

    public class02255(int n, String string) {
        this.field_29493 = n;
        this.field_57865 = string;
    }

    public String toString() {
        return this.field_57865;
    }

    @Override
    public void close() {
        this.field_53841.values().forEach(class07345::close);
        GlStateManager.glDeleteProgram((int)this.field_29493);
    }

    private int redirect$bem000$iris$changeIndex(int n, CharSequence charSequence) {
        class02255 var4 = this;
        if (var4 instanceof IrisProgram) {
            return ((IrisProgram)var4).iris$getBlockIndex(n, charSequence);
        }
        return GL31C.glGetUniformBlockIndex((int)n, (CharSequence)charSequence);
    }

    private void redirect$bem000$iris$silence(Logger logger, String string, Object object, Object object2) {
        if (!this.isKnownShader()) {
            logger.warn(string, object, object2);
        }
    }

    private static boolean shouldOverrideShaders() {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline instanceof ShaderRenderingPipeline) {
            return ((ShaderRenderingPipeline)worldRenderingPipeline).shouldOverrideShaders();
        }
        return false;
    }

    private void iris$unlockDepthColorState(CallbackInfo callbackInfo) {
        if (!this.iris$shouldSkipThis()) {
            if (!this.isKnownShader() && class02255.shouldOverrideShaders() && Iris.getPipelineManager().getPipelineNullable() instanceof IrisRenderingPipeline) {
                class06202.Nq().e().iris$bindFramebuffer();
            }
            return;
        }
        DepthColorStorage.unlockDepthColor();
    }

    public boolean iris$shouldSkipThis() {
        if (Iris.getIrisConfig().shouldAllowUnknownShaders()) {
            if (ShadowRenderer.ACTIVE) {
                return true;
            }
            if (!class02255.shouldOverrideShaders()) {
                return false;
            }
            if (this.shouldSkip == SkipList.NONE) {
                return false;
            }
            if (this.shouldSkip == SkipList.ALWAYS) {
                return true;
            }
            try {
                return this.shouldSkip.invoke(this);
            }
            catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        }
        return !(this instanceof ExtendedShader) && !(this instanceof FallbackShader) && class02255.shouldOverrideShaders();
    }

    /*
     * WARNING - void declaration
     */
    public void method_62900(List<RenderPipeline.UniformDescription> list, List<String> list2) {
        void var6_11;
        String string;
        String string2;
        String string3;
        int n = 0;
        int n2 = 0;
        for (RenderPipeline.UniformDescription object2 : list) {
            String string4 = object2.name();
            class07353 class073532 = switch (class02669.N[object2.type().ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> {
                    string3 = string4;
                    int logger = this.field_29493;
                    int var9_18 = this.redirect$bem000$iris$changeIndex(logger, string3);
                    if (var9_18 == -1) {
                        yield null;
                    }
                    int var10_19 = n++;
                    GL31.glUniformBlockBinding((int)this.field_29493, (int)var9_18, (int)var10_19);
                    yield new class07332(var10_19);
                }
                case 2 -> {
                    int var9_18 = GlStateManager._glGetUniformLocation((int)this.field_29493, (CharSequence)string4);
                    if (var9_18 == -1) {
                        string2 = string4;
                        string = this.field_57865;
                        string3 = "{} shader program does not use utb {} defined in the pipeline. This might be a bug.";
                        Logger var11_21 = field_58041;
                        this.redirect$bem000$iris$silence(var11_21, string3, string, string2);
                        yield null;
                    }
                    int var10_19 = n2++;
                    yield new class07353(var9_18, var10_19, Objects.requireNonNull(object2.textureFormat()));
                }
            };
            if (class073532 == null) continue;
            this.field_53841.put(string4, (class07345)class073532);
        }
        for (String string5 : list2) {
            int n3 = GlStateManager._glGetUniformLocation((int)this.field_29493, (CharSequence)string5);
            if (n3 == -1) {
                string2 = string5;
                string = this.field_57865;
                string3 = "{} shader program does not use sampler {} defined in the pipeline. This might be a bug.";
                Logger logger = field_58041;
                this.redirect$bem000$iris$silence(logger, string3, string, string2);
                continue;
            }
            int n4 = n2++;
            this.field_53841.put(string5, (class07345)new class07341(n3, n4));
        }
        int n5 = GlStateManager.glGetProgrami((int)this.field_29493, (int)35382);
        boolean bl = false;
        while (var6_11 < n5) {
            String string6 = GL31.glGetActiveUniformBlockName((int)this.field_29493, (int)var6_11);
            if (!this.field_53841.containsKey(string6)) {
                if (!list2.contains(string6) && field_57863.contains(string6)) {
                    int n6 = n++;
                    GL31.glUniformBlockBinding((int)this.field_29493, (int)var6_11, (int)n6);
                    this.field_53841.put(string6, (class07345)new class07332(n6));
                } else {
                    string2 = this.field_57865;
                    string = string6;
                    string3 = "Found unknown and unsupported uniform {} in {}";
                    Logger logger = field_58041;
                    this.redirect$bem000$iris$silence(logger, string3, string, string2);
                }
            }
            ++var6_11;
        }
    }

    public @Nullable class07345 method_34582(String string) {
        RenderSystem.assertOnRenderThread();
        return this.field_53841.get(string);
    }

    public Map<String, class07345> method_68406() {
        return this.field_53841;
    }

    public static class02255 method_62896(class08238 class082382, class08238 class082383, VertexFormat vertexFormat, String string) throws class10883 {
        String string22;
        int n = GlStateManager.glCreateProgram();
        if (n <= 0) {
            throw new class10883("Could not create shader program (returned program ID " + n + ")");
        }
        int n2 = 0;
        for (String string22 : vertexFormat.getElementAttributeNames()) {
            GlStateManager._glBindAttribLocation((int)n, (int)n2, (CharSequence)string22);
            ++n2;
        }
        GlStateManager.glAttachShader((int)n, (int)class082382.y());
        GlStateManager.glAttachShader((int)n, (int)class082383.y());
        GlStateManager.glLinkProgram((int)n);
        int n3 = GlStateManager.glGetProgrami((int)n, (int)35714);
        string22 = GlStateManager.glGetProgramInfoLog((int)n, (int)32768);
        if (n3 == 0 || string22.contains("Failed for unknown reason")) {
            throw new class10883("Error encountered when linking program containing VS " + String.valueOf(class082382.N()) + " and FS " + String.valueOf(class082383.N()) + ". Log output: " + string22);
        }
        if (!string22.isEmpty()) {
            field_58041.info("Info log when linking program containing VS {} and FS {}. Log output: {}", new Object[]{class082382.N(), class082383.N(), string22});
        }
        return new class02255(n, string);
    }

    private boolean isKnownShader() {
        return this instanceof ExtendedShader || this instanceof FallbackShader;
    }

    public void setShouldSkip(MethodHandle methodHandle) {
        this.shouldSkip = methodHandle;
    }

    private void onTail(CallbackInfo callbackInfo) {
        if (!this.iris$shouldSkipThis()) {
            WorldRenderingPipeline worldRenderingPipeline;
            if (!this.isKnownShader() && class02255.shouldOverrideShaders() && (worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable()) instanceof IrisRenderingPipeline && !ShadowRenderer.ACTIVE) {
                ((IrisRenderingPipeline)worldRenderingPipeline).bindDefault();
            }
            return;
        }
        if (ImmediateState.isRenderingLevel && !this.isKnownShader()) {
            DepthColorStorage.disableDepthColor();
        } else {
            DepthColorStorage.unlockDepthColor();
        }
    }

    public String method_68404() {
        return this.field_57865;
    }

    public int method_1270() {
        return this.field_29493;
    }

    static {
        SkipList.shouldSkipList.put(ExtendedShader.class, SkipList.NONE);
        SkipList.shouldSkipList.put(FallbackShader.class, SkipList.NONE);
    }
}

