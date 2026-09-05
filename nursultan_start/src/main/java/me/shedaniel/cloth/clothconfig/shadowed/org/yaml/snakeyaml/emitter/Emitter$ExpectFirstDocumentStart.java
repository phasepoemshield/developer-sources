/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectDocumentStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;

class Emitter$ExpectFirstDocumentStart
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectFirstDocumentStart(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectFirstDocumentStart(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        new Emitter$ExpectDocumentStart(this.this$0, true).expect();
    }
}

