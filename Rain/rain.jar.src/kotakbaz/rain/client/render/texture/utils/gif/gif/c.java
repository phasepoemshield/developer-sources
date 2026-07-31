/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.utils.gif.gif;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

abstract class c
extends IIOMetadata {
    static final int p = -1;
    private static Object[] a;

    protected static void fatal(Node node, String reason) {
        throw new IIOInvalidTreeException(reason, node);
    }

    protected static String getStringAttribute(Node node, String name, String defaultValue, boolean required, String[] range) {
        long l2 = 4779731616400823022L;
        long l3 = 465479388001285939L;
        long l4 = -6331425114045007769L;
        long l5 = 8700298058892351095L;
        long l6 = -7716134771974149620L;
        Node node2 = node.getAttributes().getNamedItem(name);
        if (node2 == null) {
            if (!required) {
                return defaultValue;
            }
            String string = name;
            int n2 = -212;
            n2 += 122;
            int n3 = 36;
            n3 -= 48;
            c.fatal(node, (String)a[n2 ^= 0xFFFFFFA5] + string + (String)a[n3 -= -22]);
        }
        String string = node2.getNodeValue();
        if (range != null) {
            if (string == null) {
                String string2 = name;
                String string3 = node.getNodeName();
                int n4 = -31;
                n4 ^= 0xFFFFFFDC;
                int n5 = 74;
                n5 += -84;
                int n6 = -186;
                n6 += 102;
                c.fatal(node, (String)a[n4 -= 28] + string3 + (String)a[n5 += 39] + string2 + (String)a[n6 ^= 0xFFFFFF84]);
            }
            long l7 = l6;
            int n7 = 171;
            n7 += -84;
            l6 = l7 ^ (0L ^ l7) & -1L << (n7 -= 55);
            String[] stringArray = range;
            int n8 = 48;
            n8 += -111;
            long l8 = l4;
            int n9 = -20;
            n9 ^= 0xFFFFFFC6;
            l4 = l8 ^ ((long)stringArray.length << (n8 -= -95) ^ l8) & -1L << (n9 ^= 0xA);
            long l9 = l5;
            int n10 = 175;
            n10 += -83;
            l5 = l9 ^ (0L ^ l9) & -1L >>> (n10 -= 60);
            while (true) {
                int n11 = -82;
                n11 += 82;
                if ((int)l5 >= (int)(l4 >>> (n11 -= -32))) break;
                String string4 = stringArray[(int)l5];
                if (string.equals(string4)) {
                    long l10 = l6;
                    int n12 = 165;
                    n12 += -118;
                    l6 = l10 ^ (0x100000000L ^ l10) & -1L << (n12 -= 15);
                    break;
                }
                long l11 = l5;
                int n13 = -21;
                n13 -= -17;
                int n14 = 18;
                n14 ^= 0x35;
                l5 = l11 ^ (l11 ^ l11 + (long)(n13 -= -5)) & -1L >>> (n14 -= 7);
            }
            int n15 = 113;
            n15 -= 32;
            if ((int)(l6 >>> (n15 -= 49)) == 0) {
                String string5 = name;
                String string6 = node.getNodeName();
                int n16 = -130;
                n16 ^= 0xFFFFFFEC;
                int n17 = 126;
                n17 += -1;
                int n18 = -133;
                n18 -= -94;
                c.fatal(node, (String)a[n16 += -119] + string6 + (String)a[n17 ^= 0x5E] + string5 + (String)a[n18 += 61]);
            }
        }
        return string;
    }

    protected static int getIntAttribute(Node node, String name, int defaultValue, boolean required, boolean bounded, int min, int max) {
        long l2;
        block6: {
            block7: {
                long l3 = 4254664004823423652L;
                long l4 = -77646276016649690L;
                l2 = -8438359525949243547L;
                String string = c.getStringAttribute(node, name, null, required, null);
                if (string == null || string.isEmpty()) {
                    return defaultValue;
                }
                int n2 = -41;
                n2 += -5;
                long l5 = l2;
                int n3 = -110;
                n3 += 84;
                l2 = l5 ^ ((long)defaultValue << (n2 ^= 0xFFFFFFF2) ^ l5) & -1L << (n3 -= -58);
                try {
                    int n4 = -226;
                    n4 += 100;
                    long l6 = l2;
                    int n5 = -32;
                    n5 -= -36;
                    l2 = l6 ^ ((long)Integer.parseInt(string) << (n4 ^= 0xFFFFFFA2) ^ l6) & -1L << (n5 += 28);
                }
                catch (NumberFormatException numberFormatException) {
                    String string2 = name;
                    String string3 = node.getNodeName();
                    int n6 = 100;
                    n6 -= -21;
                    int n7 = 42;
                    n7 ^= 0x22;
                    int n8 = 83;
                    n8 += 20;
                    c.fatal(node, (String)a[n6 ^= 0x6B] + string3 + (String)a[n7 += 31] + string2 + (String)a[n8 -= 89]);
                }
                if (!bounded) break block6;
                int n9 = -119;
                n9 += 71;
                if ((int)(l2 >>> (n9 -= -80)) < min) break block7;
                int n10 = -99;
                n10 -= -39;
                if ((int)(l2 >>> (n10 ^= 0xFFFFFFE4)) <= max) break block6;
            }
            String string = name;
            String string4 = node.getNodeName();
            int n11 = 12;
            n11 += -39;
            int n12 = 199;
            n12 -= 118;
            int n13 = 28;
            n13 -= -9;
            c.fatal(node, (String)a[n11 += 31] + string4 + (String)a[n12 += -80] + string + (String)a[n13 -= 28]);
        }
        int n14 = 91;
        n14 ^= 0xFFFFFFFA;
        return (int)(l2 >>> (n14 -= -127));
    }

    protected static float getFloatAttribute(Node node, String name, float defaultValue, boolean required) {
        String string = c.getStringAttribute(node, name, null, required, null);
        if (string == null) {
            return defaultValue;
        }
        return Float.parseFloat(string);
    }

    protected static int getIntAttribute(Node node, String name, boolean bounded, int min, int max) {
        int n2 = 127;
        n2 -= 36;
        int n3 = 46;
        n3 = n3 - 98;
        boolean bl2 = n3 - -53;
        return c.getIntAttribute(node, name, n2 -= 92, bl2, bounded, min, max);
    }

    protected static float getFloatAttribute(Node node, String name) {
        int n2 = -178;
        n2 = n2 - -97;
        boolean bl2 = n2 - -82;
        return c.getFloatAttribute(node, name, -1.0f, bl2);
    }

    protected static boolean getBooleanAttribute(Node node, String name, boolean defaultValue, boolean required) {
        block11: {
            block10: {
                String string;
                block9: {
                    block8: {
                        Node node2 = node.getAttributes().getNamedItem(name);
                        if (node2 == null) {
                            if (!required) {
                                return defaultValue;
                            }
                            String string2 = name;
                            int n2 = -177;
                            n2 -= -102;
                            int n3 = -70;
                            n3 -= -82;
                            c.fatal(node, (String)a[n2 -= -88] + string2 + (String)a[n3 -= -11]);
                        }
                        string = node2.getNodeValue();
                        int n4 = 90;
                        n4 ^= 0x15;
                        if (string.equals((String)a[n4 -= 55])) break block8;
                        int n5 = -196;
                        n5 += 68;
                        if (!string.equals((String)a[n5 ^= 0xFFFFFF95])) break block9;
                    }
                    int n2 = -65;
                    n2 = n2 - -97;
                    boolean bl2 = n2 - 31;
                    return bl2;
                }
                int n3 = -12;
                n3 ^= 0xFFFFFFDB;
                if (string.equals((String)a[n3 ^= 0xA])) break block10;
                int n4 = 14;
                n4 ^= 0x72;
                if (!string.equals((String)a[n4 += -124])) break block11;
            }
            int n6 = -66;
            n6 = n6 ^ 0x66;
            boolean bl = n6 - -40;
            return bl;
        }
        String string = name;
        int n7 = 85;
        n7 -= 35;
        int n8 = 228;
        n8 ^= 0x66;
        c.fatal(node, (String)a[n7 -= 30] + string + (String)a[n8 += -125]);
        int n10 = -97;
        n10 = n10 ^ 2;
        boolean bl = n10 + 99;
        return bl;
    }

    protected static boolean getBooleanAttribute(Node node, String name) {
        int n2 = -13;
        n2 = n2 + -66;
        boolean bl2 = n2 ^ 0xFFFFFFB1;
        int n4 = -9;
        n4 = n4 ^ 0xFFFFFF8C;
        boolean bl3 = n4 ^ 0x7A;
        return c.getBooleanAttribute(node, name, bl2, bl3);
    }

    protected static int getEnumeratedAttribute(Node node, String name, String[] legalNames, int defaultValue, boolean required) {
        long l2 = 6176283905371736184L;
        long l3 = -1373412256888557872L;
        long l4 = -6542225754739852689L;
        Node node2 = node.getAttributes().getNamedItem(name);
        if (node2 == null) {
            if (!required) {
                return defaultValue;
            }
            String string = name;
            int n2 = 96;
            n2 ^= 0xFFFFFFE8;
            int n3 = -104;
            n3 ^= 0x4A;
            c.fatal(node, (String)a[n2 ^= 0xFFFFFF96] + string + (String)a[n3 ^= 0xFFFFFFC3]);
        }
        String string = node2.getNodeValue();
        long l5 = l4;
        int n4 = 23;
        n4 ^= 0xFFFFFFBC;
        l4 = l5 ^ (0L ^ l5) & -1L << (n4 ^= 0xFFFFFF8B);
        while (true) {
            int n5 = 172;
            n5 -= 68;
            if ((int)(l4 >>> (n5 ^= 0x48)) >= legalNames.length) break;
            int n6 = 142;
            n6 += -33;
            if (string.equals(legalNames[(int)(l4 >>> (n6 -= 77))])) {
                int n7 = -80;
                n7 ^= 0x76;
                return (int)(l4 >>> (n7 += 90));
            }
            l4 += 0x100000000L;
        }
        String string2 = name;
        int n8 = 11;
        n8 -= -74;
        int n9 = 4;
        n9 -= -123;
        c.fatal(node, (String)a[n8 += -79] + string2 + (String)a[n9 ^= 0x6F]);
        int n10 = 48;
        n10 ^= 0x31;
        return n10 -= 2;
    }

    protected static int getEnumeratedAttribute(Node node, String name, String[] legalNames) {
        int n2 = 111;
        n2 -= -12;
        int n3 = -70;
        n3 = n3 - 52;
        boolean bl2 = n3 ^ 0xFFFFFF87;
        return c.getEnumeratedAttribute(node, name, legalNames, n2 += -124, bl2);
    }

    protected static String getAttribute(Node node, String name, String defaultValue, boolean required) {
        Node node2 = node.getAttributes().getNamedItem(name);
        if (node2 == null) {
            if (!required) {
                return defaultValue;
            }
            String string = name;
            int n2 = 50;
            n2 += 53;
            int n3 = -86;
            n3 += 104;
            c.fatal(node, (String)a[n2 ^= 0x7E] + string + (String)a[n3 ^= 0x1A]);
        }
        return node2.getNodeValue();
    }

    protected static String getAttribute(Node node, String name) {
        int n2 = -123;
        n2 = n2 - -36;
        boolean bl2 = n2 - -88;
        return c.getAttribute(node, name, null, bl2);
    }

    protected c(boolean standardMetadataFormatSupported, String nativeMetadataFormatName, String nativeMetadataFormatClassName, String[] extraMetadataFormatNames, String[] extraMetadataFormatClassNames) {
        super(standardMetadataFormatSupported, nativeMetadataFormatName, nativeMetadataFormatClassName, extraMetadataFormatNames, extraMetadataFormatClassNames);
    }

    @Override
    public void mergeTree(String formatName, Node root) {
        if (formatName.equals(this.nativeMetadataFormatName)) {
            if (root == null) {
                int n2 = -25;
                n2 += 70;
                throw new IllegalArgumentException((String)a[n2 -= 26]);
            }
            this.mergeNativeTree(root);
        } else {
            int n3 = -49;
            n3 += -40;
            if (formatName.equals((String)a[n3 -= -96])) {
                if (root == null) {
                    int n4 = 148;
                    n4 ^= 2;
                    throw new IllegalArgumentException((String)a[n4 -= 116]);
                }
                this.mergeStandardTree(root);
            } else {
                int n5 = -6;
                n5 += 96;
                throw new IllegalArgumentException((String)a[n5 ^= 0x58]);
            }
        }
    }

    protected byte[] getColorTable(Node colorTableNode, String entryNodeName, boolean lengthExpected, int expectedLength) {
        long l2 = -2233931740140570954L;
        long l3 = 6536627083077665431L;
        long l4 = -7274587725953925317L;
        long l5 = 1801318560912882513L;
        long l6 = 8306125966530909864L;
        long l7 = -93953508870301501L;
        long l8 = 1763880959273477759L;
        long l9 = 8652094748171433487L;
        long l10 = -7026805346313050673L;
        long l11 = 2211784562283528646L;
        long l12 = -872049227468497718L;
        long l13 = 4547170474446667166L;
        long l14 = 8220853045689879956L;
        long l15 = -7324436018970753693L;
        int n2 = -259;
        n2 ^= 0xFFFFFFE2;
        byte[] byArray = new byte[n2 ^= 0x1F];
        int n3 = 239;
        n3 += -91;
        byte[] byArray2 = new byte[n3 += 108];
        int n4 = 209;
        n4 -= -100;
        byte[] byArray3 = new byte[n4 ^= 0x35];
        long l16 = l12;
        int n5 = -10;
        n5 -= -19;
        l12 = l16 ^ (0xFFFFFFFFFFFFFFFFL ^ l16) & -1L >>> (n5 ^= 0x29);
        Node node = colorTableNode.getFirstChild();
        if (node == null) {
            int n6 = 12;
            n6 += -36;
            c.fatal(colorTableNode, (String)a[n6 += 55]);
        }
        while (node != null) {
            if (!node.getNodeName().equals(entryNodeName)) {
                String string = node.getNodeName();
                String string2 = entryNodeName;
                int n7 = 54;
                n7 -= 82;
                int n8 = 194;
                n8 -= 86;
                int n9 = 101;
                n9 += -110;
                c.fatal(colorTableNode, (String)a[n7 -= -56] + string2 + (String)a[n8 ^= 0x48] + string + (String)a[n9 ^= 0xFFFFFFD1]);
            }
            int n10 = -78;
            n10 ^= 0xFFFFFFAC;
            n10 -= 4;
            boolean bl = 117 != 0;
            bl ^= 0x5B;
            bl -= 45;
            int n11 = -60;
            n11 ^= 0xFFFFFFFA;
            n11 ^= 0x3E;
            int n12 = 324;
            n12 -= 112;
            n12 += 43;
            int n13 = -13;
            n13 -= -67;
            long l17 = l14;
            int n14 = 8;
            n14 -= -97;
            l14 = l17 ^ ((long)c.getIntAttribute(node, (String)a[n10], bl, n11, n12) << (n13 -= 22) ^ l17) & -1L << (n14 ^= 0x49);
            int n15 = -79;
            n15 ^= 0xFFFFFFB7;
            if ((int)(l14 >>> (n15 -= -26)) > (int)l12) {
                int n16 = -109;
                n16 ^= 0x37;
                long l18 = l12;
                int n17 = -55;
                n17 -= -39;
                l12 = l18 ^ ((long)((int)(l14 >>> (n16 ^= 0xFFFFFF84))) ^ l18) & -1L >>> (n17 ^= 0xFFFFFFD0);
            }
            int n18 = -157;
            n18 -= -115;
            n18 += 74;
            int n19 = -27;
            n19 += 80;
            n19 -= 21;
            boolean bl2 = 93 != 0;
            bl2 ^= 0x31;
            int n20 = 176;
            n20 -= 55;
            int n21 = 205;
            n21 -= 43;
            byArray[(int)(l14 >>> n18)] = (byte)c.getIntAttribute(node, (String)a[n19], bl2 += -107, n20 -= 121, n21 ^= 0x5D);
            int n22 = 131;
            n22 -= 69;
            n22 += -30;
            int n23 = -15;
            n23 -= 84;
            n23 ^= 0xFFFFFF96;
            boolean bl3 = 33 != 0;
            bl3 -= -31;
            int n24 = 29;
            n24 += -100;
            int n25 = 21;
            n25 -= -113;
            byArray2[(int)(l14 >>> n22)] = (byte)c.getIntAttribute(node, (String)a[n23], bl3 -= 63, n24 -= -71, n25 ^= 0x79);
            int n26 = -115;
            n26 ^= 0xFFFFFFC7;
            n26 -= 42;
            int n27 = 60;
            n27 += 40;
            n27 ^= 0x6B;
            boolean bl4 = 135 != 0;
            bl4 += -107;
            int n28 = 4;
            n28 -= -41;
            int n29 = -201;
            ++n29;
            byArray3[(int)(l14 >>> n26)] = (byte)c.getIntAttribute(node, (String)a[n27], bl4 ^= 0x1D, n28 ^= 0x2D, n29 ^= 0xFFFFFFC7);
            node = node.getNextSibling();
        }
        int n30 = -96;
        n30 -= -38;
        n30 += 59;
        int n31 = -137;
        n31 -= -123;
        long l19 = l14;
        int n32 = -64;
        n32 ^= 0x36;
        l14 = l19 ^ ((long)((int)l12 + n30) << (n31 += 46) ^ l19) & -1L << (n32 -= -42);
        if (lengthExpected) {
            int n33 = -40;
            n33 ^= 0xFFFFFFBE;
            if ((int)(l14 >>> (n33 -= 70)) != expectedLength) {
                int n34 = 51;
                n34 -= -55;
                c.fatal(colorTableNode, (String)a[n34 -= 94]);
            }
        }
        int n35 = 18;
        n35 -= 67;
        int n36 = 161;
        n36 -= 86;
        byte[] byArray4 = new byte[(n35 += 52) * (int)(l14 >>> (n36 += -43))];
        long l20 = l15;
        int n37 = 140;
        n37 += -67;
        long l21 = l15 = l20 ^ (0L ^ l20) & -1L >>> (n37 += -41);
        int n38 = -80;
        n38 ^= 0xFFFFFFFA;
        l15 = l21 ^ (0L ^ l21) & -1L << (n38 ^= 0x6A);
        while (true) {
            int n39 = 52;
            n39 ^= 0xFFFFFFC6;
            if ((int)l15 >= (int)(l14 >>> (n39 ^= 0xFFFFFFD2))) break;
            int n40 = 63;
            n40 += -79;
            byArray4[(int)(l15 >>> (n40 ^= 0xFFFFFFD0))] = byArray[(int)(l15 += 0x100000000L)];
            int n41 = -33;
            n41 -= -99;
            byArray4[(int)(l15 >>> (n41 -= 34))] = byArray2[(int)(l15 += 0x100000000L)];
            int n42 = -32;
            n42 ^= 0xFFFFFF8A;
            byArray4[(int)(l15 >>> (n42 -= 74))] = byArray3[(int)(l15 += 0x100000000L)];
            long l22 = l15;
            int n43 = -11;
            n43 += -65;
            int n44 = -115;
            n44 += 56;
            l15 = l22 ^ (l22 ^ l22 + (long)(n43 -= -77)) & -1L >>> (n44 -= -91);
        }
        return byArray4;
    }

    protected abstract void mergeNativeTree(Node var1);

    protected abstract void mergeStandardTree(Node var1);

    static {
        long l2 = 5572844065294620253L;
        long l3 = -6945840645479395029L;
        long l4 = 339577607291822257L;
        long l5 = 3249381371017815757L;
        long l6 = 5681443168455766542L;
        long l7 = 8052531673038745235L;
        long l8 = -4220679302106074698L;
        long l9 = -9057086385199554770L;
        long l10 = 172237201075353543L;
        long l11 = 5145243984204952810L;
        long l12 = 7665250236709501320L;
        long l13 = -4972174915845855198L;
        long l14 = 5608761279036466948L;
        long l15 = -5336544852840589579L;
        int n2 = 83;
        n2 ^= 1;
        a = new Object[n2 -= 41];
        long l16 = l15;
        int n3 = -156;
        n3 -= -114;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= -74);
        char[] cArray = "\u0000\u0005false\u0000\u000b attribute \u0000\u0018Not a recognized format!\u0000\u0013Required attribute \u0000\u000eBad value for \u0000\u001b must be 'TRUE' or 'FALSE'!\u0000\u001cIllegal value for attribute \u0000\u0011javax_imageio_1.0\u0000\r not present!\u0000\u0001!\u0000\r not present!\u0000\u0005green\u0000\u001eUnexpected length for palette!\u0000\u0013Required attribute \u0000\u0001!\u0000\u0004blue\u0000\u0001!\u0000\r not present!\u0000\u000eBad value for \u0000\rroot == null!\u0000\nAttribute \u0000\u0004true\u0000\u0001!\u0000\r not present!\u0000\u0004TRUE\u0000\u0013Required attribute \u0000\u0005index\u0000\u000eBad value for \u0000\u0007Only a \u0000\u000b attribute \u0000\u0013Required attribute \u0000\u0017Palette has no entries!\u0000\u0003red\u0000\u000fNull value for \u0000\rroot == null!\u0000\u000b attribute \u0000\u0015 may be a child of a \u0000\u0005FALSE\u0000\u0001!\u0000\u000b attribute \u0000\u0001!".toCharArray();
        long l17 = l6;
        int n4 = -47;
        n4 ^= 0x61;
        l6 = l17 ^ (0x23500000000L ^ l17) & -1L << (n4 ^= 0xFFFFFF90);
        long l18 = l13;
        int n5 = -31;
        n5 -= -59;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n5 ^= 0x3C);
        while (true) {
            int n6 = -11;
            n6 ^= 0x37;
            if ((int)l13 >= (int)(l6 >>> (n6 ^= 0xFFFFFFE2))) break;
            int n7 = (int)l13;
            long l19 = l13;
            int n8 = -103;
            n8 += -20;
            int n9 = -57;
            n9 -= -113;
            l13 = l19 ^ (l19 ^ l19 + (long)(n8 -= -124)) & -1L >>> (n9 ^= 0x18);
            long l20 = l9;
            int n10 = -39;
            n10 -= -83;
            l9 = l20 ^ ((long)cArray[n7] ^ l20) & -1L >>> (n10 -= 12);
            int n11 = (int)l13;
            long l21 = l13;
            int n12 = 241;
            n12 += -116;
            int n13 = 75;
            n13 += -1;
            l13 = l21 ^ (l21 ^ l21 + (long)(n12 -= 124)) & -1L >>> (n13 -= 42);
            int n14 = -40;
            n14 ^= 0xFFFFFFE5;
            long l22 = l10;
            int n15 = -71;
            n15 -= 3;
            l10 = l22 ^ ((long)cArray[n11] << (n14 += -29) ^ l22) & -1L << (n15 ^= 0xFFFFFF96);
            int n16 = 77;
            n16 ^= 0x11;
            n16 += -76;
            int n17 = -128;
            n17 += 36;
            long l23 = l12;
            int n18 = -104;
            --n18;
            l12 = l23 ^ ((long)((int)l9 << n16 | (int)(l10 >>> (n17 ^= 0xFFFFFF84))) ^ l23) & -1L >>> (n18 ^= 0xFFFFFFB7);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n19 = 54;
            n19 ^= 0x63;
            l14 = l24 ^ (0L ^ l24) & -1L << (n19 += -53);
            while (true) {
                int n20 = 46;
                n20 += 16;
                if ((int)(l14 >>> (n20 += -30)) >= (int)l12) break;
                int n21 = 137;
                n21 += -42;
                int n22 = 6;
                n22 -= 67;
                cArray2[(int)(l14 >>> (n21 += -63))] = cArray[(int)l13 + (int)(l14 >>> (n22 -= -93))];
                l14 += 0x100000000L;
            }
            int n23 = -11;
            n23 -= -71;
            int n24 = (int)(l15 >>> (n23 ^= 0x1C));
            l15 += 0x100000000L;
            c.a[n24] = new String(cArray2);
            long l25 = l13;
            int n25 = -27;
            n25 ^= 0xFFFFFFC8;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n25 ^= 0xD);
        }
    }
}

