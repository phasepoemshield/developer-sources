/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceMap
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceMaps
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSets
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class01296
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08188
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.gui.SodiumOptions$PerformanceSettings
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataPoint
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobDurationEstimator
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobEffort
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.LimitedResourceBudget
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize$SectionCategory
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshTaskSizeEstimator
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UnlimitedResourceBudget
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadDuration
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadDurationEstimator
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadResourceBudget
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobResult
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderMeshingTask
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderSortingTask
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderTask
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.OcclusionSectionCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.RenderSectionVisitor
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.SectionCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.SortedRenderLists
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.TreeSectionCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.occlusion.GraphDirection
 *  net.caffeinemc.mods.sodium.client.render.chunk.occlusion.OcclusionCuller
 *  net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion
 *  net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior$PriorityMode
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.NoData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering
 *  net.caffeinemc.mods.sodium.client.render.chunk.tree.RemovableMultiForest
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.caffeinemc.mods.sodium.client.render.util.RenderAsserts
 *  net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext
 *  net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSectionCache
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixinterface.ShadowRenderRegion
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  org.apache.commons.lang3.ArrayUtils
 *  org.joml.Vector3dc
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class01296;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08188;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkUpdateTypes;
import net.caffeinemc.mods.sodium.client.render.chunk.DefaultChunkRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSectionFlags;
import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkSortOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobDurationEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobEffort;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.LimitedResourceBudget;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshTaskSizeEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UnlimitedResourceBudget;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadDuration;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadDurationEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadResourceBudget;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobResult;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderMeshingTask;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderSortingTask;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderTask;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.OcclusionSectionCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.RenderSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SectionCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SortedRenderLists;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.TreeSectionCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.GraphDirection;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.OcclusionCuller;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.NoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.CameraMovement;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.SortTriggering;
import net.caffeinemc.mods.sodium.client.render.chunk.tree.RemovableMultiForest;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.caffeinemc.mods.sodium.client.render.util.RenderAsserts;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext;
import net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSectionCache;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.ShadowRenderRegion;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import org.apache.commons.lang3.ArrayUtils;
import org.joml.Vector3dc;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class RenderSectionManager {
    private static final float NEARBY_REBUILD_DISTANCE = class04995.z((float)16.0f);
    private static final float IMMEDIATE_PRESENT_DISTANCE = class04995.z((float)64.0f);
    private static final float NEARBY_SORT_DISTANCE = class04995.z((float)25.0f);
    private static final float FRAME_DURATION_UPLOAD_FRACTION = 0.1f;
    private static final long MIN_UPLOAD_DURATION_BUDGET = 2000000L;
    private final ChunkBuilder builder;
    private final RenderRegionManager regions;
    private final ClonedChunkSectionCache sectionCache;
    private final Long2ReferenceMap<RenderSection> sectionByPosition;
    private final ConcurrentLinkedDeque<ChunkJobResult<? extends BuilderTaskOutput>> buildResults;
    private final JobDurationEstimator jobDurationEstimator;
    private final MeshTaskSizeEstimator meshTaskSizeEstimator;
    private final UploadDurationEstimator jobUploadDurationEstimator;
    private ChunkJobCollector lastBlockingCollector;
    private int thisFrameBlockingTasks;
    private int nextFrameBlockingTasks;
    private int deferredTasks;
    private final ChunkRenderer chunkRenderer;
    private final class03448 level;
    private final ReferenceSet<RenderSection> sectionsWithGlobalEntities;
    private final OcclusionCuller occlusionCuller;
    private final int renderDistance;
    private final SortBehavior sortBehavior;
    private final SortTriggering sortTriggering;
    private @NonNull SortedRenderLists renderLists;
    private SectionCollector sectionCollector;
    private SectionCollector lastSectionCollector;
    private @NonNull Map<TaskQueueType, ArrayDeque<RenderSection>> taskLists;
    private int frame;
    private long lastFrameDuration = -1L;
    private long averageFrameDuration = -1L;
    private long lastFrameAtTime;
    private static final float FRAME_DURATION_UPDATE_RATIO = 0.05f;
    private boolean needsGraphUpdate = true;
    private int lastUpdatedFrame;
    private @Nullable Vector3dc cameraPosition;
    private final RemovableMultiForest renderableSectionTree;
    private SortedRenderLists shadowRenderLists = SortedRenderLists.empty();
    private Map shadowTaskLists = new EnumMap(TaskQueueType.class);
    private int lastUpdatedFrameShadow;
    private boolean shadowNeedsRenderListUpdate = true;
    private boolean renderListStateIsShadow = false;

    private float getRenderDistance() {
        return (float)this.renderDistance * 16.0f;
    }

    public RenderSectionManager(class03448 class034482, int n, SortBehavior sortBehavior, CommandList commandList) {
        this.sectionByPosition = new Long2ReferenceOpenHashMap();
        this.buildResults = new ConcurrentLinkedDeque();
        this.jobDurationEstimator = new JobDurationEstimator();
        this.jobUploadDurationEstimator = new UploadDurationEstimator();
        this.sectionsWithGlobalEntities = new ReferenceOpenHashSet();
        this.lastFrameAtTime = System.nanoTime();
        this.meshTaskSizeEstimator = new MeshTaskSizeEstimator(class034482);
        ChunkVertexType chunkVertexType = ChunkMeshFormats.COMPACT;
        this.chunkRenderer = new DefaultChunkRenderer(RenderDevice.INSTANCE, this.modify$bip000$iris$useExtendedVertexFormat$1(chunkVertexType));
        this.level = class034482;
        chunkVertexType = ChunkMeshFormats.COMPACT;
        this.builder = new ChunkBuilder(class034482, this.modify$bip000$iris$useExtendedVertexFormat$2(chunkVertexType));
        this.renderDistance = n;
        this.sortBehavior = sortBehavior;
        this.sortTriggering = this.sortBehavior != SortBehavior.OFF ? new SortTriggering() : null;
        this.regions = new RenderRegionManager(commandList);
        this.sectionCache = new ClonedChunkSectionCache((class07299)this.level);
        this.renderLists = SortedRenderLists.empty();
        this.occlusionCuller = new OcclusionCuller(Long2ReferenceMaps.unmodifiable(this.sectionByPosition), (class07299)this.level);
        this.renderableSectionTree = new RemovableMultiForest((float)n);
        this.taskLists = new EnumMap<TaskQueueType, ArrayDeque<RenderSection>>(TaskQueueType.class);
        for (TaskQueueType taskQueueType : TaskQueueType.values()) {
            this.taskLists.put(taskQueueType, new ArrayDeque());
        }
        this.handler$bja000$iris$create(class034482, n, sortBehavior, commandList, null);
    }

    public void update(class05363 class053632, Viewport viewport, FogParameters fogParameters, boolean bl) {
        ++this.lastUpdatedFrame;
        this.needsGraphUpdate = this.createTerrainRenderList(class053632, viewport, fogParameters, this.lastUpdatedFrame, bl);
    }

    public void destroy() {
        this.builder.shutdown();
        for (BuilderTaskOutput object : this.collectChunkBuildResults()) {
            object.destroy();
        }
        for (RenderSection renderSection : this.sectionByPosition.values()) {
            renderSection.delete();
        }
        this.sectionsWithGlobalEntities.clear();
        this.resetRenderLists();
        try (ObjectIterator objectIterator = RenderDevice.INSTANCE.createCommandList();){
            this.regions.delete((CommandList)objectIterator);
            this.chunkRenderer.delete((CommandList)objectIterator);
        }
    }

    private boolean redirect$bja000$iris$setOutOfGraph(RenderSectionManager renderSectionManager, class01296 class012962) {
        return ShadowRenderingState.areShadowsCurrentlyBeingRendered() || this.isOutOfGraph(class012962);
    }

    public Collection<RenderSection> getSectionsWithGlobalEntities() {
        return ReferenceSets.unmodifiable(this.sectionsWithGlobalEntities);
    }

    private boolean redirect$bip000$iris$disableFogOcclusion(SodiumOptions.PerformanceSettings performanceSettings) {
        if (Iris.getCurrentPack().isPresent()) {
            return false;
        }
        return performanceSettings.useFogOcclusion;
    }

    private void handler$bja000$iris$onSectionRemoved(int n, int n2, int n3, CallbackInfo callbackInfo) {
        this.shadowNeedsRenderListUpdate = true;
    }

    private Map redirect$bja000$iris$useShadowTaskList3(RenderSectionManager renderSectionManager) {
        return ShadowRenderingState.areShadowsCurrentlyBeingRendered() ? this.shadowTaskLists : this.taskLists;
    }

    private SortedRenderLists redirect$bja000$iris$useShadowRenderList2(RenderSectionManager renderSectionManager) {
        return ShadowRenderingState.areShadowsCurrentlyBeingRendered() ? this.shadowRenderLists : this.renderLists;
    }

    private boolean isSectionImmediatePresentationCandidate(RenderSection renderSection) {
        if (this.cameraPosition == null) {
            return false;
        }
        float f = renderSection.getSquaredDistance((float)this.cameraPosition.x(), (float)this.cameraPosition.y(), (float)this.cameraPosition.z());
        if (f < NEARBY_REBUILD_DISTANCE) {
            return true;
        }
        return f < IMMEDIATE_PRESENT_DISTANCE && (this.sectionVisible(renderSection) || this.sectionVisible(renderSection.adjacentDown) || this.sectionVisible(renderSection.adjacentUp) || this.sectionVisible(renderSection.adjacentNorth) || this.sectionVisible(renderSection.adjacentSouth) || this.sectionVisible(renderSection.adjacentWest) || this.sectionVisible(renderSection.adjacentEast));
    }

    private void redirect$bja000$iris$useShadowRenderList3(RenderSectionManager renderSectionManager, SortedRenderLists sortedRenderLists) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            this.shadowRenderLists = sortedRenderLists;
        } else {
            this.renderLists = sortedRenderLists;
        }
    }

    private void redirect$bja000$iris$useShadowTaskrList(RenderSectionManager renderSectionManager, Map map) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            this.shadowTaskLists = map;
        } else {
            this.taskLists = map;
        }
    }

    private void redirect$bja000$iris$useShadowRenderList(RenderSectionManager renderSectionManager, SortedRenderLists sortedRenderLists) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            this.shadowRenderLists = sortedRenderLists;
        } else {
            this.renderLists = sortedRenderLists;
        }
    }

    private void handler$bja000$iris$notifyChangedCamera(CallbackInfoReturnable callbackInfoReturnable) {
        this.shadowNeedsRenderListUpdate = true;
    }

    private void handler$bja000$iris$updateSectionInfo(RenderSection renderSection, BuiltSectionInfo builtSectionInfo, CallbackInfoReturnable callbackInfoReturnable) {
        this.shadowNeedsRenderListUpdate = true;
    }

    public void tickVisibleRenders() {
        for (ChunkRenderList chunkRenderList : this.renderLists) {
            RenderRegion renderRegion = chunkRenderList.getRegion();
            ByteIterator byteIterator = chunkRenderList.sectionsWithSpritesIterator();
            if (byteIterator == null) continue;
            while (byteIterator.hasNext()) {
                class08388[] class08388Array;
                RenderSection renderSection = renderRegion.getSection(byteIterator.nextByteAsInt());
                if (renderSection == null || (class08388Array = renderSection.getAnimatedSprites()) == null) continue;
                for (class08388 class083882 : class08388Array) {
                    SpriteUtil.INSTANCE.markSpriteActive(class083882);
                }
            }
        }
    }

    public void onChunkRemoved(int n, int n2) {
        for (int i = this.level.method_32891(); i <= this.level.method_31597(); ++i) {
            this.onSectionRemoved(n, i, n2);
        }
    }

    public void cleanupAndFlip() {
        this.sectionCache.cleanup();
        this.regions.update();
    }

    public void onChunkAdded(int n, int n2) {
        for (int i = this.level.method_32891(); i <= this.level.method_31597(); ++i) {
            this.onSectionAdded(n, i, n2);
        }
    }

    public void markGraphDirty() {
        this.needsGraphUpdate = true;
    }

    public void prepareFrame(Vector3dc vector3dc) {
        long l = System.nanoTime();
        this.lastFrameDuration = l - this.lastFrameAtTime;
        this.lastFrameAtTime = l;
        this.averageFrameDuration = this.averageFrameDuration == -1L ? this.lastFrameDuration : MathUtil.exponentialMovingAverage((long)this.averageFrameDuration, (long)this.lastFrameDuration, (float)0.05f);
        this.averageFrameDuration = class04995.N((long)this.averageFrameDuration, (long)1000100L, (long)100000000L);
        ++this.frame;
        this.cameraPosition = vector3dc;
    }

    public void updateChunks(boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$bja000$iris$doNotUpdateDuringShadow(bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.thisFrameBlockingTasks = 0;
        this.nextFrameBlockingTasks = 0;
        this.deferredTasks = 0;
        ChunkJobCollector chunkJobCollector = this.lastBlockingCollector;
        this.lastBlockingCollector = null;
        if (chunkJobCollector == null) {
            chunkJobCollector = new ChunkJobCollector(this.buildResults::add);
        }
        if (bl) {
            this.submitSectionTasks(chunkJobCollector, chunkJobCollector, chunkJobCollector, (UploadResourceBudget)UnlimitedResourceBudget.INSTANCE);
            this.thisFrameBlockingTasks = chunkJobCollector.getSubmittedTaskCount();
            chunkJobCollector.awaitCompletion(this.builder);
        } else {
            long l = this.builder.getTotalRemainingDuration(this.averageFrameDuration);
            LimitedResourceBudget limitedResourceBudget = new LimitedResourceBudget(Math.max((long)((float)this.averageFrameDuration * 0.1f), 2000000L), this.regions.getStagingBuffer().getUploadSizeLimit(this.averageFrameDuration));
            ChunkJobCollector chunkJobCollector2 = new ChunkJobCollector(this.buildResults::add);
            ChunkJobCollector chunkJobCollector3 = new ChunkJobCollector(l, this.buildResults::add);
            this.submitSectionTasks(chunkJobCollector, chunkJobCollector2, chunkJobCollector3, (UploadResourceBudget)limitedResourceBudget);
            this.thisFrameBlockingTasks = chunkJobCollector.getSubmittedTaskCount();
            this.nextFrameBlockingTasks = chunkJobCollector2.getSubmittedTaskCount();
            this.deferredTasks = chunkJobCollector3.getSubmittedTaskCount();
            chunkJobCollector.awaitCompletion(this.builder);
            this.lastBlockingCollector = chunkJobCollector2;
        }
    }

    public void uploadChunks() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$bja000$iris$doNotUploadDuringShadow(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        ArrayList<BuilderTaskOutput> arrayList = this.collectChunkBuildResults();
        if (arrayList.isEmpty()) {
            return;
        }
        this.needsGraphUpdate |= this.processChunkBuildResults(arrayList);
        for (BuilderTaskOutput builderTaskOutput : arrayList) {
            builderTaskOutput.destroy();
        }
    }

    public @NonNull SortedRenderLists getRenderLists() {
        return this.redirect$bja000$iris$useShadowRenderList2(this);
    }

    public int getTotalSections() {
        return this.sectionByPosition.size();
    }

    public boolean isSectionVisible(int n, int n2, int n3) {
        RenderSection renderSection = this.getRenderSection(n, n2, n3);
        if (renderSection == null) {
            return false;
        }
        return renderSection.getLastVisibleFrame() == this.lastUpdatedFrame;
    }

    public void scheduleRebuild(int n, int n2, int n3, boolean bl) {
        RenderAsserts.validateCurrentThread();
        this.sectionCache.invalidate(n, n2, n3);
        RenderSection renderSection = (RenderSection)this.sectionByPosition.get(class01296.y((int)n, (int)n2, (int)n3));
        if (renderSection != null && renderSection.isBuilt()) {
            int n4 = bl && this.shouldPrioritizeTask(renderSection, NEARBY_REBUILD_DISTANCE) ? ChunkUpdateTypes.join(2, 4) : 2;
            this.upgradePendingUpdate(renderSection, n4);
        }
    }

    public boolean isSectionBuilt(int n, int n2, int n3) {
        RenderSection renderSection = this.getRenderSection(n, n2, n3);
        return renderSection != null && renderSection.isBuilt();
    }

    private boolean updateSectionInfo(RenderSection renderSection, BuiltSectionInfo builtSectionInfo) {
        this.handler$bja000$iris$updateSectionInfo(renderSection, builtSectionInfo, null);
        if (builtSectionInfo == null || !RenderSectionFlags.needsRender(builtSectionInfo.flags)) {
            this.renderableSectionTree.remove(renderSection);
        } else {
            this.renderableSectionTree.add(renderSection);
        }
        boolean bl = renderSection.setInfo(builtSectionInfo);
        if (builtSectionInfo == null || ArrayUtils.isEmpty((Object[])builtSectionInfo.globalBlockEntities)) {
            return this.sectionsWithGlobalEntities.remove((Object)renderSection) || bl;
        }
        return this.sectionsWithGlobalEntities.add((Object)renderSection) || bl;
    }

    private void resetRenderLists() {
        SortedRenderLists sortedRenderLists = SortedRenderLists.empty();
        this.redirect$bja000$iris$useShadowRenderList3(this, sortedRenderLists);
        for (ArrayDeque arrayDeque : this.redirect$bja000$iris$useShadowTaskList3(this).values()) {
            arrayDeque.clear();
        }
    }

    private RenderSection getRenderSection(int n, int n2, int n3) {
        return (RenderSection)this.sectionByPosition.get(class01296.y((int)n, (int)n2, (int)n3));
    }

    private boolean sectionVisible(RenderSection renderSection) {
        return renderSection == null || renderSection.getLastVisibleFrame() == this.lastUpdatedFrame;
    }

    private boolean isOutOfGraph(class01296 class012962) {
        int n = class012962.method_10264();
        return this.level.method_32891() <= n && n <= this.level.method_31597() && !this.sectionByPosition.containsKey(class012962.W());
    }

    private float getSearchDistance(FogParameters fogParameters) {
        float f = this.redirect$bip000$iris$disableFogOcclusion(SodiumClientMod.options().performance) ? this.getEffectiveRenderDistance(fogParameters) : this.getRenderDistance();
        return f;
    }

    public void onSectionAdded(int n, int n2, int n3) {
        long l = class01296.y((int)n, (int)n2, (int)n3);
        if (this.sectionByPosition.containsKey(l)) {
            return;
        }
        RenderRegion renderRegion = this.regions.createForChunk(n, n2, n3);
        RenderSection renderSection = new RenderSection(renderRegion, n, n2, n3);
        renderRegion.addSection(renderSection);
        this.sectionByPosition.put(l, (Object)renderSection);
        class00570 class005702 = this.level.method_8497(n, n3);
        class00554 class005542 = class005702.u()[this.level.method_31603(n2)];
        if (class005542.L()) {
            this.updateSectionInfo(renderSection, BuiltSectionInfo.EMPTY);
        } else {
            this.renderableSectionTree.add(renderSection);
            renderSection.setPendingUpdate(8, this.lastFrameAtTime);
        }
        this.connectNeighborNodes(renderSection);
        this.markGraphDirty();
    }

    public void scheduleSort(long l, boolean bl) {
        RenderSection renderSection = (RenderSection)this.sectionByPosition.get(l);
        if (renderSection != null) {
            int n = 1;
            SortBehavior.PriorityMode priorityMode = this.sortBehavior.getPriorityMode();
            if (priorityMode == SortBehavior.PriorityMode.NEARBY && this.shouldPrioritizeTask(renderSection, NEARBY_SORT_DISTANCE) || priorityMode == SortBehavior.PriorityMode.ALL) {
                n = ChunkUpdateTypes.join(n, 4);
            }
            if (this.upgradePendingUpdate(renderSection, n)) {
                renderSection.prepareTrigger(bl);
            }
        }
    }

    public void onSectionRemoved(int n, int n2, int n3) {
        RenderRegion renderRegion;
        this.handler$bja000$iris$onSectionRemoved(n, n2, n3, null);
        long l = class01296.y((int)n, (int)n2, (int)n3);
        RenderSection renderSection = (RenderSection)this.sectionByPosition.remove(l);
        if (renderSection == null) {
            return;
        }
        this.renderableSectionTree.remove(n, n2, n3);
        if (renderSection.getTranslucentData() != null) {
            this.sortTriggering.removeSection(renderSection.getTranslucentData(), l);
        }
        if ((renderRegion = renderSection.getRegion()) != null) {
            renderRegion.removeSection(renderSection);
        }
        this.disconnectNeighborNodes(renderSection);
        this.updateSectionInfo(renderSection, null);
        renderSection.delete();
        this.markGraphDirty();
    }

    private void submitSectionTasks(ChunkJobCollector chunkJobCollector, UploadResourceBudget uploadResourceBudget, TaskQueueType taskQueueType) {
        RenderSection renderSection;
        ArrayDeque arrayDeque = (ArrayDeque)this.redirect$bja000$iris$useShadowTaskList3(this).get((Object)taskQueueType);
        while (!arrayDeque.isEmpty() && chunkJobCollector.hasBudgetRemaining() && (uploadResourceBudget.isAvailable() || taskQueueType.allowsUnlimitedUploadDuration()) && (renderSection = (RenderSection)arrayDeque.poll()) != null) {
            int n = renderSection.getPendingUpdate();
            if (n == 0) continue;
            this.submitSectionTask(chunkJobCollector, renderSection, n, uploadResourceBudget, taskQueueType == TaskQueueType.ZERO_FRAME_DEFER);
        }
    }

    private void submitSectionTasks(ChunkJobCollector chunkJobCollector, ChunkJobCollector chunkJobCollector2, ChunkJobCollector chunkJobCollector3, UploadResourceBudget uploadResourceBudget) {
        this.submitSectionTasks(chunkJobCollector, uploadResourceBudget, TaskQueueType.ZERO_FRAME_DEFER);
        this.submitSectionTasks(chunkJobCollector2, uploadResourceBudget, TaskQueueType.ONE_FRAME_DEFER);
        this.submitSectionTasks(chunkJobCollector3, uploadResourceBudget, TaskQueueType.ALWAYS_DEFER);
        this.submitSectionTasks(chunkJobCollector3, uploadResourceBudget, TaskQueueType.INITIAL_BUILD);
    }

    private void submitSectionTask(ChunkJobCollector chunkJobCollector, @NonNull RenderSection renderSection, int n, UploadResourceBudget uploadResourceBudget, boolean bl) {
        NoData noData;
        ChunkBuilderMeshingTask chunkBuilderMeshingTask;
        if (renderSection.isDisposed()) {
            return;
        }
        if (ChunkUpdateTypes.isInitialBuild(n) || ChunkUpdateTypes.isRebuild(n)) {
            chunkBuilderMeshingTask = this.createRebuildTask(renderSection, this.frame);
            if (chunkBuilderMeshingTask == null) {
                noData = null;
                if (this.sortBehavior != SortBehavior.OFF) {
                    noData = NoData.forEmptySection((class01296)renderSection.getPosition());
                }
                ChunkJobResult chunkJobResult = ChunkJobResult.successfully((Object)new ChunkBuildOutput(renderSection, this.frame, (TranslucentData)noData, BuiltSectionInfo.EMPTY, Collections.emptyMap()));
                this.buildResults.add((ChunkJobResult<? extends BuilderTaskOutput>)chunkJobResult);
                renderSection.setRunningJob(null);
            }
        } else {
            chunkBuilderMeshingTask = this.createSortTask(renderSection, this.frame);
            if (chunkBuilderMeshingTask == null) {
                renderSection.clearPendingUpdate();
                return;
            }
        }
        if (chunkBuilderMeshingTask != null) {
            noData = this.builder.scheduleTask((ChunkBuilderTask)chunkBuilderMeshingTask, ChunkUpdateTypes.isImportant(n), arg_0 -> ((ChunkJobCollector)chunkJobCollector).onJobFinished(arg_0), bl);
            chunkJobCollector.addSubmittedJob((ChunkJob)noData);
            uploadResourceBudget.consume(noData.getEstimatedUploadDuration(), noData.getEstimatedSize());
            renderSection.setRunningJob((ChunkJob)noData);
        }
        renderSection.setLastSubmittedFrame(this.frame);
        renderSection.clearPendingUpdate();
    }

    public ChunkBuilderSortingTask createSortTask(RenderSection renderSection, int n) {
        ChunkBuilderSortingTask chunkBuilderSortingTask = ChunkBuilderSortingTask.createTask((RenderSection)renderSection, (int)n, (Vector3dc)this.cameraPosition);
        if (chunkBuilderSortingTask != null) {
            chunkBuilderSortingTask.calculateEstimations(this.jobDurationEstimator, this.meshTaskSizeEstimator, this.jobUploadDurationEstimator);
        }
        return chunkBuilderSortingTask;
    }

    public @Nullable ChunkBuilderMeshingTask createRebuildTask(RenderSection renderSection, int n) {
        ChunkRenderContext chunkRenderContext = LevelSlice.prepare((class07299)this.level, (class01296)renderSection.getPosition(), (ClonedChunkSectionCache)this.sectionCache);
        if (chunkRenderContext == null) {
            return null;
        }
        ChunkBuilderMeshingTask chunkBuilderMeshingTask = new ChunkBuilderMeshingTask(renderSection, n, this.cameraPosition, chunkRenderContext, this.sortBehavior, ChunkUpdateTypes.isRebuildWithSort(renderSection.getPendingUpdate()));
        chunkBuilderMeshingTask.calculateEstimations(this.jobDurationEstimator, this.meshTaskSizeEstimator, this.jobUploadDurationEstimator);
        return chunkBuilderMeshingTask;
    }

    public void beforeSectionUpdates() {
        this.renderableSectionTree.ensureCapacity(this.getRenderDistance());
    }

    public void processGFNIMovement(CameraMovement cameraMovement) {
        if (this.sortTriggering != null) {
            this.sortTriggering.triggerSections(this::scheduleSort, cameraMovement);
        }
    }

    public void finalizeRenderLists(Viewport viewport) {
        if (this.sectionCollector != null) {
            SortedRenderLists sortedRenderLists = this.sectionCollector.createRenderLists(viewport);
            this.redirect$bja000$iris$useShadowRenderList(this, sortedRenderLists);
            this.lastSectionCollector = this.sectionCollector;
            this.sectionCollector = null;
        }
    }

    private boolean shouldPrioritizeTask(RenderSection renderSection, float f) {
        return this.cameraPosition != null && renderSection.getSquaredDistance((float)this.cameraPosition.x(), (float)this.cameraPosition.y(), (float)this.cameraPosition.z()) < f;
    }

    private void disconnectNeighborNodes(RenderSection renderSection) {
        for (int i = 0; i < 6; ++i) {
            RenderSection renderSection2 = renderSection.getAdjacent(i);
            if (renderSection2 == null) continue;
            renderSection2.setAdjacentNode(GraphDirection.opposite((int)i), null);
            renderSection.setAdjacentNode(i, null);
        }
    }

    private boolean createTerrainRenderList(class05363 class053632, Viewport viewport, FogParameters fogParameters, int n, boolean bl) {
        return this.wrapMethod$bja000$iris$updateShadowRenderLists(class053632, viewport, fogParameters, n, bl, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_4184, net.caffeinemc.mods.sodium.client.render.viewport.Viewport, net.caffeinemc.mods.sodium.client.util.FogParameters, int, boolean]");
            Object[] objectArray2 = objectArray;
            return this.createTerrainRenderList$mixinextras$wrapped$68((class05363)objectArray[0], (Viewport)objectArray2[1], (FogParameters)objectArray2[2], (Integer)objectArray2[3], (Boolean)objectArray2[4]);
        });
    }

    private boolean shouldUseOcclusionCulling(class05363 class053632, boolean bl) {
        class07209 class072092 = class053632.u();
        boolean bl2 = bl && this.level.method_8320(class072092).t() ? false : (Boolean)class06202.Nq().U_2;
        return bl2;
    }

    private void connectNeighborNodes(RenderSection renderSection) {
        for (int i = 0; i < 6; ++i) {
            RenderSection renderSection2 = this.getRenderSection(renderSection.getChunkX() + GraphDirection.x((int)i), renderSection.getChunkY() + GraphDirection.y((int)i), renderSection.getChunkZ() + GraphDirection.z((int)i));
            if (renderSection2 == null) continue;
            renderSection2.setAdjacentNode(GraphDirection.opposite((int)i), renderSection);
            renderSection.setAdjacentNode(i, renderSection2);
        }
    }

    private float getEffectiveRenderDistance(FogParameters fogParameters) {
        float f = fogParameters.alpha();
        float f2 = this.getRenderDistance();
        if (!class04995.y((float)f, (float)1.0f)) {
            return f2;
        }
        return Math.min(f2, fogParameters.cullDistance() + 0.5f);
    }

    private boolean upgradePendingUpdate(RenderSection renderSection, int n) {
        if (n == 0) {
            return false;
        }
        int n2 = renderSection.getPendingUpdate();
        int n3 = ChunkUpdateTypes.join(n2, n);
        if (n3 == n2) {
            return false;
        }
        renderSection.setPendingUpdate(n3, this.lastFrameAtTime);
        this.markGraphDirty();
        return true;
    }

    private ArrayList<BuilderTaskOutput> collectChunkBuildResults() {
        ChunkJobResult<? extends BuilderTaskOutput> chunkJobResult;
        ArrayList<BuilderTaskOutput> arrayList = new ArrayList<BuilderTaskOutput>();
        while ((chunkJobResult = this.buildResults.poll()) != null) {
            arrayList.add((BuilderTaskOutput)chunkJobResult.unwrap());
            JobEffort jobEffort = chunkJobResult.getJobEffort();
            if (jobEffort == null) continue;
            this.jobDurationEstimator.addData((Estimator.DataPoint)jobEffort);
        }
        this.jobDurationEstimator.updateModels();
        return arrayList;
    }

    private boolean processChunkBuildResults(ArrayList<BuilderTaskOutput> arrayList) {
        List<BuilderTaskOutput> list = RenderSectionManager.filterChunkBuildResults(arrayList);
        long l = System.nanoTime();
        this.regions.uploadResults(RenderDevice.INSTANCE.createCommandList(), list);
        long l2 = System.nanoTime() - l;
        boolean bl = false;
        long l3 = 0L;
        for (BuilderTaskOutput builderTaskOutput : list) {
            TranslucentData translucentData;
            ChunkSortOutput chunkSortOutput;
            long l4 = builderTaskOutput.getResultSize();
            ChunkJob chunkJob = builderTaskOutput.render.getRunningJob();
            TranslucentData translucentData2 = builderTaskOutput.render.getTranslucentData();
            if (builderTaskOutput instanceof ChunkBuildOutput) {
                int n;
                ChunkBuildOutput chunkBuildOutput = (ChunkBuildOutput)builderTaskOutput;
                int n2 = builderTaskOutput.render.getFlags();
                bl |= this.updateSectionInfo(builderTaskOutput.render, chunkBuildOutput.info);
                if (chunkJob != null && (chunkJob.isBlocking() || this.isSectionImmediatePresentationCandidate(builderTaskOutput.render)) && (n = RenderSectionFlags.getNewRenderFlags(n2, chunkBuildOutput.info.flags)) != 0) {
                    if (this.sectionCollector == null) {
                        this.sectionCollector = this.lastSectionCollector;
                    }
                    this.sectionCollector.visitWithFlags(builderTaskOutput.render, n);
                }
                builderTaskOutput.render.setLastMeshResultSize(l4);
                this.meshTaskSizeEstimator.addData((Estimator.DataPoint)this.meshTaskSizeEstimator.resultForSection(builderTaskOutput.render, l4));
                if (chunkBuildOutput.translucentData != null) {
                    this.sortTriggering.integrateTranslucentData(translucentData2, chunkBuildOutput.translucentData, this.cameraPosition, this::scheduleSort);
                    builderTaskOutput.render.setTranslucentData(chunkBuildOutput.translucentData);
                }
            } else if (builderTaskOutput instanceof ChunkSortOutput && (chunkSortOutput = (ChunkSortOutput)builderTaskOutput).getDynamicSorter() != null && (translucentData = builderTaskOutput.render.getTranslucentData()) instanceof DynamicTopoData) {
                DynamicTopoData dynamicTopoData = (DynamicTopoData)translucentData;
                this.sortTriggering.applyTriggerChanges(dynamicTopoData, chunkSortOutput.getDynamicSorter(), builderTaskOutput.render.getPosition(), this.cameraPosition);
            }
            if (chunkJob != null && builderTaskOutput.submitTime >= builderTaskOutput.render.getLastSubmittedFrame()) {
                builderTaskOutput.render.setRunningJob(null);
            }
            builderTaskOutput.render.setLastUploadFrame(builderTaskOutput.submitTime);
            l3 += l4;
        }
        this.meshTaskSizeEstimator.updateModels();
        if (!list.isEmpty()) {
            this.jobUploadDurationEstimator.addData((Estimator.DataPoint)new UploadDuration(l2 / (long)list.size(), l3 / (long)list.size()));
            this.jobUploadDurationEstimator.updateModels();
        }
        return bl;
    }

    private void handler$bja000$iris$create(class03448 class034482, int n, SortBehavior sortBehavior, CommandList commandList, CallbackInfo callbackInfo) {
        for (int i = 0; i < TaskQueueType.values().length; ++i) {
            TaskQueueType taskQueueType = TaskQueueType.values()[i];
            this.shadowTaskLists.put(taskQueueType, new ArrayDeque());
        }
    }

    private static List<BuilderTaskOutput> filterChunkBuildResults(ArrayList<BuilderTaskOutput> arrayList) {
        Reference2ReferenceLinkedOpenHashMap reference2ReferenceLinkedOpenHashMap = new Reference2ReferenceLinkedOpenHashMap();
        for (BuilderTaskOutput builderTaskOutput : arrayList) {
            RenderSection renderSection;
            BuilderTaskOutput builderTaskOutput2;
            if (builderTaskOutput.render.isDisposed() || builderTaskOutput.render.getLastUploadFrame() > builderTaskOutput.submitTime || (builderTaskOutput2 = (BuilderTaskOutput)reference2ReferenceLinkedOpenHashMap.get((Object)(renderSection = builderTaskOutput.render))) != null && builderTaskOutput2.submitTime >= builderTaskOutput.submitTime) continue;
            reference2ReferenceLinkedOpenHashMap.put((Object)renderSection, (Object)builderTaskOutput);
        }
        return new ArrayList<BuilderTaskOutput>((Collection<BuilderTaskOutput>)reference2ReferenceLinkedOpenHashMap.values());
    }

    public int getVisibleChunkCount() {
        int n = 0;
        for (ChunkRenderList chunkRenderList : this.redirect$bja000$iris$useShadowRenderList2(this)) {
            n += chunkRenderList.getSectionsWithGeometryCount();
        }
        return n;
    }

    public boolean needsUpdate() {
        this.handler$bja000$iris$notifyChangedCamera(null);
        return this.needsGraphUpdate;
    }

    public ChunkBuilder getBuilder() {
        return this.builder;
    }

    public void renderLayer(ChunkRenderMatrices chunkRenderMatrices, TerrainRenderPass terrainRenderPass, double d, double d2, double d3, FogParameters fogParameters, class08188 class081882) {
        RenderDevice renderDevice = RenderDevice.INSTANCE;
        CommandList commandList = renderDevice.createCommandList();
        this.chunkRenderer.render(chunkRenderMatrices, commandList, (ChunkRenderListIterable)this.redirect$bja000$iris$useShadowRenderList2(this), terrainRenderPass, new CameraTransform(d, d2, d3), fogParameters, this.sortBehavior != SortBehavior.OFF, class081882);
        commandList.flush();
    }

    public Collection<String> getDebugStrings(boolean bl) {
        GlBufferArena glBufferArena;
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = 0;
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        for (Object object2 : this.regions.getLoadedRegions()) {
            object = object2.getResources();
            if (object == null) continue;
            glBufferArena = object.getGeometryArena();
            l += glBufferArena.getDeviceUsedMemory();
            l2 += glBufferArena.getDeviceAllocatedMemory();
            MeshResultSize.SectionCategory[] sectionCategoryArray = object.getIndexArena();
            l3 += sectionCategoryArray.getDeviceUsedMemory();
            l4 += sectionCategoryArray.getDeviceAllocatedMemory();
            ++n;
        }
        if (bl) {
            arrayList.add(String.format("Pools: Geometry %d/%d MiB, Index %d/%d MiB (%d buffers)", MathUtil.toMib((long)l), MathUtil.toMib((long)l2), MathUtil.toMib((long)l3), MathUtil.toMib((long)l4), n));
            arrayList.add(String.format("Transfer Queue: %s", this.regions.getStagingBuffer().toString()));
        } else {
            arrayList.add(String.format("G:%d/%d I:%d/%d MiB TQ: %s #%d", MathUtil.toMib((long)l), MathUtil.toMib((long)l2), MathUtil.toMib((long)l3), MathUtil.toMib((long)l4), this.regions.getStagingBuffer().toString(), n));
        }
        if (bl) {
            arrayList.add(String.format("Chunk Builder: Schd=%02d | Busy=%02d (%04d%%) | Total=%02d", this.builder.getScheduledJobCount(), this.builder.getBusyThreadCount(), (int)(this.builder.getBusyFraction(this.lastFrameDuration) * 100.0f), this.builder.getTotalThreadCount()));
        } else {
            arrayList.add(String.format("B: S%02d/B%02d/T%02d", this.builder.getScheduledJobCount(), this.builder.getBusyThreadCount(), this.builder.getTotalThreadCount()));
        }
        if (bl) {
            arrayList.add(String.format("Tasks: N0=%03d | N1=%03d | Def=%03d, Recv=%03d", this.thisFrameBlockingTasks, this.nextFrameBlockingTasks, this.deferredTasks, this.buildResults.size()));
        }
        if (bl && PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment()) {
            Object object2;
            String string = this.jobDurationEstimator.toString(ChunkBuilderMeshingTask.class);
            object2 = this.jobDurationEstimator.toString(ChunkBuilderSortingTask.class);
            object = this.jobUploadDurationEstimator.toString(null);
            arrayList.add(String.format("Duration: Mesh %s, Sort %s, Upload %s", string, object2, object));
            glBufferArena = new ReferenceArrayList();
            for (MeshResultSize.SectionCategory sectionCategory : MeshResultSize.SectionCategory.values()) {
                glBufferArena.add((Object)String.format("%s=%s", sectionCategory, this.meshTaskSizeEstimator.toString((Object)sectionCategory)));
            }
            arrayList.add(String.format("Size: %s", String.join((CharSequence)", ", (Iterable<? extends CharSequence>)glBufferArena)));
        }
        if (this.sortBehavior != SortBehavior.OFF) {
            this.sortTriggering.addDebugStrings(arrayList, this.sortBehavior, bl);
        } else {
            arrayList.add("TS OFF");
        }
        return arrayList;
    }

    private void handler$bja000$iris$doNotUpdateDuringShadow(boolean bl, CallbackInfo callbackInfo) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            callbackInfo.cancel();
        }
    }

    private ChunkVertexType modify$bip000$iris$useExtendedVertexFormat$1(ChunkVertexType chunkVertexType) {
        return WorldRenderingSettings.INSTANCE.getVertexFormat();
    }

    private void handler$bja000$iris$doNotUploadDuringShadow(CallbackInfo callbackInfo) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            callbackInfo.cancel();
        }
    }

    private boolean wrapMethod$bja000$iris$updateShadowRenderLists(class05363 class053632, Viewport viewport, FogParameters fogParameters, int n, boolean bl, Operation operation) {
        if (!ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            if (this.renderListStateIsShadow) {
                for (RenderRegion renderRegion : this.regions.getLoadedRegions()) {
                    ((ShadowRenderRegion)renderRegion).swapToRegularRenderList();
                }
                this.renderListStateIsShadow = false;
            }
        } else if (this.shadowNeedsRenderListUpdate && !this.renderListStateIsShadow) {
            for (RenderRegion renderRegion : this.regions.getLoadedRegions()) {
                ((ShadowRenderRegion)renderRegion).swapToShadowRenderList();
            }
            this.renderListStateIsShadow = true;
        }
        return (Boolean)operation.call(new Object[]{class053632, viewport, fogParameters, n, bl});
    }

    private ChunkVertexType modify$bip000$iris$useExtendedVertexFormat$2(ChunkVertexType chunkVertexType) {
        return WorldRenderingSettings.INSTANCE.getVertexFormat();
    }

    private boolean createTerrainRenderList$mixinextras$wrapped$68(class05363 class053632, Viewport viewport, FogParameters fogParameters, int n, boolean bl) {
        this.resetRenderLists();
        float f = this.getSearchDistance(fogParameters);
        boolean bl2 = this.shouldUseOcclusionCulling(class053632, bl);
        TaskQueueType taskQueueType = SodiumClientMod.options().performance.chunkBuildDeferMode.getImportantRebuildQueueType();
        TaskQueueType taskQueueType2 = this.sortBehavior.getDeferMode().getImportantRebuildQueueType();
        class01296 class012962 = viewport.getChunkCoord();
        RenderSectionManager renderSectionManager = this;
        if (this.redirect$bja000$iris$setOutOfGraph(renderSectionManager, class012962)) {
            TreeSectionCollector treeSectionCollector = new TreeSectionCollector(n, taskQueueType, taskQueueType2, this.sectionByPosition);
            this.renderableSectionTree.prepareForTraversal();
            this.renderableSectionTree.traverse((CoordinateSectionVisitor)treeSectionCollector, viewport, f);
            this.sectionCollector = treeSectionCollector;
        } else {
            OcclusionSectionCollector occlusionSectionCollector = new OcclusionSectionCollector(n, taskQueueType, taskQueueType2);
            this.occlusionCuller.findVisible((RenderSectionVisitor)occlusionSectionCollector, viewport, f, bl2, n);
            this.sectionCollector = occlusionSectionCollector;
        }
        this.lastSectionCollector = null;
        Map map = this.sectionCollector.getTaskLists();
        this.redirect$bja000$iris$useShadowTaskrList(this, map);
        return this.sectionCollector.needsRevisitForPendingUpdates();
    }
}

