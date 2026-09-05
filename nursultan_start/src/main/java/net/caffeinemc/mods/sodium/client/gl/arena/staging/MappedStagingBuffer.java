/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.PriorityQueue
 *  it.unimi.dsi.fastutil.objects.ObjectArrayFIFOQueue
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 */
package net.caffeinemc.mods.sodium.client.gl.arena.staging;

import it.unimi.dsi.fastutil.PriorityQueue;
import it.unimi.dsi.fastutil.objects.ObjectArrayFIFOQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.FallbackStagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer$CopyCommand;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer$FencedMemoryRegion;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer$MappedBuffer;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlImmutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.functions.BufferStorageFunctions;
import net.caffeinemc.mods.sodium.client.gl.sync.GlFence;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import net.caffeinemc.mods.sodium.client.util.MathUtil;

public class MappedStagingBuffer
implements StagingBuffer {
    private static final float UPLOAD_LIMIT_MARGIN = 0.8f;
    private static final EnumBitField<GlBufferStorageFlags> STORAGE_FLAGS = EnumBitField.of((Enum[])new GlBufferStorageFlags[]{GlBufferStorageFlags.PERSISTENT, GlBufferStorageFlags.CLIENT_STORAGE, GlBufferStorageFlags.MAP_WRITE});
    private static final EnumBitField<GlBufferMapFlags> MAP_FLAGS = EnumBitField.of((Enum[])new GlBufferMapFlags[]{GlBufferMapFlags.PERSISTENT, GlBufferMapFlags.INVALIDATE_BUFFER, GlBufferMapFlags.WRITE, GlBufferMapFlags.EXPLICIT_FLUSH});
    private final FallbackStagingBuffer fallbackStagingBuffer;
    private final MappedStagingBuffer$MappedBuffer mappedBuffer;
    private final PriorityQueue<MappedStagingBuffer$CopyCommand> pendingCopies = new ObjectArrayFIFOQueue();
    private final PriorityQueue<MappedStagingBuffer$FencedMemoryRegion> fencedRegions = new ObjectArrayFIFOQueue();
    private int start = 0;
    private int pos = 0;
    private final int capacity;
    private int remaining;

    public MappedStagingBuffer(CommandList commandList) {
        this(commandList, 0x1000000);
    }

    public MappedStagingBuffer(CommandList commandList, int n) {
        GlImmutableBuffer glImmutableBuffer = commandList.createImmutableBuffer(n, STORAGE_FLAGS);
        GlBufferMapping glBufferMapping = commandList.mapBuffer(glImmutableBuffer, 0L, n, MAP_FLAGS);
        this.mappedBuffer = new MappedStagingBuffer$MappedBuffer(glImmutableBuffer, glBufferMapping);
        this.fallbackStagingBuffer = new FallbackStagingBuffer(commandList);
        this.remaining = this.capacity = n;
    }

    public String toString() {
        return "Mapped (%s/%s MiB)".formatted(new Object[]{MathUtil.toMib((long)this.remaining), MathUtil.toMib((long)this.capacity)});
    }

    @Override
    public void flush(CommandList commandList) {
        if (this.pendingCopies.isEmpty()) {
            return;
        }
        if (this.pos < this.start) {
            commandList.flushMappedRange(this.mappedBuffer.map, this.start, this.capacity - this.start);
            commandList.flushMappedRange(this.mappedBuffer.map, 0, this.pos);
        } else {
            commandList.flushMappedRange(this.mappedBuffer.map, this.start, this.pos - this.start);
        }
        int n = 0;
        for (MappedStagingBuffer$CopyCommand mappedStagingBuffer$CopyCommand : MappedStagingBuffer.consolidateCopies(this.pendingCopies)) {
            n = (int)((long)n + mappedStagingBuffer$CopyCommand.bytes);
            commandList.copyBufferSubData(this.mappedBuffer.buffer, mappedStagingBuffer$CopyCommand.buffer, mappedStagingBuffer$CopyCommand.readOffset, mappedStagingBuffer$CopyCommand.writeOffset, mappedStagingBuffer$CopyCommand.bytes);
        }
        this.fencedRegions.enqueue((Object)new MappedStagingBuffer$FencedMemoryRegion(commandList.createFence(), n));
        this.start = this.pos;
    }

    public static boolean isSupported(RenderDevice renderDevice) {
        return renderDevice.getDeviceFunctions().getBufferStorageFunctions() != BufferStorageFunctions.NONE;
    }

    @Override
    public void delete(CommandList commandList) {
        while (!this.fencedRegions.isEmpty()) {
            MappedStagingBuffer$FencedMemoryRegion mappedStagingBuffer$FencedMemoryRegion = (MappedStagingBuffer$FencedMemoryRegion)((Object)this.fencedRegions.dequeue());
            GlFence glFence = mappedStagingBuffer$FencedMemoryRegion.fence();
            glFence.sync();
            glFence.delete();
        }
        this.mappedBuffer.delete(commandList);
        this.fallbackStagingBuffer.delete(commandList);
        this.pendingCopies.clear();
    }

    @Override
    public void flip() {
        MappedStagingBuffer$FencedMemoryRegion mappedStagingBuffer$FencedMemoryRegion;
        GlFence glFence;
        while (!this.fencedRegions.isEmpty() && (glFence = (mappedStagingBuffer$FencedMemoryRegion = (MappedStagingBuffer$FencedMemoryRegion)((Object)this.fencedRegions.first())).fence()).isCompleted()) {
            glFence.delete();
            this.fencedRegions.dequeue();
            this.remaining += mappedStagingBuffer$FencedMemoryRegion.length();
        }
    }

    @Override
    public void enqueueCopy(CommandList commandList, ByteBuffer byteBuffer, GlBuffer glBuffer, long l) {
        int n = byteBuffer.remaining();
        if (n > this.remaining) {
            this.fallbackStagingBuffer.enqueueCopy(commandList, byteBuffer, glBuffer, l);
            return;
        }
        int n2 = this.capacity - this.pos;
        if (n > n2) {
            int n3 = n - n2;
            this.addTransfer(byteBuffer.slice(0, n2), glBuffer, this.pos, l);
            this.addTransfer(byteBuffer.slice(n2, n3), glBuffer, 0L, l + (long)n2);
            this.pos = n3;
        } else {
            this.addTransfer(byteBuffer, glBuffer, this.pos, l);
            this.pos += n;
        }
        this.remaining -= n;
    }

    @Override
    public long getUploadSizeLimit(long l) {
        return (long)((float)this.capacity * 0.8f);
    }

    private static List<MappedStagingBuffer$CopyCommand> consolidateCopies(PriorityQueue<MappedStagingBuffer$CopyCommand> priorityQueue) {
        ArrayList<MappedStagingBuffer$CopyCommand> arrayList = new ArrayList<MappedStagingBuffer$CopyCommand>();
        MappedStagingBuffer$CopyCommand mappedStagingBuffer$CopyCommand = null;
        while (!priorityQueue.isEmpty()) {
            MappedStagingBuffer$CopyCommand mappedStagingBuffer$CopyCommand2 = (MappedStagingBuffer$CopyCommand)priorityQueue.dequeue();
            if (mappedStagingBuffer$CopyCommand != null && mappedStagingBuffer$CopyCommand.buffer == mappedStagingBuffer$CopyCommand2.buffer && mappedStagingBuffer$CopyCommand.writeOffset + mappedStagingBuffer$CopyCommand.bytes == mappedStagingBuffer$CopyCommand2.writeOffset && mappedStagingBuffer$CopyCommand.readOffset + mappedStagingBuffer$CopyCommand.bytes == mappedStagingBuffer$CopyCommand2.readOffset) {
                mappedStagingBuffer$CopyCommand.bytes += mappedStagingBuffer$CopyCommand2.bytes;
                continue;
            }
            mappedStagingBuffer$CopyCommand = new MappedStagingBuffer$CopyCommand(mappedStagingBuffer$CopyCommand2);
            arrayList.add(mappedStagingBuffer$CopyCommand);
        }
        return arrayList;
    }

    private void addTransfer(ByteBuffer byteBuffer, GlBuffer glBuffer, long l, long l2) {
        this.mappedBuffer.map.write(byteBuffer, (int)l);
        this.pendingCopies.enqueue((Object)new MappedStagingBuffer$CopyCommand(glBuffer, l, l2, byteBuffer.remaining()));
    }
}

