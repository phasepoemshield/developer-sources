/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;

final class class01048
extends Record {
    final class00392 name;
    final class00392 score;
    final int scoreWidth;

    public int L() {
        return this.scoreWidth;
    }

    class01048(class00392 class003922, class00392 class003923, int n) {
        this.name = class003922;
        this.score = class003923;
        this.scoreWidth = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01048.class, "name;score;scoreWidth", "name", "score", "scoreWidth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01048.class, "name;score;scoreWidth", "name", "score", "scoreWidth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01048.class, "name;score;scoreWidth", "name", "score", "scoreWidth"}, this);
    }

    public class00392 y() {
        return this.score;
    }

    public class00392 N() {
        return this.name;
    }
}

