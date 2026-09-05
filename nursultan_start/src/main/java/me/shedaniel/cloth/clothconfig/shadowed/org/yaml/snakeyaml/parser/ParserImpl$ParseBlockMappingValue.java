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
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseBlockMappingValue
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Value})) {
            Token token = this.this$0.scanner.getToken();
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd})) {
                ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseBlockMappingKey(this.this$0, null));
                return ParserImpl.access$2200(this.this$0);
            }
            ParserImpl.access$102(this.this$0, new ParserImpl$ParseBlockMappingKey(this.this$0, null));
            return ParserImpl.access$1200(this.this$0, token.getEndMark());
        }
        ParserImpl.access$102(this.this$0, new ParserImpl$ParseBlockMappingKey(this.this$0, null));
        Token token = this.this$0.scanner.peekToken();
        return ParserImpl.access$1200(this.this$0, token.getStartMark());
    }

    private ParserImpl$ParseBlockMappingValue(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseBlockMappingValue(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

