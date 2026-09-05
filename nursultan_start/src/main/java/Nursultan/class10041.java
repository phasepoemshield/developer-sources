/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10067;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class10041
extends Record {
    private final String committedText;
    private final String displayText;
    private final boolean placeholderVisible;
    private final int caretOffset;
    private final int selectionStartOffset;
    private final int selectionEndOffset;
    private final float scrollX;
    public static final class10041 N = new class10041(null, null, false, 0, 0, 0, 0.0f);

    public String L() {
        return this.displayText;
    }

    public int M() {
        return this.selectionEndOffset;
    }

    public class10041(String string, String string2, boolean bl, int n, int n2, int n3, float f) {
        string = string == null ? "" : string;
        string2 = string2 == null ? "" : string2;
        n = class10067.N(string, n);
        n2 = class10067.N(string, n2);
        n3 = class10067.N(string, n3);
        if (n2 > n3) {
            int n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        f = Math.max(0.0f, f);
        this.committedText = string;
        this.displayText = string2;
        this.placeholderVisible = bl;
        this.caretOffset = n;
        this.selectionStartOffset = n2;
        this.selectionEndOffset = n3;
        this.scrollX = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10041.class, "committedText;displayText;placeholderVisible;caretOffset;selectionStartOffset;selectionEndOffset;scrollX", "committedText", "displayText", "placeholderVisible", "caretOffset", "selectionStartOffset", "selectionEndOffset", "scrollX"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10041.class, "committedText;displayText;placeholderVisible;caretOffset;selectionStartOffset;selectionEndOffset;scrollX", "committedText", "displayText", "placeholderVisible", "caretOffset", "selectionStartOffset", "selectionEndOffset", "scrollX"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10041.class, "committedText;displayText;placeholderVisible;caretOffset;selectionStartOffset;selectionEndOffset;scrollX", "committedText", "displayText", "placeholderVisible", "caretOffset", "selectionStartOffset", "selectionEndOffset", "scrollX"}, this);
    }

    public float B() {
        return this.scrollX;
    }

    public int i() {
        return this.caretOffset;
    }

    public boolean u() {
        return this.placeholderVisible;
    }

    public String y() {
        return this.committedText;
    }

    public boolean N() {
        return this.selectionStartOffset != this.selectionEndOffset;
    }

    public int R() {
        return this.selectionStartOffset;
    }
}

