package zenith;

public class TimerUtil {
   private long startTime;

   public TimerUtil() {
      this.reset();
   }

   public boolean longHolder_5(double d0) {
      return (double)System.currentTimeMillis() - d0 >= (double)this.startTime;
   }

   public boolean ZenithInternal042(double d0) {
      boolean flag = this.hasTimeElapsed(d0);
      if (flag) {
         this.reset();
      }

      return flag;
   }

   public void reset() {
      this.startTime = System.currentTimeMillis();
   }

   public int l1I111I111l1() {
      return Math.toIntExact(System.currentTimeMillis() - this.startTime);
   }

   public void longHolder_7(long i) {
      this.startTime = System.currentTimeMillis() - i;
   }

   public long getStartTime() {
      return this.startTime;
   }
}
