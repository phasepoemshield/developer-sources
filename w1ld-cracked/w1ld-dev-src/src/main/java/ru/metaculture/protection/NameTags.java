package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_10055;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1531;
import net.minecraft.class_1542;
import net.minecraft.class_1569;
import net.minecraft.class_1621;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_490;
import net.minecraft.class_5251;
import net.minecraft.class_5498;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_897;
import net.minecraft.class_9334;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NameTags",
   C00OOC00oO = "Теги сущностей",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class NameTags extends Module {
   private static final float UUuUnNVNuuv = 0.0625F;
   private static final long NVuNUuVnVUN = 250L;
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим отображения", "Legacy", "Legacy", "New");
   private static final int NVuunNnvvvVu = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(88, 220, 116, 255);
   private static final String vNnNuuvVn = "Игроки";
   private static final String VUuuVUnun = "Голые";
   private static final String vVVuuVVv = "Мобы";
   private static final String VuunNUUUvu = "Животные";
   private static final String NNUUNUuVNNVn = "Предметы";
   public final VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN(
         "Цели",
         new vvNnnUNnVvn("Игроки", true),
         new vvNnnUNnVvn("Голые", true),
         new vvNnnUNnVvn("Мобы", false),
         new vvNnnUNnVvn("Животные", false),
         new vvNnnUNnVvn("Предметы", false)
      )
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final VUVnvvnNN UNnVVNvvnVvU = new VUVnvvnNN("Тип", new vvNnnUNnVvn("Player", true), new vvNnnUNnVvn("Hologram", true))
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Броня", true)
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy") && !this.uVunuUNVVUUV.C00OOC00oO("Игроки"));
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Правая рука", true)
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy") && !this.uVunuUNVVUUV.C00OOC00oO("Игроки"));
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Левая рука", true)
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy") && !this.uVunuUNVVUUV.C00OOC00oO("Игроки"));
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Эффекты", true).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Полоса HP", true).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Невидимки", true).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Инфо при наводке", true).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Размер", 1.2F, 0.75F, 1.9F, 0.05F, true).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Размер тега", 1.0F, 0.5F, 2.5F, 0.05F, false).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final nNUuNvVn NuunnvnN = new nNUuNvVn("Радиус деталей", 11.0F, 2.0F, 32.0F, 0.5F, false).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final UvNnUnuNUUU NVUunUNUN = new UvNnUnuNUUU("Режим обводки", "Боксы", "Боксы", "Скелет", "Не рендерить")
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Legacy"));
   public final UvNnUnuNUUU UUVNuUNUvUnV = new UvNnUnuNUUU("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Неоморфизм", "Феррофлюид")
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("Показывать голову", true).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn nnuUVNUuvvVU = new vvNnnUNnVvn("Отображать полные имена", false).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn nVVUuvuNnUN = new vvNnnUNnVvn("Подсветка предметов", true).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn nNnVnUNVV = new vvNnnUNnVvn("Тень плашек", true).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn nuunNvv = new vvNnnUNnVvn("Градиент текста", false).UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New"));
   public final vvNnnUNnVvn uUVVvVVNvvn = new vvNnnUNnVvn("Цвет предмета в градиенте", true)
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New") || !this.nuunNvv.uUnuvNvvNU());
   public final VnnUvVNuNuVv vvUVNVvvNUv = new VnnUvVNuNuVv("Второй цвет текста", 47.0F, 0.45F, 1.0F)
      .C00OOC00oO(() -> this.NVNnnvnuunNv.C00OOC00oO("New") || !this.nuunNvv.uUnuvNvvNU());
   public final nNUuNvVn UuNnnVnuNNV = new nNUuNvVn("Скорость градиента", 1.0F, 0.2F, 3.0F, 0.1F, false)
      .UuUVuuUu(() -> this.NVNnnvnuunNv.C00OOC00oO("New") || !this.nuunNvv.uUnuvNvvNU());
   public final nNUuNvVn uUVvnUuNvvN = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final UuNuuVUnv VvVvnNUnvuvV = new UuNuuVUnv();
   private final Map<class_1657, NameTags.nvUnvV> ccOO0COcoco0 = new HashMap<>();
   private final Map<class_1309, NameTags.nvUnvV> NUVvUUVuVNVv = new HashMap<>();
   private final Map<class_1542, NameTags.nvUnvV> nNuVunNUVu = new HashMap<>();
   private final Map<Integer, NameTags.nvnNNunvv> UNvvunVVn = new HashMap<>();
   private final List<NameTags.uunvUUVnuNn> UnvuVuVnNuvu = new ArrayList<>();
   private final Set<Integer> UvNNVUVNVuvV = new HashSet<>();
   private final List<class_1799> NnunUUnU = new ArrayList<>();
   private final List<class_1799> nvuVvuNnNUnv = new ArrayList<>();
   private final class_4587 NnVnNVN = new class_4587();
   private final Vector3f vnvvNvUnVv = new Vector3f();
   private final List<NameTags.VvunVVUvUNnv> OCOocoOoOO = new ArrayList<>();
   private final List<float[]> o0Ooc0COOoc = new ArrayList<>();
   private boolean nvvnUnUn;
   private float UnUUVuVunvVu;
   private float nnvuvUNuUnN;
   private float UVnuVUUVnnU;
   private float VunnVNvNV;
   private final Map<String, Float> NvUVUvVVnUu = new HashMap<>();
   private final Map<Integer, Long> unnUnUNVnN = new HashMap<>();
   private final vVvnUVnUvv NnuUnUNnu = new vVvnUVnUvv() {};
   private boolean UnnnvvU = false;
   private float VUUnuVvVu = 0.0F;
   private float VvVuvUvvNNVv = 0.0F;
   private float UnnNNvuvvUU = 0.0F;
   private float VNNnnVUuvv = 0.0F;
   private float vUvUvUNNuNvn = 0.0F;
   private boolean uuVuUuuVVNvN = false;
   private boolean VvuUUUNNNv = false;
   private long uuuVnuvnnNnU = 0L;
   private int nNunUnVN;
   private int VnVuuvVvnNv;
   private int vuvvuVuVv;
   private int uunNUuunVU;
   private int NvnuuuvnVV;
   private int NnUVNnuvUv;
   private static final OO0OCoOC UuuuNNunN = OO0OCoOC.UuUVuuUu();

   public NameTags() {
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
            this.NuunnvnN,
            this.NVUunUNUN,
            this.uUVvnUuNvvN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU,
            this.nVVUuvuNnUN,
            this.nNnVnUNVV,
            this.nuunNvv,
            this.uUVVvVVNvvn,
            this.vvUVNVvvNUv,
            this.UuNnnVnuNNV
         }
      );
      this.NnuUnUNnu.UuUVuuUu(this.unNNVVNnvvV);
      this.NnuUnUNnu.UuUVuuUu(this.uVunuUNVVUUV);
      this.NnuUnUNnu.UuUVuuUu(this.UNnVVNvvnVvU);
      this.NnuUnUNnu.UuUVuuUu(this.uNnUnnuNUnNu);
      this.NnuUnUNnu.UuUVuuUu(this.NnUuNNU);
      this.NnuUnUNnu.UuUVuuUu(this.nNvNUVU);
      this.NnuUnUNnu.UuUVuuUu(this.UnUNuUU);
      this.NnuUnUNnu.UuUVuuUu(this.uUVuVvuNUvnu);
      this.NnuUnUNnu.UuUVuuUu(this.NVUunUNUN);
      this.NnuUnUNnu.UuUVuuUu(this.uUVvnUuNvvN);
      this.NnuUnUNnu.UuUVuuUu(this.UUVNuUNUvUnV);
      this.NnuUnUNnu.UuUVuuUu(this.vuvnUnVnUNnV);
      this.NnuUnUNnu.UuUVuuUu(this.nnuUVNUuvvVU);
      this.NnuUnUNnu.UuUVuuUu(this.nVVUuvuNnUN);
      this.NnuUnUNnu.UuUVuuUu(this.nNnVnUNVV);
      this.NnuUnUNnu.UuUVuuUu(this.nuunNvv);
      this.NnuUnUNnu.UuUVuuUu(this.uUVVvVVNvvn);
      this.NnuUnUNnu.UuUVuuUu(this.vvUVNVvvNUv);
      this.NnuUnUNnu.UuUVuuUu(this.UuNnnVnuNNV);
   }

   @Override
   public void UuUVuuUu() {
      this.VvVvnNUnvuvV.UuUVuuUu();
      this.unnUnUNVnN.clear();
      this.NvUVUvVVnUu.clear();
      this.UNvvunVVn.clear();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      this.VvVvnNUnvuvV.UuUVuuUu();
      this.unnUnUNVnN.clear();
      this.NvUVUvVVnUu.clear();
      this.UNvvunVVn.clear();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.VvVvnNUnvuvV.UuUVuuUu();
      this.ccOO0COcoco0.clear();
      this.NUVvUUVuVNVv.clear();
      this.nNuVunNUVu.clear();
      this.UnvuVuVnNuvu.clear();
      this.UNvvunVVn.clear();
      this.NvUVUvVVnUu.clear();
      this.unnUnUNVnN.clear();
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 0
   )
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (this.nuUnNvnuUu && !(uUnuvNvvNU.field_1755 instanceof class_490)) {
         if (this.NVNnnvnuunNv.C00OOC00oO("New")) {
            this.VvVvnNUnvuvV.UuUVuuUu(var1, this);
         } else {
            this.C00OOC00oO(var1);
         }
      }
   }

   public boolean UuUVuuUu(int var1) {
      return this.nuUnNvnuUu && var1 == 60;
   }

   private void C00OOC00oO(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         this.UuuNnUvUuv();
         this.OCOocoOoOO.clear();
         this.o0Ooc0COOoc.clear();
         float var2 = uUnuvNvvNU.method_61966().method_60637(true);
         this.UuUVuuUu(var2);
         this.nUUVuvU();
         UnVNvNnU var3 = var1.vVvUvVVuuNvV();
         class_332 var4 = var1.vNUvnnVnUvu();
         this.UnvuVuVnNuvu.clear();
         float var5 = (float)uUnuvNvvNU.field_1729.method_1603();
         float var6 = (float)uUnuvNvvNU.field_1729.method_1604();
         boolean var7 = uUnuvNvvNU.field_1755 instanceof class_408;
         Set var8 = this.UvNNVUVNVuvV;
         var8.clear();
         if (!this.ccOO0COcoco0.isEmpty() || !this.NUVvUUVuVNVv.isEmpty() || !this.nNuVunNUVu.isEmpty()) {
            for (Entry var10 : this.ccOO0COcoco0.entrySet()) {
               class_1657 var11 = (class_1657)var10.getKey();
               NameTags.nvUnvV var12 = (NameTags.nvUnvV)var10.getValue();
               if (!this.UuUVuuUu(var12)) {
                  var8.add(var11.method_5628());
                  this.unnUnUNVnN.putIfAbsent(var11.method_5628(), System.currentTimeMillis());
                  float var13 = class_3532.method_15363((float)(System.currentTimeMillis() - this.unnUnUNVnN.get(var11.method_5628())) / 300.0F, 0.0F, 1.0F);
                  this.UuUVuuUu(var3, var4, var11, var12, var5, var6, var7, var2, var13);
               }
            }

            for (Entry var20 : this.NUVvUUVuVNVv.entrySet()) {
               class_1309 var23 = (class_1309)var20.getKey();
               NameTags.nvUnvV var26 = (NameTags.nvUnvV)var20.getValue();
               if (!this.UuUVuuUu(var26)) {
                  var8.add(var23.method_5628());
                  this.unnUnUNVnN.putIfAbsent(var23.method_5628(), System.currentTimeMillis());
                  float var29 = class_3532.method_15363((float)(System.currentTimeMillis() - this.unnUnUNVnN.get(var23.method_5628())) / 300.0F, 0.0F, 1.0F);
                  if (!(var23 instanceof class_1646 var14 && this.UuUVuuUu(var3, var14, var26, var29))) {
                     this.UuUVuuUu(var3, var23, var26, var5, var6, var7, var29);
                  }
               }
            }

            for (Entry var21 : this.nNuVunNUVu.entrySet()) {
               class_1542 var24 = (class_1542)var21.getKey();
               NameTags.nvUnvV var27 = (NameTags.nvUnvV)var21.getValue();
               if (!this.UuUVuuUu(var27)) {
                  var8.add(var24.method_5628());
                  this.unnUnUNVnN.putIfAbsent(var24.method_5628(), System.currentTimeMillis());
                  float var30 = class_3532.method_15363((float)(System.currentTimeMillis() - this.unnUnUNVnN.get(var24.method_5628())) / 300.0F, 0.0F, 1.0F);
                  class_1799 var32 = var24.method_6983();
                  this.UuUVuuUu(var3, var24, var27, var32, var30);
               }
            }
         }

         this.unnUnUNVnN.keySet().retainAll(var8);
         this.UuUVuuUu(var3, var4);
         if (var7) {
            boolean var19 = GLFW.glfwGetMouseButton(uUnuvNvvNU.method_22683().method_4490(), 0) == 1;
            boolean var22 = GLFW.glfwGetMouseButton(uUnuvNvvNU.method_22683().method_4490(), 1) == 1;
            boolean var25 = var19 && !this.uuVuUuuVVNvN;
            boolean var28 = var22 && !this.VvuUUUNNNv;
            this.uuVuUuuVVNvN = var19;
            this.VvuUUUNNNv = var22;
            boolean var31 = this.UuUVuuUu(var3, var5, var6, var19, var25);
            if (!var31 && (var25 || var28) && System.currentTimeMillis() - this.uuuVnuvnnNnU > 150L) {
               this.uuuVnuvnnNnU = System.currentTimeMillis();
               boolean var33 = false;

               for (NameTags.VvunVVUvUNnv var16 : this.OCOocoOoOO) {
                  if (this.UuUVuuUu(var5, var6, var16.x, var16.y, var16.w, var16.h)) {
                     var33 = true;
                     if (var25) {
                        this.UnnnvvU = !this.UnnnvvU;
                        if (this.UnnnvvU) {
                           this.VUUnuVvVu = var16.x;
                           this.VvVuvUvvNNVv = var16.y;
                           this.UnnNNvuvvUU = var16.w;
                           this.VNNnnVUuvv = var16.h;
                        }
                     } else if (var16.playerName != null) {
                        uNvUVUNvuUVV.C00OOC00oO(var16.playerName);
                     }
                     break;
                  }
               }

               if (var25 && !var33 && this.UnnnvvU) {
                  UuUuVnVvnvn.NVnVnNnN var35 = UuUuVnVvnvn.UuUVuuUu(var3, this.NnuUnUNnu, this.VUUnuVvVu, this.VvVuvUvvNNVv, this.UnnNNvuvvUU, this.VNNnnVUuvv);
                  if (!var35.contains(var5, var6, 8.0F)) {
                     this.UnnnvvU = false;
                  }
               }
            }

            float var34 = this.UnnnvvU ? 1.0F : 0.0F;
            this.vUvUvUNNuNvn = this.vUvUvUNNuNvn + (var34 - this.vUvUvUNNuNvn) * 0.15F;
            if (this.vUvUvUNNuNvn > 0.01F) {
               UuUuVnVvnvn.UuUVuuUu(
                  var3,
                  this.NnuUnUNnu,
                  this.VUUnuVvVu,
                  this.VvVuvUvvNNVv,
                  this.UnnNNvuvvUU,
                  this.VNNnnVUuvv,
                  uUnuvNvvNU.method_22683().method_4486(),
                  uUnuvNvvNU.method_22683().method_4502(),
                  this.vUvUvUNNuNvn,
                  var5,
                  var6,
                  var25,
                  var19
               );
            }
         } else {
            this.UnnnvvU = false;
            this.vUvUvUNNuNvn = 0.0F;
            this.uuVuUuuVVNvN = false;
            this.VvuUUUNNNv = false;
            this.nvvnUnUn = false;
         }
      }
   }

   private boolean UuUVuuUu(UnVNvNnU var1, float var2, float var3, boolean var4, boolean var5) {
      float var6 = 9.0F;
      if (this.nvvnUnUn) {
         if (!var4) {
            this.nvvnUnUn = false;
            if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         } else {
            float var7 = (var2 - this.UVnuVUUVnnU + (var3 - this.VunnVNvNV)) * 0.5F;
            float var8 = (this.nnvuvUNuUnN + var7) / Math.max(1.0F, this.nnvuvUNuUnN);
            this.unNNVVNnvvV.UuUVuuUu(this.UnUUVuVunvVu * var8);
         }
      }

      for (float[] var13 : this.o0Ooc0COOoc) {
         float var9 = var13[0] + var13[2];
         float var10 = var13[1] + var13[3];
         boolean var11 = !this.nvvnUnUn && var2 >= var9 - var6 && var2 <= var9 + 2.0F && var3 >= var10 - var6 && var3 <= var10 + 2.0F;
         if (var11 && var5) {
            this.nvvnUnUn = true;
            this.UnUUVuVunvVu = this.unNNVVNnvvV.uUnuvNvvNU();
            this.nnvuvUNuUnN = var13[2];
            this.UVnuVUUVnnU = var2;
            this.VunnVNvNV = var3;
         }

         this.UuUVuuUu(var1, var9, var10, var11);
      }

      return this.nvvnUnUn;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, boolean var4) {
      int var5 = var4 ? UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, 180) : UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, 55);
      float var6 = 2.0F;
      float var7 = 4.0F;
      var1.UuUVuuUu(var2 - var6, var3 - var6, var6, var6, 1.0F, var5);
      var1.UuUVuuUu(var2 - var6 - var7, var3 - var6, var6, var6, 1.0F, var5);
      var1.UuUVuuUu(var2 - var6, var3 - var6 - var7, var6, var6, 1.0F, var5);
   }

   private void UuuNnUvUuv() {
      float var1 = this.uUVvnUuNvvN.uUnuvNvvNU();
      String var2 = this.UUVNuUNUvUnV.uUnuvNvvNU();
      if (var2.equals("Светлый")) {
         this.nNunUnVN = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(240, 240, 245, (int)(255.0F * var1));
         this.VnVuuvVvnNv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(220, 220, 225, (int)(200.0F * var1));
         this.vuvvuVuVv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(200, 200, 200, (int)(180.0F * var1));
         this.uunNUuunVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(170, 170, 170, (int)(255.0F * var1));
         this.NvnuuuvnVV = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(30, 30, 30, 255);
         this.NnUVNnuvUv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(100, 100, 100, 255);
      } else if (var2.equals("Блюр")) {
         this.nNunUnVN = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(10, 10, 10, (int)(120.0F * var1));
         this.VnVuuvVvnNv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(30, 30, 30, (int)(90.0F * var1));
         this.vuvvuVuVv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, (int)(40.0F * var1));
         this.uunNUuunVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, (int)(90.0F * var1));
         this.NvnuuuvnVV = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(250, 250, 250, 255);
         this.NnUVNnuvUv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(200, 200, 200, 255);
      } else if (var2.equals("Неоморфизм")) {
         this.nNunUnVN = VVNunVNVuuu.UuUVuuUu(var1);
         this.VnVuuvVvnNv = VVNunVNVuuu.UuUVuuUu(var1);
         this.vuvvuVuVv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(0, 0, 0, 0);
         this.uunNUuunVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(0, 0, 0, 0);
         this.NvnuuuvnVV = VVNunVNVuuu.C00OOC00oO(1.0F);
         this.NnUVNnuvUv = VVNunVNVuuu.uUnuvNvvNU(1.0F);
      } else {
         this.nNunUnVN = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(25, 25, 26, (int)(255.0F * var1));
         this.VnVuuvVvnNv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(35, 35, 35, (int)(170.0F * var1));
         this.vuvvuVuVv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(78, 78, 78, (int)(176.0F * var1));
         this.uunNUuunVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(120, 120, 120, (int)(255.0F * var1));
         this.NvnuuuvnVV = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(240, 240, 240, 255);
         this.NnUVNnuvUv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(200, 200, 200, 255);
      }

      this.UuUVuuUu(var1, var2);
   }

   private void UuUVuuUu(float var1, String var2) {
      NvVNvUvunNNu var3 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
      boolean var4 = "Светлый".equals(var2) || UuuuNNunN.uUnuvNvvNU(var3) || VVNunVNVuuu.vVvUvVVuuNvV();
      NUunUunuNV var5 = NUunUunuNV.UuUVuuUu(var3, var4);
      int var6 = VnVnuUn.uUnuvNvvNU(var5.uVunuUNVVUUV(), var5.UNnVVNvvnVvU(), 0.42F);
      if (var4 && !"Неоморфизм".equals(var2)) {
         this.nNunUnVN = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-196865, var5.uVunuUNVVUUV(), 0.026F), (int)(184.0F * var1));
         this.VnVuuvVvnNv = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-1, var5.UNnVVNvvnVvU(), 0.04F), (int)(210.0F * var1));
         this.vuvvuVuVv = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-15261133, var6, 0.34F), (int)(48.0F * var1));
         this.uunNUuunVU = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-15261133, var6, 0.56F), (int)(92.0F * var1));
         this.NvnuuuvnVV = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-15722718, var5.uVunuUNVVUUV(), 0.035F), 255);
         this.NnUVNnuvUv = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-12168086, var5.UNnVVNvvnVvU(), 0.055F), 255);
      } else if ("Феррофлюид".equals(var2)) {
         this.nNunUnVN = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-15657182, var5.uVunuUNVVUUV(), 0.1F), (int)(230.0F * var1));
         this.VnVuuvVvnNv = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-15393492, var5.UNnVVNvvnVvU(), 0.14F), (int)(235.0F * var1));
         this.vuvvuVuVv = VnVnuUn.UuUVuuUu(var6, (int)(72.0F * var1));
         this.uunNUuunVU = VnVnuUn.UuUVuuUu(var6, (int)(122.0F * var1));
         this.NvnuuuvnVV = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(246, 248, 255, 255);
         this.NnUVNnuvUv = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(188, 197, 214, 255);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, class_1657 var3, NameTags.nvUnvV var4, float var5, float var6, boolean var7, float var8, float var9) {
      float var10 = (float)class_3532.method_15350(16.0 / Math.max(var4.distance(), 12.0), 0.75, 1.15) * this.unNNVVNnvvV.uUnuvNvvNU();
      float var11 = Math.abs(var4.feetY() - var4.headY());
      float var12 = Math.max(4.0F * var10, var4.boxRight() - var4.boxLeft());
      float var13 = var4.boxLeft();
      float var14 = Math.min(var4.headY(), var4.feetY());
      float var15 = 6.0F * var10;
      String var16 = var3.method_7334() != null ? var3.method_7334().getName() : var3.method_5477().getString();
      String var17 = ProtectInfo.uUnuvNvvNU(var16);
      String var18 = O0oo00cC00o.UuUVuuUu(var3);
      int var19 = O0oo00cC00o.UuUVuuUu(var3, UnVNvNnU.VvunVVUvUNnv.UuUVuuUu(255, 70, 70), 255);
      boolean var20 = uNvUVUNvuUVV.UuUVuuUu(var16);
      if (this.NVUunUNUN.C00OOC00oO("Боксы")) {
         float var21 = var12 * 0.25F;
         float var22 = Math.max(1.0F, 1.5F * var10);
         long var23 = System.currentTimeMillis();
         float var25 = (float)(Math.sin(var23 / 200.0) + 1.0) / 2.0F;
         int var26 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(150, 150, 150, 150), UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, 220), var25 * 0.4F);
         var26 = this.UuUVuuUu(var26, var9);
         var1.UuUVuuUu(var13, var14, var21, var22, 0.0F, var26);
         var1.UuUVuuUu(var13, var14, var22, var21, 0.0F, var26);
         var1.UuUVuuUu(var13 + var12 - var21, var14, var21, var22, 0.0F, var26);
         var1.UuUVuuUu(var13 + var12 - var22, var14, var22, var21, 0.0F, var26);
         var1.UuUVuuUu(var13, var14 + var11 - var22, var21, var22, 0.0F, var26);
         var1.UuUVuuUu(var13, var14 + var11 - var21, var22, var21, 0.0F, var26);
         var1.UuUVuuUu(var13 + var12 - var21, var14 + var11 - var22, var21, var22, 0.0F, var26);
         var1.UuUVuuUu(var13 + var12 - var22, var14 + var11 - var21, var22, var21, 0.0F, var26);
      } else if (this.NVUunUNUN.C00OOC00oO("Скелет")) {
         this.UuUVuuUu(var1, var3, var9);
      } else {
         this.NVUunUNUN.C00OOC00oO("Не рендерить");
      }

      float var60 = O0oo00cC00o.UuUVuuUu((class_1309)var3);
      String var61 = Integer.toString(Math.round(var60));
      String var62 = " HP";
      String var24 = var20 ? "[FRIEND] " : "";
      float var63 = 22.0F * var10;
      float var65 = 22.0F * var10;
      float var27 = 16.0F * var10;
      float var28 = 6.0F * var10;
      float var29 = 4.0F * var10;
      float var30 = 22.0F * var10;
      float var31 = var24.isEmpty() ? 0.0F : UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, var63).UuUVuuUu;
      float var32 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var17, var63).UuUVuuUu;
      float var33 = var18.isEmpty() ? 0.0F : UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var18, var65).UuUVuuUu;
      float var34 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var61, var63).UuUVuuUu;
      float var35 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var62, var63).UuUVuuUu;
      float var36 = var31 + (var18.isEmpty() ? 0.0F : var33 + var29) + var32 + var29 + var34 + var35;
      float var37 = var36 + var28 * 2.0F;
      float var38 = var37 + (this.vuvnUnVnUNnV.uUnuvNvvNU() ? var30 + var29 : 0.0F);
      float var39 = var4.screenX() - var38 / 2.0F;
      float var40 = var14 - var30 - 8.0F * var10;
      UvVNVNVuNN.UuUVuuUu(var3.method_5667(), var40);
      List var41 = this.NnunUUnU;
      var41.clear();
      if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         class_1799 var42 = var3.method_6118(class_1304.field_6169);
         if (!var42.method_7960()) {
            var41.add(var42);
         }

         class_1799 var43 = var3.method_6118(class_1304.field_6174);
         if (!var43.method_7960()) {
            var41.add(var43);
         }

         class_1799 var44 = var3.method_6118(class_1304.field_6172);
         if (!var44.method_7960()) {
            var41.add(var44);
         }

         class_1799 var45 = var3.method_6118(class_1304.field_6166);
         if (!var45.method_7960()) {
            var41.add(var45);
         }
      }

      if (!var41.isEmpty()) {
         float var66 = 18.0F * var10;
         float var71 = 4.0F * var10;
         float var75 = var41.size() * var66 + (var41.size() - 1) * var71;
         float var77 = var4.screenX() - var75 / 2.0F;
         float var46 = var40 - var66 - 6.0F * var10;
         UvVNVNVuNN.UuUVuuUu(var3.method_5667(), var46);
         int var47 = 0;

         for (class_1799 var49 : var41) {
            this.UuUVuuUu(var1, var77, var46, var66, var66, var15, var9, var49);
            this.UuUVuuUu(var3, var49, var77 + var10, var46 + var10, var47, var10, 0);
            var77 += var66 + var71;
            var47++;
         }
      }

      float var67 = var39;
      if (this.vuvnUnVnUNnV.uUnuvNvvNU()) {
         this.UuUVuuUu(var1, var39, var40, var30, var30, var15, var9, 0.0F);
         float var72 = var30 - 4.0F * var10;
         this.UuUVuuUu(var1, var3, var39 + 2.0F * var10, var40 + 2.0F * var10, var72, var9);
         var67 = var39 + (var30 + var29);
      }

      if (var20) {
         int var73 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(25, 80, 25, 255), var9);
         var1.UuUVuuUu(var67, var40, var37, var30, var15, var73);
      } else {
         this.UuUVuuUu(var1, var67, var40, var37, var30, var15, var9, 0.0F);
      }

      this.OCOocoOoOO.add(new NameTags.VvunVVUvUNnv(var67, var40, var37, var30, var16));
      if (var7) {
         this.o0Ooc0COOoc.add(new float[]{var67, var40, var37, var30});
      }

      var67 += var28;
      float var74 = var40 + 15.0F * var10;
      if (!var24.isEmpty()) {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var67, var74, var63, var24, this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(60, 150, 255, 255), var9));
         var67 += var31;
      }

      if (!var18.isEmpty()) {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var67, var74, var65, var18, this.UuUVuuUu(var19, var9));
         var67 += var33 + var29;
      }

      this.UuUVuuUu(var1, vNvnnVvvVUu.UuUVuuUu, var67, var74, var63, var17, this.UuUVuuUu(var20 ? NVuunNnvvvVu : this.NvnuuuvnVV, var9));
      var67 += var32 + var29;
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var67, var74, var63, var61, this.UuUVuuUu(this.UuUVuuUu(var60, var3.method_6063()), var9));
      var67 += var34;
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var67, var74, var63, var62, this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(150, 150, 150, 255), var9));
      float var76 = class_3532.method_15363(var60 / var3.method_6063(), 0.0F, 1.0F);
      int var78 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(60, 150, 255, 255), var9);
      float var79 = 2.0F * var10;
      float var80 = var13 - var79 - 4.0F * var10;
      if (this.uUVuVvuNUvnu.uUnuvNvvNU()) {
         var1.UuUVuuUu(var80, var14, var79, var11, 1.0F, this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(0, 0, 0, 100), var9));
         float var81 = var11 * var76;
         var1.UuUVuuUu(var80, var14 + (var11 - var81), var79, var81, 1.0F, var78);
      }

      float var82 = var13 + var12 + 8.0F * var10;
      float var83 = var14;
      float var50 = 20.0F * var10;
      if (this.UnUNuUU.uUnuvNvvNU()) {
         for (class_1293 var52 : var3.method_6026()) {
            String var53 = class_2561.method_43471(var52.method_5586()).getString();
            int var54 = var52.method_5578() + 1;
            String var55 = var53 + (var54 > 1 ? " " + var54 : "");
            int var56 = ((class_1291)var52.method_5579().comp_349()).method_5573() ? this.NvnuuuvnVV : UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 60, 60, 255);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var82, var83 + 10.0F * var10, var50, var55, this.UuUVuuUu(var56, var9));
            var83 += 12.0F * var10;
         }
      }

      List var84 = this.nvuVvuNnNUnv;
      var84.clear();
      if (this.nNvNUVU.uUnuvNvvNU() && !var3.method_6079().method_7960()) {
         var84.add(var3.method_6079());
      }

      if (this.NnUuNNU.uUnuvNvvNU() && !var3.method_6047().method_7960()) {
         var84.add(var3.method_6047());
      }

      float var85 = var14 + var11 + 6.0F * var10;
      float var86 = 22.0F * var10;
      float var87 = 4.0F * var10;
      if (this.nnuUVNUuvvVU.uUnuvNvvNU()) {
         float var88 = var85;

         for (int var90 = 0; var90 < var84.size(); var90++) {
            var88 += this.UuUVuuUu(var1, var3, (class_1799)var84.get(var90), var4.screenX(), var88, var10, var9, 99 + var90, 1) + 3.0F * var10;
         }
      } else {
         float var89 = var84.size() * var86 + Math.max(0, var84.size() - 1) * var87;
         float var91 = var4.screenX() - var89 / 2.0F;

         for (int var57 = 0; var57 < var84.size(); var57++) {
            class_1799 var58 = (class_1799)var84.get(var57);
            this.UuUVuuUu(var1, var91, var85, var86, var86, var15, var9, var58);
            float var59 = 3.0F * var10;
            this.UuUVuuUu(var3, var58, var91 + var59, var85 + var59, 99 + var57, var10, 1);
            var91 += var86 + var87;
         }
      }
   }

   private float UuUVuuUu(UnVNvNnU var1, class_1657 var2, class_1799 var3, float var4, float var5, float var6, float var7, int var8, int var9) {
      float var10 = 22.0F * var6;
      float var12 = 4.0F * var6;
      float var13 = 7.0F * var6;
      float var14 = 18.0F * var6;
      float var15 = Math.max(70.0F * var6, Math.min(190.0F * var6, uUnuvNvvNU.method_22683().method_4489() * 0.28F));
      String var16 = this.UuUVuuUu(this.UuUVuuUu(var3, true), var14, var15);
      float var17 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, var16, var14).UuUVuuUu;
      float var18 = var17 + var13 * 2.0F;
      float var19 = var10 + var12 + var18;
      float var20 = var4 - var19 / 2.0F;
      float var21 = 6.0F * var6;
      this.UuUVuuUu(var1, var20, var5, var10, var10, var21, var7, var3);
      this.UuUVuuUu(var2, var3, var20 + 3.0F * var6, var5 + 3.0F * var6, var8, var6, var9);
      float var22 = var20 + var10 + var12;
      this.UuUVuuUu(var1, var22, var5, var18, var10, var21, var7, var3);
      this.UuUVuuUu(var1, vNvnnVvvVUu.C00OOC00oO, var22 + var13, var5 + 15.0F * var6, var14, var16, var3, var8, var7);
      return var10;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7, class_1799 var8) {
      if (this.nVVUuvuNnUN.uUnuvNvvNU()) {
         int var9 = this.UuUVuuUu(var8, var7);
         var1.UuUVuuUu(var2, var3, var4, var5, var6, 5.0F, 1.0F, this.UuUVuuUu(var9, 0.55F));
      }

      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, 0.0F);
   }

   public static void UuUVuuUu(class_10055 var0, class_591 var1, class_4587 var2) {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         NameTags var3 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(NameTags.class);
         if (var3 != null) {
            var3.C00OOC00oO(var0, var1, var2);
         }
      }
   }

   private void C00OOC00oO(class_10055 var1, class_591 var2, class_4587 var3) {
      if (this.nuUnNvnuUu && uUnuvNvvNU != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (!(uUnuvNvvNU.field_1755 instanceof class_490)) {
            if (this.NVNnnvnuunNv.C00OOC00oO("Legacy") && this.NVUunUNUN.C00OOC00oO("Скелет")) {
               if (var1 != null && var2 != null && var3 != null) {
                  if (!var1.field_53542 && !var1.field_53333 && !var1.field_53461) {
                     if (var1.field_53528 != uUnuvNvvNU.field_1724.method_5628() || uUnuvNvvNU.field_1690.method_31044() != class_5498.field_26664) {
                        class_243 var4 = uUnuvNvvNU.field_1773.method_19418().method_19326();
                        ArrayList var5 = new ArrayList(14);
                        class_243 var6 = this.UuUVuuUu(var2.field_3391, var3, var4, 0.0F, 0.0F, 0.0F);
                        class_243 var7 = this.UuUVuuUu(var2.field_3391, var3, var4, 0.0F, 6.0F, 0.0F);
                        class_243 var8 = this.UuUVuuUu(var2.field_3391, var3, var4, 0.0F, 12.0F, 0.0F);
                        class_243 var9 = this.UuUVuuUu(var2.field_3398, var3, var4, 0.0F, -8.0F, 0.0F);
                        class_243 var10 = this.UuUVuuUu(var2.field_3398, var3, var4, 0.0F, 0.0F, 0.0F);
                        class_243 var11 = this.UuUVuuUu(var2.field_3401, var3, var4, 0.0F, 0.0F, 0.0F);
                        class_243 var12 = this.UuUVuuUu(var2.field_3401, var3, var4, 0.0F, 4.5F, 0.0F);
                        class_243 var13 = this.UuUVuuUu(var2.field_3401, var3, var4, 0.0F, 10.0F, 0.0F);
                        class_243 var14 = this.UuUVuuUu(var2.field_27433, var3, var4, 0.0F, 0.0F, 0.0F);
                        class_243 var15 = this.UuUVuuUu(var2.field_27433, var3, var4, 0.0F, 4.5F, 0.0F);
                        class_243 var16 = this.UuUVuuUu(var2.field_27433, var3, var4, 0.0F, 10.0F, 0.0F);
                        class_243 var17 = this.UuUVuuUu(var2.field_3392, var3, var4, 0.0F, 0.0F, 0.0F);
                        class_243 var18 = this.UuUVuuUu(var2.field_3392, var3, var4, 0.0F, 6.0F, 0.0F);
                        class_243 var19 = this.UuUVuuUu(var2.field_3392, var3, var4, 0.0F, 12.0F, 0.0F);
                        class_243 var20 = this.UuUVuuUu(var2.field_3397, var3, var4, 0.0F, 0.0F, 0.0F);
                        class_243 var21 = this.UuUVuuUu(var2.field_3397, var3, var4, 0.0F, 6.0F, 0.0F);
                        class_243 var22 = this.UuUVuuUu(var2.field_3397, var3, var4, 0.0F, 12.0F, 0.0F);
                        this.UuUVuuUu(var5, var6, var7);
                        this.UuUVuuUu(var5, var7, var8);
                        this.UuUVuuUu(var5, var9, var10);
                        this.UuUVuuUu(var5, var14, var11);
                        this.UuUVuuUu(var5, var20, var17);
                        this.UuUVuuUu(var5, var14, var15);
                        this.UuUVuuUu(var5, var15, var16);
                        this.UuUVuuUu(var5, var11, var12);
                        this.UuUVuuUu(var5, var12, var13);
                        this.UuUVuuUu(var5, var20, var21);
                        this.UuUVuuUu(var5, var21, var22);
                        this.UuUVuuUu(var5, var17, var18);
                        this.UuUVuuUu(var5, var18, var19);
                        if (!var5.isEmpty()) {
                           this.UNvvunVVn.put(var1.field_53528, new NameTags.nvnNNunvv(var5, System.currentTimeMillis()));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private class_243 UuUVuuUu(class_630 var1, class_4587 var2, class_243 var3, float var4, float var5, float var6) {
      this.NnVnNVN.method_34426();
      this.NnVnNVN.method_23760().method_23761().set(var2.method_23760().method_23761());
      var1.method_22703(this.NnVnNVN);
      Matrix4f var7 = this.NnVnNVN.method_23760().method_23761();
      Vector3f var8 = this.vnvvNvUnVv.set(var4 * 0.0625F, var5 * 0.0625F, var6 * 0.0625F);
      var7.transformPosition(var8);
      return var3.method_1031(var8.x, var8.y, var8.z);
   }

   private void UuUVuuUu(List<NameTags.NVnVnNnN> var1, class_243 var2, class_243 var3) {
      if (var2 != null && var3 != null) {
         var1.add(new NameTags.NVnVnNnN(var2, var3));
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1657 var2, float var3) {
      NameTags.nvnNNunvv var4 = this.UNvvunVVn.get(var2.method_5628());
      if (var4 != null && System.currentTimeMillis() - var4.capturedAt() <= 250L) {
         for (NameTags.NVnVnNnN var6 : var4.bones()) {
            this.UuUVuuUu(var1, var6.start(), var6.end(), var3);
         }
      }
   }

   private void nUUVuvU() {
      long var1 = System.currentTimeMillis();
      this.UNvvunVVn.entrySet().removeIf(var2 -> var1 - var2.getValue().capturedAt() > 250L);
   }

   private void UuUVuuUu(UnVNvNnU var1, class_243 var2, class_243 var3, float var4) {
      class_243 var5 = this.UuUVuuUu(var2.field_1352, var2.field_1351, var2.field_1350);
      class_243 var6 = this.UuUVuuUu(var3.field_1352, var3.field_1351, var3.field_1350);
      if (var5 != null && var6 != null) {
         double var7 = uUnuvNvvNU.field_1773.method_19418().method_19326().method_1022(var2);
         float var9 = class_3532.method_15363((float)(12.0 / Math.max(var7, 1.0)), 1.0F, 10.0F);
         float var10 = var4 * this.uUVvnUuNvvN.uUnuvNvvNU();
         int var11 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(200, 200, 210, 255), var10);
         float var12 = (float)Math.hypot(var6.field_1352 - var5.field_1352, var6.field_1351 - var5.field_1351);
         float var13 = (float)Math.toDegrees(Math.atan2(var6.field_1351 - var5.field_1351, var6.field_1352 - var5.field_1352));
         var1.UuUVuuUu((float)var5.field_1352, (float)var5.field_1351);
         var1.C00OOC00oO(var13);
         if (!(var7 > 12.0) && !(var9 < 2.0F)) {
            int var14 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(20, 20, 20, 180), var10);
            int var15 = this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, 255), var10);
            var1.UuUVuuUu(0.0F, -var9 * 0.3F, var12, var9 * 0.6F, 0.0F, var11);
            var1.UuUVuuUu(0.0F, -var9 * 0.1F, var12, var9 * 0.2F, 0.0F, var15);
         } else {
            var1.UuUVuuUu(0.0F, -var9 / 2.0F, var12, var9, 0.0F, var11);
         }

         var1.VVuuUN();
         var1.vNUvnnVnUvu();
      }
   }

   private class_243 UuUVuuUu(double var1, double var3, double var5) {
      class_4184 var7 = uUnuvNvvNU.field_1773.method_19418();
      class_243 var8 = new class_243(var1, var3, var5);
      if (var8.method_1025(var7.method_19326()) < 1.0E-6) {
         return null;
      } else {
         class_243 var9 = VnNnNnvuvn.UuUVuuUu(var8);
         return !(var9.field_1350 <= 0.001F) && !(var9.field_1350 > 1.0) ? var9 : null;
      }
   }

   private void UuUVuuUu(float var1) {
      this.ccOO0COcoco0.clear();
      this.NUVvUUVuVNVv.clear();
      this.nNuVunNUVu.clear();
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         if (this.uVunuUNVVUUV.C00OOC00oO("Игроки")) {
            this.C00OOC00oO(var1);
         }

         if (this.uVunuUNVVUUV.C00OOC00oO("Мобы") || this.uVunuUNVVUUV.C00OOC00oO("Животные") || this.vNVuvnUUnuUn()) {
            this.uUnuvNvvNU(var1);
         }

         if (this.uVunuUNVVUUV.C00OOC00oO("Предметы")) {
            this.vVvUvVVuuNvV(var1);
         }
      }
   }

   private void C00OOC00oO(float var1) {
      for (class_1657 var3 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var3 != null
            && var3.method_5805()
            && (var3 != uUnuvNvvNU.field_1724 || !uUnuvNvvNU.field_1690.method_31044().method_31034())
            && (this.uVunuUNVVUUV.C00OOC00oO("Голые") || var3.method_6096() != 0 || var3 == uUnuvNvvNU.field_1724)) {
            NameTags.nvUnvV var4 = this.UuUVuuUu(var1, var3, var3.method_17682() + 0.2, 0.02);
            if (var4 != null) {
               this.ccOO0COcoco0.put(var3, var4);
            }
         }
      }
   }

   private void uUnuvNvvNU(float var1) {
      AutoVillageTrade var2 = this.UnUNVVVNuv();

      for (class_1297 var4 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var4 instanceof class_1309 var5
            && var5.method_5805()
            && var5 != uUnuvNvvNU.field_1724
            && !(var5 instanceof class_1657)
            && !(var5 instanceof class_1531)) {
            boolean var6 = var5 instanceof class_1646 var7 && var2 != null && var2.UuUVuuUu(var7) != null;
            if ((!this.UuUVuuUu(var5) || this.uVunuUNVVUUV.C00OOC00oO("Мобы") || var6)
               && (!this.C00OOC00oO(var5) || this.uVunuUNVVUUV.C00OOC00oO("Животные"))
               && (this.UuUVuuUu(var5) || this.C00OOC00oO(var5) || var6)) {
               NameTags.nvUnvV var8 = this.UuUVuuUu(var1, var5, var5.method_17682() + 0.18, 0.02);
               if (var8 != null) {
                  this.NUVvUUVuVNVv.put(var5, var8);
               }
            }
         }
      }
   }

   private void vVvUvVVuuNvV(float var1) {
      for (class_1297 var3 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var3 instanceof class_1542 var4 && var4.method_5805() && !var4.method_6983().method_7960()) {
            NameTags.nvUnvV var5 = this.UuUVuuUu(var1, var4, 0.52, 0.0);
            if (var5 != null) {
               this.nNuVunNUVu.put(var4, var5);
            }
         }
      }
   }

   private NameTags.nvUnvV UuUVuuUu(float var1, class_1297 var2, double var3, double var5) {
      class_4184 var7 = uUnuvNvvNU.field_1773.method_19418();
      class_243 var8 = var7.method_19326();
      class_243 var9 = var2.method_30950(var1);
      class_238 var10 = var2.method_5829();
      class_243 var11 = var2.method_19538();
      class_238 var12 = var10.method_989(var9.field_1352 - var11.field_1352, var9.field_1351 - var11.field_1351, var9.field_1350 - var11.field_1350);
      class_238 var13 = new class_238(
         var12.field_1323 - 0.02, var9.field_1351 + var5, var12.field_1321 - 0.02, var12.field_1320 + 0.02, var9.field_1351 + var3, var12.field_1324 + 0.02
      );
      NameTags.nvUnvV var14 = this.UuUVuuUu(var13, var8);
      if (var14 != null) {
         return var14;
      } else {
         class_243 var15 = new class_243(var9.field_1352, var9.field_1351 + var3, var9.field_1350);
         class_243 var16 = new class_243(var9.field_1352, var9.field_1351 + var5, var9.field_1350);
         if (var15.method_1025(var8) < 1.0E-6) {
            return null;
         } else {
            class_243 var17 = VnNnNnvuvn.UuUVuuUu(var15);
            class_243 var18 = VnNnNnvuvn.UuUVuuUu(var16);
            if (var17.field_1350 <= 0.001F || var17.field_1350 > 1.0) {
               return null;
            } else if (!(var18.field_1350 <= 0.001F) && !(var18.field_1350 > 1.0)) {
               double var19 = var8.method_1022(var15);
               float var21 = Math.abs((float)var18.field_1351 - (float)var17.field_1351);
               float var22 = var21 * 0.45F;
               float var23 = (float)var17.field_1352;
               return new NameTags.nvUnvV(
                  var23, (float)var17.field_1351, (float)var18.field_1351, (float)var17.field_1350, var19, var23 - var22 / 2.0F, var23 + var22 / 2.0F
               );
            } else {
               return null;
            }
         }
      }
   }

   private NameTags.nvUnvV UuUVuuUu(class_238 var1, class_243 var2) {
      float var3 = Float.POSITIVE_INFINITY;
      float var4 = Float.POSITIVE_INFINITY;
      float var5 = Float.NEGATIVE_INFINITY;
      float var6 = Float.NEGATIVE_INFINITY;
      float var7 = 0.0F;
      double var8 = (var1.field_1323 + var1.field_1320) * 0.5;
      double var10 = (var1.field_1322 + var1.field_1325) * 0.5;
      double var12 = (var1.field_1321 + var1.field_1324) * 0.5;

      for (int var14 = 0; var14 < 2; var14++) {
         double var15 = var14 == 0 ? var1.field_1323 : var1.field_1320;

         for (int var17 = 0; var17 < 2; var17++) {
            double var18 = var17 == 0 ? var1.field_1322 : var1.field_1325;

            for (int var20 = 0; var20 < 2; var20++) {
               double var21 = var20 == 0 ? var1.field_1321 : var1.field_1324;
               class_243 var23 = VnNnNnvuvn.UuUVuuUu(new class_243(var15, var18, var21));
               if (var23 == null || var23.field_1350 <= 0.001F || var23.field_1350 > 1.0) {
                  return null;
               }

               var3 = Math.min(var3, (float)var23.field_1352);
               var4 = Math.min(var4, (float)var23.field_1351);
               var5 = Math.max(var5, (float)var23.field_1352);
               var6 = Math.max(var6, (float)var23.field_1351);
               var7 += (float)var23.field_1350;
            }
         }
      }

      if (Float.isFinite(var3) && Float.isFinite(var4) && Float.isFinite(var5) && Float.isFinite(var6)) {
         double var24 = var2.method_1022(new class_243(var8, var10, var12));
         return new NameTags.nvUnvV((var3 + var5) * 0.5F, var4, var6, var7 / 8.0F, var24, var3, var5);
      } else {
         return null;
      }
   }

   private boolean UuUVuuUu(NameTags.nvUnvV var1) {
      return var1 == null || var1.depth() <= 0.001F || var1.depth() > 1.0F;
   }

   private int UuUVuuUu(float var1, float var2) {
      float var3 = class_3532.method_15363(var1 / Math.max(1.0F, var2), 0.0F, 1.0F);
      int var4 = var3 >= 0.5F ? (int)(255.0F * (1.0F - var3) * 2.0F) : 255;
      int var5 = var3 >= 0.5F ? 255 : (int)(255.0F * var3 * 2.0F);
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var4, var5, 50, 255);
   }

   private boolean UuUVuuUu(UnVNvNnU var1, class_1646 var2, NameTags.nvUnvV var3, float var4) {
      AutoVillageTrade var5 = this.UnUNVVVNuv();
      if (var5 == null) {
         return false;
      } else {
         AutoVillageTrade.nvnNNunvv var6 = var5.UuUVuuUu(var2);
         if (var6 != null && var6.itemStack() != null && !var6.itemStack().method_7960()) {
            class_1799 var7 = var6.itemStack();
            float var8 = (float)class_3532.method_15350(16.0 / Math.max(var3.distance(), 12.0), 0.75, 1.15) * this.unNNVVNnvvV.uUnuvNvvNU();
            float var9 = 6.0F * var8;
            float var10 = 18.0F * var8;
            float var11 = 22.0F * var8;
            float var12 = 4.0F * var8;
            float var13 = 6.0F * var8;
            String var14 = var6.price() + " изумр. · x" + var6.availableAmount();
            float var15 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, var14, var10).UuUVuuUu;
            float var16 = var15 + var13 * 2.0F;
            float var17 = var11 + var12 + var16;
            float var18 = var3.screenX() - var17 / 2.0F;
            float var19 = var3.headY() - 18.0F * var8;
            this.UuUVuuUu(var1, var18, var19, var11, var11, var9, var4, var7);
            float var20 = (var11 - 16.0F * var8) / 2.0F;
            this.UuUVuuUu(uUnuvNvvNU.field_1724, var7, var18 + var20, var19 + var20, var2.method_5628(), var8, 0);
            float var21 = var18 + var11 + var12;
            this.UuUVuuUu(var1, var21, var19, var16, var11, var9, var4, var7);
            this.UuUVuuUu(var1, vNvnnVvvVUu.C00OOC00oO, var21 + var13, var19 + 15.0F * var8, var10, var14, var7, var2.method_5628(), var4);
            return true;
         } else {
            return false;
         }
      }
   }

   private AutoVillageTrade UnUNVVVNuv() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AutoVillageTrade.class)
         : null;
   }

   private boolean vNVuvnUUnuUn() {
      AutoVillageTrade var1 = this.UnUNVVVNuv();
      return var1 != null && var1.nuUnNvnuUu;
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1309 var2, NameTags.nvUnvV var3, float var4, float var5, boolean var6, float var7) {
      float var8 = (float)class_3532.method_15350(6.0 / Math.max(var3.distance(), 1.0), 0.45, 1.0) * this.unNNVVNnvvV.uUnuvNvvNU();
      float var9 = 6.0F * var8;
      String var10 = ProtectInfo.uUnuvNvvNU(var2.method_5477().getString());
      float var11 = var2.method_6032() + var2.method_6067();
      float var12 = var2.method_6063();
      String var13 = " " + String.format("%.1f", var11).replace(',', '.');
      if (var13.endsWith(".0")) {
         var13 = var13.substring(0, var13.length() - 2);
      }

      float var14 = 22.0F * var8;
      float var15 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var10, var14).UuUVuuUu;
      float var16 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13, var14).UuUVuuUu;
      float var17 = this.vuvnUnVnUNnV.uUnuvNvvNU() ? 14.0F * var8 : 0.0F;
      float var18 = this.vuvnUnVnUNnV.uUnuvNvvNU() ? 4.0F * var8 : 0.0F;
      float var19 = var17 + var18 + var15 + var16;
      float var20 = var19 + 16.0F * var8;
      float var21 = 17.0F * var8;
      float var22 = var3.screenX() - var20 / 2.0F;
      float var23 = var3.headY() - 18.0F * var8;
      boolean var24 = var6 && this.UuUVuuUu(var4, var5, var22, var23, var20, var21);
      String var25 = var2.method_5845();
      float var26 = this.NvUVUvVVnUu.getOrDefault(var25, 0.0F);
      float var27 = var24 && !this.UnnnvvU ? 1.0F : 0.0F;
      var26 += (var27 - var26) * 0.15F;
      this.NvUVUvVVnUu.put(var25, var26);
      this.UuUVuuUu(var1, var22, var23, var20, var21, var9, var7, var26);
      float var28 = var3.screenX() - var19 / 2.0F;
      if (this.vuvnUnVnUNnV.uUnuvNvvNU()) {
         this.UuUVuuUu(var1, var2, var28, var23 + 1.5F * var8, var17, var7);
         var28 += var17 + var18;
      }

      this.UuUVuuUu(var1, vNvnnVvvVUu.UuUVuuUu, var28, var23 + 12.2F * var8, var14, var10, this.UuUVuuUu(this.NnUVNnuvUv, var7));
      var28 += var15;
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var28, var23 + 12.2F * var8, var14, var13, this.UuUVuuUu(this.UuUVuuUu(var11, var12), var7));
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, float var3, float var4, float var5, float var6) {
      if (uUnuvNvvNU.method_1562() != null) {
         class_640 var7 = null;

         for (class_640 var9 : uUnuvNvvNU.method_1562().method_2880()) {
            if (var9.method_2966().getName().equalsIgnoreCase(var2)) {
               var7 = var9;
               break;
            }
         }

         if (var7 != null) {
            try {
               class_2960 var13 = var7.method_52810().comp_1626();
               class_1044 var14 = uUnuvNvvNU.method_1531().method_4619(var13);
               if (var14 != null && var14.method_68004() instanceof class_10868 var10 && var10.method_68427() > 0) {
                  int var15 = var10.method_68427();
                  GlStateManager._bindTexture(var15);
                  var1.uNNnnnuuuN(var6);
                  var1.UuUVuuUu(var15, var3, var4, var5, var5, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                  var1.UuUVuuUu(var15, var3, var4, var5, var5, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                  var1.vuuuNvNuv();
               }
            } catch (Throwable var12) {
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1309 var2, float var3, float var4, float var5, float var6) {
      boolean var7 = false;
      if (var2 instanceof class_1657 var8) {
         if (var8 instanceof class_742 var9) {
            try {
               class_2960 var10 = var9.method_52814().comp_1626();
               class_1044 var11 = uUnuvNvvNU.method_1531().method_4619(var10);
               if (var11 != null && var11.method_68004() instanceof class_10868 var12 && var12.method_68427() > 0) {
                  int var38 = var12.method_68427();
                  GlStateManager._bindTexture(var38);
                  var1.uNNnnnuuuN(var6);
                  var1.UuUVuuUu(var38, var3, var4, var5, var5, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                  var1.UuUVuuUu(var38, var3, var4, var5, var5, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                  var1.vuuuNvNuv();
                  var7 = true;
               }
            } catch (Throwable var19) {
            }
         }

         if (!var7 && uUnuvNvvNU.method_1562() != null) {
            class_640 var22 = null;

            for (class_640 var29 : uUnuvNvvNU.method_1562().method_2880()) {
               if (var29.method_2966().getId().equals(var8.method_5667()) || var29.method_2966().getName().equalsIgnoreCase(var8.method_5477().getString())) {
                  var22 = var29;
                  break;
               }
            }

            if (var22 != null) {
               try {
                  class_2960 var26 = var22.method_52810().comp_1626();
                  class_1044 var30 = uUnuvNvvNU.method_1531().method_4619(var26);
                  if (var30 != null && var30.method_68004() instanceof class_10868 var34 && var34.method_68427() > 0) {
                     int var40 = var34.method_68427();
                     GlStateManager._bindTexture(var40);
                     var1.uNNnnnuuuN(var6);
                     var1.UuUVuuUu(var40, var3, var4, var5, var5, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                     var1.UuUVuuUu(var40, var3, var4, var5, var5, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                     var1.vuuuNvNuv();
                     var7 = true;
                  }
               } catch (Throwable var18) {
               }
            }
         }
      } else {
         try {
            class_897 var23 = uUnuvNvvNU.method_1561().method_3953(var2);
            class_2960 var27 = null;

            for (Method var14 : var23.getClass().getMethods()) {
               if (var14.getReturnType() == class_2960.class
                  && var14.getParameterCount() == 1
                  && var14.getParameterTypes()[0].isAssignableFrom(var2.getClass())) {
                  var14.setAccessible(true);
                  var27 = (class_2960)var14.invoke(var23, var2);
                  break;
               }
            }

            if (var27 != null) {
               class_1044 var32 = uUnuvNvvNU.method_1531().method_4619(var27);
               if (var32 != null && var32.method_68004() instanceof class_10868 var36 && var36.method_68427() > 0) {
                  int var43 = var36.method_68427();
                  GlStateManager._bindTexture(var43);
                  var1.uNNnnnuuuN(var6);
                  float var45 = 0.125F;
                  float var15 = 0.125F;
                  float var16 = 0.25F;
                  float var17 = 0.25F;
                  if (var2 instanceof class_1429) {
                     var45 = 0.0F;
                     var15 = 0.125F;
                     var16 = 0.125F;
                     var17 = 0.25F;
                  }

                  var1.UuUVuuUu(var43, var3, var4, var5, var5, var45, var15, var16, var17, 3.0F);
                  var1.vuuuNvNuv();
                  var7 = true;
               }
            }
         } catch (Throwable var20) {
         }
      }

      if (!var7) {
         int var21 = this.UuUVuuUu(VnVnuUn.uUnuvNvvNU(30, 30, 30, 120), var6);
         var1.UuUVuuUu(var3, var4, var5, var5, 4.0F, var21);
         String var24 = ProtectInfo.uUnuvNvvNU(var2.method_5477().getString());
         String var28 = var24.isEmpty() ? "?" : var24.substring(0, 1).toUpperCase();
         int var33 = this.UuUVuuUu(VnVnuUn.uUnuvNvvNU(200, 200, 200, 200), var6);
         float var37 = var5 * 0.65F;
         float var44 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var28, var37).UuUVuuUu;
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var3 + (var5 - var44) / 2.0F, var4 + var5 / 2.0F + var37 * 0.35F, var37, var28, var33);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1542 var2, NameTags.nvUnvV var3, class_1799 var4, float var5) {
      float var6 = (float)class_3532.method_15350(16.0 / Math.max(var3.distance(), 12.0), 0.75, 1.15) * this.unNNVVNnvvV.uUnuvNvvNU();
      float var7 = 6.0F * var6;
      float var8 = 20.0F * var6;
      String var9 = this.UuUVuuUu(
         this.UuUVuuUu(var4, this.nnuUVNUuvvVU.uUnuvNvvNU()),
         var8,
         Math.max(86.0F * var6, Math.min(190.0F * var6, uUnuvNvvNU.method_22683().method_4489() * 0.3F))
      );
      float var10 = 22.0F * var6;
      float var11 = 4.0F * var6;
      float var12 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, var9, var8).UuUVuuUu;
      float var13 = 6.0F * var6;
      float var14 = var12 + var13 * 2.0F;
      float var15 = var10 + var11 + var14;
      float var16 = var3.screenX() - var15 / 2.0F;
      float var17 = var3.headY() - 12.0F * var6;
      this.UuUVuuUu(var1, var16, var17, var10, var10, var7, var5, var4);
      float var18 = (var10 - 16.0F * var6) / 2.0F;
      this.UuUVuuUu(uUnuvNvvNU.field_1724, var4, var16 + var18, var17 + var18, var2.method_5628(), var6, 0);
      float var19 = var16 + var10 + var11;
      this.UuUVuuUu(var1, var19, var17, var14, var10, var7, var5, var4);
      this.UuUVuuUu(var1, vNvnnVvvVUu.C00OOC00oO, var19 + var13, var17 + 15.0F * var6, var8, var9, var4, var2.method_5628(), var5);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVnuvUu var2, float var3, float var4, float var5, String var6, int var7) {
      if (!this.nuunNvv.uUnuvNvvNU()) {
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var7);
      } else {
         int var8 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(this.vvUVNVvvNUv.vNUvnnVnUvu(), var7 >>> 24 & 0xFF);
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var7, var8, this.UvnvNVnnnnNU());
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVnuvUu var2, float var3, float var4, float var5, String var6, class_1799 var7, int var8, float var9) {
      if (!this.nuunNvv.uUnuvNvvNU()) {
         var1.UuUVuuUu(var2, var3, var4, var5, var6, this.C00OOC00oO(var7, var9));
      } else if (!this.uUVVvVVNvvn.uUnuvNvvNU()) {
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, this.C00OOC00oO(var7, var9));
      } else {
         int[] var10 = NuNvVUuUUnun.UuUVuuUu(var7, var8);
         if (var10 == null) {
            var10 = NuNvVUuUUnun.UuUVuuUu();
         }

         int var11 = Math.round(255.0F * class_3532.method_15363(var9, 0.0F, 1.0F));
         int var12 = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(0, 0, 0, Math.round(185.0F * class_3532.method_15363(var9, 0.0F, 1.0F)));
         var1.UuUVuuUu(var2, var3 + Math.max(0.45F, var5 * 0.035F), var4 + Math.max(0.45F, var5 * 0.035F), var5, var6, var12);
         var1.UuUVuuUu(
            var2, var3, var4, var5, var6, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var10[0], var11), UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var10[1], var11), this.UvnvNVnnnnNU()
         );
      }
   }

   private float UvnvNVnnnnNU() {
      float var1 = Math.max(600.0F, 2600.0F / Math.max(0.1F, this.UuNnnVnuNNV.uUnuvNvvNU()));
      return (float)(System.currentTimeMillis() % (long)var1) / var1;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!(var7 <= 0.05F)) {
         if (this.UUVNuUNUvUnV.uUnuvNvvNU().equals("Неоморфизм")) {
            float var9 = var7 * this.uUVvnUuNvvN.uUnuvNvvNU();
            float var10 = 4.8F + var8 * 1.8F;
            float var11 = 16.0F + var8 * 4.0F;
            float var12 = 0.72F + var8 * 0.12F;
            if (VVNunVNVuuu.UuUVuuUu(null, var2, var3, var4, var5, var6, var10, var11, var12, 1, false, var9)) {
               return;
            }
         }

         if (this.UUVNuUNUvUnV.uUnuvNvvNU().equals("Блюр")) {
            var1.UuUVuuUu(23.0F);
            var1.UuUVuuUu(var2, var3, var4, var5, var6, var7 * this.uUVvnUuNvvN.uUnuvNvvNU());
         }

         int var13 = this.UuUVuuUu(this.vuvvuVuVv, this.uunNUuunVU, var8);
         int var15 = this.UuUVuuUu(this.nNunUnVN, this.VnVuuvVvnNv, var8);
         var15 = this.UuUVuuUu(var15, var7);
         var13 = this.UuUVuuUu(var13, var7);
         if (this.nNnVnUNVV.uUnuvNvvNU()) {
            var1.UuUVuuUu(var2, var3, var4, var5, var6, this.uVUVnuvnuVuv() ? 7.0F : 5.0F, 1.0F, this.uNNnnnuuuN(var7));
         }

         var1.UuUVuuUu(var2, var3, var4, var5, var6, var15);
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var13, 1.0F);
      }
   }

   private boolean uVUVnuvnuVuv() {
      NvVNvUvunNNu var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
      return "Светлый".equals(this.UUVNuUNUvUnV.uUnuvNvvNU()) || UuuuNNunN.uUnuvNvvNU(var1) || VVNunVNVuuu.vVvUvVVuuNvV();
   }

   private int uNNnnnuuuN(float var1) {
      if (!this.uVUVnuvnuVuv()) {
         return this.UuUVuuUu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(0, 0, 0, 120), var1);
      } else {
         NvVNvUvunNNu var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
            ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
            : NvVNvUvunNNu.WILD;
         NUunUunuNV var3 = NUunUunuNV.UuUVuuUu(var2, true);
         int var4 = VnVnuUn.uUnuvNvvNU(-10787208, var3.UNnVVNvvnVvU(), 0.1F);
         return VnVnuUn.UuUVuuUu(var4, (int)(48.0F * Math.max(0.0F, Math.min(1.0F, var1 * this.uUVvnUuNvvN.uUnuvNvvNU()))));
      }
   }

   private int UuUVuuUu(int var1, int var2, float var3) {
      int var4 = var1 >> 24 & 0xFF;
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      int var8 = var2 >> 24 & 0xFF;
      int var9 = var2 >> 16 & 0xFF;
      int var10 = var2 >> 8 & 0xFF;
      int var11 = var2 & 0xFF;
      int var12 = (int)(var4 + (var8 - var4) * var3);
      int var13 = (int)(var5 + (var9 - var5) * var3);
      int var14 = (int)(var6 + (var10 - var6) * var3);
      int var15 = (int)(var7 + (var11 - var7) * var3);
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var13, var14, var15, var12);
   }

   private void UuUVuuUu(class_1657 var1, class_1799 var2, float var3, float var4, int var5, float var6, int var7) {
      if (var2 != null && !var2.method_7960()) {
         this.UnvuVuVnNuvu.add(new NameTags.uunvUUVnuNn(var1, var2.method_7972(), var3, var4, var5, var6, var7));
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_332 var2) {
      if (!this.UnvuVuVnNuvu.isEmpty()) {
         this.UnvuVuVnNuvu.sort(Comparator.comparingInt(NameTags.uunvUUVnuNn::priority));

         for (NameTags.uunvUUVnuNn var4 : this.UnvuVuVnNuvu) {
            NuNvVUuUUnun.UuUVuuUu(var1, var4.stack(), var4.x(), var4.y(), var4.scale(), var4.seed(), false, var4.priority());
         }

         this.UnvuVuVnNuvu.clear();
      }
   }

   private boolean UuUVuuUu(class_1309 var1) {
      return var1 instanceof class_1569 || var1 instanceof class_1621 || var1 instanceof class_1646;
   }

   private boolean C00OOC00oO(class_1309 var1) {
      return var1 instanceof class_1429;
   }

   private int UuUVuuUu(class_1799 var1, float var2) {
      boolean var3 = var1 != null && !var1.method_7960() && var1.method_57826(class_9334.field_49631);
      int var4 = this.C00OOC00oO(var1, var2);
      int var5 = var3
         ? UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(
            UnVNvNnU.VvunVVUvUNnv.nUUVuvU(var4), UnVNvNnU.VvunVVUvUNnv.UnUNVVVNuv(var4), UnVNvNnU.VvunVVUvUNnv.vNVuvnUUnuUn(var4), 210
         )
         : UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(142, 148, 158, 135);
      return this.UuUVuuUu(var5, var2);
   }

   private int C00OOC00oO(class_1799 var1, float var2) {
      boolean var3 = this.uVUVnuvnuVuv();
      int var4 = var3 ? UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(this.NvnuuuvnVV, 255) : UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(220, 255, 245, 255);
      if (var1 != null && !var1.method_7960()) {
         int[] var5 = new int[]{var4};

         try {
            class_2561 var6 = var1.method_7964();
            var6.method_27658(
               (var1x, var2x) -> {
                  class_5251 var3x = var1x.method_10973();
                  if (var3x != null && var2x != null && !var2x.isBlank()) {
                     var5[0] = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(
                        var3x.method_27716() >> 16 & 0xFF, var3x.method_27716() >> 8 & 0xFF, var3x.method_27716() & 0xFF, 255
                     );
                     return Optional.of(Boolean.TRUE);
                  } else {
                     return Optional.empty();
                  }
               },
               class_2583.field_24360
            );
         } catch (Throwable var7) {
         }

         int var8 = var5[0];
         if (var3 && C00OOC00oO(var8)) {
            var8 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(this.NvnuuuvnVV, 255);
         }

         return this.UuUVuuUu(var8, var2);
      } else {
         return this.UuUVuuUu(var4, var2);
      }
   }

   private static boolean C00OOC00oO(int var0) {
      int var1 = var0 >> 16 & 0xFF;
      int var2 = var0 >> 8 & 0xFF;
      int var3 = var0 & 0xFF;
      return var1 * 0.299F + var2 * 0.587F + var3 * 0.114F >= 205.0F;
   }

   private String UuUVuuUu(class_1799 var1, boolean var2) {
      if (var1 != null && !var1.method_7960()) {
         int var3 = Math.max(1, var1.method_7947());
         String var4 = var1.method_7964().getString().replaceAll("§.", "").replaceAll("\\p{Cntrl}", "").replaceAll("\\s+", " ").trim();
         if (var4.isEmpty()) {
            var4 = "Предмет";
         }

         if (!var2 && var4.length() > 22) {
            var4 = var4.substring(0, 19).trim() + "...";
         }

         return var4 + (var3 > 1 ? " x" + var3 : "");
      } else {
         return "Пусто";
      }
   }

   private String UuUVuuUu(String var1, float var2, float var3) {
      if (var1 == null || var1.isEmpty()) {
         return "";
      } else if (UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, var1, var2).UuUVuuUu <= var3) {
         return var1;
      } else {
         String var4 = "...";
         float var5 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, var4, var2).UuUVuuUu;
         int var6 = var1.length();

         while (var6 > 0 && UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.C00OOC00oO, var1.substring(0, var6), var2).UuUVuuUu + var5 > var3) {
            var6--;
         }

         return var6 <= 0 ? var4 : var1.substring(0, var6).trim() + var4;
      }
   }

   private int UuUVuuUu(int var1, float var2) {
      int var3 = var1 >> 24 & 0xFF;
      int var4 = var1 >> 16 & 0xFF;
      int var5 = var1 >> 8 & 0xFF;
      int var6 = var1 & 0xFF;
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var4, var5, var6, (int)(var3 * var2));
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   record NVnVnNnN(class_243 start, class_243 end) {
   }

   record VvunVVUvUNnv(float x, float y, float w, float h, String playerName) {
   }

   record nvUnvV(float screenX, float headY, float feetY, float depth, double distance, float boxLeft, float boxRight) {
   }

   record nvnNNunvv(List<NameTags.NVnVnNnN> bones, long capturedAt) {
   }

   record uunvUUVnuNn(class_1657 player, class_1799 stack, float x, float y, int seed, float scale, int priority) {
   }
}
