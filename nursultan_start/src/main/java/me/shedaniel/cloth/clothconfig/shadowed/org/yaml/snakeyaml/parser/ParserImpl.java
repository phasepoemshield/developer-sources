/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$Version
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Scanner
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.ScannerImpl
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.AliasToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.AnchorToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.DirectiveToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.ScalarToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagToken
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagTuple
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayStack
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.AliasEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ImplicitTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ScalarEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingFirstKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceFirstEntry;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingFirstKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceFirstEntry;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseIndentlessSequenceEntry;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl$ParseStreamStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Production;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.VersionTagsTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Scanner;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.ScannerImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.AliasToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.AnchorToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.DirectiveToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.ScalarToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayStack;

public class ParserImpl
implements Parser {
    private static final Map<String, String> DEFAULT_TAGS = new HashMap<String, String>();
    protected final Scanner scanner;
    private Event currentEvent;
    private final ArrayStack<Production> states;
    private final ArrayStack<Mark> marks;
    private Production state;
    private VersionTagsTuple directives;

    static /* synthetic */ Production access$102(ParserImpl parserImpl, Production production) {
        parserImpl.state = production;
        return parserImpl.state;
    }

    static /* synthetic */ Map access$400() {
        return DEFAULT_TAGS;
    }

    static /* synthetic */ ArrayStack access$600(ParserImpl parserImpl) {
        return parserImpl.states;
    }

    public ParserImpl(StreamReader streamReader) {
        this((Scanner)new ScannerImpl(streamReader));
    }

    public ParserImpl(Scanner scanner) {
        this.scanner = scanner;
        this.currentEvent = null;
        this.directives = new VersionTagsTuple(null, new HashMap<String, String>(DEFAULT_TAGS));
        this.states = new ArrayStack(100);
        this.marks = new ArrayStack(10);
        this.state = new ParserImpl$ParseStreamStart(this, null);
    }

    static {
        DEFAULT_TAGS.put("!", "!");
        DEFAULT_TAGS.put("!!", "tag:yaml.org,2002:");
    }

    static /* synthetic */ VersionTagsTuple access$302(ParserImpl parserImpl, VersionTagsTuple versionTagsTuple) {
        parserImpl.directives = versionTagsTuple;
        return parserImpl.directives;
    }

    @Override
    public Event getEvent() {
        this.peekEvent();
        Event event = this.currentEvent;
        this.currentEvent = null;
        return event;
    }

    private Event parseBlockNodeOrIndentlessSequence() {
        return this.parseNode(true, true);
    }

    private Event processEmptyScalar(Mark mark) {
        return new ScalarEvent(null, null, new ImplicitTuple(true, false), "", mark, mark, DumperOptions.ScalarStyle.PLAIN);
    }

    private VersionTagsTuple processDirectives() {
        DumperOptions.Version version = null;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        while (this.scanner.checkToken(new Token.ID[]{Token.ID.Directive})) {
            Object object;
            Object object2;
            DirectiveToken directiveToken = (DirectiveToken)this.scanner.getToken();
            if (directiveToken.getName().equals("YAML")) {
                if (version != null) {
                    throw new ParserException(null, null, "found duplicate YAML directive", directiveToken.getStartMark());
                }
                List list = directiveToken.getValue();
                object2 = (Integer)list.get(0);
                if ((Integer)object2 != 1) {
                    throw new ParserException(null, null, "found incompatible YAML document (version 1.* is required)", directiveToken.getStartMark());
                }
                object = (Integer)list.get(1);
                switch ((Integer)object) {
                    case 0: {
                        version = DumperOptions.Version.V1_0;
                        break;
                    }
                    default: {
                        version = DumperOptions.Version.V1_1;
                        break;
                    }
                }
                continue;
            }
            if (!directiveToken.getName().equals("TAG")) continue;
            List list = directiveToken.getValue();
            object2 = (String)list.get(0);
            object = (String)list.get(1);
            if (hashMap.containsKey(object2)) {
                throw new ParserException(null, null, "duplicate tag handle " + (String)object2, directiveToken.getStartMark());
            }
            hashMap.put((String)object2, (String)object);
        }
        if (version != null || !hashMap.isEmpty()) {
            for (String string : DEFAULT_TAGS.keySet()) {
                if (hashMap.containsKey(string)) continue;
                hashMap.put(string, DEFAULT_TAGS.get(string));
            }
            this.directives = new VersionTagsTuple(version, hashMap);
        }
        return this.directives;
    }

    private Event parseFlowNode() {
        return this.parseNode(false, false);
    }

    static /* synthetic */ ArrayStack access$1100(ParserImpl parserImpl) {
        return parserImpl.marks;
    }

    static /* synthetic */ VersionTagsTuple access$900(ParserImpl parserImpl) {
        return parserImpl.processDirectives();
    }

    static /* synthetic */ Event access$1300(ParserImpl parserImpl, boolean bl, boolean bl2) {
        return parserImpl.parseNode(bl, bl2);
    }

    static /* synthetic */ Event access$1200(ParserImpl parserImpl, Mark mark) {
        return parserImpl.processEmptyScalar(mark);
    }

    static /* synthetic */ Event access$2200(ParserImpl parserImpl) {
        return parserImpl.parseBlockNodeOrIndentlessSequence();
    }

    static /* synthetic */ Event access$2400(ParserImpl parserImpl) {
        return parserImpl.parseFlowNode();
    }

    @Override
    public boolean checkEvent(Event$ID event$ID) {
        this.peekEvent();
        return this.currentEvent != null && this.currentEvent.is(event$ID);
    }

    @Override
    public Event peekEvent() {
        if (this.currentEvent == null && this.state != null) {
            this.currentEvent = this.state.produce();
        }
        return this.currentEvent;
    }

    private Event parseNode(boolean bl, boolean bl2) {
        NodeEvent nodeEvent;
        Mark mark = null;
        Mark mark2 = null;
        Mark mark3 = null;
        if (this.scanner.checkToken(new Token.ID[]{Token.ID.Alias})) {
            AliasToken aliasToken = (AliasToken)this.scanner.getToken();
            nodeEvent = new AliasEvent(aliasToken.getValue(), aliasToken.getStartMark(), aliasToken.getEndMark());
            this.state = (Production)this.states.pop();
        } else {
            boolean bl3;
            String string;
            String string2;
            Object object;
            String string3 = null;
            TagTuple tagTuple = null;
            if (this.scanner.checkToken(new Token.ID[]{Token.ID.Anchor})) {
                object = (AnchorToken)this.scanner.getToken();
                mark = object.getStartMark();
                mark2 = object.getEndMark();
                string3 = object.getValue();
                if (this.scanner.checkToken(new Token.ID[]{Token.ID.Tag})) {
                    string2 = (TagToken)this.scanner.getToken();
                    mark3 = string2.getStartMark();
                    mark2 = string2.getEndMark();
                    tagTuple = string2.getValue();
                }
            } else if (this.scanner.checkToken(new Token.ID[]{Token.ID.Tag})) {
                object = (TagToken)this.scanner.getToken();
                mark3 = mark = object.getStartMark();
                mark2 = object.getEndMark();
                tagTuple = object.getValue();
                if (this.scanner.checkToken(new Token.ID[]{Token.ID.Anchor})) {
                    string2 = (AnchorToken)this.scanner.getToken();
                    mark2 = string2.getEndMark();
                    string3 = string2.getValue();
                }
            }
            object = null;
            if (tagTuple != null) {
                string2 = tagTuple.getHandle();
                string = tagTuple.getSuffix();
                if (string2 != null) {
                    if (!this.directives.getTags().containsKey(string2)) {
                        throw new ParserException("while parsing a node", mark, "found undefined tag handle " + string2, mark3);
                    }
                    object = this.directives.getTags().get(string2) + string;
                } else {
                    object = string;
                }
            }
            if (mark == null) {
                mark2 = mark = this.scanner.peekToken().getStartMark();
            }
            nodeEvent = null;
            boolean bl4 = bl3 = object == null || object.equals("!");
            if (bl2 && this.scanner.checkToken(new Token.ID[]{Token.ID.BlockEntry})) {
                mark2 = this.scanner.peekToken().getEndMark();
                nodeEvent = new SequenceStartEvent(string3, (String)object, bl3, mark, mark2, DumperOptions.FlowStyle.BLOCK);
                this.state = new ParserImpl$ParseIndentlessSequenceEntry(this, null);
            } else if (this.scanner.checkToken(new Token.ID[]{Token.ID.Scalar})) {
                string = (ScalarToken)this.scanner.getToken();
                mark2 = string.getEndMark();
                ImplicitTuple implicitTuple = string.getPlain() && object == null || "!".equals(object) ? new ImplicitTuple(true, false) : (object == null ? new ImplicitTuple(false, true) : new ImplicitTuple(false, false));
                nodeEvent = new ScalarEvent(string3, (String)object, implicitTuple, string.getValue(), mark, mark2, string.getStyle());
                this.state = (Production)this.states.pop();
            } else if (this.scanner.checkToken(new Token.ID[]{Token.ID.FlowSequenceStart})) {
                mark2 = this.scanner.peekToken().getEndMark();
                nodeEvent = new SequenceStartEvent(string3, (String)object, bl3, mark, mark2, DumperOptions.FlowStyle.FLOW);
                this.state = new ParserImpl$ParseFlowSequenceFirstEntry(this, null);
            } else if (this.scanner.checkToken(new Token.ID[]{Token.ID.FlowMappingStart})) {
                mark2 = this.scanner.peekToken().getEndMark();
                nodeEvent = new MappingStartEvent(string3, (String)object, bl3, mark, mark2, DumperOptions.FlowStyle.FLOW);
                this.state = new ParserImpl$ParseFlowMappingFirstKey(this, null);
            } else if (bl && this.scanner.checkToken(new Token.ID[]{Token.ID.BlockSequenceStart})) {
                mark2 = this.scanner.peekToken().getStartMark();
                nodeEvent = new SequenceStartEvent(string3, (String)object, bl3, mark, mark2, DumperOptions.FlowStyle.BLOCK);
                this.state = new ParserImpl$ParseBlockSequenceFirstEntry(this, null);
            } else if (bl && this.scanner.checkToken(new Token.ID[]{Token.ID.BlockMappingStart})) {
                mark2 = this.scanner.peekToken().getStartMark();
                nodeEvent = new MappingStartEvent(string3, (String)object, bl3, mark, mark2, DumperOptions.FlowStyle.BLOCK);
                this.state = new ParserImpl$ParseBlockMappingFirstKey(this, null);
            } else if (string3 != null || object != null) {
                nodeEvent = new ScalarEvent(string3, (String)object, new ImplicitTuple(bl3, false), "", mark, mark2, DumperOptions.ScalarStyle.PLAIN);
                this.state = (Production)this.states.pop();
            } else {
                string = bl ? "block" : "flow";
                Token token = this.scanner.peekToken();
                throw new ParserException("while parsing a " + string + " node", mark, "expected the node content, but found '" + token.getTokenId() + "'", token.getStartMark());
            }
        }
        return nodeEvent;
    }
}

