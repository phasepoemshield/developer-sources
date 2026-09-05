/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class01296
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo
 *  net.caffeinemc.mods.sodium.client.render.chunk.occlusion.GraphDirectionSet
 *  net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import minecraft.class00394;
import minecraft.class01296;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.render.chunk.LocalSectionIndex;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.GraphDirectionSet;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class RenderSection {
    private final RenderRegion region;
    private final int sectionIndex;
    private final int chunkX;
    private final int chunkY;
    private final int chunkZ;
    private long visibilityData = 0L;
    private int incomingDirections;
    private int lastVisibleFrame = -1;
    private int adjacentMask;
    public RenderSection adjacentDown;
    public RenderSection adjacentUp;
    public RenderSection adjacentNorth;
    public RenderSection adjacentSouth;
    public RenderSection adjacentWest;
    public RenderSection adjacentEast;
    private boolean built = false;
    private int flags = 0;
    private class00394 @Nullable [] globalBlockEntities;
    private class00394 @Nullable [] culledBlockEntities;
    private class08388 @Nullable [] animatedSprites;
    private @Nullable TranslucentData translucentData;
    private @Nullable ChunkJob runningJob = null;
    private long lastMeshResultSize = MeshResultSize.NO_DATA;
    private int pendingUpdateType;
    private long pendingUpdateSince;
    private int lastUploadFrame = -1;
    private int lastSubmittedFrame = -1;
    private boolean disposed;
    private int fadeTime;
    private int lastVisibleFrameShadow;

    public int getFlags() {
        return this.flags;
    }

    public RenderSection(RenderRegion renderRegion, int n, int n2, int n3) {
        this.chunkX = n;
        this.chunkY = n2;
        this.chunkZ = n3;
        int n4 = this.getChunkX() & 7;
        int n5 = this.getChunkY() & 3;
        int n6 = this.getChunkZ() & 7;
        this.sectionIndex = LocalSectionIndex.pack(n4, n5, n6);
        this.region = renderRegion;
    }

    public String toString() {
        return String.format("RenderSection at chunk (%d, %d, %d) from (%d, %d, %d) to (%d, %d, %d)", this.chunkX, this.chunkY, this.chunkZ, this.getOriginX(), this.getOriginY(), this.getOriginZ(), this.getOriginX() + 15, this.getOriginY() + 15, this.getOriginZ() + 15);
    }

    public void delete() {
        if (this.runningJob != null) {
            this.runningJob.setCancelled();
            this.runningJob = null;
        }
        this.clearRenderState();
        this.disposed = true;
    }

    public RenderRegion getRegion() {
        return this.region;
    }

    public class01296 getPosition() {
        return class01296.N((int)this.chunkX, (int)this.chunkY, (int)this.chunkZ);
    }

    public @Nullable ChunkJob getRunningJob() {
        return this.runningJob;
    }

    private boolean setRenderState(@NonNull BuiltSectionInfo builtSectionInfo) {
        boolean bl = this.built;
        int n = this.flags;
        long l = this.visibilityData;
        this.built = true;
        this.flags = builtSectionInfo.flags;
        this.visibilityData = builtSectionInfo.visibilityData;
        this.globalBlockEntities = builtSectionInfo.globalBlockEntities;
        this.culledBlockEntities = builtSectionInfo.culledBlockEntities;
        this.animatedSprites = builtSectionInfo.animatedSprites;
        return !bl || n != this.flags || l != this.visibilityData;
    }

    public void setFadeTime(int n) {
        this.fadeTime = n;
    }

    public int getSectionIndex() {
        return this.sectionIndex;
    }

    public void setRunningJob(@Nullable ChunkJob chunkJob) {
        this.runningJob = chunkJob;
    }

    public float getSquaredDistance(float f, float f2, float f3) {
        float f4 = f - (float)this.getCenterX();
        float f5 = f2 - (float)this.getCenterY();
        float f6 = f3 - (float)this.getCenterZ();
        return f4 * f4 + f5 * f5 + f6 * f6;
    }

    public float getSquaredDistance(class07209 class072092) {
        return this.getSquaredDistance((float)class072092.method_10263() + 0.5f, (float)class072092.method_10264() + 0.5f, (float)class072092.method_10260() + 0.5f);
    }

    public void setPendingUpdate(int n, long l) {
        this.pendingUpdateType = n;
        this.pendingUpdateSince = l;
    }

    public int getPendingUpdate() {
        return this.pendingUpdateType;
    }

    public int getAdjacentMask() {
        return this.adjacentMask;
    }

    public void clearPendingUpdate() {
        this.pendingUpdateType = 0;
    }

    public void setAdjacentNode(int n, RenderSection renderSection) {
        this.adjacentMask = renderSection == null ? (this.adjacentMask &= ~GraphDirectionSet.of((int)n)) : (this.adjacentMask |= GraphDirectionSet.of((int)n));
        switch (n) {
            case 0: {
                this.adjacentDown = renderSection;
                break;
            }
            case 1: {
                this.adjacentUp = renderSection;
                break;
            }
            case 2: {
                this.adjacentNorth = renderSection;
                break;
            }
            case 3: {
                this.adjacentSouth = renderSection;
                break;
            }
            case 4: {
                this.adjacentWest = renderSection;
                break;
            }
            case 5: {
                this.adjacentEast = renderSection;
                break;
            }
        }
    }

    public int getLastUploadFrame() {
        return this.lastUploadFrame;
    }

    public TranslucentData getTranslucentData() {
        return this.translucentData;
    }

    public RenderSection getAdjacent(int n) {
        return switch (n) {
            case 0 -> this.adjacentDown;
            case 1 -> this.adjacentUp;
            case 2 -> this.adjacentNorth;
            case 3 -> this.adjacentSouth;
            case 4 -> this.adjacentWest;
            case 5 -> this.adjacentEast;
            default -> null;
        };
    }

    public void prepareTrigger(boolean bl) {
        if (this.translucentData != null) {
            this.translucentData.prepareTrigger(bl);
        }
    }

    public void setTranslucentData(TranslucentData translucentData) {
        if (translucentData == null) {
            throw new IllegalArgumentException("new translucentData cannot be null");
        }
        this.translucentData = translucentData;
    }

    private boolean clearRenderState() {
        boolean bl = this.built;
        this.built = false;
        this.flags = 0;
        this.visibilityData = 0L;
        this.globalBlockEntities = null;
        this.culledBlockEntities = null;
        this.animatedSprites = null;
        return bl;
    }

    public void setLastUploadFrame(int n) {
        this.lastUploadFrame = n;
    }

    public long getVisibilityData() {
        return this.visibilityData;
    }

    public class08388 @Nullable [] getAnimatedSprites() {
        return this.animatedSprites;
    }

    public int getLastSubmittedFrame() {
        return this.lastSubmittedFrame;
    }

    public void addIncomingDirections(int n) {
        this.incomingDirections |= n;
    }

    public long getPendingUpdateSince() {
        return this.pendingUpdateSince;
    }

    public void setLastMeshResultSize(long l) {
        this.lastMeshResultSize = l;
    }

    public long getLastMeshResultSize() {
        return this.lastMeshResultSize;
    }

    public int getLastVisibleFrame() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$beh000$iris$getLastVisibleFrameShadow(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.lastVisibleFrame;
    }

    public class00394 @Nullable [] getCulledBlockEntities() {
        return this.culledBlockEntities;
    }

    public int getIncomingDirections() {
        return this.incomingDirections;
    }

    public class00394 @Nullable [] getGlobalBlockEntities() {
        return this.globalBlockEntities;
    }

    public void setLastVisibleFrame(int n) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$beh000$iris$setLastVisibleFrameShadow(n, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.lastVisibleFrame = n;
    }

    public void setLastSubmittedFrame(int n) {
        this.lastSubmittedFrame = n;
    }

    public void setIncomingDirections(int n) {
        this.incomingDirections = n;
    }

    public float getCurrentVisibility() {
        int n = Math.toIntExact(System.currentTimeMillis() - this.region.getCreationTime());
        int n2 = n - this.fadeTime;
        float f = n2;
        return Math.clamp((float)(f / (float)((Double)((class05630)class06202.Nq().i_7).b().method_41753() * 1000.0)), (float)0.0f, (float)1.0f);
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public int getChunkZ() {
        return this.chunkZ;
    }

    public int getOriginY() {
        return this.chunkY << 4;
    }

    public int getOriginZ() {
        return this.chunkZ << 4;
    }

    public int getChunkY() {
        return this.chunkY;
    }

    public int getOriginX() {
        return this.chunkX << 4;
    }

    public int getChunkX() {
        return this.chunkX;
    }

    public boolean setInfo(@Nullable BuiltSectionInfo builtSectionInfo) {
        if (builtSectionInfo != null) {
            return this.setRenderState(builtSectionInfo);
        }
        return this.clearRenderState();
    }

    public int getCenterZ() {
        return this.getOriginZ() + 8;
    }

    public boolean isBuilt() {
        return this.built;
    }

    private void handler$beh000$iris$getLastVisibleFrameShadow(CallbackInfoReturnable callbackInfoReturnable) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            callbackInfoReturnable.setReturnValue((Object)this.lastVisibleFrameShadow);
        }
    }

    private void handler$beh000$iris$setLastVisibleFrameShadow(int n, CallbackInfo callbackInfo) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            callbackInfo.cancel();
            this.lastVisibleFrameShadow = n;
        }
    }

    public int getCenterY() {
        return this.getOriginY() + 8;
    }

    public int getCenterX() {
        return this.getOriginX() + 8;
    }
}

