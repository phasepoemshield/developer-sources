/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08188
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeBinding
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.DrawCommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.MultiDrawBatch
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.TessellationBinding
 *  net.caffeinemc.mods.sodium.client.gui.SodiumOptions$PerformanceSettings
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataStorage
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataUnsafe
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable
 *  net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion
 *  net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion$DeviceResources
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform
 *  net.caffeinemc.mods.sodium.client.util.BitwiseMath
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.client.util.UInt32
 *  net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Pointer
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import java.util.Iterator;
import minecraft.class08188;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeBinding;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.DrawCommandList;
import net.caffeinemc.mods.sodium.client.gl.device.MultiDrawBatch;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation;
import net.caffeinemc.mods.sodium.client.gl.tessellation.TessellationBinding;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.render.chunk.LocalSectionIndex;
import net.caffeinemc.mods.sodium.client.render.chunk.ShaderChunkRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType;
import net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataStorage;
import net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataUnsafe;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderInterface;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.util.BitwiseMath;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.UInt32;
import net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;

public class DefaultChunkRenderer
extends ShaderChunkRenderer {
    private final SharedQuadIndexBuffer sharedIndexBuffer;
    private static final int MODEL_UNASSIGNED = ModelQuadFacing.UNASSIGNED.ordinal();
    private static final int MODEL_POS_X = ModelQuadFacing.POS_X.ordinal();
    private static final int MODEL_POS_Y = ModelQuadFacing.POS_Y.ordinal();
    private static final int MODEL_POS_Z = ModelQuadFacing.POS_Z.ordinal();
    private static final int MODEL_NEG_X = ModelQuadFacing.NEG_X.ordinal();
    private static final int MODEL_NEG_Y = ModelQuadFacing.NEG_Y.ordinal();
    private static final int MODEL_NEG_Z = ModelQuadFacing.NEG_Z.ordinal();

    public DefaultChunkRenderer(RenderDevice renderDevice, ChunkVertexType chunkVertexType) {
        super(renderDevice, chunkVertexType);
        this.sharedIndexBuffer = new SharedQuadIndexBuffer(renderDevice.createCommandList(), SharedQuadIndexBuffer$IndexType.INTEGER);
    }

    @Override
    public void delete(CommandList commandList) {
        super.delete(commandList);
        this.sharedIndexBuffer.delete(commandList);
    }

    @Override
    public void render(ChunkRenderMatrices chunkRenderMatrices, CommandList commandList, ChunkRenderListIterable chunkRenderListIterable, TerrainRenderPass terrainRenderPass, CameraTransform cameraTransform, FogParameters fogParameters, boolean bl, class08188 class081882) {
        super.begin(terrainRenderPass, fogParameters, class081882);
        boolean bl2 = this.redirect$bij000$iris$disableBlockFaceCullingInShadowPass(SodiumClientMod.options().performance);
        boolean bl3 = terrainRenderPass.isTranslucent() && bl;
        ChunkShaderInterface chunkShaderInterface = (ChunkShaderInterface)this.activeProgram.getInterface();
        chunkShaderInterface.setProjectionMatrix(chunkRenderMatrices.projection());
        chunkShaderInterface.setModelViewMatrix(chunkRenderMatrices.modelView());
        Iterator iterator = chunkRenderListIterable.iterator(terrainRenderPass.isTranslucent());
        while (iterator.hasNext()) {
            ChunkRenderList chunkRenderList = (ChunkRenderList)iterator.next();
            RenderRegion renderRegion = chunkRenderList.getRegion();
            SectionRenderDataStorage sectionRenderDataStorage = renderRegion.getStorage(terrainRenderPass);
            if (sectionRenderDataStorage == null) continue;
            MultiDrawBatch multiDrawBatch = renderRegion.getCachedBatch(terrainRenderPass);
            if (!multiDrawBatch.isFilled) {
                DefaultChunkRenderer.fillCommandBuffer(multiDrawBatch, renderRegion, sectionRenderDataStorage, chunkRenderList, cameraTransform, terrainRenderPass, bl2, bl3);
            }
            if (multiDrawBatch.isEmpty()) continue;
            if (!bl3) {
                this.sharedIndexBuffer.ensureCapacity(commandList, multiDrawBatch.getIndexBufferSize());
            }
            GlTessellation glTessellation = bl3 ? this.prepareIndexedTessellation(commandList, renderRegion) : this.prepareTessellation(commandList, renderRegion);
            DefaultChunkRenderer.setModelMatrixUniforms(chunkShaderInterface, renderRegion, cameraTransform, renderRegion.getResources().prepareChunkData(commandList));
            DefaultChunkRenderer.executeDrawBatch(commandList, glTessellation, multiDrawBatch);
        }
        super.end(terrainRenderPass);
    }

    private static void addLocalIndexedDrawCommands(MultiDrawBatch multiDrawBatch, long l, int n) {
        long l2 = multiDrawBatch.pElementPointer;
        long l3 = multiDrawBatch.pBaseVertex;
        long l4 = multiDrawBatch.pElementCount;
        int n2 = multiDrawBatch.size;
        long l5 = SectionRenderDataUnsafe.getBaseElement((long)l);
        long l6 = SectionRenderDataUnsafe.getBaseVertex((long)l);
        for (int i = 0; i < ModelQuadFacing.COUNT; ++i) {
            long l7 = SectionRenderDataUnsafe.getVertexCount((long)l, (int)i);
            long l8 = (l7 >> 2) * 6L;
            MemoryUtil.memPutInt((long)(l4 + (long)(n2 << 2)), (int)UInt32.uncheckedDowncast((long)l8));
            MemoryUtil.memPutInt((long)(l3 + (long)(n2 << 2)), (int)UInt32.uncheckedDowncast((long)l6));
            MemoryUtil.memPutAddress((long)(l2 + (long)(n2 << Pointer.POINTER_SHIFT)), (long)(l5 << 2));
            l6 += l7;
            l5 += l8;
            n2 += n >> i & 1;
        }
        multiDrawBatch.size = n2;
    }

    private static void addSharedIndexedDrawCommands(MultiDrawBatch multiDrawBatch, long l, int n) {
        long l2 = multiDrawBatch.pElementPointer;
        long l3 = multiDrawBatch.pBaseVertex;
        long l4 = multiDrawBatch.pElementCount;
        long l5 = SectionRenderDataUnsafe.getBaseElement((long)l) << 2;
        long l6 = SectionRenderDataUnsafe.getFacingList((long)l);
        int n2 = multiDrawBatch.size;
        long l7 = 0L;
        long l8 = SectionRenderDataUnsafe.getBaseVertex((long)l);
        int n3 = 0;
        for (int i = 0; i <= ModelQuadFacing.COUNT; ++i) {
            int n4 = 0;
            long l9 = 0L;
            if (i < ModelQuadFacing.COUNT && (l9 = SectionRenderDataUnsafe.getVertexCount((long)l, (int)i)) != 0L) {
                long l10 = l6 >>> i * 8 & 0xFFL;
                n4 = n >>> (int)l10 & 1;
            }
            if (n4 == 0) {
                if (n3 == 1) {
                    if (i < ModelQuadFacing.COUNT && l9 == 0L) continue;
                    MemoryUtil.memPutInt((long)(l4 + (long)(n2 << 2)), (int)UInt32.uncheckedDowncast((long)((l7 >> 2) * 6L)));
                    MemoryUtil.memPutInt((long)(l3 + (long)(n2 << 2)), (int)UInt32.uncheckedDowncast((long)l8));
                    MemoryUtil.memPutAddress((long)(l2 + (long)(n2 << Pointer.POINTER_SHIFT)), (long)l5);
                    ++n2;
                    l8 += l7;
                    l7 = 0L;
                }
                l8 += l9;
            } else {
                l7 += l9;
            }
            n3 = n4;
        }
        multiDrawBatch.size = n2;
    }

    private boolean modify$bij000$iris$doNotSortInShadow(boolean bl) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            return false;
        }
        return bl;
    }

    public static int getVisibleFaces(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n4 << 4;
        int n8 = n7 + 16;
        int n9 = n5 << 4;
        int n10 = n9 + 16;
        int n11 = n6 << 4;
        int n12 = n11 + 16;
        int n13 = 1 << MODEL_UNASSIGNED;
        n13 |= BitwiseMath.greaterThan((int)n, (int)(n7 - 3)) << MODEL_POS_X;
        n13 |= BitwiseMath.greaterThan((int)n2, (int)(n9 - 3)) << MODEL_POS_Y;
        n13 |= BitwiseMath.greaterThan((int)n3, (int)(n11 - 3)) << MODEL_POS_Z;
        n13 |= BitwiseMath.lessThan((int)n, (int)(n8 + 3)) << MODEL_NEG_X;
        n13 |= BitwiseMath.lessThan((int)n2, (int)(n10 + 3)) << MODEL_NEG_Y;
        return n13 |= BitwiseMath.lessThan((int)n3, (int)(n12 + 3)) << MODEL_NEG_Z;
    }

    private static void executeDrawBatch(CommandList commandList, GlTessellation glTessellation, MultiDrawBatch multiDrawBatch) {
        try (DrawCommandList drawCommandList = commandList.beginTessellating(glTessellation);){
            drawCommandList.multiDrawElementsBaseVertex(multiDrawBatch, GlIndexType.UNSIGNED_INT);
        }
    }

    private static void fillCommandBuffer(MultiDrawBatch multiDrawBatch, RenderRegion renderRegion, SectionRenderDataStorage sectionRenderDataStorage, ChunkRenderList chunkRenderList, CameraTransform cameraTransform, TerrainRenderPass terrainRenderPass, boolean bl, boolean bl2) {
        multiDrawBatch.isFilled = true;
        ByteIterator byteIterator = chunkRenderList.sectionsWithGeometryIterator(terrainRenderPass.isTranslucent());
        if (byteIterator == null) {
            return;
        }
        int n = renderRegion.getChunkX();
        int n2 = renderRegion.getChunkY();
        int n3 = renderRegion.getChunkZ();
        while (byteIterator.hasNext()) {
            int n4 = byteIterator.nextByteAsInt();
            long l = sectionRenderDataStorage.getDataPointer(n4);
            int n5 = n + LocalSectionIndex.unpackX(n4);
            int n6 = n2 + LocalSectionIndex.unpackY(n4);
            int n7 = n3 + LocalSectionIndex.unpackZ(n4);
            int n8 = bl ? DefaultChunkRenderer.getVisibleFaces(cameraTransform.intX, cameraTransform.intY, cameraTransform.intZ, n5, n6, n7) : ModelQuadFacing.ALL;
            if ((n8 &= SectionRenderDataUnsafe.getSliceMask((long)l)) == 0) continue;
            if (bl2 && SectionRenderDataUnsafe.isLocalIndex((long)l)) {
                DefaultChunkRenderer.addLocalIndexedDrawCommands(multiDrawBatch, l, n8);
                continue;
            }
            DefaultChunkRenderer.addSharedIndexedDrawCommands(multiDrawBatch, l, n8);
        }
    }

    private static float getCameraTranslation(int n, int n2, float f) {
        return (float)(n - n2) - f;
    }

    private GlTessellation prepareIndexedTessellation(CommandList commandList, RenderRegion renderRegion) {
        RenderRegion.DeviceResources deviceResources = renderRegion.getResources();
        GlTessellation glTessellation = deviceResources.getIndexedTessellation();
        if (glTessellation == null) {
            boolean bl = false;
            glTessellation = this.createRegionTessellation(commandList, deviceResources, this.modify$bij000$iris$doNotSortInShadow(bl));
            deviceResources.updateIndexedTessellation(commandList, glTessellation);
        }
        return glTessellation;
    }

    private GlTessellation prepareTessellation(CommandList commandList, RenderRegion renderRegion) {
        RenderRegion.DeviceResources deviceResources = renderRegion.getResources();
        GlTessellation glTessellation = deviceResources.getTessellation();
        if (glTessellation == null) {
            glTessellation = this.createRegionTessellation(commandList, deviceResources, true);
            deviceResources.updateTessellation(commandList, glTessellation);
        }
        return glTessellation;
    }

    private static void setModelMatrixUniforms(ChunkShaderInterface chunkShaderInterface, RenderRegion renderRegion, CameraTransform cameraTransform, GlBuffer glBuffer) {
        float f = DefaultChunkRenderer.getCameraTranslation(renderRegion.getOriginX(), cameraTransform.intX, cameraTransform.fracX);
        float f2 = DefaultChunkRenderer.getCameraTranslation(renderRegion.getOriginY(), cameraTransform.intY, cameraTransform.fracY);
        float f3 = DefaultChunkRenderer.getCameraTranslation(renderRegion.getOriginZ(), cameraTransform.intZ, cameraTransform.fracZ);
        chunkShaderInterface.setRegionOffset(f, f2, f3);
        chunkShaderInterface.setChunkData(glBuffer, Math.toIntExact(System.currentTimeMillis() - renderRegion.getCreationTime()));
    }

    private GlTessellation createRegionTessellation(CommandList commandList, RenderRegion.DeviceResources deviceResources, boolean bl) {
        return commandList.createTessellation(GlPrimitiveType.TRIANGLES, new TessellationBinding[]{TessellationBinding.forVertexBuffer((GlBuffer)deviceResources.getGeometryBuffer(), (GlVertexAttributeBinding[])this.vertexFormat.getShaderBindings()), TessellationBinding.forElementBuffer((GlBuffer)(bl ? this.sharedIndexBuffer.getBufferObject() : deviceResources.getIndexBuffer()))});
    }

    private boolean redirect$bij000$iris$disableBlockFaceCullingInShadowPass(SodiumOptions.PerformanceSettings performanceSettings) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            return false;
        }
        return performanceSettings.useBlockFaceCulling;
    }
}

