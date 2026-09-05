/*
 * Decompiled with CFR 0.152.
 */
package org.w3c.dom;

import org.w3c.dom.Element;

public interface ElementTraversal {
    public Element getFirstElementChild();

    public Element getNextElementSibling();

    public Element getLastElementChild();

    public int getChildElementCount();

    public Element getPreviousElementSibling();
}

