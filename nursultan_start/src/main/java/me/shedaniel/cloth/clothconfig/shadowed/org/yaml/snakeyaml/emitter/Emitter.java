/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$Version
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayStack
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFirstBlockMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFirstBlockSequenceItem;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFirstFlowMappingKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectFirstFlowSequenceItem;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter$ExpectStreamStart;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.EmitterState;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.ScalarAnalysis;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.AliasEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.CollectionEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.CollectionStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.DocumentStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.MappingStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ScalarEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.SequenceStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.StreamEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayStack;

public final class Emitter
implements Emitable {
    public static final int MIN_INDENT = 1;
    public static final int MAX_INDENT = 10;
    private static final char[] SPACE = new char[]{' '};
    private static final Pattern SPACES_PATTERN = Pattern.compile("\\s");
    private static final Set<Character> INVALID_ANCHOR = new HashSet<Character>();
    private static final Map<Character, String> ESCAPE_REPLACEMENTS;
    private static final Map<String, String> DEFAULT_TAG_PREFIXES;
    private final Writer stream;
    private final ArrayStack<EmitterState> states;
    private EmitterState state;
    private final Queue<Event> events;
    private Event event;
    private final ArrayStack<Integer> indents;
    private Integer indent;
    private int flowLevel;
    private boolean rootContext;
    private boolean mappingContext;
    private boolean simpleKeyContext;
    private int column;
    private boolean whitespace;
    private boolean indention;
    private boolean openEnded;
    private final Boolean canonical;
    private final Boolean prettyFlow;
    private final boolean allowUnicode;
    private int bestIndent;
    private final int indicatorIndent;
    private final boolean indentWithIndicator;
    private int bestWidth;
    private final char[] bestLineBreak;
    private final boolean splitLines;
    private final int maxSimpleKeyLength;
    private Map<String, String> tagPrefixes;
    private String preparedAnchor;
    private String preparedTag;
    private ScalarAnalysis analysis;
    private DumperOptions.ScalarStyle style;
    private static final Pattern HANDLE_FORMAT;

    static /* synthetic */ Event access$100(Emitter emitter) {
        return emitter.event;
    }

    static /* synthetic */ boolean access$400(Emitter emitter) {
        return emitter.openEnded;
    }

    static /* synthetic */ String access$500(Emitter emitter, DumperOptions.Version version) {
        return emitter.prepareVersion(version);
    }

    static /* synthetic */ Map access$700() {
        return DEFAULT_TAG_PREFIXES;
    }

    static /* synthetic */ Map access$600(Emitter emitter) {
        return emitter.tagPrefixes;
    }

    public Emitter(Writer writer, DumperOptions dumperOptions) {
        this.stream = writer;
        this.states = new ArrayStack(100);
        this.state = new Emitter$ExpectStreamStart(this, null);
        this.events = new ArrayBlockingQueue<Event>(100);
        this.event = null;
        this.indents = new ArrayStack(10);
        this.indent = null;
        this.flowLevel = 0;
        this.mappingContext = false;
        this.simpleKeyContext = false;
        this.column = 0;
        this.whitespace = true;
        this.indention = true;
        this.openEnded = false;
        this.canonical = dumperOptions.isCanonical();
        this.prettyFlow = dumperOptions.isPrettyFlow();
        this.allowUnicode = dumperOptions.isAllowUnicode();
        this.bestIndent = 2;
        if (dumperOptions.getIndent() > 1 && dumperOptions.getIndent() < 10) {
            this.bestIndent = dumperOptions.getIndent();
        }
        this.indicatorIndent = dumperOptions.getIndicatorIndent();
        this.indentWithIndicator = dumperOptions.getIndentWithIndicator();
        this.bestWidth = 80;
        if (dumperOptions.getWidth() > this.bestIndent * 2) {
            this.bestWidth = dumperOptions.getWidth();
        }
        this.bestLineBreak = dumperOptions.getLineBreak().getString().toCharArray();
        this.splitLines = dumperOptions.getSplitLines();
        this.maxSimpleKeyLength = dumperOptions.getMaxSimpleKeyLength();
        this.tagPrefixes = new LinkedHashMap<String, String>();
        this.preparedAnchor = null;
        this.preparedTag = null;
        this.analysis = null;
        this.style = null;
    }

    static {
        INVALID_ANCHOR.add(Character.valueOf('['));
        INVALID_ANCHOR.add(Character.valueOf(']'));
        INVALID_ANCHOR.add(Character.valueOf('{'));
        INVALID_ANCHOR.add(Character.valueOf('}'));
        INVALID_ANCHOR.add(Character.valueOf(','));
        INVALID_ANCHOR.add(Character.valueOf('*'));
        INVALID_ANCHOR.add(Character.valueOf('&'));
        ESCAPE_REPLACEMENTS = new HashMap<Character, String>();
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u0000'), "0");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u0007'), "a");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\b'), "b");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\t'), "t");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\n'), "n");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u000b'), "v");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\f'), "f");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\r'), "r");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u001b'), "e");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\"'), "\"");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\\'), "\\");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u0085'), "N");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u00a0'), "_");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u2028'), "L");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\u2029'), "P");
        DEFAULT_TAG_PREFIXES = new LinkedHashMap<String, String>();
        DEFAULT_TAG_PREFIXES.put("!", "!");
        DEFAULT_TAG_PREFIXES.put("tag:yaml.org,2002:", "!!");
        HANDLE_FORMAT = Pattern.compile("^![-_\\w]*!$");
    }

    static /* synthetic */ EmitterState access$202(Emitter emitter, EmitterState emitterState) {
        emitter.state = emitterState;
        return emitter.state;
    }

    static /* synthetic */ Map access$602(Emitter emitter, Map map) {
        emitter.tagPrefixes = map;
        return emitter.tagPrefixes;
    }

    static /* synthetic */ Boolean access$1000(Emitter emitter) {
        return emitter.canonical;
    }

    static /* synthetic */ boolean access$1100(Emitter emitter) {
        return emitter.checkEmptyDocument();
    }

    @Override
    public void emit(Event event) throws IOException {
        this.events.add(event);
        while (!this.needMoreEvents()) {
            this.event = this.events.poll();
            this.state.expect();
            this.event = null;
        }
    }

    static /* synthetic */ String access$800(Emitter emitter, String string) {
        return emitter.prepareTagHandle(string);
    }

    static /* synthetic */ String access$900(Emitter emitter, String string) {
        return emitter.prepareTagPrefix(string);
    }

    static /* synthetic */ Integer access$1800(Emitter emitter) {
        return emitter.indent;
    }

    static /* synthetic */ ArrayStack access$1500(Emitter emitter) {
        return emitter.states;
    }

    static /* synthetic */ void access$1600(Emitter emitter, boolean bl, boolean bl2, boolean bl3) throws IOException {
        emitter.expectNode(bl, bl2, bl3);
    }

    static /* synthetic */ int access$2100(Emitter emitter) {
        return emitter.column;
    }

    static /* synthetic */ int access$2200(Emitter emitter) {
        return emitter.bestWidth;
    }

    static /* synthetic */ boolean access$2300(Emitter emitter) {
        return emitter.splitLines;
    }

    static /* synthetic */ Boolean access$2400(Emitter emitter) {
        return emitter.prettyFlow;
    }

    static /* synthetic */ boolean access$2700(Emitter emitter) {
        return emitter.checkSimpleKey();
    }

    static /* synthetic */ ArrayStack access$1900(Emitter emitter) {
        return emitter.indents;
    }

    private void processTag() throws IOException {
        String string = null;
        if (this.event instanceof ScalarEvent) {
            ScalarEvent scalarEvent = (ScalarEvent)this.event;
            string = scalarEvent.getTag();
            if (this.style == null) {
                this.style = this.chooseScalarStyle();
            }
            if ((!this.canonical.booleanValue() || string == null) && (this.style == null && scalarEvent.getImplicit().canOmitTagInPlainScalar() || this.style != null && scalarEvent.getImplicit().canOmitTagInNonPlainScalar())) {
                this.preparedTag = null;
                return;
            }
            if (scalarEvent.getImplicit().canOmitTagInPlainScalar() && string == null) {
                string = "!";
                this.preparedTag = null;
            }
        } else {
            CollectionStartEvent collectionStartEvent = (CollectionStartEvent)this.event;
            string = collectionStartEvent.getTag();
            if ((!this.canonical.booleanValue() || string == null) && collectionStartEvent.getImplicit()) {
                this.preparedTag = null;
                return;
            }
        }
        if (string == null) {
            throw new EmitterException("tag is not specified");
        }
        if (this.preparedTag == null) {
            this.preparedTag = this.prepareTag(string);
        }
        this.writeIndicator(this.preparedTag, true, false, false);
        this.preparedTag = null;
    }

    private String prepareTag(String string) {
        int n;
        String string22;
        if (string.length() == 0) {
            throw new EmitterException("tag must not be empty");
        }
        if ("!".equals(string)) {
            return string;
        }
        String string3 = null;
        String string4 = string;
        for (String string22 : this.tagPrefixes.keySet()) {
            if (!string.startsWith(string22) || !"!".equals(string22) && string22.length() >= string.length()) continue;
            string3 = string22;
        }
        if (string3 != null) {
            string4 = string.substring(string3.length());
            string3 = this.tagPrefixes.get(string3);
        }
        String string5 = string22 = (n = string4.length()) > 0 ? string4.substring(0, n) : "";
        if (string3 != null) {
            return string3 + string22;
        }
        return "!<" + string22 + ">";
    }

    void writePlain(String string, boolean bl) throws IOException {
        if (this.rootContext) {
            this.openEnded = true;
        }
        if (string.length() == 0) {
            return;
        }
        if (!this.whitespace) {
            ++this.column;
            this.stream.write(SPACE);
        }
        this.whitespace = false;
        this.indention = false;
        boolean bl2 = false;
        boolean bl3 = false;
        int n = 0;
        for (int i = 0; i <= string.length(); ++i) {
            int n2;
            char c = '\u0000';
            if (i < string.length()) {
                c = string.charAt(i);
            }
            if (bl2) {
                if (c != ' ') {
                    if (n + 1 == i && this.column > this.bestWidth && bl) {
                        this.writeIndent();
                        this.whitespace = false;
                        this.indention = false;
                    } else {
                        n2 = i - n;
                        this.column += n2;
                        this.stream.write(string, n, n2);
                    }
                    n = i;
                }
            } else if (bl3) {
                if (Constant.LINEBR.hasNo((int)c)) {
                    if (string.charAt(n) == '\n') {
                        this.writeLineBreak(null);
                    }
                    String string2 = string.substring(n, i);
                    for (char c2 : string2.toCharArray()) {
                        if (c2 == '\n') {
                            this.writeLineBreak(null);
                            continue;
                        }
                        this.writeLineBreak(String.valueOf(c2));
                    }
                    this.writeIndent();
                    this.whitespace = false;
                    this.indention = false;
                    n = i;
                }
            } else if (Constant.LINEBR.has((int)c, "\u0000 ")) {
                n2 = i - n;
                this.column += n2;
                this.stream.write(string, n, n2);
                n = i;
            }
            if (c == '\u0000') continue;
            bl2 = c == ' ';
            bl3 = Constant.LINEBR.has((int)c);
        }
    }

    private boolean needEvents(int n) {
        int n2 = 0;
        Iterator iterator = this.events.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            Event event = (Event)iterator.next();
            if (event instanceof DocumentStartEvent || event instanceof CollectionStartEvent) {
                ++n2;
            } else if (event instanceof DocumentEndEvent || event instanceof CollectionEndEvent) {
                --n2;
            } else if (event instanceof StreamEndEvent) {
                n2 = -1;
            }
            if (n2 >= 0) continue;
            return false;
        }
        return this.events.size() < n + 1;
    }

    private void expectNode(boolean bl, boolean bl2, boolean bl3) throws IOException {
        this.rootContext = bl;
        this.mappingContext = bl2;
        this.simpleKeyContext = bl3;
        if (this.event instanceof AliasEvent) {
            this.expectAlias();
        } else if (this.event instanceof ScalarEvent || this.event instanceof CollectionStartEvent) {
            this.processAnchor("&");
            this.processTag();
            if (this.event instanceof ScalarEvent) {
                this.expectScalar();
            } else if (this.event instanceof SequenceStartEvent) {
                if (this.flowLevel != 0 || this.canonical.booleanValue() || ((SequenceStartEvent)this.event).isFlow() || this.checkEmptySequence()) {
                    this.expectFlowSequence();
                } else {
                    this.expectBlockSequence();
                }
            } else if (this.flowLevel != 0 || this.canonical.booleanValue() || ((MappingStartEvent)this.event).isFlow() || this.checkEmptyMapping()) {
                this.expectFlowMapping();
            } else {
                this.expectBlockMapping();
            }
        } else {
            throw new EmitterException("expected NodeEvent, but got " + this.event);
        }
    }

    static /* synthetic */ boolean access$3200(Emitter emitter) {
        return emitter.indentWithIndicator;
    }

    void writeIndent() throws IOException {
        int n = this.indent != null ? this.indent : 0;
        if (!this.indention || this.column > n || this.column == n && !this.whitespace) {
            this.writeLineBreak(null);
        }
        this.writeWhitespace(n - this.column);
    }

    static /* synthetic */ int access$3300(Emitter emitter) {
        return emitter.indicatorIndent;
    }

    static /* synthetic */ void access$3400(Emitter emitter, int n) throws IOException {
        emitter.writeWhitespace(n);
    }

    void flushStream() throws IOException {
        this.stream.flush();
    }

    static /* synthetic */ Integer access$1802(Emitter emitter, Integer n) {
        emitter.indent = n;
        return emitter.indent;
    }

    void writeIndicator(String string, boolean bl, boolean bl2, boolean bl3) throws IOException {
        if (!this.whitespace && bl) {
            ++this.column;
            this.stream.write(SPACE);
        }
        this.whitespace = bl2;
        this.indention = this.indention && bl3;
        this.column += string.length();
        this.openEnded = false;
        this.stream.write(string);
    }

    private boolean checkSimpleKey() {
        int n = 0;
        if (this.event instanceof NodeEvent && ((NodeEvent)this.event).getAnchor() != null) {
            if (this.preparedAnchor == null) {
                this.preparedAnchor = Emitter.prepareAnchor(((NodeEvent)this.event).getAnchor());
            }
            n += this.preparedAnchor.length();
        }
        String string = null;
        if (this.event instanceof ScalarEvent) {
            string = ((ScalarEvent)this.event).getTag();
        } else if (this.event instanceof CollectionStartEvent) {
            string = ((CollectionStartEvent)this.event).getTag();
        }
        if (string != null) {
            if (this.preparedTag == null) {
                this.preparedTag = this.prepareTag(string);
            }
            n += this.preparedTag.length();
        }
        if (this.event instanceof ScalarEvent) {
            if (this.analysis == null) {
                this.analysis = this.analyzeScalar(((ScalarEvent)this.event).getValue());
            }
            n += this.analysis.getScalar().length();
        }
        return n < this.maxSimpleKeyLength && (this.event instanceof AliasEvent || this.event instanceof ScalarEvent && !this.analysis.isEmpty() && !this.analysis.isMultiline() || this.checkEmptySequence() || this.checkEmptyMapping());
    }

    private void writeLineBreak(String string) throws IOException {
        this.whitespace = true;
        this.indention = true;
        this.column = 0;
        if (string == null) {
            this.stream.write(this.bestLineBreak);
        } else {
            this.stream.write(string);
        }
    }

    void writeStreamEnd() throws IOException {
        this.flushStream();
    }

    void writeStreamStart() {
    }

    void writeTagDirective(String string, String string2) throws IOException {
        this.stream.write("%TAG ");
        this.stream.write(string);
        this.stream.write(SPACE);
        this.stream.write(string2);
        this.writeLineBreak(null);
    }

    /*
     * Unable to fully structure code
     */
    private ScalarAnalysis analyzeScalar(String var1_1) {
        if (var1_1.length() == 0) {
            return new ScalarAnalysis(var1_1, true, false, false, true, true, false);
        }
        var2_2 = false;
        var3_3 = false;
        var4_4 = false;
        var5_5 = false;
        var6_6 = false;
        var7_7 = false;
        var8_8 = false;
        var9_9 = false;
        var10_10 = false;
        var11_11 = false;
        if (var1_1.startsWith("---") || var1_1.startsWith("...")) {
            var2_2 = true;
            var3_3 = true;
        }
        var12_12 = true;
        var13_13 = var1_1.length() == 1 || Constant.NULL_BL_T_LINEBR.has(var1_1.codePointAt(1)) != false;
        var14_14 = false;
        var15_15 = false;
        var16_16 = 0;
        while (var16_16 < var1_1.length()) {
            block34: {
                block35: {
                    var17_17 = var1_1.codePointAt(var16_16);
                    if (var16_16 == 0) {
                        if ("#,[]{}&*!|>'\"%@`".indexOf(var17_17) != -1) {
                            var3_3 = true;
                            var2_2 = true;
                        }
                        if (var17_17 == 63 || var17_17 == 58) {
                            var3_3 = true;
                            if (var13_13) {
                                var2_2 = true;
                            }
                        }
                        if (var17_17 == 45 && var13_13) {
                            var3_3 = true;
                            var2_2 = true;
                        }
                    } else {
                        if (",?[]{}".indexOf(var17_17) != -1) {
                            var3_3 = true;
                        }
                        if (var17_17 == 58) {
                            var3_3 = true;
                            if (var13_13) {
                                var2_2 = true;
                            }
                        }
                        if (var17_17 == 35 && var12_12) {
                            var3_3 = true;
                            var2_2 = true;
                        }
                    }
                    if ((var18_18 = (int)Constant.LINEBR.has(var17_17)) != 0) {
                        var4_4 = true;
                    }
                    if (var17_17 == 10) break block34;
                    if (32 > var17_17) break block35;
                    if (var17_17 <= 126) break block34;
                }
                if (var17_17 == 133) ** GOTO lbl-1000
                if (var17_17 >= 160 && var17_17 <= 55295 || var17_17 >= 57344 && var17_17 <= 65533 || var17_17 >= 65536 && var17_17 <= 0x10FFFF) lbl-1000:
                // 2 sources

                {
                    if (!this.allowUnicode) {
                        var5_5 = true;
                    }
                } else {
                    var5_5 = true;
                }
            }
            if (var17_17 == 32) {
                if (var16_16 == 0) {
                    var6_6 = true;
                }
                if (var16_16 == var1_1.length() - 1) {
                    var8_8 = true;
                }
                if (var15_15) {
                    var10_10 = true;
                }
                var14_14 = true;
                var15_15 = false;
            } else if (var18_18 != 0) {
                if (var16_16 == 0) {
                    var7_7 = true;
                }
                if (var16_16 == var1_1.length() - 1) {
                    var9_9 = true;
                }
                if (var14_14) {
                    var11_11 = true;
                }
                var14_14 = false;
                var15_15 = true;
            } else {
                var14_14 = false;
                var15_15 = false;
            }
            var12_12 = Constant.NULL_BL_T.has(var17_17) != false || var18_18 != 0;
            var13_13 = true;
            if ((var16_16 += Character.charCount(var17_17)) + 1 >= var1_1.length() || (var19_19 = var16_16 + Character.charCount(var1_1.codePointAt(var16_16))) >= var1_1.length()) continue;
            var13_13 = Constant.NULL_BL_T.has(var1_1.codePointAt(var19_19)) != false || var18_18 != 0;
        }
        var17_17 = 1;
        var18_18 = 1;
        var19_19 = 1;
        var20_20 = 1;
        if (var6_6 || var7_7 || var8_8 || var9_9) {
            var18_18 = 0;
            var17_17 = 0;
        }
        if (var8_8) {
            var20_20 = 0;
        }
        if (var10_10) {
            var19_19 = 0;
            var18_18 = 0;
            var17_17 = 0;
        }
        if (var11_11 || var5_5) {
            var20_20 = 0;
            var19_19 = 0;
            var18_18 = 0;
            var17_17 = 0;
        }
        if (var4_4) {
            var17_17 = 0;
        }
        if (var3_3) {
            var17_17 = 0;
        }
        if (var2_2) {
            var18_18 = 0;
        }
        return new ScalarAnalysis(var1_1, false, var4_4, (boolean)var17_17, (boolean)var18_18, (boolean)var19_19, (boolean)var20_20);
    }

    private String prepareTagHandle(String string) {
        if (string.length() == 0) {
            throw new EmitterException("tag handle must not be empty");
        }
        if (string.charAt(0) != '!' || string.charAt(string.length() - 1) != '!') {
            throw new EmitterException("tag handle must start and end with '!': " + string);
        }
        if (!"!".equals(string) && !HANDLE_FORMAT.matcher(string).matches()) {
            throw new EmitterException("invalid character in the tag handle: " + string);
        }
        return string;
    }

    void writeFolded(String string, boolean bl) throws IOException {
        String string2 = this.determineBlockHints(string);
        this.writeIndicator(">" + string2, true, false, false);
        if (string2.length() > 0 && string2.charAt(string2.length() - 1) == '+') {
            this.openEnded = true;
        }
        this.writeLineBreak(null);
        boolean bl2 = true;
        boolean bl3 = false;
        boolean bl4 = true;
        int n = 0;
        for (int i = 0; i <= string.length(); ++i) {
            char c = '\u0000';
            if (i < string.length()) {
                c = string.charAt(i);
            }
            if (bl4) {
                if (c == '\u0000' || Constant.LINEBR.hasNo((int)c)) {
                    if (!bl2 && c != '\u0000' && c != ' ' && string.charAt(n) == '\n') {
                        this.writeLineBreak(null);
                    }
                    bl2 = c == ' ';
                    String string3 = string.substring(n, i);
                    for (char c2 : string3.toCharArray()) {
                        if (c2 == '\n') {
                            this.writeLineBreak(null);
                            continue;
                        }
                        this.writeLineBreak(String.valueOf(c2));
                    }
                    if (c != '\u0000') {
                        this.writeIndent();
                    }
                    n = i;
                }
            } else if (bl3) {
                if (c != ' ') {
                    if (n + 1 == i && this.column > this.bestWidth && bl) {
                        this.writeIndent();
                    } else {
                        int n2 = i - n;
                        this.column += n2;
                        this.stream.write(string, n, n2);
                    }
                    n = i;
                }
            } else if (Constant.LINEBR.has((int)c, "\u0000 ")) {
                int n3 = i - n;
                this.column += n3;
                this.stream.write(string, n, n3);
                if (c == '\u0000') {
                    this.writeLineBreak(null);
                }
                n = i;
            }
            if (c == '\u0000') continue;
            bl4 = Constant.LINEBR.has((int)c);
            bl3 = c == ' ';
        }
    }

    private boolean checkEmptyDocument() {
        if (!(this.event instanceof DocumentStartEvent) || this.events.isEmpty()) {
            return false;
        }
        Event event = this.events.peek();
        if (event instanceof ScalarEvent) {
            ScalarEvent scalarEvent = (ScalarEvent)event;
            return scalarEvent.getAnchor() == null && scalarEvent.getTag() == null && scalarEvent.getImplicit() != null && scalarEvent.getValue().length() == 0;
        }
        return false;
    }

    private String prepareTagPrefix(String string) {
        if (string.length() == 0) {
            throw new EmitterException("tag prefix must not be empty");
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        int n2 = 0;
        if (string.charAt(0) == '!') {
            n2 = 1;
        }
        while (n2 < string.length()) {
            ++n2;
        }
        if (n < n2) {
            stringBuilder.append(string, n, n2);
        }
        return stringBuilder.toString();
    }

    private void expectFlowSequence() throws IOException {
        this.writeIndicator("[", true, true, false);
        ++this.flowLevel;
        this.increaseIndent(true, false);
        if (this.prettyFlow.booleanValue()) {
            this.writeIndent();
        }
        this.state = new Emitter$ExpectFirstFlowSequenceItem(this, null);
    }

    private void increaseIndent(boolean bl, boolean bl2) {
        this.indents.push((Object)this.indent);
        if (this.indent == null) {
            this.indent = bl ? Integer.valueOf(this.bestIndent) : Integer.valueOf(0);
        } else if (!bl2) {
            Emitter emitter = this;
            emitter.indent = emitter.indent + this.bestIndent;
        }
    }

    private boolean needMoreEvents() {
        if (this.events.isEmpty()) {
            return true;
        }
        Event event = this.events.peek();
        if (event instanceof DocumentStartEvent) {
            return this.needEvents(1);
        }
        if (event instanceof SequenceStartEvent) {
            return this.needEvents(2);
        }
        if (event instanceof MappingStartEvent) {
            return this.needEvents(3);
        }
        return false;
    }

    private void processAnchor(String string) throws IOException {
        NodeEvent nodeEvent = (NodeEvent)this.event;
        if (nodeEvent.getAnchor() == null) {
            this.preparedAnchor = null;
            return;
        }
        if (this.preparedAnchor == null) {
            this.preparedAnchor = Emitter.prepareAnchor(nodeEvent.getAnchor());
        }
        this.writeIndicator(string + this.preparedAnchor, true, false, false);
        this.preparedAnchor = null;
    }

    private void writeWhitespace(int n) throws IOException {
        if (n <= 0) {
            return;
        }
        this.whitespace = true;
        char[] cArray = new char[n];
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = 32;
        }
        this.column += n;
        this.stream.write(cArray);
    }

    private void expectAlias() throws IOException {
        if (!(this.event instanceof AliasEvent)) {
            throw new EmitterException("Alias must be provided");
        }
        this.processAnchor("*");
        this.state = (EmitterState)this.states.pop();
    }

    static /* synthetic */ int access$2010(Emitter emitter) {
        return emitter.flowLevel--;
    }

    private String prepareVersion(DumperOptions.Version version) {
        if (version.major() != 1) {
            throw new EmitterException("unsupported YAML version: " + version);
        }
        return version.getRepresentation();
    }

    private void expectFlowMapping() throws IOException {
        this.writeIndicator("{", true, true, false);
        ++this.flowLevel;
        this.increaseIndent(true, false);
        if (this.prettyFlow.booleanValue()) {
            this.writeIndent();
        }
        this.state = new Emitter$ExpectFirstFlowMappingKey(this, null);
    }

    private void processScalar() throws IOException {
        boolean bl;
        ScalarEvent scalarEvent = (ScalarEvent)this.event;
        if (this.analysis == null) {
            this.analysis = this.analyzeScalar(scalarEvent.getValue());
        }
        if (this.style == null) {
            this.style = this.chooseScalarStyle();
        }
        boolean bl2 = bl = !this.simpleKeyContext && this.splitLines;
        if (this.style == null) {
            this.writePlain(this.analysis.getScalar(), bl);
        } else {
            switch (this.style) {
                case DOUBLE_QUOTED: {
                    this.writeDoubleQuoted(this.analysis.getScalar(), bl);
                    break;
                }
                case SINGLE_QUOTED: {
                    this.writeSingleQuoted(this.analysis.getScalar(), bl);
                    break;
                }
                case FOLDED: {
                    this.writeFolded(this.analysis.getScalar(), bl);
                    break;
                }
                case LITERAL: {
                    this.writeLiteral(this.analysis.getScalar());
                    break;
                }
                default: {
                    throw new YAMLException("Unexpected style: " + this.style);
                }
            }
        }
        this.analysis = null;
        this.style = null;
    }

    private void expectScalar() throws IOException {
        this.increaseIndent(true, false);
        this.processScalar();
        this.indent = (Integer)this.indents.pop();
        this.state = (EmitterState)this.states.pop();
    }

    private boolean checkEmptyMapping() {
        return this.event instanceof MappingStartEvent && !this.events.isEmpty() && this.events.peek() instanceof MappingEndEvent;
    }

    private void expectBlockMapping() throws IOException {
        this.increaseIndent(false, false);
        this.state = new Emitter$ExpectFirstBlockMappingKey(this, null);
    }

    void writeLiteral(String string) throws IOException {
        String string2 = this.determineBlockHints(string);
        this.writeIndicator("|" + string2, true, false, false);
        if (string2.length() > 0 && string2.charAt(string2.length() - 1) == '+') {
            this.openEnded = true;
        }
        this.writeLineBreak(null);
        boolean bl = true;
        int n = 0;
        for (int i = 0; i <= string.length(); ++i) {
            char c = '\u0000';
            if (i < string.length()) {
                c = string.charAt(i);
            }
            if (bl) {
                if (c == '\u0000' || Constant.LINEBR.hasNo((int)c)) {
                    String string3 = string.substring(n, i);
                    for (char c2 : string3.toCharArray()) {
                        if (c2 == '\n') {
                            this.writeLineBreak(null);
                            continue;
                        }
                        this.writeLineBreak(String.valueOf(c2));
                    }
                    if (c != '\u0000') {
                        this.writeIndent();
                    }
                    n = i;
                }
            } else if (c == '\u0000' || Constant.LINEBR.has((int)c)) {
                this.stream.write(string, n, i - n);
                if (c == '\u0000') {
                    this.writeLineBreak(null);
                }
                n = i;
            }
            if (c == '\u0000') continue;
            bl = Constant.LINEBR.has((int)c);
        }
    }

    private DumperOptions.ScalarStyle chooseScalarStyle() {
        ScalarEvent scalarEvent = (ScalarEvent)this.event;
        if (this.analysis == null) {
            this.analysis = this.analyzeScalar(scalarEvent.getValue());
        }
        if (!scalarEvent.isPlain() && scalarEvent.getScalarStyle() == DumperOptions.ScalarStyle.DOUBLE_QUOTED || this.canonical.booleanValue()) {
            return DumperOptions.ScalarStyle.DOUBLE_QUOTED;
        }
        if (scalarEvent.isPlain() && scalarEvent.getImplicit().canOmitTagInPlainScalar() && (!this.simpleKeyContext || !this.analysis.isEmpty() && !this.analysis.isMultiline()) && (this.flowLevel != 0 && this.analysis.isAllowFlowPlain() || this.flowLevel == 0 && this.analysis.isAllowBlockPlain())) {
            return null;
        }
        if (!(scalarEvent.isPlain() || scalarEvent.getScalarStyle() != DumperOptions.ScalarStyle.LITERAL && scalarEvent.getScalarStyle() != DumperOptions.ScalarStyle.FOLDED || this.flowLevel != 0 || this.simpleKeyContext || !this.analysis.isAllowBlock())) {
            return scalarEvent.getScalarStyle();
        }
        if (!(!scalarEvent.isPlain() && scalarEvent.getScalarStyle() != DumperOptions.ScalarStyle.SINGLE_QUOTED || !this.analysis.isAllowSingleQuoted() || this.simpleKeyContext && this.analysis.isMultiline())) {
            return DumperOptions.ScalarStyle.SINGLE_QUOTED;
        }
        return DumperOptions.ScalarStyle.DOUBLE_QUOTED;
    }

    private void writeSingleQuoted(String string, boolean bl) throws IOException {
        this.writeIndicator("'", true, false, false);
        boolean bl2 = false;
        boolean bl3 = false;
        int n = 0;
        for (int i = 0; i <= string.length(); ++i) {
            int n2;
            char c = '\u0000';
            if (i < string.length()) {
                c = string.charAt(i);
            }
            if (bl2) {
                if (c == '\u0000' || c != ' ') {
                    if (n + 1 == i && this.column > this.bestWidth && bl && n != 0 && i != string.length()) {
                        this.writeIndent();
                    } else {
                        n2 = i - n;
                        this.column += n2;
                        this.stream.write(string, n, n2);
                    }
                    n = i;
                }
            } else if (bl3) {
                if (c == '\u0000' || Constant.LINEBR.hasNo((int)c)) {
                    if (string.charAt(n) == '\n') {
                        this.writeLineBreak(null);
                    }
                    String string2 = string.substring(n, i);
                    for (char c2 : string2.toCharArray()) {
                        if (c2 == '\n') {
                            this.writeLineBreak(null);
                            continue;
                        }
                        this.writeLineBreak(String.valueOf(c2));
                    }
                    this.writeIndent();
                    n = i;
                }
            } else if (Constant.LINEBR.has((int)c, "\u0000 '") && n < i) {
                n2 = i - n;
                this.column += n2;
                this.stream.write(string, n, n2);
                n = i;
            }
            if (c == '\'') {
                this.column += 2;
                this.stream.write("''");
                n = i + 1;
            }
            if (c == '\u0000') continue;
            bl2 = c == ' ';
            bl3 = Constant.LINEBR.has((int)c);
        }
        this.writeIndicator("'", false, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void writeDoubleQuoted(String string, boolean bl) throws IOException {
        this.writeIndicator("\"", true, false, false);
        int n = 0;
        int n2 = 0;
        while (true) {
            Character c;
            block12: {
                String string2;
                block11: {
                    block15: {
                        Object object;
                        block16: {
                            block14: {
                                block13: {
                                    if (n2 > string.length()) {
                                        this.writeIndicator("\"", false, false, false);
                                        return;
                                    }
                                    c = null;
                                    if (n2 < string.length()) {
                                        c = Character.valueOf(string.charAt(n2));
                                    }
                                    if (c != null && "\"\\\u0085\u2028\u2029\ufeff".indexOf(c.charValue()) == -1 && ' ' <= c.charValue() && c.charValue() <= '~') break block12;
                                    if (n < n2) {
                                        int n3 = n2 - n;
                                        this.column += n3;
                                        this.stream.write(string, n, n3);
                                        n = n2;
                                    }
                                    if (c == null) break block12;
                                    if (!ESCAPE_REPLACEMENTS.containsKey(c)) break block13;
                                    string2 = "\\" + ESCAPE_REPLACEMENTS.get(c);
                                    break block11;
                                }
                                if (!this.allowUnicode) break block14;
                                if (StreamReader.isPrintable(c.charValue())) break block15;
                            }
                            if (c.charValue() > '\u00ff') break block16;
                            object = "0" + Integer.toString(c.charValue(), 16);
                            string2 = "\\x" + ((String)object).substring(((String)object).length() - 2);
                            break block11;
                        }
                        if (c.charValue() >= '\ud800' && c.charValue() <= '\udbff') {
                            if (n2 + 1 < string.length()) {
                                object = Character.valueOf(string.charAt(++n2));
                                String string3 = "000" + Long.toHexString(Character.toCodePoint(c.charValue(), ((Character)object).charValue()));
                                string2 = "\\U" + string3.substring(string3.length() - 8);
                                break block11;
                            } else {
                                object = "000" + Integer.toString(c.charValue(), 16);
                                string2 = "\\u" + ((String)object).substring(((String)object).length() - 4);
                            }
                            break block11;
                        } else {
                            object = "000" + Integer.toString(c.charValue(), 16);
                            string2 = "\\u" + ((String)object).substring(((String)object).length() - 4);
                        }
                        break block11;
                    }
                    string2 = String.valueOf(c);
                }
                this.column += string2.length();
                this.stream.write(string2);
                n = n2 + 1;
            }
            if (0 < n2 && n2 < string.length() - 1 && (c.charValue() == ' ' || n >= n2) && this.column + (n2 - n) > this.bestWidth && bl) {
                String string4 = n >= n2 ? "\\" : string.substring(n, n2) + "\\";
                if (n < n2) {
                    n = n2;
                }
                this.column += string4.length();
                this.stream.write(string4);
                this.writeIndent();
                this.whitespace = false;
                this.indention = false;
                if (string.charAt(n) == ' ') {
                    string4 = "\\";
                    this.column += string4.length();
                    this.stream.write(string4);
                }
            }
            ++n2;
        }
    }

    private boolean checkEmptySequence() {
        return this.event instanceof SequenceStartEvent && !this.events.isEmpty() && this.events.peek() instanceof SequenceEndEvent;
    }

    static String prepareAnchor(String string) {
        if (string.length() == 0) {
            throw new EmitterException("anchor must not be empty");
        }
        for (Character c : INVALID_ANCHOR) {
            if (string.indexOf(c.charValue()) <= -1) continue;
            throw new EmitterException("Invalid character '" + c + "' in the anchor: " + string);
        }
        Matcher matcher = SPACES_PATTERN.matcher(string);
        if (matcher.find()) {
            throw new EmitterException("Anchor may not contain spaces: " + string);
        }
        return string;
    }

    void writeVersionDirective(String string) throws IOException {
        this.stream.write("%YAML ");
        this.stream.write(string);
        this.writeLineBreak(null);
    }

    private void expectBlockSequence() throws IOException {
        boolean bl = this.mappingContext && !this.indention;
        this.increaseIndent(false, bl);
        this.state = new Emitter$ExpectFirstBlockSequenceItem(this, null);
    }

    private String determineBlockHints(String string) {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        if (Constant.LINEBR.has((int)string.charAt(0), " ")) {
            stringBuilder.append(this.bestIndent);
        }
        if (Constant.LINEBR.hasNo((int)(c = string.charAt(string.length() - 1)))) {
            stringBuilder.append("-");
        } else if (string.length() == 1 || Constant.LINEBR.has((int)string.charAt(string.length() - 2))) {
            stringBuilder.append("+");
        }
        return stringBuilder.toString();
    }
}

