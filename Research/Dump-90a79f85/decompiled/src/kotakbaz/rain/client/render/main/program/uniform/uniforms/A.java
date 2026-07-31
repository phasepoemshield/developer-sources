/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryUtil;

public class A
extends kotakbaz.rain.client.render.main.program.uniform.A {
    private final FloatBuffer a;
    private boolean A;
    public static int[] B;

    public A(String string, int n, kotakbaz.rain.client.render.main.program.A a2) {
        super(string, n, a2);
        int n2 = B[0];
        n2 += B[1];
        this.a = MemoryUtil.memAllocFloat((int)(n2 -= B[2]));
        int n3 = B[3];
        n3 += B[4];
        this.A = n3 ^= B[5];
    }

    public void set(Matrix4f matrix4f) {
        matrix4f.get(this.a);
        this.G.addUpdatedUniform(this);
    }

    @Override
    public void upload() {
        boolean bl = B[6];
        bl += B[7];
        GL20.glUniformMatrix4fv((int)this.getLocation(), (boolean)(bl += B[8]), (FloatBuffer)this.a);
    }

    @Override
    public void close() {
        if (!this.A) {
            MemoryUtil.memFree((Buffer)this.a);
            int n = B[9];
            n ^= B[10];
            this.A = n ^= B[11];
        }
    }

    static {
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.a();
    }

    public static void a() {
        B = new int[0xD657 ^ 0xD65B];
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0xFD9D ^ 0xFD9E] = 0xFFFF02FA ^ 0xFD9E;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x30C3 ^ 0x30CB] = 0xFFFFCF1F ^ 0x30CB;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0xF03D ^ 0xF039] = 0xF07A ^ 0xF039;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x7E8F ^ 0x7E88] = 0xFFFF810D ^ 0x7E88;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x8448 ^ 0x8449] = 0x8442 ^ 0x8449;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x407E ^ 0x4075] = 0xFFFFBFE6 ^ 0x4075;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x2193 ^ 0x2195] = 0x2132 ^ 0x2195;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x3A13 ^ 0x3A16] = 0xFFFFC5B1 ^ 0x3A16;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x5E1F ^ 0x5E16] = 0xFFFFA1B3 ^ 0x5E16;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0xD17F ^ 0xD17F] = 0xFFFF2EA7 ^ 0xD17F;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x2AE0 ^ 0x2AEA] = 0x2ADD ^ 0x2AEA;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.A.B[0x6513 ^ 0x6511] = 0xFFFF9AC2 ^ 0x6511;
    }
}

