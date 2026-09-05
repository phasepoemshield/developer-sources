/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.program.ComputeProgram
 */
package net.irisshaders.iris.pipeline;

import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.pipeline.CompositeRenderer$Pass;

class CompositeRenderer$ComputeOnlyPass
extends CompositeRenderer$Pass {
    CompositeRenderer$ComputeOnlyPass() {
    }

    @Override
    protected void destroy() {
        for (ComputeProgram computeProgram : this.computes) {
            if (computeProgram == null) continue;
            computeProgram.destroy();
        }
    }
}

