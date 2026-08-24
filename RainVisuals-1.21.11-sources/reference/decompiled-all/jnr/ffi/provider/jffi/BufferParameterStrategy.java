package jnr.ffi.provider.jffi;

import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.ObjectParameterType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.EnumSet;

// $VF: Compiled from BufferParameterStrategy.java
public final class BufferParameterStrategy extends ParameterStrategy {
   private static final BufferParameterStrategy[] DIRECT_BUFFER_PARAMETER_STRATEGIES;
   private static final int SHORT_POSITION_SHIFT = 1;
   private static final int BYTE_POSITION_SHIFT = 0;
   private static final int DOUBLE_POSITION_SHIFT = 3;
   private static final int LONG_POSITION_SHIFT = 3;
   private static final BufferParameterStrategy[] HEAP_BUFFER_PARAMETER_STRATEGIES;
   private final int shift;
   private static final int CHAR_POSITION_SHIFT = 1;
   private static final int INT_POSITION_SHIFT = 2;
   private static final int FLOAT_POSITION_SHIFT = 2;
   private static final int BOOLEAN_POSITION_SHIFT = 2;

   public static long address(DoubleBuffer ptr) {
      return address(ptr, 3);
   }

   public static long address(ShortBuffer ptr) {
      return address(ptr, 1);
   }

   public static long address(CharBuffer ptr) {
      return address(ptr, 1);
   }

   public static long address(LongBuffer ptr) {
      return address(ptr, 3);
   }

   private BufferParameterStrategy(ObjectParameterStrategy.StrategyType componentType, ObjectParameterType.ComponentType type) {
      super(type, ObjectParameterType.create(ObjectParameterType.ObjectType.ARRAY, componentType));
      this.shift = calculateShift(componentType);
   }

   public static long address(IntBuffer ptr) {
      return address(ptr, 2);
   }

   public static long address(FloatBuffer ptr) {
      return address(ptr, 2);
   }

   @Override
   public Object object(Object o) {
      return ((Buffer)o).array();
   }

   static BufferParameterStrategy heap(ObjectParameterType.ComponentType componentType) {
      return HEAP_BUFFER_PARAMETER_STRATEGIES[componentType.ordinal()];
   }

   static BufferParameterStrategy direct(ObjectParameterType.ComponentType componentType) {
      return DIRECT_BUFFER_PARAMETER_STRATEGIES[componentType.ordinal()];
   }

   @Override
   public long address(Object o) {
      return address((Buffer)o, this.shift);
   }

   public static long address(ByteBuffer ptr) {
      return address(ptr, 0);
   }

   static int calculateShift(ObjectParameterType.ComponentType componentType) {
      switch (componentType) {
         case BYTE:
            return 0;
         case SHORT:
            return 1;
         case CHAR:
            return 1;
         case INT:
            return 2;
         case BOOLEAN:
            return 2;
         case FLOAT:
            return 2;
         case LONG:
            return 3;
         case DOUBLE:
            return 3;
         default:
            throw new IllegalArgumentException("unsupported component type: " + componentType);
      }
   }

   static {
      EnumSet<ObjectParameterType.ComponentType> componentTypes = EnumSet.allOf(ObjectParameterType.ComponentType.class);
      DIRECT_BUFFER_PARAMETER_STRATEGIES = new BufferParameterStrategy[componentTypes.size()];
      HEAP_BUFFER_PARAMETER_STRATEGIES = new BufferParameterStrategy[componentTypes.size()];

      for (ObjectParameterType.ComponentType componentType : componentTypes) {
         DIRECT_BUFFER_PARAMETER_STRATEGIES[componentType.ordinal()] = new BufferParameterStrategy(DIRECT, componentType);
         HEAP_BUFFER_PARAMETER_STRATEGIES[componentType.ordinal()] = new BufferParameterStrategy(HEAP, componentType);
      }
   }

   @Override
   public int offset(Object o) {
      Buffer buffer = (Buffer)o;
      return buffer.arrayOffset() + buffer.position();
   }

   @Override
   public int length(Object o) {
      return ((Buffer)o).remaining();
   }

   public static long address(Buffer buffer) {
      if (buffer instanceof ByteBuffer) {
         return address(buffer, 0);
      } else if (buffer instanceof ShortBuffer) {
         return address(buffer, 1);
      } else if (buffer instanceof CharBuffer) {
         return address(buffer, 1);
      } else if (buffer instanceof IntBuffer) {
         return address(buffer, 2);
      } else if (buffer instanceof LongBuffer) {
         return address(buffer, 3);
      } else if (buffer instanceof FloatBuffer) {
         return address(buffer, 2);
      } else if (buffer instanceof DoubleBuffer) {
         return address(buffer, 3);
      } else if (buffer == null) {
         return address(buffer, 0);
      } else {
         throw new IllegalArgumentException("unsupported java.nio.Buffer subclass: " + buffer.getClass());
      }
   }

   private static long address(Buffer ptr, int shift) {
      return ptr != null && ptr.isDirect() ? MemoryIO.getInstance().getDirectBufferAddress(ptr) + (ptr.position() << shift) : 0L;
   }
}
