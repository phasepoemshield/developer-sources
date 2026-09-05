/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureECDSA;
import com.sun.org.apache.xml.internal.security.utils.JavaUtils;
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
import java.security.interfaces.DSAKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMHMACSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMSignedInfo;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Element;
import sun.security.util.KeyUtil;

public abstract class DOMSignatureMethod
extends AbstractDOMSignatureMethod {
    private static final String DOM_SIGNATURE_PROVIDER = "org.jcp.xml.dsig.internal.dom.SignatureProvider";
    private static final Logger LOG = LoggerFactory.getLogger(DOMSignatureMethod.class);
    private SignatureMethodParameterSpec params;
    private Signature signature;
    static final String RSA_SHA224 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha224";
    static final String RSA_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    static final String RSA_SHA384 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384";
    static final String RSA_SHA512 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512";
    static final String RSA_RIPEMD160 = "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160";
    static final String ECDSA_SHA1 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1";
    static final String ECDSA_SHA224 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha224";
    static final String ECDSA_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256";
    static final String ECDSA_SHA384 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384";
    static final String ECDSA_SHA512 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512";
    static final String DSA_SHA256 = "http://www.w3.org/2009/xmldsig11#dsa-sha256";
    static final String ED25519 = "http://www.w3.org/2021/04/xmldsig-more#eddsa-ed25519";
    static final String ED448 = "http://www.w3.org/2021/04/xmldsig-more#eddsa-ed448";
    static final String ECDSA_RIPEMD160 = "http://www.w3.org/2007/05/xmldsig-more#ecdsa-ripemd160";
    static final String RSA_SHA1_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha1-rsa-MGF1";
    static final String RSA_SHA224_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha224-rsa-MGF1";
    static final String RSA_SHA256_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha256-rsa-MGF1";
    static final String RSA_SHA384_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha384-rsa-MGF1";
    static final String RSA_SHA512_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha512-rsa-MGF1";
    static final String RSA_RIPEMD160_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#ripemd160-rsa-MGF1";
    static final String RSA_SHA3_224_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha3-224-rsa-MGF1";
    static final String RSA_SHA3_256_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha3-256-rsa-MGF1";
    static final String RSA_SHA3_384_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha3-384-rsa-MGF1";
    static final String RSA_SHA3_512_MGF1 = "http://www.w3.org/2007/05/xmldsig-more#sha3-512-rsa-MGF1";

    DOMSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof SignatureMethodParameterSpec)) {
            throw new InvalidAlgorithmParameterException("params must be of type SignatureMethodParameterSpec");
        }
        this.checkParams((SignatureMethodParameterSpec)algorithmParameterSpec);
        this.params = (SignatureMethodParameterSpec)algorithmParameterSpec;
    }

    DOMSignatureMethod(Element element) throws MarshalException {
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

    abstract byte[] postSignFormat(Key var1, byte[] var2) throws IOException;

    abstract byte[] preVerifyFormat(Key var1, byte[] var2) throws IOException;

    static SignatureMethod unmarshal(Element element) throws MarshalException {
        String string = DOMUtils.getAttributeValue(element, "Algorithm");
        if (string.equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1")) {
            return new SHA1withRSA(element);
        }
        if (string.equals(RSA_SHA224)) {
            return new SHA224withRSA(element);
        }
        if (string.equals(RSA_SHA256)) {
            return new SHA256withRSA(element);
        }
        if (string.equals(RSA_SHA384)) {
            return new SHA384withRSA(element);
        }
        if (string.equals(RSA_SHA512)) {
            return new SHA512withRSA(element);
        }
        if (string.equals(RSA_RIPEMD160)) {
            return new RIPEMD160withRSA(element);
        }
        if (string.equals(RSA_SHA1_MGF1)) {
            return new SHA1withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA224_MGF1)) {
            return new SHA224withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA256_MGF1)) {
            return new SHA256withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA384_MGF1)) {
            return new SHA384withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA512_MGF1)) {
            return new SHA512withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA3_224_MGF1)) {
            return new SHA3_224withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA3_256_MGF1)) {
            return new SHA3_256withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA3_384_MGF1)) {
            return new SHA3_384withRSAandMGF1(element);
        }
        if (string.equals(RSA_SHA3_512_MGF1)) {
            return new SHA3_512withRSAandMGF1(element);
        }
        if (string.equals("http://www.w3.org/2007/05/xmldsig-more#rsa-pss")) {
            return new DOMRSAPSSSignatureMethod.RSAPSS(element);
        }
        if (string.equals(RSA_RIPEMD160_MGF1)) {
            return new RIPEMD160withRSAandMGF1(element);
        }
        if (string.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1")) {
            return new SHA1withDSA(element);
        }
        if (string.equals(DSA_SHA256)) {
            return new SHA256withDSA(element);
        }
        if (string.equals(ECDSA_SHA1)) {
            return new SHA1withECDSA(element);
        }
        if (string.equals(ECDSA_SHA224)) {
            return new SHA224withECDSA(element);
        }
        if (string.equals(ECDSA_SHA256)) {
            return new SHA256withECDSA(element);
        }
        if (string.equals(ECDSA_SHA384)) {
            return new SHA384withECDSA(element);
        }
        if (string.equals(ECDSA_SHA512)) {
            return new SHA512withECDSA(element);
        }
        if (string.equals(ECDSA_RIPEMD160)) {
            return new RIPEMD160withECDSA(element);
        }
        if (string.equals("http://www.w3.org/2000/09/xmldsig#hmac-sha1")) {
            return new DOMHMACSignatureMethod.SHA1(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha224")) {
            return new DOMHMACSignatureMethod.SHA224(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256")) {
            return new DOMHMACSignatureMethod.SHA256(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384")) {
            return new DOMHMACSignatureMethod.SHA384(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512")) {
            return new DOMHMACSignatureMethod.SHA512(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160")) {
            return new DOMHMACSignatureMethod.RIPEMD160(element);
        }
        if (string.equals(ED25519)) {
            return new EDDSA_ED25519(element);
        }
        if (string.equals(ED448)) {
            return new EDDSA_ED448(element);
        }
        throw new MarshalException("unsupported SignatureMethod algorithm: " + string);
    }

    @Override
    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    Signature getSignature(Provider provider) throws NoSuchAlgorithmException {
        return provider == null ? Signature.getInstance(this.getJCAAlgorithm()) : Signature.getInstance(this.getJCAAlgorithm(), provider);
    }

    @Override
    boolean verify(Key key, SignedInfo signedInfo, byte[] byArray, XMLValidateContext xMLValidateContext) throws InvalidKeyException, SignatureException, XMLSignatureException {
        Object object;
        if (key == null || signedInfo == null || byArray == null) {
            throw new NullPointerException();
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("key must be PublicKey");
        }
        DOMSignatureMethod.checkKeySize(xMLValidateContext, key);
        if (this.signature == null) {
            object = (Provider)xMLValidateContext.getProperty(DOM_SIGNATURE_PROVIDER);
            try {
                this.signature = this.getSignature((Provider)object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new XMLSignatureException(noSuchAlgorithmException);
            }
        }
        this.signature.initVerify((PublicKey)key);
        LOG.debug("Signature provider: {}", this.signature.getProvider());
        LOG.debug("Verifying with key: {}", key);
        LOG.debug("JCA Algorithm: {}", this.getJCAAlgorithm());
        LOG.debug("Signature Bytes length: {}", byArray.length);
        try (SignerOutputStream signerOutputStream = new SignerOutputStream(this.signature);){
            ((DOMSignedInfo)signedInfo).canonicalize(xMLValidateContext, signerOutputStream);
            object = this.preVerifyFormat(key, byArray);
        }
        catch (IOException iOException) {
            throw new XMLSignatureException(iOException);
        }
        return this.signature.verify((byte[])object);
    }

    private static void checkKeySize(XMLCryptoContext xMLCryptoContext, Key key) throws XMLSignatureException {
        if (Utils.secureValidation(xMLCryptoContext)) {
            int n = KeyUtil.getKeySize(key);
            if (n == -1) {
                LOG.debug("Size for " + key.getAlgorithm() + " key cannot be determined");
                return;
            }
            if (Policy.restrictKey(key.getAlgorithm(), n)) {
                throw new XMLSignatureException(key.getAlgorithm() + " keys less than " + Policy.minKeySize(key.getAlgorithm()) + " bits are forbidden when secure validation is enabled");
            }
        }
    }

    @Override
    byte[] sign(Key key, SignedInfo signedInfo, XMLSignContext xMLSignContext) throws InvalidKeyException, XMLSignatureException {
        byte[] byArray;
        Object object;
        if (key == null || signedInfo == null) {
            throw new NullPointerException();
        }
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException("key must be PrivateKey");
        }
        DOMSignatureMethod.checkKeySize(xMLSignContext, key);
        if (this.signature == null) {
            object = (Provider)xMLSignContext.getProperty(DOM_SIGNATURE_PROVIDER);
            try {
                this.signature = this.getSignature((Provider)object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new XMLSignatureException(noSuchAlgorithmException);
            }
        }
        this.signature.initSign((PrivateKey)key);
        LOG.debug("Signature provider: {}", this.signature.getProvider());
        LOG.debug("JCA Algorithm: {}", this.getJCAAlgorithm());
        object = new SignerOutputStream(this.signature);
        try {
            ((DOMSignedInfo)signedInfo).canonicalize(xMLSignContext, (ByteArrayOutputStream)object);
            byArray = this.postSignFormat(key, this.signature.sign());
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
                throw new XMLSignatureException(exception);
            }
        }
        ((ByteArrayOutputStream)object).close();
        return byArray;
    }

    static final class SHA1withRSA
    extends AbstractRSASignatureMethod {
        SHA1withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA1withRSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA1withRSA";
        }
    }

    static final class SHA224withRSA
    extends AbstractRSASignatureMethod {
        SHA224withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA224withRSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA224;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA224withRSA";
        }
    }

    static final class SHA256withRSA
    extends AbstractRSASignatureMethod {
        SHA256withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA256withRSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA256;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA256withRSA";
        }
    }

    static final class SHA384withRSA
    extends AbstractRSASignatureMethod {
        SHA384withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA384withRSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA384;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA384withRSA";
        }
    }

    static final class SHA512withRSA
    extends AbstractRSASignatureMethod {
        SHA512withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA512withRSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA512;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA512withRSA";
        }
    }

    static final class RIPEMD160withRSA
    extends AbstractRSASignatureMethod {
        RIPEMD160withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        RIPEMD160withRSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_RIPEMD160;
        }

        @Override
        String getJCAAlgorithm() {
            return "RIPEMD160withRSA";
        }
    }

    static final class SHA1withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA1_MGF1_PARAMS = new PSSParameterSpec("SHA-1", "MGF1", MGF1ParameterSpec.SHA1, 20, 1);

        SHA1withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA1withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA1_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA1_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA1withRSAandMGF1";
        }
    }

    static final class SHA224withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA224_MGF1_PARAMS = new PSSParameterSpec("SHA-224", "MGF1", MGF1ParameterSpec.SHA224, 28, 1);

        SHA224withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA224withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA224_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA224_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA224withRSAandMGF1";
        }
    }

    static final class SHA256withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA256_MGF1_PARAMS = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);

        SHA256withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA256withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA256_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA256_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA256withRSAandMGF1";
        }
    }

    static final class SHA384withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA384_MGF1_PARAMS = new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1);

        SHA384withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA384withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA384_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA384_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA384withRSAandMGF1";
        }
    }

    static final class SHA512withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA512_MGF1_PARAMS = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);

        SHA512withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA512withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA512_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA512_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA512withRSAandMGF1";
        }
    }

    static final class SHA3_224withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA3_224_MGF1_PARAMS = new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1);

        SHA3_224withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_224withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA3_224_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA3_224_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA3-224withRSAandMGF1";
        }
    }

    static final class SHA3_256withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA3_256_MGF1_PARAMS = new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1);

        SHA3_256withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_256withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA3_256_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA3_256_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA3-256withRSAandMGF1";
        }
    }

    static final class SHA3_384withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA3_384_MGF1_PARAMS = new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1);

        SHA3_384withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_384withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA3_384_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA3_384_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA3-384withRSAandMGF1";
        }
    }

    static final class SHA3_512withRSAandMGF1
    extends AbstractRSAPSSSignatureMethod {
        private static final PSSParameterSpec SHA3_512_MGF1_PARAMS = new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1);

        SHA3_512withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_512withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA3_512_MGF1;
        }

        @Override
        public PSSParameterSpec getPSSParameterSpec() {
            return SHA3_512_MGF1_PARAMS;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA3-512withRSAandMGF1";
        }
    }

    static final class RIPEMD160withRSAandMGF1
    extends AbstractRSASignatureMethod {
        RIPEMD160withRSAandMGF1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        RIPEMD160withRSAandMGF1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_RIPEMD160_MGF1;
        }

        @Override
        String getJCAAlgorithm() {
            return "RIPEMD160withRSAandMGF1";
        }
    }

    static final class SHA1withDSA
    extends AbstractDSASignatureMethod {
        SHA1withDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA1withDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#dsa-sha1";
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA1withDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA1withDSA";
        }
    }

    static final class SHA256withDSA
    extends AbstractDSASignatureMethod {
        SHA256withDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA256withDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.DSA_SHA256;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA256withDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA256withDSA";
        }
    }

    static final class SHA1withECDSA
    extends AbstractECDSASignatureMethod {
        SHA1withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA1withECDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA1;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA1withECDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA1withECDSA";
        }
    }

    static final class SHA224withECDSA
    extends AbstractECDSASignatureMethod {
        SHA224withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA224withECDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA224;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA224withECDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA224withECDSA";
        }
    }

    static final class SHA256withECDSA
    extends AbstractECDSASignatureMethod {
        SHA256withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA256withECDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA256;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA256withECDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA256withECDSA";
        }
    }

    static final class SHA384withECDSA
    extends AbstractECDSASignatureMethod {
        SHA384withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA384withECDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA384;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA384withECDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA384withECDSA";
        }
    }

    static final class SHA512withECDSA
    extends AbstractECDSASignatureMethod {
        SHA512withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA512withECDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA512;
        }

        @Override
        String getJCAAlgorithm() {
            return "SHA512withECDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "SHA512withECDSA";
        }
    }

    static final class RIPEMD160withECDSA
    extends AbstractECDSASignatureMethod {
        RIPEMD160withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        RIPEMD160withECDSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_RIPEMD160;
        }

        @Override
        String getJCAAlgorithm() {
            return "RIPEMD160withECDSAinP1363Format";
        }

        @Override
        String getJCAFallbackAlgorithm() {
            return "RIPEMD160withECDSA";
        }
    }

    static final class EDDSA_ED25519
    extends AbstractEDDSASignatureMethod {
        EDDSA_ED25519(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        EDDSA_ED25519(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ED25519;
        }

        @Override
        String getJCAAlgorithm() {
            return "Ed25519";
        }
    }

    static final class EDDSA_ED448
    extends AbstractEDDSASignatureMethod {
        EDDSA_ED448(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        EDDSA_ED448(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMSignatureMethod.ED448;
        }

        @Override
        String getJCAAlgorithm() {
            return "Ed448";
        }
    }

    static abstract class AbstractEDDSASignatureMethod
    extends DOMSignatureMethod {
        AbstractEDDSASignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        AbstractEDDSASignatureMethod(Element element) throws MarshalException {
            super(element);
        }

        @Override
        byte[] postSignFormat(Key key, byte[] byArray) {
            return byArray;
        }

        @Override
        byte[] preVerifyFormat(Key key, byte[] byArray) {
            return byArray;
        }

        @Override
        AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.EDDSA;
        }
    }

    static abstract class AbstractECDSASignatureMethod
    extends AbstractP1363FormatSignatureMethod {
        AbstractECDSASignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        AbstractECDSASignatureMethod(Element element) throws MarshalException {
            super(element);
        }

        @Override
        byte[] postSignFormat(Key key, byte[] byArray) throws IOException {
            if (this.asn1) {
                int n = -1;
                if (key instanceof ECPrivateKey) {
                    ECPrivateKey eCPrivateKey = (ECPrivateKey)key;
                    n = (eCPrivateKey.getParams().getCurve().getField().getFieldSize() + 7) / 8;
                }
                return SignatureECDSA.convertASN1toXMLDSIG(byArray, n);
            }
            return byArray;
        }

        @Override
        byte[] preVerifyFormat(Key key, byte[] byArray) throws IOException {
            if (this.asn1) {
                return SignatureECDSA.convertXMLDSIGtoASN1(byArray);
            }
            return byArray;
        }

        @Override
        AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.ECDSA;
        }
    }

    static abstract class AbstractDSASignatureMethod
    extends AbstractP1363FormatSignatureMethod {
        AbstractDSASignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        AbstractDSASignatureMethod(Element element) throws MarshalException {
            super(element);
        }

        @Override
        byte[] postSignFormat(Key key, byte[] byArray) throws IOException {
            if (this.asn1) {
                int n = ((DSAKey)((Object)key)).getParams().getQ().bitLength();
                return JavaUtils.convertDsaASN1toXMLDSIG(byArray, n / 8);
            }
            return byArray;
        }

        @Override
        byte[] preVerifyFormat(Key key, byte[] byArray) throws IOException {
            if (this.asn1) {
                int n = ((DSAKey)((Object)key)).getParams().getQ().bitLength();
                return JavaUtils.convertDsaXMLDSIGtoASN1(byArray, n / 8);
            }
            return byArray;
        }

        @Override
        AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.DSA;
        }
    }

    static abstract class AbstractP1363FormatSignatureMethod
    extends DOMSignatureMethod {
        boolean asn1;

        AbstractP1363FormatSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        AbstractP1363FormatSignatureMethod(Element element) throws MarshalException {
            super(element);
        }

        abstract String getJCAFallbackAlgorithm();

        @Override
        Signature getSignature(Provider provider) throws NoSuchAlgorithmException {
            try {
                return provider == null ? Signature.getInstance(this.getJCAAlgorithm()) : Signature.getInstance(this.getJCAAlgorithm(), provider);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                Signature signature = provider == null ? Signature.getInstance(this.getJCAFallbackAlgorithm()) : Signature.getInstance(this.getJCAFallbackAlgorithm(), provider);
                this.asn1 = true;
                return signature;
            }
        }
    }

    static abstract class AbstractRSAPSSSignatureMethod
    extends AbstractRSASignatureMethod {
        AbstractRSAPSSSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        AbstractRSAPSSSignatureMethod(Element element) throws MarshalException {
            super(element);
        }

        public abstract PSSParameterSpec getPSSParameterSpec();

        @Override
        Signature getSignature(Provider provider) throws NoSuchAlgorithmException {
            try {
                Signature signature = provider == null ? Signature.getInstance("RSASSA-PSS") : Signature.getInstance("RSASSA-PSS", provider);
                try {
                    signature.setParameter(this.getPSSParameterSpec());
                }
                catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                    throw new NoSuchAlgorithmException("Should not happen", invalidAlgorithmParameterException);
                }
                return signature;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                return super.getSignature(provider);
            }
        }
    }

    static abstract class AbstractRSASignatureMethod
    extends DOMSignatureMethod {
        AbstractRSASignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        AbstractRSASignatureMethod(Element element) throws MarshalException {
            super(element);
        }

        @Override
        byte[] postSignFormat(Key key, byte[] byArray) {
            return byArray;
        }

        @Override
        byte[] preVerifyFormat(Key key, byte[] byArray) {
            return byArray;
        }

        @Override
        AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.RSA;
        }
    }
}

