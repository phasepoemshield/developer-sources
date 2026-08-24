/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2f
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector2f;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u062f\u0637
extends \u0632\u062d<Vector2f> {
    @Override
    public void upload() {
        GL20.glUniform2f((int)this.getLocation(), (float)((Vector2f)this.value).x, (float)((Vector2f)this.value).y);
    }

    public \u062f\u0637(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }
}

