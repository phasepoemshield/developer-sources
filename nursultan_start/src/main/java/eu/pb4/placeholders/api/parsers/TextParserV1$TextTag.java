/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.arguments.StringArgs
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.List;

public record TextParserV1$TextTag(String name, String[] aliases, String type, boolean userSafe, TextParserV1$TagNodeBuilder parser) {
    public static TextParserV1$TextTag of(String string, String string2, boolean bl, TextParserV1$TagNodeBuilder textParserV1$TagNodeBuilder) {
        return TextParserV1$TextTag.of(string, List.of(), string2, bl, textParserV1$TagNodeBuilder);
    }

    public static TextParserV1$TextTag of(String string, String string2, TextParserV1$TagNodeBuilder textParserV1$TagNodeBuilder) {
        return TextParserV1$TextTag.of(string, string2, true, textParserV1$TagNodeBuilder);
    }

    public static TextParserV1$TextTag of(String string, List<String> list, String string2, boolean bl, TextParserV1$TagNodeBuilder textParserV1$TagNodeBuilder) {
        return new TextParserV1$TextTag(string, list.toArray(new String[0]), string2, bl, textParserV1$TagNodeBuilder);
    }

    public static TextParserV1$TextTag from(TextTag textTag) {
        return new TextParserV1$TextTag(textTag.name(), textTag.aliases(), textTag.type(), textTag.userSafe(), textTag.selfContained() ? TextParserV1$TagNodeBuilder.selfClosing((string, nodeParser) -> textTag.nodeCreator().createTextNode(GeneralUtils.CASTER, StringArgs.ordered((String)string, (char)':'), nodeParser)) : TextParserV1$TagNodeBuilder.wrapping((textNodeArray, string, nodeParser) -> textTag.nodeCreator().createTextNode(textNodeArray, StringArgs.ordered((String)string, (char)':'), nodeParser)));
    }
}

