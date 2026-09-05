/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseIndentlessSequenceEntry
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.BlockEntry})) {
            Token token = this.this$0.scanner.getToken();
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.BlockEntry, Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd})) {
                ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseIndentlessSequenceEntry(this.this$0));
                return new ParserImpl$ParseBlockNode(this.this$0, null).produce();
            }
            ParserImpl.access$102(this.this$0, new ParserImpl$ParseIndentlessSequenceEntry(this.this$0));
            return ParserImpl.access$1200(this.this$0, token.getEndMark());
        }
        Token token = this.this$0.scanner.peekToken();
        SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
        ParserImpl.access$102(this.this$0, (Production)ParserImpl.access$600(this.this$0).pop());
        return sequenceEndEvent;
    }

    private ParserImpl$ParseIndentlessSequenceEntry(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseIndentlessSequenceEntry(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

