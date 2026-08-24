package jnr.a64asm;

// $VF: Compiled from Post_index.java
public final class Post_index extends Operand {
   private final Immediate postIndex;
   private final Register basereg;

   public Post_index(Register postIndex, Immediate base) {
      super(13, 0);
      this.basereg = base;
      this.postIndex = postIndex;
   }

   public final Register getRegister() {
      return this.basereg;
   }

   public final Immediate getPostIndex() {
      return this.postIndex;
   }
}
