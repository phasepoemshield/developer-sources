/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  lombok.Generated
 *  net.minecraft.class_10859
 *  org.lwjgl.opengl.GL31
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.exceptions.impl.d_0;
import kotakbaz.rain.client.render.main.program.A;
import lombok.Generated;
import net.minecraft.class_10859;
import org.lwjgl.opengl.GL31;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a
 */
public class a_0
extends kotakbaz.rain.client.render.main.program.uniform.A {
    private final int a;
    private Runnable A;
    public static int[] B;

    public a_0(String string, int n, A a2) {
        long l = 5342828570364493662L;
        long l2 = 5113510172782656330L;
        super(string, n, a2);
        this.A = null;
        int n2 = B[0];
        n2 ^= B[1];
        long l3 = l2;
        int n3 = B[3];
        n3 -= B[4];
        l2 = l3 ^ ((long)GL31.glGetUniformBlockIndex((int)a2.getId(), (CharSequence)string) << (n2 += B[2]) ^ l3) & -1L << (n3 -= B[5]);
        int n4 = B[6];
        n4 ^= B[7];
        int n5 = B[9];
        n5 ^= B[10];
        if ((int)(l2 >>> (n4 -= B[8])) == (n5 -= B[11])) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new d_0(string, a2.getName()));
            int n6 = B[12];
            n6 -= B[13];
            this.a = n6 -= B[14];
        } else {
            int n7 = B[15];
            n7 -= B[16];
            this.a = a2.getBuffersIndexAmount() + (n7 ^= B[17]);
            a2.setBuffersIndexAmount(this.a);
            int n8 = B[18];
            n8 += B[19];
            GL31.glUniformBlockBinding((int)a2.getId(), (int)((int)(l2 >>> (n8 -= B[20]))), (int)this.a);
        }
    }

    public void set(GpuBufferSlice gpuBufferSlice) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.A.A.uploadConsumer().accept(this, gpuBufferSlice);
        this.G.addUpdatedUniform(this);
    }

    public void set(class_10859 class_108592) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.A.b.uploadConsumer().accept(this, class_108592);
        this.G.addUpdatedUniform(this);
    }

    public void set(b b2) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.A.B.uploadConsumer().accept(this, b2);
        this.G.addUpdatedUniform(this);
    }

    public <T> void set(kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.A<T> a2, T t2) {
        this.A = () -> a2.uploadConsumer().accept(this, (a_0)t2);
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
        a_0.a();
    }

    public static void a() {
        B = new int[0xA8AA ^ 0xA8BF];
        a_0.B[0xE712 ^ 0xE702] = 0xFFFF18FC ^ 0xE702;
        a_0.B[0x101B0 ^ 0x101BD] = 0x101D8 ^ 0x101BD;
        a_0.B[0x845B ^ 0x845D] = 0x8421 ^ 0x845D;
        a_0.B[0x782 ^ 0x787] = 0xFFFFF840 ^ 0x787;
        a_0.B[0x87E ^ 0x874] = 0xFFFFF7B8 ^ 0x874;
        a_0.B[0xAB20 ^ 0xAB24] = 0xFFFF54F3 ^ 0xAB24;
        a_0.B[0xE2B7 ^ 0xE2A4] = 0xE2F3 ^ 0xE2A4;
        a_0.B[0xCE9E ^ 0xCE96] = 0xCE8D ^ 0xCE96;
        a_0.B[0x3E4 ^ 0x3F6] = 0xFFFFFCBB ^ 0x3F6;
        a_0.B[0xC5DD ^ 0xC5D6] = 0xFFFF3A44 ^ 0xC5D6;
        a_0.B[0x98D5 ^ 0x98DC] = 0x9881 ^ 0x98DC;
        a_0.B[0x31D ^ 0x31F] = 0xFFFFFCE7 ^ 0x31F;
        a_0.B[0x9685 ^ 0x9682] = 0x96C5 ^ 0x9682;
        a_0.B[0xCF80 ^ 0xCF81] = 0xFFFF300F ^ 0xCF81;
        a_0.B[0x2DFB ^ 0x2DF5] = 0xFFFFD255 ^ 0x2DF5;
        a_0.B[0x681A ^ 0x681A] = 0xFFFF97BC ^ 0x681A;
        a_0.B[0x2BB4 ^ 0x2BB8] = 0x2BBC ^ 0x2BB8;
        a_0.B[0x4415 ^ 0x4416] = 0xFFFFBBA8 ^ 0x4416;
        a_0.B[0xA1C7 ^ 0xA1D6] = 0xFFFF5E4D ^ 0xA1D6;
        a_0.B[0x875E ^ 0x8751] = 0xFFFF78C9 ^ 0x8751;
        a_0.B[0x6143 ^ 0x6157] = 0xFFFF9ED3 ^ 0x6157;
    }
}

