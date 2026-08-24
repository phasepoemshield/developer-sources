/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.Type;
import jnr.ffi.TypeAlias;
import jnr.ffi.util.EnumMapper;

public class StructLayout
extends Type {
    int alignment = 1;
    private final Runtime runtime;
    private final boolean isUnion = false;
    static final Charset UTF8;
    private boolean resetIndex = false;
    int size = 0;
    int paddedSize = 0;
    int offset = 0;
    static final Charset ASCII;
    StructLayout enclosing = null;

    static {
        ASCII = Charset.forName("ASCII");
        UTF8 = Charset.forName("UTF-8");
    }

    protected final <T> Function<T> function(Class<T> closureClass) {
        return new Function<T>(closureClass);
    }

    @Override
    public final int alignment() {
        return this.alignment;
    }

    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        java.lang.reflect.Field[] fields = this.getClass().getDeclaredFields();
        sb.append(this.getClass().getSimpleName()).append(" { \n");
        java.lang.String fieldPrefix = "    ";
        java.lang.reflect.Field[] fieldArray = fields;
        int n = fieldArray.length;
        for (int i = 0; i < n; ++i) {
            java.lang.reflect.Field field = fieldArray[i];
            try {
                sb.append("    ").append('\n');
                continue;
            }
            catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    protected final <T extends StructLayout> T inner(T structLayout) {
        structLayout.enclosing = this;
        structLayout.offset = StructLayout.align(this.size, structLayout.alignment);
        this.size = structLayout.offset + structLayout.size;
        this.paddedSize = StructLayout.align(this.size, this.alignment());
        return structLayout;
    }

    /*
     * WARNING - void declaration
     */
    protected StructLayout(Runtime runtime) {
        void var1_1;
        this.runtime = var1_1;
    }

    public final int offset() {
        return this.offset;
    }

    protected final int addField(int size, int align, Offset offset) {
        this.size = Math.max(this.size, offset.intValue() + size);
        this.alignment = Math.max(this.alignment, align);
        this.paddedSize = StructLayout.align(this.size, this.alignment);
        return offset.intValue();
    }

    protected final int addField(Type t) {
        return this.addField(t.size(), t.alignment());
    }

    @Override
    public final int size() {
        return this.paddedSize;
    }

    protected final void arrayEnd() {
        this.resetIndex = false;
    }

    @Override
    public NativeType getNativeType() {
        return NativeType.STRUCT;
    }

    protected final <T> Function<T> function(Class<T> closureClass, Offset offset) {
        return new Function<T>(closureClass, offset);
    }

    protected StructLayout(Runtime runtime, int structSize) {
        this.runtime = runtime;
        this.size = this.paddedSize = structSize;
    }

    protected final Offset at(int offset) {
        return new Offset(offset);
    }

    /*
     * WARNING - void declaration
     */
    protected final int addField(int size, int align) {
        void var3_3;
        int off = this.resetIndex ? 0 : StructLayout.align(this.size, align);
        this.size = Math.max(this.size, off + size);
        this.alignment = Math.max(this.alignment, align);
        this.paddedSize = StructLayout.align(this.size, this.alignment);
        return (int)var3_3;
    }

    private static int align(int offset, int alignment) {
        return offset + alignment - 1 & ~(alignment + -1);
    }

    protected final int addField(Type t, Offset offset) {
        return this.addField(t.size(), t.alignment(), offset);
    }

    /*
     * WARNING - void declaration
     */
    protected <T extends Field> T[] array(T[] array) {
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
                array[i] = (Field)ctor.newInstance(parameters);
                ++var5_6;
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        this.arrayEnd();
        return var1_1;
    }

    public final Runtime getRuntime() {
        return this.runtime;
    }

    protected final void arrayBegin() {
        this.resetIndex = false;
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

    public final class dev_t
    extends IntegerAlias {
        public dev_t() {
            super(TypeAlias.dev_t);
        }

        public dev_t(Offset offset) {
            super(TypeAlias.dev_t, offset);
        }
    }

    public class Enum32<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public Enum32(Class<E> enumClass) {
            super(NativeType.SINT, enumClass);
        }

        public Enum32(Class<E> enumClass, Offset offset) {
            super(NativeType.SINT, enumClass, offset);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putInt(this.offset(), value.intValue());
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return ptr.getInt(this.offset());
        }

        public void set(jnr.ffi.Pointer ptr, E value) {
            ptr.putInt(this.offset(), this.enumMapper.intValue((java.lang.Enum)value));
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

    public abstract class IntegerAlias
    extends NumberField {
        @Override
        public long longValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        protected IntegerAlias(TypeAlias type, Offset offset) {
            super(StructLayout.this.getRuntime().findType(type), offset);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putInt(this.type, this.offset(), value.longValue());
        }

        public void set(jnr.ffi.Pointer ptr, long value) {
            ptr.putInt(this.type, this.offset(), value);
        }

        protected IntegerAlias(TypeAlias type) {
            super(StructLayout.this.getRuntime().findType(type));
        }

        public final long get(jnr.ffi.Pointer ptr) {
            return ptr.getInt(this.type, this.offset());
        }

        @Override
        public int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }
    }

    public final class fsblkcnt_t
    extends IntegerAlias {
        public fsblkcnt_t() {
            super(TypeAlias.fsblkcnt_t);
        }

        public fsblkcnt_t(Offset offset) {
            super(TypeAlias.fsblkcnt_t, offset);
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

    public class UTFStringRef
    extends String {
        private jnr.ffi.Pointer valueHolder;

        @Override
        protected jnr.ffi.Pointer getStringMemory(jnr.ffi.Pointer ptr) {
            return ptr.getPointer(this.offset(), this.length());
        }

        public UTFStringRef(int length, Charset cs) {
            super(StructLayout.this.getRuntime().findType(NativeType.ADDRESS).size(), StructLayout.this.getRuntime().findType(NativeType.ADDRESS).alignment(), length, cs);
        }

        public UTFStringRef(Charset cs) {
            this(Integer.MAX_VALUE, cs);
        }

        @Override
        public final java.lang.String get(jnr.ffi.Pointer ptr) {
            jnr.ffi.Pointer memory = this.getStringMemory(ptr);
            return memory != null ? memory.getString(0L, this.length, this.charset) : null;
        }

        public UTFStringRef(int length, Charset cs, Offset offset) {
            super(StructLayout.this.getRuntime().findType(NativeType.ADDRESS).size(), StructLayout.this.getRuntime().findType(NativeType.ADDRESS).alignment(), offset, length, cs);
        }

        @Override
        public final void set(jnr.ffi.Pointer ptr, java.lang.String value) {
            if (value != null) {
                this.valueHolder = StructLayout.this.getRuntime().getMemoryManager().allocateDirect(this.length() * 4);
                this.valueHolder.putString(0L, value, this.length() * 4, this.charset);
                ptr.putPointer(this.offset(), this.valueHolder);
            } else {
                this.valueHolder = null;
                ptr.putAddress(this.offset(), 0L);
            }
        }
    }

    public final class BOOL16
    extends AbstractBoolean {
        protected BOOL16(Offset offset) {
            super(NativeType.SSHORT, offset);
        }

        @Override
        public final boolean get(jnr.ffi.Pointer ptr) {
            return ptr.getShort(this.offset()) != 0;
        }

        @Override
        public final void set(jnr.ffi.Pointer ptr, boolean value) {
            ptr.putShort(this.offset(), (short)(value ? 1 : 0));
        }

        protected BOOL16() {
            super(NativeType.SSHORT);
        }
    }

    public class Pointer
    extends NumberField {
        public final jnr.ffi.Pointer get(jnr.ffi.Pointer ptr) {
            return ptr.getPointer(this.offset());
        }

        public Pointer() {
            super(NativeType.ADDRESS);
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)ptr.getAddress(this.offset());
        }

        public Pointer(Offset offset) {
            super(NativeType.ADDRESS, offset);
        }

        public final void set(jnr.ffi.Pointer ptr, jnr.ffi.Pointer value) {
            ptr.putPointer(this.offset(), value);
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return ptr.getAddress(this.offset());
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return this.get(ptr).toString();
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putAddress(this.offset(), value.longValue());
        }

        public final int size() {
            return StructLayout.this.getRuntime().findType(NativeType.ADDRESS).size();
        }
    }

    protected final class Padding
    extends AbstractField {
        public Padding(NativeType type, int length, Offset offset) {
            this(this$0.getRuntime().findType(type), length);
        }

        public Padding(Type type, int length, Offset offset) {
            super(type.size() * length, type.alignment(), offset);
        }

        public Padding(Type type, int length) {
            super(type.size() * length, type.alignment());
        }

        public Padding(NativeType type, int length) {
            this(this$0.getRuntime().findType(type), length);
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

    public final class clock_t
    extends IntegerAlias {
        public clock_t() {
            super(TypeAlias.clock_t);
        }

        public clock_t(Offset offset) {
            super(TypeAlias.clock_t, offset);
        }
    }

    public class AsciiString
    extends UTFString {
        public AsciiString(int size, Offset offset) {
            super(size, ASCII, offset);
        }

        public AsciiString(int size) {
            super(size, ASCII);
        }
    }

    public final class swblk_t
    extends IntegerAlias {
        public swblk_t() {
            super(TypeAlias.swblk_t);
        }

        public swblk_t(Offset offset) {
            super(TypeAlias.swblk_t, offset);
        }
    }

    public class Signed32
    extends NumberField {
        public Signed32(Offset offset) {
            super(NativeType.SINT, offset);
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public final void set(jnr.ffi.Pointer ptr, int value) {
            ptr.putInt(this.offset(), value);
        }

        public Signed32() {
            super(NativeType.SINT);
        }

        public final int get(jnr.ffi.Pointer ptr) {
            return ptr.getInt(this.offset());
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putInt(this.offset(), value.intValue());
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

    public class Signed16
    extends NumberField {
        public Signed16() {
            super(NativeType.SSHORT);
        }

        public final short get(jnr.ffi.Pointer ptr) {
            return ptr.getShort(this.offset());
        }

        public final void set(jnr.ffi.Pointer ptr, short value) {
            ptr.putShort(this.offset(), value);
        }

        @Override
        public final short shortValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putShort(this.offset(), value.shortValue());
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public Signed16(Offset offset) {
            super(NativeType.SSHORT, offset);
        }
    }

    public class Float
    extends NumberField {
        @Override
        public final float floatValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return java.lang.String.valueOf(this.get(ptr));
        }

        public Float() {
            super(NativeType.FLOAT);
        }

        @Override
        public final double doubleValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public final float get(jnr.ffi.Pointer ptr) {
            return ptr.getFloat(this.offset());
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putFloat(this.offset(), value.floatValue());
        }

        public final void set(jnr.ffi.Pointer ptr, float value) {
            ptr.putFloat(this.offset(), value);
        }

        public Float(Offset offset) {
            super(NativeType.FLOAT, offset);
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return (long)this.get(ptr);
        }
    }

    protected final class WBOOL
    extends AbstractBoolean {
        @Override
        public final void set(jnr.ffi.Pointer ptr, boolean value) {
            ptr.putInt(this.offset(), value ? 1 : 0);
        }

        @Override
        public final boolean get(jnr.ffi.Pointer ptr) {
            return ptr.getInt(this.offset()) != 0;
        }

        protected WBOOL(Offset offset) {
            super(NativeType.SINT, offset);
        }

        protected WBOOL() {
            super(NativeType.SINT);
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

    public final class u_int8_t
    extends IntegerAlias {
        public u_int8_t() {
            super(TypeAlias.u_int8_t);
        }

        public u_int8_t(Offset offset) {
            super(TypeAlias.u_int8_t, offset);
        }
    }

    protected final class Function<T>
    extends AbstractField {
        private T instance;
        private final Class<? extends T> closureClass;

        public final void set(jnr.ffi.Pointer ptr, T value) {
            this.instance = value;
            ptr.putPointer(this.offset(), StructLayout.this.getRuntime().getClosureManager().getClosurePointer(this.closureClass, this.instance));
        }

        public Function(Class<? extends T> closureClass, Offset offset) {
            super(NativeType.ADDRESS, offset);
            this.closureClass = closureClass;
        }

        public Function(Class<? extends T> closureClass) {
            super(NativeType.ADDRESS);
            this.closureClass = closureClass;
        }
    }

    protected static final class Offset
    extends Number {
        private final int offset;

        @Override
        public float floatValue() {
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
        public int intValue() {
            return this.offset;
        }

        @Override
        public double doubleValue() {
            return this.offset;
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

    public class UnsignedLong
    extends NumberField {
        public UnsignedLong(Offset offset) {
            super(NativeType.ULONG, offset);
        }

        public final void set(jnr.ffi.Pointer ptr, long value) {
            ptr.putNativeLong(this.offset(), value);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putNativeLong(this.offset(), value.longValue());
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return Long.toString(this.get(ptr));
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        /*
         * WARNING - void declaration
         */
        public final long get(jnr.ffi.Pointer ptr) {
            void var2_2;
            long value = ptr.getNativeLong(this.offset());
            long mask = StructLayout.this.getRuntime().findType(NativeType.SLONG).size() == 4 ? 0xFFFFFFFFL : -1L;
            return value < 0L ? (value & mask) + mask + 1L : var2_2;
        }

        public UnsignedLong() {
            super(NativeType.ULONG);
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
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

    public final class ino64_t
    extends IntegerAlias {
        public ino64_t() {
            super(TypeAlias.ino64_t);
        }

        public ino64_t(Offset offset) {
            super(TypeAlias.ino64_t, offset);
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

    public final class Double
    extends NumberField {
        @Override
        public final double doubleValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putDouble(this.offset(), value.doubleValue());
        }

        public final void set(jnr.ffi.Pointer ptr, double value) {
            ptr.putDouble(this.offset(), value);
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return (long)this.get(ptr);
        }

        @Override
        public final float floatValue(jnr.ffi.Pointer ptr) {
            return (float)this.get(ptr);
        }

        public final double get(jnr.ffi.Pointer ptr) {
            return ptr.getDouble(this.offset());
        }

        public Double() {
            super(NativeType.DOUBLE);
        }

        public Double(Offset offset) {
            super(NativeType.DOUBLE, offset);
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return java.lang.String.valueOf(this.get(ptr));
        }
    }

    protected final class Boolean
    extends AbstractBoolean {
        protected Boolean() {
            super(NativeType.SCHAR);
        }

        protected Boolean(Offset offset) {
            super(NativeType.SCHAR, offset);
        }

        @Override
        public final void set(jnr.ffi.Pointer ptr, boolean value) {
            ptr.putByte(this.offset(), (byte)(value ? 1 : 0));
        }

        @Override
        public final boolean get(jnr.ffi.Pointer ptr) {
            return ptr.getByte(this.offset()) != 0;
        }
    }

    public final class size_t
    extends IntegerAlias {
        public size_t() {
            super(TypeAlias.size_t);
        }

        public size_t(Offset offset) {
            super(TypeAlias.size_t, offset);
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

    public class Enum16<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public Enum16(Class<E> enumClass, Offset offset) {
            super(NativeType.SSHORT, enumClass, offset);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putShort(this.offset(), value.shortValue());
        }

        public Enum16(Class<E> enumClass) {
            super(NativeType.SSHORT, enumClass);
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return ptr.getShort(this.offset());
        }

        public void set(jnr.ffi.Pointer ptr, E value) {
            ptr.putShort(this.offset(), (short)this.enumMapper.intValue((java.lang.Enum)value));
        }
    }

    public class Signed64
    extends NumberField {
        public final long get(jnr.ffi.Pointer ptr) {
            return ptr.getLongLong(this.offset());
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putLongLong(this.offset(), value.longValue());
        }

        public Signed64(Offset offset) {
            super(NativeType.SLONGLONG, offset);
        }

        public final void set(jnr.ffi.Pointer ptr, long value) {
            ptr.putLongLong(this.offset(), value);
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        public Signed64() {
            super(NativeType.SLONGLONG);
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return Long.toString(this.get(ptr));
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }
    }

    public abstract class String
    extends AbstractField {
        protected final int length;
        protected final Charset charset;

        public final int length() {
            return this.length;
        }

        public abstract void set(jnr.ffi.Pointer var1, java.lang.String var2);

        protected abstract jnr.ffi.Pointer getStringMemory(jnr.ffi.Pointer var1);

        protected String(int size, int align, int length, Charset cs) {
            super(size, align);
            this.length = length;
            this.charset = cs;
        }

        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        protected String(int size, int align, Offset offset, int length, Charset cs) {
            super(size, align, offset);
            this.length = length;
            this.charset = cs;
        }

        public abstract java.lang.String get(jnr.ffi.Pointer var1);
    }

    public final class fsfilcnt_t
    extends IntegerAlias {
        public fsfilcnt_t() {
            super(TypeAlias.fsfilcnt_t);
        }

        public fsfilcnt_t(Offset offset) {
            super(TypeAlias.fsfilcnt_t, offset);
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
        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        public SignedLong(Offset offset) {
            super(NativeType.SLONG, offset);
        }

        public SignedLong() {
            super(NativeType.SLONG);
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return Long.toString(this.get(ptr));
        }

        public final long get(jnr.ffi.Pointer ptr) {
            return ptr.getNativeLong(this.offset());
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putNativeLong(this.offset(), value.longValue());
        }

        public final void set(jnr.ffi.Pointer ptr, long value) {
            ptr.putNativeLong(this.offset(), value);
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
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

    public final class rlim_t
    extends IntegerAlias {
        public rlim_t() {
            super(TypeAlias.rlim_t);
        }

        public rlim_t(Offset offset) {
            super(TypeAlias.rlim_t, offset);
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

    public class Unsigned64
    extends NumberField {
        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        public final void set(jnr.ffi.Pointer ptr, long value) {
            ptr.putLongLong(this.offset(), value);
        }

        public Unsigned64(Offset offset) {
            super(NativeType.ULONGLONG, offset);
        }

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return Long.toString(this.get(ptr));
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putLongLong(this.offset(), value.longValue());
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public final long get(jnr.ffi.Pointer ptr) {
            return ptr.getLongLong(this.offset());
        }

        public Unsigned64() {
            super(NativeType.ULONGLONG);
        }
    }

    public class Unsigned16
    extends NumberField {
        /*
         * WARNING - void declaration
         */
        public final int get(jnr.ffi.Pointer ptr) {
            void var2_2;
            short value = ptr.getShort(this.offset());
            return value < 0 ? (value & Short.MAX_VALUE) + 32768 : var2_2;
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public final void set(jnr.ffi.Pointer ptr, int value) {
            ptr.putShort(this.offset(), (short)value);
        }

        public Unsigned16(Offset offset) {
            super(NativeType.USHORT, offset);
        }

        public Unsigned16() {
            super(NativeType.USHORT);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putShort(this.offset(), value.shortValue());
        }
    }

    protected abstract class AbstractBoolean
    extends AbstractField {
        protected AbstractBoolean(NativeType type) {
            super(type);
        }

        public java.lang.String toString(jnr.ffi.Pointer ptr) {
            return java.lang.Boolean.toString(this.get(ptr));
        }

        public abstract boolean get(jnr.ffi.Pointer var1);

        public abstract void set(jnr.ffi.Pointer var1, boolean var2);

        protected AbstractBoolean(NativeType type, Offset offset) {
            super(type, offset);
        }
    }

    public final class u_int32_t
    extends IntegerAlias {
        public u_int32_t(Offset offset) {
            super(TypeAlias.u_int32_t, offset);
        }

        public u_int32_t() {
            super(TypeAlias.u_int32_t);
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

    public class Enum8<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putByte(this.offset(), value.byteValue());
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return ptr.getByte(this.offset());
        }

        public Enum8(Class<E> enumClass) {
            super(NativeType.SCHAR, enumClass);
        }

        public final void set(jnr.ffi.Pointer ptr, E value) {
            ptr.putByte(this.offset(), (byte)this.enumMapper.intValue((java.lang.Enum)value));
        }

        public Enum8(Class<E> enumClass, Offset offset) {
            super(NativeType.SCHAR, enumClass, offset);
        }
    }

    public class Enum64<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putLongLong(this.offset(), value.longValue());
        }

        public Enum64(Class<E> enumClass, Offset offset) {
            super(NativeType.SLONGLONG, enumClass, offset);
        }

        public Enum64(Class<E> enumClass) {
            super(NativeType.SLONGLONG, enumClass);
        }

        public final void set(jnr.ffi.Pointer ptr, E value) {
            ptr.putLongLong(this.offset(), this.enumMapper.intValue((java.lang.Enum)value));
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return ptr.getLongLong(this.offset());
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.longValue(ptr);
        }
    }

    public class Unsigned8
    extends NumberField {
        public final void set(jnr.ffi.Pointer ptr, short value) {
            ptr.putByte(this.offset(), (byte)value);
        }

        /*
         * WARNING - void declaration
         */
        public final short get(jnr.ffi.Pointer ptr) {
            void var2_2;
            short value = ptr.getByte(this.offset());
            return value < 0 ? (short)((value & 0x7F) + 128) : var2_2;
        }

        @Override
        public final short shortValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putByte(this.offset(), value.byteValue());
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public Unsigned8(Offset offset) {
            super(NativeType.UCHAR, offset);
        }

        public Unsigned8() {
            super(NativeType.UCHAR);
        }
    }

    public final class blksize_t
    extends IntegerAlias {
        public blksize_t(Offset offset) {
            super(TypeAlias.blksize_t, offset);
        }

        public blksize_t() {
            super(TypeAlias.blksize_t);
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

    public class UTF8StringRef
    extends UTFStringRef {
        public UTF8StringRef(int size) {
            super(size, UTF8);
        }

        public UTF8StringRef(int size, Offset offset) {
            super(size, UTF8, offset);
        }

        public UTF8StringRef() {
            super(Integer.MAX_VALUE, UTF8);
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

    public class UTF8String
    extends UTFString {
        public UTF8String(int size, Offset offset) {
            super(size, UTF8, offset);
        }

        public UTF8String(int size) {
            super(size, UTF8);
        }
    }

    public class UTFString
    extends String {
        public UTFString(int length, Charset cs) {
            super(length, 1, length, cs);
        }

        @Override
        public final void set(jnr.ffi.Pointer ptr, java.lang.String value) {
            this.getStringMemory(ptr).putString(0L, value, this.length, this.charset);
        }

        public UTFString(int length, Charset cs, Offset offset) {
            super(length, 1, offset, length, cs);
        }

        @Override
        public final java.lang.String get(jnr.ffi.Pointer ptr) {
            return this.getStringMemory(ptr).getString(0L, this.length, this.charset);
        }

        @Override
        protected jnr.ffi.Pointer getStringMemory(jnr.ffi.Pointer ptr) {
            return ptr.slice(this.offset(), this.length());
        }
    }

    protected abstract class Field {
        private final int offset;

        public final long offset() {
            return this.offset + StructLayout.this.offset;
        }

        protected Field(int offset) {
            this.offset = offset;
        }

        public final StructLayout enclosing() {
            return StructLayout.this;
        }
    }

    public class EnumLong<E extends java.lang.Enum<E>>
    extends EnumField<E> {
        public final void set(jnr.ffi.Pointer ptr, E value) {
            ptr.putNativeLong(this.offset(), this.enumMapper.intValue((java.lang.Enum)value));
        }

        public EnumLong(Class<E> enumClass, Offset offset) {
            super(NativeType.SLONG, enumClass, offset);
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return ptr.getNativeLong(this.offset());
        }

        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.longValue(ptr);
        }

        public EnumLong(Class<E> enumClass) {
            super(NativeType.SLONG, enumClass);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putNativeLong(this.offset(), value.longValue());
        }
    }

    protected abstract class EnumField<E extends java.lang.Enum<E>>
    extends NumberField {
        protected final EnumMapper enumMapper;
        protected final Class<E> enumClass;

        @Override
        public final java.lang.String toString(jnr.ffi.Pointer ptr) {
            return ((java.lang.Enum)this.get(ptr)).toString();
        }

        public E get(jnr.ffi.Pointer ptr) {
            return (E)((java.lang.Enum)this.enumClass.cast(this.enumMapper.valueOf(this.intValue(ptr))));
        }

        public EnumField(NativeType type, Class<E> enumClass, Offset offset) {
            super(type, offset);
            this.enumClass = enumClass;
            this.enumMapper = EnumMapper.getInstance(enumClass);
        }

        public EnumField(NativeType type, Class<E> enumClass) {
            super(type);
            this.enumClass = enumClass;
            this.enumMapper = EnumMapper.getInstance(enumClass);
        }
    }

    public class Unsigned32
    extends NumberField {
        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return (int)this.get(ptr);
        }

        /*
         * WARNING - void declaration
         */
        public final long get(jnr.ffi.Pointer ptr) {
            void var2_2;
            long value = ptr.getInt(this.offset());
            return value < 0L ? (value & Integer.MAX_VALUE) + 0x80000000L : var2_2;
        }

        @Override
        public final long longValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public Unsigned32() {
            super(NativeType.UINT);
        }

        public final void set(jnr.ffi.Pointer ptr, long value) {
            ptr.putInt(this.offset(), (int)value);
        }

        public Unsigned32(Offset offset) {
            super(NativeType.SINT, offset);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putInt(this.offset(), value.intValue());
        }
    }

    public final class in_addr_t
    extends IntegerAlias {
        public in_addr_t(Offset offset) {
            super(TypeAlias.in_addr_t, offset);
        }

        public in_addr_t() {
            super(TypeAlias.in_addr_t);
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

    public final class uintptr_t
    extends IntegerAlias {
        public uintptr_t(Offset offset) {
            super(TypeAlias.uintptr_t, offset);
        }

        public uintptr_t() {
            super(TypeAlias.uintptr_t);
        }
    }

    protected abstract class NumberField
    extends Field {
        protected final Type type;

        public byte byteValue(jnr.ffi.Pointer ptr) {
            return (byte)this.intValue(ptr);
        }

        public double doubleValue(jnr.ffi.Pointer ptr) {
            return this.longValue(ptr);
        }

        public abstract int intValue(jnr.ffi.Pointer var1);

        protected NumberField(NativeType nativeType, Offset offset) {
            this(this$0.getRuntime().findType(nativeType), offset);
        }

        public long longValue(jnr.ffi.Pointer ptr) {
            return this.intValue(ptr);
        }

        protected NumberField(Type type, Offset offset) {
            super(StructLayout.this.addField(type, offset));
            this.type = type;
        }

        public short shortValue(jnr.ffi.Pointer ptr) {
            return (short)this.intValue(ptr);
        }

        public java.lang.String toString(jnr.ffi.Pointer ptr) {
            return Integer.toString(this.intValue(ptr), 10);
        }

        protected NumberField(Type type) {
            super(StructLayout.this.addField(type));
            this.type = type;
        }

        public abstract void set(jnr.ffi.Pointer var1, Number var2);

        public float floatValue(jnr.ffi.Pointer ptr) {
            return this.intValue(ptr);
        }

        protected NumberField(NativeType nativeType) {
            this(this$0.getRuntime().findType(nativeType));
        }
    }

    public class Signed8
    extends NumberField {
        @Override
        public final int intValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        @Override
        public final short shortValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        public final byte get(jnr.ffi.Pointer ptr) {
            return ptr.getByte(this.offset());
        }

        public Signed8() {
            super(NativeType.SCHAR);
        }

        public final void set(jnr.ffi.Pointer ptr, byte value) {
            ptr.putByte(this.offset(), value);
        }

        @Override
        public final byte byteValue(jnr.ffi.Pointer ptr) {
            return this.get(ptr);
        }

        @Override
        public void set(jnr.ffi.Pointer ptr, Number value) {
            ptr.putByte(this.offset(), value.byteValue());
        }

        public Signed8(Offset offset) {
            super(NativeType.SCHAR, offset);
        }
    }

    public class Enum<T extends java.lang.Enum<T>>
    extends Enum32<T> {
        public Enum(Class<T> enumClass, Offset offset) {
            super(enumClass, offset);
        }

        public Enum(Class<T> enumClass) {
            super(enumClass);
        }
    }

    public final class in_port_t
    extends IntegerAlias {
        public in_port_t() {
            super(TypeAlias.in_port_t);
        }

        public in_port_t(Offset offset) {
            super(TypeAlias.in_port_t, offset);
        }
    }

    public final class key_t
    extends IntegerAlias {
        public key_t(Offset offset) {
            super(TypeAlias.key_t, offset);
        }

        public key_t() {
            super(TypeAlias.key_t);
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

    protected abstract class AbstractField
    extends Field {
        protected AbstractField(NativeType type) {
            super(StructLayout.this.addField(StructLayout.this.getRuntime().findType(type)));
        }

        protected AbstractField(int size, int align, Offset offset) {
            super(StructLayout.this.addField(size, align, offset));
        }

        protected AbstractField(Type type) {
            super(StructLayout.this.addField(type));
        }

        protected AbstractField(Type type, Offset offset) {
            super(StructLayout.this.addField(type, offset));
        }

        protected AbstractField(int size, int align) {
            super(StructLayout.this.addField(size, align));
        }

        protected AbstractField(NativeType type, Offset offset) {
            super(StructLayout.this.addField(StructLayout.this.getRuntime().findType(type), offset));
        }
    }

    public final class int32_t
    extends IntegerAlias {
        public int32_t() {
            super(TypeAlias.int32_t);
        }

        public int32_t(Offset offset) {
            super(TypeAlias.int32_t, offset);
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

    public final class uid_t
    extends IntegerAlias {
        public uid_t() {
            super(TypeAlias.uid_t);
        }

        public uid_t(Offset offset) {
            super(TypeAlias.uid_t, offset);
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

        public AsciiStringRef(int size, Offset offset) {
            super(size, ASCII, offset);
        }
    }
}

