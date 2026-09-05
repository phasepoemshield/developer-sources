/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.SignatureProperties;
import javax.xml.crypto.dsig.SignatureProperty;
import org.jcp.xml.dsig.internal.dom.DOMSignatureProperty;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMSignatureProperties
extends DOMStructure
implements SignatureProperties {
    private final String id;
    private final List<SignatureProperty> properties;

    public DOMSignatureProperties(List<? extends SignatureProperty> list, String string) {
        if (list == null) {
            throw new NullPointerException("properties cannot be null");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("properties cannot be empty");
        }
        this.properties = Collections.unmodifiableList(new ArrayList<SignatureProperty>(list));
        int n = this.properties.size();
        for (int i = 0; i < n; ++i) {
            if (this.properties.get(i) instanceof SignatureProperty) continue;
            throw new ClassCastException("properties[" + i + "] is not a valid type");
        }
        this.id = string;
    }

    public DOMSignatureProperties(Element element) throws MarshalException {
        Attr attr = element.getAttributeNodeNS(null, "Id");
        if (attr != null) {
            this.id = attr.getValue();
            element.setIdAttributeNode(attr, true);
        } else {
            this.id = null;
        }
        ArrayList<DOMSignatureProperty> arrayList = new ArrayList<DOMSignatureProperty>();
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node.getNodeType() != 1) continue;
            String string = node.getLocalName();
            String string2 = node.getNamespaceURI();
            if (!"SignatureProperty".equals(string) || !"http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                throw new MarshalException("Invalid element name: " + string2 + ":" + string + ", expected SignatureProperty");
            }
            arrayList.add(new DOMSignatureProperty((Element)node));
        }
        if (arrayList.isEmpty()) {
            throw new MarshalException("properties cannot be empty");
        }
        this.properties = Collections.unmodifiableList(arrayList);
    }

    @Override
    public List<SignatureProperty> getProperties() {
        return this.properties;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "SignatureProperties", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttributeID(element, "Id", this.id);
        for (SignatureProperty signatureProperty : this.properties) {
            ((DOMSignatureProperty)signatureProperty).marshal(element, string, dOMCryptoContext);
        }
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SignatureProperties)) {
            return false;
        }
        SignatureProperties signatureProperties = (SignatureProperties)object;
        boolean bl = this.id == null ? signatureProperties.getId() == null : this.id.equals(signatureProperties.getId());
        return this.properties.equals(signatureProperties.getProperties()) && bl;
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        n = 31 * n + this.properties.hashCode();
        return n;
    }
}

