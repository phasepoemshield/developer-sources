/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.security.spec.AlgorithmParameterSpec;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import javax.xml.crypto.dsig.spec.XPathType;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class DOMUtils {
    private DOMUtils() {
    }

    public static Document getOwnerDocument(Node node) {
        if (node.getNodeType() == 9) {
            return (Document)node;
        }
        return node.getOwnerDocument();
    }

    public static String getQNameString(String string, String string2) {
        String string3 = string == null || string.length() == 0 ? string2 : string + ":" + string2;
        return string3;
    }

    public static Element createElement(Document document, String string, String string2, String string3) {
        String string4 = string3 == null || string3.length() == 0 ? string : string3 + ":" + string;
        return document.createElementNS(string2, string4);
    }

    public static void setAttribute(Element element, String string, String string2) {
        if (string2 == null) {
            return;
        }
        element.setAttributeNS(null, string, string2);
    }

    public static void setAttributeID(Element element, String string, String string2) {
        if (string2 == null) {
            return;
        }
        element.setAttributeNS(null, string, string2);
        element.setIdAttributeNS(null, string, true);
    }

    public static Element getFirstChildElement(Node node) {
        Node node2;
        for (node2 = node.getFirstChild(); node2 != null && node2.getNodeType() != 1; node2 = node2.getNextSibling()) {
        }
        return (Element)node2;
    }

    public static Element getFirstChildElement(Node node, String string, String string2) throws MarshalException {
        return DOMUtils.verifyElement(DOMUtils.getFirstChildElement(node), string, string2);
    }

    private static Element verifyElement(Element element, String string, String string2) throws MarshalException {
        if (element == null) {
            throw new MarshalException("Missing " + string + " element");
        }
        String string3 = element.getLocalName();
        String string4 = element.getNamespaceURI();
        if (!string3.equals(string) || string4 == null && string2 != null || string4 != null && !string4.equals(string2)) {
            throw new MarshalException("Invalid element name: " + string4 + ":" + string3 + ", expected " + string2 + ":" + string);
        }
        return element;
    }

    public static Element getLastChildElement(Node node) {
        Node node2;
        for (node2 = node.getLastChild(); node2 != null && node2.getNodeType() != 1; node2 = node2.getPreviousSibling()) {
        }
        return (Element)node2;
    }

    public static Element getNextSiblingElement(Node node) {
        Node node2;
        for (node2 = node.getNextSibling(); node2 != null && node2.getNodeType() != 1; node2 = node2.getNextSibling()) {
        }
        return (Element)node2;
    }

    public static Element getNextSiblingElement(Node node, String string, String string2) throws MarshalException {
        return DOMUtils.verifyElement(DOMUtils.getNextSiblingElement(node), string, string2);
    }

    public static String getAttributeValue(Element element, String string) {
        Attr attr = element.getAttributeNodeNS(null, string);
        return attr == null ? null : attr.getValue();
    }

    public static <N> String getIdAttributeValue(Element element, String string) {
        Attr attr = element.getAttributeNodeNS(null, string);
        if (attr != null && !attr.isId()) {
            element.setIdAttributeNode(attr, true);
        }
        return attr == null ? null : attr.getValue();
    }

    public static String getNSPrefix(XMLCryptoContext xMLCryptoContext, String string) {
        if (xMLCryptoContext != null) {
            return xMLCryptoContext.getNamespacePrefix(string, xMLCryptoContext.getDefaultNamespacePrefix());
        }
        return null;
    }

    public static String getSignaturePrefix(XMLCryptoContext xMLCryptoContext) {
        return DOMUtils.getNSPrefix(xMLCryptoContext, "http://www.w3.org/2000/09/xmldsig#");
    }

    public static void removeAllChildren(Node node) {
        for (Node node2 = node.getFirstChild(); node2 != null; node2 = node2.getNextSibling()) {
            Node node3 = node2;
            node.removeChild(node3);
        }
    }

    public static boolean nodesEqual(Node node, Node node2) {
        return node.isEqualNode(node2);
    }

    public static void appendChild(Node node, Node node2) {
        Document document = DOMUtils.getOwnerDocument(node);
        if (node2.getOwnerDocument() != document) {
            node.appendChild(document.importNode(node2, true));
        } else {
            node.appendChild(node2);
        }
    }

    public static boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec, AlgorithmParameterSpec algorithmParameterSpec2) {
        if (algorithmParameterSpec == algorithmParameterSpec2) {
            return true;
        }
        if (algorithmParameterSpec instanceof XPathFilter2ParameterSpec && algorithmParameterSpec2 instanceof XPathFilter2ParameterSpec) {
            return DOMUtils.paramsEqual((XPathFilter2ParameterSpec)algorithmParameterSpec, (XPathFilter2ParameterSpec)algorithmParameterSpec2);
        }
        if (algorithmParameterSpec instanceof ExcC14NParameterSpec && algorithmParameterSpec2 instanceof ExcC14NParameterSpec) {
            return DOMUtils.paramsEqual((ExcC14NParameterSpec)algorithmParameterSpec, (ExcC14NParameterSpec)algorithmParameterSpec2);
        }
        if (algorithmParameterSpec instanceof XPathFilterParameterSpec && algorithmParameterSpec2 instanceof XPathFilterParameterSpec) {
            return DOMUtils.paramsEqual((XPathFilterParameterSpec)algorithmParameterSpec, (XPathFilterParameterSpec)algorithmParameterSpec2);
        }
        if (algorithmParameterSpec instanceof XSLTTransformParameterSpec && algorithmParameterSpec2 instanceof XSLTTransformParameterSpec) {
            return DOMUtils.paramsEqual((XSLTTransformParameterSpec)algorithmParameterSpec, (XSLTTransformParameterSpec)algorithmParameterSpec2);
        }
        return false;
    }

    private static boolean paramsEqual(XPathFilter2ParameterSpec xPathFilter2ParameterSpec, XPathFilter2ParameterSpec xPathFilter2ParameterSpec2) {
        List<XPathType> list = xPathFilter2ParameterSpec.getXPathList();
        List<XPathType> list2 = xPathFilter2ParameterSpec2.getXPathList();
        int n = list.size();
        if (n != list2.size()) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            XPathType xPathType = list.get(i);
            XPathType xPathType2 = list2.get(i);
            if (xPathType.getExpression().equals(xPathType2.getExpression()) && xPathType.getNamespaceMap().equals(xPathType2.getNamespaceMap()) && xPathType.getFilter() == xPathType2.getFilter()) continue;
            return false;
        }
        return true;
    }

    private static boolean paramsEqual(ExcC14NParameterSpec excC14NParameterSpec, ExcC14NParameterSpec excC14NParameterSpec2) {
        return excC14NParameterSpec.getPrefixList().equals(excC14NParameterSpec2.getPrefixList());
    }

    private static boolean paramsEqual(XPathFilterParameterSpec xPathFilterParameterSpec, XPathFilterParameterSpec xPathFilterParameterSpec2) {
        return xPathFilterParameterSpec.getXPath().equals(xPathFilterParameterSpec2.getXPath()) && xPathFilterParameterSpec.getNamespaceMap().equals(xPathFilterParameterSpec2.getNamespaceMap());
    }

    private static boolean paramsEqual(XSLTTransformParameterSpec xSLTTransformParameterSpec, XSLTTransformParameterSpec xSLTTransformParameterSpec2) {
        XMLStructure xMLStructure = xSLTTransformParameterSpec2.getStylesheet();
        if (!(xMLStructure instanceof DOMStructure)) {
            return false;
        }
        Node node = ((DOMStructure)xMLStructure).getNode();
        XMLStructure xMLStructure2 = xSLTTransformParameterSpec.getStylesheet();
        Node node2 = ((DOMStructure)xMLStructure2).getNode();
        return DOMUtils.nodesEqual(node2, node);
    }

    public static boolean isNamespace(Node node) {
        if (2 == node.getNodeType()) {
            String string = node.getNamespaceURI();
            return "http://www.w3.org/2000/xmlns/".equals(string);
        }
        return false;
    }
}

