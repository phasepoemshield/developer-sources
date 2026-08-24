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

public class \u0630\u0621
extends \u0632\u062d<Float> {
    private boolean hasPrimitiveValue;
    private float primitiveValue;

    @Override
    public void set(Float value) {
        this.primitiveValue = value.floatValue();
        this.hasPrimitiveValue = true;
        this.program.addUpdatedUniform(this);
    }

    @Override
    public void set(float value) {
        this.primitiveValue = value;
        this.hasPrimitiveValue = true;
        this.program.addUpdatedUniform(this);
    }

    public \u0630\u0621(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniform1f((int)this.getLocation(), (float)(this.hasPrimitiveValue ? this.primitiveValue : ((Float)this.value).floatValue()));
    }
}

