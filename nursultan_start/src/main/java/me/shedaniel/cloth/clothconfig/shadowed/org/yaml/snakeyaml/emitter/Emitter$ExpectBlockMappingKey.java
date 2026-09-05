/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectBlockMappingSimpleValue;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectBlockMappingValue;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingEndEvent;

class Emitter$ExpectBlockMappingKey
implements EmitterState {
    private final boolean first;
    final /* synthetic */ Emitter this$0;

    public Emitter$ExpectBlockMappingKey(Emitter emitter, boolean bl) {
        this.this$0 = emitter;
        this.first = bl;
    }

    @Override
    public void expect() throws IOException {
        if (!this.first && Emitter.access$100(this.this$0) instanceof MappingEndEvent) {
            Emitter.access$1802(this.this$0, (Integer)Emitter.access$1900(this.this$0).pop());
            Emitter.access$202(this.this$0, (EmitterState)Emitter.access$1500(this.this$0).pop());
        } else {
            this.this$0.writeIndent();
            if (Emitter.access$2700(this.this$0)) {
                Emitter.access$1500(this.this$0).push((Object)new Emitter$ExpectBlockMappingSimpleValue(this.this$0, null));
                Emitter.access$1600(this.this$0, false, true, true);
            } else {
                this.this$0.writeIndicator("?", true, false, true);
                Emitter.access$1500(this.this$0).push((Object)new Emitter$ExpectBlockMappingValue(this.this$0, null));
                Emitter.access$1600(this.this$0, false, true, false);
            }
        }
    }
}

