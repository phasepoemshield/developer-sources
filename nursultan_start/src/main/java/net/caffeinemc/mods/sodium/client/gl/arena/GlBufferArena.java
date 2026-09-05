/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 */
package net.caffeinemc.mods.sodium.client.gl.arena;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferSegment;
import net.caffeinemc.mods.sodium.client.gl.arena.PendingBufferCopyCommand;
import net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;

public class GlBufferArena {
    static final boolean CHECK_ASSERTIONS = false;
    public static final int MIN_SEGMENTS_FOR_AVG = 16;
    public static final float FEW_SEGMENTS_GROWTH_FACTOR = 1.5f;
    public static final float EXPECTED_SIZE_TARGET_FACTOR = 1.5f;
    public static final float MAX_BUFFER_REUSE_SIZE_FACTOR = 1.4f;
    private static final GlBufferUsage BUFFER_USAGE = GlBufferUsage.STATIC_DRAW;
    private final StagingBuffer stagingBuffer;
    private GlMutableBuffer arenaBuffer;
    private GlBufferSegment head;
    private long capacity;
    private long used;
    private int segmentCount;
    private final int stride;
    private static final GlMutableBuffer[] freeBuffers = new GlMutableBuffer[8];
    private static int freeBufferCount = 0;

    public GlBufferArena(CommandList commandList, int n, int n2, StagingBuffer stagingBuffer) {
        this.capacity = n;
        this.stride = n2;
        this.head = new GlBufferSegment(this, 0L, this.capacity);
        this.head.setFree(true);
        this.arenaBuffer = GlBufferArena.getBufferOfSizeAtLeast(commandList, this.capacity * (long)n2);
        this.capacity = this.arenaBuffer.getSize() / (long)n2;
        this.stagingBuffer = stagingBuffer;
    }

    public boolean isEmpty() {
        return this.used <= 0L;
    }

    public void delete(CommandList commandList) {
        commandList.deleteBuffer((GlBuffer)this.arenaBuffer);
    }

    private void resize(CommandList commandList, long l) {
        if (this.used > l) {
            throw new UnsupportedOperationException("New capacity must be larger than used size");
        }
        this.checkAssertions();
        long l2 = l - this.used;
        ArrayList<GlBufferSegment> arrayList = this.getUsedSegments();
        List<PendingBufferCopyCommand> list = this.buildTransferList(arrayList, l2);
        this.transferSegments(commandList, list, l);
        this.head = new GlBufferSegment(this, 0L, l2);
        this.head.setFree(true);
        if (arrayList.isEmpty()) {
            this.head.setNext(null);
        } else {
            this.head.setNext((GlBufferSegment)arrayList.getFirst());
            this.head.getNext().setPrev(this.head);
        }
        this.checkAssertions();
    }

    public void free(GlBufferSegment glBufferSegment) {
        GlBufferSegment glBufferSegment2;
        if (glBufferSegment.isFree()) {
            throw new IllegalStateException("Already freed");
        }
        glBufferSegment.setFree(true);
        this.updateUsed(-glBufferSegment.getLength());
        GlBufferSegment glBufferSegment3 = glBufferSegment.getNext();
        if (glBufferSegment3 != null && glBufferSegment3.isFree()) {
            glBufferSegment.mergeInto(glBufferSegment3);
        }
        if ((glBufferSegment2 = glBufferSegment.getPrev()) != null && glBufferSegment2.isFree()) {
            glBufferSegment2.mergeInto(glBufferSegment);
        }
        this.checkAssertions();
    }

    private GlBufferSegment alloc(int n) {
        GlBufferSegment glBufferSegment;
        GlBufferSegment glBufferSegment2 = this.findFree(n);
        if (glBufferSegment2 == null) {
            return null;
        }
        if (glBufferSegment2.getLength() == (long)n) {
            glBufferSegment2.setFree(false);
            glBufferSegment = glBufferSegment2;
        } else {
            GlBufferSegment glBufferSegment3 = new GlBufferSegment(this, glBufferSegment2.getEnd() - (long)n, n);
            glBufferSegment3.setNext(glBufferSegment2.getNext());
            glBufferSegment3.setPrev(glBufferSegment2);
            if (glBufferSegment3.getNext() != null) {
                glBufferSegment3.getNext().setPrev(glBufferSegment3);
            }
            glBufferSegment2.setLength(glBufferSegment2.getLength() - (long)n);
            glBufferSegment2.setNext(glBufferSegment3);
            glBufferSegment = glBufferSegment3;
        }
        this.updateUsed(glBufferSegment.getLength());
        this.checkAssertions();
        return glBufferSegment;
    }

    private long estimateNewCapacity(float f, List<PendingUpload> list) {
        long l;
        long l2 = this.getRequiredTotalSize(list);
        int n = this.segmentCount + list.size();
        if (n >= 16) {
            long l3 = l2 / (long)n + 1L;
            float f2 = (float)n * f;
            l = (long)((float)l3 * f2 * 1.5f);
        } else {
            l = (long)((float)l2 * 1.5f);
        }
        return l + 3L & 0xFFFFFFFFFFFFFFFCL;
    }

    private static void releaseBufferForReuse(CommandList commandList, GlMutableBuffer glMutableBuffer) {
        int n;
        if (freeBufferCount < freeBuffers.length) {
            for (n = 0; n < freeBuffers.length; ++n) {
                if (freeBuffers[n] != null) continue;
                GlBufferArena.freeBuffers[n] = glMutableBuffer;
                ++freeBufferCount;
                return;
            }
        }
        n = (int)(Math.random() * (double)freeBuffers.length);
        commandList.deleteBuffer((GlBuffer)freeBuffers[n]);
        GlBufferArena.freeBuffers[n] = glMutableBuffer;
    }

    public long getDeviceUsedMemory() {
        return this.used * (long)this.stride;
    }

    private static GlMutableBuffer getBufferOfSizeAtLeast(CommandList commandList, long l) {
        GlMutableBuffer glMutableBuffer = null;
        if (freeBufferCount > 0) {
            long l2 = (long)((float)l * 1.4f);
            int n = -1;
            for (int i = 0; i < freeBuffers.length; ++i) {
                long l3;
                GlMutableBuffer glMutableBuffer2 = freeBuffers[i];
                if (glMutableBuffer2 == null || (l3 = glMutableBuffer2.getSize()) < l || l3 > l2 || glMutableBuffer != null && l3 >= glMutableBuffer.getSize()) continue;
                n = i;
                glMutableBuffer = glMutableBuffer2;
            }
            if (glMutableBuffer != null) {
                GlBufferArena.freeBuffers[n] = null;
                --freeBufferCount;
            }
        }
        if (glMutableBuffer == null) {
            glMutableBuffer = commandList.createMutableBuffer();
            commandList.allocateStorage(glMutableBuffer, l, BUFFER_USAGE);
        }
        return glMutableBuffer;
    }

    private long getRequiredTotalSize(List<PendingUpload> list) {
        long l = 0L;
        for (PendingUpload pendingUpload : list) {
            l += (long)pendingUpload.getDataBuffer().getLength();
        }
        long l2 = l / (long)this.stride;
        return l2 + this.used;
    }

    public long getDeviceAllocatedMemory() {
        return this.capacity * (long)this.stride;
    }

    private GlBufferSegment findFree(int n) {
        GlBufferSegment glBufferSegment = null;
        for (GlBufferSegment glBufferSegment2 = this.head; glBufferSegment2 != null; glBufferSegment2 = glBufferSegment2.getNext()) {
            if (!glBufferSegment2.isFree()) continue;
            if (glBufferSegment2.getLength() == (long)n) {
                return glBufferSegment2;
            }
            if (glBufferSegment2.getLength() < (long)n || glBufferSegment != null && glBufferSegment.getLength() <= glBufferSegment2.getLength()) continue;
            glBufferSegment = glBufferSegment2;
        }
        return glBufferSegment;
    }

    private void updateUsed(long l) {
        this.used += l;
        this.segmentCount += Long.signum(l);
    }

    private void tryUploads(CommandList commandList, List<PendingUpload> list) {
        list.removeIf(pendingUpload -> this.tryUpload(commandList, (PendingUpload)pendingUpload));
        this.stagingBuffer.flush(commandList);
    }

    private boolean tryUpload(CommandList commandList, PendingUpload pendingUpload) {
        ByteBuffer byteBuffer = pendingUpload.getDataBuffer().getDirectBuffer();
        int n = byteBuffer.remaining() / this.stride;
        GlBufferSegment glBufferSegment = this.alloc(n);
        if (glBufferSegment == null) {
            return false;
        }
        this.stagingBuffer.enqueueCopy(commandList, byteBuffer, (GlBuffer)this.arenaBuffer, glBufferSegment.getOffset() * (long)this.stride);
        pendingUpload.setResult(glBufferSegment);
        return true;
    }

    public boolean upload(CommandList commandList, Stream<PendingUpload> stream, float f) {
        GlMutableBuffer glMutableBuffer = this.arenaBuffer;
        long l = 0L;
        LinkedList<PendingUpload> linkedList = new LinkedList<PendingUpload>();
        for (PendingUpload pendingUpload : stream::iterator) {
            l += (long)pendingUpload.getDataBuffer().getLength();
            linkedList.add(pendingUpload);
        }
        if (l < (this.capacity - this.used) * (long)this.stride) {
            this.tryUploads(commandList, linkedList);
        }
        if (!linkedList.isEmpty()) {
            this.resize(commandList, this.estimateNewCapacity(f, linkedList));
            this.tryUploads(commandList, linkedList);
            if (!linkedList.isEmpty()) {
                throw new RuntimeException("Failed to upload all buffers");
            }
        }
        return this.arenaBuffer != glMutableBuffer;
    }

    private void checkAssertions0() {
        GlBufferSegment glBufferSegment = this.head;
        long l = 0L;
        while (glBufferSegment != null) {
            GlBufferSegment glBufferSegment2;
            GlBufferSegment glBufferSegment3;
            if (glBufferSegment.getOffset() < 0L) {
                throw new IllegalStateException("segment.start < 0: out of bounds");
            }
            if (glBufferSegment.getEnd() > this.capacity) {
                throw new IllegalStateException("segment.end > arena.capacity: out of bounds");
            }
            if (!glBufferSegment.isFree()) {
                l += glBufferSegment.getLength();
            }
            if ((glBufferSegment3 = glBufferSegment.getNext()) != null) {
                if (glBufferSegment3.getOffset() < glBufferSegment.getEnd()) {
                    throw new IllegalStateException("segment.next.start < segment.end: overlapping segments (corrupted)");
                }
                if (glBufferSegment3.getOffset() > glBufferSegment.getEnd()) {
                    throw new IllegalStateException("segment.next.start > segment.end: not truly connected (sparsity error)");
                }
                if (glBufferSegment3.isFree() && glBufferSegment3.getNext() != null && glBufferSegment3.getNext().isFree()) {
                    throw new IllegalStateException("segment.free && segment.next.free: not merged consecutive segments");
                }
            }
            if ((glBufferSegment2 = glBufferSegment.getPrev()) != null) {
                if (glBufferSegment2.getEnd() > glBufferSegment.getOffset()) {
                    throw new IllegalStateException("segment.prev.end > segment.start: overlapping segments (corrupted)");
                }
                if (glBufferSegment2.getEnd() < glBufferSegment.getOffset()) {
                    throw new IllegalStateException("segment.prev.end < segment.start: not truly connected (sparsity error)");
                }
                if (glBufferSegment2.isFree() && glBufferSegment2.getPrev() != null && glBufferSegment2.getPrev().isFree()) {
                    throw new IllegalStateException("segment.free && segment.prev.free: not merged consecutive segments");
                }
            }
            glBufferSegment = glBufferSegment3;
        }
        if (this.used < 0L) {
            throw new IllegalStateException("arena.used < 0: failure to track");
        }
        if (this.used > this.capacity) {
            throw new IllegalStateException("arena.used > arena.capacity: failure to track");
        }
        if (this.used != l) {
            throw new IllegalStateException("arena.used is invalid");
        }
    }

    public GlBuffer getBufferObject() {
        return this.arenaBuffer;
    }

    private void checkAssertions() {
    }

    private List<PendingBufferCopyCommand> buildTransferList(List<GlBufferSegment> list, long l) {
        ArrayList<PendingBufferCopyCommand> arrayList = new ArrayList<PendingBufferCopyCommand>();
        PendingBufferCopyCommand pendingBufferCopyCommand = null;
        long l2 = l;
        for (int i = 0; i < list.size(); ++i) {
            GlBufferSegment glBufferSegment = list.get(i);
            if (pendingBufferCopyCommand == null || pendingBufferCopyCommand.getReadOffset() + pendingBufferCopyCommand.getLength() != glBufferSegment.getOffset()) {
                if (pendingBufferCopyCommand != null) {
                    arrayList.add(pendingBufferCopyCommand);
                }
                pendingBufferCopyCommand = new PendingBufferCopyCommand(glBufferSegment.getOffset(), l2, glBufferSegment.getLength());
            } else {
                pendingBufferCopyCommand.setLength(pendingBufferCopyCommand.getLength() + glBufferSegment.getLength());
            }
            glBufferSegment.setOffset(l2);
            if (i + 1 < list.size()) {
                glBufferSegment.setNext(list.get(i + 1));
            } else {
                glBufferSegment.setNext(null);
            }
            if (i - 1 < 0) {
                glBufferSegment.setPrev(null);
            } else {
                glBufferSegment.setPrev(list.get(i - 1));
            }
            l2 += glBufferSegment.getLength();
        }
        if (pendingBufferCopyCommand != null) {
            arrayList.add(pendingBufferCopyCommand);
        }
        return arrayList;
    }

    private void transferSegments(CommandList commandList, Collection<PendingBufferCopyCommand> collection, long l) {
        long l2 = l * (long)this.stride;
        if (l2 >= 0x100000000L) {
            throw new IllegalArgumentException("Maximum arena buffer size is 4 GiB");
        }
        GlMutableBuffer glMutableBuffer = this.arenaBuffer;
        GlMutableBuffer glMutableBuffer2 = GlBufferArena.getBufferOfSizeAtLeast(commandList, l2);
        for (PendingBufferCopyCommand pendingBufferCopyCommand : collection) {
            commandList.copyBufferSubData((GlBuffer)glMutableBuffer, (GlBuffer)glMutableBuffer2, pendingBufferCopyCommand.getReadOffset() * (long)this.stride, pendingBufferCopyCommand.getWriteOffset() * (long)this.stride, pendingBufferCopyCommand.getLength() * (long)this.stride);
        }
        GlBufferArena.releaseBufferForReuse(commandList, glMutableBuffer);
        this.arenaBuffer = glMutableBuffer2;
        this.capacity = this.arenaBuffer.getSize() / (long)this.stride;
    }

    private ArrayList<GlBufferSegment> getUsedSegments() {
        ArrayList<GlBufferSegment> arrayList = new ArrayList<GlBufferSegment>();
        GlBufferSegment glBufferSegment = this.head;
        while (glBufferSegment != null) {
            GlBufferSegment glBufferSegment2 = glBufferSegment.getNext();
            if (!glBufferSegment.isFree()) {
                arrayList.add(glBufferSegment);
            }
            glBufferSegment = glBufferSegment2;
        }
        return arrayList;
    }
}

