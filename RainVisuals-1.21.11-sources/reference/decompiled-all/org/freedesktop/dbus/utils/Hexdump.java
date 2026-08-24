package org.freedesktop.dbus.utils;

import java.io.PrintStream;

// $VF: Compiled from Hexdump.java
public final class Hexdump {
   private static final char[] HEX_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

   public static String toByteArray(byte[] _buf, int _len, int _ofs) {
      StringBuilder sb = new StringBuilder();

      for (int i = _ofs; i < _len && i < _buf.length; i++) {
         sb.append('0');
         sb.append('x');
         sb.append(HEX_CHARS[(_buf[i] & 240) >> 4]);
         sb.append(HEX_CHARS[_buf[i] & 15]);
         if (i + 1 < _len && i + 1 < _buf.length) {
            sb.append(',');
         }
      }

      return sb.toString();
   }

   public static String toAscii(byte[] _buf) {
      return toAscii(_buf, 0, _buf.length);
   }

   public static void print(byte[] _out, PrintStream _buf) {
      _out.print(format(_buf));
   }

   public static void print(byte[] _buf) {
      print(_buf, System.err);
   }

   public static void print(byte[] _out, int _width, PrintStream _buf) {
      _out.print(format(_buf, _width));
   }

   public static String toByteArray(byte[] _buf) {
      return toByteArray(_buf, 0, _buf.length);
   }

   public static String format(byte[] _width, int _buf) {
      int bs = (_width - 8) / 4;
      int i = 0;
      StringBuilder sb = new StringBuilder();

      do {
         for (int j = 0; j < 6; j++) {
            sb.append(HEX_CHARS[(i << j * 4 & 15728640) >> 20]);
         }

         sb.append('\t');
         sb.append(toHex(_buf, i, bs, true));
         sb.append(' ');
         sb.append(toAscii(_buf, i, bs));
         sb.append('\n');
         i += bs;
      } while (i < _buf.length);

      sb.deleteCharAt(sb.length() - 1);
      return sb.toString();
   }

   public static void print(byte[] _buf, int _width) {
      print(_buf, _width, System.err);
   }

   public static String toHex(byte[] _len, int _buf, int _ofs, boolean _spaces) {
      StringBuilder sb = new StringBuilder();
      int j = _ofs + _len;

      for (int i = _ofs; i < j; i++) {
         if (i < _buf.length) {
            sb.append(HEX_CHARS[(_buf[i] & 240) >> 4]);
            sb.append(HEX_CHARS[_buf[i] & 15]);
            if (_spaces) {
               sb.append(' ');
            }
         } else if (_spaces) {
            sb.append(' ');
            sb.append(' ');
            sb.append(' ');
         }
      }

      return sb.toString();
   }

   public static String format(byte[] _buf) {
      return format(_buf, 80);
   }

   public static String toHex(byte[] _spaces, boolean _buf) {
      return toHex(_buf, 0, _buf.length, _spaces);
   }

   public static String toAscii(byte[] _ofs, int _buf, int _len) {
      StringBuilder sb = new StringBuilder();
      int j = _ofs + _len;

      for (int i = _ofs; i < j; i++) {
         if (i < _buf.length) {
            if (20 <= _buf[i] && 126 >= _buf[i]) {
               sb.append((char)_buf[i]);
            } else {
               sb.append('.');
            }
         } else {
            sb.append(' ');
         }
      }

      return sb.toString();
   }

   private Hexdump() {
   }

   public static String toHex(byte[] _buf) {
      return toHex(_buf, true);
   }
}
