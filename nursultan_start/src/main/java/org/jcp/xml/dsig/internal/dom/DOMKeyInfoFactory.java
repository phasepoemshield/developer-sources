/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.math.BigInteger;
import java.security.KeyException;
import java.security.PublicKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyName;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.PGPData;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.jcp.xml.dsig.internal.dom.DOMKeyInfo;
import org.jcp.xml.dsig.internal.dom.DOMKeyName;
import org.jcp.xml.dsig.internal.dom.DOMKeyValue;
import org.jcp.xml.dsig.internal.dom.DOMPGPData;
import org.jcp.xml.dsig.internal.dom.DOMRetrievalMethod;
import org.jcp.xml.dsig.internal.dom.DOMURIDereferencer;
import org.jcp.xml.dsig.internal.dom.DOMX509Data;
import org.jcp.xml.dsig.internal.dom.DOMX509IssuerSerial;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMKeyInfoFactory
extends KeyInfoFactory {
    public KeyInfo newKeyInfo(List list) {
        return this.newKeyInfo(list, (String)null);
    }

    public KeyInfo newKeyInfo(List list, String string) {
        return new DOMKeyInfo(list, string);
    }

    @Override
    public KeyName newKeyName(String string) {
        return new DOMKeyName(string);
    }

    @Override
    public KeyValue newKeyValue(PublicKey publicKey) throws KeyException {
        String string = publicKey.getAlgorithm();
        if ("DSA".equals(string)) {
            return new DOMKeyValue.DSA((DSAPublicKey)publicKey);
        }
        if ("RSA".equals(string)) {
            return new DOMKeyValue.RSA((RSAPublicKey)publicKey);
        }
        if ("EC".equals(string)) {
            return new DOMKeyValue.EC((ECPublicKey)publicKey);
        }
        throw new KeyException("unsupported key algorithm: " + string);
    }

    @Override
    public PGPData newPGPData(byte[] byArray) {
        return this.newPGPData(byArray, (byte[])null, (List)null);
    }

    public PGPData newPGPData(byte[] byArray, byte[] byArray2, List list) {
        return new DOMPGPData(byArray, byArray2, list);
    }

    public PGPData newPGPData(byte[] byArray, List list) {
        return new DOMPGPData(byArray, list);
    }

    @Override
    public RetrievalMethod newRetrievalMethod(String string) {
        return this.newRetrievalMethod(string, (String)null, (List)null);
    }

    public RetrievalMethod newRetrievalMethod(String string, String string2, List list) {
        if (string == null) {
            throw new NullPointerException("uri must not be null");
        }
        return new DOMRetrievalMethod(string, string2, list);
    }

    public X509Data newX509Data(List list) {
        return new DOMX509Data(list);
    }

    @Override
    public X509IssuerSerial newX509IssuerSerial(String string, BigInteger bigInteger) {
        return new DOMX509IssuerSerial(string, bigInteger);
    }

    @Override
    public boolean isFeatureSupported(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return false;
    }

    @Override
    public URIDereferencer getURIDereferencer() {
        return DOMURIDereferencer.INSTANCE;
    }

    @Override
    public KeyInfo unmarshalKeyInfo(XMLStructure xMLStructure) throws MarshalException {
        if (xMLStructure == null) {
            throw new NullPointerException("xmlStructure cannot be null");
        }
        if (!(xMLStructure instanceof DOMStructure)) {
            throw new ClassCastException("xmlStructure must be of type DOMStructure");
        }
        Node node = ((DOMStructure)xMLStructure).getNode();
        node.normalize();
        Element element = null;
        if (node.getNodeType() == 9) {
            element = ((Document)node).getDocumentElement();
        } else if (node.getNodeType() == 1) {
            element = (Element)node;
        } else {
            throw new MarshalException("xmlStructure does not contain a proper Node");
        }
        String string = element.getLocalName();
        String string2 = element.getNamespaceURI();
        if (string == null || string2 == null) {
            throw new MarshalException("Document implementation must support DOM Level 2 and be namespace aware");
        }
        if ("KeyInfo".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
            try {
                return new DOMKeyInfo(element, new UnmarshalContext(), this.getProvider());
            }
            catch (MarshalException marshalException) {
                throw marshalException;
            }
            catch (Exception exception) {
                throw new MarshalException(exception);
            }
        }
        throw new MarshalException("Invalid KeyInfo tag: " + string2 + ":" + string);
    }

    private static class UnmarshalContext
    extends DOMCryptoContext {
        UnmarshalContext() {
        }
    }
}

