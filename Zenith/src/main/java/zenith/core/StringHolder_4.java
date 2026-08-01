package zenith;

class StringHolder_4 {
   private final String FinishThread;
   private final int ZenithInternal064;
   private transient String ZenithInternal021;

   StringHolder_4(String s, int i) {
      this.FinishThread = s;
      this.ZenithInternal064 = i;
   }

   String EventImpl_21() {
      return this.FinishThread;
   }

   int getPort() {
      return this.ZenithInternal064;
   }

   @Override
   public String toString() {
      if (this.ZenithInternal021 == null) {
         this.ZenithInternal021 = String.format("%s:%d", this.FinishThread, this.ZenithInternal064);
      }

      return this.ZenithInternal021;
   }
}
