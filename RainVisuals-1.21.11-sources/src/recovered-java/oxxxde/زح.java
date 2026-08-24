/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import oxxxde.\u0637\u064a;

public abstract class \u0632\u062d<T>
extends \u0637\u064a {
    protected T value = null;

    public void set(T value) {
        this.value = value;
        this.program.addUpdatedUniform(this);
    }

    public \u0632\u062d(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }
}

