/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentEnd;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.VersionTagsTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseImplicitDocumentStart
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.Directive, Token.ID.DocumentStart, Token.ID.StreamEnd})) {
            Mark mark;
            ParserImpl.access$302(this.this$0, new VersionTagsTuple(null, ParserImpl.access$400()));
            Token token = this.this$0.scanner.peekToken();
            Mark mark2 = mark = token.getStartMark();
            DocumentStartEvent documentStartEvent = new DocumentStartEvent(mark, mark2, false, null, null);
            ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseDocumentEnd(this.this$0, null));
            ParserImpl.access$102(this.this$0, new ParserImpl$ParseBlockNode(this.this$0, null));
            return documentStartEvent;
        }
        ParserImpl$ParseDocumentStart parserImpl$ParseDocumentStart = new ParserImpl$ParseDocumentStart(this.this$0, null);
        return parserImpl$ParseDocumentStart.produce();
    }

    private ParserImpl$ParseImplicitDocumentStart(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseImplicitDocumentStart(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

