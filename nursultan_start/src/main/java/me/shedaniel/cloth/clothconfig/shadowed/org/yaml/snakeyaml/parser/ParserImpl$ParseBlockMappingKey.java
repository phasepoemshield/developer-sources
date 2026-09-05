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
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingValue;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseBlockMappingKey
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Key})) {
            Token token = this.this$0.scanner.getToken();
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd})) {
                ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseBlockMappingValue(this.this$0, null));
                return ParserImpl.access$2200(this.this$0);
            }
            ParserImpl.access$102(this.this$0, new ParserImpl$ParseBlockMappingValue(this.this$0, null));
            return ParserImpl.access$1200(this.this$0, token.getEndMark());
        }
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.BlockEnd})) {
            Token token = this.this$0.scanner.peekToken();
            throw new ParserException("while parsing a block mapping", (Mark)ParserImpl.access$1100(this.this$0).pop(), "expected <block end>, but found '" + token.getTokenId() + "'", token.getStartMark());
        }
        Token token = this.this$0.scanner.getToken();
        MappingEndEvent mappingEndEvent = new MappingEndEvent(token.getStartMark(), token.getEndMark());
        ParserImpl.access$102(this.this$0, (Production)ParserImpl.access$600(this.this$0).pop());
        ParserImpl.access$1100(this.this$0).pop();
        return mappingEndEvent;
    }

    private ParserImpl$ParseBlockMappingKey(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseBlockMappingKey(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

