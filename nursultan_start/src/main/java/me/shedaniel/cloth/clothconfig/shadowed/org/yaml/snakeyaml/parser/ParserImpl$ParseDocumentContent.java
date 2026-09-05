/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseDocumentContent
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Directive, Token.ID.DocumentStart, Token.ID.DocumentEnd, Token.ID.StreamEnd})) {
            Event event = ParserImpl.access$1200(this.this$0, this.this$0.scanner.peekToken().getStartMark());
            ParserImpl.access$102(this.this$0, (Production)ParserImpl.access$600(this.this$0).pop());
            return event;
        }
        ParserImpl$ParseBlockNode parserImpl$ParseBlockNode = new ParserImpl$ParseBlockNode(this.this$0, null);
        return parserImpl$ParseBlockNode.produce();
    }

    private ParserImpl$ParseDocumentContent(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseDocumentContent(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

