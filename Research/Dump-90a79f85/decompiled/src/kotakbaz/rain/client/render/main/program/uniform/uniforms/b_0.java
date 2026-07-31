/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.A;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.lwjgl.opengl.GL20;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.b
 */
public class b_0
extends D<float[]> {
    public b_0(String string, int n, A a2) {
        super(string, n, a2);
    }

    @Override
    public void upload() {
        GL20.glUniform1fv((int)this.getLocation(), (float[])((float[])this.J));
    }
}

