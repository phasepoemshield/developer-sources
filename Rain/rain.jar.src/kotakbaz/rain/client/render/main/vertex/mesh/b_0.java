/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.main.buffer.A;
import kotakbaz.rain.client.render.main.vertex.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.b;
import net.minecraft.client.util.BufferAllocator;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.mesh.B
 */
public class b_0
implements b {
    private final kotakbaz.rain.client.render.main.vertex.format.a_0 a;
    private final int A;
    private final int b;
    private a_0 B;
    private final kotakbaz.rain.client.render.main.buffer.b c;
    private kotakbaz.rain.client.render.main.buffer.b C;
    private boolean d;
    public static int[] e;

    public b_0(ByteBuffer byteBuffer, kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat, int vertexCount, int indexCount, a_0 drawMode, Runnable afterInitRunnable) {
        int n2 = e[0];
        n2 -= e[1];
        this.d = n2 ^= e[2];
        this.a = vertexFormat;
        this.A = vertexCount;
        this.b = indexCount;
        this.B = drawMode;
        this.c = new kotakbaz.rain.client.render.main.buffer.b(byteBuffer, kotakbaz.rain.client.render.main.buffer.A.A, kotakbaz.rain.client.render.main.buffer.a_0.a);
        afterInitRunnable.run();
    }

    public b_0 makeStandalone() {
        if (!this.d) {
            int n2 = e[3];
            n2 -= e[4];
            this.d = n2 ^= e[5];
            this.recreateIndexBuffer();
        }
        return this;
    }

    private void recreateIndexBuffer() {
        kotakbaz.rain.client.render.main.vertex.b_0 b_02;
        if (this.C != null) {
            this.C.close();
        }
        if ((b_02 = this.B.indexBufferGenerator()) != null) {
            boolean bl = e[6];
            bl -= e[7];
            this.C = b_02.getIndexBuffer(this.b, bl ^= e[8]);
        }
    }

    public void changeDrawMode(a_0 drawMode) {
        this.B = drawMode;
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
    public kotakbaz.rain.client.render.main.buffer.b getVertexBuffer() {
        return this.c;
    }

    @Override
    public kotakbaz.rain.client.render.main.buffer.b getIndexBuffer() {
        kotakbaz.rain.client.render.main.buffer.b b2;
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
    public a_0 getDrawMode() {
        return this.B;
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.format.a_0 getVertexFormat() {
        return this.a;
    }

    @Override
    public void close() {
        this.c.close();
        if (this.C != null) {
            this.C.close();
        }
    }

    public static kotakbaz.rain.client.render.main.vertex.mesh.a_0 builder(a_0 drawMode, kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat) {
        int n2 = e[12];
        n2 ^= e[13];
        return b_0.builder(n2 ^= e[14], drawMode, vertexFormat);
    }

    public static kotakbaz.rain.client.render.main.vertex.mesh.a_0 builder(int size, a_0 drawMode, kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat) {
        boolean bl = e[15];
        bl += e[16];
        return b_0.builder(new BufferAllocator(size), drawMode, vertexFormat, bl -= e[17]);
    }

    public static kotakbaz.rain.client.render.main.vertex.mesh.a_0 builder(BufferAllocator bufferAllocator, a_0 drawMode, kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat, boolean closeAllocatorAfterBuild) {
        return new kotakbaz.rain.client.render.main.vertex.mesh.a_0(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild);
    }

    static {
        b_0.a();
    }

    public static void a() {
        e = new int[0x83F5 ^ 0x83E7];
        b_0.e[0xC8A5 ^ 0xC8AA] = 0xC899 ^ 0xC8AA;
        b_0.e[0x10692 ^ 0x10698] = 0x1069D ^ 0x10698;
        b_0.e[0x795C ^ 0x795C] = 0x794C ^ 0x795C;
        b_0.e[0x3FCB ^ 0x3FC6] = 0xFFFFC02B ^ 0x3FC6;
        b_0.e[0x2BB1 ^ 0x2BB3] = 0x2BD6 ^ 0x2BB3;
        b_0.e[0x58A3 ^ 0x58B3] = 0xFFFFA74C ^ 0x58B3;
        b_0.e[0x25F ^ 0x256] = 0xFFFFFDB9 ^ 0x256;
        b_0.e[0xADDB ^ 0xADDA] = 0xFFFF5271 ^ 0xADDA;
        b_0.e[0xB487 ^ 0xB496] = 0xB4A7 ^ 0xB496;
        b_0.e[0xD36 ^ 0xD32] = 0xFFFFF2F9 ^ 0xD32;
        b_0.e[0x8421 ^ 0x842D] = 0xFFF37BC6 ^ 0x842D;
        b_0.e[0xF089 ^ 0xF08A] = 0xFFFF0FC1 ^ 0xF08A;
        b_0.e[0x4F4A ^ 0x4F4C] = 0xFFFFB0F1 ^ 0x4F4C;
        b_0.e[0x388D ^ 0x3886] = 0xFFFFC76C ^ 0x3886;
        b_0.e[0x8806 ^ 0x8803] = 0xFFFF7782 ^ 0x8803;
        b_0.e[0x1001 ^ 0x1006] = 0x1031 ^ 0x1006;
        b_0.e[0x725F ^ 0x7257] = 0xFFFF8DD0 ^ 0x7257;
        b_0.e[0x38E0 ^ 0x38EE] = 0x38E8 ^ 0x38EE;
    }
}

