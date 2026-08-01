/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.buffer;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.main.buffer.A;
import kotakbaz.rain.client.render.main.buffer.a_0;
import kotakbaz.rain.client.render.main.d_0;
import lombok.Generated;
import org.lwjgl.opengl.GL15;

public class b
implements d_0,
AutoCloseable {
    private final int a;
    private final A A;
    private final a_0 b;
    private boolean B;
    public static int[] C;

    public b(ByteBuffer data, A usage, a_0 target) {
        int n2 = C[0];
        n2 ^= C[1];
        this.B = n2 += C[2];
        this.a = GL15.glGenBuffers();
        this.A = usage;
        this.b = target;
        this.bind();
        GL15.glBufferData((int)target.h, (ByteBuffer)data, (int)usage.E);
        int n3 = C[3];
        n3 -= C[4];
        GL15.glBindBuffer((int)target.h, (int)(n3 -= C[5]));
    }

    @Override
    public void bind() {
        GL15.glBindBuffer((int)this.b.h, (int)this.a);
    }

    @Override
    public void unbind() {
        int n2 = C[6];
        n2 ^= C[7];
        GL15.glBindBuffer((int)this.b.h, (int)(n2 ^= C[8]));
    }

    @Override
    public void close() {
        if (!this.B) {
            GL15.glDeleteBuffers((int)this.a);
        }
        int n2 = C[9];
        n2 ^= C[10];
        this.B = n2 -= C[11];
    }

    @Generated
    public int getId() {
        return this.a;
    }

    @Generated
    public A getUsage() {
        return this.A;
    }

    @Generated
    public a_0 getTarget() {
        return this.b;
    }

    static {
        kotakbaz.rain.client.render.main.buffer.b.a();
    }

    public static void a() {
        C = new int[0x10DAB ^ 0x10DA7];
        kotakbaz.rain.client.render.main.buffer.b.C[0x769D ^ 0x769D] = 0x7699 ^ 0x769D;
        kotakbaz.rain.client.render.main.buffer.b.C[0xB3D3 ^ 0xB3D2] = 0xFFFF4C44 ^ 0xB3D2;
        kotakbaz.rain.client.render.main.buffer.b.C[0xD99D ^ 0xD99F] = 0xD9F1 ^ 0xD99F;
        kotakbaz.rain.client.render.main.buffer.b.C[0xFF2E ^ 0xFF28] = 0xFFFF00E4 ^ 0xFF28;
        kotakbaz.rain.client.render.main.buffer.b.C[0xCEE5 ^ 0xCEEE] = 0xCE90 ^ 0xCEEE;
        kotakbaz.rain.client.render.main.buffer.b.C[0xA5AC ^ 0xA5A5] = 0xFFFF5A3B ^ 0xA5A5;
        kotakbaz.rain.client.render.main.buffer.b.C[0xCE28 ^ 0xCE2C] = 0xFFFF3196 ^ 0xCE2C;
        kotakbaz.rain.client.render.main.buffer.b.C[0xE852 ^ 0xE851] = 0xFFFF172E ^ 0xE851;
        kotakbaz.rain.client.render.main.buffer.b.C[0xB3B5 ^ 0xB3BD] = 0xB3AA ^ 0xB3BD;
        kotakbaz.rain.client.render.main.buffer.b.C[0x22EA ^ 0x22E0] = 0xFFFFDD01 ^ 0x22E0;
        kotakbaz.rain.client.render.main.buffer.b.C[0x759C ^ 0x759B] = 0xFFFF8A40 ^ 0x759B;
        kotakbaz.rain.client.render.main.buffer.b.C[0x3C54 ^ 0x3C51] = 0xFFFFC394 ^ 0x3C51;
    }
}

