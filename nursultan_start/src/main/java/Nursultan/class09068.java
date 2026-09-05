/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09306
 *  Nursultan.class09335
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09306;
import Nursultan.class09335;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;

public class class09068
extends class09335 {
    public class09068() {
        super(35345);
    }

    public void N(ByteBuffer byteBuffer, int n, int n2) {
        this.N(byteBuffer, n2);
        this.N(n);
    }

    public void N(int n) {
        GL33.glBindBufferBase((int)35345, (int)n, (int)((Integer)((class09306)this).y_0));
    }
}

