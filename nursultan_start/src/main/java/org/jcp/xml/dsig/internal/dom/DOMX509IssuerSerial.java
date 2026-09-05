/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMX509IssuerSerial
extends DOMStructure
implements X509IssuerSerial {
    private final String issuerName;
    private final BigInteger serialNumber;

    public DOMX509IssuerSerial(String string, BigInteger bigInteger) {
        if (string == null) {
            throw new NullPointerException("issuerName cannot be null");
        }
        if (bigInteger == null) {
            throw new NullPointerException("serialNumber cannot be null");
        }
        new X500Principal(string);
        this.issuerName = string;
        this.serialNumber = bigInteger;
    }

    public DOMX509IssuerSerial(Element element) throws MarshalException {
        Element element2 = DOMUtils.getFirstChildElement(element, "X509IssuerName", "http://www.w3.org/2000/09/xmldsig#");
        Element element3 = DOMUtils.getNextSiblingElement(element2, "X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#");
        this.issuerName = element2.getFirstChild().getNodeValue();
        this.serialNumber = new BigInteger(element3.getFirstChild().getNodeValue());
    }

    @Override
    public String getIssuerName() {
        return this.issuerName;
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "X509IssuerSerial", "http://www.w3.org/2000/09/xmldsig#", string);
        Element element2 = DOMUtils.createElement(document, "X509IssuerName", "http://www.w3.org/2000/09/xmldsig#", string);
        Element element3 = DOMUtils.createElement(document, "X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#", string);
        element2.appendChild(document.createTextNode(this.issuerName));
        element3.appendChild(document.createTextNode(this.serialNumber.toString()));
        element.appendChild(element2);
        element.appendChild(element3);
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof X509IssuerSerial)) {
            return false;
        }
        X509IssuerSerial x509IssuerSerial = (X509IssuerSerial)object;
        return this.issuerName.equals(x509IssuerSerial.getIssuerName()) && this.serialNumber.equals(x509IssuerSerial.getSerialNumber());
    }

    public int hashCode() {
        int n = 17;
        n = 31 * n + this.issuerName.hashCode();
        n = 31 * n + this.serialNumber.hashCode();
        return n;
    }
}

