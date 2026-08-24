package oxxxde;

import java.util.function.BiConsumer;
import org.lwjgl.system.MemoryUtil;

// $VF: Compiled from heavy
public record حا<T>(int byteSize, String typeName, int glId, Class<T> clazz, BiConsumer<Long, T[]> uploadConsumer) {
   public static final حا<Byte> BYTE = new حا<>(1, "Byte", 5120, Byte.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutByte(pointer + i, data[i]);
      }
   });
   public static final حا<Integer> INT = new حا<>(4, "Int", 5124, Integer.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutInt(pointer + 4L * i, data[i]);
      }
   });
   public static final حا<Integer> UNSIGNED_INT = new حا<>(4, "Unsigned Int", 5125, Integer.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutInt(pointer + 4L * i, data[i]);
      }
   });
   public static final حا<Byte> UNSIGNED_BYTE = new حا<>(1, "Unsigned Byte", 5121, Byte.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutByte(pointer + i, data[i]);
      }
   });
   public static final حا<Short> SHORT = new حا<>(2, "Short", 5123, Short.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutShort(pointer + 2L * i, data[i]);
      }
   });
   public static final حا<Short> UNSIGNED_SHORT = new حا<>(2, "Unsigned Short", 5122, Short.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutShort(pointer + 2L * i, data[i]);
      }
   });
   public static final حا<Float> FLOAT = new حا<>(4, "Float", 5126, Float.class, (pointer, data) -> {
      for (int i = 0; i < data.length; i++) {
         MemoryUtil.memPutFloat(pointer + 4L * i, data[i]);
      }
   });
}
