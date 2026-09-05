/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

abstract class AbstractDOMSignatureMethod
extends DOMStructure
implements SignatureMethod {
    AbstractDOMSignatureMethod() {
    }

    abstract boolean verify(Key var1, SignedInfo var2, byte[] var3, XMLValidateContext var4) throws InvalidKeyException, SignatureException, XMLSignatureException;

    abstract byte[] sign(Key var1, SignedInfo var2, XMLSignContext var3) throws InvalidKeyException, XMLSignatureException;

    abstract String getJCAAlgorithm();

    abstract Type getAlgorithmType();

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "SignatureMethod", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttribute(element, "Algorithm", this.getAlgorithm());
        if (this.getParameterSpec() != null) {
            this.marshalParams(element, string);
        }
        node.appendChild(element);
    }

    void marshalParams(Element element, String string) throws MarshalException {
        throw new MarshalException("no parameters should be specified for the " + this.getAlgorithm() + " SignatureMethod algorithm");
    }

    SignatureMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        throw new MarshalException("no parameters should be specified for the " + this.getAlgorithm() + " SignatureMethod algorithm");
    }

    void checkParams(SignatureMethodParameterSpec signatureMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (signatureMethodParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("no parameters should be specified for the " + this.getAlgorithm() + " SignatureMethod algorithm");
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SignatureMethod)) {
            return false;
        }
        SignatureMethod signatureMethod = (SignatureMethod)object;
        return this.getAlgorithm().equals(signatureMethod.getAlgorithm()) && this.paramsEqual(signatureMethod.getParameterSpec());
    }

    public int hashCode() {
        int n = 17;
        n = 31 * n + this.getAlgorithm().hashCode();
        AlgorithmParameterSpec algorithmParameterSpec = this.getParameterSpec();
        if (algorithmParameterSpec != null) {
            n = 31 * n + algorithmParameterSpec.hashCode();
        }
        return n;
    }

    boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec) {
        return this.getParameterSpec() == algorithmParameterSpec;
    }

    static enum Type {
        DSA,
        RSA,
        ECDSA,
        EDDSA,
        HMAC;

    }
}

