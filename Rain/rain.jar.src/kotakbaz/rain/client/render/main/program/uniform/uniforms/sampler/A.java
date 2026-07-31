/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import kotakbaz.rain.client.render.main.program.a_0;
import lombok.Generated;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.GlTextureView;
import org.lwjgl.opengl.GL20;

public class A
extends kotakbaz.rain.client.render.main.program.uniform.a_0 {
    private final int a;
    private Runnable A = null;
    public static int[] B;

    public A(String name, int location, a_0 glProgram) {
        super(name, location, glProgram);
        int n2 = B[0];
        n2 -= B[1];
        this.a = glProgram.getSamplersAmount() + (n2 += B[2]);
        glProgram.setSamplersAmount(this.a);
    }

    public void set(kotakbaz.rain.client.render.texture.A texture) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a_0.A.uploadConsumer().accept(this, texture);
        this.G.addUpdatedUniform(this);
    }

    public void set(GlTextureView textureView) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a_0.b.uploadConsumer().accept(this, textureView);
        this.G.addUpdatedUniform(this);
    }

    public void set(GlTexture textureView) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a_0.B.uploadConsumer().accept(this, textureView);
        this.G.addUpdatedUniform(this);
    }

    public void set(int textureId) {
        this.A = () -> kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a_0.c.uploadConsumer().accept(this, textureId);
        this.G.addUpdatedUniform(this);
    }

    public <T> void set(kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a_0<T> applier, T texture) {
        this.A = () -> applier.uploadConsumer().accept(this, (A)texture);
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

