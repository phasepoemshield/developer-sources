/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.shader.ShaderType
 */
package net.irisshaders.iris.pipeline.transform;

import net.irisshaders.iris.gl.shader.ShaderType;

public enum PatchShaderType {
    VERTEX(ShaderType.VERTEX, ".vsh"),
    GEOMETRY(ShaderType.GEOMETRY, ".gsh"),
    TESS_CONTROL(ShaderType.TESSELATION_CONTROL, ".tcs"),
    TESS_EVAL(ShaderType.TESSELATION_EVAL, ".tes"),
    FRAGMENT(ShaderType.FRAGMENT, ".fsh"),
    COMPUTE(ShaderType.COMPUTE, ".csh");

    public final ShaderType glShaderType;
    public final String extension;

    private PatchShaderType(ShaderType shaderType, String string2) {
        this.glShaderType = shaderType;
        this.extension = string2;
    }

    public static PatchShaderType[] fromGlShaderType(ShaderType shaderType) {
        PatchShaderType[] patchShaderTypeArray;
        switch (shaderType) {
            case VERTEX: {
                PatchShaderType[] patchShaderTypeArray2 = new PatchShaderType[1];
                patchShaderTypeArray = patchShaderTypeArray2;
                patchShaderTypeArray2[0] = VERTEX;
                break;
            }
            case GEOMETRY: {
                PatchShaderType[] patchShaderTypeArray3 = new PatchShaderType[1];
                patchShaderTypeArray = patchShaderTypeArray3;
                patchShaderTypeArray3[0] = GEOMETRY;
                break;
            }
            case TESSELATION_CONTROL: {
                PatchShaderType[] patchShaderTypeArray4 = new PatchShaderType[1];
                patchShaderTypeArray = patchShaderTypeArray4;
                patchShaderTypeArray4[0] = TESS_CONTROL;
                break;
            }
            case TESSELATION_EVAL: {
                PatchShaderType[] patchShaderTypeArray5 = new PatchShaderType[1];
                patchShaderTypeArray = patchShaderTypeArray5;
                patchShaderTypeArray5[0] = TESS_EVAL;
                break;
            }
            case COMPUTE: {
                PatchShaderType[] patchShaderTypeArray6 = new PatchShaderType[1];
                patchShaderTypeArray = patchShaderTypeArray6;
                patchShaderTypeArray6[0] = COMPUTE;
                break;
            }
            case FRAGMENT: {
                PatchShaderType[] patchShaderTypeArray7 = new PatchShaderType[1];
                patchShaderTypeArray = patchShaderTypeArray7;
                patchShaderTypeArray7[0] = FRAGMENT;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown shader type: " + String.valueOf(shaderType));
            }
        }
        return patchShaderTypeArray;
    }
}

