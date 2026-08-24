package org.freedesktop.dbus.messages;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import org.freedesktop.dbus.ArrayFrob;
import org.freedesktop.dbus.Container;
import org.freedesktop.dbus.DBusMap;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.ObjectPath;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.MarshallingException;
import org.freedesktop.dbus.exceptions.MessageFormatException;
import org.freedesktop.dbus.exceptions.UnknownTypeCodeException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.types.UInt16;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.UInt64;
import org.freedesktop.dbus.types.Variant;
import org.freedesktop.dbus.utils.Hexdump;
import org.freedesktop.dbus.utils.LoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from Message.java
public class Message {
   private static final int OFFSET_SIG = 0;
   private long serial;
   private byte type;
   private final List<FileDescriptor> filedescriptors;
   private byte[] pabuf;
   protected final Logger logger = LoggerFactory.getLogger(this.getClass());
   private int bufferuse;
   public static final int MAXIMUM_ARRAY_LENGTH = 67108864;
   private static final int BUFFERINCREMENT = 20;
   public static final int MAXIMUM_MESSAGE_LENGTH = 134217728;
   private int paofs;
   private byte protover;
   public static final byte PROTOCOL = 1;
   private static final int OFFSET_DATA = 1;
   private byte flags;
   private final Object[] headers;
   private byte[][] wiredata;
   public static final int MAXIMUM_NUM_UNIX_FDS = 33554432;
   private static final AtomicLong GLOBAL_SERIAL = new AtomicLong(0L);
   private boolean big;
   private Object[] args;
   private int preallocated;
   private byte[] body;
   private static byte[][] padding = new byte[][]{null, new byte[1], new byte[2], new byte[3], new byte[4], new byte[5], new byte[6], new byte[7]};
   private boolean endianWasSet;
   private long bytecounter;
   private long bodylen;

   public String getPath() {
      Object o = this.getHeader((byte)1);
      return null == o ? null : o.toString();
   }

   Object[] extract(String _signature, byte[] _method, int[] _offsets, Message.ExtractMethod _dataBuf) throws DBusException {
      this.logger.trace("extract({},#{}, {{},{}}", _signature, _dataBuf.length, _offsets[0], _offsets[1]);
      List<Object> rv = new ArrayList();
      byte[] sigb = _signature.getBytes();

      for (int[] i = _offsets; i[0] < sigb.length; i[0]++) {
         rv.add(_method.extractOne(sigb, _dataBuf, i, false));
      }

      return rv.toArray();
   }

   public byte getType() {
      return this.type;
   }

   public static void marshallintLittle(long _l, byte[] _buf, int _width, int _ofs) {
      long l = _l;

      for (int i = 0; i < _width; i++) {
         _buf[i + _ofs] = (byte)(l & 255L);
         l >>= 8;
      }
   }

   Object[] extractHeader(byte[] _headers) throws DBusException {
      int[] offsets = new int[]{0, 0};
      return this.extract("a(yv)", _headers, offsets, this::readHeaderVariants);
   }

   public List<FileDescriptor> getFiledescriptors() {
      return this.filedescriptors;
   }

   public long getReplySerial() {
      Number l = (Number)this.getHeader((byte)5);
      return null == l ? 0L : l.longValue();
   }

   protected void setHeader(Object[] _header) {
      if (_header != null) {
         if (_header.length > this.headers.length) {
            throw new IllegalArgumentException("Given header is larger (" + _header.length + ") than allowed header size: " + this.headers.length);
         }

         System.arraycopy(_header, 0, this.headers, 0, _header.length);
      }
   }

   private Object extractVariant(byte[] _variantFactory, int[] _dataBuf, BiFunction<String, Object, Object> _offsets) throws DBusException {
      int[] newofs = new int[]{0, _offsets[1]};
      String sig = (String)this.extract("g", _dataBuf, newofs)[0];
      newofs[0] = 0;
      Object rv = _variantFactory.apply(sig, this.extract(sig, _dataBuf, newofs)[0]);
      _offsets[1] = newofs[1];
      return rv;
   }

   protected void padAndMarshall(List<Object> _sig, long _hargs, String _args, Object... _serial) throws DBusException {
      byte[] blen = new byte[4];
      this.appendBytes(blen);
      this.append("ua(yv)", _serial, _hargs.toArray());
      this.pad((byte)8);
      long c = this.getByteCounter();
      if (null != _sig) {
         this.append(_sig, _args);
      }

      this.logger.trace("Appended body, type: {} start: {} end: {} size: {}", _sig, c, this.getByteCounter(), this.getByteCounter() - c);
      this.marshallint(this.getByteCounter() - c, blen, 0, 4);
      LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("marshalled size ({}): {}", blen, Hexdump.format(blen)));
   }

   public static String getHeaderFieldName(byte _field) {
      return switch (_field) {
         case 1 -> "Path";
         case 2 -> "Interface";
         case 3 -> "Member";
         case 4 -> "Error Name";
         case 5 -> "Reply Serial";
         case 6 -> "Destination";
         case 7 -> "Sender";
         case 8 -> "Signature";
         case 9 -> "Unix FD";
         default -> "Invalid";
      };
   }

   byte getProtover() {
      return this.protover;
   }

   private void ensureBuffers(int _num) {
      int increase = _num - this.wiredata.length + this.bufferuse;
      if (increase > 0) {
         if (increase < 20) {
            increase = 20;
         }

         this.logger.trace("Resizing {}", this.bufferuse);
         byte[][] temp = new byte[this.wiredata.length + increase][];
         System.arraycopy(this.wiredata, 0, temp, 0, this.wiredata.length);
         this.wiredata = temp;
      }
   }

   protected synchronized void setSerial(long _serial) {
      this.serial = _serial;
   }

   private Object optimizePrimitives(
      byte[] _size, byte[] _length, int[] _algn, long _dataBuf, byte _offsets, int _extractMethod, Message.ExtractMethod _signatureBuf
   ) throws DBusException {
      Object rv;
      switch (_signatureBuf[_offsets[0]]) {
         case 98:
            rv = new boolean[_length];
            int j = 0;

            while (j < _length) {
               ((boolean[])rv)[j] = 1L == this.demarshallint(_dataBuf, _offsets[1], _algn);
               j++;
               _offsets[1] += _algn;
            }
            break;
         case 99:
         case 101:
         case 103:
         case 104:
         case 106:
         case 107:
         case 108:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 122:
         default:
            int ofssave = this.prepareCollection(_signatureBuf, _offsets, _size);
            long end = _offsets[1] + _size;
            List<Object> contents = new ArrayList<>();

            while (_offsets[1] < end) {
               _offsets[0] = ofssave;
               contents.add(_extractMethod.extractOne(_signatureBuf, _dataBuf, _offsets, true));
            }

            rv = contents;
            break;
         case 100:
            rv = new double[_length];
            int j = 0;

            while (j < _length) {
               ((double[])rv)[j] = Double.longBitsToDouble(this.demarshallint(_dataBuf, _offsets[1], _algn));
               j++;
               _offsets[1] += _algn;
            }
            break;
         case 102:
            rv = new float[_length];
            int j = 0;

            while (j < _length) {
               ((float[])rv)[j] = Float.intBitsToFloat((int)this.demarshallint(_dataBuf, _offsets[1], _algn));
               j++;
               _offsets[1] += _algn;
            }
            break;
         case 105:
            rv = new int[_length];
            int j = 0;

            while (j < _length) {
               ((int[])rv)[j] = (int)this.demarshallint(_dataBuf, _offsets[1], _algn);
               j++;
               _offsets[1] += _algn;
            }
            break;
         case 110:
            rv = new short[_length];
            int j = 0;

            while (j < _length) {
               ((short[])rv)[j] = (short)this.demarshallint(_dataBuf, _offsets[1], _algn);
               j++;
               _offsets[1] += _algn;
            }
            break;
         case 120:
            rv = new long[_length];
            int j = 0;

            while (j < _length) {
               ((long[])rv)[j] = this.demarshallint(_dataBuf, _offsets[1], _algn);
               j++;
               _offsets[1] += _algn;
            }
            break;
         case 121:
            rv = new byte[_length];
            System.arraycopy(_dataBuf, _offsets[1], rv, 0, _length);
            _offsets[1] = (int)(_offsets[1] + _size);
            break;
         case 123:
            int ofssave = this.prepareCollection(_signatureBuf, _offsets, _size);
            long end = _offsets[1] + _size;
            List<Object[]> entries = new ArrayList<>();

            while (_offsets[1] < end) {
               _offsets[0] = ofssave;
               entries.add((Object[])_extractMethod.extractOne(_signatureBuf, _dataBuf, _offsets, true));
            }

            rv = new DBusMap(entries.toArray(new Object[0][]));
      }

      return rv;
   }

   public static int getAlignment(byte _type) {
      return switch (_type) {
         case 1, 103, 118, 121 -> 1;
         case 2, 110, 113 -> 2;
         case 4, 97, 98, 102, 104, 105, 111, 115, 117 -> 4;
         case 8, 40, 41, 100, 101, 114, 116, 120, 123, 125 -> 8;
         default -> 1;
      };
   }

   private void preallocate(int _num) {
      this.preallocated = 0;
      this.pabuf = new byte[_num];
      this.appendBytes(this.pabuf);
      this.preallocated = _num;
      this.paofs = 0;
   }

   protected void appendByte(byte _b) {
      if (this.preallocated > 0) {
         this.pabuf[this.paofs++] = _b;
         this.preallocated--;
      } else {
         if (this.bufferuse == this.wiredata.length) {
            this.logger.trace("Resizing {}", this.bufferuse);
            byte[][] temp = new byte[this.wiredata.length + 20][];
            System.arraycopy(this.wiredata, 0, temp, 0, this.wiredata.length);
            this.wiredata = temp;
         }

         this.wiredata[this.bufferuse++] = new byte[]{_b};
         this.bytecounter++;
      }
   }

   public String getSig() {
      return (String)this.getHeader((byte)8);
   }

   public byte[][] getWireData() {
      return this.wiredata;
   }

   String dumpWireData() {
      StringBuilder sb = new StringBuilder(System.lineSeparator());

      for (int i = 0; i < this.wiredata.length; i++) {
         byte[] arr = this.wiredata[i];
         if (arr != null) {
            String prefix = "Wiredata[" + i + "]";
            String format = Hexdump.format(arr, 80);
            String[] split = format.split("\n");
            sb.append(prefix).append(": ").append(split[0]).append(System.lineSeparator());
            if (split.length > 1) {
               sb.append(Arrays.stream(split).skip(1L).map(s -> String.format("%s: %80s", prefix, s)).collect(Collectors.joining(System.lineSeparator())));
               sb.append(System.lineSeparator());
            }
         }
      }

      return sb.toString();
   }

   public void setSource(String _source) throws DBusException {
      if (null != this.body) {
         this.logger.trace("Setting source");
         LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("WireData before: {}", this.dumpWireData()));
         this.wiredata = new byte[20][];
         this.bufferuse = 0;
         this.bytecounter = 0L;
         this.preallocate(12);
         this.append("yyyyuu", Byte.valueOf((byte)(this.big ? 66 : 108)), this.type, this.flags, this.protover, this.bodylen, this.getSerial());
         this.headers[7] = _source;
         LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("WireData first append: {}", this.dumpWireData()));
         List<Object[]> newHeader = new ArrayList(this.headers.length);

         for (int hIdx = 0; hIdx < this.headers.length; hIdx++) {
            Object object = this.headers[hIdx];
            if (object != null) {
               if (hIdx == 8) {
                  newHeader.add(this.createHeaderArgs((byte)8, "g", object));
               } else {
                  newHeader.add(new Object[]{hIdx, object});
               }
            }
         }

         this.append("a(yv)", newHeader);
         LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> {
            this.logger.trace("New header: {}", LoggingHelper.arraysVeryDeepString(newHeader.toArray()));
            this.logger.trace("WireData after: {}", this.dumpWireData());
         });
         this.pad((byte)8);
         this.appendBytes(this.body);
      }
   }

   private Object extractStruct(byte[] _offsets, byte[] _dataBuf, int[] _extractMethod, Message.ExtractMethod _signatureBuf) throws DBusException {
      List<Object> contents = new ArrayList<>();

      while (_signatureBuf[++_offsets[0]] != 41) {
         contents.add(_extractMethod.extractOne(_signatureBuf, _dataBuf, _offsets, true));
      }

      return contents.toArray();
   }

   public static void marshallintBig(long _buf, byte[] _ofs, int _l, int _width) {
      long l = _l;

      for (int i = _width - 1; i >= 0; i--) {
         _buf[i + _ofs] = (byte)(l & 255L);
         l >>= 8;
      }
   }

   private Object extractByte(byte[] _dataBuf, int[] _offsets) {
      return _dataBuf[_offsets[1]++];
   }

   private Object readHeaderVariants(byte[] _contained, byte[] _offsets, int[] _signatureBuf, boolean _dataBuf) throws DBusException {
      _offsets[1] = this.align(_offsets[1], _signatureBuf[_offsets[0]]);
      Object result = null;
      if (_signatureBuf[_offsets[0]] == 97) {
         result = this.extractArray(_signatureBuf, _dataBuf, _offsets, _contained, this::readHeaderVariants);
      } else if (_signatureBuf[_offsets[0]] == 121) {
         result = this.extractByte(_dataBuf, _offsets);
      } else if (_signatureBuf[_offsets[0]] == 118) {
         result = this.extractVariant(_dataBuf, _offsets, (sig, obj) -> obj);
      } else {
         if (_signatureBuf[_offsets[0]] != 40) {
            throw new MessageFormatException("Unsupported data type in header: " + _signatureBuf[_offsets[0]]);
         }

         result = this.extractStruct(_signatureBuf, _dataBuf, _offsets, this::readHeaderVariants);
      }

      this.logger.trace("Extracted header signature type '{}' to: '{}'", (char)_signatureBuf[_offsets[0]], result);
      return result;
   }

   public static long demarshallint(byte[] _buf, int _width, byte _ofs, int _endian) {
      return _endian == 66 ? demarshallintBig(_buf, _ofs, _width) : demarshallintLittle(_buf, _ofs, _width);
   }

   long getBodylen() {
      return this.bodylen;
   }

   public synchronized long getSerial() {
      return this.serial;
   }

   public String getSource() {
      return (String)this.getHeader((byte)7);
   }

   protected Object[] createHeaderArgs(byte _value, String _header, Object _argType) {
      this.getHeader()[_header] = _value;
      return new Object[]{_header, new Object[]{_argType, _value}};
   }

   private int prepareCollection(byte[] _size, int[] _signatureBuf, long _offsets) throws DBusException {
      if (0L == _size) {
         List<Type> temp = new ArrayList<>();
         byte[] temp2 = new byte[_signatureBuf.length - _offsets[0]];
         System.arraycopy(_signatureBuf, _offsets[0], temp2, 0, temp2.length);
         String temp3 = new String(temp2);
         int temp4 = Marshalling.getJavaType(temp3, temp, 1) - 1;
         _offsets[0] += temp4;
         this.logger.trace("Aligned type: {} {} {}", temp3, temp4, _offsets[0]);
      }

      return _offsets[0];
   }

   protected void marshallint(long _l, byte[] _width, int _buf, int _ofs) {
      if (this.big) {
         marshallintBig(_l, _buf, _ofs, _width);
      } else {
         marshallintLittle(_l, _buf, _ofs, _width);
      }

      LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Marshalled int {} to {}", _l, Hexdump.toHex(_buf, _ofs, _width, true)));
   }

   protected void append(String _data, Object... _sig) throws DBusException {
      LoggingHelper.logIf(this.logger.isDebugEnabled(), () -> this.logger.debug("Appending sig: {} data: {}", _sig, LoggingHelper.arraysVeryDeepString(_data)));
      byte[] sigb = _sig.getBytes();
      int j = 0;

      for (int var6 = 0; var6 < sigb.length; var6++) {
         this.logger.trace("Appending item: {} {} {}", var6, (char)sigb[var6], j);
         var6 = this.appendOne(sigb, var6, _data[j++]);
      }
   }

   protected void setWireData(byte[][] _wiredata) {
      this.wiredata = _wiredata;
   }

   protected long demarshallint(byte[] _ofs, int _buf, int _width) {
      return this.big ? demarshallintBig(_buf, _ofs, _width) : demarshallintLittle(_buf, _ofs, _width);
   }

   protected Object getHeader(byte _type) {
      return this.headers.length != 0 && this.headers.length >= _type ? this.headers[_type] : null;
   }

   public static long demarshallintLittle(byte[] _ofs, int _buf, int _width) {
      long l = 0L;

      for (int i = _width + -1; i >= 0; i--) {
         l <<= 8;
         l |= _buf[_ofs + i] & 0xFF;
      }

      return l;
   }

   public static long demarshallintBig(byte[] _ofs, int _buf, int _width) {
      long l = 0L;

      for (int i = 0; i < _width; i++) {
         l <<= 8;
         l |= _buf[_ofs + i] & 0xFF;
      }

      return l;
   }

   protected Object[] getHeader() {
      return this.headers;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getSimpleName());
      sb.append('(');
      sb.append(this.flags);
      sb.append(',');
      sb.append(this.getSerial());
      sb.append(')');
      sb.append(' ');
      sb.append('{');
      sb.append(' ');
      if (this.headers.length == 0) {
         sb.append('}');
      } else {
         for (int largs = 0; largs < this.headers.length; largs++) {
            sb.append(getHeaderFieldName((byte)largs));
            sb.append('=');
            sb.append('>');
            sb.append(this.headers[largs]);
            sb.append(',');
            sb.append(' ');
         }

         sb.setCharAt(sb.length() - 2, ' ');
         sb.setCharAt(sb.length() - 1, '}');
      }

      sb.append(' ');
      sb.append('{');
      sb.append(' ');
      Object[] var16 = null;

      try {
         var16 = this.getParameters();
      } catch (DBusException var15) {
         this.logger.debug("", var15);
      }

      if (null != var16 && 0 != var16.length) {
         for (Object o : var16) {
            if (o == null) {
               sb.append("null");
            } else if (o instanceof Object[] oa) {
               sb.append(Arrays.deepToString(oa));
            } else if (o instanceof byte[] ba) {
               sb.append(Arrays.toString(ba));
            } else if (o instanceof int[] ia) {
               sb.append(Arrays.toString(ia));
            } else if (o instanceof short[] sa) {
               sb.append(Arrays.toString(sa));
            } else if (o instanceof long[] la) {
               sb.append(Arrays.toString(la));
            } else if (o instanceof boolean[] ba) {
               sb.append(Arrays.toString(ba));
            } else if (o instanceof double[] da) {
               sb.append(Arrays.toString(da));
            } else if (o instanceof float[] fa) {
               sb.append(Arrays.toString(fa));
            } else {
               sb.append(o);
            }

            sb.append(',');
            sb.append(' ');
         }

         sb.setCharAt(sb.length() - 2, ' ');
         sb.setCharAt(sb.length() - 1, '}');
      } else {
         sb.append('}');
      }

      return sb.toString();
   }

   public byte getEndianess() {
      if (this.endianWasSet) {
         return (byte)(this.big ? 66 : 108);
      } else {
         return 0;
      }
   }

   private Object extractArray(byte[] _signatureBuf, byte[] _extractMethod, int[] _dataBuf, boolean _contained, Message.ExtractMethod _offsets) throws DBusException, MarshallingException {
      long size = this.demarshallint(_dataBuf, _offsets[1], 4);
      this.logger.trace("Reading array of size: {}", size);
      _offsets[1] += 4;
      byte algn = (byte)getAlignment(_signatureBuf[++_offsets[0]]);
      _offsets[1] = this.align(_offsets[1], _signatureBuf[_offsets[0]]);
      int length = (int)(size / algn);
      if (length > 67108864) {
         throw new MarshallingException("Arrays must not exceed 67108864");
      }

      Object rv = this.optimizePrimitives(_signatureBuf, _dataBuf, _offsets, size, algn, length, _extractMethod);
      if (_contained && !(rv instanceof List) && !(rv instanceof Map)) {
         rv = ArrayFrob.listify(rv);
      }

      return rv;
   }

   protected void appendBytes(byte[] _buf) {
      if (null != _buf) {
         if (this.preallocated > 0) {
            if (this.paofs + _buf.length > this.pabuf.length) {
               throw new ArrayIndexOutOfBoundsException(
                  MessageFormat.format("Array index out of bounds, paofs={0}, pabuf.length={1}, buf.length={2}.", this.paofs, this.pabuf.length, _buf.length)
               );
            }

            System.arraycopy(_buf, 0, this.pabuf, this.paofs, _buf.length);
            this.paofs += _buf.length;
            this.preallocated -= _buf.length;
         } else {
            if (this.bufferuse == this.wiredata.length) {
               this.logger.trace("Resizing {}", this.bufferuse);
               byte[][] temp = new byte[this.wiredata.length + 20][];
               System.arraycopy(this.wiredata, 0, temp, 0, this.wiredata.length);
               this.wiredata = temp;
            }

            this.wiredata[this.bufferuse++] = _buf;
            this.bytecounter += _buf.length;
         }
      }
   }

   protected Message(byte _endian, byte _type, byte _flags) throws DBusException {
      this();
      this.big = 66 == _endian;
      this.setSerial(GLOBAL_SERIAL.incrementAndGet());
      this.logger.debug("Creating message with serial {}", this.getSerial());
      this.type = _type;
      this.flags = _flags;
      this.preallocate(4);
      this.endianWasSet = _endian != 0;
      this.append("yyyy", _endian, _type, _flags, (byte)1);
   }

   public void updateEndianess(byte _endianess) {
      if (!this.endianWasSet) {
         if (this.wiredata[0] != null) {
            this.wiredata[0][0] = _endianess;
         } else {
            this.wiredata[0] = new byte[]{_endianess, 0, 0, 0};
         }

         this.endianWasSet = true;
      }
   }

   private Object extractOne(byte[] _signatureBuf, byte[] _contained, int[] _dataBuf, boolean _offsets) throws DBusException {
      this.logger.trace("Extracting type: {} from offset {}", (char)_signatureBuf[_offsets[0]], _offsets[1]);
      Object rv = null;
      _offsets[1] = this.align(_offsets[1], _signatureBuf[_offsets[0]]);
      switch (_signatureBuf[_offsets[0]]) {
         case 40:
            rv = this.extractStruct(_signatureBuf, _dataBuf, _offsets, this::extractOne);
            break;
         case 97:
            rv = this.extractArray(_signatureBuf, _dataBuf, _offsets, _contained, this::extractOne);
            break;
         case 98: {
            int rf = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
            _offsets[1] += 4;
            rv = 1 == rf ? Boolean.TRUE : Boolean.FALSE;
            break;
         }
         case 100:
            long l = this.demarshallint(_dataBuf, _offsets[1], 8);
            _offsets[1] += 8;
            rv = Double.longBitsToDouble(l);
            break;
         case 102: {
            int rf = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
            _offsets[1] += 4;
            rv = Float.intBitsToFloat(rf);
            break;
         }
         case 103: {
            int length = _dataBuf[_offsets[1]++] & 255;
            rv = new String(_dataBuf, _offsets[1], length);
            _offsets[1] += length + 1;
            break;
         }
         case 104:
            rv = this.filedescriptors.get((int)this.demarshallint(_dataBuf, _offsets[1], 4));
            _offsets[1] += 4;
            break;
         case 105:
            rv = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
            _offsets[1] += 4;
            break;
         case 110:
            rv = (short)this.demarshallint(_dataBuf, _offsets[1], 2);
            _offsets[1] += 2;
            break;
         case 111: {
            int length = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
            _offsets[1] += 4;
            rv = new ObjectPath(this.getSource(), new String(_dataBuf, _offsets[1], length));
            _offsets[1] += length + 1;
            break;
         }
         case 113:
            rv = new UInt16((int)this.demarshallint(_dataBuf, _offsets[1], 2));
            _offsets[1] += 2;
            break;
         case 115: {
            int length = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
            _offsets[1] += 4;
            rv = new String(_dataBuf, _offsets[1], length, StandardCharsets.UTF_8);
            _offsets[1] += length + 1;
            break;
         }
         case 116:
            long top;
            long bottom;
            if (this.big) {
               top = this.demarshallint(_dataBuf, _offsets[1], 4);
               _offsets[1] += 4;
               bottom = this.demarshallint(_dataBuf, _offsets[1], 4);
            } else {
               bottom = this.demarshallint(_dataBuf, _offsets[1], 4);
               _offsets[1] += 4;
               top = this.demarshallint(_dataBuf, _offsets[1], 4);
            }

            rv = new UInt64(top, bottom);
            _offsets[1] += 4;
            break;
         case 117:
            rv = new UInt32(this.demarshallint(_dataBuf, _offsets[1], 4));
            _offsets[1] += 4;
            break;
         case 118:
            rv = this.extractVariant(_dataBuf, _offsets, (sig, obj) -> new Variant<>(obj, sig));
            break;
         case 120:
            rv = this.demarshallint(_dataBuf, _offsets[1], 8);
            _offsets[1] += 8;
            break;
         case 121:
            rv = this.extractByte(_dataBuf, _offsets);
            break;
         case 123:
            Object[] decontents = new Object[2];
            LoggingHelper.logIf(
               this.logger.isTraceEnabled(),
               () -> this.logger
                  .trace(
                     "Extracting Dict Entry ({}) from: {}",
                     Hexdump.toAscii(_signatureBuf, _offsets[0], _signatureBuf.length - _offsets[0]),
                     Hexdump.toHex(_dataBuf, _offsets[1], _dataBuf.length - _offsets[1], true)
                  )
            );
            _offsets[0]++;
            decontents[0] = this.extractOne(_signatureBuf, _dataBuf, _offsets, true);
            _offsets[0]++;
            decontents[1] = this.extractOne(_signatureBuf, _dataBuf, _offsets, true);
            _offsets[0]++;
            rv = decontents;
            break;
         default:
            throw new UnknownTypeCodeException(_signatureBuf[_offsets[0]]);
      }

      if (this.logger.isTraceEnabled()) {
         if (rv instanceof Object[] oa) {
            this.logger.trace("Extracted: {} (now at {})", Arrays.deepToString(oa), _offsets[1]);
         } else {
            this.logger.trace("Extracted: {} (now at {})", rv, _offsets[1]);
         }
      }

      return rv;
   }

   protected Object[] extract(String _offsets, byte[] _signature, int _dataBuf) throws DBusException {
      return this.extract(_signature, _dataBuf, new int[]{0, _offsets});
   }

   protected Message() {
      this.filedescriptors = new ArrayList<>();
      this.headers = new Object[10];
      this.wiredata = new byte[20][];
      this.bytecounter = 0L;
      this.bodylen = 0L;
      this.preallocated = 0;
      this.paofs = 0;
      this.bufferuse = 0;
   }

   protected void appendint(long _l, int _width) {
      byte[] buf = new byte[_width];
      this.marshallint(_l, buf, 0, _width);
      this.appendBytes(buf);
   }

   protected void pad(byte _type) {
      this.logger.trace("padding for {}", (char)_type);
      int a = getAlignment(_type);
      this.logger.trace("{} {} {} {}", this.preallocated, this.paofs, this.bytecounter, a);
      int b = (int)((this.bytecounter - this.preallocated) % a);
      if (0 != b) {
         a -= b;
         if (this.preallocated > 0) {
            this.paofs += a;
            this.preallocated -= a;
         } else {
            this.appendBytes(padding[a]);
         }

         this.logger.trace("{} {} {} {}", this.preallocated, this.paofs, this.bytecounter, a);
      }
   }

   protected Object[] extract(String _signature, byte[] _offsets, int[] _dataBuf) throws DBusException {
      return this.extract(_signature, _dataBuf, _offsets, this::extractOne);
   }

   public String getInterface() {
      return (String)this.getHeader((byte)2);
   }

   public String getDestination() {
      return (String)this.getHeader((byte)6);
   }

   protected void setByteCounter(long _bytecounter) {
      this.bytecounter = _bytecounter;
   }

   void populate(byte[] _headers, byte[] _descriptors, byte[] _body, List<FileDescriptor> _msg) throws DBusException {
      byte[] msgBuf = new byte[_msg.length];
      System.arraycopy(_msg, 0, msgBuf, 0, _msg.length);
      byte[] headerBuf = new byte[_headers.length];
      System.arraycopy(_headers, 0, headerBuf, 0, _headers.length);
      byte[] bodyBuf = new byte[_body.length];
      System.arraycopy(_body, 0, bodyBuf, 0, _body.length);
      this.endianWasSet = true;
      this.big = msgBuf[0] == 66;
      this.type = msgBuf[1];
      this.flags = msgBuf[2];
      this.protover = msgBuf[3];
      this.wiredata[0] = msgBuf;
      this.wiredata[1] = headerBuf;
      this.wiredata[2] = bodyBuf;
      this.body = bodyBuf;
      this.bufferuse = 3;
      this.bodylen = ((Number)this.extract("u", msgBuf, 4)[0]).longValue();
      long extractedSerial = ((Number)this.extract("u", msgBuf, 8)[0]).longValue();
      this.logger.debug("Received message of type {} with serial {}", this.type, extractedSerial);
      this.setSerial(extractedSerial);
      this.bytecounter = (long)msgBuf.length + headerBuf.length + bodyBuf.length;
      this.filedescriptors.clear();
      if (_descriptors != null) {
         this.filedescriptors.addAll(_descriptors);
      }

      LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Message header: {}", Hexdump.toAscii(headerBuf)));
      Object[] hs = this.extractHeader(headerBuf);
      LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Extracted objects: {}", LoggingHelper.arraysVeryDeepString(hs)));

      for (Object o : (List)hs[0]) {
         Object[] objArr = (Object[])o;
         byte idx = (Byte)objArr[0];
         this.headers[idx] = objArr[1];
      }
   }

   public Object[] getParameters() throws DBusException {
      if (null == this.args && null != this.body) {
         String sig = this.getSig();
         if (null != sig && 0 != this.body.length) {
            this.args = this.extract(sig, this.body, 0);
         } else {
            this.args = new Object[0];
         }
      }

      return this.args;
   }

   public void setArgs(Object[] _args) {
      this.args = _args;
   }

   public int getFlags() {
      return this.flags;
   }

   public String getName() {
      return this instanceof Error ? (String)this.getHeader((byte)4) : (String)this.getHeader((byte)3);
   }

   private int appendOne(byte[] _sigofs, int _data, Object _sigb) throws DBusException {
      try {
         int i = _sigofs;
         this.logger.trace("{}", this.bytecounter);
         this.logger.trace("Appending type: {} value: {}", (char)_sigb[i], _data);
         this.pad(_sigb[i]);
         switch (_sigb[i]) {
            case 40:
               Object[] contents;
               if (_data instanceof Container cont) {
                  contents = cont.getParameters();
               } else {
                  contents = (Object[])_data;
               }

               this.ensureBuffers(contents.length * 4);
               int j = 0;
               i++;

               while (_sigb[i] != 41) {
                  i = this.appendOne(_sigb, i, contents[j++]);
                  i++;
               }
               break;
            case 97:
               if (this.logger.isTraceEnabled() && _data instanceof Object[] oa) {
                  this.logger.trace("Appending array: {}", Arrays.deepToString(oa));
               }

               byte[] alen = new byte[4];
               this.appendBytes(alen);
               this.pad(_sigb[++i]);
               long c = this.bytecounter;
               if (_data.getClass().isArray() && _data.getClass().getComponentType().isPrimitive()) {
                  int algn = getAlignment(_sigb[i]);
                  int len = Array.getLength(_data);

                  this.appendBytes(switch (_sigb[i]) {
                     case 98 -> {
                        yield new byte[len * algn];
                        int j = 0;

                        for (int k = 0; j < len; k += algn) {
                           Object var69;
                           this.marshallint(Array.getBoolean(_data, j) ? 1L : 0L, (byte[])var69, k, algn);
                           j++;
                        }
                     }
                     default -> throw new MarshallingException("Primitive array being sent as non-primitive array.");
                     case 100 -> {
                        yield new byte[len * algn];
                        if (_data instanceof float[] fa) {
                           int j = 0;

                           for (int k = 0; j < len; k += algn) {
                              Object var68;
                              this.marshallint(Double.doubleToRawLongBits(fa[j]), (byte[])var68, k, algn);
                              j++;
                           }
                        } else {
                           int j = 0;

                           for (int k = 0; j < len; k += algn) {
                              Object var67;
                              this.marshallint(Double.doubleToRawLongBits(((double[])_data)[j]), (byte[])var67, k, algn);
                              j++;
                           }
                        }
                     }
                     case 102 -> {
                        yield new byte[len * algn];
                        int j = 0;

                        for (int k = 0; j < len; k += algn) {
                           Object var66;
                           this.marshallint(Float.floatToRawIntBits(((float[])_data)[j]), (byte[])var66, k, algn);
                           j++;
                        }
                     }
                     case 105, 110, 120 -> {
                        yield new byte[len * algn];
                        int j = 0;

                        for (int k = 0; j < len; k += algn) {
                           Object var42;
                           this.marshallint(Array.getLong(_data, j), (byte[])var42, k, algn);
                           j++;
                        }
                     }
                     case 121 -> (byte[])_data;
                  });
               } else if (_data instanceof List<?> lst) {
                  Object[] contents = lst.toArray();
                  int diff = i;
                  this.ensureBuffers(contents.length * 4);

                  for (Object o : contents) {
                     diff = this.appendOne(_sigb, i, o);
                  }

                  if (contents.length == 0) {
                     diff = EmptyCollectionHelper.determineSignatureOffsetArray(_sigb, diff);
                  }

                  i = diff;
               } else if (_data instanceof Map<?, ?> map) {
                  int diff = i;
                  this.ensureBuffers(map.size() * 6);

                  for (Entry<?, ?> o : map.entrySet()) {
                     diff = this.appendOne(_sigb, i, o);
                  }

                  if (map.isEmpty()) {
                     diff = EmptyCollectionHelper.determineSignatureOffsetDict(_sigb, diff);
                  }

                  i = diff;
               } else {
                  Object[] contents = (Object[])_data;
                  this.ensureBuffers(contents.length * 4);
                  int diff = i;

                  for (Object o : contents) {
                     diff = this.appendOne(_sigb, i, o);
                  }

                  if (contents.length == 0) {
                     diff = EmptyCollectionHelper.determineSignatureOffsetArray(_sigb, diff);
                  }

                  i = diff;
               }

               this.logger.trace("start: {} end: {} length: {}", c, this.bytecounter, this.bytecounter - c);
               this.marshallint(this.bytecounter - c, alen, 0, 4);
               break;
            case 98:
               this.appendint((Boolean)_data ? 1L : 0L, 4);
               break;
            case 100:
               long l = Double.doubleToLongBits(((Number)_data).doubleValue());
               this.appendint(l, 8);
               break;
            case 102:
               int rf = Float.floatToIntBits(((Number)_data).floatValue());
               this.appendint(rf, 4);
               break;
            case 103:
               String payload;
               if (_data instanceof Type[] ta) {
                  payload = Marshalling.getDBusType(ta);
               } else {
                  payload = (String)_data;
               }

               byte[] pbytes = payload.getBytes();
               this.preallocate(2 + pbytes.length);
               this.appendByte((byte)pbytes.length);
               this.appendBytes(pbytes);
               this.appendByte((byte)0);
               break;
            case 104:
               this.filedescriptors.add((FileDescriptor)_data);
               this.appendint(this.filedescriptors.size() - 1L, 4);
               this.logger.debug("Just inserted {} as filedescriptor", this.filedescriptors.size() - 1);
               break;
            case 105:
               this.appendint(((Number)_data).intValue(), 4);
               break;
            case 110:
               this.appendint(((Number)_data).shortValue(), 2);
               break;
            case 111:
            case 115:
               String payload;
               if (_data instanceof DBusInterface di) {
                  payload = di.getObjectPath();
               } else {
                  payload = _data.toString();
               }

               byte[] payloadbytes = payload.getBytes(StandardCharsets.UTF_8);
               this.logger.trace("Appending String of length {}", payloadbytes.length);
               this.appendint(payloadbytes.length, 4);
               this.appendBytes(payloadbytes);
               this.appendBytes(padding[1]);
               break;
            case 113:
               this.appendint(((Number)_data).intValue(), 2);
               break;
            case 116:
               if (this.big) {
                  this.appendint(((UInt64)_data).top(), 4);
                  this.appendint(((UInt64)_data).bottom(), 4);
               } else {
                  this.appendint(((UInt64)_data).bottom(), 4);
                  this.appendint(((UInt64)_data).top(), 4);
               }
               break;
            case 117:
               this.appendint(((Number)_data).longValue(), 4);
               break;
            case 118:
               if (_data instanceof Variant<?> variant) {
                  this.appendOne(new byte[]{103}, 0, variant.getSig());
                  this.appendOne(variant.getSig().getBytes(), 0, variant.getValue());
               } else if (_data instanceof Object[] oa) {
                  this.appendOne(new byte[]{103}, 0, oa[0]);
                  this.appendOne(((String)oa[0]).getBytes(), 0, oa[1]);
               } else {
                  String sig = Marshalling.getDBusType(_data.getClass())[0];
                  this.appendOne(new byte[]{103}, 0, sig);
                  this.appendOne(sig.getBytes(), 0, _data);
               }
               break;
            case 120:
               this.appendint(((Number)_data).longValue(), 8);
               break;
            case 121:
               this.appendByte(((Number)_data).byteValue());
               break;
            case 123:
               if (_data instanceof Entry<?, ?> entry) {
                  i = this.appendOne(_sigb, ++i, entry.getKey());
                  i = this.appendOne(_sigb, ++i, entry.getValue());
                  i++;
               } else {
                  Object[] contents = (Object[])_data;
                  int j = 0;
                  i++;

                  while (_sigb[i] != 125) {
                     i = this.appendOne(_sigb, i, contents[j++]);
                     i++;
                  }
               }
         }

         return i;
      } catch (ClassCastException _ex) {
         this.logger.debug("Trying to marshall to unconvertible type.", _ex);
         throw new MarshallingException(
            MessageFormat.format("Trying to marshall to unconvertible type (from {0} to {1}).", _data.getClass().getName(), (char)_sigb[_sigofs])
         );
      }
   }

   protected long getByteCounter() {
      return this.bytecounter;
   }

   protected int align(int _type, byte _current) {
      this.logger.trace("aligning to {}", (char)_type);
      int a = getAlignment(_type);
      return 0 == _current % a ? _current : _current + (a - _current % a);
   }

   // $VF: Compiled from Message.java
   @FunctionalInterface
   interface ExtractMethod {
      Object extractOne(byte[] var1, byte[] var2, int[] var3, boolean var4) throws DBusException;
   }
}
