/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.exceptions.impl.d_0;
import kotakbaz.rain.client.render.main.program.a_0;
import lombok.Generated;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL31;

public class a
extends kotakbaz.rain.client.render.main.program.uniform.a_0 {
    private final int a;
    private Runnable A;
    public static int[] B;

    public a(String name, int location, a_0 glProgram) {
        long l2 = 5342828570364493662L;
        long l3 = 5113510172782656330L;
        super(name, location, glProgram);
        this.A = null;
        int n2 = B[0];
        n2 ^= B[1];
        long l4 = l3;
        int n3 = B[3];
        n3 -= B[4];
        l3 = l4 ^ ((long)GL31.glGetUniformBlockIndex((int)glProgram.getId(), (CharSequence)name) << (n2 += B[2]) ^ l4) & -1L << (n3 -= B[5]);
        int n4 = B[6];
        n4 ^= B[7];
        int n5 = B[9];
        n5 ^= B[10];
        if ((int)(l3 >>> (n4 -= B[8])) == (n5 -= B[11])) {
            kotakbaz.rain.client.render.main.exceptions.a_0.printAndExit(new d_0(name, glProgram.getName()));
            int n6 = B[12];
            n6 -= B[13];
            this.a = n6 -= B[14];
        } else {
            int n7 = B[15];
            n7 -= B[16];
            this.a = glProgram.getBuffersIndexAmount() + (n7 ^= B[17]);
            glProgram.setBuffersIndexAmount(this.a);
            int n8 = B[18];
            n8 += B[19];
            GL31.glUniformBlockBinding((int)glProgram.getId(), (int)((int)(l3 >>> (n8 -= B[20]))), (int)this.a);
        }
    }

    public void set(GpuBufferSlice gpuBufferSlice) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0.A.uploadConsumer().accept(this, gpuBufferSlice);
        this.G.addUpdatedUniform(this);
    }

    public void set(GlGpuBuffer glGpuBuffer) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0.b.uploadConsumer().accept(this, glGpuBuffer);
        this.G.addUpdatedUniform(this);
    }

    public void set(b gpuBuffer) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0.B.uploadConsumer().accept(this, gpuBuffer);
        this.G.addUpdatedUniform(this);
    }

    public <T> void set(kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0<T> uploader, T buffer) {
        this.A = () -> uploader.uploadConsumer().accept(this, (a)buffer);
        this.G.addUpdatedUniform(this);
    }

    @Override
    public void upload() {
        if (this.A != null) {
            this.A.run();
        }
    }

    @Generated
    public int getBufferIndex() {
        return this.a;
    }

    static {
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.a();
    }

    public static void a() {
        B = new int[0xA8AA ^ 0xA8BF];
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xE712 ^ 0xE702] = 0xFFFF18FC ^ 0xE702;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x101B0 ^ 0x101BD] = 0x101D8 ^ 0x101BD;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x845B ^ 0x845D] = 0x8421 ^ 0x845D;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x782 ^ 0x787] = 0xFFFFF840 ^ 0x787;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x87E ^ 0x874] = 0xFFFFF7B8 ^ 0x874;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xAB20 ^ 0xAB24] = 0xFFFF54F3 ^ 0xAB24;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xE2B7 ^ 0xE2A4] = 0xE2F3 ^ 0xE2A4;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xCE9E ^ 0xCE96] = 0xCE8D ^ 0xCE96;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x3E4 ^ 0x3F6] = 0xFFFFFCBB ^ 0x3F6;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xC5DD ^ 0xC5D6] = 0xFFFF3A44 ^ 0xC5D6;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x98D5 ^ 0x98DC] = 0x9881 ^ 0x98DC;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x31D ^ 0x31F] = 0xFFFFFCE7 ^ 0x31F;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x9685 ^ 0x9682] = 0x96C5 ^ 0x9682;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xCF80 ^ 0xCF81] = 0xFFFF300F ^ 0xCF81;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x2DFB ^ 0x2DF5] = 0xFFFFD255 ^ 0x2DF5;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x681A ^ 0x681A] = 0xFFFF97BC ^ 0x681A;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x2BB4 ^ 0x2BB8] = 0x2BBC ^ 0x2BB8;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x4415 ^ 0x4416] = 0xFFFFBBA8 ^ 0x4416;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0xA1C7 ^ 0xA1D6] = 0xFFFF5E4D ^ 0xA1D6;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x875E ^ 0x8751] = 0xFFFF78C9 ^ 0x8751;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.B[0x6143 ^ 0x6157] = 0xFFFF9ED3 ^ 0x6157;
    }
}

