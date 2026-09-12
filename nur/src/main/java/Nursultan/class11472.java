package Nursultan;

import fun.crashsystem.jdrpc.entity.User;

public class class11472 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   public void L(int var1) {
      this.y_1 = var1;
   }

   public int L() {
      return (Integer)this.y_1;
   }

   public void L(String var1) {
      this.N_2 = var1;
   }

   public int M() {
      return (Integer)this.N_0;
   }

   public class11472() {
      this.m();
      this.y_1 = -1;
      this.y_2 = -1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class11472 var2)) {
         return false;
      } else if (!var2.N(this)) {
         return false;
      } else if (this.M() != var2.M()) {
         return false;
      } else if (this.R() != var2.R()) {
         return false;
      } else if (this.z() != var2.z()) {
         return false;
      } else if (this.L() != var2.L()) {
         return false;
      } else if (this.U() != var2.U()) {
         return false;
      } else {
         String var3 = this.Z();
         String var4 = var2.Z();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.B();
            String var6 = var2.B();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.y();
               String var8 = var2.y();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  class11802 var9 = this.i();
                  class11802 var10 = var2.i();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     String var11 = this.u();
                     String var12 = var2.u();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        User var13 = this.N();
                        User var14 = var2.N();
                        return var13 == null ? var14 == null : var13.equals(var14);
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public String toString() {
      return "ClientUser(uid="
         + this.M()
         + ", username="
         + this.Z()
         + ", apiToken="
         + this.B()
         + ", hasPremium="
         + this.R()
         + ", subscribeTimeMinutes="
         + this.z()
         + ", hash="
         + this.y()
         + ", role="
         + this.i()
         + ", prefixIndex="
         + this.L()
         + ", avatarTextureId="
         + this.U()
         + ", avatarBase64="
         + this.u()
         + ", discordUser="
         + this.N()
         + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.M();
      var2 = var2 * 59 + (this.R() ? 79 : 97);
      long var3 = this.z();
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      var2 = var2 * 59 + this.L();
      var2 = var2 * 59 + this.U();
      String var5 = this.Z();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.B();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.y();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      class11802 var8 = this.i();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      String var9 = this.u();
      var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
      User var10 = this.N();
      return var2 * 59 + (var10 == null ? 43 : var10.hashCode());
   }

   public String B() {
      return (String)this.N_2;
   }

   public String Z() {
      return (String)this.N_1;
   }

   public class11802 i() {
      return (class11802)this.y_0;
   }

   private void m() {
      this.N_0 = 0;
      this.y_1 = 0;
      this.N_3 = false;
      this.y_2 = 0;
      this.N_4 = 0L;
   }

   public int U() {
      return (Integer)this.y_2;
   }

   public long z() {
      return 999999999L;
   }

   public void u(String var1) {
      this.N_5 = var1;
   }

   public String u() {
      return (String)this.y_3;
   }

   public void y(int var1) {
      this.N_0 = var1;
   }

   public String y() {
      return (String)this.N_5;
   }

   public void y(String var1) {
      this.y_3 = var1;
   }

   public void N(long var1) {
      this.N_4 = var1;
   }

   public void N(User var1) {
      this.y_4 = var1;
   }

   public void N(int var1) {
      this.y_2 = var1;
   }

   public void N(String var1) {
      this.N_1 = var1;
   }

   public void N(boolean var1) {
      this.N_3 = var1;
   }

   public boolean N(Object var1) {
      return var1 instanceof class11472;
   }

   public User N() {
      return (User)this.y_4;
   }

   public void N(class11802 var1) {
      this.y_0 = var1;
   }

   public boolean R() {
      return true;
   }
}
