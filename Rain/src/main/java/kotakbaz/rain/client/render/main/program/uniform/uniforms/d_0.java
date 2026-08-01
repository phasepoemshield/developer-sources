/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.a_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector2i;
import org.lwjgl.opengl.GL20;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.d
 */
public class d_0
extends D<Vector2i> {
    public d_0(String name, int location, a_0 glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform2i((int)this.getLocation(), (int)((Vector2i)this.J).x, (int)((Vector2i)this.J).y);
    }
}

