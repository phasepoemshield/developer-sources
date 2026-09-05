/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NodeSetData;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMTransform;
import org.jcp.xml.dsig.internal.dom.DOMURIDereferencer;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.DOMX509Data;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMRetrievalMethod
extends DOMStructure
implements RetrievalMethod,
DOMURIReference {
    private final List<Transform> transforms;
    private String uri;
    private String type;
    private Attr here;

    public DOMRetrievalMethod(String string, String string2, List<? extends Transform> list) {
        if (string == null) {
            throw new NullPointerException("uri cannot be null");
        }
        if (list == null || list.isEmpty()) {
            this.transforms = Collections.emptyList();
        } else {
            this.transforms = Collections.unmodifiableList(new ArrayList<Transform>(list));
            int n = this.transforms.size();
            for (int i = 0; i < n; ++i) {
                if (this.transforms.get(i) instanceof Transform) continue;
                throw new ClassCastException("transforms[" + i + "] is not a valid type");
            }
        }
        this.uri = string;
        if (!string.isEmpty()) {
            try {
                new URI(string);
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new IllegalArgumentException(uRISyntaxException.getMessage());
            }
        }
        this.type = string2;
    }

    public DOMRetrievalMethod(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        this.uri = DOMUtils.getAttributeValue(element, "URI");
        this.type = DOMUtils.getAttributeValue(element, "Type");
        this.here = element.getAttributeNodeNS(null, "URI");
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        ArrayList<DOMTransform> arrayList = new ArrayList<DOMTransform>();
        Element element2 = DOMUtils.getFirstChildElement(element);
        if (element2 != null) {
            String string = element2.getLocalName();
            String string2 = element2.getNamespaceURI();
            if (!"Transforms".equals(string) || !"http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                throw new MarshalException("Invalid element name: " + string2 + ":" + string + ", expected Transforms");
            }
            Element element3 = DOMUtils.getFirstChildElement(element2, "Transform", "http://www.w3.org/2000/09/xmldsig#");
            while (element3 != null) {
                String string3 = element3.getLocalName();
                string2 = element3.getNamespaceURI();
                if (!"Transform".equals(string3) || !"http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                    throw new MarshalException("Invalid element name: " + string3 + ", expected Transform");
                }
                arrayList.add(new DOMTransform(element3, xMLCryptoContext, provider));
                if (bl && Policy.restrictNumTransforms(arrayList.size())) {
                    String string4 = "A maximum of " + Policy.maxTransforms() + " transforms per Reference are allowed when secure validation is enabled";
                    throw new MarshalException(string4);
                }
                element3 = DOMUtils.getNextSiblingElement(element3);
            }
        }
        this.transforms = arrayList.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
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
        return this.transforms;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "RetrievalMethod", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttribute(element, "URI", this.uri);
        DOMUtils.setAttribute(element, "Type", this.type);
        if (!this.transforms.isEmpty()) {
            Element element2 = DOMUtils.createElement(document, "Transforms", "http://www.w3.org/2000/09/xmldsig#", string);
            element.appendChild(element2);
            for (Transform transform : this.transforms) {
                ((DOMTransform)transform).marshal(element2, string, dOMCryptoContext);
            }
        }
        node.appendChild(element);
        this.here = element.getAttributeNodeNS(null, "URI");
    }

    @Override
    public Node getHere() {
        return this.here;
    }

    @Override
    public Data dereference(XMLCryptoContext xMLCryptoContext) throws URIReferenceException {
        Node node;
        Object object;
        Object object2;
        if (xMLCryptoContext == null) {
            throw new NullPointerException("context cannot be null");
        }
        URIDereferencer uRIDereferencer = xMLCryptoContext.getURIDereferencer();
        if (uRIDereferencer == null) {
            uRIDereferencer = DOMURIDereferencer.INSTANCE;
        }
        Data data = uRIDereferencer.dereference(this, xMLCryptoContext);
        try {
            object2 = this.transforms.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                data = ((DOMTransform)object).transform(data, xMLCryptoContext);
            }
        }
        catch (Exception exception) {
            throw new URIReferenceException(exception);
        }
        if (data instanceof NodeSetData && Utils.secureValidation(xMLCryptoContext) && Policy.restrictRetrievalMethodLoops() && (object = (object2 = (NodeSetData)data).iterator()).hasNext() && "RetrievalMethod".equals((node = (Node)object.next()).getLocalName())) {
            throw new URIReferenceException("It is forbidden to have one RetrievalMethod point to another when secure validation is enabled");
        }
        return data;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public XMLStructure dereferenceAsXMLStructure(XMLCryptoContext xMLCryptoContext) throws URIReferenceException {
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        ApacheData apacheData = (ApacheData)this.dereference(xMLCryptoContext);
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(apacheData.getXMLSignatureInput().getBytes());){
            Document document = XMLUtils.read(byteArrayInputStream, bl);
            Element element = document.getDocumentElement();
            if ("X509Data".equals(element.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(element.getNamespaceURI())) {
                DOMX509Data dOMX509Data = new DOMX509Data(element);
                return dOMX509Data;
            }
            XMLStructure xMLStructure = null;
            return xMLStructure;
        }
        catch (Exception exception) {
            throw new URIReferenceException(exception);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof RetrievalMethod)) {
            return false;
        }
        RetrievalMethod retrievalMethod = (RetrievalMethod)object;
        boolean bl = this.type == null ? retrievalMethod.getType() == null : this.type.equals(retrievalMethod.getType());
        return this.uri.equals(retrievalMethod.getURI()) && this.transforms.equals(retrievalMethod.getTransforms()) && bl;
    }

    public int hashCode() {
        int n = 17;
        if (this.type != null) {
            n = 31 * n + this.type.hashCode();
        }
        n = 31 * n + this.uri.hashCode();
        n = 31 * n + this.transforms.hashCode();
        return n;
    }
}

