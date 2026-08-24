/*
 * Decompiled with CFR 0.152.
 */
package melancholia.runtime;

public final class StringDecryptor {
    private StringDecryptor() {
    }

    /*
     * WARNING - void declaration
     */
    public static String d(String enc, int key) {
        void var2_2;
        char[] c = enc.toCharArray();
        int i = 0;
        while (i < c.length) {
            void var3_3;
            c[i] = (char)(c[i] ^ key + i * 31);
            ++var3_3;
        }
        return new String((char[])var2_2);
    }
}

