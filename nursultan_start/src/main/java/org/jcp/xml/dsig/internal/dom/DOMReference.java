/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.c14n.CanonicalizationException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.utils.UnsyncBufferedOutputStream;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NodeSetData;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import org.jcp.xml.dsig.internal.DigesterOutputStream;
import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.jcp.xml.dsig.internal.dom.DOMDigestMethod;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.jcp.xml.dsig.internal.dom.DOMTransform;
import org.jcp.xml.dsig.internal.dom.DOMURIDereferencer;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMReference
extends DOMStructure
implements Reference,
DOMURIReference {
    public static final int MAXIMUM_TRANSFORM_COUNT = 5;
    private static boolean useC14N11 = AccessController.doPrivileged(() -> Boolean.getBoolean("com.sun.org.apache.xml.internal.security.useC14N11"));
    private static final Logger LOG = LoggerFactory.getLogger(DOMReference.class);
    private final DigestMethod digestMethod;
    private final String id;
    private final List<Transform> transforms;
    private List<Transform> allTransforms;
    private final Data appliedTransformData;
    private Attr here;
    private final String uri;
    private final String type;
    private byte[] digestValue;
    private byte[] calcDigestValue;
    private Element refElem;
    private boolean digested = false;
    private boolean validated = false;
    private boolean validationStatus;
    private Data derefData;
    private InputStream dis;
    private MessageDigest md;
    private Provider provider;

    public DOMReference(String string, String string2, DigestMethod digestMethod, List<? extends Transform> list, String string3, Provider provider) {
        this(string, string2, digestMethod, null, null, list, string3, null, provider);
    }

    public DOMReference(String string, String string2, DigestMethod digestMethod, List<? extends Transform> list, Data data, List<? extends Transform> list2, String string3, Provider provider) {
        this(string, string2, digestMethod, list, data, list2, string3, null, provider);
    }

    public DOMReference(String string, String string2, DigestMethod digestMethod, List<? extends Transform> list, Data data, List<? extends Transform> list2, String string3, byte[] byArray, Provider provider) {
        int n;
        int n2;
        if (digestMethod == null) {
            throw new NullPointerException("DigestMethod must be non-null");
        }
        if (list == null) {
            this.allTransforms = new ArrayList<Transform>();
        } else {
            this.allTransforms = new ArrayList<Transform>(list);
            n2 = this.allTransforms.size();
            for (n = 0; n < n2; ++n) {
                if (this.allTransforms.get(n) instanceof Transform) continue;
                throw new ClassCastException("appliedTransforms[" + n + "] is not a valid type");
            }
        }
        if (list2 == null) {
            this.transforms = Collections.emptyList();
        } else {
            this.transforms = new ArrayList<Transform>(list2);
            n2 = this.transforms.size();
            for (n = 0; n < n2; ++n) {
                if (this.transforms.get(n) instanceof Transform) continue;
                throw new ClassCastException("transforms[" + n + "] is not a valid type");
            }
            this.allTransforms.addAll(this.transforms);
        }
        this.digestMethod = digestMethod;
        this.uri = string;
        if (string != null && !string.isEmpty()) {
            try {
                new URI(string);
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new IllegalArgumentException(uRISyntaxException.getMessage());
            }
        }
        this.type = string2;
        this.id = string3;
        if (byArray != null) {
            this.digestValue = (byte[])byArray.clone();
            this.digested = true;
        }
        this.appliedTransformData = data;
        this.provider = provider;
    }

    public DOMReference(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        Object object;
        String string;
        Element element2;
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        Element element3 = DOMUtils.getFirstChildElement(element);
        ArrayList<Transform> arrayList = new ArrayList<Transform>(5);
        if ("Transforms".equals(element3.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(element3.getNamespaceURI())) {
            element2 = DOMUtils.getFirstChildElement(element3, "Transform", "http://www.w3.org/2000/09/xmldsig#");
            arrayList.add(new DOMTransform(element2, xMLCryptoContext, provider));
            element2 = DOMUtils.getNextSiblingElement(element2);
            while (element2 != null) {
                string = element2.getLocalName();
                object = element2.getNamespaceURI();
                if (!"Transform".equals(string) || !"http://www.w3.org/2000/09/xmldsig#".equals(object)) {
                    throw new MarshalException("Invalid element name: " + string + ", expected Transform");
                }
                arrayList.add(new DOMTransform(element2, xMLCryptoContext, provider));
                if (bl && Policy.restrictNumTransforms(arrayList.size())) {
                    String string2 = "A maximum of " + Policy.maxTransforms() + " transforms per Reference are allowed when secure validation is enabled";
                    throw new MarshalException(string2);
                }
                element2 = DOMUtils.getNextSiblingElement(element2);
            }
            element3 = DOMUtils.getNextSiblingElement(element3);
        }
        if (!"DigestMethod".equals(element3.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(element3.getNamespaceURI())) {
            throw new MarshalException("Invalid element name: " + element3.getLocalName() + ", expected DigestMethod");
        }
        element2 = element3;
        this.digestMethod = DOMDigestMethod.unmarshal(element2);
        string = this.digestMethod.getAlgorithm();
        if (bl && Policy.restrictAlg(string)) {
            throw new MarshalException("It is forbidden to use algorithm " + string + " when secure validation is enabled");
        }
        object = DOMUtils.getNextSiblingElement(element2, "DigestValue", "http://www.w3.org/2000/09/xmldsig#");
        String string3 = XMLUtils.getFullTextChildrenFromNode((Node)object);
        this.digestValue = XMLUtils.decode(string3);
        if (DOMUtils.getNextSiblingElement((Node)object) != null) {
            throw new MarshalException("Unexpected element after DigestValue element");
        }
        this.uri = DOMUtils.getAttributeValue(element, "URI");
        Attr attr = element.getAttributeNodeNS(null, "Id");
        if (attr != null) {
            this.id = attr.getValue();
            element.setIdAttributeNode(attr, true);
        } else {
            this.id = null;
        }
        this.type = DOMUtils.getAttributeValue(element, "Type");
        this.here = element.getAttributeNodeNS(null, "URI");
        this.refElem = element;
        this.transforms = arrayList;
        this.allTransforms = this.transforms;
        this.appliedTransformData = null;
        this.provider = provider;
    }

    @Override
    public DigestMethod getDigestMethod() {
        return this.digestMethod;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getURI() {
        return this.uri;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public List<Transform> getTransforms() {
        return Collections.unmodifiableList(this.allTransforms);
    }

    @Override
    public byte[] getDigestValue() {
        return this.digestValue == null ? null : (byte[])this.digestValue.clone();
    }

    @Override
    public byte[] getCalculatedDigestValue() {
        return this.calcDigestValue == null ? null : (byte[])this.calcDigestValue.clone();
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element element;
        LOG.debug("Marshalling Reference");
        Document document = DOMUtils.getOwnerDocument(node);
        this.refElem = DOMUtils.createElement(document, "Reference", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttributeID(this.refElem, "Id", this.id);
        DOMUtils.setAttribute(this.refElem, "URI", this.uri);
        DOMUtils.setAttribute(this.refElem, "Type", this.type);
        if (!this.allTransforms.isEmpty()) {
            element = DOMUtils.createElement(document, "Transforms", "http://www.w3.org/2000/09/xmldsig#", string);
            this.refElem.appendChild(element);
            for (Transform transform : this.allTransforms) {
                ((DOMStructure)((Object)transform)).marshal(element, string, dOMCryptoContext);
            }
        }
        ((DOMDigestMethod)this.digestMethod).marshal(this.refElem, string, dOMCryptoContext);
        LOG.debug("Adding digestValueElem");
        element = DOMUtils.createElement(document, "DigestValue", "http://www.w3.org/2000/09/xmldsig#", string);
        if (this.digestValue != null) {
            element.appendChild(document.createTextNode(XMLUtils.encodeToString(this.digestValue)));
        }
        this.refElem.appendChild(element);
        node.appendChild(this.refElem);
        this.here = this.refElem.getAttributeNodeNS(null, "URI");
    }

    public void digest(XMLSignContext xMLSignContext) throws XMLSignatureException {
        Data data = null;
        data = this.appliedTransformData == null ? this.dereference(xMLSignContext) : this.appliedTransformData;
        this.digestValue = this.transform(data, xMLSignContext);
        String string = XMLUtils.encodeToString(this.digestValue);
        LOG.debug("Reference object uri = {}", this.uri);
        Element element = DOMUtils.getLastChildElement(this.refElem);
        if (element == null) {
            throw new XMLSignatureException("DigestValue element expected");
        }
        DOMUtils.removeAllChildren(element);
        element.appendChild(this.refElem.getOwnerDocument().createTextNode(string));
        this.digested = true;
        LOG.debug("Reference digesting completed");
    }

    @Override
    public boolean validate(XMLValidateContext xMLValidateContext) throws XMLSignatureException {
        if (xMLValidateContext == null) {
            throw new NullPointerException("validateContext cannot be null");
        }
        if (this.validated) {
            return this.validationStatus;
        }
        Data data = this.dereference(xMLValidateContext);
        this.calcDigestValue = this.transform(data, xMLValidateContext);
        if (LOG.isDebugEnabled()) {
            LOG.debug("Expected digest: " + XMLUtils.encodeToString(this.digestValue));
            LOG.debug("Actual digest: " + XMLUtils.encodeToString(this.calcDigestValue));
        }
        this.validationStatus = Arrays.equals(this.digestValue, this.calcDigestValue);
        this.validated = true;
        return this.validationStatus;
    }

    @Override
    public Data getDereferencedData() {
        return this.derefData;
    }

    @Override
    public InputStream getDigestInputStream() {
        return this.dis;
    }

    private Data dereference(XMLCryptoContext xMLCryptoContext) throws XMLSignatureException {
        Data data = null;
        URIDereferencer uRIDereferencer = xMLCryptoContext.getURIDereferencer();
        if (uRIDereferencer == null) {
            uRIDereferencer = DOMURIDereferencer.INSTANCE;
        }
        try {
            data = uRIDereferencer.dereference(this, xMLCryptoContext);
            LOG.debug("URIDereferencer class name: {}", uRIDereferencer.getClass().getName());
            LOG.debug("Data class name: {}", data.getClass().getName());
        }
        catch (URIReferenceException uRIReferenceException) {
            throw new XMLSignatureException(uRIReferenceException);
        }
        return data;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private byte[] transform(Data data, XMLCryptoContext xMLCryptoContext) throws XMLSignatureException {
        DigesterOutputStream digesterOutputStream;
        if (this.md == null) {
            try {
                this.md = MessageDigest.getInstance(((DOMDigestMethod)this.digestMethod).getMessageDigestAlgorithm());
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new XMLSignatureException(noSuchAlgorithmException);
            }
        }
        this.md.reset();
        Boolean bl = (Boolean)xMLCryptoContext.getProperty("javax.xml.crypto.dsig.cacheReference");
        if (bl != null && bl.booleanValue()) {
            this.derefData = DOMReference.copyDerefData(data);
            digesterOutputStream = new DigesterOutputStream(this.md, true);
        } else {
            digesterOutputStream = new DigesterOutputStream(this.md);
        }
        Data data2 = data;
        XMLSignatureInput xMLSignatureInput = null;
        try {
            byte[] byArray;
            UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(digesterOutputStream);
            try {
                Object object;
                int n;
                int n2 = this.transforms.size();
                for (n = 0; n < n2; ++n) {
                    object = (DOMTransform)this.transforms.get(n);
                    data2 = n < n2 - 1 ? ((DOMTransform)object).transform(data2, xMLCryptoContext) : ((DOMTransform)object).transform(data2, xMLCryptoContext, unsyncBufferedOutputStream);
                }
                if (data2 != null) {
                    n = useC14N11 ? 1 : 0;
                    String string = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
                    if (xMLCryptoContext instanceof XMLSignContext) {
                        if (n == 0) {
                            object = (Boolean)xMLCryptoContext.getProperty("com.sun.org.apache.xml.internal.security.useC14N11");
                            int n3 = n = object != null && ((Boolean)object).booleanValue() ? 1 : 0;
                            if (n != 0) {
                                string = "http://www.w3.org/2006/12/xml-c14n11";
                            }
                        } else {
                            string = "http://www.w3.org/2006/12/xml-c14n11";
                        }
                    }
                    if (data2 instanceof ApacheData) {
                        xMLSignatureInput = ((ApacheData)data2).getXMLSignatureInput();
                    } else if (data2 instanceof OctetStreamData) {
                        xMLSignatureInput = new XMLSignatureInput(((OctetStreamData)data2).getOctetStream());
                    } else if (data2 instanceof NodeSetData) {
                        object = null;
                        if (this.provider == null) {
                            object = TransformService.getInstance(string, "DOM");
                        } else {
                            try {
                                object = TransformService.getInstance(string, "DOM", this.provider);
                            }
                            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                                object = TransformService.getInstance(string, "DOM");
                            }
                        }
                        data2 = object.transform(data2, xMLCryptoContext);
                        xMLSignatureInput = new XMLSignatureInput(((OctetStreamData)data2).getOctetStream());
                    } else {
                        throw new XMLSignatureException("unrecognized Data type");
                    }
                    boolean bl2 = Utils.secureValidation(xMLCryptoContext);
                    try {
                        xMLSignatureInput.setSecureValidation(bl2);
                        if (xMLCryptoContext instanceof XMLSignContext && n != 0 && !xMLSignatureInput.isOctetStream() && !xMLSignatureInput.isOutputStreamSet()) {
                            TransformService transformService = null;
                            if (this.provider == null) {
                                transformService = TransformService.getInstance(string, "DOM");
                            } else {
                                try {
                                    transformService = TransformService.getInstance(string, "DOM", this.provider);
                                }
                                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                                    transformService = TransformService.getInstance(string, "DOM");
                                }
                            }
                            DOMTransform dOMTransform = new DOMTransform(transformService);
                            Element element = null;
                            String string2 = DOMUtils.getSignaturePrefix(xMLCryptoContext);
                            if (this.allTransforms.isEmpty()) {
                                element = DOMUtils.createElement(this.refElem.getOwnerDocument(), "Transforms", "http://www.w3.org/2000/09/xmldsig#", string2);
                                this.refElem.insertBefore(element, DOMUtils.getFirstChildElement(this.refElem));
                            } else {
                                element = DOMUtils.getFirstChildElement(this.refElem);
                            }
                            dOMTransform.marshal(element, string2, (DOMCryptoContext)xMLCryptoContext);
                            this.allTransforms.add(dOMTransform);
                            xMLSignatureInput.updateOutputStream(unsyncBufferedOutputStream, true);
                        }
                        xMLSignatureInput.updateOutputStream(unsyncBufferedOutputStream);
                    }
                    finally {
                        if (xMLSignatureInput.getOctetStreamReal() != null) {
                            xMLSignatureInput.getOctetStreamReal().close();
                        }
                    }
                } else {
                    LOG.warn("The input bytes to the digest operation are null. This may be due to a problem with the Reference URI or its Transforms.");
                }
                ((OutputStream)unsyncBufferedOutputStream).flush();
                if (bl != null && bl.booleanValue()) {
                    this.dis = digesterOutputStream.getInputStream();
                }
                byArray = digesterOutputStream.getDigestValue();
            }
            catch (Throwable throwable) {
                try {
                    try {
                        ((OutputStream)unsyncBufferedOutputStream).close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                catch (CanonicalizationException | IOException | NoSuchAlgorithmException | MarshalException | TransformException exception) {
                    throw new XMLSignatureException(exception);
                }
            }
            ((OutputStream)unsyncBufferedOutputStream).close();
            return byArray;
        }
        finally {
            if (xMLSignatureInput != null && xMLSignatureInput.getOctetStreamReal() != null) {
                try {
                    xMLSignatureInput.getOctetStreamReal().close();
                }
                catch (IOException iOException) {
                    throw new XMLSignatureException(iOException);
                }
            }
            if (digesterOutputStream != null) {
                try {
                    digesterOutputStream.close();
                }
                catch (IOException iOException) {
                    throw new XMLSignatureException(iOException);
                }
            }
        }
    }

    @Override
    public Node getHere() {
        return this.here;
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2;
        if (this == object) {
            return true;
        }
        if (!(object instanceof Reference)) {
            return false;
        }
        Reference reference = (Reference)object;
        boolean bl3 = this.id == null ? reference.getId() == null : (bl2 = this.id.equals(reference.getId()));
        boolean bl4 = this.uri == null ? reference.getURI() == null : (bl = this.uri.equals(reference.getURI()));
        boolean bl5 = this.type == null ? reference.getType() == null : this.type.equals(reference.getType());
        boolean bl6 = Arrays.equals(this.digestValue, reference.getDigestValue());
        return this.digestMethod.equals(reference.getDigestMethod()) && bl2 && bl && bl5 && this.allTransforms.equals(reference.getTransforms()) && bl6;
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        if (this.uri != null) {
            n = 31 * n + this.uri.hashCode();
        }
        if (this.type != null) {
            n = 31 * n + this.type.hashCode();
        }
        if (this.digestValue != null) {
            n = 31 * n + Arrays.hashCode(this.digestValue);
        }
        n = 31 * n + this.digestMethod.hashCode();
        n = 31 * n + this.allTransforms.hashCode();
        return n;
    }

    boolean isDigested() {
        return this.digested;
    }

    private static Data copyDerefData(Data data) {
        if (data instanceof ApacheData) {
            ApacheData apacheData = (ApacheData)data;
            XMLSignatureInput xMLSignatureInput = apacheData.getXMLSignatureInput();
            if (xMLSignatureInput.isNodeSet()) {
                try {
                    final Set<Node> set = xMLSignatureInput.getNodeSet();
                    return new NodeSetData<Node>(){

                        @Override
                        public Iterator<Node> iterator() {
                            return set.iterator();
                        }
                    };
                }
                catch (Exception exception) {
                    LOG.warn("cannot cache dereferenced data: " + String.valueOf(exception));
                    return null;
                }
            }
            if (xMLSignatureInput.isElement()) {
                return new DOMSubTreeData(xMLSignatureInput.getSubNode(), xMLSignatureInput.isExcludeComments());
            }
            if (xMLSignatureInput.isOctetStream() || xMLSignatureInput.isByteArray()) {
                try {
                    return new OctetStreamData(xMLSignatureInput.getOctetStream(), xMLSignatureInput.getSourceURI(), xMLSignatureInput.getMIMEType());
                }
                catch (IOException iOException) {
                    LOG.warn("cannot cache dereferenced data: " + String.valueOf(iOException));
                    return null;
                }
            }
        }
        return data;
    }
}

