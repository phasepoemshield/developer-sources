/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package kotakbaz.rain.client.render.main.program.uniform;

import lombok.Generated;

public abstract class A
implements AutoCloseable {
    protected final String F;
    protected final int g;
    protected final kotakbaz.rain.client.render.main.program.A G;

    public A(String string, int n, kotakbaz.rain.client.render.main.program.A a2) {
        super();
        this.F = string;
        this.g = n;
        this.G = a2;
    }

    public abstract void upload();

    @Override
    public void close() {
    }

    @Generated
    public String getName() {
        return this.F;
    }

    @Generated
    public int getLocation() {
        return this.g;
    }

    @Generated
    public kotakbaz.rain.client.render.main.program.A getProgram() {
        return this.G;
    }
}

