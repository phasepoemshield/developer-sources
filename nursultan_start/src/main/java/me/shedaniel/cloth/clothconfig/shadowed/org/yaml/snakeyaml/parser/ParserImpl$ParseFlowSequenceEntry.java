/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntryMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseFlowSequenceEntry
implements Production {
    private boolean first = false;
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.FlowSequenceEnd})) {
            if (!this.first) {
                if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.FlowEntry})) {
                    this.this$0.scanner.getToken();
                } else {
                    Token token = this.this$0.scanner.peekToken();
                    throw new ParserException("while parsing a flow sequence", (Mark)ParserImpl.access$1100(this.this$0).pop(), "expected ',' or ']', but got " + token.getTokenId(), token.getStartMark());
                }
            }
            if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Key})) {
                Token token = this.this$0.scanner.peekToken();
                MappingStartEvent mappingStartEvent = new MappingStartEvent(null, null, true, token.getStartMark(), token.getEndMark(), DumperOptions.FlowStyle.FLOW);
                ParserImpl.access$102(this.this$0, new ParserImpl$ParseFlowSequenceEntryMappingKey(this.this$0, null));
                return mappingStartEvent;
            }
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.FlowSequenceEnd})) {
                ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseFlowSequenceEntry(this.this$0, false));
                return ParserImpl.access$2400(this.this$0);
            }
        }
        Token token = this.this$0.scanner.getToken();
        SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
        ParserImpl.access$102(this.this$0, (Production)ParserImpl.access$600(this.this$0).pop());
        ParserImpl.access$1100(this.this$0).pop();
        return sequenceEndEvent;
    }

    public ParserImpl$ParseFlowSequenceEntry(ParserImpl parserImpl, boolean bl) {
        this.this$0 = parserImpl;
        this.first = bl;
    }
}

