/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.arguments.StringArgs
 *  eu.pb4.placeholders.api.node.TextNode
 */
package eu.pb4.placeholders.api.parsers.tag;

import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.tag.NodeCreator;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public record TextTag(String name, String[] aliases, String type, boolean userSafe, boolean selfContained, NodeCreator nodeCreator) {
    public static TextTag self(String string, Collection<String> collection, String string2, boolean bl, NodeCreator nodeCreator) {
        return new TextTag(string, collection.toArray(new String[0]), string2, bl, true, nodeCreator);
    }

    public static TextTag self(String string, String string2, Function<StringArgs, TextNode> function) {
        return TextTag.self(string, string2, true, function);
    }

    public static TextTag self(String string, String string2, NodeCreator nodeCreator) {
        return TextTag.self(string, string2, true, nodeCreator);
    }

    public static TextTag self(String string, String string2, boolean bl, NodeCreator nodeCreator) {
        return TextTag.self(string, List.of(), string2, bl, nodeCreator);
    }

    public static TextTag self(String string, Collection<String> collection, String string2, boolean bl, Function<StringArgs, TextNode> function) {
        return new TextTag(string, collection.toArray(new String[0]), string2, bl, true, NodeCreator.self(function));
    }

    public static TextTag self(String string, String string2, boolean bl, Function<StringArgs, TextNode> function) {
        return TextTag.self(string, List.of(), string2, bl, function);
    }

    public static TextTag enclosing(String string, String string2, NodeCreator nodeCreator) {
        return TextTag.enclosing(string, string2, true, nodeCreator);
    }

    public static TextTag enclosing(String string, String string2, boolean bl, NodeCreator nodeCreator) {
        return TextTag.enclosing(string, List.of(), string2, bl, nodeCreator);
    }

    public static TextTag enclosing(String string, Collection<String> collection, String string2, boolean bl, NodeCreator nodeCreator) {
        return new TextTag(string, collection.toArray(new String[0]), string2, bl, false, nodeCreator);
    }
}

