/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignatureProperties;
import javax.xml.crypto.dsig.SignatureProperty;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod;
import org.jcp.xml.dsig.internal.dom.DOMDigestMethod;
import org.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMManifest;
import org.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMReference;
import org.jcp.xml.dsig.internal.dom.DOMSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMSignatureProperties;
import org.jcp.xml.dsig.internal.dom.DOMSignatureProperty;
import org.jcp.xml.dsig.internal.dom.DOMSignedInfo;
import org.jcp.xml.dsig.internal.dom.DOMTransform;
import org.jcp.xml.dsig.internal.dom.DOMURIDereferencer;
import org.jcp.xml.dsig.internal.dom.DOMXMLObject;
import org.jcp.xml.dsig.internal.dom.DOMXMLSignature;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMXMLSignatureFactory
extends XMLSignatureFactory {
    @Override
    public XMLSignature newXMLSignature(SignedInfo signedInfo, KeyInfo keyInfo) {
        return new DOMXMLSignature(signedInfo, keyInfo, null, null, null);
    }

    public XMLSignature newXMLSignature(SignedInfo signedInfo, KeyInfo keyInfo, List list, String string, String string2) {
        return new DOMXMLSignature(signedInfo, keyInfo, list, string, string2);
    }

    @Override
    public Reference newReference(String string, DigestMethod digestMethod) {
        return this.newReference(string, digestMethod, (List)null, (String)null, (String)null);
    }

    public Reference newReference(String string, DigestMethod digestMethod, List list, String string2, String string3) {
        return new DOMReference(string, string2, digestMethod, list, string3, this.getProvider());
    }

    public Reference newReference(String string, DigestMethod digestMethod, List list, Data data, List list2, String string2, String string3) {
        if (list == null) {
            throw new NullPointerException("appliedTransforms cannot be null");
        }
        if (list.isEmpty()) {
            throw new NullPointerException("appliedTransforms cannot be empty");
        }
        if (data == null) {
            throw new NullPointerException("result cannot be null");
        }
        return new DOMReference(string, string2, digestMethod, list, data, list2, string3, this.getProvider());
    }

    public Reference newReference(String string, DigestMethod digestMethod, List list, String string2, String string3, byte[] byArray) {
        if (byArray == null) {
            throw new NullPointerException("digestValue cannot be null");
        }
        return new DOMReference(string, string2, digestMethod, null, null, list, string3, byArray, this.getProvider());
    }

    public SignedInfo newSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List list) {
        return this.newSignedInfo(canonicalizationMethod, signatureMethod, list, (String)null);
    }

    public SignedInfo newSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List list, String string) {
        return new DOMSignedInfo(canonicalizationMethod, signatureMethod, list, string);
    }

    public XMLObject newXMLObject(List list, String string, String string2, String string3) {
        return new DOMXMLObject(list, string, string2, string3);
    }

    public Manifest newManifest(List list) {
        return this.newManifest(list, (String)null);
    }

    public Manifest newManifest(List list, String string) {
        return new DOMManifest(list, string);
    }

    public SignatureProperties newSignatureProperties(List list, String string) {
        return new DOMSignatureProperties(list, string);
    }

    public SignatureProperty newSignatureProperty(List list, String string, String string2) {
        return new DOMSignatureProperty(list, string, string2);
    }

    @Override
    public XMLSignature unmarshalXMLSignature(XMLValidateContext xMLValidateContext) throws MarshalException {
        if (xMLValidateContext == null) {
            throw new NullPointerException("context cannot be null");
        }
        return this.unmarshal(((DOMValidateContext)xMLValidateContext).getNode(), xMLValidateContext);
    }

    @Override
    public XMLSignature unmarshalXMLSignature(XMLStructure xMLStructure) throws MarshalException {
        if (xMLStructure == null) {
            throw new NullPointerException("xmlStructure cannot be null");
        }
        if (!(xMLStructure instanceof DOMStructure)) {
            throw new ClassCastException("xmlStructure must be of type DOMStructure");
        }
        return this.unmarshal(((DOMStructure)xMLStructure).getNode(), new UnmarshalContext());
    }

    private XMLSignature unmarshal(Node node, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        node.normalize();
        Element element = null;
        if (node.getNodeType() == 9) {
            element = ((Document)node).getDocumentElement();
        } else if (node.getNodeType() == 1) {
            element = (Element)node;
        } else {
            throw new MarshalException("Signature element is not a proper Node");
        }
        String string = element.getLocalName();
        String string2 = element.getNamespaceURI();
        if (string == null || string2 == null) {
            throw new MarshalException("Document implementation must support DOM Level 2 and be namespace aware");
        }
        if ("Signature".equals(string) && "http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
            try {
                return new DOMXMLSignature(element, xMLCryptoContext, this.getProvider());
            }
            catch (MarshalException marshalException) {
                throw marshalException;
            }
            catch (Exception exception) {
                throw new MarshalException(exception);
            }
        }
        throw new MarshalException("Invalid Signature tag: " + string2 + ":" + string);
    }

    @Override
    public boolean isFeatureSupported(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return false;
    }

    @Override
    public DigestMethod newDigestMethod(String string, DigestMethodParameterSpec digestMethodParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        if (string == null) {
            throw new NullPointerException();
        }
        if (string.equals("http://www.w3.org/2000/09/xmldsig#sha1")) {
            return new DOMDigestMethod.SHA1(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#sha224")) {
            return new DOMDigestMethod.SHA224(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmlenc#sha256")) {
            return new DOMDigestMethod.SHA256(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#sha384")) {
            return new DOMDigestMethod.SHA384(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmlenc#sha512")) {
            return new DOMDigestMethod.SHA512(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmlenc#ripemd160")) {
            return new DOMDigestMethod.RIPEMD160(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#whirlpool")) {
            return new DOMDigestMethod.WHIRLPOOL(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-224")) {
            return new DOMDigestMethod.SHA3_224(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-256")) {
            return new DOMDigestMethod.SHA3_256(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-384")) {
            return new DOMDigestMethod.SHA3_384(digestMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-512")) {
            return new DOMDigestMethod.SHA3_512(digestMethodParameterSpec);
        }
        throw new NoSuchAlgorithmException("unsupported algorithm");
    }

    @Override
    public SignatureMethod newSignatureMethod(String string, SignatureMethodParameterSpec signatureMethodParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        if (string == null) {
            throw new NullPointerException();
        }
        if (string.equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1")) {
            return new DOMSignatureMethod.SHA1withRSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha224")) {
            return new DOMSignatureMethod.SHA224withRSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256")) {
            return new DOMSignatureMethod.SHA256withRSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384")) {
            return new DOMSignatureMethod.SHA384withRSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512")) {
            return new DOMSignatureMethod.SHA512withRSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160")) {
            return new DOMSignatureMethod.RIPEMD160withRSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha1-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA1withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha224-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA224withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha256-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA256withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha384-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA384withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha512-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA512withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-224-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA3_224withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-256-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA3_256withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-384-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA3_384withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#sha3-512-rsa-MGF1")) {
            return new DOMSignatureMethod.SHA3_512withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#rsa-pss")) {
            return new DOMRSAPSSSignatureMethod.RSAPSS(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#ripemd160-rsa-MGF1")) {
            return new DOMSignatureMethod.RIPEMD160withRSAandMGF1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1")) {
            return new DOMSignatureMethod.SHA1withDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2009/xmldsig11#dsa-sha256")) {
            return new DOMSignatureMethod.SHA256withDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2000/09/xmldsig#hmac-sha1")) {
            return new DOMHMACSignatureMethod.SHA1(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha224")) {
            return new DOMHMACSignatureMethod.SHA224(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256")) {
            return new DOMHMACSignatureMethod.SHA256(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384")) {
            return new DOMHMACSignatureMethod.SHA384(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512")) {
            return new DOMHMACSignatureMethod.SHA512(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160")) {
            return new DOMHMACSignatureMethod.RIPEMD160(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1")) {
            return new DOMSignatureMethod.SHA1withECDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha224")) {
            return new DOMSignatureMethod.SHA224withECDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256")) {
            return new DOMSignatureMethod.SHA256withECDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384")) {
            return new DOMSignatureMethod.SHA384withECDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512")) {
            return new DOMSignatureMethod.SHA512withECDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#ecdsa-ripemd160")) {
            return new DOMSignatureMethod.RIPEMD160withECDSA(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2021/04/xmldsig-more#eddsa-ed25519")) {
            return new DOMSignatureMethod.EDDSA_ED25519(signatureMethodParameterSpec);
        }
        if (string.equals("http://www.w3.org/2021/04/xmldsig-more#eddsa-ed448")) {
            return new DOMSignatureMethod.EDDSA_ED448(signatureMethodParameterSpec);
        }
        throw new NoSuchAlgorithmException("unsupported algorithm");
    }

    @Override
    public Transform newTransform(String string, TransformParameterSpec transformParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (this.getProvider() == null) {
            transformService = TransformService.getInstance(string, "DOM");
        } else {
            try {
                transformService = TransformService.getInstance(string, "DOM", this.getProvider());
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                transformService = TransformService.getInstance(string, "DOM");
            }
        }
        transformService.init(transformParameterSpec);
        return new DOMTransform(transformService);
    }

    @Override
    public Transform newTransform(String string, XMLStructure xMLStructure) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (this.getProvider() == null) {
            transformService = TransformService.getInstance(string, "DOM");
        } else {
            try {
                transformService = TransformService.getInstance(string, "DOM", this.getProvider());
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                transformService = TransformService.getInstance(string, "DOM");
            }
        }
        if (xMLStructure == null) {
            transformService.init(null);
        } else {
            transformService.init(xMLStructure, null);
        }
        return new DOMTransform(transformService);
    }

    @Override
    public CanonicalizationMethod newCanonicalizationMethod(String string, C14NMethodParameterSpec c14NMethodParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (this.getProvider() == null) {
            transformService = TransformService.getInstance(string, "DOM");
        } else {
            try {
                transformService = TransformService.getInstance(string, "DOM", this.getProvider());
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                transformService = TransformService.getInstance(string, "DOM");
            }
        }
        transformService.init(c14NMethodParameterSpec);
        return new DOMCanonicalizationMethod(transformService);
    }

    @Override
    public CanonicalizationMethod newCanonicalizationMethod(String string, XMLStructure xMLStructure) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (this.getProvider() == null) {
            transformService = TransformService.getInstance(string, "DOM");
        } else {
            try {
                transformService = TransformService.getInstance(string, "DOM", this.getProvider());
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                transformService = TransformService.getInstance(string, "DOM");
            }
        }
        if (xMLStructure == null) {
            transformService.init(null);
        } else {
            transformService.init(xMLStructure, null);
        }
        return new DOMCanonicalizationMethod(transformService);
    }

    @Override
    public URIDereferencer getURIDereferencer() {
        return DOMURIDereferencer.INSTANCE;
    }

    private static class UnmarshalContext
    extends DOMCryptoContext {
        UnmarshalContext() {
        }
    }
}

