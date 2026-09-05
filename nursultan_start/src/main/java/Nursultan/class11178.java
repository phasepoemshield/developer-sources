/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class class11178 {
    public Object N_0;

    public ByteBuffer L() {
        ((ByteBuffer)this.N_0).flip();
        return (ByteBuffer)this.N_0;
    }

    public class11178(int n) {
        this.R();
        this.N_0 = MemoryUtil.memAlloc((int)n);
    }

    private ByteBuffer u(int n) {
        if (((ByteBuffer)this.N_0).position() + n > ((ByteBuffer)this.N_0).capacity()) {
            this.R(n);
        }
        return (ByteBuffer)this.N_0;
    }

    public class11178 y(int n) {
        this.N(n);
        this.N(n + 1);
        this.N(n + 3);
        this.N(n + 1);
        this.N(n + 2);
        this.N(n + 3);
        return this;
    }

    public void y() {
        ((ByteBuffer)this.N_0).position(0);
    }

    public ByteBuffer N() {
        return (ByteBuffer)this.N_0;
    }

    public class11178 N(int n) {
        this.u(4).putInt(n);
        return this;
    }

    private void R() {
    }

    private void R(int n) {
        int n2;
        for (n2 = ((ByteBuffer)this.N_0).capacity(); ((ByteBuffer)this.N_0).position() + n > n2; n2 += n2 >> 1) {
        }
        int n3 = ((ByteBuffer)this.N_0).position();
        this.N_0 = MemoryUtil.memRealloc((ByteBuffer)((ByteBuffer)this.N_0), (int)n2);
        ((ByteBuffer)this.N_0).position(n3);
    }
}

