/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class DOMDigestMethod
extends DOMStructure
implements DigestMethod {
    static final String SHA224 = "http://www.w3.org/2001/04/xmldsig-more#sha224";
    static final String SHA384 = "http://www.w3.org/2001/04/xmldsig-more#sha384";
    static final String WHIRLPOOL = "http://www.w3.org/2007/05/xmldsig-more#whirlpool";
    static final String SHA3_224 = "http://www.w3.org/2007/05/xmldsig-more#sha3-224";
    static final String SHA3_256 = "http://www.w3.org/2007/05/xmldsig-more#sha3-256";
    static final String SHA3_384 = "http://www.w3.org/2007/05/xmldsig-more#sha3-384";
    static final String SHA3_512 = "http://www.w3.org/2007/05/xmldsig-more#sha3-512";
    private DigestMethodParameterSpec params;

    DOMDigestMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof DigestMethodParameterSpec)) {
            throw new InvalidAlgorithmParameterException("params must be of type DigestMethodParameterSpec");
        }
        this.checkParams((DigestMethodParameterSpec)algorithmParameterSpec);
        this.params = (DigestMethodParameterSpec)algorithmParameterSpec;
    }

    DOMDigestMethod(Element element) throws MarshalException {
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

    static DigestMethod unmarshal(Element element) throws MarshalException {
        String string = DOMUtils.getAttributeValue(element, "Algorithm");
        if (string.equals("http://www.w3.org/2000/09/xmldsig#sha1")) {
            return new SHA1(element);
        }
        if (string.equals(SHA224)) {
            return new SHA224(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmlenc#sha256")) {
            return new SHA256(element);
        }
        if (string.equals(SHA384)) {
            return new SHA384(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmlenc#sha512")) {
            return new SHA512(element);
        }
        if (string.equals("http://www.w3.org/2001/04/xmlenc#ripemd160")) {
            return new RIPEMD160(element);
        }
        if (string.equals(WHIRLPOOL)) {
            return new WHIRLPOOL(element);
        }
        if (string.equals(SHA3_224)) {
            return new SHA3_224(element);
        }
        if (string.equals(SHA3_256)) {
            return new SHA3_256(element);
        }
        if (string.equals(SHA3_384)) {
            return new SHA3_384(element);
        }
        if (string.equals(SHA3_512)) {
            return new SHA3_512(element);
        }
        throw new MarshalException("unsupported DigestMethod algorithm: " + string);
    }

    void checkParams(DigestMethodParameterSpec digestMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (digestMethodParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("no parameters should be specified for the " + this.getMessageDigestAlgorithm() + " DigestMethod algorithm");
        }
    }

    @Override
    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    DigestMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        throw new MarshalException("no parameters should be specified for the " + this.getMessageDigestAlgorithm() + " DigestMethod algorithm");
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "DigestMethod", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttribute(element, "Algorithm", this.getAlgorithm());
        if (this.params != null) {
            this.marshalParams(element, string);
        }
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof DigestMethod)) {
            return false;
        }
        DigestMethod digestMethod = (DigestMethod)object;
        boolean bl = this.params == null ? digestMethod.getParameterSpec() == null : this.params.equals(digestMethod.getParameterSpec());
        return this.getAlgorithm().equals(digestMethod.getAlgorithm()) && bl;
    }

    public int hashCode() {
        int n = 17;
        if (this.params != null) {
            n = 31 * n + this.params.hashCode();
        }
        n = 31 * n + this.getAlgorithm().hashCode();
        return n;
    }

    void marshalParams(Element element, String string) throws MarshalException {
        throw new MarshalException("no parameters should be specified for the " + this.getMessageDigestAlgorithm() + " DigestMethod algorithm");
    }

    abstract String getMessageDigestAlgorithm();

    static final class SHA1
    extends DOMDigestMethod {
        SHA1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA1(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#sha1";
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA-1";
        }
    }

    static final class SHA224
    extends DOMDigestMethod {
        SHA224(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA224(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.SHA224;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA-224";
        }
    }

    static final class SHA256
    extends DOMDigestMethod {
        SHA256(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA256(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmlenc#sha256";
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA-256";
        }
    }

    static final class SHA384
    extends DOMDigestMethod {
        SHA384(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA384(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.SHA384;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA-384";
        }
    }

    static final class SHA512
    extends DOMDigestMethod {
        SHA512(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA512(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmlenc#sha512";
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA-512";
        }
    }

    static final class RIPEMD160
    extends DOMDigestMethod {
        RIPEMD160(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        RIPEMD160(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmlenc#ripemd160";
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "RIPEMD160";
        }
    }

    static final class WHIRLPOOL
    extends DOMDigestMethod {
        WHIRLPOOL(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        WHIRLPOOL(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.WHIRLPOOL;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "WHIRLPOOL";
        }
    }

    static final class SHA3_224
    extends DOMDigestMethod {
        SHA3_224(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_224(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.SHA3_224;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA3-224";
        }
    }

    static final class SHA3_256
    extends DOMDigestMethod {
        SHA3_256(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_256(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.SHA3_256;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA3-256";
        }
    }

    static final class SHA3_384
    extends DOMDigestMethod {
        SHA3_384(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_384(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.SHA3_384;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA3-384";
        }
    }

    static final class SHA3_512
    extends DOMDigestMethod {
        SHA3_512(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        SHA3_512(Element element) throws MarshalException {
            super(element);
        }

        @Override
        public String getAlgorithm() {
            return DOMDigestMethod.SHA3_512;
        }

        @Override
        String getMessageDigestAlgorithm() {
            return "SHA3-512";
        }
    }
}

