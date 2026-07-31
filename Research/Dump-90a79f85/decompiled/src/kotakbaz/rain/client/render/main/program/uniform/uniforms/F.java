/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.A;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL20;

public class F
extends D<Vector4f> {
    public F(String string, int n, A a2) {
        super(string, n, a2);
    }

    @Override
    public void upload() {
        GL20.glUniform4f((int)this.getLocation(), (float)((Vector4f)this.J).x, (float)((Vector4f)this.J).y, (float)((Vector4f)this.J).z, (float)((Vector4f)this.J).w);
    }
}

