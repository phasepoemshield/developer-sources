/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatRegistry
 */
package net.caffeinemc.mods.sodium.client.render.vertex;

import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.concurrent.locks.StampedLock;
import net.caffeinemc.mods.sodium.api.vertex.format.VertexFormatRegistry;

public class VertexFormatRegistryImpl
implements VertexFormatRegistry {
    private static final int ABSENT_INDEX = -1;
    private final Reference2IntMap<VertexFormat> descriptions = new Reference2IntOpenHashMap();
    private final StampedLock lock = new StampedLock();

    public VertexFormatRegistryImpl() {
        this.descriptions.defaultReturnValue(-1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int allocateGlobalId(VertexFormat vertexFormat) {
        int n;
        long l = this.lock.readLock();
        try {
            n = this.descriptions.getInt((Object)vertexFormat);
        }
        finally {
            this.lock.unlockRead(l);
        }
        if (n == -1) {
            l = this.lock.writeLock();
            try {
                n = this.descriptions.size();
                this.descriptions.put((Object)vertexFormat, n);
            }
            finally {
                this.lock.unlockWrite(l);
            }
        }
        return n;
    }
}

