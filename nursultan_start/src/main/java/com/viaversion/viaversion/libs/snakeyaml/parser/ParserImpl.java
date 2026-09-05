/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$FlowStyle
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$ScalarStyle
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$Version
 *  com.viaversion.viaversion.libs.snakeyaml.LoaderOptions
 *  com.viaversion.viaversion.libs.snakeyaml.comments.CommentType
 *  com.viaversion.viaversion.libs.snakeyaml.error.Mark
 *  com.viaversion.viaversion.libs.snakeyaml.events.AliasEvent
 *  com.viaversion.viaversion.libs.snakeyaml.events.CommentEvent
 *  com.viaversion.viaversion.libs.snakeyaml.events.Event
 *  com.viaversion.viaversion.libs.snakeyaml.events.Event$ID
 *  com.viaversion.viaversion.libs.snakeyaml.events.ImplicitTuple
 *  com.viaversion.viaversion.libs.snakeyaml.events.MappingStartEvent
 *  com.viaversion.viaversion.libs.snakeyaml.events.ScalarEvent
 *  com.viaversion.viaversion.libs.snakeyaml.events.SequenceStartEvent
 *  com.viaversion.viaversion.libs.snakeyaml.parser.Parser
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserException
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl$ParseBlockMappingFirstKey
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl$ParseBlockSequenceFirstEntry
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl$ParseFlowMappingFirstKey
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl$ParseFlowSequenceFirstEntry
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl$ParseIndentlessSequenceEntryKey
 *  com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl$ParseStreamStart
 *  com.viaversion.viaversion.libs.snakeyaml.tokens.AliasToken
 *  com.viaversion.viaversion.libs.snakeyaml.tokens.AnchorToken
 *  com.viaversion.viaversion.libs.snakeyaml.tokens.DirectiveToken
 *  com.viaversion.viaversion.libs.snakeyaml.tokens.TagToken
 *  com.viaversion.viaversion.libs.snakeyaml.tokens.TagTuple
 */
package com.viaversion.viaversion.libs.snakeyaml.parser;

import com.viaversion.viaversion.libs.snakeyaml.DumperOptions;
import com.viaversion.viaversion.libs.snakeyaml.LoaderOptions;
import com.viaversion.viaversion.libs.snakeyaml.comments.CommentType;
import com.viaversion.viaversion.libs.snakeyaml.error.Mark;
import com.viaversion.viaversion.libs.snakeyaml.events.AliasEvent;
import com.viaversion.viaversion.libs.snakeyaml.events.CommentEvent;
import com.viaversion.viaversion.libs.snakeyaml.events.Event;
import com.viaversion.viaversion.libs.snakeyaml.events.ImplicitTuple;
import com.viaversion.viaversion.libs.snakeyaml.events.MappingStartEvent;
import com.viaversion.viaversion.libs.snakeyaml.events.ScalarEvent;
import com.viaversion.viaversion.libs.snakeyaml.events.SequenceStartEvent;
import com.viaversion.viaversion.libs.snakeyaml.parser.Parser;
import com.viaversion.viaversion.libs.snakeyaml.parser.ParserException;
import com.viaversion.viaversion.libs.snakeyaml.parser.ParserImpl;
import com.viaversion.viaversion.libs.snakeyaml.parser.Production;
import com.viaversion.viaversion.libs.snakeyaml.parser.VersionTagsTuple;
import com.viaversion.viaversion.libs.snakeyaml.reader.StreamReader;
import com.viaversion.viaversion.libs.snakeyaml.scanner.Scanner;
import com.viaversion.viaversion.libs.snakeyaml.scanner.ScannerImpl;
import com.viaversion.viaversion.libs.snakeyaml.tokens.AliasToken;
import com.viaversion.viaversion.libs.snakeyaml.tokens.AnchorToken;
import com.viaversion.viaversion.libs.snakeyaml.tokens.CommentToken;
import com.viaversion.viaversion.libs.snakeyaml.tokens.DirectiveToken;
import com.viaversion.viaversion.libs.snakeyaml.tokens.ScalarToken;
import com.viaversion.viaversion.libs.snakeyaml.tokens.TagToken;
import com.viaversion.viaversion.libs.snakeyaml.tokens.TagTuple;
import com.viaversion.viaversion.libs.snakeyaml.tokens.Token;
import com.viaversion.viaversion.libs.snakeyaml.util.ArrayStack;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParserImpl
implements Parser {
    private static final Map<String, String> DEFAULT_TAGS = new HashMap<String, String>();
    protected final Scanner scanner;
    private Event currentEvent;
    private final ArrayStack<Production> states;
    private final ArrayStack<Mark> marks;
    private Production state;
    private VersionTagsTuple directives;

    public ParserImpl(StreamReader reader, LoaderOptions options) {
        this(new ScannerImpl(reader, options));
    }

    public ParserImpl(Scanner scanner) {
        this.scanner = scanner;
        this.currentEvent = null;
        this.directives = new VersionTagsTuple(null, new HashMap<String, String>(DEFAULT_TAGS));
        this.states = new ArrayStack(100);
        this.marks = new ArrayStack(10);
        this.state = new ParseStreamStart(this, null);
    }

    public boolean checkEvent(Event.ID choice) {
        this.peekEvent();
        return this.currentEvent != null && this.currentEvent.is(choice);
    }

    public Event peekEvent() {
        if (this.currentEvent == null && this.state != null) {
            this.currentEvent = this.state.produce();
        }
        return this.currentEvent;
    }

    public Event getEvent() {
        this.peekEvent();
        Event value = this.currentEvent;
        this.currentEvent = null;
        return value;
    }

    private CommentEvent produceCommentEvent(CommentToken token) {
        Mark startMark = token.getStartMark();
        Mark endMark = token.getEndMark();
        String value = token.getValue();
        CommentType type = token.getCommentType();
        return new CommentEvent(type, value, startMark, endMark);
    }

    private VersionTagsTuple processDirectives() {
        HashMap<String, String> tagHandles = new HashMap<String, String>(this.directives.getTags());
        for (String key : DEFAULT_TAGS.keySet()) {
            tagHandles.remove(key);
        }
        this.directives = new VersionTagsTuple(null, tagHandles);
        while (this.scanner.checkToken(Token.ID.Directive)) {
            List value;
            DirectiveToken token = (DirectiveToken)this.scanner.getToken();
            if (token.getName().equals("YAML")) {
                if (this.directives.getVersion() != null) {
                    throw new ParserException(null, null, "found duplicate YAML directive", token.getStartMark());
                }
                value = token.getValue();
                Integer major = (Integer)value.get(0);
                if (major != 1) {
                    throw new ParserException(null, null, "found incompatible YAML document (version 1.* is required)", token.getStartMark());
                }
                Integer minor = (Integer)value.get(1);
                if (minor == 0) {
                    this.directives = new VersionTagsTuple(DumperOptions.Version.V1_0, tagHandles);
                    continue;
                }
                this.directives = new VersionTagsTuple(DumperOptions.Version.V1_1, tagHandles);
                continue;
            }
            if (!token.getName().equals("TAG")) continue;
            value = token.getValue();
            String handle = (String)value.get(0);
            String prefix = (String)value.get(1);
            if (tagHandles.containsKey(handle)) {
                throw new ParserException(null, null, "duplicate tag handle " + handle, token.getStartMark());
            }
            tagHandles.put(handle, prefix);
        }
        HashMap<String, String> detectedTagHandles = new HashMap();
        if (!tagHandles.isEmpty()) {
            detectedTagHandles = new HashMap<String, String>(tagHandles);
        }
        for (String key : DEFAULT_TAGS.keySet()) {
            if (tagHandles.containsKey(key)) continue;
            tagHandles.put(key, DEFAULT_TAGS.get(key));
        }
        return new VersionTagsTuple(this.directives.getVersion(), detectedTagHandles);
    }

    private Event parseFlowNode() {
        return this.parseNode(false, false);
    }

    private Event parseBlockNodeOrIndentlessSequence() {
        return this.parseNode(true, true);
    }

    private Event parseNode(boolean block, boolean indentlessSequence) {
        AliasEvent event;
        Mark startMark = null;
        Mark endMark = null;
        Mark tagMark = null;
        if (this.scanner.checkToken(Token.ID.Alias)) {
            AliasToken token = (AliasToken)this.scanner.getToken();
            event = new AliasEvent(token.getValue(), token.getStartMark(), token.getEndMark());
            this.state = this.states.pop();
        } else {
            Token token;
            boolean implicit;
            String anchor = null;
            TagTuple tagTokenTag = null;
            if (this.scanner.checkToken(Token.ID.Anchor)) {
                AnchorToken token2 = (AnchorToken)this.scanner.getToken();
                startMark = token2.getStartMark();
                endMark = token2.getEndMark();
                anchor = token2.getValue();
                if (this.scanner.checkToken(Token.ID.Tag)) {
                    TagToken tagToken = (TagToken)this.scanner.getToken();
                    tagMark = tagToken.getStartMark();
                    endMark = tagToken.getEndMark();
                    tagTokenTag = tagToken.getValue();
                }
            } else if (this.scanner.checkToken(Token.ID.Tag)) {
                TagToken tagToken = (TagToken)this.scanner.getToken();
                tagMark = startMark = tagToken.getStartMark();
                endMark = tagToken.getEndMark();
                tagTokenTag = tagToken.getValue();
                if (this.scanner.checkToken(Token.ID.Anchor)) {
                    AnchorToken token3 = (AnchorToken)this.scanner.getToken();
                    endMark = token3.getEndMark();
                    anchor = token3.getValue();
                }
            }
            String tag = null;
            if (tagTokenTag != null) {
                String handle = tagTokenTag.getHandle();
                String suffix = tagTokenTag.getSuffix();
                if (handle != null) {
                    if (!this.directives.getTags().containsKey(handle)) {
                        throw new ParserException("while parsing a node", startMark, "found undefined tag handle " + handle, tagMark);
                    }
                    tag = this.directives.getTags().get(handle) + suffix;
                } else {
                    tag = suffix;
                }
            }
            if (startMark == null) {
                endMark = startMark = this.scanner.peekToken().getStartMark();
            }
            event = null;
            boolean bl = implicit = tag == null || tag.equals("!");
            if (indentlessSequence && this.scanner.checkToken(Token.ID.BlockEntry)) {
                endMark = this.scanner.peekToken().getEndMark();
                event = new SequenceStartEvent(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.BLOCK);
                this.state = new ParseIndentlessSequenceEntryKey(this, null);
            } else if (this.scanner.checkToken(Token.ID.Scalar)) {
                token = (ScalarToken)this.scanner.getToken();
                endMark = token.getEndMark();
                ImplicitTuple implicitValues = ((ScalarToken)token).getPlain() && tag == null || "!".equals(tag) ? new ImplicitTuple(true, false) : (tag == null ? new ImplicitTuple(false, true) : new ImplicitTuple(false, false));
                event = new ScalarEvent(anchor, tag, implicitValues, ((ScalarToken)token).getValue(), startMark, endMark, ((ScalarToken)token).getStyle());
                this.state = this.states.pop();
            } else if (this.scanner.checkToken(Token.ID.FlowSequenceStart)) {
                endMark = this.scanner.peekToken().getEndMark();
                event = new SequenceStartEvent(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.FLOW);
                this.state = new ParseFlowSequenceFirstEntry(this, null);
            } else if (this.scanner.checkToken(Token.ID.FlowMappingStart)) {
                endMark = this.scanner.peekToken().getEndMark();
                event = new MappingStartEvent(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.FLOW);
                this.state = new ParseFlowMappingFirstKey(this, null);
            } else if (block && this.scanner.checkToken(Token.ID.BlockSequenceStart)) {
                endMark = this.scanner.peekToken().getStartMark();
                event = new SequenceStartEvent(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.BLOCK);
                this.state = new ParseBlockSequenceFirstEntry(this, null);
            } else if (block && this.scanner.checkToken(Token.ID.BlockMappingStart)) {
                endMark = this.scanner.peekToken().getStartMark();
                event = new MappingStartEvent(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.BLOCK);
                this.state = new ParseBlockMappingFirstKey(this, null);
            } else if (anchor != null || tag != null) {
                event = new ScalarEvent(anchor, tag, new ImplicitTuple(implicit, false), "", startMark, endMark, DumperOptions.ScalarStyle.PLAIN);
                this.state = this.states.pop();
            } else {
                token = this.scanner.peekToken();
                throw new ParserException("while parsing a " + (block ? "block" : "flow") + " node", startMark, "expected the node content, but found '" + (Object)((Object)token.getTokenId()) + "'", token.getStartMark());
            }
        }
        return event;
    }

    private Event processEmptyScalar(Mark mark) {
        return new ScalarEvent(null, null, new ImplicitTuple(true, false), "", mark, mark, DumperOptions.ScalarStyle.PLAIN);
    }

    static /* synthetic */ Production access$102(ParserImpl x0, Production x1) {
        x0.state = x1;
        return x0.state;
    }

    static /* synthetic */ CommentEvent access$300(ParserImpl x0, CommentToken x1) {
        return x0.produceCommentEvent(x1);
    }

    static /* synthetic */ ArrayStack access$500(ParserImpl x0) {
        return x0.states;
    }

    static /* synthetic */ VersionTagsTuple access$800(ParserImpl x0) {
        return x0.processDirectives();
    }

    static /* synthetic */ ArrayStack access$1000(ParserImpl x0) {
        return x0.marks;
    }

    static /* synthetic */ Event access$1100(ParserImpl x0, Mark x1) {
        return x0.processEmptyScalar(x1);
    }

    static /* synthetic */ Event access$1200(ParserImpl x0, boolean x1, boolean x2) {
        return x0.parseNode(x1, x2);
    }

    static /* synthetic */ Event access$2100(ParserImpl x0) {
        return x0.parseBlockNodeOrIndentlessSequence();
    }

    static /* synthetic */ Production access$100(ParserImpl x0) {
        return x0.state;
    }

    static /* synthetic */ Event access$2400(ParserImpl x0) {
        return x0.parseFlowNode();
    }

    static {
        DEFAULT_TAGS.put("!", "!");
        DEFAULT_TAGS.put("!!", "tag:yaml.org,2002:");
    }
}

