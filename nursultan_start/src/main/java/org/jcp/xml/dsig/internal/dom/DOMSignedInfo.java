/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.xml.crypto.dsig.spec.RSAPSSParameterSpec
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureBaseRSA;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.org.apache.xml.internal.security.utils.UnsyncBufferedOutputStream;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Provider;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.spec.RSAPSSParameterSpec;
import org.jcp.xml.dsig.internal.dom.DOMCanonicalizationMethod;
import org.jcp.xml.dsig.internal.dom.DOMRSAPSSSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMReference;
import org.jcp.xml.dsig.internal.dom.DOMSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMSignedInfo
extends DOMStructure
implements SignedInfo {
    private static final Logger LOG = LoggerFactory.getLogger(DOMSignedInfo.class);
    private final List<Reference> references;
    private final CanonicalizationMethod canonicalizationMethod;
    private final SignatureMethod signatureMethod;
    private String id;
    private Document ownerDoc;
    private Element localSiElem;
    private InputStream canonData;

    public DOMSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List<? extends Reference> list) {
        if (canonicalizationMethod == null || signatureMethod == null || list == null) {
            throw new NullPointerException();
        }
        this.canonicalizationMethod = canonicalizationMethod;
        this.signatureMethod = signatureMethod;
        this.references = Collections.unmodifiableList(new ArrayList<Reference>(list));
        if (this.references.isEmpty()) {
            throw new IllegalArgumentException("list of references must contain at least one entry");
        }
        for (Reference reference : this.references) {
            if (reference instanceof Reference) continue;
            throw new ClassCastException("list of references contains an illegal " + String.valueOf(reference.getClass()));
        }
    }

    public DOMSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List<? extends Reference> list, String string) {
        this(canonicalizationMethod, signatureMethod, list);
        this.id = string;
    }

    public DOMSignedInfo(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        Object object;
        Object object2;
        String string;
        Object object3;
        Object object4;
        this.localSiElem = element;
        this.ownerDoc = element.getOwnerDocument();
        this.id = DOMUtils.getAttributeValue(element, "Id");
        Element element2 = DOMUtils.getFirstChildElement(element, "CanonicalizationMethod", "http://www.w3.org/2000/09/xmldsig#");
        this.canonicalizationMethod = new DOMCanonicalizationMethod(element2, xMLCryptoContext, provider);
        Element element3 = DOMUtils.getNextSiblingElement(element2, "SignatureMethod", "http://www.w3.org/2000/09/xmldsig#");
        this.signatureMethod = DOMSignatureMethod.unmarshal(element3);
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        String string2 = this.signatureMethod.getAlgorithm();
        if (bl && Policy.restrictAlg(string2)) {
            throw new MarshalException("It is forbidden to use algorithm " + string2 + " when secure validation is enabled");
        }
        if (bl && this.signatureMethod instanceof DOMRSAPSSSignatureMethod.RSAPSS && (object4 = this.signatureMethod.getParameterSpec()) instanceof RSAPSSParameterSpec) {
            try {
                object3 = ((RSAPSSParameterSpec)object4).getPSSParameterSpec();
                string = SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm.fromDigestAlgorithm(((PSSParameterSpec)object3).getDigestAlgorithm()).getXmlDigestAlgorithm();
                if (Policy.restrictAlg(string)) {
                    throw new MarshalException("It is forbidden to use algorithm " + string + " in PSS when secure validation is enabled");
                }
                object2 = ((PSSParameterSpec)object3).getMGFParameters();
                if (object2 instanceof MGF1ParameterSpec && Policy.restrictAlg((String)(object = SignatureBaseRSA.SignatureRSASSAPSS.DigestAlgorithm.fromDigestAlgorithm(((MGF1ParameterSpec)object2).getDigestAlgorithm()).getXmlDigestAlgorithm()))) {
                    throw new MarshalException("It is forbidden to use algorithm " + (String)object + " in MGF1 when secure validation is enabled");
                }
            }
            catch (XMLSignatureException xMLSignatureException) {
                // empty catch block
            }
        }
        object4 = new ArrayList(5);
        object3 = DOMUtils.getNextSiblingElement(element3, "Reference", "http://www.w3.org/2000/09/xmldsig#");
        ((ArrayList)object4).add(new DOMReference((Element)object3, xMLCryptoContext, provider));
        object3 = DOMUtils.getNextSiblingElement((Node)object3);
        while (object3 != null) {
            string = object3.getLocalName();
            object2 = object3.getNamespaceURI();
            if (!"Reference".equals(string) || !"http://www.w3.org/2000/09/xmldsig#".equals(object2)) {
                throw new MarshalException("Invalid element name: " + (String)object2 + ":" + string + ", expected Reference");
            }
            ((ArrayList)object4).add(new DOMReference((Element)object3, xMLCryptoContext, provider));
            if (bl && Policy.restrictNumReferences(((ArrayList)object4).size())) {
                object = "A maximum of " + Policy.maxReferences() + " references per Manifest are allowed when secure validation is enabled";
                throw new MarshalException((String)object);
            }
            object3 = DOMUtils.getNextSiblingElement((Node)object3);
        }
        this.references = Collections.unmodifiableList(object4);
    }

    @Override
    public CanonicalizationMethod getCanonicalizationMethod() {
        return this.canonicalizationMethod;
    }

    @Override
    public SignatureMethod getSignatureMethod() {
        return this.signatureMethod;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public List<Reference> getReferences() {
        return this.references;
    }

    @Override
    public InputStream getCanonicalizedData() {
        return this.canonData;
    }

    public void canonicalize(XMLCryptoContext xMLCryptoContext, ByteArrayOutputStream byteArrayOutputStream) throws javax.xml.crypto.dsig.XMLSignatureException {
        if (xMLCryptoContext == null) {
            throw new NullPointerException("context cannot be null");
        }
        DOMSubTreeData dOMSubTreeData = new DOMSubTreeData(this.localSiElem, true);
        try (UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(byteArrayOutputStream);){
            ((DOMCanonicalizationMethod)this.canonicalizationMethod).canonicalize(dOMSubTreeData, xMLCryptoContext, unsyncBufferedOutputStream);
            ((OutputStream)unsyncBufferedOutputStream).flush();
            byte[] byArray = byteArrayOutputStream.toByteArray();
            if (LOG.isDebugEnabled()) {
                LOG.debug("Canonicalized SignedInfo:");
                StringBuilder stringBuilder = new StringBuilder(byArray.length);
                for (byte by : byArray) {
                    stringBuilder.append((char)by);
                }
                LOG.debug(stringBuilder.toString());
                LOG.debug("Data to be signed/verified:" + XMLUtils.encodeToString(byArray));
            }
            this.canonData = new ByteArrayInputStream(byArray);
        }
        catch (TransformException transformException) {
            throw new javax.xml.crypto.dsig.XMLSignatureException(transformException);
        }
        catch (IOException iOException) {
            LOG.debug(iOException.getMessage(), iOException);
        }
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        this.ownerDoc = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(this.ownerDoc, "SignedInfo", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMCanonicalizationMethod dOMCanonicalizationMethod = (DOMCanonicalizationMethod)this.canonicalizationMethod;
        dOMCanonicalizationMethod.marshal(element, string, dOMCryptoContext);
        ((DOMStructure)((Object)this.signatureMethod)).marshal(element, string, dOMCryptoContext);
        for (Reference reference : this.references) {
            ((DOMReference)reference).marshal(element, string, dOMCryptoContext);
        }
        DOMUtils.setAttributeID(element, "Id", this.id);
        node.appendChild(element);
        this.localSiElem = element;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SignedInfo)) {
            return false;
        }
        SignedInfo signedInfo = (SignedInfo)object;
        boolean bl = this.id == null ? signedInfo.getId() == null : this.id.equals(signedInfo.getId());
        return this.canonicalizationMethod.equals(signedInfo.getCanonicalizationMethod()) && this.signatureMethod.equals(signedInfo.getSignatureMethod()) && this.references.equals(signedInfo.getReferences()) && bl;
    }

    public static List<Reference> getSignedInfoReferences(SignedInfo signedInfo) {
        return signedInfo.getReferences();
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        n = 31 * n + this.canonicalizationMethod.hashCode();
        n = 31 * n + this.signatureMethod.hashCode();
        n = 31 * n + this.references.hashCode();
        return n;
    }
}

