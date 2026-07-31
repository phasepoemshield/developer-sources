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

    protected static void fatal(Node node, String string) {
        throw new IIOInvalidTreeException(string, node);
    }

    protected static String getStringAttribute(Node node, String string, String string2, boolean bl, String[] stringArray) {
        long l = 4779731616400823022L;
        long l2 = 465479388001285939L;
        long l3 = -6331425114045007769L;
        long l4 = 8700298058892351095L;
        long l5 = -7716134771974149620L;
        Node node2 = node.getAttributes().getNamedItem(string);
        if (node2 == null) {
            if (!bl) {
                return string2;
            }
            String string3 = string;
            int n = -212;
            n += 122;
            int n2 = 36;
            n2 -= 48;
            c.fatal(node, (String)a[n ^= 0xFFFFFFA5] + string3 + (String)a[n2 -= -22]);
        }
        String string4 = node2.getNodeValue();
        if (stringArray != null) {
            if (string4 == null) {
                String string5 = string;
                String string6 = node.getNodeName();
                int n = -31;
                n ^= 0xFFFFFFDC;
                int n3 = 74;
                n3 += -84;
                int n4 = -186;
                n4 += 102;
                c.fatal(node, (String)a[n -= 28] + string6 + (String)a[n3 += 39] + string5 + (String)a[n4 ^= 0xFFFFFF84]);
            }
            long l6 = l5;
            int n = 171;
            n += -84;
            l5 = l6 ^ (0L ^ l6) & -1L << (n -= 55);
            String[] stringArray2 = stringArray;
            int n5 = 48;
            n5 += -111;
            long l7 = l3;
            int n6 = -20;
            n6 ^= 0xFFFFFFC6;
            l3 = l7 ^ ((long)stringArray2.length << (n5 -= -95) ^ l7) & -1L << (n6 ^= 0xA);
            long l8 = l4;
            int n7 = 175;
            n7 += -83;
            l4 = l8 ^ (0L ^ l8) & -1L >>> (n7 -= 60);
            while (true) {
                int n8 = -82;
                n8 += 82;
                if ((int)l4 >= (int)(l3 >>> (n8 -= -32))) break;
                String string7 = stringArray2[(int)l4];
                if (string4.equals(string7)) {
                    long l9 = l5;
                    int n9 = 165;
                    n9 += -118;
                    l5 = l9 ^ (0x100000000L ^ l9) & -1L << (n9 -= 15);
                    break;
                }
                long l10 = l4;
                int n10 = -21;
                n10 -= -17;
                int n11 = 18;
                n11 ^= 0x35;
                l4 = l10 ^ (l10 ^ l10 + (long)(n10 -= -5)) & -1L >>> (n11 -= 7);
            }
            int n12 = 113;
            n12 -= 32;
            if ((int)(l5 >>> (n12 -= 49)) == 0) {
                String string8 = string;
                String string9 = node.getNodeName();
                int n13 = -130;
                n13 ^= 0xFFFFFFEC;
                int n14 = 126;
                n14 += -1;
                int n15 = -133;
                n15 -= -94;
                c.fatal(node, (String)a[n13 += -119] + string9 + (String)a[n14 ^= 0x5E] + string8 + (String)a[n15 += 61]);
            }
        }
        return string4;
    }

    protected static int getIntAttribute(Node node, String string, int n, boolean bl, boolean bl2, int n2, int n3) {
        long l;
        block6: {
            block7: {
                long l2 = 4254664004823423652L;
                long l3 = -77646276016649690L;
                l = -8438359525949243547L;
                String string2 = c.getStringAttribute(node, string, null, bl, null);
                if (string2 == null || string2.isEmpty()) {
                    return n;
                }
                int n4 = -41;
                n4 += -5;
                long l4 = l;
                int n5 = -110;
                n5 += 84;
                l = l4 ^ ((long)n << (n4 ^= 0xFFFFFFF2) ^ l4) & -1L << (n5 -= -58);
                try {
                    int n6 = -226;
                    n6 += 100;
                    long l5 = l;
                    int n7 = -32;
                    n7 -= -36;
                    l = l5 ^ ((long)Integer.parseInt(string2) << (n6 ^= 0xFFFFFFA2) ^ l5) & -1L << (n7 += 28);
                }
                catch (NumberFormatException numberFormatException) {
                    String string3 = string;
                    String string4 = node.getNodeName();
                    int n8 = 100;
                    n8 -= -21;
                    int n9 = 42;
                    n9 ^= 0x22;
                    int n10 = 83;
                    n10 += 20;
                    c.fatal(node, (String)a[n8 ^= 0x6B] + string4 + (String)a[n9 += 31] + string3 + (String)a[n10 -= 89]);
                }
                if (!bl2) break block6;
                int n11 = -119;
                n11 += 71;
                if ((int)(l >>> (n11 -= -80)) < n2) break block7;
                int n12 = -99;
                n12 -= -39;
                if ((int)(l >>> (n12 ^= 0xFFFFFFE4)) <= n3) break block6;
            }
            String string5 = string;
            String string6 = node.getNodeName();
            int n13 = 12;
            n13 += -39;
            int n14 = 199;
            n14 -= 118;
            int n15 = 28;
            n15 -= -9;
            c.fatal(node, (String)a[n13 += 31] + string6 + (String)a[n14 += -80] + string5 + (String)a[n15 -= 28]);
        }
        int n16 = 91;
        n16 ^= 0xFFFFFFFA;
        return (int)(l >>> (n16 -= -127));
    }

    protected static float getFloatAttribute(Node node, String string, float f2, boolean bl) {
        String string2 = c.getStringAttribute(node, string, null, bl, null);
        if (string2 == null) {
            return f2;
        }
        return Float.parseFloat(string2);
    }

    protected static int getIntAttribute(Node node, String string, boolean bl, int n, int n2) {
        int n3 = 127;
        n3 -= 36;
        int n4 = 46;
        n4 = n4 - 98;
        boolean bl3 = n4 - -53;
        return c.getIntAttribute(node, string, n3 -= 92, bl3, bl, n, n2);
    }

    protected static float getFloatAttribute(Node node, String string) {
        int n = -178;
        n = n - -97;
        boolean bl2 = n - -82;
        return c.getFloatAttribute(node, string, -1.0f, bl2);
    }

    protected static boolean getBooleanAttribute(Node node, String string, boolean bl, boolean bl2) {
        block11: {
            block10: {
                String string2;
                block9: {
                    block8: {
                        Node node2 = node.getAttributes().getNamedItem(string);
                        if (node2 == null) {
                            if (!bl2) {
                                return bl;
                            }
                            String string3 = string;
                            int n = -177;
                            n -= -102;
                            int n2 = -70;
                            n2 -= -82;
                            c.fatal(node, (String)a[n -= -88] + string3 + (String)a[n2 -= -11]);
                        }
                        string2 = node2.getNodeValue();
                        int n = 90;
                        n ^= 0x15;
                        if (string2.equals((String)a[n -= 55])) break block8;
                        int n3 = -196;
                        n3 += 68;
                        if (!string2.equals((String)a[n3 ^= 0xFFFFFF95])) break block9;
                    }
                    int n = -65;
                    n = n - -97;
                    boolean bl4 = n - 31;
                    return bl4;
                }
                int n = -12;
                n ^= 0xFFFFFFDB;
                if (string2.equals((String)a[n ^= 0xA])) break block10;
                int n2 = 14;
                n2 ^= 0x72;
                if (!string2.equals((String)a[n2 += -124])) break block11;
            }
            int n3 = -66;
            n3 = n3 ^ 0x66;
            boolean bl5 = n3 - -40;
            return bl5;
        }
        String string2 = string;
        int n = 85;
        n -= 35;
        int n4 = 228;
        n4 ^= 0x66;
        c.fatal(node, (String)a[n -= 30] + string2 + (String)a[n4 += -125]);
        int n6 = -97;
        n6 = n6 ^ 2;
        boolean bl6 = n6 + 99;
        return bl6;
    }

    protected static boolean getBooleanAttribute(Node node, String string) {
        int n = -13;
        n = n + -66;
        boolean bl2 = n ^ 0xFFFFFFB1;
        int n3 = -9;
        n3 = n3 ^ 0xFFFFFF8C;
        boolean bl3 = n3 ^ 0x7A;
        return c.getBooleanAttribute(node, string, bl2, bl3);
    }

    protected static int getEnumeratedAttribute(Node node, String string, String[] stringArray, int n, boolean bl) {
        long l = 6176283905371736184L;
        long l2 = -1373412256888557872L;
        long l3 = -6542225754739852689L;
        Node node2 = node.getAttributes().getNamedItem(string);
        if (node2 == null) {
            if (!bl) {
                return n;
            }
            String string2 = string;
            int n2 = 96;
            n2 ^= 0xFFFFFFE8;
            int n3 = -104;
            n3 ^= 0x4A;
            c.fatal(node, (String)a[n2 ^= 0xFFFFFF96] + string2 + (String)a[n3 ^= 0xFFFFFFC3]);
        }
        String string3 = node2.getNodeValue();
        long l4 = l3;
        int n4 = 23;
        n4 ^= 0xFFFFFFBC;
        l3 = l4 ^ (0L ^ l4) & -1L << (n4 ^= 0xFFFFFF8B);
        while (true) {
            int n5 = 172;
            n5 -= 68;
            if ((int)(l3 >>> (n5 ^= 0x48)) >= stringArray.length) break;
            int n6 = 142;
            n6 += -33;
            if (string3.equals(stringArray[(int)(l3 >>> (n6 -= 77))])) {
                int n7 = -80;
                n7 ^= 0x76;
                return (int)(l3 >>> (n7 += 90));
            }
            l3 += 0x100000000L;
        }
        String string4 = string;
        int n8 = 11;
        n8 -= -74;
        int n9 = 4;
        n9 -= -123;
        c.fatal(node, (String)a[n8 += -79] + string4 + (String)a[n9 ^= 0x6F]);
        int n10 = 48;
        n10 ^= 0x31;
        return n10 -= 2;
    }

    protected static int getEnumeratedAttribute(Node node, String string, String[] stringArray) {
        int n = 111;
        n -= -12;
        int n2 = -70;
        n2 = n2 - 52;
        boolean bl2 = n2 ^ 0xFFFFFF87;
        return c.getEnumeratedAttribute(node, string, stringArray, n += -124, bl2);
    }

    protected static String getAttribute(Node node, String string, String string2, boolean bl) {
        Node node2 = node.getAttributes().getNamedItem(string);
        if (node2 == null) {
            if (!bl) {
                return string2;
            }
            String string3 = string;
            int n = 50;
            n += 53;
            int n2 = -86;
            n2 += 104;
            c.fatal(node, (String)a[n ^= 0x7E] + string3 + (String)a[n2 ^= 0x1A]);
        }
        return node2.getNodeValue();
    }

    protected static String getAttribute(Node node, String string) {
        int n = -123;
        n = n - -36;
        boolean bl2 = n - -88;
        return c.getAttribute(node, string, null, bl2);
    }

    protected c(boolean bl, String string, String string2, String[] stringArray, String[] stringArray2) {
        super(bl, string, string2, stringArray, stringArray2);
    }

    @Override
    public void mergeTree(String string, Node node) {
        if (string.equals(this.nativeMetadataFormatName)) {
            if (node == null) {
                int n = -25;
                n += 70;
                throw new IllegalArgumentException((String)a[n -= 26]);
            }
            this.mergeNativeTree(node);
        } else {
            int n = -49;
            n += -40;
            if (string.equals((String)a[n -= -96])) {
                if (node == null) {
                    int n2 = 148;
                    n2 ^= 2;
                    throw new IllegalArgumentException((String)a[n2 -= 116]);
                }
                this.mergeStandardTree(node);
            } else {
                int n3 = -6;
                n3 += 96;
                throw new IllegalArgumentException((String)a[n3 ^= 0x58]);
            }
        }
    }

    protected byte[] getColorTable(Node node, String string, boolean bl, int n) {
        long l = -2233931740140570954L;
        long l2 = 6536627083077665431L;
        long l3 = -7274587725953925317L;
        long l4 = 1801318560912882513L;
        long l5 = 8306125966530909864L;
        long l6 = -93953508870301501L;
        long l7 = 1763880959273477759L;
        long l8 = 8652094748171433487L;
        long l9 = -7026805346313050673L;
        long l10 = 2211784562283528646L;
        long l11 = -872049227468497718L;
        long l12 = 4547170474446667166L;
        long l13 = 8220853045689879956L;
        long l14 = -7324436018970753693L;
        int n2 = -259;
        n2 ^= 0xFFFFFFE2;
        byte[] byArray = new byte[n2 ^= 0x1F];
        int n3 = 239;
        n3 += -91;
        byte[] byArray2 = new byte[n3 += 108];
        int n4 = 209;
        n4 -= -100;
        byte[] byArray3 = new byte[n4 ^= 0x35];
        long l15 = l11;
        int n5 = -10;
        n5 -= -19;
        l11 = l15 ^ (0xFFFFFFFFFFFFFFFFL ^ l15) & -1L >>> (n5 ^= 0x29);
        Node node2 = node.getFirstChild();
        if (node2 == null) {
            int n6 = 12;
            n6 += -36;
            c.fatal(node, (String)a[n6 += 55]);
        }
        while (node2 != null) {
            if (!node2.getNodeName().equals(string)) {
                String string2 = node2.getNodeName();
                String string3 = string;
                int n7 = 54;
                n7 -= 82;
                int n8 = 194;
                n8 -= 86;
                int n9 = 101;
                n9 += -110;
                c.fatal(node, (String)a[n7 -= -56] + string3 + (String)a[n8 ^= 0x48] + string2 + (String)a[n9 ^= 0xFFFFFFD1]);
            }
            int n10 = -78;
            n10 ^= 0xFFFFFFAC;
            n10 -= 4;
            boolean bl2 = 117 != 0;
            bl2 ^= 0x5B;
            bl2 -= 45;
            int n11 = -60;
            n11 ^= 0xFFFFFFFA;
            n11 ^= 0x3E;
            int n12 = 324;
            n12 -= 112;
            n12 += 43;
            int n13 = -13;
            n13 -= -67;
            long l16 = l13;
            int n14 = 8;
            n14 -= -97;
            l13 = l16 ^ ((long)c.getIntAttribute(node2, (String)a[n10], bl2, n11, n12) << (n13 -= 22) ^ l16) & -1L << (n14 ^= 0x49);
            int n15 = -79;
            n15 ^= 0xFFFFFFB7;
            if ((int)(l13 >>> (n15 -= -26)) > (int)l11) {
                int n16 = -109;
                n16 ^= 0x37;
                long l17 = l11;
                int n17 = -55;
                n17 -= -39;
                l11 = l17 ^ ((long)((int)(l13 >>> (n16 ^= 0xFFFFFF84))) ^ l17) & -1L >>> (n17 ^= 0xFFFFFFD0);
            }
            int n18 = -157;
            n18 -= -115;
            n18 += 74;
            int n19 = -27;
            n19 += 80;
            n19 -= 21;
            boolean bl3 = 93 != 0;
            bl3 ^= 0x31;
            int n20 = 176;
            n20 -= 55;
            int n21 = 205;
            n21 -= 43;
            byArray[(int)(l13 >>> n18)] = (byte)c.getIntAttribute(node2, (String)a[n19], bl3 += -107, n20 -= 121, n21 ^= 0x5D);
            int n22 = 131;
            n22 -= 69;
            n22 += -30;
            int n23 = -15;
            n23 -= 84;
            n23 ^= 0xFFFFFF96;
            boolean bl4 = 33 != 0;
            bl4 -= -31;
            int n24 = 29;
            n24 += -100;
            int n25 = 21;
            n25 -= -113;
            byArray2[(int)(l13 >>> n22)] = (byte)c.getIntAttribute(node2, (String)a[n23], bl4 -= 63, n24 -= -71, n25 ^= 0x79);
            int n26 = -115;
            n26 ^= 0xFFFFFFC7;
            n26 -= 42;
            int n27 = 60;
            n27 += 40;
            n27 ^= 0x6B;
            boolean bl5 = 135 != 0;
            bl5 += -107;
            int n28 = 4;
            n28 -= -41;
            int n29 = -201;
            ++n29;
            byArray3[(int)(l13 >>> n26)] = (byte)c.getIntAttribute(node2, (String)a[n27], bl5 ^= 0x1D, n28 ^= 0x2D, n29 ^= 0xFFFFFFC7);
            node2 = node2.getNextSibling();
        }
        int n30 = -96;
        n30 -= -38;
        n30 += 59;
        int n31 = -137;
        n31 -= -123;
        long l18 = l13;
        int n32 = -64;
        n32 ^= 0x36;
        l13 = l18 ^ ((long)((int)l11 + n30) << (n31 += 46) ^ l18) & -1L << (n32 -= -42);
        if (bl) {
            int n33 = -40;
            n33 ^= 0xFFFFFFBE;
            if ((int)(l13 >>> (n33 -= 70)) != n) {
                int n34 = 51;
                n34 -= -55;
                c.fatal(node, (String)a[n34 -= 94]);
            }
        }
        int n35 = 18;
        n35 -= 67;
        int n36 = 161;
        n36 -= 86;
        byte[] byArray4 = new byte[(n35 += 52) * (int)(l13 >>> (n36 += -43))];
        long l19 = l14;
        int n37 = 140;
        n37 += -67;
        long l20 = l14 = l19 ^ (0L ^ l19) & -1L >>> (n37 += -41);
        int n38 = -80;
        n38 ^= 0xFFFFFFFA;
        l14 = l20 ^ (0L ^ l20) & -1L << (n38 ^= 0x6A);
        while (true) {
            int n39 = 52;
            n39 ^= 0xFFFFFFC6;
            if ((int)l14 >= (int)(l13 >>> (n39 ^= 0xFFFFFFD2))) break;
            int n40 = 63;
            n40 += -79;
            byArray4[(int)(l14 >>> (n40 ^= 0xFFFFFFD0))] = byArray[(int)(l14 += 0x100000000L)];
            int n41 = -33;
            n41 -= -99;
            byArray4[(int)(l14 >>> (n41 -= 34))] = byArray2[(int)(l14 += 0x100000000L)];
            int n42 = -32;
            n42 ^= 0xFFFFFF8A;
            byArray4[(int)(l14 >>> (n42 -= 74))] = byArray3[(int)(l14 += 0x100000000L)];
            long l21 = l14;
            int n43 = -11;
            n43 += -65;
            int n44 = -115;
            n44 += 56;
            l14 = l21 ^ (l21 ^ l21 + (long)(n43 -= -77)) & -1L >>> (n44 -= -91);
        }
        return byArray4;
    }

    protected abstract void mergeNativeTree(Node var1);

    protected abstract void mergeStandardTree(Node var1);

    static {
        long l = 5572844065294620253L;
        long l2 = -6945840645479395029L;
        long l3 = 339577607291822257L;
        long l4 = 3249381371017815757L;
        long l5 = 5681443168455766542L;
        long l6 = 8052531673038745235L;
        long l7 = -4220679302106074698L;
        long l8 = -9057086385199554770L;
        long l9 = 172237201075353543L;
        long l10 = 5145243984204952810L;
        long l11 = 7665250236709501320L;
        long l12 = -4972174915845855198L;
        long l13 = 5608761279036466948L;
        long l14 = -5336544852840589579L;
        int n = 83;
        n ^= 1;
        a = new Object[n -= 41];
        long l15 = l14;
        int n2 = -156;
        n2 -= -114;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= -74);
        char[] cArray = "\u0000\u0005false\u0000\u000b attribute \u0000\u0018Not a recognized format!\u0000\u0013Required attribute \u0000\u000eBad value for \u0000\u001b must be 'TRUE' or 'FALSE'!\u0000\u001cIllegal value for attribute \u0000\u0011javax_imageio_1.0\u0000\r not present!\u0000\u0001!\u0000\r not present!\u0000\u0005green\u0000\u001eUnexpected length for palette!\u0000\u0013Required attribute \u0000\u0001!\u0000\u0004blue\u0000\u0001!\u0000\r not present!\u0000\u000eBad value for \u0000\rroot == null!\u0000\nAttribute \u0000\u0004true\u0000\u0001!\u0000\r not present!\u0000\u0004TRUE\u0000\u0013Required attribute \u0000\u0005index\u0000\u000eBad value for \u0000\u0007Only a \u0000\u000b attribute \u0000\u0013Required attribute \u0000\u0017Palette has no entries!\u0000\u0003red\u0000\u000fNull value for \u0000\rroot == null!\u0000\u000b attribute \u0000\u0015 may be a child of a \u0000\u0005FALSE\u0000\u0001!\u0000\u000b attribute \u0000\u0001!".toCharArray();
        long l16 = l5;
        int n3 = -47;
        n3 ^= 0x61;
        l5 = l16 ^ (0x23500000000L ^ l16) & -1L << (n3 ^= 0xFFFFFF90);
        long l17 = l12;
        int n4 = -31;
        n4 -= -59;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n4 ^= 0x3C);
        while (true) {
            int n5 = -11;
            n5 ^= 0x37;
            if ((int)l12 >= (int)(l5 >>> (n5 ^= 0xFFFFFFE2))) break;
            int n6 = (int)l12;
            long l18 = l12;
            int n7 = -103;
            n7 += -20;
            int n8 = -57;
            n8 -= -113;
            l12 = l18 ^ (l18 ^ l18 + (long)(n7 -= -124)) & -1L >>> (n8 ^= 0x18);
            long l19 = l8;
            int n9 = -39;
            n9 -= -83;
            l8 = l19 ^ ((long)cArray[n6] ^ l19) & -1L >>> (n9 -= 12);
            int n10 = (int)l12;
            long l20 = l12;
            int n11 = 241;
            n11 += -116;
            int n12 = 75;
            n12 += -1;
            l12 = l20 ^ (l20 ^ l20 + (long)(n11 -= 124)) & -1L >>> (n12 -= 42);
            int n13 = -40;
            n13 ^= 0xFFFFFFE5;
            long l21 = l9;
            int n14 = -71;
            n14 -= 3;
            l9 = l21 ^ ((long)cArray[n10] << (n13 += -29) ^ l21) & -1L << (n14 ^= 0xFFFFFF96);
            int n15 = 77;
            n15 ^= 0x11;
            n15 += -76;
            int n16 = -128;
            n16 += 36;
            long l22 = l11;
            int n17 = -104;
            --n17;
            l11 = l22 ^ ((long)((int)l8 << n15 | (int)(l9 >>> (n16 ^= 0xFFFFFF84))) ^ l22) & -1L >>> (n17 ^= 0xFFFFFFB7);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n18 = 54;
            n18 ^= 0x63;
            l13 = l23 ^ (0L ^ l23) & -1L << (n18 += -53);
            while (true) {
                int n19 = 46;
                n19 += 16;
                if ((int)(l13 >>> (n19 += -30)) >= (int)l11) break;
                int n20 = 137;
                n20 += -42;
                int n21 = 6;
                n21 -= 67;
                cArray2[(int)(l13 >>> (n20 += -63))] = cArray[(int)l12 + (int)(l13 >>> (n21 -= -93))];
                l13 += 0x100000000L;
            }
            int n22 = -11;
            n22 -= -71;
            int n23 = (int)(l14 >>> (n22 ^= 0x1C));
            l14 += 0x100000000L;
            c.a[n23] = new String(cArray2);
            long l24 = l12;
            int n24 = -27;
            n24 ^= 0xFFFFFFC8;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n24 ^= 0xD);
        }
    }
}

