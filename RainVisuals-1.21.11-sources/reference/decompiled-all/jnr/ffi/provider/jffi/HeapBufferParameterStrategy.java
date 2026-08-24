package jnr.ffi.provider.jffi;

import com.kenai.jffi.ObjectParameterType;
import java.nio.Buffer;
import java.util.EnumSet;

// $VF: Compiled from HeapBufferParameterStrategy.java
final class HeapBufferParameterStrategy extends ParameterStrategy {
   private static final HeapBufferParameterStrategy[] heapBufferStrategies;

   static HeapBufferParameterStrategy get(ObjectParameterType.ComponentType componentType) {
      return heapBufferStrategies[componentType.ordinal()];
   }

   @Override
   public int length(Object o) {
      return ((Buffer)o).remaining();
   }

   static {
      EnumSet<ObjectParameterType.ComponentType> componentTypes = EnumSet.allOf(ObjectParameterType.ComponentType.class);
      heapBufferStrategies = new HeapBufferParameterStrategy[componentTypes.size()];

      for (ObjectParameterType.ComponentType componentType : componentTypes) {
         heapBufferStrategies[componentType.ordinal()] = new HeapBufferParameterStrategy(componentType);
      }
   }

   @Override
   public int offset(Object o) {
      Buffer buffer = (Buffer)o;
      return buffer.arrayOffset() + buffer.position();
   }

   @Override
   public long address(Object o) {
      return 0L;
   }

   @Override
   public Object object(Object o) {
      return ((Buffer)o).array();
   }

   public HeapBufferParameterStrategy(ObjectParameterType.ComponentType componentType) {
      super(HEAP, ObjectParameterType.create(ObjectParameterType.ARRAY, componentType));
   }
}
