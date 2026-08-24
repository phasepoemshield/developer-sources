/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.utils;

import java.io.PrintStream;

public final class Hexdump {
    private static final char[] HEX_CHARS;

    /*
     * WARNING - void declaration
     */
    public static String toByteArray(byte[] _buf, int _ofs, int _len) {
        void var3_3;
        StringBuilder sb = new StringBuilder();
        int i = _ofs;
        while (i < _len && i < _buf.length) {
            void var4_4;
            sb.append('0');
            sb.append('x');
            sb.append(HEX_CHARS[(_buf[i] & 0xF0) >> 4]);
            sb.append(HEX_CHARS[_buf[i] & 0xF]);
            if (i + 1 < _len) {
                if (i + 1 < _buf.length) {
                    sb.append(',');
                }
            }
            ++var4_4;
        }
        return var3_3.toString();
    }

    public static String toAscii(byte[] _buf) {
        return Hexdump.toAscii(_buf, 0, _buf.length);
    }

    public static void print(byte[] _buf, PrintStream _out) {
        _out.print(Hexdump.format(_buf));
    }

    public static void print(byte[] _buf) {
        Hexdump.print(_buf, System.err);
    }

    public static void print(byte[] _buf, int _width, PrintStream _out) {
        _out.print(Hexdump.format(_buf, _width));
    }

    public static String toByteArray(byte[] _buf) {
        return Hexdump.toByteArray(_buf, 0, _buf.length);
    }

    /*
     * WARNING - void declaration
     */
    public static String format(byte[] _buf, int _width) {
        void var4_4;
        int bs = (_width - 8) / 4;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        do {
            int j = 0;
            while (j < 6) {
                void var5_5;
                sb.append(HEX_CHARS[(i << j * 4 & 0xF00000) >> 20]);
                ++var5_5;
            }
            sb.append('\t');
            sb.append(Hexdump.toHex(_buf, i, bs, true));
            sb.append(' ');
            sb.append(Hexdump.toAscii(_buf, i, bs));
            sb.append('\n');
        } while ((i += bs) < _buf.length);
        sb.deleteCharAt(sb.length() - 1);
        return var4_4.toString();
    }

    public static void print(byte[] _buf, int _width) {
        Hexdump.print(_buf, _width, System.err);
    }

    public static String toHex(byte[] _buf, int _ofs, int _len, boolean _spaces) {
        StringBuilder sb = new StringBuilder();
        int j = _ofs + _len;
        for (int i = _ofs; i < j; ++i) {
            if (i < _buf.length) {
                sb.append(HEX_CHARS[(_buf[i] & 0xF0) >> 4]);
                sb.append(HEX_CHARS[_buf[i] & 0xF]);
                if (!_spaces) continue;
                sb.append(' ');
                continue;
            }
            if (!_spaces) continue;
            sb.append(' ');
            sb.append(' ');
            sb.append(' ');
        }
        return sb.toString();
    }

    public static String format(byte[] _buf) {
        return Hexdump.format(_buf, 80);
    }

    public static String toHex(byte[] _buf, boolean _spaces) {
        return Hexdump.toHex(_buf, 0, _buf.length, _spaces);
    }

    /*
     * WARNING - void declaration
     */
    public static String toAscii(byte[] _buf, int _ofs, int _len) {
        void var3_3;
        StringBuilder sb = new StringBuilder();
        int j = _ofs + _len;
        for (int i = _ofs; i < j; ++i) {
            if (i < _buf.length) {
                if (20 <= _buf[i] && 126 >= _buf[i]) {
                    sb.append((char)_buf[i]);
                    continue;
                }
                sb.append('.');
                continue;
            }
            sb.append(' ');
        }
        return var3_3.toString();
    }

    static {
        char[] cArray = new char[16];
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 56;
        cArray[9] = 57;
        cArray[10] = 97;
        cArray[11] = 98;
        cArray[12] = 99;
        cArray[13] = 100;
        cArray[14] = 101;
        cArray[15] = 102;
        HEX_CHARS = cArray;
    }

    private Hexdump() {
    }

    public static String toHex(byte[] _buf) {
        return Hexdump.toHex(_buf, true);
    }
}

