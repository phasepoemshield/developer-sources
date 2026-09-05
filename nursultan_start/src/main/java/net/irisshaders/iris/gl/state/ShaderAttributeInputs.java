/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 */
package net.irisshaders.iris.gl.state;

import com.mojang.blaze3d.vertex.VertexFormat;

public class ShaderAttributeInputs {
    private boolean ie;
    private boolean color;
    private boolean tex;
    private boolean overlay;
    private boolean light;
    private boolean normal;
    private boolean newLines;
    private boolean glint;
    private boolean text;

    public boolean isText() {
        return this.text;
    }

    public boolean hasLight() {
        return this.light;
    }

    public ShaderAttributeInputs(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.color = bl;
        this.tex = bl2;
        this.overlay = bl3;
        this.light = bl4;
        this.normal = bl5;
    }

    public ShaderAttributeInputs(VertexFormat vertexFormat, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.ie = bl5;
        this.text = bl4;
        this.glint = bl3;
        this.newLines = bl2;
        vertexFormat.getElementAttributeNames().forEach(string -> {
            if ("Color".equals(string)) {
                this.color = true;
            }
            if ("LineWidth".equals(string)) {
                this.newLines = true;
            }
            if ("UV0".equals(string)) {
                this.tex = true;
            }
            if ("UV1".equals(string)) {
                this.overlay = true;
            }
            if ("UV2".equals(string) && !bl) {
                this.light = true;
            }
            if ("Normal".equals(string)) {
                this.normal = true;
            }
        });
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ShaderAttributeInputs shaderAttributeInputs = (ShaderAttributeInputs)object;
        if (this.color != shaderAttributeInputs.color) {
            return false;
        }
        if (this.tex != shaderAttributeInputs.tex) {
            return false;
        }
        if (this.overlay != shaderAttributeInputs.overlay) {
            return false;
        }
        if (this.light != shaderAttributeInputs.light) {
            return false;
        }
        if (this.normal != shaderAttributeInputs.normal) {
            return false;
        }
        if (this.newLines != shaderAttributeInputs.newLines) {
            return false;
        }
        if (this.glint != shaderAttributeInputs.glint) {
            return false;
        }
        return this.text == shaderAttributeInputs.text;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.color ? 1231 : 1237);
        n2 = 31 * n2 + (this.tex ? 1231 : 1237);
        n2 = 31 * n2 + (this.overlay ? 1231 : 1237);
        n2 = 31 * n2 + (this.light ? 1231 : 1237);
        n2 = 31 * n2 + (this.normal ? 1231 : 1237);
        n2 = 31 * n2 + (this.newLines ? 1231 : 1237);
        n2 = 31 * n2 + (this.glint ? 1231 : 1237);
        n2 = 31 * n2 + (this.text ? 1231 : 1237);
        return n2;
    }

    public boolean hasOverlay() {
        return this.overlay;
    }

    public boolean hasNormal() {
        return this.normal;
    }

    public boolean hasColor() {
        return this.color;
    }

    public boolean isGlint() {
        return this.glint;
    }

    public boolean isNewLines() {
        return this.newLines;
    }

    public boolean hasTex() {
        return this.tex;
    }

    public boolean isIE() {
        return this.ie;
    }
}

