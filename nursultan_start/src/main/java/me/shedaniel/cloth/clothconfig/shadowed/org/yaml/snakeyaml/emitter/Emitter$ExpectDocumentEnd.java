/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectDocumentStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentEndEvent;

class Emitter$ExpectDocumentEnd
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectDocumentEnd(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectDocumentEnd(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        if (Emitter.access$100(this.this$0) instanceof DocumentEndEvent) {
            this.this$0.writeIndent();
            if (((DocumentEndEvent)Emitter.access$100(this.this$0)).getExplicit()) {
                this.this$0.writeIndicator("...", true, false, false);
                this.this$0.writeIndent();
            }
        } else {
            throw new EmitterException("expected DocumentEndEvent, but got " + Emitter.access$100(this.this$0));
        }
        this.this$0.flushStream();
        Emitter.access$202(this.this$0, new Emitter$ExpectDocumentStart(this.this$0, false));
    }
}

