/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.KeyName;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMKeyName
extends DOMStructure
implements KeyName {
    private final String name;

    public DOMKeyName(String string) {
        if (string == null) {
            throw new NullPointerException("name cannot be null");
        }
        this.name = string;
    }

    public DOMKeyName(Element element) {
        this.name = element.getFirstChild().getNodeValue();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "KeyName", "http://www.w3.org/2000/09/xmldsig#", string);
        element.appendChild(document.createTextNode(this.name));
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof KeyName)) {
            return false;
        }
        KeyName keyName = (KeyName)object;
        return this.name.equals(keyName.getName());
    }

    public int hashCode() {
        int n = 17;
        n = 31 * n + this.name.hashCode();
        return n;
    }
}

