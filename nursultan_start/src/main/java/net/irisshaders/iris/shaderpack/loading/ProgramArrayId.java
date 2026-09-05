/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.loading;

import net.irisshaders.iris.shaderpack.loading.ProgramGroup;

public enum ProgramArrayId {
    Setup(ProgramGroup.Setup, 100),
    Begin(ProgramGroup.Begin, 100),
    ShadowComposite(ProgramGroup.ShadowComposite, 100),
    Prepare(ProgramGroup.Prepare, 100),
    Deferred(ProgramGroup.Deferred, 100),
    Composite(ProgramGroup.Composite, 100);

    private final ProgramGroup group;
    private final int numPrograms;

    private ProgramArrayId(ProgramGroup programGroup, int n2) {
        this.group = programGroup;
        this.numPrograms = n2;
    }

    public ProgramGroup getGroup() {
        return this.group;
    }

    public int getNumPrograms() {
        return this.numPrograms;
    }

    public String getSourcePrefix() {
        return this.group.getBaseName();
    }
}

