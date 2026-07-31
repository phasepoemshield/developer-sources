package ru.metaculture.protection;

import java.util.List;

public record O00000OOO00OO0(String fragmentSource, String hash, String error, List<O00000OOO00OO> exposedUniforms) {
   public O00000OOO00OO0(String fragmentSource, String hash, String error, List<O00000OOO00OO> exposedUniforms) {
      exposedUniforms = exposedUniforms == null ? List.of() : List.copyOf(exposedUniforms);
      this.fragmentSource = fragmentSource;
      this.hash = hash;
      this.error = error;
      this.exposedUniforms = exposedUniforms;
   }

   public O00000OOO00OO0(String string, String string2, String string3) {
      this(string, string2, string3, List.of());
   }

   public boolean ok() {
      return this.error == null || this.error.isBlank();
   }
}
