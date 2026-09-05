/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Node
 */
package com.viaversion.viaversion.libs.snakeyaml.serializer;

import com.viaversion.viaversion.libs.snakeyaml.nodes.Node;

public interface AnchorGenerator {
    public String nextAnchor(Node var1);
}

