/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.snakeyaml.constructor;

import com.viaversion.viaversion.libs.snakeyaml.nodes.Node;

public interface Construct {
    public void construct2ndStep(Node var1, Object var2);

    public Object construct(Node var1);
}

