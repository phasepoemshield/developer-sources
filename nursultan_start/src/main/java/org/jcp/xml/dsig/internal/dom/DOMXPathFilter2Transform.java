/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import javax.xml.crypto.dsig.spec.XPathType;
import org.jcp.xml.dsig.internal.dom.ApacheTransform;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public final class DOMXPathFilter2Transform
extends ApacheTransform {
    @Override
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec == null) {
            throw new InvalidAlgorithmParameterException("params are required");
        }
        if (!(transformParameterSpec instanceof XPathFilter2ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("params must be of type XPathFilter2ParameterSpec");
        }
        this.params = transformParameterSpec;
    }

    @Override
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        try {
            this.unmarshalParams(DOMUtils.getFirstChildElement(this.transformElem));
        }
        catch (MarshalException marshalException) {
            throw new InvalidAlgorithmParameterException(marshalException);
        }
    }

    private void unmarshalParams(Element element) throws MarshalException {
        ArrayList<XPathType> arrayList = new ArrayList<XPathType>();
        Element element2 = element;
        while (element2 != null) {
            String string = element2.getFirstChild().getNodeValue();
            String string2 = DOMUtils.getAttributeValue(element2, "Filter");
            if (string2 == null) {
                throw new MarshalException("filter cannot be null");
            }
            XPathType.Filter filter = null;
            if ("intersect".equals(string2)) {
                filter = XPathType.Filter.INTERSECT;
            } else if ("subtract".equals(string2)) {
                filter = XPathType.Filter.SUBTRACT;
            } else if ("union".equals(string2)) {
                filter = XPathType.Filter.UNION;
            } else {
                throw new MarshalException("Unknown XPathType filter type" + string2);
            }
            NamedNodeMap namedNodeMap = element2.getAttributes();
            if (namedNodeMap != null) {
                int n = namedNodeMap.getLength();
                HashMap<String, String> hashMap = new HashMap<String, String>((int)Math.ceil((double)n / 0.75));
                for (int i = 0; i < n; ++i) {
                    Attr attr = (Attr)namedNodeMap.item(i);
                    String string3 = attr.getPrefix();
                    if (string3 == null || !"xmlns".equals(string3)) continue;
                    hashMap.put(attr.getLocalName(), attr.getValue());
                }
                arrayList.add(new XPathType(string, filter, hashMap));
            } else {
                arrayList.add(new XPathType(string, filter));
            }
            element2 = DOMUtils.getNextSiblingElement(element2);
        }
        this.params = new XPathFilter2ParameterSpec(arrayList);
    }

    @Override
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        XPathFilter2ParameterSpec xPathFilter2ParameterSpec = (XPathFilter2ParameterSpec)this.getParameterSpec();
        String string = DOMUtils.getNSPrefix(xMLCryptoContext, "http://www.w3.org/2002/06/xmldsig-filter2");
        String string2 = string == null || string.length() == 0 ? "xmlns" : "xmlns:" + string;
        List<XPathType> list = xPathFilter2ParameterSpec.getXPathList();
        for (XPathType xPathType : list) {
            Element element = DOMUtils.createElement(this.ownerDoc, "XPath", "http://www.w3.org/2002/06/xmldsig-filter2", string);
            element.appendChild(this.ownerDoc.createTextNode(xPathType.getExpression()));
            DOMUtils.setAttribute(element, "Filter", xPathType.getFilter().toString());
            element.setAttributeNS("http://www.w3.org/2000/xmlns/", string2, "http://www.w3.org/2002/06/xmldsig-filter2");
            Set<Map.Entry<String, String>> set = xPathType.getNamespaceMap().entrySet();
            for (Map.Entry<String, String> entry : set) {
                element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + entry.getKey(), entry.getValue());
            }
            this.transformElem.appendChild(element);
        }
    }
}

