package ru.metaculture.protection;

import com.google.gson.JsonObject;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1041;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2767;
import net.minecraft.class_2815;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_304;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_4588;
import net.minecraft.class_5537;
import net.minecraft.class_7439;
import net.minecraft.class_7923;
import net.minecraft.class_9276;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_9837;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_239.class_240;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_4668.class_4677;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ServerHelper",
   C00OOC00oO = "Позволяет юзать предметы по бинду",
   uUnuvNvvNU = oOOOo0.Misc
)
public class ServerHelper extends Module {
   public static ServerHelper NVNnnvnuunNv;
   private static final String NUVvUUVuVNVv = "Клавиша трапки";
   private static final String nNuVunNUVu = "Клавиша трапки [FunTime]";
   private static final String UNvvunVVn = "Клавиша трапки [HolyWorld]";
   private static final String UnvuVuVnNuvu = "Клавиша снежка заморозки";
   private static final String UvNNVUVNVuvV = "Клавиша снежка заморозки [FunTime]";
   private static final String NnunUUnU = "Клавиша снежка заморозки [HolyWorld]";
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим работы", "FunTime", "FunTime", "HolyWorld");
   public final UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Определение предмета", "По атрибуту", "По атрибуту", "По названию")
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final VUVnvvnNN uNnUnnuNUnNu = new VUVnvvnNN(
      "Дополнительные настройки",
      new vvNnnUNnVvn("Стопы", true),
      new vvNnnUNnVvn("Рендерить границы", true),
      new vvNnnUNnVvn("Рендерить границы сквозь стены", false),
      new vvNnnUNnVvn("Авто GPS на ивенты", true)
   );
   public final uVNuNUVvn NnUuNNU = new uVNuNUVvn("Клавиша дезориентации", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn nNvNUVU = new uVNuNUVvn("Клавиша явной пыли", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn UnUNuUU = new uVNuNUVvn("Клавиша божьей ауры", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn uUVuVvuNUvnu = new uVNuNUVvn("Клавиша пласта", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn UvUvUNuvNU = new uVNuNUVvn("Клавиша трапки", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn c0oOOCcCoC0 = new uVNuNUVvn("Клавиша снежка заморозки", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn VVnVNnunVvu = new uVNuNUVvn("Клавиша зелья ассасина", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn unNNVVNnvvV = new uVNuNUVvn("Клавиша зелья паладина", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn NuunnvnN = new uVNuNUVvn("Клавиша зелья снотворного", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn NVUunUNUN = new uVNuNUVvn("Клавиша зелья гнева", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn UUVNuUNUvUnV = new uVNuNUVvn("Клавиша зелья святая вода", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn vuvnUnVnUNnV = new uVNuNUVvn("Клавиша зелья радиации", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn nnuUVNUuvvVU = new uVNuNUVvn("Клавиша зелья хлопушки", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn nVVUuvuNnUN = new uVNuNUVvn("Меню дон-зелий", -1).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn nNnVnUNVV = new uVNuNUVvn("Клавиша трапки", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("HolyWorld"));
   public final uVNuNUVvn nuunNvv = new uVNuNUVvn("Клавиша снежка заморозки", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("HolyWorld"));
   public final uVNuNUVvn uUVVvVVNvvn = new uVNuNUVvn("Клавиша стана", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("HolyWorld"));
   public final uVNuNUVvn vvUVNVvvNUv = new uVNuNUVvn("Клавиша взрывной трапки", -1, true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("HolyWorld"));
   public final uVNuNUVvn UuNnnVnuNNV = new uVNuNUVvn("Клавиша шалкера", -1, false);
   public final uVNuNUVvn uUVvnUuNvvN = new uVNuNUVvn("Клавиша воздухана", -1, false);
   public final vvNnnUNnVvn UUuUnNVNuuv = new vvNnnUNnVvn("Кидать под себя", false);
   public final vvNnnUNnVvn NVuNUuVnVUN = new vvNnnUNnVvn("Проекция Мега-бульдозера", true).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final uVNuNUVvn NVuunNnvvvVu = new uVNuNUVvn("Хорус", -1, false);
   public final vvNnnUNnVvn vNnNuuvVn = new vvNnnUNnVvn("Таймеры структур", false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime"));
   public final UvNnUnuNUUU VUuuVUnun = new UvNnUnuNUUU("Тип ивента", "Фантайм", "Фантайм", "Спуки тайм")
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime") || !this.vNnNuuvVn.uUnuvNvvNU());
   public final vvNnnUNnVvn vVVuuVVv = new vvNnnUNnVvn("Превью", false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime") || !this.vNnNuuvVn.uUnuvNvvNU());
   public final vvNnnUNnVvn VuunNUUUvu = new vvNnnUNnVvn("Лог звуков (дебаг)", false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime") || !this.vNnNuuvVn.uUnuvNvvNU());
   public final vvNnnUNnVvn NNUUNUuVNNVn = new vvNnnUNnVvn("Лог блока (дебаг)", false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("FunTime") || !this.vNnNuuvVn.uUnuvNvvNU());
   public final vvNnnUNnVvn VvVvnNUnvuvV = new vvNnnUNnVvn("Swap Debug", false);
   private long nvuVvuNnNUnv = 0L;
   private long NnVnNVN = 0L;
   private static final long vnvvNvUnVv = 150L;
   private static final long OCOocoOoOO = 5000L;
   private static final double o0Ooc0COOoc = 0.25;
   private static final long nvvnUnUn = 0L;
   private static final long UnUUVuVunvVu = 800L;
   private static final int nnvuvUNuUnN = 3;
   private static final long UVnuVUUVnnU = 150L;
   private static final int VunnVNvNV = 3;
   private static final int NvUVUvVVnUu = 1;
   private static final float unnUnUNVnN = 90.0F;
   private static final float NnuUnUNnu = 180.0F;
   private static final float UnnnvvU = 180.0F;
   private static final int VUUnuVvVu = 1;
   private static final int VvVuvUvvNNVv = 30;
   private static final int UnnNNvuvvUU = 15;
   private static final double VNNnnVUuvv = 0.28;
   private static final int vUvUvUNNuNvn = 7;
   private static final float uuVuUuuVVNvN = 0.12F;
   private static final long VvuUUUNNNv = 800L;
   private static final int uuuVnuvnnNnU = 2;
   private final Queue<ServerHelper.NVnVnNnN> nNunUnVN = new ArrayDeque<>();
   private ServerHelper.NVnVnNnN VnVuuvVvnNv = null;
   private ServerHelper.VvunVVUvUNnv vuvvuVuVv = null;
   private long uunNUuunVU = 0L;
   private boolean NvnuuuvnVV = false;
   private int NnUVNnuvUv = 0;
   private int UuuuNNunN = -1;
   private final float[] NNVNuUvVn = new float[7];
   private final class_1799[] vuNnuUnu = new class_1799[7];
   private final int[] uuvvuNvuUNVV = new int[7];
   private final boolean[] uVvunVUNuUvu = new boolean[7];
   private final int[] NVNnnvVnvV = new int[7];
   private final float[] vUNuuvvnVnv = new float[7];
   private final float[] unnnNUNnVu = new float[7];
   private final float[] NvnnUUuVvNU = new float[7];
   private final float[] vVvuUVnV = new float[7];
   private final List<Predicate<class_1799>> nvuUVvuuN = new ArrayList<>(7);
   private String CC0COO = "";
   private int uNnNUNvuVnu = 0;
   private int VnnnvUunNvuu = 0;
   private int VuuUVVu = -1;
   private int nUNnuUNnV = -1;
   public static boolean ccOO0COcoco0 = false;
   private static final VVnnnnN VuNVnvNNuNnn = new VVnnnnN();
   private static final VVnnnnN uvVuuuvvVU = new VVnnnnN();
   private static final VVnnnnN NNnvvunuVNUn = new VVnnnnN();
   private static final VVnnnnN nVuuUnnUUVU = new VVnnnnN();
   private static boolean nUununvNvvn;
   private float NuvunVvnnN = 100.0F;
   private float vuvnnvuNVvu = 100.0F;
   private ServerHelper.VUVvVuvuN NVvnvnn = ServerHelper.VUVvVuvuN.IDLE;
   private final NnuUuVVVvUu vUvVUNnN = new NnuUuVVVvUu();
   private final VuNvNNvVV NUuVnnuUnvu = new VuNvNNvVV();
   private final VuNvNNvVV vnuNNVvVVuN = new VuNvNNvVV();
   private long Oco0Oococc = 0L;
   private long uNUnUuUnvnnU = 0L;
   private int OoccOc0CO = -1;
   private int UvuVvvVuUuuu = -1;
   private boolean NUUVUvvuNNVU = false;
   private int VUNvNUuNVnn = -1;
   private int UNNunNuUNVuU = -1;
   private class_1792 NuUuUvUUvU = null;
   private int VUVvNvvVUN = 0;
   private final VuNvNNvVV UvvNuvUNNNUv = new VuNvNNvVV();
   private final VuNvNNvVV NunUUVVVuu = new VuNvNNvVV();
   private boolean uNUnuUUvvuU = false;
   private boolean vvVVVvVNVVVN = false;
   private boolean uUuuVvVunVVu = false;
   private boolean NuUvUNN = false;
   private boolean vunuUUVVUv = false;
   private int uuuNUnuvvNNv = -1;
   private int unUVnu = 0;
   private float NvNUuuuvUvu;
   private float nNVVUnuVVVuV;
   private float vnVuunuNN;
   private float UvUNuNvvNVNv;
   private long vNnNNNuVVnUv;
   private long UVUnUvUNU;
   private boolean UvUnnnn = false;
   private boolean occOCoc0OcO = false;
   private int VnvunuuvUNu = 0;
   private boolean nuVuunUn = false;
   private boolean NvNvVNUv = false;
   private class_243 vNUUvuuVU = class_243.field_1353;
   private ServerHelper.uunvUUVnuNn unNuVNVUnV;
   private static final long UvNNNUvNnUUV = 15000L;
   private static final long vVuNvnVUvvv = 20000L;
   private static final long OCCc0co0OOC = 60000L;
   private static final long unUvvVVVVUu = 30000L;
   private static final long nnUunUnNUN = 20000L;
   private static final String UNuUVVuUuU = "block.piston.extend";
   private static final String NunnVUUuvUV = "block.anvil.place";
   private static final String nVUNnUuU = "entity.ender_dragon.growl";
   private static final long VNvuVnvnun = 250L;
   private static final double unVVnuunNU = 16.0;
   private static final long vVnuVVvVNuNu = 180L;
   private static final long uNVvVvUuuuU = 1500L;
   private static final int nvnUvvnUUN = 128;
   private static final ServerHelper.nvUnvV[] uuuvuUUNVVUN = new ServerHelper.nvUnvV[]{
      new ServerHelper.nvUnvV(
         "Драконий скин",
         30000L,
         0L,
         new ServerHelper.VUUnVnVNNU("entity.wither.break_block", 1.0F, 0.7F),
         new ServerHelper.VUUnVnVNNU("entity.ender_dragon.growl", 1.5F, 0.2F),
         new ServerHelper.VUUnVnVNNU("ui.toast.challenge_complete", 1.5F, 0.35F),
         new ServerHelper.VUUnVnVNNU("entity.evoker_fangs.attack", 0.85F, 0.5F)
      )
   };
   private static class_1799 VnUvVu;
   private static class_1799 NvUVuUNUUNvv;
   private static class_1799 NnvVNVnn;
   private static class_1799 O0ooccOc0;
   private static final ServerHelper.nUVVnVNu[] nvuVnuvUVvVu = new ServerHelper.nUVVnVNu[]{
      ServerHelper.nUVVnVNu.TRAPKA, ServerHelper.nUVVnVNu.PLAST, ServerHelper.nUVVnVNu.DRAGON_TRAP, ServerHelper.nUVVnVNu.DRAGON_PLAST
   };
   private static final int[][] coOocCcoOc0 = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   private final List<ServerHelper.nUNvUnnVN> uvNnUuvvNU = new ArrayList<>();
   private final ConcurrentLinkedDeque<ServerHelper.VUnuUnnuNvVu> UuUUvvVunV = new ConcurrentLinkedDeque<>();
   private int VuNNvnVVUUn = -1;
   private String UnVvNNuNu = "";
   private static final Set<class_2248> vuNunNnvnunv = Set.of(
      class_2246.field_10219,
      class_2246.field_10566,
      class_2246.field_10253,
      class_2246.field_10520,
      class_2246.field_28685,
      class_2246.field_37576,
      class_2246.field_10402,
      class_2246.field_28681,
      class_2246.field_10194,
      class_2246.field_10362,
      class_2246.field_10340,
      class_2246.field_10474,
      class_2246.field_10508,
      class_2246.field_10115,
      class_2246.field_28888,
      class_2246.field_29031,
      class_2246.field_27165,
      class_2246.field_27114,
      class_2246.field_10445,
      class_2246.field_9989,
      class_2246.field_10255,
      class_2246.field_10102,
      class_2246.field_10534,
      class_2246.field_9979,
      class_2246.field_10460,
      class_2246.field_9987,
      class_2246.field_10614,
      class_2246.field_10491,
      class_2246.field_10295,
      class_2246.field_10225,
      class_2246.field_10384,
      class_2246.field_10092,
      class_2246.field_10515
   );
   private static final Pattern UVVNUnVnNV = Pattern.compile("координатах\\s+(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)");
   private static final int vnUUvvnUVUu = 1024;
   private static final RenderPipeline vNVvnNNnVV = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "helper_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 UvnnnuuNvUvv = class_1921.method_24049(
      "helper_box", 1024, false, true, vNVvnNNnVV, class_4688.method_23598().method_23617(false)
   );
   private static final RenderPipeline uVUUnuunuv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "helper_lines"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29344)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 vvNvvuUUUVvv = class_1921.method_24049(
      "helper_lines", 1024, false, true, uVUUnuunuv, class_4688.method_23598().method_23609(new class_4677(OptionalDouble.of(10.0))).method_23617(false)
   );
   private static final RenderPipeline nvvVNNnnUvVN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "helper_box_no_depth"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 uUuvNUN = class_1921.method_24049(
      "helper_box_no_depth", 1024, false, true, nvvVNNnnUvVN, class_4688.method_23598().method_23617(false)
   );
   private static final RenderPipeline VnuUuUVUnnNn = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "helper_lines_no_depth"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29344)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 vnvUUNNVvU = class_1921.method_24049(
      "helper_lines_no_depth",
      1024,
      false,
      true,
      VnuUuUVUnnNn,
      class_4688.method_23598().method_23609(new class_4677(OptionalDouble.of(10.0))).method_23617(false)
   );

   public ServerHelper() {
      NVNnnvnuunNv = this;
      this.UvUvUNuvNU.UuUVuuUu("Клавиша трапки [FunTime]");
      this.nNnVnUNVV.UuUVuuUu("Клавиша трапки [HolyWorld]");
      this.c0oOOCcCoC0.UuUVuuUu("Клавиша снежка заморозки [FunTime]");
      this.nuunNvv.UuUVuuUu("Клавиша снежка заморозки [HolyWorld]");
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
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
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU,
            this.nVVUuvuNnUN,
            this.uUVVvVVNvvn,
            this.nNnVnUNVV,
            this.nuunNvv,
            this.vvUVNVvvNUv,
            this.UuNnnVnuNNV,
            this.uUVvnUuNvvN,
            this.UUuUnNVNuuv,
            this.NVuNUuVnVUN,
            this.VvVvnNUnvuvV,
            this.NVuunNnvvvVu,
            this.vNnNuuvVn,
            this.VUuuVUnun
         }
      );
   }

   @Override
   public void UuUVuuUu(JsonObject var1) {
      JsonObject var2 = var1 == null ? null : var1.deepCopy();
      if (var2 != null && var2.has("Settings")) {
         try {
            JsonObject var3 = var2.getAsJsonObject("Settings");
            if (var3.has("Клавиша трапки")) {
               int var4 = var3.get("Клавиша трапки").getAsInt();
               if (!var3.has("Клавиша трапки [FunTime]")) {
                  var3.addProperty("Клавиша трапки [FunTime]", var4);
               }

               if (!var3.has("Клавиша трапки [HolyWorld]")) {
                  var3.addProperty("Клавиша трапки [HolyWorld]", var4);
               }
            }

            if (var3.has("Клавиша снежка заморозки")) {
               int var6 = var3.get("Клавиша снежка заморозки").getAsInt();
               if (!var3.has("Клавиша снежка заморозки [FunTime]")) {
                  var3.addProperty("Клавиша снежка заморозки [FunTime]", var6);
               }

               if (!var3.has("Клавиша снежка заморозки [HolyWorld]")) {
                  var3.addProperty("Клавиша снежка заморозки [HolyWorld]", var6);
               }
            }
         } catch (Throwable var5) {
         }
      }

      super.UuUVuuUu(var2);
   }

   private boolean UuUVuuUu(uVNuNUVvn var1, vVvuNVUVvNv var2) {
      if (var1.uUnuvNvvNU() != -1 && var2.vVvUvVVuuNvV() == var1.uUnuvNvvNU()) {
         return var1.nuUnNvnuUu ? var2.nuUnNvnuUu() == 0 : var2.nuUnNvnuUu() == 1;
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(class_1799 var1, String var2) {
      return var1.method_7964().getString().toLowerCase(Locale.ROOT).contains(var2.toLowerCase(Locale.ROOT));
   }

   private boolean UuUVuuUu(class_1799 var1, String... var2) {
      for (String var6 : var2) {
         if (this.UuUVuuUu(var1, var6)) {
            return true;
         }
      }

      return false;
   }

   public Predicate<class_1799> UuUVuuUu(Predicate<class_1799> var1, String... var2) {
      return this.UNnVVNvvnVvU.C00OOC00oO("По названию") ? var2x -> this.UuUVuuUu(var2x, var2) : var1;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (this.vunuUUVVUv) {
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && this.uVunuUNVVUUV.C00OOC00oO("FunTime") && this.nVVUuvuNnUN.uUnuvNvvNU() != -1) {
            if (!this.uNNnnnuuuN(this.nVVUuvuNnUN.uUnuvNvvNU())) {
               this.uUnuvNvvNU(true);
            }
         } else {
            this.uUnuvNvvNU(false);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (uUnuvNvvNU.field_1755 == null) {
         if (this.uVunuUNVVUUV.C00OOC00oO("FunTime") && var1.vVvUvVVuuNvV() == this.nVVUuvuNnUN.uUnuvNvvNU() && this.nVVUuvuNnUN.uUnuvNvvNU() != -1) {
            if (var1.nuUnNvnuUu() == 1 && !this.vunuUUVVUv) {
               this.UuuNnUvUuv();
               var1.C00OOC00oO();
            } else if (var1.nuUnNvnuUu() == 0 && this.vunuUUVVUv) {
               this.uUnuvNvvNU(true);
               var1.C00OOC00oO();
            }
         } else {
            ServerHelper.NVnVnNnN var2 = null;
            if (this.uVunuUNVVUUV.C00OOC00oO("FunTime")) {
               if (this.UuUVuuUu(this.NnUuNNU, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::c0oOOCcCoC0, "Дезориентация"), false);
               } else if (this.UuUVuuUu(this.nNvNUVU, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::UvUvUNuvNU, "Явная пыль"), false);
               } else if (this.UuUVuuUu(this.uUVuVvuNUvnu, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::NuunnvnN, "Пласт"), false);
               } else if (this.UuUVuuUu(this.UnUNuUU, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::VuunNUUUvu, "Божья аура"), false);
               } else if (this.UuUVuuUu(this.UvUvUNuvNU, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::VVnVNnunVvu, "Трапка"), false);
               } else if (this.UuUVuuUu(this.c0oOOCcCoC0, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::vVVuuVVv, "Снежок заморозка"), false);
               } else if (this.UuUVuuUu(this.VVnVNnunVvu, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::uVunuUNVVUUV, "Зелье Ассасина"), false);
               } else if (this.UuUVuuUu(this.unNNVVNnvvV, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::nNvNUVU, "Зелье Паладина", "Зелье Палладина"), false);
               } else if (this.UuUVuuUu(this.NuunnvnN, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::uUVuVvuNUvnu, "Снотворное"), false);
               } else if (this.UuUVuuUu(this.NVUunUNUN, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::UNnVVNvvnVvU, "Зелье Гнева"), false);
               } else if (this.UuUVuuUu(this.UUVNuUNUvUnV, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::NnUuNNU, "Святая вода"), false);
               } else if (this.UuUVuuUu(this.vuvnUnVnUNnV, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::UnUNuUU, "Зелье Радиации"), false);
               } else if (this.UuUVuuUu(this.nnuUVNUuvvVU, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(this.UuUVuuUu(vnVVvun::uNnUnnuNUnNu, "Хлопушка"), false);
               }
            }

            if (this.uVunuUNVVUUV.C00OOC00oO("HolyWorld")) {
               if (this.UuUVuuUu(this.nNnVnUNVV, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(vNnnVNUVU::UuUVuuUu, false);
               } else if (this.UuUVuuUu(this.nuunNvv, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(vNnnVNUVU::C00OOC00oO, false);
               } else if (this.UuUVuuUu(this.uUVVvVVNvvn, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(vNnnVNUVU::uUnuvNvvNU, false);
               } else if (this.UuUVuuUu(this.vvUVNVvvNUv, var1)) {
                  var2 = new ServerHelper.NVnVnNnN(vNnnVNUVU::vVvUvVVuuNvV, false);
               }
            }

            if (this.UuUVuuUu(this.UuNnnVnuNNV, var1)) {
               var2 = new ServerHelper.NVnVnNnN(var0 -> var0.method_7909().toString().contains("shulker_box"), true);
            }

            if (this.UuUVuuUu(this.uUVvnUuNvvN, var1)) {
               var2 = new ServerHelper.NVnVnNnN(var0 -> var0.method_31574(class_1802.field_49098), false, false, this.UUuUnNVNuuv.uUnuvNvvNU());
            }

            if (this.UuUVuuUu(this.NVuunNnvvvVu, var1)) {
               var2 = new ServerHelper.NVnVnNnN(var0 -> var0.method_31574(class_1802.field_8233), false, true);
            }

            if (var2 != null && System.currentTimeMillis() - this.NnVnNVN >= 150L) {
               this.NnVnNVN = System.currentTimeMillis();
               this.nNunUnVN.add(var2);
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      int var2 = -100 - var1.vVvUvVVuuNvV();
      if (this.uVunuUNVVUUV.C00OOC00oO("FunTime") && this.nVVUuvuNnUN.uUnuvNvvNU() == var2) {
         if (var1.vuuuNvNuv() && !this.vunuUUVVUv) {
            this.UuUVuuUu((float)var1.VVuuUN(), (float)var1.vNUvnnVnUvu());
            this.UuuNnUvUuv();
            var1.C00OOC00oO();
            return;
         }

         if (var1.nvUVNnuu() && this.vunuUUVVUv) {
            this.UuUVuuUu((float)var1.VVuuUN(), (float)var1.vNUvnnVnUvu());
            this.uUnuvNvvNU(true);
            var1.C00OOC00oO();
            return;
         }
      }

      if (this.vunuUUVVUv) {
         this.UuUVuuUu((float)var1.VVuuUN(), (float)var1.vNUvnnVnUvu());
         var1.C00OOC00oO();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vNuUUUVVunnV var1) {
      if (this.vunuUUVVUv) {
         var1.C00OOC00oO();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NNVuvnnUnnuv var1) {
      if (this.vunuUUVVUv) {
         var1.C00OOC00oO();
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1755 == null && uUnuvNvvNU.method_22683() != null) {
         this.vunuUUVVUv = true;
         this.uuuNUnuvvNNv = -1;
         this.vNnNNNuVVnUv = this.UVUnUvUNU = System.nanoTime();
         Arrays.fill(this.NNVNuUvVn, 0.0F);
         this.uVUVnuvnuVuv();
         this.vnVuunuNN = this.NvNUuuuvUvu;
         this.UvUNuNvvNVNv = this.nNVVUnuVVVuV;
         this.NNUUNUuVNNVn();
         if (uUnuvNvvNU.field_1729 != null) {
            uUnuvNvvNU.field_1729.method_1610();
         }

         this.NVNnnvnuunNv();
      }
   }

   private void uUnuvNvvNU(boolean var1) {
      if (this.vunuUUVVUv) {
         this.UvnvNVnnnnNU();
         this.NNUUNUuVNNVn();
         class_1041 var2 = uUnuvNvvNU.method_22683();
         int var3 = var2 == null ? -1 : this.UuUVuuUu(this.NvNUuuuvUvu, this.nNVVUnuVVVuV, var2.method_4489(), var2.method_4506());
         this.vunuUUVVUv = false;
         this.uuuNUnuvvNNv = -1;
         if (var1 && var3 >= 0) {
            this.UuUVuuUu(var3);
         }

         if (uUnuvNvvNU.field_1755 == null && uUnuvNvvNU.field_1729 != null) {
            uUnuvNvvNU.field_1729.method_1612();
         }
      }
   }

   private void UuUVuuUu(int var1) {
      ServerHelper.NVnVnNnN var2 = this.C00OOC00oO(var1);
      ServerHelper.VvunVVUvUNnv var3 = this.uUnuvNvvNU(var1);
      if (var2 != null && !var3.stack().method_7960() && System.currentTimeMillis() - this.NnVnNVN >= 150L) {
         this.NnVnNVN = System.currentTimeMillis();
         if (!var3.isBundled()) {
            this.nNunUnVN.add(var2);
         } else if (this.NVvnvnn == ServerHelper.VUVvVuvuN.IDLE) {
            this.UuUVuuUu(var2, var3);
         }
      }
   }

   private boolean UuUVuuUu(ServerHelper.NVnVnNnN var1, ServerHelper.VvunVVUvUNnv var2) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && this.NVvnvnn == ServerHelper.VUVvVuvuN.IDLE) {
         this.VnVuuvVvnNv = var1;
         this.vuvvuVuVv = var2;
         this.uunNUuunVU = System.currentTimeMillis() + 800L;
         this.NvnuuuvnVV = false;
         this.NnUVNnuvUv = 0;
         this.Oco0Oococc = System.nanoTime();
         this.NVvnvnn = ServerHelper.VUVvVuvuN.EXTRACT;
         ccOO0COcoco0 = true;
         this.UNnVVNvvnVvU();
         if (this.uVunuUNVVUUV()) {
            vVnvuVVUunuv.UuUVuuUu("§8[§eSwapDebug§8] §fbundle extract start");
         }

         return true;
      } else {
         return false;
      }
   }

   private void nUUVuvU() {
      if (this.VnVuuvVvnNv != null && this.vuvvuVuVv != null && uUnuvNvvNU.field_1724 != null) {
         if (System.currentTimeMillis() > this.uunNUuunVU) {
            this.UnUNVVVNuv();
         } else if (!this.NvnuuuvnVV) {
            if (!this.UuUVuuUu(this.vuvvuVuVv, this.VnVuuvVvnNv)) {
               this.UnUNVVVNuv();
            } else {
               this.NvnuuuvnVV = true;
               this.NnUVNnuvUv = 0;
            }
         } else if (this.NnUVNnuvUv++ >= 2) {
            int var1 = this.UuuuNNunN;
            if (var1 >= 0 && var1 < 36) {
               class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
               if (!var2.method_7960() && this.VnVuuvVvnNv.UuUVuuUu.test(var2)) {
                  this.UuUVuuUu("bundle extract", this.Oco0Oococc);
                  ServerHelper.NVnVnNnN var6 = this.VnVuuvVvnNv;
                  this.VnVuuvVvnNv = null;
                  this.vuvvuVuVv = null;
                  this.NvnuuuvnVV = false;
                  this.UuuuNNunN = -1;
                  this.OoccOc0CO = var1;
                  this.UvuVvvVuUuuu = uUnuvNvvNU.field_1724.method_31548().method_67532();
                  this.uNUnuUUvvuU = var6.C00OOC00oO;
                  this.vvVVVvVNVVVN = var6.uUnuvNvvNU;
                  this.uUuuVvVunVVu = var6.vVvUvVVuuNvV;
                  this.NuUvUNN = var1 >= 9 && !var6.C00OOC00oO;
                  if (this.NuUvUNN) {
                     this.VUNvNUuNVnn = this.UvuVvvVuUuuu;
                     this.UNNunNuUNVuU = var1;
                     this.NuUuUvUUvU = uUnuvNvvNU.field_1724.method_31548().method_5438(this.UvuVvvVuUuuu).method_7909();
                  }

                  this.UvUnnnn = false;
                  this.occOCoc0OcO = false;
                  this.VnvunuuvUNu = 0;
                  this.nuVuunUn = false;
                  this.NvNvVNUv = false;
                  this.vNUUvuuVU = uUnuvNvvNU.field_1724.method_19538();
                  this.VnnnvUunNvuu = 0;
                  this.NUuVnnuUnvu.UuUVuuUu();
                  this.vnuNNVvVVuN.UuUVuuUu();
                  this.uNUnUuUnvnnU = 0L;
                  this.NVvnvnn = ServerHelper.VUVvVuvuN.PREPARE;
                  return;
               }
            }

            for (int var5 = 0; var5 < 36; var5++) {
               class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var5);
               if (!var3.method_7960() && this.VnVuuvVvnNv.UuUVuuUu.test(var3)) {
                  this.UuUVuuUu("bundle extract", this.Oco0Oococc);
                  ServerHelper.NVnVnNnN var4 = this.VnVuuvVvnNv;
                  this.VnVuuvVvnNv = null;
                  this.vuvvuVuVv = null;
                  this.NvnuuuvnVV = false;
                  this.UuuuNNunN = -1;
                  this.OoccOc0CO = var5;
                  this.UvuVvvVuUuuu = uUnuvNvvNU.field_1724.method_31548().method_67532();
                  this.uNUnuUUvvuU = var4.C00OOC00oO;
                  this.vvVVVvVNVVVN = var4.uUnuvNvvNU;
                  this.uUuuVvVunVVu = var4.vVvUvVVuuNvV;
                  this.NuUvUNN = var5 >= 9 && !var4.C00OOC00oO;
                  if (this.NuUvUNN) {
                     this.VUNvNUuNVnn = this.UvuVvvVuUuuu;
                     this.UNNunNuUNVuU = var5;
                     this.NuUuUvUUvU = uUnuvNvvNU.field_1724.method_31548().method_5438(this.UvuVvvVuUuuu).method_7909();
                  }

                  this.UvUnnnn = false;
                  this.occOCoc0OcO = false;
                  this.VnvunuuvUNu = 0;
                  this.nuVuunUn = false;
                  this.NvNvVNUv = false;
                  this.vNUUvuuVU = uUnuvNvvNU.field_1724.method_19538();
                  this.VnnnvUunNvuu = 0;
                  this.NUuVnnuUnvu.UuUVuuUu();
                  this.vnuNNVvVVuN.UuUVuuUu();
                  this.uNUnUuUnvnnU = 0L;
                  this.NVvnvnn = ServerHelper.VUVvVuvuN.PREPARE;
                  return;
               }
            }
         }
      } else {
         this.UnUNVVVNuv();
      }
   }

   private void UnUNVVVNuv() {
      this.VnVuuvVvnNv = null;
      this.vuvvuVuVv = null;
      this.NvnuuuvnVV = false;
      this.UuuuNNunN = -1;
      if (this.NVvnvnn == ServerHelper.VUVvVuvuN.EXTRACT) {
         this.NVvnvnn = ServerHelper.VUVvVuvuN.IDLE;
         ccOO0COcoco0 = false;
         this.uNnUnnuNUnNu();
      }
   }

   private ServerHelper.NVnVnNnN C00OOC00oO(int var1) {
      return switch (var1) {
         case 0 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::uVunuUNVVUUV, "Зелье Ассасина"), false);
         case 1 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::nNvNUVU, "Зелье Паладина", "Зелье Палладина"), false);
         case 2 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::uUVuVvuNUvnu, "Снотворное"), false);
         case 3 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::UNnVVNvvnVvU, "Зелье Гнева"), false);
         case 4 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::NnUuNNU, "Святая вода"), false);
         case 5 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::UnUNuUU, "Зелье Радиации"), false);
         case 6 -> new ServerHelper.NVnVnNnN(this.C00OOC00oO(vnVVvun::uNnUnnuNUnNu, "Хлопушка"), false);
         default -> null;
      };
   }

   private Predicate<class_1799> C00OOC00oO(Predicate<class_1799> var1, String... var2) {
      Predicate var3 = this.UuUVuuUu(var1, var2);
      return var1x -> var1x.method_31574(class_1802.field_8436) && var3.test(var1x);
   }

   private ServerHelper.VvunVVUvUNnv uUnuvNvvNU(int var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return new ServerHelper.VvunVVUvUNnv(class_1799.field_8037, -1, -1);
      } else {
         ServerHelper.NVnVnNnN var2 = this.C00OOC00oO(var1);
         if (var2 == null) {
            return new ServerHelper.VvunVVUvUNnv(class_1799.field_8037, -1, -1);
         } else {
            for (int var3 = 0; var3 < 36; var3++) {
               class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var3);
               if (!var4.method_7960() && var2.UuUVuuUu.test(var4)) {
                  return new ServerHelper.VvunVVUvUNnv(var4, var3, -1);
               }
            }

            return this.UuUVuuUu(var2.UuUVuuUu);
         }
      }
   }

   private ServerHelper.VvunVVUvUNnv UuUVuuUu(Predicate<class_1799> var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return new ServerHelper.VvunVVUvUNnv(class_1799.field_8037, -1, -1);
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (var3.method_7909() instanceof class_5537) {
               class_9276 var4 = (class_9276)var3.method_58694(class_9334.field_49650);
               if (var4 != null) {
                  for (int var5 = 0; var5 < var4.method_57426(); var5++) {
                     class_1799 var6 = var4.method_57422(var5);
                     if (!var6.method_7960() && var1.test(var6)) {
                        return new ServerHelper.VvunVVUvUNnv(var6, var2, var5);
                     }
                  }
               }
            }
         }

         return new ServerHelper.VvunVVUvUNnv(class_1799.field_8037, -1, -1);
      }
   }

   private boolean UuUVuuUu(ServerHelper.VvunVVUvUNnv var1, ServerHelper.NVnVnNnN var2) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.field_7498.method_34255().method_7960()) {
         int var3 = this.vNVuvnUUnuUn();
         if (var3 == -1) {
            vVnvuVVUunuv.UuUVuuUu("Для зелья из мешочка нужен свободный слот инвентаря");
            return false;
         } else {
            class_1799 var4 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1.inventorySlot());
            class_9276 var5 = (class_9276)var4.method_58694(class_9334.field_49650);
            if (var4.method_7909() instanceof class_5537
               && var5 != null
               && var1.bundleStackIndex() < var5.method_57426()
               && var2.UuUVuuUu.test(var5.method_57422(var1.bundleStackIndex()))) {
               int var6 = this.vVvUvVVuuNvV(var1.inventorySlot());
               int var7 = this.vVvUvVVuuNvV(var3);
               class_5537.method_61637(var4, var1.bundleStackIndex());
               uUnuvNvvNU.field_1724.field_3944.method_52787(new class_9837(var6, var1.bundleStackIndex()));
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var6, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var7, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
               this.UuuuNNunN = var3;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private int vNVuvnUUnuUn() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      return -1;
   }

   private int vVvUvVVuuNvV(int var1) {
      return var1 < 9 ? 36 + var1 : var1;
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.method_22683() != null) {
         double[] var1 = new double[1];
         double[] var2 = new double[1];
         GLFW.glfwGetCursorPos(uUnuvNvvNU.method_22683().method_4490(), var1, var2);
         this.UuUVuuUu((float)var1[0], (float)var2[0]);
      }
   }

   private void uVUVnuvnuVuv() {
      class_1041 var1 = uUnuvNvvNU.method_22683();
      if (var1 != null && !var1.method_65966()) {
         this.NvNUuuuvUvu = var1.method_4489() * 0.5F;
         this.nNVVUnuVVVuV = var1.method_4506() * 0.5F;
      }
   }

   private void NVNnnvnuunNv() {
      class_1041 var1 = uUnuvNvvNU.method_22683();
      if (var1 != null && !var1.method_65966()) {
         GLFW.glfwSetCursorPos(var1.method_4490(), var1.method_4480() * 0.5, var1.method_4507() * 0.5);
      }
   }

   private void UuUVuuUu(float var1, float var2) {
      if (Float.isFinite(var1) && Float.isFinite(var2)) {
         class_1041 var3 = uUnuvNvvNU.method_22683();
         if (var3 != null && !var3.method_65966() && var3.method_4489() > 0 && var3.method_4506() > 0 && var3.method_4480() > 0 && var3.method_4507() > 0) {
            this.NvNUuuuvUvu = class_3532.method_15363(
               (float)((double)(var1 * var3.method_4489()) / var3.method_4480()), 0.0F, Math.max(0.0F, var3.method_4489() - 1.0F)
            );
            this.nNVVUnuVVVuV = class_3532.method_15363(
               (float)((double)(var2 * var3.method_4506()) / var3.method_4507()), 0.0F, Math.max(0.0F, var3.method_4506() - 1.0F)
            );
         } else {
            this.NvNUuuuvUvu = var1;
            this.nNVVUnuVVVuV = var2;
         }
      }
   }

   private boolean uNNnnnuuuN(int var1) {
      if (uUnuvNvvNU.method_22683() == null) {
         return false;
      } else {
         long var2 = uUnuvNvvNU.method_22683().method_4490();
         if (var1 >= 0) {
            return class_3675.method_15987(var2, var1);
         } else if (var1 > -100) {
            return false;
         } else {
            int var4 = -var1 - 100;
            return var4 >= 0 && var4 <= 7 && GLFW.glfwGetMouseButton(var2, var4) == 1;
         }
      }
   }

   @vuVvUNNvVNV
   private void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         this.VUuuVUnun();
         this.NVUunUNUN();
         if (this.NVvnvnn == ServerHelper.VUVvVuvuN.IDLE) {
            if (!this.nNunUnVN.isEmpty()) {
               ServerHelper.NVnVnNnN var6 = this.nNunUnVN.poll();
               int var3 = -1;

               for (int var4 = 0; var4 < 36; var4++) {
                  class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
                  if (var5 != null && !var5.method_7960() && var6.UuUVuuUu.test(var5)) {
                     var3 = var4;
                     break;
                  }
               }

               if (var3 == -1) {
                  ServerHelper.VvunVVUvUNnv var7 = this.UuUVuuUu(var6.UuUVuuUu);
                  if (var7.isBundled()) {
                     this.UuUVuuUu(var6, var7);
                  }
               }

               if (var3 == -1) {
                  return;
               }

               this.OoccOc0CO = var3;
               this.UvuVvvVuUuuu = uUnuvNvvNU.field_1724.method_31548().method_67532();
               this.uNUnuUUvvuU = var6.C00OOC00oO;
               this.vvVVVvVNVVVN = var6.uUnuvNvvNU;
               this.uUuuVvVunVVu = var6.vVvUvVVuuNvV;
               this.NuUvUNN = var3 >= 9 && !var6.C00OOC00oO;
               if (this.NuUvUNN) {
                  this.VUNvNUuNVnn = this.UvuVvvVuUuuu;
                  this.UNNunNuUNVuU = var3;
                  this.NuUuUvUUvU = uUnuvNvvNU.field_1724.method_31548().method_5438(this.UvuVvvVuUuuu).method_7909();
               }

               this.UvUnnnn = false;
               this.occOCoc0OcO = false;
               this.VnvunuuvUNu = 0;
               this.nuVuunUn = false;
               this.NvNvVNUv = false;
               this.vNUUvuuVU = uUnuvNvvNU.field_1724.method_19538();
               this.VnnnvUunNvuu = 0;
               this.NUuVnnuUnvu.UuUVuuUu();
               this.vnuNNVvVVuN.UuUVuuUu();
               this.Oco0Oococc = System.nanoTime();
               this.uNUnUuUnvnnU = 0L;
               this.NVvnvnn = ServerHelper.VUVvVuvuN.PREPARE;
               ccOO0COcoco0 = true;
               if (this.NnUuNNU()) {
                  this.uNUnUuUnvnnU = System.nanoTime();
                  this.c0oOOCcCoC0();
               } else {
                  this.UNnVVNvvnVvU();
               }
            }
         } else {
            if (!this.NnUuNNU()) {
               this.UNnVVNvvnVvU();
               Sprint.NnUuNNU = 2;
               uUnuvNvvNU.field_1690.field_1867.method_23481(false);
               uUnuvNvvNU.field_1724.method_5728(false);
            }

            switch (this.NVvnvnn) {
               case EXTRACT:
                  this.nUUVuvU();
                  return;
               case PREPARE:
                  if (this.uNUnuUUvvuU) {
                     if (this.NUuVnnuUnvu.UuUVuuUu(0L)) {
                        this.NUuVnnuUnvu.UuUVuuUu();
                        int var2 = this.OoccOc0CO < 9 ? 36 + this.OoccOc0CO : this.OoccOc0CO;
                        uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
                        this.NVvnvnn = ServerHelper.VUVvVuvuN.COOLDOWN;
                     }
                  } else if (this.NnUuNNU()) {
                     if (this.NuUvUNN && !this.vvVVVvVNVVVN) {
                        this.UNnVVNvvnVvU();
                        Sprint.NnUuNNU = Math.max(Sprint.NnUuNNU, 2);
                        uUnuvNvvNU.field_1690.field_1867.method_23481(false);
                        uUnuvNvvNU.field_1724.method_5728(false);
                        this.VVnVNnunVvu();
                        this.UUVNuUNUvUnV();
                        this.NVvnvnn = ServerHelper.VUVvVuvuN.PRE_RESTORE_STOP;
                        this.uNUnUuUnvnnU = System.nanoTime();
                        this.uUVuVvuNUvnu();
                        this.c0oOOCcCoC0();
                     } else {
                        this.nNvNUVU();
                     }
                  } else {
                     this.NVvnvnn = ServerHelper.VUVvVuvuN.SWAP;
                  }
                  break;
               case PRE_SWAP_STOP:
                  this.c0oOOCcCoC0();
                  if (!this.UvUvUNuvNU()) {
                     return;
                  }

                  this.UuUVuuUu("stop->swap " + (System.nanoTime() - this.uNUnUuUnvnnU) / 1000000L + "ms", this.uNUnUuUnvnnU);
                  this.VVnVNnunVvu();
                  if (this.vvVVVvVNVVVN && !this.uUVvnUuNvvN()) {
                     this.NVuunNnvvvVu();
                     return;
                  }

                  if (this.vvVVVvVNVVVN) {
                     if (this.OoccOc0CO < 9 && this.uUVvnUuNvvN()) {
                        this.nuunNvv();
                     } else {
                        this.VnnnvUunNvuu = 0;
                        this.NVvnvnn = ServerHelper.VUVvVuvuN.WAIT_MAIN_HAND;
                     }
                  } else {
                     this.UUVNuUNUvUnV();
                     this.UnUNuUU();
                  }
                  break;
               case WAIT_MAIN_HAND:
                  this.c0oOOCcCoC0();
                  if (this.vvVVVvVNVVVN && this.uUVvnUuNvvN()) {
                     this.nuunNvv();
                     return;
                  }

                  if (this.VnnnvUunNvuu++ >= 3) {
                     this.NVuunNnvvvVu();
                  }
                  break;
               case SWAP:
                  if (this.OoccOc0CO >= 9) {
                     this.nNvNUVU();
                     return;
                  }

                  uUnuvNvvNU.field_1724.method_31548().method_61496(this.OoccOc0CO);
                  ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
                  if (this.vvVVVvVNVVVN) {
                     this.nuunNvv();
                     this.NVvnvnn = ServerHelper.VUVvVuvuN.USE;
                  } else {
                     this.UUVNuUNUvUnV();
                     this.NVvnvnn = ServerHelper.VUVvVuvuN.RESTORE;
                  }
                  break;
               case USE:
                  if (this.vvVVVvVNVVVN) {
                     if (this.occOCoc0OcO) {
                        this.uUVVvVVNvvn();
                     } else {
                        this.nuunNvv();
                     }
                  } else {
                     this.NVvnvnn = ServerHelper.VUVvVuvuN.RESTORE;
                  }
                  break;
               case PRE_RESTORE_STOP:
                  this.c0oOOCcCoC0();
                  if (!this.UvUvUNuvNU()) {
                     return;
                  }

                  this.UuUVuuUu("stop->restore " + (System.nanoTime() - this.uNUnUuUnvnnU) / 1000000L + "ms", this.uNUnUuUnvnnU);
                  this.unNNVVNnvvV();
                  this.NVvnvnn = ServerHelper.VUVvVuvuN.COOLDOWN;
                  break;
               case RESTORE:
                  if (this.vvVVVvVNVVVN) {
                     this.UUuUnNVNuuv();
                  }

                  if (this.OoccOc0CO >= 9) {
                     this.UnUNuUU();
                     return;
                  }

                  uUnuvNvvNU.field_1724.method_31548().method_61496(this.UvuVvvVuUuuu);
                  ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
                  this.NVvnvnn = ServerHelper.VUVvVuvuN.COOLDOWN;
                  break;
               case COOLDOWN:
                  if (!this.uNUnuUUvvuU && this.OoccOc0CO >= 9) {
                     uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
                     uUnuvNvvNU.field_1724.method_7346();
                  }

                  if (this.uNnUnnuNUnNu.C00OOC00oO("Стопы")) {
                     NVnVnU.UuUVuuUu().C00OOC00oO("ServerHelper_Lock");
                  }

                  this.nVVUuvuNnUN();
                  this.UuUVuuUu("full swap", this.Oco0Oococc);
                  this.Oco0Oococc = 0L;
                  this.uNUnUuUnvnnU = 0L;
                  if (this.NuUvUNN) {
                     this.NUUVUvvuNNVU = true;
                     this.VUVvNvvVUN = 3;
                     this.UvvNuvUNNNUv.UuUVuuUu();
                     this.NunUUVVVuu.UuUVuuUu();
                  }

                  this.NVvnvnn = ServerHelper.VUVvVuvuN.IDLE;
                  ccOO0COcoco0 = false;
                  this.uNUnuUUvvuU = false;
                  this.vvVVVvVNVVVN = false;
                  this.uUuuVvVunVVu = false;
                  this.NuUvUNN = false;
                  this.occOCoc0OcO = false;
                  this.VnvunuuvUNu = 0;
            }
         }
      }
   }

   private boolean uVunuUNVVUUV() {
      if (this.VvVvnNUnvuvV != null && this.VvVvnNUnvuvV.uUnuvNvvNU()) {
         return true;
      } else if (uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         String var1 = uUnuvNvvNU.field_1724.method_5477().getString();
         return "lichoday".equalsIgnoreCase(var1);
      }
   }

   private void UuUVuuUu(String var1, long var2) {
      if (this.uVunuUNVVUUV() && var2 != 0L) {
         double var4 = (System.nanoTime() - var2) / 1.0E9;
         vVnvuVVUunuv.UuUVuuUu("§8[§eSwapDebug§8] §f" + var1 + " §7" + String.format(Locale.ROOT, "%.3f", var4) + "s §8(stop 0ms, bundle 800ms/2t)");
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.uNnUnnuNUnNu.C00OOC00oO("Стопы")) {
         if (this.vvVVVvVNVVVN || this.OoccOc0CO < 0 || this.OoccOc0CO >= 9) {
            NVnVnU.UuUVuuUu().UuUVuuUu("ServerHelper_Lock");
         }
      }
   }

   private void uNnUnnuNUnNu() {
      if (this.uNnUnnuNUnNu.C00OOC00oO("Стопы")) {
         NVnVnU.UuUVuuUu().C00OOC00oO("ServerHelper_Lock");
      }
   }

   private boolean NnUuNNU() {
      return this.vvVVVvVNVVVN || this.NuUvUNN;
   }

   private void nNvNUVU() {
      this.UUuUnNVNuuv();
      this.NVvnvnn = ServerHelper.VUVvVuvuN.PRE_SWAP_STOP;
      this.uUVuVvuNUvnu();
      this.uNUnUuUnvnnU = System.nanoTime();
      this.c0oOOCcCoC0();
   }

   private void UnUNuUU() {
      this.UUuUnNVNuuv();
      this.NVvnvnn = ServerHelper.VUVvVuvuN.PRE_RESTORE_STOP;
      this.uUVuVvuNUvnu();
      this.uNUnUuUnvnnU = System.nanoTime();
      this.c0oOOCcCoC0();
   }

   private void uUVuVvuNUvnu() {
      this.vnuNNVvVVuN.UuUVuuUu();
   }

   private boolean UvUvUNuvNU() {
      long var1 = this.uUuuVvVunVVu ? 100L : 0L;
      return this.vnuNNVvVVuN.vNUvnnVnUvu(var1);
   }

   private void c0oOOCcCoC0() {
      this.UNnVVNvvnVvU();
      Sprint.NnUuNNU = Math.max(Sprint.NnUuNNU, 2);
      uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      uUnuvNvvNU.field_1724.method_5728(false);
   }

   private void VVnVNnunVvu() {
      if (this.OoccOc0CO < 9) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.OoccOc0CO);
         ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
      } else {
         this.NuunnvnN();
      }
   }

   private void unNNVVNnvvV() {
      if (this.OoccOc0CO < 9) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.UvuVvvVuUuuu);
         ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
      } else {
         this.NuunnvnN();
      }
   }

   private void NuunnvnN() {
      uUnuvNvvNU.field_1761
         .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.OoccOc0CO, this.UvuVvvVuUuuu, class_1713.field_7791, uUnuvNvvNU.field_1724);
   }

   private void NVUunUNUN() {
      if (this.NUUVUvvuNNVU) {
         if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null) {
            this.NUUVUvvuNNVU = false;
         } else if (this.VUVvNvvVUN <= 0 || this.UvvNuvUNNNUv.vNUvnnVnUvu(800L)) {
            this.NUUVUvvuNNVU = false;
         } else if (this.NVvnvnn == ServerHelper.VUVvVuvuN.IDLE) {
            class_1792 var1 = uUnuvNvvNU.field_1724.method_31548().method_5438(this.VUNvNUuNVnn).method_7909();
            class_1792 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(this.UNNunNuUNVuU).method_7909();
            if (var1 != this.NuUuUvUUvU && var2 == this.NuUuUvUUvU) {
               if (this.NunUUVVVuu.vNUvnnVnUvu(150L)) {
                  this.NunUUVVVuu.UuUVuuUu();
                  uUnuvNvvNU.field_1761
                     .method_2906(
                        uUnuvNvvNU.field_1724.field_7498.field_7763, this.UNNunNuUNVuU, this.VUNvNUuNVnn, class_1713.field_7791, uUnuvNvvNU.field_1724
                     );
                  this.VUVvNvvVUN--;
               }
            }
         }
      }
   }

   private void UUVNuUNUvUnV() {
      if (this.uUuuVvVunVVu) {
         this.vuvnUnVnUNnV();
      }

      uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
   }

   private void vuvnUnVnUNnV() {
      this.vUvVUNnN.UuUVuuUu(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724.method_36454(), 90.0F), 180.0F, 180.0F, 180.0F, 180.0F, 1, this.nnuUVNUuvvVU());
      uUnuvNvvNU.field_1690.field_1903.method_23481(true);
      this.UvUnnnn = true;
      if (uUnuvNvvNU.field_1724.method_24828()) {
         uUnuvNvvNU.field_1724.method_6043();
      }
   }

   private int nnuUVNUuvvVU() {
      return AttackAura.ccOO0COcoco0 != null ? 30 : 15;
   }

   private void nVVUuvuNnUN() {
      if (this.UvUnnnn) {
         this.nNnVnUNVV();
         this.UvUnnnn = false;
      }
   }

   private void nNnVnUNVV() {
      if (uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.method_22683() != null) {
         boolean var1 = class_3675.method_15987(uUnuvNvvNU.method_22683().method_4490(), uUnuvNvvNU.field_1690.field_1903.method_1429().method_1444());
         uUnuvNvvNU.field_1690.field_1903.method_23481(var1);
      }
   }

   private void nuunNvv() {
      this.vNUUvuuVU = uUnuvNvvNU.field_1724.method_19538();
      this.occOCoc0OcO = true;
      this.nuVuunUn = false;
      this.NvNvVNUv = false;
      this.NUuVnnuUnvu.UuUVuuUu();
      uUnuvNvvNU.field_1690.field_1904.method_23481(true);
      uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
      this.NVvnvnn = ServerHelper.VUVvVuvuN.USE;
   }

   private void uUVVvVVNvvn() {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1761 == null) {
         this.vvUVNVvvNUv();
      } else if (this.UuNnnVnuNNV()) {
         if (!this.nuVuunUn) {
            this.uNnUnnuNUnNu();
         }

         this.nuVuunUn = true;
         this.VnvunuuvUNu = 0;
         uUnuvNvvNU.field_1690.field_1904.method_23481(true);
      } else {
         if (this.nuVuunUn && !this.NvNvVNUv) {
            this.NvNvVNUv = true;
            uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         }

         if (this.NvNvVNUv && this.NVuNUuVnVUN()) {
            this.vvUVNVvvNUv();
         } else if (!this.nuVuunUn) {
            this.c0oOOCcCoC0();
            if (this.uUVvnUuNvvN() && this.VnvunuuvUNu++ < 1) {
               this.nuunNvv();
            } else {
               this.vvUVNVvvNUv();
            }
         } else {
            if (this.NUuVnnuUnvu.vNUvnnVnUvu(5000L)) {
               this.vvUVNVvvNUv();
            }
         }
      }
   }

   private void vvUVNVvvNUv() {
      this.UUuUnNVNuuv();
      this.UnUNuUU();
   }

   private boolean UuNnnVnuNNV() {
      return uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.field_1724.method_6115()
         && uUnuvNvvNU.field_1724.method_6058() == class_1268.field_5808
         && uUnuvNvvNU.field_1724.method_6030().method_31574(class_1802.field_8233);
   }

   private boolean uUVvnUuNvvN() {
      return uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8233);
   }

   private void UUuUnNVNuuv() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      }

      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.method_6115()) {
         uUnuvNvvNU.field_1761.method_2897(uUnuvNvvNU.field_1724);
         uUnuvNvvNU.field_1724.method_6075();
      }
   }

   private boolean NVuNUuVnVUN() {
      return uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.method_19538().method_1025(this.vNUUvuuVU) >= 0.25;
   }

   private void vVvUvVVuuNvV(boolean var1) {
      if (uUnuvNvvNU.method_22683() != null) {
         class_304[] var2 = new class_304[]{
            uUnuvNvvNU.field_1690.field_1894,
            uUnuvNvvNU.field_1690.field_1881,
            uUnuvNvvNU.field_1690.field_1913,
            uUnuvNvvNU.field_1690.field_1849,
            uUnuvNvvNU.field_1690.field_1903
         };
         long var3 = uUnuvNvvNU.method_22683().method_4490();

         for (class_304 var8 : var2) {
            boolean var9 = var1 && class_3675.method_15987(var3, var8.method_1429().method_1444());
            var8.method_23481(var9);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var9 = var2.comp_763().getString();
         if (this.uNnUnnuNUnNu.C00OOC00oO("Авто GPS на ивенты") && var9.contains("Появился на координатах")) {
            Matcher var5 = UVVNUnVnNV.matcher(var9);
            if (var5.find()) {
               try {
                  float var6 = Float.parseFloat(var5.group(1));
                  float var7 = Float.parseFloat(var5.group(3));
                  oO0OcCC0OCO.UuUVuuUu(var6, var7);
               } catch (NumberFormatException var8) {
               }
            }
         }
      } else if (var1.vVvUvVVuuNvV() instanceof class_2767 var3) {
         this.UuUVuuUu(var3);
      }
   }

   private void NVuunNnvvvVu() {
      this.nVVUuvuNnUN();
      if (this.NVvnvnn != ServerHelper.VUVvVuvuN.IDLE) {
         NVnVnU.UuUVuuUu().C00OOC00oO("ServerHelper_Lock");
      }

      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      }

      if (this.uNnNUNvuVnu > 0 && this.uNnUnnuNUnNu.C00OOC00oO("Стопы")) {
         NVnVnU.UuUVuuUu().C00OOC00oO("ServerHelper_Lock");
      }

      this.uNnNUNvuVnu = 0;
      this.VnnnvUunNvuu = 0;
      this.OoccOc0CO = -1;
      this.UvuVvvVuUuuu = -1;
      this.uNUnuUUvvuU = false;
      this.vvVVVvVNVVVN = false;
      this.uUuuVvVunVVu = false;
      this.NuUvUNN = false;
      this.occOCoc0OcO = false;
      this.VnvunuuvUNu = 0;
      this.nuVuunUn = false;
      this.NvNvVNUv = false;
      this.vnuNNVvVVuN.UuUVuuUu();
      this.NUUVUvvuNNVU = false;
      this.VnVuuvVvnNv = null;
      this.vuvvuVuVv = null;
      this.NvnuuuvnVV = false;
      this.NVvnvnn = ServerHelper.VUVvVuvuN.IDLE;
      ccOO0COcoco0 = false;
   }

   @Override
   public void C00OOC00oO() {
      this.uUnuvNvvNU(false);
      this.nvuVvuNnNUnv = 0L;
      this.NnVnNVN = 0L;
      this.nNunUnVN.clear();
      this.VnVuuvVvnNv = null;
      this.vuvvuVuVv = null;
      this.NvnuuuvnVV = false;
      this.uvNnUuvvNU.clear();
      this.UuUUvvVunV.clear();
      this.VuNNvnVVUUn = -1;
      this.NVuunNnvvvVu();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         boolean var2 = this.uNnUnnuNUnNu.C00OOC00oO("Рендерить границы");
         if (var2 || this.NVuNUuVnVUN.uUnuvNvvNU()) {
            class_1921 var3 = this.uNnUnnuNUnNu.C00OOC00oO("Рендерить границы сквозь стены") ? uUuvNUN : UvnnnuuNvUvv;
            class_1921 var4 = this.uNnUnnuNUnNu.C00OOC00oO("Рендерить границы сквозь стены") ? vnvUUNNVvU : vvNvvuUUUVvv;
            if (this.vNnNuuvVn()) {
               var3 = uUuvNUN;
               var4 = vnvUUNNVvU;
            }

            if (this.NVuNUuVnVUN.uUnuvNvvNU()) {
               this.UuUVuuUu(var1, uUuvNUN, vnvUUNNVvU);
            }

            if (var2) {
               if (this.nNvNUVU.uUnuvNvvNU() != -1 && uVNuNUVvn.C00OOC00oO(this.nNvNUVU.uUnuvNvvNU())) {
                  double var5 = class_3532.method_16436(var1.vVvUvVVuuNvV(), uUnuvNvvNU.field_1724.field_6038, uUnuvNvvNU.field_1724.method_23317());
                  double var7 = class_3532.method_16436(var1.vVvUvVVuuNvV(), uUnuvNvvNU.field_1724.field_5971, uUnuvNvvNU.field_1724.method_23318());
                  double var9 = class_3532.method_16436(var1.vVvUvVVuuNvV(), uUnuvNvvNU.field_1724.field_5989, uUnuvNvvNU.field_1724.method_23321());
                  double var11 = 3.0;
                  double var13 = 1.0;
                  boolean var15 = this.UuUVuuUu(var5, var7, var9, var11, var13);
                  int var16 = var15 ? VnVnuUn.uNNnnnuuuN(new Color(255, 50, 50).getRGB(), 10) : VnVnuUn.uNNnnnuuuN(new Color(50, 150, 255).getRGB(), 255);
                  int var17 = var15 ? new Color(255, 0, 0).getRGB() : new Color(0, 100, 255).getRGB();
                  class_4598 var18 = nNNnNvVVv.UuUVuuUu();

                  try {
                     class_243 var19 = uUnuvNvvNU.field_1773.method_19418().method_19326();
                     Matrix4f var20 = var1.uUnuvNvvNU().method_23760().method_23761();
                     class_4588 var21 = var18.getBuffer(var3);
                     UuUvVUUnNuu.C00OOC00oO(
                        var21,
                        var20,
                        (float)(var5 - var19.field_1352),
                        (float)(var7 - var19.field_1351),
                        (float)(var9 - var19.field_1350),
                        (float)var11,
                        (float)var13,
                        var16,
                        40
                     );
                     class_4588 var22 = var18.getBuffer(var4);
                     UuUvVUUnNuu.UuUVuuUu(
                        var22,
                        var20,
                        (float)(var5 - var19.field_1352),
                        (float)(var7 - 0.005F - var19.field_1351),
                        (float)(var9 - var19.field_1350),
                        (float)var11 + 0.005F,
                        (float)var13 + 0.01F,
                        var17,
                        40
                     );
                  } finally {
                     nNNnNvVVv.C00OOC00oO();
                  }
               }

               this.UuUVuuUu(this.UvUvUNuvNU, 2.0, 3.0, var1, var3, var4);
               this.UuUVuuUu(this.UnUNuUU, 4.0, 2.0, var1, var3, var4);
               this.UuUVuuUu(this.uUVuVvuNUvnu, 2.0, 2.0, var1, var3, var4);
               this.UuUVuuUu(this.c0oOOCcCoC0, 2.0, 2.0, var1, var3, var4);
               this.UuUVuuUu(this.NnUuNNU, 2.0, 2.0, var1, var3, var4);
            }
         }
      }
   }

   private void UuUVuuUu(VvuuvuVVvvn var1, class_1921 var2, class_1921 var3) {
      if (uUnuvNvvNU.field_1687 == null || !(uUnuvNvvNU.field_1765 instanceof class_3965 var4 && var4.method_17783() == class_240.field_1332)) {
         this.unNuVNVUnV = null;
      } else if (!this.UuUVuuUu(uUnuvNvvNU.field_1724.method_6047())) {
         this.unNuVNVUnV = null;
      } else {
         class_2338 var26 = var4.method_17777();
         if (uUnuvNvvNU.field_1687.method_8320(var26).method_26215()) {
            this.unNuVNVUnV = null;
         } else {
            ServerHelper.uunvUUVnuNn var6 = this.UuUVuuUu(var26, var4.method_17780());
            ServerHelper.uunvUUVnuNn var7 = this.unNuVNVUnV == null ? var6 : this.unNuVNVUnV.lerp(var6, 0.28);
            this.unNuVNVUnV = var7;
            int var8 = new Color(40, 220, 170).getRGB();
            int var9 = VnVnuUn.uNNnnnuuuN(var8, 80);
            int var10 = VnVnuUn.uNNnnnuuuN(var8, 8);
            int var11 = new Color(40, 255, 180, 235).getRGB();
            class_4598 var12 = nNNnNvVVv.UuUVuuUu();

            try {
               class_243 var13 = uUnuvNvvNU.field_1773.method_19418().method_19326();
               Matrix4f var14 = var1.uUnuvNvvNU().method_23760().method_23761();
               float var15 = (float)(var7.minX - var13.field_1352);
               float var16 = (float)(var7.minY - var13.field_1351);
               float var17 = (float)(var7.minZ - var13.field_1350);
               float var18 = (float)(var7.maxX - var13.field_1352);
               float var19 = (float)(var7.maxY - var13.field_1351);
               float var20 = (float)(var7.maxZ - var13.field_1350);
               class_4588 var21 = var12.getBuffer(var2);
               UuUvVUUnNuu.UuUVuuUu(var21, var14, var15, var16, var17, var18, var19, var20, var9, var10);
               class_4588 var22 = var12.getBuffer(var3);
               UuUvVUUnNuu.C00OOC00oO(var22, var14, var15 - 0.008F, var16 - 0.008F, var17 - 0.008F, var18 + 0.008F, var19 + 0.008F, var20 + 0.008F, var11);
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private ServerHelper.uunvUUVnuNn UuUVuuUu(class_2338 var1, class_2350 var2) {
      return switch (var2) {
         case field_11034 -> new ServerHelper.uunvUUVnuNn(
            var1.method_10263() - 4,
            var1.method_10264() - 4,
            var1.method_10260() - 4,
            var1.method_10263() + 1,
            var1.method_10264() + 5,
            var1.method_10260() + 5
         );
         case field_11039 -> new ServerHelper.uunvUUVnuNn(
            var1.method_10263(), var1.method_10264() - 4, var1.method_10260() - 4, var1.method_10263() + 5, var1.method_10264() + 5, var1.method_10260() + 5
         );
         case field_11036 -> new ServerHelper.uunvUUVnuNn(
            var1.method_10263() - 4,
            var1.method_10264() - 4,
            var1.method_10260() - 4,
            var1.method_10263() + 5,
            var1.method_10264() + 1,
            var1.method_10260() + 5
         );
         case field_11033 -> new ServerHelper.uunvUUVnuNn(
            var1.method_10263() - 4, var1.method_10264(), var1.method_10260() - 4, var1.method_10263() + 5, var1.method_10264() + 5, var1.method_10260() + 5
         );
         case field_11035 -> new ServerHelper.uunvUUVnuNn(
            var1.method_10263() - 4,
            var1.method_10264() - 4,
            var1.method_10260() - 4,
            var1.method_10263() + 5,
            var1.method_10264() + 5,
            var1.method_10260() + 1
         );
         case field_11043 -> new ServerHelper.uunvUUVnuNn(
            var1.method_10263() - 4, var1.method_10264() - 4, var1.method_10260(), var1.method_10263() + 5, var1.method_10264() + 5, var1.method_10260() + 5
         );
         default -> throw new MatchException(null, null);
      };
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1 == null || var1.method_7960() || !var1.method_31574(class_1802.field_22024)) {
         return false;
      } else if (vnVVvun.NUVvUUVuVNVv(var1)) {
         return true;
      } else {
         StringBuilder var2 = new StringBuilder(var1.method_7964().getString());
         class_9290 var3 = (class_9290)var1.method_58694(class_9334.field_49632);
         if (var3 != null) {
            for (class_2561 var5 : var3.comp_2400()) {
               var2.append(' ').append(var5.getString());
            }
         }

         String var6 = var2.toString().replaceAll("§.", "").replace('ё', 'е').replace('Ё', 'Е').toLowerCase(Locale.ROOT);
         return var6.contains("мега-бульдозер") || var6.contains("мега бульдозер");
      }
   }

   private boolean UuUVuuUu(double var1, double var3, double var5, double var7, double var9) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_238 var11 = new class_238(var1 - var7, var3, var5 - var7, var1 + var7, var3 + var9, var5 + var7);

         for (class_1657 var13 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var13 != uUnuvNvvNU.field_1724 && var13.method_5829().method_994(var11)) {
               return true;
            }
         }

         return false;
      }
   }

   private void UuUVuuUu(uVNuNUVvn var1, double var2, double var4, VvuuvuVVvvn var6, class_1921 var7, class_1921 var8) {
      if (var1.uUnuvNvvNU() != -1 && uVNuNUVvn.C00OOC00oO(var1.uUnuvNvvNU())) {
         this.UuUVuuUu(var6, var2, var4, var7, var8);
      }
   }

   private boolean vNnNuuvVn() {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1773 != null) {
         class_243 var1 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         class_2338 var2 = class_2338.method_49638(var1);
         class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var2);
         return !var3.method_26220(uUnuvNvvNU.field_1687, var2).method_1110();
      } else {
         return false;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(VvuuvuVVvvn var1, double var2, double var4, class_1921 var6, class_1921 var7) {
      double var8 = class_3532.method_16436(var1.vVvUvVVuuNvV(), uUnuvNvvNU.field_1724.field_6038, uUnuvNvvNU.field_1724.method_23317());
      double var10 = class_3532.method_16436(var1.vVvUvVVuuNvV(), uUnuvNvvNU.field_1724.field_5971, uUnuvNvvNU.field_1724.method_23318());
      double var12 = class_3532.method_16436(var1.vVvUvVVuuNvV(), uUnuvNvvNU.field_1724.field_5989, uUnuvNvvNU.field_1724.method_23321());
      boolean var14 = this.UuUVuuUu(var8, var10, var12, var2, var4);
      int var15 = var14 ? new Color(255, 30, 30).getRGB() : new Color(0, 130, 255).getRGB();
      int var16 = VnVnuUn.uNNnnnuuuN(var15, 60);
      int var17 = VnVnuUn.uNNnnnuuuN(var15, 0);
      int var18 = var14 ? new Color(255, 0, 0, 255).getRGB() : new Color(0, 150, 255, 255).getRGB();
      class_4598 var19 = nNNnNvVVv.UuUVuuUu();
      boolean var32 = false /* VF: Semaphore variable */;

      try {
         var32 = true;
         class_243 var20 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         Matrix4f var21 = var1.uUnuvNvvNU().method_23760().method_23761();
         float var22 = (float)(var8 - var2 - var20.field_1352);
         float var23 = (float)(var10 - var20.field_1351);
         float var24 = (float)(var12 - var2 - var20.field_1350);
         float var25 = (float)(var8 + var2 - var20.field_1352);
         float var26 = (float)(var10 + var4 - var20.field_1351);
         float var27 = (float)(var12 + var2 - var20.field_1350);
         class_4588 var28 = var19.getBuffer(var6);
         UuUvVUUnNuu.UuUVuuUu(var28, var21, var22, var23, var24, var25, var26, var27, var16, var17);
         class_4588 var29 = var19.getBuffer(var7);
         UuUvVUUnNuu.C00OOC00oO(var29, var21, var22 - 0.005F, var23 - 0.005F, var24 - 0.005F, var25 + 0.005F, var26 + 0.005F, var27 + 0.005F, var18);
         var32 = false;
      } finally {
         if (var32) {
            nNNnNvVVv.C00OOC00oO();
         }
      }

      nNNnNvVVv.C00OOC00oO();
   }

   public String UuUVuuUu(int var1, String var2) {
      if (var1 == -1 || var1 == 0) {
         return "-";
      } else if (var1 <= -100 && var1 >= -110) {
         int var5 = -(var1 + 100);

         return switch (var5) {
            case 0 -> "LMB";
            case 1 -> "RMB";
            case 2 -> "MMB";
            default -> "M" + (var5 + 1);
         };
      } else if (var2 != null && !var2.isEmpty() && !var2.equals("Неизвестно")) {
         String var3 = var2.toUpperCase();
         var3 = var3.replace("KEY.KEYBOARD.", "")
            .replace("KEY.MOUSE.", "M")
            .replace("MOUSE ", "M")
            .replace("MOUSE", "M")
            .replace("BUTTON ", "M")
            .replace("BUTTON", "M")
            .replace("LEFT.SHIFT", "LSHIFT")
            .replace("LEFT SHIFT", "LSHIFT")
            .replace("RIGHT.SHIFT", "RSHIFT")
            .replace("RIGHT SHIFT", "RSHIFT")
            .replace("LEFT.ALT", "LALT")
            .replace("LEFT ALT", "LALT")
            .replace("RIGHT.ALT", "RALT")
            .replace("RIGHT ALT", "RALT")
            .replace("LEFT.CONTROL", "LCTRL")
            .replace("LEFT CONTROL", "LCTRL")
            .replace("RIGHT.CONTROL", "RCTRL")
            .replace("RIGHT CONTROL", "RCTRL")
            .replace("CONTROL", "CTRL")
            .replace("NUMPAD.", "N")
            .replace("NUMPAD ", "N")
            .replace("NUMPAD", "N")
            .replace("SPACE", "SPC")
            .replace("ПРОБЕЛ", "SPC")
            .replace("LEFT ", "L")
            .replace("RIGHT ", "R")
            .replace("ЛЕВАЯ ", "L")
            .replace("ПРАВАЯ ", "R")
            .replace("КНОПКА МЫШИ", "MB");
         if (var3.equals("M1") || var3.equals("LMB") || var3.equals("LEFT")) {
            return "LMB";
         } else if (var3.equals("M2") || var3.equals("RMB") || var3.equals("RIGHT")) {
            return "RMB";
         } else {
            return !var3.equals("M3") && !var3.equals("MMB") && !var3.equals("MIDDLE") ? var3 : "MMB";
         }
      } else {
         return String.valueOf(var1);
      }
   }

   private void VUuuVUnun() {
      if (this.vNnNuuvVn.uUnuvNvvNU() && this.uVunuUNVVUUV.C00OOC00oO("FunTime")) {
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
            long var1 = System.currentTimeMillis();
            this.UuUVuuUu(var1);
            this.vVVuuVVv();
            int var3 = this.VuunNUUUvu();
            if (this.VuNNvnVVUUn > 0 && var3 < this.VuNNvnVVUUn) {
               this.UuUVuuUu(uUnuvNvvNU.field_1724.method_19538(), ServerHelper.nUVVnVNu.TRAPKA, 15000L);
            }

            this.VuNNvnVVUUn = var3;

            for (int var4 = this.uvNnUuvvNU.size() - 1; var4 >= 0; var4--) {
               ServerHelper.nUNvUnnVN var5 = this.uvNnUuvvNU.get(var4);
               long var6 = var1 - var5.C00OOC00oO;
               if (var5.uNNnnnuuuN && var6 >= 500L) {
                  if (this.UuUVuuUu(var5.UuUVuuUu, class_2246.field_22108, 5, 9, 5)) {
                     var5.uUnuvNvvNU = ServerHelper.nUVVnVNu.DRAGON_PLAST;
                     var5.vVvUvVVuuNvV = 30000L;
                     var5.uNNnnnuuuN = false;
                  } else {
                     var5.uUnuvNvvNU = ServerHelper.nUVVnVNu.PLAST;
                     var5.uNNnnnuuuN = false;
                     var5.VVuuUN = true;
                     this.uUnuvNvvNU(var5);
                  }
               } else if (var5.vNUvnnVnUvu) {
                  if (var6 <= 450L) {
                     this.UuUVuuUu(var5);
                  } else {
                     var5.vNUvnnVnUvu = false;
                  }
               } else if (var5.VVuuUN) {
                  if (var6 <= 450L) {
                     this.uUnuvNvvNU(var5);
                  } else {
                     var5.VVuuUN = false;
                  }
               } else if (var5.nuUnNvnuUu) {
                  if (var6 <= 350L) {
                     this.uNNnnnuuuN(var5);
                  } else {
                     var5.nuUnNvnuUu = false;
                  }
               }

               if (var6 > var5.vVvUvVVuuNvV) {
                  this.uvNnUuvvNU.remove(var4);
               }
            }
         }
      } else {
         if (!this.uvNnUuvvNU.isEmpty()) {
            this.uvNnUuvvNU.clear();
         }

         if (!this.UuUUvvVunV.isEmpty()) {
            this.UuUUvvVunV.clear();
         }

         this.VuNNvnVVUUn = -1;
      }
   }

   private void UuUVuuUu(class_2767 var1) {
      if (this.vNnNuuvVn.uUnuvNvvNU() && this.uVunuUNVVUUV.C00OOC00oO("FunTime") && uUnuvNvvNU.field_1687 != null) {
         String var2 = ((class_3414)var1.method_11894().comp_349()).comp_3319().method_12832();
         float var3 = var1.method_11892();
         float var4 = var1.method_11891();
         double var5 = var1.method_11890();
         double var7 = var1.method_11889();
         double var9 = var1.method_11893();
         if (this.VuunNUUUvu.uUnuvNvvNU()) {
            vVnvuVVUunuv.UuUVuuUu(String.format(Locale.US, "§e%s§7 pitch=§f%.2f§7 vol=§f%.2f§7 @ §f%.0f %.0f %.0f", var2, var3, var4, var5, var7, var9));
         }

         this.UuUUvvVunV.add(new ServerHelper.VUnuUnnuNvVu(var2, var3, var4, var5, var7, var9, System.currentTimeMillis()));

         while (this.UuUUvvVunV.size() > 128) {
            this.UuUUvvVunV.pollFirst();
         }
      }
   }

   private void UuUVuuUu(long var1) {
      if (!this.UuUUvvVunV.isEmpty()) {
         for (ServerHelper.nvUnvV var6 : uuuvuUUNVVUN) {
            this.UuUVuuUu(var6);
         }

         for (ServerHelper.VUnuUnnuNvVu var8 : this.UuUUvvVunV) {
            if (!var8.vNUvnnVnUvu && var1 - var8.VVuuUN >= 180L) {
               this.UuUVuuUu(var8);
               var8.vNUvnnVnUvu = true;
            }
         }

         this.UuUUvvVunV.removeIf(var2 -> var1 - var2.VVuuUN > 1500L);
      }
   }

   private void UuUVuuUu(ServerHelper.nvUnvV var1) {
      for (ServerHelper.VUnuUnnuNvVu var3 : this.UuUUvvVunV) {
         if (!var3.vNUvnnVnUvu && var1.UuUVuuUu(var3)) {
            ServerHelper.VUnuUnnuNvVu[] var4 = new ServerHelper.VUnuUnnuNvVu[var1.vVvUvVVuuNvV.length];
            boolean var5 = true;

            for (int var6 = 0; var6 < var1.vVvUvVVuuNvV.length; var6++) {
               ServerHelper.VUnuUnnuNvVu var7 = null;

               for (ServerHelper.VUnuUnnuNvVu var9 : this.UuUUvvVunV) {
                  if (!var9.vNUvnnVnUvu && !UuUVuuUu(var4, var9) && var1.vVvUvVVuuNvV[var6].UuUVuuUu(var9) && Math.abs(var9.VVuuUN - var3.VVuuUN) <= 250L) {
                     double var10 = var9.vVvUvVVuuNvV - var3.vVvUvVVuuNvV;
                     double var12 = var9.uNNnnnuuuN - var3.uNNnnnuuuN;
                     double var14 = var9.nuUnNvnuUu - var3.nuUnNvnuUu;
                     if (!(var10 * var10 + var12 * var12 + var14 * var14 > 16.0)) {
                        var7 = var9;
                        break;
                     }
                  }
               }

               if (var7 == null) {
                  var5 = false;
                  break;
               }

               var4[var6] = var7;
            }

            if (var5) {
               for (ServerHelper.VUnuUnnuNvVu var19 : var4) {
                  var19.vNUvnnVnUvu = true;
               }

               this.UuUVuuUu(new class_243(var3.vVvUvVVuuNvV, var3.uNNnnnuuuN, var3.nuUnNvnuUu), var1);
            }
         }
      }
   }

   private static boolean UuUVuuUu(ServerHelper.VUnuUnnuNvVu[] var0, ServerHelper.VUnuUnnuNvVu var1) {
      for (ServerHelper.VUnuUnnuNvVu var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   private void UuUVuuUu(class_243 var1, ServerHelper.nvUnvV var2) {
      if (!this.vVvUvVVuuNvV(var1)) {
         ServerHelper.nUNvUnnVN var3 = new ServerHelper.nUNvUnnVN(var1, System.currentTimeMillis(), ServerHelper.nUVVnVNu.TRAPKA, var2.C00OOC00oO);
         var3.uVUuuVnNVU = var2;
         var3.vNUvnnVnUvu = true;
         this.uvNnUuvvNU.add(var3);
         this.UuUVuuUu(var3);
      }
   }

   private void UuUVuuUu(ServerHelper.nUNvUnnVN var1) {
      int var2 = this.C00OOC00oO(var1);
      if (var2 != 0) {
         var1.vNUvnnVnUvu = false;
         if (var2 == 1) {
            var1.uUnuvNvvNU = ServerHelper.nUVVnVNu.TRAPKA;
            var1.vVvUvVVuuNvV = var1.uVUuuVnNVU.C00OOC00oO;
            var1.vuuuNvNuv = null;
         } else {
            var1.uUnuvNvvNU = ServerHelper.nUVVnVNu.PLAST;
            var1.vVvUvVVuuNvV = var1.uVUuuVnNVU.uUnuvNvvNU > 0L ? var1.uVUuuVnNVU.uUnuvNvvNU : (var2 == 3 ? 60000L : 20000L);
         }
      }
   }

   private int C00OOC00oO(ServerHelper.nUNvUnnVN var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return 0;
      } else {
         int var2 = class_3532.method_15357(var1.UuUVuuUu.field_1352);
         int var3 = class_3532.method_15357(var1.UuUVuuUu.field_1351);
         int var4 = class_3532.method_15357(var1.UuUVuuUu.field_1350);
         class_2339 var5 = new class_2339();
         long var6 = Long.MIN_VALUE;
         double var8 = Double.MAX_VALUE;

         for (int var10 = -2; var10 <= 2; var10++) {
            for (int var11 = -2; var11 <= 2; var11++) {
               for (int var12 = -2; var12 <= 2; var12++) {
                  var5.method_10103(var2 + var10, var3 + var11, var4 + var12);
                  if (this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var5), var5)) {
                     double var13 = var10 * var10 + var11 * var11 + var12 * var12;
                     if (var13 < var8) {
                        var8 = var13;
                        var6 = var5.method_10063();
                     }
                  }
               }
            }
         }

         if (var6 == Long.MIN_VALUE) {
            return 0;
         } else {
            short var32 = 9000;
            byte var33 = 18;
            ArrayDeque var34 = new ArrayDeque();
            HashSet var35 = new HashSet();
            var34.add(var6);
            var35.add(var6);
            int var14 = Integer.MAX_VALUE;
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            int var17 = Integer.MIN_VALUE;
            int var18 = Integer.MIN_VALUE;
            int var19 = Integer.MIN_VALUE;
            int var20 = 0;

            while (!var34.isEmpty() && var35.size() <= var32) {
               long var21 = (Long)var34.poll();
               int var23 = class_2338.method_10061(var21);
               int var24 = class_2338.method_10071(var21);
               int var25 = class_2338.method_10083(var21);
               var20++;
               if (var23 < var14) {
                  var14 = var23;
               }

               if (var23 > var17) {
                  var17 = var23;
               }

               if (var24 < var15) {
                  var15 = var24;
               }

               if (var24 > var18) {
                  var18 = var24;
               }

               if (var25 < var16) {
                  var16 = var25;
               }

               if (var25 > var19) {
                  var19 = var25;
               }

               for (int var26 = 0; var26 < 6; var26++) {
                  int var27 = var23 + coOocCcoOc0[var26][0];
                  int var28 = var24 + coOocCcoOc0[var26][1];
                  int var29 = var25 + coOocCcoOc0[var26][2];
                  if (Math.abs(var27 - var2) <= var33 && Math.abs(var28 - var3) <= var33 && Math.abs(var29 - var4) <= var33) {
                     var5.method_10103(var27, var28, var29);
                     long var30 = var5.method_10063();
                     if (!var35.contains(var30) && this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var5), var5)) {
                        var35.add(var30);
                        var34.add(var30);
                     }
                  }
               }
            }

            if (var20 < 12) {
               return 0;
            } else {
               int var36 = var17 - var14;
               int var22 = var18 - var15;
               int var37 = var19 - var16;
               int var38 = Math.min(var36, Math.min(var22, var37));
               int var39 = Math.max(var36, Math.max(var22, var37));
               if (var38 * 3 > var39) {
                  return 1;
               } else {
                  boolean var40 = var22 <= var36 && var22 <= var37;
                  var1.vuuuNvNuv = new class_243((var14 + var17) / 2.0 + 0.5, (var15 + var18) / 2.0 + 0.5, (var16 + var19) / 2.0 + 0.5);
                  return var40 ? 3 : 2;
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(class_2680 var1, class_2338 var2) {
      return !var1.method_26215() && !vuNunNnvnunv.contains(var1.method_26204()) ? !var1.method_26220(uUnuvNvvNU.field_1687, var2).method_1110() : false;
   }

   private void vVVuuVVv() {
      if (this.NNUUNUuVNNVn.uUnuvNvvNU()) {
         if (uUnuvNvvNU.field_1765 instanceof class_3965 var1 && var1.method_17783() == class_240.field_1332) {
            String var3 = class_7923.field_41175.method_10221(uUnuvNvvNU.field_1687.method_8320(var1.method_17777()).method_26204()).toString();
            if (!var3.equals(this.UnVvNNuNu)) {
               this.UnVvNNuNu = var3;
               vVnvuVVUunuv.UuUVuuUu("§bблок:§f " + var3);
            }
         }
      }
   }

   private void UuUVuuUu(ServerHelper.VUnuUnnuNvVu var1) {
      String var2 = var1.UuUVuuUu;
      float var3 = var1.C00OOC00oO;
      float var4 = var1.uUnuvNvvNU;
      class_243 var5 = new class_243(var1.vVvUvVVuuNvV, var1.uNNnnnuuuN, var1.nuUnNvnuUu);
      if (!this.VUuuVUnun.C00OOC00oO("Спуки тайм")) {
         if (var2.equals("block.anvil.place") && C00OOC00oO(var3, 1.1F) && C00OOC00oO(var4, 0.7F)) {
            this.uUnuvNvvNU(var5);
         } else if (var2.equals("block.piston.extend") && C00OOC00oO(var3, 0.5F) && C00OOC00oO(var4, 0.7F)) {
            this.UuUVuuUu(var5, ServerHelper.nUVVnVNu.TRAPKA, 15000L);
         } else if (var2.equals("entity.ender_dragon.growl") && C00OOC00oO(var3, 1.0F) && C00OOC00oO(var4, 0.2F)) {
            this.UuUVuuUu(var5);
         }
      } else if (var2.equals("block.piston.extend") && C00OOC00oO(var3, 0.5F) && C00OOC00oO(var4, 0.5F)) {
         this.UuUVuuUu(var5, ServerHelper.nUVVnVNu.TRAPKA, 15000L);
      } else if (var2.equals("block.anvil.place") && C00OOC00oO(var3, 0.5F) && C00OOC00oO(var4, 0.5F)) {
         this.C00OOC00oO(var5);
      } else if (var2.equals("entity.ender_dragon.growl") && C00OOC00oO(var3, 0.7F) && C00OOC00oO(var4, 0.5F)) {
         this.UuUVuuUu(var5);
      }
   }

   private void UuUVuuUu(class_243 var1, ServerHelper.nUVVnVNu var2, long var3) {
      if (!this.vVvUvVVuuNvV(var1)) {
         this.uvNnUuvvNU.add(new ServerHelper.nUNvUnnVN(var1, System.currentTimeMillis(), var2, var3));
      }
   }

   private void UuUVuuUu(class_243 var1) {
      if (!this.vVvUvVVuuNvV(var1)) {
         ServerHelper.nUNvUnnVN var2 = new ServerHelper.nUNvUnnVN(var1, System.currentTimeMillis(), ServerHelper.nUVVnVNu.DRAGON_PLAST, 20000L);
         var2.nuUnNvnuUu = true;
         this.uvNnUuvvNU.add(var2);
         this.uNNnnnuuuN(var2);
      }
   }

   private void C00OOC00oO(class_243 var1) {
      if (!this.vVvUvVVuuNvV(var1)) {
         ServerHelper.nUNvUnnVN var2 = new ServerHelper.nUNvUnnVN(var1, System.currentTimeMillis(), ServerHelper.nUVVnVNu.PLAST, 20000L);
         var2.uNNnnnuuuN = true;
         this.uvNnUuvvNU.add(var2);
      }
   }

   private void uUnuvNvvNU(class_243 var1) {
      if (!this.vVvUvVVuuNvV(var1)) {
         ServerHelper.nUNvUnnVN var2 = new ServerHelper.nUNvUnnVN(var1, System.currentTimeMillis(), ServerHelper.nUVVnVNu.PLAST, 20000L);
         var2.VVuuUN = true;
         this.uvNnUuvvNU.add(var2);
         this.uUnuvNvvNU(var2);
      }
   }

   private void uUnuvNvvNU(ServerHelper.nUNvUnnVN var1) {
      int var2 = this.vVvUvVVuuNvV(var1);
      if (var2 > 0) {
         var1.vVvUvVVuuNvV = var2 == 2 ? 60000L : 20000L;
         var1.VVuuUN = false;
      }
   }

   private int vVvUvVVuuNvV(ServerHelper.nUNvUnnVN var1) {
      if (uUnuvNvvNU.field_1687 == null) {
         return 0;
      } else {
         class_243 var2 = var1.UuUVuuUu;
         int var3 = class_3532.method_15357(var2.field_1352);
         int var4 = class_3532.method_15357(var2.field_1351);
         int var5 = class_3532.method_15357(var2.field_1350);
         class_2339 var6 = new class_2339();
         long var7 = Long.MIN_VALUE;
         double var9 = Double.MAX_VALUE;

         for (int var11 = -3; var11 <= 3; var11++) {
            for (int var12 = -3; var12 <= 3; var12++) {
               for (int var13 = -3; var13 <= 3; var13++) {
                  var6.method_10103(var3 + var11, var4 + var12, var5 + var13);
                  if (this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var6))) {
                     double var14 = var11 * var11 + var12 * var12 + var13 * var13;
                     if (var14 < var9) {
                        var9 = var14;
                        var7 = var6.method_10063();
                     }
                  }
               }
            }
         }

         if (var7 == Long.MIN_VALUE) {
            return 0;
         } else {
            short var33 = 6000;
            byte var34 = 16;
            ArrayDeque var35 = new ArrayDeque();
            HashSet var36 = new HashSet();
            var35.add(var7);
            var36.add(var7);
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            int var17 = Integer.MAX_VALUE;
            int var18 = Integer.MIN_VALUE;
            int var19 = Integer.MIN_VALUE;
            int var20 = Integer.MIN_VALUE;
            int var21 = 0;

            while (!var35.isEmpty() && var36.size() <= var33) {
               long var22 = (Long)var35.poll();
               int var24 = class_2338.method_10061(var22);
               int var25 = class_2338.method_10071(var22);
               int var26 = class_2338.method_10083(var22);
               var6.method_10103(var24, var25, var26);
               if (uUnuvNvvNU.field_1687.method_8320(var6).method_27852(class_2246.field_10614)) {
                  var21++;
                  if (var24 < var15) {
                     var15 = var24;
                  }

                  if (var24 > var18) {
                     var18 = var24;
                  }

                  if (var25 < var16) {
                     var16 = var25;
                  }

                  if (var25 > var19) {
                     var19 = var25;
                  }

                  if (var26 < var17) {
                     var17 = var26;
                  }

                  if (var26 > var20) {
                     var20 = var26;
                  }
               }

               for (int var27 = 0; var27 < 6; var27++) {
                  int var28 = var24 + coOocCcoOc0[var27][0];
                  int var29 = var25 + coOocCcoOc0[var27][1];
                  int var30 = var26 + coOocCcoOc0[var27][2];
                  if (Math.abs(var28 - var3) <= var34 && Math.abs(var29 - var4) <= var34 && Math.abs(var30 - var5) <= var34) {
                     var6.method_10103(var28, var29, var30);
                     long var31 = var6.method_10063();
                     if (!var36.contains(var31) && this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var6))) {
                        var36.add(var31);
                        var35.add(var31);
                     }
                  }
               }
            }

            if (var21 < 3) {
               return 0;
            } else {
               var1.vuuuNvNuv = new class_243((var15 + var18) / 2.0 + 0.5, (var16 + var19) / 2.0 + 0.5, (var17 + var20) / 2.0 + 0.5);
               int var37 = var18 - var15;
               int var23 = var19 - var16;
               int var38 = var20 - var17;
               boolean var39 = var23 < var37 && var23 < var38;
               return var39 ? 2 : 1;
            }
         }
      }
   }

   private boolean UuUVuuUu(class_2680 var1) {
      return var1.method_27852(class_2246.field_10445) || var1.method_27852(class_2246.field_10115) || var1.method_27852(class_2246.field_10614);
   }

   private boolean vVvUvVVuuNvV(class_243 var1) {
      long var2 = System.currentTimeMillis();

      for (ServerHelper.nUNvUnnVN var5 : this.uvNnUuvvNU) {
         if (var2 - var5.C00OOC00oO <= 500L && var5.UuUVuuUu.method_1025(var1) <= 2.25) {
            return true;
         }
      }

      return false;
   }

   private void uNNnnnuuuN(ServerHelper.nUNvUnnVN var1) {
      if (uUnuvNvvNU.field_1687 != null) {
         if (this.UuUVuuUu(var1.UuUVuuUu, class_2246.field_23152, 6, 3, 6)) {
            var1.uUnuvNvvNU = ServerHelper.nUVVnVNu.DRAGON_TRAP;
            var1.vVvUvVVuuNvV = 30000L;
            var1.nuUnNvnuUu = false;
         }
      }
   }

   private boolean UuUVuuUu(class_243 var1, class_2248 var2, int var3, int var4, int var5) {
      if (uUnuvNvvNU.field_1687 == null) {
         return false;
      } else {
         class_2339 var6 = new class_2339();
         int var7 = class_3532.method_15357(var1.field_1352);
         int var8 = class_3532.method_15357(var1.field_1351);
         int var9 = class_3532.method_15357(var1.field_1350);

         for (int var10 = -var3; var10 <= var3; var10++) {
            for (int var11 = -var5; var11 <= var5; var11++) {
               for (int var12 = -var4; var12 <= var4; var12++) {
                  var6.method_10103(var7 + var10, var8 + var12, var9 + var11);
                  if (uUnuvNvvNU.field_1687.method_8320(var6).method_27852(var2)) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private int VuunNUUUvu() {
      if (uUnuvNvvNU.field_1724 == null) {
         return 0;
      } else {
         int var1 = 0;
         class_1661 var2 = uUnuvNvvNU.field_1724.method_31548();
         int var3 = var2.method_5439();

         for (int var4 = 0; var4 < var3; var4++) {
            class_1799 var5 = var2.method_5438(var4);
            if (var5.method_31574(class_1802.field_22026)) {
               var1 += var5.method_7947();
            }
         }

         return var1;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         UnVNvNnU var2 = var1.vVvUvVVuuNvV();
         if (var2 != null) {
            if (this.vunuUUVVUv && this.uVunuUNVVUUV.C00OOC00oO("FunTime")) {
               this.UuUVuuUu(var2, var1.vNUvnnVnUvu(), var1.nuUnNvnuUu(), var1.VVuuUN());
            }

            if (this.vNnNuuvVn.uUnuvNvvNU() && this.uVunuUNVVUUV.C00OOC00oO("FunTime") && uUnuvNvvNU.field_1773 != null) {
               boolean var3 = this.vVVuuVVv.uUnuvNvvNU();
               if (!this.uvNnUuvvNU.isEmpty() || var3) {
                  var2.UuUVuuUu(20.0F);
                  if (var3) {
                     this.UuUVuuUu(var2, var1.nuUnNvnuUu(), var1.VVuuUN());
                  }

                  long var4 = System.currentTimeMillis();
                  class_243 var6 = uUnuvNvvNU.field_1773.method_19418().method_19326();

                  for (ServerHelper.nUNvUnnVN var8 : this.uvNnUuvvNU) {
                     long var9 = var8.vVvUvVVuuNvV - (var4 - var8.C00OOC00oO);
                     if (var9 > 0L) {
                        boolean var11 = var8.uUnuvNvvNU == ServerHelper.nUVVnVNu.PLAST && var8.vuuuNvNuv != null;
                        class_243 var12 = var11
                           ? var8.vuuuNvNuv
                           : new class_243(var8.UuUVuuUu.field_1352, var8.UuUVuuUu.field_1351 + 1.4, var8.UuUVuuUu.field_1350);
                        double var13 = var6.method_1022(var12);
                        if (!(var13 > 110.0)) {
                           class_243 var15 = VnNnNnvuvn.UuUVuuUu(var12);
                           if (var15 != null && !(var15.field_1350 <= 0.001) && !(var15.field_1350 > 1.0)) {
                              float var16 = (float)class_3532.method_15350(1.0 - (var13 - 6.0) / 390.0, 0.667, 1.033);
                              float var17 = class_3532.method_15363((float)var9 / (float)var8.vVvUvVVuuNvV, 0.0F, 1.0F);
                              this.UuUVuuUu(var2, (float)var15.field_1352, (float)var15.field_1351, var16, var8.uUnuvNvvNU, var9, var17, var11);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, int var3, int var4) {
      this.UvnvNVnnnnNU();
      this.NNUUNUuVNNVn();
      this.uuuNUnuvvNNv = this.UuUVuuUu(this.NvNUuuuvUvu, this.nNVVUnuVVVuV, var3, var4);
      this.ccOO0COcoco0();
      if (this.unUVnu != 0) {
         var1.UuUVuuUu(7.0F);
         float var5 = var3 * 0.5F;
         float var6 = var4 * 0.5F;

         for (int var7 = 0; var7 < this.unUVnu; var7++) {
            int var8 = this.NVNnnvVnvV[var7];
            ServerHelper.nvnNNunvv var9 = this.UuUVuuUu(var7, this.unUVnu, var3, var4);
            float var10 = this.nuUnNvnuUu(var7);
            float var11 = var9.size() * (0.86F + var10 * 0.14F + this.NNVNuUvVn[var8] * 0.035F);
            this.vUNuuvvnVnv[var7] = var10;
            this.unnnNUNnVu[var7] = var11;
            this.NvnnUUuVvNU[var7] = class_3532.method_16439(var10, var5, var9.centerX()) - var11 * 0.5F;
            this.vVvuUVnV[var7] = class_3532.method_16439(var10, var6, var9.centerY()) - var11 * 0.5F;
         }

         for (int var19 = 0; var19 < this.unUVnu; var19++) {
            int var22 = this.NVNnnvVnvV[var19];
            boolean var25 = this.uuuNUnuvvNNv == var22;
            boolean var28 = this.uVvunVUNuUvu[var22];
            float var31 = this.vUNuuvvnVnv[var19];
            float var12 = this.unnnNUNnVu[var19];
            float var13 = this.NvnnUUuVvNU[var19];
            float var14 = this.vVvuUVnV[var19];
            float var15 = Math.max(8.0F, var12 * 0.16F);
            int var16 = var28
               ? VnVnuUn.uUnuvNvvNU(26, 44, 78, var25 ? 180 : 138)
               : (var25 ? VnVnuUn.uUnuvNvvNU(70, 66, 28, 168) : VnVnuUn.uUnuvNvvNU(24, 26, 32, 132));
            int var17 = var28
               ? VnVnuUn.uUnuvNvvNU(14, 22, 42, var25 ? 170 : 122)
               : (var25 ? VnVnuUn.uUnuvNvvNU(34, 34, 22, 156) : VnVnuUn.uUnuvNvvNU(12, 14, 18, 118));
            int var18 = var28
               ? VnVnuUn.uUnuvNvvNU(110, 175, 255, var25 ? 230 : 190)
               : (var25 ? VnVnuUn.uUnuvNvvNU(255, 245, 110, 215) : VnVnuUn.uUnuvNvvNU(255, 255, 255, 115));
            var1.uNNnnnuuuN(var31);
            var1.UuUVuuUu(
               var13,
               var14,
               var12,
               var12,
               var15,
               var25 ? 10.0F : 6.0F,
               1.5F,
               var28 ? VnVnuUn.uUnuvNvvNU(60, 130, 255, var25 ? 70 : 45) : VnVnuUn.uUnuvNvvNU(0, 0, 0, var25 ? 90 : 60)
            );
            this.UuUVuuUu(var1, var13, var14, var12, var15, var16, var17, var18, var25 ? 23.0F : 60.0F, var28 ? 2.4F : (var25 ? 2.0F : 1.25F));
            var1.vuuuNvNuv();
         }

         var1.uUnuvNvvNU();

         for (int var20 = 0; var20 < this.unUVnu; var20++) {
            int var23 = this.NVNnnvVnvV[var20];
            class_1799 var26 = this.vuNnuUnu[var23];
            float var29 = this.vUNuuvvnVnv[var20];
            if (!var26.method_7960() && !(var29 <= 0.08F)) {
               float var32 = this.unnnNUNnVu[var20];
               float var34 = var32 / 16.0F * (this.uuuNUnuvvNNv == var23 ? 0.42F : 0.386F);
               float var36 = 16.0F * var34;
               NuNvVUuUUnun.UuUVuuUu(
                  var2, var26, this.NvnnUUuVvNU[var20] + (var32 - var36) * 0.5F, this.vVvuUVnV[var20] + (var32 - var36) * 0.5F, var34, var23, false
               );
            }
         }

         for (int var21 = 0; var21 < this.unUVnu; var21++) {
            int var24 = this.NVNnnvVnvV[var21];
            int var27 = this.uuvvuNvuUNVV[var24];
            float var30 = this.vUNuuvvnVnv[var21];
            if (var27 > 1 && !(var30 <= 0.25F)) {
               float var33 = this.unnnNUNnVu[var21];
               float var35 = Math.max(12.0F, var33 * 0.22F);
               String var37 = String.valueOf(var27);
               float var38 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var37, var35);
               float var39 = this.NvnnUUuVvNU[var21] + var33 - var38 - var33 * 0.12F;
               float var40 = this.vVvuUVnV[var21] + var33 - var33 * 0.13F;
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var39 + 1.0F, var40 + 1.0F, var35, var37, VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(170.0F * var30)));
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var39, var40, var35, var37, VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(255.0F * var30)));
            }
         }

         var1.uUnuvNvvNU();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, float var9, float var10) {
      nunvNNUnvU.UuUVuuUu(var1, var2, var3, var4, var4, var5, () -> {
         var1.UuUVuuUu(var2, var3, var4, var4, var5, var9);
         var1.C00OOC00oO(var2, var3, var4, var4, 0.0F, var6, var7);
      });
      var1.UuUVuuUu(var2, var3, var4, var4, var5, var8, var10);
   }

   private int UuUVuuUu(float var1, float var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.unUVnu; var5++) {
         ServerHelper.nvnNNunvv var6 = this.UuUVuuUu(var5, this.unUVnu, var3, var4);
         float var7 = var6.size() * 0.12F;
         if (nunvNNUnvU.UuUVuuUu(var1, var2, var6.x() - var7, var6.y() - var7, var6.size() + var7 * 2.0F, var6.size() + var7 * 2.0F)) {
            return this.NVNnnvVnvV[var5];
         }
      }

      return this.C00OOC00oO(var1, var2, var3, var4);
   }

   private int C00OOC00oO(float var1, float var2, int var3, int var4) {
      if (this.unUVnu == 0) {
         return -1;
      } else {
         float var5 = var1 - this.vnVuunuNN;
         float var6 = var2 - this.UvUNuNvvNVNv;
         float var7 = class_3532.method_15363(Math.min(var3, var4) * 0.035F, 18.0F, 38.0F);
         float var8 = var5 * var5 + var6 * var6;
         if (var8 < var7 * var7) {
            return -1;
         } else {
            float var9 = 1.0F / (float)Math.sqrt(var8);
            float var10 = var5 * var9;
            float var11 = var6 * var9;
            float var12 = (float)Math.cos(Math.min(Math.PI / this.unUVnu, 1.319468914507713));
            float var13 = -2.0F;
            int var14 = -1;

            for (int var15 = 0; var15 < this.unUVnu; var15++) {
               double var16 = this.UuUVuuUu(var15, this.unUVnu);
               float var18 = var10 * (float)Math.cos(var16) + var11 * (float)Math.sin(var16);
               if (var18 > var13) {
                  var13 = var18;
                  var14 = this.NVNnnvVnvV[var15];
               }
            }

            return var13 >= var12 ? var14 : -1;
         }
      }
   }

   private void NNUUNUuVNNVn() {
      this.unUVnu = 0;

      for (int var1 = 0; var1 < 7; var1++) {
         this.vuNnuUnu[var1] = class_1799.field_8037;
         this.uuvvuNvuUNVV[var1] = 0;
         this.uVvunVUNuUvu[var1] = false;
      }

      if (uUnuvNvvNU.field_1724 != null) {
         List var9 = this.VvVvnNUnvuvV();
         class_1661 var2 = uUnuvNvvNU.field_1724.method_31548();

         for (int var3 = 0; var3 < 36; var3++) {
            class_1799 var4 = var2.method_5438(var3);
            if (!var4.method_7960()) {
               for (int var5 = 0; var5 < 7; var5++) {
                  if (((Predicate)var9.get(var5)).test(var4)) {
                     this.uuvvuNvuUNVV[var5] = this.uuvvuNvuUNVV[var5] + var4.method_7947();
                     if (this.vuNnuUnu[var5].method_7960()) {
                        this.vuNnuUnu[var5] = var4;
                     }
                     break;
                  }
               }
            }
         }

         for (int var10 = 0; var10 < 36; var10++) {
            class_1799 var12 = var2.method_5438(var10);
            if (var12.method_7909() instanceof class_5537) {
               class_9276 var13 = (class_9276)var12.method_58694(class_9334.field_49650);
               if (var13 != null) {
                  for (int var6 = 0; var6 < var13.method_57426(); var6++) {
                     class_1799 var7 = var13.method_57422(var6);
                     if (!var7.method_7960()) {
                        for (int var8 = 0; var8 < 7; var8++) {
                           if (((Predicate)var9.get(var8)).test(var7)) {
                              this.uuvvuNvuUNVV[var8] = this.uuvvuNvuUNVV[var8] + var7.method_7947();
                              if (this.vuNnuUnu[var8].method_7960()) {
                                 this.vuNnuUnu[var8] = var7;
                                 this.uVvunVUNuUvu[var8] = true;
                              }
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         for (int var11 = 0; var11 < 7; var11++) {
            if (!this.vuNnuUnu[var11].method_7960()) {
               this.NVNnnvVnvV[this.unUVnu++] = var11;
            }
         }
      }
   }

   private List<Predicate<class_1799>> VvVvnNUnvuvV() {
      String var1 = this.UNnVVNvvnVvU.uUnuvNvvNU();
      if (this.nvuUVvuuN.size() == 7 && var1.equals(this.CC0COO)) {
         return this.nvuUVvuuN;
      } else {
         this.nvuUVvuuN.clear();

         for (int var2 = 0; var2 < 7; var2++) {
            ServerHelper.NVnVnNnN var3 = this.C00OOC00oO(var2);
            if (var3 == null) {
               this.nvuUVvuuN.add(var0 -> false);
            } else {
               this.nvuUVvuuN.add(var3.UuUVuuUu);
            }
         }

         this.CC0COO = var1;
         return this.nvuUVvuuN;
      }
   }

   private ServerHelper.nvnNNunvv UuUVuuUu(int var1, int var2, int var3, int var4) {
      float var5 = this.C00OOC00oO(var3, var4);
      float var6 = this.UuUVuuUu(var5, var2, var3, var4);
      double var7 = this.UuUVuuUu(var1, var2);
      float var9 = var3 * 0.5F + (float)Math.cos(var7) * var6 - var5 * 0.5F;
      float var10 = var4 * 0.5F + (float)Math.sin(var7) * var6 - var5 * 0.5F;
      return new ServerHelper.nvnNNunvv(var9, var10, var5);
   }

   private double UuUVuuUu(int var1, int var2) {
      double var3 = var2 == 2 ? Math.PI : -Math.PI / 2;
      return var3 + (Math.PI * 2) * var1 / Math.max(1, var2);
   }

   private float C00OOC00oO(int var1, int var2) {
      return class_3532.method_15363(Math.min(var1, var2) * 0.115F, 64.0F, 104.0F);
   }

   private float UuUVuuUu(float var1, int var2, int var3, int var4) {
      float var5 = class_3532.method_15363(Math.min(var3, var4) * 0.16F, 96.0F, 150.0F);
      return var2 < 2 ? var5 : Math.max(var5, var1 * 1.3F / (2.0F * (float)Math.sin(Math.PI / var2)));
   }

   private void ccOO0COcoco0() {
      long var1 = System.nanoTime();
      float var3 = this.UVUnUvUNU == 0L ? 0.016F : class_3532.method_15363((float)(var1 - this.UVUnUvUNU) / 1.0E9F, 0.001F, 0.05F);
      this.UVUnUvUNU = var1;

      for (int var4 = 0; var4 < 7; var4++) {
         this.NNVNuUvVn[var4] = UuUVuuUu(this.NNVNuUvVn[var4], var4 == this.uuuNUnuvvNNv ? 1.0F : 0.0F, var3, 20.0F);
      }
   }

   private float nuUnNvnuUu(int var1) {
      float var2 = (float)(System.nanoTime() - this.vNnNNNuVVnUv) / 1000000.0F - var1 * 24.0F;
      return UuUVuuUu(class_3532.method_15363(var2 / 135.0F, 0.0F, 1.0F));
   }

   private static float UuUVuuUu(float var0, float var1, float var2, float var3) {
      return var0 + (var1 - var0) * (1.0F - (float)Math.exp(-var3 * var2));
   }

   private static float UuUVuuUu(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private void UuUVuuUu(UnVNvNnU var1, int var2, int var3) {
      long var4 = System.currentTimeMillis();
      float var6 = 0.9F;
      float var7 = 62.0F * var6;
      float var8 = var2 * 0.5F;
      float var9 = var3 * 0.36F;

      for (int var10 = 0; var10 < nvuVnuvUVvVu.length; var10++) {
         ServerHelper.nUVVnVNu var11 = nvuVnuvUVvVu[var10];
         long var12 = UuUVuuUu(var11);
         long var14 = var12 - var4 % var12;
         float var16 = class_3532.method_15363((float)var14 / (float)var12, 0.0F, 1.0F);
         float var17 = var9 + var10 * var7;
         this.UuUVuuUu(var1, var8, var17, var6, var11, var14, var16, false);
      }
   }

   private static long UuUVuuUu(ServerHelper.nUVVnVNu var0) {
      return switch (var0) {
         case TRAPKA -> 15000L;
         case PLAST -> 20000L;
         case DRAGON_TRAP -> 30000L;
         case DRAGON_PLAST -> 20000L;
      };
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, ServerHelper.nUVVnVNu var5, long var6, float var8, boolean var9) {
      nUVnuvUu var10 = vNvnnVvvVUu.vVvUvVVuuNvV;
      float var11 = (float)var6 / 1000.0F;
      String var12 = String.format(Locale.US, "%.1f", var11).replace('.', ',') + " Second";
      float var13 = 26.0F * var4;
      VuuUvnvnuu.nvnNNunvv var14 = UnVNvNnU.UuUVuuUu(var10, var12, var13);
      float var15 = var14.UuUVuuUu;
      float var16 = var14.C00OOC00oO;
      float var17 = 19.0F * var4;
      float var18 = 3.6F * var4;
      float var19 = var17 * 0.5F + 3.2F * var4;
      float var20 = var19 + var18;
      float var21 = var20 * 2.0F;
      float var22 = 8.0F * var4;
      float var23 = 14.0F * var4;
      float var24 = 7.5F * var4;
      float var25 = 9.0F * var4;
      float var26 = Math.max(var21, var16);
      float var27 = var26 + var24 * 2.0F;
      float var28 = var22 + var21 + var25 + var15 + var23;
      float var29 = var2 - var28 * 0.5F;
      float var30 = var9 ? var3 - var27 * 0.5F : var3 - var27 - 5.0F * var4;
      float var31 = class_3532.method_15363((float)var6 / 500.0F, 0.0F, 1.0F);
      var1.uNNnnnuuuN(var31);
      int var32 = C00OOC00oO(var5);
      float var33 = var27 * 0.5F;
      var1.UuUVuuUu(var29, var30, var28, var27, var33, 1.0F);
      var1.UuUVuuUu(var29, var30, var28, var27, var33, VnVnuUn.uUnuvNvvNU(15, 16, 22, 210));
      var1.UuUVuuUu(var29, var30, var28, var27, var33, VnVnuUn.uUnuvNvvNU(255, 255, 255, 28), 1.0F);
      float var34 = var29 + var22 + var20;
      float var35 = var30 + var27 * 0.5F;
      var1.C00OOC00oO(var34, var35, var19, 0.0F, 1.0F, VnVnuUn.uUnuvNvvNU(12, 13, 18, 245));
      int var36 = VnVnuUn.uUnuvNvvNU(VnVnuUn.C00OOC00oO(255, 72, 72), var32, var8);
      int var37 = VnVnuUn.uUnuvNvvNU(255, 255, 255, 40);
      float var38 = (var19 + var20) * 0.5F;
      float var39 = var18 * 0.62F;
      byte var40 = 46;
      int var41 = (int)Math.ceil(var40 * var8);

      for (int var42 = 0; var42 < var40; var42++) {
         double var43 = (-Math.PI / 2) + (double)var42 / var40 * Math.PI * 2.0;
         float var45 = (float)(Math.cos(var43) * var38);
         float var46 = (float)(Math.sin(var43) * var38);
         var1.C00OOC00oO(var34 + var45, var35 + var46, var39, 0.0F, 1.0F, var42 < var41 ? var36 : var37);
      }

      NuNvVUuUUnun.UuUVuuUu(var1, uUnuvNvvNU(var5), var34 - var17 * 0.5F, var35 - var17 * 0.5F, var17 / 16.0F, 0, false, 0);
      float var47 = var29 + var22 + var21 + var25;
      float var48 = var30 + (var27 - var16) * 0.5F + var16 * 0.72F;
      var1.UuUVuuUu(var10, var47 + 1.0F, var48 + 1.0F, var13, var12, VnVnuUn.uUnuvNvvNU(0, 0, 0, 165));
      var1.UuUVuuUu(var10, var47, var48, var13, var12, VnVnuUn.uUnuvNvvNU(242, 244, 250, 255));
      var1.vuuuNvNuv();
   }

   static boolean C00OOC00oO(float var0, float var1) {
      return Math.abs(var0 - var1) < 0.01F;
   }

   private static int C00OOC00oO(ServerHelper.nUVVnVNu var0) {
      return switch (var0) {
         case TRAPKA -> VnVnuUn.C00OOC00oO(255, 150, 60);
         case PLAST -> VnVnuUn.C00OOC00oO(90, 210, 150);
         case DRAGON_TRAP -> VnVnuUn.C00OOC00oO(190, 110, 255);
         case DRAGON_PLAST -> VnVnuUn.C00OOC00oO(225, 120, 210);
      };
   }

   private static class_1799 uUnuvNvvNU(ServerHelper.nUVVnVNu var0) {
      return switch (var0) {
         case TRAPKA -> VnUvVu != null ? VnUvVu : (VnUvVu = new class_1799(class_1802.field_22021));
         case PLAST -> NvUVuUNUUNvv != null ? NvUVuUNUUNvv : (NvUVuUNUUNvv = new class_1799(class_1802.field_8551));
         case DRAGON_TRAP -> NnvVNVnn != null ? NnvVNVnn : (NnvVNVnn = new class_1799(class_1802.field_8840));
         case DRAGON_PLAST -> O0ooccOc0 != null ? O0ooccOc0 : (O0ooccOc0 = new class_1799(class_1802.field_8613));
      };
   }

   static class NVnVnNnN {
      public final Predicate<class_1799> UuUVuuUu;
      public final boolean C00OOC00oO;
      public final boolean uUnuvNvvNU;
      public final boolean vVvUvVVuuNvV;

      public NVnVnNnN(Predicate<class_1799> var1, boolean var2) {
         this(var1, var2, false);
      }

      public NVnVnNnN(Predicate<class_1799> var1, boolean var2, boolean var3) {
         this(var1, var2, var3, false);
      }

      public NVnVnNnN(Predicate<class_1799> var1, boolean var2, boolean var3, boolean var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }
   }

   static final class VUUnVnVNNU {
      final String UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;

      VUUnVnVNNU(String var1, float var2, float var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }

      boolean UuUVuuUu(ServerHelper.VUnuUnnuNvVu var1) {
         return var1.UuUVuuUu.equals(this.UuUVuuUu)
            && ServerHelper.C00OOC00oO(var1.C00OOC00oO, this.C00OOC00oO)
            && ServerHelper.C00OOC00oO(var1.uUnuvNvvNU, this.uUnuvNvvNU);
      }
   }

   static enum VUVvVuvuN {
      IDLE,
      EXTRACT,
      PREPARE,
      PRE_SWAP_STOP,
      WAIT_MAIN_HAND,
      SWAP,
      USE,
      PRE_RESTORE_STOP,
      RESTORE,
      COOLDOWN;
   }

   static final class VUnuUnnuNvVu {
      final String UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;
      final double vVvUvVVuuNvV;
      final double uNNnnnuuuN;
      final double nuUnNvnuUu;
      final long VVuuUN;
      boolean vNUvnnVnUvu;

      VUnuUnnuNvVu(String var1, float var2, float var3, double var4, double var6, double var8, long var10) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var6;
         this.nuUnNvnuUu = var8;
         this.VVuuUN = var10;
      }
   }

   record VvunVVUvUNnv(class_1799 stack, int inventorySlot, int bundleStackIndex) {
      boolean isBundled() {
         return this.bundleStackIndex >= 0;
      }
   }

   static final class nUNvUnnVN {
      final class_243 UuUVuuUu;
      final long C00OOC00oO;
      ServerHelper.nUVVnVNu uUnuvNvvNU;
      long vVvUvVVuuNvV;
      boolean uNNnnnuuuN;
      boolean nuUnNvnuUu;
      boolean VVuuUN;
      boolean vNUvnnVnUvu;
      ServerHelper.nvUnvV uVUuuVnNVU;
      class_243 vuuuNvNuv;

      nUNvUnnVN(class_243 var1, long var2, ServerHelper.nUVVnVNu var4, long var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var4;
         this.vVvUvVVuuNvV = var5;
      }
   }

   static enum nUVVnVNu {
      TRAPKA,
      PLAST,
      DRAGON_TRAP,
      DRAGON_PLAST;
   }

   static final class nvUnvV {
      final String UuUVuuUu;
      final long C00OOC00oO;
      final long uUnuvNvvNU;
      final ServerHelper.VUUnVnVNNU[] vVvUvVVuuNvV;

      nvUnvV(String var1, long var2, long var4, ServerHelper.VUUnVnVNNU... var6) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var4;
         this.vVvUvVVuuNvV = var6;
      }

      boolean UuUVuuUu(ServerHelper.VUnuUnnuNvVu var1) {
         for (ServerHelper.VUUnVnVNNU var5 : this.vVvUvVVuuNvV) {
            if (var5.UuUVuuUu(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   record nvnNNunvv(float x, float y, float size) {
      float centerX() {
         return this.x + this.size * 0.5F;
      }

      float centerY() {
         return this.y + this.size * 0.5F;
      }
   }

   record uunvUUVnuNn(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {

      ServerHelper.uunvUUVnuNn lerp(ServerHelper.uunvUUVnuNn var1, double var2) {
         return new ServerHelper.uunvUUVnuNn(
            class_3532.method_16436(var2, this.minX, var1.minX),
            class_3532.method_16436(var2, this.minY, var1.minY),
            class_3532.method_16436(var2, this.minZ, var1.minZ),
            class_3532.method_16436(var2, this.maxX, var1.maxX),
            class_3532.method_16436(var2, this.maxY, var1.maxY),
            class_3532.method_16436(var2, this.maxZ, var1.maxZ)
         );
      }
   }
}
