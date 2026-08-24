package kotakbaz.rain.ui.menu

import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.ui.api.PipelinedRender
import oxxxde.اظ
import oxxxde.رَ
import oxxxde.زص
import oxxxde.صؤ

// $VF: Compiled from heavy
public class ConfigEntryComponent(configName: String,
      displayName: String,
      authorName: String,
      cloudConfig: Boolean,
      ownedCloudConfig: Boolean,
      sharedCloudConfig: Boolean,
      onLoad: (String) -> Unit,
      onSettings: (String) -> Unit,
      onDelete: (String) -> Unit
   )
   : اظ,
   PipelinedRender {
   private AnimationUtil settingsHoverAnimation;
   private final val authorName: String
   private AnimationUtil renameWidthAnimation;
   private AnimationUtil selectedAnimation;
   private final val nameEditorTextSize: Float
   private final val rowHeight: Float
   private AnimationUtil sharedIndicatorAnimation;
   private final val nameEditorSelectedExpand: Float
   public final var renameText: String
   public final val defaultHeight: Float
   public final val configName: String
   private final val onDelete: (String) -> Unit
   private final val nameEditorHeight: Float
   public final var renaming: Boolean
   private final val nameEditorTextPadding: Float
   private final val ownedCloudConfig: Boolean
   public final var loaded: Boolean
   private AnimationUtil deleteHoverAnimation;
   private final val nameEditorMinWidth: Float
   private final val onSettings: (String) -> Unit
   private final var lastRenameMaxInputWidth: Float
   private final val onLoad: (String) -> Unit
   private final val sharedCloudConfig: Boolean
   private final var lastRenameInputWidth: Float
   public final var selected: Boolean
   public final val displayName: String
   private AnimationUtil cardHoverAnimation;
   private AnimationUtil loadedAnimation;
   private AnimationUtil renameFocusAnimation;
   private final val cloudConfig: Boolean

   private fun settingsIconX(iconSize: Float): Float {
      val iconWidth: Float = Font.getWidth$default(this.getIconFont(), "f", iconSize, 0.0F, 4, null)
      return if (this.cloudConfig) this.cloudIconX(5.5F) - this.getPadding() - iconWidth else this.deleteIconX(6.2F) - this.getPadding() - iconWidth
   }

   init {
      this.configName = configName
      this.displayName = displayName
      this.authorName = authorName
      this.cloudConfig = cloudConfig
      this.ownedCloudConfig = ownedCloudConfig
      this.sharedCloudConfig = sharedCloudConfig
      this.onLoad = onLoad
      this.onSettings = onSettings
      this.onDelete = onDelete
      this.rowHeight = 33.0F
      this.nameEditorHeight = 10.8F
      this.nameEditorTextSize = 5.9F
      this.nameEditorTextPadding = 4.0F
      this.nameEditorSelectedExpand = 6.0F
      this.nameEditorMinWidth = 26.0F
      this.selectedAnimation = AnimationUtil(0.0F, 1, null)
      this.loadedAnimation = AnimationUtil(0.0F, 1, null)
      this.deleteHoverAnimation = AnimationUtil(0.0F, 1, null)
      this.settingsHoverAnimation = AnimationUtil(0.0F, 1, null)
      this.cardHoverAnimation = AnimationUtil(0.0F, 1, null)
      this.sharedIndicatorAnimation = AnimationUtil(0.0F, 1, null)
      this.renameWidthAnimation = AnimationUtil(0.0F, 1, null)
      this.renameFocusAnimation = AnimationUtil(0.0F, 1, null)
      this.lastRenameInputWidth = this.nameEditorMinWidth
      this.lastRenameMaxInputWidth = this.nameEditorMinWidth
      this.renameText = ""
      this.defaultHeight = this.rowHeight
   }

   private fun deleteIconX(iconSize: Float): Float {
      return this.getX() + this.getWidth() - this.getPadding() * 1.6F - Font.getWidth$default(this.getIconFont(), "i", iconSize, 0.0F, 4, null)
   }

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   public fun matchesMetadata(displayName: String, authorName: String, cloudConfig: Boolean, ownedCloudConfig: Boolean, sharedCloudConfig: Boolean): Boolean {
      return this.displayName == displayName
         && this.authorName == authorName
         && this.cloudConfig == cloudConfig
         && this.ownedCloudConfig == ownedCloudConfig
         && this.sharedCloudConfig == sharedCloudConfig
      }

   public fun isInsideSettings(mouseX: Float, mouseY: Float): Boolean {
      return this.settingsButtonBounds().contains(mouseX, mouseY)
   }

   private fun nameEditorBounds(): زص {
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
      // 00: aload 0
      // 01: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getX ()F
      // 04: aload 0
      // 05: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 08: ldc_w 1.5
      // 0b: fmul
      // 0c: fadd
      // 0d: fstore 1
      // 0e: aload 0
      // 0f: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.settingsButtonBounds ()Lkotakbaz/rain/ui/menu/ConfigEntryActionBounds;
      // 12: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getLeft ()F
      // 15: fload 1
      // 16: fsub
      // 17: aload 0
      // 18: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 1b: ldc_w 0.8
      // 1e: fmul
      // 1f: fsub
      // 20: fconst_0
      // 21: nop
      // 22: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 25: fstore 2
      // 26: aload 0
      // 27: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renameText Ljava/lang/String;
      // 2a: checkcast java/lang/CharSequence
      // 2d: astore 4
      // 2f: aload 4
      // 31: invokeinterface java/lang/CharSequence.length ()I 1
      // 36: ifne 3e
      // 39: bipush 1
      // 3a: nop
      // 3b: goto 40
      // 3e: bipush 0
      // 3f: nop
      // 40: ifeq 4d
      // 43: bipush 0
      // 44: nop
      // 45: istore 5
      // 47: ldc_w "Text.."
      // 4a: goto 4f
      // 4d: aload 4
      // 4f: checkcast java/lang/String
      // 52: astore 3
      // 53: aload 0
      // 54: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 57: aload 3
      // 58: nop
      // 59: aload 0
      // 5a: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextSize F
      // 5d: fconst_0
      // 5e: nop
      // 5f: bipush 4
      // 60: nop
      // 61: aconst_null
      // 62: nop
      // 63: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 66: fstore 4
      // 68: fload 4
      // 6a: aload 0
      // 6b: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextPadding F
      // 6e: fconst_2
      // 6f: nop
      // 70: fmul
      // 71: fadd
      // 72: aload 0
      // 73: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorSelectedExpand F
      // 76: fadd
      // 77: fstore 5
      // 79: aload 0
      // 7a: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorMinWidth F
      // 7d: fload 2
      // 7e: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 81: fstore 6
      // 83: fload 2
      // 84: fconst_0
      // 85: nop
      // 86: fcmpg
      // 87: ifgt 8f
      // 8a: fconst_0
      // 8b: nop
      // 8c: goto 97
      // 8f: fload 5
      // 91: fload 6
      // 93: fload 2
      // 94: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 97: fstore 7
      // 99: fload 7
      // 9b: aload 0
      // 9c: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.lastRenameInputWidth F
      // 9f: fcmpl
      // a0: ifle a9
      // a3: ldc_w 70.0
      // a6: goto ac
      // a9: ldc_w 240.0
      // ac: fstore 8
      // ae: aload 0
      // af: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renameWidthAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // b2: fload 7
      // b4: fload 8
      // b6: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // b9: astore 10
      // bb: new oxxxde/ثت
      // be: dup
      // bf: aload 10
      // c1: invokespecial oxxxde/ثت.<init> (Loxxxde/بف;)V
      // c4: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // c7: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // ca: fstore 9
      // cc: aload 0
      // cd: fload 9
      // cf: putfield kotakbaz/rain/ui/menu/ConfigEntryComponent.lastRenameInputWidth F
      // d2: aload 0
      // d3: fload 2
      // d4: putfield kotakbaz/rain/ui/menu/ConfigEntryComponent.lastRenameMaxInputWidth F
      // d7: new kotakbaz/rain/ui/menu/ConfigEntryActionBounds
      // da: dup
      // db: fload 1
      // dc: aload 0
      // dd: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // e0: aload 0
      // e1: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // e4: ldc_w 1.5
      // e7: fmul
      // e8: fadd
      // e9: ldc_w 1.8
      // ec: fsub
      // ed: fload 9
      // ef: aload 0
      // f0: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorHeight F
      // f3: invokespecial kotakbaz/rain/ui/menu/ConfigEntryActionBounds.<init> (FFFF)V
      // f6: areturn
   }

   private fun renderNameEditor(bounds: زص) {
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
      // 001: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getWidth ()F
      // 004: fconst_0
      // 005: nop
      // 006: fcmpg
      // 007: ifle 014
      // 00a: aload 1
      // 00b: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getHeight ()F
      // 00e: fconst_0
      // 00f: nop
      // 010: fcmpg
      // 011: ifgt 015
      // 014: return
      // 015: aload 0
      // 016: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renameFocusAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 019: fconst_1
      // 01a: nop
      // 01b: ldc_w 220.0
      // 01e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 021: astore 3
      // 022: new oxxxde/ظط
      // 025: dup
      // 026: aload 3
      // 027: nop
      // 028: invokespecial oxxxde/ظط.<init> (Loxxxde/بف;)V
      // 02b: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 02e: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 031: fstore 2
      // 032: aload 1
      // 033: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getWidth ()F
      // 036: aload 0
      // 037: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextPadding F
      // 03a: fconst_2
      // 03b: nop
      // 03c: fmul
      // 03d: fsub
      // 03e: fconst_1
      // 03f: nop
      // 040: fsub
      // 041: fconst_0
      // 042: nop
      // 043: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 046: fstore 3
      // 047: aload 1
      // 048: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getWidth ()F
      // 04b: aload 0
      // 04c: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.lastRenameMaxInputWidth F
      // 04f: fconst_1
      // 050: nop
      // 051: fsub
      // 052: fcmpl
      // 053: iflt 05b
      // 056: bipush 1
      // 057: nop
      // 058: goto 05d
      // 05b: bipush 0
      // 05c: nop
      // 05d: istore 4
      // 05f: iload 4
      // 061: ifeq 070
      // 064: aload 0
      // 065: aload 0
      // 066: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renameText Ljava/lang/String;
      // 069: fload 3
      // 06a: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.trimTextToFit (Ljava/lang/String;F)Ljava/lang/String;
      // 06d: goto 074
      // 070: aload 0
      // 071: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renameText Ljava/lang/String;
      // 074: astore 5
      // 076: aload 0
      // 077: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renameText Ljava/lang/String;
      // 07a: checkcast java/lang/CharSequence
      // 07d: invokeinterface java/lang/CharSequence.length ()I 1
      // 082: ifne 08a
      // 085: bipush 1
      // 086: nop
      // 087: goto 08c
      // 08a: bipush 0
      // 08b: nop
      // 08c: ifeq 0a0
      // 08f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 092: aload 0
      // 093: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 096: ldc_w 0.42
      // 099: fmul
      // 09a: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 09d: goto 0b4
      // 0a0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0a3: aload 0
      // 0a4: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 0a7: ldc_w 0.82
      // 0aa: ldc_w 0.1
      // 0ad: fload 2
      // 0ae: fmul
      // 0af: fadd
      // 0b0: fmul
      // 0b1: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 0b4: astore 6
      // 0b6: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b9: ldc2_w 450
      // 0bc: ldiv
      // 0bd: ldc2_w 2
      // 0c0: lrem
      // 0c1: lconst_0
      // 0c2: nop
      // 0c3: lcmp
      // 0c4: ifne 0cc
      // 0c7: bipush 1
      // 0c8: nop
      // 0c9: goto 0ce
      // 0cc: bipush 0
      // 0cd: nop
      // 0ce: istore 7
      // 0d0: aload 0
      // 0d1: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 0d4: ldc_w "|"
      // 0d7: aload 0
      // 0d8: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextSize F
      // 0db: fconst_0
      // 0dc: nop
      // 0dd: bipush 4
      // 0de: nop
      // 0df: aconst_null
      // 0e0: nop
      // 0e1: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 0e4: ldc_w 0.5
      // 0e7: fadd
      // 0e8: fstore 8
      // 0ea: aload 0
      // 0eb: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 0ee: aload 5
      // 0f0: aload 0
      // 0f1: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextSize F
      // 0f4: fconst_0
      // 0f5: nop
      // 0f6: bipush 4
      // 0f7: nop
      // 0f8: aconst_null
      // 0f9: nop
      // 0fa: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 0fd: fstore 9
      // 0ff: aload 1
      // 100: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getLeft ()F
      // 103: aload 1
      // 104: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getWidth ()F
      // 107: fload 9
      // 109: fsub
      // 10a: fload 8
      // 10c: fsub
      // 10d: ldc_w 0.5
      // 110: fmul
      // 111: fadd
      // 112: fstore 10
      // 114: aload 1
      // 115: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getTop ()F
      // 118: ldc_w 1.8
      // 11b: fadd
      // 11c: fstore 11
      // 11e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 121: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 124: aload 0
      // 125: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 128: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 12b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 12e: aload 0
      // 12f: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 132: ldc_w 0.05
      // 135: fmul
      // 136: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 139: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 13c: ldc_w 2.2
      // 13f: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 142: ldc_w 0.95
      // 145: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 148: fconst_1
      // 149: nop
      // 14a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 14d: aload 0
      // 14e: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 151: ldc_w 0.08
      // 154: fmul
      // 155: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 158: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 15b: aload 1
      // 15c: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getLeft ()F
      // 15f: aload 1
      // 160: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getTop ()F
      // 163: aload 1
      // 164: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getWidth ()F
      // 167: aload 1
      // 168: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getHeight ()F
      // 16b: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 16e: aload 0
      // 16f: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 172: aload 0
      // 173: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 176: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 179: aload 5
      // 17b: fload 10
      // 17d: fload 11
      // 17f: aload 0
      // 180: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextSize F
      // 183: aload 6
      // 185: fconst_0
      // 186: nop
      // 187: fconst_0
      // 188: nop
      // 189: fconst_0
      // 18a: nop
      // 18b: bipush 0
      // 18c: nop
      // 18d: fconst_0
      // 18e: nop
      // 18f: sipush 992
      // 192: aconst_null
      // 193: nop
      // 194: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 197: iload 7
      // 199: ifeq 1cd
      // 19c: aload 0
      // 19d: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1a0: aload 0
      // 1a1: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1a4: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 1a7: ldc_w "|"
      // 1aa: fload 10
      // 1ac: fload 9
      // 1ae: fadd
      // 1af: ldc_w 0.5
      // 1b2: fadd
      // 1b3: fload 11
      // 1b5: aload 0
      // 1b6: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorTextSize F
      // 1b9: aload 6
      // 1bb: fconst_0
      // 1bc: nop
      // 1bd: fconst_0
      // 1be: nop
      // 1bf: fconst_0
      // 1c0: nop
      // 1c1: bipush 0
      // 1c2: nop
      // 1c3: fconst_0
      // 1c4: nop
      // 1c5: sipush 992
      // 1c8: aconst_null
      // 1c9: nop
      // 1ca: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1cd: return
   }

   private fun isInsideDelete(mouseX: Float, mouseY: Float): Boolean {
      val iconX: Float = this.deleteIconX(8.0F)
      val iconY: Float = this.getY() + (this.getHeight() - this.getIconFont().getHeight(8.0F)) * 0.5F - 0.6F
      val areaX: Float = iconX - (14.0F - Font.getWidth$default(this.getIconFont(), "i", 8.0F, 0.0F, 4, null)) * 0.5F
      val areaY: Float = this.getY() + (this.getHeight() - 14.0F) * 0.5F
      return mouseX >= areaX && mouseX <= areaX + 14.0F && mouseY >= areaY && mouseY <= areaY + 14.0F
   }

   public fun isInsideRenameEditor(mouseX: Float, mouseY: Float): Boolean {
      if (!this.renaming) {
         return false
      } else {
         val left: Float = this.getX() + this.getPadding() * 1.5F
         val right: Float = this.settingsButtonBounds().left - this.getPadding() * 0.8F
         val top: Float = this.getY() + this.getPadding() * 1.5F - 1.8F
         return mouseX >= left && mouseX <= right && mouseY >= top && mouseY <= top + this.nameEditorHeight
      }
   }

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }

   private fun cloudIconX(iconSize: Float): Float {
      return this.deleteIconX(6.2F) - this.getPadding() - Font.getWidth$default(رَ.INSTANCE.ICON2, "4", iconSize, 0.0F, 4, null)
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (button == 0) {
         if (!(mouseX < this.getX()) && !(mouseX > this.getX() + this.getWidth()) && !(mouseY < this.getY()) && !(mouseY > this.getY() + this.getHeight())) {
            if (this.isInsideSettings((float)mouseX, (float)mouseY)) {
               this.onSettings(this.configName)
            } else if (this.isInsideDelete((float)mouseX, (float)mouseY)) {
               this.onDelete(this.configName)
            } else {
               this.onLoad(this.configName)
            }
         }
      }
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
      // 008: iload 1
      // 009: i2f
      // 00a: aload 0
      // 00b: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getX ()F
      // 00e: fcmpl
      // 00f: iflt 041
      // 012: iload 1
      // 013: i2f
      // 014: aload 0
      // 015: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getX ()F
      // 018: aload 0
      // 019: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getWidth ()F
      // 01c: fadd
      // 01d: fcmpg
      // 01e: ifgt 041
      // 021: iload 2
      // 022: nop
      // 023: i2f
      // 024: aload 0
      // 025: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 028: fcmpl
      // 029: iflt 041
      // 02c: iload 2
      // 02d: nop
      // 02e: i2f
      // 02f: aload 0
      // 030: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 033: aload 0
      // 034: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getHeight ()F
      // 037: fadd
      // 038: fcmpg
      // 039: ifgt 041
      // 03c: bipush 1
      // 03d: nop
      // 03e: goto 043
      // 041: bipush 0
      // 042: nop
      // 043: istore 4
      // 045: aload 0
      // 046: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.selectedAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 049: aload 0
      // 04a: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.selected Z
      // 04d: ifeq 055
      // 050: fconst_1
      // 051: nop
      // 052: goto 057
      // 055: fconst_0
      // 056: nop
      // 057: ldc_w 220.0
      // 05a: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 05d: astore 6
      // 05f: new oxxxde/صع
      // 062: dup
      // 063: aload 6
      // 065: invokespecial oxxxde/صع.<init> (Loxxxde/بف;)V
      // 068: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 06b: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 06e: fstore 5
      // 070: aload 0
      // 071: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.deleteHoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 074: iload 4
      // 076: ifeq 08a
      // 079: aload 0
      // 07a: iload 1
      // 07b: i2f
      // 07c: iload 2
      // 07d: nop
      // 07e: i2f
      // 07f: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.isInsideDelete (FF)Z
      // 082: ifeq 08a
      // 085: fconst_1
      // 086: nop
      // 087: goto 08c
      // 08a: fconst_0
      // 08b: nop
      // 08c: ldc_w 180.0
      // 08f: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 092: astore 7
      // 094: new oxxxde/ثص
      // 097: dup
      // 098: aload 7
      // 09a: invokespecial oxxxde/ثص.<init> (Loxxxde/بف;)V
      // 09d: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0a0: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0a3: fstore 6
      // 0a5: aload 0
      // 0a6: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.settingsHoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0a9: iload 4
      // 0ab: ifeq 0bf
      // 0ae: aload 0
      // 0af: iload 1
      // 0b0: i2f
      // 0b1: iload 2
      // 0b2: nop
      // 0b3: i2f
      // 0b4: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.isInsideSettings (FF)Z
      // 0b7: ifeq 0bf
      // 0ba: fconst_1
      // 0bb: nop
      // 0bc: goto 0c1
      // 0bf: fconst_0
      // 0c0: nop
      // 0c1: ldc_w 180.0
      // 0c4: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0c7: astore 8
      // 0c9: new oxxxde/ٌ
      // 0cc: dup
      // 0cd: aload 8
      // 0cf: invokespecial oxxxde/ٌ.<init> (Loxxxde/بف;)V
      // 0d2: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0d5: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0d8: fstore 7
      // 0da: aload 0
      // 0db: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.cardHoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0de: iload 4
      // 0e0: ifeq 0e8
      // 0e3: fconst_1
      // 0e4: nop
      // 0e5: goto 0ea
      // 0e8: fconst_0
      // 0e9: nop
      // 0ea: ldc_w 180.0
      // 0ed: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0f0: astore 9
      // 0f2: new oxxxde/خخ
      // 0f5: dup
      // 0f6: aload 9
      // 0f8: invokespecial oxxxde/خخ.<init> (Loxxxde/بف;)V
      // 0fb: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0fe: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 101: fconst_0
      // 102: nop
      // 103: fconst_1
      // 104: nop
      // 105: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 108: fstore 8
      // 10a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 10d: aload 0
      // 10e: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 111: ldc_w 0.03
      // 114: ldc_w 0.02
      // 117: fload 5
      // 119: fmul
      // 11a: fadd
      // 11b: ldc_w 0.015
      // 11e: fload 8
      // 120: fmul
      // 121: fadd
      // 122: fmul
      // 123: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 126: astore 9
      // 128: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 12b: aload 0
      // 12c: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 12f: ldc_w 0.05
      // 132: ldc_w 0.03
      // 135: fload 5
      // 137: fmul
      // 138: fadd
      // 139: ldc_w 0.035
      // 13c: fload 8
      // 13e: fmul
      // 13f: fadd
      // 140: fmul
      // 141: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 144: astore 10
      // 146: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 149: aload 0
      // 14a: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 14d: ldc_w 0.32
      // 150: ldc_w 0.68
      // 153: fload 5
      // 155: fmul
      // 156: fadd
      // 157: ldc_w 0.1
      // 15a: fload 8
      // 15c: fmul
      // 15d: fconst_1
      // 15e: nop
      // 15f: fload 5
      // 161: fsub
      // 162: fmul
      // 163: fadd
      // 164: fmul
      // 165: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 168: astore 11
      // 16a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 16d: aload 0
      // 16e: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 171: ldc_w 0.16
      // 174: ldc_w 0.34
      // 177: fload 5
      // 179: fmul
      // 17a: fadd
      // 17b: ldc_w 0.08
      // 17e: fload 8
      // 180: fmul
      // 181: fadd
      // 182: fmul
      // 183: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 186: astore 12
      // 188: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 18b: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 18e: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 191: fconst_0
      // 192: nop
      // 193: bipush 1
      // 194: nop
      // 195: aconst_null
      // 196: nop
      // 197: invokestatic oxxxde/ثْ.icon$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 19a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 19d: fconst_0
      // 19e: nop
      // 19f: bipush 1
      // 1a0: nop
      // 1a1: aconst_null
      // 1a2: nop
      // 1a3: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 1a6: fload 5
      // 1a8: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 1ab: aload 0
      // 1ac: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 1af: ldc_w 0.28
      // 1b2: ldc_w 0.42
      // 1b5: fload 5
      // 1b7: fmul
      // 1b8: fadd
      // 1b9: ldc_w 0.25
      // 1bc: fload 7
      // 1be: fmul
      // 1bf: fadd
      // 1c0: fconst_1
      // 1c1: nop
      // 1c2: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 1c5: fmul
      // 1c6: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 1c9: astore 13
      // 1cb: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1ce: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1d1: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1d4: fconst_0
      // 1d5: nop
      // 1d6: bipush 1
      // 1d7: nop
      // 1d8: aconst_null
      // 1d9: nop
      // 1da: invokestatic oxxxde/ثْ.icon$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 1dd: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1e0: fconst_0
      // 1e1: nop
      // 1e2: bipush 1
      // 1e3: nop
      // 1e4: aconst_null
      // 1e5: nop
      // 1e6: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 1e9: fload 5
      // 1eb: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 1ee: aload 0
      // 1ef: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 1f2: ldc_w 0.28
      // 1f5: ldc_w 0.42
      // 1f8: fload 5
      // 1fa: fmul
      // 1fb: fadd
      // 1fc: ldc_w 0.25
      // 1ff: fload 6
      // 201: fmul
      // 202: fadd
      // 203: fconst_1
      // 204: nop
      // 205: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 208: fmul
      // 209: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 20c: astore 14
      // 20e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 211: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 214: aload 0
      // 215: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 218: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 21b: aload 9
      // 21d: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 220: ldc 4.0
      // 222: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 225: ldc_w 0.95
      // 228: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 22b: fconst_1
      // 22c: nop
      // 22d: aload 10
      // 22f: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 232: aload 0
      // 233: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getX ()F
      // 236: aload 0
      // 237: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 23a: aload 0
      // 23b: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getWidth ()F
      // 23e: aload 0
      // 23f: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getHeight ()F
      // 242: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 245: ldc_w 8.0
      // 248: fstore 15
      // 24a: ldc_w 5.6
      // 24d: fstore 16
      // 24f: aload 0
      // 250: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getX ()F
      // 253: aload 0
      // 254: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 257: ldc_w 1.5
      // 25a: fmul
      // 25b: fadd
      // 25c: fstore 17
      // 25e: aload 0
      // 25f: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 262: aload 0
      // 263: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 266: ldc_w 1.5
      // 269: fmul
      // 26a: fadd
      // 26b: fstore 18
      // 26d: aload 0
      // 26e: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.renaming Z
      // 271: ifeq 27b
      // 274: aload 0
      // 275: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.nameEditorBounds ()Lkotakbaz/rain/ui/menu/ConfigEntryActionBounds;
      // 278: goto 27d
      // 27b: aconst_null
      // 27c: nop
      // 27d: astore 19
      // 27f: aload 19
      // 281: dup
      // 282: ifnull 29d
      // 285: astore 23
      // 287: bipush 0
      // 288: nop
      // 289: istore 24
      // 28b: aload 23
      // 28d: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getTop ()F
      // 290: aload 23
      // 292: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryActionBounds.getHeight ()F
      // 295: fadd
      // 296: ldc 4.0
      // 298: fadd
      // 299: nop
      // 29a: goto 2b3
      // 29d: pop
      // 29e: fload 18
      // 2a0: aload 0
      // 2a1: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 2a4: fload 15
      // 2a6: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 2a9: fadd
      // 2aa: aload 0
      // 2ab: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 2ae: ldc_w 1.5
      // 2b1: fdiv
      // 2b2: fadd
      // 2b3: fstore 20
      // 2b5: ldc 6.2
      // 2b7: fstore 21
      // 2b9: aload 0
      // 2ba: fload 21
      // 2bc: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.deleteIconX (F)F
      // 2bf: fstore 22
      // 2c1: aload 0
      // 2c2: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 2c5: aload 0
      // 2c6: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getHeight ()F
      // 2c9: aload 0
      // 2ca: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 2cd: fload 21
      // 2cf: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 2d2: fsub
      // 2d3: ldc_w 0.5
      // 2d6: fmul
      // 2d7: fadd
      // 2d8: ldc_w 0.2
      // 2db: fsub
      // 2dc: fstore 23
      // 2de: ldc "f"
      // 2e0: astore 24
      // 2e2: ldc 5.5
      // 2e4: fstore 25
      // 2e6: aload 0
      // 2e7: fload 25
      // 2e9: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.settingsIconX (F)F
      // 2ec: fstore 26
      // 2ee: aload 0
      // 2ef: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 2f2: astore 27
      // 2f4: aload 0
      // 2f5: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 2f8: aload 0
      // 2f9: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getHeight ()F
      // 2fc: aload 27
      // 2fe: fload 25
      // 300: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 303: fsub
      // 304: ldc_w 0.5
      // 307: fmul
      // 308: fadd
      // 309: fstore 28
      // 30b: ldc 5.5
      // 30d: fstore 29
      // 30f: aload 0
      // 310: fload 29
      // 312: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.cloudIconX (F)F
      // 315: fstore 30
      // 317: aload 0
      // 318: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 31b: aload 0
      // 31c: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getHeight ()F
      // 31f: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 322: invokevirtual oxxxde/رَ.getICON2 ()Lkotakbaz/rain/client/util/render/font/Font;
      // 325: fload 29
      // 327: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 32a: fsub
      // 32b: ldc_w 0.5
      // 32e: fmul
      // 32f: fadd
      // 330: fstore 31
      // 332: aload 0
      // 333: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.loadedAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 336: aload 0
      // 337: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.loaded Z
      // 33a: ifeq 342
      // 33d: fconst_1
      // 33e: nop
      // 33f: goto 344
      // 342: fconst_0
      // 343: nop
      // 344: ldc_w 220.0
      // 347: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 34a: astore 33
      // 34c: new oxxxde/صش
      // 34f: dup
      // 350: aload 33
      // 352: invokespecial oxxxde/صش.<init> (Loxxxde/بف;)V
      // 355: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 358: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 35b: fconst_0
      // 35c: nop
      // 35d: fconst_1
      // 35e: nop
      // 35f: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 362: fstore 32
      // 364: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 367: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 36a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 36d: fconst_0
      // 36e: nop
      // 36f: bipush 1
      // 370: nop
      // 371: aconst_null
      // 372: nop
      // 373: invokestatic oxxxde/ثْ.icon$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 376: new java/awt/Color
      // 379: dup
      // 37a: bipush 62
      // 37c: sipush 255
      // 37f: bipush 126
      // 381: invokespecial java/awt/Color.<init> (III)V
      // 384: fload 32
      // 386: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 389: aload 0
      // 38a: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 38d: ldc_w 0.28
      // 390: ldc_w 0.72
      // 393: fload 32
      // 395: fmul
      // 396: fadd
      // 397: fmul
      // 398: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 39b: astore 33
      // 39d: aload 0
      // 39e: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.sharedIndicatorAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 3a1: aload 0
      // 3a2: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.ownedCloudConfig Z
      // 3a5: ifeq 3b4
      // 3a8: aload 0
      // 3a9: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.sharedCloudConfig Z
      // 3ac: ifeq 3b4
      // 3af: fconst_1
      // 3b0: nop
      // 3b1: goto 3b6
      // 3b4: fconst_0
      // 3b5: nop
      // 3b6: ldc_w 220.0
      // 3b9: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 3bc: astore 35
      // 3be: new oxxxde/تي
      // 3c1: dup
      // 3c2: aload 35
      // 3c4: invokespecial oxxxde/تي.<init> (Loxxxde/بف;)V
      // 3c7: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 3ca: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 3cd: fconst_0
      // 3ce: nop
      // 3cf: fconst_1
      // 3d0: nop
      // 3d1: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 3d4: fstore 34
      // 3d6: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 3d9: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 3dc: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 3df: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3e2: fconst_0
      // 3e3: nop
      // 3e4: bipush 1
      // 3e5: nop
      // 3e6: aconst_null
      // 3e7: nop
      // 3e8: invokestatic oxxxde/ثْ.value$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 3eb: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3ee: fconst_0
      // 3ef: nop
      // 3f0: bipush 1
      // 3f1: nop
      // 3f2: aconst_null
      // 3f3: nop
      // 3f4: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 3f7: fload 5
      // 3f9: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 3fc: new java/awt/Color
      // 3ff: dup
      // 400: bipush 62
      // 402: sipush 255
      // 405: bipush 126
      // 407: invokespecial java/awt/Color.<init> (III)V
      // 40a: fload 34
      // 40c: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 40f: aload 0
      // 410: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getAlpha ()F
      // 413: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 416: astore 35
      // 418: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 41b: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 41e: aload 0
      // 41f: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 422: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 425: aload 35
      // 427: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 42a: ldc_w 0.3
      // 42d: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 430: aload 0
      // 431: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getX ()F
      // 434: aload 0
      // 435: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getWidth ()F
      // 438: fadd
      // 439: aload 0
      // 43a: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 43d: ldc_w 1.5
      // 440: fmul
      // 441: fsub
      // 442: aload 0
      // 443: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getY ()F
      // 446: aload 0
      // 447: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getPadding ()F
      // 44a: fadd
      // 44b: ldc_w 2.5
      // 44e: ldc_w 2.5
      // 451: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 454: aload 19
      // 456: ifnull 462
      // 459: aload 0
      // 45a: aload 19
      // 45c: invokespecial kotakbaz/rain/ui/menu/ConfigEntryComponent.renderNameEditor (Lkotakbaz/rain/ui/menu/ConfigEntryActionBounds;)V
      // 45f: goto 48b
      // 462: aload 0
      // 463: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 466: aload 0
      // 467: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 46a: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 46d: aload 0
      // 46e: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.displayName Ljava/lang/String;
      // 471: fload 17
      // 473: fload 18
      // 475: fload 15
      // 477: aload 11
      // 479: fconst_0
      // 47a: nop
      // 47b: fconst_0
      // 47c: nop
      // 47d: fconst_0
      // 47e: nop
      // 47f: bipush 0
      // 480: nop
      // 481: fconst_0
      // 482: nop
      // 483: sipush 992
      // 486: aconst_null
      // 487: nop
      // 488: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 48b: aload 0
      // 48c: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 48f: aload 0
      // 490: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 493: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 496: aload 0
      // 497: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.authorName Ljava/lang/String;
      // 49a: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Автор: \u0001" ]
      // 49f: fload 17
      // 4a1: fload 20
      // 4a3: fload 16
      // 4a5: aload 12
      // 4a7: fconst_0
      // 4a8: nop
      // 4a9: fconst_0
      // 4aa: nop
      // 4ab: fconst_0
      // 4ac: nop
      // 4ad: bipush 0
      // 4ae: nop
      // 4af: fconst_0
      // 4b0: nop
      // 4b1: sipush 992
      // 4b4: aconst_null
      // 4b5: nop
      // 4b6: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 4b9: aload 27
      // 4bb: aload 0
      // 4bc: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 4bf: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 4c2: aload 24
      // 4c4: fload 26
      // 4c6: fload 28
      // 4c8: fload 25
      // 4ca: aload 13
      // 4cc: fconst_0
      // 4cd: nop
      // 4ce: fconst_0
      // 4cf: nop
      // 4d0: fconst_0
      // 4d1: nop
      // 4d2: bipush 0
      // 4d3: nop
      // 4d4: fconst_0
      // 4d5: nop
      // 4d6: sipush 992
      // 4d9: aconst_null
      // 4da: nop
      // 4db: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 4de: aload 0
      // 4df: getfield kotakbaz/rain/ui/menu/ConfigEntryComponent.cloudConfig Z
      // 4e2: ifeq 50f
      // 4e5: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 4e8: invokevirtual oxxxde/رَ.getICON2 ()Lkotakbaz/rain/client/util/render/font/Font;
      // 4eb: aload 0
      // 4ec: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 4ef: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 4f2: ldc_w "4"
      // 4f5: fload 30
      // 4f7: fload 31
      // 4f9: fload 29
      // 4fb: aload 33
      // 4fd: fconst_0
      // 4fe: nop
      // 4ff: fconst_0
      // 500: nop
      // 501: fconst_0
      // 502: nop
      // 503: bipush 0
      // 504: nop
      // 505: fconst_0
      // 506: nop
      // 507: sipush 992
      // 50a: aconst_null
      // 50b: nop
      // 50c: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 50f: aload 0
      // 510: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 513: aload 0
      // 514: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 517: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 51a: ldc "i"
      // 51c: fload 22
      // 51e: fload 23
      // 520: fload 21
      // 522: aload 14
      // 524: fconst_0
      // 525: nop
      // 526: fconst_0
      // 527: nop
      // 528: fconst_0
      // 529: nop
      // 52a: bipush 0
      // 52b: nop
      // 52c: fconst_0
      // 52d: nop
      // 52e: sipush 992
      // 531: aconst_null
      // 532: nop
      // 533: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 536: return
   }

   public fun settingsButtonBounds(): زص {
      return ConfigEntryActionBounds(
         this.settingsIconX(5.5F) - (10.0F - Font.getWidth$default(this.getIconFont(), "f", 5.5F, 0.0F, 4, null)) * 0.5F,
         this.getY() + (this.getHeight() - 10.0F) * 0.5F,
         10.0F,
         10.0F
      )
   }

   private fun trimTextToFit(text: String, maxWidth: Float): String {
      if (maxWidth <= 0.0F) {
         return ""
      } else {
         var candidate: java.lang.String = text

         while (candidate.length() > 0 && Font.getWidth$default(this.getDefaultFont(), candidate, this.nameEditorTextSize, 0.0F, 4, null) > maxWidth) {
            candidate = StringsKt.dropLast(candidate, 1)
         }

         return candidate
      }
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }
}
