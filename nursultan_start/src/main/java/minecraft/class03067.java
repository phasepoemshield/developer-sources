/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.brigadier.tree.ArgumentCommandNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class03067<S>
extends Record {
    private final ArgumentCommandNode<S, ?> node;
    private final String value;

    public String L() {
        return this.value;
    }

    public class03067(ArgumentCommandNode<S, ?> argumentCommandNode, String string) {
        this.node = argumentCommandNode;
        this.value = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03067.class, "node;value", "node", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03067.class, "node;value", "node", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03067.class, "node;value", "node", "value"}, this);
    }

    public ArgumentCommandNode<S, ?> y() {
        return this.node;
    }

    public String N() {
        return this.node.getName();
    }
}

