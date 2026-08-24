package oxxxde;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import lombok.Generated;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.BufferAllocator.CloseableBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

// $VF: Compiled from heavy
public class ان implements جي<ان, اِ> {
   public static final int MAX_VERTICES = 16777215;
   private شم drawMode;
   private Consumer<BufferAllocator> allocatorFinalizer;
   private final Vector3f tempVector;
   private سا vertexFormat;
   private long vertexPointer = -1L;
   private int vertexCount;
   private BufferAllocator bufferAllocator;
   private boolean closeAllocatorAfterBuild;
   private int requiredMask;
   private int currentMask;
   private int vertexSize;
   private int[] elementOffsets;
   private boolean closed = false;

   private void ensureBuilding() {
      if (this.closed) {
         دن.printAndExit(
            new ذح(
               "Attempt to interact with MeshBuilder, which does not building.",
               new String[]{"You are trying to use MeshBuilder after it has been built."},
               new String[]{"Check your build or usage MeshBuilder method and fix it."}
            )
         );
      }
   }

   public <T> ان element(سئ elementType, حا<T> values, T... element) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         elementType.uploadConsumer().accept(pointer, values);
      }

      return this;
   }

   public ان set(BufferAllocator drawMode, شم closeAllocatorAfterBuild, سا vertexFormat, boolean bufferAllocator) {
      return this.set(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild, null);
   }

   public ان elementFloat(سئ element, float v0) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
      }

      return this;
   }

   public ان elementFloat(سئ v1, float v3, float v0, float element, float v2) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
         MemoryUtil.memPutFloat(pointer + 4L, v1);
         MemoryUtil.memPutFloat(pointer + 8L, v2);
         MemoryUtil.memPutFloat(pointer + 12L, v3);
      }

      return this;
   }

   public ان elementFloat(سئ v0, float element, float v2, float v1) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
         MemoryUtil.memPutFloat(pointer + 4L, v1);
         MemoryUtil.memPutFloat(pointer + 8L, v2);
      }

      return this;
   }

   public ان elementFloat(سئ v0, float element, float v1) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
         MemoryUtil.memPutFloat(pointer + 4L, v1);
      }

      return this;
   }

   public اِ buildNullable() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:448)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:141)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:227)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual oxxxde/ان.ensureBuilding ()V
      // 04: aload 0
      // 05: invokevirtual oxxxde/ان.endVertex ()V
      // 08: aload 0
      // 09: invokevirtual oxxxde/ان.build ()Loxxxde/اِ;
      // 0c: astore 1
      // 0d: aload 0
      // 0e: invokevirtual oxxxde/ان.finishAllocator ()V
      // 11: aload 0
      // 12: bipush 1
      // 13: nop
      // 14: putfield oxxxde/ان.closed Z
      // 17: aload 0
      // 18: ldc2_w -1
      // 1b: putfield oxxxde/ان.vertexPointer J
      // 1e: aload 1
      // 1f: areturn
      // 20: astore 2
      // 21: aload 0
      // 22: invokevirtual oxxxde/ان.finishAllocator ()V
      // 25: aload 0
      // 26: bipush 1
      // 27: nop
      // 28: putfield oxxxde/ان.closed Z
      // 2b: aload 0
      // 2c: ldc2_w -1
      // 2f: putfield oxxxde/ان.vertexPointer J
      // 32: aload 2
      // 33: nop
      // 34: athrow
      // try (2 -> 7): 18 null
   }

   private اِ build() {
      if (this.vertexCount == 0) {
         return null;
      }

      CloseableBuffer result = this.bufferAllocator.getAllocated();
      if (result == null) {
         return null;
      }

      CloseableBuffer var2 = result;

      اِ var4;
      try {
         int i = this.drawMode.indexCountFunction().applyAsInt(this.vertexCount);
         var4 = new اِ(result.getBuffer(), this.vertexFormat, this.vertexCount, i, this.drawMode);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }

      return var4;
   }

   public <T> ان element(String values, حا<T> name, T... elementType) {
      return this.element(this.vertexFormat.getVertexElement(name), elementType, values);
   }

   public ان vertex(float x, float z, float y) {
      long l = this.beginVertex() + this.elementOffsets[0];
      this.currentMask = this.requiredMask;
      MemoryUtil.memPutFloat(l, x);
      MemoryUtil.memPutFloat(l + 4L, y);
      MemoryUtil.memPutFloat(l + 8L, z);
      return this;
   }

   @Generated
   public BufferAllocator getBufferAllocator() {
      return this.bufferAllocator;
   }

   private void endVertex() {
      if (this.vertexCount != 0 && this.currentMask != 0) {
         String string = this.vertexFormat.getElementsFromMask(this.currentMask).map(this.vertexFormat::getVertexElementName).collect(Collectors.joining(", "));
         دن.printAndExit(new ثق(string));
      }
   }

   private void finishAllocator() {
      if (this.bufferAllocator != null) {
         if (this.allocatorFinalizer != null) {
            this.allocatorFinalizer.accept(this.bufferAllocator);
         } else if (this.closeAllocatorAfterBuild) {
            this.bufferAllocator.close();
         }
      }
   }

   public ان vertex(Matrix4f z, float y, float x, float matrix4f) {
      matrix4f.transformPosition(x, y, z, this.tempVector);
      return this.vertex(this.tempVector.x, this.tempVector.y, this.tempVector.z);
   }

   private long beginElement(سئ element) {
      int i = this.currentMask;
      int j = i & ~element.mask();
      if (j == i) {
         return -1L;
      } else {
         this.currentMask = j;
         long l = this.vertexPointer;
         if (l == -1L) {
            دن.printAndExit(
               new ذح(
                  "Not currently building vertex.",
                  new String[]{"You are trying to add data to vertex that has already been built."},
                  new String[]{"Check your vertex building method and fix it."}
               )
            );
            return -1L;
         } else {
            return l + this.elementOffsets[element.getId()];
         }
      }
   }

   public ان set(BufferAllocator vertexFormat, شم closeAllocatorAfterBuild, سا allocatorFinalizer, boolean bufferAllocator, Consumer<BufferAllocator> drawMode) {
      this.bufferAllocator = bufferAllocator;
      this.drawMode = drawMode;
      this.vertexFormat = vertexFormat;
      this.vertexSize = vertexFormat.getVertexSize();
      this.elementOffsets = vertexFormat.getElementOffsets();
      this.requiredMask = vertexFormat.getElementsMask() & -2;
      this.closeAllocatorAfterBuild = closeAllocatorAfterBuild;
      this.allocatorFinalizer = allocatorFinalizer;
      this.closed = false;
      this.vertexCount = 0;
      this.vertexPointer = -1L;
      this.currentMask = 0;
      return this;
   }

   private long beginVertex() {
      this.ensureBuilding();
      this.endVertex();
      if (this.vertexCount >= 16777215) {
         دن.printAndExit(new حب());
         return -1L;
      } else {
         this.vertexCount++;
         long l = this.bufferAllocator.allocate(this.vertexSize);
         this.vertexPointer = l;
         return l;
      }
   }

   public ان(BufferAllocator drawMode, شم bufferAllocator, سا closeAllocatorAfterBuild, boolean allocatorFinalizer, Consumer<BufferAllocator> vertexFormat) {
      this.tempVector = new Vector3f();
      this.bufferAllocator = bufferAllocator;
      this.drawMode = drawMode;
      this.vertexFormat = vertexFormat;
      this.vertexSize = vertexFormat.getVertexSize();
      this.elementOffsets = vertexFormat.getElementOffsets();
      this.requiredMask = vertexFormat.getElementsMask() & -2;
      this.closeAllocatorAfterBuild = closeAllocatorAfterBuild;
      this.allocatorFinalizer = allocatorFinalizer;
   }

   public اِ buildOrThrow() {
      اِ builtBuffer = this.buildNullable();
      if (builtBuffer == null) {
         دن.printAndExit(
            new ذح(
               "MeshBuilder was empty.",
               new String[]{
                  "You haven't built any vertices in MeshBuilder and called MeshBuilder build via the 'buildThrowable' method, which throw an exception about the MeshBuilder being empty."
               },
               new String[]{
                  "If your rendering method assumes an empty MeshBuilder, call the builder via the 'buildNullable' method. If not, check your MeshBuilder method and fix it."
               }
            )
         );
         return null;
      } else {
         return builtBuffer;
      }
   }

   public ان(BufferAllocator closeAllocatorAfterBuild, شم vertexFormat, سا drawMode, boolean bufferAllocator) {
      this(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild, null);
   }
}
