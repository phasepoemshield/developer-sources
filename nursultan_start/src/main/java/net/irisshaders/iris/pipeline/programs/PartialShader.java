/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.IrisRenderSystem
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Objects;
import net.irisshaders.iris.gl.IrisRenderSystem;

public final class PartialShader {
    private final int program;
    private final int vertexS;
    private final int fragS;
    private final int geometryS;
    private final int tessContS;
    private final int tessEvalS;
    private boolean hasUnbound = false;

    public PartialShader(int n, int n2, int n3, int n4, int n5, int n6) {
        this.program = n;
        this.vertexS = n2;
        this.fragS = n3;
        this.geometryS = n4;
        this.tessContS = n5;
        this.tessEvalS = n6;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        PartialShader partialShader = (PartialShader)object;
        return this.program == partialShader.program && this.vertexS == partialShader.vertexS && this.fragS == partialShader.fragS && this.geometryS == partialShader.geometryS && this.tessContS == partialShader.tessContS && this.tessEvalS == partialShader.tessEvalS;
    }

    public String toString() {
        return "PartialShader[program=" + this.program + ", vertexS=" + this.vertexS + ", fragS=" + this.fragS + ", geometryS=" + this.geometryS + ", tessContS=" + this.tessContS + ", tessEvalS=" + this.tessEvalS + "]";
    }

    public int hashCode() {
        return Objects.hash(this.program, this.vertexS, this.fragS, this.geometryS, this.tessContS, this.tessEvalS);
    }

    private static void detachIfValid(int n, int n2) {
        if (n2 >= 0) {
            IrisRenderSystem.detachShader((int)n, (int)n2);
            GlStateManager.glDeleteShader((int)n2);
        }
    }

    public int program() {
        return this.program;
    }

    public int getFinally() {
        if (!this.hasUnbound) {
            this.hasUnbound = true;
            PartialShader.detachIfValid(this.program, this.vertexS);
            PartialShader.detachIfValid(this.program, this.fragS);
            PartialShader.detachIfValid(this.program, this.geometryS);
            PartialShader.detachIfValid(this.program, this.tessContS);
            PartialShader.detachIfValid(this.program, this.tessEvalS);
        }
        return this.program;
    }
}

