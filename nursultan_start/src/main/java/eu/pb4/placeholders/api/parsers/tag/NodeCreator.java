/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.arguments.SimpleArguments
 *  eu.pb4.placeholders.api.arguments.StringArgs
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.parsers.NodeParser
 */
package eu.pb4.placeholders.api.parsers.tag;

import eu.pb4.placeholders.api.arguments.SimpleArguments;
import eu.pb4.placeholders.api.arguments.StringArgs;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.tag.NodeCreator$BoolNodeArg;
import java.util.function.Function;

public interface NodeCreator {
    public static NodeCreator self(Function<StringArgs, TextNode> function) {
        return (textNodeArray, stringArgs, nodeParser) -> (TextNode)function.apply(stringArgs);
    }

    public static NodeCreator bool(NodeCreator$BoolNodeArg nodeCreator$BoolNodeArg) {
        return (textNodeArray, stringArgs, nodeParser) -> nodeCreator$BoolNodeArg.apply(textNodeArray, SimpleArguments.bool((String)stringArgs.get("value", 0), (boolean)true));
    }

    public TextNode createTextNode(TextNode[] var1, StringArgs var2, NodeParser var3);
}

