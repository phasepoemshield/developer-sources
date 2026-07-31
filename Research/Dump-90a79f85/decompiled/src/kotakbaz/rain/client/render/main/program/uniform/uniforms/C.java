/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4i
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.A;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.D;
import org.joml.Vector4i;
import org.lwjgl.opengl.GL20;

public class C
extends D<Vector4i> {
    public C(String string, int n, A a2) {
        super(string, n, a2);
    }

    @Override
    public void upload() {
        GL20.glUniform4i((int)this.getLocation(), (int)((Vector4i)this.J).x, (int)((Vector4i)this.J).y, (int)((Vector4i)this.J).z, (int)((Vector4i)this.J).w);
    }
}

