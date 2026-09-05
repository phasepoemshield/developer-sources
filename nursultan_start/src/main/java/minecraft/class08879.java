/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10883
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.shaders.ShaderType
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.logging.LogUtils
 *  minecraft.class00090
 *  minecraft.class01894
 *  minecraft.class02255
 *  minecraft.class02770
 *  minecraft.class04995
 *  minecraft.class07607
 *  minecraft.class08188
 *  minecraft.class08193
 *  minecraft.class08227
 *  minecraft.class08238
 *  minecraft.class08263
 *  minecraft.class08391
 *  minecraft.class08394
 *  minecraft.class08495
 *  minecraft.class08523
 *  minecraft.class08741
 *  minecraft.class09006
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.CompositeRenderer
 *  net.irisshaders.iris.pipeline.IrisPipelines
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.pipeline.programs.ShaderKey
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLCapabilities
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10883;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00090;
import minecraft.class01894;
import minecraft.class02255;
import minecraft.class02770;
import minecraft.class04995;
import minecraft.class07607;
import minecraft.class08188;
import minecraft.class08193;
import minecraft.class08227;
import minecraft.class08238;
import minecraft.class08263;
import minecraft.class08391;
import minecraft.class08394;
import minecraft.class08495;
import minecraft.class08523;
import minecraft.class08741;
import minecraft.class08859;
import minecraft.class08862;
import minecraft.class08865;
import minecraft.class08870;
import minecraft.class08882;
import minecraft.class08893;
import minecraft.class09006;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.CompositeRenderer;
import net.irisshaders.iris.pipeline.IrisPipelines;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.vertices.ImmediateState;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08879
implements GpuDevice {
    private static final Logger M = LogUtils.getLogger();
    protected static boolean N = true;
    public static boolean y = true;
    public static boolean L = true;
    public static boolean u = true;
    protected static boolean i = true;
    protected static boolean R = true;
    private final CommandEncoder B;
    private final @Nullable class08263 Z;
    private final class08859 z;
    private final int U;
    private final class08882 E;
    private final class07607 W;
    private final Map<RenderPipeline, class08870> m;
    private final Map<class08862, class08238> P;
    private final class08865 s;
    private final class00090 T;
    private final Set<String> b;
    private final int j;
    private final int v;
    private Set n = new HashSet();

    private class08870 L(RenderPipeline renderPipeline, class07607 class076072) {
        return new class08870(renderPipeline, this.y(renderPipeline, class076072));
    }

    public class08865 L() {
        return this.s;
    }

    public String getVendor() {
        return GlStateManager._getString((int)7936);
    }

    public class08879(long l, int n, boolean bl, class07607 class076072, boolean bl2) {
        this.m = new IdentityHashMap<RenderPipeline, class08870>();
        this.P = new HashMap<class08862, class08238>();
        this.b = new HashSet<String>();
        GLFW.glfwMakeContextCurrent((long)l);
        GLCapabilities gLCapabilities = GL.createCapabilities();
        int n2 = class08879.i();
        GLFW.glfwSetWindowSizeLimits((long)l, (int)-1, (int)-1, (int)n2, (int)n2);
        class08741 class087412 = class08741.N((GpuDevice)this);
        this.Z = class08263.N((int)n, (boolean)bl, this.b);
        this.z = class08859.N(gLCapabilities, bl2, this.b);
        this.s = class08865.N(gLCapabilities, this.z, this.b);
        this.T = class00090.N((GLCapabilities)gLCapabilities, this.b);
        this.E = class08882.N(gLCapabilities, this.b, class087412);
        this.U = n2;
        this.W = class076072;
        this.B = new class08495(this);
        this.j = GL11.glGetInteger((int)35380);
        GL11.glEnable((int)34895);
        GL11.glEnable((int)34370);
        if (gLCapabilities.GL_EXT_texture_filter_anisotropic) {
            this.v = class04995.y((float)GL11.glGetFloat((int)34047));
            this.b.add("GL_EXT_texture_filter_anisotropic");
        } else {
            this.v = 1;
        }
    }

    private static int i() {
        int n;
        int n2 = GlStateManager._getInteger((int)3379);
        for (n = Math.max(32768, n2); n >= 1024; n >>= 1) {
            GlStateManager._texImage2D((int)32868, (int)0, (int)6408, (int)n, (int)n, (int)0, (int)6408, (int)5121, null);
            if (GlStateManager._getTexLevelParameter((int)32868, (int)0, (int)4096) == 0) continue;
            return n;
        }
        n = Math.max(n2, 1024);
        M.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", (Object)n);
        return n;
    }

    public void close() {
        this.clearPipelineCache();
    }

    public class00090 u() {
        return this.T;
    }

    public class08882 y() {
        return this.E;
    }

    private class02255 y(RenderPipeline renderPipeline, class07607 class076072) {
        class08238 class082382 = this.N(renderPipeline.getVertexShader(), ShaderType.VERTEX, renderPipeline.getShaderDefines(), class076072);
        class08238 class082383 = this.N(renderPipeline.getFragmentShader(), ShaderType.FRAGMENT, renderPipeline.getShaderDefines(), class076072);
        if (class082382 == class08238.N) {
            M.error("Couldn't compile pipeline {}: vertex shader {} was invalid", (Object)renderPipeline.getLocation(), (Object)renderPipeline.getVertexShader());
            return class02255.field_57864;
        }
        if (class082383 == class08238.N) {
            M.error("Couldn't compile pipeline {}: fragment shader {} was invalid", (Object)renderPipeline.getLocation(), (Object)renderPipeline.getFragmentShader());
            return class02255.field_57864;
        }
        try {
            class02255 class022552 = class02255.method_62896((class08238)class082382, (class08238)class082383, (VertexFormat)renderPipeline.getVertexFormat(), (String)renderPipeline.getLocation().toString());
            class022552.method_62900(renderPipeline.getUniforms(), renderPipeline.getSamplers());
            this.z.N(class022552);
            return class022552;
        }
        catch (class10883 class108832) {
            M.error("Couldn't compile program for pipeline {}: {}", (Object)renderPipeline.getLocation(), (Object)class108832);
            return class02255.field_57864;
        }
    }

    public String getVersion() {
        return GlStateManager._getString((int)7938);
    }

    private static class02255 N(IrisRenderingPipeline irisRenderingPipeline, RenderPipeline renderPipeline) {
        ShaderKey shaderKey = IrisPipelines.getPipeline((IrisRenderingPipeline)irisRenderingPipeline, (RenderPipeline)renderPipeline);
        return shaderKey == null ? null : irisRenderingPipeline.getShaderMap().getShader(shaderKey);
    }

    protected class08870 N(RenderPipeline renderPipeline2) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(renderPipeline2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08870)((Object)callbackInfoReturnable.getReturnValue());
        }
        return (class08870)((Object)this.m.computeIfAbsent(renderPipeline2, renderPipeline -> this.L((RenderPipeline)renderPipeline, this.W)));
    }

    private void N(RenderPipeline renderPipeline, CallbackInfoReturnable callbackInfoReturnable) {
        IrisRenderingPipeline irisRenderingPipeline;
        if (renderPipeline == CompositeRenderer.COMPOSITE_PIPELINE) {
            return;
        }
        if (renderPipeline == class08394.yR || renderPipeline == class08394.yM) {
            return;
        }
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline instanceof IrisRenderingPipeline && (irisRenderingPipeline = (IrisRenderingPipeline)worldRenderingPipeline).shouldOverrideShaders() && !ImmediateState.bypass) {
            RenderPipeline renderPipeline2 = renderPipeline;
            class02255 class022552 = class08879.N(irisRenderingPipeline, renderPipeline2);
            if (class022552 != null) {
                callbackInfoReturnable.setReturnValue((Object)new class08870(renderPipeline, class022552));
            } else if (this.n.add(renderPipeline)) {
                if (renderPipeline.getLocation().y().equals("minecraft")) {
                    Iris.logger.fatal("Missing program " + String.valueOf(renderPipeline.getLocation()) + " in override list. This is likely an Iris bug!!!", new Throwable());
                } else {
                    Iris.logger.error("Missing program " + String.valueOf(renderPipeline.getLocation()) + " in override list. This is not a critical problem, but it could lead to weird rendering.", new Throwable());
                }
            }
        }
    }

    private class08238 N(class08862 class088622, class07607 class076072) {
        String string = class076072.get(class088622.N(), class088622.y());
        if (string == null) {
            M.error("Couldn't find source for {} shader ({})", (Object)class088622.y(), (Object)class088622.N());
            return class08238.N;
        }
        String string2 = class02770.N((String)string, (class08227)class088622.L());
        int n = GlStateManager.glCreateShader((int)GlConst.toGl((ShaderType)class088622.y()));
        GlStateManager.glShaderSource((int)n, (String)string2);
        GlStateManager.glCompileShader((int)n);
        if (GlStateManager.glGetShaderi((int)n, (int)35713) == 0) {
            String string3 = StringUtils.trim((String)GlStateManager.glGetShaderInfoLog((int)n, (int)32768));
            M.error("Couldn't compile {} shader ({}): {}", new Object[]{class088622.y().getName(), class088622.N(), string3});
            return class08238.N;
        }
        class08238 class082382 = new class08238(n, class088622.N(), class088622.y());
        this.z.N(class082382);
        return class082382;
    }

    public class08870 precompilePipeline(RenderPipeline renderPipeline2, @Nullable class07607 class076072) {
        class07607 class076073 = class076072 == null ? this.W : class076072;
        return (class08870)((Object)this.m.computeIfAbsent(renderPipeline2, renderPipeline -> this.L((RenderPipeline)renderPipeline, class076073)));
    }

    protected class08238 N(class01894 class018942, ShaderType shaderType, class08227 class082272, class07607 class076072) {
        class08862 class088623 = new class08862(class018942, shaderType, class082272);
        return this.P.computeIfAbsent(class088623, class088622 -> this.N((class08862)((Object)class088622), class076072));
    }

    public class08859 N() {
        return this.z;
    }

    public class08188 createSampler(AddressMode addressMode, AddressMode addressMode2, FilterMode filterMode, FilterMode filterMode2, int n, OptionalDouble optionalDouble) {
        if (n < 1 || n > this.v) {
            throw new IllegalArgumentException("maxAnisotropy out of range; must be >= 1 and <= " + this.getMaxSupportedAnisotropy() + ", but was " + n);
        }
        return new class08193(addressMode, addressMode2, filterMode, filterMode2, n, optionalDouble);
    }

    public GpuBuffer createBuffer(@Nullable Supplier<String> supplier, int n, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Buffer source must not be empty");
        }
        GlStateManager.clearGlErrors();
        long l = byteBuffer.remaining();
        class08523 class085232 = this.T.N(this.E, supplier, n, byteBuffer);
        int n2 = GlStateManager._getError();
        if (n2 == 1285) {
            throw new class08391("Could not allocate buffer of " + l + " for " + String.valueOf(supplier));
        }
        if (n2 != 0) {
            throw new IllegalStateException("OpenGL error " + n2);
        }
        this.z.N(class085232);
        return class085232;
    }

    public GpuBuffer createBuffer(@Nullable Supplier<String> supplier, int n, long l) {
        if (l <= 0L) {
            throw new IllegalArgumentException("Buffer size must be greater than zero");
        }
        GlStateManager.clearGlErrors();
        class08523 class085232 = this.T.N(this.E, supplier, n, l);
        int n2 = GlStateManager._getError();
        if (n2 == 1285) {
            throw new class08391("Could not allocate buffer of " + l + " for " + String.valueOf(supplier));
        }
        if (n2 != 0) {
            throw new IllegalStateException("OpenGL error " + n2);
        }
        this.z.N(class085232);
        return class085232;
    }

    public int getMaxTextureSize() {
        return this.U;
    }

    public GpuTextureView createTextureView(GpuTexture gpuTexture) {
        return this.createTextureView(gpuTexture, 0, gpuTexture.getMipLevels());
    }

    public GpuTextureView createTextureView(GpuTexture gpuTexture, int n, int n2) {
        if (gpuTexture.isClosed()) {
            throw new IllegalArgumentException("Can't create texture view with closed texture");
        }
        if (n < 0 || n + n2 > gpuTexture.getMipLevels()) {
            throw new IllegalArgumentException(n2 + " mip levels starting from " + n + " would be out of range for texture with only " + gpuTexture.getMipLevels() + " mip levels");
        }
        return new class09006((class08893)gpuTexture, n, n2);
    }

    public GpuTexture createTexture(@Nullable Supplier<String> supplier, int n, TextureFormat textureFormat, int n2, int n3, int n4, int n5) {
        return this.createTexture(this.z.y() && supplier != null ? supplier.get() : null, n, textureFormat, n2, n3, n4, n5);
    }

    public GpuTexture createTexture(@Nullable String string, int n, TextureFormat textureFormat, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        boolean bl;
        if (n5 < 1) {
            throw new IllegalArgumentException("mipLevels must be at least 1");
        }
        if (n4 < 1) {
            throw new IllegalArgumentException("depthOrLayers must be at least 1");
        }
        boolean bl2 = bl = (n & 0x10) != 0;
        if (bl) {
            if (n2 != n3) {
                throw new IllegalArgumentException("Cubemap compatible textures must be square, but size is " + n2 + "x" + n3);
            }
            if (n4 % 6 != 0) {
                throw new IllegalArgumentException("Cubemap compatible textures must have a layer count with a multiple of 6, was " + n4);
            }
            if (n4 > 6) {
                throw new UnsupportedOperationException("Array textures are not yet supported");
            }
        } else if (n4 > 1) {
            throw new UnsupportedOperationException("Array or 3D textures are not yet supported");
        }
        GlStateManager.clearGlErrors();
        int n8 = GlStateManager._genTexture();
        if (string == null) {
            string = String.valueOf(n8);
        }
        if (bl) {
            GL11.glBindTexture((int)34067, (int)n8);
            n7 = 34067;
        } else {
            GlStateManager._bindTexture((int)n8);
            n7 = 3553;
        }
        GlStateManager._texParameter((int)n7, (int)33085, (int)(n5 - 1));
        GlStateManager._texParameter((int)n7, (int)33082, (int)0);
        GlStateManager._texParameter((int)n7, (int)33083, (int)(n5 - 1));
        if (textureFormat.hasDepthAspect()) {
            GlStateManager._texParameter((int)n7, (int)34892, (int)0);
        }
        if (bl) {
            for (int n9 : GlConst.CUBEMAP_TARGETS) {
                for (int i = 0; i < n5; ++i) {
                    GlStateManager._texImage2D((int)n9, (int)i, (int)GlConst.toGlInternalId((TextureFormat)textureFormat), (int)(n2 >> i), (int)(n3 >> i), (int)0, (int)GlConst.toGlExternalId((TextureFormat)textureFormat), (int)GlConst.toGlType((TextureFormat)textureFormat), null);
                }
            }
        } else {
            for (int i = 0; i < n5; ++i) {
                GlStateManager._texImage2D((int)n7, (int)i, (int)GlConst.toGlInternalId((TextureFormat)textureFormat), (int)(n2 >> i), (int)(n3 >> i), (int)0, (int)GlConst.toGlExternalId((TextureFormat)textureFormat), (int)GlConst.toGlType((TextureFormat)textureFormat), null);
            }
        }
        if ((n6 = GlStateManager._getError()) == 1285) {
            throw new class08391("Could not allocate texture of " + n2 + "x" + n3 + " for " + string);
        }
        if (n6 != 0) {
            throw new IllegalStateException("OpenGL error " + n6);
        }
        class08893 class088932 = new class08893(n, string, textureFormat, n2, n3, n4, n5, n8);
        this.z.N(class088932);
        return class088932;
    }

    private static void R() {
        int n = GlStateManager.glCreateShader((int)35633);
        int n2 = GlStateManager.glCreateProgram();
        GlStateManager.glAttachShader((int)n2, (int)n);
        GlStateManager.glDeleteShader((int)n);
        GlStateManager.glDeleteProgram((int)n2);
    }

    public List<String> getEnabledExtensions() {
        return new ArrayList<String>(this.b);
    }

    public void clearPipelineCache() {
        for (class08870 class088702 : this.m.values()) {
            if (class088702.y() == class02255.field_57864) continue;
            class088702.y().close();
        }
        this.m.clear();
        for (class08238 class082382 : this.P.values()) {
            if (class082382 == class08238.N) continue;
            class082382.close();
        }
        this.P.clear();
        String string = GlStateManager._getString((int)7937);
        if (string.contains("AMD")) {
            class08879.R();
        }
    }

    public boolean isDebuggingEnabled() {
        return this.Z != null;
    }

    public String getImplementationInformation() {
        if (GLFW.glfwGetCurrentContext() == 0L) {
            return "NO CONTEXT";
        }
        return GlStateManager._getString((int)7937) + " GL version " + GlStateManager._getString((int)7938) + ", " + GlStateManager._getString((int)7936);
    }

    public List<String> getLastDebugMessages() {
        return this.Z == null ? Collections.emptyList() : this.Z.N();
    }

    public int getUniformOffsetAlignment() {
        return this.j;
    }

    public CommandEncoder createCommandEncoder() {
        return this.B;
    }

    public String getBackendName() {
        return "OpenGL";
    }

    public String getRenderer() {
        return GlStateManager._getString((int)7937);
    }

    public int getMaxSupportedAnisotropy() {
        return this.v;
    }
}

