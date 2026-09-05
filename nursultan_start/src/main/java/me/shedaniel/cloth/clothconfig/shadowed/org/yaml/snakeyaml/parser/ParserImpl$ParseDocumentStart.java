/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.StreamEndToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentContent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentEnd;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.VersionTagsTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.StreamEndToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;

class ParserImpl$ParseDocumentStart
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        Event event;
        while (this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.DocumentEnd})) {
            this.this$0.scanner.getToken();
        }
        if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.StreamEnd})) {
            Token token = this.this$0.scanner.peekToken();
            Mark mark = token.getStartMark();
            VersionTagsTuple versionTagsTuple = ParserImpl.access$900(this.this$0);
            if (!this.this$0.scanner.checkToken(new Token.ID[]{Token.ID.DocumentStart})) {
                throw new ParserException(null, null, "expected '<document start>', but found '" + this.this$0.scanner.peekToken().getTokenId() + "'", this.this$0.scanner.peekToken().getStartMark());
            }
            token = this.this$0.scanner.getToken();
            Mark mark2 = token.getEndMark();
            event = new DocumentStartEvent(mark, mark2, true, versionTagsTuple.getVersion(), versionTagsTuple.getTags());
            ParserImpl.access$600(this.this$0).push((Object)new ParserImpl$ParseDocumentEnd(this.this$0, null));
            ParserImpl.access$102(this.this$0, new ParserImpl$ParseDocumentContent(this.this$0, null));
        } else {
            StreamEndToken streamEndToken = (StreamEndToken)this.this$0.scanner.getToken();
            event = new StreamEndEvent(streamEndToken.getStartMark(), streamEndToken.getEndMark());
            if (!ParserImpl.access$600(this.this$0).isEmpty()) {
                throw new YAMLException("Unexpected end of stream. States left: " + ParserImpl.access$600(this.this$0));
            }
            if (!ParserImpl.access$1100(this.this$0).isEmpty()) {
                throw new YAMLException("Unexpected end of stream. Marks left: " + ParserImpl.access$1100(this.this$0));
            }
            ParserImpl.access$102(this.this$0, null);
        }
        return event;
    }

    private ParserImpl$ParseDocumentStart(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseDocumentStart(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

