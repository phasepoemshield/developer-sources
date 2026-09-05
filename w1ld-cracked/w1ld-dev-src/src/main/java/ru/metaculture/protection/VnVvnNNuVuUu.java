package ru.metaculture.protection;

import net.minecraft.class_310;
import org.wild.module.api.Module;

public class VnVvnNNuVuUu {
   private static final VnVvnNNuVuUu UuUVuuUu = new VnVvnNNuVuUu();
   private static final class_310 C00OOC00oO = class_310.method_1551();
   private boolean uUnuvNvvNU = false;
   private boolean vVvUvVVuuNvV = false;

   public static VnVvnNNuVuUu UuUVuuUu() {
      return UuUVuuUu;
   }

   public void C00OOC00oO() {
      if (!this.uUnuvNvvNU) {
         NUvnVVNvvu.UuUVuuUu(this);
         this.uUnuvNvvNU = true;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (!var1.UuUVuuUu()) {
         if (var1.nuUnNvnuUu() == 1) {
            if (var1.vVvUvVVuuNvV() >= 0) {
               if (NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
                  Module[] var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(var1.vVvUvVVuuNvV());
                  if (var2 != null) {
                     for (Module var6 : var2) {
                        var6.a_();
                     }
                  }

                  this.C00OOC00oO(var1.vVvUvVVuuNvV());
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (!var1.UuUVuuUu()) {
         if (!var1.uVUuuVnNVU()) {
            if (var1.vuuuNvNuv()) {
               if (C00OOC00oO == null || C00OOC00oO.field_1755 == null) {
                  if (!this.vVvUvVVuuNvV) {
                     if (NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
                        int var2 = -100 - var1.vVvUvVVuuNvV();
                        Module[] var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(var2);
                        if (var3 != null) {
                           for (Module var7 : var3) {
                              var7.a_();
                           }
                        }

                        this.C00OOC00oO(var2);
                     }
                  }
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UVNVVUunvN var1) {
      if (!var1.UuUVuuUu()) {
         if (!var1.vNUvnnVnUvu()) {
            if (C00OOC00oO == null || C00OOC00oO.field_1755 == null) {
               if (!this.vVvUvVVuuNvV && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
                  if (!(Math.abs(var1.uNNnnnuuuN()) < 1.0E-4)) {
                     int var2 = var1.uNNnnnuuuN() > 0.0 ? -200 : -201;
                     Module[] var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(var2);
                     if (var3 != null) {
                        for (Module var7 : var3) {
                           var7.a_();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void C00OOC00oO(int var1) {
      for (Module var3 : NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu) {
         for (nvUuvVvuuN var5 : var3.nvUVNnuu()) {
            if (var5 instanceof vvNnnUNnVvn var6) {
               this.UuUVuuUu(var6, var1);
            } else if (var5 instanceof VUVnvvnNN var7) {
               for (vvNnnUNnVvn var9 : var7.vVvUvVVuuNvV) {
                  this.UuUVuuUu(var9, var1);
               }
            }
         }
      }
   }

   private void UuUVuuUu(vvNnnUNnVvn var1, int var2) {
      if (var1.nuUnNvnuUu == var2 && !var1.VVuuUN) {
         var1.C00OOC00oO(!var1.vVvUvVVuuNvV());
      }
   }

   public void uUnuvNvvNU() {
   }

   public void UuUVuuUu(String var1) {
   }

   public void UuUVuuUu(boolean var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public boolean vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(Module var1, int var2, vvVUVuVvnnVN var3) {
      if (var1 != null) {
         var1.uNNnnnuuuN = var2;
      }
   }

   public void UuUVuuUu(Module var1, nvUuvVvuuN var2, vvVUVuVvnnVN var3, int var4, Object var5) {
   }

   public void UuUVuuUu(String var1, String var2) {
   }

   public Object C00OOC00oO(String var1, String var2) {
      return null;
   }

   public String UuUVuuUu(int var1) {
      if (var1 == -200) {
         return "Wheel Up";
      } else if (var1 == -201) {
         return "Wheel Down";
      } else if (var1 <= -100) {
         return "Mouse " + (Math.abs(var1 + 100) + 1);
      } else if (var1 == -1) {
         return "None";
      } else if (var1 >= 65 && var1 <= 90) {
         return String.valueOf((char)(65 + (var1 - 65)));
      } else if (var1 >= 48 && var1 <= 57) {
         return String.valueOf((char)(48 + (var1 - 48)));
      } else if (var1 == 32) {
         return "Space";
      } else if (var1 == 257) {
         return "Enter";
      } else if (var1 == 256) {
         return "Escape";
      } else if (var1 == 259) {
         return "Backspace";
      } else if (var1 == 258) {
         return "Tab";
      } else if (var1 == 340 || var1 == 344) {
         return "Shift";
      } else if (var1 == 341 || var1 == 345) {
         return "Ctrl";
      } else if (var1 == 342 || var1 == 346) {
         return "Alt";
      } else {
         return var1 >= 290 && var1 <= 314 ? "F" + (var1 - 290 + 1) : "Key " + var1;
      }
   }
}
