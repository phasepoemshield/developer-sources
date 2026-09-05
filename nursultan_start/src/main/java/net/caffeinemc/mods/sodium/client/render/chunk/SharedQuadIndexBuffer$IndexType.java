/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType$1;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType$2;

public abstract sealed class SharedQuadIndexBuffer$IndexType
extends Enum<SharedQuadIndexBuffer$IndexType>
permits SharedQuadIndexBuffer$IndexType$1, SharedQuadIndexBuffer$IndexType$2 {
    public static final /* enum */ SharedQuadIndexBuffer$IndexType SHORT = new SharedQuadIndexBuffer$IndexType$1(GlIndexType.UNSIGNED_SHORT, 65536);
    public static final /* enum */ SharedQuadIndexBuffer$IndexType INTEGER = new SharedQuadIndexBuffer$IndexType$2(GlIndexType.UNSIGNED_INT, Integer.MAX_VALUE);
    public static final SharedQuadIndexBuffer$IndexType[] VALUES;
    private final GlIndexType format;
    private final int maxElementCount;
    private static final /* synthetic */ SharedQuadIndexBuffer$IndexType[] $VALUES;

    public GlIndexType getFormat() {
        return this.format;
    }

    SharedQuadIndexBuffer$IndexType(GlIndexType glIndexType, int n2) {
        this.format = glIndexType;
        this.maxElementCount = n2;
    }

    static {
        $VALUES = SharedQuadIndexBuffer$IndexType.$values();
        VALUES = SharedQuadIndexBuffer$IndexType.values();
    }

    public static SharedQuadIndexBuffer$IndexType[] values() {
        return (SharedQuadIndexBuffer$IndexType[])$VALUES.clone();
    }

    public static SharedQuadIndexBuffer$IndexType valueOf(String string) {
        return Enum.valueOf(SharedQuadIndexBuffer$IndexType.class, string);
    }

    private static /* synthetic */ SharedQuadIndexBuffer$IndexType[] $values() {
        return new SharedQuadIndexBuffer$IndexType[]{SHORT, INTEGER};
    }

    public int getMaxElementCount() {
        return this.maxElementCount;
    }

    public abstract void createIndexBuffer(ByteBuffer var1, int var2);

    public int getBytesPerElement() {
        return this.format.getStride();
    }

    public int getMaxPrimitiveCount() {
        return this.maxElementCount / 4;
    }
}

