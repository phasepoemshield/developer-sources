package kotakbaz.rain.client.render.main.vertex.mesh;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import lombok.Generated;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.BufferAllocator.CloseableBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;
import oxxxde.اِ;
import oxxxde.ثق;
import oxxxde.جي;
import oxxxde.حب;
import oxxxde.دن;
import oxxxde.ذح;

// $VF: Compiled from heavy
public class MeshBuilder implements جي<MeshBuilder, اِ> {
   public static final int MAX_VERTICES = 16777215;
   private DrawMode drawMode;
   private Consumer<BufferAllocator> allocatorFinalizer;
   private final Vector3f tempVector;
   private VertexFormat vertexFormat;
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

   public <T> MeshBuilder element(VertexElement elementType, A<T> values, T... element) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         elementType.uploadConsumer().accept(pointer, values);
      }

      return this;
   }

   public MeshBuilder set(BufferAllocator drawMode, DrawMode closeAllocatorAfterBuild, VertexFormat vertexFormat, boolean bufferAllocator) {
      return this.set(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild, null);
   }

   public MeshBuilder elementFloat(VertexElement element, float v0) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
      }

      return this;
   }

   public MeshBuilder elementFloat(VertexElement v1, float v3, float v0, float element, float v2) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
         MemoryUtil.memPutFloat(pointer + 4L, v1);
         MemoryUtil.memPutFloat(pointer + 8L, v2);
         MemoryUtil.memPutFloat(pointer + 12L, v3);
      }

      return this;
   }

   public MeshBuilder elementFloat(VertexElement v0, float element, float v2, float v1) {
      long pointer = this.beginElement(element);
      if (pointer != -1L) {
         MemoryUtil.memPutFloat(pointer, v0);
         MemoryUtil.memPutFloat(pointer + 4L, v1);
         MemoryUtil.memPutFloat(pointer + 8L, v2);
      }

      return this;
   }

   public MeshBuilder elementFloat(VertexElement v0, float element, float v1) {
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
      // 01: invokevirtual kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.ensureBuilding ()V
      // 04: aload 0
      // 05: invokevirtual kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.endVertex ()V
      // 08: aload 0
      // 09: invokevirtual kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.build ()Loxxxde/اِ;
      // 0c: astore 1
      // 0d: aload 0
      // 0e: invokevirtual kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.finishAllocator ()V
      // 11: aload 0
      // 12: bipush 1
      // 13: nop
      // 14: putfield kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.closed Z
      // 17: aload 0
      // 18: ldc2_w -1
      // 1b: putfield kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.vertexPointer J
      // 1e: aload 1
      // 1f: areturn
      // 20: astore 2
      // 21: aload 0
      // 22: invokevirtual kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.finishAllocator ()V
      // 25: aload 0
      // 26: bipush 1
      // 27: nop
      // 28: putfield kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.closed Z
      // 2b: aload 0
      // 2c: ldc2_w -1
      // 2f: putfield kotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder.vertexPointer J
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

   public <T> MeshBuilder element(String values, A<T> name, T... elementType) {
      return this.element(this.vertexFormat.getVertexElement(name), elementType, values);
   }

   public MeshBuilder vertex(float x, float z, float y) {
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

   public MeshBuilder vertex(Matrix4f z, float y, float x, float matrix4f) {
      matrix4f.transformPosition(x, y, z, this.tempVector);
      return this.vertex(this.tempVector.x, this.tempVector.y, this.tempVector.z);
   }

   private long beginElement(VertexElement element) {
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

   public MeshBuilder set(
      BufferAllocator vertexFormat,
      DrawMode closeAllocatorAfterBuild,
      VertexFormat allocatorFinalizer,
      boolean bufferAllocator,
      Consumer<BufferAllocator> drawMode
   ) {
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

   public MeshBuilder(
      BufferAllocator drawMode,
      DrawMode bufferAllocator,
      VertexFormat closeAllocatorAfterBuild,
      boolean allocatorFinalizer,
      Consumer<BufferAllocator> vertexFormat
   ) {
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

   public MeshBuilder(BufferAllocator closeAllocatorAfterBuild, DrawMode vertexFormat, VertexFormat drawMode, boolean bufferAllocator) {
      this(bufferAllocator, drawMode, vertexFormat, closeAllocatorAfterBuild, null);
   }
}
