/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.parent.ColorNode
 *  eu.pb4.placeholders.api.node.parent.FormattingNode
 *  minecraft.class05194
 *  minecraft.class06541
 */
package eu.pb4.placeholders.api.parsers.tag;

import eu.pb4.placeholders.api.node.parent.ColorNode;
import eu.pb4.placeholders.api.node.parent.FormattingNode;
import eu.pb4.placeholders.api.parsers.tag.TextTag;
import java.util.Collection;
import minecraft.class05194;
import minecraft.class06541;

public final class SimpleTags {
    public static TextTag color(String string, Collection<String> collection, int n) {
        return TextTag.enclosing(string, collection, "color", true, (textNodeArray, stringArgs, nodeParser) -> new ColorNode(textNodeArray, class05194.N((int)n)));
    }

    public static TextTag color(String string, Collection<String> collection, class06541 class065412) {
        return TextTag.enclosing(string, collection, "color", true, (textNodeArray, stringArgs, nodeParser) -> new FormattingNode(textNodeArray, class065412));
    }
}

