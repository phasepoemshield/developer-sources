/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.StreamStartToken
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseImplicitDocumentStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.StreamStartToken;

class ParserImpl$ParseStreamStart
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        StreamStartToken streamStartToken = (StreamStartToken)this.this$0.scanner.getToken();
        StreamStartEvent streamStartEvent = new StreamStartEvent(streamStartToken.getStartMark(), streamStartToken.getEndMark());
        ParserImpl.access$102(this.this$0, new ParserImpl$ParseImplicitDocumentStart(this.this$0, null));
        return streamStartEvent;
    }

    private ParserImpl$ParseStreamStart(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseStreamStart(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

