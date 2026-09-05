/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

public enum ShaderType {
    VERTEX(35633),
    GEOMETRY(36313),
    TESS_CONTROL(36488),
    TESS_EVALUATION(36487),
    FRAGMENT(35632);

    public final int id;

    private ShaderType(int n2) {
        this.id = n2;
    }

    public static ShaderType fromGlShaderType(int n) {
        for (ShaderType shaderType : ShaderType.values()) {
            if (shaderType.id != n) continue;
            return shaderType;
        }
        return null;
    }
}

