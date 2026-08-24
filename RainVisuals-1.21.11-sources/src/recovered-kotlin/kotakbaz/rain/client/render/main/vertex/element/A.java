package kotakbaz.rain.client.render.main.vertex.element;

import java.util.function.BiConsumer;
import org.lwjgl.system.MemoryUtil;

// $VF: Compiled from heavy
public record A<T>(int byteSize, String typeName, int glId, Class<T> clazz, BiConsumer<Long, T[]> uploadConsumer) {
   public static final A<Byte> BYTE = new A<>(1, "Byte", 5120, Byte.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutByte(pointer + i, data[i]);
      }
   });
   public static final A<Integer> INT = new A<>(4, "Int", 5124, Integer.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutInt(pointer + 4L * i, data[i]);
      }
   });
   public static final A<Integer> UNSIGNED_INT = new A<>(4, "Unsigned Int", 5125, Integer.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutInt(pointer + 4L * i, data[i]);
      }
   });
   public static final A<Byte> UNSIGNED_BYTE = new A<>(1, "Unsigned Byte", 5121, Byte.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutByte(pointer + i, data[i]);
      }
   });
   public static final A<Short> SHORT = new A<>(2, "Short", 5123, Short.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutShort(pointer + 2L * i, data[i]);
      }
   });
   public static final A<Short> UNSIGNED_SHORT = new A<>(2, "Unsigned Short", 5122, Short.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutShort(pointer + 2L * i, data[i]);
      }
   });
   public static final A<Float> FLOAT = new A<>(4, "Float", 5126, Float.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutFloat(pointer + 4L * i, data[i]);
      }
   });
}
