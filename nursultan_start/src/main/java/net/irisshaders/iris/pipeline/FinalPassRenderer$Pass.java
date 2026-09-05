/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  net.irisshaders.iris.gl.program.ComputeProgram
 *  net.irisshaders.iris.gl.program.Program
 */
package net.irisshaders.iris.pipeline;

import com.google.common.collect.ImmutableSet;
import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.gl.program.Program;

final class FinalPassRenderer$Pass {
    Program program;
    ComputeProgram[] computes;
    ImmutableSet<Integer> stageReadsFromAlt;
    ImmutableSet<Integer> mipmappedBuffers;

    FinalPassRenderer$Pass() {
    }

    void destroy() {
        this.program.destroy();
    }
}

