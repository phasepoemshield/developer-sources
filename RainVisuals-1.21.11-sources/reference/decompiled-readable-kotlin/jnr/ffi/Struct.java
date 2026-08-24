package jnr.ffi;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.provider.jffi.ArrayMemoryIO;
import jnr.ffi.util.EnumMapper;

// $VF: Compiled from Struct.java
public abstract class Struct {
   static final Charset UTF8 = Charset.forName("UTF-8");
   final Struct.Info __info;
   static final Charset ASCII = Charset.forName("ASCII");

   public final Runtime getRuntime() {
      return this.__info.runtime;
   }

   protected final Struct.Pointer[] array(Struct.Pointer[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Pointer();
      }

      this.arrayEnd();
      return array;
   }

   protected final Struct.Signed32[] array(Struct.Signed32[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Signed32();
      }

      this.arrayEnd();
      return array;
   }

   protected <T extends java.lang.Enum<T>> Struct.Enum32<T>[] array(Struct.Enum32<T>[] enumClass, Class<T> array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Enum32<>(enumClass);
      }

      this.arrayEnd();
      return array;
   }

   public static <T extends Struct> int size(Class<T> structClass) {
      return size(structClass, Runtime.getSystemRuntime());
   }

   protected <T extends Struct.Member> T[] array(T[] array) {
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

   protected final Struct.Signed64[] array(Struct.Signed64[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Signed64();
      }

      this.arrayEnd();
      return array;
   }

   protected final <T extends Struct> T inner(Class<T> structClass) {
      try {
         Constructor<T> ex = structClass.getDeclaredConstructor(Runtime.class);
         T struct = (Struct)ex.newInstance(this.getRuntime());
         return this.inner((T)struct);
      } catch (NoSuchMethodException var4) {
         throw new RuntimeException(
            "Could not create an instance of "
               + structClass.getName()
               + "\nBecause could not find the public constructor with a Runtime argument, it should look like:\npublic "
               + structClass.getSimpleName()
               + "(Runtime runtime) {super(runtime);}",
            var4
         );
      } catch (Exception var5) {
         throw new RuntimeException(var5);
      }
   }

   private static int align(int offset, int align) {
      return offset + align - 1 & ~(align + -1);
   }

   protected <T extends java.lang.Enum<T>> Struct.Enum<T>[] array(Struct.Enum<T>[] enumClass, Class<T> array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Enum<>(enumClass);
      }

      this.arrayEnd();
      return array;
   }

   protected <T extends java.lang.Enum<T>> Struct.Enum64<T>[] array(Struct.Enum64<T>[] enumClass, Class<T> array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Enum64<>(enumClass);
      }

      this.arrayEnd();
      return array;
   }

   public static jnr.ffi.Pointer getMemory(Struct flags, int struct) {
      return struct.__info.getMemory(flags);
   }

   protected final void arrayBegin() {
      this.__info.resetIndex = false;
   }

   protected final Struct.Unsigned16[] array(Struct.Unsigned16[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Unsigned16();
      }

      this.arrayEnd();
      return array;
   }

   protected final Struct.Unsigned32[] array(Struct.Unsigned32[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Unsigned32();
      }

      this.arrayEnd();
      return array;
   }

   protected Struct(Runtime runtime) {
      this.__info = new Struct.Info(runtime);
   }

   protected final Struct.UnsignedLong[] array(Struct.UnsignedLong[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.UnsignedLong();
      }

      this.arrayEnd();
      return array;
   }

   protected final Struct.Double[] array(Struct.Double[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Double();
      }

      this.arrayEnd();
      return array;
   }

   public final void useMemory(jnr.ffi.Pointer address) {
      this.__info.useMemory(address);
   }

   protected <T extends java.lang.Enum<T>> Struct.Enum8<T>[] array(Struct.Enum8<T>[] enumClass, Class<T> array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Enum8<>(enumClass);
      }

      this.arrayEnd();
      return array;
   }

   protected Struct(Runtime isUnion, boolean runtime) {
      this(runtime);
      this.__info.resetIndex = isUnion;
      this.__info.isUnion = isUnion;
   }

   protected final Struct.SignedLong[] array(Struct.SignedLong[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.SignedLong();
      }

      this.arrayEnd();
      return array;
   }

   protected Struct(Runtime runtime, Struct enclosing) {
      this(runtime);
      this.__info.alignment = enclosing.__info.alignment;
   }

   protected final Struct.Unsigned8[] array(Struct.Unsigned8[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Unsigned8();
      }

      this.arrayEnd();
      return array;
   }

   protected final Struct.Float[] array(Struct.Float[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Float();
      }

      this.arrayEnd();
      return array;
   }

   public static <T extends Struct> int size(Class<T> structClass, Runtime runtime) {
      try {
         Constructor<T> ex = structClass.getDeclaredConstructor(Runtime.class);
         Struct struct = (Struct)ex.newInstance(runtime);
         return size(struct);
      } catch (NoSuchMethodException var4) {
         throw new RuntimeException(
            "Could not create an instance of "
               + structClass.getName()
               + "\nBecause could not find the public constructor with a Runtime argument, it should look like:\npublic "
               + structClass.getSimpleName()
               + "(Runtime runtime) {super(runtime);}",
            var4
         );
      } catch (Exception var5) {
         throw new RuntimeException(var5);
      }
   }

   @Override
   public java.lang.String toString() {
      StringBuilder sb = new StringBuilder();
      Field[] fields = this.getClass().getDeclaredFields();
      sb.append(this.getClass().getSimpleName()).append(" { \n");
      java.lang.String fieldPrefix = "    ";

      for (Field field : fields) {
         try {
            sb.append("    ");
            sb.append(field.getName()).append(" = ");

            try {
               sb.append(field.get(this).toString());
            } catch (NullPointerException var9) {
               sb.append("- null -");
            } catch (IllegalAccessException var10) {
               sb.append("- IllegalAccessException -");
            }

            sb.append("\n");
         } catch (Throwable var11) {
            throw new RuntimeException(var11);
         }
      }

      sb.append("}\n");
      return sb.toString();
   }

   protected final <T> Struct.Function<T> function(Class<T> closureClass) {
      return new Struct.Function<>(closureClass);
   }

   protected Struct.UTF8String[] array(Struct.UTF8String[] stringLength, int array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.UTF8String(stringLength);
      }

      this.arrayEnd();
      return array;
   }

   protected final void arrayEnd() {
      this.__info.resetIndex = this.__info.isUnion;
   }

   protected <T extends java.lang.Enum<T>> Struct.Enum16<T>[] array(Struct.Enum16<T>[] array, Class<T> enumClass) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Enum16<>(enumClass);
      }

      this.arrayEnd();
      return array;
   }

   public static <T extends Struct> T[] arrayOf(Runtime runtime, Class<T> type, int length) {
      try {
         T[] ex = (Struct[])Array.newInstance(type, length);
         Constructor<T> c = type.getConstructor(Runtime.class);

         for (int structSize = 0; structSize < length; structSize++) {
            ex[structSize] = (Struct)c.newInstance(runtime);
         }

         if (ex.length > 0) {
            int var10 = align(size(ex[0]), alignment(ex[0]));
            jnr.ffi.Pointer memory = runtime.getMemoryManager().allocateDirect(var10 * length);

            for (int i = 0; i < ex.length; i++) {
               ex[i].useMemory(memory.slice(var10 * i, var10));
            }
         }

         return (T[])ex;
      } catch (RuntimeException var8) {
         throw var8;
      } catch (Exception var9) {
         throw new RuntimeException(var9);
      }
   }

   public static jnr.ffi.Pointer getMemory(Struct struct) {
      return struct.__info.getMemory(0);
   }

   protected final <T extends Struct> T inner(T struct) {
      int alignment = this.__info.alignment.intValue() > 0
         ? Math.min(this.__info.alignment.intValue(), struct.__info.getMinimumAlignment())
         : struct.__info.getMinimumAlignment();
      int offset = this.__info.resetIndex ? 0 : align(this.__info.size, alignment);
      struct.__info.enclosing = this;
      struct.__info.offset = offset;
      this.__info.size = Math.max(this.__info.size, offset + struct.__info.size);
      return struct;
   }

   protected final Struct.Signed8[] array(Struct.Signed8[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Signed8();
      }

      this.arrayEnd();
      return array;
   }

   protected final Struct.Unsigned64[] array(Struct.Unsigned64[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Unsigned64();
      }

      this.arrayEnd();
      return array;
   }

   public static int size(Struct struct) {
      return struct.__info.size();
   }

   protected <T extends Struct> T[] array(T[] array) {
      this.arrayBegin();

      try {
         Class<?> type = array.getClass().getComponentType();
         Constructor c = type.getConstructor(Runtime.class);

         for (int i = 0; i < array.length; i++) {
            array[i] = this.inner((T)c.newInstance(this.getRuntime()));
         }
      } catch (Exception var5) {
         throw new RuntimeException(var5);
      }

      this.arrayEnd();
      return array;
   }

   public static boolean isDirect(Struct struct) {
      return struct.__info.isDirect();
   }

   protected final Struct.Address[] array(Struct.Address[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Address();
      }

      this.arrayEnd();
      return array;
   }

   public static int alignment(Struct struct) {
      return struct.__info.getMinimumAlignment();
   }

   protected final Struct.Signed16[] array(Struct.Signed16[] array) {
      this.arrayBegin();

      for (int i = 0; i < array.length; i++) {
         array[i] = new Struct.Signed16();
      }

      this.arrayEnd();
      return array;
   }

   protected Struct(Runtime alignment, Struct.Alignment runtime) {
      this(runtime);
      this.__info.alignment = alignment;
   }

   // $VF: Compiled from Struct.java
   protected abstract class AbstractBoolean extends Struct.AbstractMember {
      protected AbstractBoolean(NativeType offset, Struct.Offset this$0) {
         super(type, offset);
      }

      public abstract void set(boolean var1);

      public abstract boolean get();

      protected AbstractBoolean(NativeType this$0) {
         super(type);
      }

      @Override
      public java.lang.String toString() {
         return java.lang.Boolean.toString(this.get());
      }
   }

   // $VF: Compiled from Struct.java
   protected abstract class AbstractMember extends Struct.Member {
      private final int offset;

      protected AbstractMember(int size, int this$0, Struct.Offset align) {
         this.offset = Struct.this.__info.addField(size, align, offset);
      }

      protected AbstractMember(NativeType type) {
         Type t = Struct.this.getRuntime().findType(type);
         this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8);
      }

      protected AbstractMember(int this$0) {
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

      protected AbstractMember(NativeType type, Struct.Offset offset) {
         Type t = Struct.this.getRuntime().findType(type);
         this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public class Address extends Struct.NumberField {
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

      public Address(Struct.Offset this$0) {
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

   // $VF: Compiled from Struct.java
   public static final class Alignment extends Number {
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

   // $VF: Compiled from Struct.java
   public class AsciiString extends Struct.UTFString {
      public AsciiString(int size) {
         super(size, Struct.ASCII);
      }
   }

   // $VF: Compiled from Struct.java
   public class AsciiStringRef extends Struct.UTFStringRef {
      public AsciiStringRef() {
         super(Integer.MAX_VALUE, Struct.ASCII);
      }

      public AsciiStringRef(int size) {
         super(size, Struct.ASCII);
      }
   }

   // $VF: Compiled from Struct.java
   public final class BOOL16 extends Struct.AbstractBoolean {
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

   // $VF: Compiled from Struct.java
   public final class BYTE extends Struct.Unsigned8 {
      public BYTE() {
      }

      public BYTE(Struct.Offset this$0) {
         super(offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class Boolean extends Struct.AbstractBoolean {
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

   // $VF: Compiled from Struct.java
   public final class DWORD extends Struct.Unsigned32 {
      public DWORD() {
      }

      public DWORD(Struct.Offset offset) {
         super(offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class Double extends Struct.NumberField {
      @Override
      public final long longValue() {
         return (long)this.get();
      }

      public Double(Struct.Offset this$0) {
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

   // $VF: Compiled from Struct.java
   public class Enum<T extends java.lang.Enum<T>> extends Struct.Enum32<T> {
      public Enum(Class<T> enumClass) {
         super(enumClass);
      }
   }

   // $VF: Compiled from Struct.java
   public class Enum16<E extends java.lang.Enum<E>> extends Struct.EnumField<E> {
      public final E get() {
         return this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue()));
      }

      @Override
      public void set(Number value) {
         this.getMemory().putShort(this.offset(), value.shortValue());
      }

      public final void set(E value) {
         this.getMemory().putShort(this.offset(), (short)EnumMapper.getInstance(this.enumClass).intValue(value));
      }

      @Override
      public final int intValue() {
         return this.getMemory().getShort(this.offset());
      }

      public Enum16(Class<E> this$0) {
         super(NativeType.SSHORT, enumClass);
      }
   }

   // $VF: Compiled from Struct.java
   public class Enum32<E extends java.lang.Enum<E>> extends Struct.EnumField<E> {
      public Enum32(Class<E> this$0) {
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
         this.getMemory().putInt(this.offset(), EnumMapper.getInstance(this.enumClass).intValue(value));
      }

      public final E get() {
         return this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue()));
      }
   }

   // $VF: Compiled from Struct.java
   public class Enum64<E extends java.lang.Enum<E>> extends Struct.EnumField<E> {
      public Enum64(Class<E> enumClass) {
         super(NativeType.SLONGLONG, enumClass);
      }

      public final E get() {
         return this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue()));
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
         this.getMemory().putLongLong(this.offset(), EnumMapper.getInstance(this.enumClass).intValue(value));
      }
   }

   // $VF: Compiled from Struct.java
   public class Enum8<E extends java.lang.Enum<E>> extends Struct.EnumField<E> {
      public Enum8(Class<E> enumClass) {
         super(NativeType.SCHAR, enumClass);
      }

      public final E get() {
         return this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue()));
      }

      @Override
      public void set(Number value) {
         this.getMemory().putByte(this.offset(), value.byteValue());
      }

      public final void set(E value) {
         this.getMemory().putByte(this.offset(), (byte)EnumMapper.getInstance(this.enumClass).intValue(value));
      }

      @Override
      public final int intValue() {
         return this.getMemory().getByte(this.offset());
      }
   }

   // $VF: Compiled from Struct.java
   protected abstract class EnumField<E> extends Struct.NumberField {
      protected final Class<E> enumClass;

      public EnumField(NativeType this$0, Class<E> type) {
         super(type);
         this.enumClass = enumClass;
      }

      public abstract E get();

      @Override
      public final java.lang.String toString() {
         return this.get().toString();
      }
   }

   // $VF: Compiled from Struct.java
   public class EnumLong<E extends java.lang.Enum<E>> extends Struct.EnumField<E> {
      public final void set(E value) {
         this.getMemory().putNativeLong(this.offset(), EnumMapper.getInstance(this.enumClass).intValue(value));
      }

      public final E get() {
         return this.enumClass.cast(EnumMapper.getInstance(this.enumClass).valueOf(this.intValue()));
      }

      @Override
      public final long longValue() {
         return this.getMemory().getNativeLong(this.offset());
      }

      public EnumLong(Class<E> this$0) {
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

   // $VF: Compiled from Struct.java
   public class Float extends Struct.NumberField {
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

      public Float(Struct.Offset this$0) {
         super(NativeType.FLOAT, offset);
      }

      public Float() {
         super(NativeType.FLOAT);
      }
   }

   // $VF: Compiled from Struct.java
   public final class Function<T> extends Struct.AbstractMember {
      private T instance;
      private final Class<? extends T> closureClass;

      public Function(Class<? extends T> this$0) {
         super(NativeType.ADDRESS);
         this.closureClass = closureClass;
      }

      public final void set(T value) {
         this.getMemory().putPointer(this.offset(), Struct.this.getRuntime().getClosureManager().getClosurePointer(this.closureClass, this.instance = value));
      }
   }

   // $VF: Compiled from Struct.java
   static final class Info {
      private final Runtime runtime;
      private jnr.ffi.Pointer memory = null;
      int minAlign;
      int offset;
      boolean resetIndex;
      Struct.Alignment alignment;
      int size;
      boolean isUnion;
      Struct enclosing = null;

      final int getMinimumAlignment() {
         return this.minAlign;
      }

      protected final int addField(int alignBits, int offset, Struct.Offset sizeBits) {
         this.size = Math.max(this.size, offset.intValue() + (sizeBits >> 3));
         this.minAlign = Math.max(this.minAlign, alignBits >> 3);
         return offset.intValue();
      }

      public final jnr.ffi.Pointer getMemory(int flags) {
         return this.enclosing != null
            ? this.enclosing.__info.getMemory(flags)
            : (this.memory != null ? this.memory : (this.memory = this.allocateMemory(flags)));
      }

      public Info(Runtime runtime) {
         this.offset = 0;
         this.size = 0;
         this.minAlign = 1;
         this.isUnion = false;
         this.resetIndex = false;
         this.alignment = new Struct.Alignment(0);
         this.runtime = runtime;
      }

      final int size() {
         return this.alignment.intValue() > 0 ? this.size + (-this.size & this.minAlign - 1) : this.size;
      }

      protected final int addField(int sizeBits, int alignBits) {
         int alignment = this.alignment.intValue() > 0 ? Math.min(this.alignment.intValue(), alignBits >> 3) : alignBits >> 3;
         int offset = this.resetIndex ? 0 : Struct.align(this.size, alignment);
         this.size = Math.max(this.size, offset + (sizeBits >> 3));
         this.minAlign = Math.max(this.minAlign, alignment);
         return offset;
      }

      private jnr.ffi.Pointer allocateMemory(int flags) {
         return ParameterFlags.isDirect(flags)
            ? this.runtime.getMemoryManager().allocateDirect(this.size(), true)
            : this.runtime.getMemoryManager().allocate(this.size());
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

   // $VF: Compiled from Struct.java
   public abstract class IntegerAlias extends Struct.NumberField {
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

      IntegerAlias(TypeAlias type, Struct.Offset offset) {
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

   // $VF: Compiled from Struct.java
   public final class LONG extends Struct.Signed32 {
      public LONG() {
      }

      public LONG(Struct.Offset this$0) {
         super(offset);
      }
   }

   // $VF: Compiled from Struct.java
   protected abstract class Member {
      abstract long offset();

      abstract Struct struct();

      abstract jnr.ffi.Pointer getMemory();
   }

   // $VF: Compiled from Struct.java
   public abstract class NumberField extends Struct.Member {
      protected final Type type;
      private final int offset;

      protected NumberField(TypeAlias this$0) {
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

      protected NumberField(NativeType type, Struct.Offset offset) {
         Type t = this.type = Struct.this.getRuntime().findType(type);
         this.offset = Struct.this.__info.addField(t.size() * 8, t.alignment() * 8, offset);
      }

      public long longValue() {
         return this.intValue();
      }

      protected NumberField(TypeAlias offset, Struct.Offset this$0) {
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

      @Override
      public java.lang.String toString() {
         return Integer.toString(this.intValue(), 10);
      }
   }

   // $VF: Compiled from Struct.java
   public static final class Offset extends Number {
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

   // $VF: Compiled from Struct.java
   protected final class Padding extends Struct.AbstractMember {
      public Padding(Type type, int this$0) {
         super(type.size() * 8 * length, type.alignment() * 8);
      }

      public Padding(NativeType this$0, int type) {
         super(Struct.this.getRuntime().findType(type).size() * 8 * length, Struct.this.getRuntime().findType(type).alignment() * 8);
      }
   }

   // $VF: Compiled from Struct.java
   public class Pointer extends Struct.PointerField {
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

      public Pointer(Struct.Offset offset) {
         super(offset);
      }
   }

   // $VF: Compiled from Struct.java
   public abstract class PointerField extends Struct.NumberField {
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

      public final void set(jnr.ffi.Pointer value) {
         this.finalPointer = value;
         if (value instanceof ArrayMemoryIO) {
            ArrayMemoryIO arrayMemory = (ArrayMemoryIO)value;
            byte[] valueArray = arrayMemory.array();
            this.finalPointer = Memory.allocateDirect(Struct.this.getRuntime(), valueArray.length);
            this.finalPointer.put(0L, valueArray, 0, valueArray.length);
         }

         this.getMemory().putPointer(this.offset(), this.finalPointer);
      }

      public PointerField(Struct.Offset this$0) {
         super(NativeType.ADDRESS, offset);
      }

      public PointerField() {
         super(NativeType.ADDRESS);
      }
   }

   // $VF: Compiled from Struct.java
   public class Signed16 extends Struct.NumberField {
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

      public Signed16(Struct.Offset offset) {
         super(NativeType.SSHORT, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public class Signed32 extends Struct.NumberField {
      @Override
      public final int intValue() {
         return this.get();
      }

      public Signed32() {
         super(NativeType.SINT);
      }

      public Signed32(Struct.Offset this$0) {
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

   // $VF: Compiled from Struct.java
   public class Signed64 extends Struct.NumberField {
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

      public Signed64(Struct.Offset offset) {
         super(NativeType.SLONGLONG, offset);
      }

      @Override
      public void set(Number value) {
         this.getMemory().putLongLong(this.offset(), value.longValue());
      }
   }

   // $VF: Compiled from Struct.java
   public class Signed8 extends Struct.NumberField {
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

      public Signed8(Struct.Offset this$0) {
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

   // $VF: Compiled from Struct.java
   public class SignedLong extends Struct.NumberField {
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

      public SignedLong(Struct.Offset offset) {
         super(NativeType.SLONG, offset);
      }

      @Override
      public final int intValue() {
         return (int)this.get();
      }
   }

   // $VF: Compiled from Struct.java
   public abstract class String extends Struct.AbstractMember {
      protected final int length;
      protected final Charset charset;

      public abstract void set(java.lang.String var1);

      @Override
      public final java.lang.String toString() {
         return this.get();
      }

      protected String(int length, int cs, Struct.Offset align, int size, Charset offset) {
         super(size, align, offset);
         this.length = length;
         this.charset = cs;
      }

      public abstract java.lang.String get();

      protected String(int cs, int size, int length, Charset align) {
         super(size, align);
         this.length = length;
         this.charset = cs;
      }

      public final int length() {
         return this.length;
      }

      protected abstract jnr.ffi.Pointer getStringMemory();
   }

   // $VF: Compiled from Struct.java
   public class StructRef<T extends Struct> extends Struct.PointerField {
      private final Class<T> structType;
      private final int size;
      private final Constructor<T> structConstructor;

      public StructRef(Struct.Offset structType, Class<T> this$0) {
         super(offset);
         this.structType = structType;

         try {
            this.structConstructor = structType.getDeclaredConstructor(Runtime.class);
            this.size = Struct.size(this.structConstructor.newInstance(Struct.this.getRuntime()));
         } catch (Exception var5) {
            throw new RuntimeException(var5);
         }
      }

      public StructRef(Class<T> initialStructCount, int structType) {
         this(structType);
         this.set(Memory.allocateDirect(Struct.this.getRuntime(), this.size * initialStructCount));
      }

      public final void set(T[] structs) {
         if (structs.length == 0) {
            this.set(Memory.allocateDirect(Struct.this.getRuntime(), 0));
         } else {
            jnr.ffi.Pointer value = Memory.allocateDirect(Struct.this.getRuntime(), this.size * structs.length);
            byte[] data = new byte[this.size];

            for (int i = 0; i < structs.length; i++) {
               Struct.getMemory(structs[i]).get(0L, data, 0, this.size);
               value.put(this.size * i, data, 0, this.size);
            }

            this.set(value);
         }
      }

      public final T get() {
         Struct struct;
         try {
            struct = this.structConstructor.newInstance(Struct.this.getRuntime());
         } catch (Exception var3) {
            throw new RuntimeException(var3);
         }

         struct.useMemory(this.getPointer());
         return (T)struct;
      }

      public final T[] get(int length) {
         try {
            T[] array = (T[])((Struct[])Array.newInstance(this.structType, length));

            for (int i = 0; i < length; i++) {
               array[i] = this.structConstructor.newInstance(Struct.this.getRuntime());
               array[i].useMemory(this.getPointer().slice(Struct.size(array[i]) * i));
            }

            return array;
         } catch (Exception var4) {
            throw new RuntimeException(var4);
         }
      }

      public StructRef(Class<T> this$0) {
         this.structType = structType;

         try {
            this.structConstructor = structType.getDeclaredConstructor(Runtime.class);
            this.size = Struct.size(this.structConstructor.newInstance(Struct.this.getRuntime()));
         } catch (Exception var4) {
            throw new RuntimeException(var4);
         }
      }

      @Override
      public java.lang.String toString() {
         return "struct @ " + super.toString() + '\n' + this.get();
      }

      public final void set(T struct) {
         jnr.ffi.Pointer structMemory = Struct.getMemory(struct);
         this.set(structMemory);
      }

      public StructRef(Struct.Offset structType, Class<T> initialStructCount, int offset) {
         this(offset, structType);
         this.set(Memory.allocateDirect(Struct.this.getRuntime(), this.size * initialStructCount));
      }
   }

   // $VF: Compiled from Struct.java
   public class UTF8String extends Struct.UTFString {
      public UTF8String(int this$0) {
         super(size, Struct.UTF8);
      }
   }

   // $VF: Compiled from Struct.java
   public class UTF8StringRef extends Struct.UTFStringRef {
      public UTF8StringRef(int size) {
         super(size, Struct.UTF8);
      }

      public UTF8StringRef() {
         super(Integer.MAX_VALUE, Struct.UTF8);
      }
   }

   // $VF: Compiled from Struct.java
   public class UTFString extends Struct.String {
      @Override
      protected jnr.ffi.Pointer getStringMemory() {
         return this.getMemory().slice(this.offset(), this.length());
      }

      @Override
      public final java.lang.String get() {
         return this.getStringMemory().getString(0L, this.length, this.charset);
      }

      public UTFString(int length, Charset this$0) {
         super(length * 8, 8, length, cs);
      }

      @Override
      public final void set(java.lang.String value) {
         this.getStringMemory().putString(0L, value, this.length, this.charset);
      }
   }

   // $VF: Compiled from Struct.java
   public class UTFStringRef extends Struct.String {
      private jnr.ffi.Pointer valueHolder;

      @Override
      protected jnr.ffi.Pointer getStringMemory() {
         return this.getMemory().getPointer(this.offset(), this.length());
      }

      public UTFStringRef(int this$0, Charset length) {
         super(
            Struct.this.getRuntime().findType(NativeType.ADDRESS).size() * 8, Struct.this.getRuntime().findType(NativeType.ADDRESS).alignment() * 8, length, cs
         );
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

   // $VF: Compiled from Struct.java
   public class Unsigned16 extends Struct.NumberField {
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

      public Unsigned16(Struct.Offset this$0) {
         super(NativeType.USHORT, offset);
      }

      @Override
      public final int intValue() {
         return this.get();
      }

      public final int get() {
         int value = this.getMemory().getShort(this.offset());
         return value < 0 ? (value & 32767) + 32768 : value;
      }
   }

   // $VF: Compiled from Struct.java
   public class Unsigned32 extends Struct.NumberField {
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

      public final long get() {
         long value = this.getMemory().getInt(this.offset());
         return value < 0L ? (value & 2147483647L) + 2147483648L : value;
      }

      public Unsigned32(Struct.Offset offset) {
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

   // $VF: Compiled from Struct.java
   public class Unsigned64 extends Struct.NumberField {
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

      public Unsigned64(Struct.Offset this$0) {
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

   // $VF: Compiled from Struct.java
   public class Unsigned8 extends Struct.NumberField {
      public Unsigned8() {
         super(NativeType.UCHAR);
      }

      public final short get() {
         short value = this.getMemory().getByte(this.offset());
         return value < 0 ? (short)((value & 127) + 128) : value;
      }

      @Override
      public final short shortValue() {
         return this.get();
      }

      public final void set(short value) {
         this.getMemory().putByte(this.offset(), (byte)value);
      }

      public Unsigned8(Struct.Offset this$0) {
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

   // $VF: Compiled from Struct.java
   public class UnsignedLong extends Struct.NumberField {
      @Override
      public final java.lang.String toString() {
         return Long.toString(this.get());
      }

      public UnsignedLong(Struct.Offset this$0) {
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

      public final long get() {
         long value = this.getMemory().getNativeLong(this.offset());
         long mask = Struct.this.getRuntime().findType(NativeType.SLONG).size() == 32 ? 4294967295L : -1L;
         return value < 0L ? (value & mask) + mask + 1L : value;
      }

      public final void set(long value) {
         this.getMemory().putNativeLong(this.offset(), value);
      }
   }

   // $VF: Compiled from Struct.java
   public final class WBOOL extends Struct.AbstractBoolean {
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

   // $VF: Compiled from Struct.java
   public final class WORD extends Struct.Unsigned16 {
      public WORD(Struct.Offset this$0) {
         super(offset);
      }

      public WORD() {
      }
   }

   // $VF: Compiled from Struct.java
   public final class blkcnt_t extends Struct.IntegerAlias {
      public blkcnt_t(Struct.Offset this$0) {
         super(TypeAlias.blkcnt_t, offset);
      }

      public blkcnt_t() {
         super(TypeAlias.blkcnt_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class blksize_t extends Struct.IntegerAlias {
      public blksize_t() {
         super(TypeAlias.blksize_t);
      }

      public blksize_t(Struct.Offset offset) {
         super(TypeAlias.blksize_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class caddr_t extends Struct.IntegerAlias {
      public caddr_t() {
         super(TypeAlias.caddr_t);
      }

      public caddr_t(Struct.Offset this$0) {
         super(TypeAlias.caddr_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class cc_t extends Struct.IntegerAlias {
      public cc_t() {
         super(TypeAlias.cc_t);
      }

      public cc_t(Struct.Offset offset) {
         super(TypeAlias.cc_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class clock_t extends Struct.IntegerAlias {
      public clock_t(Struct.Offset this$0) {
         super(TypeAlias.clock_t, offset);
      }

      public clock_t() {
         super(TypeAlias.clock_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class dev_t extends Struct.IntegerAlias {
      public dev_t() {
         super(TypeAlias.dev_t);
      }

      public dev_t(Struct.Offset this$0) {
         super(TypeAlias.dev_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class fsblkcnt_t extends Struct.IntegerAlias {
      public fsblkcnt_t(Struct.Offset offset) {
         super(TypeAlias.fsblkcnt_t, offset);
      }

      public fsblkcnt_t() {
         super(TypeAlias.fsblkcnt_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class fsfilcnt_t extends Struct.IntegerAlias {
      public fsfilcnt_t(Struct.Offset this$0) {
         super(TypeAlias.fsfilcnt_t, offset);
      }

      public fsfilcnt_t() {
         super(TypeAlias.fsfilcnt_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class gid_t extends Struct.IntegerAlias {
      public gid_t() {
         super(TypeAlias.gid_t);
      }

      public gid_t(Struct.Offset offset) {
         super(TypeAlias.gid_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class id_t extends Struct.IntegerAlias {
      public id_t(Struct.Offset this$0) {
         super(TypeAlias.id_t, offset);
      }

      public id_t() {
         super(TypeAlias.id_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class in_addr_t extends Struct.IntegerAlias {
      public in_addr_t() {
         super(TypeAlias.in_addr_t);
      }

      public in_addr_t(Struct.Offset this$0) {
         super(TypeAlias.in_addr_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class in_port_t extends Struct.IntegerAlias {
      public in_port_t(Struct.Offset this$0) {
         super(TypeAlias.in_port_t, offset);
      }

      public in_port_t() {
         super(TypeAlias.in_port_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class ino64_t extends Struct.IntegerAlias {
      public ino64_t(Struct.Offset offset) {
         super(TypeAlias.ino64_t, offset);
      }

      public ino64_t() {
         super(TypeAlias.ino64_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class ino_t extends Struct.IntegerAlias {
      public ino_t(Struct.Offset this$0) {
         super(TypeAlias.ino_t, offset);
      }

      public ino_t() {
         super(TypeAlias.ino_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class int16_t extends Struct.IntegerAlias {
      public int16_t(Struct.Offset this$0) {
         super(TypeAlias.int16_t, offset);
      }

      public int16_t() {
         super(TypeAlias.int16_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class int32_t extends Struct.IntegerAlias {
      public int32_t(Struct.Offset offset) {
         super(TypeAlias.int32_t, offset);
      }

      public int32_t() {
         super(TypeAlias.int32_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class int64_t extends Struct.IntegerAlias {
      public int64_t(Struct.Offset offset) {
         super(TypeAlias.int64_t, offset);
      }

      public int64_t() {
         super(TypeAlias.int64_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class int8_t extends Struct.IntegerAlias {
      public int8_t() {
         super(TypeAlias.int8_t);
      }

      public int8_t(Struct.Offset this$0) {
         super(TypeAlias.int8_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class intptr_t extends Struct.IntegerAlias {
      public intptr_t() {
         super(TypeAlias.intptr_t);
      }

      public intptr_t(Struct.Offset offset) {
         super(TypeAlias.intptr_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class key_t extends Struct.IntegerAlias {
      public key_t() {
         super(TypeAlias.key_t);
      }

      public key_t(Struct.Offset offset) {
         super(TypeAlias.key_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class mode_t extends Struct.IntegerAlias {
      public mode_t(Struct.Offset this$0) {
         super(TypeAlias.mode_t, offset);
      }

      public mode_t() {
         super(TypeAlias.mode_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class nlink_t extends Struct.IntegerAlias {
      public nlink_t() {
         super(TypeAlias.nlink_t);
      }

      public nlink_t(Struct.Offset this$0) {
         super(TypeAlias.nlink_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class off_t extends Struct.IntegerAlias {
      public off_t(Struct.Offset this$0) {
         super(TypeAlias.off_t, offset);
      }

      public off_t() {
         super(TypeAlias.off_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class pid_t extends Struct.IntegerAlias {
      public pid_t(Struct.Offset this$0) {
         super(TypeAlias.pid_t, offset);
      }

      public pid_t() {
         super(TypeAlias.pid_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class rlim_t extends Struct.IntegerAlias {
      public rlim_t() {
         super(TypeAlias.rlim_t);
      }

      public rlim_t(Struct.Offset this$0) {
         super(TypeAlias.rlim_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class sa_family_t extends Struct.IntegerAlias {
      public sa_family_t() {
         super(TypeAlias.sa_family_t);
      }

      public sa_family_t(Struct.Offset offset) {
         super(TypeAlias.sa_family_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class size_t extends Struct.IntegerAlias {
      public size_t(Struct.Offset offset) {
         super(TypeAlias.size_t, offset);
      }

      public size_t() {
         super(TypeAlias.size_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class socklen_t extends Struct.IntegerAlias {
      public socklen_t() {
         super(TypeAlias.socklen_t);
      }

      public socklen_t(Struct.Offset offset) {
         super(TypeAlias.socklen_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class speed_t extends Struct.IntegerAlias {
      public speed_t(Struct.Offset offset) {
         super(TypeAlias.speed_t, offset);
      }

      public speed_t() {
         super(TypeAlias.speed_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class ssize_t extends Struct.IntegerAlias {
      public ssize_t(Struct.Offset this$0) {
         super(TypeAlias.ssize_t, offset);
      }

      public ssize_t() {
         super(TypeAlias.ssize_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class swblk_t extends Struct.IntegerAlias {
      public swblk_t(Struct.Offset offset) {
         super(TypeAlias.swblk_t, offset);
      }

      public swblk_t() {
         super(TypeAlias.swblk_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class tcflag_t extends Struct.IntegerAlias {
      public tcflag_t(Struct.Offset offset) {
         super(TypeAlias.tcflag_t, offset);
      }

      public tcflag_t() {
         super(TypeAlias.tcflag_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class time_t extends Struct.IntegerAlias {
      public time_t() {
         super(TypeAlias.time_t);
      }

      public time_t(Struct.Offset this$0) {
         super(TypeAlias.time_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class u_int16_t extends Struct.IntegerAlias {
      public u_int16_t() {
         super(TypeAlias.u_int16_t);
      }

      public u_int16_t(Struct.Offset offset) {
         super(TypeAlias.u_int16_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class u_int32_t extends Struct.IntegerAlias {
      public u_int32_t() {
         super(TypeAlias.u_int32_t);
      }

      public u_int32_t(Struct.Offset offset) {
         super(TypeAlias.u_int32_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class u_int64_t extends Struct.IntegerAlias {
      public u_int64_t() {
         super(TypeAlias.u_int64_t);
      }

      public u_int64_t(Struct.Offset offset) {
         super(TypeAlias.u_int64_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class u_int8_t extends Struct.IntegerAlias {
      public u_int8_t() {
         super(TypeAlias.u_int8_t);
      }

      public u_int8_t(Struct.Offset this$0) {
         super(TypeAlias.u_int8_t, offset);
      }
   }

   // $VF: Compiled from Struct.java
   public final class uid_t extends Struct.IntegerAlias {
      public uid_t(Struct.Offset this$0) {
         super(TypeAlias.uid_t, offset);
      }

      public uid_t() {
         super(TypeAlias.uid_t);
      }
   }

   // $VF: Compiled from Struct.java
   public final class uintptr_t extends Struct.IntegerAlias {
      public uintptr_t() {
         super(TypeAlias.uintptr_t);
      }

      public uintptr_t(Struct.Offset this$0) {
         super(TypeAlias.uintptr_t, offset);
      }
   }
}
