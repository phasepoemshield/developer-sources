/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04195
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 */
package net.irisshaders.iris.helpers;

import minecraft.class04195;
import net.irisshaders.iris.gl.shader.ShaderCompileException;

public class FakeChainedJsonException
extends class04195 {
    private final ShaderCompileException trueException;

    public FakeChainedJsonException(ShaderCompileException shaderCompileException) {
        super("", (Throwable)shaderCompileException);
        this.trueException = shaderCompileException;
    }

    public ShaderCompileException getTrueException() {
        return this.trueException;
    }
}

