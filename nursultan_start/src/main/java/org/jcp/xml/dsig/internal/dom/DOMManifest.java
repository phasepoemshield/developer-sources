/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import org.jcp.xml.dsig.internal.dom.DOMReference;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMManifest
extends DOMStructure
implements Manifest {
    private final List<Reference> references;
    private final String id;

    public DOMManifest(List<? extends Reference> list, String string) {
        if (list == null) {
            throw new NullPointerException("references cannot be null");
        }
        this.references = Collections.unmodifiableList(new ArrayList<Reference>(list));
        if (this.references.isEmpty()) {
            throw new IllegalArgumentException("list of references must contain at least one entry");
        }
        int n = this.references.size();
        for (int i = 0; i < n; ++i) {
            if (this.references.get(i) instanceof Reference) continue;
            throw new ClassCastException("references[" + i + "] is not a valid type");
        }
        this.id = string;
    }

    public DOMManifest(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        this.id = DOMUtils.getIdAttributeValue(element, "Id");
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        Element element2 = DOMUtils.getFirstChildElement(element, "Reference", "http://www.w3.org/2000/09/xmldsig#");
        ArrayList<DOMReference> arrayList = new ArrayList<DOMReference>();
        arrayList.add(new DOMReference(element2, xMLCryptoContext, provider));
        element2 = DOMUtils.getNextSiblingElement(element2);
        while (element2 != null) {
            String string = element2.getLocalName();
            String string2 = element2.getNamespaceURI();
            if (!"Reference".equals(string) || !"http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                throw new MarshalException("Invalid element name: " + string2 + ":" + string + ", expected Reference");
            }
            arrayList.add(new DOMReference(element2, xMLCryptoContext, provider));
            if (bl && Policy.restrictNumReferences(arrayList.size())) {
                String string3 = "A maximum of " + Policy.maxReferences() + " references per Manifest are allowed when secure validation is enabled";
                throw new MarshalException(string3);
            }
            element2 = DOMUtils.getNextSiblingElement(element2);
        }
        this.references = Collections.unmodifiableList(arrayList);
    }

    @Override
    public String getId() {
        return this.id;
    }

    public static List<Reference> getManifestReferences(Manifest manifest) {
        return manifest.getReferences();
    }

    @Override
    public List<Reference> getReferences() {
        return this.references;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document document = DOMUtils.getOwnerDocument(node);
        Element element = DOMUtils.createElement(document, "Manifest", "http://www.w3.org/2000/09/xmldsig#", string);
        DOMUtils.setAttributeID(element, "Id", this.id);
        for (Reference reference : this.references) {
            ((DOMReference)reference).marshal(element, string, dOMCryptoContext);
        }
        node.appendChild(element);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Manifest)) {
            return false;
        }
        Manifest manifest = (Manifest)object;
        boolean bl = this.id == null ? manifest.getId() == null : this.id.equals(manifest.getId());
        return bl && this.references.equals(manifest.getReferences());
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        n = 31 * n + this.references.hashCode();
        return n;
    }
}

