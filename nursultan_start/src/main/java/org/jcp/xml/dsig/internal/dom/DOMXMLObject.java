/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.XMLObject;
import org.jcp.xml.dsig.internal.dom.DOMManifest;
import org.jcp.xml.dsig.internal.dom.DOMSignatureProperties;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.DOMX509Data;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMXMLObject
extends DOMStructure
implements XMLObject {
    private final String id;
    private final String mimeType;
    private final String encoding;
    private final List<XMLStructure> content;
    private Element objectElem;

    public DOMXMLObject(List<? extends XMLStructure> list, String string, String string2, String string3) {
        if (list == null || list.isEmpty()) {
            this.content = Collections.emptyList();
        } else {
            this.content = Collections.unmodifiableList(new ArrayList<XMLStructure>(list));
            int n = this.content.size();
            for (int i = 0; i < n; ++i) {
                if (this.content.get(i) instanceof XMLStructure) continue;
                throw new ClassCastException("content[" + i + "] is not a valid type");
            }
        }
        this.id = string;
        this.mimeType = string2;
        this.encoding = string3;
    }

    public DOMXMLObject(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        Object object;
        Object object2;
        this.encoding = DOMUtils.getAttributeValue(element, "Encoding");
        Attr attr = element.getAttributeNodeNS(null, "Id");
        if (attr != null) {
            this.id = attr.getValue();
            element.setIdAttributeNode(attr, true);
        } else {
            this.id = null;
        }
        this.mimeType = DOMUtils.getAttributeValue(element, "MimeType");
        ArrayList<XMLStructure> arrayList = new ArrayList<XMLStructure>();
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node.getNodeType() == 1) {
                object2 = (Element)node;
                String string = object2.getLocalName();
                object = object2.getNamespaceURI();
                if ("Manifest".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(object)) {
                    arrayList.add(new DOMManifest((Element)object2, xMLCryptoContext, provider));
                    continue;
                }
                if ("SignatureProperties".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(object)) {
                    arrayList.add(new DOMSignatureProperties((Element)object2));
                    continue;
                }
                if ("X509Data".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(object)) {
                    arrayList.add(new DOMX509Data((Element)object2));
                    continue;
                }
                arrayList.add(new javax.xml.crypto.dom.DOMStructure(node));
                continue;
            }
            arrayList.add(new javax.xml.crypto.dom.DOMStructure(node));
        }
        object2 = element.getAttributes();
        for (int i = 0; i < object2.getLength(); ++i) {
            object = object2.item(i);
            if (!DOMUtils.isNamespace((Node)object)) continue;
            arrayList.add(new javax.xml.crypto.dom.DOMStructure((Node)object));
        }
        this.content = arrayList.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.objectElem = element;
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
    public String getMimeType() {
        return this.mimeType;
    }

    @Override
    public String getEncoding() {
        return this.encoding;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = this.objectElem;
        if (element == null) {
            element = DOMUtils.createElement(document, "Object", "http://www.w3.org/2000/09/xmldsig#", string);
            DOMUtils.setAttributeID(element, "Id", this.id);
            DOMUtils.setAttribute(element, "MimeType", this.mimeType);
            DOMUtils.setAttribute(element, "Encoding", this.encoding);
            for (XMLStructure xMLStructure : this.content) {
                if (xMLStructure instanceof DOMStructure) {
                    ((DOMStructure)xMLStructure).marshal(element, string, dOMCryptoContext);
                    continue;
                }
                javax.xml.crypto.dom.DOMStructure dOMStructure = (javax.xml.crypto.dom.DOMStructure)xMLStructure;
                DOMUtils.appendChild(element, dOMStructure.getNode());
            }
        }
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2;
        if (this == object) {
            return true;
        }
        if (!(object instanceof XMLObject)) {
            return false;
        }
        XMLObject xMLObject = (XMLObject)object;
        boolean bl3 = this.id == null ? xMLObject.getId() == null : (bl2 = this.id.equals(xMLObject.getId()));
        boolean bl4 = this.encoding == null ? xMLObject.getEncoding() == null : (bl = this.encoding.equals(xMLObject.getEncoding()));
        boolean bl5 = this.mimeType == null ? xMLObject.getMimeType() == null : this.mimeType.equals(xMLObject.getMimeType());
        return bl2 && bl && bl5 && this.equalsContent(this.content, xMLObject.getContent());
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        if (this.encoding != null) {
            n = 31 * n + this.encoding.hashCode();
        }
        if (this.mimeType != null) {
            n = 31 * n + this.mimeType.hashCode();
        }
        n = 31 * n + this.content.hashCode();
        return n;
    }
}

