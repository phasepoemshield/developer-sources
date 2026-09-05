/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2f
 *  org.joml.Vector3i
 */
package net.irisshaders.iris.shaderpack.programs;

import java.util.Optional;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.shaderpack.properties.IndirectPointer;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;
import org.joml.Vector2f;
import org.joml.Vector3i;

public class ComputeSource {
    private final String name;
    private final String source;
    private final ProgramSet parent;
    private final IndirectPointer indirectPointer;
    private Vector3i workGroups;
    private Vector2f workGroupRelative;

    public boolean isValid() {
        return this.source != null;
    }

    public ComputeSource(String string, String string2, ProgramSet programSet, ShaderProperties shaderProperties) {
        this.name = string;
        this.source = string2;
        this.parent = programSet;
        this.indirectPointer = (IndirectPointer)((Object)shaderProperties.getIndirectPointers().get((Object)string));
    }

    public String getName() {
        return this.name;
    }

    public ProgramSet getParent() {
        return this.parent;
    }

    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }

    public Vector3i getWorkGroups() {
        return this.workGroups;
    }

    public IndirectPointer getIndirectPointer() {
        return this.indirectPointer;
    }

    public Vector2f getWorkGroupRelative() {
        return this.workGroupRelative;
    }

    public Optional<ComputeSource> requireValid() {
        if (this.isValid()) {
            return Optional.of(this);
        }
        return Optional.empty();
    }

    public void setWorkGroups(Vector3i vector3i) {
        this.workGroups = vector3i;
    }

    public void setWorkGroupRelative(Vector2f vector2f) {
        this.workGroupRelative = vector2f;
    }
}

