/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0632\u062d;

public class \u0627\u063a
extends \u0632\u062d<Vector3f> {
    public \u0627\u063a(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform3f((int)this.getLocation(), (float)((Vector3f)this.value).x, (float)((Vector3f)this.value).y, (float)((Vector3f)this.value).z);
    }
}

