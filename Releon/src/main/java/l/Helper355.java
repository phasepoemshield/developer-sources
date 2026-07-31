package l;

public class Helper355<T> {
   int expiresIn;
   final int priority;
   final Helper242 provider;
   final T value;

   @Override
   public String toString() {
      return "TaskProcessor.Task(expiresIn=" + this.expiresIn + ", priority=" + this.priority + ", provider=" + this.provider + ", value=" + this.value + ")";
   }

   public Helper355(int var1, int var2, Helper242 var3, T var4) {
      this.expiresIn = var1;
      this.priority = var2;
      this.provider = var3;
      this.value = (T)var4;
   }
}
