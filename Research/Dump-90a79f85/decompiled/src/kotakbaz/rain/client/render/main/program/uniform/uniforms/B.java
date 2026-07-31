/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2f
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.A;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector2f;
import org.lwjgl.opengl.GL20;

public class B
extends D<Vector2f> {
    public B(String string, int n, A a2) {
        super(string, n, a2);
    }

    @Override
    public void upload() {
        GL20.glUniform2f((int)this.getLocation(), (float)((Vector2f)this.J).x, (float)((Vector2f)this.J).y);
    }
}

