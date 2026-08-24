package oxxxde;

import lombok.Generated;

// $VF: Compiled from heavy
public enum سغ {
   INT(4, 5125),
   SHORT(2, 5123);

   public final int bytes;
   public final int glId;

   @Generated
   سغ(final int bytes, final int glId) {
      this.bytes = bytes;
      this.glId = glId;
   }

   public static سغ smallestFor(int i) {
      return (i & -65536) != 0 ? INT : SHORT;
   }
}
