package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.utils.BetterBlockPos;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2595;
import net.minecraft.class_2627;
import net.minecraft.class_2680;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3719;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4588;
import net.minecraft.class_476;
import net.minecraft.class_5498;
import net.minecraft.class_7439;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoMine",
   C00OOC00oO = "Полная автоматизация шахты",
   uUnuvNvvNU = oOOOo0.Misc
)
public class AutoMine extends Module {
   public final NVuVVUNUvV NVNnnvnuunNv = new NVuVVUNUvV("Анархия для сброса", "903");
   public final uVNuNUVvn uVunuUNVVUUV = new uVNuNUVvn("Бинд на сундук", -1);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Не отображать экран", false);
   private final NVuVVUNUvV uNnUnnuNUnNu = new NVuVVUNUvV("AutoMineLayoutData", "").UuUVuuUu(() -> true);
   private final NVuVVUNUvV NnUuNNU = new NVuVVUNUvV("AutoMineDropChest", "").UuUVuuUu(() -> true);
   private final VuNvNNvVV nNvNUVU = new VuNvNNvVV();
   private final VuNvNNvVV UnUNuUU = new VuNvNNvVV();
   private final VuNvNNvVV uUVuVvuNUvnu = new VuNvNNvVV();
   private final VuNvNNvVV UvUvUNuvNU = new VuNvNNvVV();
   private final VuNvNNvVV c0oOOCcCoC0 = new VuNvNNvVV();
   private final VuNvNNvVV VVnVNnunVvu = new VuNvNNvVV();
   private int unNNVVNnvvV = 0;
   private final List<String> NuunnvnN = Arrays.asList(
      "405", "503", "504", "505", "304", "902", "901", "404", "402", "401", "903", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210"
   );
   private static final class_2338 NVUunUNUN = new class_2338(-55, 93, 30);
   private static final class_2338 UUVNuUNUvUnV = new class_2338(-73, 84, 48);
   private static final double vuvnUnVnUNnV = 4.0;
   private static final double nnuUVNUuvvVU = 3.5;
   private static final int nVVUuvuNnUN = 2500;
   private static final int nNnVnUNVV = 2500;
   private AutoMine.nvnNNunvv nuunNvv = AutoMine.nvnNNunvv.IDLE;
   private boolean uUVVvVVNvvn = false;
   private class_2338 vvUVNVvvNUv = null;
   private class_2338 UuNnnVnuNNV = null;
   private class_2338 uUVvnUuNvvN = null;
   private class_2338 UUuUnNVNuuv = null;
   private class_2338 NVuNUuVnVUN = null;
   private boolean NVuunNnvvvVu = false;
   private double vNnNuuvVn = -1.0;
   private double VUuuVUnun = -1.0;
   private boolean vVVuuVVv;
   private boolean VuunNUUUvu;
   private boolean NNUUNUuVNNVn;
   private boolean VvVvnNUnvuvV;
   private List<class_2248> ccOO0COcoco0 = List.of();
   private final Queue<Runnable> NUVvUUVuVNVv = new ArrayDeque<>();
   private final Map<Integer, AutoMine.NVnVnNnN> nNuVunNUVu = new HashMap<>();
   private static final AutoMine.NVnVnNnN UNvvunVVn = new AutoMine.NVnVnNnN("", 0);
   private class_476 UnvuVuVnNuvu;
   private static final int UvNNVUVNVuvV = 1024;
   private static final RenderPipeline NnunUUnU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "automine_block_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 nvuVvuNnNUnv = class_1921.method_24049(
      "automine_block_box", 1024, false, true, NnunUUnU, class_4688.method_23598().method_23617(false)
   );

   public AutoMine() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU});
   }

   @Override
   public void UuUVuuUu() {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AttackAura.class).nuUnNvnuUu) {
         vVnvuVVUunuv.UuUVuuUu("Отключите ауру для включения модуля");
         this.a_();
      } else {
         super.UuUVuuUu();
         if (uUnuvNvvNU.field_1690 != null) {
            uUnuvNvvNU.field_1690.method_31043(class_5498.field_26664);
         }

         NNvvnnunn.UuUVuuUu = true;
         this.nuunNvv = AutoMine.nvnNNunvv.IDLE;
         this.uUVVvVVNvvn = false;
         this.vvUVNVvvNUv = null;
         this.UuNnnVnuNNV = null;
         this.uUVvnUuNvvN = null;
         this.NVuNUuVnVUN = null;
         this.NVuunNnvvvVu = false;
         this.vNnNuuvVn = -1.0;
         this.VUuuVUnun = -1.0;
         this.NUVvUUVuVNVv.clear();
         this.unNNVVNnvvV();
         this.nVVUuvuNnUN();
         this.vVVuuVVv = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
         this.VuunNUUUvu = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
         this.NNUUNUuVNNVn = (Boolean)BaritoneAPI.getSettings().legitMine.value;
         this.VvVvnNUnvuvV = (Boolean)BaritoneAPI.getSettings().walkWhileBreaking.value;
         List var1 = (List)BaritoneAPI.getSettings().blocksToAvoidBreaking.value;
         this.ccOO0COcoco0 = (List<class_2248>)(var1 == null ? List.of() : new ArrayList<>(var1));
         BaritoneAPI.getSettings().allowPlace.value = false;
         BaritoneAPI.getSettings().allowBreak.value = true;
         BaritoneAPI.getSettings().legitMine.value = false;
         BaritoneAPI.getSettings().walkWhileBreaking.value = false;
         List var2 = Arrays.asList(
            class_2246.field_10037,
            class_2246.field_10155,
            class_2246.field_9975,
            class_2246.field_10436,
            class_2246.field_10558,
            class_2246.field_10431,
            class_2246.field_10126,
            class_2246.field_10161,
            class_2246.field_10566,
            class_2246.field_10219,
            class_2246.field_10253,
            class_2246.field_10520,
            class_2246.field_10056,
            class_2246.field_10416,
            class_2246.field_10065,
            class_2246.field_9983,
            class_2246.field_9987,
            class_2246.field_16328,
            class_2246.field_10034,
            class_2246.field_10380
         );
         List var3 = (List)BaritoneAPI.getSettings().blocksToAvoidBreaking.value;
         if (var3 != null) {
            for (class_2248 var5 : var2) {
               if (!var3.contains(var5)) {
                  var3.add(var5);
               }
            }
         }

         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
            if (this.uUVuVvuNUvnu()) {
               this.UNnVVNvvnVvU();
            } else if (this.NVUunUNUN()) {
               this.nUUVuvU();
            } else if (this.NuunnvnN()) {
               this.UnUNVVVNuv();
            } else {
               uUnuvNvvNU.field_1724.field_3944.method_45730("warp mine");
               this.nuunNvv = AutoMine.nvnNNunvv.WAITING_FOR_TP;
               this.nNvNUVU.UuUVuuUu();
            }
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.method_31043(class_5498.field_26664);
         if (this.NVuunNnvvvVu) {
            uUnuvNvvNU.field_1690.field_1832.method_23481(false);
            this.NVuunNnvvvVu = false;
         }
      }

      NNvvnnunn.UuUVuuUu = false;
      this.uVUVnuvnuVuv();
      this.NUVvUUVuVNVv.clear();
      BaritoneAPI.getSettings().allowPlace.value = this.vVVuuVVv;
      BaritoneAPI.getSettings().allowBreak.value = this.VuunNUUUvu;
      BaritoneAPI.getSettings().legitMine.value = this.NNUUNUuVNNVn;
      BaritoneAPI.getSettings().walkWhileBreaking.value = this.VvVvnNUnvuvV;
      List var1 = (List)BaritoneAPI.getSettings().blocksToAvoidBreaking.value;
      if (var1 != null) {
         var1.clear();
         var1.addAll(this.ccOO0COcoco0);
      }

      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (this.uUVVvVVNvvn) {
         var2.getCommandManager().execute("resume");
         this.uUVVvVVNvvn = false;
      }

      var2.getCommandManager().execute("stop");
      var2.getSelectionManager().removeAllSelections();
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      this.UnvuVuVnNuvu = null;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(CocoCOCco0C var1) {
      if (this.UNnVVNvvnVvU.uUnuvNvvNU() && var1.uUnuvNvvNU() instanceof class_476 var2) {
         if (this.nuunNvv == AutoMine.nvnNNunvv.OPENING_DROP_CHEST
            || this.nuunNvv == AutoMine.nvnNNunvv.WAITING_FOR_DROP_GUI
            || this.nuunNvv == AutoMine.nvnNNunvv.DROPPING) {
            this.UnvuVuVnNuvu = var2;
            var1.vVvUvVVuuNvV();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         boolean var3 = PlayerHelper.UuuNnUvUuv();
         if (var3) {
            if (!this.uUVVvVVNvvn) {
               var2.getCommandManager().execute("pause");
               this.uUVVvVVNvvn = true;
               this.uVUVnuvnuVuv();
            }
         } else {
            if (this.uUVVvVVNvvn) {
               var2.getCommandManager().execute("resume");
               this.uUVVvVVNvvn = false;
            }

            if (this.nuunNvv == AutoMine.nvnNNunvv.MINING && this.vvUVNVvvNUv != null) {
               if (uUnuvNvvNU.field_1724.method_6101() && uUnuvNvvNU.field_1690.field_1886.method_1434()) {
                  uUnuvNvvNU.field_1690.field_1832.method_23481(true);
                  this.NVuunNnvvvVu = true;
               } else if (this.NVuunNnvvvVu) {
                  uUnuvNvvNU.field_1690.field_1832.method_23481(false);
                  this.NVuunNnvvvVu = false;
               }
            } else if (this.NVuunNnvvvVu) {
               uUnuvNvvNU.field_1690.field_1832.method_23481(false);
               this.NVuunNnvvvVu = false;
            }

            if (!this.uUVuVvuNUvnu() || this.nuunNvv != AutoMine.nvnNNunvv.MINING && this.nuunNvv != AutoMine.nvnNNunvv.GOING_TO_MINE) {
               class_476 var4 = this.nuunNvv();
               if (this.nuunNvv == AutoMine.nvnNNunvv.DROPPING && var4 != null) {
                  this.UuUVuuUu((class_1707)var4.method_17577());
               } else {
                  switch (this.nuunNvv) {
                     case WAITING_FOR_TP:
                        if (this.nNvNUVU.uNNnnnuuuN(5500L)) {
                           this.UnUNVVVNuv();
                        }
                        break;
                     case GOING_TO_MINE:
                        this.UuUVuuUu(var2);
                        break;
                     case MINING:
                        this.UvnvNVnnnnNU();
                        if (this.vvUVNVvvNUv == null || this.vVvUvVVuuNvV(this.vvUVNVvvNUv)) {
                           this.vNVuvnUUnuUn();
                        }

                        if (this.nNvNUVU.uNNnnnuuuN(2000L)) {
                           if (!this.UUVNuUNUvUnV()) {
                              var2.getCommandManager().execute("stop");
                              this.uVunuUNVVUUV();
                           }

                           this.nNvNUVU.UuUVuuUu();
                        }
                        break;
                     case TELEPORTING_TO_DROP:
                        if (this.nNvNUVU.uNNnnnuuuN(6000L)) {
                           this.uNnUnnuNUnNu();
                        }
                        break;
                     case GOING_TO_DROP_CHEST:
                        this.C00OOC00oO(var2);
                        break;
                     case ROTATING_DROP_CHEST:
                        this.NnUuNNU();
                        break;
                     case OPENING_DROP_CHEST:
                        this.nNvNUVU();
                        break;
                     case WAITING_FOR_DROP_GUI:
                        if (this.nuunNvv() != null) {
                           this.nuunNvv = AutoMine.nvnNNunvv.DROPPING;
                           this.UnUNuUU.UuUVuuUu();
                        } else if (this.UvUvUNuvNU.uNNnnnuuuN(3000L)) {
                           this.nuunNvv = AutoMine.nvnNNunvv.OPENING_DROP_CHEST;
                           this.UvUvUNuvNU.UuUVuuUu();
                        }
                     case DROPPING:
                     default:
                        break;
                     case CHANGING_ANARCHY:
                        if (this.nNvNUVU.uNNnnnuuuN(2000L)) {
                           if (this.NVUunUNUN()) {
                              this.nUUVuvU();
                           } else if (this.NuunnvnN()) {
                              this.UnUNVVVNuv();
                           } else {
                              uUnuvNvvNU.field_1724.field_3944.method_45730("warp mine");
                              this.nuunNvv = AutoMine.nvnNNunvv.WAITING_FOR_TP;
                              this.nNvNUVU.UuUVuuUu();
                           }
                        }
                  }
               }
            } else {
               var2.getCommandManager().execute("stop");
               this.UNnVVNvvnVvU();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var4 = var2.comp_763().getString();
         if ((var4.contains("Телепорт") || var4.contains("teleport") || var4.contains("Teleport"))
            && (
               this.nuunNvv == AutoMine.nvnNNunvv.WAITING_FOR_TP
                  || this.nuunNvv == AutoMine.nvnNNunvv.TELEPORTING_TO_DROP
                  || this.nuunNvv == AutoMine.nvnNNunvv.CHANGING_ANARCHY
            )) {
            this.nNvNUVU.UuUVuuUu();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.uVunuUNVVUUV.uUnuvNvvNU() != -1 && var1.vVvUvVVuuNvV() == this.uVunuUNVVUUV.uUnuvNvvNU()) {
            if (uUnuvNvvNU.field_1765 instanceof class_3965 var2) {
               class_2338 var4 = var2.method_17777();
               if (this.vNUvnnVnUvu(var4)) {
                  this.uVUuuVnNVU(var4);
                  vVnvuVVUunuv.UuUVuuUu("§8[§6AutoMine§8] §aСундук для сброса установлен: " + var4.method_23854());
               } else {
                  vVnvuVVUunuv.UuUVuuUu("§8[§6AutoMine§8] §cСмотрите на сундук, бочку или шалкер.");
               }
            }
         }
      }
   }

   private void nUUVuvU() {
      if (this.UUVNuUNUvUnV()) {
         this.nuunNvv = AutoMine.nvnNNunvv.MINING;
         this.nNvNUVU.UuUVuuUu();
         this.vNVuvnUUnuUn();
      } else {
         this.uVunuUNVVUUV();
      }
   }

   private void UnUNVVVNuv() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.uVUVnuvnuVuv();
      var1.getSelectionManager().removeAllSelections();
      var1.getCommandManager().execute("stop");
      this.uUVvnUuNvvN = this.vuvnUnVnUNnV();
      if (this.uUVvnUuNvvN == null) {
         this.uUVvnUuNvvN = this.uUVVvVVNvvn();
      }

      this.nuunNvv = AutoMine.nvnNNunvv.GOING_TO_MINE;
      this.vNnNuuvVn = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.uUVvnUuNvvN));
      this.nNvNUVU.UuUVuuUu();
      this.c0oOOCcCoC0.UuUVuuUu();
      this.VVnVNnunVvu.UuUVuuUu();
      var1.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.uUVvnUuNvvN, 2));
   }

   private void UuUVuuUu(IBaritone var1) {
      if (this.NVUunUNUN()) {
         var1.getPathingBehavior().cancelEverything();
         this.uUVvnUuNvvN = null;
         this.nUUVuvU();
      } else {
         if (this.uUVvnUuNvvN == null || this.c0oOOCcCoC0.uNNnnnuuuN(10000L)) {
            this.uUVvnUuNvvN = this.vuvnUnVnUNnV();
            if (this.uUVvnUuNvvN == null) {
               this.uUVvnUuNvvN = this.uUVVvVVNvvn();
            }
         }

         double var2 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.uUVvnUuNvvN));
         if (this.vNnNuuvVn < 0.0 || var2 < this.vNnNuuvVn - 1.0) {
            this.vNnNuuvVn = var2;
            this.VVnVNnunVvu.UuUVuuUu();
         }

         if (!var1.getCustomGoalProcess().isActive() || this.c0oOOCcCoC0.uNNnnnuuuN(2500L)) {
            var1.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.uUVvnUuNvvN, 2));
            this.c0oOOCcCoC0.UuUVuuUu();
         }

         if (this.VVnVNnunVvu.uNNnnnuuuN(45000L)) {
            var1.getPathingBehavior().cancelEverything();
            this.uVunuUNVVUUV();
         }
      }
   }

   private void vNVuvnUUnuUn() {
      class_2338 var1 = this.NVNnnvnuunNv();
      if (var1 != null) {
         this.vvUVNVvvNUv = var1;
         this.UuNnnVnuNNV = null;
         this.uVUVnuvnuVuv();
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         var2.getCommandManager().execute("stop");
         var2.getSelectionManager().removeAllSelections();
         var2.getSelectionManager().addSelection(new BetterBlockPos(var1), new BetterBlockPos(var1));
         var2.getCommandManager().execute("sel cleararea");
      } else {
         this.vvUVNVvvNUv = null;
         this.UuNnnVnuNNV = null;
         this.uVUVnuvnuVuv();
      }
   }

   private void UvnvNVnnnnNU() {
      if (this.vvUVNVvvNUv != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (!this.vVvUvVVuuNvV(this.vvUVNVvvNUv)
            && !(
               uUnuvNvvNU.field_1724
                     .method_5649(this.vvUVNVvvNUv.method_10263() + 0.5, this.vvUVNVvvNUv.method_10264() + 0.5, this.vvUVNVvvNUv.method_10260() + 0.5)
                  > 36.0
            )) {
            uuUuvNuNVNVU var1 = this.UuUVuuUu(class_243.method_24953(this.vvUVNVvvNUv));
            COC0OCc.UuUVuuUu(var1, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
            if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1) > 6.0F) {
               if (uUnuvNvvNU.field_1690 != null) {
                  uUnuvNvvNU.field_1690.field_1886.method_23481(false);
               }
            } else {
               class_3965 var2 = this.UuUVuuUu(this.vvUVNVvvNUv);
               if (var2 == null) {
                  this.uVUVnuvnuVuv();
               } else {
                  uUnuvNvvNU.field_1690.field_1886.method_23481(true);
                  if (!this.vvUVNVvvNUv.equals(this.UuNnnVnuNNV)) {
                     uUnuvNvvNU.field_1761.method_2910(this.vvUVNVvvNUv, var2.method_17780());
                     this.UuNnnVnuNNV = this.vvUVNVvvNUv;
                     this.uUVuVvuNUvnu.UuUVuuUu();
                  } else if (this.uUVuVvuNUvnu.uNNnnnuuuN(45L)) {
                     uUnuvNvvNU.field_1761.method_2902(this.vvUVNVvvNUv, var2.method_17780());
                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                     this.uUVuVvuNUvnu.UuUVuuUu();
                  }
               }
            }
         } else {
            this.uVUVnuvnuVuv();
         }
      } else {
         this.uVUVnuvnuVuv();
      }
   }

   private class_3965 UuUVuuUu(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               class_243 var19 = new class_243(var1.method_10263() + var7, var1.method_10264() + var12, var1.method_10260() + var17);
               class_3965 var20 = uUnuvNvvNU.field_1687
                  .method_17742(new class_3959(var2, var19, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
               if (var20.method_17783() == class_240.field_1332 && var20.method_17777().equals(var1)) {
                  return var20;
               }
            }
         }
      }

      return this.C00OOC00oO(var1) ? new class_3965(class_243.method_24953(var1), this.uUnuvNvvNU(var1), var1, false) : null;
   }

   private boolean C00OOC00oO(class_2338 var1) {
      for (class_2350 var5 : class_2350.values()) {
         if (this.vVvUvVVuuNvV(var1.method_10093(var5))) {
            return true;
         }
      }

      return false;
   }

   private class_2350 uUnuvNvvNU(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571().method_1020(class_243.method_24953(var1));
      double var3 = Math.abs(var2.field_1352);
      double var5 = Math.abs(var2.field_1351);
      double var7 = Math.abs(var2.field_1350);
      if (var5 >= var3 && var5 >= var7) {
         return var2.field_1351 > 0.0 ? class_2350.field_11036 : class_2350.field_11033;
      } else if (var3 >= var7) {
         return var2.field_1352 > 0.0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return var2.field_1350 > 0.0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   private void uVUVnuvnuVuv() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
      }

      this.UuNnnVnuNNV = null;
   }

   private class_2338 NVNnnvnuunNv() {
      int var1 = this.vvUVNVvvNUv();
      int var2 = this.UuNnnVnuNNV();
      int var3 = this.uUVvnUuNvvN();
      int var4 = this.UUuUnNVNuuv();
      int var5 = this.NVuNUuVnVUN();
      int var6 = this.NVuunNnvvvVu();

      for (int var7 = var4; var7 >= var3; var7--) {
         class_2338 var8 = null;

         for (int var9 = var1; var9 <= var2; var9++) {
            for (int var10 = var5; var10 <= var6; var10++) {
               class_2338 var11 = new class_2338(var9, var7, var10);
               class_2248 var12 = uUnuvNvvNU.field_1687.method_8320(var11).method_26204();
               if ((var12 == class_2246.field_10442 || var12 == class_2246.field_29029)
                  && (
                     var8 == null
                        || uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var11)) < uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var8))
                  )) {
                  var8 = var11;
               }
            }
         }

         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      class_2248 var2 = uUnuvNvvNU.field_1687.method_8320(var1).method_26204();
      return var2 == class_2246.field_10124 || var2 == class_2246.field_10543 || var2 == class_2246.field_10243;
   }

   private void uVunuUNVVUUV() {
      if (this.unNNVVNnvvV >= this.NuunnvnN.size()) {
         this.unNNVVNnvvV = 0;
      }

      String var1 = this.nNnVnUNVV();
      String var2 = this.NuunnvnN.get(this.unNNVVNnvvV);
      if (var1 != null && var2.equals(var1)) {
         this.unNNVVNnvvV++;
         if (this.unNNVVNnvvV >= this.NuunnvnN.size()) {
            this.unNNVVNnvvV = 0;
         }

         var2 = this.NuunnvnN.get(this.unNNVVNnvvV);
      }

      uUnuvNvvNU.field_1724.field_3944.method_45730("an" + var2);
      this.unNNVVNnvvV++;
      this.nuunNvv = AutoMine.nvnNNunvv.CHANGING_ANARCHY;
      this.nNvNUVU.UuUVuuUu();
   }

   private boolean UNnVVNvvnVvU() {
      String var1 = this.nNnVnUNVV();
      if (var1 == null) {
         this.UuUVuuUu("Укажите анархию для сброса.");
         return false;
      } else if (this.UUuUnNVNuuv == null) {
         this.UuUVuuUu("Установите сундук для сброса через бинд.");
         return false;
      } else {
         this.uVUVnuvnuVuv();
         this.NUVvUUVuVNVv.clear();
         uUnuvNvvNU.field_1724.field_3944.method_45730("an" + var1);
         this.nuunNvv = AutoMine.nvnNNunvv.TELEPORTING_TO_DROP;
         this.nNvNUVU.UuUVuuUu();
         return true;
      }
   }

   private void uNnUnnuNUnNu() {
      if (this.UUuUnNVNuuv == null) {
         this.UuUVuuUu("Сундук для сброса не установлен.");
      } else {
         this.uVUVnuvnuVuv();
         this.NUVvUUVuVNVv.clear();
         IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
         var1.getSelectionManager().removeAllSelections();
         var1.getCommandManager().execute("stop");
         this.NVuNUuVnVUN = this.uNNnnnuuuN(this.UUuUnNVNuuv);
         this.nuunNvv = AutoMine.nvnNNunvv.GOING_TO_DROP_CHEST;
         this.VUuuVUnun = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.UUuUnNVNuuv));
         this.UvUvUNuvNU.UuUVuuUu();
         this.c0oOOCcCoC0.UuUVuuUu();
         this.VVnVNnunVvu.UuUVuuUu();
      }
   }

   private void C00OOC00oO(IBaritone var1) {
      if (this.UUuUnNVNuuv == null) {
         this.UuUVuuUu("Сундук для сброса не установлен.");
      } else {
         double var2 = uUnuvNvvNU.field_1724.method_19538().method_1022(class_243.method_24953(this.UUuUnNVNuuv));
         if (var2 <= 3.5 && this.VVuuUN(this.UUuUnNVNuuv)) {
            var1.getPathingBehavior().cancelEverything();
            this.nuunNvv = AutoMine.nvnNNunvv.ROTATING_DROP_CHEST;
            this.UvUvUNuvNU.UuUVuuUu();
         } else {
            if (this.NVuNUuVnVUN == null || this.c0oOOCcCoC0.uNNnnnuuuN(10000L)) {
               this.NVuNUuVnVUN = this.uNNnnnuuuN(this.UUuUnNVNuuv);
            }

            class_2338 var4 = this.NVuNUuVnVUN == null ? this.UUuUnNVNuuv : this.NVuNUuVnVUN;
            int var5 = this.NVuNUuVnVUN == null ? 3 : 1;
            if (!var1.getCustomGoalProcess().isActive() || this.c0oOOCcCoC0.uNNnnnuuuN(2500L)) {
               var1.getCustomGoalProcess().setGoalAndPath(new GoalNear(var4, var5));
               this.c0oOOCcCoC0.UuUVuuUu();
            }

            if (this.VUuuVUnun < 0.0 || var2 < this.VUuuVUnun - 1.0) {
               this.VUuuVUnun = var2;
               this.VVnVNnunVvu.UuUVuuUu();
            }

            if (this.VVnVNnunVvu.uNNnnnuuuN(45000L)) {
               this.UuUVuuUu("Не удалось дойти до сундука для сброса.");
            }
         }
      }
   }

   private void NnUuNNU() {
      if (this.UUuUnNVNuuv != null && uUnuvNvvNU.field_1724 != null) {
         uuUuvNuNVNVU var1 = this.UuUVuuUu(class_243.method_24953(this.UUuUnNVNuuv));
         COC0OCc.UuUVuuUu(var1, 35.0F, 35.0F, 35.0F, 35.0F, 20, 1, false);
         if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1) < 5.0F && this.UvUvUNuvNU.uNNnnnuuuN(150L)) {
            COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
            this.nuunNvv = AutoMine.nvnNNunvv.OPENING_DROP_CHEST;
            this.UvUvUNuvNU.UuUVuuUu();
         }
      } else {
         this.UuUVuuUu("Сундук для сброса потерян.");
      }
   }

   private void nNvNUVU() {
      if (this.UUuUnNVNuuv != null && uUnuvNvvNU.field_1761 != null) {
         this.nnuUVNUuvvVU();
         if (this.UvUvUNuvNU.uNNnnnuuuN(150L)) {
            class_3965 var1 = new class_3965(class_243.method_24953(this.UUuUnNVNuuv), class_2350.field_11036, this.UUuUnNVNuuv, false);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
            this.nuunNvv = AutoMine.nvnNNunvv.WAITING_FOR_DROP_GUI;
            this.UvUvUNuvNU.UuUVuuUu();
         }
      } else {
         this.UuUVuuUu("Сундук для сброса потерян.");
      }
   }

   private void UuUVuuUu(class_1707 var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (!this.NUVvUUVuVNVv.isEmpty()) {
            if (this.UnUNuUU.uNNnnnuuuN(50L)) {
               this.NUVvUUVuVNVv.poll().run();
               this.UnUNuUU.UuUVuuUu();
            }
         } else {
            int var2 = var1.field_7761.size() - 36;
            if (var2 <= 0) {
               this.UuUVuuUu("Открыт не контейнер для сброса.");
            } else if (this.c0oOOCcCoC0()) {
               this.UuUVuuUu(var1, var2);
            } else {
               this.C00OOC00oO(var1, var2);
            }
         }
      }
   }

   private void UuUVuuUu(class_1707 var1, int var2) {
      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = (class_1735)var1.field_7761.get(var3);
         int var5 = this.UuUVuuUu(var3, var2);
         AutoMine.NVnVnNnN var6 = this.nNuVunNUVu.getOrDefault(var5, UNvvunVVn);
         if (!var4.method_7681()) {
            if (var6.count > 0) {
               if (!this.UuUVuuUu(var1, var2, var6, var3, 0)) {
                  this.UuUVuuUu("В сундуке нет предметов для восстановления раскладки.");
               }

               return;
            }
         } else {
            class_1799 var7 = var4.method_7677();
            boolean var8 = var6.matches(var7);
            if (var6.count <= 0 || !var8) {
               if (!this.UuUVuuUu(var1, var2, var7)) {
                  this.UuUVuuUu("Сундук для сброса заполнен.");
                  return;
               } else {
                  int var11 = var3;
                  int var12 = var1.field_7763;
                  this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var12, var11, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
                  return;
               }
            }

            if (var7.method_7947() > var6.count) {
               int var9 = var7.method_7947() - var6.count;
               int var10 = this.UuUVuuUu(var1, var2, var7, var9);
               if (var10 == -1) {
                  this.UuUVuuUu("Сундук для сброса заполнен.");
                  return;
               }

               this.UuUVuuUu(var1.field_7763, var3, var10, var6.count, var9);
               return;
            }

            if (var7.method_7947() < var6.count) {
               if (!this.UuUVuuUu(var1, var2, var6, var3, var7.method_7947())) {
                  this.UuUVuuUu("В сундуке нет предметов для восстановления раскладки.");
               }

               return;
            }
         }
      }

      this.UnUNuUU();
   }

   private void C00OOC00oO(class_1707 var1, int var2) {
      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = (class_1735)var1.field_7761.get(var3);
         if (var4.method_7681()) {
            class_1799 var5 = var4.method_7677();
            int var6 = this.UuUVuuUu(var3, var2);
            int var7 = this.UuUVuuUu(var6, var5);
            int var8 = var5.method_7947() - var7;
            if (var8 > 0) {
               if (var7 <= 0) {
                  if (!this.UuUVuuUu(var1, var2, var5)) {
                     this.UuUVuuUu("Сундук для сброса заполнен.");
                     return;
                  }

                  int var11 = var3;
                  int var10 = var1.field_7763;
                  this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var10, var11, 0, class_1713.field_7794, uUnuvNvvNU.field_1724));
                  return;
               }

               int var9 = this.UuUVuuUu(var1, var2, var5, var8);
               if (var9 == -1) {
                  this.UuUVuuUu("Сундук для сброса заполнен.");
                  return;
               }

               this.UuUVuuUu(var1.field_7763, var3, var9, var7, var8);
               return;
            }
         }
      }

      this.UnUNuUU();
   }

   private void UuUVuuUu(int var1, int var2, int var3, int var4, int var5) {
      this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      if (var4 <= var5) {
         for (int var6 = 0; var6 < var4; var6++) {
            this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var2, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
         }

         this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      } else {
         for (int var7 = 0; var7 < var5; var7++) {
            this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
         }

         this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      }
   }

   private boolean UuUVuuUu(class_1707 var1, int var2, AutoMine.NVnVnNnN var3, int var4, int var5) {
      int var6 = var3.count - var5;
      if (var6 <= 0) {
         return true;
      } else {
         int var7 = this.UuUVuuUu(var1, var2, var3);
         if (var7 == -1) {
            return false;
         } else {
            int var8 = ((class_1735)var1.field_7761.get(var7)).method_7677().method_7947();
            int var9 = Math.min(var6, var8);
            this.C00OOC00oO(var1.field_7763, var7, var4, var8, var9);
            return true;
         }
      }
   }

   private void C00OOC00oO(int var1, int var2, int var3, int var4, int var5) {
      this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      if (var5 >= var4) {
         this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      } else if (var5 <= var4 / 2) {
         for (int var6 = 0; var6 < var5; var6++) {
            this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var3, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
         }

         this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var2, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      } else {
         int var8 = var4 - var5;

         for (int var7 = 0; var7 < var8; var7++) {
            this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var2, 1, class_1713.field_7790, uUnuvNvvNU.field_1724));
         }

         this.NUVvUUVuVNVv.add(() -> uUnuvNvvNU.field_1761.method_2906(var1, var3, 0, class_1713.field_7790, uUnuvNvvNU.field_1724));
      }
   }

   private int UuUVuuUu(class_1707 var1, int var2, AutoMine.NVnVnNnN var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         class_1735 var5 = (class_1735)var1.field_7761.get(var4);
         if (var5.method_7681() && var3.matches(var5.method_7677())) {
            return var4;
         }
      }

      return -1;
   }

   private void UnUNuUU() {
      this.NUVvUUVuVNVv.clear();
      this.UnvuVuVnNuvu = null;
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      this.nuunNvv = AutoMine.nvnNNunvv.IDLE;
      this.NVuNUuVnVUN = null;
      this.uVunuUNVVUUV();
   }

   private boolean uUVuVvuNUvnu() {
      return uUnuvNvvNU.field_1724.method_31548().method_7376() != -1 ? false : this.UvUvUNuvNU();
   }

   private boolean UvUvUNuvNU() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (!var2.method_7960() && var2.method_7947() > this.UuUVuuUu(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   private int UuUVuuUu(int var1, class_1799 var2) {
      AutoMine.NVnVnNnN var3 = this.nNuVunNUVu.get(var1);
      if (var3 != null) {
         return var3.matches(var2) ? Math.min(var3.count, var2.method_7947()) : 0;
      } else {
         return 1;
      }
   }

   private int UuUVuuUu(int var1, int var2) {
      int var3 = var1 - var2;
      return var3 >= 27 ? var3 - 27 : var3 + 9;
   }

   private int UuUVuuUu(class_1707 var1, int var2, class_1799 var3, int var4) {
      int var5 = -1;

      for (int var6 = 0; var6 < var2; var6++) {
         class_1735 var7 = (class_1735)var1.field_7761.get(var6);
         if (!var7.method_7681()) {
            if (var5 == -1) {
               var5 = var6;
            }
         } else {
            class_1799 var8 = var7.method_7677();
            if (this.UuUVuuUu(var3, var8) && var8.method_7947() + var4 <= var8.method_7914()) {
               return var6;
            }
         }
      }

      return var5;
   }

   private boolean UuUVuuUu(class_1707 var1, int var2, class_1799 var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         class_1735 var5 = (class_1735)var1.field_7761.get(var4);
         if (!var5.method_7681()) {
            return true;
         }

         class_1799 var6 = var5.method_7677();
         if (this.UuUVuuUu(var3, var6) && var6.method_7947() < var6.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private boolean UuUVuuUu(class_1799 var1, class_1799 var2) {
      return class_1799.method_31577(var1, var2);
   }

   @Override
   public void UuuNnUvUuv() {
      this.VVnVNnunVvu();
   }

   private boolean c0oOOCcCoC0() {
      return this.nNuVunNUVu.size() >= 36;
   }

   private void VVnVNnunVvu() {
      if (uUnuvNvvNU.field_1724 == null) {
         vVnvuVVUunuv.UuUVuuUu("§8[§6AutoMine§8] §cИгрок не загружен.");
      } else {
         this.nNuVunNUVu.clear();
         StringBuilder var1 = new StringBuilder();
         Encoder var2 = Base64.getEncoder();

         for (int var3 = 0; var3 < 36; var3++) {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
            String var5 = var4.method_7960() ? "" : this.UuUVuuUu(var4);
            int var6 = var4.method_7960() ? 0 : var4.method_7947();
            this.nNuVunNUVu.put(var3, new AutoMine.NVnVnNnN(var5, var6));
            if (var3 > 0) {
               var1.append(';');
            }

            var1.append(var6).append(',').append(var2.encodeToString(var5.getBytes(StandardCharsets.UTF_8)));
         }

         this.uNnUnnuNUnNu.C00OOC00oO(var1.toString());
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
            ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
         }

         vVnvuVVUunuv.UuUVuuUu("§8[§6AutoMine§8] §aРаскладка инвентаря сохранена.");
      }
   }

   private void unNNVVNnvvV() {
      this.nNuVunNUVu.clear();
      String var1 = this.uNnUnnuNUnNu.uUnuvNvvNU();
      if (var1 != null && !var1.isBlank()) {
         String[] var2 = var1.split(";", -1);
         Decoder var3 = Base64.getDecoder();

         for (int var4 = 0; var4 < Math.min(36, var2.length); var4++) {
            String[] var5 = var2[var4].split(",", 2);
            if (var5.length == 2) {
               try {
                  int var6 = Integer.parseInt(var5[0]);
                  String var7 = new String(var3.decode(var5[1]), StandardCharsets.UTF_8);
                  this.nNuVunNUVu.put(var4, new AutoMine.NVnVnNnN(var7, var6));
               } catch (IllegalArgumentException var8) {
               }
            }
         }
      }
   }

   private String UuUVuuUu(class_1799 var1) {
      return var1.method_7909().toString() + "|" + var1.method_7964().getString();
   }

   private boolean NuunnvnN() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         double var1 = uUnuvNvvNU.field_1724.method_23317() - NVUunUNUN.method_10263();
         double var3 = uUnuvNvvNU.field_1724.method_23321() - NVUunUNUN.method_10260();
         return Math.sqrt(var1 * var1 + var3 * var3) < 300.0;
      }
   }

   private boolean NVUunUNUN() {
      if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
         return var1.method_10263() >= this.vvUVNVvvNUv() - 4.0
            && var1.method_10263() <= this.UuNnnVnuNNV() + 4.0
            && var1.method_10264() >= this.uUVvnUuNvvN() - 6
            && var1.method_10264() <= this.UUuUnNVNuuv() + 8
            && var1.method_10260() >= this.NVuNUuVnVUN() - 4.0
            && var1.method_10260() <= this.NVuunNnvvvVu() + 4.0;
      }
   }

   private boolean UUVNuUNUvUnV() {
      return this.NVNnnvnuunNv() != null;
   }

   private class_2338 vuvnUnVnUNnV() {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         ArrayList var1 = new ArrayList();

         for (int var2 = this.uUVvnUuNvvN() - 2; var2 <= this.UUuUnNVNuuv() + 2; var2++) {
            for (int var3 = this.vvUVNVvvNUv() - 3; var3 <= this.UuNnnVnuNNV() + 3; var3++) {
               for (int var4 = this.NVuNUuVnVUN() - 3; var4 <= this.NVuunNnvvvVu() + 3; var4++) {
                  class_2338 var5 = new class_2338(var3, var2, var4);
                  if (this.nuUnNvnuUu(var5)) {
                     var1.add(var5);
                  }
               }
            }
         }

         class_2338 var6 = this.uUVVvVVNvvn();
         return var1.stream()
            .min(
               Comparator.<class_2338>comparingDouble(var1x -> class_243.method_24953(var1x).method_1025(class_243.method_24953(var6)))
                  .thenComparingDouble(var0 -> uUnuvNvvNU.field_1724.method_5707(class_243.method_24953(var0)))
            )
            .orElse(var6);
      } else {
         return null;
      }
   }

   private class_2338 uNNnnnuuuN(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && var1 != null) {
         ArrayList var2 = new ArrayList();

         for (int var3 = -1; var3 <= 1; var3++) {
            for (int var4 = 1; var4 <= 3; var4++) {
               for (int var5 = -var4; var5 <= var4; var5++) {
                  for (int var6 = -var4; var6 <= var4; var6++) {
                     if (Math.max(Math.abs(var5), Math.abs(var6)) == var4) {
                        var2.add(var1.method_10069(var5, var3, var6));
                     }
                  }
               }
            }
         }

         var2.sort(Comparator.comparingDouble(var0 -> uUnuvNvvNU.field_1724.method_19538().method_1025(class_243.method_24953(var0))));
         class_2338 var7 = null;

         for (class_2338 var9 : var2) {
            if (this.nuUnNvnuUu(var9)) {
               if (this.UuUVuuUu(var9, var1)) {
                  return var9;
               }

               if (var7 == null) {
                  var7 = var9;
               }
            }
         }

         return var7;
      } else {
         return null;
      }
   }

   private boolean nuUnNvnuUu(class_2338 var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
         class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var1.method_10084());
         class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var1.method_10074());
         return var2.method_26220(uUnuvNvvNU.field_1687, var1).method_1110()
            && var3.method_26220(uUnuvNvvNU.field_1687, var1.method_10084()).method_1110()
            && !var4.method_26220(uUnuvNvvNU.field_1687, var1.method_10074()).method_1110();
      }
   }

   private boolean UuUVuuUu(class_2338 var1, class_2338 var2) {
      class_243 var3 = class_243.method_24953(var1).method_1031(0.0, 1.2, 0.0);
      class_243 var4 = class_243.method_24953(var2);
      class_3965 var5 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var3, var4, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var5.method_17783() == class_240.field_1333 || var5.method_17777().equals(var2);
   }

   private boolean VVuuUN(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var3 = class_243.method_24953(var1);
      class_3965 var4 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var2, var3, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var4.method_17783() == class_240.field_1333 || var4.method_17777().equals(var1);
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return new uuUuvNuNVNVU(0.0F, 0.0F);
      } else {
         class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
         double var3 = var1.field_1352 - var2.field_1352;
         double var5 = var1.field_1351 - var2.field_1351;
         double var7 = var1.field_1350 - var2.field_1350;
         float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
         float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
         return new uuUuvNuNVNVU(var9, var10);
      }
   }

   private void nnuUVNUuvvVU() {
      int var1 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      class_1799 var2 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var1);
      if (var2.method_7909() == class_1802.field_8366 || var2.method_7964().getString().contains("[★]")) {
         for (int var3 = 0; var3 < 9; var3++) {
            class_1799 var4 = (class_1799)uUnuvNvvNU.field_1724.method_31548().method_67533().get(var3);
            if (var4.method_7960() || var4.method_7909() != class_1802.field_8366 && !var4.method_7964().getString().contains("[★]")) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var3);
               this.UvUvUNuvNU.UuUVuuUu();
               break;
            }
         }
      }
   }

   private boolean vNUvnnVnUvu(class_2338 var1) {
      return uUnuvNvvNU.field_1687 != null && var1 != null
         ? uUnuvNvvNU.field_1687.method_8321(var1) instanceof class_2595
            || uUnuvNvvNU.field_1687.method_8321(var1) instanceof class_3719
            || uUnuvNvvNU.field_1687.method_8321(var1) instanceof class_2627
         : false;
   }

   private void uVUuuVnNVU(class_2338 var1) {
      this.UUuUnNVNuuv = var1.method_10062();
      this.NVuNUuVnVUN = this.uNNnnnuuuN(this.UUuUnNVNuuv);
      this.NnUuNNU.C00OOC00oO(var1.method_10263() + "," + var1.method_10264() + "," + var1.method_10260());
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   private void nVVUuvuNnUN() {
      String var1 = this.NnUuNNU.uUnuvNvvNU();
      if (var1 != null && !var1.isBlank()) {
         String[] var2 = var1.split(",");
         if (var2.length == 3) {
            try {
               this.UUuUnNVNuuv = new class_2338(Integer.parseInt(var2[0]), Integer.parseInt(var2[1]), Integer.parseInt(var2[2]));
            } catch (NumberFormatException var4) {
               this.UUuUnNVNuuv = null;
            }
         }
      }
   }

   private String nNnVnUNVV() {
      String var1 = this.NVNnnvnuunNv.uUnuvNvvNU();
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.trim()
            .toLowerCase()
            .replace("/", "")
            .replace("anarchy", "")
            .replace("анархия", "")
            .replace("an", "")
            .replace("аn", "")
            .replace(" ", "");
         return var2.isBlank() ? null : var2;
      }
   }

   private void UuUVuuUu(String var1) {
      vVnvuVVUunuv.UuUVuuUu("§8[§6AutoMine§8] §c" + var1);
      this.NUVvUUVuVNVv.clear();
      this.UnvuVuVnNuvu = null;
      this.uVUVnuvnuVuv();
      this.nuunNvv = AutoMine.nvnNNunvv.IDLE;
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7346();
      }

      if (this.nuUnNvnuUu) {
         this.a_();
      }
   }

   private class_476 nuunNvv() {
      class_476 var1 = VuUNvNNvvnV.UuUVuuUu(uUnuvNvvNU, this.UnvuVuVnNuvu, class_476.class);
      if (var1 == null) {
         this.UnvuVuVnNuvu = null;
      }

      return var1;
   }

   private class_2338 uUVVvVVNvvn() {
      return new class_2338((this.vvUVNVvvNUv() + this.UuNnnVnuNNV()) / 2, this.uUVvnUuNvvN(), (this.NVuNUuVnVUN() + this.NVuunNnvvvVu()) / 2);
   }

   private int vvUVNVvvNUv() {
      return Math.min(NVUunUNUN.method_10263(), UUVNuUNUvUnV.method_10263());
   }

   private int UuNnnVnuNNV() {
      return Math.max(NVUunUNUN.method_10263(), UUVNuUNUvUnV.method_10263());
   }

   private int uUVvnUuNvvN() {
      return Math.min(NVUunUNUN.method_10264(), UUVNuUNUvUnV.method_10264());
   }

   private int UUuUnNVNuuv() {
      return Math.max(NVUunUNUN.method_10264(), UUVNuUNUvUnV.method_10264());
   }

   private int NVuNUuVnVUN() {
      return Math.min(NVUunUNUN.method_10260(), UUVNuUNUvUnV.method_10260());
   }

   private int NVuunNnvvvVu() {
      return Math.max(NVUunUNUN.method_10260(), UUVNuUNUvUnV.method_10260());
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         if (this.UUuUnNVNuuv != null || this.vvUVNVvvNUv != null) {
            class_4598 var2 = nNNnNvVVv.UuUVuuUu();

            try {
               class_243 var3 = uUnuvNvvNU.field_1773.method_19418().method_19326();
               Matrix4f var4 = var1.uUnuvNvvNU().method_23760().method_23761();
               class_4588 var5 = var2.getBuffer(nvuVvuNnNUnv);
               if (this.UUuUnNVNuuv != null) {
                  this.UuUVuuUu(var5, var4, this.UUuUnNVNuuv, var3, new Color(150, 50, 255, 120), new Color(150, 50, 255, 0));
               }

               if (this.vvUVNVvvNUv != null && !this.vVvUvVVuuNvV(this.vvUVNVvvNUv)) {
                  this.UuUVuuUu(var5, var4, this.vvUVNVvvNUv, var3, new Color(0, 180, 255, 130), new Color(0, 180, 255, 0));
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, class_2338 var3, class_243 var4, Color var5, Color var6) {
      float var7 = (float)(var3.method_10263() - var4.field_1352);
      float var8 = (float)(var3.method_10264() - var4.field_1351);
      float var9 = (float)(var3.method_10260() - var4.field_1350);
      float var10 = (float)(var3.method_10263() + 1 - var4.field_1352);
      float var11 = (float)(var3.method_10264() + 1 - var4.field_1351);
      float var12 = (float)(var3.method_10260() + 1 - var4.field_1350);
      this.UuUVuuUu(var1, var2, var7, var8, var9, var10, var11, var12, var5, var6);
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9, Color var10) {
      int var11 = var9.getRed();
      int var12 = var9.getGreen();
      int var13 = var9.getBlue();
      int var14 = var9.getAlpha();
      int var15 = var10.getRed();
      int var16 = var10.getGreen();
      int var17 = var10.getBlue();
      int var18 = var10.getAlpha();
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
   }

   record NVnVnNnN(String key, int count) {

      boolean matches(class_1799 var1) {
         return !var1.method_7960() && this.count > 0 && this.key.equals(var1.method_7909().toString() + "|" + var1.method_7964().getString());
      }
   }

   static enum nvnNNunvv {
      IDLE,
      WAITING_FOR_TP,
      GOING_TO_MINE,
      MINING,
      TELEPORTING_TO_DROP,
      GOING_TO_DROP_CHEST,
      ROTATING_DROP_CHEST,
      OPENING_DROP_CHEST,
      WAITING_FOR_DROP_GUI,
      DROPPING,
      CHANGING_ANARCHY;
   }
}
