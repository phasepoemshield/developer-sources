/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMX509Data
extends DOMStructure
implements X509Data {
    private final List<Object> content;
    private CertificateFactory cf;

    public DOMX509Data(List<?> list) {
        if (list == null) {
            throw new NullPointerException("content cannot be null");
        }
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("content cannot be empty");
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Object e = arrayList.get(i);
            if (e instanceof String) {
                new X500Principal((String)e);
                continue;
            }
            if (e instanceof byte[] || e instanceof X509Certificate || e instanceof X509CRL || e instanceof XMLStructure) continue;
            throw new ClassCastException("content[" + i + "] is not a valid X509Data type");
        }
        this.content = Collections.unmodifiableList(arrayList);
    }

    public DOMX509Data(Element element) throws MarshalException {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            String string = element2.getLocalName();
            String string2 = element2.getNamespaceURI();
            if ("X509Certificate".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(this.unmarshalX509Certificate(element2));
                continue;
            }
            if ("X509IssuerSerial".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(new DOMX509IssuerSerial(element2));
                continue;
            }
            if ("X509SubjectName".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(element2.getFirstChild().getNodeValue());
                continue;
            }
            if ("X509SKI".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                String string3 = XMLUtils.getFullTextChildrenFromNode(element2);
                arrayList.add(XMLUtils.decode(string3));
                continue;
            }
            if ("X509CRL".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                arrayList.add(this.unmarshalX509CRL(element2));
                continue;
            }
            arrayList.add(new javax.xml.crypto.dom.DOMStructure(element2));
        }
        this.content = Collections.unmodifiableList(arrayList);
    }

    public List<Object> getContent() {
        return this.content;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "X509Data", "http://www.w3.org/2000/09/xmldsig#", string);
        for (Object object : this.content) {
            if (object instanceof X509Certificate) {
                this.marshalCert((X509Certificate)object, element, document, string);
                continue;
            }
            if (object instanceof XMLStructure) {
                if (object instanceof X509IssuerSerial) {
                    ((DOMX509IssuerSerial)object).marshal(element, string, dOMCryptoContext);
                    continue;
                }
                javax.xml.crypto.dom.DOMStructure dOMStructure = (javax.xml.crypto.dom.DOMStructure)object;
                DOMUtils.appendChild(element, dOMStructure.getNode());
                continue;
            }
            if (object instanceof byte[]) {
                this.marshalSKI((byte[])object, element, document, string);
                continue;
            }
            if (object instanceof String) {
                this.marshalSubjectName((String)object, element, document, string);
                continue;
            }
            if (!(object instanceof X509CRL)) continue;
            this.marshalCRL((X509CRL)object, element, document, string);
        }
        node.appendChild(element);
    }

    private void marshalSKI(byte[] byArray, Node node, Document document, String string) {
        Element element = DOMUtils.createElement(document, "X509SKI", "http://www.w3.org/2000/09/xmldsig#", string);
        element.appendChild(document.createTextNode(XMLUtils.encodeToString(byArray)));
        node.appendChild(element);
    }

    private void marshalSubjectName(String string, Node node, Document document, String string2) {
        Element element = DOMUtils.createElement(document, "X509SubjectName", "http://www.w3.org/2000/09/xmldsig#", string2);
        element.appendChild(document.createTextNode(string));
        node.appendChild(element);
    }

    private void marshalCert(X509Certificate x509Certificate, Node node, Document document, String string) throws MarshalException {
        Element element = DOMUtils.createElement(document, "X509Certificate", "http://www.w3.org/2000/09/xmldsig#", string);
        try {
            element.appendChild(document.createTextNode(XMLUtils.encodeToString(x509Certificate.getEncoded())));
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new MarshalException("Error encoding X509Certificate", certificateEncodingException);
        }
        node.appendChild(element);
    }

    private void marshalCRL(X509CRL x509CRL, Node node, Document document, String string) throws MarshalException {
        Element element = DOMUtils.createElement(document, "X509CRL", "http://www.w3.org/2000/09/xmldsig#", string);
        try {
            element.appendChild(document.createTextNode(XMLUtils.encodeToString(x509CRL.getEncoded())));
        }
        catch (CRLException cRLException) {
            throw new MarshalException("Error encoding X509CRL", cRLException);
        }
        node.appendChild(element);
    }

    private X509Certificate unmarshalX509Certificate(Element element) throws MarshalException {
        X509Certificate x509Certificate;
        block9: {
            ByteArrayInputStream byteArrayInputStream = this.unmarshalBase64Binary(element);
            try {
                x509Certificate = (X509Certificate)this.cf.generateCertificate(byteArrayInputStream);
                if (byteArrayInputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (CertificateException certificateException) {
                    throw new MarshalException("Cannot create X509Certificate", certificateException);
                }
                catch (IOException iOException) {
                    throw new MarshalException("Error closing stream", iOException);
                }
            }
            byteArrayInputStream.close();
        }
        return x509Certificate;
    }

    private X509CRL unmarshalX509CRL(Element element) throws MarshalException {
        X509CRL x509CRL;
        block9: {
            ByteArrayInputStream byteArrayInputStream = this.unmarshalBase64Binary(element);
            try {
                x509CRL = (X509CRL)this.cf.generateCRL(byteArrayInputStream);
                if (byteArrayInputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (CRLException cRLException) {
                    throw new MarshalException("Cannot create X509CRL", cRLException);
                }
                catch (IOException iOException) {
                    throw new MarshalException("Error closing stream", iOException);
                }
            }
            byteArrayInputStream.close();
        }
        return x509CRL;
    }

    private ByteArrayInputStream unmarshalBase64Binary(Element element) throws MarshalException {
        try {
            if (this.cf == null) {
                this.cf = CertificateFactory.getInstance("X.509");
            }
            String string = XMLUtils.getFullTextChildrenFromNode(element);
            return new ByteArrayInputStream(XMLUtils.decode(string));
        }
        catch (CertificateException certificateException) {
            throw new MarshalException("Cannot create CertificateFactory", certificateException);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof X509Data)) {
            return false;
        }
        X509Data x509Data = (X509Data)object;
        List<?> list = x509Data.getContent();
        int n = this.content.size();
        if (n != list.size()) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            Object object2 = this.content.get(i);
            Object obj = list.get(i);
            if (!(object2 instanceof byte[] ? !(obj instanceof byte[]) || !Arrays.equals((byte[])object2, (byte[])obj) : !object2.equals(obj))) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n = 17;
        n = 31 * n + this.content.hashCode();
        return n;
    }
}

