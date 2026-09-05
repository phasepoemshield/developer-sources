/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntryMappingValue;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseFlowSequenceEntryMappingKey
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        Token token = this.this$0.scanner.getToken();
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Value, Token.ID.FlowEntry, Token.ID.FlowSequenceEnd})) {
            ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseFlowSequenceEntryMappingValue(this.this$0, null));
            return ParserImpl.access$2400(this.this$0);
        }
        ParserImpl.access$102(this.this$0, new ParserImpl$ParseFlowSequenceEntryMappingValue(this.this$0, null));
        return ParserImpl.access$1200(this.this$0, token.getEndMark());
    }

    private ParserImpl$ParseFlowSequenceEntryMappingKey(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseFlowSequenceEntryMappingKey(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

