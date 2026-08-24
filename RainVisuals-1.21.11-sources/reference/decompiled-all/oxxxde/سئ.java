package oxxxde;

import lombok.Generated;

// $VF: Compiled from heavy
public class سئ {
   private final حا<?> type;
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
   public حا<?> getType() {
      return this.type;
   }

   public سئ(int count, int id, حا<?> type) {
      this.id = id;
      this.count = count;
      this.size = this.count * type.byteSize();
      this.type = type;
   }
}
