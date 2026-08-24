/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

abstract class \u0635\u0623
extends IIOMetadata {
    static final int UNDEFINED_INTEGER_VALUE = -1;

    @Override
    public void mergeTree(String formatName, Node root) throws IIOInvalidTreeException {
        if (formatName.equals(this.nativeMetadataFormatName)) {
            if (root == null) {
                throw new IllegalArgumentException("root == null!");
            }
            this.mergeNativeTree(root);
        } else if (formatName.equals("javax_imageio_1.0")) {
            if (root == null) {
                throw new IllegalArgumentException("root == null!");
            }
            this.mergeStandardTree(root);
        } else {
            throw new IllegalArgumentException("Not a recognized format!");
        }
    }

    protected abstract void mergeStandardTree(Node var1) throws IIOInvalidTreeException;

    protected static float getFloatAttribute(Node node, String name, float defaultValue, boolean required) throws IIOInvalidTreeException {
        String value = \u0635\u0623.getStringAttribute(node, name, null, required, null);
        if (value == null) {
            return defaultValue;
        }
        return Float.parseFloat(value);
    }

    /*
     * WARNING - void declaration
     */
    protected static int getIntAttribute(Node node, String name, int defaultValue, boolean required, boolean bounded, int min, int max) throws IIOInvalidTreeException {
        void var8_8;
        String value;
        block7: {
            block6: {
                value = \u0635\u0623.getStringAttribute(node, name, null, required, null);
                if (value == null) break block6;
                if (!value.isEmpty()) break block7;
            }
            return defaultValue;
        }
        int intValue = defaultValue;
        try {
            intValue = Integer.parseInt(value);
        }
        catch (NumberFormatException e) {
            \u0635\u0623.fatal(node, "Bad value for " + node.getNodeName() + " attribute " + name + "!");
        }
        if (bounded && (intValue < min || intValue > max)) {
            \u0635\u0623.fatal(node, "Bad value for " + node.getNodeName() + " attribute " + name + "!");
        }
        return (int)var8_8;
    }

    protected static int getEnumeratedAttribute(Node node, String name, String[] legalNames, int defaultValue, boolean required) throws IIOInvalidTreeException {
        Node attr = node.getAttributes().getNamedItem(name);
        if (attr == null) {
            if (!required) {
                return defaultValue;
            }
            \u0635\u0623.fatal(node, "Required attribute " + name + " not present!");
        }
        String value = attr.getNodeValue();
        for (int i = 0; i < legalNames.length; ++i) {
            if (!value.equals(legalNames[i])) continue;
            return i;
        }
        \u0635\u0623.fatal(node, "Illegal value for attribute " + name + "!");
        return -1;
    }

    protected \u0635\u0623(boolean standardMetadataFormatSupported, String nativeMetadataFormatName, String nativeMetadataFormatClassName, String[] extraMetadataFormatNames, String[] extraMetadataFormatClassNames) {
        super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
    }

    protected static String getAttribute(Node node, String name, String defaultValue, boolean required) throws IIOInvalidTreeException {
        Node attr = node.getAttributes().getNamedItem(name);
        if (attr == null) {
            if (!required) {
                return defaultValue;
            }
            \u0635\u0623.fatal(node, "Required attribute " + name + " not present!");
        }
        return attr.getNodeValue();
    }

    protected abstract void mergeNativeTree(Node var1) throws IIOInvalidTreeException;

    protected static boolean getBooleanAttribute(Node node, String name, boolean defaultValue, boolean required) throws IIOInvalidTreeException {
        block11: {
            block10: {
                String value;
                block9: {
                    block8: {
                        Node attr = node.getAttributes().getNamedItem(name);
                        if (attr == null) {
                            if (!required) {
                                return defaultValue;
                            }
                            \u0635\u0623.fatal(node, "Required attribute " + name + " not present!");
                        }
                        if ((value = attr.getNodeValue()).equals("TRUE")) break block8;
                        if (!value.equals("true")) break block9;
                    }
                    return true;
                }
                if (value.equals("FALSE")) break block10;
                if (!value.equals("false")) break block11;
            }
            return false;
        }
        \u0635\u0623.fatal(node, "Attribute " + name + " must be 'TRUE' or 'FALSE'!");
        return false;
    }

    protected static float getFloatAttribute(Node node, String name) throws IIOInvalidTreeException {
        return \u0635\u0623.getFloatAttribute(node, name, -1.0f, true);
    }

    protected static int getEnumeratedAttribute(Node node, String name, String[] legalNames) throws IIOInvalidTreeException {
        return \u0635\u0623.getEnumeratedAttribute(node, name, legalNames, -1, true);
    }

    /*
     * WARNING - void declaration
     */
    protected byte[] getColorTable(Node colorTableNode, String entryNodeName, boolean lengthExpected, int expectedLength) throws IIOInvalidTreeException {
        void var11_11;
        byte[] red = new byte[256];
        byte[] green = new byte[256];
        byte[] blue = new byte[256];
        int maxIndex = -1;
        Node entry = colorTableNode.getFirstChild();
        if (entry == null) {
            \u0635\u0623.fatal(colorTableNode, "Palette has no entries!");
        }
        while (entry != null) {
            if (!entry.getNodeName().equals(entryNodeName)) {
                \u0635\u0623.fatal(colorTableNode, "Only a " + entryNodeName + " may be a child of a " + entry.getNodeName() + "!");
            }
            int index = \u0635\u0623.getIntAttribute(entry, "index", true, 0, 255);
            if (index > maxIndex) {
                maxIndex = index;
            }
            red[index] = (byte)\u0635\u0623.getIntAttribute(entry, "red", true, 0, 255);
            green[index] = (byte)\u0635\u0623.getIntAttribute(entry, "green", true, 0, 255);
            blue[index] = (byte)\u0635\u0623.getIntAttribute(entry, "blue", true, 0, 255);
            entry = entry.getNextSibling();
        }
        int numEntries = maxIndex + 1;
        if (lengthExpected && numEntries != expectedLength) {
            \u0635\u0623.fatal(colorTableNode, "Unexpected length for palette!");
        }
        byte[] colorTable = new byte[3 * numEntries];
        int i = 0;
        int j = 0;
        while (i < numEntries) {
            void var12_12;
            void var7_7;
            void var13_13;
            colorTable[j++] = red[i];
            colorTable[j++] = green[i];
            ++var13_13;
            colorTable[j] = var7_7[var12_12];
            ++var12_12;
        }
        return var11_11;
    }

    protected static String getAttribute(Node node, String name) throws IIOInvalidTreeException {
        return \u0635\u0623.getAttribute(node, name, null, true);
    }

    protected static int getIntAttribute(Node node, String name, boolean bounded, int min, int max) throws IIOInvalidTreeException {
        return \u0635\u0623.getIntAttribute(node, name, -1, true, bounded, min, max);
    }

    protected static boolean getBooleanAttribute(Node node, String name) throws IIOInvalidTreeException {
        return \u0635\u0623.getBooleanAttribute(node, name, false, true);
    }

    /*
     * WARNING - void declaration
     */
    protected static String getStringAttribute(Node node, String name, String defaultValue, boolean required, String[] range) throws IIOInvalidTreeException {
        void var6_6;
        Node attr = node.getAttributes().getNamedItem(name);
        if (attr == null) {
            if (!required) {
                return defaultValue;
            }
            \u0635\u0623.fatal(node, "Required attribute " + name + " not present!");
        }
        String value = attr.getNodeValue();
        if (range != null) {
            if (value == null) {
                \u0635\u0623.fatal(node, "Null value for " + node.getNodeName() + " attribute " + name + "!");
            }
            boolean validValue = false;
            String[] stringArray = range;
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                String s = stringArray[i];
                if (!value.equals(s)) continue;
                validValue = true;
                break;
            }
            if (!validValue) {
                \u0635\u0623.fatal(node, "Bad value for " + node.getNodeName() + " attribute " + name + "!");
            }
        }
        return var6_6;
    }

    protected static void fatal(Node node, String reason) throws IIOInvalidTreeException {
        throw new IIOInvalidTreeException(reason, node);
    }
}

