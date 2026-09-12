package Nursultan;

import com.mojang.datafixers.util.Either;

public record class10191<T>(Either<T, Exception> value, long time) {

   public long y() {
      return this.time;
   }

   public Either<T, Exception> N() {
      return this.value;
   }
}
