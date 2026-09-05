/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.parsers.MarkdownLiteParserV1$SubNodeType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class MarkdownLiteParserV1$SubNode<T>
extends Record {
    final MarkdownLiteParserV1$SubNodeType<T> type;
    final T value;

    MarkdownLiteParserV1$SubNode(MarkdownLiteParserV1$SubNodeType<T> markdownLiteParserV1$SubNodeType, T t) {
        this.type = markdownLiteParserV1$SubNodeType;
        this.value = t;
    }

    public MarkdownLiteParserV1$SubNodeType<T> type() {
        return this.type;
    }

    public T value() {
        return this.value;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MarkdownLiteParserV1$SubNode.class, "type;value", "type", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{MarkdownLiteParserV1$SubNode.class, "type;value", "type", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MarkdownLiteParserV1$SubNode.class, "type;value", "type", "value"}, this);
    }
}

