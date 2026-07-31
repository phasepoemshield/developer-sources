/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms;

import kotakbaz.rain.client.render.main.program.A;

public abstract class D<T>
extends kotakbaz.rain.client.render.main.program.uniform.A {
    protected T J = null;

    public D(String string, int n, A a2) {
        super(string, n, a2);
    }

    public void set(T t2) {
        this.J = t2;
        this.G.addUpdatedUniform(this);
    }
}

