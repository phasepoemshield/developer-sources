/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.util;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer$BufferReference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class NativeBuffer {
    private static final Logger LOGGER = LogManager.getLogger(NativeBuffer.class);
    private static final ReferenceQueue<NativeBuffer> RECLAIM_QUEUE = new ReferenceQueue();
    private static final Reference2ReferenceMap<Reference<NativeBuffer>, NativeBuffer$BufferReference> ACTIVE_BUFFERS = Reference2ReferenceMaps.synchronize((Reference2ReferenceMap)new Reference2ReferenceOpenHashMap());
    private static long ALLOCATED = 0L;
    private final NativeBuffer$BufferReference ref;
    private static final int MAX_ALLOCATION_ATTEMPTS = 3;

    public NativeBuffer(int n) {
        this.ref = NativeBuffer.allocate(n);
        ACTIVE_BUFFERS.put(new PhantomReference<NativeBuffer>(this, RECLAIM_QUEUE), (Object)this.ref);
    }

    private static StackTraceElement[] getStackTrace() {
        return SodiumClientMod.options().advanced.enableMemoryTracing ? Thread.currentThread().getStackTrace() : null;
    }

    public int getLength() {
        return this.ref.length;
    }

    public static NativeBuffer copy(ByteBuffer byteBuffer) {
        NativeBuffer nativeBuffer = new NativeBuffer(byteBuffer.remaining());
        MemoryUtil.memCopy((ByteBuffer)byteBuffer, (ByteBuffer)nativeBuffer.getDirectBuffer());
        return nativeBuffer;
    }

    private static NativeBuffer$BufferReference allocate(int n) {
        long l = 0L;
        int n2 = 0;
        while (++n2 <= 3 && (l = MemoryUtil.nmemAlloc((long)n)) == 0L) {
            LOGGER.error("EMERGENCY: Tried to allocate {} bytes but the allocator reports failure", (Object)n);
            LOGGER.error("EMERGENCY: ... Attempting to force a garbage collection cycle (attempt {}/{})", (Object)n2, (Object)3);
            NativeBuffer.reclaim(true);
        }
        if (l == 0L) {
            throw new OutOfMemoryError("Couldn't allocate %s bytes after %s attempts".formatted(new Object[]{n, n2}));
        }
        StackTraceElement[] stackTraceElementArray = NativeBuffer.getStackTrace();
        NativeBuffer$BufferReference nativeBuffer$BufferReference = new NativeBuffer$BufferReference(l, n, stackTraceElementArray);
        ALLOCATED += (long)nativeBuffer$BufferReference.length;
        return nativeBuffer$BufferReference;
    }

    public void free() {
        NativeBuffer.deallocate(this.ref);
    }

    public static void reclaim(boolean bl) {
        Reference<NativeBuffer> reference;
        if (bl) {
            System.gc();
        }
        while ((reference = RECLAIM_QUEUE.poll()) != null) {
            NativeBuffer$BufferReference nativeBuffer$BufferReference = (NativeBuffer$BufferReference)ACTIVE_BUFFERS.remove(reference);
            if (nativeBuffer$BufferReference.freed) continue;
            NativeBuffer.deallocate(nativeBuffer$BufferReference);
            if (nativeBuffer$BufferReference.allocationSite != null) {
                LOGGER.warn("Reclaimed {} bytes at address {} that were leaked from allocation site:\n{}", (Object)nativeBuffer$BufferReference.length, (Object)nativeBuffer$BufferReference.address, (Object)Arrays.stream(nativeBuffer$BufferReference.allocationSite).map(StackTraceElement::toString).collect(Collectors.joining("\n")));
                continue;
            }
            LOGGER.warn("Reclaimed {} bytes at address {} that were leaked from an unknown location (logging is disabled)", (Object)nativeBuffer$BufferReference.length, (Object)nativeBuffer$BufferReference.address);
        }
    }

    public static long getTotalAllocated() {
        return ALLOCATED;
    }

    private static void deallocate(NativeBuffer$BufferReference nativeBuffer$BufferReference) {
        nativeBuffer$BufferReference.checkFreed();
        nativeBuffer$BufferReference.freed = true;
        MemoryUtil.nmemFree((long)nativeBuffer$BufferReference.address);
        ALLOCATED -= (long)nativeBuffer$BufferReference.length;
    }

    public ByteBuffer getDirectBuffer() {
        this.ref.checkFreed();
        return MemoryUtil.memByteBuffer((long)this.ref.address, (int)this.ref.length);
    }
}

