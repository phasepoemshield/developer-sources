/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.xml.crypto.dsig.spec.RSAPSSParameterSpec
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureBaseRSA;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.spec.RSAPSSParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMSignedInfo;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class DOMRSAPSSSignatureMethod
extends AbstractDOMSignatureMethod {
    private static final String DOM_SIGNATURE_PROVIDER = "org.jcp.xml.dsig.internal.dom.SignatureProvider";
    private static final Logger LOG = LoggerFactory.getLogger(DOMRSAPSSSignatureMethod.class);
    private final SignatureMethodParameterSpec params;
    private Signature signature;
    static final String RSA_PSS = "http://www.w3.org/2007/05/xmldsig-more#rsa-pss";
    private static final RSAPSSParameterSpec DEFAULT_PSS_SPEC = new RSAPSSParameterSpec(new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
    private PSSParameterSpec spec;

    DOMRSAPSSSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof SignatureMethodParameterSpec)) {
            throw new InvalidAlgorithmParameterException("params must be of type SignatureMethodParameterSpec");
        }
        if (algorithmParameterSpec == null) {
            algorithmParameterSpec = DEFAULT_PSS_SPEC;
        }
        this.checkParams((SignatureMethodParameterSpec)algorithmParameterSpec);
        this.params = (SignatureMethodParameterSpec)algorithmParameterSpec;
    }

    DOMRSAPSSSignatureMethod(Element element) throws MarshalException {
        Element element2 = DOMUtils.getFirstChildElement(element);
        this.params = element2 != null ? this.unmarshalParams(element2) : DEFAULT_PSS_SPEC;
        try {
            this.checkParams(this.params);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new MarshalException(invalidAlgorithmParameterException);
        }
    }

    @Override
    void checkParams(SignatureMethodParameterSpec signatureMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (!(signatureMethodParameterSpec instanceof RSAPSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("params must be of type RSAPSSParameterSpec");
        }
        this.spec = ((RSAPSSParameterSpec)signatureMethodParameterSpec).getPSSParameterSpec();
        LOG.debug("Setting RSAPSSParameterSpec to: {}", signatureMethodParameterSpec.toString());
    }

    @Override
    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    @Override
    void marshalParams(Element element, String string) throws MarshalException {
        Node node;
        Object object;
        Element element2;
        block11: {
            Object object2;
            SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm digestAlgorithm;
            Document document = DOMUtils.getOwnerDocument(element);
            element2 = document.createElementNS("http://www.w3.org/2007/05/xmldsig-more#", "pss:RSAPSSParams");
            element2.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:pss", "http://www.w3.org/2007/05/xmldsig-more#");
            try {
                digestAlgorithm = SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm.fromDigestAlgorithm(this.spec.getDigestAlgorithm());
                object2 = digestAlgorithm.getXmlDigestAlgorithm();
                if (!((String)object2).equals("http://www.w3.org/2001/04/xmlenc#sha256")) {
                    object = DOMUtils.createElement(element2.getOwnerDocument(), "DigestMethod", "http://www.w3.org/2000/09/xmldsig#", string);
                    object.setAttributeNS(null, "Algorithm", (String)object2);
                    element2.appendChild((Node)object);
                }
                if (this.spec.getSaltLength() != digestAlgorithm.getSaltLength()) {
                    object = element2.getOwnerDocument().createElementNS("http://www.w3.org/2007/05/xmldsig-more#", "pss:SaltLength");
                    node = element2.getOwnerDocument().createTextNode(String.valueOf(this.spec.getSaltLength()));
                    object.appendChild(node);
                    element2.appendChild((Node)object);
                }
            }
            catch (XMLSignatureException | DOMException exception) {
                throw new MarshalException("Invalid digest name supplied: " + this.spec.getDigestAlgorithm());
            }
            if (!this.spec.getMGFAlgorithm().equals("MGF1")) {
                throw new MarshalException("Unsupported MGF algorithm supplied: " + this.spec.getMGFAlgorithm());
            }
            object2 = (MGF1ParameterSpec)this.spec.getMGFParameters();
            try {
                object = SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm.fromDigestAlgorithm(((MGF1ParameterSpec)object2).getDigestAlgorithm());
                if (object == digestAlgorithm) break block11;
                node = element2.getOwnerDocument().createElementNS("http://www.w3.org/2007/05/xmldsig-more#", "pss:MaskGenerationFunction");
                try {
                    node.setAttributeNS(null, "Algorithm", "http://www.w3.org/2007/05/xmldsig-more#MGF1");
                }
                catch (DOMException dOMException) {
                    throw new MarshalException("Should not happen");
                }
                Element element3 = DOMUtils.createElement(element2.getOwnerDocument(), "DigestMethod", "http://www.w3.org/2000/09/xmldsig#", string);
                String string2 = ((SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm)((Object)object)).getXmlDigestAlgorithm();
                element3.setAttributeNS(null, "Algorithm", string2);
                node.appendChild(element3);
                element2.appendChild(node);
            }
            catch (XMLSignatureException | DOMException exception) {
                throw new MarshalException("Invalid digest name supplied: " + ((MGF1ParameterSpec)object2).getDigestAlgorithm());
            }
        }
        if (this.spec.getTrailerField() != 1) {
            object = element2.getOwnerDocument().createElementNS("http://www.w3.org/2007/05/xmldsig-more#", "pss:TrailerField");
            node = element2.getOwnerDocument().createTextNode(String.valueOf(this.spec.getTrailerField()));
            object.appendChild(node);
            element2.appendChild((Node)object);
        }
        if (element2.hasChildNodes()) {
            element.appendChild(element2);
        }
    }

    private static SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm validateDigestAlgorithm(String string) throws MarshalException {
        try {
            return SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm.fromXmlDigestAlgorithm(string);
        }
        catch (XMLSignatureException xMLSignatureException) {
            throw new MarshalException("Invalid digest algorithm supplied: " + string);
        }
    }

    @Override
    SignatureMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        if (element != null) {
            int n;
            int n2;
            SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm digestAlgorithm;
            Element element2 = XMLUtils.selectNode(element.getFirstChild(), "http://www.w3.org/2007/05/xmldsig-more#", "SaltLength", 0);
            Element element3 = XMLUtils.selectNode(element.getFirstChild(), "http://www.w3.org/2007/05/xmldsig-more#", "TrailerField", 0);
            Element element4 = XMLUtils.selectDsNode(element.getFirstChild(), "DigestMethod", 0);
            Element element5 = XMLUtils.selectNode(element.getFirstChild(), "http://www.w3.org/2007/05/xmldsig-more#", "MaskGenerationFunction", 0);
            SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm digestAlgorithm2 = digestAlgorithm = element4 != null ? DOMRSAPSSSignatureMethod.validateDigestAlgorithm(element4.getAttribute("Algorithm")) : SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm.SHA256;
            if (element5 != null) {
                String string = element5.getAttribute("Algorithm");
                if (!string.equals("http://www.w3.org/2007/05/xmldsig-more#MGF1")) {
                    throw new MarshalException("Unknown MGF algorithm: " + string);
                }
                Element element6 = XMLUtils.selectDsNode(element5.getFirstChild(), "DigestMethod", 0);
                if (element6 != null) {
                    digestAlgorithm2 = DOMRSAPSSSignatureMethod.validateDigestAlgorithm(element6.getAttribute("Algorithm"));
                }
            }
            try {
                n2 = element2 == null ? digestAlgorithm.getSaltLength() : Integer.parseUnsignedInt(element2.getTextContent());
            }
            catch (NumberFormatException numberFormatException) {
                throw new MarshalException("Invalid salt length supplied: " + element2.getTextContent());
            }
            try {
                n = element3 == null ? 1 : Integer.parseUnsignedInt(element3.getTextContent());
            }
            catch (NumberFormatException numberFormatException) {
                throw new MarshalException("Invalid trailer field supplied: " + element3.getTextContent());
            }
            return new RSAPSSParameterSpec(new PSSParameterSpec(digestAlgorithm.getDigestAlgorithm(), "MGF1", new MGF1ParameterSpec(digestAlgorithm2.getDigestAlgorithm()), n2, n));
        }
        return DEFAULT_PSS_SPEC;
    }

    @Override
    boolean verify(Key key, SignedInfo signedInfo, byte[] byArray, XMLValidateContext xMLValidateContext) throws InvalidKeyException, SignatureException, javax.xml.crypto.dsig.XMLSignatureException {
        boolean bl;
        Object object;
        if (key == null || signedInfo == null || byArray == null) {
            throw new NullPointerException();
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("key must be PublicKey");
        }
        if (this.signature == null) {
            try {
                object = (Provider)xMLValidateContext.getProperty(DOM_SIGNATURE_PROVIDER);
                this.signature = object == null ? Signature.getInstance(this.getJCAAlgorithm()) : Signature.getInstance(this.getJCAAlgorithm(), (Provider)object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new javax.xml.crypto.dsig.XMLSignatureException(noSuchAlgorithmException);
            }
        }
        this.signature.initVerify((PublicKey)key);
        try {
            this.signature.setParameter(this.spec);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new javax.xml.crypto.dsig.XMLSignatureException(invalidAlgorithmParameterException);
        }
        LOG.debug("Signature provider: {}", this.signature.getProvider());
        LOG.debug("Verifying with key: {}", key);
        LOG.debug("JCA Algorithm: {}", this.getJCAAlgorithm());
        LOG.debug("Signature Bytes length: {}", byArray.length);
        object = new SignerOutputStream(this.signature);
        try {
            ((DOMSignedInfo)signedInfo).canonicalize(xMLValidateContext, (ByteArrayOutputStream)object);
            bl = this.signature.verify(byArray);
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((ByteArrayOutputStream)object).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                throw new javax.xml.crypto.dsig.XMLSignatureException(iOException);
            }
        }
        ((ByteArrayOutputStream)object).close();
        return bl;
    }

    @Override
    byte[] sign(Key key, SignedInfo signedInfo, XMLSignContext xMLSignContext) throws InvalidKeyException, javax.xml.crypto.dsig.XMLSignatureException {
        byte[] byArray;
        Object object;
        if (key == null || signedInfo == null) {
            throw new NullPointerException();
        }
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException("key must be PrivateKey");
        }
        if (this.signature == null) {
            try {
                object = (Provider)xMLSignContext.getProperty(DOM_SIGNATURE_PROVIDER);
                this.signature = object == null ? Signature.getInstance(this.getJCAAlgorithm()) : Signature.getInstance(this.getJCAAlgorithm(), (Provider)object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new javax.xml.crypto.dsig.XMLSignatureException(noSuchAlgorithmException);
            }
        }
        this.signature.initSign((PrivateKey)key);
        try {
            this.signature.setParameter(this.spec);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new javax.xml.crypto.dsig.XMLSignatureException(invalidAlgorithmParameterException);
        }
        LOG.debug("Signature provider: {}", this.signature.getProvider());
        LOG.debug("JCA Algorithm: {}", this.getJCAAlgorithm());
        object = new SignerOutputStream(this.signature);
        try {
            ((DOMSignedInfo)signedInfo).canonicalize(xMLSignContext, (ByteArrayOutputStream)object);
            byArray = this.signature.sign();
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((ByteArrayOutputStream)object).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException | SignatureException exception) {
                throw new javax.xml.crypto.dsig.XMLSignatureException(exception);
            }
        }
        ((ByteArrayOutputStream)object).close();
        return byArray;
    }

    @Override
    boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec) {
        return this.getParameterSpec().equals(algorithmParameterSpec);
    }

    static final class RSAPSS
    extends DOMRSAPSSSignatureMethod {
        RSAPSS(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        RSAPSS(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMRSAPSSSignatureMethod.RSA_PSS;
        }

        @Override
        String getJCAAlgorithm() {
            return "RSASSA-PSS";
        }

        @Override
        AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.RSA;
        }
    }
}

