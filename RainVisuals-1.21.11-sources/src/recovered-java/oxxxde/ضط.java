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

public class \u0636\u0637
extends \u0632\u062d<Integer> {
    @Override
    public void upload() {
        GL20.glUniform1i((int)this.getLocation(), (int)((Integer)this.value));
    }

    public \u0636\u0637(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }
}

