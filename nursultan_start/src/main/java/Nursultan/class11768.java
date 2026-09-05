/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09079;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11768
extends Record {
    public float fontSize;
    public float uiScale;
    public String family;
    public boolean italic;
    public String text;
    public class09079 weight;

    public class09079 L() {
        return this.weight;
    }

    class11768(String string, String string2, class09079 class090792, boolean bl, float f, float f2) {
        this.text = string;
        this.family = string2;
        this.weight = class090792;
        this.italic = bl;
        this.fontSize = f;
        this.uiScale = f2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11768.class, "text;family;weight;italic;fontSize;uiScale", "text", "family", "weight", "italic", "fontSize", "uiScale"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11768.class, "text;family;weight;italic;fontSize;uiScale", "text", "family", "weight", "italic", "fontSize", "uiScale"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11768.class, "text;family;weight;italic;fontSize;uiScale", "text", "family", "weight", "italic", "fontSize", "uiScale"}, this);
    }

    public float i() {
        return this.uiScale;
    }

    public boolean u() {
        return this.italic;
    }

    public String y() {
        return this.text;
    }

    public float N() {
        return this.fontSize;
    }

    public String R() {
        return this.family;
    }
}

