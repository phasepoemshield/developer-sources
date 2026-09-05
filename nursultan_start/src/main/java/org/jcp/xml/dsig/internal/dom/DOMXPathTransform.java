/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheTransform;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public final class DOMXPathTransform
extends ApacheTransform {
    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec == null) {
            throw new InvalidAlgorithmParameterException("params are required");
        }
        if (!(transformParameterSpec instanceof XPathFilterParameterSpec)) {
            throw new InvalidAlgorithmParameterException("params must be of type XPathFilterParameterSpec");
        }
        this.params = transformParameterSpec;
    }

    @Override
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        this.unmarshalParams(DOMUtils.getFirstChildElement(this.transformElem));
    }

    private void unmarshalParams(Element element) {
        String string = element.getFirstChild().getNodeValue();
        NamedNodeMap namedNodeMap = element.getAttributes();
        if (namedNodeMap != null) {
            int n = namedNodeMap.getLength();
            HashMap<String, String> hashMap = new HashMap<String, String>((int)Math.ceil((double)n / 0.75));
            for (int i = 0; i < n; ++i) {
                Attr attr = (Attr)namedNodeMap.item(i);
                String string2 = attr.getPrefix();
                if (string2 == null || !"xmlns".equals(string2)) continue;
                hashMap.put(attr.getLocalName(), attr.getValue());
            }
            this.params = new XPathFilterParameterSpec(string, hashMap);
        } else {
            this.params = new XPathFilterParameterSpec(string);
        }
    }

    @Override
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        XPathFilterParameterSpec xPathFilterParameterSpec = (XPathFilterParameterSpec)this.getParameterSpec();
        Element element = DOMUtils.createElement(this.ownerDoc, "XPath", "http://www.w3.org/2000/09/xmldsig#", DOMUtils.getSignaturePrefix(xMLCryptoContext));
        element.appendChild(this.ownerDoc.createTextNode(xPathFilterParameterSpec.getXPath()));
        Set<Map.Entry<String, String>> set = xPathFilterParameterSpec.getNamespaceMap().entrySet();
        for (Map.Entry<String, String> entry : set) {
            element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + entry.getKey(), entry.getValue());
        }
        this.transformElem.appendChild(element);
    }
}

