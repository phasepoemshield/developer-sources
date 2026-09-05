/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFlowMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;

class Emitter$ExpectFlowMappingValue
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectFlowMappingValue(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectFlowMappingValue(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        if (Emitter.access$1000(this.this$0).booleanValue() || Emitter.access$2100(this.this$0) > Emitter.access$2200(this.this$0) || Emitter.access$2400(this.this$0).booleanValue()) {
            this.this$0.writeIndent();
        }
        this.this$0.writeIndicator(":", true, false, false);
        Emitter.access$1500(this.this$0).push((Object)new Emitter$ExpectFlowMappingKey(this.this$0, null));
        Emitter.access$1600(this.this$0, false, true, false);
    }
}

