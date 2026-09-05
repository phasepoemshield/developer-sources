/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  net.raphimc.viabedrock.api.util.LZ4
 */
package net.raphimc.viabedrock.api.io;

import com.viaversion.viaversion.api.Via;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import net.raphimc.viabedrock.api.util.LZ4;

public class BlobDB
implements Closeable {
    private static final byte[] MAGIC = new byte[]{66, 68, 66};
    private static final int VERSION = 1;
    private final File indexFile;
    private final RandomAccessFile dataFile;
    private final Map<Long, IndexEntry> index = new LinkedHashMap<Long, IndexEntry>();
    private final Map<Long, byte[]> pendingWrites = new ConcurrentHashMap<Long, byte[]>();
    private final Thread writeThread;
    private boolean indexDirty = false;
    private long dataOffset = 0L;

    public BlobDB(File directory) throws IOException {
        directory.mkdirs();
        this.indexFile = new File(directory, "index.bdbi");
        this.dataFile = new RandomAccessFile(new File(directory, "data.bdbd"), "rw");
        try {
            this.load();
        }
        catch (Throwable e) {
            this.dataFile.close();
            throw e;
        }
        this.writeThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(1000L);
                    HashSet<Long> writtenKeys = new HashSet<Long>();
                    for (Map.Entry<Long, byte[]> entry : this.pendingWrites.entrySet()) {
                        try {
                            this.putNow(entry.getKey(), entry.getValue());
                            writtenKeys.add(entry.getKey());
                        }
                        catch (Throwable e) {
                            Via.getPlatform().getLogger().log(Level.SEVERE, "Failed to write pending blob", e);
                            break;
                        }
                    }
                    writtenKeys.forEach(this.pendingWrites::remove);
                }
                catch (InterruptedException e) {
                    break;
                }
            }
        }, "BlobDB Write Thread");
        this.writeThread.start();
    }

    public synchronized void save() throws IOException {
        if (!this.indexDirty) {
            return;
        }
        this.waitForWrites();
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.indexFile)));){
            dos.write(MAGIC);
            dos.writeInt(1);
            for (Map.Entry<Long, IndexEntry> entry : this.index.entrySet()) {
                dos.writeLong(entry.getKey());
                dos.writeInt(entry.getValue().length);
            }
        }
        this.indexDirty = false;
    }

    public synchronized boolean contains(long key) {
        if (this.pendingWrites.containsKey(key)) {
            return true;
        }
        return this.index.containsKey(key);
    }

    public synchronized byte[] get(long key) throws IOException {
        byte[] pending = this.pendingWrites.get(key);
        if (pending != null) {
            return pending;
        }
        IndexEntry entry = this.index.get(key);
        if (entry == null) {
            return null;
        }
        this.dataFile.seek(entry.offset);
        byte[] value = new byte[entry.length];
        this.dataFile.readFully(value);
        return LZ4.decompress((byte[])value);
    }

    public synchronized void queuePut(long key, byte[] value) {
        if (this.index.containsKey(key)) {
            throw new IllegalArgumentException("Key already exists: " + key);
        }
        this.pendingWrites.put(key, value);
    }

    public synchronized void putNow(long key, byte[] value) throws IOException {
        if (this.index.containsKey(key)) {
            throw new IllegalArgumentException("Key already exists: " + key);
        }
        byte[] compressedValue = LZ4.compress((byte[])value);
        this.dataFile.seek(this.dataOffset);
        this.dataFile.write(compressedValue);
        this.index.put(key, new IndexEntry(this.dataOffset, compressedValue.length));
        this.dataOffset += (long)compressedValue.length;
        this.indexDirty = true;
    }

    public void waitForWrites() {
        while (!this.pendingWrites.isEmpty()) {
            try {
                Thread.sleep(50L);
            }
            catch (InterruptedException e) {
                break;
            }
        }
    }

    @Override
    public synchronized void close() throws IOException {
        this.writeThread.interrupt();
        this.dataFile.close();
    }

    private void load() throws IOException {
        if (!this.indexFile.exists()) {
            return;
        }
        long availableBytes = this.indexFile.length();
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(this.indexFile)));){
            byte[] magic = new byte[MAGIC.length];
            dis.readFully(magic);
            if (!Arrays.equals(magic, MAGIC)) {
                throw new IOException("Wrong magic: " + Arrays.toString(magic));
            }
            availableBytes -= (long)magic.length;
            int version = dis.readInt();
            if (version != 1) {
                throw new IOException("Wrong version: " + version);
            }
            availableBytes -= 4L;
            while (availableBytes > 0L) {
                long key = dis.readLong();
                int length = dis.readInt();
                availableBytes -= 12L;
                this.index.put(key, new IndexEntry(this.dataOffset, length));
                this.dataOffset += (long)length;
            }
        }
    }

    private record IndexEntry(long offset, int length) {
    }
}

