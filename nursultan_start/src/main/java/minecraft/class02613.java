/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package minecraft;

import java.nio.ByteBuffer;
import minecraft.class02579;
import org.lwjgl.system.MemoryUtil;

public class class02613
implements AutoCloseable {
    private final long y;
    private final int L;
    private final int u;
    private boolean i;
    final /* synthetic */ class02579 N;

    class02613(class02579 class025792, long l, int n, int n2) {
        this.N = class025792;
        this.y = l;
        this.L = n;
        this.u = n2;
    }

    @Override
    public void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (this.N.L(this.u)) {
            this.N.u();
        }
    }

    public ByteBuffer N() {
        if (!this.N.L(this.u)) {
            throw new IllegalStateException("Buffer is no longer valid");
        }
        return MemoryUtil.memByteBuffer((long)(this.N.N + this.y), (int)this.L);
    }
}

