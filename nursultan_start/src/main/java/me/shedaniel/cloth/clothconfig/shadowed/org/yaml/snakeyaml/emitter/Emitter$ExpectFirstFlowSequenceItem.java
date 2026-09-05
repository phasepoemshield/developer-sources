/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFlowSequenceItem;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent;

class Emitter$ExpectFirstFlowSequenceItem
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectFirstFlowSequenceItem(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectFirstFlowSequenceItem(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        if (Emitter.access$100(this.this$0) instanceof SequenceEndEvent) {
            Emitter.access$1802(this.this$0, (Integer)Emitter.access$1900(this.this$0).pop());
            Emitter.access$2010(this.this$0);
            this.this$0.writeIndicator("]", false, false, false);
            Emitter.access$202(this.this$0, (EmitterState)Emitter.access$1500(this.this$0).pop());
        } else {
            if (Emitter.access$1000(this.this$0).booleanValue() || Emitter.access$2100(this.this$0) > Emitter.access$2200(this.this$0) && Emitter.access$2300(this.this$0) || Emitter.access$2400(this.this$0).booleanValue()) {
                this.this$0.writeIndent();
            }
            Emitter.access$1500(this.this$0).push((Object)new Emitter$ExpectFlowSequenceItem(this.this$0, null));
            Emitter.access$1600(this.this$0, false, false, false);
        }
    }
}

