/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectDocumentRoot;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectNothing;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamEndEvent;

class Emitter$ExpectDocumentStart
implements EmitterState {
    private final boolean first;
    final /* synthetic */ Emitter this$0;

    public Emitter$ExpectDocumentStart(Emitter emitter, boolean bl) {
        this.this$0 = emitter;
        this.first = bl;
    }

    @Override
    public void expect() throws IOException {
        if (Emitter.access$100(this.this$0) instanceof DocumentStartEvent) {
            boolean bl;
            Object object;
            DocumentStartEvent documentStartEvent = (DocumentStartEvent)Emitter.access$100(this.this$0);
            if ((documentStartEvent.getVersion() != null || documentStartEvent.getTags() != null) && Emitter.access$400(this.this$0)) {
                this.this$0.writeIndicator("...", true, false, false);
                this.this$0.writeIndent();
            }
            if (documentStartEvent.getVersion() != null) {
                object = Emitter.access$500(this.this$0, documentStartEvent.getVersion());
                this.this$0.writeVersionDirective((String)object);
            }
            Emitter.access$602(this.this$0, new LinkedHashMap(Emitter.access$700()));
            if (documentStartEvent.getTags() != null) {
                object = new TreeSet<String>(documentStartEvent.getTags().keySet());
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    String string = (String)iterator.next();
                    String string2 = documentStartEvent.getTags().get(string);
                    Emitter.access$600(this.this$0).put(string2, string);
                    String string3 = Emitter.access$800(this.this$0, string);
                    String string4 = Emitter.access$900(this.this$0, string2);
                    this.this$0.writeTagDirective(string3, string4);
                }
            }
            boolean bl2 = bl = this.first && !documentStartEvent.getExplicit() && Emitter.access$1000(this.this$0) == false && documentStartEvent.getVersion() == null && (documentStartEvent.getTags() == null || documentStartEvent.getTags().isEmpty()) && !Emitter.access$1100(this.this$0);
            if (!bl) {
                this.this$0.writeIndent();
                this.this$0.writeIndicator("---", true, false, false);
                if (Emitter.access$1000(this.this$0).booleanValue()) {
                    this.this$0.writeIndent();
                }
            }
            Emitter.access$202(this.this$0, new Emitter$ExpectDocumentRoot(this.this$0, null));
        } else if (Emitter.access$100(this.this$0) instanceof StreamEndEvent) {
            this.this$0.writeStreamEnd();
            Emitter.access$202(this.this$0, new Emitter$ExpectNothing(this.this$0, null));
        } else {
            throw new EmitterException("expected DocumentStartEvent, but got " + Emitter.access$100(this.this$0));
        }
    }
}

