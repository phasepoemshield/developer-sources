/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.a_0;

public abstract class D<T>
extends kotakbaz.rain.client.render.main.program.uniform.a_0 {
    protected T J = null;

    public D(String name, int location, a_0 glProgram) {
        super(name, location, glProgram);
    }

    public void set(T value2) {
        this.J = value2;
        this.G.addUpdatedUniform(this);
    }
}

