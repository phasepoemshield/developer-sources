/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingEmptyValue;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingValue;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseFlowMappingKey
implements Production {
    private boolean first = false;
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.FlowMappingEnd})) {
            if (!this.first) {
                if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.FlowEntry})) {
                    this.this$0.scanner.getToken();
                } else {
                    Token token = this.this$0.scanner.peekToken();
                    throw new ParserException("while parsing a flow mapping", (Mark)ParserImpl.access$1100(this.this$0).pop(), "expected ',' or '}', but got " + token.getTokenId(), token.getStartMark());
                }
            }
            if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Key})) {
                Token token = this.this$0.scanner.getToken();
                if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Value, Token.ID.FlowEntry, Token.ID.FlowMappingEnd})) {
                    ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseFlowMappingValue(this.this$0, null));
                    return ParserImpl.access$2400(this.this$0);
                }
                ParserImpl.access$102(this.this$0, new ParserImpl$ParseFlowMappingValue(this.this$0, null));
                return ParserImpl.access$1200(this.this$0, token.getEndMark());
            }
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.FlowMappingEnd})) {
                ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseFlowMappingEmptyValue(this.this$0, null));
                return ParserImpl.access$2400(this.this$0);
            }
        }
        Token token = this.this$0.scanner.getToken();
        MappingEndEvent mappingEndEvent = new MappingEndEvent(token.getStartMark(), token.getEndMark());
        ParserImpl.access$102(this.this$0, (Production)ParserImpl.access$600(this.this$0).pop());
        ParserImpl.access$1100(this.this$0).pop();
        return mappingEndEvent;
    }

    public ParserImpl$ParseFlowMappingKey(ParserImpl parserImpl, boolean bl) {
        this.this$0 = parserImpl;
        this.first = bl;
    }
}

