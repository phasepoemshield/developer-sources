/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Scanner;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.ScannerException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.ScannerImpl$Chomping;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.SimpleKey;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.AliasToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.AnchorToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.BlockEndToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.BlockEntryToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.BlockMappingStartToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.BlockSequenceStartToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.DirectiveToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.DocumentEndToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.DocumentStartToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.FlowEntryToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.FlowMappingEndToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.FlowMappingStartToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.FlowSequenceEndToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.FlowSequenceStartToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.KeyToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.ScalarToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.StreamEndToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.StreamStartToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.ValueToken;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayStack;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.UriEncoder;

public final class ScannerImpl
implements Scanner {
    private static final Pattern NOT_HEXA = Pattern.compile("[^0-9A-Fa-f]");
    public static final Map<Character, String> ESCAPE_REPLACEMENTS = new HashMap<Character, String>();
    public static final Map<Character, Integer> ESCAPE_CODES = new HashMap<Character, Integer>();
    private final StreamReader reader;
    private boolean done = false;
    private int flowLevel = 0;
    private List<Token> tokens;
    private int tokensTaken = 0;
    private int indent = -1;
    private ArrayStack<Integer> indents;
    private boolean allowSimpleKey = true;
    private Map<Integer, SimpleKey> possibleSimpleKeys;

    public ScannerImpl(StreamReader streamReader) {
        this.reader = streamReader;
        this.tokens = new ArrayList<Token>(100);
        this.indents = new ArrayStack(10);
        this.possibleSimpleKeys = new LinkedHashMap<Integer, SimpleKey>();
        this.fetchStreamStart();
    }

    static {
        ESCAPE_REPLACEMENTS.put(Character.valueOf('0'), "\u0000");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('a'), "\u0007");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('b'), "\b");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('t'), "\t");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('n'), "\n");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('v'), "\u000b");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('f'), "\f");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('r'), "\r");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('e'), "\u001b");
        ESCAPE_REPLACEMENTS.put(Character.valueOf(' '), " ");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\"'), "\"");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('\\'), "\\");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('N'), "\u0085");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('_'), "\u00a0");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('L'), "\u2028");
        ESCAPE_REPLACEMENTS.put(Character.valueOf('P'), "\u2029");
        ESCAPE_CODES.put(Character.valueOf('x'), 2);
        ESCAPE_CODES.put(Character.valueOf('u'), 4);
        ESCAPE_CODES.put(Character.valueOf('U'), 8);
    }

    private boolean checkKey() {
        if (this.flowLevel != 0) {
            return true;
        }
        return Constant.NULL_BL_T_LINEBR.has(this.reader.peek(1));
    }

    @Override
    public Token getToken() {
        ++this.tokensTaken;
        return this.tokens.remove(0);
    }

    private void fetchDocumentIndicator(boolean bl) {
        this.unwindIndent(-1);
        this.removePossibleSimpleKey();
        this.allowSimpleKey = false;
        Mark mark = this.reader.getMark();
        this.reader.forward(3);
        Mark mark2 = this.reader.getMark();
        Token token = bl ? new DocumentStartToken(mark, mark2) : new DocumentEndToken(mark, mark2);
        this.tokens.add(token);
    }

    private void fetchFlowMappingStart() {
        this.fetchFlowCollectionStart(true);
    }

    private String scanBlockScalarIgnoredLine(Mark mark) {
        while (this.reader.peek() == 32) {
            this.reader.forward();
        }
        if (this.reader.peek() == 35) {
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek())) {
                this.reader.forward();
            }
        }
        int n = this.reader.peek();
        String string = this.scanLineBreak();
        if (string.length() == 0 && n != 0) {
            String string2 = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a block scalar", mark, "expected a comment or a line break, but found " + string2 + "(" + n + ")", this.reader.getMark());
        }
        return string;
    }

    private void fetchFlowCollectionStart(boolean bl) {
        this.savePossibleSimpleKey();
        ++this.flowLevel;
        this.allowSimpleKey = true;
        Mark mark = this.reader.getMark();
        this.reader.forward(1);
        Mark mark2 = this.reader.getMark();
        Token token = bl ? new FlowMappingStartToken(mark, mark2) : new FlowSequenceStartToken(mark, mark2);
        this.tokens.add(token);
    }

    private void removePossibleSimpleKey() {
        SimpleKey simpleKey = this.possibleSimpleKeys.remove(this.flowLevel);
        if (simpleKey != null && simpleKey.isRequired()) {
            throw new ScannerException("while scanning a simple key", simpleKey.getMark(), "could not find expected ':'", this.reader.getMark());
        }
    }

    private void fetchFlowCollectionEnd(boolean bl) {
        this.removePossibleSimpleKey();
        --this.flowLevel;
        this.allowSimpleKey = false;
        Mark mark = this.reader.getMark();
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        Token token = bl ? new FlowMappingEndToken(mark, mark2) : new FlowSequenceEndToken(mark, mark2);
        this.tokens.add(token);
    }

    private void fetchFlowMappingEnd() {
        this.fetchFlowCollectionEnd(true);
    }

    private List<Integer> scanYamlDirectiveValue(Mark mark) {
        while (this.reader.peek() == 32) {
            this.reader.forward();
        }
        Integer n = this.scanYamlDirectiveNumber(mark);
        int n2 = this.reader.peek();
        if (n2 != 46) {
            String string = String.valueOf(Character.toChars(n2));
            throw new ScannerException("while scanning a directive", mark, "expected a digit or '.', but found " + string + "(" + n2 + ")", this.reader.getMark());
        }
        this.reader.forward();
        Integer n3 = this.scanYamlDirectiveNumber(mark);
        n2 = this.reader.peek();
        if (Constant.NULL_BL_LINEBR.hasNo(n2)) {
            String string = String.valueOf(Character.toChars(n2));
            throw new ScannerException("while scanning a directive", mark, "expected a digit or ' ', but found " + string + "(" + n2 + ")", this.reader.getMark());
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(2);
        arrayList.add(n);
        arrayList.add(n3);
        return arrayList;
    }

    private void savePossibleSimpleKey() {
        boolean bl;
        boolean bl2 = bl = this.flowLevel == 0 && this.indent == this.reader.getColumn();
        if (!this.allowSimpleKey && bl) {
            throw new YAMLException("A simple key is required only if it is the first token in the current line");
        }
        if (this.allowSimpleKey) {
            this.removePossibleSimpleKey();
            int n = this.tokensTaken + this.tokens.size();
            SimpleKey simpleKey = new SimpleKey(n, bl, this.reader.getIndex(), this.reader.getLine(), this.reader.getColumn(), this.reader.getMark());
            this.possibleSimpleKeys.put(this.flowLevel, simpleKey);
        }
    }

    private void scanDirectiveIgnoredLine(Mark mark) {
        while (this.reader.peek() == 32) {
            this.reader.forward();
        }
        if (this.reader.peek() == 35) {
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek())) {
                this.reader.forward();
            }
        }
        int n = this.reader.peek();
        String string = this.scanLineBreak();
        if (string.length() == 0 && n != 0) {
            String string2 = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a directive", mark, "expected a comment or a line break, but found " + string2 + "(" + n + ")", this.reader.getMark());
        }
    }

    private Integer scanYamlDirectiveNumber(Mark mark) {
        int n = this.reader.peek();
        if (!Character.isDigit(n)) {
            String string = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a directive", mark, "expected a digit, but found " + string + "(" + n + ")", this.reader.getMark());
        }
        int n2 = 0;
        while (Character.isDigit(this.reader.peek(n2))) {
            ++n2;
        }
        Integer n3 = Integer.parseInt(this.reader.prefixForward(n2));
        return n3;
    }

    private String scanTagDirectiveHandle(Mark mark) {
        String string = this.scanTagHandle("directive", mark);
        int n = this.reader.peek();
        if (n != 32) {
            String string2 = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a directive", mark, "expected ' ', but found " + string2 + "(" + n + ")", this.reader.getMark());
        }
        return string;
    }

    private void fetchFlowSequenceStart() {
        this.fetchFlowCollectionStart(false);
    }

    private String scanTagDirectivePrefix(Mark mark) {
        String string = this.scanTagUri("directive", mark);
        int n = this.reader.peek();
        if (Constant.NULL_BL_LINEBR.hasNo(n)) {
            String string2 = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a directive", mark, "expected ' ', but found " + string2 + "(" + n + ")", this.reader.getMark());
        }
        return string;
    }

    private void fetchFlowSequenceEnd() {
        this.fetchFlowCollectionEnd(false);
    }

    private void stalePossibleSimpleKeys() {
        if (!this.possibleSimpleKeys.isEmpty()) {
            Iterator<SimpleKey> iterator = this.possibleSimpleKeys.values().iterator();
            while (iterator.hasNext()) {
                SimpleKey simpleKey = iterator.next();
                if (simpleKey.getLine() == this.reader.getLine()) {
                    if (this.reader.getIndex() - simpleKey.getIndex() <= 1024) continue;
                }
                if (simpleKey.isRequired()) {
                    throw new ScannerException("while scanning a simple key", simpleKey.getMark(), "could not find expected ':'", this.reader.getMark());
                }
                iterator.remove();
            }
        }
    }

    private ScannerImpl$Chomping scanBlockScalarIndicators(Mark mark) {
        String string;
        Boolean bl = null;
        int n = -1;
        int n2 = this.reader.peek();
        if (n2 == 45 || n2 == 43) {
            bl = n2 == 43 ? Boolean.TRUE : Boolean.FALSE;
            this.reader.forward();
            n2 = this.reader.peek();
            if (Character.isDigit(n2)) {
                string = String.valueOf(Character.toChars(n2));
                n = Integer.parseInt(string);
                if (n == 0) {
                    throw new ScannerException("while scanning a block scalar", mark, "expected indentation indicator in the range 1-9, but found 0", this.reader.getMark());
                }
                this.reader.forward();
            }
        } else if (Character.isDigit(n2)) {
            string = String.valueOf(Character.toChars(n2));
            n = Integer.parseInt(string);
            if (n == 0) {
                throw new ScannerException("while scanning a block scalar", mark, "expected indentation indicator in the range 1-9, but found 0", this.reader.getMark());
            }
            this.reader.forward();
            n2 = this.reader.peek();
            if (n2 == 45 || n2 == 43) {
                bl = n2 == 43 ? Boolean.TRUE : Boolean.FALSE;
                this.reader.forward();
            }
        }
        if (Constant.NULL_BL_LINEBR.hasNo(n2 = this.reader.peek())) {
            string = String.valueOf(Character.toChars(n2));
            throw new ScannerException("while scanning a block scalar", mark, "expected chomping or indentation indicators, but found " + string + "(" + n2 + ")", this.reader.getMark());
        }
        return new ScannerImpl$Chomping(bl, n);
    }

    private int nextPossibleSimpleKey() {
        if (!this.possibleSimpleKeys.isEmpty()) {
            return this.possibleSimpleKeys.values().iterator().next().getTokenNumber();
        }
        return -1;
    }

    private Object[] scanBlockScalarIndentation() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        Mark mark = this.reader.getMark();
        while (Constant.LINEBR.has(this.reader.peek(), " \r")) {
            if (this.reader.peek() != 32) {
                stringBuilder.append(this.scanLineBreak());
                mark = this.reader.getMark();
                continue;
            }
            this.reader.forward();
            if (this.reader.getColumn() <= n) continue;
            n = this.reader.getColumn();
        }
        return new Object[]{stringBuilder.toString(), n, mark};
    }

    private Object[] scanBlockScalarBreaks(int n) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        Mark mark = this.reader.getMark();
        for (n2 = this.reader.getColumn(); n2 < n && this.reader.peek() == 32; ++n2) {
            this.reader.forward();
        }
        String string = null;
        while ((string = this.scanLineBreak()).length() != 0) {
            stringBuilder.append(string);
            mark = this.reader.getMark();
            for (n2 = this.reader.getColumn(); n2 < n && this.reader.peek() == 32; ++n2) {
                this.reader.forward();
            }
        }
        return new Object[]{stringBuilder.toString(), mark};
    }

    private String scanFlowScalarNonSpaces(boolean bl, Mark mark) {
        StringBuilder stringBuilder;
        block8: {
            String string;
            int n;
            stringBuilder = new StringBuilder();
            while (true) {
                int n2 = 0;
                while (Constant.NULL_BL_T_LINEBR.hasNo(this.reader.peek(n2), "'\"\\")) {
                    ++n2;
                }
                if (n2 != 0) {
                    stringBuilder.append(this.reader.prefixForward(n2));
                }
                n = this.reader.peek();
                if (!bl && n == 39 && this.reader.peek(1) == 39) {
                    stringBuilder.append("'");
                    this.reader.forward(2);
                    continue;
                }
                if (bl && n == 39 || !bl && "\"\\".indexOf(n) != -1) {
                    stringBuilder.appendCodePoint(n);
                    this.reader.forward();
                    continue;
                }
                if (!bl || n != 92) break block8;
                this.reader.forward();
                n = this.reader.peek();
                if (!Character.isSupplementaryCodePoint(n) && ESCAPE_REPLACEMENTS.containsKey(Character.valueOf((char)n))) {
                    stringBuilder.append(ESCAPE_REPLACEMENTS.get(Character.valueOf((char)n)));
                    this.reader.forward();
                    continue;
                }
                if (!Character.isSupplementaryCodePoint(n) && ESCAPE_CODES.containsKey(Character.valueOf((char)n))) {
                    n2 = ESCAPE_CODES.get(Character.valueOf((char)n));
                    this.reader.forward();
                    string = this.reader.prefix(n2);
                    if (NOT_HEXA.matcher(string).find()) {
                        throw new ScannerException("while scanning a double-quoted scalar", mark, "expected escape sequence of " + n2 + " hexadecimal numbers, but found: " + string, this.reader.getMark());
                    }
                    int n3 = Integer.parseInt(string, 16);
                    String string2 = new String(Character.toChars(n3));
                    stringBuilder.append(string2);
                    this.reader.forward(n2);
                    continue;
                }
                if (this.scanLineBreak().length() == 0) break;
                stringBuilder.append(this.scanFlowScalarBreaks(mark));
            }
            string = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a double-quoted scalar", mark, "found unknown escape character " + string + "(" + n + ")", this.reader.getMark());
        }
        return stringBuilder.toString();
    }

    private String scanFlowScalarSpaces(Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (" \t".indexOf(this.reader.peek(n)) != -1) {
            ++n;
        }
        String string = this.reader.prefixForward(n);
        int n2 = this.reader.peek();
        if (n2 == 0) {
            throw new ScannerException("while scanning a quoted scalar", mark, "found unexpected end of stream", this.reader.getMark());
        }
        String string2 = this.scanLineBreak();
        if (string2.length() != 0) {
            String string3 = this.scanFlowScalarBreaks(mark);
            if (!"\n".equals(string2)) {
                stringBuilder.append(string2);
            } else if (string3.length() == 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string3);
        } else {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    private List<String> scanTagDirectiveValue(Mark mark) {
        while (this.reader.peek() == 32) {
            this.reader.forward();
        }
        String string = this.scanTagDirectiveHandle(mark);
        while (this.reader.peek() == 32) {
            this.reader.forward();
        }
        String string2 = this.scanTagDirectivePrefix(mark);
        ArrayList<String> arrayList = new ArrayList<String>(2);
        arrayList.add(string);
        arrayList.add(string2);
        return arrayList;
    }

    private String scanFlowScalarBreaks(Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String string;
            if (("---".equals(string = this.reader.prefix(3)) || "...".equals(string)) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3))) {
                throw new ScannerException("while scanning a quoted scalar", mark, "found unexpected document separator", this.reader.getMark());
            }
            while (" \t".indexOf(this.reader.peek()) != -1) {
                this.reader.forward();
            }
            String string2 = this.scanLineBreak();
            if (string2.length() == 0) break;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    private String scanTagHandle(String string, Mark mark) {
        int n = this.reader.peek();
        if (n != 33) {
            String string2 = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a " + string, mark, "expected '!', but found " + string2 + "(" + n + ")", this.reader.getMark());
        }
        int n2 = 1;
        n = this.reader.peek(n2);
        if (n != 32) {
            while (Constant.ALPHA.has(n)) {
                n = this.reader.peek(++n2);
            }
            if (n != 33) {
                this.reader.forward(n2);
                String string3 = String.valueOf(Character.toChars(n));
                throw new ScannerException("while scanning a " + string, mark, "expected '!', but found " + string3 + "(" + n + ")", this.reader.getMark());
            }
            ++n2;
        }
        String string4 = this.reader.prefixForward(n2);
        return string4;
    }

    private String scanDirectiveName(Mark mark) {
        int n = 0;
        int n2 = this.reader.peek(n);
        while (Constant.ALPHA.has(n2)) {
            n2 = this.reader.peek(++n);
        }
        if (n == 0) {
            String string = String.valueOf(Character.toChars(n2));
            throw new ScannerException("while scanning a directive", mark, "expected alphabetic or numeric character, but found " + string + "(" + n2 + ")", this.reader.getMark());
        }
        String string = this.reader.prefixForward(n);
        n2 = this.reader.peek();
        if (Constant.NULL_BL_LINEBR.hasNo(n2)) {
            String string2 = String.valueOf(Character.toChars(n2));
            throw new ScannerException("while scanning a directive", mark, "expected alphabetic or numeric character, but found " + string2 + "(" + n2 + ")", this.reader.getMark());
        }
        return string;
    }

    private String scanPlainSpaces() {
        int n = 0;
        while (this.reader.peek(n) == 32 || this.reader.peek(n) == 9) {
            ++n;
        }
        String string = this.reader.prefixForward(n);
        String string2 = this.scanLineBreak();
        if (string2.length() != 0) {
            StringBuilder stringBuilder;
            block7: {
                this.allowSimpleKey = true;
                String string3 = this.reader.prefix(3);
                if ("---".equals(string3) || "...".equals(string3) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3))) {
                    return "";
                }
                stringBuilder = new StringBuilder();
                while (true) {
                    if (this.reader.peek() == 32) {
                        this.reader.forward();
                        continue;
                    }
                    String string4 = this.scanLineBreak();
                    if (string4.length() == 0) break block7;
                    stringBuilder.append(string4);
                    string3 = this.reader.prefix(3);
                    if ("---".equals(string3) || "...".equals(string3) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3))) break;
                }
                return "";
            }
            if (!"\n".equals(string2)) {
                return string2 + stringBuilder;
            }
            if (stringBuilder.length() == 0) {
                return " ";
            }
            return stringBuilder.toString();
        }
        return string;
    }

    private String scanUriEscapes(String string, Mark mark) {
        int n = 1;
        while (this.reader.peek(n * 3) == 37) {
            ++n;
        }
        Mark mark2 = this.reader.getMark();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        while (this.reader.peek() == 37) {
            this.reader.forward();
            try {
                byte by = (byte)Integer.parseInt(this.reader.prefix(2), 16);
                byteBuffer.put(by);
            }
            catch (NumberFormatException numberFormatException) {
                int n2 = this.reader.peek();
                String string2 = String.valueOf(Character.toChars(n2));
                int n3 = this.reader.peek(1);
                String string3 = String.valueOf(Character.toChars(n3));
                throw new ScannerException("while scanning a " + string, mark, "expected URI escape sequence of 2 hexadecimal numbers, but found " + string2 + "(" + n2 + ") and " + string3 + "(" + n3 + ")", this.reader.getMark());
            }
            this.reader.forward(2);
        }
        byteBuffer.flip();
        try {
            return UriEncoder.decode(byteBuffer);
        }
        catch (CharacterCodingException characterCodingException) {
            throw new ScannerException("while scanning a " + string, mark, "expected URI in UTF-8: " + characterCodingException.getMessage(), mark2);
        }
    }

    private boolean needMoreTokens() {
        if (this.done) {
            return false;
        }
        if (this.tokens.isEmpty()) {
            return true;
        }
        this.stalePossibleSimpleKeys();
        return this.nextPossibleSimpleKey() == this.tokensTaken;
    }

    private void fetchStreamStart() {
        Mark mark = this.reader.getMark();
        StreamStartToken streamStartToken = new StreamStartToken(mark, mark);
        this.tokens.add(streamStartToken);
    }

    private void fetchFolded() {
        this.fetchBlockScalar('>');
    }

    private void scanToNextToken() {
        if (this.reader.getIndex() == 0 && this.reader.peek() == 65279) {
            this.reader.forward();
        }
        boolean bl = false;
        while (!bl) {
            int n = 0;
            while (this.reader.peek(n) == 32) {
                ++n;
            }
            if (n > 0) {
                this.reader.forward(n);
            }
            if (this.reader.peek() == 35) {
                n = 0;
                while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(n))) {
                    ++n;
                }
                if (n > 0) {
                    this.reader.forward(n);
                }
            }
            if (this.scanLineBreak().length() != 0) {
                if (this.flowLevel != 0) continue;
                this.allowSimpleKey = true;
                continue;
            }
            bl = true;
        }
    }

    private void fetchMoreTokens() {
        this.scanToNextToken();
        this.stalePossibleSimpleKeys();
        this.unwindIndent(this.reader.getColumn());
        int n = this.reader.peek();
        switch (n) {
            case 0: {
                this.fetchStreamEnd();
                return;
            }
            case 37: {
                if (!this.checkDirective()) break;
                this.fetchDirective();
                return;
            }
            case 45: {
                if (this.checkDocumentStart()) {
                    this.fetchDocumentStart();
                    return;
                }
                if (!this.checkBlockEntry()) break;
                this.fetchBlockEntry();
                return;
            }
            case 46: {
                if (!this.checkDocumentEnd()) break;
                this.fetchDocumentEnd();
                return;
            }
            case 91: {
                this.fetchFlowSequenceStart();
                return;
            }
            case 123: {
                this.fetchFlowMappingStart();
                return;
            }
            case 93: {
                this.fetchFlowSequenceEnd();
                return;
            }
            case 125: {
                this.fetchFlowMappingEnd();
                return;
            }
            case 44: {
                this.fetchFlowEntry();
                return;
            }
            case 63: {
                if (!this.checkKey()) break;
                this.fetchKey();
                return;
            }
            case 58: {
                if (!this.checkValue()) break;
                this.fetchValue();
                return;
            }
            case 42: {
                this.fetchAlias();
                return;
            }
            case 38: {
                this.fetchAnchor();
                return;
            }
            case 33: {
                this.fetchTag();
                return;
            }
            case 124: {
                if (this.flowLevel != 0) break;
                this.fetchLiteral();
                return;
            }
            case 62: {
                if (this.flowLevel != 0) break;
                this.fetchFolded();
                return;
            }
            case 39: {
                this.fetchSingle();
                return;
            }
            case 34: {
                this.fetchDouble();
                return;
            }
        }
        if (this.checkPlain()) {
            this.fetchPlain();
            return;
        }
        String string = String.valueOf(Character.toChars(n));
        for (Character c : ESCAPE_REPLACEMENTS.keySet()) {
            String string2 = ESCAPE_REPLACEMENTS.get(c);
            if (!string2.equals(string)) continue;
            string = "\\" + c;
            break;
        }
        if (n == 9) {
            string = string + "(TAB)";
        }
        String string3 = String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", string, string);
        throw new ScannerException("while scanning for the next token", null, string3, this.reader.getMark());
    }

    private boolean checkBlockEntry() {
        return Constant.NULL_BL_T_LINEBR.has(this.reader.peek(1));
    }

    private void fetchDirective() {
        this.unwindIndent(-1);
        this.removePossibleSimpleKey();
        this.allowSimpleKey = false;
        Token token = this.scanDirective();
        this.tokens.add(token);
    }

    private void fetchDocumentEnd() {
        this.fetchDocumentIndicator(false);
    }

    private void fetchAnchor() {
        this.savePossibleSimpleKey();
        this.allowSimpleKey = false;
        Token token = this.scanAnchor(true);
        this.tokens.add(token);
    }

    private void fetchSingle() {
        this.fetchFlowScalar('\'');
    }

    private boolean checkDirective() {
        return this.reader.getColumn() == 0;
    }

    private void fetchDocumentStart() {
        this.fetchDocumentIndicator(true);
    }

    private void unwindIndent(int n) {
        if (this.flowLevel != 0) {
            return;
        }
        while (this.indent > n) {
            Mark mark = this.reader.getMark();
            this.indent = this.indents.pop();
            this.tokens.add(new BlockEndToken(mark, mark));
        }
    }

    private void fetchDouble() {
        this.fetchFlowScalar('\"');
    }

    private Token scanDirective() {
        Mark mark;
        Mark mark2 = this.reader.getMark();
        this.reader.forward();
        String string = this.scanDirectiveName(mark2);
        List<Object> list = null;
        if ("YAML".equals(string)) {
            list = this.scanYamlDirectiveValue(mark2);
            mark = this.reader.getMark();
        } else if ("TAG".equals(string)) {
            list = this.scanTagDirectiveValue(mark2);
            mark = this.reader.getMark();
        } else {
            mark = this.reader.getMark();
            int n = 0;
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(n))) {
                ++n;
            }
            if (n > 0) {
                this.reader.forward(n);
            }
        }
        this.scanDirectiveIgnoredLine(mark2);
        return new DirectiveToken<Integer>(string, list, mark2, mark);
    }

    private void fetchStreamEnd() {
        this.unwindIndent(-1);
        this.removePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.possibleSimpleKeys.clear();
        Mark mark = this.reader.getMark();
        StreamEndToken streamEndToken = new StreamEndToken(mark, mark);
        this.tokens.add(streamEndToken);
        this.done = true;
    }

    private boolean checkDocumentEnd() {
        return this.reader.getColumn() == 0 && "...".equals(this.reader.prefix(3)) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3));
    }

    private void fetchBlockScalar(char c) {
        this.allowSimpleKey = true;
        this.removePossibleSimpleKey();
        Token token = this.scanBlockScalar(c);
        this.tokens.add(token);
    }

    private Token scanBlockScalar(char c) {
        int n;
        Mark mark;
        String string;
        Object object;
        boolean bl = c == '>';
        StringBuilder stringBuilder = new StringBuilder();
        Mark mark2 = this.reader.getMark();
        this.reader.forward();
        ScannerImpl$Chomping scannerImpl$Chomping = this.scanBlockScalarIndicators(mark2);
        int n2 = scannerImpl$Chomping.getIncrement();
        this.scanBlockScalarIgnoredLine(mark2);
        int n3 = this.indent + 1;
        if (n3 < 1) {
            n3 = 1;
        }
        if (n2 == -1) {
            object = this.scanBlockScalarIndentation();
            string = (String)object[0];
            int n4 = (Integer)object[1];
            mark = (Mark)object[2];
            n = Math.max(n3, n4);
        } else {
            n = n3 + n2 - 1;
            object = this.scanBlockScalarBreaks(n);
            string = (String)object[0];
            mark = (Mark)object[1];
        }
        object = "";
        while (this.reader.getColumn() == n && this.reader.peek() != 0) {
            stringBuilder.append(string);
            boolean bl2 = " \t".indexOf(this.reader.peek()) == -1;
            int n5 = 0;
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(n5))) {
                ++n5;
            }
            stringBuilder.append(this.reader.prefixForward(n5));
            object = this.scanLineBreak();
            Object[] objectArray = this.scanBlockScalarBreaks(n);
            string = (String)objectArray[0];
            mark = (Mark)objectArray[1];
            if (this.reader.getColumn() != n || this.reader.peek() == 0) break;
            if (bl && "\n".equals(object) && bl2 && " \t".indexOf(this.reader.peek()) == -1) {
                if (string.length() != 0) continue;
                stringBuilder.append(" ");
                continue;
            }
            stringBuilder.append((String)object);
        }
        if (scannerImpl$Chomping.chompTailIsNotFalse()) {
            stringBuilder.append((String)object);
        }
        if (scannerImpl$Chomping.chompTailIsTrue()) {
            stringBuilder.append(string);
        }
        return new ScalarToken(stringBuilder.toString(), false, mark2, mark, DumperOptions.ScalarStyle.createStyle((Character)Character.valueOf(c)));
    }

    private void fetchFlowScalar(char c) {
        this.savePossibleSimpleKey();
        this.allowSimpleKey = false;
        Token token = this.scanFlowScalar(c);
        this.tokens.add(token);
    }

    private Token scanFlowScalar(char c) {
        boolean bl = c == '\"';
        StringBuilder stringBuilder = new StringBuilder();
        Mark mark = this.reader.getMark();
        int n = this.reader.peek();
        this.reader.forward();
        stringBuilder.append(this.scanFlowScalarNonSpaces(bl, mark));
        while (this.reader.peek() != n) {
            stringBuilder.append(this.scanFlowScalarSpaces(mark));
            stringBuilder.append(this.scanFlowScalarNonSpaces(bl, mark));
        }
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        return new ScalarToken(stringBuilder.toString(), false, mark, mark2, DumperOptions.ScalarStyle.createStyle((Character)Character.valueOf(c)));
    }

    private String scanLineBreak() {
        block11: {
            int n;
            block10: {
                block9: {
                    block8: {
                        n = this.reader.peek();
                        if (n == 13 || n == 10) break block8;
                        if (n != 133) break block9;
                    }
                    if (n == 13 && 10 == this.reader.peek(1)) {
                        this.reader.forward(2);
                    } else {
                        this.reader.forward();
                    }
                    return "\n";
                }
                if (n == 8232) break block10;
                if (n != 8233) break block11;
            }
            this.reader.forward();
            return String.valueOf(Character.toChars(n));
        }
        return "";
    }

    private void fetchLiteral() {
        this.fetchBlockScalar('|');
    }

    private boolean checkDocumentStart() {
        return this.reader.getColumn() == 0 && "---".equals(this.reader.prefix(3)) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3));
    }

    private void fetchBlockEntry() {
        Mark mark;
        if (this.flowLevel == 0) {
            if (!this.allowSimpleKey) {
                throw new ScannerException(null, null, "sequence entries are not allowed here", this.reader.getMark());
            }
            if (this.addIndent(this.reader.getColumn())) {
                mark = this.reader.getMark();
                this.tokens.add(new BlockSequenceStartToken(mark, mark));
            }
        }
        this.allowSimpleKey = true;
        this.removePossibleSimpleKey();
        mark = this.reader.getMark();
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        BlockEntryToken blockEntryToken = new BlockEntryToken(mark, mark2);
        this.tokens.add(blockEntryToken);
    }

    private void fetchFlowEntry() {
        this.allowSimpleKey = true;
        this.removePossibleSimpleKey();
        Mark mark = this.reader.getMark();
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        FlowEntryToken flowEntryToken = new FlowEntryToken(mark, mark2);
        this.tokens.add(flowEntryToken);
    }

    private boolean checkValue() {
        if (this.flowLevel != 0) {
            return true;
        }
        return Constant.NULL_BL_T_LINEBR.has(this.reader.peek(1));
    }

    @Override
    public boolean checkToken(Token$ID ... token$IDArray) {
        while (this.needMoreTokens()) {
            this.fetchMoreTokens();
        }
        if (!this.tokens.isEmpty()) {
            if (token$IDArray.length == 0) {
                return true;
            }
            Token$ID token$ID = this.tokens.get(0).getTokenId();
            for (int i = 0; i < token$IDArray.length; ++i) {
                if (token$ID != token$IDArray[i]) continue;
                return true;
            }
        }
        return false;
    }

    private Token scanAnchor(boolean bl) {
        Mark mark = this.reader.getMark();
        int n = this.reader.peek();
        String string = n == 42 ? "alias" : "anchor";
        this.reader.forward();
        int n2 = 0;
        int n3 = this.reader.peek(n2);
        while (Constant.NULL_BL_T_LINEBR.hasNo(n3, ":,[]{}")) {
            n3 = this.reader.peek(++n2);
        }
        if (n2 == 0) {
            String string2 = String.valueOf(Character.toChars(n3));
            throw new ScannerException("while scanning an " + string, mark, "unexpected character found " + string2 + "(" + n3 + ")", this.reader.getMark());
        }
        String string3 = this.reader.prefixForward(n2);
        n3 = this.reader.peek();
        if (Constant.NULL_BL_T_LINEBR.hasNo(n3, "?:,]}%@`")) {
            String string4 = String.valueOf(Character.toChars(n3));
            throw new ScannerException("while scanning an " + string, mark, "unexpected character found " + string4 + "(" + n3 + ")", this.reader.getMark());
        }
        Mark mark2 = this.reader.getMark();
        Token token = bl ? new AnchorToken(string3, mark, mark2) : new AliasToken(string3, mark, mark2);
        return token;
    }

    private Token scanTag() {
        Mark mark = this.reader.getMark();
        int n = this.reader.peek(1);
        String string = null;
        String string2 = null;
        if (n == 60) {
            this.reader.forward(2);
            string2 = this.scanTagUri("tag", mark);
            n = this.reader.peek();
            if (n != 62) {
                String string3 = String.valueOf(Character.toChars(n));
                throw new ScannerException("while scanning a tag", mark, "expected '>', but found '" + string3 + "' (" + n + ")", this.reader.getMark());
            }
            this.reader.forward();
        } else if (Constant.NULL_BL_T_LINEBR.has(n)) {
            string2 = "!";
            this.reader.forward();
        } else {
            int n2 = 1;
            boolean bl = false;
            while (Constant.NULL_BL_LINEBR.hasNo(n)) {
                if (n == 33) {
                    bl = true;
                    break;
                }
                n = this.reader.peek(++n2);
            }
            if (bl) {
                string = this.scanTagHandle("tag", mark);
            } else {
                string = "!";
                this.reader.forward();
            }
            string2 = this.scanTagUri("tag", mark);
        }
        n = this.reader.peek();
        if (Constant.NULL_BL_LINEBR.hasNo(n)) {
            String string4 = String.valueOf(Character.toChars(n));
            throw new ScannerException("while scanning a tag", mark, "expected ' ', but found '" + string4 + "' (" + n + ")", this.reader.getMark());
        }
        TagTuple tagTuple = new TagTuple(string, string2);
        Mark mark2 = this.reader.getMark();
        return new TagToken(tagTuple, mark, mark2);
    }

    private boolean addIndent(int n) {
        if (this.indent < n) {
            this.indents.push(this.indent);
            this.indent = n;
            return true;
        }
        return false;
    }

    private boolean checkPlain() {
        int n = this.reader.peek();
        return Constant.NULL_BL_T_LINEBR.hasNo(n, "-?:,[]{}#&*!|>'\"%@`") || Constant.NULL_BL_T_LINEBR.hasNo(this.reader.peek(1)) && (n == 45 || this.flowLevel == 0 && "?:".indexOf(n) != -1);
    }

    private Token scanPlain() {
        Mark mark;
        StringBuilder stringBuilder = new StringBuilder();
        Mark mark2 = mark = this.reader.getMark();
        int n = this.indent + 1;
        String string = "";
        do {
            int n2;
            int n3 = 0;
            if (this.reader.peek() == 35) break;
            while (!(Constant.NULL_BL_T_LINEBR.has(n2 = this.reader.peek(n3)) || n2 == 58 && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(n3 + 1), this.flowLevel != 0 ? ",[]{}" : "") || this.flowLevel != 0 && ",?[]{}".indexOf(n2) != -1)) {
                ++n3;
            }
            if (n3 == 0) break;
            this.allowSimpleKey = false;
            stringBuilder.append(string);
            stringBuilder.append(this.reader.prefixForward(n3));
            mark2 = this.reader.getMark();
        } while ((string = this.scanPlainSpaces()).length() != 0 && this.reader.peek() != 35 && (this.flowLevel != 0 || this.reader.getColumn() >= n));
        return new ScalarToken(stringBuilder.toString(), mark, mark2, true);
    }

    private String scanTagUri(String string, Mark mark) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        int n2 = this.reader.peek(n);
        while (Constant.URI_CHARS.has(n2)) {
            if (n2 == 37) {
                stringBuilder.append(this.reader.prefixForward(n));
                n = 0;
                stringBuilder.append(this.scanUriEscapes(string, mark));
            } else {
                ++n;
            }
            n2 = this.reader.peek(n);
        }
        if (n != 0) {
            stringBuilder.append(this.reader.prefixForward(n));
        }
        if (stringBuilder.length() == 0) {
            String string2 = String.valueOf(Character.toChars(n2));
            throw new ScannerException("while scanning a " + string, mark, "expected URI, but found " + string2 + "(" + n2 + ")", this.reader.getMark());
        }
        return stringBuilder.toString();
    }

    @Override
    public Token peekToken() {
        while (this.needMoreTokens()) {
            this.fetchMoreTokens();
        }
        return this.tokens.get(0);
    }

    private void fetchAlias() {
        this.savePossibleSimpleKey();
        this.allowSimpleKey = false;
        Token token = this.scanAnchor(false);
        this.tokens.add(token);
    }

    private void fetchKey() {
        Mark mark;
        if (this.flowLevel == 0) {
            if (!this.allowSimpleKey) {
                throw new ScannerException(null, null, "mapping keys are not allowed here", this.reader.getMark());
            }
            if (this.addIndent(this.reader.getColumn())) {
                mark = this.reader.getMark();
                this.tokens.add(new BlockMappingStartToken(mark, mark));
            }
        }
        this.allowSimpleKey = this.flowLevel == 0;
        this.removePossibleSimpleKey();
        mark = this.reader.getMark();
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        KeyToken keyToken = new KeyToken(mark, mark2);
        this.tokens.add(keyToken);
    }

    private void fetchValue() {
        Mark mark;
        SimpleKey simpleKey = this.possibleSimpleKeys.remove(this.flowLevel);
        if (simpleKey != null) {
            this.tokens.add(simpleKey.getTokenNumber() - this.tokensTaken, new KeyToken(simpleKey.getMark(), simpleKey.getMark()));
            if (this.flowLevel == 0 && this.addIndent(simpleKey.getColumn())) {
                this.tokens.add(simpleKey.getTokenNumber() - this.tokensTaken, new BlockMappingStartToken(simpleKey.getMark(), simpleKey.getMark()));
            }
            this.allowSimpleKey = false;
        } else {
            if (this.flowLevel == 0 && !this.allowSimpleKey) {
                throw new ScannerException(null, null, "mapping values are not allowed here", this.reader.getMark());
            }
            if (this.flowLevel == 0 && this.addIndent(this.reader.getColumn())) {
                mark = this.reader.getMark();
                this.tokens.add(new BlockMappingStartToken(mark, mark));
            }
            this.allowSimpleKey = this.flowLevel == 0;
            this.removePossibleSimpleKey();
        }
        mark = this.reader.getMark();
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        ValueToken valueToken = new ValueToken(mark, mark2);
        this.tokens.add(valueToken);
    }

    private void fetchTag() {
        this.savePossibleSimpleKey();
        this.allowSimpleKey = false;
        Token token = this.scanTag();
        this.tokens.add(token);
    }

    private void fetchPlain() {
        this.savePossibleSimpleKey();
        this.allowSimpleKey = false;
        Token token = this.scanPlain();
        this.tokens.add(token);
    }
}

