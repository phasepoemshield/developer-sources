package kotakbaz.rain.client.render.main.vertex.element;

import lombok.Generated;

// $VF: Compiled from heavy
public class VertexElement {
   private final A<?> type;
   private final int id;
   private final int size;
   private final int count;

   @Generated
   public int getCount() {
      return this.count;
   }

   @Generated
   public int getId() {
      return this.id;
   }

   public int mask() {
      return 1 << this.id;
   }

   @Generated
   public int getSize() {
      return this.size;
   }

   @Generated
   public A<?> getType() {
      return this.type;
   }

   public VertexElement(int count, int id, A<?> type) {
      this.id = id;
      this.count = count;
      this.size = this.count * type.byteSize();
      this.type = type;
   }
}
