/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.cache.ICachedRegion
 *  minecraft.class00500
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07376
 */
package baritone.cache;

import baritone.Baritone;
import baritone.api.cache.ICachedRegion;
import baritone.api.utils.BlockUtils;
import baritone.cache.CachedChunk;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import minecraft.class00500;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07376;

public final class CachedRegion
implements ICachedRegion {
    private static final byte CHUNK_NOT_PRESENT = 0;
    private static final byte CHUNK_PRESENT = 1;
    private static final int CACHED_REGION_MAGIC = 456022911;
    private final CachedChunk[][] chunks = new CachedChunk[32][32];
    private final int x;
    private final int z;
    private final class07376 dimension;
    private final class05946<class07299> dimensionId;
    private boolean hasUnsavedChanges;

    CachedRegion(int n, int n2, class07376 class073762, class05946<class07299> class059462) {
        this.x = n;
        this.z = n2;
        this.hasUnsavedChanges = false;
        this.dimension = class073762;
        this.dimensionId = class059462;
    }

    public synchronized void load(String string) {
        try {
            Path path;
            Path path2 = Paths.get(string, new String[0]);
            if (!Files.exists(path2, new LinkOption[0])) {
                Files.createDirectories(path2, new FileAttribute[0]);
            }
            if (!Files.exists(path = CachedRegion.getRegionFile(path2, this.x, this.z), new LinkOption[0])) {
                return;
            }
            System.out.println("Loading region " + this.x + "," + this.z + " from disk " + String.valueOf(path2));
            long l = System.nanoTime() / 1000000L;
            try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
                 GZIPInputStream gZIPInputStream = new GZIPInputStream((InputStream)fileInputStream, 32768);
                 DataInputStream dataInputStream = new DataInputStream(gZIPInputStream);){
                int n;
                int n2;
                int n3;
                int n4 = dataInputStream.readInt();
                if (n4 != 456022911) {
                    throw new IOException("Bad magic value " + n4);
                }
                boolean[][] blArray = new boolean[32][32];
                BitSet[][] bitSetArray = new BitSet[32][32];
                Map[][] mapArray = new Map[32][32];
                class00500[][][] class00500Array = new class00500[32][32][];
                long[][] lArray = new long[32][32];
                for (n3 = 0; n3 < 32; ++n3) {
                    block22: for (n2 = 0; n2 < 32; ++n2) {
                        n = dataInputStream.read();
                        switch (n) {
                            case 1: {
                                byte[] byArray = new byte[CachedChunk.sizeInBytes(CachedChunk.size(this.dimension.Z()))];
                                dataInputStream.readFully(byArray);
                                bitSetArray[n3][n2] = BitSet.valueOf(byArray);
                                mapArray[n3][n2] = new HashMap();
                                class00500Array[n3][n2] = new class00500[256];
                                blArray[n3][n2] = true;
                                continue block22;
                            }
                            case 0: {
                                continue block22;
                            }
                            default: {
                                throw new IOException("Malformed stream");
                            }
                        }
                    }
                }
                for (n3 = 0; n3 < 32; ++n3) {
                    for (n2 = 0; n2 < 32; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        for (n = 0; n < 256; ++n) {
                            class00500Array[n3][n2][n] = BlockUtils.stringToBlockRequired(dataInputStream.readUTF()).W();
                        }
                    }
                }
                for (n3 = 0; n3 < 32; ++n3) {
                    for (n2 = 0; n2 < 32; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        n = dataInputStream.readShort() & 0xFFFF;
                        for (int i = 0; i < n; ++i) {
                            String string2 = dataInputStream.readUTF();
                            BlockUtils.stringToBlockRequired(string2);
                            ArrayList<class07209> arrayList = new ArrayList<class07209>();
                            mapArray[n3][n2].put(string2, arrayList);
                            int n5 = dataInputStream.readShort() & 0xFFFF;
                            if (n5 == 0) {
                                n5 = 65536;
                            }
                            for (int j = 0; j < n5; ++j) {
                                byte by = dataInputStream.readByte();
                                int n6 = by & 0xF;
                                int n7 = by >>> 4 & 0xF;
                                int n8 = dataInputStream.readInt();
                                arrayList.add(new class07209(n6, n8 + this.dimension.B(), n7));
                            }
                        }
                    }
                }
                for (n3 = 0; n3 < 32; ++n3) {
                    for (n2 = 0; n2 < 32; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        lArray[n3][n2] = dataInputStream.readLong();
                    }
                }
                for (n3 = 0; n3 < 32; ++n3) {
                    for (n2 = 0; n2 < 32; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        n = this.x;
                        int n9 = this.z;
                        int n10 = n3 + 32 * n;
                        int n11 = n2 + 32 * n9;
                        this.chunks[n3][n2] = new CachedChunk(n10, n11, this.dimension.Z(), bitSetArray[n3][n2], class00500Array[n3][n2], mapArray[n3][n2], lArray[n3][n2]);
                    }
                }
            }
            this.removeExpired();
            this.hasUnsavedChanges = false;
            long l2 = System.nanoTime() / 1000000L;
            System.out.println("Loaded region successfully in " + (l2 - l) + "ms");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final synchronized void save(String string) {
        if (!this.hasUnsavedChanges) {
            return;
        }
        this.removeExpired();
        try {
            Path path = Paths.get(string, new String[0]);
            if (!Files.exists(path, new LinkOption[0])) {
                Files.createDirectories(path, new FileAttribute[0]);
            }
            System.out.println("Saving region " + this.x + "," + this.z + " to disk " + String.valueOf(path));
            Path path2 = CachedRegion.getRegionFile(path, this.x, this.z);
            if (!Files.exists(path2, new LinkOption[0])) {
                Files.createFile(path2, new FileAttribute[0]);
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
                 GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)fileOutputStream, 16384);
                 DataOutputStream dataOutputStream = new DataOutputStream(gZIPOutputStream);){
                Object object;
                int n;
                int n2;
                dataOutputStream.writeInt(456022911);
                for (n2 = 0; n2 < 32; ++n2) {
                    for (n = 0; n < 32; ++n) {
                        CachedChunk cachedChunk = this.chunks[n2][n];
                        if (cachedChunk == null) {
                            dataOutputStream.write(0);
                            continue;
                        }
                        dataOutputStream.write(1);
                        object = cachedChunk.toByteArray();
                        dataOutputStream.write((byte[])object);
                        dataOutputStream.write(new byte[cachedChunk.sizeInBytes - ((byte[])object).length]);
                    }
                }
                for (n2 = 0; n2 < 32; ++n2) {
                    for (n = 0; n < 32; ++n) {
                        if (this.chunks[n2][n] == null) continue;
                        for (int i = 0; i < 256; ++i) {
                            dataOutputStream.writeUTF(BlockUtils.blockToString(this.chunks[n2][n].getOverview()[i].i()));
                        }
                    }
                }
                for (n2 = 0; n2 < 32; ++n2) {
                    for (n = 0; n < 32; ++n) {
                        if (this.chunks[n2][n] == null) continue;
                        Map<String, List<class07209>> map = this.chunks[n2][n].getRelativeBlocks();
                        dataOutputStream.writeShort(map.entrySet().size());
                        object = map.entrySet().iterator();
                        while (object.hasNext()) {
                            Map.Entry entry = (Map.Entry)object.next();
                            dataOutputStream.writeUTF((String)entry.getKey());
                            dataOutputStream.writeShort(((List)entry.getValue()).size());
                            for (class07209 class072092 : (List)entry.getValue()) {
                                dataOutputStream.writeByte((byte)(class072092.method_10260() << 4 | class072092.method_10263()));
                                dataOutputStream.writeInt(class072092.method_10264() - this.dimension.B());
                            }
                        }
                    }
                }
                for (n2 = 0; n2 < 32; ++n2) {
                    for (n = 0; n < 32; ++n) {
                        if (this.chunks[n2][n] == null) continue;
                        dataOutputStream.writeLong(this.chunks[n2][n].cacheTimestamp);
                    }
                }
            }
            this.hasUnsavedChanges = false;
            System.out.println("Saved region successfully");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final boolean isCached(int n, int n2) {
        return this.chunks[n >> 4][n2 >> 4] != null;
    }

    public final int getX() {
        return this.x;
    }

    public final int getZ() {
        return this.z;
    }

    public final class00500 getBlock(int n, int n2, int n3) {
        int n4 = n2 - this.dimension.B();
        CachedChunk cachedChunk = this.chunks[n >> 4][n3 >> 4];
        if (cachedChunk != null) {
            return cachedChunk.getBlock(n & 0xF, n4, n3 & 0xF, this.dimension, this.dimensionId);
        }
        return null;
    }

    public final ArrayList<class07209> getLocationsOf(String string) {
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                ArrayList<class07209> arrayList2;
                if (this.chunks[i][j] == null || (arrayList2 = this.chunks[i][j].getAbsoluteBlocks(string)) == null) continue;
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final synchronized void updateCachedChunk(int n, int n2, CachedChunk cachedChunk) {
        this.chunks[n][n2] = cachedChunk;
        this.hasUnsavedChanges = true;
    }

    public final synchronized void removeExpired() {
        long l = (Long)Baritone.settings().cachedChunksExpirySeconds.value;
        if (l < 0L) {
            return;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - l * 1000L;
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                if (this.chunks[i][j] == null || this.chunks[i][j].cacheTimestamp >= l3) continue;
                System.out.println("Removing chunk " + (i + 32 * this.x) + "," + (j + 32 * this.z) + " because it was cached " + (l2 - this.chunks[i][j].cacheTimestamp) / 1000L + " seconds ago, and max age is " + l);
                this.chunks[i][j] = null;
            }
        }
    }

    private static Path getRegionFile(Path path, int n, int n2) {
        return Paths.get(path.toString(), "r." + n + "." + n2 + ".bcr");
    }

    public final synchronized CachedChunk mostRecentlyModified() {
        CachedChunk cachedChunk = null;
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                if (this.chunks[i][j] == null || cachedChunk != null && this.chunks[i][j].cacheTimestamp <= cachedChunk.cacheTimestamp) continue;
                cachedChunk = this.chunks[i][j];
            }
        }
        return cachedChunk;
    }
}

