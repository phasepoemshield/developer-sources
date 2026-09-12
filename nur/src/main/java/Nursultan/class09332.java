package Nursultan;

import java.util.Objects;

public record class09332(String name, long creationDate) {

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class09332 var2 ? Objects.equals(this.name, var2.name) : false;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.name);
   }

   public String y() {
      return this.name;
   }

   public long N() {
      return this.creationDate;
   }
}
