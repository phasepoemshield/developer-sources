package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntPredicate;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_437;

public final class nvvnuuv {
   private static final long UuUVuuUu = 4000L;
   private static final long C00OOC00oO = 2500L;
   private static final String[] uUnuvNvvNU = new String[]{"Wild", "Swift", "Nova", "Frost", "Shadow", "Lunar", "Pixel", "Turbo", "Lucky", "Silent"};
   private static final String[] vVvUvVVuuNvV = new String[]{"Fox", "Wolf", "Bot", "Raven", "Panda", "Ghost", "Tiger", "Moth", "Bee", "Axolotl"};
   private final nvvnuuv.uunvUUVnuNn uNNnnnuuuN = new nvvnuuv.uunvUUVnuNn(16, var0 -> var0 < 128 && (Character.isLetterOrDigit(var0) || var0 == 95));
   private final nvvnuuv.uunvUUVnuNn nuUnNvnuUu = new nvvnuuv.uunvUUVnuNn(255, var0 -> var0 >= 32 && var0 < 127 && !Character.isWhitespace(var0));
   private final nvvnuuv.uunvUUVnuNn VVuuUN = new nvvnuuv.uunvUUVnuNn(256, var0 -> var0 >= 32 && !Character.isISOControl(var0));
   private String vNUvnnVnUvu;
   private String uVUuuVnNVU;
   private long vuuuNvNuv;
   private boolean nvUVNnuu;
   private float UuuNnUvUuv;
   private String nUUVuvU = "";
   private boolean UnUNVVVNuv;
   private long vNVuvnUUnuUn;

   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      nvvnuuv.nvnNNunvv var7 = nvvnuuv.nvnNNunvv.of(var3, var5);
      List var8 = this.UuUVuuUu(var2.OCOocoOoOO());
      nnVNNuuVUVn.NVnVnNnN var9 = this.UuUVuuUu(var8);
      this.UuUVuuUu(var1, var2, var5, var6, var7, var8, var9);
      this.UuUVuuUu(var1, var2, var5, var6, var7, var9);
      this.UuUVuuUu(var1, var5, var6, var7);
      if (this.nvUVNnuu) {
         this.UuUVuuUu(var1, var2, var5, var6, var7);
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, nUVuuNUVnV var3, float var4, float var5, int var6) {
      nvvnuuv.nvnNNunvv var7 = nvvnuuv.nvnNNunvv.of(var2, var3.uNNnnnuuuN());
      if (!var7.content.contains(var4, var5)) {
         this.C00OOC00oO();
         return false;
      } else {
         var1.uVUuuVnNVU(false);
         if (var6 != 0 && var6 != 1) {
            return true;
         } else if (this.nvUVNnuu) {
            if (var6 != 0) {
               return true;
            } else if (var7.randomNameButton.contains(var4, var5)) {
               this.uNNnnnuuuN.UuUVuuUu(nuUnNvnuUu());
               this.uNNnnnuuuN.UuUVuuUu(true);
               this.nuUnNvnuUu.UuUVuuUu(false);
               return true;
            } else {
               boolean var14 = this.uNNnnnuuuN.UuUVuuUu(var7.nameField, var4, var5);
               boolean var16 = this.nuUnNvnuUu.UuUVuuUu(var7.addressField, var4, var5);
               if (!var14 && !var16) {
                  this.uNNnnnuuuN.UuUVuuUu(false);
                  this.nuUnNvnuUu.UuUVuuUu(false);
               }

               if (var7.addSubmit.contains(var4, var5)) {
                  this.uNNnnnuuuN();
               } else if (var7.addCancel.contains(var4, var5) || !var7.modal.contains(var4, var5)) {
                  this.vVvUvVVuuNvV();
               }

               return true;
            }
         } else if (var6 == 0 && var7.addButton.contains(var4, var5)) {
            this.uUnuvNvvNU();
            return true;
         } else if (var6 == 0 && var7.hostButton.contains(var4, var5)) {
            this.C00OOC00oO();
            var1.uNnUnnuNUnNu();
            var1.UuUVuuUu(null);
            var1.UuUVuuUu(var1.NUVvUUVuVNVv());
            return true;
         } else {
            List var8 = this.UuUVuuUu(var1.OCOocoOoOO());
            if (var7.listViewport.contains(var4, var5)) {
               float var9 = var7.rowHeight;
               float var10 = var7.listViewport.y - this.UuuNnUvUuv;

               for (nnVNNuuVUVn.NVnVnNnN var12 : var8) {
                  nvvnuuv.VvunVVUvUNnv var13 = new nvvnuuv.VvunVVUvUNnv(var7.listViewport.x, var10, var7.listViewport.w, var9);
                  if (var13.intersects(var7.listViewport) && var13.contains(var4, var5)) {
                     this.C00OOC00oO(var12.name());
                     this.VVuuUN.UuUVuuUu(false);
                     if (var6 == 1 && var12.bot() != null) {
                        if (nnVNNuuVUVn.UuUVuuUu() == var12.bot()) {
                           nnVNNuuVUVn.vVvUvVVuuNvV();
                           this.UuUVuuUu("Управление возвращено основному аккаунту", false);
                        } else if (!nnVNNuuVUVn.UuUVuuUu(var12.bot())) {
                           this.UuUVuuUu("Бот ещё не готов к управлению", true);
                        }
                     }

                     return true;
                  }

                  var10 += var9 + var7.rowGap;
               }
            }

            if (var6 != 0) {
               this.VVuuUN.UuUVuuUu(false);
               return true;
            } else {
               nnVNNuuVUVn.NVnVnNnN var15 = this.UuUVuuUu(var8);
               if (var15 == null) {
                  this.VVuuUN.UuUVuuUu(false);
                  return true;
               } else {
                  this.VVuuUN.UuUVuuUu(var7.chatField.contains(var4, var5));
                  if (this.VVuuUN.C00OOC00oO()) {
                     return true;
                  } else {
                     vUNVNUnuv var17 = var15.bot();
                     if (var7.controlButton.contains(var4, var5)) {
                        if (var17 != null && var17.vuuuNvNuv()) {
                           if (nnVNNuuVUVn.UuUVuuUu() == var17) {
                              nnVNNuuVUVn.vVvUvVVuuNvV();
                              this.UuUVuuUu("Управление возвращено Host", false);
                           } else if (nnVNNuuVUVn.UuUVuuUu(var17)) {
                              this.UuUVuuUu("Теперь вы управляете " + var17.UuUVuuUu(), false);
                           } else {
                              this.UuUVuuUu("Не удалось переключить управление", true);
                           }
                        } else {
                           this.UuUVuuUu("Бот не находится в игровом мире", true);
                        }
                     } else if (var7.modulesButton.contains(var4, var5)) {
                        if (var17 != null && var17.vuuuNvNuv()) {
                           var1.uNnUnnuNUnNu();
                           var1.UuUVuuUu(var17);
                           var1.UuUVuuUu(var1.NUVvUUVuVNVv());
                        } else {
                           this.UuUVuuUu("Модули доступны после входа бота", true);
                        }
                     } else if (var7.reconnectButton.contains(var4, var5)) {
                        if (nnVNNuuVUVn.C00OOC00oO(var15.name())) {
                           this.UuUVuuUu("Переподключение запущено", false);
                        } else {
                           this.UuUVuuUu("Не удалось запустить переподключение", true);
                        }
                     } else if (var7.disconnectButton.contains(var4, var5)) {
                        if (nnVNNuuVUVn.uUnuvNvvNU(var15.name())) {
                           this.UuUVuuUu("Бот отключён, профиль сохранён", false);
                        } else {
                           this.UuUVuuUu("Бот уже отключён", true);
                        }
                     } else if (var7.forgetButton.contains(var4, var5)) {
                        long var18 = System.currentTimeMillis();
                        if (!var15.name().equalsIgnoreCase(this.uVUuuVnNVU) || var18 - this.vuuuNvNuv > 2500L) {
                           this.uVUuuVnNVU = var15.name();
                           this.vuuuNvNuv = var18;
                           this.UuUVuuUu("Нажмите «Удалить?» ещё раз", true);
                        } else if (nnVNNuuVUVn.vVvUvVVuuNvV(var15.name())) {
                           this.C00OOC00oO(null);
                           this.UuUVuuUu("Профиль удалён", false);
                        } else {
                           this.UuUVuuUu("Сначала отключите бота", true);
                        }
                     } else if (var7.sendButton.contains(var4, var5)) {
                        this.UuUVuuUu(var15);
                     }

                     return true;
                  }
               }
            }
         }
      }
   }

   public boolean UuUVuuUu(float var1, float var2, int var3) {
      return this.nvUVNnuu || this.uNNnnnuuuN.C00OOC00oO() || this.nuUnNvnuUu.C00OOC00oO() || this.VVuuUN.C00OOC00oO();
   }

   public boolean UuUVuuUu(float var1, float var2, int var3, float var4, float var5) {
      return this.nvUVNnuu;
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, nUVuuNUVnV var3, float var4, float var5, double var6) {
      nvvnuuv.nvnNNunvv var8 = nvvnuuv.nvnNNunvv.of(var2, var3.uNNnnnuuuN());
      if (!var8.listViewport.contains(var4, var5)) {
         return var8.content.contains(var4, var5);
      } else {
         List var9 = this.UuUVuuUu(var1.OCOocoOoOO());
         float var10 = var9.size() * var8.rowHeight + Math.max(0, var9.size() - 1) * var8.rowGap;
         float var11 = Math.max(0.0F, var10 - var8.listViewport.h);
         this.UuuNnUvUuv = UuUVuuUu(this.UuuNnUvUuv - (float)var6 * var3.uNNnnnuuuN().UuUVuuUu(34.0F), 0.0F, var11);
         return true;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      if (this.nvUVNnuu) {
         if (var2 == 256) {
            this.vVvUvVVuuNvV();
            return true;
         } else if (var2 == 258) {
            boolean var4 = this.uNNnnnuuuN.C00OOC00oO();
            this.uNNnnnuuuN.UuUVuuUu(!var4);
            this.nuUnNvnuUu.UuUVuuUu(var4);
            return true;
         } else if (var2 == 257 || var2 == 335) {
            this.uNNnnnuuuN();
            return true;
         } else {
            return !this.uNNnnnuuuN.UuUVuuUu(var2) && !this.nuUnNvnuUu.UuUVuuUu(var2) ? true : true;
         }
      } else if (this.VVuuUN.C00OOC00oO()) {
         if (var2 == 256) {
            this.VVuuUN.UuUVuuUu(false);
            return true;
         } else if (var2 != 257 && var2 != 335) {
            return this.VVuuUN.UuUVuuUu(var2);
         } else {
            nnVNNuuVUVn.NVnVnNnN var3 = this.vNUvnnVnUvu == null ? null : nnVNNuuVUVn.UuUVuuUu(this.vNUvnnVnUvu);
            if (var3 != null) {
               this.UuUVuuUu(var3);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(char var1) {
      return !this.nvUVNnuu ? this.VVuuUN.UuUVuuUu(var1) : this.uNNnnnuuuN.UuUVuuUu(var1) || this.nuUnNvnuUu.UuUVuuUu(var1);
   }

   public boolean UuUVuuUu() {
      return this.nvUVNnuu || this.uNNnnnuuuN.C00OOC00oO() || this.nuUnNvnuUu.C00OOC00oO() || this.VVuuUN.C00OOC00oO();
   }

   public void C00OOC00oO() {
      this.vVvUvVVuuNvV();
      this.VVuuUN.UuUVuuUu(false);
      this.VVuuUN.UuUVuuUu("");
      this.uVUuuVnNVU = null;
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.nvnNNunvv var5, List<nnVNNuuVUVn.NVnVnNnN> var6, nnVNNuuVUVn.NVnVnNnN var7
   ) {
      this.UuUVuuUu(var1, var3, var4, var5.listPanel, 0.0F);
      String var8 = "Боты:";
      float var9 = var5.listPanel.x + var3.UuUVuuUu(12.0F);
      float var10 = var5.listPanel.y + var3.UuUVuuUu(11.0F);
      nunvNNUnvU.UuUVuuUu(var1, var3, vNvnnVvvVUu.vVvUvVVuuNvV, var9, var10, 11.0F, var8, nunvNNUnvU.UuUVuuUu(var4));
      String var11 = var2.OCOocoOoOO();
      int var12 = var11 != null && !var11.isBlank() ? nnVNNuuVUVn.C00OOC00oO().size() : var6.size();
      String var13 = Integer.toString(var12);
      float var14 = nunvNNUnvU.UuUVuuUu(var3, vNvnnVvvVUu.vVvUvVVuuNvV, var8, 11.0F);
      nunvNNUnvU.UuUVuuUu(var1, var3, vNvnnVvvVUu.vVvUvVVuuNvV, var9 + var14, var10, 11.0F, var13, var4.vVvUvVVuuNvV());
      this.UuUVuuUu(var1, var2, var3, var4, var5.hostButton, "Host", nvvnuuv.NVnVnNnN.NORMAL, var2.VVuuUN() == null);
      this.UuUVuuUu(var1, var2, var3, var4, var5.addButton, "+ Добавить", nvvnuuv.NVnVnNnN.ACCENT, false);
      float var15 = var6.size() * var5.rowHeight + Math.max(0, var6.size() - 1) * var5.rowGap;
      float var16 = Math.max(0.0F, var15 - var5.listViewport.h);
      this.UuuNnUvUuv = UuUVuuUu(this.UuuNnUvUuv, 0.0F, var16);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         var5.listViewport.x,
         var5.listViewport.y,
         var5.listViewport.w,
         var5.listViewport.h,
         var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(6.0F)
      );

      try {
         float var17 = var5.listViewport.y - this.UuuNnUvUuv;

         for (nnVNNuuVUVn.NVnVnNnN var19 : var6) {
            nvvnuuv.VvunVVUvUNnv var20 = new nvvnuuv.VvunVVUvUNnv(
               var5.listViewport.x, var17, var5.listViewport.w - (var16 > 0.0F ? var3.UuUVuuUu(5.0F) : 0.0F), var5.rowHeight
            );
            if (var20.intersects(var5.listViewport)) {
               this.UuUVuuUu(var1, var2, var3, var4, var20, var19, var7 != null && var7.name().equalsIgnoreCase(var19.name()));
            }

            var17 += var5.rowHeight + var5.rowGap;
         }

         if (var6.isEmpty()) {
            this.UuUVuuUu(var1, var3, var4, var5.listViewport);
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      if (var16 > 0.0F) {
         float var24 = var5.listViewport.h;
         float var25 = Math.max(var3.UuUVuuUu(28.0F), var24 * (var24 / (var24 + var16)));
         float var26 = var5.listViewport.y + (var24 - var25) * (this.UuuNnUvUuv / var16);
         var1.UuUVuuUu(
            var5.listViewport.x + var5.listViewport.w - var3.UuUVuuUu(2.5F),
            var5.listViewport.y,
            var3.UuUVuuUu(1.5F),
            var24,
            var3.UuUVuuUu(1.0F),
            var4.vuuuNvNuv()
         );
         var1.UuUVuuUu(
            var5.listViewport.x + var5.listViewport.w - var3.UuUVuuUu(3.0F),
            var26,
            var3.UuUVuuUu(2.5F),
            var25,
            var3.UuUVuuUu(1.5F),
            NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 150)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.VvunVVUvUNnv var5, nnVNNuuVUVn.NVnVnNnN var6, boolean var7) {
      boolean var8 = var5.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
      float var9 = var7 ? 1.0F : (var8 ? 0.55F : 0.0F);
      int var10 = NUunUunuNV.UuUVuuUu(
         nunvNNUnvU.UuUVuuUu(var4, var8 ? 1.0F : 0.0F), NUunUunuNV.UuUVuuUu(var4.UNnVVNvvnVvU(), var4.uNnUnnuNUnNu() ? 34 : 48), var7 ? 0.42F : 0.0F
      );
      var1.UuUVuuUu(var5.x, var5.y, var5.w, var5.h, var3.UuUVuuUu(8.0F), var10);
      var1.UuUVuuUu(
         var5.x,
         var5.y,
         var5.w,
         var5.h,
         var3.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var4.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 145), var9),
         Math.max(0.55F, var3.UuUVuuUu(0.6F))
      );
      int var11 = UuUVuuUu(var4, var6);
      float var12 = var5.x + var3.UuUVuuUu(13.0F);
      float var13 = var5.y + var3.UuUVuuUu(17.0F);
      var1.C00OOC00oO(var12, var13, var3.UuUVuuUu(3.3F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var11, 48));
      var1.C00OOC00oO(var12, var13, var3.UuUVuuUu(1.8F), 0.0F, 1.0F, var11);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var5.x + var3.UuUVuuUu(23.0F),
         var5.y + var3.UuUVuuUu(9.0F),
         10.5F,
         UuUVuuUu(var6.name(), var5.w - var3.UuUVuuUu(36.0F), var3, vNvnnVvvVUu.vVvUvVVuuNvV, 10.5F),
         nunvNNUnvU.UuUVuuUu(var4)
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var5.x + var3.UuUVuuUu(13.0F),
         var5.y + var3.UuUVuuUu(29.0F),
         8.2F,
         UuUVuuUu(var6.address(), var5.w - var3.UuUVuuUu(25.0F), var3, vNvnnVvvVUu.UuUVuuUu, 8.2F),
         nunvNNUnvU.C00OOC00oO(var4)
      );
      String var14 = C00OOC00oO(var6);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var5.x + var3.UuUVuuUu(13.0F),
         var5.y + var3.UuUVuuUu(43.0F),
         7.5F,
         UuUVuuUu(var14, var5.w - var3.UuUVuuUu(25.0F), var3, vNvnnVvvVUu.UuUVuuUu, 7.5F),
         NUunUunuNV.UuUVuuUu(var11, 215)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, nvvnuuv.VvunVVUvUNnv var4) {
      float var5 = var4.y + var4.h * 0.46F;
      var1.C00OOC00oO(var4.x + var4.w * 0.5F, var5 - var2.UuUVuuUu(17.0F), var2.UuUVuuUu(15.0F), 0.0F, 1.0F, var3.vuuuNvNuv());
      UuUVuuUu(var1, var2, var4.x + var4.w * 0.5F, var5 - var2.UuUVuuUu(17.0F), nunvNNUnvU.uUnuvNvvNU(var3));
      String var6 = "Ботов пока нет";
      float var7 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var6, 10.0F);
      nunvNNUnvU.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4.x + (var4.w - var7) * 0.5F, var5 + var2.UuUVuuUu(5.0F), 10.0F, var6, nunvNNUnvU.C00OOC00oO(var3)
      );
      String var8 = "Нажмите «Добавить»";
      float var9 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var8, 8.0F);
      nunvNNUnvU.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.UuUVuuUu, var4.x + (var4.w - var9) * 0.5F, var5 + var2.UuUVuuUu(23.0F), 8.0F, var8, nunvNNUnvU.uUnuvNvvNU(var3)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.nvnNNunvv var5, nnVNNuuVUVn.NVnVnNnN var6) {
      this.UuUVuuUu(var1, var3, var4, var5.detailPanel, 0.0F);
      if (var6 == null) {
         String var13 = "Выберите бота слева";
         float var14 = nunvNNUnvU.UuUVuuUu(var3, vNvnnVvvVUu.vVvUvVVuuNvV, var13, 12.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var5.detailPanel.x + (var5.detailPanel.w - var14) * 0.5F,
            var5.detailPanel.y + var5.detailPanel.h * 0.44F,
            12.0F,
            var13,
            nunvNNUnvU.C00OOC00oO(var4)
         );
      } else {
         vUNVNUnuv var7 = var6.bot();
         int var8 = UuUVuuUu(var4, var6);
         var1.C00OOC00oO(
            var5.detailPanel.x + var3.UuUVuuUu(17.0F),
            var5.detailPanel.y + var3.UuUVuuUu(22.0F),
            var3.UuUVuuUu(4.0F),
            0.0F,
            1.0F,
            NUunUunuNV.UuUVuuUu(var8, 55)
         );
         var1.C00OOC00oO(var5.detailPanel.x + var3.UuUVuuUu(17.0F), var5.detailPanel.y + var3.UuUVuuUu(22.0F), var3.UuUVuuUu(2.2F), 0.0F, 1.0F, var8);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var5.detailPanel.x + var3.UuUVuuUu(29.0F),
            var5.detailPanel.y + var3.UuUVuuUu(11.0F),
            13.0F,
            UuUVuuUu(var6.name(), var5.detailPanel.w - var3.UuUVuuUu(125.0F), var3, vNvnnVvvVUu.vVvUvVVuuNvV, 13.0F),
            nunvNNUnvU.UuUVuuUu(var4)
         );
         float var9 = var5.detailPanel.x + var3.UuUVuuUu(29.0F);
         float var10 = Math.max(var3.UuUVuuUu(24.0F), var5.forgetButton.x - var9 - var3.UuUVuuUu(8.0F));
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.UuUVuuUu,
            var9,
            var5.detailPanel.y + var3.UuUVuuUu(31.0F),
            8.5F,
            UuUVuuUu(var6.address() + "  ·  " + vVvUvVVuuNvV(var6.status()), var10, var3, vNvnnVvvVUu.UuUVuuUu, 8.5F),
            nunvNNUnvU.C00OOC00oO(var4)
         );
         boolean var11 = var6.name().equalsIgnoreCase(this.uVUuuVnNVU) && System.currentTimeMillis() - this.vuuuNvNuv <= 2500L;
         this.UuUVuuUu(var1, var2, var3, var4, var5.forgetButton, var11 ? "Удалить?" : "Удалить", nvvnuuv.NVnVnNnN.DANGER, var11);
         String var12 = var7 != null && nnVNNuuVUVn.UuUVuuUu() == var7 ? "Вернуться" : "Управлять";
         this.UuUVuuUu(var1, var2, var3, var4, var5.controlButton, var12, nvvnuuv.NVnVnNnN.ACCENT, var7 != null && nnVNNuuVUVn.UuUVuuUu() == var7);
         this.UuUVuuUu(var1, var2, var3, var4, var5.modulesButton, "Модули", nvvnuuv.NVnVnNnN.NORMAL, false);
         this.UuUVuuUu(var1, var2, var3, var4, var5.reconnectButton, "Реконнект", nvvnuuv.NVnVnNnN.NORMAL, false);
         this.UuUVuuUu(var1, var2, var3, var4, var5.disconnectButton, "Отключить", nvvnuuv.NVnVnNnN.DANGER, false);
         this.VVuuUN.UuUVuuUu(var1, var3, var4, var5.chatField, "Сообщение или /команда", var2.unnUnUNVnN(), var2.NnuUnUNnu());
         this.UuUVuuUu(var1, var2, var3, var4, var5.sendButton, "Отправить", nvvnuuv.NVnVnNnN.ACCENT, false);
         if (var7 != null && var7.vNUvnnVnUvu() != null && var7.vuuuNvNuv()) {
            this.UuUVuuUu(var1, var3, var4, var5, var7);
            this.UuUVuuUu(var1, var2, var3, var4, var5, var7);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, nvvnuuv.nvnNNunvv var4, vUNVNUnuv var5) {
      var1.UuUVuuUu(var4.stats.x, var4.stats.y, var4.stats.w, var4.stats.h, var2.UuUVuuUu(7.0F), nunvNNUnvU.UuUVuuUu(var3, 0.0F));
      var1.UuUVuuUu(var4.stats.x, var4.stats.y, var4.stats.w, var4.stats.h, var2.UuUVuuUu(7.0F), var3.nvUVNnuu(), Math.max(0.5F, var2.UuUVuuUu(0.55F)));
      if (var5 != null && var5.vNUvnnVnUvu() != null && var5.vuuuNvNuv()) {
         VNNVunUvvnn var6 = var5.vNUvnnVnUvu();
         String var7 = String.format(Locale.ROOT, "HP %.1f / %.1f", var6.method_6032(), var6.method_6063());
         String var8 = "Еда " + var6.method_7344().method_7586();
         String var9 = "XP " + var6.field_7520;
         String var10 = "XYZ " + var6.method_31477() + "  " + var6.method_31478() + "  " + var6.method_31479();
         String[] var11 = new String[]{var7, var8, var9, var10};
         int[] var12 = new int[]{var3.UuUVuuUu(), var3.uUnuvNvvNU(), var3.vVvUvVVuuNvV(), nunvNNUnvU.C00OOC00oO(var3)};
         float var13 = var2.UuUVuuUu(8.0F);
         float var14 = (var4.stats.w - var13 * 2.0F) / var11.length;

         for (int var15 = 0; var15 < var11.length; var15++) {
            String var16 = UuUVuuUu(var11[var15], var14 - var2.UuUVuuUu(5.0F), var2, vNvnnVvvVUu.UuUVuuUu, 8.2F);
            float var17 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var16, 8.2F);
            float var18 = var4.stats.x + var13 + var15 * var14 + (var14 - var17) * 0.5F;
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var18, var4.stats.y, var4.stats.h, 8.2F, var16, var12[var15]);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.nvnNNunvv var5, vUNVNUnuv var6) {
      this.UuUVuuUu(var1, var3, var4, var5.inventoryTab, "Инвентарь");
      float var7 = var5.inventoryArea.x - var3.UuUVuuUu(8.0F);
      float var8 = var5.inventoryArea.y - var3.UuUVuuUu(5.0F);
      float var9 = var5.inventoryArea.w + var3.UuUVuuUu(16.0F);
      float var10 = var5.inventoryArea.h + var3.UuUVuuUu(5.0F);
      int var11 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.vNUvnnVnUvu(var4), var4.NVNnnvnuunNv(), var4.uNnUnnuNUnNu() ? 0.025F : 0.045F);
      var1.UuUVuuUu(var7, var8, var9, var10, var3.UuUVuuUu(9.0F), var11);
      var1.UuUVuuUu(
         var7,
         var8,
         var9,
         var10,
         var3.UuUVuuUu(9.0F),
         var4.uNnUnnuNUnNu() ? nunvNNUnvU.C00OOC00oO(var4, 0.92F) : var4.UnUNVVVNuv(),
         Math.max(0.65F, var3.UuUVuuUu(0.7F))
      );
      if (var6 != null && var6.vNUvnnVnUvu() != null && var6.vuuuNvNuv()) {
         class_1799 var12 = this.C00OOC00oO(var1, var2, var3, var4, var5, var6);
         if (var12 != null && !var12.method_7960()) {
            String var13 = var12.method_7964().getString();
            if (var12.method_7947() > 1) {
               var13 = var13 + " ×" + var12.method_7947();
            }

            nunvNNUnvU.UuUVuuUu(
               var1,
               var3,
               vNvnnVvvVUu.UuUVuuUu,
               var5.inventoryArea.x,
               var5.inventoryArea.y + var5.inventoryArea.h - var3.UuUVuuUu(15.0F),
               8.3F,
               UuUVuuUu(var13, var5.inventoryArea.w, var3, vNvnnVvvVUu.UuUVuuUu, 8.3F),
               nunvNNUnvU.C00OOC00oO(var4)
            );
         }
      }
   }

   private class_1799 C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.nvnNNunvv var5, vUNVNUnuv var6) {
      float var7 = var5.slot;
      float var8 = var5.inventoryArea.x;
      float var9 = var5.inventoryArea.y + var3.UuUVuuUu(3.0F);
      class_1799 var10 = class_1799.field_8037;

      for (int var11 = 0; var11 < 4; var11++) {
         if (var11 == 3) {
            var9 += var3.UuUVuuUu(5.0F);
         }

         for (int var12 = 0; var12 < 9; var12++) {
            int var13 = var11 < 3 ? 9 + var11 * 9 + var12 : var12;
            nvvnuuv.VvunVVUvUNnv var14 = new nvvnuuv.VvunVVUvUNnv(
               var8 + var12 * var7, var9 + var11 * var7, var7 - var3.UuUVuuUu(2.0F), var7 - var3.UuUVuuUu(2.0F)
            );
            boolean var15 = var11 == 3 && var6.vNUvnnVnUvu().method_31548().method_67532() == var12;
            class_1799 var16 = var6.vNUvnnVnUvu().method_31548().method_5438(var13);
            this.UuUVuuUu(var1, var2, var3, var4, var14, var16, var13, var15);
            if (var14.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu())) {
               var10 = var16;
            }
         }
      }

      float var17 = var8 + var7 * 9.0F + var3.UuUVuuUu(10.0F);
      class_1304[] var18 = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};

      for (int var19 = 0; var19 < var18.length; var19++) {
         nvvnuuv.VvunVVUvUNnv var21 = new nvvnuuv.VvunVVUvUNnv(var17, var9 + var19 * var7, var7 - var3.UuUVuuUu(2.0F), var7 - var3.UuUVuuUu(2.0F));
         class_1799 var23 = var6.vNUvnnVnUvu().method_6118(var18[var19]);
         this.UuUVuuUu(var1, var2, var3, var4, var21, var23, 100 + var19, false);
         if (var21.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu())) {
            var10 = var23;
         }
      }

      nvvnuuv.VvunVVUvUNnv var20 = new nvvnuuv.VvunVVUvUNnv(
         var17 + var7 + var3.UuUVuuUu(4.0F), var9 + var7 * 3.0F, var7 - var3.UuUVuuUu(2.0F), var7 - var3.UuUVuuUu(2.0F)
      );
      class_1799 var22 = var6.vNUvnnVnUvu().method_6079();
      this.UuUVuuUu(var1, var2, var3, var4, var20, var22, 110, false);
      if (var20.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu())) {
         var10 = var22;
      }

      return var10;
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.VvunVVUvUNnv var5, class_1799 var6, int var7, boolean var8) {
      boolean var9 = var5.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
      int var10 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.vNUvnnVnUvu(var4), var4.NVNnnvnuunNv(), var4.uNnUnnuNUnNu() ? 0.055F : 0.085F);
      float var11 = var8 ? 0.28F : (var9 ? 0.13F : 0.0F);
      var1.UuUVuuUu(var5.x, var5.y, var5.w, var5.h, var3.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var10, var4.UNnVVNvvnVvU(), var11));
      var1.UuUVuuUu(
         var5.x,
         var5.y,
         var5.w,
         var5.h,
         var3.UuUVuuUu(5.0F),
         var8 ? NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 210) : (var9 ? NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 112) : var4.UnUNVVVNuv()),
         var8 ? Math.max(0.9F, var3.UuUVuuUu(1.0F)) : Math.max(0.65F, var3.UuUVuuUu(0.7F))
      );
      if (var6 != null && !var6.method_7960()) {
         float var12 = Math.min(var3.UuUVuuUu(17.0F), var5.w - var3.UuUVuuUu(5.0F));
         float var13 = var5.x + (var5.w - var12) * 0.5F;
         float var14 = var5.y + (var5.h - var12) * 0.5F;
         NuNvVUuUUnun.UuUVuuUu(var1, var6.method_7972(), var13, var14, var12 / 16.0F, var7, true, var7);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.nvnNNunvv var5) {
      var1.UuUVuuUu(
         var5.content.x, var5.content.y, var5.content.w, var5.content.h, var3.UuUVuuUu(4.0F), NUunUunuNV.UuUVuuUu(0, 0, 0, var4.uNnUnnuNUnNu() ? 72 : 124)
      );
      nunvNNUnvU.UuUVuuUu(
         var1, var3, var4, var5.modal.x, var5.modal.y, var5.modal.w, var5.modal.h, var3.UuUVuuUu(14.0F), var3.UuUVuuUu(24.0F), var3.UuUVuuUu(2.0F), 0.9F
      );
      var1.UuUVuuUu(var5.modal.x, var5.modal.y, var5.modal.w, var5.modal.h, var3.UuUVuuUu(14.0F), nunvNNUnvU.vNUvnnVnUvu(var4));
      var1.UuUVuuUu(
         var5.modal.x,
         var5.modal.y,
         var5.modal.w,
         var5.modal.h,
         var3.UuUVuuUu(14.0F),
         NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 108),
         Math.max(0.75F, var3.UuUVuuUu(0.75F))
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var5.modal.x + var3.UuUVuuUu(18.0F),
         var5.modal.y + var3.UuUVuuUu(16.0F),
         12.0F,
         "Добавить бота",
         nunvNNUnvU.UuUVuuUu(var4)
      );
      nunvNNUnvU.UuUVuuUu(var1, var3, vNvnnVvvVUu.UuUVuuUu, var5.nameField.x, var5.nameField.y - var3.UuUVuuUu(13.0F), 7.5F, "Ник", nunvNNUnvU.uUnuvNvvNU(var4));
      nunvNNUnvU.UuUVuuUu(
         var1, var3, vNvnnVvvVUu.UuUVuuUu, var5.addressField.x, var5.addressField.y - var3.UuUVuuUu(13.0F), 7.5F, "Сервер", nunvNNUnvU.uUnuvNvvNU(var4)
      );
      this.uNNnnnuuuN.UuUVuuUu(var1, var3, var4, var5.nameField, "Bot_1", var2.unnUnUNVnN(), var2.NnuUnUNnu());
      this.UuUVuuUu(var1, var2, var3, var4, var5.randomNameButton, "RND", nvvnuuv.NVnVnNnN.NORMAL, false);
      this.nuUnNvnuUu.UuUVuuUu(var1, var3, var4, var5.addressField, "play.example.net:25565", var2.unnUnUNVnN(), var2.NnuUnUNnu());
      this.UuUVuuUu(var1, var2, var3, var4, var5.addCancel, "Отмена", nvvnuuv.NVnVnNnN.NORMAL, false);
      this.UuUVuuUu(var1, var2, var3, var4, var5.addSubmit, "Подключить", nvvnuuv.NVnVnNnN.ACCENT, false);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, nvvnuuv.nvnNNunvv var4) {
      if (!this.nUUVuvU.isBlank() && System.currentTimeMillis() - this.vNVuvnUUnuUn <= 4000L) {
         int var5 = this.UnUNVVVNuv ? var3.C00OOC00oO() : var3.UuUVuuUu();
         float var6 = Math.min(
            var4.detailPanel.w - var2.UuUVuuUu(24.0F), nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, this.nUUVuvU, 8.2F) + var2.UuUVuuUu(20.0F)
         );
         float var7 = var4.detailPanel.x + (var4.detailPanel.w - var6) * 0.5F;
         float var8 = var4.detailPanel.y + var4.detailPanel.h - var2.UuUVuuUu(31.0F);
         var1.UuUVuuUu(var7, var8, var6, var2.UuUVuuUu(22.0F), var2.UuUVuuUu(11.0F), NUunUunuNV.UuUVuuUu(var5, var3.uNnUnnuNUnNu() ? 34 : 45));
         var1.UuUVuuUu(var7, var8, var6, var2.UuUVuuUu(22.0F), var2.UuUVuuUu(11.0F), NUunUunuNV.UuUVuuUu(var5, 120), Math.max(0.5F, var2.UuUVuuUu(0.55F)));
         String var9 = UuUVuuUu(this.nUUVuvU, var6 - var2.UuUVuuUu(16.0F), var2, vNvnnVvvVUu.UuUVuuUu, 8.2F);
         float var10 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var9, 8.2F);
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var7 + (var6 - var10) * 0.5F, var8, var2.UuUVuuUu(22.0F), 8.2F, var9, var5);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, nvvnuuv.VvunVVUvUNnv var4, float var5) {
      int var6 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(nunvNNUnvU.VVuuUN(var3), nunvNNUnvU.vNUvnnVnUvu(var3), 0.22F + UuUVuuUu(var5, 0.0F, 1.0F) * 0.08F), 255
      );
      var1.UuUVuuUu(var4.x, var4.y, var4.w, var4.h, var2.UuUVuuUu(10.0F), var6);
      var1.UuUVuuUu(
         var4.x,
         var4.y,
         var4.w,
         var4.h,
         var2.UuUVuuUu(10.0F),
         var3.uNnUnnuNUnNu() ? nunvNNUnvU.C00OOC00oO(var3, 0.82F) : var3.nvUVNnuu(),
         Math.max(0.55F, var2.UuUVuuUu(0.6F))
      );
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, nvvnuuv.VvunVVUvUNnv var5, String var6, nvvnuuv.NVnVnNnN var7, boolean var8
   ) {
      boolean var9 = var5.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
      float var10 = var8 ? 1.0F : (var9 ? 0.72F : 0.0F);
      int var11 = var7 == nvvnuuv.NVnVnNnN.DANGER ? var4.C00OOC00oO() : var4.uVunuUNVVUUV();
      int var12 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.vNUvnnVnUvu(var4), var4.NVNnnvnuunNv(), var4.uNnUnnuNUnNu() ? 0.045F : 0.085F);
      int var13 = var7 == nvvnuuv.NVnVnNnN.ACCENT
         ? NUunUunuNV.UuUVuuUu(var12, var4.UNnVVNvvnVvU(), 0.24F)
         : (var7 == nvvnuuv.NVnVnNnN.DANGER ? NUunUunuNV.UuUVuuUu(var12, var4.C00OOC00oO(), 0.11F) : var12);
      var1.UuUVuuUu(var5.x, var5.y, var5.w, var5.h, var3.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(var13, var11, var10 * 0.16F));
      int var14 = var4.uNnUnnuNUnNu() ? nunvNNUnvU.C00OOC00oO(var4, 0.95F) : var4.vNVuvnUUnuUn();
      var1.UuUVuuUu(
         var5.x,
         var5.y,
         var5.w,
         var5.h,
         var3.UuUVuuUu(6.0F),
         NUunUunuNV.UuUVuuUu(var14, NUunUunuNV.UuUVuuUu(var11, 185), var10 * 0.78F),
         Math.max(0.7F, var3.UuUVuuUu(0.75F))
      );
      float var15 = nunvNNUnvU.UuUVuuUu(var3, vNvnnVvvVUu.vVvUvVVuuNvV, var6, 8.2F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var5.x + (var5.w - var15) * 0.5F,
         var5.y,
         var5.h,
         8.2F,
         var6,
         var7 == nvvnuuv.NVnVnNnN.DANGER
            ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var4), var4.C00OOC00oO(), 0.78F + var10 * 0.22F)
            : NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var4), nunvNNUnvU.UuUVuuUu(var4), 0.68F + var10 * 0.32F)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, nvvnuuv.VvunVVUvUNnv var4, String var5) {
      int var6 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.vNUvnnVnUvu(var3), var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 0.04F : 0.075F);
      var1.UuUVuuUu(var4.x, var4.y, var4.w, var4.h, var2.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var6, var3.UNnVVNvvnVvU(), 0.24F));
      var1.UuUVuuUu(var4.x, var4.y, var4.w, var4.h, var2.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 180), Math.max(0.65F, var2.UuUVuuUu(0.7F)));
      float var7 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var5, 8.0F);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var4.x + (var4.w - var7) * 0.5F, var4.y, var4.h, 8.0F, var5, var3.vVvUvVVuuNvV());
   }

   private void uUnuvNvvNU() {
      this.nvUVNnuu = true;
      this.VVuuUN.UuUVuuUu(false);
      this.VVuuUN.UuUVuuUu("");
      this.uVUuuVnNVU = null;
      this.uNNnnnuuuN.UuUVuuUu(nuUnNvnuUu());
      this.nuUnNvnuUu.UuUVuuUu(VVuuUN());
      this.uNNnnnuuuN.UuUVuuUu(true);
      this.nuUnNvnuUu.UuUVuuUu(false);
   }

   private void vVvUvVVuuNvV() {
      this.nvUVNnuu = false;
      this.uNNnnnuuuN.UuUVuuUu(false);
      this.nuUnNvnuUu.UuUVuuUu(false);
   }

   private void uNNnnnuuuN() {
      String var1 = this.uNNnnnuuuN.UuUVuuUu().trim();
      String var2 = this.nuUnNvnuUu.UuUVuuUu().trim();
      if (!var1.isEmpty() && !var2.isEmpty()) {
         if (OCO0OoO.UuUVuuUu(var1, var2)) {
            this.C00OOC00oO(var1);
            this.vVvUvVVuuNvV();
            this.UuUVuuUu("Подключение запущено", false);
         } else {
            this.UuUVuuUu("Проверьте ник, адрес или дубликаты", true);
         }
      } else {
         this.UuUVuuUu("Укажите ник и адрес сервера", true);
      }
   }

   private static String nuUnNvnuUu() {
      ThreadLocalRandom var0 = ThreadLocalRandom.current();

      for (int var1 = 0; var1 < 24; var1++) {
         String var2 = uUnuvNvvNU[var0.nextInt(uUnuvNvvNU.length)] + vVvUvVVuuNvV[var0.nextInt(vVvUvVVuuNvV.length)] + var0.nextInt(10, 1000);
         if (var2.length() > 16) {
            var2 = var2.substring(0, 16);
         }

         if (nnVNNuuVUVn.UuUVuuUu(var2) == null) {
            return var2;
         }
      }

      String var3 = "Bot" + Integer.toUnsignedString(var0.nextInt(), 36);
      return var3.substring(0, Math.min(16, var3.length()));
   }

   private void UuUVuuUu(nnVNNuuVUVn.NVnVnNnN var1) {
      vUNVNUnuv var2 = var1.bot();
      String var3 = this.VVuuUN.UuUVuuUu().trim();
      if (var2 != null && var2.UuUVuuUu(var3)) {
         this.VVuuUN.UuUVuuUu("");
         this.UuUVuuUu("Сообщение отправлено от " + var1.name(), false);
      } else {
         this.UuUVuuUu("Сообщение не отправлено: бот офлайн или текст некорректен", true);
      }
   }

   private List<nnVNNuuVUVn.NVnVnNnN> UuUVuuUu(String var1) {
      ArrayList var2 = new ArrayList<>(nnVNNuuVUVn.C00OOC00oO());
      var2.sort(
         Comparator.<nnVNNuuVUVn.NVnVnNnN>comparingInt(var0 -> uUnuvNvvNU(var0.state() == null ? "" : var0.state().name()))
            .thenComparing(nnVNNuuVUVn.NVnVnNnN::name, String.CASE_INSENSITIVE_ORDER)
      );
      String var3 = var1 == null ? "" : var1.trim().toLowerCase(Locale.ROOT);
      if (!var3.isEmpty()) {
         var2.removeIf(
            var1x -> !var1x.name().toLowerCase(Locale.ROOT).contains(var3)
               && !var1x.address().toLowerCase(Locale.ROOT).contains(var3)
               && !vVvUvVVuuNvV(var1x.status()).toLowerCase(Locale.ROOT).contains(var3)
         );
      }

      return var2;
   }

   private nnVNNuuVUVn.NVnVnNnN UuUVuuUu(List<nnVNNuuVUVn.NVnVnNnN> var1) {
      nnVNNuuVUVn.NVnVnNnN var2 = this.vNUvnnVnUvu == null ? null : nnVNNuuVUVn.UuUVuuUu(this.vNUvnnVnUvu);
      if (var2 != null) {
         String var3 = var2.name();
         if (var1.stream().noneMatch(var1x -> var1x.name().equalsIgnoreCase(var3))) {
            this.C00OOC00oO(null);
            var2 = null;
         }
      }

      if (var2 == null && !var1.isEmpty()) {
         var2 = (nnVNNuuVUVn.NVnVnNnN)var1.get(0);
         this.C00OOC00oO(var2.name());
      }

      return var2;
   }

   private void C00OOC00oO(String var1) {
      boolean var2 = this.vNUvnnVnUvu == null ? var1 != null : var1 == null || !this.vNUvnnVnUvu.equalsIgnoreCase(var1);
      this.vNUvnnVnUvu = var1;
      if (var2) {
         this.VVuuUN.UuUVuuUu(false);
         this.VVuuUN.UuUVuuUu("");
         this.uVUuuVnNVU = null;
      }
   }

   private void UuUVuuUu(String var1, boolean var2) {
      this.nUUVuvU = var1 == null ? "" : var1;
      this.UnUNVVVNuv = var2;
      this.vNVuvnUUnuUn = System.currentTimeMillis();
   }

   private static int UuUVuuUu(NUunUunuNV var0, nnVNNuuVUVn.NVnVnNnN var1) {
      String var2 = var1.state() == null ? "" : var1.state().name();
      if ("JOINED".equals(var2)) {
         return var0.UuUVuuUu();
      } else if ("ERROR".equals(var2)) {
         return var0.C00OOC00oO();
      } else {
         return !"DISCONNECTED".equals(var2) && !"SAVED".equals(var2) ? var0.uUnuvNvvNU() : nunvNNUnvU.C00OOC00oO(var0);
      }
   }

   private static int uUnuvNvvNU(String var0) {
      return switch (var0) {
         case "JOINED" -> 0;
         case "RESOLVING", "CONNECTING", "LOGIN", "CONFIGURING", "RECONFIGURING" -> 1;
         case "ERROR" -> 2;
         default -> 3;
      };
   }

   private static String C00OOC00oO(nnVNNuuVUVn.NVnVnNnN var0) {
      String var1 = vVvUvVVuuNvV(var0.status());
      if (!var1.isBlank()) {
         return var1;
      } else {
         String var2 = var0.state() == null ? "SAVED" : var0.state().name();

         return switch (var2) {
            case "JOINED" -> "В игре";
            case "RESOLVING" -> "Поиск сервера";
            case "CONNECTING" -> "Соединение";
            case "LOGIN" -> "Вход";
            case "CONFIGURING" -> "Настройка";
            case "RECONFIGURING" -> "Смена сервера";
            case "ERROR" -> "Ошибка";
            case "DISCONNECTED" -> "Отключён";
            default -> "Сохранён";
         };
      }
   }

   private static String vVvUvVVuuNvV(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)§[0-9A-FK-OR]", "").replace("Â", "").trim();
   }

   private static String VVuuUN() {
      class_310 var0 = class_310.method_1551();
      return var0 != null && var0.method_1558() != null ? var0.method_1558().field_3761 : "";
   }

   private static String UuUVuuUu(String var0, float var1, nUvnuVnNUU var2, nUVnuvUu var3, float var4) {
      String var5 = var0 == null ? "" : var0;
      if (nunvNNUnvU.UuUVuuUu(var2, var3, var5, var4) <= var1) {
         return var5;
      } else {
         String var6 = "…";
         int var7 = var5.length();

         while (var7 > 0 && nunvNNUnvU.UuUVuuUu(var2, var3, var5.substring(0, var7) + var6, var4) > var1) {
            var7--;
         }

         return var7 <= 0 ? var6 : var5.substring(0, var7) + var6;
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, float var2, float var3, int var4) {
      float var5 = var1.UuUVuuUu(0.8F);
      var0.UuUVuuUu(var2 - 7.0F * var5, var3 - 5.0F * var5, 14.0F * var5, 10.0F * var5, 3.0F * var5, var4, Math.max(0.7F, var1.UuUVuuUu(0.75F)));
      var0.C00OOC00oO(var2 - 3.0F * var5, var3 - 1.0F * var5, 1.3F * var5, 0.0F, 1.0F, var4);
      var0.C00OOC00oO(var2 + 3.0F * var5, var3 - 1.0F * var5, 1.3F * var5, 0.0F, 1.0F, var4);
      var0.UuUVuuUu(var2 - 3.0F * var5, var3 + 2.5F * var5, 6.0F * var5, Math.max(0.7F, var1.UuUVuuUu(0.65F)), 0.4F * var5, var4);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   static enum NVnVnNnN {
      NORMAL,
      ACCENT,
      DANGER;
   }

   record VvunVVUvUNnv(float x, float y, float w, float h) {

      boolean contains(float var1, float var2) {
         return var1 >= this.x && var2 >= this.y && var1 < this.x + this.w && var2 < this.y + this.h;
      }

      boolean intersects(nvvnuuv.VvunVVUvUNnv var1) {
         return this.x < var1.x + var1.w && this.x + this.w > var1.x && this.y < var1.y + var1.h && this.y + this.h > var1.y;
      }
   }

   record nvnNNunvv(
      nvvnuuv.VvunVVUvUNnv content,
      nvvnuuv.VvunVVUvUNnv listPanel,
      nvvnuuv.VvunVVUvUNnv listViewport,
      nvvnuuv.VvunVVUvUNnv addButton,
      nvvnuuv.VvunVVUvUNnv hostButton,
      nvvnuuv.VvunVVUvUNnv detailPanel,
      nvvnuuv.VvunVVUvUNnv forgetButton,
      nvvnuuv.VvunVVUvUNnv controlButton,
      nvvnuuv.VvunVVUvUNnv modulesButton,
      nvvnuuv.VvunVVUvUNnv reconnectButton,
      nvvnuuv.VvunVVUvUNnv disconnectButton,
      nvvnuuv.VvunVVUvUNnv chatField,
      nvvnuuv.VvunVVUvUNnv sendButton,
      nvvnuuv.VvunVVUvUNnv stats,
      nvvnuuv.VvunVVUvUNnv inventoryTab,
      nvvnuuv.VvunVVUvUNnv inventoryArea,
      nvvnuuv.VvunVVUvUNnv modal,
      nvvnuuv.VvunVVUvUNnv nameField,
      nvvnuuv.VvunVVUvUNnv randomNameButton,
      nvvnuuv.VvunVVUvUNnv addressField,
      nvvnuuv.VvunVVUvUNnv addCancel,
      nvvnuuv.VvunVVUvUNnv addSubmit,
      float rowHeight,
      float rowGap,
      float slot
   ) {

      static nvvnuuv.nvnNNunvv of(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
         float var2 = var1.UuUVuuUu(13.0F);
         nvvnuuv.VvunVVUvUNnv var3 = new nvvnuuv.VvunVVUvUNnv(var0.vNVuvnUUnuUn(), var0.UvnvNVnnnnNU(), var0.uVUVnuvnuVuv(), var0.NVNnnvnuunNv());
         float var4 = var3.x + var2;
         float var5 = var3.y + var2;
         float var6 = var3.w - var2 * 2.0F;
         float var7 = var3.h - var2 * 2.0F;
         float var8 = var1.UuUVuuUu(10.0F);
         float var9 = Math.min(var1.UuUVuuUu(226.0F), var6 * 0.34F);
         nvvnuuv.VvunVVUvUNnv var10 = new nvvnuuv.VvunVVUvUNnv(var4, var5, var9, var7);
         nvvnuuv.VvunVVUvUNnv var11 = new nvvnuuv.VvunVVUvUNnv(var4 + var9 + var8, var5, var6 - var9 - var8, var7);
         nvvnuuv.VvunVVUvUNnv var12 = new nvvnuuv.VvunVVUvUNnv(
            var10.x + var10.w - var1.UuUVuuUu(82.0F), var10.y + var1.UuUVuuUu(7.0F), var1.UuUVuuUu(73.0F), var1.UuUVuuUu(25.0F)
         );
         nvvnuuv.VvunVVUvUNnv var13 = new nvvnuuv.VvunVVUvUNnv(var12.x - var1.UuUVuuUu(56.0F), var12.y, var1.UuUVuuUu(50.0F), var12.h);
         nvvnuuv.VvunVVUvUNnv var14 = new nvvnuuv.VvunVVUvUNnv(
            var10.x + var1.UuUVuuUu(8.0F), var10.y + var1.UuUVuuUu(41.0F), var10.w - var1.UuUVuuUu(16.0F), var10.h - var1.UuUVuuUu(49.0F)
         );
         nvvnuuv.VvunVVUvUNnv var15 = new nvvnuuv.VvunVVUvUNnv(
            var11.x + var11.w - var1.UuUVuuUu(73.0F), var11.y + var1.UuUVuuUu(9.0F), var1.UuUVuuUu(63.0F), var1.UuUVuuUu(25.0F)
         );
         float var16 = var11.y + var1.UuUVuuUu(54.0F);
         float var17 = var1.UuUVuuUu(5.0F);
         float var18 = (var11.w - var1.UuUVuuUu(20.0F) - var17 * 3.0F) / 4.0F;
         float var19 = var11.x + var1.UuUVuuUu(10.0F);
         nvvnuuv.VvunVVUvUNnv var20 = new nvvnuuv.VvunVVUvUNnv(var19, var16, var18, var1.UuUVuuUu(28.0F));
         nvvnuuv.VvunVVUvUNnv var21 = new nvvnuuv.VvunVVUvUNnv(var19 + var18 + var17, var16, var18, var1.UuUVuuUu(28.0F));
         nvvnuuv.VvunVVUvUNnv var22 = new nvvnuuv.VvunVVUvUNnv(var19 + (var18 + var17) * 2.0F, var16, var18, var1.UuUVuuUu(28.0F));
         nvvnuuv.VvunVVUvUNnv var23 = new nvvnuuv.VvunVVUvUNnv(var19 + (var18 + var17) * 3.0F, var16, var18, var1.UuUVuuUu(28.0F));
         float var24 = var16 + var1.UuUVuuUu(36.0F);
         nvvnuuv.VvunVVUvUNnv var25 = new nvvnuuv.VvunVVUvUNnv(var11.x + var11.w - var1.UuUVuuUu(86.0F), var24, var1.UuUVuuUu(76.0F), var1.UuUVuuUu(29.0F));
         nvvnuuv.VvunVVUvUNnv var26 = new nvvnuuv.VvunVVUvUNnv(
            var11.x + var1.UuUVuuUu(10.0F), var24, var25.x - var11.x - var1.UuUVuuUu(17.0F), var1.UuUVuuUu(29.0F)
         );
         nvvnuuv.VvunVVUvUNnv var27 = new nvvnuuv.VvunVVUvUNnv(
            var11.x + var1.UuUVuuUu(10.0F), var24 + var1.UuUVuuUu(38.0F), var11.w - var1.UuUVuuUu(20.0F), var1.UuUVuuUu(34.0F)
         );
         float var28 = var1.UuUVuuUu(25.0F);
         float var29 = Math.min(var11.w - var1.UuUVuuUu(24.0F), var28 * 11.0F + var1.UuUVuuUu(12.0F));
         float var30 = var28 * 4.0F + var1.UuUVuuUu(24.0F);
         float var31 = var11.x + (var11.w - var29) * 0.5F;
         float var32 = var1.UuUVuuUu(30.0F) + var30 + var1.UuUVuuUu(5.0F);
         float var33 = var27.y + var27.h + var1.UuUVuuUu(9.0F);
         float var34 = var11.y + var11.h - var1.UuUVuuUu(39.0F);
         float var35 = Math.max(0.0F, var34 - var33);
         float var36 = var33 + Math.max(0.0F, (var35 - var32) * 0.5F);
         nvvnuuv.VvunVVUvUNnv var37 = new nvvnuuv.VvunVVUvUNnv(var31 + (var29 - var1.UuUVuuUu(80.0F)) * 0.5F, var36, var1.UuUVuuUu(80.0F), var1.UuUVuuUu(24.0F));
         nvvnuuv.VvunVVUvUNnv var38 = new nvvnuuv.VvunVVUvUNnv(var31, var36 + var1.UuUVuuUu(30.0F), var29, var30);
         float var39 = Math.min(var1.UuUVuuUu(430.0F), var3.w - var1.UuUVuuUu(44.0F));
         float var40 = var1.UuUVuuUu(164.0F);
         nvvnuuv.VvunVVUvUNnv var41 = new nvvnuuv.VvunVVUvUNnv(var3.x + (var3.w - var39) * 0.5F, var3.y + (var3.h - var40) * 0.5F, var39, var40);
         float var42 = var41.y + var1.UuUVuuUu(58.0F);
         float var43 = var1.UuUVuuUu(96.0F);
         nvvnuuv.VvunVVUvUNnv var44 = new nvvnuuv.VvunVVUvUNnv(var41.x + var1.UuUVuuUu(18.0F), var42, var43, var1.UuUVuuUu(30.0F));
         nvvnuuv.VvunVVUvUNnv var45 = new nvvnuuv.VvunVVUvUNnv(var44.x + var44.w + var1.UuUVuuUu(6.0F), var42, var1.UuUVuuUu(30.0F), var1.UuUVuuUu(30.0F));
         nvvnuuv.VvunVVUvUNnv var46 = new nvvnuuv.VvunVVUvUNnv(
            var45.x + var45.w + var1.UuUVuuUu(9.0F),
            var42,
            var41.x + var41.w - var1.UuUVuuUu(18.0F) - var45.x - var45.w - var1.UuUVuuUu(9.0F),
            var1.UuUVuuUu(30.0F)
         );
         float var47 = var1.UuUVuuUu(181.0F);
         float var48 = var41.x + (var41.w - var47) * 0.5F;
         nvvnuuv.VvunVVUvUNnv var49 = new nvvnuuv.VvunVVUvUNnv(var48, var41.y + var1.UuUVuuUu(103.0F), var1.UuUVuuUu(76.0F), var1.UuUVuuUu(29.0F));
         nvvnuuv.VvunVVUvUNnv var50 = new nvvnuuv.VvunVVUvUNnv(var49.x + var49.w + var1.UuUVuuUu(7.0F), var49.y, var1.UuUVuuUu(98.0F), var1.UuUVuuUu(29.0F));
         return new nvvnuuv.nvnNNunvv(
            var3,
            var10,
            var14,
            var12,
            var13,
            var11,
            var15,
            var20,
            var21,
            var22,
            var23,
            var26,
            var25,
            var27,
            var37,
            var38,
            var41,
            var44,
            var45,
            var46,
            var49,
            var50,
            var1.UuUVuuUu(57.0F),
            var1.UuUVuuUu(6.0F),
            var28
         );
      }
   }

   static final class uunvUUVnuNn {
      private final int UuUVuuUu;
      private final IntPredicate C00OOC00oO;
      private String uUnuvNvvNU = "";
      private int vVvUvVVuuNvV;
      private int uNNnnnuuuN;
      private boolean nuUnNvnuUu;
      private long VVuuUN;

      uunvUUVnuNn(int var1, IntPredicate var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }

      String UuUVuuUu() {
         return this.uUnuvNvvNU;
      }

      void UuUVuuUu(String var1) {
         this.uUnuvNvvNU = var1 == null ? "" : var1.substring(0, Math.min(this.UuUVuuUu, var1.length()));
         this.vVvUvVVuuNvV = this.uUnuvNvvNU.length();
         this.uNNnnnuuuN = this.vVvUvVVuuNvV;
      }

      boolean C00OOC00oO() {
         return this.nuUnNvnuUu;
      }

      void UuUVuuUu(boolean var1) {
         this.nuUnNvnuUu = var1;
         if (var1) {
            this.vVvUvVVuuNvV = Math.min(this.vVvUvVVuuNvV, this.uUnuvNvvNU.length());
            this.uNNnnnuuuN = this.vVvUvVVuuNvV;
            this.VVuuUN = System.currentTimeMillis();
         }
      }

      boolean UuUVuuUu(nvvnuuv.VvunVVUvUNnv var1, float var2, float var3) {
         boolean var4 = var1.contains(var2, var3);
         this.UuUVuuUu(var4);
         if (var4) {
            this.vVvUvVVuuNvV = this.uUnuvNvvNU.length();
            this.uNNnnnuuuN = this.vVvUvVVuuNvV;
         }

         return var4;
      }

      boolean UuUVuuUu(char var1) {
         if (this.nuUnNvnuUu && this.C00OOC00oO.test(var1)) {
            this.uUnuvNvvNU(Character.toString(var1));
            return true;
         } else {
            return false;
         }
      }

      boolean UuUVuuUu(int var1) {
         if (!this.nuUnNvnuUu) {
            return false;
         } else {
            boolean var2 = class_437.method_25441();
            boolean var3 = class_437.method_25442();
            class_310 var4 = class_310.method_1551();
            if (var2) {
               if (var1 == 65) {
                  this.uNNnnnuuuN = 0;
                  this.vVvUvVVuuNvV = this.uUnuvNvvNU.length();
                  return true;
               }

               if (var1 == 67) {
                  if (this.uUnuvNvvNU() && var4 != null) {
                     var4.field_1774.method_1455(this.vVvUvVVuuNvV());
                  }

                  return true;
               }

               if (var1 == 88) {
                  if (this.uUnuvNvvNU() && var4 != null) {
                     var4.field_1774.method_1455(this.vVvUvVVuuNvV());
                     this.uUnuvNvvNU("");
                  }

                  return true;
               }

               if (var1 == 86) {
                  if (var4 != null) {
                     this.C00OOC00oO(var4.field_1774.method_1460());
                  }

                  return true;
               }
            }

            switch (var1) {
               case 259:
                  if (this.uUnuvNvvNU()) {
                     this.uUnuvNvvNU("");
                  } else if (this.vVvUvVVuuNvV > 0) {
                     this.uUnuvNvvNU = this.uUnuvNvvNU.substring(0, this.vVvUvVVuuNvV - 1) + this.uUnuvNvvNU.substring(this.vVvUvVVuuNvV);
                     this.vVvUvVVuuNvV--;
                     this.uNNnnnuuuN = this.vVvUvVVuuNvV;
                  }
                  break;
               case 260:
               case 264:
               case 265:
               case 266:
               case 267:
               default:
                  return true;
               case 261:
                  if (this.uUnuvNvvNU()) {
                     this.uUnuvNvvNU("");
                  } else if (this.vVvUvVVuuNvV < this.uUnuvNvvNU.length()) {
                     this.uUnuvNvvNU = this.uUnuvNvvNU.substring(0, this.vVvUvVVuuNvV) + this.uUnuvNvvNU.substring(this.vVvUvVVuuNvV + 1);
                     this.uNNnnnuuuN = this.vVvUvVVuuNvV;
                  }
                  break;
               case 262:
                  this.UuUVuuUu(this.vVvUvVVuuNvV + 1, var3);
                  break;
               case 263:
                  this.UuUVuuUu(this.vVvUvVVuuNvV - 1, var3);
                  break;
               case 268:
                  this.UuUVuuUu(0, var3);
                  break;
               case 269:
                  this.UuUVuuUu(this.uUnuvNvvNU.length(), var3);
            }

            this.VVuuUN = System.currentTimeMillis();
            return true;
         }
      }

      void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, nvvnuuv.VvunVVUvUNnv var4, String var5, float var6, float var7) {
         boolean var8 = var4.contains(var6, var7);
         float var9 = this.nuUnNvnuUu ? 1.0F : (var8 ? 0.55F : 0.0F);
         int var10 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.vNUvnnVnUvu(var3), var3.NVNnnvnuunNv(), var3.uNnUnnuNUnNu() ? 0.04F : 0.075F);
         var1.UuUVuuUu(var4.x, var4.y, var4.w, var4.h, var2.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(var10, var3.UNnVVNvvnVvU(), var9 * 0.12F));
         var1.UuUVuuUu(
            var4.x,
            var4.y,
            var4.w,
            var4.h,
            var2.UuUVuuUu(6.0F),
            NUunUunuNV.UuUVuuUu(var3.UnUNVVVNuv(), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 180), var9),
            this.nuUnNvnuUu ? Math.max(0.85F, var2.UuUVuuUu(0.9F)) : Math.max(0.65F, var2.UuUVuuUu(0.7F))
         );
         String var11 = this.uUnuvNvvNU.isEmpty() && !this.nuUnNvnuUu ? var5 : this.uUnuvNvvNU;
         int var12 = this.uUnuvNvvNU.isEmpty() && !this.nuUnNvnuUu ? nunvNNUnvU.uUnuvNvvNU(var3) : nunvNNUnvU.UuUVuuUu(var3);
         float var13 = var4.w - var2.UuUVuuUu(16.0F);
         String var14 = UuUVuuUu(var11, var13, var2, 8.7F);
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var4.x + var2.UuUVuuUu(8.0F), var4.y, var4.h, 8.7F, var14, var12);
         if (this.nuUnNvnuUu && (System.currentTimeMillis() - this.VVuuUN) % 1000L < 530L) {
            String var15 = this.uUnuvNvvNU.substring(0, Math.min(this.vVvUvVVuuNvV, this.uUnuvNvvNU.length()));
            float var16 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var15, 8.7F);
            float var17 = Math.min(var4.x + var4.w - var2.UuUVuuUu(7.0F), var4.x + var2.UuUVuuUu(8.0F) + var16);
            var1.UuUVuuUu(var17, var4.y + var2.UuUVuuUu(6.0F), Math.max(1.0F, var2.UuUVuuUu(0.75F)), var4.h - var2.UuUVuuUu(12.0F), 0.0F, var3.uVunuUNVVUUV());
         }
      }

      private void C00OOC00oO(String var1) {
         if (var1 != null && !var1.isEmpty()) {
            StringBuilder var2 = new StringBuilder();
            var1.codePoints().forEach(var2x -> {
               if (this.C00OOC00oO.test(var2x) && var2.length() < this.UuUVuuUu) {
                  var2.appendCodePoint(var2x);
               }
            });
            this.uUnuvNvvNU(var2.toString());
         }
      }

      private void uUnuvNvvNU(String var1) {
         int var2 = Math.min(this.vVvUvVVuuNvV, this.uNNnnnuuuN);
         int var3 = Math.max(this.vVvUvVVuuNvV, this.uNNnnnuuuN);
         int var4 = this.UuUVuuUu - (this.uUnuvNvvNU.length() - (var3 - var2));
         String var5 = var1 == null ? "" : var1.substring(0, Math.min(var4, var1.length()));
         this.uUnuvNvvNU = this.uUnuvNvvNU.substring(0, var2) + var5 + this.uUnuvNvvNU.substring(var3);
         this.vVvUvVVuuNvV = var2 + var5.length();
         this.uNNnnnuuuN = this.vVvUvVVuuNvV;
         this.VVuuUN = System.currentTimeMillis();
      }

      private void UuUVuuUu(int var1, boolean var2) {
         this.vVvUvVVuuNvV = Math.max(0, Math.min(this.uUnuvNvvNU.length(), var1));
         if (!var2) {
            this.uNNnnnuuuN = this.vVvUvVVuuNvV;
         }

         this.VVuuUN = System.currentTimeMillis();
      }

      private boolean uUnuvNvvNU() {
         return this.vVvUvVVuuNvV != this.uNNnnnuuuN;
      }

      private String vVvUvVVuuNvV() {
         return this.uUnuvNvvNU.substring(Math.min(this.vVvUvVVuuNvV, this.uNNnnnuuuN), Math.max(this.vVvUvVVuuNvV, this.uNNnnnuuuN));
      }

      private static String UuUVuuUu(String var0, float var1, nUvnuVnNUU var2, float var3) {
         if (nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var0, var3) <= var1) {
            return var0;
         } else {
            int var4 = 0;

            while (var4 < var0.length() && nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, "…" + var0.substring(var4), var3) > var1) {
               var4++;
            }

            return "…" + var0.substring(Math.min(var4, var0.length()));
         }
      }
   }
}
