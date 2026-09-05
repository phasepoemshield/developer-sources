/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.PGPData;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMPGPData
extends DOMStructure
implements PGPData {
    private final byte[] keyId;
    private final byte[] keyPacket;
    private final List<XMLStructure> externalElements;

    public DOMPGPData(byte[] byArray, List<? extends XMLStructure> list) {
        if (byArray == null) {
            throw new NullPointerException("keyPacket cannot be null");
        }
        if (list == null || list.isEmpty()) {
            this.externalElements = Collections.emptyList();
        } else {
            this.externalElements = Collections.unmodifiableList(new ArrayList<XMLStructure>(list));
            int n = this.externalElements.size();
            for (int i = 0; i < n; ++i) {
                if (this.externalElements.get(i) instanceof XMLStructure) continue;
                throw new ClassCastException("other[" + i + "] is not a valid PGPData type");
            }
        }
        this.keyPacket = (byte[])byArray.clone();
        this.checkKeyPacket(byArray);
        this.keyId = null;
    }

    public DOMPGPData(byte[] byArray, byte[] byArray2, List<? extends XMLStructure> list) {
        if (byArray == null) {
            throw new NullPointerException("keyId cannot be null");
        }
        if (byArray.length != 8) {
            throw new IllegalArgumentException("keyId must be 8 bytes long");
        }
        if (list == null || list.isEmpty()) {
            this.externalElements = Collections.emptyList();
        } else {
            this.externalElements = Collections.unmodifiableList(new ArrayList<XMLStructure>(list));
            int n = this.externalElements.size();
            for (int i = 0; i < n; ++i) {
                if (this.externalElements.get(i) instanceof XMLStructure) continue;
                throw new ClassCastException("other[" + i + "] is not a valid PGPData type");
            }
        }
        this.keyId = (byte[])byArray.clone();
        byte[] byArray3 = this.keyPacket = byArray2 == null ? null : (byte[])byArray2.clone();
        if (byArray2 != null) {
            this.checkKeyPacket(byArray2);
        }
    }

    public DOMPGPData(Element element) throws MarshalException {
        byte[] byArray = null;
        byte[] byArray2 = null;
        ArrayList<javax.xml.crypto.dom.DOMStructure> arrayList = new ArrayList<javax.xml.crypto.dom.DOMStructure>();
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            String string;
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            String string2 = element2.getLocalName();
            String string3 = element2.getNamespaceURI();
            if ("PGPKeyID".equals(string2) && "http://www.w3.org/2000/09/xmldsig#".equals(string3)) {
                string = XMLUtils.getFullTextChildrenFromNode(element2);
                byArray = XMLUtils.decode(string);
                continue;
            }
            if ("PGPKeyPacket".equals(string2) && "http://www.w3.org/2000/09/xmldsig#".equals(string3)) {
                string = XMLUtils.getFullTextChildrenFromNode(element2);
                byArray2 = XMLUtils.decode(string);
                continue;
            }
            arrayList.add(new javax.xml.crypto.dom.DOMStructure(element2));
        }
        this.keyId = byArray;
        this.keyPacket = byArray2;
        this.externalElements = Collections.unmodifiableList(arrayList);
    }

    @Override
    public byte[] getKeyId() {
        return this.keyId == null ? null : (byte[])this.keyId.clone();
    }

    @Override
    public byte[] getKeyPacket() {
        return this.keyPacket == null ? null : (byte[])this.keyPacket.clone();
    }

    @Override
    public List<XMLStructure> getExternalElements() {
        return this.externalElements;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Object object;
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "PGPData", "http://www.w3.org/2000/09/xmldsig#", string);
        if (this.keyId != null) {
            object = DOMUtils.createElement(document, "PGPKeyID", "http://www.w3.org/2000/09/xmldsig#", string);
            object.appendChild(document.createTextNode(XMLUtils.encodeToString(this.keyId)));
            element.appendChild((Node)object);
        }
        if (this.keyPacket != null) {
            object = DOMUtils.createElement(document, "PGPKeyPacket", "http://www.w3.org/2000/09/xmldsig#", string);
            object.appendChild(document.createTextNode(XMLUtils.encodeToString(this.keyPacket)));
            element.appendChild((Node)object);
        }
        for (XMLStructure xMLStructure : this.externalElements) {
            DOMUtils.appendChild(element, ((javax.xml.crypto.dom.DOMStructure)xMLStructure).getNode());
        }
        node.appendChild(element);
    }

    private void checkKeyPacket(byte[] byArray) {
        if (byArray.length < 3) {
            throw new IllegalArgumentException("keypacket must be at least 3 bytes long");
        }
        byte by = byArray[0];
        if ((by & 0x80) != 128) {
            throw new IllegalArgumentException("keypacket tag is invalid: bit 7 is not set");
        }
        if ((by & 0x40) != 64) {
            throw new IllegalArgumentException("old keypacket tag format is unsupported");
        }
        if ((by & 6) != 6 && (by & 0xE) != 14 && (by & 5) != 5 && (by & 7) != 7) {
            throw new IllegalArgumentException("keypacket tag is invalid: must be 6, 14, 5, or 7");
        }
    }
}

