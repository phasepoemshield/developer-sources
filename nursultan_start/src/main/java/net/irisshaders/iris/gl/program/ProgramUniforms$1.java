/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.gl.program;

import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;

class ProgramUniforms$1 {
    static final /* synthetic */ int[] $SwitchMap$net$irisshaders$iris$gl$uniform$UniformUpdateFrequency;

    static {
        $SwitchMap$net$irisshaders$iris$gl$uniform$UniformUpdateFrequency = new int[UniformUpdateFrequency.values().length];
        try {
            ProgramUniforms$1.$SwitchMap$net$irisshaders$iris$gl$uniform$UniformUpdateFrequency[UniformUpdateFrequency.ONCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ProgramUniforms$1.$SwitchMap$net$irisshaders$iris$gl$uniform$UniformUpdateFrequency[UniformUpdateFrequency.PER_TICK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ProgramUniforms$1.$SwitchMap$net$irisshaders$iris$gl$uniform$UniformUpdateFrequency[UniformUpdateFrequency.PER_FRAME.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

