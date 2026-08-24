/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4i
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector4i;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u0637\u064e
extends \u0632\u062d<Vector4i> {
    public \u0637\u064e(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform4i((int)this.getLocation(), (int)((Vector4i)this.value).x, (int)((Vector4i)this.value).y, (int)((Vector4i)this.value).z, (int)((Vector4i)this.value).w);
    }
}

