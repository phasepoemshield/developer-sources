/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.Strings
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.AggregateTranslator
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.CharSequenceTranslator
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.EntityArrays
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.JavaUnicodeEscaper
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.LookupTranslator
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.NumericEntityEscaper
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.NumericEntityUnescaper
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.OctalUnescaper
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.UnicodeUnescaper
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3;

import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.StringUtils;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.Strings;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.AggregateTranslator;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.EntityArrays;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.JavaUnicodeEscaper;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.LookupTranslator;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.OctalUnescaper;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover;
import java.io.IOException;
import java.io.Writer;

@Deprecated
public class StringEscapeUtils {
    public static final CharSequenceTranslator ESCAPE_JAVA = new LookupTranslator((CharSequence[][])new String[][]{{"\"", "\\\""}, {"\\", "\\\\"}}).with(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.JAVA_CTRL_CHARS_ESCAPE())}).with(new CharSequenceTranslator[]{JavaUnicodeEscaper.outsideOf((int)32, (int)127)});
    public static final CharSequenceTranslator ESCAPE_ECMASCRIPT = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])new String[][]{{"'", "\\'"}, {"\"", "\\\""}, {"\\", "\\\\"}, {"/", "\\/"}}), new LookupTranslator((CharSequence[][])EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), JavaUnicodeEscaper.outsideOf((int)32, (int)127)});
    public static final CharSequenceTranslator ESCAPE_JSON = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])new String[][]{{"\"", "\\\""}, {"\\", "\\\\"}, {"/", "\\/"}}), new LookupTranslator((CharSequence[][])EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), JavaUnicodeEscaper.outsideOf((int)32, (int)127)});
    @Deprecated
    public static final CharSequenceTranslator ESCAPE_XML = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_ESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.APOS_ESCAPE())});
    public static final CharSequenceTranslator ESCAPE_XML10 = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_ESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.APOS_ESCAPE()), new LookupTranslator((CharSequence[][])new String[][]{{"\u0000", ""}, {"\u0001", ""}, {"\u0002", ""}, {"\u0003", ""}, {"\u0004", ""}, {"\u0005", ""}, {"\u0006", ""}, {"\u0007", ""}, {"\b", ""}, {"\u000b", ""}, {"\f", ""}, {"\u000e", ""}, {"\u000f", ""}, {"\u0010", ""}, {"\u0011", ""}, {"\u0012", ""}, {"\u0013", ""}, {"\u0014", ""}, {"\u0015", ""}, {"\u0016", ""}, {"\u0017", ""}, {"\u0018", ""}, {"\u0019", ""}, {"\u001a", ""}, {"\u001b", ""}, {"\u001c", ""}, {"\u001d", ""}, {"\u001e", ""}, {"\u001f", ""}, {"\ufffe", ""}, {"\uffff", ""}}), NumericEntityEscaper.between((int)127, (int)132), NumericEntityEscaper.between((int)134, (int)159), new UnicodeUnpairedSurrogateRemover()});
    public static final CharSequenceTranslator ESCAPE_XML11 = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_ESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.APOS_ESCAPE()), new LookupTranslator((CharSequence[][])new String[][]{{"\u0000", ""}, {"\u000b", "&#11;"}, {"\f", "&#12;"}, {"\ufffe", ""}, {"\uffff", ""}}), NumericEntityEscaper.between((int)1, (int)8), NumericEntityEscaper.between((int)14, (int)31), NumericEntityEscaper.between((int)127, (int)132), NumericEntityEscaper.between((int)134, (int)159), new UnicodeUnpairedSurrogateRemover()});
    public static final CharSequenceTranslator ESCAPE_HTML3 = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_ESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.ISO8859_1_ESCAPE())});
    public static final CharSequenceTranslator ESCAPE_HTML4 = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_ESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.ISO8859_1_ESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.HTML40_EXTENDED_ESCAPE())});
    public static final CharSequenceTranslator ESCAPE_CSV = new CsvEscaper();
    public static final CharSequenceTranslator UNESCAPE_JAVA;
    public static final CharSequenceTranslator UNESCAPE_ECMASCRIPT;
    public static final CharSequenceTranslator UNESCAPE_JSON;
    public static final CharSequenceTranslator UNESCAPE_HTML3;
    public static final CharSequenceTranslator UNESCAPE_HTML4;
    public static final CharSequenceTranslator UNESCAPE_XML;
    public static final CharSequenceTranslator UNESCAPE_CSV;

    public static final String escapeCsv(String input) {
        return ESCAPE_CSV.translate((CharSequence)input);
    }

    public static final String escapeEcmaScript(String input) {
        return ESCAPE_ECMASCRIPT.translate((CharSequence)input);
    }

    public static final String escapeHtml3(String input) {
        return ESCAPE_HTML3.translate((CharSequence)input);
    }

    public static final String escapeHtml4(String input) {
        return ESCAPE_HTML4.translate((CharSequence)input);
    }

    public static final String escapeJava(String input) {
        return ESCAPE_JAVA.translate((CharSequence)input);
    }

    public static final String escapeJson(String input) {
        return ESCAPE_JSON.translate((CharSequence)input);
    }

    @Deprecated
    public static final String escapeXml(String input) {
        return ESCAPE_XML.translate((CharSequence)input);
    }

    public static String escapeXml10(String input) {
        return ESCAPE_XML10.translate((CharSequence)input);
    }

    public static String escapeXml11(String input) {
        return ESCAPE_XML11.translate((CharSequence)input);
    }

    public static final String unescapeCsv(String input) {
        return UNESCAPE_CSV.translate((CharSequence)input);
    }

    public static final String unescapeEcmaScript(String input) {
        return UNESCAPE_ECMASCRIPT.translate((CharSequence)input);
    }

    public static final String unescapeHtml3(String input) {
        return UNESCAPE_HTML3.translate((CharSequence)input);
    }

    public static final String unescapeHtml4(String input) {
        return UNESCAPE_HTML4.translate((CharSequence)input);
    }

    public static final String unescapeJava(String input) {
        return UNESCAPE_JAVA.translate((CharSequence)input);
    }

    public static final String unescapeJson(String input) {
        return UNESCAPE_JSON.translate((CharSequence)input);
    }

    public static final String unescapeXml(String input) {
        return UNESCAPE_XML.translate((CharSequence)input);
    }

    @Deprecated
    public StringEscapeUtils() {
    }

    static {
        UNESCAPE_ECMASCRIPT = UNESCAPE_JAVA = new AggregateTranslator(new CharSequenceTranslator[]{new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator((CharSequence[][])EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()), new LookupTranslator((CharSequence[][])new String[][]{{"\\\\", "\\"}, {"\\\"", "\""}, {"\\'", "'"}, {"\\", ""}})});
        UNESCAPE_JSON = UNESCAPE_JAVA;
        UNESCAPE_HTML3 = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_UNESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.ISO8859_1_UNESCAPE()), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0])});
        UNESCAPE_HTML4 = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_UNESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.ISO8859_1_UNESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.HTML40_EXTENDED_UNESCAPE()), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0])});
        UNESCAPE_XML = new AggregateTranslator(new CharSequenceTranslator[]{new LookupTranslator((CharSequence[][])EntityArrays.BASIC_UNESCAPE()), new LookupTranslator((CharSequence[][])EntityArrays.APOS_UNESCAPE()), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0])});
        UNESCAPE_CSV = new CsvUnescaper();
    }

    private static final class CsvEscaper
    extends CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';
        private static final char CSV_QUOTE = '\"';
        private static final String CSV_QUOTE_STR = String.valueOf('\"');
        private static final char[] CSV_SEARCH_CHARS = new char[]{',', '\"', '\r', '\n'};

        private CsvEscaper() {
        }

        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index != 0) {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            if (StringUtils.containsNone((CharSequence)input.toString(), CSV_SEARCH_CHARS)) {
                out.write(input.toString());
            } else {
                out.write(34);
                out.write(Strings.CS.replace(input.toString(), CSV_QUOTE_STR, CSV_QUOTE_STR + CSV_QUOTE_STR));
                out.write(34);
            }
            return Character.codePointCount(input, 0, input.length());
        }
    }

    private static final class CsvUnescaper
    extends CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';
        private static final char CSV_QUOTE = '\"';
        private static final String CSV_QUOTE_STR = String.valueOf('\"');
        private static final char[] CSV_SEARCH_CHARS = new char[]{',', '\"', '\r', '\n'};

        private CsvUnescaper() {
        }

        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index != 0) {
                throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
            }
            if (input.charAt(0) != '\"' || input.charAt(input.length() - 1) != '\"') {
                out.write(input.toString());
                return Character.codePointCount(input, 0, input.length());
            }
            String quoteless = input.subSequence(1, input.length() - 1).toString();
            if (StringUtils.containsAny((CharSequence)quoteless, CSV_SEARCH_CHARS)) {
                out.write(Strings.CS.replace(quoteless, CSV_QUOTE_STR + CSV_QUOTE_STR, CSV_QUOTE_STR));
            } else {
                out.write(input.toString());
            }
            return Character.codePointCount(input, 0, input.length());
        }
    }
}

