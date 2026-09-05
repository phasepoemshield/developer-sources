/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena
 *  net.caffeinemc.mods.sodium.client.gl.arena.GlBufferSegment
 *  net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer
 *  net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 *  net.caffeinemc.mods.sodium.client.util.UInt32
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.data;

import java.util.Arrays;
import java.util.stream.Stream;
import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena;
import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferSegment;
import net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataUnsafe;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;
import net.caffeinemc.mods.sodium.client.util.UInt32;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class SectionRenderDataStorage {
    private final @Nullable GlBufferSegment[] vertexAllocations;
    private final @Nullable GlBufferSegment @Nullable [] elementAllocations;
    private @Nullable GlBufferSegment sharedIndexAllocation;
    private int sharedIndexCapacity = 0;
    private boolean needsSharedIndexUpdate = false;
    private final int[] sharedIndexUsage = new int[256];
    private final long pMeshDataArray;

    public SectionRenderDataStorage(boolean bl) {
        this.vertexAllocations = new GlBufferSegment[256];
        this.elementAllocations = bl ? new GlBufferSegment[256] : null;
        this.pMeshDataArray = SectionRenderDataUnsafe.allocateHeap(256);
    }

    public void delete() {
        SectionRenderDataStorage.deleteAllocations(this.vertexAllocations);
        if (this.elementAllocations != null) {
            SectionRenderDataStorage.deleteAllocations(this.elementAllocations);
        }
        if (this.sharedIndexAllocation != null) {
            this.sharedIndexAllocation.delete();
        }
        SectionRenderDataUnsafe.freeHeap(this.pMeshDataArray);
    }

    public void removeData(int n) {
        this.removeData(n, true, true);
    }

    private void removeData(int n, boolean bl, boolean bl2) {
        GlBufferSegment glBufferSegment;
        if (bl && (glBufferSegment = this.vertexAllocations[n]) != null) {
            glBufferSegment.delete();
            this.vertexAllocations[n] = null;
        }
        if (bl2 && this.storesIndexData()) {
            glBufferSegment = this.elementAllocations[n];
            if (glBufferSegment != null) {
                glBufferSegment.delete();
                this.elementAllocations[n] = null;
            }
            this.setSharedIndexUsage(n, 0);
        }
        long l = this.getDataPointer(n);
        if ((bl2 || !this.storesIndexData()) && bl) {
            SectionRenderDataUnsafe.clearFull(l);
        } else if (bl) {
            SectionRenderDataUnsafe.clearVertexData(l);
        } else if (bl2) {
            SectionRenderDataUnsafe.clearIndexData(l);
        }
    }

    public long getDataPointer(int n) {
        return SectionRenderDataUnsafe.heapPointer(this.pMeshDataArray, n);
    }

    public void setIndexData(int n, GlBufferSegment glBufferSegment) {
        if (this.elementAllocations == null) {
            throw new IllegalStateException("Cannot set index data on a render data storage that does not store indices");
        }
        GlBufferSegment glBufferSegment2 = this.elementAllocations[n];
        if (glBufferSegment2 != null) {
            glBufferSegment2.delete();
        }
        this.elementAllocations[n] = glBufferSegment;
        long l = this.getDataPointer(n);
        SectionRenderDataUnsafe.setLocalBaseElement(l, glBufferSegment.getOffset());
    }

    public void removeIndexData(int n) {
        if (!this.storesIndexData()) {
            throw new IllegalStateException("Cannot remove index data on a render data storage that does not store indices");
        }
        this.removeData(n, false, true);
    }

    private void updateMeshes(int n) {
        GlBufferSegment glBufferSegment = this.vertexAllocations[n];
        if (glBufferSegment == null) {
            return;
        }
        long l = this.getDataPointer(n);
        long l2 = glBufferSegment.getOffset();
        SectionRenderDataUnsafe.setBaseVertex(l, l2);
    }

    private static void deleteAllocations(GlBufferSegment @NonNull [] glBufferSegmentArray) {
        for (GlBufferSegment glBufferSegment : glBufferSegmentArray) {
            if (glBufferSegment == null) continue;
            glBufferSegment.delete();
        }
        Arrays.fill(glBufferSegmentArray, null);
    }

    public void setVertexData(int n, GlBufferSegment glBufferSegment, int[] nArray) {
        GlBufferSegment glBufferSegment2 = this.vertexAllocations[n];
        if (glBufferSegment2 != null) {
            glBufferSegment2.delete();
        }
        this.vertexAllocations[n] = glBufferSegment;
        long l = this.getDataPointer(n);
        int n2 = 0;
        long l2 = 0L;
        for (int i = 0; i < ModelQuadFacing.COUNT; ++i) {
            int n3 = i << 1;
            int n4 = nArray[n3 + 1];
            l2 |= (long)n4 << i * 8;
            long l3 = UInt32.upcast((int)nArray[n3]);
            SectionRenderDataUnsafe.setVertexCount(l, i, l3);
            if (l3 <= 0L) continue;
            n2 |= 1 << n4;
        }
        SectionRenderDataUnsafe.setBaseVertex(l, glBufferSegment.getOffset());
        SectionRenderDataUnsafe.setSliceMask(l, n2);
        SectionRenderDataUnsafe.setFacingList(l, l2);
    }

    private boolean storesIndexData() {
        return this.elementAllocations != null;
    }

    public void onBufferResized() {
        for (int i = 0; i < 256; ++i) {
            this.updateMeshes(i);
        }
    }

    public void removeVertexData(int n) {
        this.removeData(n, true, false);
    }

    public boolean needsSharedIndexUpdate() {
        return this.needsSharedIndexUpdate;
    }

    public boolean updateSharedIndexData(CommandList commandList, GlBufferArena glBufferArena, float f) {
        this.needsSharedIndexUpdate = false;
        int n = 0;
        for (int i = 0; i < 256; ++i) {
            n = Math.max(n, this.sharedIndexUsage[i]);
        }
        if (n == this.sharedIndexCapacity) {
            return false;
        }
        this.sharedIndexCapacity = n;
        if (this.sharedIndexAllocation != null) {
            this.sharedIndexAllocation.delete();
            this.sharedIndexAllocation = null;
        }
        if (this.sharedIndexCapacity == 0) {
            return false;
        }
        if (this.sharedIndexCapacity < 128) {
            this.sharedIndexCapacity += 32;
        }
        NativeBuffer nativeBuffer = SharedQuadIndexBuffer.createIndexBuffer((SharedQuadIndexBuffer.IndexType)SharedQuadIndexBuffer.IndexType.INTEGER, (int)this.sharedIndexCapacity);
        PendingUpload pendingUpload = new PendingUpload(nativeBuffer);
        boolean bl = glBufferArena.upload(commandList, Stream.of(pendingUpload), f);
        this.sharedIndexAllocation = pendingUpload.getResult();
        nativeBuffer.free();
        if (!bl) {
            long l = this.sharedIndexAllocation.getOffset();
            for (int i = 0; i < 256; ++i) {
                if (this.sharedIndexUsage[i] <= 0) continue;
                SectionRenderDataUnsafe.setSharedBaseElement(this.getDataPointer(i), l);
            }
        }
        return bl;
    }

    public boolean setSharedIndexUsage(int n, int n2) {
        int n3 = this.sharedIndexUsage[n];
        if (n3 == n2) {
            return false;
        }
        boolean bl = false;
        if (n2 < n3 && n3 == this.sharedIndexCapacity || n2 > this.sharedIndexCapacity || n2 > 0 && this.sharedIndexAllocation == null) {
            this.needsSharedIndexUpdate = true;
        } else {
            long l = this.sharedIndexAllocation.getOffset();
            long l2 = this.getDataPointer(n);
            SectionRenderDataUnsafe.setSharedBaseElement(l2, l);
            if (n3 == 0 && n2 > 0) {
                bl = true;
            }
        }
        this.sharedIndexUsage[n] = n2;
        return bl;
    }

    public void onIndexBufferResized() {
        long l = 0L;
        if (this.sharedIndexAllocation != null) {
            l = this.sharedIndexAllocation.getOffset();
        }
        for (int i = 0; i < 256; ++i) {
            GlBufferSegment glBufferSegment;
            if (this.sharedIndexUsage[i] > 0) {
                SectionRenderDataUnsafe.setSharedBaseElement(this.getDataPointer(i), l);
                continue;
            }
            if (this.elementAllocations == null || (glBufferSegment = this.elementAllocations[i]) == null) continue;
            SectionRenderDataUnsafe.setLocalBaseElement(this.getDataPointer(i), glBufferSegment.getOffset());
        }
    }
}

