/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import org.jcp.xml.dsig.internal.dom.DOMCryptoBinary;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class DOMKeyValue<K extends PublicKey>
extends DOMStructure
implements KeyValue {
    private static final String XMLDSIG_11_XMLNS = "http://www.w3.org/2009/xmldsig11#";
    private final K publicKey;

    public DOMKeyValue(K k) throws KeyException {
        if (k == null) {
            throw new NullPointerException("key cannot be null");
        }
        this.publicKey = k;
    }

    public DOMKeyValue(Element element) throws MarshalException {
        this.publicKey = this.unmarshalKeyValue(element);
    }

    static KeyValue unmarshal(Element element) throws MarshalException {
        Element element2 = DOMUtils.getFirstChildElement(element);
        if (element2 == null) {
            throw new MarshalException("KeyValue must contain at least one type");
        }
        String string = element2.getNamespaceURI();
        if ("DSAKeyValue".equals(element2.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(string)) {
            return new DSA(element2);
        }
        if ("RSAKeyValue".equals(element2.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(string)) {
            return new RSA(element2);
        }
        if ("ECKeyValue".equals(element2.getLocalName()) && XMLDSIG_11_XMLNS.equals(string)) {
            return new EC(element2);
        }
        return new Unknown(element2);
    }

    @Override
    public PublicKey getPublicKey() throws KeyException {
        if (this.publicKey == null) {
            throw new KeyException("can't convert KeyValue to PublicKey");
        }
        return this.publicKey;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "KeyValue", "http://www.w3.org/2000/09/xmldsig#", string);
        this.marshalPublicKey(element, document, string, dOMCryptoContext);
        node.appendChild(element);
    }

    abstract void marshalPublicKey(Node var1, Document var2, String var3, DOMCryptoContext var4) throws MarshalException;

    abstract K unmarshalKeyValue(Element var1) throws MarshalException;

    private static PublicKey generatePublicKey(KeyFactory keyFactory, KeySpec keySpec) {
        try {
            return keyFactory.generatePublic(keySpec);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            return null;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof KeyValue)) {
            return false;
        }
        try {
            KeyValue keyValue = (KeyValue)object;
            if (this.publicKey == null ? keyValue.getPublicKey() != null : !this.publicKey.equals(keyValue.getPublicKey())) {
                return false;
            }
        }
        catch (KeyException keyException) {
            return false;
        }
        return true;
    }

    public static BigInteger decode(Element element) throws MarshalException {
        try {
            String string = element.getFirstChild().getNodeValue();
            return new BigInteger(1, XMLUtils.decode(string));
        }
        catch (Exception exception) {
            throw new MarshalException(exception);
        }
    }

    public int hashCode() {
        int n = 17;
        if (this.publicKey != null) {
            n = 31 * n + this.publicKey.hashCode();
        }
        return n;
    }

    private static BigInteger bigInt(String string) {
        return new BigInteger(string, 16);
    }

    static final class DSA
    extends DOMKeyValue<DSAPublicKey> {
        private DOMCryptoBinary p;
        private DOMCryptoBinary q;
        private DOMCryptoBinary g;
        private DOMCryptoBinary y;
        private KeyFactory dsakf;

        DSA(DSAPublicKey dSAPublicKey) throws KeyException {
            super(dSAPublicKey);
            DSAPublicKey dSAPublicKey2 = dSAPublicKey;
            DSAParams dSAParams = dSAPublicKey2.getParams();
            this.p = new DOMCryptoBinary(dSAParams.getP());
            this.q = new DOMCryptoBinary(dSAParams.getQ());
            this.g = new DOMCryptoBinary(dSAParams.getG());
            this.y = new DOMCryptoBinary(dSAPublicKey2.getY());
        }

        DSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        void marshalPublicKey(Node node, Document document, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            Element element = DOMUtils.createElement(document, "DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#", string);
            Element element2 = DOMUtils.createElement(document, "P", "http://www.w3.org/2000/09/xmldsig#", string);
            Element element3 = DOMUtils.createElement(document, "Q", "http://www.w3.org/2000/09/xmldsig#", string);
            Element element4 = DOMUtils.createElement(document, "G", "http://www.w3.org/2000/09/xmldsig#", string);
            Element element5 = DOMUtils.createElement(document, "Y", "http://www.w3.org/2000/09/xmldsig#", string);
            this.p.marshal(element2, string, dOMCryptoContext);
            this.q.marshal(element3, string, dOMCryptoContext);
            this.g.marshal(element4, string, dOMCryptoContext);
            this.y.marshal(element5, string, dOMCryptoContext);
            element.appendChild(element2);
            element.appendChild(element3);
            element.appendChild(element4);
            element.appendChild(element5);
            node.appendChild(element);
        }

        @Override
        DSAPublicKey unmarshalKeyValue(Element element) throws MarshalException {
            if (this.dsakf == null) {
                try {
                    this.dsakf = KeyFactory.getInstance("DSA");
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    throw new RuntimeException("unable to create DSA KeyFactory: " + noSuchAlgorithmException.getMessage());
                }
            }
            Element element2 = DOMUtils.getFirstChildElement(element, "P", "http://www.w3.org/2000/09/xmldsig#");
            BigInteger bigInteger = DSA.decode(element2);
            element2 = DOMUtils.getNextSiblingElement(element2, "Q", "http://www.w3.org/2000/09/xmldsig#");
            BigInteger bigInteger2 = DSA.decode(element2);
            element2 = DOMUtils.getNextSiblingElement(element2, "G", "http://www.w3.org/2000/09/xmldsig#");
            BigInteger bigInteger3 = DSA.decode(element2);
            element2 = DOMUtils.getNextSiblingElement(element2, "Y", "http://www.w3.org/2000/09/xmldsig#");
            BigInteger bigInteger4 = DSA.decode(element2);
            DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(bigInteger4, bigInteger, bigInteger2, bigInteger3);
            return (DSAPublicKey)DOMKeyValue.generatePublicKey(this.dsakf, dSAPublicKeySpec);
        }
    }

    static final class RSA
    extends DOMKeyValue<RSAPublicKey> {
        private DOMCryptoBinary modulus;
        private DOMCryptoBinary exponent;
        private KeyFactory rsakf;

        RSA(RSAPublicKey rSAPublicKey) throws KeyException {
            super(rSAPublicKey);
            RSAPublicKey rSAPublicKey2 = rSAPublicKey;
            this.exponent = new DOMCryptoBinary(rSAPublicKey2.getPublicExponent());
            this.modulus = new DOMCryptoBinary(rSAPublicKey2.getModulus());
        }

        RSA(Element element) throws MarshalException {
            super(element);
        }

        @Override
        void marshalPublicKey(Node node, Document document, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            Element element = DOMUtils.createElement(document, "RSAKeyValue", "http://www.w3.org/2000/09/xmldsig#", string);
            Element element2 = DOMUtils.createElement(document, "Modulus", "http://www.w3.org/2000/09/xmldsig#", string);
            Element element3 = DOMUtils.createElement(document, "Exponent", "http://www.w3.org/2000/09/xmldsig#", string);
            this.modulus.marshal(element2, string, dOMCryptoContext);
            this.exponent.marshal(element3, string, dOMCryptoContext);
            element.appendChild(element2);
            element.appendChild(element3);
            node.appendChild(element);
        }

        @Override
        RSAPublicKey unmarshalKeyValue(Element element) throws MarshalException {
            if (this.rsakf == null) {
                try {
                    this.rsakf = KeyFactory.getInstance("RSA");
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    throw new RuntimeException("unable to create RSA KeyFactory: " + noSuchAlgorithmException.getMessage());
                }
            }
            Element element2 = DOMUtils.getFirstChildElement(element, "Modulus", "http://www.w3.org/2000/09/xmldsig#");
            BigInteger bigInteger = RSA.decode(element2);
            Element element3 = DOMUtils.getNextSiblingElement(element2, "Exponent", "http://www.w3.org/2000/09/xmldsig#");
            BigInteger bigInteger2 = RSA.decode(element3);
            RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigInteger, bigInteger2);
            return (RSAPublicKey)DOMKeyValue.generatePublicKey(this.rsakf, rSAPublicKeySpec);
        }
    }

    static final class EC
    extends DOMKeyValue<ECPublicKey> {
        private byte[] ecPublicKey;
        private KeyFactory eckf;
        private ECParameterSpec ecParams;
        private static final Curve SECP256R1 = EC.initializeCurve("secp256r1 [NIST P-256, X9.62 prime256v1]", "1.2.840.10045.3.1.7", "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", "5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", 1);
        private static final Curve SECP384R1 = EC.initializeCurve("secp384r1 [NIST P-384]", "1.3.132.0.34", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", "AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", "3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973", 1);
        private static final Curve SECP521R1 = EC.initializeCurve("secp521r1 [NIST P-521]", "1.3.132.0.35", "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC", "0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00", "00C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66", "011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650", "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409", 1);

        private static Curve initializeCurve(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int n) {
            BigInteger bigInteger = DOMKeyValue.bigInt(string3);
            ECFieldFp eCFieldFp = new ECFieldFp(bigInteger);
            EllipticCurve ellipticCurve = new EllipticCurve(eCFieldFp, DOMKeyValue.bigInt(string4), DOMKeyValue.bigInt(string5));
            ECPoint eCPoint = new ECPoint(DOMKeyValue.bigInt(string6), DOMKeyValue.bigInt(string7));
            return new Curve(string, string2, ellipticCurve, eCPoint, DOMKeyValue.bigInt(string8), n);
        }

        EC(ECPublicKey eCPublicKey) throws KeyException {
            super(eCPublicKey);
            ECPoint eCPoint = eCPublicKey.getW();
            this.ecParams = eCPublicKey.getParams();
            this.ecPublicKey = EC.encodePoint(eCPoint, this.ecParams.getCurve());
        }

        EC(Element element) throws MarshalException {
            super(element);
        }

        private static ECPoint decodePoint(byte[] byArray, EllipticCurve ellipticCurve) throws IOException {
            if (byArray.length == 0 || byArray[0] != 4) {
                throw new IOException("Only uncompressed point format supported");
            }
            int n = (byArray.length - 1) / 2;
            if (n != ellipticCurve.getField().getFieldSize() + 7 >> 3) {
                throw new IOException("Point does not match field size");
            }
            byte[] byArray2 = Arrays.copyOfRange(byArray, 1, 1 + n);
            byte[] byArray3 = Arrays.copyOfRange(byArray, n + 1, n + 1 + n);
            return new ECPoint(new BigInteger(1, byArray2), new BigInteger(1, byArray3));
        }

        private static byte[] encodePoint(ECPoint eCPoint, EllipticCurve ellipticCurve) {
            int n = ellipticCurve.getField().getFieldSize() + 7 >> 3;
            byte[] byArray = EC.trimZeroes(eCPoint.getAffineX().toByteArray());
            byte[] byArray2 = EC.trimZeroes(eCPoint.getAffineY().toByteArray());
            if (byArray.length > n || byArray2.length > n) {
                throw new RuntimeException("Point coordinates do not match field size");
            }
            byte[] byArray3 = new byte[1 + (n << 1)];
            byArray3[0] = 4;
            System.arraycopy(byArray, 0, byArray3, n - byArray.length + 1, byArray.length);
            System.arraycopy(byArray2, 0, byArray3, byArray3.length - byArray2.length, byArray2.length);
            return byArray3;
        }

        private static byte[] trimZeroes(byte[] byArray) {
            int n;
            for (n = 0; n < byArray.length - 1 && byArray[n] == 0; ++n) {
            }
            if (n == 0) {
                return byArray;
            }
            return Arrays.copyOfRange(byArray, n, byArray.length);
        }

        private static String getCurveOid(ECParameterSpec eCParameterSpec) {
            Curve curve;
            if (EC.matchCurve(eCParameterSpec, SECP256R1)) {
                curve = SECP256R1;
            } else if (EC.matchCurve(eCParameterSpec, SECP384R1)) {
                curve = SECP384R1;
            } else if (EC.matchCurve(eCParameterSpec, SECP521R1)) {
                curve = SECP521R1;
            } else {
                return null;
            }
            return curve.getObjectId();
        }

        private static boolean matchCurve(ECParameterSpec eCParameterSpec, Curve curve) {
            int n = eCParameterSpec.getCurve().getField().getFieldSize();
            return curve.getCurve().getField().getFieldSize() == n && curve.getCurve().equals(eCParameterSpec.getCurve()) && curve.getGenerator().equals(eCParameterSpec.getGenerator()) && curve.getOrder().equals(eCParameterSpec.getOrder()) && curve.getCofactor() == eCParameterSpec.getCofactor();
        }

        @Override
        void marshalPublicKey(Node node, Document document, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            String string2 = DOMUtils.getNSPrefix(dOMCryptoContext, DOMKeyValue.XMLDSIG_11_XMLNS);
            Element element = DOMUtils.createElement(document, "ECKeyValue", DOMKeyValue.XMLDSIG_11_XMLNS, string2);
            Element element2 = DOMUtils.createElement(document, "NamedCurve", DOMKeyValue.XMLDSIG_11_XMLNS, string2);
            Element element3 = DOMUtils.createElement(document, "PublicKey", DOMKeyValue.XMLDSIG_11_XMLNS, string2);
            String string3 = EC.getCurveOid(this.ecParams);
            if (string3 == null) {
                throw new MarshalException("Invalid ECParameterSpec");
            }
            DOMUtils.setAttribute(element2, "URI", "urn:oid:" + string3);
            String string4 = string2 == null || string2.length() == 0 ? "xmlns" : "xmlns:" + string2;
            element2.setAttributeNS("http://www.w3.org/2000/xmlns/", string4, DOMKeyValue.XMLDSIG_11_XMLNS);
            element.appendChild(element2);
            String string5 = XMLUtils.encodeToString(this.ecPublicKey);
            element3.appendChild(DOMUtils.getOwnerDocument(element3).createTextNode(string5));
            element.appendChild(element3);
            node.appendChild(element);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        ECPublicKey unmarshalKeyValue(Element element) throws MarshalException {
            if (this.eckf == null) {
                try {
                    this.eckf = KeyFactory.getInstance("EC");
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    throw new RuntimeException("unable to create EC KeyFactory: " + noSuchAlgorithmException.getMessage());
                }
            }
            ECParameterSpec eCParameterSpec = null;
            Element element2 = DOMUtils.getFirstChildElement(element);
            if (element2 == null) {
                throw new MarshalException("KeyValue must contain at least one type");
            }
            if ("ECParameters".equals(element2.getLocalName()) && DOMKeyValue.XMLDSIG_11_XMLNS.equals(element2.getNamespaceURI())) {
                throw new UnsupportedOperationException("ECParameters not supported");
            }
            if (!"NamedCurve".equals(element2.getLocalName()) || !DOMKeyValue.XMLDSIG_11_XMLNS.equals(element2.getNamespaceURI())) throw new MarshalException("Invalid ECKeyValue");
            Object object = DOMUtils.getAttributeValue(element2, "URI");
            if (!((String)object).startsWith("urn:oid:")) throw new MarshalException("Invalid NamedCurve URI");
            Object object2 = ((String)object).substring("urn:oid:".length());
            eCParameterSpec = EC.getECParameterSpec((String)object2);
            if (eCParameterSpec == null) {
                throw new MarshalException("Invalid curve OID");
            }
            element2 = DOMUtils.getNextSiblingElement(element2, "PublicKey", DOMKeyValue.XMLDSIG_11_XMLNS);
            object = null;
            try {
                object2 = XMLUtils.getFullTextChildrenFromNode(element2);
                object = EC.decodePoint(XMLUtils.decode((String)object2), eCParameterSpec.getCurve());
            }
            catch (IOException iOException) {
                throw new MarshalException("Invalid EC Point", iOException);
            }
            object2 = new ECPublicKeySpec((ECPoint)object, eCParameterSpec);
            return (ECPublicKey)DOMKeyValue.generatePublicKey(this.eckf, (KeySpec)object2);
        }

        private static ECParameterSpec getECParameterSpec(String string) {
            if (string.equals(SECP256R1.getObjectId())) {
                return SECP256R1;
            }
            if (string.equals(SECP384R1.getObjectId())) {
                return SECP384R1;
            }
            if (string.equals(SECP521R1.getObjectId())) {
                return SECP521R1;
            }
            return null;
        }

        static final class Curve
        extends ECParameterSpec {
            private final String name;
            private final String oid;

            Curve(String string, String string2, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, int n) {
                super(ellipticCurve, eCPoint, bigInteger, n);
                this.name = string;
                this.oid = string2;
            }

            private String getName() {
                return this.name;
            }

            private String getObjectId() {
                return this.oid;
            }
        }
    }

    static final class Unknown
    extends DOMKeyValue<PublicKey> {
        private javax.xml.crypto.dom.DOMStructure externalPublicKey;

        Unknown(Element element) throws MarshalException {
            super(element);
        }

        @Override
        PublicKey unmarshalKeyValue(Element element) throws MarshalException {
            this.externalPublicKey = new javax.xml.crypto.dom.DOMStructure(element);
            return null;
        }

        @Override
        void marshalPublicKey(Node node, Document document, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            node.appendChild(this.externalPublicKey.getNode());
        }
    }
}

