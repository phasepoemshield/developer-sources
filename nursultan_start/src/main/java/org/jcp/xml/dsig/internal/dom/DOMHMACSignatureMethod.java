/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.jcp.xml.dsig.internal.MacOutputStream;
import org.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMSignedInfo;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class DOMHMACSignatureMethod
extends AbstractDOMSignatureMethod {
    private static final String DOM_SIGNATURE_PROVIDER = "org.jcp.xml.dsig.internal.dom.MacProvider";
    private static final Logger LOG = LoggerFactory.getLogger(DOMHMACSignatureMethod.class);
    static final String HMAC_SHA224 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha224";
    static final String HMAC_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256";
    static final String HMAC_SHA384 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384";
    static final String HMAC_SHA512 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512";
    static final String HMAC_RIPEMD160 = "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160";
    private Mac hmac;
    private int outputLength;
    private boolean outputLengthSet;
    private SignatureMethodParameterSpec params;

    DOMHMACSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        this.checkParams((SignatureMethodParameterSpec)algorithmParameterSpec);
        this.params = (SignatureMethodParameterSpec)algorithmParameterSpec;
    }

    DOMHMACSignatureMethod(Element element) throws MarshalException {
        Element element2 = DOMUtils.getFirstChildElement(element);
        if (element2 != null) {
            this.params = this.unmarshalParams(element2);
        }
        try {
            this.checkParams(this.params);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new MarshalException(invalidAlgorithmParameterException);
        }
    }

    @Override
    void checkParams(SignatureMethodParameterSpec signatureMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (signatureMethodParameterSpec != null) {
            if (!(signatureMethodParameterSpec instanceof HMACParameterSpec)) {
                throw new InvalidAlgorithmParameterException("params must be of type HMACParameterSpec");
            }
            this.outputLength = ((HMACParameterSpec)signatureMethodParameterSpec).getOutputLength();
            this.outputLengthSet = true;
            LOG.debug("Setting outputLength from HMACParameterSpec to: {}", this.outputLength);
        }
    }

    @Override
    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    @Override
    SignatureMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        try {
            this.outputLength = Integer.parseInt(element.getFirstChild().getNodeValue());
        }
        catch (NumberFormatException numberFormatException) {
            throw new MarshalException("Invalid output length supplied: " + element.getFirstChild().getNodeValue());
        }
        this.outputLengthSet = true;
        LOG.debug("unmarshalled outputLength: {}", this.outputLength);
        return new HMACParameterSpec(this.outputLength);
    }

    @Override
    void marshalParams(Element element, String string) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(element);
        Element element2 = DOMUtils.createElement(document, "HMACOutputLength", "http://www.w3.org/2000/09/xmldsig#", string);
        element2.appendChild(document.createTextNode(String.valueOf(this.outputLength)));
        element.appendChild(element2);
    }

    @Override
    boolean verify(Key key, SignedInfo signedInfo, byte[] byArray, XMLValidateContext xMLValidateContext) throws InvalidKeyException, SignatureException, XMLSignatureException {
        Object object;
        if (key == null || signedInfo == null || byArray == null) {
            throw new NullPointerException();
        }
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("key must be SecretKey");
        }
        if (this.hmac == null) {
            try {
                object = (Provider)xMLValidateContext.getProperty(DOM_SIGNATURE_PROVIDER);
                this.hmac = object == null ? Mac.getInstance(this.getJCAAlgorithm()) : Mac.getInstance(this.getJCAAlgorithm(), (Provider)object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new XMLSignatureException(noSuchAlgorithmException);
            }
        }
        if (this.outputLengthSet && this.outputLength < this.getDigestLength()) {
            throw new XMLSignatureException("HMACOutputLength must not be less than " + this.getDigestLength());
        }
        this.hmac.init(key);
        ((DOMSignedInfo)signedInfo).canonicalize(xMLValidateContext, new MacOutputStream(this.hmac));
        object = this.hmac.doFinal();
        return MessageDigest.isEqual(byArray, (byte[])object);
    }

    @Override
    byte[] sign(Key key, SignedInfo signedInfo, XMLSignContext xMLSignContext) throws InvalidKeyException, XMLSignatureException {
        if (key == null || signedInfo == null) {
            throw new NullPointerException();
        }
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("key must be SecretKey");
        }
        if (this.hmac == null) {
            try {
                Provider provider = (Provider)xMLSignContext.getProperty(DOM_SIGNATURE_PROVIDER);
                this.hmac = provider == null ? Mac.getInstance(this.getJCAAlgorithm()) : Mac.getInstance(this.getJCAAlgorithm(), provider);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new XMLSignatureException(noSuchAlgorithmException);
            }
        }
        if (this.outputLengthSet && this.outputLength < this.getDigestLength()) {
            throw new XMLSignatureException("HMACOutputLength must not be less than " + this.getDigestLength());
        }
        this.hmac.init(key);
        ((DOMSignedInfo)signedInfo).canonicalize(xMLSignContext, new MacOutputStream(this.hmac));
        return this.hmac.doFinal();
    }

    @Override
    boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec) {
        if (this.getParameterSpec() == algorithmParameterSpec) {
            return true;
        }
        if (!(algorithmParameterSpec instanceof HMACParameterSpec)) {
            return false;
        }
        HMACParameterSpec hMACParameterSpec = (HMACParameterSpec)algorithmParameterSpec;
        return this.outputLength == hMACParameterSpec.getOutputLength();
    }

    @Override
    AbstractDOMSignatureMethod.Type getAlgorithmType() {
        return AbstractDOMSignatureMethod.Type.HMAC;
    }

    abstract int getDigestLength();

    static final class RIPEMD160
    extends DOMHMACSignatureMethod {
        RIPEMD160(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        RIPEMD160(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_RIPEMD160;
        }

        @Override
        String getJCAAlgorithm() {
            return "HMACRIPEMD160";
        }

        @Override
        int getDigestLength() {
            return 160;
        }
    }

    static final class SHA512
    extends DOMHMACSignatureMethod {
        SHA512(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA512(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA512;
        }

        @Override
        String getJCAAlgorithm() {
            return "HmacSHA512";
        }

        @Override
        int getDigestLength() {
            return 512;
        }
    }

    static final class SHA384
    extends DOMHMACSignatureMethod {
        SHA384(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA384(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA384;
        }

        @Override
        String getJCAAlgorithm() {
            return "HmacSHA384";
        }

        @Override
        int getDigestLength() {
            return 384;
        }
    }

    static final class SHA256
    extends DOMHMACSignatureMethod {
        SHA256(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA256(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA256;
        }

        @Override
        String getJCAAlgorithm() {
            return "HmacSHA256";
        }

        @Override
        int getDigestLength() {
            return 256;
        }
    }

    static final class SHA224
    extends DOMHMACSignatureMethod {
        SHA224(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA224(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA224;
        }

        @Override
        String getJCAAlgorithm() {
            return "HmacSHA224";
        }

        @Override
        int getDigestLength() {
            return 224;
        }
    }

    static final class SHA1
    extends DOMHMACSignatureMethod {
        SHA1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#hmac-sha1";
        }

        @Override
        String getJCAAlgorithm() {
            return "HmacSHA1";
        }

        @Override
        int getDigestLength() {
            return 160;
        }
    }
}

