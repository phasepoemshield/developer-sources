/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.SignatureProperty;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMSignatureProperty
extends DOMStructure
implements SignatureProperty {
    private final String id;
    private final String target;
    private final List<XMLStructure> content;

    public DOMSignatureProperty(List<? extends XMLStructure> list, String string, String string2) {
        if (string == null) {
            throw new NullPointerException("target cannot be null");
        }
        if (list == null) {
            throw new NullPointerException("content cannot be null");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("content cannot be empty");
        }
        this.content = Collections.unmodifiableList(new ArrayList<XMLStructure>(list));
        int n = this.content.size();
        for (int i = 0; i < n; ++i) {
            if (this.content.get(i) instanceof XMLStructure) continue;
            throw new ClassCastException("content[" + i + "] is not a valid type");
        }
        this.target = string;
        this.id = string2;
    }

    public DOMSignatureProperty(Element element) throws MarshalException {
        this.target = DOMUtils.getAttributeValue(element, "Target");
        if (this.target == null) {
            throw new MarshalException("target cannot be null");
        }
        Attr attr = element.getAttributeNodeNS(null, "Id");
        if (attr != null) {
            this.id = attr.getValue();
            element.setIdAttributeNode(attr, true);
        } else {
            this.id = null;
        }
        ArrayList<javax.xml.crypto.dom.DOMStructure> arrayList = new ArrayList<javax.xml.crypto.dom.DOMStructure>();
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            arrayList.add(new javax.xml.crypto.dom.DOMStructure(node));
        }
        if (arrayList.isEmpty()) {
            throw new MarshalException("content cannot be empty");
        }
        this.content = Collections.unmodifiableList(arrayList);
    }

    @Override
    public List<XMLStructure> getContent() {
        return this.content;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getTarget() {
        return this.target;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "SignatureProperty", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttributeID(element, "Id", this.id);
        DOMUtils.setAttribute(element, "Target", this.target);
        for (XMLStructure xMLStructure : this.content) {
            DOMUtils.appendChild(element, ((javax.xml.crypto.dom.DOMStructure)xMLStructure).getNode());
        }
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SignatureProperty)) {
            return false;
        }
        SignatureProperty signatureProperty = (SignatureProperty)object;
        boolean bl = this.id == null ? signatureProperty.getId() == null : this.id.equals(signatureProperty.getId());
        List<XMLStructure> list = signatureProperty.getContent();
        return this.equalsContent(this.content, list) && this.target.equals(signatureProperty.getTarget()) && bl;
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        n = 31 * n + this.target.hashCode();
        n = 31 * n + this.content.hashCode();
        return n;
    }
}

