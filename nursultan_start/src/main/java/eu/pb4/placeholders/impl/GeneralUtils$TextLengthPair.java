/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05216
 */
package eu.pb4.placeholders.impl;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05216;

public final class GeneralUtils$TextLengthPair
extends Record {
    final class05216 text;
    final int length;
    public static final GeneralUtils$TextLengthPair EMPTY = new GeneralUtils$TextLengthPair(null, 0);

    public GeneralUtils$TextLengthPair(class05216 class052162, int n) {
        this.text = class052162;
        this.length = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{GeneralUtils$TextLengthPair.class, "text;length", "text", "length"}, this, object);
    }

    public int length() {
        return this.length;
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{GeneralUtils$TextLengthPair.class, "text;length", "text", "length"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{GeneralUtils$TextLengthPair.class, "text;length", "text", "length"}, this);
    }

    public class05216 text() {
        return this.text;
    }
}

