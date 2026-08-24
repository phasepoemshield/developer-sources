/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import lombok.Generated;

public abstract class \u0637\u064a
implements AutoCloseable {
    protected final String name;
    protected final int location;
    protected final GlProgram program;

    public \u0637\u064a(String name, int location, GlProgram program) {
        this.name = name;
        this.location = location;
        this.program = program;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public int getLocation() {
        return this.location;
    }

    public abstract void upload();

    @Override
    public void close() {
    }

    @Generated
    public GlProgram getProgram() {
        return this.program;
    }
}

