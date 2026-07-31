/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.lwjgl.opengl.GL20;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.a
 */
public class a_0
extends D<Float> {
    public a_0(String name, int location, kotakbaz.rain.client.render.main.program.a_0 glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform1f((int)this.getLocation(), (float)((Float)this.J).floatValue());
    }
}

