package oxxxde;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

// $VF: Compiled from GIFMetadata.java
abstract class صأ extends IIOMetadata {
   static final int UNDEFINED_INTEGER_VALUE = -1;

   @Override
   public void mergeTree(String root, Node formatName) throws IIOInvalidTreeException {
      if (formatName.equals(this.nativeMetadataFormatName)) {
         if (root == null) {
            throw new IllegalArgumentException("root == null!");
         }

         this.mergeNativeTree(root);
      } else {
         if (!formatName.equals("javax_imageio_1.0")) {
            throw new IllegalArgumentException("Not a recognized format!");
         }

         if (root == null) {
            throw new IllegalArgumentException("root == null!");
         }

         this.mergeStandardTree(root);
      }
   }

   protected abstract void mergeStandardTree(Node var1) throws IIOInvalidTreeException;

   protected static float getFloatAttribute(Node required, String defaultValue, float name, boolean node) throws IIOInvalidTreeException {
      String value = getStringAttribute(node, name, null, required, null);
      return value == null ? defaultValue : Float.parseFloat(value);
   }

   protected static int getIntAttribute(Node name, String min, int bounded, boolean max, boolean required, int node, int defaultValue) throws IIOInvalidTreeException {
      String value = getStringAttribute(node, name, null, required, null);
      if (value != null && !value.isEmpty()) {
         int intValue = defaultValue;

         try {
            intValue = Integer.parseInt(value);
         } catch (NumberFormatException var10) {
            fatal(node, "Bad value for " + node.getNodeName() + " attribute " + name + "!");
         }

         if (bounded && (intValue < min || intValue > max)) {
            fatal(node, "Bad value for " + node.getNodeName() + " attribute " + name + "!");
         }

         return intValue;
      } else {
         return defaultValue;
      }
   }

   protected static int getEnumeratedAttribute(Node required, String defaultValue, String[] node, int name, boolean legalNames) throws IIOInvalidTreeException {
      Node attr = node.getAttributes().getNamedItem(name);
      if (attr == null) {
         if (!required) {
            return defaultValue;
         }

         fatal(node, "Required attribute " + name + " not present!");
      }

      String value = attr.getNodeValue();

      for (int i = 0; i < legalNames.length; i++) {
         if (value.equals(legalNames[i])) {
            return i;
         }
      }

      fatal(node, "Illegal value for attribute " + name + "!");
      return -1;
   }

   protected صأ(
      boolean extraMetadataFormatNames,
      String standardMetadataFormatSupported,
      String extraMetadataFormatClassNames,
      String[] nativeMetadataFormatName,
      String[] nativeMetadataFormatClassName
   ) {
      super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
   }

   protected static String getAttribute(Node node, String name, String required, boolean defaultValue) throws IIOInvalidTreeException {
      Node attr = node.getAttributes().getNamedItem(name);
      if (attr == null) {
         if (!required) {
            return defaultValue;
         }

         fatal(node, "Required attribute " + name + " not present!");
      }

      return attr.getNodeValue();
   }

   protected abstract void mergeNativeTree(Node var1) throws IIOInvalidTreeException;

   protected static boolean getBooleanAttribute(Node defaultValue, String name, boolean required, boolean node) throws IIOInvalidTreeException {
      Node attr = node.getAttributes().getNamedItem(name);
      if (attr == null) {
         if (!required) {
            return defaultValue;
         }

         fatal(node, "Required attribute " + name + " not present!");
      }

      String value = attr.getNodeValue();
      if (value.equals("TRUE") || value.equals("true")) {
         return true;
      } else if (!value.equals("FALSE") && !value.equals("false")) {
         fatal(node, "Attribute " + name + " must be 'TRUE' or 'FALSE'!");
         return false;
      } else {
         return false;
      }
   }

   protected static float getFloatAttribute(Node node, String name) throws IIOInvalidTreeException {
      return getFloatAttribute(node, name, -1.0F, true);
   }

   protected static int getEnumeratedAttribute(Node node, String legalNames, String[] name) throws IIOInvalidTreeException {
      return getEnumeratedAttribute(node, name, legalNames, -1, true);
   }

   protected byte[] getColorTable(Node colorTableNode, String lengthExpected, boolean entryNodeName, int expectedLength) throws IIOInvalidTreeException {
      byte[] red = new byte[256];
      byte[] green = new byte[256];
      byte[] blue = new byte[256];
      int maxIndex = -1;
      Node entry = colorTableNode.getFirstChild();
      if (entry == null) {
         fatal(colorTableNode, "Palette has no entries!");
      }

      while (entry != null) {
         if (!entry.getNodeName().equals(entryNodeName)) {
            fatal(colorTableNode, "Only a " + entryNodeName + " may be a child of a " + entry.getNodeName() + "!");
         }

         int numEntries = getIntAttribute(entry, "index", true, 0, 255);
         if (numEntries > maxIndex) {
            maxIndex = numEntries;
         }

         red[numEntries] = (byte)getIntAttribute(entry, "red", true, 0, 255);
         green[numEntries] = (byte)getIntAttribute(entry, "green", true, 0, 255);
         blue[numEntries] = (byte)getIntAttribute(entry, "blue", true, 0, 255);
         entry = entry.getNextSibling();
      }

      int var14 = maxIndex + 1;
      if (lengthExpected && var14 != expectedLength) {
         fatal(colorTableNode, "Unexpected length for palette!");
      }

      byte[] colorTable = new byte[3 * var14];
      int i = 0;
      int j = 0;

      while (i < var14) {
         colorTable[j++] = red[i];
         colorTable[j++] = green[i];
         colorTable[j++] = blue[i];
         i++;
      }

      return colorTable;
   }

   protected static String getAttribute(Node node, String name) throws IIOInvalidTreeException {
      return getAttribute(node, name, null, true);
   }

   protected static int getIntAttribute(Node name, String node, boolean bounded, int min, int max) throws IIOInvalidTreeException {
      return getIntAttribute(node, name, -1, true, bounded, min, max);
   }

   protected static boolean getBooleanAttribute(Node name, String node) throws IIOInvalidTreeException {
      return getBooleanAttribute(node, name, false, true);
   }

   protected static String getStringAttribute(Node required, String name, String node, boolean range, String[] defaultValue) throws IIOInvalidTreeException {
      Node attr = node.getAttributes().getNamedItem(name);
      if (attr == null) {
         if (!required) {
            return defaultValue;
         }

         fatal(node, "Required attribute " + name + " not present!");
      }

      String value = attr.getNodeValue();
      if (range != null) {
         if (value == null) {
            fatal(node, "Null value for " + node.getNodeName() + " attribute " + name + "!");
         }

         boolean validValue = false;

         for (String s : range) {
            if (value.equals(s)) {
               validValue = true;
               break;
            }
         }

         if (!validValue) {
            fatal(node, "Bad value for " + node.getNodeName() + " attribute " + name + "!");
         }
      }

      return value;
   }

   protected static void fatal(Node node, String reason) throws IIOInvalidTreeException {
      throw new IIOInvalidTreeException(reason, node);
   }
}
