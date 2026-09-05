/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.materialmap;

import java.util.Objects;

public class NamespacedId {
    private final String namespace;
    private final String name;

    public NamespacedId(String string) {
        int n = string.indexOf(58);
        if (n == -1) {
            this.namespace = "minecraft";
            this.name = string;
        } else {
            this.namespace = string.substring(0, n);
            this.name = string.substring(n + 1);
        }
    }

    public NamespacedId(String string, String string2) {
        this.namespace = Objects.requireNonNull(string);
        this.name = Objects.requireNonNull(string2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        NamespacedId namespacedId = (NamespacedId)object;
        return this.namespace.equals(namespacedId.namespace) && this.name.equals(namespacedId.name);
    }

    public String toString() {
        return this.namespace + ":" + this.name;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.namespace == null ? 0 : this.namespace.hashCode());
        n2 = 31 * n2 + (this.name == null ? 0 : this.name.hashCode());
        return n2;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return this.namespace;
    }
}

