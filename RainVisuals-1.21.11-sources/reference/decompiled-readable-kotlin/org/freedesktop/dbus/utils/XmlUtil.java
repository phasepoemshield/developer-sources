package org.freedesktop.dbus.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// $VF: Compiled from XmlUtil.java
public final class XmlUtil {
   public static Map<String, String> convertToAttributeMap(NamedNodeMap _nodeMap) {
      Map<String, String> map = new LinkedHashMap<>();

      for (int i = 0; i < _nodeMap.getLength(); i++) {
         Node node = _nodeMap.item(i);
         map.put(node.getNodeName(), node.getNodeValue());
      }

      return map;
   }

   public static Document parseXmlString(String _xmlStr, boolean _namespaceAware, boolean _validating) throws IOException {
      DocumentBuilderFactory dbFac = DocumentBuilderFactory.newInstance();
      dbFac.setNamespaceAware(_namespaceAware);
      dbFac.setValidating(_validating);

      try {
         dbFac.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
         return dbFac.newDocumentBuilder().parse(new ByteArrayInputStream(_xmlStr.getBytes(StandardCharsets.UTF_8)));
      } catch (IOException _ex) {
         throw _ex;
      } catch (Exception var6) {
         throw new IOException("Failed to parse " + Util.abbreviate(_xmlStr, 500), var6);
      }
   }

   public static Element toElement(Node _node) {
      return isElementType(_node) ? (Element)_node : null;
   }

   public static List<Element> convertToElementList(NodeList _nodeList) {
      List<Element> elemList = new ArrayList<>();

      for (int i = 0; i < _nodeList.getLength(); i++) {
         Element elem = (Element)_nodeList.item(i);
         elemList.add(elem);
      }

      return elemList;
   }

   public static boolean isElementType(Node _node) {
      return _node instanceof Element;
   }

   public static NodeList applyXpathExpressionToDocument(String _xpathExpression, Node _xmlDocumentOrNode) throws IOException {
      XPathFactory xfactory = XPathFactory.newInstance();
      XPath xpath = xfactory.newXPath();
      XPathExpression expr = null;

      try {
         expr = xpath.compile(_xpathExpression);
      } catch (XPathExpressionException var8) {
         throw new IOException(var8);
      }

      Object result = null;

      try {
         result = expr.evaluate(_xmlDocumentOrNode, XPathConstants.NODESET);
      } catch (Exception var7) {
         throw new IOException(var7);
      }

      return (NodeList)result;
   }

   private XmlUtil() {
   }
}
