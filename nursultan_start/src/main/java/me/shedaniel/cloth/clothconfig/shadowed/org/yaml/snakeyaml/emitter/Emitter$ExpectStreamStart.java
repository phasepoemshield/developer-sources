/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFirstDocumentStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamStartEvent;

class Emitter$ExpectStreamStart
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectStreamStart(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectStreamStart(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        if (!(Emitter.access$100(this.this$0) instanceof StreamStartEvent)) {
            throw new EmitterException("expected StreamStartEvent, but got " + Emitter.access$100(this.this$0));
        }
        this.this$0.writeStreamStart();
        Emitter.access$202(this.this$0, new Emitter$ExpectFirstDocumentStart(this.this$0, null));
    }
}

