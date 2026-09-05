/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.values;

public interface ValueKey
extends Iterable {
    public ValueKey child(ValueKey var1);

    public ValueKey child(String var1);

    public int length();

    public boolean startsWith(ValueKey var1);

    public boolean isSibling(ValueKey var1);

    public String getLastComponent();

    public String getKeyComponent(int var1);
}

