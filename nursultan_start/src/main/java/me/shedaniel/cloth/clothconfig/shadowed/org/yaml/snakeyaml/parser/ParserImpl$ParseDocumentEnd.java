/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseDocumentEnd
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        Mark mark;
        Token token = this.this$0.scanner.peekToken();
        Mark mark2 = mark = token.getStartMark();
        boolean bl = false;
        if (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.DocumentEnd})) {
            token = this.this$0.scanner.getToken();
            mark2 = token.getEndMark();
            bl = true;
        }
        DocumentEndEvent documentEndEvent = new DocumentEndEvent(mark, mark2, bl);
        ParserImpl.access$102(this.this$0, new ParserImpl$ParseDocumentStart(this.this$0, null));
        return documentEndEvent;
    }

    private ParserImpl$ParseDocumentEnd(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseDocumentEnd(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

