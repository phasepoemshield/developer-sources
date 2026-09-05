/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 */
package net.irisshaders.iris.shaderpack.programs;

import java.util.Optional;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.ProgramDirectives;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public class ProgramSource {
    private final String name;
    private final String vertexSource;
    private final String geometrySource;
    private final String tessControlSource;
    private final String tessEvalSource;
    private final String fragmentSource;
    private final ProgramDirectives directives;
    private final ProgramSet parent;

    public boolean isValid() {
        return this.vertexSource != null && this.fragmentSource != null;
    }

    private ProgramSource(String string, String string2, String string3, String string4, String string5, String string6, ProgramDirectives programDirectives, ProgramSet programSet) {
        this.name = string;
        this.vertexSource = string2;
        this.geometrySource = string3;
        this.tessControlSource = string4;
        this.tessEvalSource = string5;
        this.fragmentSource = string6;
        this.directives = programDirectives;
        this.parent = programSet;
    }

    public ProgramSource(String string, String string2, String string3, String string4, String string5, String string6, ProgramSet programSet, ShaderProperties shaderProperties, BlendModeOverride blendModeOverride) {
        this.name = string;
        this.vertexSource = string2;
        this.geometrySource = string3;
        this.tessControlSource = string4;
        this.tessEvalSource = string5;
        this.fragmentSource = string6;
        this.parent = programSet;
        this.directives = new ProgramDirectives(this, shaderProperties, PackRenderTargetDirectives.BASELINE_SUPPORTED_RENDER_TARGETS, blendModeOverride);
    }

    public String getName() {
        return this.name;
    }

    public ProgramSet getParent() {
        return this.parent;
    }

    public Optional<String> getGeometrySource() {
        return Optional.ofNullable(this.geometrySource);
    }

    public Optional<String> getVertexSource() {
        return Optional.ofNullable(this.vertexSource);
    }

    public Optional<String> getTessEvalSource() {
        return Optional.ofNullable(this.tessEvalSource);
    }

    public Optional<String> getFragmentSource() {
        return Optional.ofNullable(this.fragmentSource);
    }

    public ProgramDirectives getDirectives() {
        return this.directives;
    }

    public Optional<String> getTessControlSource() {
        return Optional.ofNullable(this.tessControlSource);
    }

    public Optional<ProgramSource> requireValid() {
        if (this.isValid()) {
            return Optional.of(this);
        }
        return Optional.empty();
    }

    public ProgramSource withDirectiveOverride(ProgramDirectives programDirectives) {
        return new ProgramSource(this.name, this.vertexSource, this.geometrySource, this.tessControlSource, this.tessEvalSource, this.fragmentSource, programDirectives, this.parent);
    }
}

