/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.include;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

public class AbsolutePackPath {
    private final String path;

    private AbsolutePackPath(String string) {
        this.path = string;
    }

    public Optional<AbsolutePackPath> parent() {
        if (this.path.equals("/")) {
            return Optional.empty();
        }
        int n = this.path.lastIndexOf(47);
        return Optional.of(new AbsolutePackPath(this.path.substring(0, n)));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        AbsolutePackPath absolutePackPath = (AbsolutePackPath)object;
        return Objects.equals(this.path, absolutePackPath.path);
    }

    public String toString() {
        return "AbsolutePackPath {" + this.getPathString() + "}";
    }

    public int hashCode() {
        return Objects.hash(this.path);
    }

    public AbsolutePackPath resolve(String string) {
        if (string.startsWith("/")) {
            return AbsolutePackPath.fromAbsolutePath(string);
        }
        String string2 = !this.path.endsWith("/") & !string.startsWith("/") ? this.path + "/" + string : this.path + string;
        return AbsolutePackPath.fromAbsolutePath(string2);
    }

    public Path resolved(Path path) {
        if (this.path.equals("/")) {
            return path;
        }
        return path.resolve(this.path.substring(1));
    }

    public String getPathString() {
        return this.path;
    }

    public static AbsolutePackPath fromAbsolutePath(String string) {
        return new AbsolutePackPath(AbsolutePackPath.normalizeAbsolutePath(string));
    }

    private static String normalizeAbsolutePath(String string) {
        if (!string.startsWith("/")) {
            throw new IllegalArgumentException("Not an absolute path: " + string);
        }
        String[] stringArray = string.split(Pattern.quote("/"));
        ArrayList arrayList = new ArrayList();
        for (String string2 : stringArray) {
            if (string2.isEmpty() || string2.equals(".")) continue;
            if (string2.equals("..")) {
                if (arrayList.isEmpty()) continue;
                arrayList.removeLast();
                continue;
            }
            arrayList.add(string2);
        }
        if (arrayList.isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : arrayList) {
            stringBuilder.append('/');
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }
}

