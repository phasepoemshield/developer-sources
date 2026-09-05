/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.program.ComputeProgram
 */
package net.irisshaders.iris.shadows;

import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.shadows.ShadowCompositeRenderer$Pass;

class ShadowCompositeRenderer$ComputeOnlyPass
extends ShadowCompositeRenderer$Pass {
    ShadowCompositeRenderer$ComputeOnlyPass() {
    }

    @Override
    protected void destroy() {
        for (ComputeProgram computeProgram : this.computes) {
            if (computeProgram == null) continue;
            computeProgram.destroy();
        }
    }
}

