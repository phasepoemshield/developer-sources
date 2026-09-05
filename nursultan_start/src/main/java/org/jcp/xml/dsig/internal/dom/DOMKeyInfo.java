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
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import org.jcp.xml.dsig.internal.dom.DOMKeyName;
import org.jcp.xml.dsig.internal.dom.DOMKeyValue;
import org.jcp.xml.dsig.internal.dom.DOMPGPData;
import org.jcp.xml.dsig.internal.dom.DOMRetrievalMethod;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.DOMX509Data;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMKeyInfo
extends DOMStructure
implements KeyInfo {
    private final String id;
    private final List<XMLStructure> keyInfoTypes;

    public static List<XMLStructure> getContent(KeyInfo keyInfo) {
        return keyInfo.getContent();
    }

    public DOMKeyInfo(List<? extends XMLStructure> list, String string) {
        if (list == null) {
            throw new NullPointerException("content cannot be null");
        }
        this.keyInfoTypes = Collections.unmodifiableList(new ArrayList<XMLStructure>(list));
        if (this.keyInfoTypes.isEmpty()) {
            throw new IllegalArgumentException("content cannot be empty");
        }
        int n = this.keyInfoTypes.size();
        for (int i = 0; i < n; ++i) {
            if (this.keyInfoTypes.get(i) instanceof XMLStructure) continue;
            throw new ClassCastException("content[" + i + "] is not a valid KeyInfo type");
        }
        this.id = string;
    }

    public DOMKeyInfo(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        Node node;
        Attr attr = element.getAttributeNodeNS(null, "Id");
        if (attr != null) {
            this.id = attr.getValue();
            element.setIdAttributeNode(attr, true);
        } else {
            this.id = null;
        }
        ArrayList<XMLStructure> arrayList = new ArrayList<XMLStructure>();
        if (node == null) {
            throw new MarshalException("KeyInfo must contain at least one type");
        }
        for (node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            String string = element2.getLocalName();
            String string2 = element2.getNamespaceURI();
            if ("X509Data".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(new DOMX509Data(element2));
                continue;
            }
            if ("KeyName".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(new DOMKeyName(element2));
                continue;
            }
            if ("KeyValue".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(DOMKeyValue.unmarshal(element2));
                continue;
            }
            if ("RetrievalMethod".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(new DOMRetrievalMethod(element2, xMLCryptoContext, provider));
                continue;
            }
            if ("PGPData".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(new DOMPGPData(element2));
                continue;
            }
            arrayList.add(new javax.xml.crypto.dom.DOMStructure(element2));
        }
        this.keyInfoTypes = Collections.unmodifiableList(arrayList);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public List<XMLStructure> getContent() {
        return this.keyInfoTypes;
    }

    @Override
    public void marshal(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        if (xMLStructure == null) {
            throw new NullPointerException("parent is null");
        }
        if (!(xMLStructure instanceof javax.xml.crypto.dom.DOMStructure)) {
            throw new ClassCastException("parent must be of type DOMStructure");
        }
        Node node = ((javax.xml.crypto.dom.DOMStructure)xMLStructure).getNode();
        String string = DOMUtils.getSignaturePrefix(xMLCryptoContext);
        Element element = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "KeyInfo", "http://www.w3.org/2000/09/xmldsig#", string);
        if (string == null || string.length() == 0) {
            element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://www.w3.org/2000/09/xmldsig#");
        } else {
            element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + string, "http://www.w3.org/2000/09/xmldsig#");
        }
        Node node2 = null;
        if (xMLCryptoContext instanceof DOMSignContext) {
            node2 = ((DOMSignContext)xMLCryptoContext).getNextSibling();
        }
        this.marshal(node, element, node2, string, (DOMCryptoContext)xMLCryptoContext);
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        this.marshal(node, null, string, dOMCryptoContext);
    }

    public void marshal(Node node, Node node2, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "KeyInfo", "http://www.w3.org/2000/09/xmldsig#", string);
        this.marshal(node, element, node2, string, dOMCryptoContext);
    }

    private void marshal(Node node, Element element, Node node2, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        for (XMLStructure xMLStructure : this.keyInfoTypes) {
            if (xMLStructure instanceof DOMStructure) {
                ((DOMStructure)xMLStructure).marshal(element, string, dOMCryptoContext);
                continue;
            }
            DOMUtils.appendChild(element, ((javax.xml.crypto.dom.DOMStructure)xMLStructure).getNode());
        }
        DOMUtils.setAttributeID(element, "Id", this.id);
        node.insertBefore(element, node2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof KeyInfo)) {
            return false;
        }
        KeyInfo keyInfo = (KeyInfo)object;
        boolean bl = this.id == null ? keyInfo.getId() == null : this.id.equals(keyInfo.getId());
        return this.keyInfoTypes.equals(keyInfo.getContent()) && bl;
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        n = 31 * n + this.keyInfoTypes.hashCode();
        return n;
    }
}

