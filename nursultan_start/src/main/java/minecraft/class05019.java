/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import org.jspecify.annotations.Nullable;

final class class05019
extends Record {
    final class00392 name;
    final int score;
    final @Nullable class00392 formattedScore;
    final int scoreWidth;

    public @Nullable class00392 L() {
        return this.formattedScore;
    }

    class05019(class00392 class003922, int n, @Nullable class00392 class003923, int n2) {
        this.name = class003922;
        this.score = n;
        this.formattedScore = class003923;
        this.scoreWidth = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05019.class, "name;score;formattedScore;scoreWidth", "name", "score", "formattedScore", "scoreWidth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05019.class, "name;score;formattedScore;scoreWidth", "name", "score", "formattedScore", "scoreWidth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05019.class, "name;score;formattedScore;scoreWidth", "name", "score", "formattedScore", "scoreWidth"}, this);
    }

    public int u() {
        return this.scoreWidth;
    }

    public int y() {
        return this.score;
    }

    public class00392 N() {
        return this.name;
    }
}

