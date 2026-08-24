/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3i
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector3i;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u0635\u064d
extends \u0632\u062d<Vector3i> {
    public \u0635\u064d(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform3i((int)this.getLocation(), (int)((Vector3i)this.value).x, (int)((Vector3i)this.value).y, (int)((Vector3i)this.value).z);
    }
}

