package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_408;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "Screens",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Общие экраны комнаты: создание, размещение и синхронный просмотр"
)
public class Screens extends Module {
   public final NVuVVUNUvV NVNnnvnuunNv = new NVuVVUNUvV("Сервер", "49.12.210.82");
   public final vNnVvvNU uVunuUNVVUUV = new vNnVvvNU("Подключиться к серверу", 0).UuUVuuUu(this::UuuNnUvUuv);
   public final vNnVvvNU UNnVVNvvnVvU = new vNnVvvNU("Создать комнату", 0).UuUVuuUu(this::nUUVuvU);
   public final NVuVVUNUvV uNnUnnuNUnNu = new NVuVVUNUvV("Код комнаты", "");
   public final vNnVvvNU NnUuNNU = new vNnVvvNU("Подключиться", 0).UuUVuuUu(this::UnUNVVVNuv);
   public final uVNuNUVvn nNvNUVU = new uVNuNUVvn("Создать экран", -1);
   public final vNnVvvNU UnUNuUU = new vNnVvvNU("Убрать экраны", 0).UuUVuuUu(this::uVUVnuvnuVuv);
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Поворот", 0.0F, 0.0F, 355.0F, 5.0F, false);
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Следить за направлением", false);
   public final NVuVVUNUvV c0oOOCcCoC0 = new NVuVVUNUvV("Ссылка", "https://www.google.com");
   public final vNnVvvNU VVnVNnunVvu = new vNnVvvNU("Открыть на экране", 0).UuUVuuUu(this::NVNnnvnuunNv);
   public final NVuVVUNUvV unNNVVNnvvV = new NVuVVUNUvV("Передать управление", "");
   public final vNnVvvNU NuunnvnN = new vNnVvvNU("Передать", 0).UuUVuuUu(this::vNVuvnUUnuUn);
   private final Coo00OCoOo NVUunUNUN = new Coo00OCoOo();
   private final nnunnunvvuv UUVNuUNUvUnV = new nnunnunvvuv();
   private final VVuuvVNNvnVU vuvnUnVnUNnV = new VVuuvVNNvnVU(NVUunUNUN());
   private final Matrix4f nnuUVNUuvvVU = new Matrix4f();
   private final Vector3f nVVUuvuNnUN = new Vector3f();
   private final Vector3f nNnVnUNVV = new Vector3f();
   private final int[] nuunNvv = new int[4];
   private final Map<UUID, double[]> uUVVvVVNvvn = new HashMap<>();
   private final Set<UUID> vvUVNVvvNUv = new HashSet<>();
   private class_243 UuNnnVnuNNV = class_243.field_1353;
   private boolean uUVvnUuNvvN;
   private long UUuUnNVNuuv;
   private UUID NVuNUuVnVUN;
   private long NVuunNnvvvVu;
   private double vNnNuuvVn;
   private double VUuuVUnun;
   private double vVVuuVVv;
   private double VuunNUUUvu;
   private double NNUUNUuVNNVn;
   private double VvVvnNUnvuvV;

   public Screens() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN
         }
      );
   }

   @Override
   public void C00OOC00oO() {
      this.NVUunUNUN.UnUNVVVNuv();
      this.uUVVvVVNvvn.clear();
      this.vvUVNVvvNUv.clear();
      this.vuvnUnVnUNnV.UuUVuuUu().UuUVuuUu();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nunuNvVUuUuV var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 == null && var1.vVvUvVVuuNvV() == 1) {
         if (this.nNvNUVU.uUnuvNvvNU() != -1 && var1.uUnuvNvvNU() == this.nNvNUVU.uUnuvNvvNU()) {
            this.UvnvNVnnnnNU();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UVNVVUunvN var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 instanceof class_408) {
         UNnNuvuvnU var2 = this.UnUNuUU();
         if (var2 != null) {
            var2.scroll(this.UUVNuUNUvUnV.uVUuuVnNVU(), this.UUVNuUNUvUnV.vuuuNvNuv(), var1.uNNnnnuuuN());
            var1.C00OOC00oO();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (uUnuvNvvNU.field_1755 instanceof class_408) {
            this.C00OOC00oO(var1);
         } else if (uUnuvNvvNU.field_1755 == null && var1.vVvUvVVuuNvV() == 0) {
            if (var1.nvUVNnuu()) {
               this.UNnVVNvvnVvU();
            } else if (var1.vuuuNvNuv() && this.NVUunUNUN.uUnuvNvvNU() != VvUUVVVNNUN.NONE) {
               c0O00CcoCc0c.NVnVnNnN var2 = VNvnNUnUv.UuUVuuUu().uUnuvNvvNU().UuUVuuUu(this.NVUunUNUN.UuUVuuUu());
               if (var2 != null) {
                  this.C00OOC00oO(1.0F);
                  if (this.NVUunUNUN.UuUVuuUu(var2, this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv, this.VuunNUUUvu, this.NNUUNUuVNNVn, this.VvVvnNUnvuvV)) {
                     var1.C00OOC00oO();
                  }
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      VNvnNUnUv var2 = VNvnNUnUv.UuUVuuUu();
      var2.UuuNnUvUuv();
      if (uUnuvNvvNU.field_1724 == null) {
         this.NVUunUNUN.UnUNVVVNuv();
      } else {
         this.vuvnUnVnUNnV.UuUVuuUu().UuUVuuUu(var2.uUnuvNvvNU().UuUVuuUu());
         this.c0oOOCcCoC0();
         this.VVnVNnunVvu();
         if (!this.NVUunUNUN.vVvUvVVuuNvV()) {
            this.C00OOC00oO(1.0F);
            this.NVUunUNUN
               .UuUVuuUu(
                  var2.uUnuvNvvNU().UuUVuuUu(),
                  var2.vNUvnnVnUvu(),
                  this.NuunnvnN(),
                  this.vNnNuuvVn,
                  this.VUuuVUnun,
                  this.vVVuuVVv,
                  this.VuunNUUUvu,
                  this.NNUUNUuVNNVn,
                  this.VvVvnNUnvuvV
               );
            this.unNNVVNnvvV();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uUnnuUn var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         VNvnNUnUv var2 = VNvnNUnUv.UuUVuuUu();
         List var3 = var2.uUnuvNvvNU().UuUVuuUu();
         this.C00OOC00oO(var1);
         if (!var3.isEmpty()) {
            this.nNvNUVU();
            this.UuUVuuUu(var1.uNNnnnuuuN().nuUnNvnuUu());
            this.vuvnUnVnUNnV
               .UuUVuuUu(
                  var1.uNNnnnuuuN(), var3, var2.uUnuvNvvNU(), this.NVUunUNUN, var2.vNUvnnVnUvu(), this.NuunnvnN(), var2.vVvUvVVuuNvV().C00OOC00oO(), -8426497
               );
         }
      }
   }

   private void C00OOC00oO(uUnnuUn var1) {
      this.nnuUVNUuvvVU.set(var1.uNNnnnuuuN().uNNnnnuuuN()).mul(var1.uNNnnnuuuN().uUnuvNvvNU());
      this.UuNnnVnuNNV = var1.uNNnnnuuuN().UuUVuuUu().method_19326();
      this.uUVvnUuNvvN = true;
   }

   private void UuuNnUvUuv() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU().trim();
      if (var1.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("Укажите адрес сервера");
      } else {
         VNvnNUnUv.UuUVuuUu().UuUVuuUu(UNvUnNVUUuv.UuUVuuUu(var1, 7331));
         vVnvuVVUunuv.UuUVuuUu("Подключаюсь к " + var1 + ":7331");
      }
   }

   private void nUUVuvU() {
      if (!UUVNuUNUvUnV()) {
         String var1 = UVNvnnvuNv.UuUVuuUu();
         if (!VNvnNUnUv.UuUVuuUu().UuUVuuUu(var1)) {
            vVnvuVVUunuv.UuUVuuUu("Нет связи с сервером Wild");
         } else {
            this.uNnUnnuNUnNu.C00OOC00oO(var1);
            vVnvuVVUunuv.UuUVuuUu("Код комнаты: " + var1);
         }
      }
   }

   private void UnUNVVVNuv() {
      if (!UUVNuUNUvUnV()) {
         String var1 = UVNvnnvuNv.UuUVuuUu(this.uNnUnnuNUnNu.uUnuvNvvNU());
         if (!UVNvnnvuNv.C00OOC00oO(var1)) {
            vVnvuVVUunuv.UuUVuuUu("Неверный формат кода");
         } else {
            VNvnNUnUv.UuUVuuUu().C00OOC00oO(var1);
         }
      }
   }

   private void vNVuvnUUnuUn() {
      nnnvUNUvVUVU var1 = VNvnNUnUv.UuUVuuUu().C00OOC00oO();
      nnnvUNUvVUVU.NVnVnNnN var2 = var1.UuUVuuUu(this.unNNVVNnvvV.uUnuvNvvNU().trim());
      if (var2 == null) {
         vVnvuVVUunuv.UuUVuuUu("Такого участника нет в комнате");
      } else {
         VNvnNUnUv.UuUVuuUu().UuUVuuUu(var2.uuid());
      }
   }

   private void UvnvNVnnnnNU() {
      VNvnNUnUv var1 = VNvnNUnUv.UuUVuuUu();
      if (!var1.C00OOC00oO().UuUVuuUu()) {
         vVnvuVVUunuv.UuUVuuUu("Сначала создайте комнату или войдите в неё");
      } else if (var1.uUnuvNvvNU().C00OOC00oO() >= 5) {
         vVnvuVVUunuv.UuUVuuUu("В комнате уже максимум экранов");
      } else {
         double var2 = Math.toRadians(uUnuvNvvNU.field_1724.method_36454());
         var1.UuUVuuUu(
            uUnuvNvvNU.field_1724.method_23317() - Math.sin(var2) * 5.0,
            uUnuvNvvNU.field_1724.method_23320(),
            uUnuvNvvNU.field_1724.method_23321() + Math.cos(var2) * 5.0,
            uUnuvNvvNU.field_1724.method_36454() + 180.0F,
            6.4F,
            3.6F
         );
      }
   }

   private void uVUVnuvnuVuv() {
      VNvnNUnUv var1 = VNvnNUnUv.UuUVuuUu();
      List var2 = var1.uUnuvNvvNU().UuUVuuUu();
      UUID var3 = var1.vNUvnnVnUvu();
      boolean var4 = this.NuunnvnN();

      for (int var5 = 0; var5 < var2.size(); var5++) {
         c0O00CcoCc0c.NVnVnNnN var6 = (c0O00CcoCc0c.NVnVnNnN)var2.get(var5);
         if (Coo00OCoOo.UuUVuuUu(var6, var3, var4)) {
            var1.C00OOC00oO(var6.id());
         }
      }

      this.NVUunUNUN.UnUNVVVNuv();
   }

   private void NVNnnvnuunNv() {
      c0O00CcoCc0c.NVnVnNnN var1 = VNvnNUnUv.UuUVuuUu().uUnuvNvvNU().UuUVuuUu(this.NVUunUNUN.C00OOC00oO());
      if (var1 == null) {
         vVnvuVVUunuv.UuUVuuUu("Наведитесь на экран, которым управляете");
      } else {
         String var2 = this.c0oOOCcCoC0.uUnuvNvvNU().trim();
         if (!var2.startsWith("https://")) {
            vVnvuVVUunuv.UuUVuuUu("Ссылка должна начинаться с https://");
         } else {
            VNvnNUnUv.UuUVuuUu().UuUVuuUu(var1.id(), var2, true, 0L, 1.0F);
         }
      }
   }

   private void UuUVuuUu(float var1) {
      if (this.NVUunUNUN.vVvUvVVuuNvV()) {
         this.C00OOC00oO(var1);
         this.NVUunUNUN.UuUVuuUu(this.uVunuUNVVUUV());
         this.NVUunUNUN.UuUVuuUu(this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv, this.VuunNUUUvu, this.NNUUNUuVNNVn, this.VvVvnNUnvuvV);
         if (this.NVUunUNUN.UuUVuuUu(System.currentTimeMillis())) {
            this.uNnUnnuNUnNu();
         }
      }
   }

   private double uVunuUNVVUUV() {
      double var1 = this.NVUunUNUN.UuuNnUvUuv();
      class_3965 var3 = uUnuvNvvNU.field_1687
         .method_17742(
            new class_3959(
               new class_243(this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv),
               new class_243(this.vNnNuuvVn + this.VuunNUUUvu * var1, this.VUuuVUnun + this.NNUUNUuVNNVn * var1, this.vVVuuVVv + this.VvVvnNUnvuvV * var1),
               class_3960.field_17558,
               class_242.field_1348,
               uUnuvNvvNU.field_1724
            )
         );
      if (var3.method_17783() != class_240.field_1332) {
         return var1;
      } else {
         double var4 = var3.method_17784().method_1022(new class_243(this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv));
         return Math.max(1.0, var4 - this.NVUunUNUN.vuuuNvNuv() * 0.5 - 0.35);
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.NVUunUNUN.vVvUvVVuuNvV()) {
         this.uNnUnnuNUnNu();
         this.NVUunUNUN.nUUVuvU();
      }
   }

   private void uNnUnnuNUnNu() {
      UUID var1 = this.NVUunUNUN.uNNnnnuuuN();
      if (var1 != null) {
         VNvnNUnUv.UuUVuuUu()
            .UuUVuuUu(
               var1,
               this.NVUunUNUN.nuUnNvnuUu(),
               this.NVUunUNUN.VVuuUN(),
               this.NVUunUNUN.vNUvnnVnUvu(),
               this.NVUunUNUN.uVUuuVnNVU(),
               this.NVUunUNUN.vuuuNvNuv(),
               this.NVUunUNUN.nvUVNnuu()
            );
      }
   }

   private void C00OOC00oO(VnuuuuVvVnN var1) {
      if (var1.vuuuNvNuv() && this.NnUuNNU()) {
         var1.C00OOC00oO();
      } else {
         UNnNuvuvnU var2 = this.UnUNuUU();
         if (var2 != null) {
            if (var1.vuuuNvNuv()) {
               var2.press(this.UUVNuUNUvUnV.uVUuuVnNVU(), this.UUVNuUNUvUnV.vuuuNvNuv(), var1.vVvUvVVuuNvV());
            } else {
               if (!var1.nvUVNnuu()) {
                  return;
               }

               var2.release(this.UUVNuUNUvUnV.uVUuuVnNVU(), this.UUVNuUNUvUnV.vuuuNvNuv(), var1.vVvUvVVuuNvV());
            }

            var1.C00OOC00oO();
         }
      }
   }

   private boolean NnUuNNU() {
      c0O00CcoCc0c.NVnVnNnN var1 = this.uUVuVvuNUvnu();
      if (var1 != null && this.UUVNuUNUvUnV.uVUVnuvnuVuv()) {
         nVnnVNuNNVUU var2 = this.vuvnUnVnUNnV.UuUVuuUu().C00OOC00oO(var1.id());
         if (var2 == null) {
            return false;
         } else {
            int var3 = this.UUVNuUNUvUnV.NVNnnvnuunNv();
            if (var3 >= 0 && var3 <= var2.UuUVuuUu()) {
               if (var3 == var2.UuUVuuUu()) {
                  var2.UuUVuuUu(this.c0oOOCcCoC0.uUnuvNvvNU().trim());
               } else {
                  var2.uUnuvNvvNU(var3);
               }

               VNvnNUnUv.UuUVuuUu().UuUVuuUu(var1.id(), var2.UuUVuuUu(var2.C00OOC00oO()), true, 0L, 1.0F);
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void nNvNUVU() {
      UNnNuvuvnU var1 = this.UnUNuUU();
      if (var1 != null) {
         var1.moveCursor(this.UUVNuUNUvUnV.uVUuuVnNVU(), this.UUVNuUNUvUnV.vuuuNvNuv());
      }
   }

   private UNnNuvuvnU UnUNuUU() {
      c0O00CcoCc0c.NVnVnNnN var1 = this.uUVuVvuNUvnu();
      return var1 != null && this.UUVNuUNUvUnV.UnUNuUU() ? this.vuvnUnVnUNnV.UuUVuuUu().UuUVuuUu(var1.id()) : null;
   }

   private c0O00CcoCc0c.NVnVnNnN uUVuVvuNUvnu() {
      if (uUnuvNvvNU.field_1755 instanceof class_408 && this.UvUvUNuvNU()) {
         VNvnNUnUv var1 = VNvnNUnUv.UuUVuuUu();
         List var2 = var1.uUnuvNvvNU().UuUVuuUu();
         UUID var3 = var1.vNUvnnVnUvu();
         boolean var4 = this.NuunnvnN();
         c0O00CcoCc0c.NVnVnNnN var5 = null;
         double var6 = Double.MAX_VALUE;

         for (int var8 = 0; var8 < var2.size(); var8++) {
            c0O00CcoCc0c.NVnVnNnN var9 = (c0O00CcoCc0c.NVnVnNnN)var2.get(var8);
            if (Coo00OCoOo.UuUVuuUu(var9, var3, var4)) {
               this.UUVNuUNUvUnV.UuUVuuUu(var9);
               if (this.UUVNuUNUvUnV.UuUVuuUu(this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv, this.VuunNUUUvu, this.NNUUNUuVNNVn, this.VvVvnNUnvuvV)
                  && (this.UUVNuUNUvUnV.UnUNuUU() || this.UUVNuUNUvUnV.uVUVnuvnuVuv())
                  && this.UUVNuUNUvUnV.vNUvnnVnUvu() < var6) {
                  var6 = this.UUVNuUNUvUnV.vNUvnnVnUvu();
                  var5 = var9;
               }
            }
         }

         if (var5 != null) {
            this.UUVNuUNUvUnV.UuUVuuUu(var5);
            this.UUVNuUNUvUnV.UuUVuuUu(this.vNnNuuvVn, this.VUuuVUnun, this.vVVuuVVv, this.VuunNUUUvu, this.NNUUNUuVNNVn, this.VvVvnNUnvuvV);
         }

         return var5;
      } else {
         return null;
      }
   }

   private boolean UvUvUNuvNU() {
      int var1 = uUnuvNvvNU.method_22683().method_4489();
      int var2 = uUnuvNvvNU.method_22683().method_4506();
      float var3 = uUnuvNvvNU.method_22683().method_4495();
      if (this.uUVvnUuNvvN && var1 > 0 && var2 > 0 && !(var3 <= 0.0F)) {
         this.nuunNvv[0] = 0;
         this.nuunNvv[1] = 0;
         this.nuunNvv[2] = var1;
         this.nuunNvv[3] = var2;
         this.nnuUVNUuvvVU
            .unprojectRay(
               (float)uUnuvNvvNU.field_1729.method_1603(), var2 - (float)uUnuvNvvNU.field_1729.method_1604(), this.nuunNvv, this.nVVUuvuNnUN, this.nNnVnUNVV
            );
         this.vNnNuuvVn = this.UuNnnVnuNNV.field_1352 + this.nVVUuvuNnUN.x;
         this.VUuuVUnun = this.UuNnnVnuNNV.field_1351 + this.nVVUuvuNnUN.y;
         this.vVVuuVVv = this.UuNnnVnuNNV.field_1350 + this.nVVUuvuNnUN.z;
         this.VuunNUUUvu = this.nNnVnUNVV.x;
         this.NNUUNUuVNNVn = this.nNnVnUNVV.y;
         this.VvVvnNUnvuvV = this.nNnVnUNVV.z;
         return true;
      } else {
         return false;
      }
   }

   private void c0oOOCcCoC0() {
      VNvnNUnUv var1 = VNvnNUnUv.UuUVuuUu();
      String var2 = this.c0oOOCcCoC0.uUnuvNvvNU().trim();
      if (var2.startsWith("https://")) {
         List var3 = var1.uUnuvNvvNU().UuUVuuUu();
         UUID var4 = var1.vNUvnnVnUvu();

         for (int var5 = 0; var5 < var3.size(); var5++) {
            c0O00CcoCc0c.NVnVnNnN var6 = (c0O00CcoCc0c.NVnVnNnN)var3.get(var5);
            if (var4 != null && var4.equals(var6.owner()) && var6.source().isEmpty() && this.vvUVNVvvNUv.add(var6.id())) {
               var1.UuUVuuUu(var6.id(), var2, true, 0L, 1.0F);
            }
         }
      }
   }

   private void VVnVNnunVvu() {
      if (!this.UvUvUNuvNU.uUnuvNvvNU()) {
         this.uUVVvVVNvvn.clear();
      } else {
         VNvnNUnUv var1 = VNvnNUnUv.UuUVuuUu();
         List var2 = var1.uUnuvNvvNU().UuUVuuUu();
         UUID var3 = var1.vNUvnnVnUvu();
         float var4 = uUnuvNvvNU.field_1724.method_36454();

         for (int var5 = 0; var5 < var2.size(); var5++) {
            c0O00CcoCc0c.NVnVnNnN var6 = (c0O00CcoCc0c.NVnVnNnN)var2.get(var5);
            if (var3 != null && var3.equals(var6.owner())) {
               double[] var7 = this.uUVVvVVNvvn.get(var6.id());
               if (var7 == null) {
                  this.uUVVvVVNvvn.put(var6.id(), this.UuUVuuUu(var6, var4));
               } else {
                  this.UuUVuuUu(var6, var7, var4);
               }
            }
         }
      }
   }

   private double[] UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var1, float var2) {
      double var3 = var1.x() - uUnuvNvvNU.field_1724.method_23317();
      double var5 = var1.z() - uUnuvNvvNU.field_1724.method_23321();
      return new double[]{
         Math.sqrt(var3 * var3 + var5 * var5),
         Math.toDegrees(Math.atan2(var5, var3)) - var2,
         var1.y() - uUnuvNvvNU.field_1724.method_23320(),
         var1.yaw() - var2
      };
   }

   private void UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var1, double[] var2, float var3) {
      double var4 = Math.toRadians(var2[1] + var3);
      double var6 = uUnuvNvvNU.field_1724.method_23317() + Math.cos(var4) * var2[0];
      double var8 = uUnuvNvvNU.field_1724.method_23321() + Math.sin(var4) * var2[0];
      double var10 = uUnuvNvvNU.field_1724.method_23320() + var2[2];
      if (!(Math.abs(var6 - var1.x()) < 0.02) || !(Math.abs(var10 - var1.y()) < 0.02) || !(Math.abs(var8 - var1.z()) < 0.02)) {
         long var12 = System.currentTimeMillis();
         if (var12 - this.UUuUnNVNuuv >= 100L) {
            this.UUuUnNVNuuv = var12;
            VNvnNUnUv.UuUVuuUu().UuUVuuUu(var1.id(), var6, var10, var8, (float)(var2[3] + var3), var1.width(), var1.height());
         }
      }
   }

   private void unNNVVNnvvV() {
      c0O00CcoCc0c.NVnVnNnN var1 = VNvnNUnUv.UuUVuuUu().uUnuvNvvNU().UuUVuuUu(this.NVUunUNUN.C00OOC00oO());
      if (var1 == null) {
         this.NVuNUuVnVUN = null;
      } else if (!var1.id().equals(this.NVuNUuVnVUN)) {
         this.NVuNUuVnVUN = var1.id();
         this.uUVuVvuNUvnu.UuUVuuUu(var1.yaw());
      } else if (!(Math.abs(this.uUVuVvuNUvnu.uUnuvNvvNU() - var1.yaw()) < 2.5F)) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.NVuunNnvvvVu >= 100L) {
            this.NVuunNnvvvVu = var2;
            VNvnNUnUv.UuUVuuUu().UuUVuuUu(var1.id(), var1.x(), var1.y(), var1.z(), this.uUVuVvuNUvnu.uUnuvNvvNU(), var1.width(), var1.height());
         }
      }
   }

   private void C00OOC00oO(float var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_5828(var1);
      this.vNnNuuvVn = class_3532.method_16436(var1, uUnuvNvvNU.field_1724.field_6038, uUnuvNvvNU.field_1724.method_23317());
      this.VUuuVUnun = class_3532.method_16436(var1, uUnuvNvvNU.field_1724.field_5971, uUnuvNvvNU.field_1724.method_23318())
         + uUnuvNvvNU.field_1724.method_23320()
         - uUnuvNvvNU.field_1724.method_23318();
      this.vVVuuVVv = class_3532.method_16436(var1, uUnuvNvvNU.field_1724.field_5989, uUnuvNvvNU.field_1724.method_23321());
      this.VuunNUUUvu = var2.field_1352;
      this.NNUUNUuVNNVn = var2.field_1351;
      this.VvVvnNUnvuvV = var2.field_1350;
   }

   private boolean NuunnvnN() {
      UUID var1 = VNvnNUnUv.UuUVuuUu().vNUvnnVnUvu();
      return var1 != null && VNvnNUnUv.UuUVuuUu().C00OOC00oO().UuUVuuUu(var1);
   }

   private static unUNvvnuUNn NVUunUNUN() {
      try {
         return new vNnuvNVNvv();
      } catch (Throwable var1) {
         return new CO0ooCcO0O();
      }
   }

   private static boolean UUVNuUNUvUnV() {
      if (VNvnNUnUv.UuUVuuUu().nuUnNvnuUu()) {
         return false;
      } else {
         vVnvuVVUunuv.UuUVuuUu("Нет связи с сервером Wild");
         return true;
      }
   }
}
