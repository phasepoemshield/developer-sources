/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.DirectBufferAccess;
import sun.misc.Unsafe;

public class MessageBuffer {
    static final boolean isUniversalBuffer;
    static final Unsafe unsafe;
    static final int javaVersion;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    protected final Object base;
    protected final long address;
    protected final int size;
    protected final ByteBuffer reference;

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (!isUniversalBuffer && !messageBuffer.hasArray()) {
            if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
                DirectBufferAccess.clean(messageBuffer.reference);
            } else {
                unsafe.freeMemory(messageBuffer.address);
            }
        }
    }

    MessageBuffer(byte[] byArray, int n, int n2) {
        this.base = byArray;
        this.address = ARRAY_BYTE_BASE_OFFSET + n;
        this.size = n2;
        this.reference = null;
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                this.base = null;
                this.address = 0L;
                this.size = byteBuffer.remaining();
                this.reference = null;
                return;
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + (long)byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
        } else if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset() + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = null;
        } else {
            throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
        }
    }

    protected MessageBuffer(Object object, long l, int n) {
        this.base = object;
        this.address = l;
        this.size = n;
        this.reference = null;
    }

    public int size() {
        return this.size;
    }

    public boolean getBoolean(int n) {
        return unsafe.getBoolean(this.base, this.address + (long)n);
    }

    public void putBoolean(int n, boolean bl) {
        unsafe.putBoolean(this.base, this.address + (long)n, bl);
    }

    public byte getByte(int n) {
        return unsafe.getByte(this.base, this.address + (long)n);
    }

    public void putByte(int n, byte by) {
        unsafe.putByte(this.base, this.address + (long)n, by);
    }

    public short getShort(int n) {
        short s = unsafe.getShort(this.base, this.address + (long)n);
        return Short.reverseBytes(s);
    }

    public void putShort(int n, short s) {
        s = Short.reverseBytes(s);
        unsafe.putShort(this.base, this.address + (long)n, s);
    }

    public int getInt(int n) {
        int n2 = unsafe.getInt(this.base, this.address + (long)n);
        return Integer.reverseBytes(n2);
    }

    public void putInt(int n, int n2) {
        n2 = Integer.reverseBytes(n2);
        unsafe.putInt(this.base, this.address + (long)n, n2);
    }

    public long getLong(int n) {
        long l = unsafe.getLong(this.base, this.address + (long)n);
        return Long.reverseBytes(l);
    }

    public void putLong(int n, long l) {
        l = Long.reverseBytes(l);
        unsafe.putLong(this.base, this.address + (long)n, l);
    }

    public float getFloat(int n) {
        return Float.intBitsToFloat(this.getInt(n));
    }

    public void putFloat(int n, float f) {
        this.putInt(n, Float.floatToRawIntBits(f));
    }

    public double getDouble(int n) {
        return Double.longBitsToDouble(this.getLong(n));
    }

    public void putDouble(int n, double d) {
        this.putLong(n, Double.doubleToRawLongBits(d));
    }

    public String toHexString(int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < n2; ++i) {
            if (i != n) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(String.format("%02x", this.getByte(i)));
        }
        return stringBuilder.toString();
    }

    public static MessageBuffer wrap(byte[] byArray, int n, int n2) {
        return MessageBuffer.newMessageBuffer(byArray, n, n2);
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return MessageBuffer.newMessageBuffer(byteBuffer);
    }

    public static MessageBuffer wrap(byte[] byArray) {
        return MessageBuffer.newMessageBuffer(byArray, 0, byArray.length);
    }

    public void getBytes(int n, int n2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < n2) {
            throw new BufferOverflowException();
        }
        ByteBuffer byteBuffer2 = this.sliceAsByteBuffer(n, n2);
        byteBuffer.put(byteBuffer2);
    }

    public void getBytes(int n, byte[] byArray, int n2, int n3) {
        unsafe.copyMemory(this.base, this.address + (long)n, byArray, ARRAY_BYTE_BASE_OFFSET + n2, n3);
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object ... objectArray) {
        try {
            return (MessageBuffer)constructor.newInstance(objectArray);
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            if (invocationTargetException.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException.getCause();
            }
            if (invocationTargetException.getCause() instanceof Error) {
                throw (Error)invocationTargetException.getCause();
            }
            throw new IllegalStateException(invocationTargetException.getCause());
        }
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public byte[] array() {
        return (byte[])this.base;
    }

    public int arrayOffset() {
        return (int)this.address - ARRAY_BYTE_BASE_OFFSET;
    }

    public MessageBuffer slice(int n, int n2) {
        if (n == 0 && n2 == this.size()) {
            return this;
        }
        Preconditions.checkArgument(n + n2 <= this.size());
        return new MessageBuffer(this.base, this.address + (long)n, n2);
    }

    public static MessageBuffer allocate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("size must not be negative");
        }
        return MessageBuffer.wrap(new byte[n]);
    }

    public byte[] toByteArray() {
        byte[] byArray = new byte[this.size()];
        unsafe.copyMemory(this.base, this.address, byArray, ARRAY_BYTE_BASE_OFFSET, this.size());
        return byArray;
    }

    public void copyTo(int n, MessageBuffer messageBuffer, int n2, int n3) {
        unsafe.copyMemory(this.base, this.address + (long)n, messageBuffer.base, messageBuffer.address + (long)n2, n3);
    }

    public void putBytes(int n, byte[] byArray, int n2, int n3) {
        unsafe.copyMemory(byArray, ARRAY_BYTE_BASE_OFFSET + n2, this.base, this.address + (long)n, n3);
    }

    private static MessageBuffer newMessageBuffer(byte[] byArray, int n, int n2) {
        Preconditions.checkNotNull(byArray);
        if (mbArrConstructor != null) {
            return MessageBuffer.newInstance(mbArrConstructor, byArray, n, n2);
        }
        return new MessageBuffer(byArray, n, n2);
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        if (mbBBConstructor != null) {
            return MessageBuffer.newInstance(mbBBConstructor, byteBuffer);
        }
        return new MessageBuffer(byteBuffer);
    }

    public void putByteBuffer(int n, ByteBuffer byteBuffer, int n2) {
        assert (n2 <= byteBuffer.remaining());
        assert (!isUniversalBuffer);
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory(null, DirectBufferAccess.getAddress(byteBuffer) + (long)byteBuffer.position(), this.base, this.address + (long)n, n2);
            byteBuffer.position(byteBuffer.position() + n2);
        } else if (byteBuffer.hasArray()) {
            byte[] byArray = byteBuffer.array();
            unsafe.copyMemory(byArray, ARRAY_BYTE_BASE_OFFSET + byteBuffer.position(), this.base, this.address + (long)n, n2);
            byteBuffer.position(byteBuffer.position() + n2);
        } else if (this.hasArray()) {
            byteBuffer.get((byte[])this.base, n, n2);
        } else {
            for (int i = 0; i < n2; ++i) {
                unsafe.putByte(this.base, this.address + (long)n, byteBuffer.get());
            }
        }
    }

    private static int getJavaVersion() {
        String string = System.getProperty("java.specification.version", "");
        int n = string.indexOf(46);
        if (n != -1) {
            try {
                int n2 = Integer.parseInt(string.substring(0, n));
                int n3 = Integer.parseInt(string.substring(n + 1));
                return n2 > 1 ? n2 : n3;
            }
            catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace(System.err);
            }
        } else {
            try {
                return Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace(System.err);
            }
        }
        return 6;
    }

    public void putMessageBuffer(int n, MessageBuffer messageBuffer, int n2, int n3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + (long)n2, this.base, this.address + (long)n, n3);
    }

    public ByteBuffer sliceAsByteBuffer(int n, int n2) {
        if (this.hasArray()) {
            return ByteBuffer.wrap((byte[])this.base, (int)(this.address - (long)ARRAY_BYTE_BASE_OFFSET + (long)n), n2);
        }
        assert (!isUniversalBuffer);
        return DirectBufferAccess.newByteBuffer(this.address, n, n2, this.reference);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return this.sliceAsByteBuffer(0, this.size());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static {
        block25: {
            String string;
            AccessibleObject accessibleObject;
            block23: {
                boolean bl;
                block22: {
                    javaVersion = MessageBuffer.getJavaVersion();
                    boolean bl2 = false;
                    Unsafe unsafe = null;
                    int n = 16;
                    try {
                        boolean bl3 = false;
                        try {
                            bl3 = Class.forName("sun.misc.Unsafe") != null;
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        bl = System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
                        boolean bl4 = System.getProperty("com.google.appengine.runtime.version") != null;
                        boolean bl5 = bl2 = Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false")) || bl || bl4 || javaVersion < 7 || !bl3;
                        if (!bl2) {
                            accessibleObject = Unsafe.class.getDeclaredField("theUnsafe");
                            ((Field)accessibleObject).setAccessible(true);
                            unsafe = (Unsafe)((Field)accessibleObject).get(null);
                            if (unsafe == null) {
                                throw new RuntimeException("Unsafe is unavailable");
                            }
                            n = unsafe.arrayBaseOffset(byte[].class);
                            int n2 = unsafe.arrayIndexScale(byte[].class);
                            if (n2 != 1) {
                                throw new IllegalStateException("Byte array index scale must be 1, but is " + n2);
                            }
                        }
                        MessageBuffer.unsafe = unsafe;
                        ARRAY_BYTE_BASE_OFFSET = n;
                        isUniversalBuffer = bl2;
                        if (!isUniversalBuffer) break block22;
                        string = UNIVERSAL_MESSAGE_BUFFER;
                        break block23;
                    }
                    catch (Exception exception) {
                        String string2;
                        block24: {
                            try {
                                exception.printStackTrace(System.err);
                                bl2 = true;
                                MessageBuffer.unsafe = unsafe;
                                ARRAY_BYTE_BASE_OFFSET = n;
                                isUniversalBuffer = bl2;
                                if (!isUniversalBuffer) break block24;
                                string2 = UNIVERSAL_MESSAGE_BUFFER;
                            }
                            catch (Throwable throwable) {
                                String string3;
                                MessageBuffer.unsafe = unsafe;
                                ARRAY_BYTE_BASE_OFFSET = n;
                                isUniversalBuffer = bl2;
                                if (isUniversalBuffer) {
                                    string3 = UNIVERSAL_MESSAGE_BUFFER;
                                } else {
                                    boolean bl6 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
                                    String string4 = string3 = bl6 ? DEFAULT_MESSAGE_BUFFER : BIGENDIAN_MESSAGE_BUFFER;
                                }
                                if (DEFAULT_MESSAGE_BUFFER.equals(string3)) {
                                    mbArrConstructor = null;
                                    mbBBConstructor = null;
                                } else {
                                    try {
                                        Class<?> clazz = Class.forName(string3);
                                        Constructor<?> constructor = clazz.getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE);
                                        constructor.setAccessible(true);
                                        mbArrConstructor = constructor;
                                        Constructor<?> constructor2 = clazz.getDeclaredConstructor(ByteBuffer.class);
                                        constructor2.setAccessible(true);
                                        mbBBConstructor = constructor2;
                                    }
                                    catch (Exception exception2) {
                                        exception2.printStackTrace(System.err);
                                        throw new RuntimeException(exception2);
                                    }
                                }
                                throw throwable;
                            }
                        }
                        boolean bl7 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
                        String string5 = string2 = bl7 ? DEFAULT_MESSAGE_BUFFER : BIGENDIAN_MESSAGE_BUFFER;
                        if (DEFAULT_MESSAGE_BUFFER.equals(string2)) {
                            mbArrConstructor = null;
                            mbBBConstructor = null;
                            break block25;
                        }
                        try {
                            Class<?> clazz = Class.forName(string2);
                            Constructor<?> constructor = clazz.getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE);
                            constructor.setAccessible(true);
                            mbArrConstructor = constructor;
                            Constructor<?> constructor3 = clazz.getDeclaredConstructor(ByteBuffer.class);
                            constructor3.setAccessible(true);
                            mbBBConstructor = constructor3;
                            break block25;
                        }
                        catch (Exception exception3) {
                            exception3.printStackTrace(System.err);
                            throw new RuntimeException(exception3);
                        }
                    }
                }
                bl = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
                String string6 = string = bl ? DEFAULT_MESSAGE_BUFFER : BIGENDIAN_MESSAGE_BUFFER;
            }
            if (DEFAULT_MESSAGE_BUFFER.equals(string)) {
                mbArrConstructor = null;
                mbBBConstructor = null;
            } else {
                try {
                    Class<?> clazz = Class.forName(string);
                    Constructor<?> constructor = clazz.getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE);
                    constructor.setAccessible(true);
                    mbArrConstructor = constructor;
                    accessibleObject = clazz.getDeclaredConstructor(ByteBuffer.class);
                    ((Constructor)accessibleObject).setAccessible(true);
                    mbBBConstructor = accessibleObject;
                }
                catch (Exception exception) {
                    exception.printStackTrace(System.err);
                    throw new RuntimeException(exception);
                }
            }
        }
    }
}

