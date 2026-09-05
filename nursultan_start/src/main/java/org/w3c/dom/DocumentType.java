/*
 * Decompiled with CFR 0.152.
 */
package org.w3c.dom;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public interface DocumentType
extends Node {
    public String getInternalSubset();

    public String getName();

    public NamedNodeMap getEntities();

    public String getPublicId();

    public String getSystemId();

    public NamedNodeMap getNotations();
}

