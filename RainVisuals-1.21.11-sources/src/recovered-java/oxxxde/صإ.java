/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector2i;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u0635\u0625
extends \u0632\u062d<Vector2i> {
    public \u0635\u0625(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform2i((int)this.getLocation(), (int)((Vector2i)this.value).x, (int)((Vector2i)this.value).y);
    }
}

