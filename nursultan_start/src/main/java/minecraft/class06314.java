/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 *  minecraft.class04995
 *  org.lwjgl.BufferUtils
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.nio.ByteBuffer;
import java.util.List;
import minecraft.class04995;
import org.lwjgl.BufferUtils;

public class class06314
implements FloatConsumer {
    private final List<ByteBuffer> N = Lists.newArrayList();
    private final int y;
    private int L;
    private ByteBuffer u;

    public class06314(int n) {
        this.y = n + 1 & 0xFFFFFFFE;
        this.u = BufferUtils.createByteBuffer((int)n);
    }

    public void accept(float f) {
        if (this.u.remaining() == 0) {
            this.u.flip();
            this.N.add(this.u);
            this.u = BufferUtils.createByteBuffer((int)this.y);
        }
        int n = class04995.N((int)((int)(f * 32767.5f - 0.5f)), (int)Short.MIN_VALUE, (int)Short.MAX_VALUE);
        this.u.putShort((short)n);
        this.L += 2;
    }

    public int y() {
        return this.L;
    }

    public ByteBuffer N() {
        this.u.flip();
        if (this.N.isEmpty()) {
            return this.u;
        }
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)this.L);
        this.N.forEach(byteBuffer::put);
        byteBuffer.put(this.u);
        byteBuffer.flip();
        return byteBuffer;
    }
}

