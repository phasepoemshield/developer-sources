/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.util;

import org.checkerframework.checker.nullness.qual.Nullable;

public final class Key {
    private static final String MINECRAFT_NAMESPACE = "minecraft";
    private static final int MINECRAFT_NAMESPACE_LENGTH = "minecraft".length();
    private final String original;
    private final String namespace;
    private final String path;

    public static boolean isValid(String identifier) {
        int separatorIndex = identifier.indexOf(58);
        if (separatorIndex == -1) {
            return Key.isValidPath(identifier);
        }
        if (separatorIndex == 0) {
            return Key.isValidPath(identifier.substring(1));
        }
        String namespace = identifier.substring(0, separatorIndex);
        String path = identifier.substring(separatorIndex + 1);
        return Key.isValidNamespace(namespace) && Key.isValidPath(path);
    }

    public static String namespace(String identifier) {
        int index = identifier.indexOf(58);
        if (index == -1) {
            return MINECRAFT_NAMESPACE;
        }
        if (index == 0) {
            return MINECRAFT_NAMESPACE;
        }
        return identifier.substring(0, index);
    }

    public String namespace() {
        return this.namespace;
    }

    public static Key ofPath(String path) {
        return new Key(path, MINECRAFT_NAMESPACE, path);
    }

    public String minimized() {
        return this.hasMinecraftNamespace() ? this.path : this.toString();
    }

    public Key withPath(String path) {
        return Key.of(this.namespace, path);
    }

    private Key(String original, String namespace, String path) {
        if (!Key.isValidNamespace(namespace)) {
            throw new IllegalArgumentException("Invalid namespace: " + namespace);
        }
        if (!Key.isValidPath(path)) {
            throw new IllegalArgumentException("Invalid path: " + path);
        }
        this.original = original;
        this.namespace = namespace;
        this.path = path;
    }

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Key)) {
            return false;
        }
        Key key = (Key)o;
        return this.namespace.equals(key.namespace) && this.path.equals(key.path);
    }

    public final boolean equals(String identifier) {
        return this.equals(Key.of(identifier));
    }

    public static boolean equals(String firstIdentifier, String secondIdentifier) {
        return firstIdentifier != null && secondIdentifier != null && Key.of(firstIdentifier).equals(Key.of(secondIdentifier));
    }

    public String toString() {
        return this.namespace + ":" + this.path;
    }

    public int hashCode() {
        int result = this.namespace.hashCode();
        result = 31 * result + this.path.hashCode();
        return result;
    }

    public static Key of(String namespace, String path) {
        return new Key(namespace + ":" + path, namespace, path);
    }

    public static Key of(String identifier) {
        int separatorIndex = identifier.indexOf(58);
        if (separatorIndex == -1) {
            return Key.ofPath(identifier);
        }
        String namespace = separatorIndex == 0 ? MINECRAFT_NAMESPACE : identifier.substring(0, separatorIndex);
        String path = identifier.substring(separatorIndex + 1);
        return new Key(identifier, namespace, path);
    }

    public String original() {
        return this.original;
    }

    public String path() {
        return this.path;
    }

    public boolean hasMinecraftNamespace() {
        return this.namespace.equals(MINECRAFT_NAMESPACE);
    }

    public static String stripMinecraftNamespace(String identifier) {
        if (identifier.startsWith("minecraft:")) {
            return identifier.substring(MINECRAFT_NAMESPACE_LENGTH + 1);
        }
        if (!identifier.isEmpty() && identifier.charAt(0) == ':') {
            return identifier.substring(1);
        }
        return identifier;
    }

    public static @Nullable Key tryParse(String identifier) {
        try {
            return Key.of(identifier);
        }
        catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static String namespaced(String identifier) {
        int index = identifier.indexOf(58);
        if (index == -1) {
            return "minecraft:" + identifier;
        }
        if (index == 0) {
            return MINECRAFT_NAMESPACE + identifier;
        }
        return identifier;
    }

    private static boolean isValidNamespace(String namespace) {
        if (namespace == MINECRAFT_NAMESPACE) {
            return true;
        }
        int length = namespace.length();
        for (int i = 0; i < length; ++i) {
            char c = namespace.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '_' || c == '-' || c == '.') continue;
            return false;
        }
        return true;
    }

    private static boolean isValidPath(String path) {
        int length = path.length();
        for (int i = 0; i < length; ++i) {
            char c = path.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '_' || c == '-' || c == '.' || c == '/') continue;
            return false;
        }
        return true;
    }

    public static String stripNamespace(String identifier) {
        int index = identifier.indexOf(58);
        if (index == -1) {
            return identifier;
        }
        return identifier.substring(index + 1);
    }

    public Key withNamespace(String namespace) {
        return Key.of(namespace, this.path);
    }
}

