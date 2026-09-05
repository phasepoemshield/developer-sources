/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.LiteralNode
 *  eu.pb4.placeholders.api.node.TextNode
 */
package eu.pb4.placeholders.impl.textparser;

import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.TextParserV1$NodeList;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeValue;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagParserGetter;
import eu.pb4.placeholders.impl.GeneralUtils$Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public class TextParserImpl {
    public static final Pattern STARTING_PATTERN = Pattern.compile("<(?<id>[^<>/]+)(?<data>([:]([']?([^'](\\\\\\\\['])?)+[']?))*)>");
    @Deprecated
    public static final List<GeneralUtils$Pair<String, String>> ESCAPED_CHARS = new ArrayList<GeneralUtils$Pair<String, String>>();
    public static final TextNode[] CASTER;

    public static String escapeCharacters(String string) {
        for (GeneralUtils$Pair<String, String> generalUtils$Pair : ESCAPED_CHARS) {
            string = string.replace("\\" + generalUtils$Pair.left(), generalUtils$Pair.right());
        }
        return string;
    }

    static {
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("\\", "&slsh;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("<", "&lt;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>(">", "&gt;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("\"", "&quot;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("'", "&pos;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>(":", "&colon;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("&", "&amps;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("{", "&openbrac;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("}", "&closebrac;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("$", "&dolar;\u0002"));
        ESCAPED_CHARS.add(new GeneralUtils$Pair<String, String>("%", "&perc;\u0002"));
        CASTER = new TextNode[0];
    }

    public static TextNode[] parse(String string, TextParserV1$TagParserGetter textParserV1$TagParserGetter) {
        return TextParserImpl.recursiveParsing(TextParserImpl.escapeCharacters(string), textParserV1$TagParserGetter, null).nodes();
    }

    public static TextParserV1$NodeList recursiveParsing(String string, TextParserV1$TagParserGetter textParserV1$TagParserGetter, String string2) {
        String[] stringArray;
        int n;
        if (string.isEmpty()) {
            return new TextParserV1$NodeList(new TextNode[0], 0);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Matcher matcher = STARTING_PATTERN.matcher(string);
        Matcher matcher2 = string2 != null ? Pattern.compile("(" + string2 + ")|(</>)").matcher(string) : null;
        int n2 = 0;
        boolean bl = false;
        boolean bl2 = string2 != null && matcher2.find();
        int n3 = n = bl2 ? matcher2.start() : string.length();
        while (matcher.find() && n > matcher.start()) {
            Object object;
            stringArray = (matcher.group("id") + matcher.group("data")).split(":", 2);
            String string3 = stringArray[0].toLowerCase(Locale.ROOT);
            String string4 = "";
            if (stringArray.length == 2) {
                string4 = stringArray[1];
            }
            if (string3.equals("reset") || string3.equals("r")) {
                if (string2 != null) {
                    n = matcher.start();
                    if (n2 < n && !((String)(object = TextParserImpl.restoreOriginalEscaping(string.substring(n2, n)))).isEmpty()) {
                        arrayList.add(new LiteralNode((String)object));
                    }
                    return new TextParserV1$NodeList(arrayList.toArray(new TextNode[0]), n);
                }
                object = string.substring(n2, matcher.start());
                if (!((String)object).isEmpty()) {
                    arrayList.add(new LiteralNode(TextParserImpl.restoreOriginalEscaping((String)object)));
                }
                n2 = matcher.end();
                continue;
            }
            if (string3.startsWith("#")) {
                string4 = string3;
                string3 = "color";
            }
            object = "</" + string3 + ">";
            TextParserV1$TagNodeBuilder textParserV1$TagNodeBuilder = textParserV1$TagParserGetter.getTagParser(string3);
            if (textParserV1$TagNodeBuilder == null) continue;
            String string5 = string.substring(n2, matcher.start());
            if (!string5.isEmpty()) {
                arrayList.add(new LiteralNode(TextParserImpl.restoreOriginalEscaping(string5)));
            }
            n2 = matcher.end();
            try {
                TextParserV1$TagNodeValue textParserV1$TagNodeValue = textParserV1$TagNodeBuilder.parseString(string3, string4, string.substring(n2), textParserV1$TagParserGetter, (String)object);
                if (textParserV1$TagNodeValue.node() != null) {
                    arrayList.add(textParserV1$TagNodeValue.node());
                }
                if ((n2 += textParserV1$TagNodeValue.length()) >= string.length()) {
                    n = string.length();
                    break;
                }
                matcher.region(n2, string.length());
                if (matcher2 == null) continue;
                matcher2.region(n2, string.length());
                if (matcher2.find()) {
                    bl2 = true;
                    n = matcher2.start();
                    continue;
                }
                bl2 = false;
                n = string.length();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (n2 < n && !(stringArray = TextParserImpl.restoreOriginalEscaping(string.substring(n2, n))).isEmpty()) {
            arrayList.add(new LiteralNode((String)stringArray));
        }
        n = bl2 ? (n += matcher2.group().length()) : string.length();
        return new TextParserV1$NodeList(arrayList.toArray(new TextNode[0]), n);
    }

    public static String restoreOriginalEscaping(String string) {
        for (GeneralUtils$Pair<String, String> generalUtils$Pair : ESCAPED_CHARS) {
            try {
                string = string.replace(generalUtils$Pair.right(), "\\" + generalUtils$Pair.left());
            }
            catch (Exception exception) {}
        }
        return string;
    }

    public static String cleanArgument(String string) {
        if (string.length() >= 2 && string.startsWith("'") && string.endsWith("'")) {
            return string.substring(1, string.length() - 1);
        }
        return string;
    }

    public static String removeEscaping(String string) {
        for (GeneralUtils$Pair<String, String> generalUtils$Pair : ESCAPED_CHARS) {
            try {
                string = string.replace(generalUtils$Pair.right(), generalUtils$Pair.left());
            }
            catch (Exception exception) {}
        }
        return string;
    }
}

