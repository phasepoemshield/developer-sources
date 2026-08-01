package ru.metaculture.protection;

public enum O00000OOO0OO {
   FLOAT("float", 1),
   VEC2("vec2", 2),
   VEC3("vec3", 3),
   VEC4("vec4", 4),
   INT("int", 1);

   private final String O00000000;
   private final int O000000000;

   private O00000OOO0OO(String string2, int j) {
      this.O00000000 = string2;
      this.O000000000 = j;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public int O000000000() {
      return this.O000000000;
   }
}
