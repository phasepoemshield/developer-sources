/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u0635\u0622
extends \u0632\u062d<float[]> {
    public \u0635\u0622(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform1fv((int)this.getLocation(), (float[])((float[])this.value));
    }
}

