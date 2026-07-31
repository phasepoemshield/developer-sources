package l;

public abstract class Event2 implements Helper41, Helper126 {
   private final byte type;

   protected Event2(byte var1) {
      this.type = var1;
   }

   @Override
   public byte method1038() {
      return this.type;
   }
}
