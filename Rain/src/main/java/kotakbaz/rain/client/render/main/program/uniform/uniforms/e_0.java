/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.a_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.e
 */
public class e_0
extends D<Vector3f> {
    public e_0(String name, int location, a_0 glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform3f((int)this.getLocation(), (float)((Vector3f)this.J).x, (float)((Vector3f)this.J).y, (float)((Vector3f)this.J).z);
    }
}

