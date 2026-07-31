/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_10868
 *  net.minecraft.class_11391
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a_0;
import lombok.Generated;
import net.minecraft.class_10868;
import net.minecraft.class_11391;
import org.lwjgl.opengl.GL20;

public class A
extends kotakbaz.rain.client.render.main.program.uniform.A {
    private final int a;
    private Runnable A = null;
    public static int[] B;

    public A(String string, int n, kotakbaz.rain.client.render.main.program.A a2) {
        super(string, n, a2);
        int n2 = B[0];
        n2 -= B[1];
        this.a = a2.getSamplersAmount() + (n2 += B[2]);
        a2.setSamplersAmount(this.a);
    }

    public void set(kotakbaz.rain.client.render.texture.A a2) {
        this.A = () -> a_0.A.uploadConsumer().accept(this, a2);
        this.G.addUpdatedUniform(this);
    }

    public void set(class_11391 class_113912) {
        this.A = () -> a_0.b.uploadConsumer().accept(this, class_113912);
        this.G.addUpdatedUniform(this);
    }

    public void set(class_10868 class_108682) {
        this.A = () -> a_0.B.uploadConsumer().accept(this, class_108682);
        this.G.addUpdatedUniform(this);
    }

    public void set(int n) {
        this.A = () -> a_0.c.uploadConsumer().accept(this, n);
        this.G.addUpdatedUniform(this);
    }

    public <T> void set(a_0<T> a_02, T t2) {
        this.A = () -> a_02.uploadConsumer().accept(this, (A)t2);
        this.G.addUpdatedUniform(this);
    }

    @Override
    public void upload() {
        if (this.A != null) {
            GL20.glUniform1i((int)this.g, (int)this.getSamplerId());
            this.A.run();
        }
    }

    @Generated
    public int getSamplerId() {
        return this.a;
    }

    static {
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A.a();
    }

    public static void a() {
        B = new int[0xCAAA ^ 0xCAA9];
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A.B[0x241D ^ 0x241C] = 0x241E ^ 0x241C;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A.B[0xE3FC ^ 0xE3FC] = 0xE3CF ^ 0xE3FC;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A.B[0xACEE ^ 0xACEC] = 0xFFFF533C ^ 0xACEC;
    }
}

