/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_9799
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.A;
import kotakbaz.rain.client.render.main.vertex.mesh.b_0;
import net.minecraft.class_9799;

public class B
implements b_0 {
    private final a_0 a;
    private final int A;
    private final int b;
    private kotakbaz.rain.client.render.main.vertex.A B;
    private final b c;
    private b C;
    private boolean d;
    public static int[] e;

    public B(ByteBuffer byteBuffer, a_0 a_02, int n, int n2, kotakbaz.rain.client.render.main.vertex.A a2, Runnable runnable) {
        super();
        int n3 = e[0];
        n3 -= e[1];
        this.d = n3 ^= e[2];
        this.a = a_02;
        this.A = n;
        this.b = n2;
        this.B = a2;
        this.c = new b(byteBuffer, kotakbaz.rain.client.render.main.buffer.A.A, kotakbaz.rain.client.render.main.buffer.a_0.a);
        runnable.run();
    }

    public B makeStandalone() {
        if (!this.d) {
            int n = e[3];
            n -= e[4];
            this.d = n ^= e[5];
            this.recreateIndexBuffer();
        }
        return this;
    }

    private void recreateIndexBuffer() {
        kotakbaz.rain.client.render.main.vertex.B b2;
        if (this.C != null) {
            this.C.close();
        }
        if ((b2 = this.B.indexBufferGenerator()) != null) {
            boolean bl = e[6];
            bl -= e[7];
            this.C = b2.getIndexBuffer(this.b, bl ^= e[8]);
        }
    }

    public void changeDrawMode(kotakbaz.rain.client.render.main.vertex.A a2) {
        this.B = a2;
        if (this.d) {
            this.recreateIndexBuffer();
        }
    }

    @Override
    public int getVertexCount() {
        return this.A;
    }

    @Override
    public int getIndexCount() {
        return this.b;
    }

    @Override
    public b getVertexBuffer() {
        return this.c;
    }

    @Override
    public b getIndexBuffer() {
        b b2;
        if (this.d) {
            b2 = this.C;
        } else {
            boolean bl = e[9];
            bl ^= e[10];
            b2 = this.B.indexBufferGenerator().getIndexBuffer(this.b, bl -= e[11]);
        }
        return b2;
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.A getDrawMode() {
        return this.B;
    }

    @Override
    public a_0 getVertexFormat() {
        return this.a;
    }

    @Override
    public void close() {
        this.c.close();
        if (this.C != null) {
            this.C.close();
        }
    }

    public static A builder(kotakbaz.rain.client.render.main.vertex.A a2, a_0 a_02) {
        int n = e[12];
        n ^= e[13];
        return kotakbaz.rain.client.render.main.vertex.mesh.B.builder(n ^= e[14], a2, a_02);
    }

    public static A builder(int n, kotakbaz.rain.client.render.main.vertex.A a2, a_0 a_02) {
        boolean bl = e[15];
        bl += e[16];
        return kotakbaz.rain.client.render.main.vertex.mesh.B.builder(new class_9799(n), a2, a_02, bl -= e[17]);
    }

    public static A builder(class_9799 class_97992, kotakbaz.rain.client.render.main.vertex.A a2, a_0 a_02, boolean bl) {
        return new A(class_97992, a2, a_02, bl);
    }

    static {
        kotakbaz.rain.client.render.main.vertex.mesh.B.a();
    }

    public static void a() {
        e = new int[0x83F5 ^ 0x83E7];
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0xC8A5 ^ 0xC8AA] = 0xC899 ^ 0xC8AA;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x10692 ^ 0x10698] = 0x1069D ^ 0x10698;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x795C ^ 0x795C] = 0x794C ^ 0x795C;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x3FCB ^ 0x3FC6] = 0xFFFFC02B ^ 0x3FC6;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x2BB1 ^ 0x2BB3] = 0x2BD6 ^ 0x2BB3;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x58A3 ^ 0x58B3] = 0xFFFFA74C ^ 0x58B3;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x25F ^ 0x256] = 0xFFFFFDB9 ^ 0x256;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0xADDB ^ 0xADDA] = 0xFFFF5271 ^ 0xADDA;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0xB487 ^ 0xB496] = 0xB4A7 ^ 0xB496;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0xD36 ^ 0xD32] = 0xFFFFF2F9 ^ 0xD32;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x8421 ^ 0x842D] = 0xFFF37BC6 ^ 0x842D;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0xF089 ^ 0xF08A] = 0xFFFF0FC1 ^ 0xF08A;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x4F4A ^ 0x4F4C] = 0xFFFFB0F1 ^ 0x4F4C;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x388D ^ 0x3886] = 0xFFFFC76C ^ 0x3886;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x8806 ^ 0x8803] = 0xFFFF7782 ^ 0x8803;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x1001 ^ 0x1006] = 0x1031 ^ 0x1006;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x725F ^ 0x7257] = 0xFFFF8DD0 ^ 0x7257;
        kotakbaz.rain.client.render.main.vertex.mesh.B.e[0x38E0 ^ 0x38EE] = 0x38E8 ^ 0x38EE;
    }
}

