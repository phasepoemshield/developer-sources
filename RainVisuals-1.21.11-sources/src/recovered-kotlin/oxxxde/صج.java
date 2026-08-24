package oxxxde;

import lombok.Generated;

// $VF: Compiled from heavy
public enum صج {
   FAILURE(0),
   SUCCESSFUL(1);

   public final int id;

   @Generated
   صج(int id) {
      this.id = id;
   }

   public static صج fromStatusId(int id) {
      for (صج compileStatus : values()) {
         if (compileStatus.id == id) {
            return compileStatus;
         }
      }

      return null;
   }
}
