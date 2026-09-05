/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package eu.pb4.placeholders.api.parsers;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class TagLikeParser$Format$Tag
extends Record {
    final int start;
    private final int end;
    private final String id;
    private final String argument;
    private final Object extra;

    public String argument() {
        return this.argument;
    }

    public Object extra() {
        return this.extra;
    }

    public TagLikeParser$Format$Tag(int n, int n2, String string, String string2) {
        this(n, n2, string, string2, null);
    }

    public TagLikeParser$Format$Tag(int n, int n2, String string, String string2, Object object) {
        this.start = n;
        this.end = n2;
        this.id = string;
        this.argument = string2;
        this.extra = object;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{TagLikeParser$Format$Tag.class, "start;end;id;argument;extra", "start", "end", "id", "argument", "extra"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{TagLikeParser$Format$Tag.class, "start;end;id;argument;extra", "start", "end", "id", "argument", "extra"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{TagLikeParser$Format$Tag.class, "start;end;id;argument;extra", "start", "end", "id", "argument", "extra"}, this);
    }

    public int end() {
        return this.end;
    }

    public String id() {
        return this.id;
    }

    public int start() {
        return this.start;
    }
}

