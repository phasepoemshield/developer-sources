/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.messages;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
import org.freedesktop.dbus.messages.EmptyCollectionHelper;
import org.freedesktop.dbus.messages.Error;
import org.freedesktop.dbus.types.UInt16;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.UInt64;
import org.freedesktop.dbus.types.Variant;
import org.freedesktop.dbus.utils.Hexdump;
import org.freedesktop.dbus.utils.LoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message {
    private static final int OFFSET_SIG = 0;
    private long serial;
    private byte type;
    private final List<FileDescriptor> filedescriptors;
    private byte[] pabuf;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int bufferuse = 0;
    public static final int MAXIMUM_ARRAY_LENGTH = 0x4000000;
    private static final int BUFFERINCREMENT = 20;
    public static final int MAXIMUM_MESSAGE_LENGTH = 0x8000000;
    private int paofs = 0;
    private byte protover;
    public static final byte PROTOCOL = 1;
    private static final int OFFSET_DATA = 1;
    private byte flags;
    private final Object[] headers;
    private byte[][] wiredata;
    public static final int MAXIMUM_NUM_UNIX_FDS = 0x2000000;
    private static final AtomicLong GLOBAL_SERIAL;
    private boolean big;
    private Object[] args;
    private int preallocated = 0;
    private byte[] body;
    private static byte[][] padding;
    private boolean endianWasSet;
    private long bytecounter = 0L;
    private long bodylen = 0L;

    /*
     * WARNING - void declaration
     */
    public String getPath() {
        void var1_1;
        Object o = this.getHeader((byte)1);
        if (null == o) {
            return null;
        }
        return var1_1.toString();
    }

    /*
     * WARNING - void declaration
     */
    Object[] extract(String _signature, byte[] _dataBuf, int[] _offsets, ExtractMethod _method) throws DBusException {
        void var5_5;
        Object[] objectArray = new Object[4];
        objectArray[0] = _signature;
        objectArray[1] = _dataBuf.length;
        objectArray[2] = _offsets[0];
        objectArray[3] = _offsets[1];
        this.logger.trace("extract({},#{}, {{},{}}", objectArray);
        ArrayList<Object> rv = new ArrayList<Object>();
        byte[] sigb = _signature.getBytes();
        int[] i = _offsets;
        while (i[0] < sigb.length) {
            void var7_7;
            rv.add(_method.extractOne(sigb, _dataBuf, i, false));
            void v1 = var7_7;
            v1[0] = v1[0] + true;
        }
        return var5_5.toArray();
    }

    public byte getType() {
        return this.type;
    }

    public static void marshallintLittle(long _l, byte[] _buf, int _ofs, int _width) {
        long l = _l;
        for (int i = 0; i < _width; ++i) {
            _buf[i + _ofs] = (byte)(l & 0xFFL);
            l >>= 8;
        }
    }

    Object[] extractHeader(byte[] _headers) throws DBusException {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 0;
        int[] offsets = nArray;
        return this.extract("a(yv)", _headers, offsets, this::readHeaderVariants);
    }

    public List<FileDescriptor> getFiledescriptors() {
        return this.filedescriptors;
    }

    /*
     * WARNING - void declaration
     */
    public long getReplySerial() {
        void var1_1;
        Number l = (Number)this.getHeader((byte)5);
        if (null == l) {
            return 0L;
        }
        return var1_1.longValue();
    }

    protected void setHeader(Object[] _header) {
        if (_header == null) {
            return;
        }
        if (_header.length > this.headers.length) {
            throw new IllegalArgumentException("Given header is larger (" + _header.length + ") than allowed header size: " + this.headers.length);
        }
        System.arraycopy(_header, 0, this.headers, 0, _header.length);
    }

    /*
     * WARNING - void declaration
     */
    private Object extractVariant(byte[] _dataBuf, int[] _offsets, BiFunction<String, Object, Object> _variantFactory) throws DBusException {
        void var4_6;
        void var5_4;
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = _offsets[1];
        int[] newofs = nArray;
        String sig = (String)this.extract("g", _dataBuf, newofs)[0];
        newofs[0] = 0;
        Object rv = _variantFactory.apply(sig, this.extract(sig, _dataBuf, newofs)[0]);
        var2_2[1] = var5_4[1];
        return var4_6;
    }

    /*
     * WARNING - void declaration
     */
    protected void padAndMarshall(List<Object> _hargs, long _serial, String _sig, Object ... _args) throws DBusException {
        void var6_5;
        byte[] blen = new byte[4];
        this.appendBytes(blen);
        Object[] objectArray = new Object[2];
        objectArray[0] = _serial;
        objectArray[1] = _hargs.toArray();
        this.append("ua(yv)", objectArray);
        this.pad((byte)8);
        long c = this.getByteCounter();
        if (null != _sig) {
            this.append(_sig, _args);
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[0] = _sig;
        objectArray2[1] = c;
        objectArray2[2] = this.getByteCounter();
        objectArray2[3] = this.getByteCounter() - c;
        this.logger.trace("Appended body, type: {} start: {} end: {} size: {}", objectArray2);
        this.marshallint(this.getByteCounter() - c, blen, 0, 4);
        LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.lambda$padAndMarshall$11((byte[])var6_5));
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

    /*
     * WARNING - void declaration
     */
    private void ensureBuffers(int _num) {
        int increase = _num - this.wiredata.length + this.bufferuse;
        if (increase > 0) {
            void var3_3;
            if (increase < 20) {
                increase = 20;
            }
            this.logger.trace("Resizing {}", (Object)this.bufferuse);
            byte[][] temp = new byte[this.wiredata.length + increase][];
            System.arraycopy(this.wiredata, 0, temp, 0, this.wiredata.length);
            this.wiredata = var3_3;
        }
    }

    protected synchronized void setSerial(long _serial) {
        this.serial = _serial;
    }

    private Object optimizePrimitives(byte[] _signatureBuf, byte[] _dataBuf, int[] _offsets, long _size, byte _algn, int _length, ExtractMethod _extractMethod) throws DBusException {
        Object rv;
        switch (_signatureBuf[_offsets[0]]) {
            case 121: {
                rv = new byte[_length];
                System.arraycopy(_dataBuf, _offsets[1], rv, 0, _length);
                _offsets[1] = (int)((long)_offsets[1] + _size);
                break;
            }
            case 110: {
                rv = new short[_length];
                for (int j = 0; j < _length; ++j) {
                    ((short[])rv)[j] = (short)this.demarshallint(_dataBuf, _offsets[1], _algn);
                    _offsets[1] = _offsets[1] + _algn;
                }
                break;
            }
            case 105: {
                rv = new int[_length];
                for (int j = 0; j < _length; ++j) {
                    ((int[])rv)[j] = (int)this.demarshallint(_dataBuf, _offsets[1], _algn);
                    _offsets[1] = _offsets[1] + _algn;
                }
                break;
            }
            case 120: {
                rv = new long[_length];
                for (int j = 0; j < _length; ++j) {
                    ((long[])rv)[j] = this.demarshallint(_dataBuf, _offsets[1], _algn);
                    _offsets[1] = _offsets[1] + _algn;
                }
                break;
            }
            case 98: {
                rv = new boolean[_length];
                for (int j = 0; j < _length; ++j) {
                    ((boolean[])rv)[j] = 1L == this.demarshallint(_dataBuf, _offsets[1], _algn);
                    _offsets[1] = _offsets[1] + _algn;
                }
                break;
            }
            case 102: {
                rv = new float[_length];
                for (int j = 0; j < _length; ++j) {
                    ((float[])rv)[j] = Float.intBitsToFloat((int)this.demarshallint(_dataBuf, _offsets[1], _algn));
                    _offsets[1] = _offsets[1] + _algn;
                }
                break;
            }
            case 100: {
                rv = new double[_length];
                for (int j = 0; j < _length; ++j) {
                    ((double[])rv)[j] = Double.longBitsToDouble(this.demarshallint(_dataBuf, _offsets[1], _algn));
                    _offsets[1] = _offsets[1] + _algn;
                }
                break;
            }
            case 123: {
                int ofssave = this.prepareCollection(_signatureBuf, _offsets, _size);
                long end = (long)_offsets[1] + _size;
                ArrayList<Object[]> entries = new ArrayList<Object[]>();
                while ((long)_offsets[1] < end) {
                    _offsets[0] = ofssave;
                    entries.add((Object[])_extractMethod.extractOne(_signatureBuf, _dataBuf, _offsets, true));
                }
                rv = new DBusMap((Object[][])entries.toArray((T[])new Object[0][]));
                break;
            }
            default: {
                int ofssave = this.prepareCollection(_signatureBuf, _offsets, _size);
                long end = (long)_offsets[1] + _size;
                ArrayList<Object> contents = new ArrayList<Object>();
                while ((long)_offsets[1] < end) {
                    _offsets[0] = ofssave;
                    contents.add(_extractMethod.extractOne(_signatureBuf, _dataBuf, _offsets, true));
                }
                rv = contents;
            }
        }
        return rv;
    }

    public static int getAlignment(byte _type) {
        return switch (_type) {
            case 2, 110, 113 -> 2;
            case 4, 97, 98, 102, 104, 105, 111, 115, 117 -> 4;
            case 8, 40, 41, 100, 101, 114, 116, 120, 123, 125 -> 8;
            case 1, 103, 118, 121 -> 1;
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

    /*
     * WARNING - void declaration
     */
    protected void appendByte(byte _b) {
        if (this.preallocated > 0) {
            int n = this.paofs;
            this.paofs = n + 1;
            this.pabuf[n] = _b;
            --this.preallocated;
        } else {
            if (this.bufferuse == this.wiredata.length) {
                void var2_2;
                this.logger.trace("Resizing {}", (Object)this.bufferuse);
                byte[][] temp = new byte[this.wiredata.length + 20][];
                System.arraycopy(this.wiredata, 0, temp, 0, this.wiredata.length);
                this.wiredata = var2_2;
            }
            int n = this.bufferuse;
            this.bufferuse = n + 1;
            byte[] byArray = new byte[1];
            byArray[0] = _b;
            this.wiredata[n] = byArray;
            ++this.bytecounter;
        }
    }

    public String getSig() {
        return (String)this.getHeader((byte)8);
    }

    public byte[][] getWireData() {
        return this.wiredata;
    }

    /*
     * WARNING - void declaration
     */
    String dumpWireData() {
        void var1_1;
        StringBuilder sb = new StringBuilder(System.lineSeparator());
        int i = 0;
        while (i < this.wiredata.length) {
            void var2_2;
            byte[] arr = this.wiredata[i];
            if (arr != null) {
                String prefix = "Wiredata[" + i + "]";
                String format = Hexdump.format(arr, 80);
                String[] split = format.split("\n");
                sb.append(prefix).append(": ").append(split[0]).append(System.lineSeparator());
                if (split.length > 1) {
                    sb.append(Arrays.stream(split).skip(1L).map(s -> {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = prefix;
                        objectArray[1] = s;
                        return String.format("%s: %80s", objectArray);
                    }).collect(Collectors.joining(System.lineSeparator())));
                    sb.append(System.lineSeparator());
                }
            }
            ++var2_2;
        }
        return var1_1.toString();
    }

    /*
     * WARNING - void declaration
     */
    public void setSource(String _source) throws DBusException {
        if (null != this.body) {
            void var2_2;
            this.logger.trace("Setting source");
            LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("WireData before: {}", (Object)this.dumpWireData()));
            this.wiredata = new byte[20][];
            this.bufferuse = 0;
            this.bytecounter = 0L;
            this.preallocate(12);
            Object[] objectArray = new Object[6];
            objectArray[0] = this.big ? (byte)66 : 108;
            objectArray[1] = this.type;
            objectArray[2] = this.flags;
            objectArray[3] = this.protover;
            objectArray[4] = this.bodylen;
            objectArray[5] = this.getSerial();
            this.append("yyyyuu", objectArray);
            this.headers[7] = _source;
            LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("WireData first append: {}", (Object)this.dumpWireData()));
            ArrayList<Object[]> newHeader = new ArrayList<Object[]>(this.headers.length);
            int hIdx = 0;
            while (hIdx < this.headers.length) {
                void var3_3;
                Object object = this.headers[hIdx];
                if (object != null) {
                    if (hIdx == 8) {
                        newHeader.add(this.createHeaderArgs((byte)8, "g", object));
                    } else {
                        void var4_4;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[0] = hIdx;
                        objectArray2[1] = var4_4;
                        newHeader.add(objectArray2);
                    }
                }
                ++var3_3;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = newHeader;
            this.append("a(yv)", objectArray3);
            LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.lambda$setSource$9((List)var2_2));
            this.pad((byte)8);
            this.appendBytes(this.body);
        }
    }

    private Object extractStruct(byte[] _signatureBuf, byte[] _dataBuf, int[] _offsets, ExtractMethod _extractMethod) throws DBusException {
        ArrayList<Object> contents = new ArrayList<Object>();
        while (_signatureBuf[_offsets[0] = _offsets[0] + 1] != 41) {
            contents.add(_extractMethod.extractOne(_signatureBuf, _dataBuf, _offsets, true));
        }
        Object[] objectArray = contents.toArray();
        return objectArray;
    }

    public static void marshallintBig(long _l, byte[] _buf, int _ofs, int _width) {
        long l = _l;
        for (int i = _width - 1; i >= 0; --i) {
            _buf[i + _ofs] = (byte)(l & 0xFFL);
            l >>= 8;
        }
    }

    private Object extractByte(byte[] _dataBuf, int[] _offsets) {
        int n = _offsets[1];
        _offsets[1] = n + 1;
        Byte by = _dataBuf[n];
        return by;
    }

    /*
     * WARNING - void declaration
     */
    private Object readHeaderVariants(byte[] _signatureBuf, byte[] _dataBuf, int[] _offsets, boolean _contained) throws DBusException {
        void var5_5;
        void var3_3;
        void var1_1;
        _offsets[1] = this.align(_offsets[1], _signatureBuf[_offsets[0]]);
        Object result = null;
        if (_signatureBuf[_offsets[0]] == 97) {
            result = this.extractArray(_signatureBuf, _dataBuf, _offsets, _contained, this::readHeaderVariants);
        } else if (_signatureBuf[_offsets[0]] == 121) {
            result = this.extractByte(_dataBuf, _offsets);
        } else if (_signatureBuf[_offsets[0]] == 118) {
            result = this.extractVariant(_dataBuf, _offsets, (sig, obj) -> obj);
        } else if (_signatureBuf[_offsets[0]] == 40) {
            result = this.extractStruct(_signatureBuf, _dataBuf, _offsets, this::readHeaderVariants);
        } else {
            throw new MessageFormatException("Unsupported data type in header: " + _signatureBuf[_offsets[0]]);
        }
        this.logger.trace("Extracted header signature type '{}' to: '{}'", (Object)Character.valueOf((char)var1_1[var3_3[0]]), (Object)var5_5);
        return var5_5;
    }

    private /* synthetic */ void lambda$setSource$9(List newHeader) {
        this.logger.trace("New header: {}", (Object)LoggingHelper.arraysVeryDeepString(newHeader.toArray()));
        this.logger.trace("WireData after: {}", (Object)this.dumpWireData());
    }

    public static long demarshallint(byte[] _buf, int _ofs, byte _endian, int _width) {
        return _endian == 66 ? Message.demarshallintBig(_buf, _ofs, _width) : Message.demarshallintLittle(_buf, _ofs, _width);
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

    /*
     * WARNING - void declaration
     */
    protected Object[] createHeaderArgs(byte _header, String _argType, Object _value) {
        void var3_3;
        this.getHeader()[_header] = _value;
        Object[] objectArray = new Object[2];
        objectArray[0] = _header;
        Object[] objectArray2 = new Object[2];
        objectArray2[0] = _argType;
        objectArray2[1] = var3_3;
        objectArray[1] = objectArray2;
        return objectArray;
    }

    /*
     * WARNING - void declaration
     */
    private int prepareCollection(byte[] _signatureBuf, int[] _offsets, long _size) throws DBusException {
        void var2_2;
        if (0L == _size) {
            ArrayList<Type> temp = new ArrayList<Type>();
            byte[] temp2 = new byte[_signatureBuf.length - _offsets[0]];
            System.arraycopy(_signatureBuf, _offsets[0], temp2, 0, temp2.length);
            String temp3 = new String(temp2);
            int temp4 = Marshalling.getJavaType(temp3, temp, 1) - 1;
            _offsets[0] = _offsets[0] + temp4;
            Object[] objectArray = new Object[3];
            objectArray[0] = temp3;
            objectArray[1] = temp4;
            objectArray[2] = _offsets[0];
            this.logger.trace("Aligned type: {} {} {}", objectArray);
        }
        return (int)var2_2[0];
    }

    protected void marshallint(long _l, byte[] _buf, int _ofs, int _width) {
        if (this.big) {
            Message.marshallintBig(_l, _buf, _ofs, _width);
        } else {
            Message.marshallintLittle(_l, _buf, _ofs, _width);
        }
        LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Marshalled int {} to {}", (Object)_l, (Object)Hexdump.toHex(_buf, _ofs, _width, true)));
    }

    protected void append(String _sig, Object ... _data) throws DBusException {
        LoggingHelper.logIf(this.logger.isDebugEnabled(), () -> this.logger.debug("Appending sig: {} data: {}", (Object)_sig, (Object)LoggingHelper.arraysVeryDeepString(_data)));
        byte[] sigb = _sig.getBytes();
        int j = 0;
        int i = 0;
        while (i < sigb.length) {
            Object[] objectArray = new Object[3];
            objectArray[0] = i;
            objectArray[1] = Character.valueOf((char)sigb[i]);
            objectArray[2] = j;
            this.logger.trace("Appending item: {} {} {}", objectArray);
            int n = this.appendOne(sigb, i, _data[j++]);
            ++n;
        }
    }

    protected void setWireData(byte[][] _wiredata) {
        this.wiredata = _wiredata;
    }

    protected long demarshallint(byte[] _buf, int _ofs, int _width) {
        return this.big ? Message.demarshallintBig(_buf, _ofs, _width) : Message.demarshallintLittle(_buf, _ofs, _width);
    }

    protected Object getHeader(byte _type) {
        return this.headers.length == 0 || this.headers.length < _type ? null : this.headers[_type];
    }

    /*
     * WARNING - void declaration
     */
    public static long demarshallintLittle(byte[] _buf, int _ofs, int _width) {
        void var3_3;
        long l = 0L;
        for (int i = _width + -1; i >= 0; --i) {
            l <<= 8;
            l |= (long)(_buf[_ofs + i] & 0xFF);
        }
        return (long)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public static long demarshallintBig(byte[] _buf, int _ofs, int _width) {
        void var3_3;
        long l = 0L;
        for (int i = 0; i < _width; ++i) {
            l <<= 8;
            l |= (long)(_buf[_ofs + i] & 0xFF);
        }
        return (long)var3_3;
    }

    protected Object[] getHeader() {
        return this.headers;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        void var1_1;
        Object[] largs;
        StringBuilder sb;
        block29: {
            block28: {
                sb = new StringBuilder();
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
                    for (int i = 0; i < this.headers.length; ++i) {
                        sb.append(Message.getHeaderFieldName((byte)i));
                        sb.append('=');
                        sb.append('>');
                        sb.append(this.headers[i]);
                        sb.append(',');
                        sb.append(' ');
                    }
                    sb.setCharAt(sb.length() - 2, ' ');
                    sb.setCharAt(sb.length() - 1, '}');
                }
                sb.append(' ');
                sb.append('{');
                sb.append(' ');
                largs = null;
                try {
                    largs = this.getParameters();
                }
                catch (DBusException _ex) {
                    void var3_4;
                    this.logger.debug("", (Throwable)var3_4);
                }
                if (null == largs) break block28;
                if (0 != largs.length) break block29;
            }
            sb.append('}');
            return var1_1.toString();
        }
        Object[] objectArray = largs;
        int n = objectArray.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                sb.setCharAt(sb.length() - 2, ' ');
                var1_1.setCharAt(var1_1.length() - 1, '}');
                return var1_1.toString();
            }
            Object o = objectArray[n2];
            if (o == null) {
                sb.append("null");
            } else if (o instanceof Object[]) {
                Object[] objectArray2 = (Object[])o;
                sb.append(Arrays.deepToString(objectArray2));
            } else if (o instanceof byte[]) {
                byte[] byArray = (byte[])o;
                sb.append(Arrays.toString(byArray));
            } else if (o instanceof int[]) {
                int[] nArray = (int[])o;
                sb.append(Arrays.toString(nArray));
            } else if (o instanceof short[]) {
                short[] sArray = (short[])o;
                sb.append(Arrays.toString(sArray));
            } else if (o instanceof long[]) {
                long[] lArray = (long[])o;
                sb.append(Arrays.toString(lArray));
            } else if (o instanceof boolean[]) {
                boolean[] blArray = (boolean[])o;
                sb.append(Arrays.toString(blArray));
            } else if (o instanceof double[]) {
                double[] dArray = (double[])o;
                sb.append(Arrays.toString(dArray));
            } else if (o instanceof float[]) {
                float[] fArray = (float[])o;
                sb.append(Arrays.toString(fArray));
            } else {
                sb.append(o);
            }
            sb.append(',');
            sb.append(' ');
            ++n2;
        }
    }

    public byte getEndianess() {
        if (this.endianWasSet) {
            return this.big ? (byte)66 : 108;
        }
        return 0;
    }

    private Object extractArray(byte[] _signatureBuf, byte[] _dataBuf, int[] _offsets, boolean _contained, ExtractMethod _extractMethod) throws DBusException, MarshallingException {
        List list;
        long size = this.demarshallint(_dataBuf, _offsets[1], 4);
        this.logger.trace("Reading array of size: {}", (Object)size);
        _offsets[1] = _offsets[1] + 4;
        _offsets[0] = _offsets[0] + 1;
        byte algn = (byte)Message.getAlignment(_signatureBuf[_offsets[0]]);
        _offsets[1] = this.align(_offsets[1], _signatureBuf[_offsets[0]]);
        int length = (int)(size / (long)algn);
        if (length > 0x4000000) {
            throw new MarshallingException("Arrays must not exceed 67108864");
        }
        Object rv = this.optimizePrimitives(_signatureBuf, _dataBuf, _offsets, size, algn, length, _extractMethod);
        if (_contained && !(rv instanceof List) && !(list instanceof Map)) {
            list = ArrayFrob.listify(list);
        }
        return list;
    }

    /*
     * WARNING - void declaration
     */
    protected void appendBytes(byte[] _buf) {
        if (null == _buf) {
            return;
        }
        if (this.preallocated > 0) {
            if (this.paofs + _buf.length > this.pabuf.length) {
                Object[] objectArray = new Object[3];
                objectArray[0] = this.paofs;
                objectArray[1] = this.pabuf.length;
                objectArray[2] = _buf.length;
                throw new ArrayIndexOutOfBoundsException(MessageFormat.format("Array index out of bounds, paofs={0}, pabuf.length={1}, buf.length={2}.", objectArray));
            }
            System.arraycopy(_buf, 0, this.pabuf, this.paofs, _buf.length);
            this.paofs += _buf.length;
            this.preallocated -= _buf.length;
        } else {
            void var1_1;
            if (this.bufferuse == this.wiredata.length) {
                void var2_2;
                this.logger.trace("Resizing {}", (Object)this.bufferuse);
                byte[][] temp = new byte[this.wiredata.length + 20][];
                System.arraycopy(this.wiredata, 0, temp, 0, this.wiredata.length);
                this.wiredata = var2_2;
            }
            int n = this.bufferuse;
            this.bufferuse = n + 1;
            this.wiredata[n] = _buf;
            this.bytecounter += (long)((void)var1_1).length;
        }
    }

    protected Message(byte _endian, byte _type, byte _flags) throws DBusException {
        this();
        this.big = 66 == _endian;
        this.setSerial(GLOBAL_SERIAL.incrementAndGet());
        this.logger.debug("Creating message with serial {}", (Object)this.getSerial());
        this.type = _type;
        this.flags = _flags;
        this.preallocate(4);
        this.endianWasSet = _endian != 0;
        Object[] objectArray = new Object[4];
        objectArray[0] = _endian;
        objectArray[1] = _type;
        objectArray[2] = _flags;
        objectArray[3] = (byte)1;
        this.append("yyyy", objectArray);
    }

    public void updateEndianess(byte _endianess) {
        if (this.endianWasSet) {
            return;
        }
        if (this.wiredata[0] != null) {
            this.wiredata[0][0] = _endianess;
        } else {
            byte[] byArray = new byte[4];
            byArray[0] = _endianess;
            byArray[1] = 0;
            byArray[2] = 0;
            byArray[3] = 0;
            this.wiredata[0] = byArray;
        }
        this.endianWasSet = true;
    }

    private Object extractOne(byte[] _signatureBuf, byte[] _dataBuf, int[] _offsets, boolean _contained) throws DBusException {
        this.logger.trace("Extracting type: {} from offset {}", (Object)Character.valueOf((char)_signatureBuf[_offsets[0]]), (Object)_offsets[1]);
        Object[] rv = null;
        _offsets[1] = this.align(_offsets[1], _signatureBuf[_offsets[0]]);
        switch (_signatureBuf[_offsets[0]]) {
            case 121: {
                rv = this.extractByte(_dataBuf, _offsets);
                break;
            }
            case 117: {
                rv = new UInt32(this.demarshallint(_dataBuf, _offsets[1], 4));
                _offsets[1] = _offsets[1] + 4;
                break;
            }
            case 105: {
                rv = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
                _offsets[1] = _offsets[1] + 4;
                break;
            }
            case 110: {
                rv = (short)this.demarshallint(_dataBuf, _offsets[1], 2);
                _offsets[1] = _offsets[1] + 2;
                break;
            }
            case 113: {
                rv = new UInt16((int)this.demarshallint(_dataBuf, _offsets[1], 2));
                _offsets[1] = _offsets[1] + 2;
                break;
            }
            case 120: {
                rv = this.demarshallint(_dataBuf, _offsets[1], 8);
                _offsets[1] = _offsets[1] + 8;
                break;
            }
            case 116: {
                long bottom;
                long top;
                if (this.big) {
                    top = this.demarshallint(_dataBuf, _offsets[1], 4);
                    _offsets[1] = _offsets[1] + 4;
                    bottom = this.demarshallint(_dataBuf, _offsets[1], 4);
                } else {
                    bottom = this.demarshallint(_dataBuf, _offsets[1], 4);
                    _offsets[1] = _offsets[1] + 4;
                    top = this.demarshallint(_dataBuf, _offsets[1], 4);
                }
                rv = new UInt64(top, bottom);
                _offsets[1] = _offsets[1] + 4;
                break;
            }
            case 100: {
                long l = this.demarshallint(_dataBuf, _offsets[1], 8);
                _offsets[1] = _offsets[1] + 8;
                rv = Double.longBitsToDouble(l);
                break;
            }
            case 102: {
                int rf = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
                _offsets[1] = _offsets[1] + 4;
                rv = Float.valueOf(Float.intBitsToFloat(rf));
                break;
            }
            case 98: {
                int rf = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
                _offsets[1] = _offsets[1] + 4;
                rv = 1 == rf ? Boolean.TRUE : Boolean.FALSE;
                break;
            }
            case 97: {
                rv = this.extractArray(_signatureBuf, _dataBuf, _offsets, _contained, this::extractOne);
                break;
            }
            case 40: {
                rv = this.extractStruct(_signatureBuf, _dataBuf, _offsets, this::extractOne);
                break;
            }
            case 123: {
                Object[] decontents = new Object[2];
                LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Extracting Dict Entry ({}) from: {}", (Object)Hexdump.toAscii(_signatureBuf, _offsets[0], _signatureBuf.length - _offsets[0]), (Object)Hexdump.toHex(_dataBuf, _offsets[1], _dataBuf.length - _offsets[1], true)));
                _offsets[0] = _offsets[0] + 1;
                decontents[0] = this.extractOne(_signatureBuf, _dataBuf, _offsets, true);
                _offsets[0] = _offsets[0] + 1;
                decontents[1] = this.extractOne(_signatureBuf, _dataBuf, _offsets, true);
                _offsets[0] = _offsets[0] + 1;
                rv = decontents;
                break;
            }
            case 118: {
                rv = this.extractVariant(_dataBuf, _offsets, (sig, obj) -> new Variant<Object>(obj, (String)sig));
                break;
            }
            case 104: {
                rv = this.filedescriptors.get((int)this.demarshallint(_dataBuf, _offsets[1], 4));
                _offsets[1] = _offsets[1] + 4;
                break;
            }
            case 115: {
                int length = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
                _offsets[1] = _offsets[1] + 4;
                rv = new String(_dataBuf, _offsets[1], length, StandardCharsets.UTF_8);
                _offsets[1] = _offsets[1] + (length + 1);
                break;
            }
            case 111: {
                int length = (int)this.demarshallint(_dataBuf, _offsets[1], 4);
                _offsets[1] = _offsets[1] + 4;
                rv = new ObjectPath(this.getSource(), new String(_dataBuf, _offsets[1], length));
                _offsets[1] = _offsets[1] + (length + 1);
                break;
            }
            case 103: {
                int n = _offsets[1];
                _offsets[1] = n + 1;
                int length = _dataBuf[n] & 0xFF;
                rv = new String(_dataBuf, _offsets[1], length);
                _offsets[1] = _offsets[1] + (length + 1);
                break;
            }
            default: {
                throw new UnknownTypeCodeException(_signatureBuf[_offsets[0]]);
            }
        }
        if (this.logger.isTraceEnabled()) {
            if (rv instanceof Object[]) {
                Object[] oa = rv;
                this.logger.trace("Extracted: {} (now at {})", (Object)Arrays.deepToString(oa), (Object)_offsets[1]);
            } else {
                this.logger.trace("Extracted: {} (now at {})", (Object)rv, (Object)_offsets[1]);
            }
        }
        return rv;
    }

    /*
     * WARNING - void declaration
     */
    protected Object[] extract(String _signature, byte[] _dataBuf, int _offsets) throws DBusException {
        void var3_3;
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = var3_3;
        return this.extract(_signature, _dataBuf, nArray);
    }

    private /* synthetic */ void lambda$padAndMarshall$11(byte[] blen) {
        this.logger.trace("marshalled size ({}): {}", (Object)blen, (Object)Hexdump.format(blen));
    }

    protected Message() {
        this.filedescriptors = new ArrayList<FileDescriptor>();
        this.headers = new Object[10];
        this.wiredata = new byte[20][];
    }

    protected void appendint(long _l, int _width) {
        byte[] buf = new byte[_width];
        this.marshallint(_l, buf, 0, _width);
        this.appendBytes(buf);
    }

    /*
     * WARNING - void declaration
     */
    protected void pad(byte _type) {
        void var2_2;
        this.logger.trace("padding for {}", (Object)Character.valueOf((char)_type));
        int a2 = Message.getAlignment(_type);
        Object[] objectArray = new Object[4];
        objectArray[0] = this.preallocated;
        objectArray[1] = this.paofs;
        objectArray[2] = this.bytecounter;
        objectArray[3] = a2;
        this.logger.trace("{} {} {} {}", objectArray);
        int b2 = (int)((this.bytecounter - (long)this.preallocated) % (long)a2);
        if (0 == b2) {
            return;
        }
        a2 -= b2;
        if (this.preallocated > 0) {
            this.paofs += a2;
            this.preallocated -= a2;
        } else {
            this.appendBytes(padding[a2]);
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[0] = this.preallocated;
        objectArray2[1] = this.paofs;
        objectArray2[2] = this.bytecounter;
        objectArray2[3] = (int)var2_2;
        this.logger.trace("{} {} {} {}", objectArray2);
    }

    protected Object[] extract(String _signature, byte[] _dataBuf, int[] _offsets) throws DBusException {
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

    void populate(byte[] _msg, byte[] _headers, byte[] _body, List<FileDescriptor> _descriptors) throws DBusException {
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
        this.logger.debug("Received message of type {} with serial {}", (Object)this.type, (Object)extractedSerial);
        this.setSerial(extractedSerial);
        this.bytecounter = (long)msgBuf.length + (long)headerBuf.length + (long)bodyBuf.length;
        this.filedescriptors.clear();
        if (_descriptors != null) {
            this.filedescriptors.addAll(_descriptors);
        }
        LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Message header: {}", (Object)Hexdump.toAscii(headerBuf)));
        Object[] hs = this.extractHeader(headerBuf);
        LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Extracted objects: {}", (Object)LoggingHelper.arraysVeryDeepString(hs)));
        List list = (List)hs[0];
        for (Object o : list) {
            Object[] objectArray = (Object[])o;
            byte by = (Byte)objectArray[0];
            this.headers[by] = objectArray[1];
        }
    }

    static {
        byte[][] byArrayArray = new byte[8][];
        byArrayArray[0] = null;
        byArrayArray[1] = new byte[1];
        byArrayArray[2] = new byte[2];
        byArrayArray[3] = new byte[3];
        byArrayArray[4] = new byte[4];
        byArrayArray[5] = new byte[5];
        byArrayArray[6] = new byte[6];
        byArrayArray[7] = new byte[7];
        padding = byArrayArray;
        GLOBAL_SERIAL = new AtomicLong(0L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object[] getParameters() throws DBusException {
        if (null != this.args) return this.args;
        if (null == this.body) return this.args;
        String sig = this.getSig();
        if (null != sig) {
            if (0 != this.body.length) {
                this.args = this.extract(sig, this.body, 0);
                return this.args;
            }
        }
        this.args = new Object[0];
        return this.args;
    }

    public void setArgs(Object[] _args) {
        this.args = _args;
    }

    public int getFlags() {
        return this.flags;
    }

    public String getName() {
        if (this instanceof Error) {
            return (String)this.getHeader((byte)4);
        }
        return (String)this.getHeader((byte)3);
    }

    private int appendOne(byte[] _sigb, int _sigofs, Object _data) throws DBusException {
        try {
            int i = _sigofs;
            this.logger.trace("{}", (Object)this.bytecounter);
            this.logger.trace("Appending type: {} value: {}", (Object)Character.valueOf((char)_sigb[i]), _data);
            this.pad(_sigb[i]);
            switch (_sigb[i]) {
                case 121: {
                    this.appendByte(((Number)_data).byteValue());
                    break;
                }
                case 98: {
                    this.appendint((Boolean)_data != false ? 1L : 0L, 4);
                    break;
                }
                case 100: {
                    long l = Double.doubleToLongBits(((Number)_data).doubleValue());
                    this.appendint(l, 8);
                    break;
                }
                case 102: {
                    int rf = Float.floatToIntBits(((Number)_data).floatValue());
                    this.appendint(rf, 4);
                    break;
                }
                case 117: {
                    this.appendint(((Number)_data).longValue(), 4);
                    break;
                }
                case 120: {
                    this.appendint(((Number)_data).longValue(), 8);
                    break;
                }
                case 116: {
                    if (this.big) {
                        this.appendint(((UInt64)_data).top(), 4);
                        this.appendint(((UInt64)_data).bottom(), 4);
                        break;
                    }
                    this.appendint(((UInt64)_data).bottom(), 4);
                    this.appendint(((UInt64)_data).top(), 4);
                    break;
                }
                case 105: {
                    this.appendint(((Number)_data).intValue(), 4);
                    break;
                }
                case 113: {
                    this.appendint(((Number)_data).intValue(), 2);
                    break;
                }
                case 110: {
                    this.appendint(((Number)_data).shortValue(), 2);
                    break;
                }
                case 104: {
                    this.filedescriptors.add((FileDescriptor)_data);
                    this.appendint((long)this.filedescriptors.size() - 1L, 4);
                    this.logger.debug("Just inserted {} as filedescriptor", (Object)(this.filedescriptors.size() - 1));
                    break;
                }
                case 111: 
                case 115: {
                    String payload;
                    if (_data instanceof DBusInterface) {
                        DBusInterface di = (DBusInterface)_data;
                        payload = di.getObjectPath();
                    } else {
                        payload = _data.toString();
                    }
                    byte[] payloadbytes = payload.getBytes(StandardCharsets.UTF_8);
                    this.logger.trace("Appending String of length {}", (Object)payloadbytes.length);
                    this.appendint(payloadbytes.length, 4);
                    this.appendBytes(payloadbytes);
                    this.appendBytes(padding[1]);
                    break;
                }
                case 103: {
                    String payload;
                    if (_data instanceof Type[]) {
                        Type[] ta = (Type[])_data;
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
                }
                case 97: {
                    if (this.logger.isTraceEnabled() && _data instanceof Object[]) {
                        Object[] oa = (Object[])_data;
                        this.logger.trace("Appending array: {}", (Object)Arrays.deepToString(oa));
                    }
                    byte[] alen = new byte[4];
                    this.appendBytes(alen);
                    this.pad(_sigb[++i]);
                    long c = this.bytecounter;
                    if (_data.getClass().isArray() && _data.getClass().getComponentType().isPrimitive()) {
                        byte[] primbuf;
                        int algn = Message.getAlignment(_sigb[i]);
                        int len = Array.getLength(_data);
                        switch (_sigb[i]) {
                            case 121: {
                                primbuf = (byte[])_data;
                                break;
                            }
                            case 105: 
                            case 110: 
                            case 120: {
                                primbuf = new byte[len * algn];
                                int j = 0;
                                int k = 0;
                                while (j < len) {
                                    this.marshallint(Array.getLong(_data, j), primbuf, k, algn);
                                    ++j;
                                    k += algn;
                                }
                                break;
                            }
                            case 98: {
                                primbuf = new byte[len * algn];
                                int j = 0;
                                int k = 0;
                                while (j < len) {
                                    this.marshallint(Array.getBoolean(_data, j) ? 1L : 0L, primbuf, k, algn);
                                    ++j;
                                    k += algn;
                                }
                                break;
                            }
                            case 100: {
                                primbuf = new byte[len * algn];
                                if (_data instanceof float[]) {
                                    float[] fa = (float[])_data;
                                    int j = 0;
                                    int k = 0;
                                    while (j < len) {
                                        this.marshallint(Double.doubleToRawLongBits(fa[j]), primbuf, k, algn);
                                        ++j;
                                        k += algn;
                                    }
                                } else {
                                    int j = 0;
                                    int k = 0;
                                    while (j < len) {
                                        this.marshallint(Double.doubleToRawLongBits(((double[])_data)[j]), primbuf, k, algn);
                                        ++j;
                                        k += algn;
                                    }
                                }
                                break;
                            }
                            case 102: {
                                primbuf = new byte[len * algn];
                                int j = 0;
                                int k = 0;
                                while (j < len) {
                                    this.marshallint(Float.floatToRawIntBits(((float[])_data)[j]), primbuf, k, algn);
                                    ++j;
                                    k += algn;
                                }
                                break;
                            }
                            default: {
                                throw new MarshallingException("Primitive array being sent as non-primitive array.");
                            }
                        }
                        this.appendBytes(primbuf);
                    } else if (_data instanceof List) {
                        List lst = (List)_data;
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
                    } else if (_data instanceof Map) {
                        Map map = (Map)_data;
                        int diff = i;
                        this.ensureBuffers(map.size() * 6);
                        for (Map.Entry o : map.entrySet()) {
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
                }
                case 40: {
                    Object[] contents;
                    if (_data instanceof Container) {
                        Container cont = (Container)_data;
                        contents = cont.getParameters();
                    } else {
                        contents = (Object[])_data;
                    }
                    this.ensureBuffers(contents.length * 4);
                    int j = 0;
                    ++i;
                    while (_sigb[i] != 41) {
                        i = this.appendOne(_sigb, i, contents[j++]);
                        ++i;
                    }
                    break;
                }
                case 123: {
                    if (_data instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry)_data;
                        ++i;
                        i = this.appendOne(_sigb, i, entry.getKey());
                        ++i;
                        i = this.appendOne(_sigb, i, entry.getValue());
                        ++i;
                        break;
                    }
                    Object[] contents = (Object[])_data;
                    int j = 0;
                    ++i;
                    while (_sigb[i] != 125) {
                        i = this.appendOne(_sigb, i, contents[j++]);
                        ++i;
                    }
                    break;
                }
                case 118: {
                    if (_data instanceof Variant) {
                        Variant variant = (Variant)_data;
                        this.appendOne(new byte[]{103}, 0, variant.getSig());
                        this.appendOne(variant.getSig().getBytes(), 0, variant.getValue());
                        break;
                    }
                    if (_data instanceof Object[]) {
                        Object[] oa = (Object[])_data;
                        this.appendOne(new byte[]{103}, 0, oa[0]);
                        this.appendOne(((String)oa[0]).getBytes(), 0, oa[1]);
                        break;
                    }
                    String sig = Marshalling.getDBusType(_data.getClass())[0];
                    this.appendOne(new byte[]{103}, 0, sig);
                    this.appendOne(sig.getBytes(), 0, _data);
                }
            }
            return i;
        }
        catch (ClassCastException _ex) {
            this.logger.debug("Trying to marshall to unconvertible type.", _ex);
            throw new MarshallingException(MessageFormat.format("Trying to marshall to unconvertible type (from {0} to {1}).", _data.getClass().getName(), Character.valueOf((char)_sigb[_sigofs])));
        }
    }

    protected long getByteCounter() {
        return this.bytecounter;
    }

    /*
     * WARNING - void declaration
     */
    protected int align(int _current, byte _type) {
        void var3_3;
        void var1_1;
        this.logger.trace("aligning to {}", (Object)Character.valueOf((char)_type));
        int a2 = Message.getAlignment(_type);
        if (0 == _current % a2) {
            return _current;
        }
        return _current + (a2 - var1_1 % var3_3);
    }

    @FunctionalInterface
    static interface ExtractMethod {
        public Object extractOne(byte[] var1, byte[] var2, int[] var3, boolean var4) throws DBusException;
    }
}

