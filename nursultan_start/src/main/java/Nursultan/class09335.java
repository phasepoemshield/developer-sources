/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class09306;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.MemoryUtil;

public class class09335
extends class09306 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class09335(int n) {
        super(GL33.glGenBuffers());
        this.u();
        this.N_0 = n;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
        }
    }

    public void N() {
        this.u();
        GL33.glBindBuffer((int)((Integer)this.N_0), (int)((Integer)this.y_0));
    }

    public void N(ByteBuffer byteBuffer, int n) {
        this.u();
        this.N();
        int n2 = byteBuffer.position();
        if (n2 > (Integer)this.N_1) {
            int n3 = Math.max((Integer)this.N_1 * 2, n2);
            GL33.nglBufferData((int)((Integer)this.N_0), (long)n3, (long)0L, (int)n);
            this.N_1 = n3;
        }
        GL33.nglBufferSubData((int)((Integer)this.N_0), (long)0L, (long)n2, (long)MemoryUtil.memAddress0((Buffer)byteBuffer));
    }
}

