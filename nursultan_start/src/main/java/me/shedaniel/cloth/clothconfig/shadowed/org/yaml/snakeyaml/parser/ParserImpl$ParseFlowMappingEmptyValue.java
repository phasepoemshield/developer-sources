/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;

class ParserImpl$ParseFlowMappingEmptyValue
implements Production {
    final /* synthetic */ ParserImpl this$0;

    @Override
    public Event produce() {
        ParserImpl.access$102(this.this$0, new ParserImpl$ParseFlowMappingKey(this.this$0, false));
        return ParserImpl.access$1200(this.this$0, this.this$0.scanner.peekToken().getStartMark());
    }

    private ParserImpl$ParseFlowMappingEmptyValue(ParserImpl parserImpl) {
        this.this$0 = parserImpl;
    }

    /* synthetic */ ParserImpl$ParseFlowMappingEmptyValue(ParserImpl parserImpl, ParserImpl$1 parserImpl$1) {
        this(parserImpl);
    }
}

