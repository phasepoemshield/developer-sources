/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderPass$class_10884
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class07529
 *  minecraft.class08066
 *  minecraft.class08188
 *  minecraft.class08394
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices
 *  net.caffeinemc.mods.sodium.client.util.SodiumChunkSection
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class07529;
import minecraft.class08066;
import minecraft.class08188;
import minecraft.class08394;
import minecraft.class08743;
import minecraft.class08768;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.util.SodiumChunkSection;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class08760
implements SodiumChunkSection {
    private GpuTextureView textureView;
    private EnumMap<class08743, List<RenderPass.class_10884<GpuBufferSlice[]>>> drawsPerLayer;
    private int maxIndicesRequired;
    private GpuBufferSlice[] chunkSectionInfos;
    private SodiumWorldRenderer i;
    private ChunkRenderMatrices R;
    private double M;
    private double B;
    private double Z;

    public int L() {
        return this.maxIndicesRequired;
    }

    public class08760(GpuTextureView gpuTextureView, EnumMap<class08743, List<RenderPass.class_10884<GpuBufferSlice[]>>> enumMap, int n, GpuBufferSlice[] gpuBufferSliceArray) {
        this.textureView = gpuTextureView;
        this.drawsPerLayer = enumMap;
        this.maxIndicesRequired = n;
        this.chunkSectionInfos = gpuBufferSliceArray;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class08760 && Objects.equals(this.textureView, ((class08760)object).textureView) && Objects.equals(this.drawsPerLayer, ((class08760)object).drawsPerLayer) && this.maxIndicesRequired == ((class08760)object).maxIndicesRequired && Objects.equals(this.chunkSectionInfos, ((class08760)object).chunkSectionInfos);
    }

    public final String toString() {
        return "class08760[textureView=" + Objects.toString(this.textureView) + ", drawsPerLayer=" + Objects.toString(this.drawsPerLayer) + ", maxIndicesRequired=" + Integer.toString(this.maxIndicesRequired) + ", chunkSectionInfos=" + Objects.toString(this.chunkSectionInfos) + "]";
    }

    public final int hashCode() {
        return (((0 * 31 + Objects.hashCode(this.textureView)) * 31 + Objects.hashCode(this.drawsPerLayer)) * 31 + Integer.hashCode(this.maxIndicesRequired)) * 31 + Objects.hashCode(this.chunkSectionInfos);
    }

    public GpuBufferSlice[] u() {
        return this.chunkSectionInfos;
    }

    public EnumMap<class08743, List<RenderPass.class_10884<GpuBufferSlice[]>>> y() {
        return this.drawsPerLayer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class08768 class087682, class08188 class081882, CallbackInfo callbackInfo) {
        if (this.i != null) {
            callbackInfo.cancel();
            RenderDevice.enterManagedCode();
            try {
                this.i.drawChunkLayer(class087682, this.R, this.M, this.B, this.Z, class081882);
            }
            finally {
                RenderDevice.exitManagedCode();
            }
        }
    }

    public void N(class08768 class087682, class08188 class081882) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class087682, class081882, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        GpuBuffer gpuBuffer = this.maxIndicesRequired == 0 ? null : class_55902.method_68274(this.maxIndicesRequired);
        VertexFormat.class_5595 class_55952 = this.maxIndicesRequired == 0 ? null : class_55902.method_31924();
        class08743[] class08743Array = class087682.y();
        class06202 class062022 = class06202.Nq();
        boolean bl = class07529.t && (Boolean)class062022.U_1 != false;
        class08066 class080662 = class087682.L();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Section layers for " + class087682.N(), class080662.u(), OptionalInt.empty(), class080662.R(), OptionalDouble.empty());){
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.bindTexture("Sampler2", ((class03386)class062022.i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
            for (class08743 class087432 : class08743Array) {
                List list;
                List<RenderPass.class_10884<GpuBufferSlice[]>> var15 = this.drawsPerLayer.get((Object)class087432);
                if (var15.isEmpty()) continue;
                if (class087432 == class08743.field_60926) {
                    list = var15.reversed();
                }
                renderPass.setPipeline(bl ? class08394.w : class087432.N());
                renderPass.bindTexture("Sampler0", this.textureView, class081882);
                renderPass.drawMultipleIndexed((Collection)list, gpuBuffer, class_55952, List.of("ChunkSection"), (Object)this.chunkSectionInfos);
            }
        }
    }

    public GpuTextureView N() {
        return this.textureView;
    }

    public void sodium$setRendering(SodiumWorldRenderer sodiumWorldRenderer, ChunkRenderMatrices chunkRenderMatrices, double d, double d2, double d3) {
        this.i = sodiumWorldRenderer;
        this.R = chunkRenderMatrices;
        this.M = d;
        this.B = d2;
        this.Z = d3;
    }
}

