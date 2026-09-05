/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFlowMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;

class Emitter$ExpectFlowMappingSimpleValue
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectFlowMappingSimpleValue(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectFlowMappingSimpleValue(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        this.this$0.writeIndicator(":", false, false, false);
        Emitter.access$1500(this.this$0).push((Object)new Emitter$ExpectFlowMappingKey(this.this$0, null));
        Emitter.access$1600(this.this$0, false, true, false);
    }
}

