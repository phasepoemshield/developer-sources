package ru.metaculture.protection;

import net.minecraft.class_310;

public abstract class nnvNuuNvvuu extends vVvnUVnUvv {
   public static final String C00OOC00oO = "Тёмный";
   public static final String uUnuvNvvNU = "Светлый";
   public static final String vVvUvVVuuNvV = "Блюр";
   public static final String uNNnnnuuuN = "Неоморфизм";
   public static final String nuUnNvnuUu = "Феррофлюид";
   public static final String VVuuUN = "Призма";
   public static final String vNUvnnVnUvu = "Призма Core";
   public static final String uVUuuVnNVU = "Нео дистанция";
   public static final String vuuuNvNuv = "Нео размытие";
   public static final String nvUVNnuu = "Нео интенсивность";
   public static final String UuuNnUvUuv = "Нео форма";
   public static final String nUUVuvU = "Плоская";
   public static final String UnUNVVVNuv = "Выпуклая";
   public static final String vNVuvnUUnuUn = "Вогнутая";
   protected static final float UvnvNVnnnnNU = 7.0F;
   protected static final float uVUVnuvnuVuv = 5.0F;
   protected static final float NVNnnvnuunNv = 10.0F;
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
   public final UvNnUnuNUUU uNnUnnuNUnNu = new UvNnUnuNUUU("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Неоморфизм", "Феррофлюид", "Призма");
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Нео дистанция", 5.5F, 2.0F, 18.0F, 0.5F, false).UuUVuuUu(() -> !this.nvUVNnuu());
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Нео размытие", 18.0F, 6.0F, 48.0F, 1.0F, false).UuUVuuUu(() -> !this.nvUVNnuu());
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Нео интенсивность", 0.72F, 0.1F, 1.0F, 0.05F, true).UuUVuuUu(() -> !this.nvUVNnuu());
   public final UvNnUnuNUUU uUVuVvuNUvnu = new UvNnUnuNUUU("Нео форма", "Выпуклая", "Плоская", "Выпуклая", "Вогнутая").UuUVuuUu(() -> !this.nvUVNnuu());
   public final VUVnvvnNN UvUvUNuvNU = new VUVnvvnNN(
      "Визуал",
      new vvNnnUNnVvn("Тень", true),
      new vvNnnUNnVvn("Обводка", true),
      new vvNnnUNnVvn("Темные зоны", true),
      new vvNnnUNnVvn("Верхняя накладка", true),
      new vvNnnUNnVvn("Нижняя накладка", true),
      new vvNnnUNnVvn("Тёмный рект поверх", true)
   );
   private NvVNvUvunNNu UuUVuuUu;
   private boolean c0oOOCcCoC0;
   private NUunUunuNV VVnVNnunVvu;
   private OO0OCoOC.VvunVVUvUNnv unNNVVNnvvV;
   private NvVNvUvunNNu NuunnvnN;
   private long NVUunUNUN = Long.MIN_VALUE;
   private int UUVNuUNUvUnV;
   private float vuvnUnVnUNnV = 0.5F;
   private float nnuUVNUuvvVU = 0.5F;
   private int nVVUuvuNnUN;
   private final UUNnvUVnnnnN nNnVnUNVV = new UUNnvUVnnnnN(0.0F);
   private static final OO0OCoOC nuunNvv = OO0OCoOC.UuUVuuUu();

   public nnvNuuNvvuu() {
      this.UuUVuuUu(this.uVunuUNVVUUV);
      this.UuUVuuUu(this.UNnVVNvvnVvU);
      this.UuUVuuUu(this.uNnUnnuNUnNu);
      this.UuUVuuUu(this.NnUuNNU);
      this.UuUVuuUu(this.nNvNUVU);
      this.UuUVuuUu(this.UnUNuUU);
      this.UuUVuuUu(this.uUVuVvuNUvnu);
      this.UuUVuuUu(this.UvUvUNuvNU);
   }

   public int UuUVuuUu(float var1) {
      if (this.nvUVNnuu()) {
         return VVNunVNVuuu.UuUVuuUu(var1);
      } else if (this.UuuNnUvUuv()) {
         int var7 = (int)(232.0F * var1);
         float var8 = this.vNVuvnUUnuUn();
         int var9 = VnVnuUn.uUnuvNvvNU(VnVnuUn.uUnuvNvvNU(13, 15, 24, var7), VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().UNnVVNvvnVvU(), var7), 0.12F);
         int var5 = VnVnuUn.uUnuvNvvNU(
            VnVnuUn.uUnuvNvvNU(250, 253, 255, (int)(152.0F * var1)), VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().uVunuUNVVUUV(), (int)(132.0F * var1)), 0.055F
         );
         return VnVnuUn.uUnuvNvvNU(var9, var5, var8);
      } else if (this.nUUVuvU()) {
         int var6 = (int)(172.0F * var1);
         return VnVnuUn.uUnuvNvvNU(VnVnuUn.uUnuvNvvNU(14, 18, 30, var6), VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().UNnVVNvvnVvU(), var6), 0.1F);
      } else {
         int var2 = (int)(255.0F * var1);
         if (this.UnUNVVVNuv()) {
            return VnVnuUn.UuUVuuUu(this.uVunuUNVVUUV(), (int)((this.C00OOC00oO() ? 152 : 176) * var1));
         } else {
            String var3 = this.uNnUnnuNUnNu.uUnuvNvvNU();

            return switch (var3) {
               case "Светлый" -> VnVnuUn.uUnuvNvvNU(240, 240, 245, var2);
               case "Блюр" -> VnVnuUn.uUnuvNvvNU(21, 22, 26, this.uVUuuVnNVU() ? (int)(122.0F * var1) : 0);
               default -> VnVnuUn.uUnuvNvvNU(20, 20, 20, var2);
            };
         }
      }
   }

   public int C00OOC00oO(float var1) {
      return this.UuUVuuUu(var1, this.VVuuUN());
   }

   public int uUnuvNvvNU(float var1) {
      return this.UuUVuuUu(var1, this.vNUvnnVnUvu());
   }

   private int UuUVuuUu(float var1, boolean var2) {
      if (!var2) {
         return VnVnuUn.uUnuvNvvNU(0, 0, 0, 0);
      } else if (this.nvUVNnuu()) {
         return VVNunVNVuuu.UuUVuuUu(var1);
      } else {
         float var3 = this.vuuuNvNuv(var1);
         if (this.UuuNnUvUuv()) {
            int var9 = (int)(202.0F * var3);
            float var10 = this.vNVuvnUUnuUn();
            int var11 = VnVnuUn.uUnuvNvvNU(VnVnuUn.uUnuvNvvNU(15, 18, 30, var9), VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().uVunuUNVVUUV(), var9), 0.1F);
            int var7 = VnVnuUn.uUnuvNvvNU(
               VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(132.0F * var3)), VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().UNnVVNvvnVvU(), (int)(118.0F * var3)), 0.06F
            );
            return VnVnuUn.uUnuvNvvNU(var11, var7, var10);
         } else if (this.nUUVuvU()) {
            int var8 = (int)(150.0F * var3);
            return VnVnuUn.uUnuvNvvNU(VnVnuUn.uUnuvNvvNU(12, 16, 26, var8), VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().uVunuUNVVUUV(), var8), 0.08F);
         } else {
            int var4 = (int)(255.0F * var3);
            if (this.UnUNVVVNuv()) {
               return VnVnuUn.UuUVuuUu(this.UNnVVNvvnVvU(), (int)((this.C00OOC00oO() ? 138 : 160) * var3));
            } else {
               String var5 = this.uNnUnnuNUnNu.uUnuvNvvNU();

               return switch (var5) {
                  case "Светлый" -> VnVnuUn.uUnuvNvvNU(200, 200, 205, var4);
                  case "Блюр" -> VnVnuUn.uUnuvNvvNU(21, 22, 26, (int)(184.0F * var3));
                  default -> VnVnuUn.uUnuvNvvNU(25, 25, 25, var4);
               };
            }
         }
      }
   }

   public int vVvUvVVuuNvV(float var1) {
      if (this.nvUVNnuu()) {
         return VnVnuUn.uUnuvNvvNU(0, 0, 0, 0);
      } else if (this.UuuNnUvUuv()) {
         float var6 = this.vNVuvnUUnuUn();
         int var7 = VnVnuUn.UuUVuuUu(this.UnUNuUU(), (int)(92.0F * var1));
         int var8 = VnVnuUn.uUnuvNvvNU(VnVnuUn.uUnuvNvvNU(20, 28, 42, (int)(56.0F * var1)), VnVnuUn.UuUVuuUu(this.uUVuVvuNUvnu(), (int)(76.0F * var1)), 0.35F);
         return VnVnuUn.uUnuvNvvNU(var7, var8, var6);
      } else if (this.nUUVuvU()) {
         int var5 = VnVnuUn.uUnuvNvvNU(this.uVUVnuvnuVuv().uVunuUNVVUUV(), this.uVUVnuvnuVuv().UNnVVNvvnVvU(), 0.5F);
         return VnVnuUn.UuUVuuUu(var5, (int)(70.0F * var1));
      } else {
         int var2 = (int)(255.0F * var1);
         if (this.UvnvNVnnnnNU() == NvVNvUvunNNu.VERNAL_SOLSTICE) {
            return VnVnuUn.uUnuvNvvNU(5, 17, 5, (int)(46.0F * var1));
         } else if (this.UnUNVVVNuv()) {
            return VnVnuUn.UuUVuuUu(this.uNnUnnuNUnNu(), (int)((this.C00OOC00oO() ? 38 : 48) * var1));
         } else {
            String var3 = this.uNnUnnuNUnNu.uUnuvNvvNU();

            return switch (var3) {
               case "Светлый" -> VnVnuUn.uUnuvNvvNU(200, 200, 200, var2);
               case "Блюр" -> VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var1));
               default -> VnVnuUn.uUnuvNvvNU(45, 45, 45, var2);
            };
         }
      }
   }

   public int uNNnnnuuuN(float var1) {
      if (this.nvUVNnuu()) {
         return VVNunVNVuuu.C00OOC00oO(var1);
      } else if (this.UuuNnUvUuv()) {
         float var5 = this.vNVuvnUUnuUn();
         int var3 = VnVnuUn.uUnuvNvvNU(242, 245, 255, (int)(255.0F * var1));
         int var4 = VnVnuUn.uUnuvNvvNU(18, 25, 38, (int)(255.0F * var1));
         return VnVnuUn.uUnuvNvvNU(var3, var4, var5);
      } else if (this.nUUVuvU()) {
         return VnVnuUn.uUnuvNvvNU(244, 247, 255, (int)(255.0F * var1));
      } else {
         int var2 = (int)(255.0F * var1);
         if (this.UvnvNVnnnnNU() == NvVNvUvunNNu.VERNAL_SOLSTICE) {
            return VnVnuUn.uUnuvNvvNU(5, 17, 5, var2);
         } else if (this.UnUNVVVNuv()) {
            return VnVnuUn.UuUVuuUu(this.NnUuNNU(), var2);
         } else {
            return this.uNnUnnuNUnNu.uUnuvNvvNU().equals("Светлый") ? VnVnuUn.uUnuvNvvNU(20, 20, 20, var2) : VnVnuUn.uUnuvNvvNU(255, 255, 255, var2);
         }
      }
   }

   public int nuUnNvnuUu(float var1) {
      if (this.nvUVNnuu()) {
         return VVNunVNVuuu.uUnuvNvvNU(var1);
      } else if (this.UuuNnUvUuv()) {
         float var5 = this.vNVuvnUUnuUn();
         int var6 = VnVnuUn.uUnuvNvvNU(170, 177, 196, (int)(214.0F * var1));
         int var7 = VnVnuUn.uUnuvNvvNU(72, 84, 108, (int)(224.0F * var1));
         return VnVnuUn.uUnuvNvvNU(var6, var7, var5);
      } else if (this.nUUVuvU()) {
         return VnVnuUn.uUnuvNvvNU(176, 184, 204, (int)(220.0F * var1));
      } else {
         int var2 = (int)(255.0F * var1);
         if (this.UvnvNVnnnnNU() == NvVNvUvunNNu.VERNAL_SOLSTICE) {
            return VnVnuUn.uUnuvNvvNU(5, 17, 5, (int)(184.0F * var1));
         } else if (this.UnUNVVVNuv()) {
            return VnVnuUn.UuUVuuUu(this.nNvNUVU(), var2);
         } else {
            String var3 = this.uNnUnnuNUnNu.uUnuvNvvNU();

            return switch (var3) {
               case "Светлый" -> VnVnuUn.uUnuvNvvNU(80, 80, 80, var2);
               case "Блюр" -> VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(122.0F * var1));
               default -> VnVnuUn.uUnuvNvvNU(170, 170, 170, var2);
            };
         }
      }
   }

   public int VVuuUN(float var1) {
      return this.UuuNnUvUuv()
         ? VnVnuUn.UuUVuuUu(NUunUunuNV.UuUVuuUu(this.UnUNuUU(), this.uUVuVvuNUvnu(), 0.55F), (int)(255.0F * var1))
         : VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().UNnVVNvvnVvU(), (int)(255.0F * var1));
   }

   public int vNUvnnVnUvu(float var1) {
      return this.UuuNnUvUuv()
         ? VnVnuUn.UuUVuuUu(this.UnUNuUU(), (int)(255.0F * var1))
         : VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().uVunuUNVVUUV(), (int)(255.0F * var1));
   }

   public int uVUuuVnNVU(float var1) {
      return this.UuuNnUvUuv()
         ? VnVnuUn.UuUVuuUu(this.uUVuVvuNUvnu(), (int)(255.0F * var1))
         : VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().UNnVVNvvnVvU(), (int)(255.0F * var1));
   }

   public float vuuuNvNuv(float var1) {
      return var1 * this.UNnVVNvvnVvU.uUnuvNvvNU();
   }

   public float uUnuvNvvNU() {
      return this.uNnUnnuNUnNu.uUnuvNvvNU().equals("Блюр") ? 1.0F : 1.5F;
   }

   public boolean vVvUvVVuuNvV() {
      return !this.nvUVNnuu() && this.UvUvUNuvNU.C00OOC00oO("Тень");
   }

   public boolean uNNnnnuuuN() {
      return !this.nvUVNnuu() && this.UvUvUNuvNU.C00OOC00oO("Обводка");
   }

   public boolean nuUnNvnuUu() {
      return this.UvUvUNuvNU.C00OOC00oO("Темные зоны");
   }

   public boolean VVuuUN() {
      return this.nuUnNvnuUu() && this.UvUvUNuvNU.C00OOC00oO("Верхняя накладка");
   }

   public boolean vNUvnnVnUvu() {
      return this.nuUnNvnuUu() && this.UvUvUNuvNU.C00OOC00oO("Нижняя накладка");
   }

   public boolean uVUuuVnNVU() {
      return this.UvUvUNuvNU.C00OOC00oO("Тёмный рект поверх");
   }

   public boolean vuuuNvNuv() {
      return !this.nvUVNnuu() && !this.UuuNnUvUuv() && !this.nUUVuvU() ? this.uNnUnnuNUnNu.uUnuvNvvNU().equals("Блюр") : false;
   }

   public boolean nvUVNnuu() {
      return "Неоморфизм".equals(this.uNnUnnuNUnNu.uUnuvNvvNU());
   }

   public boolean UuuNnUvUuv() {
      return "Феррофлюид".equals(this.uNnUnnuNUnNu.uUnuvNvvNU());
   }

   public boolean nUUVuvU() {
      return "Призма".equals(this.uNnUnnuNUnNu.uUnuvNvvNU()) || "Призма Core".equals(this.uNnUnnuNUnNu.uUnuvNvvNU());
   }

   public static boolean UuUVuuUu(String var0) {
      return "Неоморфизм".equals(var0);
   }

   public static boolean C00OOC00oO(String var0) {
      return "Феррофлюид".equals(var0);
   }

   public static boolean uUnuvNvvNU(String var0) {
      return "Призма".equals(var0);
   }

   public boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, boolean var6, float var7) {
      return this.nvUVNnuu()
         && VVNunVNVuuu.UuUVuuUu(
            null,
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var7,
            VVNunVNVuuu.UuUVuuUu(this.NnUuNNU.uUnuvNvvNU(), this.nNvNUVU.uUnuvNvvNU(), this.UnUNuUU.uUnuvNvvNU(), this.uUVuVvuNUvnu.uUnuvNvvNU())
         );
   }

   public boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, boolean var6, float var7, int var8) {
      return this.nvUVNnuu()
         && VVNunVNVuuu.UuUVuuUu(
            null, var1, var2, var3, var4, var5, this.NnUuNNU.uUnuvNvvNU(), this.nNvNUVU.uUnuvNvvNU(), this.UnUNuUU.uUnuvNvvNU(), var8, var6, var7
         );
   }

   public boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10, float var11) {
      return this.nvUVNnuu() && VVNunVNVuuu.UuUVuuUu(null, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.UuUVuuUu(var2, var3, var4, var5);
      if (!VVNunVNVuuu.UuUVuuUu(null, var2, var3, var4, var5, var6, var7)) {
         if (!this.UuUVuuUu(var2, var3, var4, var5, var6, false, var7)) {
            if (!this.UuUVuuUu(var1, var2, var3, var4, var5, var6, false, var7)) {
               if (!this.C00OOC00oO(var1, var2, var3, var4, var5, var6, false, var7)) {
                  if (this.vVvUvVVuuNvV()) {
                     var1.UuUVuuUu(var2, var3, var4, var5, var6, this.UnUNVVVNuv() ? 6.0F : 4.0F, 1.0F, this.nvUVNnuu(var7));
                  }

                  if (this.vuuuNvNuv()) {
                     var1.UuUVuuUu(23.0F);
                     var1.UuUVuuUu(var2, var3, var4, var5, var6, var7);
                  }

                  if (this.UnUNVVVNuv() && !this.vuuuNvNuv()) {
                     this.UuUVuuUu(var1, var2, var3, var4, var5, var6, this.UuUVuuUu(var7), false, var7);
                  } else {
                     var1.UuUVuuUu(var2, var3, var4, var5, var6, this.UuUVuuUu(var7));
                  }

                  if (this.uNNnnnuuuN()) {
                     var1.UuUVuuUu(var2, var3, var4, var5, var6, this.vVvUvVVuuNvV(var7), this.uUnuvNvvNU());
                  }
               }
            }
         }
      }
   }

   public void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.UuUVuuUu(var2, var3, var4, var5);
      if (!this.UuUVuuUu(var1, var2, var3, var4, var5, var6, true, var7)) {
         if (!this.C00OOC00oO(var1, var2, var3, var4, var5, var6, true, var7)) {
            if (this.vNUvnnVnUvu()) {
               if (!this.UuUVuuUu(var2, var3, var4, var5, var6, true, var7)) {
                  if (this.UnUNVVVNuv() && !this.vuuuNvNuv()) {
                     this.UuUVuuUu(var1, var2, var3, var4, var5, var6, this.uUnuvNvvNU(var7), true, var7);
                  } else {
                     var1.UuUVuuUu(var2, var3, var4, var5, var6, this.uUnuvNvvNU(var7));
                  }

                  if (this.uNNnnnuuuN()) {
                     var1.UuUVuuUu(var2, var3, var4, var5, var6, this.vVvUvVVuuNvV(var7), Math.max(1.0F, this.uUnuvNvvNU() * 0.65F));
                  }
               }
            }
         }
      }
   }

   protected boolean UnUNVVVNuv() {
      return "Светлый".equals(this.uNnUnnuNUnNu.uUnuvNvvNU()) || VVNunVNVuuu.vVvUvVVuuNvV();
   }

   private boolean C00OOC00oO() {
      NvVNvUvunNNu var1 = this.UvnvNVnnnnNU();
      return this.UnUNVVVNuv() && (var1 == NvVNvUvunNNu.SAKURA_BREEZE || var1 == NvVNvUvunNNu.SAKURA);
   }

   protected float vNVuvnUUnuUn() {
      return this.nNnVnUNVV.UuUVuuUu(this.UnUNVVVNuv() ? 1.0F : 0.0F, Cc0cOoOcC0o.UvnvNVnnnnNU());
   }

   protected void UuUVuuUu(float var1, float var2, float var3, float var4) {
      int var5 = 0;
      int var6 = 0;

      try {
         class_310 var7 = class_310.method_1551();
         if (var7 != null && var7.method_22683() != null) {
            var5 = var7.method_22683().method_4489();
            var6 = var7.method_22683().method_4506();
         }
      } catch (Throwable var11) {
      }

      if (var5 > 0 && var6 > 0 && Float.isFinite(var1) && Float.isFinite(var2) && Float.isFinite(var3) && Float.isFinite(var4)) {
         this.vuvnUnVnUNnV = this.UuuNnUvUuv((var1 + var3 * 0.5F) / var5);
         this.nnuUVNUuvvVU = this.UuuNnUvUuv((var2 + var4 * 0.5F) / var6);
         int var12 = Math.round(this.vuvnUnVnUNnV * 2048.0F);
         int var8 = Math.round(this.nnuUVNUuvvVU * 2048.0F);
         int var9 = Math.round(Math.max(1.0F, var3) * 0.25F);
         int var10 = Math.round(Math.max(1.0F, var4) * 0.25F);
         this.nVVUuvuNnUN = (var12 * 7349 ^ var8 * 9151) * 31 ^ var9 * 131 ^ var10;
      } else {
         this.vuvnUnVnUNnV = 0.5F;
         this.nnuUVNUuvvVU = 0.5F;
         this.nVVUuvuNnUN = 0;
      }
   }

   private boolean UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, boolean var7, float var8) {
      return this.UuuNnUvUuv()
         && UnnUvUvn.UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var8,
            var7,
            this.UuUVuuUu(var8),
            this.vVvUvVVuuNvV(var8),
            this.vNUvnnVnUvu(var8),
            this.uVUuuVnNVU(var8),
            this.vVvUvVVuuNvV(),
            true,
            this.vNVuvnUUnuUn()
         );
   }

   private boolean C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, boolean var7, float var8) {
      return this.nUUVuvU()
         && uNnUVNuNNU.UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var8,
            var7,
            this.UuUVuuUu(var8),
            this.vVvUvVVuuNvV(var8),
            this.vNUvnnVnUvu(var8),
            this.uVUuuVnNVU(var8),
            this.vVvUvVVuuNvV(),
            this.uNNnnnuuuN(),
            this.vNVuvnUUnuUn()
         );
   }

   private NvVNvUvunNNu UvnvNVnnnnNU() {
      return NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.WILD;
   }

   private NUunUunuNV uVUVnuvnuVuv() {
      NvVNvUvunNNu var1 = this.UvnvNVnnnnNU();
      boolean var2 = this.UnUNVVVNuv();
      long var3 = System.currentTimeMillis();
      long var5 = var3 / 16L;
      if (this.VVnVNnunVvu == null
         || this.UuUVuuUu != var1
         || this.c0oOOCcCoC0 != var2
         || this.NVUunUNUN != var5
         || this.UUVNuUNUvUnV != this.nVVUuvuNnUN
         || var1 == NvVNvUvunNNu.CUSTOM) {
         NUunUunuNV var7 = NUunUunuNV.UuUVuuUu(var1, var2);
         this.VVnVNnunVvu = this.UuUVuuUu(var1, NUunUunuNV.UuUVuuUu(var1, var7, var3), var3);
         this.UuUVuuUu = var1;
         this.c0oOOCcCoC0 = var2;
         this.NVUunUNUN = var5;
         this.UUVNuUNUvUnV = this.nVVUuvuNnUN;
      }

      return this.VVnVNnunVvu;
   }

   private NUunUunuNV UuUVuuUu(NvVNvUvunNNu var1, NUunUunuNV var2, long var3) {
      OO0OCoOC.VvunVVUvUNnv var5 = this.NVNnnvnuunNv();
      int[] var6 = var5 == null ? null : var5.VVuuUN();
      if (var2 != null && var6 != null && var6.length >= 2) {
         float var7 = this.UuUVuuUu(var3);
         int var8 = this.UuUVuuUu(var6, var7);
         int var9 = this.UuUVuuUu(var6, var7 + 0.31F);
         int var10 = this.UuUVuuUu(var6, var7 + 0.67F);
         float var11 = var6.length > 2 ? 1.0F : 0.52F;
         float var12 = 0.34F + 0.3F * var11;
         float var13 = var2.uNnUnnuNUnNu() ? 0.018F + 0.02F * var11 : 0.045F + 0.05F * var11;
         float var14 = var2.uNnUnnuNUnNu() ? 0.06F + 0.035F * var11 : 0.16F + 0.1F * var11;
         int var15 = VnVnuUn.uUnuvNvvNU(var2.uVunuUNVVUUV(), VnVnuUn.uUnuvNvvNU(var8, -1, 0.1F), var12);
         int var16 = VnVnuUn.uUnuvNvvNU(var2.UNnVVNvvnVvU(), var9, var12);
         int var17 = NUunUunuNV.C00OOC00oO(var2.nuUnNvnuUu(), var10, var13);
         int var18 = NUunUunuNV.C00OOC00oO(var2.VVuuUN(), var9, var13 * 1.08F);
         int var19 = NUunUunuNV.C00OOC00oO(var2.UnUNVVVNuv(), var8, var14);
         int var20 = NUunUunuNV.C00OOC00oO(var2.vNVuvnUUnuUn(), var9, var14);
         int var21 = var2.uNnUnnuNUnNu() ? var2.UvnvNVnnnnNU() : NUunUunuNV.C00OOC00oO(var2.UvnvNVnnnnNU(), var10, 0.1F + 0.08F * var11);
         int var22 = var2.uNnUnnuNUnNu() ? var2.uVUVnuvnuVuv() : NUunUunuNV.C00OOC00oO(var2.uVUVnuvnuVuv(), var8, 0.08F + 0.06F * var11);
         int var23 = var2.uNnUnnuNUnNu() ? var2.NVNnnvnuunNv() : VnVnuUn.uUnuvNvvNU(var2.NVNnnvnuunNv(), var8, 0.025F + 0.025F * var11);
         return NUunUunuNV.UuUVuuUu(
            NUunUunuNV.uNNnnnuuuN()
               .UuUVuuUu(var17)
               .C00OOC00oO(var18)
               .uUnuvNvvNU(var2.vNUvnnVnUvu())
               .vVvUvVVuuNvV(var2.uVUuuVnNVU())
               .uNNnnnuuuN(var2.vuuuNvNuv())
               .nuUnNvnuUu(var2.nvUVNnuu())
               .VVuuUN(var2.UuuNnUvUuv())
               .vNUvnnVnUvu(var2.nUUVuvU())
               .uVUuuVnNVU(var19)
               .vuuuNvNuv(var20)
               .nvUVNnuu(var21)
               .UuuNnUvUuv(var22)
               .nUUVuvU(var23)
               .UnUNVVVNuv(var15)
               .vNVuvnUUnuUn(var16)
               .UuUVuuUu(var2.uNnUnnuNUnNu())
               .UuUVuuUu()
         );
      } else {
         return var2;
      }
   }

   private float UuUVuuUu(long var1) {
      float var3 = (float)(var1 % 14000L) / 14000.0F;
      float var4 = (float)Math.sin((this.vuvnUnVnUNnV * 1.72F - this.nnuUVNUuvvVU * 1.18F + var3 * 1.35F) * (float) (Math.PI * 2)) * 0.055F;
      return this.vuvnUnVnUNnV * 0.54F + this.nnuUVNUuvvVU * 0.36F + var3 * 0.58F + var4;
   }

   private int UuUVuuUu(int[] var1, float var2) {
      if (var1.length == 1) {
         return var1[0];
      } else {
         float var3 = var2 - (float)Math.floor(var2);
         float var4 = var3 * (var1.length - 1);
         int var5 = Math.min(var1.length - 2, Math.max(0, (int)Math.floor(var4)));
         return VnVnuUn.uUnuvNvvNU(var1[var5], var1[var5 + 1], var4 - var5);
      }
   }

   private float UuuNnUvUuv(float var1) {
      return Math.max(0.0F, Math.min(1.0F, var1));
   }

   private OO0OCoOC.VvunVVUvUNnv NVNnnvnuunNv() {
      NvVNvUvunNNu var1 = this.UvnvNVnnnnNU();
      if (var1 == NvVNvUvunNNu.CUSTOM) {
         return null;
      } else {
         if (this.unNNVVNnvvV == null || this.NuunnvnN != var1) {
            this.unNNVVNnvvV = nuunNvv.C00OOC00oO(var1);
            this.NuunnvnN = var1;
         }

         return this.unNNVVNnvvV;
      }
   }

   private int uVunuUNVVUUV() {
      NUunUunuNV var1 = this.uVUVnuvnuVuv();
      if (this.C00OOC00oO()) {
         int var4 = VnVnuUn.uUnuvNvvNU(-1283, var1.uVunuUNVVUUV(), 0.05F);
         return VnVnuUn.uUnuvNvvNU(var4, var1.UNnVVNvvnVvU(), 0.03F);
      } else {
         int var2 = VnVnuUn.uUnuvNvvNU(-196865, var1.uVunuUNVVUUV(), 0.026F);
         OO0OCoOC.VvunVVUvUNnv var3 = this.NVNnnvnuunNv();
         if (var3 != null && var3.nuUnNvnuUu()) {
            var2 = VnVnuUn.uUnuvNvvNU(var2, var3.vVvUvVVuuNvV(), 0.022F);
         }

         return var2;
      }
   }

   private int UNnVVNvvnVvU() {
      NUunUunuNV var1 = this.uVUVnuvnuVuv();
      if (this.C00OOC00oO()) {
         int var4 = VnVnuUn.uUnuvNvvNU(-1, var1.UNnVVNvvnVvU(), 0.07F);
         return VnVnuUn.uUnuvNvvNU(var4, var1.uVunuUNVVUUV(), 0.03F);
      } else {
         int var2 = VnVnuUn.uUnuvNvvNU(-1, var1.UNnVVNvvnVvU(), 0.022F);
         OO0OCoOC.VvunVVUvUNnv var3 = this.NVNnnvnuunNv();
         if (var3 != null && var3.nuUnNvnuUu()) {
            var2 = VnVnuUn.uUnuvNvvNU(var2, var3.uNNnnnuuuN(), 0.018F);
         }

         return var2;
      }
   }

   private int uNnUnnuNUnNu() {
      NUunUunuNV var1 = this.uVUVnuvnuVuv();
      int var2 = VnVnuUn.uUnuvNvvNU(var1.uVunuUNVVUUV(), var1.UNnVVNvvnVvU(), 0.44F);
      return this.C00OOC00oO() ? VnVnuUn.uUnuvNvvNU(-7582617, var2, 0.48F) : VnVnuUn.uUnuvNvvNU(-15261133, var2, 0.34F);
   }

   private int NnUuNNU() {
      NUunUunuNV var1 = this.uVUVnuvnuVuv();
      return VnVnuUn.uUnuvNvvNU(-15722718, var1.uVunuUNVVUUV(), 0.035F);
   }

   private int nNvNUVU() {
      NUunUunuNV var1 = this.uVUVnuvnuVuv();
      return VnVnuUn.uUnuvNvvNU(-12168086, var1.UNnVVNvvnVvU(), 0.055F);
   }

   public int nvUVNnuu(float var1) {
      if (this.UnUNVVVNuv()) {
         NUunUunuNV var2 = this.uVUVnuvnuVuv();
         if (this.C00OOC00oO()) {
            int var4 = VnVnuUn.uUnuvNvvNU(-2779216, var2.UNnVVNvvnVvU(), 0.26F);
            return VnVnuUn.UuUVuuUu(var4, (int)(34.0F * var1));
         } else {
            int var3 = VnVnuUn.uUnuvNvvNU(-10787208, var2.UNnVVNvvnVvU(), 0.1F);
            return VnVnuUn.UuUVuuUu(var3, (int)(46.0F * var1));
         }
      } else {
         return VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(80.0F * var1));
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, int var7, boolean var8, float var9) {
      int var10 = VnVnuUn.UuUVuuUu(var7);
      NUunUunuNV var11 = this.uVUVnuvnuVuv();
      float var12 = this.C00OOC00oO() ? 0.115F : 0.055F;
      float var13 = this.C00OOC00oO() ? 0.085F : 0.04F;
      int var14 = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(var7, var11.uVunuUNVVUUV(), var8 ? var12 * 0.76F : var12), var10);
      int var15 = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(var7, var11.UNnVVNvvnVvU(), var8 ? var13 * 0.7F : var13), var10);
      var1.C00OOC00oO(var2, var3, var4, var5, var6, var14, var15);
      if (!var8 && var5 > 10.0F) {
         float var16 = Math.max(4.0F, Math.min(var5 * 0.36F, 18.0F));
         int var17 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)((this.C00OOC00oO() ? 34 : 24) * var9));
         var1.C00OOC00oO(var2 + 1.0F, var3 + 1.0F, Math.max(1.0F, var4 - 2.0F), var16, Math.max(0.0F, var6 - 1.0F), var17, VnVnuUn.uUnuvNvvNU(255, 255, 255, 0));
      }
   }

   private int UnUNuUU() {
      return NUunUunuNV.C00OOC00oO(VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().uVunuUNVVUUV(), 255), -1, 0.2F);
   }

   private int uUVuVvuNUvnu() {
      return NUunUunuNV.C00OOC00oO(VnVnuUn.UuUVuuUu(this.uVUVnuvnuVuv().UNnVVNvvnVvU(), 255), -1, 0.12F);
   }
}
