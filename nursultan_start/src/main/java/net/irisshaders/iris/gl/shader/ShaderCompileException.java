/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.shader;

public class ShaderCompileException
extends RuntimeException {
    private final String filename;
    private final String error;

    public String getFilename() {
        return this.filename;
    }

    public ShaderCompileException(String string, String string2) {
        super(string + ": " + string2);
        this.filename = string;
        this.error = string2;
    }

    public ShaderCompileException(String string, Exception exception) {
        super(exception);
        this.filename = string;
        this.error = exception.getMessage();
    }

    @Override
    public String getMessage() {
        return this.filename + ": " + super.getMessage();
    }

    public String getError() {
        return this.error;
    }
}

