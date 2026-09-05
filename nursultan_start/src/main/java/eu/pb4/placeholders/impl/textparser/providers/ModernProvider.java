/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  eu.pb4.placeholders.api.arguments.StringArgs
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.node.parent.ColorNode
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Context
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Provider
 *  minecraft.class05194
 */
package eu.pb4.placeholders.impl.textparser.providers;

import com.mojang.serialization.DataResult;
import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ColorNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import eu.pb4.placeholders.api.parsers.tag.TagRegistry;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import minecraft.class05194;

public record ModernProvider(TagRegistry registry) implements TagLikeParser.Provider
{
    public boolean isValidTag(String string, TagLikeParser.Context context) {
        return string.equals("/*") || string.startsWith("#") || this.registry.getTag(string) != null || string.equals("/") || string.length() > 1 && string.charAt(0) == '/' && context.contains(string.substring(1)) || string.length() > 1 && string.charAt(0) == ';' && context.contains(string.substring(1));
    }

    public void handleTag(String string, String string2, TagLikeParser.Context context) {
        if (string.equals("/") || string.equals("/" + context.peekId()) || string.equals(";" + context.peekId())) {
            context.pop();
            return;
        }
        if (string.equals("/*")) {
            context.pop(context.size());
            return;
        }
        if (string.length() > 1 && string.charAt(0) == '/') {
            String string3 = string.substring(1);
            context.pop(string3);
            return;
        }
        if (string.length() > 1 && string.charAt(0) == ';') {
            String string4 = string.substring(1);
            context.popOnly(string4);
            return;
        }
        if (string.startsWith("#")) {
            DataResult dataResult = class05194.N((String)string);
            if (dataResult.result().isPresent()) {
                context.push(string, textNodeArray -> new ColorNode(textNodeArray, (class05194)dataResult.result().get()));
            }
            return;
        }
        TextTag textTag = this.registry.getTag(string);
        assert (textTag != null);
        StringArgs stringArgs = StringArgs.full((String)string2, (char)' ', (char)':');
        if (textTag.selfContained()) {
            context.addNode(textTag.nodeCreator().createTextNode(TextNode.array((TextNode[])new TextNode[0]), stringArgs, context.parser()));
        } else {
            context.push(string, textNodeArray -> textTag.nodeCreator().createTextNode((TextNode[])textNodeArray, stringArgs, context.parser()));
        }
    }
}

