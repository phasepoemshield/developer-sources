/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01894
 *  minecraft.class08066
 *  minecraft.class08188
 *  minecraft.class08879
 *  minecraft.class08893
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.gl.shader.GlProgram
 *  net.caffeinemc.mods.sodium.client.gl.shader.GlShader
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants$Builder
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderLoader
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderType
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkFogMode
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderOptions
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.DefaultShaderInterface
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.mixin.core.GlCommandEncoderAccessor
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class01894;
import minecraft.class08066;
import minecraft.class08188;
import minecraft.class08879;
import minecraft.class08893;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.shader.GlProgram;
import net.caffeinemc.mods.sodium.client.gl.shader.GlShader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderLoader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderType;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkFogMode;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderOptions;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.DefaultShaderInterface;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.mixin.core.GlCommandEncoderAccessor;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class ShaderChunkRenderer
implements ChunkRenderer {
    private final Map<ChunkShaderOptions, GlProgram<ChunkShaderInterface>> programs = new Object2ObjectOpenHashMap();
    protected final ChunkVertexType vertexType;
    protected final GlVertexFormat vertexFormat;
    protected final RenderDevice device;
    protected GlProgram<ChunkShaderInterface> activeProgram;

    public ShaderChunkRenderer(RenderDevice renderDevice, ChunkVertexType chunkVertexType) {
        this.device = renderDevice;
        this.vertexType = chunkVertexType;
        this.vertexFormat = chunkVertexType.getVertexFormat();
    }

    protected void begin(TerrainRenderPass terrainRenderPass, FogParameters fogParameters, class08188 class081882) {
        ChunkShaderOptions chunkShaderOptions;
        this.handler$bjb000$iris$resetState(terrainRenderPass, fogParameters, class081882, null);
        class08066 class080662 = terrainRenderPass.getTarget();
        int n = class080662.L().getHeight(0);
        int n2 = class080662.L().getWidth(0);
        int n3 = 0;
        int n4 = 0;
        this.redirect$bjb000$iris$redirectViewport(n4, n3, n2, n);
        n3 = ((class08893)class080662.L()).N(((class08879)RenderSystem.getDevice()).y(), class080662.i());
        n4 = 36160;
        this.redirect$bjb000$iris$bindFramebufferLater(n4, n3);
        ((GlCommandEncoderAccessor)RenderSystem.getDevice().createCommandEncoder()).sodium$applyPipelineState(terrainRenderPass.getPipeline());
        ((GlCommandEncoderAccessor)RenderSystem.getDevice().createCommandEncoder()).sodium$setLastProgram(null);
        ChunkShaderOptions chunkShaderOptions2 = chunkShaderOptions = new ChunkShaderOptions(ChunkFogMode.SMOOTH, terrainRenderPass, this.vertexType);
        ShaderChunkRenderer shaderChunkRenderer = this;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class080662);
        class080662 = (class08066)localRefImpl.dispose();
        this.activeProgram = this.redirect$bjb000$iris$redirectIrisProgram$mixinextras$bridge$12(shaderChunkRenderer, chunkShaderOptions2, terrainRenderPass, (LocalRef)localRefImpl);
        this.activeProgram.bind();
        ((ChunkShaderInterface)this.activeProgram.getInterface()).setupState(terrainRenderPass, fogParameters, class081882);
    }

    protected void end(TerrainRenderPass terrainRenderPass) {
        ((ChunkShaderInterface)this.activeProgram.getInterface()).resetState();
        this.activeProgram.unbind();
        this.activeProgram = null;
    }

    @Override
    public void delete(CommandList commandList) {
        this.programs.values().forEach(GlProgram::delete);
    }

    private void handler$bjb000$iris$resetState(TerrainRenderPass terrainRenderPass, FogParameters fogParameters, class08188 class081882, CallbackInfo callbackInfo) {
        BlendModeOverride.restore();
    }

    private void redirect$bjb000$iris$redirectViewport(int n, int n2, int n3, int n4) {
        if (!ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            GlStateManager._viewport((int)n, (int)n2, (int)n3, (int)n4);
        }
    }

    private GlProgram redirect$bjb000$iris$redirectIrisProgram(ShaderChunkRenderer shaderChunkRenderer, ChunkShaderOptions chunkShaderOptions, TerrainRenderPass terrainRenderPass, class08066 class080662) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        GlProgram glProgram = null;
        if (worldRenderingPipeline instanceof IrisRenderingPipeline) {
            IrisRenderingPipeline irisRenderingPipeline = (IrisRenderingPipeline)worldRenderingPipeline;
            irisRenderingPipeline.getSodiumPrograms().getFramebuffer(terrainRenderPass).bind();
            glProgram = irisRenderingPipeline.getSodiumPrograms().getProgram(terrainRenderPass);
        }
        if (glProgram == null) {
            GlStateManager._glBindFramebuffer((int)36160, (int)((class08893)class080662.L()).N(((class08879)RenderSystem.getDevice()).y(), class080662.i()));
            return this.compileProgram(chunkShaderOptions);
        }
        return glProgram;
    }

    private void redirect$bjb000$iris$bindFramebufferLater(int n, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private GlProgram<ChunkShaderInterface> createShader(String string, ChunkShaderOptions chunkShaderOptions) {
        ShaderConstants shaderConstants = ShaderChunkRenderer.createShaderConstants(chunkShaderOptions);
        GlShader glShader = ShaderLoader.loadShader((ShaderType)ShaderType.VERTEX, (class01894)class01894.N((String)"sodium", (String)(string + ".vsh")), (ShaderConstants)shaderConstants);
        GlShader glShader2 = ShaderLoader.loadShader((ShaderType)ShaderType.FRAGMENT, (class01894)class01894.N((String)"sodium", (String)(string + ".fsh")), (ShaderConstants)shaderConstants);
        try {
            GlProgram glProgram = GlProgram.builder((class01894)class01894.N((String)"sodium", (String)"chunk_shader")).attachShader(glShader).attachShader(glShader2).bindAttribute("a_Position", 0).bindAttribute("a_Color", 1).bindAttribute("a_TexCoord", 2).bindAttribute("a_LightAndData", 3).bindFragmentData("fragColor", 0).link(shaderBindingContext -> new DefaultShaderInterface(shaderBindingContext, chunkShaderOptions));
            return glProgram;
        }
        finally {
            glShader.delete();
            glShader2.delete();
        }
    }

    protected GlProgram<ChunkShaderInterface> compileProgram(ChunkShaderOptions chunkShaderOptions) {
        GlProgram<ChunkShaderInterface> glProgram = this.programs.get(chunkShaderOptions);
        if (glProgram == null) {
            glProgram = this.createShader("blocks/block_layer_opaque", chunkShaderOptions);
            this.programs.put(chunkShaderOptions, glProgram);
        }
        return glProgram;
    }

    private GlProgram redirect$bjb000$iris$redirectIrisProgram$mixinextras$bridge$12(ShaderChunkRenderer shaderChunkRenderer, ChunkShaderOptions chunkShaderOptions, TerrainRenderPass terrainRenderPass, LocalRef localRef) {
        return this.redirect$bjb000$iris$redirectIrisProgram(shaderChunkRenderer, chunkShaderOptions, terrainRenderPass, (class08066)localRef.get());
    }

    private static ShaderConstants createShaderConstants(ChunkShaderOptions chunkShaderOptions) {
        ShaderConstants.Builder builder = ShaderConstants.builder();
        builder.addAll(chunkShaderOptions.fog().getDefines());
        if (chunkShaderOptions.pass().supportsFragmentDiscard()) {
            builder.add("USE_FRAGMENT_DISCARD");
        }
        builder.add("USE_VERTEX_COMPRESSION");
        return builder.build();
    }
}

