/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  lombok.Generated
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.system.MemoryUtil
 */
package oxxxde;

import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.system.MemoryUtil;
import oxxxde.\u0627\u064b;
import oxxxde.\u062a\u0638;
import oxxxde.\u0633\u062c;
import oxxxde.\u0633\u063a;
import oxxxde.\u0638\u062d;

public final class \u062d\u064b {
    private final int vertexCountInShape;
    private final int vertexCountInTriangulated;
    private \u062a\u0638 indexBuffer;
    private int size;
    private \u0633\u063a indexType = \u0633\u063a.SHORT;
    private final \u0633\u062c triangulator;

    @Generated
    public \u0633\u063a getIndexType() {
        return this.indexType;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private \u062a\u0638 generateIndexBuffer(int requiredSize) {
        requiredSize = MathHelper.roundUpToMultiple((int)(requiredSize * 2), (int)this.vertexCountInTriangulated);
        int i = requiredSize / this.vertexCountInTriangulated;
        \u0633\u063a indexType = \u0633\u063a.smallestFor(i * this.vertexCountInShape);
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)MathHelper.roundUpToMultiple((int)(requiredSize * indexType.bytes), (int)4));
        try {
            this.indexType = indexType;
            IntConsumer intConsumer = this.getIndexConsumer(byteBuffer);
            int l = 0;
            while (l < requiredSize) {
                this.triangulator.accept(intConsumer, l * this.vertexCountInShape / this.vertexCountInTriangulated);
                int n = l + this.vertexCountInTriangulated;
            }
            byteBuffer.flip();
            \u062a\u0638 \u062a\u06382 = new \u062a\u0638(byteBuffer, \u0627\u064b.STATIC_DRAW, \u0638\u062d.ELEMENT_ARRAY_BUFFER);
            return \u062a\u06382;
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
    }

    @Generated
    public \u062d\u064b(int vertexCountInShape, int vertexCountInTriangulated, \u0633\u062c triangulator) {
        this.vertexCountInShape = vertexCountInShape;
        this.vertexCountInTriangulated = vertexCountInTriangulated;
        this.triangulator = triangulator;
    }

    public \u062a\u0638 getIndexBuffer(int requiredSize, boolean standalone) {
        if (standalone) {
            return this.generateIndexBuffer(requiredSize);
        }
        if (!this.isLargeEnough(requiredSize)) {
            if (this.indexBuffer != null) {
                this.indexBuffer.close();
            }
            this.indexBuffer = this.generateIndexBuffer(requiredSize);
            this.size = requiredSize;
        }
        return this.indexBuffer;
    }

    private IntConsumer getIndexConsumer(ByteBuffer indexBuffer) {
        if (this.indexType == \u0633\u063a.SHORT) {
            return index -> indexBuffer.putShort((short)index);
        }
        return indexBuffer::putInt;
    }

    public boolean isLargeEnough(int requiredSize) {
        return requiredSize <= this.size;
    }
}

