/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;

class Emitter$ExpectNothing
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectNothing(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectNothing(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        throw new EmitterException("expecting nothing, but got " + Emitter.access$100(this.this$0));
    }
}

