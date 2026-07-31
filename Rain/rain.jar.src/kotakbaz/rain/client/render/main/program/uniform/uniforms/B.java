/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.a_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector2f;
import org.lwjgl.opengl.GL20;

public class B
extends D<Vector2f> {
    public B(String name, int location, a_0 glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform2f((int)this.getLocation(), (float)((Vector2f)this.J).x, (float)((Vector2f)this.J).y);
    }
}

