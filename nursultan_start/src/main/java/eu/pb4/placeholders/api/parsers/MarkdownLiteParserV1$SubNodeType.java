/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class MarkdownLiteParserV1$SubNodeType<T>
extends Record {
    final T selfValue;
    public static final MarkdownLiteParserV1$SubNodeType<TextNode> TEXT_NODE = new MarkdownLiteParserV1$SubNodeType<Object>(null);
    public static final MarkdownLiteParserV1$SubNodeType<String> STRING = new MarkdownLiteParserV1$SubNodeType<Object>(null);
    public static final MarkdownLiteParserV1$SubNodeType<String> STAR = new MarkdownLiteParserV1$SubNodeType<String>("*");
    public static final MarkdownLiteParserV1$SubNodeType<String> DOUBLE_STAR = new MarkdownLiteParserV1$SubNodeType<String>("**");
    public static final MarkdownLiteParserV1$SubNodeType<String> FLOOR = new MarkdownLiteParserV1$SubNodeType<String>("_");
    public static final MarkdownLiteParserV1$SubNodeType<String> DOUBLE_FLOOR = new MarkdownLiteParserV1$SubNodeType<String>("__");
    public static final MarkdownLiteParserV1$SubNodeType<String> DOUBLE_WAVY_LINE = new MarkdownLiteParserV1$SubNodeType<String>("~~");
    public static final MarkdownLiteParserV1$SubNodeType<String> BACK_TICK = new MarkdownLiteParserV1$SubNodeType<String>("`");
    public static final MarkdownLiteParserV1$SubNodeType<String> SPOILER_LINE = new MarkdownLiteParserV1$SubNodeType<String>("||");
    public static final MarkdownLiteParserV1$SubNodeType<String> BRACKET_OPEN = new MarkdownLiteParserV1$SubNodeType<String>("(");
    public static final MarkdownLiteParserV1$SubNodeType<String> BRACKET_CLOSE = new MarkdownLiteParserV1$SubNodeType<String>(")");
    public static final MarkdownLiteParserV1$SubNodeType<String> SQR_BRACKET_OPEN = new MarkdownLiteParserV1$SubNodeType<String>("[");
    public static final MarkdownLiteParserV1$SubNodeType<String> SQR_BRACKET_CLOSE = new MarkdownLiteParserV1$SubNodeType<String>("]");

    private MarkdownLiteParserV1$SubNodeType(T t) {
        this.selfValue = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MarkdownLiteParserV1$SubNodeType.class, "selfValue", "selfValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{MarkdownLiteParserV1$SubNodeType.class, "selfValue", "selfValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MarkdownLiteParserV1$SubNodeType.class, "selfValue", "selfValue"}, this);
    }

    public T selfValue() {
        return this.selfValue;
    }
}

