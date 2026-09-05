/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectBlockMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;

class Emitter$ExpectBlockMappingValue
implements EmitterState {
    final /* synthetic */ Emitter this$0;

    private Emitter$ExpectBlockMappingValue(Emitter emitter) {
        this.this$0 = emitter;
    }

    /* synthetic */ Emitter$ExpectBlockMappingValue(Emitter emitter, Emitter$1 emitter$1) {
        this(emitter);
    }

    @Override
    public void expect() throws IOException {
        this.this$0.writeIndent();
        this.this$0.writeIndicator(":", true, false, true);
        Emitter.access$1500(this.this$0).push((Object)new Emitter$ExpectBlockMappingKey(this.this$0, false));
        Emitter.access$1600(this.this$0, false, true, false);
    }
}

