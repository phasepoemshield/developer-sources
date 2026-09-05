/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.BlockEntryToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.BlockEntryToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseBlockSequenceEntry
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.BlockEntry})) {
            BlockEntryToken blockEntryToken = (BlockEntryToken)this.this$0.scanner.getToken();
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.BlockEntry, Token.ID.BlockEnd})) {
                ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseBlockSequenceEntry(this.this$0));
                return new ParserImpl$ParseBlockNode(this.this$0, null).produce();
            }
            ParserImpl.access$102(this.this$0, new ParserImpl$ParseBlockSequenceEntry(this.this$0));
            return ParserImpl.access$1200(this.this$0, blockEntryToken.getEndMark());
        }
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.BlockEnd})) {
            Token token = this.this$0.scanner.peekToken();
            throw new ParserException("while parsing a block collection", (Mark)ParserImpl.access$1100(this.this$0).pop(), "expected <block end>, but found '" + token.getTokenId() + "'", token.getStartMark());
        }
        Token token = this.this$0.scanner.getToken();
        SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
        ParserImpl.access$102(this.this$0, (Production)ParserImpl.access$600(this.this$0).pop());
        ParserImpl.access$1100(this.this$0).pop();
        return sequenceEndEvent;
    }

    private ParserImpl$ParseBlockSequenceEntry(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseBlockSequenceEntry(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

