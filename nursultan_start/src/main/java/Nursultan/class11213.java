/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09087
 *  Nursultan.class09105
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09087;
import Nursultan.class09105;
import Nursultan.class11178;
import Nursultan.class11184;
import Nursultan.class11201;
import Nursultan.class11217;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;

public class class11213 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;

    public class09105 L() {
        return (class09105)this.N_0;
    }

    public class11184 M() {
        return (class11184)this.N_3;
    }

    public class11213(class09087 class090872, int n, int n2) {
        this.E();
        this.N_2 = class090872;
        this.N_1 = n2 > 0 ? class11217.N() : class11217.L();
        this.N_0 = new class09105();
        ((class09105)this.N_0).N();
        ((class11217)this.N_1).i().N();
        if (((class11217)this.N_1).u() != null) {
            ((class11217)this.N_1).u().N();
        }
        class090872.y();
        this.N_3 = new class11184(n);
        this.N_4 = n2 > 0 ? new class11178(n2) : null;
    }

    public boolean B() {
        if (this.Z().y()) {
            return (Integer)this.N_6 == 0;
        }
        return (Integer)this.N_5 == 0;
    }

    public class11217 Z() {
        return (class11217)this.N_1;
    }

    public static class11201 i() {
        return new class11201();
    }

    public int u() {
        return (Integer)this.N_6;
    }

    public int y() {
        return (Integer)this.N_5;
    }

    public void y(ByteBuffer byteBuffer, int n) {
        if (((class11217)this.N_1).u() == null) {
            throw new IllegalStateException("Mesh has no EBO");
        }
        ((class09105)this.N_0).N();
        ((class11217)this.N_1).u().N(byteBuffer, n);
        this.N_6 = byteBuffer.position() / 4;
    }

    public void y(int n) {
        if (((class11184)this.N_3).i() == 0) {
            return;
        }
        this.N((class11184)this.N_3, n);
        if ((class11178)this.N_4 != null) {
            this.N((class11178)this.N_4, n);
        }
    }

    private void E() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_5 = 0;
            this.N_6 = 0;
        }
    }

    public void N(class11178 class111782, int n) {
        if (((class11217)this.N_1).u() == null) {
            throw new IllegalStateException("Mesh has no EBO");
        }
        ((class09105)this.N_0).N();
        ((class11217)this.N_1).u().N(class111782.N(), n);
        this.N_6 = class111782.N().position() / 4;
        class111782.y();
    }

    public static class11213 N(class09087 class090872, int n, int n2) {
        return class11213.i().N(class090872).N(n).y(n2).N();
    }

    public void N(int n, int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        ((class09105)this.N_0).N();
        if (((class11217)this.N_1).y()) {
            GL33.glDrawElementsInstanced((int)n, (int)((Integer)this.N_6), (int)5125, (long)0L, (int)n3);
        } else {
            GL33.glDrawArraysInstanced((int)n, (int)0, (int)n2, (int)n3);
        }
    }

    public static class11213 N(class09087 class090872, int n) {
        return class11213.i().N(class090872).N(n).y(0).N();
    }

    public void N(ByteBuffer byteBuffer, int n) {
        ((class11217)this.N_1).i().N(byteBuffer, n);
        this.N_5 = byteBuffer.position() / ((class09087)this.N_2).L();
    }

    public class11178 N() {
        return (class11178)this.N_4;
    }

    public void N(class11184 class111842, int n) {
        ((class11217)this.N_1).i().N(class111842.u(), n);
        this.N_5 = class111842.i();
        class111842.N();
    }

    public void N(int n) {
        if (this.B()) {
            return;
        }
        ((class09105)this.N_0).N();
        if (((class11217)this.N_1).y()) {
            if ((Integer)this.N_6 == 0) {
                return;
            }
            GL33.glDrawElements((int)n, (int)((Integer)this.N_6), (int)5125, (long)0L);
        } else {
            if ((Integer)this.N_5 == 0) {
                return;
            }
            GL33.glDrawArrays((int)n, (int)0, (int)((Integer)this.N_5));
        }
    }

    public class09087 R() {
        return (class09087)this.N_2;
    }
}

