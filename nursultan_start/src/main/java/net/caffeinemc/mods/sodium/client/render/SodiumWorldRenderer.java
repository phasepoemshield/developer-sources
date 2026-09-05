/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  minecraft.class00394
 *  minecraft.class00608
 *  minecraft.class00734
 *  minecraft.class00985
 *  minecraft.class01296
 *  minecraft.class01421
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04507
 *  minecraft.class04643
 *  minecraft.class04755
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class05932
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class08141
 *  minecraft.class08188
 *  minecraft.class08700
 *  minecraft.class08768
 *  minecraft.class08800
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.SortedRenderLists
 *  net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker
 *  net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder
 *  net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 *  net.caffeinemc.mods.sodium.client.world.LevelRendererExtension
 *  net.caffeinemc.mods.sodium.mixin.core.render.world.EntityRendererAccessor
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.joml.Vector4f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.sodium.client.render;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.function.Consumer;
import minecraft.class00394;
import minecraft.class00608;
import minecraft.class00734;
import minecraft.class00985;
import minecraft.class01296;
import minecraft.class01421;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04507;
import minecraft.class04643;
import minecraft.class04755;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05932;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class08141;
import minecraft.class08188;
import minecraft.class08700;
import minecraft.class08768;
import minecraft.class08800;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSectionManager;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SortedRenderLists;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;
import net.caffeinemc.mods.sodium.client.world.LevelRendererExtension;
import net.caffeinemc.mods.sodium.mixin.core.render.world.EntityRendererAccessor;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class SodiumWorldRenderer {
    private final class06202 client;
    private class03448 level;
    private int renderDistance;
    private Vector3d lastCameraPos;
    private double lastCameraPitch;
    private double lastCameraYaw;
    private FogParameters lastFogParameters = FogParameters.NONE;
    private Matrix4f lastProjectionMatrix;
    private boolean useEntityCulling;
    private RenderSectionManager renderSectionManager;
    private static final double MAX_ENTITY_CHECK_VOLUME = 61440.0;
    private float lastSunAngle;

    public void reload() {
        if (this.level == null) {
            return;
        }
        try (CommandList commandList = RenderDevice.INSTANCE.createCommandList();){
            this.initRenderer(commandList);
        }
    }

    public void setLevel(class03448 class034482) {
        if (this.level == class034482) {
            return;
        }
        if (this.level != null) {
            this.unloadLevel();
        }
        if (class034482 != null) {
            this.loadLevel(class034482);
        }
    }

    public SodiumWorldRenderer(class06202 class062022) {
        this.client = class062022;
    }

    public static SodiumWorldRenderer instance() {
        SodiumWorldRenderer sodiumWorldRenderer = SodiumWorldRenderer.instanceNullable();
        if (sodiumWorldRenderer == null) {
            throw new IllegalStateException("No renderer attached to active level");
        }
        return sodiumWorldRenderer;
    }

    private void initRenderer(CommandList commandList) {
        if (this.renderSectionManager != null) {
            this.renderSectionManager.destroy();
            this.renderSectionManager = null;
        }
        SortBehavior sortBehavior = SortBehavior.DYNAMIC_DEFER_NEARBY_ZERO_FRAMES;
        if (PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment() && !SodiumClientMod.options().debug.terrainSortingEnabled) {
            sortBehavior = SortBehavior.OFF;
        }
        this.renderDistance = ((class05630)this.client.i_7).Nh();
        this.renderSectionManager = new RenderSectionManager(this.level, this.renderDistance, sortBehavior, commandList);
        ChunkTracker chunkTracker = ChunkTrackerHolder.get((class03448)this.level);
        ChunkTracker.forEachChunk((LongCollection)chunkTracker.getReadyChunks(), this.renderSectionManager::onChunkAdded);
    }

    public <T extends class07049, S extends class08800> boolean isEntityVisible(class04507<T, S> class045072, T t) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$bjd000$iris$skipEntityCheck(class045072, t, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (!this.useEntityCulling) {
            return true;
        }
        if (this.client.y(t) || t.method_5733()) {
            return true;
        }
        class00734 class007342 = ((EntityRendererAccessor)class045072).sodium$getBoundingBoxForCulling(t);
        double d = (class007342.u - class007342.N) * (class007342.i - class007342.y) * (class007342.R - class007342.L);
        if (d > 61440.0) {
            return true;
        }
        return this.isBoxVisible(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R);
    }

    public void scheduleRebuildForBlockArea(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        this.scheduleRebuildForChunks(n >> 4, n2 >> 4, n3 >> 4, n4 >> 4, n5 >> 4, n6 >> 4, bl);
    }

    public void iterateVisibleBlockEntities(Consumer<class00394> consumer) {
        class00394[] class00394Array;
        SortedRenderLists sortedRenderLists = this.renderSectionManager.getRenderLists();
        for (Object object : sortedRenderLists) {
            RenderRegion object2 = object.getRegion();
            class00394Array = object.sectionsWithEntitiesIterator();
            if (class00394Array == null) continue;
            while (class00394Array.hasNext()) {
                int n = class00394Array.nextByteAsInt();
                RenderSection renderSection = object2.getSection(n);
                class00394 class003942 = renderSection.getCulledBlockEntities();
                if (class003942 == null) continue;
                for (class00394 class003943 : class003942) {
                    consumer.accept(class003943);
                }
            }
        }
        for (RenderSection renderSection : this.renderSectionManager.getSectionsWithGlobalEntities()) {
            class00394Array = renderSection.getGlobalBlockEntities();
            if (class00394Array == null) continue;
            for (class00394 class003944 : class00394Array) {
                consumer.accept(class003944);
            }
        }
    }

    private boolean redirect$bjd000$iris$forceEndGraphRebuild(RenderSectionManager renderSectionManager) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            return false;
        }
        return renderSectionManager.needsUpdate();
    }

    private void handler$bjd000$iris$skipEntityCheck(class04507 class045072, class07049 class070492, CallbackInfoReturnable callbackInfoReturnable) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private void unloadLevel() {
        if (this.renderSectionManager != null) {
            this.renderSectionManager.destroy();
            this.renderSectionManager = null;
        }
        this.level = null;
    }

    private void processChunkEvents() {
        this.renderSectionManager.beforeSectionUpdates();
        ChunkTracker chunkTracker = ChunkTrackerHolder.get((class03448)this.level);
        chunkTracker.forEachEvent(this.renderSectionManager::onChunkAdded, this.renderSectionManager::onChunkRemoved);
    }

    private void extractBlockEntity(class00394 class003942, class01421 class014212, class05363 class053632, float f, Long2ObjectMap<SortedSet<class04755>> long2ObjectMap, class05932 class059322) {
        class08141 class081412;
        class07209 class072092 = class003942.d();
        SortedSet sortedSet = (SortedSet)long2ObjectMap.get(class072092.method_10063());
        if (sortedSet != null && !sortedSet.isEmpty()) {
            class014212.N();
            class014212.N((double)class072092.method_10263() - class053632.y().M, (double)class072092.method_10264() - class053632.y().B, (double)class072092.method_10260() - class053632.y().Z);
            class081412 = new class08141(((class04755)sortedSet.last()).L(), class014212.L());
            class014212.y();
        } else {
            class081412 = null;
        }
        class00985 class009852 = class06202.Nq().K().N(class003942, f, class081412);
        if (class009852 != null) {
            class059322.L.add(class009852);
        }
    }

    public boolean isBoxVisible(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d5 < (double)this.level.method_31607() + 0.5 || d2 > (double)this.level.method_31600() - 0.5) {
            return true;
        }
        int n = class01296.N((double)(d - 0.5));
        int n2 = class01296.N((double)(d2 - 0.5));
        int n3 = class01296.N((double)(d3 - 0.5));
        int n4 = class01296.N((double)(d4 + 0.5));
        int n5 = class01296.N((double)(d5 + 0.5));
        int n6 = class01296.N((double)(d6 + 0.5));
        for (int i = n; i <= n4; ++i) {
            for (int j = n3; j <= n6; ++j) {
                for (int k = n2; k <= n5; ++k) {
                    if (!this.renderSectionManager.isSectionVisible(i, k, j)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public @Nullable String getChunksDebugString() {
        if (this.renderSectionManager == null) {
            return null;
        }
        return String.format("C: %d/%d D: %d", this.renderSectionManager.getVisibleChunkCount(), this.renderSectionManager.getTotalSections(), this.renderDistance);
    }

    public void drawChunkLayer(class08768 class087682, ChunkRenderMatrices chunkRenderMatrices, double d, double d2, double d3, class08188 class081882) {
        if (class087682 == class08768.field_61022) {
            this.renderSectionManager.renderLayer(chunkRenderMatrices, DefaultTerrainRenderPasses.SOLID, d, d2, d3, this.lastFogParameters, class081882);
            this.renderSectionManager.renderLayer(chunkRenderMatrices, DefaultTerrainRenderPasses.CUTOUT, d, d2, d3, this.lastFogParameters, class081882);
        } else if (class087682 == class08768.field_61023) {
            this.renderSectionManager.renderLayer(chunkRenderMatrices, DefaultTerrainRenderPasses.TRANSLUCENT, d, d2, d3, this.lastFogParameters, class081882);
        }
    }

    private void loadLevel(class03448 class034482) {
        this.level = class034482;
        try (CommandList commandList = RenderDevice.INSTANCE.createCommandList();){
            this.initRenderer(commandList);
        }
    }

    public void setupTerrain(class05363 class053632, Viewport viewport, FogParameters fogParameters, boolean bl, boolean bl2, ChunkRenderMatrices chunkRenderMatrices) {
        NativeBuffer.reclaim((boolean)false);
        this.processChunkEvents();
        this.useEntityCulling = SodiumClientMod.options().performance.useEntityCulling;
        if (((class05630)this.client.i_7).Nh() != this.renderDistance) {
            this.reload();
        }
        class04643 class046432 = class08700.N();
        class046432.N("camera_setup");
        class04453 class044532 = (class04453)this.client.T_4;
        if (class044532 == null) {
            throw new IllegalStateException("Client instance has no active player entity");
        }
        class06889 class068892 = class053632.y();
        Vector3d vector3d = new Vector3d(class068892.N(), class068892.y(), class068892.L());
        float f = class053632.i();
        float f2 = class053632.R();
        if (this.lastCameraPos == null) {
            this.lastCameraPos = vector3d;
        }
        if (this.lastProjectionMatrix == null) {
            this.lastProjectionMatrix = new Matrix4f(chunkRenderMatrices.projection());
        }
        boolean bl3 = !vector3d.equals((Object)this.lastCameraPos);
        boolean bl4 = fogParameters.cullDistance() != this.lastFogParameters.cullDistance();
        boolean bl5 = (double)f != this.lastCameraPitch || (double)f2 != this.lastCameraYaw;
        boolean bl6 = !chunkRenderMatrices.projection().equals((Matrix4fc)this.lastProjectionMatrix, 1.0E-4f);
        this.lastProjectionMatrix.set(chunkRenderMatrices.projection());
        this.lastCameraPitch = f;
        this.lastCameraYaw = f2;
        if (bl3 || bl4 || bl5 || bl6) {
            this.renderSectionManager.markGraphDirty();
        }
        this.lastFogParameters = fogParameters;
        this.renderSectionManager.prepareFrame((Vector3dc)vector3d);
        if (bl3) {
            class046432.y("translucent_triggering");
            this.renderSectionManager.processGFNIMovement(new CameraMovement((Vector3dc)this.lastCameraPos, (Vector3dc)vector3d));
            this.lastCameraPos = vector3d;
        }
        int n = bl2 ? this.renderDistance : 1;
        for (int i = 0; i < n; ++i) {
            RenderSectionManager renderSectionManager = this.renderSectionManager;
            if (this.redirect$bjd000$iris$forceChunkGraphRebuildInShadowPass(renderSectionManager)) {
                class046432.y("chunk_render_lists");
                this.renderSectionManager.update(class053632, viewport, fogParameters, bl);
            }
            class046432.y("chunk_update");
            this.renderSectionManager.cleanupAndFlip();
            this.renderSectionManager.updateChunks(bl2);
            class046432.y("chunk_upload");
            this.renderSectionManager.uploadChunks();
            renderSectionManager = this.renderSectionManager;
            if (!this.redirect$bjd000$iris$forceEndGraphRebuild(renderSectionManager)) break;
        }
        class046432.y("chunk_render_lists");
        this.renderSectionManager.finalizeRenderLists(viewport);
        class046432.y("chunk_render_tick");
        this.renderSectionManager.tickVisibleRenders();
        class046432.L();
        class07049.method_5840((double)(class04995.N((double)((double)((class05630)this.client.i_7).Nh() / 8.0), (double)1.0, (double)2.5) * (Double)((class05630)this.client.i_7).M().method_41753()));
    }

    public void updateFogColor(Vector4f vector4f) {
        this.lastFogParameters = new FogParameters(vector4f, this.lastFogParameters);
    }

    public boolean isSectionReady(int n, int n2, int n3) {
        return this.renderSectionManager.isSectionBuilt(n, n2, n3);
    }

    public void scheduleRebuildForChunk(int n, int n2, int n3, boolean bl) {
        this.renderSectionManager.scheduleRebuild(n, n2, n3, bl);
    }

    public void extractBlockEntities(class05363 class053632, float f, Long2ObjectMap<SortedSet<class04755>> long2ObjectMap, class05932 class059322) {
        class00394[] class00394Array;
        class01421 class014212 = new class01421();
        SortedRenderLists sortedRenderLists = this.renderSectionManager.getRenderLists();
        for (Object object : sortedRenderLists) {
            RenderRegion object2 = object.getRegion();
            class00394Array = object.sectionsWithEntitiesIterator();
            if (class00394Array == null) continue;
            while (class00394Array.hasNext()) {
                int n = class00394Array.nextByteAsInt();
                RenderSection renderSection = object2.getSection(n);
                class00394 class003942 = renderSection.getCulledBlockEntities();
                if (class003942 == null) continue;
                for (class00394 class003943 : class003942) {
                    this.extractBlockEntity(class003943, class014212, class053632, f, long2ObjectMap, class059322);
                }
            }
        }
        for (RenderSection renderSection : this.renderSectionManager.getSectionsWithGlobalEntities()) {
            class00394Array = renderSection.getGlobalBlockEntities();
            if (class00394Array == null) continue;
            for (class00394 class003944 : class00394Array) {
                this.extractBlockEntity(class003944, class014212, class053632, f, long2ObjectMap, class059322);
            }
        }
    }

    public int getVisibleChunkCount() {
        return this.renderSectionManager.getVisibleChunkCount();
    }

    public void scheduleRebuildForChunks(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.scheduleRebuildForChunk(i, j, k, bl);
                }
            }
        }
    }

    public boolean isTerrainRenderComplete() {
        return this.renderSectionManager.getBuilder().isBuildQueueEmpty();
    }

    public void scheduleTerrainUpdate() {
        if (this.renderSectionManager != null) {
            this.renderSectionManager.markGraphDirty();
        }
    }

    public static SodiumWorldRenderer instanceNullable() {
        class03063 class030632 = (class03063)class06202.Nq().B_2;
        if (class030632 instanceof LevelRendererExtension) {
            LevelRendererExtension levelRendererExtension = (LevelRendererExtension)class030632;
            return levelRendererExtension.sodium$getWorldRenderer();
        }
        return null;
    }

    public Collection<String> getDebugStrings(boolean bl) {
        return this.renderSectionManager == null ? Collections.emptyList() : this.renderSectionManager.getDebugStrings(bl);
    }

    private boolean redirect$bjd000$iris$forceChunkGraphRebuildInShadowPass(RenderSectionManager renderSectionManager) {
        float f;
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered() && this.lastSunAngle != (f = ((Float)((class03386)class06202.Nq().i_5).s().U().N(class00608.W, CapturedRenderingState.INSTANCE.getTickDelta())).floatValue())) {
            this.lastSunAngle = f;
            return true;
        }
        return renderSectionManager.needsUpdate();
    }
}

