/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u0631\u0647
extends \u0632\u062d<Vector4f> {
    @Override
    public void upload() {
        GL20.glUniform4f((int)this.getLocation(), (float)((Vector4f)this.value).x, (float)((Vector4f)this.value).y, (float)((Vector4f)this.value).z, (float)((Vector4f)this.value).w);
    }

    public \u0631\u0647(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }
}

