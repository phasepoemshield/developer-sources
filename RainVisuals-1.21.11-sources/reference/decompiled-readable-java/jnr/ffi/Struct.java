/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import jnr.ffi.Memory;
import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.Type;
import jnr.ffi.TypeAlias;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.provider.jffi.ArrayMemoryIO;
import jnr.ffi.util.EnumMapper;

public abstract class Struct {
    static final Charset UTF8;
    final Info __info;
    static final Charset ASCII;

    public final Runtime getRuntime() {
        return this.__info.runtime;
    }

    /*
     * WARNING - void declaration
     */
    protected final Pointer[] array(Pointer[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Pointer();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final Signed32[] array(Signed32[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Signed32();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends java.lang.Enum<T>> Enum32<T>[] array(Enum32<T>[] array, Class<T> enumClass) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Enum32<T>(enumClass);
        }
        this.arrayEnd();
        return var1_1;
    }

    public static <T extends Struct> int size(Class<T> structClass) {
        return Struct.size(structClass, Runtime.getSystemRuntime());
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends Member> T[] array(T[] array) {
        void var1_1;
        this.arrayBegin();
        try {
            Class<?> arrayClass = array.getClass().getComponentType();
            Class[] classArray = new Class[1];
            classArray[0] = arrayClass.getEnclosingClass();
            Constructor<?> ctor = arrayClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[1];
            objectArray[0] = this;
            Object[] parameters = objectArray;
            int i = 0;
            while (i < array.length) {
                void var5_6;
                array[i] = (Member)ctor.newInstance(parameters);
                ++var5_6;
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final Signed64[] array(Signed64[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Signed64();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final <T extends Struct> T inner(Class<T> structClass) {
        try {
            void var3_5;
            Class[] classArray = new Class[1];
            classArray[0] = Runtime.class;
            Constructor<T> structConstructor = structClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[1];
            objectArray[0] = this.getRuntime();
            Struct struct = (Struct)structConstructor.newInstance(objectArray);
            return this.inner(var3_5);
        }
        catch (NoSuchMethodException ex) {
            throw new RuntimeException("Could not create an instance of " + structClass.getName() + "\nBecause could not find the public constructor with a Runtime argument, it should look like:\npublic " + structClass.getSimpleName() + "(Runtime runtime) {super(runtime);}", ex);
        }
        catch (Exception ex) {
            void var2_4;
            throw new RuntimeException((Throwable)var2_4);
        }
    }

    private static int align(int offset, int align) {
        return offset + align - 1 & ~(align + -1);
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends java.lang.Enum<T>> Enum<T>[] array(Enum<T>[] array, Class<T> enumClass) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Enum<T>(enumClass);
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends java.lang.Enum<T>> Enum64<T>[] array(Enum64<T>[] array, Class<T> enumClass) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Enum64<T>(enumClass);
        }
        this.arrayEnd();
        return var1_1;
    }

    public static jnr.ffi.Pointer getMemory(Struct struct, int flags) {
        return struct.__info.getMemory(flags);
    }

    protected final void arrayBegin() {
        this.__info.resetIndex = false;
    }

    /*
     * WARNING - void declaration
     */
    protected final Unsigned16[] array(Unsigned16[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Unsigned16();
        }
        this.arrayEnd();
        return var1_1;
    }

    static {
        ASCII = Charset.forName("ASCII");
        UTF8 = Charset.forName("UTF-8");
    }

    /*
     * WARNING - void declaration
     */
    protected final Unsigned32[] array(Unsigned32[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Unsigned32();
        }
        this.arrayEnd();
        return var1_1;
    }

    protected Struct(Runtime runtime) {
        this.__info = new Info(runtime);
    }

    /*
     * WARNING - void declaration
     */
    protected final UnsignedLong[] array(UnsignedLong[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new UnsignedLong();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final Double[] array(Double[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Double();
        }
        this.arrayEnd();
        return var1_1;
    }

    public final void useMemory(jnr.ffi.Pointer address) {
        this.__info.useMemory(address);
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends java.lang.Enum<T>> Enum8<T>[] array(Enum8<T>[] array, Class<T> enumClass) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Enum8<T>(enumClass);
        }
        this.arrayEnd();
        return var1_1;
    }

    protected Struct(Runtime runtime, boolean isUnion) {
        this(runtime);
        this.__info.resetIndex = isUnion;
        this.__info.isUnion = isUnion;
    }

    /*
     * WARNING - void declaration
     */
    protected final SignedLong[] array(SignedLong[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new SignedLong();
        }
        this.arrayEnd();
        return var1_1;
    }

    protected Struct(Runtime runtime, Struct enclosing) {
        this(runtime);
        this.__info.alignment = enclosing.__info.alignment;
    }

    /*
     * WARNING - void declaration
     */
    protected final Unsigned8[] array(Unsigned8[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Unsigned8();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final Float[] array(Float[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Float();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Struct> int size(Class<T> structClass, Runtime runtime) {
        try {
            Class[] classArray = new Class[1];
            classArray[0] = Runtime.class;
            Constructor<T> structConstructor = structClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[1];
            objectArray[0] = runtime;
            Struct struct = (Struct)structConstructor.newInstance(objectArray);
            return Struct.size(struct);
        }
        catch (NoSuchMethodException ex) {
            throw new RuntimeException("Could not create an instance of " + structClass.getName() + "\nBecause could not find the public constructor with a Runtime argument, it should look like:\npublic " + structClass.getSimpleName() + "(Runtime runtime) {super(runtime);}", ex);
        }
        catch (Exception ex) {
            void var2_4;
            throw new RuntimeException((Throwable)var2_4);
        }
    }

    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        Field[] fields = this.getClass().getDeclaredFields();
        sb.append(this.getClass().getSimpleName()).append(" { \n");
        java.lang.String fieldPrefix = "    ";
        Field[] fieldArray = fields;
        int n = fieldArray.length;
        for (int i = 0; i < n; ++i) {
            Field field = fieldArray[i];
            try {
                sb.append("    ");
                sb.append(field.getName()).append(" = ");
                try {
                    sb.append(field.get(this).toString());
                }
                catch (NullPointerException ex) {
                    sb.append("- null -");
                }
                catch (IllegalAccessException ex) {
                    sb.append("- IllegalAccessException -");
                }
                sb.append("\n");
                continue;
            }
            catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    protected final <T> Function<T> function(Class<T> closureClass) {
        return new Function<T>(closureClass);
    }

    /*
     * WARNING - void declaration
     */
    protected UTF8String[] array(UTF8String[] array, int stringLength) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new UTF8String(stringLength);
        }
        this.arrayEnd();
        return var1_1;
    }

    protected final void arrayEnd() {
        this.__info.resetIndex = this.__info.isUnion;
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends java.lang.Enum<T>> Enum16<T>[] array(Enum16<T>[] array, Class<T> enumClass) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Enum16<T>(enumClass);
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Struct> T[] arrayOf(Runtime runtime, Class<T> type, int length) {
        try {
            void var3_3;
            Struct[] array = (Struct[])Array.newInstance(type, length);
            Class[] classArray = new Class[1];
            classArray[0] = Runtime.class;
            Constructor<T> c = type.getConstructor(classArray);
            for (int i = 0; i < length; ++i) {
                Object[] objectArray = new Object[1];
                objectArray[0] = runtime;
                array[i] = (Struct)c.newInstance(objectArray);
            }
            if (array.length > 0) {
                int structSize = Struct.align(Struct.size(array[0]), Struct.alignment(array[0]));
                jnr.ffi.Pointer memory = runtime.getMemoryManager().allocateDirect(structSize * length);
                int i = 0;
                while (i < array.length) {
                    void var7_9;
                    void var5_7;
                    array[i].useMemory(memory.slice(structSize * i, (long)var5_7));
                    ++var7_9;
                }
            }
            return var3_3;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static jnr.ffi.Pointer getMemory(Struct struct) {
        return struct.__info.getMemory(0);
    }

    /*
     * WARNING - void declaration
     */
    protected final <T extends Struct> T inner(T struct) {
        void var1_1;
        int alignment;
        int n = alignment = this.__info.alignment.intValue() > 0 ? Math.min(this.__info.alignment.intValue(), struct.__info.getMinimumAlignment()) : struct.__info.getMinimumAlignment();
        int offset = this.__info.resetIndex ? 0 : Struct.align(this.__info.size, alignment);
        struct.__info.enclosing = this;
        struct.__info.offset = offset;
        this.__info.size = Math.max(this.__info.size, offset + struct.__info.size);
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final Signed8[] array(Signed8[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Signed8();
        }
        this.arrayEnd();
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    protected final Unsigned64[] array(Unsigned64[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Unsigned64();
        }
        this.arrayEnd();
        return var1_1;
    }

    public static int size(Struct struct) {
        return struct.__info.size();
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends Struct> T[] array(T[] array) {
        void var1_1;
        this.arrayBegin();
        try {
            Class<?> type = array.getClass().getComponentType();
            Class[] classArray = new Class[1];
            classArray[0] = Runtime.class;
            Constructor<?> c = type.getConstructor(classArray);
            int i = 0;
            while (i < array.length) {
                void var4_5;
                Object[] objectArray = new Object[1];
                objectArray[0] = this.getRuntime();
                array[i] = this.inner((Struct)c.newInstance(objectArray));
                ++var4_5;
            }
        }
        catch (Exception ex) {
            void var2_3;
            throw new RuntimeException((Throwable)var2_3);
        }
        this.arrayEnd();
        return var1_1;
    }

    public static boolean isDirect(Struct struct) {
        return struct.__info.isDirect();
    }

    /*
     * WARNING - void declaration
     */
    protected final Address[] array(Address[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Address();
        }
        this.arrayEnd();
        return var1_1;
    }

    public static int alignment(Struct struct) {
        return struct.__info.getMinimumAlignment();
    }

    /*
     * WARNING - void declaration
     */
    protected final Signed16[] array(Signed16[] array) {
        void var1_1;
        this.arrayBegin();
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Signed16();
        }
        this.arrayEnd();
        return var1_1;
    }

    protected Struct(Runtime runtime, Alignment alignment) {
        this(runtime);
        this.__info.alignment = alignment;
    }

    public final class tcflag_t
    extends IntegerAlias {
        public tcflag_t(Offset offset) {
            super(TypeAlias.tcflag_t, offset);
        }

        public tcflag_t() {
            super(TypeAlias.tcflag_t);
        }
    }

    public final class BOOL16
    extends AbstractBoolean {
        @Override
        public final boolean get() {
            return this.getMemory().getShort(this.offset()) != 0;
        }

        public BOOL16() {
            super(NativeType.SSHORT);
        }

        @Override
        public final void set(boolean value) {
            this.getMemory().putShort(this.offset(), (short)(value ? 1 : 0));
        }
    }

    public final class int64_t
    extends IntegerAlias {
        public int64_t(Offset offset) {
            super(TypeAlias.int64_t, offset);
        }

        public int64_t() {
            super(TypeAlias.int64_t);
        }
    }

    public final class ino_t
    extends IntegerAlias {
        public ino_t(Offset offset) {
            super(TypeAlias.ino_t, offset);
        }

        public ino_t() {
            super(TypeAlias.ino_t);
        }
    }

    public final class rlim_t
    extends IntegerAlias {
        public rlim_t() {
            super(TypeAlias.rlim_t);
        }

        public rlim_t(Offset offset) {
            super(TypeAlias.rlim_t, offset);
        }
    }

    public class UTF8String
    extends UTFString {
        public UTF8String(int size) {
            super(size, UTF8);
        }
    }

    public final class in_port_t
    extends IntegerAlias {
        public in_port_t(Offset offset) {
            super(TypeAlias.in_port_t, offset);
        }

        public in_port_t() {
            super(TypeAlias.in_port_t);
        }
    }

    public final class mode_t
    extends IntegerAlias {
        public mode_t(Offset offset) {
            super(TypeAlias.mode_t, offset);
        }

        public mode_t() {
            super(TypeAlias.mode_t);
        }
    }

    public final class speed_t
    extends IntegerAlias {
        public speed_t(Offset offset) {
            super(TypeAlias.speed_t, offset);
        }

        public speed_t() {
            super(TypeAlias.speed_t);
        }
    }

    public final class socklen_t
    extends IntegerAlias {
        public socklen_t() {
            super(TypeAlias.socklen_t);
        }

        public socklen_t(Offset offset) {
            super(TypeAlias.socklen_t, offset);
        }
    }

    public final class size_t
    extends IntegerAlias {
        public size_t(Offset offset) {
            super(TypeAlias.size_t, offset);
        }

        public size_t() {
            super(TypeAlias.size_t);
        }
    }

    public final class gid_t
    extends IntegerAlias {
        public gid_t() {
            super(TypeAlias.gid_t);
        }

        public gid_t(Offset offset) {
            super(TypeAlias.gid_t, offset);
        }
    }

    public class Unsigned8
    extends NumberField {
        public Unsigned8() {
            super(NativeType.UCHAR);
        }

        public final short get() {
            short value = this.getMemory().getByte(this.offset());
            return value < 0 ? (short)((value & 0x7F) + 128) : value;
        }

        @Override
        public final short shortValue() {
            return this.get();
        }

        public final void set(short value) {
            this.getMemory().putByte(this.offset(), (byte)value);
        }

        public Unsigned8(Offset offset) {
            super(NativeType.UCHAR, offset);
        }

        @Override
        public final int intValue() {
            return this.get();
        }

        @Override
        public void set(Number value) {
            this.getMemory().putByte(this.offset(), value.byteValue());
        }
    }

    public class Address
    extends NumberField {
        public Address() {
            super(NativeType.ADDRESS);
        }

        @Override
        public final java.lang.String toString() {
            return this.get().toString();
        }

        public final void set(jnr.ffi.Address value) {
            this.getMemory().putAddress(this.offset(), value != null ? value.nativeAddress() : 0L);
        }

        public Address(Offset offset) {
            super(NativeType.ADDRESS, offset);
        }

        @Override
        public final int intValue() {
            return this.get().intValue();
        }

        @Override
        public final long longValue() {
            return this.get().longValue();
        }

        public final jnr.ffi.Address get() {
            return jnr.ffi.Address.valueOf(this.getMemory().getAddress(this.offset()));
        }

        @Override
        public void set(Number value) {
            this.getMemory().putAddress(this.offset(), value.longValue());
        }
    }

    public class Signed64
    extends NumberField {
        @Override
        public final long longValue() {
            return this.get();
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }

        public Signed64() {
            super(NativeType.SLONGLONG);
        }

        @Override
        public final java.lang.String toString() {
            return Long.toString(this.get());
        }

        public final long get() {
            return this.getMemory().getLongLong(this.offset());
        }

        public final void set(long value) {
            this.getMemory().putLongLong(this.offset(), value);
        }

        public Signed64(Offset offset) {
            super(NativeType.SLONGLONG, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putLongLong(this.offset(), value.longValue());
        }
    }

    public final class LONG
    extends Signed32 {
        public LONG() {
        }

        public LONG(Offset offset) {
            super(offset);
        }
    }

    public final class sa_family_t
    extends IntegerAlias {
        public sa_family_t() {
            super(TypeAlias.sa_family_t);
        }

        public sa_family_t(Offset offset) {
            super(TypeAlias.sa_family_t, offset);
        }
    }

    public abstract class String
    extends AbstractMember {
        protected final int length;
        protected final Charset charset;

        public abstract void set(java.lang.String var1);

        public final java.lang.String toString() {
            return this.get();
        }

        protected String(int size, int align, Offset offset, int length, Charset cs) {
            super(size, align, offset);
            this.length = length;
            this.charset = cs;
        }

        public abstract java.lang.String get();

        protected String(int size, int align, int length, Charset cs) {
            super(size, align);
            this.length = length;
            this.charset = cs;
        }

        public final int length() {
            return this.length;
        }

        protected abstract jnr.ffi.Pointer getStringMemory();
    }

    public abstract class NumberField
    extends Member {
        protected final Type type;
        private final int offset;

        protected NumberField(TypeAlias type) {
            Type t = this.type = Struct.this.getRuntime().findType(type);
            this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8);
        }

        public abstract void set(Number var1);

        public double doubleValue() {
            return this.longValue();
        }

        public float floatValue() {
            return this.intValue();
        }

        protected NumberField(NativeType type, Offset offset) {
            Type t = this.type = Struct.this.getRuntime().findType(type);
            this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8, offset);
        }

        public long longValue() {
            return this.intValue();
        }

        protected NumberField(TypeAlias type, Offset offset) {
            Type t = this.type = Struct.this.getRuntime().findType(type);
            this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8, offset);
        }

        @Override
        public final long offset() {
            return this.offset + Struct.this.__info.getOffset();
        }

        @Override
        public final jnr.ffi.Pointer getMemory() {
            return Struct.this.__info.getMemory();
        }

        public byte byteValue() {
            return (byte)this.intValue();
        }

        public short shortValue() {
            return (short)this.intValue();
        }

        public abstract int intValue();

        protected NumberField(NativeType type) {
            Type t = this.type = Struct.this.getRuntime().findType(type);
            this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8);
        }

        @Override
        public final Struct struct() {
            return Struct.this;
        }

        public java.lang.String toString() {
            return Integer.toString(this.intValue(), 10);
        }
    }

    public final class uintptr_t
    extends IntegerAlias {
        public uintptr_t() {
            super(TypeAlias.uintptr_t);
        }

        public uintptr_t(Offset offset) {
            super(TypeAlias.uintptr_t, offset);
        }
    }

    public class Pointer
    extends PointerField {
        @Override
        public final int intValue() {
            return super.intValue();
        }

        @Override
        public final long longValue() {
            return super.longValue();
        }

        @Override
        public final java.lang.String toString() {
            return super.toString();
        }

        public Pointer() {
        }

        public final jnr.ffi.Pointer get() {
            return this.getPointer();
        }

        public Pointer(Offset offset) {
            super(offset);
        }
    }

    public final class blkcnt_t
    extends IntegerAlias {
        public blkcnt_t(Offset offset) {
            super(TypeAlias.blkcnt_t, offset);
        }

        public blkcnt_t() {
            super(TypeAlias.blkcnt_t);
        }
    }

    protected abstract class EnumField<E>
    extends NumberField {
        protected final Class<E> enumClass;

        public EnumField(NativeType type, Class<E> enumClass) {
            super(type);
            this.enumClass = enumClass;
        }

        public abstract E get();

        @Override
        public final java.lang.String toString() {
            return this.get().toString();
        }
    }

    public final class u_int8_t
    extends IntegerAlias {
        public u_int8_t() {
            super(TypeAlias.u_int8_t);
        }

        public u_int8_t(Offset offset) {
            super(TypeAlias.u_int8_t, offset);
        }
    }

    public final class int16_t
    extends IntegerAlias {
        public int16_t(Offset offset) {
            super(TypeAlias.int16_t, offset);
        }

        public int16_t() {
            super(TypeAlias.int16_t);
        }
    }

    public class SignedLong
    extends NumberField {
        public SignedLong() {
            super(NativeType.SLONG);
        }

        @Override
        public final long longValue() {
            return this.get();
        }

        public final long get() {
            return this.getMemory().getNativeLong(this.offset());
        }

        @Override
        public void set(Number value) {
            this.getMemory().putNativeLong(this.offset(), value.longValue());
        }

        @Override
        public final java.lang.String toString() {
            return Long.toString(this.get());
        }

        public final void set(long value) {
            this.getMemory().putNativeLong(this.offset(), value);
        }

        public SignedLong(Offset offset) {
            super(NativeType.SLONG, offset);
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }
    }

    public final class in_addr_t
    extends IntegerAlias {
        public in_addr_t() {
            super(TypeAlias.in_addr_t);
        }

        public in_addr_t(Offset offset) {
            super(TypeAlias.in_addr_t, offset);
        }
    }

    public class Unsigned32
    extends NumberField {
        @Override
        public final long longValue() {
            return this.get();
        }

        public Unsigned32() {
            super(NativeType.UINT);
        }

        public final void set(long value) {
            this.getMemory().putInt(this.offset(), (int)value);
        }

        @Override
        public final java.lang.String toString() {
            return Long.toString(this.get());
        }

        /*
         * WARNING - void declaration
         */
        public final long get() {
            void var1_1;
            long value = this.getMemory().getInt(this.offset());
            return value < 0L ? (value & Integer.MAX_VALUE) + 0x80000000L : var1_1;
        }

        public Unsigned32(Offset offset) {
            super(NativeType.UINT, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putInt(this.offset(), value.intValue());
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }
    }

    public class Signed16
    extends NumberField {
        @Override
        public final short shortValue() {
            return this.get();
        }

        @Override
        public void set(Number value) {
            this.getMemory().putShort(this.offset(), value.shortValue());
        }

        public final short get() {
            return this.getMemory().getShort(this.offset());
        }

        public Signed16() {
            super(NativeType.SSHORT);
        }

        public final void set(short value) {
            this.getMemory().putShort(this.offset(), value);
        }

        @Override
        public final int intValue() {
            return this.get();
        }

        public Signed16(Offset offset) {
            super(NativeType.SSHORT, offset);
        }
    }

    public class Unsigned16
    extends NumberField {
        public Unsigned16() {
            super(NativeType.USHORT);
        }

        public final void set(int value) {
            this.getMemory().putShort(this.offset(), (short)value);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putShort(this.offset(), value.shortValue());
        }

        public Unsigned16(Offset offset) {
            super(NativeType.USHORT, offset);
        }

        @Override
        public final int intValue() {
            return this.get();
        }

        public final int get() {
            int value = this.getMemory().getShort(this.offset());
            return value < 0 ? (value & Short.MAX_VALUE) + 32768 : value;
        }
    }

    public abstract class PointerField
    extends NumberField {
        private jnr.ffi.Pointer finalPointer;

        @Override
        public void set(Number value) {
            this.getMemory().putAddress(this.offset(), value.longValue());
        }

        @Override
        public int intValue() {
            return (int)this.getMemory().getAddress(this.offset());
        }

        @Override
        public java.lang.String toString() {
            return this.getPointer().toString();
        }

        public final int size() {
            return Struct.this.getRuntime().findType(NativeType.ADDRESS).size() * 8;
        }

        @Override
        public long longValue() {
            return this.getMemory().getAddress(this.offset());
        }

        protected final jnr.ffi.Pointer getPointer() {
            return this.getMemory().getPointer(this.offset());
        }

        /*
         * WARNING - void declaration
         */
        public final void set(jnr.ffi.Pointer value) {
            this.finalPointer = value;
            if (value instanceof ArrayMemoryIO) {
                void var3_3;
                ArrayMemoryIO arrayMemory = (ArrayMemoryIO)value;
                byte[] valueArray = arrayMemory.array();
                this.finalPointer = Memory.allocateDirect(Struct.this.getRuntime(), valueArray.length);
                this.finalPointer.put(0L, valueArray, 0, ((void)var3_3).length);
            }
            this.getMemory().putPointer(this.offset(), this.finalPointer);
        }

        public PointerField(Offset offset) {
            super(NativeType.ADDRESS, offset);
        }

        public PointerField() {
            super(NativeType.ADDRESS);
        }
    }

    public final class caddr_t
    extends IntegerAlias {
        public caddr_t() {
            super(TypeAlias.caddr_t);
        }

        public caddr_t(Offset offset) {
            super(TypeAlias.caddr_t, offset);
        }
    }

    public class Unsigned64
    extends NumberField {
        public final void set(long value) {
            this.getMemory().putLongLong(this.offset(), value);
        }

        @Override
        public final java.lang.String toString() {
            return Long.toString(this.get());
        }

        @Override
        public final long longValue() {
            return this.get();
        }

        public Unsigned64(Offset offset) {
            super(NativeType.ULONGLONG, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putLongLong(this.offset(), value.longValue());
        }

        public final long get() {
            return this.getMemory().getLongLong(this.offset());
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }

        public Unsigned64() {
            super(NativeType.ULONGLONG);
        }
    }

    public final class intptr_t
    extends IntegerAlias {
        public intptr_t() {
            super(TypeAlias.intptr_t);
        }

        public intptr_t(Offset offset) {
            super(TypeAlias.intptr_t, offset);
        }
    }

    public final class ssize_t
    extends IntegerAlias {
        public ssize_t(Offset offset) {
            super(TypeAlias.ssize_t, offset);
        }

        public ssize_t() {
            super(TypeAlias.ssize_t);
        }
    }

    public final class WBOOL
    extends AbstractBoolean {
        public WBOOL() {
            super(NativeType.SINT);
        }

        @Override
        public final void set(boolean value) {
            this.getMemory().putInt(this.offset(), value ? 1 : 0);
        }

        @Override
        public final boolean get() {
            return this.getMemory().getInt(this.offset()) != 0;
        }
    }

    public final class key_t
    extends IntegerAlias {
        public key_t() {
            super(TypeAlias.key_t);
        }

        public key_t(Offset offset) {
            super(TypeAlias.key_t, offset);
        }
    }

    public class UTFString
    extends String {
        @Override
        protected jnr.ffi.Pointer getStringMemory() {
            return this.getMemory().slice(this.offset(), this.length());
        }

        @Override
        public final java.lang.String get() {
            return this.getStringMemory().getString(0L, this.length, this.charset);
        }

        public UTFString(int length, Charset cs) {
            super(length * 8, 8, length, cs);
        }

        @Override
        public final void set(java.lang.String value) {
            this.getStringMemory().putString(0L, value, this.length, this.charset);
        }
    }

    public abstract class IntegerAlias
    extends NumberField {
        public void set(long value) {
            this.getMemory().putInt(this.type, this.offset(), value);
        }

        @Override
        public int intValue() {
            return (int)this.get();
        }

        public final long get() {
            return this.getMemory().getInt(this.type, this.offset());
        }

        IntegerAlias(TypeAlias type, Offset offset) {
            super(type, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putInt(this.type, this.offset(), value.longValue());
        }

        @Override
        public long longValue() {
            return this.get();
        }

        @Override
        public final java.lang.String toString() {
            return Long.toString(this.get());
        }

        IntegerAlias(TypeAlias type) {
            super(type);
        }
    }

    public final class time_t
    extends IntegerAlias {
        public time_t() {
            super(TypeAlias.time_t);
        }

        public time_t(Offset offset) {
            super(TypeAlias.time_t, offset);
        }
    }

    public final class Function<T>
    extends AbstractMember {
        private T instance;
        private final Class<? extends T> closureClass;

        public Function(Class<? extends T> closureClass) {
            super(NativeType.ADDRESS);
            this.closureClass = closureClass;
        }

        public final void set(T value) {
            this.instance = value;
            this.getMemory().putPointer(this.offset(), Struct.this.getRuntime().getClosureManager().getClosurePointer(this.closureClass, this.instance));
        }
    }

    public final class pid_t
    extends IntegerAlias {
        public pid_t(Offset offset) {
            super(TypeAlias.pid_t, offset);
        }

        public pid_t() {
            super(TypeAlias.pid_t);
        }
    }

    protected abstract class AbstractBoolean
    extends AbstractMember {
        protected AbstractBoolean(NativeType type, Offset offset) {
            super(type, offset);
        }

        public abstract void set(boolean var1);

        public abstract boolean get();

        protected AbstractBoolean(NativeType type) {
            super(type);
        }

        public java.lang.String toString() {
            return java.lang.Boolean.toString(this.get());
        }
    }

    public final class blksize_t
    extends IntegerAlias {
        public blksize_t() {
            super(TypeAlias.blksize_t);
        }

        public blksize_t(Offset offset) {
            super(TypeAlias.blksize_t, offset);
        }
    }

    public final class id_t
    extends IntegerAlias {
        public id_t(Offset offset) {
            super(TypeAlias.id_t, offset);
        }

        public id_t() {
            super(TypeAlias.id_t);
        }
    }

    public final class uid_t
    extends IntegerAlias {
        public uid_t(Offset offset) {
            super(TypeAlias.uid_t, offset);
        }

        public uid_t() {
            super(TypeAlias.uid_t);
        }
    }

    public class AsciiString
    extends UTFString {
        public AsciiString(int size) {
            super(size, ASCII);
        }
    }

    public class UTF8StringRef
    extends UTFStringRef {
        public UTF8StringRef(int size) {
            super(size, UTF8);
        }

        public UTF8StringRef() {
            super(Integer.MAX_VALUE, UTF8);
        }
    }

    public class Enum32<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public Enum32(Class<E> enumClass) {
            super(NativeType.SINT, enumClass);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putInt(this.offset(), value.intValue());
        }

        @Override
        public final int intValue() {
            return this.getMemory().getInt(this.offset());
        }

        public final void set(E value) {
            this.getMemory().putInt(this.offset(), EnumMapper.getInstance(this.enumClass).intValue((java.lang.Enum)value));
        }

        @Override
        public final E get() {
            return (E)((java.lang.Enum)this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue())));
        }
    }

    public final class nlink_t
    extends IntegerAlias {
        public nlink_t() {
            super(TypeAlias.nlink_t);
        }

        public nlink_t(Offset offset) {
            super(TypeAlias.nlink_t, offset);
        }
    }

    public final class off_t
    extends IntegerAlias {
        public off_t(Offset offset) {
            super(TypeAlias.off_t, offset);
        }

        public off_t() {
            super(TypeAlias.off_t);
        }
    }

    public final class swblk_t
    extends IntegerAlias {
        public swblk_t(Offset offset) {
            super(TypeAlias.swblk_t, offset);
        }

        public swblk_t() {
            super(TypeAlias.swblk_t);
        }
    }

    public final class fsfilcnt_t
    extends IntegerAlias {
        public fsfilcnt_t(Offset offset) {
            super(TypeAlias.fsfilcnt_t, offset);
        }

        public fsfilcnt_t() {
            super(TypeAlias.fsfilcnt_t);
        }
    }

    public class UTFStringRef
    extends String {
        private jnr.ffi.Pointer valueHolder;

        @Override
        protected jnr.ffi.Pointer getStringMemory() {
            return this.getMemory().getPointer(this.offset(), this.length());
        }

        public UTFStringRef(int length, Charset cs) {
            super(Struct.this.getRuntime().findType(NativeType.ADDRESS).size() * 8, Struct.this.getRuntime().findType(NativeType.ADDRESS).alignment() * 8, length, cs);
        }

        @Override
        public final java.lang.String get() {
            jnr.ffi.Pointer ptr = this.getStringMemory();
            return ptr != null ? ptr.getString(0L, this.length, this.charset) : null;
        }

        public UTFStringRef(Charset cs) {
            this(Integer.MAX_VALUE, cs);
        }

        @Override
        public final void set(java.lang.String value) {
            if (value != null) {
                int maxBytes = value.length() * 4 + 1;
                this.valueHolder = Struct.this.getRuntime().getMemoryManager().allocateDirect(maxBytes);
                this.valueHolder.putString(0L, value, maxBytes, this.charset);
                this.getMemory().putPointer(this.offset(), this.valueHolder);
            } else {
                this.valueHolder = null;
                this.getMemory().putAddress(this.offset(), 0L);
            }
        }
    }

    public final class Double
    extends NumberField {
        @Override
        public final long longValue() {
            return (long)this.get();
        }

        public Double(Offset offset) {
            super(NativeType.DOUBLE, offset);
        }

        public Double() {
            super(NativeType.DOUBLE);
        }

        public final double get() {
            return this.getMemory().getDouble(this.offset());
        }

        @Override
        public final double doubleValue() {
            return this.get();
        }

        @Override
        public void set(Number value) {
            this.getMemory().putDouble(this.offset(), value.doubleValue());
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }

        @Override
        public final float floatValue() {
            return (float)this.get();
        }

        @Override
        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.get());
        }

        public final void set(double value) {
            this.getMemory().putDouble(this.offset(), value);
        }
    }

    public final class BYTE
    extends Unsigned8 {
        public BYTE() {
        }

        public BYTE(Offset offset) {
            super(offset);
        }
    }

    public final class DWORD
    extends Unsigned32 {
        public DWORD() {
        }

        public DWORD(Offset offset) {
            super(offset);
        }
    }

    public class Enum<T extends java.lang.Enum<T>>
    extends Enum32<T> {
        public Enum(Class<T> enumClass) {
            super(enumClass);
        }
    }

    public class UnsignedLong
    extends NumberField {
        @Override
        public final java.lang.String toString() {
            return Long.toString(this.get());
        }

        public UnsignedLong(Offset offset) {
            super(NativeType.ULONG, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putNativeLong(this.offset(), value.longValue());
        }

        public UnsignedLong() {
            super(NativeType.ULONG);
        }

        @Override
        public final long longValue() {
            return this.get();
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }

        /*
         * WARNING - void declaration
         */
        public final long get() {
            void var1_1;
            long value = this.getMemory().getNativeLong(this.offset());
            long mask = Struct.this.getRuntime().findType(NativeType.SLONG).size() == 32 ? 0xFFFFFFFFL : -1L;
            return value < 0L ? (value & mask) + mask + 1L : var1_1;
        }

        public final void set(long value) {
            this.getMemory().putNativeLong(this.offset(), value);
        }
    }

    public class Enum8<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public Enum8(Class<E> enumClass) {
            super(NativeType.SCHAR, enumClass);
        }

        @Override
        public final E get() {
            return (E)((java.lang.Enum)this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue())));
        }

        @Override
        public void set(Number value) {
            this.getMemory().putByte(this.offset(), value.byteValue());
        }

        public final void set(E value) {
            this.getMemory().putByte(this.offset(), (byte)EnumMapper.getInstance(this.enumClass).intValue((java.lang.Enum)value));
        }

        @Override
        public final int intValue() {
            return this.getMemory().getByte(this.offset());
        }
    }

    public final class u_int32_t
    extends IntegerAlias {
        public u_int32_t() {
            super(TypeAlias.u_int32_t);
        }

        public u_int32_t(Offset offset) {
            super(TypeAlias.u_int32_t, offset);
        }
    }

    public class StructRef<T extends Struct>
    extends PointerField {
        private final Class<T> structType;
        private final int size;
        private final Constructor<T> structConstructor;

        /*
         * WARNING - void declaration
         */
        public StructRef(Offset offset, Class<T> structType) {
            super(offset);
            this.structType = structType;
            try {
                Class[] classArray = new Class[1];
                classArray[0] = Runtime.class;
                this.structConstructor = structType.getDeclaredConstructor(classArray);
                Object[] objectArray = new Object[1];
                objectArray[0] = Struct.this.getRuntime();
                this.size = Struct.size((Struct)this.structConstructor.newInstance(objectArray));
            }
            catch (Exception ex) {
                void var4_4;
                throw new RuntimeException((Throwable)var4_4);
            }
        }

        public StructRef(Class<T> structType, int initialStructCount) {
            this(structType);
            this.set(Memory.allocateDirect(this$0.getRuntime(), this.size * initialStructCount));
        }

        /*
         * WARNING - void declaration
         */
        public final void set(T[] structs) {
            void var2_2;
            if (structs.length == 0) {
                this.set((T)Memory.allocateDirect(Struct.this.getRuntime(), 0));
                return;
            }
            jnr.ffi.Pointer value = Memory.allocateDirect(Struct.this.getRuntime(), this.size * structs.length);
            byte[] data = new byte[this.size];
            int i = 0;
            while (i < structs.length) {
                void var4_4;
                Struct.getMemory(structs[i]).get(0L, data, 0, this.size);
                value.put((long)(this.size * i), data, 0, this.size);
                ++var4_4;
            }
            this.set(var2_2);
        }

        /*
         * WARNING - void declaration
         */
        public final T get() {
            void var1_1;
            Struct struct;
            try {
                Object[] objectArray = new Object[1];
                objectArray[0] = Struct.this.getRuntime();
                struct = (Struct)this.structConstructor.newInstance(objectArray);
            }
            catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            struct.useMemory(this.getPointer());
            return var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public final T[] get(int length) {
            try {
                void var2_2;
                Struct[] array = (Struct[])Array.newInstance(this.structType, length);
                int i = 0;
                while (i < length) {
                    void var3_4;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = Struct.this.getRuntime();
                    array[i] = (Struct)this.structConstructor.newInstance(objectArray);
                    array[i].useMemory(this.getPointer().slice(Struct.size(array[i]) * i));
                    ++var3_4;
                }
                return var2_2;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        /*
         * WARNING - void declaration
         */
        public StructRef(Class<T> structType) {
            this.structType = structType;
            try {
                Class[] classArray = new Class[1];
                classArray[0] = Runtime.class;
                this.structConstructor = structType.getDeclaredConstructor(classArray);
                Object[] objectArray = new Object[1];
                objectArray[0] = Struct.this.getRuntime();
                this.size = Struct.size((Struct)this.structConstructor.newInstance(objectArray));
            }
            catch (Exception ex) {
                void var3_3;
                throw new RuntimeException((Throwable)var3_3);
            }
        }

        @Override
        public java.lang.String toString() {
            return "struct @ " + super.toString() + '\n' + this.get();
        }

        public final void set(T struct) {
            jnr.ffi.Pointer structMemory = Struct.getMemory(struct);
            this.set((T)structMemory);
        }

        public StructRef(Offset offset, Class<T> structType, int initialStructCount) {
            this(offset, structType);
            this.set(Memory.allocateDirect(this$0.getRuntime(), this.size * initialStructCount));
        }
    }

    public final class WORD
    extends Unsigned16 {
        public WORD(Offset offset) {
            super(offset);
        }

        public WORD() {
        }
    }

    public final class u_int16_t
    extends IntegerAlias {
        public u_int16_t() {
            super(TypeAlias.u_int16_t);
        }

        public u_int16_t(Offset offset) {
            super(TypeAlias.u_int16_t, offset);
        }
    }

    public static final class Offset
    extends Number {
        private final int offset;

        @Override
        public int intValue() {
            return this.offset;
        }

        @Override
        public long longValue() {
            return this.offset;
        }

        public Offset(int offset) {
            this.offset = offset;
        }

        @Override
        public double doubleValue() {
            return this.offset;
        }

        @Override
        public float floatValue() {
            return this.offset;
        }
    }

    public class Enum16<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        @Override
        public final E get() {
            return (E)((java.lang.Enum)this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue())));
        }

        @Override
        public void set(Number value) {
            this.getMemory().putShort(this.offset(), value.shortValue());
        }

        public final void set(E value) {
            this.getMemory().putShort(this.offset(), (short)EnumMapper.getInstance(this.enumClass).intValue((java.lang.Enum)value));
        }

        @Override
        public final int intValue() {
            return this.getMemory().getShort(this.offset());
        }

        public Enum16(Class<E> enumClass) {
            super(NativeType.SSHORT, enumClass);
        }
    }

    public static final class Alignment
    extends Number {
        private final int alignment;

        @Override
        public int intValue() {
            return this.alignment;
        }

        @Override
        public long longValue() {
            return this.alignment;
        }

        @Override
        public double doubleValue() {
            return this.alignment;
        }

        @Override
        public float floatValue() {
            return this.alignment;
        }

        public Alignment(int alignment) {
            this.alignment = alignment;
        }
    }

    static final class Info {
        private final Runtime runtime;
        private jnr.ffi.Pointer memory = null;
        int minAlign = 1;
        int offset = 0;
        boolean resetIndex = false;
        Alignment alignment = new Alignment(0);
        int size = 0;
        boolean isUnion = false;
        Struct enclosing = null;

        final int getMinimumAlignment() {
            return this.minAlign;
        }

        /*
         * WARNING - void declaration
         */
        protected final int addField(int sizeBits, int alignBits, Offset offset) {
            void var3_3;
            this.size = Math.max(this.size, offset.intValue() + (sizeBits >> 3));
            this.minAlign = Math.max(this.minAlign, alignBits >> 3);
            return var3_3.intValue();
        }

        public final jnr.ffi.Pointer getMemory(int flags) {
            return this.enclosing != null ? this.enclosing.__info.getMemory(flags) : (this.memory != null ? this.memory : (this.memory = this.allocateMemory(flags)));
        }

        /*
         * WARNING - void declaration
         */
        public Info(Runtime runtime) {
            void var1_1;
            this.runtime = var1_1;
        }

        final int size() {
            return this.alignment.intValue() > 0 ? this.size + (-this.size & this.minAlign - 1) : this.size;
        }

        /*
         * WARNING - void declaration
         */
        protected final int addField(int sizeBits, int alignBits) {
            void var4_4;
            int alignment;
            int n = this.alignment.intValue() > 0 ? Math.min(this.alignment.intValue(), alignBits >> 3) : (alignment = alignBits >> 3);
            int offset = this.resetIndex ? 0 : Struct.align(this.size, alignment);
            this.size = Math.max(this.size, offset + (sizeBits >> 3));
            this.minAlign = Math.max(this.minAlign, alignment);
            return (int)var4_4;
        }

        private jnr.ffi.Pointer allocateMemory(int flags) {
            if (ParameterFlags.isDirect(flags)) {
                return this.runtime.getMemoryManager().allocateDirect(this.size(), true);
            }
            return this.runtime.getMemoryManager().allocate(this.size());
        }

        public final int getOffset() {
            return this.enclosing == null ? 0 : this.offset + this.enclosing.__info.getOffset();
        }

        final boolean isDirect() {
            return this.enclosing != null && this.enclosing.__info.isDirect() || this.memory != null && this.memory.isDirect();
        }

        public final void useMemory(jnr.ffi.Pointer io) {
            this.memory = io;
        }

        public final jnr.ffi.Pointer getMemory() {
            return this.getMemory(16);
        }
    }

    public class EnumLong<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public final void set(E value) {
            this.getMemory().putNativeLong(this.offset(), EnumMapper.getInstance(this.enumClass).intValue((java.lang.Enum)value));
        }

        @Override
        public final E get() {
            return (E)((java.lang.Enum)this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue())));
        }

        @Override
        public final long longValue() {
            return this.getMemory().getNativeLong(this.offset());
        }

        public EnumLong(Class<E> enumClass) {
            super(NativeType.SLONG, enumClass);
        }

        @Override
        public final int intValue() {
            return (int)this.longValue();
        }

        @Override
        public void set(Number value) {
            this.getMemory().putNativeLong(this.offset(), value.longValue());
        }
    }

    public final class fsblkcnt_t
    extends IntegerAlias {
        public fsblkcnt_t(Offset offset) {
            super(TypeAlias.fsblkcnt_t, offset);
        }

        public fsblkcnt_t() {
            super(TypeAlias.fsblkcnt_t);
        }
    }

    protected final class Padding
    extends AbstractMember {
        public Padding(Type type, int length) {
            super(type.size() * 8 * length, type.alignment() * 8);
        }

        public Padding(NativeType type, int length) {
            super(Struct.this.getRuntime().findType(type).size() * 8 * length, Struct.this.getRuntime().findType(type).alignment() * 8);
        }
    }

    protected abstract class AbstractMember
    extends Member {
        private final int offset;

        protected AbstractMember(int size, int align, Offset offset) {
            this.offset = Struct.this.__info.addField(size, align, offset);
        }

        protected AbstractMember(NativeType type) {
            Type t = Struct.this.getRuntime().findType(type);
            this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8);
        }

        protected AbstractMember(int size) {
            this(size, size);
        }

        @Override
        public final long offset() {
            return this.offset + Struct.this.__info.getOffset();
        }

        protected AbstractMember(int size, int align) {
            this.offset = Struct.this.__info.addField(size, align);
        }

        @Override
        public final Struct struct() {
            return Struct.this;
        }

        @Override
        public final jnr.ffi.Pointer getMemory() {
            return Struct.this.__info.getMemory();
        }

        protected AbstractMember(NativeType type, Offset offset) {
            Type t = Struct.this.getRuntime().findType(type);
            this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8, offset);
        }
    }

    public final class int8_t
    extends IntegerAlias {
        public int8_t() {
            super(TypeAlias.int8_t);
        }

        public int8_t(Offset offset) {
            super(TypeAlias.int8_t, offset);
        }
    }

    public final class Boolean
    extends AbstractBoolean {
        @Override
        public final void set(boolean value) {
            this.getMemory().putByte(this.offset(), (byte)(value ? 1 : 0));
        }

        public Boolean() {
            super(NativeType.SCHAR);
        }

        @Override
        public final boolean get() {
            return this.getMemory().getByte(this.offset()) != 0;
        }
    }

    public class Signed32
    extends NumberField {
        @Override
        public final int intValue() {
            return this.get();
        }

        public Signed32() {
            super(NativeType.SINT);
        }

        public Signed32(Offset offset) {
            super(NativeType.SINT, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putInt(this.offset(), value.intValue());
        }

        public final void set(int value) {
            this.getMemory().putInt(this.offset(), value);
        }

        public final int get() {
            return this.getMemory().getInt(this.offset());
        }
    }

    public class Enum64<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public Enum64(Class<E> enumClass) {
            super(NativeType.SLONGLONG, enumClass);
        }

        @Override
        public final E get() {
            return (E)((java.lang.Enum)this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue())));
        }

        @Override
        public final long longValue() {
            return this.getMemory().getLongLong(this.offset());
        }

        @Override
        public final int intValue() {
            return (int)this.longValue();
        }

        @Override
        public void set(Number value) {
            this.getMemory().putLongLong(this.offset(), value.longValue());
        }

        public final void set(E value) {
            this.getMemory().putLongLong(this.offset(), EnumMapper.getInstance(this.enumClass).intValue((java.lang.Enum)value));
        }
    }

    public final class ino64_t
    extends IntegerAlias {
        public ino64_t(Offset offset) {
            super(TypeAlias.ino64_t, offset);
        }

        public ino64_t() {
            super(TypeAlias.ino64_t);
        }
    }

    public final class clock_t
    extends IntegerAlias {
        public clock_t(Offset offset) {
            super(TypeAlias.clock_t, offset);
        }

        public clock_t() {
            super(TypeAlias.clock_t);
        }
    }

    public class Signed8
    extends NumberField {
        public final byte get() {
            return this.getMemory().getByte(this.offset());
        }

        public final void set(byte value) {
            this.getMemory().putByte(this.offset(), value);
        }

        public Signed8() {
            super(NativeType.SCHAR);
        }

        @Override
        public final short shortValue() {
            return this.get();
        }

        @Override
        public final int intValue() {
            return this.get();
        }

        public Signed8(Offset offset) {
            super(NativeType.SCHAR, offset);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putByte(this.offset(), value.byteValue());
        }

        @Override
        public final byte byteValue() {
            return this.get();
        }
    }

    public final class int32_t
    extends IntegerAlias {
        public int32_t(Offset offset) {
            super(TypeAlias.int32_t, offset);
        }

        public int32_t() {
            super(TypeAlias.int32_t);
        }
    }

    public final class cc_t
    extends IntegerAlias {
        public cc_t() {
            super(TypeAlias.cc_t);
        }

        public cc_t(Offset offset) {
            super(TypeAlias.cc_t, offset);
        }
    }

    protected abstract class Member {
        abstract long offset();

        abstract Struct struct();

        abstract jnr.ffi.Pointer getMemory();

        protected Member() {
        }
    }

    public final class u_int64_t
    extends IntegerAlias {
        public u_int64_t() {
            super(TypeAlias.u_int64_t);
        }

        public u_int64_t(Offset offset) {
            super(TypeAlias.u_int64_t, offset);
        }
    }

    public final class dev_t
    extends IntegerAlias {
        public dev_t() {
            super(TypeAlias.dev_t);
        }

        public dev_t(Offset offset) {
            super(TypeAlias.dev_t, offset);
        }
    }

    public class Float
    extends NumberField {
        @Override
        public final float floatValue() {
            return this.get();
        }

        @Override
        public final java.lang.String toString() {
            return java.lang.String.valueOf(this.get());
        }

        @Override
        public final int intValue() {
            return (int)this.get();
        }

        @Override
        public final double doubleValue() {
            return this.get();
        }

        @Override
        public final long longValue() {
            return (long)this.get();
        }

        public final void set(float value) {
            this.getMemory().putFloat(this.offset(), value);
        }

        @Override
        public void set(Number value) {
            this.getMemory().putFloat(this.offset(), value.floatValue());
        }

        public final float get() {
            return this.getMemory().getFloat(this.offset());
        }

        public Float(Offset offset) {
            super(NativeType.FLOAT, offset);
        }

        public Float() {
            super(NativeType.FLOAT);
        }
    }

    public class AsciiStringRef
    extends UTFStringRef {
        public AsciiStringRef() {
            super(Integer.MAX_VALUE, ASCII);
        }

        public AsciiStringRef(int size) {
            super(size, ASCII);
        }
    }
}

