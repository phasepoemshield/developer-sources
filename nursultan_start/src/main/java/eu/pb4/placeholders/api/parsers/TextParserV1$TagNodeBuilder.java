/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.parsers.TextParserV1;
import eu.pb4.placeholders.api.parsers.TextParserV1$NodeList;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder$BooleanFormattingTagCreator;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder$FormattingTagCreator;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder$FormattingTagParsedCreator;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder$SelfTagCreator;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder$SelfTagParsedCreator;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeValue;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagParserGetter;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagParserGetterParser;

@FunctionalInterface
public interface TextParserV1$TagNodeBuilder {
    public TextParserV1$TagNodeValue parseString(String var1, String var2, String var3, TextParserV1.TagParserGetter var4, String var5);

    public static TextParserV1$TagNodeBuilder wrappingBoolean(TextParserV1$TagNodeBuilder$BooleanFormattingTagCreator textParserV1$TagNodeBuilder$BooleanFormattingTagCreator) {
        return (string, string2, string3, tagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserV1.parseNodesWith(string3, tagParserGetter, string4);
            return new TextParserV1$TagNodeValue(textParserV1$TagNodeBuilder$BooleanFormattingTagCreator.createTextNode(textParserV1$NodeList.nodes(), string2 == null || string2.isEmpty() || !string2.equals("false")), textParserV1$NodeList.length());
        };
    }

    public static TextParserV1$TagNodeBuilder selfClosing(TextParserV1$TagNodeBuilder$SelfTagParsedCreator textParserV1$TagNodeBuilder$SelfTagParsedCreator) {
        return (string, string2, string3, tagParserGetter, string4) -> new TextParserV1$TagNodeValue(textParserV1$TagNodeBuilder$SelfTagParsedCreator.createTextNode(string2, new TextParserV1$TagParserGetterParser(tagParserGetter)), 0);
    }

    public static TextParserV1$TagNodeBuilder selfClosing(TextParserV1$TagNodeBuilder$SelfTagCreator textParserV1$TagNodeBuilder$SelfTagCreator) {
        return (string, string2, string3, tagParserGetter, string4) -> new TextParserV1$TagNodeValue(textParserV1$TagNodeBuilder$SelfTagCreator.createTextNode(string2), 0);
    }

    public static TextParserV1$TagNodeBuilder wrapping(TextParserV1$TagNodeBuilder$FormattingTagCreator textParserV1$TagNodeBuilder$FormattingTagCreator) {
        return (string, string2, string3, tagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserV1.parseNodesWith(string3, tagParserGetter, string4);
            return new TextParserV1$TagNodeValue(textParserV1$TagNodeBuilder$FormattingTagCreator.createTextNode(textParserV1$NodeList.nodes(), string2), textParserV1$NodeList.length());
        };
    }

    public static TextParserV1$TagNodeBuilder wrapping(TextParserV1$TagNodeBuilder$FormattingTagParsedCreator textParserV1$TagNodeBuilder$FormattingTagParsedCreator) {
        return (string, string2, string3, tagParserGetter, string4) -> {
            TextParserV1$NodeList textParserV1$NodeList = TextParserV1.parseNodesWith(string3, tagParserGetter, string4);
            return new TextParserV1$TagNodeValue(textParserV1$TagNodeBuilder$FormattingTagParsedCreator.createTextNode(textParserV1$NodeList.nodes(), string2, new TextParserV1$TagParserGetterParser(tagParserGetter)), textParserV1$NodeList.length());
        };
    }
}

