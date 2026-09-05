/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

final class TagLikeParser$Scope
extends Record {
    final String id;
    final List<TextNode> nodes;
    final BiFunction<TextNode[], NodeParser, TextNode> merger;

    public List<TextNode> nodes() {
        return this.nodes;
    }

    TagLikeParser$Scope(String string, List<TextNode> list, BiFunction<TextNode[], NodeParser, TextNode> biFunction) {
        this.id = string;
        this.nodes = list;
        this.merger = biFunction;
    }

    public static TagLikeParser$Scope parent() {
        return TagLikeParser$Scope.enclosing(ParentNode::new);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{TagLikeParser$Scope.class, "id;nodes;merger", "id", "nodes", "merger"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{TagLikeParser$Scope.class, "id;nodes;merger", "id", "nodes", "merger"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{TagLikeParser$Scope.class, "id;nodes;merger", "id", "nodes", "merger"}, this);
    }

    public String id() {
        return this.id;
    }

    public BiFunction<TextNode[], NodeParser, TextNode> merger() {
        return this.merger;
    }

    public static TagLikeParser$Scope enclosingParsed(String string, BiFunction<TextNode[], NodeParser, TextNode> biFunction) {
        return new TagLikeParser$Scope(string, new ArrayList<TextNode>(), biFunction);
    }

    public static TagLikeParser$Scope enclosingParsed(BiFunction<TextNode[], NodeParser, TextNode> biFunction) {
        return new TagLikeParser$Scope(null, new ArrayList<TextNode>(), biFunction);
    }

    public static TagLikeParser$Scope enclosing(Function<TextNode[], TextNode> function) {
        return TagLikeParser$Scope.enclosingParsed((textNodeArray, nodeParser) -> (TextNode)function.apply((TextNode[])textNodeArray));
    }

    public static TagLikeParser$Scope enclosing(String string, Function<TextNode[], TextNode> function) {
        return TagLikeParser$Scope.enclosingParsed(string, (textNodeArray, nodeParser) -> (TextNode)function.apply((TextNode[])textNodeArray));
    }

    public TextNode collapse(NodeParser nodeParser) {
        return this.merger.apply(this.nodes().toArray(TagLikeParser.EMPTY), nodeParser);
    }
}

