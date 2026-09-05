/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.util.Optional;
import minecraft.class04186;

public final class class04170
extends Record {
    private final class04186 type;
    private final String pattern;

    static class04170 L(String string) {
        return new class04170(class04186.N, "regex:" + string);
    }

    public class04170(class04186 class041862, String string) {
        this.type = class041862;
        this.pattern = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04170.class, "type;pattern", "type", "pattern"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04170.class, "type;pattern", "type", "pattern"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04170.class, "type;pattern", "type", "pattern"}, this);
    }

    static class04170 u(String string) {
        return new class04170(class04186.y, string);
    }

    public String y() {
        return this.pattern;
    }

    static class04170 y(String string) {
        return new class04170(class04186.N, "glob:" + string);
    }

    public PathMatcher N(FileSystem fileSystem) {
        return this.N().compile(fileSystem, this.pattern);
    }

    public class04186 N() {
        return this.type;
    }

    static Optional<class04170> N(String string) {
        if (string.isBlank() || string.startsWith("#")) {
            return Optional.empty();
        }
        if (!string.startsWith("[")) {
            return Optional.of(new class04170(class04186.y, string));
        }
        int n = string.indexOf(93, 1);
        if (n == -1) {
            throw new IllegalArgumentException("Unterminated type in line '" + string + "'");
        }
        String string2 = string.substring(1, n);
        String string3 = string.substring(n + 1);
        return switch (string2) {
            case "glob", "regex" -> Optional.of(new class04170(class04186.N, string2 + ":" + string3));
            case "prefix" -> Optional.of(new class04170(class04186.y, string3));
            default -> throw new IllegalArgumentException("Unsupported definition type in line '" + string + "'");
        };
    }
}

