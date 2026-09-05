/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09068
 *  org.joml.Matrix4f
 *  org.lwjgl.BufferUtils
 */
package Nursultan;

import Nursultan.class09068;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;

public class class11216 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public Object y_0;
    public Object y_1;

    public class11216() {
        this.u();
        this.y_0 = new class09068();
        this.y_1 = BufferUtils.createByteBuffer((int)128);
    }

    static {
        class11216.N();
    }

    private void u() {
    }

    public void N(Matrix4f matrix4f, Matrix4f matrix4f2) {
        ((ByteBuffer)this.y_1).clear();
        matrix4f.get(0, (ByteBuffer)this.y_1);
        matrix4f2.get(64, (ByteBuffer)this.y_1);
        ((ByteBuffer)this.y_1).position(128);
        ((class09068)this.y_0).N((ByteBuffer)this.y_1, 0, 35048);
    }

    private static void N() {
        N_0 = 0;
        N_1 = 0;
        N_2 = 64;
        N_3 = 128;
    }
}

