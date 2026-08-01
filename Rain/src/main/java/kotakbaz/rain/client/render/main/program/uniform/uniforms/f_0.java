/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.a_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector3i;
import org.lwjgl.opengl.GL20;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.f
 */
public class f_0
extends D<Vector3i> {
    public f_0(String name, int location, a_0 glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform3i((int)this.getLocation(), (int)((Vector3i)this.J).x, (int)((Vector3i)this.J).y, (int)((Vector3i)this.J).z);
    }
}

