/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.AccessController;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;
import org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method;
import org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14NMethod;
import org.jcp.xml.dsig.internal.dom.DOMEnvelopedTransform;
import org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod;
import org.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory;
import org.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory;
import org.jcp.xml.dsig.internal.dom.DOMXPathFilter2Transform;
import org.jcp.xml.dsig.internal.dom.DOMXPathTransform;
import org.jcp.xml.dsig.internal.dom.DOMXSLTTransform;

public final class XMLDSigRI
extends Provider {
    static final long serialVersionUID = -5049765099299494554L;
    private static final String INFO = "XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)";
    private static final String VER;

    public XMLDSigRI() {
        super("XMLDSig", VER, INFO);
        final XMLDSigRI xMLDSigRI = this;
        AccessController.doPrivileged(new PrivilegedAction<Void>(){

            @Override
            public Void run() {
                HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("MechanismType", "DOM");
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "XMLSignatureFactory", "DOM", "org.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory"));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "KeyInfoFactory", "DOM", "org.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory"));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14NMethod", new String[]{"INCLUSIVE"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14NMethod", new String[]{"INCLUSIVE_WITH_COMMENTS"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2006/12/xml-c14n11", "org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method", null, (Map<String, String>)hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2006/12/xml-c14n11#WithComments", "org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method", null, (Map<String, String>)hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2001/10/xml-exc-c14n#", "org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod", new String[]{"EXCLUSIVE"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2001/10/xml-exc-c14n#WithComments", "org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod", new String[]{"EXCLUSIVE_WITH_COMMENTS"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2000/09/xmldsig#base64", "org.jcp.xml.dsig.internal.dom.DOMBase64Transform", new String[]{"BASE64"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "org.jcp.xml.dsig.internal.dom.DOMEnvelopedTransform", new String[]{"ENVELOPED"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/2002/06/xmldsig-filter2", "org.jcp.xml.dsig.internal.dom.DOMXPathFilter2Transform", new String[]{"XPATH2"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/TR/1999/REC-xpath-19991116", "org.jcp.xml.dsig.internal.dom.DOMXPathTransform", new String[]{"XPATH"}, hashMap));
                XMLDSigRI.this.putService(new ProviderService(xMLDSigRI, "TransformService", "http://www.w3.org/TR/1999/REC-xslt-19991116", "org.jcp.xml.dsig.internal.dom.DOMXSLTTransform", new String[]{"XSLT"}, hashMap));
                return null;
            }
        });
    }

    private static final class ProviderService
    extends Provider.Service {
        ProviderService(Provider provider, String string, String string2, String string3, String[] stringArray, Map<String, String> map) {
            super(provider, string, string2, string3, stringArray == null ? null : Arrays.asList(stringArray), map);
        }

        ProviderService(Provider provider, String string, String string2, String string3, String[] stringArray) {
            super(provider, string, string2, string3, stringArray == null ? null : Arrays.asList(stringArray), null);
        }

        ProviderService(Provider provider, String string, String string2, String string3) {
            super(provider, string, string2, string3, null, null);
        }

        @Override
        public Object newInstance(Object object) throws NoSuchAlgorithmException {
            String string = this.getType();
            if (object != null) {
                throw new InvalidParameterException("constructorParameter not used with " + string + " engines");
            }
            String string2 = this.getAlgorithm();
            try {
                if ("XMLSignatureFactory".equals(string)) {
                    if ("DOM".equals(string2)) {
                        return new DOMXMLSignatureFactory();
                    }
                } else if ("KeyInfoFactory".equals(string)) {
                    if ("DOM".equals(string2)) {
                        return new DOMKeyInfoFactory();
                    }
                } else if ("TransformService".equals(string)) {
                    if (string2.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315") || string2.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments")) {
                        return new DOMCanonicalXMLC14NMethod();
                    }
                    if ("http://www.w3.org/2006/12/xml-c14n11".equals(string2) || "http://www.w3.org/2006/12/xml-c14n11#WithComments".equals(string2)) {
                        return new DOMCanonicalXMLC14N11Method();
                    }
                    if (string2.equals("http://www.w3.org/2001/10/xml-exc-c14n#") || string2.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments")) {
                        return new DOMExcC14NMethod();
                    }
                    if (string2.equals("http://www.w3.org/2000/09/xmldsig#base64")) {
                        return new DOMBase64Transform();
                    }
                    if (string2.equals("http://www.w3.org/2000/09/xmldsig#enveloped-signature")) {
                        return new DOMEnvelopedTransform();
                    }
                    if (string2.equals("http://www.w3.org/2002/06/xmldsig-filter2")) {
                        return new DOMXPathFilter2Transform();
                    }
                    if (string2.equals("http://www.w3.org/TR/1999/REC-xpath-19991116")) {
                        return new DOMXPathTransform();
                    }
                    if (string2.equals("http://www.w3.org/TR/1999/REC-xslt-19991116")) {
                        return new DOMXSLTTransform();
                    }
                }
            }
            catch (Exception exception) {
                throw new NoSuchAlgorithmException("Error constructing " + string + " for " + string2 + " using XMLDSig", exception);
            }
            throw new ProviderException("No impl for " + string2 + " " + string);
        }
    }
}

