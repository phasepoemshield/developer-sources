/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform;

import lombok.Generated;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.A
 */
public abstract class a_0
implements AutoCloseable {
    protected final String F;
    protected final int g;
    protected final kotakbaz.rain.client.render.main.program.a_0 G;

    public a_0(String name, int location, kotakbaz.rain.client.render.main.program.a_0 program) {
        this.F = name;
        this.g = location;
        this.G = program;
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
    public kotakbaz.rain.client.render.main.program.a_0 getProgram() {
        return this.G;
    }
}

