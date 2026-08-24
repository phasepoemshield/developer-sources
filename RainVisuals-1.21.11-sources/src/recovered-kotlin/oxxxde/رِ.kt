package oxxxde

import java.util.ArrayList
import java.util.HashMap
import java.util.Locale
import java.util.NoSuchElementException
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.other.ScrollUtil
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.client.waypoint.WayPointManager
import kotakbaz.rain.module.modules.render.WayPointModule
import kotakbaz.rain.module.setting.Setting
import kotakbaz.rain.ui.api.PipelinedRender
import kotakbaz.rain.ui.menu.PointsCategoryComponent$FieldBounds
import kotakbaz.rain.ui.menu.PointsCategoryComponent$InputField
import kotakbaz.rain.ui.menu.PointsCategoryComponent$PanelArea
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker$Item
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent
import net.minecraft.util.math.BlockPos
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public class رِ(panelWidth: Float, contentTopOffset: Float) : اظ, PipelinedRender {
   private final val inputFocusAnimations: HashMap<زً, ري>
   private final val rowNameEditorMinWidth: Float
   private final var yText: String
   private final var zText: String
   private final var renamingWaypointName: String?
   private final val coordinateFieldMaxLength: Int
   private final var nameText: String
   private final val rowNameEditorSelectedExpand: Float
   private final var renderedWayPoints: List<جة<تف>>
   private final val rowNameEditorHeight: Float
   private final var cachedViewHeight: Float
   private final val nameFieldMaxLength: Int
   private final val createButtonWidth: Float
   private ScrollUtil scroll;
   private final var xText: String
   private final val rowNameEditorTextSize: Float
   private final var renamingWaypointText: String
   private final val rowNameEditorBoxTextPadding: Float
   private AnimationUtil actionButtonHoverAnimation;
   private final val deleteHoverAnimation: HashMap<String, ري>
   private final val inputHeight: Float
   private final val rowHoverAnimation: HashMap<String, ري>
   private final val rowActionButtonGap: Float
   private PointsCategoryComponent$InputField focusedField;
   private final val rowActionIconSize: Float
   private final var lastRenameMaxInputWidth: Float
   private AnimationUtil createButtonHoverAnimation;
   private final var normalizedSearch: String
   private AnimationUtil renameFocusAnim;
   private final val renameHoverAnimation: HashMap<String, ري>
   private final val rowActionAreaSize: Float
   private AnimationUtil createButtonAnimation;
   private final val settingComponents: List<آ<*>>
   private final val panelWidth: Float
   private AnimationUtil emptyStateAnimation;
   private AnimationUtil settingsPageAnimation;
   private final val listAnimations: ثّ<String, تف>
   private final val actionButtonSize: Float
   private final val rowHeight: Float
   private AnimationUtil renameWidthAnim;
   private final val footerReservedHeight: Float
   private final var lastRenameInputWidth: Float
   private final var settingsPageOpen: Boolean
   private final var cachedTotalHeight: Float
   private final val contentTopOffset: Float

   public fun resetScroll() {
      this.scroll = ScrollUtil(0.0F, 1, null)
   }

   private fun contentHeight(size: Int): Float {
      return if (size <= 0) 0.0F else size * this.rowHeight + (size + -1) * this.getPadding()
   }

   public override fun onMouseRelease(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseRelease(mouseX, mouseY, button)
      if (this.settingsPageOpen) {
         for (`element$iv` in this.settingComponents) {
            (`element$iv` as ModuleSettingComponent).onMouseRelease(mouseX, mouseY, button)
         }
      }
   }

   private fun filteredWayPoints(): List<تف> {
      if (StringsKt.isBlank(this.normalizedSearch)) {
         return WayPointManager.INSTANCE.getWayPoints()
      } else {
         val `$this$filterTo$iv$iv`: java.lang.Iterable = WayPointManager.INSTANCE.getWayPoints()
         val `destination$iv$iv`: java.util.Collection = ArrayList()

         for (`element$iv$iv` in `$this$filterTo$iv$iv`) {
            val wayPoint: WayPointManager.WayPoint = `element$iv$iv` as WayPointManager.WayPoint
            val var10000: java.lang.String = (`element$iv$iv` as WayPointManager.WayPoint).name.toLowerCase(Locale.ROOT)
            if (StringsKt.contains$default(var10000, this.normalizedSearch, false, 2, null)
               || StringsKt.contains$default("${wayPoint.x} ${wayPoint.y} ${wayPoint.z}", this.normalizedSearch, false, 2, null)
               || StringsKt.contains$default("x ${wayPoint.x} y ${wayPoint.y} z ${wayPoint.z}", this.normalizedSearch, false, 2, null)) {
               `destination$iv$iv`.add(`element$iv$iv`)
            }
         }

         return `destination$iv$iv` as MutableList<WayPointManager.WayPoint>
      }
   }

   private fun renderRow(wayPoint: تف, x: Float, y: Float, width: Float, mouseX: Int, mouseY: Int, presence: Float) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 2
      // 002: fload 3
      // 003: fload 4
      // 005: aload 0
      // 006: getfield oxxxde/رِ.rowHeight F
      // 009: iload 5
      // 00b: i2f
      // 00c: iload 6
      // 00e: i2f
      // 00f: invokespecial oxxxde/رِ.inside (FFFFFF)Z
      // 012: istore 8
      // 014: iload 8
      // 016: ifeq 02f
      // 019: aload 0
      // 01a: fload 2
      // 01b: fload 3
      // 01c: fload 4
      // 01e: iload 5
      // 020: i2f
      // 021: iload 6
      // 023: i2f
      // 024: invokespecial oxxxde/رِ.insideDelete (FFFFF)Z
      // 027: ifeq 02f
      // 02a: bipush 1
      // 02b: nop
      // 02c: goto 031
      // 02f: bipush 0
      // 030: nop
      // 031: istore 9
      // 033: iload 8
      // 035: ifeq 04e
      // 038: aload 0
      // 039: fload 2
      // 03a: fload 3
      // 03b: fload 4
      // 03d: iload 5
      // 03f: i2f
      // 040: iload 6
      // 042: i2f
      // 043: invokespecial oxxxde/رِ.insideRename (FFFFF)Z
      // 046: ifeq 04e
      // 049: bipush 1
      // 04a: nop
      // 04b: goto 050
      // 04e: bipush 0
      // 04f: nop
      // 050: istore 10
      // 052: aload 0
      // 053: getfield oxxxde/رِ.deleteHoverAnimation Ljava/util/HashMap;
      // 056: checkcast java/util/Map
      // 059: astore 12
      // 05b: aload 1
      // 05c: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getName ()Ljava/lang/String;
      // 05f: astore 13
      // 061: bipush 0
      // 062: nop
      // 063: istore 14
      // 065: aload 12
      // 067: aload 13
      // 069: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 06e: astore 15
      // 070: aload 15
      // 072: ifnonnull 099
      // 075: bipush 0
      // 076: nop
      // 077: istore 16
      // 079: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 07c: dup
      // 07d: fconst_0
      // 07e: nop
      // 07f: bipush 1
      // 080: nop
      // 081: aconst_null
      // 082: nop
      // 083: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 086: astore 16
      // 088: aload 12
      // 08a: aload 13
      // 08c: aload 16
      // 08e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 093: pop
      // 094: aload 16
      // 096: goto 09b
      // 099: aload 15
      // 09b: nop
      // 09c: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 09f: astore 11
      // 0a1: aload 0
      // 0a2: getfield oxxxde/رِ.renameHoverAnimation Ljava/util/HashMap;
      // 0a5: checkcast java/util/Map
      // 0a8: astore 13
      // 0aa: aload 1
      // 0ab: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getName ()Ljava/lang/String;
      // 0ae: astore 14
      // 0b0: bipush 0
      // 0b1: nop
      // 0b2: istore 15
      // 0b4: aload 13
      // 0b6: aload 14
      // 0b8: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0bd: astore 16
      // 0bf: aload 16
      // 0c1: ifnonnull 0e8
      // 0c4: bipush 0
      // 0c5: nop
      // 0c6: istore 17
      // 0c8: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 0cb: dup
      // 0cc: fconst_0
      // 0cd: nop
      // 0ce: bipush 1
      // 0cf: nop
      // 0d0: aconst_null
      // 0d1: nop
      // 0d2: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 0d5: astore 17
      // 0d7: aload 13
      // 0d9: aload 14
      // 0db: aload 17
      // 0dd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e2: pop
      // 0e3: aload 17
      // 0e5: goto 0ea
      // 0e8: aload 16
      // 0ea: nop
      // 0eb: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 0ee: astore 12
      // 0f0: aload 0
      // 0f1: getfield oxxxde/رِ.rowHoverAnimation Ljava/util/HashMap;
      // 0f4: checkcast java/util/Map
      // 0f7: astore 14
      // 0f9: aload 1
      // 0fa: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getName ()Ljava/lang/String;
      // 0fd: astore 15
      // 0ff: bipush 0
      // 100: nop
      // 101: istore 16
      // 103: aload 14
      // 105: aload 15
      // 107: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 10c: astore 17
      // 10e: aload 17
      // 110: ifnonnull 137
      // 113: bipush 0
      // 114: nop
      // 115: istore 18
      // 117: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 11a: dup
      // 11b: fconst_0
      // 11c: nop
      // 11d: bipush 1
      // 11e: nop
      // 11f: aconst_null
      // 120: nop
      // 121: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 124: astore 18
      // 126: aload 14
      // 128: aload 15
      // 12a: aload 18
      // 12c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 131: pop
      // 132: aload 18
      // 134: goto 139
      // 137: aload 17
      // 139: nop
      // 13a: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 13d: astore 13
      // 13f: aload 11
      // 141: iload 9
      // 143: ifeq 14b
      // 146: fconst_1
      // 147: nop
      // 148: goto 14d
      // 14b: fconst_0
      // 14c: nop
      // 14d: ldc_w 180.0
      // 150: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 153: astore 15
      // 155: new oxxxde/اٍ
      // 158: dup
      // 159: aload 15
      // 15b: invokespecial oxxxde/اٍ.<init> (Loxxxde/بف;)V
      // 15e: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 161: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 164: fstore 14
      // 166: aload 0
      // 167: aload 1
      // 168: invokespecial oxxxde/رِ.isRenamingWaypoint (Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Z
      // 16b: istore 15
      // 16d: aload 12
      // 16f: iload 10
      // 171: ifne 179
      // 174: iload 15
      // 176: ifeq 17e
      // 179: fconst_1
      // 17a: nop
      // 17b: goto 180
      // 17e: fconst_0
      // 17f: nop
      // 180: ldc_w 180.0
      // 183: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 186: astore 17
      // 188: new oxxxde/طّ
      // 18b: dup
      // 18c: aload 17
      // 18e: invokespecial oxxxde/طّ.<init> (Loxxxde/بف;)V
      // 191: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 194: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 197: fstore 16
      // 199: aload 13
      // 19b: iload 8
      // 19d: ifeq 1a5
      // 1a0: fconst_1
      // 1a1: nop
      // 1a2: goto 1a7
      // 1a5: fconst_0
      // 1a6: nop
      // 1a7: ldc_w 180.0
      // 1aa: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 1ad: astore 18
      // 1af: new oxxxde/طح
      // 1b2: dup
      // 1b3: aload 18
      // 1b5: invokespecial oxxxde/طح.<init> (Loxxxde/بف;)V
      // 1b8: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 1bb: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 1be: fconst_0
      // 1bf: nop
      // 1c0: fconst_1
      // 1c1: nop
      // 1c2: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 1c5: fstore 17
      // 1c7: aload 0
      // 1c8: invokevirtual oxxxde/رِ.getAlpha ()F
      // 1cb: fload 7
      // 1cd: fmul
      // 1ce: fstore 18
      // 1d0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1d3: fload 18
      // 1d5: ldc_w 0.03
      // 1d8: ldc_w 0.02
      // 1db: fload 17
      // 1dd: fmul
      // 1de: fadd
      // 1df: fmul
      // 1e0: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 1e3: astore 19
      // 1e5: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1e8: fload 18
      // 1ea: ldc_w 0.06
      // 1ed: ldc_w 0.06
      // 1f0: fload 17
      // 1f2: fmul
      // 1f3: fadd
      // 1f4: fmul
      // 1f5: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1f8: astore 20
      // 1fa: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1fd: fload 18
      // 1ff: ldc_w 0.78
      // 202: fmul
      // 203: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 206: astore 21
      // 208: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 20b: fload 18
      // 20d: ldc_w 0.48
      // 210: fmul
      // 211: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 214: astore 22
      // 216: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 219: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 21c: fload 18
      // 21e: ldc_w 0.35
      // 221: fmul
      // 222: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 225: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 228: fload 18
      // 22a: ldc_w 0.72
      // 22d: fmul
      // 22e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 231: fload 16
      // 233: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 236: astore 23
      // 238: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 23b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 23e: fload 18
      // 240: ldc_w 0.35
      // 243: fmul
      // 244: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 247: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 24a: fload 18
      // 24c: ldc_w 0.72
      // 24f: fmul
      // 250: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 253: fload 14
      // 255: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 258: astore 24
      // 25a: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 25d: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 260: aload 0
      // 261: invokevirtual oxxxde/رِ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 264: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 267: aload 19
      // 269: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 26c: ldc_w 4.0
      // 26f: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 272: ldc_w 0.95
      // 275: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 278: fconst_1
      // 279: nop
      // 27a: aload 20
      // 27c: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 27f: fload 2
      // 280: fload 3
      // 281: fload 4
      // 283: aload 0
      // 284: getfield oxxxde/رِ.rowHeight F
      // 287: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 28a: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 28d: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 290: aload 0
      // 291: invokevirtual oxxxde/رِ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 294: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 297: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 29a: fload 18
      // 29c: ldc_w 0.72
      // 29f: fmul
      // 2a0: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 2a3: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 2a6: ldc_w 0.3
      // 2a9: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 2ac: fload 2
      // 2ad: fload 4
      // 2af: fadd
      // 2b0: aload 0
      // 2b1: invokevirtual oxxxde/رِ.getPadding ()F
      // 2b4: ldc_w 1.5
      // 2b7: fmul
      // 2b8: fsub
      // 2b9: fload 3
      // 2ba: aload 0
      // 2bb: invokevirtual oxxxde/رِ.getPadding ()F
      // 2be: fadd
      // 2bf: ldc_w 2.5
      // 2c2: ldc_w 2.5
      // 2c5: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 2c8: ldc_w 8.0
      // 2cb: fstore 25
      // 2cd: ldc_w 5.6
      // 2d0: fstore 26
      // 2d2: fload 2
      // 2d3: aload 0
      // 2d4: invokevirtual oxxxde/رِ.getPadding ()F
      // 2d7: ldc_w 1.5
      // 2da: fmul
      // 2db: fadd
      // 2dc: fstore 27
      // 2de: fload 3
      // 2df: aload 0
      // 2e0: invokevirtual oxxxde/رِ.getPadding ()F
      // 2e3: ldc_w 1.5
      // 2e6: fmul
      // 2e7: fadd
      // 2e8: fstore 28
      // 2ea: iload 15
      // 2ec: ifeq 306
      // 2ef: aload 0
      // 2f0: fload 2
      // 2f1: fload 3
      // 2f2: fload 4
      // 2f4: invokespecial oxxxde/رِ.rowNameEditorBounds (FFF)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 2f7: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 2fa: aload 0
      // 2fb: getfield oxxxde/رِ.rowNameEditorHeight F
      // 2fe: fadd
      // 2ff: ldc_w 4.0
      // 302: fadd
      // 303: goto 31b
      // 306: fload 28
      // 308: aload 0
      // 309: invokevirtual oxxxde/رِ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 30c: fload 25
      // 30e: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 311: fadd
      // 312: aload 0
      // 313: invokevirtual oxxxde/رِ.getPadding ()F
      // 316: ldc_w 1.5
      // 319: fdiv
      // 31a: fadd
      // 31b: fstore 29
      // 31d: iload 15
      // 31f: ifeq 333
      // 322: aload 0
      // 323: aload 0
      // 324: fload 2
      // 325: fload 3
      // 326: fload 4
      // 328: invokespecial oxxxde/رِ.rowNameEditorBounds (FFF)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 32b: fload 18
      // 32d: invokespecial oxxxde/رِ.renderRowNameEditor (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;F)V
      // 330: goto 35c
      // 333: aload 0
      // 334: invokevirtual oxxxde/رِ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 337: aload 0
      // 338: invokevirtual oxxxde/رِ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 33b: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 33e: aload 1
      // 33f: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getName ()Ljava/lang/String;
      // 342: fload 27
      // 344: fload 28
      // 346: fload 25
      // 348: aload 21
      // 34a: fconst_0
      // 34b: nop
      // 34c: fconst_0
      // 34d: nop
      // 34e: fconst_0
      // 34f: nop
      // 350: bipush 0
      // 351: nop
      // 352: fconst_0
      // 353: nop
      // 354: sipush 992
      // 357: aconst_null
      // 358: nop
      // 359: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 35c: aload 0
      // 35d: invokevirtual oxxxde/رِ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 360: aload 0
      // 361: invokevirtual oxxxde/رِ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 364: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 367: aload 1
      // 368: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getX ()I
      // 36b: aload 1
      // 36c: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getY ()I
      // 36f: aload 1
      // 370: invokevirtual kotakbaz/rain/client/waypoint/WayPointManager$WayPoint.getZ ()I
      // 373: invokedynamic makeConcatWithConstants (III)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "X \u0001  Y \u0001  Z \u0001" ]
      // 378: fload 27
      // 37a: fload 29
      // 37c: fload 26
      // 37e: aload 22
      // 380: fconst_0
      // 381: nop
      // 382: fconst_0
      // 383: nop
      // 384: fconst_0
      // 385: nop
      // 386: bipush 0
      // 387: nop
      // 388: fconst_0
      // 389: nop
      // 38a: sipush 992
      // 38d: aconst_null
      // 38e: nop
      // 38f: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 392: aload 0
      // 393: fload 2
      // 394: fload 3
      // 395: fload 4
      // 397: invokespecial oxxxde/رِ.renameButtonBounds (FFF)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 39a: astore 30
      // 39c: aload 0
      // 39d: fload 2
      // 39e: fload 3
      // 39f: fload 4
      // 3a1: invokespecial oxxxde/رِ.deleteButtonBounds (FFF)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 3a4: astore 31
      // 3a6: fload 3
      // 3a7: aload 0
      // 3a8: getfield oxxxde/رِ.rowHeight F
      // 3ab: ldc_w 0.5
      // 3ae: fmul
      // 3af: fadd
      // 3b0: aload 0
      // 3b1: getfield oxxxde/رِ.rowActionIconSize F
      // 3b4: ldc_w 0.5
      // 3b7: fmul
      // 3b8: fsub
      // 3b9: fstore 32
      // 3bb: aload 0
      // 3bc: invokevirtual oxxxde/رِ.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 3bf: aload 0
      // 3c0: invokevirtual oxxxde/رِ.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 3c3: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 3c6: ldc_w "J"
      // 3c9: aload 30
      // 3cb: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 3ce: aload 30
      // 3d0: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 3d3: ldc_w 0.5
      // 3d6: fmul
      // 3d7: fadd
      // 3d8: fload 32
      // 3da: aload 0
      // 3db: getfield oxxxde/رِ.rowActionIconSize F
      // 3de: aload 23
      // 3e0: fconst_0
      // 3e1: nop
      // 3e2: bipush 32
      // 3e4: aconst_null
      // 3e5: nop
      // 3e6: invokestatic kotakbaz/rain/client/util/render/font/Font.drawCenteredText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 3e9: aload 0
      // 3ea: invokevirtual oxxxde/رِ.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 3ed: aload 0
      // 3ee: invokevirtual oxxxde/رِ.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 3f1: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 3f4: ldc_w "i"
      // 3f7: aload 31
      // 3f9: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 3fc: aload 31
      // 3fe: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 401: ldc_w 0.5
      // 404: fmul
      // 405: fadd
      // 406: fload 32
      // 408: aload 0
      // 409: getfield oxxxde/رِ.rowActionIconSize F
      // 40c: aload 24
      // 40e: fconst_0
      // 40f: nop
      // 410: bipush 32
      // 412: aconst_null
      // 413: nop
      // 414: invokestatic kotakbaz/rain/client/util/render/font/Font.drawCenteredText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 417: return
   }

   private fun insideCreateButton(area: شذ, mouseX: Float, mouseY: Float): Boolean {
      val bounds: PointsCategoryComponent$PanelArea = this.createButtonBounds(area)
      return this.inside(bounds.left, bounds.top, bounds.width, bounds.height, mouseX, mouseY)
   }

   private fun renameButtonBounds(rowX: Float, rowY: Float, rowWidth: Float): شذ {
      val deleteBounds: PointsCategoryComponent$PanelArea = this.deleteButtonBounds(rowX, rowY, rowWidth)
      return PointsCategoryComponent$PanelArea(
         deleteBounds.left - this.rowActionButtonGap - this.rowActionAreaSize, deleteBounds.top, this.rowActionAreaSize, this.rowActionAreaSize
      )
   }

   private fun appendKeyName(field: زً, keyName: String) {
      when (جْ.$EnumSwitchMapping$1[field.ordinal()]) {
         1 -> {
            if (!this.isAllowedWaypointNameKey(keyName)) {
               return
            }

            this.appendToField(field, keyName)
            break
         }
         2, 3, 4 -> {
            val `$this$all$iv`: java.lang.CharSequence = keyName
            var var5: Int = 0

            var var10000: Boolean
            while (true) {
               if (var5 >= `$this$all$iv`.length()) {
                  var10000 = true
                  break
               }

               if (!Character.isDigit(`$this$all$iv`.charAt(var5))) {
                  var10000 = false
                  break
               }

               var5++
            }

            if (var10000) {
               this.appendToField(field, keyName)
               return
            }

            if (keyName == "-" && this.fieldValue(field).length() == 0) {
               this.appendToField(field, keyName)
            }
            break
         }
         else -> throw NoWhenBranchMatchedException()
      }
   }

   private fun startWaypointRename(wayPoint: تف) {
      this.focusedField = null
      if (!(this.renamingWaypointName == wayPoint.name)) {
         this.renamingWaypointName = wayPoint.name
         this.renamingWaypointText = wayPoint.name
      }
   }

   private fun renderList(area: شذ, visibleWayPoints: List<جة<تف>>, scrollOffset: Float, mouseX: Int, mouseY: Int, pageProgress: Float) {
      if (!(area.width <= 0.0F) && !(area.height <= 0.0F)) {
         جِ.INSTANCE.start(area.left, area.top, area.width, area.height)
         val clipBottom: Float = area.top + area.height

         for (`element$iv` in visibleWayPoints) {
            val animatedWayPoint: AnimatedListTracker$Item = `element$iv` as AnimatedListTracker$Item
            val rowY: Float = area.top
               - scrollOffset
               + (`element$iv` as AnimatedListTracker$Item).position * (this.rowHeight + this.getPadding())
               + (1.0F - (`element$iv` as AnimatedListTracker$Item).presence) * 4.0F
               if (rowY + this.rowHeight > area.top && rowY < clipBottom) {
               this.renderRow(
                  animatedWayPoint.value as WayPointManager.WayPoint, area.left, rowY, area.width, mouseX, mouseY, animatedWayPoint.presence * pageProgress
               )
            }
         }

         جِ.INSTANCE.end()
      }
   }

   private fun listArea(area: شذ, footer: شذ): شذ {
      return PointsCategoryComponent$PanelArea(area.left, area.top, area.width, RangesKt.coerceAtLeast(footer.top - area.top - this.getPadding(), 0.0F))
   }

   private fun renderEmptyState(area: شذ, progress: Float) {
      Font.drawCenteredText$default(
         this.getDefaultFont().priority(this.textPipeline()),
         "Ничего не найдено :(",
         area.left + area.width * 0.5F,
         area.top + (area.height - 11.0F) * 0.46F,
         11.0F,
         ثْ.INSTANCE.value(this.getAlpha() * 0.5F * progress),
         0.0F,
         32,
         null
      )
   }

   private fun renderFooter(area: شذ, mouseX: Int, mouseY: Int) {
      if (!(area.width <= 0.0F) && !(area.height <= 0.0F)) {
         val inputBounds: java.util.List = this.inputBounds(area)

         for (actionBounds in inputBounds) {
            if ((actionBounds as PointsCategoryComponent$FieldBounds).field === PointsCategoryComponent$InputField.NAME) {
               for (var25 in inputBounds) {
                  if ((var25 as PointsCategoryComponent$FieldBounds).field === PointsCategoryComponent$InputField.X) {
                     for (var30 in inputBounds) {
                        if ((var30 as PointsCategoryComponent$FieldBounds).field === PointsCategoryComponent$InputField.Y) {
                           for (var33 in inputBounds) {
                              if ((var33 as PointsCategoryComponent$FieldBounds).field === PointsCategoryComponent$InputField.Z) {
                                 val var20: PointsCategoryComponent$FieldBounds = var33 as PointsCategoryComponent$FieldBounds
                                 val var24: PointsCategoryComponent$PanelArea = this.actionButtonBounds(area)
                                 val var28: PointsCategoryComponent$PanelArea = this.createButtonBounds(area)
                                 this.renderInputBox(
                                    actionBounds as PointsCategoryComponent$FieldBounds,
                                    this.nameText,
                                    "Название",
                                    this.focusedField === PointsCategoryComponent$InputField.NAME
                                 )
                                 this.renderInputBox(
                                    var25 as PointsCategoryComponent$FieldBounds, this.xText, "X", this.focusedField === PointsCategoryComponent$InputField.X
                                 )
                                 this.renderInputBox(
                                    var30 as PointsCategoryComponent$FieldBounds, this.yText, "Y", this.focusedField === PointsCategoryComponent$InputField.Y
                                 )
                                 this.renderInputBox(var20, this.zText, "Z", this.focusedField === PointsCategoryComponent$InputField.Z)
                                 this.renderActionButton(var24, mouseX, mouseY)
                                 this.renderCreateButton(var28, mouseX, mouseY)
                                 return
                              }
                           }

                           throw NoSuchElementException("Collection contains no element matching the predicate.")
                        }
                     }

                     throw NoSuchElementException("Collection contains no element matching the predicate.")
                  }
               }

               throw NoSuchElementException("Collection contains no element matching the predicate.")
            }
         }

         throw NoSuchElementException("Collection contains no element matching the predicate.")
      }
   }

   private fun insideActionButton(area: شذ, mouseX: Float, mouseY: Float): Boolean {
      val bounds: PointsCategoryComponent$PanelArea = this.actionButtonBounds(area)
      return this.inside(bounds.left, bounds.top, bounds.width, bounds.height, mouseX, mouseY)
   }

   private fun inputBounds(area: شذ): List<تك> {
      val rowY: Float = this.inputRowTop(area)
      val availableWidth: Float = RangesKt.coerceAtLeast(area.width - this.createButtonWidth - this.actionButtonSize - this.getPadding() * 5.0F, 0.0F)
      val nameWidth: Float = RangesKt.coerceAtLeast(availableWidth * 0.42F, 0.0F)
      val coordWidth: Float = RangesKt.coerceAtLeast((availableWidth - nameWidth) / 3.0F, 0.0F)
      val xX: Float = area.left + nameWidth + this.getPadding()
      val yX: Float = xX + coordWidth + this.getPadding()
      return CollectionsKt.listOf(
         PointsCategoryComponent$FieldBounds(PointsCategoryComponent$InputField.NAME, area.left, rowY, nameWidth, this.inputHeight),
         PointsCategoryComponent$FieldBounds(PointsCategoryComponent$InputField.X, xX, rowY, coordWidth, this.inputHeight),
         PointsCategoryComponent$FieldBounds(PointsCategoryComponent$InputField.Y, yX, rowY, coordWidth, this.inputHeight),
         PointsCategoryComponent$FieldBounds(PointsCategoryComponent$InputField.Z, yX + coordWidth + this.getPadding(), rowY, coordWidth, this.inputHeight)
      )
   }

   private fun insideRename(rowX: Float, rowY: Float, rowWidth: Float, mouseX: Float, mouseY: Float): Boolean {
      val bounds: PointsCategoryComponent$PanelArea = this.renameButtonBounds(rowX, rowY, rowWidth)
      return this.inside(bounds.left, bounds.top, bounds.width, bounds.height, mouseX, mouseY)
   }

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   private fun renderActionButton(bounds: شذ, mouseX: Int, mouseY: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield oxxxde/رِ.settingsPageAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 004: aload 0
      // 005: getfield oxxxde/رِ.settingsPageOpen Z
      // 008: ifeq 010
      // 00b: fconst_1
      // 00c: nop
      // 00d: goto 012
      // 010: fconst_0
      // 011: nop
      // 012: ldc_w 240.0
      // 015: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 018: astore 5
      // 01a: new oxxxde/بض
      // 01d: dup
      // 01e: aload 5
      // 020: invokespecial oxxxde/بض.<init> (Loxxxde/بف;)V
      // 023: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 026: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 029: fconst_0
      // 02a: nop
      // 02b: fconst_1
      // 02c: nop
      // 02d: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 030: fstore 4
      // 032: aload 0
      // 033: aload 1
      // 034: iload 2
      // 035: nop
      // 036: i2f
      // 037: iload 3
      // 038: nop
      // 039: i2f
      // 03a: invokespecial oxxxde/رِ.inside (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;FF)Z
      // 03d: istore 5
      // 03f: aload 0
      // 040: getfield oxxxde/رِ.actionButtonHoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 043: iload 5
      // 045: ifeq 04d
      // 048: fconst_1
      // 049: nop
      // 04a: goto 04f
      // 04d: fconst_0
      // 04e: nop
      // 04f: ldc_w 170.0
      // 052: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 055: astore 7
      // 057: new oxxxde/ضس
      // 05a: dup
      // 05b: aload 7
      // 05d: invokespecial oxxxde/ضس.<init> (Loxxxde/بف;)V
      // 060: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 063: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 066: fconst_0
      // 067: nop
      // 068: fconst_1
      // 069: nop
      // 06a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 06d: fstore 6
      // 06f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 072: ldc_w 0.01
      // 075: ldc_w 0.04
      // 078: fload 4
      // 07a: fload 6
      // 07c: invokestatic java/lang/Math.max (FF)F
      // 07f: fmul
      // 080: fadd
      // 081: aload 0
      // 082: invokevirtual oxxxde/رِ.getAlpha ()F
      // 085: fmul
      // 086: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 089: astore 7
      // 08b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 08e: ldc_w 0.07
      // 091: ldc_w 0.04
      // 094: fload 4
      // 096: fmul
      // 097: fadd
      // 098: ldc_w 0.03
      // 09b: fload 6
      // 09d: fmul
      // 09e: fadd
      // 09f: aload 0
      // 0a0: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0a3: fmul
      // 0a4: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0a7: astore 8
      // 0a9: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0ac: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0af: ldc_w 0.55
      // 0b2: aload 0
      // 0b3: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0b6: fmul
      // 0b7: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 0ba: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0bd: ldc_w 0.78
      // 0c0: aload 0
      // 0c1: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0c4: fmul
      // 0c5: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0c8: fload 4
      // 0ca: fload 6
      // 0cc: invokestatic java/lang/Math.max (FF)F
      // 0cf: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0d2: astore 9
      // 0d4: aload 0
      // 0d5: getfield oxxxde/رِ.inputHeight F
      // 0d8: ldc_w 0.32
      // 0db: fmul
      // 0dc: fstore 10
      // 0de: aload 1
      // 0df: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 0e2: aload 1
      // 0e3: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 0e6: ldc_w 0.5
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: fstore 11
      // 0ed: aload 1
      // 0ee: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 0f1: aload 1
      // 0f2: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 0f5: fload 10
      // 0f7: fsub
      // 0f8: ldc_w 0.5
      // 0fb: fmul
      // 0fc: fadd
      // 0fd: fstore 12
      // 0ff: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 102: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 105: aload 0
      // 106: invokevirtual oxxxde/رِ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 109: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 10c: aload 7
      // 10e: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 111: ldc_w 4.0
      // 114: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 117: fconst_1
      // 118: nop
      // 119: aload 8
      // 11b: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 11e: aload 1
      // 11f: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 122: aload 1
      // 123: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 126: aload 1
      // 127: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 12a: aload 1
      // 12b: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 12e: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 131: aload 0
      // 132: invokevirtual oxxxde/رِ.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 135: aload 0
      // 136: invokevirtual oxxxde/رِ.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 139: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 13c: ldc_w "x"
      // 13f: fload 11
      // 141: fload 12
      // 143: fload 4
      // 145: ldc_w 0.5
      // 148: fmul
      // 149: fadd
      // 14a: fload 10
      // 14c: fconst_1
      // 14d: nop
      // 14e: ldc_w 0.08
      // 151: fload 4
      // 153: fmul
      // 154: fsub
      // 155: fmul
      // 156: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 159: aload 9
      // 15b: aload 0
      // 15c: invokevirtual oxxxde/رِ.getAlpha ()F
      // 15f: fconst_1
      // 160: nop
      // 161: fload 4
      // 163: fsub
      // 164: fmul
      // 165: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 168: fconst_0
      // 169: nop
      // 16a: bipush 32
      // 16c: aconst_null
      // 16d: nop
      // 16e: invokestatic kotakbaz/rain/client/util/render/font/Font.drawCenteredText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 171: aload 0
      // 172: invokevirtual oxxxde/رِ.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 175: aload 0
      // 176: invokevirtual oxxxde/رِ.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 179: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 17c: ldc_w "U"
      // 17f: fload 11
      // 181: fload 12
      // 183: fconst_1
      // 184: nop
      // 185: fload 4
      // 187: fsub
      // 188: ldc_w 0.5
      // 18b: fmul
      // 18c: fsub
      // 18d: fload 10
      // 18f: ldc_w 0.92
      // 192: ldc_w 0.08
      // 195: fload 4
      // 197: fmul
      // 198: fadd
      // 199: fmul
      // 19a: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 19d: aload 9
      // 19f: aload 0
      // 1a0: invokevirtual oxxxde/رِ.getAlpha ()F
      // 1a3: fload 4
      // 1a5: fmul
      // 1a6: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 1a9: fconst_0
      // 1aa: nop
      // 1ab: bipush 32
      // 1ad: aconst_null
      // 1ae: nop
      // 1af: invokestatic kotakbaz/rain/client/util/render/font/Font.drawCenteredText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 1b2: return
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (button == 0) {
         val area: PointsCategoryComponent$PanelArea = this.contentArea()
         if (!this.inside(area, (float)mouseX, (float)mouseY)) {
            this.clearInputFocus()
            if (this.settingsPageOpen) {
               for (var23 in this.settingComponents) {
                  (var23 as ModuleSettingComponent).onMouseClick(mouseX, mouseY, button)
               }
            }
         } else {
            val footerArea: PointsCategoryComponent$PanelArea = this.footerArea(area)
            val listArea: PointsCategoryComponent$PanelArea = this.listArea(area, footerArea)
            val `$i$f$forEach`: java.util.Iterator = this.inputBounds(footerArea).iterator()

            var var10000: Any
            while (true) {
               if (`$i$f$forEach`.hasNext()) {
                  val `$this$filterTo$iv$iv`: Any = `$i$f$forEach`.next()
                  if (!this.inside(
                     (`$this$filterTo$iv$iv` as PointsCategoryComponent$FieldBounds).x,
                     (`$this$filterTo$iv$iv` as PointsCategoryComponent$FieldBounds).y,
                     (`$this$filterTo$iv$iv` as PointsCategoryComponent$FieldBounds).width,
                     (`$this$filterTo$iv$iv` as PointsCategoryComponent$FieldBounds).height,
                     (float)mouseX,
                     (float)mouseY
                  )) {
                     continue
                  }

                  var10000 = `$this$filterTo$iv$iv`
                  break
               }

               var10000 = null
               break
            }

            val clickedField: PointsCategoryComponent$FieldBounds = var10000 as PointsCategoryComponent$FieldBounds
            if (var10000 as PointsCategoryComponent$FieldBounds != null) {
               this.cancelWaypointRename()
               this.focusedField = clickedField.field
            } else if (this.insideCreateButton(footerArea, (float)mouseX, (float)mouseY)) {
               this.cancelWaypointRename()
               this.createWaypoint()
            } else if (this.insideActionButton(footerArea, (float)mouseX, (float)mouseY)) {
               this.settingsPageOpen = !this.settingsPageOpen
               this.clearInputFocus()
            } else {
               this.focusedField = null
               if (!this.settingsPageOpen) {
                  if (this.inside(listArea, (float)mouseX, (float)mouseY)) {
                     val var22: Float = listArea.left
                     val var33: java.lang.Iterable = this.renderedWayPoints
                     val var36: java.util.Collection = ArrayList()

                     for (wayPoint in var33) {
                        if ((wayPoint as AnimatedListTracker$Item).present) {
                           var36.add(wayPoint)
                        }
                     }

                     for (var37 in var36 as java.util.List) {
                        val var42: WayPointManager.WayPoint = (var37 as AnimatedListTracker$Item).value as WayPointManager.WayPoint
                        val var43: Float = listArea.top
                           - this.scroll.value()
                           + (var37 as AnimatedListTracker$Item).position * (this.rowHeight + this.getPadding())
                           if (var43 + this.rowHeight > listArea.top && var43 < listArea.top + listArea.height) {
                           if (this.insideDelete(var22, var43, listArea.width, (float)mouseX, (float)mouseY)
                              && WayPointManager.INSTANCE.remove(var42.name) === WayPointManager.RemoveResult.REMOVED) {
                              this.deleteHoverAnimation.remove(var42.name)
                              this.renameHoverAnimation.remove(var42.name)
                              this.rowHoverAnimation.remove(var42.name)
                              if (this.renamingWaypointName == var42.name) {
                                 this.cancelWaypointRename()
                              }

                              return
                           }

                           if (this.insideRename(var22, var43, listArea.width, (float)mouseX, (float)mouseY)) {
                              this.startWaypointRename(var42)
                              return
                           }

                           if (this.isRenamingWaypoint(var42)
                              && this.inside(this.rowNameEditorBounds(var22, var43, listArea.width), (float)mouseX, (float)mouseY)) {
                              return
                           }
                        }
                     }

                     this.cancelWaypointRename()
                  }
               } else {
                  this.cancelWaypointRename()

                  for (var32 in this.settingComponents) {
                     (var32 as ModuleSettingComponent).onMouseClick(mouseX, mouseY, button)
                  }
               }
            }
         }
      }
   }

   private fun renderSettingsPage(area: شذ, mouseX: Int, mouseY: Int, partialTicks: Float, pageProgress: Float) {
      val pageAlpha: Float = this.getAlpha() * pageProgress
      val pageBounds: PointsCategoryComponent$PanelArea = this.settingsPageBounds(area)
      if (!(pageBounds.width <= 0.0F) && !(pageBounds.height <= 0.0F)) {
         ذر.INSTANCE.BASIC_RECT
            .priority(this.rectPipeline())
            .color(ثْ.INSTANCE.surface(0.01F * pageAlpha))
            .round(4.0F)
            .border(1.0F, ثْ.INSTANCE.surface(0.06F * pageAlpha))
            .draw(pageBounds.left, pageBounds.top, pageBounds.width, pageBounds.height)
            val sideInset: Float = this.getPadding() * 0.95F
         val topInset: Float = this.getPadding() * 0.75F
         val gap: Float = this.getPadding() * 0.45F
         val componentX: Float = pageBounds.left + sideInset
         val componentWidth: Float = RangesKt.coerceAtLeast(pageBounds.width - sideInset * 2.0F, 0.0F)
         var currentY: Float = 0.0F
         currentY = pageBounds.top + topInset
         val `index$iv`: java.lang.Iterable = this.settingComponents
         val `destination$iv$iv`: java.util.Collection = ArrayList()

         for (component in `index$iv`) {
            if ((component as ModuleSettingComponent).setting.isVisible()) {
               `destination$iv$iv`.add(component)
            }
         }

         val var24: java.lang.Iterable = `destination$iv$iv` as java.util.List
         var var26: Int = 0

         for (var28 in var24) {
            val var29: Int = var26++
            if (var29 < 0) {
               CollectionsKt.throwIndexOverflow()
            }

            val var30: ModuleSettingComponent = var28 as ModuleSettingComponent
            if (var29 > 0) {
               currentY += gap
            }

            var30.setAlpha(pageAlpha)
            var30.enableProgress = 1.0F
            var30.parentOpenProgress = 1.0F
            var30.setX(componentX)
            var30.setY(currentY)
            var30.setWidth(componentWidth)
            var30.setHeight(var30.componentHeight)
            var30.render(mouseX, mouseY, partialTicks)
            currentY += var30.componentHeight
         }
      }
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }

   private fun saveWaypointRename() {
      if (this.renamingWaypointName != null) {
         val oldName: java.lang.String = this.renamingWaypointName
         when (جْ.$EnumSwitchMapping$0[WayPointManager.INSTANCE
            .rename(this.renamingWaypointName, StringsKt.trim(this.renamingWaypointText).toString())
            .ordinal()]) {
            1, 2 -> {
               this.deleteHoverAnimation.remove(oldName)
               this.renameHoverAnimation.remove(oldName)
               this.cancelWaypointRename()
            }
            3 -> this.cancelWaypointRename()
            4, 5, 6 -> {}
            else -> throw NoWhenBranchMatchedException()
         }
      }
   }

   private fun fieldValue(field: زً): String {
      var var10000: java.lang.String
      when (جْ.$EnumSwitchMapping$1[field.ordinal()]) {
         1 -> var10000 = this.nameText
         2 -> var10000 = this.xText
         3 -> var10000 = this.yText
         4 -> var10000 = this.zText
         else -> throw NoWhenBranchMatchedException()
      }

      return var10000
   }

   private fun createButtonBounds(area: شذ): شذ {
      return PointsCategoryComponent$PanelArea(
         area.left + area.width - this.createButtonWidth, this.inputRowTop(area), this.createButtonWidth, this.inputHeight
      )
   }

   private fun isAllowedWaypointNameKey(keyName: String): Boolean {
      val `$this$all$iv`: java.lang.CharSequence = keyName
      var var4: Int = 0

      var var10000: Boolean
      while (true) {
         if (var4 >= `$this$all$iv`.length()) {
            var10000 = true
            break
         }

         val it: Char = `$this$all$iv`.charAt(var4)
         if (!Character.isLetterOrDigit(it) && it != '-' && it != '_') {
            var10000 = false
            break
         }

         var4++
      }

      return var10000
   }

   private fun cancelWaypointRename() {
      this.renamingWaypointName = null
      this.renamingWaypointText = ""
   }

   public fun setSearchQuery(query: String) {
      val var10000: java.lang.String = StringsKt.trim(query).toString().toLowerCase(Locale.ROOT)
      if (!(var10000 == this.normalizedSearch)) {
         this.normalizedSearch = var10000
         this.scroll = ScrollUtil(0.0F, 1, null)
      }
   }

   public fun scrollContentHeight(): Float {
      return this.cachedTotalHeight
   }

   private fun renderCreateButton(bounds: شذ, mouseX: Int, mouseY: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial oxxxde/رِ.canCreateWaypoint ()Z
      // 004: istore 4
      // 006: aload 0
      // 007: getfield oxxxde/رِ.createButtonAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 00a: iload 4
      // 00c: ifeq 014
      // 00f: fconst_1
      // 010: nop
      // 011: goto 016
      // 014: fconst_0
      // 015: nop
      // 016: ldc_w 220.0
      // 019: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 01c: astore 6
      // 01e: new oxxxde/خش
      // 021: dup
      // 022: aload 6
      // 024: invokespecial oxxxde/خش.<init> (Loxxxde/بف;)V
      // 027: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 02a: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 02d: fconst_0
      // 02e: nop
      // 02f: fconst_1
      // 030: nop
      // 031: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 034: fstore 5
      // 036: aload 0
      // 037: getfield oxxxde/رِ.createButtonHoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 03a: aload 0
      // 03b: aload 1
      // 03c: iload 2
      // 03d: nop
      // 03e: i2f
      // 03f: iload 3
      // 040: nop
      // 041: i2f
      // 042: invokespecial oxxxde/رِ.inside (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;FF)Z
      // 045: ifeq 04d
      // 048: fconst_1
      // 049: nop
      // 04a: goto 04f
      // 04d: fconst_0
      // 04e: nop
      // 04f: ldc_w 170.0
      // 052: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 055: astore 7
      // 057: new oxxxde/ظف
      // 05a: dup
      // 05b: aload 7
      // 05d: invokespecial oxxxde/ظف.<init> (Loxxxde/بف;)V
      // 060: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 063: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 066: fconst_0
      // 067: nop
      // 068: fconst_1
      // 069: nop
      // 06a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 06d: fstore 6
      // 06f: aload 0
      // 070: invokevirtual oxxxde/رِ.getAlpha ()F
      // 073: ldc_w 255.0
      // 076: fmul
      // 077: f2i
      // 078: bipush 0
      // 079: nop
      // 07a: sipush 255
      // 07d: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 080: istore 7
      // 082: ldc_w 255.0
      // 085: ldc_w 10.0
      // 088: fload 6
      // 08a: fmul
      // 08b: fsub
      // 08c: f2i
      // 08d: bipush 0
      // 08e: nop
      // 08f: sipush 255
      // 092: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 095: istore 8
      // 097: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 09a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 09d: ldc_w 0.01
      // 0a0: ldc_w 0.025
      // 0a3: fload 6
      // 0a5: fmul
      // 0a6: fadd
      // 0a7: aload 0
      // 0a8: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0ab: fmul
      // 0ac: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0af: new java/awt/Color
      // 0b2: dup
      // 0b3: iload 8
      // 0b5: iload 8
      // 0b7: iload 8
      // 0b9: iload 7
      // 0bb: invokespecial java/awt/Color.<init> (IIII)V
      // 0be: fload 5
      // 0c0: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0c3: astore 9
      // 0c5: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0c8: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0cb: ldc_w 0.07
      // 0ce: ldc_w 0.05
      // 0d1: fload 6
      // 0d3: fmul
      // 0d4: fadd
      // 0d5: aload 0
      // 0d6: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0d9: fmul
      // 0da: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0dd: new java/awt/Color
      // 0e0: dup
      // 0e1: iload 8
      // 0e3: iload 8
      // 0e5: iload 8
      // 0e7: iload 7
      // 0e9: invokespecial java/awt/Color.<init> (IIII)V
      // 0ec: fload 5
      // 0ee: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0f1: astore 10
      // 0f3: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0f6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0f9: ldc_w 0.48
      // 0fc: aload 0
      // 0fd: invokevirtual oxxxde/رِ.getAlpha ()F
      // 100: fmul
      // 101: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 104: new java/awt/Color
      // 107: dup
      // 108: bipush 0
      // 109: nop
      // 10a: bipush 0
      // 10b: nop
      // 10c: bipush 0
      // 10d: nop
      // 10e: iload 7
      // 110: invokespecial java/awt/Color.<init> (IIII)V
      // 113: fload 5
      // 115: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 118: astore 11
      // 11a: aload 0
      // 11b: getfield oxxxde/رِ.inputHeight F
      // 11e: ldc_w 0.27
      // 121: fmul
      // 122: fstore 12
      // 124: ldc_w "Создать"
      // 127: astore 13
      // 129: aload 1
      // 12a: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 12d: aload 1
      // 12e: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 131: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 134: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 137: aload 13
      // 139: fload 12
      // 13b: fconst_0
      // 13c: nop
      // 13d: bipush 4
      // 13e: nop
      // 13f: aconst_null
      // 140: nop
      // 141: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 144: fsub
      // 145: ldc_w 0.5
      // 148: fmul
      // 149: fadd
      // 14a: fstore 14
      // 14c: aload 1
      // 14d: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 150: aload 1
      // 151: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 154: fload 12
      // 156: fsub
      // 157: ldc_w 0.46
      // 15a: fmul
      // 15b: fadd
      // 15c: fstore 15
      // 15e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 161: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 164: aload 0
      // 165: invokevirtual oxxxde/رِ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 168: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 16b: aload 9
      // 16d: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 170: ldc_w 4.0
      // 173: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 176: fconst_1
      // 177: nop
      // 178: aload 10
      // 17a: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 17d: aload 1
      // 17e: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 181: aload 1
      // 182: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 185: aload 1
      // 186: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 189: aload 1
      // 18a: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 18d: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 190: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 193: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 196: aload 0
      // 197: invokevirtual oxxxde/رِ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 19a: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 19d: aload 13
      // 19f: fload 14
      // 1a1: fload 15
      // 1a3: fload 12
      // 1a5: aload 11
      // 1a7: fconst_0
      // 1a8: nop
      // 1a9: fconst_0
      // 1aa: nop
      // 1ab: fconst_0
      // 1ac: nop
      // 1ad: bipush 0
      // 1ae: nop
      // 1af: fconst_0
      // 1b0: nop
      // 1b1: sipush 992
      // 1b4: aconst_null
      // 1b5: nop
      // 1b6: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1b9: return
   }

   init {
      this.panelWidth = panelWidth
      this.contentTopOffset = contentTopOffset
      this.rowHeight = 33.0F
      this.rowNameEditorHeight = 10.8F
      this.rowNameEditorTextSize = 5.9F
      this.rowNameEditorBoxTextPadding = 4.0F
      this.rowNameEditorSelectedExpand = 6.0F
      this.rowNameEditorMinWidth = 26.0F
      this.inputHeight = 22.0F
      this.footerReservedHeight = 30.0F
      this.actionButtonSize = this.inputHeight
      this.createButtonWidth = 80.0F
      this.rowActionAreaSize = 14.0F
      this.rowActionButtonGap = 4.0F
      this.rowActionIconSize = 6.2F
      this.nameFieldMaxLength = 24
      this.coordinateFieldMaxLength = 9
      this.deleteHoverAnimation = HashMap<>()
      this.renameHoverAnimation = HashMap<>()
      this.rowHoverAnimation = HashMap<>()
      this.listAnimations = ثّ<>(0.0F, 0.0F, 3, null)
      this.inputFocusAnimations = HashMap<>()
      this.createButtonAnimation = AnimationUtil(0.0F, 1, null)
      this.createButtonHoverAnimation = AnimationUtil(0.0F, 1, null)
      this.settingsPageAnimation = AnimationUtil(0.0F, 1, null)
      this.actionButtonHoverAnimation = AnimationUtil(0.0F, 1, null)
      this.emptyStateAnimation = AnimationUtil(0.0F, 1, null)
      this.renameWidthAnim = AnimationUtil(0.0F, 1, null)
      this.renameFocusAnim = AnimationUtil(0.0F, 1, null)
      val `$this$mapNotNull$iv`: java.lang.Iterable = WayPointModule.INSTANCE.getSettings()
      val var4: ثس = ثس.INSTANCE
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv$iv` in `$this$mapNotNull$iv`) {
         val var10000: ModuleSettingComponent = var4.create(`element$iv$iv$iv` as Setting<*>)
         if (var10000 != null) {
            `destination$iv$iv`.add(var10000)
         }
      }

      this.settingComponents = `destination$iv$iv` as MutableList<ModuleSettingComponent<*>>
      this.scroll = ScrollUtil(0.0F, 1, null)
      this.normalizedSearch = ""
      this.renamingWaypointText = ""
      this.lastRenameInputWidth = this.rowNameEditorMinWidth
      this.lastRenameMaxInputWidth = this.rowNameEditorMinWidth
      this.renderedWayPoints = CollectionsKt.emptyList()
      this.nameText = ""
      this.xText = ""
      this.yText = ""
      this.zText = ""
   }

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }

   private fun rowNameEditorBounds(rowX: Float, rowY: Float, rowWidth: Float): شذ {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 1
      // 002: fload 2
      // 003: fload 3
      // 004: invokespecial oxxxde/رِ.renameButtonBounds (FFF)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 007: astore 4
      // 009: fload 1
      // 00a: aload 0
      // 00b: invokevirtual oxxxde/رِ.getPadding ()F
      // 00e: ldc_w 1.5
      // 011: fmul
      // 012: fadd
      // 013: fstore 5
      // 015: aload 4
      // 017: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 01a: fload 5
      // 01c: fsub
      // 01d: aload 0
      // 01e: invokevirtual oxxxde/رِ.getPadding ()F
      // 021: ldc_w 0.8
      // 024: fmul
      // 025: fsub
      // 026: fconst_0
      // 027: nop
      // 028: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 02b: fstore 6
      // 02d: aload 0
      // 02e: getfield oxxxde/رِ.renamingWaypointText Ljava/lang/String;
      // 031: checkcast java/lang/CharSequence
      // 034: astore 8
      // 036: aload 8
      // 038: invokeinterface java/lang/CharSequence.length ()I 1
      // 03d: ifne 045
      // 040: bipush 1
      // 041: nop
      // 042: goto 047
      // 045: bipush 0
      // 046: nop
      // 047: ifeq 054
      // 04a: bipush 0
      // 04b: nop
      // 04c: istore 9
      // 04e: ldc_w "Text.."
      // 051: goto 056
      // 054: aload 8
      // 056: checkcast java/lang/String
      // 059: astore 7
      // 05b: aload 0
      // 05c: invokevirtual oxxxde/رِ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 05f: aload 7
      // 061: aload 0
      // 062: getfield oxxxde/رِ.rowNameEditorTextSize F
      // 065: fconst_0
      // 066: nop
      // 067: bipush 4
      // 068: nop
      // 069: aconst_null
      // 06a: nop
      // 06b: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 06e: fstore 8
      // 070: fload 8
      // 072: aload 0
      // 073: getfield oxxxde/رِ.rowNameEditorBoxTextPadding F
      // 076: fconst_2
      // 077: nop
      // 078: fmul
      // 079: fadd
      // 07a: fstore 9
      // 07c: fload 9
      // 07e: aload 0
      // 07f: getfield oxxxde/رِ.rowNameEditorSelectedExpand F
      // 082: fadd
      // 083: fstore 10
      // 085: aload 0
      // 086: getfield oxxxde/رِ.rowNameEditorMinWidth F
      // 089: fload 6
      // 08b: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 08e: fstore 11
      // 090: fload 6
      // 092: fconst_0
      // 093: nop
      // 094: fcmpg
      // 095: ifgt 09d
      // 098: fconst_0
      // 099: nop
      // 09a: goto 0a6
      // 09d: fload 10
      // 09f: fload 11
      // 0a1: fload 6
      // 0a3: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0a6: fstore 12
      // 0a8: fload 12
      // 0aa: aload 0
      // 0ab: getfield oxxxde/رِ.lastRenameInputWidth F
      // 0ae: fcmpl
      // 0af: ifle 0b8
      // 0b2: ldc_w 70.0
      // 0b5: goto 0bb
      // 0b8: ldc_w 240.0
      // 0bb: fstore 13
      // 0bd: aload 0
      // 0be: getfield oxxxde/رِ.renameWidthAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0c1: fload 12
      // 0c3: fload 13
      // 0c5: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0c8: astore 15
      // 0ca: new oxxxde/طت
      // 0cd: dup
      // 0ce: aload 15
      // 0d0: invokespecial oxxxde/طت.<init> (Loxxxde/بف;)V
      // 0d3: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0d6: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0d9: fstore 14
      // 0db: aload 0
      // 0dc: fload 14
      // 0de: putfield oxxxde/رِ.lastRenameInputWidth F
      // 0e1: aload 0
      // 0e2: fload 6
      // 0e4: putfield oxxxde/رِ.lastRenameMaxInputWidth F
      // 0e7: new kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea
      // 0ea: dup
      // 0eb: fload 5
      // 0ed: fload 2
      // 0ee: aload 0
      // 0ef: invokevirtual oxxxde/رِ.getPadding ()F
      // 0f2: ldc_w 1.5
      // 0f5: fmul
      // 0f6: fadd
      // 0f7: ldc_w 1.8
      // 0fa: fsub
      // 0fb: fload 14
      // 0fd: aload 0
      // 0fe: getfield oxxxde/رِ.rowNameEditorHeight F
      // 101: invokespecial kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.<init> (FFFF)V
      // 104: areturn
   }

   private fun renderInputBox(bounds: تك, value: String, placeholder: String, focused: Boolean) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield oxxxde/رِ.inputFocusAnimations Ljava/util/HashMap;
      // 004: checkcast java/util/Map
      // 007: astore 6
      // 009: aload 1
      // 00a: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getField ()Lkotakbaz/rain/ui/menu/PointsCategoryComponent$InputField;
      // 00d: astore 7
      // 00f: bipush 0
      // 010: nop
      // 011: istore 8
      // 013: aload 6
      // 015: aload 7
      // 017: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 01c: astore 9
      // 01e: aload 9
      // 020: ifnonnull 047
      // 023: bipush 0
      // 024: nop
      // 025: istore 10
      // 027: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 02a: dup
      // 02b: fconst_0
      // 02c: nop
      // 02d: bipush 1
      // 02e: nop
      // 02f: aconst_null
      // 030: nop
      // 031: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 034: astore 10
      // 036: aload 6
      // 038: aload 7
      // 03a: aload 10
      // 03c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 041: pop
      // 042: aload 10
      // 044: goto 049
      // 047: aload 9
      // 049: nop
      // 04a: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 04d: iload 4
      // 04f: ifeq 057
      // 052: fconst_1
      // 053: nop
      // 054: goto 059
      // 057: fconst_0
      // 058: nop
      // 059: ldc_w 190.0
      // 05c: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 05f: astore 6
      // 061: new oxxxde/طم
      // 064: dup
      // 065: aload 6
      // 067: invokespecial oxxxde/طم.<init> (Loxxxde/بف;)V
      // 06a: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 06d: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 070: fconst_0
      // 071: nop
      // 072: fconst_1
      // 073: nop
      // 074: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 077: fstore 5
      // 079: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 07c: ldc_w 0.01
      // 07f: ldc_w 0.03
      // 082: fload 5
      // 084: fmul
      // 085: fadd
      // 086: aload 0
      // 087: invokevirtual oxxxde/رِ.getAlpha ()F
      // 08a: fmul
      // 08b: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 08e: astore 6
      // 090: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 093: ldc_w 0.07
      // 096: ldc_w 0.04
      // 099: fload 5
      // 09b: fmul
      // 09c: fadd
      // 09d: aload 0
      // 09e: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0a1: fmul
      // 0a2: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0a5: astore 7
      // 0a7: aload 2
      // 0a8: nop
      // 0a9: checkcast java/lang/CharSequence
      // 0ac: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 0af: ifeq 0c3
      // 0b2: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b5: ldc_w 0.45
      // 0b8: aload 0
      // 0b9: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0bc: fmul
      // 0bd: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 0c0: goto 0d1
      // 0c3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0c6: ldc_w 0.76
      // 0c9: aload 0
      // 0ca: invokevirtual oxxxde/رِ.getAlpha ()F
      // 0cd: fmul
      // 0ce: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0d1: astore 8
      // 0d3: aload 0
      // 0d4: getfield oxxxde/رِ.inputHeight F
      // 0d7: ldc_w 0.27
      // 0da: fmul
      // 0db: fstore 9
      // 0dd: aload 2
      // 0de: nop
      // 0df: checkcast java/lang/CharSequence
      // 0e2: astore 11
      // 0e4: aload 11
      // 0e6: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 0e9: ifeq 100
      // 0ec: bipush 0
      // 0ed: nop
      // 0ee: istore 12
      // 0f0: iload 4
      // 0f2: ifeq 0fb
      // 0f5: ldc_w " "
      // 0f8: goto 0fd
      // 0fb: aload 3
      // 0fc: nop
      // 0fd: goto 102
      // 100: aload 11
      // 102: checkcast java/lang/String
      // 105: astore 10
      // 107: aload 1
      // 108: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getX ()F
      // 10b: aload 0
      // 10c: invokevirtual oxxxde/رِ.getPadding ()F
      // 10f: ldc_w 1.2
      // 112: fmul
      // 113: fadd
      // 114: fstore 11
      // 116: aload 1
      // 117: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getY ()F
      // 11a: aload 1
      // 11b: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getHeight ()F
      // 11e: fload 9
      // 120: fsub
      // 121: ldc_w 0.46
      // 124: fmul
      // 125: fadd
      // 126: fstore 12
      // 128: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 12b: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 12e: aload 0
      // 12f: invokevirtual oxxxde/رِ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 132: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 135: astore 13
      // 137: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 13a: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 13d: aload 0
      // 13e: invokevirtual oxxxde/رِ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 141: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 144: aload 6
      // 146: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 149: ldc_w 4.0
      // 14c: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 14f: fconst_1
      // 150: nop
      // 151: aload 7
      // 153: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 156: aload 1
      // 157: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getX ()F
      // 15a: aload 1
      // 15b: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getY ()F
      // 15e: aload 1
      // 15f: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getWidth ()F
      // 162: aload 1
      // 163: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds.getHeight ()F
      // 166: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 169: aload 13
      // 16b: aload 10
      // 16d: fload 11
      // 16f: fload 12
      // 171: fload 9
      // 173: aload 8
      // 175: fconst_0
      // 176: nop
      // 177: fconst_0
      // 178: nop
      // 179: fconst_0
      // 17a: nop
      // 17b: bipush 0
      // 17c: nop
      // 17d: fconst_0
      // 17e: nop
      // 17f: sipush 992
      // 182: aconst_null
      // 183: nop
      // 184: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 187: iload 4
      // 189: ifeq 1a2
      // 18c: invokestatic java/lang/System.currentTimeMillis ()J
      // 18f: ldc2_w 450
      // 192: ldiv
      // 193: ldc2_w 2
      // 196: lrem
      // 197: lconst_0
      // 198: nop
      // 199: lcmp
      // 19a: ifne 1a2
      // 19d: bipush 1
      // 19e: nop
      // 19f: goto 1a4
      // 1a2: bipush 0
      // 1a3: nop
      // 1a4: istore 14
      // 1a6: iload 14
      // 1a8: ifne 1ac
      // 1ab: return
      // 1ac: fload 11
      // 1ae: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1b1: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1b4: aload 10
      // 1b6: fload 9
      // 1b8: fconst_0
      // 1b9: nop
      // 1ba: bipush 4
      // 1bb: nop
      // 1bc: aconst_null
      // 1bd: nop
      // 1be: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 1c1: fadd
      // 1c2: fconst_1
      // 1c3: nop
      // 1c4: fadd
      // 1c5: fstore 15
      // 1c7: aload 13
      // 1c9: ldc_w "|"
      // 1cc: fload 15
      // 1ce: fload 12
      // 1d0: fload 9
      // 1d2: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1d5: ldc_w 0.86
      // 1d8: aload 0
      // 1d9: invokevirtual oxxxde/رِ.getAlpha ()F
      // 1dc: fmul
      // 1dd: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1e0: fconst_0
      // 1e1: nop
      // 1e2: fconst_0
      // 1e3: nop
      // 1e4: fconst_0
      // 1e5: nop
      // 1e6: bipush 0
      // 1e7: nop
      // 1e8: fconst_0
      // 1e9: nop
      // 1ea: sipush 992
      // 1ed: aconst_null
      // 1ee: nop
      // 1ef: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1f2: return
   }

   private fun canCreateWaypoint(): Boolean {
      val name: java.lang.String = StringsKt.trim(this.nameText).toString()
      return WayPointManager.INSTANCE.isValidName(name)
         && !WayPointManager.INSTANCE.hasWaypoint(name)
         && StringsKt.toIntOrNull(this.xText) != null
         && StringsKt.toIntOrNull(this.yText) != null
         && StringsKt.toIntOrNull(this.zText) != null
      }

   private fun inside(area: شذ, mouseX: Float, mouseY: Float): Boolean {
      return this.inside(area.left, area.top, area.width, area.height, mouseX, mouseY)
   }

   private fun sameWaypointName(first: String, second: String): Boolean {
      return StringsKt.equals(StringsKt.trim(first).toString(), StringsKt.trim(second).toString(), true)
   }

   public fun scrollOffsetValue(): Float {
      return this.scroll.value()
   }

   private fun isShiftDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 340) == 1 || GLFW.glfwGetKey(handle, 344) == 1
   }

   private fun settingsPageBounds(area: شذ): شذ {
      val bottomInset: java.lang.Iterable = this.settingComponents
      val contentHeight: java.util.Collection = ArrayList()

      for (`$i$f$fold` in bottomInset) {
         if ((`$i$f$fold` as ModuleSettingComponent).setting.isVisible()) {
            contentHeight.add(`$i$f$fold`)
         }
      }

      val visibleComponents: java.util.List = contentHeight as java.util.List
      val var16: Float = this.getPadding() * 0.45F
      val var17: Float = this.getPadding() * 0.75F
      val var18: Float = this.getPadding() * 0.75F
      val var20: java.lang.Iterable = visibleComponents
      var var24: Float = 0.0F

      for (`element$iv` in var20) {
         var24 += (`element$iv` as ModuleSettingComponent).componentHeight
      }

      return PointsCategoryComponent$PanelArea(
         area.left,
         area.top,
         area.width,
         RangesKt.coerceAtMost(var17 + (var24 + var16 * (float)RangesKt.coerceAtLeast(visibleComponents.size() - 1, 0)) + var18, area.height)
      )
   }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (this.settingsPageOpen && this.focusedField == null && this.renamingWaypointName == null) {
         for (`element$iv` in this.settingComponents) {
            (`element$iv` as ModuleSettingComponent).onKeyPress(mouseX, mouseY, button)
         }
      } else if (this.renamingWaypointName != null) {
         this.handleWaypointRenameKey(button)
      } else if (this.focusedField != null) {
         val field: PointsCategoryComponent$InputField = this.focusedField
         when (button) {
            32 -> {
               if (this.focusedField === PointsCategoryComponent$InputField.NAME) {
                  this.appendToField(this.focusedField, " ")
               }

               return
            }
            257, 335 -> {
               this.createWaypoint()
               return
            }
            258 -> {
               this.focusedField = this.focusedField.next()
               return
            }
            259 -> {
               this.updateField(this.focusedField, StringsKt.dropLast(this.fieldValue(this.focusedField), 1))
               return
            }
            261 -> {
               this.updateField(this.focusedField, "")
               return
            }
            else -> {
               val var10000: java.lang.String = this.resolveTypedKey(button)
               if (var10000 != null) {
                  this.appendKeyName(field, var10000)
               }
            }
         }
      }
   }

   public fun isSettingsPageOpen(): Boolean {
      return this.settingsPageOpen
   }

   private fun deleteButtonBounds(rowX: Float, rowY: Float, rowWidth: Float): شذ {
      return PointsCategoryComponent$PanelArea(
         rowX + rowWidth - this.getPadding() - this.rowActionAreaSize,
         rowY + (this.rowHeight - this.rowActionAreaSize) * 0.5F,
         this.rowActionAreaSize,
         this.rowActionAreaSize
      )
   }

   private fun isRenamingWaypoint(wayPoint: تف): Boolean {
      return this.renamingWaypointName == wayPoint.name
   }

   private fun createWaypoint() {
      if (this.canCreateWaypoint()) {
         var var10000: Int = StringsKt.toIntOrNull(this.xText)
         if (var10000 != null) {
            val x: Int = var10000
            var10000 = StringsKt.toIntOrNull(this.yText)
            if (var10000 != null) {
               val y: Int = var10000
               var10000 = StringsKt.toIntOrNull(this.zText)
               if (var10000 != null) {
                  if (WayPointManager.INSTANCE.add(StringsKt.trim(this.nameText).toString(), false, BlockPos(x, y, var10000)) === WayPointManager.AddResult.ADDED
                     )
                   {
                     this.nameText = ""
                     this.xText = ""
                     this.yText = ""
                     this.zText = ""
                     this.focusedField = null
                  }
               }
            }
         }
      }
   }

   public fun setScrollProgress(progress: Float, instant: Boolean = false) {
      val max: Float = this.scroll.max()
      if (max <= 0.0F) {
         this.scroll.setValue(0.0F).setTargetValue(0.0F)
      } else {
         val target: Float = -max * RangesKt.coerceIn(progress, 0.0F, 1.0F)
         this.scroll.setTargetValue(target)
         if (instant) {
            this.scroll.setValue(target)
         }
      }
   }

   private fun inside(x: Float, y: Float, width: Float, height: Float, mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height
   }

   public override fun onMouseScroll(mouseX: Int, mouseY: Int, vertical: Float) {
      super.onMouseScroll(mouseX, mouseY, vertical)
      val area: PointsCategoryComponent$PanelArea = this.contentArea()
      if (this.inside(this.listArea(area, this.footerArea(area)), (float)mouseX, (float)mouseY)) {
         if (!this.settingsPageOpen) {
            this.scrollWheel(vertical)
         }
      }
   }

   public fun clearInputFocus() {
      this.focusedField = null
      this.cancelWaypointRename()
   }

   private fun handleWaypointRenameKey(button: Int) {
      when (button) {
         32 -> {
            this.appendToWaypointRename(" ")
            return
         }
         256 -> {
            this.cancelWaypointRename()
            return
         }
         257, 335 -> {
            this.saveWaypointRename()
            return
         }
         259 -> {
            this.renamingWaypointText = StringsKt.dropLast(this.renamingWaypointText, 1)
            return
         }
         261 -> {
            this.renamingWaypointText = ""
            return
         }
         else -> {
            val var10000: java.lang.String = this.resolveTypedKey(button)
            if (var10000 != null) {
               if (this.isAllowedWaypointNameKey(var10000)) {
                  this.appendToWaypointRename(var10000)
               }
            }
         }
      }
   }

   private fun actionButtonBounds(area: شذ): شذ {
      return PointsCategoryComponent$PanelArea(
         this.createButtonBounds(area).left - this.getPadding() - this.actionButtonSize, this.inputRowTop(area), this.actionButtonSize, this.inputHeight
      )
   }

   private fun insideDelete(rowX: Float, rowY: Float, rowWidth: Float, mouseX: Float, mouseY: Float): Boolean {
      val bounds: PointsCategoryComponent$PanelArea = this.deleteButtonBounds(rowX, rowY, rowWidth)
      return this.inside(bounds.left, bounds.top, bounds.width, bounds.height, mouseX, mouseY)
   }

   private fun appendToWaypointRename(value: String) {
      if (value.length() != 0) {
         if (this.renamingWaypointText.length() < this.nameFieldMaxLength) {
            this.renamingWaypointText = StringsKt.take("${this.renamingWaypointText}$value", this.nameFieldMaxLength)
         }
      }
   }

   private fun contentArea(): شذ {
      val left: Float = this.getX() + this.panelWidth + this.getPadding()
      val right: Float = this.getX() + this.getWidth() - this.panelWidth / 3.0F
      val top: Float = this.getY() + this.contentTopOffset
      return PointsCategoryComponent$PanelArea(
         left, top, RangesKt.coerceAtLeast(right - left, 0.0F), RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0F)
      )
   }

   private fun inputRowTop(area: شذ): Float {
      return area.top + (area.height - this.inputHeight) * 0.5F
   }

   private fun canRenameWaypoint(originalName: String, candidateName: String): Boolean {
      val sanitizedCandidate: java.lang.String = StringsKt.trim(candidateName).toString()
      return WayPointManager.INSTANCE.isValidName(sanitizedCandidate)
         && (this.sameWaypointName(originalName, sanitizedCandidate) || !WayPointManager.INSTANCE.hasWaypoint(sanitizedCandidate))
      }

   public fun scrollViewHeight(): Float {
      return this.cachedViewHeight
   }

   private fun resolveTypedKey(button: Int): String? {
      var var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
      if (var10000 == null) {
         return null
      } else if (!this.isShiftDown()) {
         return var10000
      } else if (var10000 == "-") {
         return "_"
      } else {
         val `$this$all$iv`: java.lang.CharSequence = var10000
         var var5: Int = 0

         while (true) {
            if (var5 >= `$this$all$iv`.length()) {
               var9 = true
               break
            }

            if (!Character.isLetter(`$this$all$iv`.charAt(var5))) {
               var9 = false
               break
            }

            var5++
         }

         if (var9) {
            var10000 = var10000.toUpperCase(Locale.ROOT)
         } else {
            var10000 = var10000
         }

         return var10000
      }
   }

   private fun renderRowNameEditor(bounds: شذ, editorAlpha: Float) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 004: fconst_0
      // 005: nop
      // 006: fcmpg
      // 007: ifle 014
      // 00a: aload 1
      // 00b: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 00e: fconst_0
      // 00f: nop
      // 010: fcmpg
      // 011: ifgt 015
      // 014: return
      // 015: aload 0
      // 016: getfield oxxxde/رِ.renameFocusAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 019: fconst_1
      // 01a: nop
      // 01b: ldc_w 220.0
      // 01e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 021: astore 4
      // 023: new oxxxde/صف
      // 026: dup
      // 027: aload 4
      // 029: invokespecial oxxxde/صف.<init> (Loxxxde/بف;)V
      // 02c: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 02f: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 032: fstore 3
      // 033: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 036: fload 2
      // 037: ldc_w 0.05
      // 03a: fmul
      // 03b: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 03e: astore 4
      // 040: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 043: fload 2
      // 044: ldc_w 0.08
      // 047: fmul
      // 048: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 04b: astore 5
      // 04d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 050: fload 2
      // 051: ldc_w 0.42
      // 054: fmul
      // 055: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 058: astore 6
      // 05a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 05d: fload 2
      // 05e: ldc_w 0.82
      // 061: ldc_w 0.1
      // 064: fload 3
      // 065: fmul
      // 066: fadd
      // 067: fmul
      // 068: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 06b: astore 7
      // 06d: aload 0
      // 06e: getfield oxxxde/رِ.rowNameEditorTextSize F
      // 071: fstore 8
      // 073: aload 0
      // 074: getfield oxxxde/رِ.renamingWaypointText Ljava/lang/String;
      // 077: checkcast java/lang/CharSequence
      // 07a: astore 10
      // 07c: aload 10
      // 07e: invokeinterface java/lang/CharSequence.length ()I 1
      // 083: ifne 08b
      // 086: bipush 1
      // 087: nop
      // 088: goto 08d
      // 08b: bipush 0
      // 08c: nop
      // 08d: ifeq 09a
      // 090: bipush 0
      // 091: nop
      // 092: istore 11
      // 094: ldc_w ""
      // 097: goto 09c
      // 09a: aload 10
      // 09c: checkcast java/lang/String
      // 09f: astore 9
      // 0a1: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a4: ldc2_w 450
      // 0a7: ldiv
      // 0a8: ldc2_w 2
      // 0ab: lrem
      // 0ac: lconst_0
      // 0ad: nop
      // 0ae: lcmp
      // 0af: ifne 0b7
      // 0b2: bipush 1
      // 0b3: nop
      // 0b4: goto 0b9
      // 0b7: bipush 0
      // 0b8: nop
      // 0b9: istore 10
      // 0bb: aload 0
      // 0bc: invokevirtual oxxxde/رِ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 0bf: ldc_w "|"
      // 0c2: fload 8
      // 0c4: fconst_0
      // 0c5: nop
      // 0c6: bipush 4
      // 0c7: nop
      // 0c8: aconst_null
      // 0c9: nop
      // 0ca: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 0cd: ldc_w 0.5
      // 0d0: fadd
      // 0d1: fstore 11
      // 0d3: aload 1
      // 0d4: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 0d7: aload 0
      // 0d8: getfield oxxxde/رِ.rowNameEditorBoxTextPadding F
      // 0db: fconst_2
      // 0dc: nop
      // 0dd: fmul
      // 0de: fsub
      // 0df: fconst_1
      // 0e0: nop
      // 0e1: fsub
      // 0e2: fconst_0
      // 0e3: nop
      // 0e4: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0e7: fstore 12
      // 0e9: aload 1
      // 0ea: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 0ed: aload 0
      // 0ee: getfield oxxxde/رِ.lastRenameMaxInputWidth F
      // 0f1: fconst_1
      // 0f2: nop
      // 0f3: fsub
      // 0f4: fcmpl
      // 0f5: iflt 0fd
      // 0f8: bipush 1
      // 0f9: nop
      // 0fa: goto 0ff
      // 0fd: bipush 0
      // 0fe: nop
      // 0ff: istore 13
      // 101: iload 13
      // 103: ifeq 113
      // 106: aload 0
      // 107: aload 9
      // 109: fload 12
      // 10b: fload 8
      // 10d: invokespecial oxxxde/رِ.trimTextToFit (Ljava/lang/String;FF)Ljava/lang/String;
      // 110: goto 115
      // 113: aload 9
      // 115: astore 14
      // 117: aload 0
      // 118: getfield oxxxde/رِ.renamingWaypointText Ljava/lang/String;
      // 11b: checkcast java/lang/CharSequence
      // 11e: invokeinterface java/lang/CharSequence.length ()I 1
      // 123: ifle 12b
      // 126: bipush 1
      // 127: nop
      // 128: goto 12d
      // 12b: bipush 0
      // 12c: nop
      // 12d: ifeq 135
      // 130: aload 7
      // 132: goto 137
      // 135: aload 6
      // 137: astore 15
      // 139: aload 0
      // 13a: invokevirtual oxxxde/رِ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 13d: aload 14
      // 13f: fload 8
      // 141: fconst_0
      // 142: nop
      // 143: bipush 4
      // 144: nop
      // 145: aconst_null
      // 146: nop
      // 147: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 14a: fstore 16
      // 14c: fload 16
      // 14e: fload 11
      // 150: fadd
      // 151: fstore 17
      // 153: aload 1
      // 154: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 157: aload 1
      // 158: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 15b: fload 17
      // 15d: fsub
      // 15e: ldc_w 0.5
      // 161: fmul
      // 162: fadd
      // 163: fstore 18
      // 165: aload 1
      // 166: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 169: ldc_w 1.8
      // 16c: fadd
      // 16d: fstore 19
      // 16f: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 172: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 175: aload 0
      // 176: invokevirtual oxxxde/رِ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 179: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 17c: astore 20
      // 17e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 181: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 184: aload 0
      // 185: invokevirtual oxxxde/رِ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 188: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 18b: aload 4
      // 18d: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 190: ldc_w 2.2
      // 193: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 196: ldc_w 0.95
      // 199: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 19c: fconst_1
      // 19d: nop
      // 19e: aload 5
      // 1a0: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1a3: aload 1
      // 1a4: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 1a7: aload 1
      // 1a8: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getTop ()F
      // 1ab: aload 1
      // 1ac: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getWidth ()F
      // 1af: aload 1
      // 1b0: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 1b3: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 1b6: aload 20
      // 1b8: aload 14
      // 1ba: fload 18
      // 1bc: fload 19
      // 1be: fload 8
      // 1c0: aload 15
      // 1c2: fconst_0
      // 1c3: nop
      // 1c4: fconst_0
      // 1c5: nop
      // 1c6: fconst_0
      // 1c7: nop
      // 1c8: bipush 0
      // 1c9: nop
      // 1ca: fconst_0
      // 1cb: nop
      // 1cc: sipush 992
      // 1cf: aconst_null
      // 1d0: nop
      // 1d1: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1d4: iload 10
      // 1d6: ifne 1da
      // 1d9: return
      // 1da: aload 20
      // 1dc: ldc_w "|"
      // 1df: fload 18
      // 1e1: fload 16
      // 1e3: fadd
      // 1e4: ldc_w 0.5
      // 1e7: fadd
      // 1e8: fload 19
      // 1ea: fload 8
      // 1ec: aload 15
      // 1ee: fconst_0
      // 1ef: nop
      // 1f0: fconst_0
      // 1f1: nop
      // 1f2: fconst_0
      // 1f3: nop
      // 1f4: bipush 0
      // 1f5: nop
      // 1f6: fconst_0
      // 1f7: nop
      // 1f8: sipush 992
      // 1fb: aconst_null
      // 1fc: nop
      // 1fd: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 200: return
   }

   public override fun render(mouseX: Int, mouseY: Int, partialTicks: Float) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 1
      // 002: iload 2
      // 003: nop
      // 004: fload 3
      // 005: invokespecial oxxxde/اظ.render (IIF)V
      // 008: aload 0
      // 009: invokespecial oxxxde/رِ.contentArea ()Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 00c: astore 4
      // 00e: aload 0
      // 00f: aload 4
      // 011: invokespecial oxxxde/رِ.footerArea (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 014: astore 5
      // 016: aload 0
      // 017: aload 4
      // 019: aload 5
      // 01b: invokespecial oxxxde/رِ.listArea (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 01e: astore 6
      // 020: aload 0
      // 021: aload 6
      // 023: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getHeight ()F
      // 026: putfield oxxxde/رِ.cachedViewHeight F
      // 029: aload 0
      // 02a: invokespecial oxxxde/رِ.filteredWayPoints ()Ljava/util/List;
      // 02d: astore 7
      // 02f: aload 0
      // 030: aload 0
      // 031: getfield oxxxde/رِ.listAnimations Loxxxde/ثّ;
      // 034: aload 7
      // 036: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/رِ.render$lambda$0 (Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Ljava/lang/String;, (Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Ljava/lang/String; ]
      // 03b: invokevirtual oxxxde/ثّ.update (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
      // 03e: putfield oxxxde/رِ.renderedWayPoints Ljava/util/List;
      // 041: aload 0
      // 042: getfield oxxxde/رِ.settingsPageAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 045: aload 0
      // 046: getfield oxxxde/رِ.settingsPageOpen Z
      // 049: ifeq 051
      // 04c: fconst_1
      // 04d: nop
      // 04e: goto 053
      // 051: fconst_0
      // 052: nop
      // 053: ldc_w 240.0
      // 056: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 059: astore 9
      // 05b: new oxxxde/زط
      // 05e: dup
      // 05f: aload 9
      // 061: invokespecial oxxxde/زط.<init> (Loxxxde/بف;)V
      // 064: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 067: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 06a: fconst_0
      // 06b: nop
      // 06c: fconst_1
      // 06d: nop
      // 06e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 071: fstore 8
      // 073: fconst_1
      // 074: nop
      // 075: fload 8
      // 077: fsub
      // 078: fstore 9
      // 07a: aload 0
      // 07b: aload 0
      // 07c: aload 7
      // 07e: invokeinterface java/util/List.size ()I 1
      // 083: invokespecial oxxxde/رِ.contentHeight (I)F
      // 086: fload 9
      // 088: fmul
      // 089: putfield oxxxde/رِ.cachedTotalHeight F
      // 08c: aload 0
      // 08d: getfield oxxxde/رِ.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 090: aload 0
      // 091: getfield oxxxde/رِ.cachedTotalHeight F
      // 094: aload 0
      // 095: getfield oxxxde/رِ.cachedViewHeight F
      // 098: fsub
      // 099: fconst_0
      // 09a: nop
      // 09b: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 09e: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.setMax (F)Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 0a1: pop
      // 0a2: aload 0
      // 0a3: getfield oxxxde/رِ.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 0a6: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.update ()V
      // 0a9: fload 9
      // 0ab: ldc_w 0.001
      // 0ae: fcmpl
      // 0af: ifle 0e1
      // 0b2: aload 0
      // 0b3: aload 6
      // 0b5: aload 6
      // 0b7: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 0ba: fload 8
      // 0bc: ldc_w 8.0
      // 0bf: fmul
      // 0c0: fsub
      // 0c1: fconst_0
      // 0c2: nop
      // 0c3: fconst_0
      // 0c4: nop
      // 0c5: fconst_0
      // 0c6: nop
      // 0c7: bipush 14
      // 0c9: aconst_null
      // 0ca: nop
      // 0cb: invokestatic kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.copy$default (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;FFFFILjava/lang/Object;)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 0ce: aload 0
      // 0cf: getfield oxxxde/رِ.renderedWayPoints Ljava/util/List;
      // 0d2: aload 0
      // 0d3: getfield oxxxde/رِ.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 0d6: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.value ()F
      // 0d9: iload 1
      // 0da: iload 2
      // 0db: nop
      // 0dc: fload 9
      // 0de: invokespecial oxxxde/رِ.renderList (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;Ljava/util/List;FIIF)V
      // 0e1: fload 8
      // 0e3: ldc_w 0.001
      // 0e6: fcmpl
      // 0e7: ifle 112
      // 0ea: aload 0
      // 0eb: aload 6
      // 0ed: aload 6
      // 0ef: invokevirtual kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.getLeft ()F
      // 0f2: fconst_1
      // 0f3: nop
      // 0f4: fload 8
      // 0f6: fsub
      // 0f7: ldc_w 8.0
      // 0fa: fmul
      // 0fb: fadd
      // 0fc: fconst_0
      // 0fd: nop
      // 0fe: fconst_0
      // 0ff: nop
      // 100: fconst_0
      // 101: nop
      // 102: bipush 14
      // 104: aconst_null
      // 105: nop
      // 106: invokestatic kotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea.copy$default (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;FFFFILjava/lang/Object;)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;
      // 109: iload 1
      // 10a: iload 2
      // 10b: nop
      // 10c: fload 3
      // 10d: fload 8
      // 10f: invokespecial oxxxde/رِ.renderSettingsPage (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;IIFF)V
      // 112: aload 7
      // 114: invokeinterface java/util/List.isEmpty ()Z 1
      // 119: ifeq 13f
      // 11c: aload 0
      // 11d: getfield oxxxde/رِ.normalizedSearch Ljava/lang/String;
      // 120: checkcast java/lang/CharSequence
      // 123: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 126: ifne 12e
      // 129: bipush 1
      // 12a: nop
      // 12b: goto 130
      // 12e: bipush 0
      // 12f: nop
      // 130: ifeq 13f
      // 133: aload 0
      // 134: getfield oxxxde/رِ.settingsPageOpen Z
      // 137: ifne 13f
      // 13a: bipush 1
      // 13b: nop
      // 13c: goto 141
      // 13f: bipush 0
      // 140: nop
      // 141: istore 10
      // 143: aload 0
      // 144: getfield oxxxde/رِ.emptyStateAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 147: iload 10
      // 149: ifeq 151
      // 14c: fconst_1
      // 14d: nop
      // 14e: goto 153
      // 151: fconst_0
      // 152: nop
      // 153: ldc_w 190.0
      // 156: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 159: astore 12
      // 15b: new oxxxde/تّ
      // 15e: dup
      // 15f: aload 12
      // 161: invokespecial oxxxde/تّ.<init> (Loxxxde/بف;)V
      // 164: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 167: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 16a: fconst_0
      // 16b: nop
      // 16c: fconst_1
      // 16d: nop
      // 16e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 171: fstore 11
      // 173: fload 11
      // 175: ldc_w 0.001
      // 178: fcmpl
      // 179: ifle 184
      // 17c: aload 0
      // 17d: aload 6
      // 17f: fload 11
      // 181: invokespecial oxxxde/رِ.renderEmptyState (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;F)V
      // 184: aload 0
      // 185: aload 5
      // 187: iload 1
      // 188: iload 2
      // 189: nop
      // 18a: invokespecial oxxxde/رِ.renderFooter (Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;II)V
      // 18d: return
   }

   private fun updateField(field: زً, value: String) {
      when (جْ.$EnumSwitchMapping$1[field.ordinal()]) {
         1 -> this.nameText = value
         2 -> this.xText = value
         3 -> this.yText = value
         4 -> this.zText = value
         else -> throw NoWhenBranchMatchedException()
      }
   }

   public fun scrollWheel(vertical: Float) {
      this.scroll.scroll(vertical * 2.5F)
   }

   private fun footerArea(area: شذ): شذ {
      val footerHeight: Float = RangesKt.coerceAtMost(this.footerReservedHeight, area.height)
      return PointsCategoryComponent$PanelArea(area.left, area.top + area.height - footerHeight, area.width, footerHeight)
   }

   private fun appendToField(field: زً, value: String) {
      if (value.length() != 0) {
         val current: java.lang.String = this.fieldValue(field)
         val maxLength: Int = if (field === PointsCategoryComponent$InputField.NAME) this.nameFieldMaxLength else this.coordinateFieldMaxLength
         if (current.length() < maxLength) {
            this.updateField(field, StringsKt.take("$current$value", maxLength))
         }
      }
   }

   private fun trimTextToFit(text: String, maxWidth: Float, size: Float): String {
      if (maxWidth <= 0.0F) {
         return ""
      } else {
         var candidate: java.lang.String = text

         while (candidate.length() > 0 && Font.getWidth$default(this.getDefaultFont(), candidate, size, 0.0F, 4, null) > maxWidth) {
            candidate = StringsKt.dropLast(candidate, 1)
         }

         return candidate
      }
   }
}
