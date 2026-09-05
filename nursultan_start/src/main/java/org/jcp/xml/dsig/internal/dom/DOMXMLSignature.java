/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.KeySelectorResult;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import org.jcp.xml.dsig.internal.dom.AbstractDOMSignatureMethod;
import org.jcp.xml.dsig.internal.dom.DOMKeyInfo;
import org.jcp.xml.dsig.internal.dom.DOMManifest;
import org.jcp.xml.dsig.internal.dom.DOMReference;
import org.jcp.xml.dsig.internal.dom.DOMSignedInfo;
import org.jcp.xml.dsig.internal.dom.DOMStructure;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.DOMXMLObject;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMXMLSignature
extends DOMStructure
implements XMLSignature {
    private static final Logger LOG = LoggerFactory.getLogger(DOMXMLSignature.class);
    private final String id;
    private final XMLSignature.SignatureValue sv;
    private KeyInfo ki;
    private List<XMLObject> objects;
    private final SignedInfo si;
    private Document ownerDoc = null;
    private Element localSigElem = null;
    private Element sigElem = null;
    private boolean validationStatus;
    private boolean validated = false;
    private KeySelectorResult ksr;
    private Map<String, XMLStructure> signatureIdMap;

    public DOMXMLSignature(SignedInfo signedInfo, KeyInfo keyInfo, List<? extends XMLObject> list, String string, String string2) {
        if (signedInfo == null) {
            throw new NullPointerException("signedInfo cannot be null");
        }
        this.si = signedInfo;
        this.id = string;
        this.sv = new DOMSignatureValue(string2);
        if (list == null) {
            this.objects = Collections.emptyList();
        } else {
            this.objects = Collections.unmodifiableList(new ArrayList<XMLObject>(list));
            int n = this.objects.size();
            for (int i = 0; i < n; ++i) {
                if (this.objects.get(i) instanceof XMLObject) continue;
                throw new ClassCastException("objs[" + i + "] is not an XMLObject");
            }
        }
        this.ki = keyInfo;
    }

    public DOMXMLSignature(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        this.localSigElem = element;
        this.ownerDoc = this.localSigElem.getOwnerDocument();
        this.id = DOMUtils.getAttributeValue(this.localSigElem, "Id");
        Element element2 = DOMUtils.getFirstChildElement(this.localSigElem, "SignedInfo", "http://www.w3.org/2000/09/xmldsig#");
        this.si = new DOMSignedInfo(element2, xMLCryptoContext, provider);
        Element element3 = DOMUtils.getNextSiblingElement(element2, "SignatureValue", "http://www.w3.org/2000/09/xmldsig#");
        this.sv = new DOMSignatureValue(element3);
        Element element4 = DOMUtils.getNextSiblingElement(element3);
        if (element4 != null && "KeyInfo".equals(element4.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(element4.getNamespaceURI())) {
            this.ki = new DOMKeyInfo(element4, xMLCryptoContext, provider);
            element4 = DOMUtils.getNextSiblingElement(element4);
        }
        if (element4 == null) {
            this.objects = Collections.emptyList();
        } else {
            ArrayList<DOMXMLObject> arrayList = new ArrayList<DOMXMLObject>();
            while (element4 != null) {
                String string = element4.getLocalName();
                String string2 = element4.getNamespaceURI();
                if (!"Object".equals(string) || !"http://www.w3.org/2000/09/xmldsig#".equals(string2)) {
                    throw new MarshalException("Invalid element name: " + string2 + ":" + string + ", expected KeyInfo or Object");
                }
                arrayList.add(new DOMXMLObject(element4, xMLCryptoContext, provider));
                element4 = DOMUtils.getNextSiblingElement(element4);
            }
            this.objects = Collections.unmodifiableList(arrayList);
        }
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public KeyInfo getKeyInfo() {
        return this.ki;
    }

    @Override
    public SignedInfo getSignedInfo() {
        return this.si;
    }

    @Override
    public List<XMLObject> getObjects() {
        return this.objects;
    }

    @Override
    public XMLSignature.SignatureValue getSignatureValue() {
        return this.sv;
    }

    @Override
    public KeySelectorResult getKeySelectorResult() {
        return this.ksr;
    }

    @Override
    public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        this.marshal(node, null, string, dOMCryptoContext);
    }

    public void marshal(Node node, Node node2, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        this.ownerDoc = DOMUtils.getOwnerDocument(node);
        this.sigElem = DOMUtils.createElement(this.ownerDoc, "Signature", "http://www.w3.org/2000/09/xmldsig#", string);
        if (string == null || string.length() == 0) {
            this.sigElem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://www.w3.org/2000/09/xmldsig#");
        } else {
            this.sigElem.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + string, "http://www.w3.org/2000/09/xmldsig#");
        }
        ((DOMSignedInfo)this.si).marshal(this.sigElem, string, dOMCryptoContext);
        ((DOMSignatureValue)this.sv).marshal(this.sigElem, string, dOMCryptoContext);
        if (this.ki != null) {
            ((DOMKeyInfo)this.ki).marshal(this.sigElem, null, string, dOMCryptoContext);
        }
        for (XMLObject xMLObject : this.objects) {
            ((DOMXMLObject)xMLObject).marshal(this.sigElem, string, dOMCryptoContext);
        }
        DOMUtils.setAttributeID(this.sigElem, "Id", this.id);
        node.insertBefore(this.sigElem, node2);
    }

    @Override
    public boolean validate(XMLValidateContext xMLValidateContext) throws XMLSignatureException {
        int n;
        boolean bl;
        if (xMLValidateContext == null) {
            throw new NullPointerException("validateContext is null");
        }
        if (!(xMLValidateContext instanceof DOMValidateContext)) {
            throw new ClassCastException("validateContext must be of type DOMValidateContext");
        }
        if (this.validated) {
            return this.validationStatus;
        }
        boolean bl2 = this.sv.validate(xMLValidateContext);
        if (!bl2) {
            this.validationStatus = false;
            this.validated = true;
            return this.validationStatus;
        }
        List<Reference> list = this.si.getReferences();
        boolean bl3 = true;
        int n2 = list.size();
        for (n = 0; bl3 && n < n2; bl3 &= bl, ++n) {
            Reference reference = list.get(n);
            bl = reference.validate(xMLValidateContext);
            LOG.debug("Reference [{}] is valid: {}", reference.getURI(), bl);
        }
        if (!bl3) {
            LOG.debug("Couldn't validate the References");
            this.validationStatus = false;
            this.validated = true;
            return this.validationStatus;
        }
        n = 1;
        if (Boolean.TRUE.equals(xMLValidateContext.getProperty("org.jcp.xml.dsig.validateManifests"))) {
            int n3 = this.objects.size();
            for (n2 = 0; n != 0 && n2 < n3; ++n2) {
                XMLObject xMLObject = this.objects.get(n2);
                List<XMLStructure> list2 = xMLObject.getContent();
                int n4 = list2.size();
                for (int i = 0; n != 0 && i < n4; ++i) {
                    int n5;
                    XMLStructure xMLStructure = list2.get(i);
                    if (!(xMLStructure instanceof Manifest)) continue;
                    LOG.debug("validating manifest");
                    Manifest manifest = (Manifest)xMLStructure;
                    List<Reference> list3 = manifest.getReferences();
                    int n6 = list3.size();
                    for (int j = 0; n != 0 && j < n6; n &= n5, ++j) {
                        Reference reference = list3.get(j);
                        n5 = reference.validate(xMLValidateContext);
                        LOG.debug("Manifest ref [{}] is valid: {}", reference.getURI(), n5 != 0);
                    }
                }
            }
        }
        this.validationStatus = n;
        this.validated = true;
        return this.validationStatus;
    }

    @Override
    public void sign(XMLSignContext xMLSignContext) throws MarshalException, XMLSignatureException {
        if (xMLSignContext == null) {
            throw new NullPointerException("signContext cannot be null");
        }
        DOMSignContext dOMSignContext = (DOMSignContext)xMLSignContext;
        this.marshal(dOMSignContext.getParent(), dOMSignContext.getNextSibling(), DOMUtils.getSignaturePrefix(dOMSignContext), dOMSignContext);
        ArrayList<Reference> arrayList = new ArrayList<Reference>();
        this.signatureIdMap = new HashMap<String, XMLStructure>();
        this.signatureIdMap.put(this.id, this);
        this.signatureIdMap.put(this.si.getId(), this.si);
        List<Reference> list = this.si.getReferences();
        for (Reference object2 : list) {
            this.signatureIdMap.put(object2.getId(), object2);
        }
        for (XMLObject invalidKeyException : this.objects) {
            this.signatureIdMap.put(invalidKeyException.getId(), invalidKeyException);
            List<XMLStructure> list2 = invalidKeyException.getContent();
            for (XMLStructure xMLStructure : list2) {
                if (!(xMLStructure instanceof Manifest)) continue;
                Manifest manifest = (Manifest)xMLStructure;
                this.signatureIdMap.put(manifest.getId(), manifest);
                List<Reference> list3 = manifest.getReferences();
                for (Reference reference : list3) {
                    arrayList.add(reference);
                    this.signatureIdMap.put(reference.getId(), reference);
                }
            }
        }
        arrayList.addAll(list);
        for (Reference reference : arrayList) {
            this.digestReference((DOMReference)reference, xMLSignContext);
        }
        for (Reference reference : arrayList) {
            if (((DOMReference)reference).isDigested()) continue;
            ((DOMReference)reference).digest(xMLSignContext);
        }
        Object object3 = null;
        try {
            KeySelectorResult keySelectorResult = xMLSignContext.getKeySelector().select(this.ki, KeySelector.Purpose.SIGN, this.si.getSignatureMethod(), xMLSignContext);
            object3 = keySelectorResult.getKey();
            if (object3 == null) {
                throw new XMLSignatureException("the keySelector did not find a signing key");
            }
            this.ksr = keySelectorResult;
        }
        catch (KeySelectorException keySelectorException) {
            throw new XMLSignatureException("cannot find signing key", keySelectorException);
        }
        try {
            byte[] byArray = ((AbstractDOMSignatureMethod)this.si.getSignatureMethod()).sign((Key)object3, this.si, xMLSignContext);
            ((DOMSignatureValue)this.sv).setValue(byArray);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new XMLSignatureException(invalidKeyException);
        }
        this.localSigElem = this.sigElem;
    }

    public boolean equals(Object object) {
        boolean bl;
        if (this == object) {
            return true;
        }
        if (!(object instanceof XMLSignature)) {
            return false;
        }
        XMLSignature xMLSignature = (XMLSignature)object;
        boolean bl2 = this.id == null ? xMLSignature.getId() == null : (bl = this.id.equals(xMLSignature.getId()));
        boolean bl3 = this.ki == null ? xMLSignature.getKeyInfo() == null : this.ki.equals(xMLSignature.getKeyInfo());
        return bl && bl3 && this.sv.equals(xMLSignature.getSignatureValue()) && this.si.equals(xMLSignature.getSignedInfo()) && this.objects.equals(xMLSignature.getObjects());
    }

    public int hashCode() {
        int n = 17;
        if (this.id != null) {
            n = 31 * n + this.id.hashCode();
        }
        if (this.ki != null) {
            n = 31 * n + this.ki.hashCode();
        }
        n = 31 * n + this.sv.hashCode();
        n = 31 * n + this.si.hashCode();
        n = 31 * n + this.objects.hashCode();
        return n;
    }

    private void digestReference(DOMReference dOMReference, XMLSignContext xMLSignContext) throws XMLSignatureException {
        if (dOMReference.isDigested()) {
            return;
        }
        String string = dOMReference.getURI();
        if (Utils.sameDocumentURI(string)) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            String string2 = Utils.parseIdFromSameDocumentURI(string);
            if (string2 != null && this.signatureIdMap.containsKey(string2)) {
                object4 = this.signatureIdMap.get(string2);
                if (object4 instanceof DOMReference) {
                    this.digestReference((DOMReference)object4, xMLSignContext);
                } else if (object4 instanceof Manifest) {
                    object3 = (Manifest)object4;
                    object2 = DOMManifest.getManifestReferences((Manifest)object3);
                    object = object2.iterator();
                    while (object.hasNext()) {
                        Reference reference = (Reference)object.next();
                        this.digestReference((DOMReference)reference, xMLSignContext);
                    }
                }
            }
            if (string.length() == 0) {
                object4 = dOMReference.getTransforms();
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    object2 = object3.next();
                    object = object2.getAlgorithm();
                    if (!((String)object).equals("http://www.w3.org/TR/1999/REC-xpath-19991116") && !((String)object).equals("http://www.w3.org/2002/06/xmldsig-filter2")) continue;
                    return;
                }
            }
        }
        dOMReference.digest(xMLSignContext);
    }

    static {
        Init.init();
    }

    public class DOMSignatureValue
    extends DOMStructure
    implements XMLSignature.SignatureValue {
        private String id;
        private byte[] value;
        private String valueBase64;
        private Element sigValueElem;
        private boolean validated = false;
        private boolean validationStatus;

        DOMSignatureValue(String string) {
            this.id = string;
        }

        DOMSignatureValue(Element element) throws MarshalException {
            String string = XMLUtils.getFullTextChildrenFromNode(element);
            this.value = XMLUtils.decode(string);
            Attr attr = element.getAttributeNodeNS(null, "Id");
            if (attr != null) {
                this.id = attr.getValue();
                element.setIdAttributeNode(attr, true);
            } else {
                this.id = null;
            }
            this.sigValueElem = element;
        }

        @Override
        public String getId() {
            return this.id;
        }

        @Override
        public byte[] getValue() {
            return this.value == null ? null : (byte[])this.value.clone();
        }

        public String getEncodedValue() {
            return this.valueBase64;
        }

        @Override
        public boolean validate(XMLValidateContext xMLValidateContext) throws XMLSignatureException {
            if (xMLValidateContext == null) {
                throw new NullPointerException("context cannot be null");
            }
            if (this.validated) {
                return this.validationStatus;
            }
            SignatureMethod signatureMethod = DOMXMLSignature.this.si.getSignatureMethod();
            Key key = null;
            KeySelectorResult keySelectorResult = null;
            try {
                KeySelector keySelector = xMLValidateContext.getKeySelector();
                if (keySelector != null && (keySelectorResult = keySelector.select(DOMXMLSignature.this.ki, KeySelector.Purpose.VERIFY, signatureMethod, xMLValidateContext)) != null) {
                    key = keySelectorResult.getKey();
                }
                if (key == null) {
                    throw new XMLSignatureException("the keyselector did not find a validation key");
                }
            }
            catch (KeySelectorException keySelectorException) {
                throw new XMLSignatureException("cannot find validation key", keySelectorException);
            }
            try {
                this.validationStatus = ((AbstractDOMSignatureMethod)signatureMethod).verify(key, DOMXMLSignature.this.si, this.value, xMLValidateContext);
            }
            catch (Exception exception) {
                throw new XMLSignatureException(exception);
            }
            this.validated = true;
            DOMXMLSignature.this.ksr = keySelectorResult;
            return this.validationStatus;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof XMLSignature.SignatureValue)) {
                return false;
            }
            XMLSignature.SignatureValue signatureValue = (XMLSignature.SignatureValue)object;
            boolean bl = this.id == null ? signatureValue.getId() == null : this.id.equals(signatureValue.getId());
            return bl;
        }

        public int hashCode() {
            int n = 17;
            if (this.id != null) {
                n = 31 * n + this.id.hashCode();
            }
            return n;
        }

        @Override
        public void marshal(Node node, String string, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            this.sigValueElem = DOMUtils.createElement(DOMXMLSignature.this.ownerDoc, "SignatureValue", "http://www.w3.org/2000/09/xmldsig#", string);
            if (this.valueBase64 != null) {
                this.sigValueElem.appendChild(DOMXMLSignature.this.ownerDoc.createTextNode(this.valueBase64));
            }
            DOMUtils.setAttributeID(this.sigValueElem, "Id", this.id);
            node.appendChild(this.sigValueElem);
        }

        void setValue(byte[] byArray) {
            this.value = byArray;
            this.valueBase64 = XMLUtils.encodeToString(byArray);
            this.sigValueElem.appendChild(DOMXMLSignature.this.ownerDoc.createTextNode(this.valueBase64));
        }
    }
}

