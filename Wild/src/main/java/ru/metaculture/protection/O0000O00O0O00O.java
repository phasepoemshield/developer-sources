package ru.metaculture.protection;

@FunctionalInterface
public interface O0000O00O0O00O {
   float ease(float f);

   static O0000O00O0O00O O00000000() {
      return f -> f;
   }

   default O0000O00O0O00O O00000000(O0000O00O0O00O o0000O00O0O00O) {
      return o0000O00O0O00O == null ? this : f -> o0000O00O0O00O.ease(this.ease(f));
   }
}
