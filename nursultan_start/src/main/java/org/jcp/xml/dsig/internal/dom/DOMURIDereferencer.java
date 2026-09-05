/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolver;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolverContext;
import java.net.URI;
import javax.xml.crypto.Data;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReference;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;
import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMURIDereferencer
implements URIDereferencer {
    static final URIDereferencer INSTANCE = new DOMURIDereferencer();

    private DOMURIDereferencer() {
        Init.init();
    }

    @Override
    public Data dereference(URIReference uRIReference, XMLCryptoContext xMLCryptoContext) throws URIReferenceException {
        Object object;
        Object object2;
        boolean bl;
        String string;
        DOMCryptoContext dOMCryptoContext;
        String string2;
        Attr attr;
        block21: {
            if (uRIReference == null) {
                throw new NullPointerException("uriRef cannot be null");
            }
            if (xMLCryptoContext == null) {
                throw new NullPointerException("context cannot be null");
            }
            DOMURIReference dOMURIReference = (DOMURIReference)uRIReference;
            attr = (Attr)dOMURIReference.getHere();
            string2 = uRIReference.getURI();
            dOMCryptoContext = (DOMCryptoContext)xMLCryptoContext;
            string = xMLCryptoContext.getBaseURI();
            bl = Utils.secureValidation(xMLCryptoContext);
            if (bl) {
                try {
                    if (Policy.restrictReferenceUriScheme(string2)) {
                        throw new URIReferenceException("URI " + string2 + " is forbidden when secure validation is enabled");
                    }
                    if (string2 == null || string2.isEmpty() || string2.charAt(0) == '#' || URI.create(string2).getScheme() != null) break block21;
                    try {
                        if (Policy.restrictReferenceUriScheme(string)) {
                            throw new URIReferenceException("Base URI " + string + " is forbidden when secure validation is enabled");
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new URIReferenceException("Invalid base URI " + string);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new URIReferenceException("Invalid URI " + string2);
                }
            }
        }
        if (string2 != null && string2.length() != 0 && string2.charAt(0) == '#') {
            object2 = string2.substring(1);
            if (((String)object2).startsWith("xpointer(id(")) {
                int n = ((String)object2).indexOf(39);
                int n2 = ((String)object2).indexOf(39, n + 1);
                if (n >= 0 && n2 >= 0) {
                    object2 = ((String)object2).substring(n + 1, n2);
                }
            }
            if ((object = attr.getOwnerDocument().getElementById((String)object2)) == null) {
                object = dOMCryptoContext.getElementById((String)object2);
            }
            if (object != null) {
                Element element;
                if (bl && Policy.restrictDuplicateIds() && !XMLUtils.protectAgainstWrappingAttack(element = object.getOwnerDocument().getDocumentElement(), (Element)object, (String)object2)) {
                    String string3 = "Multiple Elements with the same ID " + (String)object2 + " detected when secure validation is enabled";
                    throw new URIReferenceException(string3);
                }
                XMLSignatureInput xMLSignatureInput = new XMLSignatureInput((Node)object);
                xMLSignatureInput.setSecureValidation(bl);
                if (!string2.substring(1).startsWith("xpointer(id(")) {
                    xMLSignatureInput.setExcludeComments(true);
                }
                xMLSignatureInput.setMIMEType("text/xml");
                if (string != null && string.length() > 0) {
                    xMLSignatureInput.setSourceURI(string.concat(attr.getNodeValue()));
                } else {
                    xMLSignatureInput.setSourceURI(attr.getNodeValue());
                }
                return new ApacheNodeSetData(xMLSignatureInput);
            }
        }
        try {
            object2 = new ResourceResolverContext(attr, string, bl);
            object = ResourceResolver.resolve((ResourceResolverContext)object2);
            if (((XMLSignatureInput)object).isOctetStream()) {
                return new ApacheOctetStreamData((XMLSignatureInput)object);
            }
            return new ApacheNodeSetData((XMLSignatureInput)object);
        }
        catch (Exception exception) {
            throw new URIReferenceException(exception);
        }
    }
}

