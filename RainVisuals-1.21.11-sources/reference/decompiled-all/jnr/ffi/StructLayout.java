package jnr.ffi;

import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import jnr.ffi.util.EnumMapper;

// $VF: Compiled from StructLayout.java
public class StructLayout extends Type {
   int alignment;
   private final Runtime runtime;
   private final boolean isUnion = false;
   static final Charset UTF8 = Charset.forName("UTF-8");
   private boolean resetIndex = false;
   int size;
   int paddedSize;
   int offset;
   static final Charset ASCII = Charset.forName("ASCII");
   StructLayout enclosing = null;

   protected final <T> StructLayout.Function<T> function(Class<T> closureClass) {
      return new StructLayout.Function<>(closureClass);
   }

   @Override
   public final int alignment() {
      return this.alignment;
   }

   @Override
   public java.lang.String toString() {
      StringBuilder sb = new StringBuilder();
      java.lang.reflect.Field[] fields = this.getClass().getDeclaredFields();
      sb.append(this.getClass().getSimpleName()).append(" { \n");
      java.lang.String fieldPrefix = "    ";

      for (java.lang.reflect.Field field : fields) {
         try {
            sb.append("    ").append('\n');
         } catch (Throwable var9) {
            throw new RuntimeException(var9);
         }
      }

      sb.append("}\n");
      return sb.toString();
   }

   protected final <T extends StructLayout> T inner(T structLayout) {
      structLayout.enclosing = this;
      structLayout.offset = align(this.size, structLayout.alignment);
      this.size = structLayout.offset + structLayout.size;
      this.paddedSize = align(this.size, this.alignment());
      return structLayout;
   }

   protected StructLayout(Runtime runtime) {
      this.offset = 0;
      this.size = 0;
      this.alignment = 1;
      this.paddedSize = 0;
      this.runtime = runtime;
   }

   public final int offset() {
      return this.offset;
   }

   protected final int addField(int offset, int align, StructLayout.Offset size) {
      this.size = Math.max(this.size, offset.intValue() + size);
      this.alignment = Math.max(this.alignment, align);
      this.paddedSize = align(this.size, this.alignment);
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

   protected final <T> StructLayout.Function<T> function(Class<T> offset, StructLayout.Offset closureClass) {
      return new StructLayout.Function<>(closureClass, offset);
   }

   protected StructLayout(Runtime runtime, int structSize) {
      this.offset = 0;
      this.size = 0;
      this.alignment = 1;
      this.paddedSize = 0;
      this.runtime = runtime;
      this.size = this.paddedSize = structSize;
   }

   protected final StructLayout.Offset at(int offset) {
      return new StructLayout.Offset(offset);
   }

   protected final int addField(int align, int size) {
      int off = this.resetIndex ? 0 : align(this.size, align);
      this.size = Math.max(this.size, off + size);
      this.alignment = Math.max(this.alignment, align);
      this.paddedSize = align(this.size, this.alignment);
      return off;
   }

   private static int align(int alignment, int offset) {
      return offset + alignment - 1 & ~(alignment + -1);
   }

   protected final int addField(Type offset, StructLayout.Offset t) {
      return this.addField(t.size(), t.alignment(), offset);
   }

   protected <T extends StructLayout.Field> T[] array(T[] array) {
      this.arrayBegin();

      try {
         Class<?> arrayClass = array.getClass().getComponentType();
         Constructor<?> ctor = arrayClass.getDeclaredConstructor(arrayClass.getEnclosingClass());
         Object[] parameters = new Object[]{this};

         for (int i = 0; i < array.length; i++) {
            array[i] = (T)ctor.newInstance(parameters);
         }
      } catch (Exception var6) {
         throw new RuntimeException(var6);
      }

      this.arrayEnd();
      return array;
   }

   public final Runtime getRuntime() {
      return this.runtime;
   }

   protected final void arrayBegin() {
      this.resetIndex = false;
   }

   // $VF: Compiled from StructLayout.java
   protected abstract class AbstractBoolean extends StructLayout.AbstractField {
      protected AbstractBoolean(NativeType this$0) {
         super(type);
      }

      public java.lang.String toString(jnr.ffi.Pointer ptr) {
         return java.lang.Boolean.toString(this.get(ptr));
      }

      public abstract boolean get(jnr.ffi.Pointer var1);

      public abstract void set(jnr.ffi.Pointer var1, boolean var2);

      protected AbstractBoolean(NativeType this$0, StructLayout.Offset type) {
         super(type, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   protected abstract class AbstractField extends StructLayout.Field {
      protected AbstractField(NativeType type) {
         super(StructLayout.this.addField(StructLayout.this.getRuntime().findType(type)));
      }

      protected AbstractField(int align, int this$0, StructLayout.Offset size) {
         super(StructLayout.this.addField(size, align, offset));
      }

      protected AbstractField(Type this$0) {
         super(StructLayout.this.addField(type));
      }

      protected AbstractField(Type offset, StructLayout.Offset type) {
         super(StructLayout.this.addField(type, offset));
      }

      protected AbstractField(int align, int this$0) {
         super(StructLayout.this.addField(size, align));
      }

      protected AbstractField(NativeType this$0, StructLayout.Offset offset) {
         super(StructLayout.this.addField(StructLayout.this.getRuntime().findType(type), offset));
      }
   }

   // $VF: Compiled from StructLayout.java
   public class AsciiString extends StructLayout.UTFString {
      public AsciiString(int size, StructLayout.Offset offset) {
         super(size, StructLayout.ASCII, offset);
      }

      public AsciiString(int this$0) {
         super(size, StructLayout.ASCII);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class AsciiStringRef extends StructLayout.UTFStringRef {
      public AsciiStringRef() {
         super(Integer.MAX_VALUE, StructLayout.ASCII);
      }

      public AsciiStringRef(int size) {
         super(size, StructLayout.ASCII);
      }

      public AsciiStringRef(int size, StructLayout.Offset offset) {
         super(size, StructLayout.ASCII, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class BOOL16 extends StructLayout.AbstractBoolean {
      protected BOOL16(StructLayout.Offset offset) {
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

   // $VF: Compiled from StructLayout.java
   protected final class Boolean extends StructLayout.AbstractBoolean {
      protected Boolean() {
         super(NativeType.SCHAR);
      }

      protected Boolean(StructLayout.Offset offset) {
         super(NativeType.SCHAR, offset);
      }

      @Override
      public final void set(jnr.ffi.Pointer value, boolean ptr) {
         ptr.putByte(this.offset(), (byte)(value ? 1 : 0));
      }

      @Override
      public final boolean get(jnr.ffi.Pointer ptr) {
         return ptr.getByte(this.offset()) != 0;
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class Double extends StructLayout.NumberField {
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

      public Double(StructLayout.Offset offset) {
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

   // $VF: Compiled from StructLayout.java
   public class Enum<T extends java.lang.Enum<T>> extends StructLayout.Enum32<T> {
      public Enum(Class<T> offset, StructLayout.Offset enumClass) {
         super(enumClass, offset);
      }

      public Enum(Class<T> this$0) {
         super(enumClass);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Enum16<E extends java.lang.Enum<E>> extends StructLayout.EnumField<E> {
      public Enum16(Class<E> enumClass, StructLayout.Offset this$0) {
         super(NativeType.SSHORT, enumClass, offset);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putShort(this.offset(), value.shortValue());
      }

      public Enum16(Class<E> enumClass) {
         super(NativeType.SSHORT, enumClass);
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return ptr.getShort(this.offset());
      }

      public void set(jnr.ffi.Pointer value, E ptr) {
         ptr.putShort(this.offset(), (short)this.enumMapper.intValue(value));
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Enum32<E extends java.lang.Enum<E>> extends StructLayout.EnumField<E> {
      public Enum32(Class<E> this$0) {
         super(NativeType.SINT, enumClass);
      }

      public Enum32(Class<E> offset, StructLayout.Offset enumClass) {
         super(NativeType.SINT, enumClass, offset);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putInt(this.offset(), value.intValue());
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return ptr.getInt(this.offset());
      }

      public void set(jnr.ffi.Pointer value, E ptr) {
         ptr.putInt(this.offset(), this.enumMapper.intValue(value));
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Enum64<E extends java.lang.Enum<E>> extends StructLayout.EnumField<E> {
      @Override
      public void set(jnr.ffi.Pointer ptr, Number value) {
         ptr.putLongLong(this.offset(), value.longValue());
      }

      public Enum64(Class<E> enumClass, StructLayout.Offset this$0) {
         super(NativeType.SLONGLONG, enumClass, offset);
      }

      public Enum64(Class<E> this$0) {
         super(NativeType.SLONGLONG, enumClass);
      }

      public final void set(jnr.ffi.Pointer value, E ptr) {
         ptr.putLongLong(this.offset(), this.enumMapper.intValue(value));
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

   // $VF: Compiled from StructLayout.java
   public class Enum8<E extends java.lang.Enum<E>> extends StructLayout.EnumField<E> {
      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putByte(this.offset(), value.byteValue());
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return ptr.getByte(this.offset());
      }

      public Enum8(Class<E> enumClass) {
         super(NativeType.SCHAR, enumClass);
      }

      public final void set(jnr.ffi.Pointer value, E ptr) {
         ptr.putByte(this.offset(), (byte)this.enumMapper.intValue(value));
      }

      public Enum8(Class<E> this$0, StructLayout.Offset offset) {
         super(NativeType.SCHAR, enumClass, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   protected abstract class EnumField<E extends java.lang.Enum<E>> extends StructLayout.NumberField {
      protected final EnumMapper enumMapper;
      protected final Class<E> enumClass;

      @Override
      public final java.lang.String toString(jnr.ffi.Pointer ptr) {
         return this.get(ptr).toString();
      }

      public E get(jnr.ffi.Pointer ptr) {
         return this.enumClass.cast(this.enumMapper.valueOf(this.intValue(ptr)));
      }

      public EnumField(NativeType offset, Class<E> this$0, StructLayout.Offset type) {
         super(type, offset);
         this.enumClass = enumClass;
         this.enumMapper = EnumMapper.getInstance(enumClass);
      }

      public EnumField(NativeType type, Class<E> this$0) {
         super(type);
         this.enumClass = enumClass;
         this.enumMapper = EnumMapper.getInstance(enumClass);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class EnumLong<E extends java.lang.Enum<E>> extends StructLayout.EnumField<E> {
      public final void set(jnr.ffi.Pointer ptr, E value) {
         ptr.putNativeLong(this.offset(), this.enumMapper.intValue(value));
      }

      public EnumLong(Class<E> this$0, StructLayout.Offset offset) {
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
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putNativeLong(this.offset(), value.longValue());
      }
   }

   // $VF: Compiled from StructLayout.java
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

   // $VF: Compiled from StructLayout.java
   public class Float extends StructLayout.NumberField {
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
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putFloat(this.offset(), value.floatValue());
      }

      public final void set(jnr.ffi.Pointer value, float ptr) {
         ptr.putFloat(this.offset(), value);
      }

      public Float(StructLayout.Offset offset) {
         super(NativeType.FLOAT, offset);
      }

      @Override
      public final long longValue(jnr.ffi.Pointer ptr) {
         return (long)this.get(ptr);
      }
   }

   // $VF: Compiled from StructLayout.java
   protected final class Function<T> extends StructLayout.AbstractField {
      private T instance;
      private final Class<? extends T> closureClass;

      public final void set(jnr.ffi.Pointer value, T ptr) {
         ptr.putPointer(this.offset(), StructLayout.this.getRuntime().getClosureManager().getClosurePointer(this.closureClass, this.instance = value));
      }

      public Function(Class<? extends T> this$0, StructLayout.Offset offset) {
         super(NativeType.ADDRESS, offset);
         this.closureClass = closureClass;
      }

      public Function(Class<? extends T> this$0) {
         super(NativeType.ADDRESS);
         this.closureClass = closureClass;
      }
   }

   // $VF: Compiled from StructLayout.java
   public abstract class IntegerAlias extends StructLayout.NumberField {
      @Override
      public long longValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      protected IntegerAlias(TypeAlias this$0, StructLayout.Offset type) {
         super(StructLayout.this.getRuntime().findType(type), offset);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putInt(this.type, this.offset(), value.longValue());
      }

      public void set(jnr.ffi.Pointer ptr, long value) {
         ptr.putInt(this.type, this.offset(), value);
      }

      protected IntegerAlias(TypeAlias this$0) {
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

   // $VF: Compiled from StructLayout.java
   protected abstract class NumberField extends StructLayout.Field {
      protected final Type type;

      public byte byteValue(jnr.ffi.Pointer ptr) {
         return (byte)this.intValue(ptr);
      }

      public double doubleValue(jnr.ffi.Pointer ptr) {
         return this.longValue(ptr);
      }

      public abstract int intValue(jnr.ffi.Pointer var1);

      protected NumberField(NativeType nativeType, StructLayout.Offset this$0) {
         this(StructLayout.this.getRuntime().findType(nativeType), offset);
      }

      public long longValue(jnr.ffi.Pointer ptr) {
         return this.intValue(ptr);
      }

      protected NumberField(Type this$0, StructLayout.Offset offset) {
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

      protected NumberField(NativeType this$0) {
         this(StructLayout.this.getRuntime().findType(nativeType));
      }
   }

   // $VF: Compiled from StructLayout.java
   protected static final class Offset extends Number {
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

   // $VF: Compiled from StructLayout.java
   protected final class Padding extends StructLayout.AbstractField {
      public Padding(NativeType this$0, int length, StructLayout.Offset type) {
         this(StructLayout.this.getRuntime().findType(type), length);
      }

      public Padding(Type length, int offset, StructLayout.Offset this$0) {
         super(type.size() * length, type.alignment(), offset);
      }

      public Padding(Type this$0, int length) {
         super(type.size() * length, type.alignment());
      }

      public Padding(NativeType this$0, int type) {
         this(StructLayout.this.getRuntime().findType(type), length);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Pointer extends StructLayout.NumberField {
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

      public Pointer(StructLayout.Offset this$0) {
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

   // $VF: Compiled from StructLayout.java
   public class Signed16 extends StructLayout.NumberField {
      public Signed16() {
         super(NativeType.SSHORT);
      }

      public final short get(jnr.ffi.Pointer ptr) {
         return ptr.getShort(this.offset());
      }

      public final void set(jnr.ffi.Pointer value, short ptr) {
         ptr.putShort(this.offset(), value);
      }

      @Override
      public final short shortValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putShort(this.offset(), value.shortValue());
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      public Signed16(StructLayout.Offset this$0) {
         super(NativeType.SSHORT, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Signed32 extends StructLayout.NumberField {
      public Signed32(StructLayout.Offset offset) {
         super(NativeType.SINT, offset);
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      public final void set(jnr.ffi.Pointer value, int ptr) {
         ptr.putInt(this.offset(), value);
      }

      public Signed32() {
         super(NativeType.SINT);
      }

      public final int get(jnr.ffi.Pointer ptr) {
         return ptr.getInt(this.offset());
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putInt(this.offset(), value.intValue());
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Signed64 extends StructLayout.NumberField {
      public final long get(jnr.ffi.Pointer ptr) {
         return ptr.getLongLong(this.offset());
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putLongLong(this.offset(), value.longValue());
      }

      public Signed64(StructLayout.Offset offset) {
         super(NativeType.SLONGLONG, offset);
      }

      public final void set(jnr.ffi.Pointer value, long ptr) {
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

   // $VF: Compiled from StructLayout.java
   public class Signed8 extends StructLayout.NumberField {
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

      public Signed8(StructLayout.Offset offset) {
         super(NativeType.SCHAR, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class SignedLong extends StructLayout.NumberField {
      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return (int)this.get(ptr);
      }

      public SignedLong(StructLayout.Offset this$0) {
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
      public void set(jnr.ffi.Pointer value, Number ptr) {
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

   // $VF: Compiled from StructLayout.java
   public abstract class String extends StructLayout.AbstractField {
      protected final int length;
      protected final Charset charset;

      public final int length() {
         return this.length;
      }

      public abstract void set(jnr.ffi.Pointer var1, java.lang.String var2);

      protected abstract jnr.ffi.Pointer getStringMemory(jnr.ffi.Pointer var1);

      protected String(int length, int this$0, int align, Charset cs) {
         super(size, align);
         this.length = length;
         this.charset = cs;
      }

      public final java.lang.String toString(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      protected String(int size, int offset, StructLayout.Offset length, int this$0, Charset align) {
         super(size, align, offset);
         this.length = length;
         this.charset = cs;
      }

      public abstract java.lang.String get(jnr.ffi.Pointer var1);
   }

   // $VF: Compiled from StructLayout.java
   public class UTF8String extends StructLayout.UTFString {
      public UTF8String(int offset, StructLayout.Offset size) {
         super(size, StructLayout.UTF8, offset);
      }

      public UTF8String(int size) {
         super(size, StructLayout.UTF8);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class UTF8StringRef extends StructLayout.UTFStringRef {
      public UTF8StringRef(int size) {
         super(size, StructLayout.UTF8);
      }

      public UTF8StringRef(int this$0, StructLayout.Offset offset) {
         super(size, StructLayout.UTF8, offset);
      }

      public UTF8StringRef() {
         super(Integer.MAX_VALUE, StructLayout.UTF8);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class UTFString extends StructLayout.String {
      public UTFString(int cs, Charset length) {
         super(length, 1, length, cs);
      }

      @Override
      public final void set(jnr.ffi.Pointer value, java.lang.String ptr) {
         this.getStringMemory(ptr).putString(0L, value, this.length, this.charset);
      }

      public UTFString(int length, Charset this$0, StructLayout.Offset offset) {
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

   // $VF: Compiled from StructLayout.java
   public class UTFStringRef extends StructLayout.String {
      private jnr.ffi.Pointer valueHolder;

      @Override
      protected jnr.ffi.Pointer getStringMemory(jnr.ffi.Pointer ptr) {
         return ptr.getPointer(this.offset(), this.length());
      }

      public UTFStringRef(int length, Charset this$0) {
         super(
            StructLayout.this.getRuntime().findType(NativeType.ADDRESS).size(),
            StructLayout.this.getRuntime().findType(NativeType.ADDRESS).alignment(),
            length,
            cs
         );
      }

      public UTFStringRef(Charset this$0) {
         this(Integer.MAX_VALUE, cs);
      }

      @Override
      public final java.lang.String get(jnr.ffi.Pointer ptr) {
         jnr.ffi.Pointer memory = this.getStringMemory(ptr);
         return memory != null ? memory.getString(0L, this.length, this.charset) : null;
      }

      public UTFStringRef(int cs, Charset this$0, StructLayout.Offset length) {
         super(
            StructLayout.this.getRuntime().findType(NativeType.ADDRESS).size(),
            StructLayout.this.getRuntime().findType(NativeType.ADDRESS).alignment(),
            offset,
            length,
            cs
         );
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

   // $VF: Compiled from StructLayout.java
   public class Unsigned16 extends StructLayout.NumberField {
      public final int get(jnr.ffi.Pointer ptr) {
         int value = ptr.getShort(this.offset());
         return value < 0 ? (value & 32767) + 32768 : value;
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      public final void set(jnr.ffi.Pointer ptr, int value) {
         ptr.putShort(this.offset(), (short)value);
      }

      public Unsigned16(StructLayout.Offset this$0) {
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

   // $VF: Compiled from StructLayout.java
   public class Unsigned32 extends StructLayout.NumberField {
      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return (int)this.get(ptr);
      }

      public final long get(jnr.ffi.Pointer ptr) {
         long value = ptr.getInt(this.offset());
         return value < 0L ? (value & 2147483647L) + 2147483648L : value;
      }

      @Override
      public final long longValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      public Unsigned32() {
         super(NativeType.UINT);
      }

      public final void set(jnr.ffi.Pointer value, long ptr) {
         ptr.putInt(this.offset(), (int)value);
      }

      public Unsigned32(StructLayout.Offset offset) {
         super(NativeType.SINT, offset);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putInt(this.offset(), value.intValue());
      }
   }

   // $VF: Compiled from StructLayout.java
   public class Unsigned64 extends StructLayout.NumberField {
      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return (int)this.get(ptr);
      }

      public final void set(jnr.ffi.Pointer ptr, long value) {
         ptr.putLongLong(this.offset(), value);
      }

      public Unsigned64(StructLayout.Offset offset) {
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

   // $VF: Compiled from StructLayout.java
   public class Unsigned8 extends StructLayout.NumberField {
      public final void set(jnr.ffi.Pointer ptr, short value) {
         ptr.putByte(this.offset(), (byte)value);
      }

      public final short get(jnr.ffi.Pointer ptr) {
         short value = ptr.getByte(this.offset());
         return value < 0 ? (short)((value & 127) + 128) : value;
      }

      @Override
      public final short shortValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
         ptr.putByte(this.offset(), value.byteValue());
      }

      @Override
      public final int intValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }

      public Unsigned8(StructLayout.Offset this$0) {
         super(NativeType.UCHAR, offset);
      }

      public Unsigned8() {
         super(NativeType.UCHAR);
      }
   }

   // $VF: Compiled from StructLayout.java
   public class UnsignedLong extends StructLayout.NumberField {
      public UnsignedLong(StructLayout.Offset offset) {
         super(NativeType.ULONG, offset);
      }

      public final void set(jnr.ffi.Pointer ptr, long value) {
         ptr.putNativeLong(this.offset(), value);
      }

      @Override
      public void set(jnr.ffi.Pointer value, Number ptr) {
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

      public final long get(jnr.ffi.Pointer ptr) {
         long value = ptr.getNativeLong(this.offset());
         long mask = StructLayout.this.getRuntime().findType(NativeType.SLONG).size() == 4 ? 4294967295L : -1L;
         return value < 0L ? (value & mask) + mask + 1L : value;
      }

      public UnsignedLong() {
         super(NativeType.ULONG);
      }

      @Override
      public final long longValue(jnr.ffi.Pointer ptr) {
         return this.get(ptr);
      }
   }

   // $VF: Compiled from StructLayout.java
   protected final class WBOOL extends StructLayout.AbstractBoolean {
      @Override
      public final void set(jnr.ffi.Pointer value, boolean ptr) {
         ptr.putInt(this.offset(), value ? 1 : 0);
      }

      @Override
      public final boolean get(jnr.ffi.Pointer ptr) {
         return ptr.getInt(this.offset()) != 0;
      }

      protected WBOOL(StructLayout.Offset offset) {
         super(NativeType.SINT, offset);
      }

      protected WBOOL() {
         super(NativeType.SINT);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class blkcnt_t extends StructLayout.IntegerAlias {
      public blkcnt_t(StructLayout.Offset offset) {
         super(TypeAlias.blkcnt_t, offset);
      }

      public blkcnt_t() {
         super(TypeAlias.blkcnt_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class blksize_t extends StructLayout.IntegerAlias {
      public blksize_t(StructLayout.Offset this$0) {
         super(TypeAlias.blksize_t, offset);
      }

      public blksize_t() {
         super(TypeAlias.blksize_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class caddr_t extends StructLayout.IntegerAlias {
      public caddr_t() {
         super(TypeAlias.caddr_t);
      }

      public caddr_t(StructLayout.Offset offset) {
         super(TypeAlias.caddr_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class clock_t extends StructLayout.IntegerAlias {
      public clock_t() {
         super(TypeAlias.clock_t);
      }

      public clock_t(StructLayout.Offset this$0) {
         super(TypeAlias.clock_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class dev_t extends StructLayout.IntegerAlias {
      public dev_t() {
         super(TypeAlias.dev_t);
      }

      public dev_t(StructLayout.Offset offset) {
         super(TypeAlias.dev_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class fsblkcnt_t extends StructLayout.IntegerAlias {
      public fsblkcnt_t() {
         super(TypeAlias.fsblkcnt_t);
      }

      public fsblkcnt_t(StructLayout.Offset offset) {
         super(TypeAlias.fsblkcnt_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class fsfilcnt_t extends StructLayout.IntegerAlias {
      public fsfilcnt_t() {
         super(TypeAlias.fsfilcnt_t);
      }

      public fsfilcnt_t(StructLayout.Offset offset) {
         super(TypeAlias.fsfilcnt_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class gid_t extends StructLayout.IntegerAlias {
      public gid_t() {
         super(TypeAlias.gid_t);
      }

      public gid_t(StructLayout.Offset this$0) {
         super(TypeAlias.gid_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class id_t extends StructLayout.IntegerAlias {
      public id_t(StructLayout.Offset this$0) {
         super(TypeAlias.id_t, offset);
      }

      public id_t() {
         super(TypeAlias.id_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class in_addr_t extends StructLayout.IntegerAlias {
      public in_addr_t(StructLayout.Offset offset) {
         super(TypeAlias.in_addr_t, offset);
      }

      public in_addr_t() {
         super(TypeAlias.in_addr_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class in_port_t extends StructLayout.IntegerAlias {
      public in_port_t() {
         super(TypeAlias.in_port_t);
      }

      public in_port_t(StructLayout.Offset offset) {
         super(TypeAlias.in_port_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class ino64_t extends StructLayout.IntegerAlias {
      public ino64_t() {
         super(TypeAlias.ino64_t);
      }

      public ino64_t(StructLayout.Offset this$0) {
         super(TypeAlias.ino64_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class ino_t extends StructLayout.IntegerAlias {
      public ino_t(StructLayout.Offset offset) {
         super(TypeAlias.ino_t, offset);
      }

      public ino_t() {
         super(TypeAlias.ino_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class int16_t extends StructLayout.IntegerAlias {
      public int16_t(StructLayout.Offset offset) {
         super(TypeAlias.int16_t, offset);
      }

      public int16_t() {
         super(TypeAlias.int16_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class int32_t extends StructLayout.IntegerAlias {
      public int32_t() {
         super(TypeAlias.int32_t);
      }

      public int32_t(StructLayout.Offset offset) {
         super(TypeAlias.int32_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class int64_t extends StructLayout.IntegerAlias {
      public int64_t(StructLayout.Offset this$0) {
         super(TypeAlias.int64_t, offset);
      }

      public int64_t() {
         super(TypeAlias.int64_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class int8_t extends StructLayout.IntegerAlias {
      public int8_t() {
         super(TypeAlias.int8_t);
      }

      public int8_t(StructLayout.Offset offset) {
         super(TypeAlias.int8_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class intptr_t extends StructLayout.IntegerAlias {
      public intptr_t() {
         super(TypeAlias.intptr_t);
      }

      public intptr_t(StructLayout.Offset offset) {
         super(TypeAlias.intptr_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class key_t extends StructLayout.IntegerAlias {
      public key_t(StructLayout.Offset this$0) {
         super(TypeAlias.key_t, offset);
      }

      public key_t() {
         super(TypeAlias.key_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class mode_t extends StructLayout.IntegerAlias {
      public mode_t(StructLayout.Offset this$0) {
         super(TypeAlias.mode_t, offset);
      }

      public mode_t() {
         super(TypeAlias.mode_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class nlink_t extends StructLayout.IntegerAlias {
      public nlink_t() {
         super(TypeAlias.nlink_t);
      }

      public nlink_t(StructLayout.Offset this$0) {
         super(TypeAlias.nlink_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class off_t extends StructLayout.IntegerAlias {
      public off_t(StructLayout.Offset this$0) {
         super(TypeAlias.off_t, offset);
      }

      public off_t() {
         super(TypeAlias.off_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class pid_t extends StructLayout.IntegerAlias {
      public pid_t(StructLayout.Offset this$0) {
         super(TypeAlias.pid_t, offset);
      }

      public pid_t() {
         super(TypeAlias.pid_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class rlim_t extends StructLayout.IntegerAlias {
      public rlim_t() {
         super(TypeAlias.rlim_t);
      }

      public rlim_t(StructLayout.Offset offset) {
         super(TypeAlias.rlim_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class sa_family_t extends StructLayout.IntegerAlias {
      public sa_family_t() {
         super(TypeAlias.sa_family_t);
      }

      public sa_family_t(StructLayout.Offset offset) {
         super(TypeAlias.sa_family_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class size_t extends StructLayout.IntegerAlias {
      public size_t() {
         super(TypeAlias.size_t);
      }

      public size_t(StructLayout.Offset offset) {
         super(TypeAlias.size_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class socklen_t extends StructLayout.IntegerAlias {
      public socklen_t() {
         super(TypeAlias.socklen_t);
      }

      public socklen_t(StructLayout.Offset this$0) {
         super(TypeAlias.socklen_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class ssize_t extends StructLayout.IntegerAlias {
      public ssize_t(StructLayout.Offset this$0) {
         super(TypeAlias.ssize_t, offset);
      }

      public ssize_t() {
         super(TypeAlias.ssize_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class swblk_t extends StructLayout.IntegerAlias {
      public swblk_t() {
         super(TypeAlias.swblk_t);
      }

      public swblk_t(StructLayout.Offset this$0) {
         super(TypeAlias.swblk_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class time_t extends StructLayout.IntegerAlias {
      public time_t() {
         super(TypeAlias.time_t);
      }

      public time_t(StructLayout.Offset offset) {
         super(TypeAlias.time_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class u_int16_t extends StructLayout.IntegerAlias {
      public u_int16_t() {
         super(TypeAlias.u_int16_t);
      }

      public u_int16_t(StructLayout.Offset this$0) {
         super(TypeAlias.u_int16_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class u_int32_t extends StructLayout.IntegerAlias {
      public u_int32_t(StructLayout.Offset this$0) {
         super(TypeAlias.u_int32_t, offset);
      }

      public u_int32_t() {
         super(TypeAlias.u_int32_t);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class u_int64_t extends StructLayout.IntegerAlias {
      public u_int64_t() {
         super(TypeAlias.u_int64_t);
      }

      public u_int64_t(StructLayout.Offset offset) {
         super(TypeAlias.u_int64_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class u_int8_t extends StructLayout.IntegerAlias {
      public u_int8_t() {
         super(TypeAlias.u_int8_t);
      }

      public u_int8_t(StructLayout.Offset offset) {
         super(TypeAlias.u_int8_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class uid_t extends StructLayout.IntegerAlias {
      public uid_t() {
         super(TypeAlias.uid_t);
      }

      public uid_t(StructLayout.Offset this$0) {
         super(TypeAlias.uid_t, offset);
      }
   }

   // $VF: Compiled from StructLayout.java
   public final class uintptr_t extends StructLayout.IntegerAlias {
      public uintptr_t(StructLayout.Offset this$0) {
         super(TypeAlias.uintptr_t, offset);
      }

      public uintptr_t() {
         super(TypeAlias.uintptr_t);
      }
   }
}
