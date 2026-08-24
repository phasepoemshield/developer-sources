package oxxxde

import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Locale
import java.util.NoSuchElementException
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.other.ScrollUtil
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.config.CloudConfigOrigin
import kotakbaz.rain.config.ConfigInfo
import kotakbaz.rain.config.ConfigManager
import kotakbaz.rain.ui.api.PipelinedRender
import kotakbaz.rain.ui.menu.ConfigContentArea
import kotakbaz.rain.ui.menu.ConfigEntryActionBounds
import kotakbaz.rain.ui.menu.ConfigEntryComponent
import kotakbaz.rain.ui.menu.ConfigPage
import kotakbaz.rain.ui.menu.ConfigSettingsPopup
import kotakbaz.rain.ui.menu.ConfigSettingsPopupBounds
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public class ضز(panelWidth: Float,
      contentTopOffset: Float,
      onShareConfig: (String) -> Unit,
      onSaveToCloud: (String) -> Unit,
      onDeleteOwnedCloud: (String, String) -> Unit,
      onDeleteReceivedCloud: (String, String) -> Unit,
      onPageChanged: (Boolean) -> Unit = { it: Boolean ->
            Unit.INSTANCE
         }
   )
   : اظ,
   PipelinedRender {
   private final val configEntries: ArrayList<حم>
   private final val settingsPopupButtonGap: Float
   private final val pageTabsHeight: Float
   private final val onShareConfig: (String) -> Unit
   private final val contentTopOffset: Float
   private final val onDeleteOwnedCloud: (String, String) -> Unit
   private final var renamingConfigText: String
   private final var renderedConfigEntries: List<جة<حم>>
   private final val settingsPopupInset: Float
   private final val pageTabButtonHeight: Float
   private final val settingsPopupIconSize: Float
   private final val settingsPopupTextOpticalOffset: Float
   private final val pageTabsGap: Float
   private final var pageSlideDirection: Float
   private final val configNameMaxLength: Int
   private final var settingsPopupOpen: Boolean
   private final val onSaveToCloud: (String) -> Unit
   private final val onDeleteReceivedCloud: (String, String) -> Unit
   private final var cachedTotalHeight: Float
   private final val saveCloudConfigButton: Pair<String, String>
   private AnimationUtil emptyStateAnimation;
   private final var configStateVersion: Int
   private final val settingsPopupButtonHeight: Float
   private final val settingsPopupButtonHoverAnimations: List<ري>
   private final val settingsPopupTextSize: Float
   private AnimationUtil pageIndicatorAnimation;
   private final val settingsPopupIconGap: Float
   private final var settingsPopupConfigName: String?
   private final var renamingConfigName: String?
   private final var configs: List<صٌ>
   private final val shareConfigButton: Pair<String, String>
   private final val pageTabHoverAnimations: List<ري>
   private ScrollUtil scroll;
   private final val columnCount: Int
   private final val renameConfigButton: Pair<String, String>
   private final val settingsPopupButtonHorizontalPadding: Float
   private AnimationUtil settingsPopupAnimation;
   private final var cachedViewHeight: Float
   private final val onPageChanged: (Boolean) -> Unit
   private final val panelWidth: Float
   private ConfigPage currentPage;
   private final val settingsPopupHeight: Float
   private AnimationUtil pageContentAnimation;
   private final val configListAnimations: ثّ<String, حم>

   private fun renderPageTab(area: ذأ, index: Int, label: String, activeProgress: Float, mouseX: Int, mouseY: Int) {
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
      // 001: aload 1
      // 002: invokespecial oxxxde/ضز.pageTabWidth (Lkotakbaz/rain/ui/menu/ConfigContentArea;)F
      // 005: fstore 7
      // 007: aload 1
      // 008: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getLeft ()F
      // 00b: iload 2
      // 00c: nop
      // 00d: i2f
      // 00e: fload 7
      // 010: aload 0
      // 011: getfield oxxxde/ضز.pageTabsGap F
      // 014: fadd
      // 015: fmul
      // 016: fadd
      // 017: fstore 8
      // 019: aload 0
      // 01a: getfield oxxxde/ضز.pageTabButtonHeight F
      // 01d: aload 1
      // 01e: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getHeight ()F
      // 021: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 024: fstore 9
      // 026: aload 1
      // 027: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getTop ()F
      // 02a: aload 1
      // 02b: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getHeight ()F
      // 02e: fload 9
      // 030: fsub
      // 031: ldc_w 0.5
      // 034: fmul
      // 035: fadd
      // 036: fstore 10
      // 038: aload 0
      // 039: aload 1
      // 03a: iload 2
      // 03b: nop
      // 03c: iload 5
      // 03e: i2f
      // 03f: iload 6
      // 041: i2f
      // 042: invokespecial oxxxde/ضز.pageTabContains (Lkotakbaz/rain/ui/menu/ConfigContentArea;IFF)Z
      // 045: istore 11
      // 047: aload 0
      // 048: getfield oxxxde/ضز.pageTabHoverAnimations Ljava/util/List;
      // 04b: iload 2
      // 04c: nop
      // 04d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 052: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 055: iload 11
      // 057: ifeq 05f
      // 05a: fconst_1
      // 05b: nop
      // 05c: goto 061
      // 05f: fconst_0
      // 060: nop
      // 061: ldc_w 170.0
      // 064: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 067: astore 13
      // 069: new oxxxde/سذ
      // 06c: dup
      // 06d: aload 13
      // 06f: invokespecial oxxxde/سذ.<init> (Loxxxde/بف;)V
      // 072: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 075: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 078: fconst_0
      // 079: nop
      // 07a: fconst_1
      // 07b: nop
      // 07c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 07f: fstore 12
      // 081: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 084: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 087: ldc_w 0.01
      // 08a: ldc_w 0.02
      // 08d: fload 12
      // 08f: fmul
      // 090: fadd
      // 091: aload 0
      // 092: invokevirtual oxxxde/ضز.getAlpha ()F
      // 095: fmul
      // 096: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 099: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 09c: ldc_w 0.05
      // 09f: aload 0
      // 0a0: invokevirtual oxxxde/ضز.getAlpha ()F
      // 0a3: fmul
      // 0a4: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0a7: fload 4
      // 0a9: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0ac: astore 13
      // 0ae: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0b1: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b4: ldc_w 0.07
      // 0b7: ldc_w 0.02
      // 0ba: fload 12
      // 0bc: fmul
      // 0bd: fadd
      // 0be: aload 0
      // 0bf: invokevirtual oxxxde/ضز.getAlpha ()F
      // 0c2: fmul
      // 0c3: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0c6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0c9: ldc_w 0.08
      // 0cc: aload 0
      // 0cd: invokevirtual oxxxde/ضز.getAlpha ()F
      // 0d0: fmul
      // 0d1: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0d4: fload 4
      // 0d6: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0d9: astore 14
      // 0db: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0de: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0e1: ldc_w 0.48
      // 0e4: ldc_w 0.14
      // 0e7: fload 12
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: aload 0
      // 0ec: invokevirtual oxxxde/ضز.getAlpha ()F
      // 0ef: fmul
      // 0f0: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 0f3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0f6: aload 0
      // 0f7: invokevirtual oxxxde/ضز.getAlpha ()F
      // 0fa: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0fd: fload 4
      // 0ff: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 102: astore 15
      // 104: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 107: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 10a: aload 0
      // 10b: invokevirtual oxxxde/ضز.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 10e: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 111: aload 13
      // 113: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 116: ldc_w 4.0
      // 119: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 11c: ldc_w 0.95
      // 11f: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 122: fconst_1
      // 123: nop
      // 124: aload 14
      // 126: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 129: fload 8
      // 12b: fload 10
      // 12d: fload 7
      // 12f: fload 9
      // 131: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 134: fload 9
      // 136: ldc_w 0.31
      // 139: fmul
      // 13a: fload 7
      // 13c: ldc_w 0.16
      // 13f: fmul
      // 140: invokestatic java/lang/Math.min (FF)F
      // 143: fstore 16
      // 145: fload 10
      // 147: fload 9
      // 149: fload 16
      // 14b: fsub
      // 14c: ldc_w 0.46
      // 14f: fmul
      // 150: fadd
      // 151: fstore 17
      // 153: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 156: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 159: aload 0
      // 15a: invokevirtual oxxxde/ضز.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 15d: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 160: aload 3
      // 161: nop
      // 162: fload 8
      // 164: fload 7
      // 166: ldc_w 0.5
      // 169: fmul
      // 16a: fadd
      // 16b: fload 17
      // 16d: fload 16
      // 16f: aload 15
      // 171: fconst_0
      // 172: nop
      // 173: bipush 32
      // 175: aconst_null
      // 176: nop
      // 177: invokestatic kotakbaz/rain/client/util/render/font/Font.drawCenteredText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 17a: return
   }

   private fun renderEmptyState(area: ذأ, pageProgress: Float) {
      val stateAlpha: Float = this.getAlpha() * pageProgress
      val title: java.lang.String = if (this.currentPage === ConfigPage.LOCAL) "Локальных конфигов нет" else "Cloud-конфигов нет"
      val hint: java.lang.String = if (this.currentPage === ConfigPage.LOCAL) "Создай первый конфиг кнопкой сверху" else "Активируй ключ кнопкой сверху"
      val centerX: Float = area.left + area.width * 0.5F
      val centerY: Float = area.top + area.height * 0.42F
      Font.drawCenteredText$default(
         رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()), title, centerX, centerY, 7.2F, ثْ.INSTANCE.title(0.6F * stateAlpha), 0.0F, 32, null
      )
      Font.drawCenteredText$default(
         رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()),
         hint,
         centerX,
         centerY + رَ.INSTANCE.GS_MEDIUM.getHeight(7.2F) + 4.0F,
         5.8F,
         ثْ.INSTANCE.value(0.38F * stateAlpha),
         0.0F,
         32,
         null
      )
   }

   public fun scrollWheel(vertical: Float) {
      this.scroll.scroll(vertical * 2.5F)
   }

   private fun pageTabIndex(area: ذأ, mouseX: Float, mouseY: Float): Int? {
      val var6: java.util.Iterator = IntRange(0, 1).iterator()

      var var10000: Any
      while (true) {
         if (var6.hasNext()) {
            val `element$iv`: Any = var6.next()
            if (!this.pageTabContains(area, (`element$iv` as java.lang.Number).intValue(), mouseX, mouseY)) {
               continue
            }

            var10000 = `element$iv`
            break
         }

         var10000 = null
         break
      }

      return var10000 as Int
   }

   public fun scrollOffsetValue(): Float {
      return this.scroll.value()
   }

   public fun scrollViewHeight(): Float {
      return this.cachedViewHeight
   }

   private fun createConfigEntry(config: صٌ): حم {
      val var10002: java.lang.String = config.name
      val var10003: java.lang.String = config.displayName
      val var10004: java.lang.String = config.author
      val var10005: Boolean = config.cloudOrigin != null
      val var10006: CloudConfigOrigin = config.cloudOrigin
      val var2: Boolean = var10006 != null && var10006.owned
      val var10007: CloudConfigOrigin = config.cloudOrigin
      return ConfigEntryComponent(var10002, var10003, var10004, var10005, var2, var10007 != null && var10007.shared, { selectedConfig: java.lang.String ->
         if (ConfigManager.INSTANCE.load(selectedConfig)) {
            syncEntries$default(`this$0`, false, 1, null)
         }

         Unit.INSTANCE
      }, { selectedConfig: java.lang.String ->
         if (`this$0`.settingsPopupConfigName == selectedConfig && `this$0`.settingsPopupOpen) {
            closeSettingsPopup$default(`this$0`, false, 1, null)
         } else {
            if (!(`this$0`.settingsPopupConfigName == selectedConfig)) {
               AnimationUtil.animate$default(`this$0`.settingsPopupAnimation, 0.0F, 0.0F, null, 4, null)
            }

            `this$0`.settingsPopupConfigName = selectedConfig
            `this$0`.settingsPopupOpen = true
         }

         Unit.INSTANCE
      }, { selectedConfig: java.lang.String ->
         if (`this$0`.settingsPopupConfigName == selectedConfig) {
            closeSettingsPopup$default(`this$0`, false, 1, null)
         }

         val cloudOrigin: CloudConfigOrigin = ConfigManager.INSTANCE.getCloudOrigin(selectedConfig)
         if (cloudOrigin != null && cloudOrigin.owned) {
            `this$0`.onDeleteOwnedCloud(selectedConfig, cloudOrigin.configId)
         } else if (cloudOrigin != null && cloudOrigin.accountSynced) {
            `this$0`.onDeleteReceivedCloud(selectedConfig, cloudOrigin.configId)
         } else if (ConfigManager.INSTANCE.remove(selectedConfig)) {
            syncEntries$default(`this$0`, false, 1, null)
         }

         Unit.INSTANCE
      })
   }

   private fun pageTabContains(area: ذأ, index: Int, mouseX: Float, mouseY: Float): Boolean {
      val buttonWidth: Float = this.pageTabWidth(area)
      val buttonX: Float = area.left + index * (buttonWidth + this.pageTabsGap)
      val buttonHeight: Float = RangesKt.coerceAtMost(this.pageTabButtonHeight, area.height)
      val buttonY: Float = area.top + (area.height - buttonHeight) * 0.5F
      return mouseX >= buttonX && mouseX <= buttonX + buttonWidth && mouseY >= buttonY && mouseY <= buttonY + buttonHeight
   }

   private fun selectPage(page: صض) {
      if (page != this.currentPage) {
         this.pageSlideDirection = if (page.ordinal() > this.currentPage.ordinal()) 1.0F else -1.0F
         this.currentPage = page
         AnimationUtil.animate$default(this.pageContentAnimation, 0.0F, 0.0F, null, 4, null)
         this.scroll = ScrollUtil(0.0F, 1, null)
         this.closeSettingsPopup(true)
         this.cancelConfigRename()
         this.configs = CollectionsKt.emptyList()
         this.configEntries.clear()
         this.configStateVersion = Integer.MIN_VALUE
         syncEntries$default(this, false, 1, null)
         this.onPageChanged(this.currentPage === ConfigPage.CLOUD)
      }
   }

   private fun configEntryBoundsAtIndex(area: ذأ, index: Int, scrollOffset: Float, entryHeight: Float): ذأ {
      val columnWidth: Float = RangesKt.coerceAtLeast((area.width - this.getPadding() * (float)(this.columnCount - 1)) / (float)this.columnCount, 0.0F)
      val column: Int = index % this.columnCount
      val row: Int = index / this.columnCount
      return ConfigContentArea(
         area.left + column * (columnWidth + this.getPadding()), area.top - scrollOffset + row * (entryHeight + this.getPadding()), columnWidth, entryHeight
      )
   }

   public fun clearInputFocus() {
      closeSettingsPopup$default(this, false, 1, null)
      this.cancelConfigRename()
   }

   private fun activeSettingsPopup(area: ذأ = ...): در? {
      if (this.settingsPopupConfigName == null) {
         return null
      } else {
         val configName: java.lang.String = this.settingsPopupConfigName
         val var7: java.util.Iterator = this.configEntries.iterator()

         var var10000: Any
         while (true) {
            if (var7.hasNext()) {
               val `element$iv`: Any = var7.next()
               if (!((`element$iv` as ConfigEntryComponent).configName == configName)) {
                  continue
               }

               var10000 = (ConfigEntryComponent)`element$iv`
               break
            }

            var10000 = null
            break
         }

         var10000 = var10000
         if (var10000 == null) {
            return null
         } else if (!(var10000.getY() + var10000.getHeight() <= area.top) && !(var10000.getY() >= area.top + area.height)) {
            val var11: ConfigEntryActionBounds = var10000.settingsButtonBounds()
            val var12: Float = var11.top + (var11.height - this.settingsPopupHeight) * 0.5F
            return ConfigSettingsPopup(
               configName, ConfigSettingsPopupBounds(var11.right + this.getPadding() * 0.4F, var12, this.settingsPopupWidth, this.settingsPopupHeight)
            )
         } else {
            return null
         }
      }
   }

   private final val settingsPopupWidth: Float
      private final get() {
         val var10000: Float = this.settingsPopupInset * 2.0F
         val var2: java.util.Iterator = CollectionsKt.listOf(this.renameConfigButton, this.shareConfigButton, this.saveCloudConfigButton).iterator()
         if (!var2.hasNext()) {
            throw NoSuchElementException()
         } else {
            var var9: Float = this.settingsPopupButtonContentWidth(var2.next() as Pair<java.lang.String, java.lang.String>)

            while (var2.hasNext()) {
               var9 = Math.max(var9, this.settingsPopupButtonContentWidth(var2.next() as Pair<java.lang.String, java.lang.String>))
            }

            return var10000 + var9 + this.settingsPopupButtonHorizontalPadding * 2.0F
         }
      }


   private fun saveConfigRename() {
      if (this.renamingConfigName != null) {
         val oldName: java.lang.String = this.renamingConfigName
         val newName: java.lang.String = StringsKt.trim(this.renamingConfigText).toString()
         val var7: java.util.Iterator = this.configEntries.iterator()

         var var10000: Any
         while (true) {
            if (var7.hasNext()) {
               val `element$iv`: Any = var7.next()
               if (!((`element$iv` as ConfigEntryComponent).configName == oldName)) {
                  continue
               }

               var10000 = `element$iv`
               break
            }

            var10000 = null
            break
         }

         run label66@{
            val var4: ConfigEntryComponent = var10000 as ConfigEntryComponent
            if (var10000 as ConfigEntryComponent != null) {
               val var11: java.lang.String = var4.displayName
               if (var11 != null) {
                  var18 = var11
                  return@label66
               }
            }

            var18 = oldName
         }

         if (newName == var18) {
            this.cancelConfigRename()
            syncEntries$default(this, false, 1, null)
         } else {
            when (بظ.$EnumSwitchMapping$1[ConfigManager.INSTANCE.rename(oldName, newName).ordinal()]) {
               1, 2 -> {
                  this.cancelConfigRename()
                  syncEntries$default(this, false, 1, null)
                  if (this.currentPage === ConfigPage.CLOUD) {
                     val var12: CloudConfigOrigin = ConfigManager.INSTANCE.getCloudOrigin(newName)
                     if (var12 != null && (if (var12.owned) var12 else null) != null) {
                        this.onSaveToCloud(newName)
                     }
                  }
               }
               3 -> {
                  this.cancelConfigRename()
                  this.syncEntries(true)
               }
               4, 5, 6 -> {}
               else -> throw NoWhenBranchMatchedException()
            }
         }
      }
   }

   private fun syncEntries(forceRefresh: Boolean = false) {
      if (forceRefresh) {
         ConfigManager.INSTANCE.refreshVisibleConfigsNow()
      }

      if (forceRefresh || ConfigManager.INSTANCE.getStateVersion() != this.configStateVersion) {
         var `$this$map$iv`: java.lang.Iterable = ConfigManager.INSTANCE.getVisibleConfigs()
         val `$i$f$map`: java.util.Collection = ArrayList()

         for (`$i$f$mapTo` in `$this$map$iv`) {
            val `$i$f$associateByTo`: ConfigInfo = `$i$f$mapTo` as ConfigInfo
var var10000: Boolean
            when (بظ.$EnumSwitchMapping$0[this.currentPage.ordinal()]) {
               1 -> var10000 = `$i$f$associateByTo`.cloudOrigin == null
               2 -> var10000 = `$i$f$associateByTo`.cloudOrigin != null
               else -> throw NoWhenBranchMatchedException()
            }

            if (var10000) {
               `$i$f$map`.add(`$i$f$mapTo`)
            }
         }

         val pageConfigs: java.util.List = `$i$f$map` as java.util.List
         if (!(`$i$f$map` as java.util.List == this.configs)) {
            this.configs = pageConfigs
            `$this$map$iv` = this.configEntries
            val `destination$iv$ivx`: java.util.Map = LinkedHashMap(
               RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(this.configEntries, 10)), 16)
            )

            for (p0 in `$this$map$iv`) {
               `destination$iv$ivx`.put((p0 as ConfigEntryComponent).configName, p0)
            }

            val var24: java.util.Map = `destination$iv$ivx`
            this.configEntries.clear()
            `$this$map$iv` = pageConfigs
            val var60: ArrayList = this.configEntries
            var `destination$iv$ivxx`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))

            for (var50 in `$this$map$iv`) {
               var var63: ConfigEntryComponent
               run label148@{
                  val var53: ConfigInfo = var50 as ConfigInfo
                  val var59: ConfigEntryComponent = var24.get((var50 as ConfigInfo).name) as ConfigEntryComponent
                  if (var59 != null) {
                     val var10001: java.lang.String = var53.displayName
                     val var10002: java.lang.String = var53.author
                     val var10003: Boolean = var53.cloudOrigin != null
                     val var10004: CloudConfigOrigin = var53.cloudOrigin
                     val var64: Boolean = var10004 != null && var10004.owned
                     val var10005: CloudConfigOrigin = var53.cloudOrigin
                     val var20: ConfigEntryComponent = if (var59.matchesMetadata(var10001, var10002, var10003, var64, var10005 != null && var10005.shared))
                        var59
                        else
                        null
                        if (var20 != null) {
                        var63 = var20
                        return@label148
                     }
                  }

                  var63 = this.createConfigEntry(var53)
               }

               `destination$iv$ivxx`.add(var63)
            }

            var60.addAll(`destination$iv$ivxx` as java.util.List)
            var var35: java.lang.Iterable = pageConfigs
            `destination$iv$ivxx` = ArrayList(CollectionsKt.collectionSizeOrDefault(pageConfigs, 10))

            for (var51 in var35) {
               `destination$iv$ivxx`.add((var51 as ConfigInfo).name)
            }

            if (!CollectionsKt.contains(`destination$iv$ivxx`, this.settingsPopupConfigName)) {
               this.closeSettingsPopup(true)
            }

            var35 = pageConfigs
            `destination$iv$ivxx` = ArrayList(CollectionsKt.collectionSizeOrDefault(pageConfigs, 10))

            for (var52 in var35) {
               `destination$iv$ivxx`.add((var52 as ConfigInfo).name)
            }

            if (!CollectionsKt.contains(`destination$iv$ivxx`, this.renamingConfigName)) {
               this.cancelConfigRename()
            }
         }

         this.configStateVersion = ConfigManager.INSTANCE.getStateVersion()
      }
   }

   private fun settingsPopupButtons(): List<Pair<String, String>> {
      return CollectionsKt.listOf(this.renameConfigButton, if (this.currentPage === ConfigPage.CLOUD) this.shareConfigButton else this.saveCloudConfigButton)
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
      // 009: bipush 0
      // 00a: nop
      // 00b: bipush 1
      // 00c: nop
      // 00d: aconst_null
      // 00e: nop
      // 00f: invokestatic oxxxde/ضز.syncEntries$default (Loxxxde/ضز;ZILjava/lang/Object;)V
      // 012: aload 0
      // 013: aload 0
      // 014: getfield oxxxde/ضز.configListAnimations Loxxxde/ثّ;
      // 017: aload 0
      // 018: getfield oxxxde/ضز.configEntries Ljava/util/ArrayList;
      // 01b: checkcast java/util/List
      // 01e: getstatic oxxxde/س.INSTANCE Loxxxde/س;
      // 021: checkcast kotlin/jvm/functions/Function1
      // 024: invokevirtual oxxxde/ثّ.update (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
      // 027: putfield oxxxde/ضز.renderedConfigEntries Ljava/util/List;
      // 02a: aload 0
      // 02b: invokespecial oxxxde/ضز.contentArea ()Lkotakbaz/rain/ui/menu/ConfigContentArea;
      // 02e: astore 4
      // 030: aload 0
      // 031: aload 0
      // 032: invokespecial oxxxde/ضز.contentHeight ()F
      // 035: putfield oxxxde/ضز.cachedTotalHeight F
      // 038: aload 0
      // 039: aload 4
      // 03b: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getHeight ()F
      // 03e: putfield oxxxde/ضز.cachedViewHeight F
      // 041: aload 0
      // 042: getfield oxxxde/ضز.pageContentAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 045: fconst_1
      // 046: nop
      // 047: ldc_w 220.0
      // 04a: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 04d: astore 6
      // 04f: new oxxxde/صا
      // 052: dup
      // 053: aload 6
      // 055: invokespecial oxxxde/صا.<init> (Loxxxde/بف;)V
      // 058: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 05b: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 05e: fconst_0
      // 05f: nop
      // 060: fconst_1
      // 061: nop
      // 062: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 065: fstore 5
      // 067: aload 0
      // 068: getfield oxxxde/ضز.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 06b: aload 0
      // 06c: getfield oxxxde/ضز.cachedTotalHeight F
      // 06f: aload 0
      // 070: getfield oxxxde/ضز.cachedViewHeight F
      // 073: fsub
      // 074: fconst_0
      // 075: nop
      // 076: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 079: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.setMax (F)Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 07c: pop
      // 07d: aload 0
      // 07e: getfield oxxxde/ضز.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 081: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.update ()V
      // 084: aload 0
      // 085: getfield oxxxde/ضز.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 088: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.value ()F
      // 08b: fstore 6
      // 08d: getstatic oxxxde/جِ.INSTANCE Loxxxde/جِ;
      // 090: aload 4
      // 092: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getLeft ()F
      // 095: aload 4
      // 097: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getTop ()F
      // 09a: aload 4
      // 09c: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getWidth ()F
      // 09f: aload 4
      // 0a1: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getHeight ()F
      // 0a4: invokevirtual oxxxde/جِ.start (FFFF)V
      // 0a7: aload 4
      // 0a9: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getWidth ()F
      // 0ac: aload 0
      // 0ad: invokevirtual oxxxde/ضز.getPadding ()F
      // 0b0: aload 0
      // 0b1: getfield oxxxde/ضز.columnCount I
      // 0b4: bipush 1
      // 0b5: nop
      // 0b6: isub
      // 0b7: i2f
      // 0b8: fmul
      // 0b9: fsub
      // 0ba: aload 0
      // 0bb: getfield oxxxde/ضز.columnCount I
      // 0be: i2f
      // 0bf: fdiv
      // 0c0: fconst_0
      // 0c1: nop
      // 0c2: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0c5: fstore 7
      // 0c7: aload 4
      // 0c9: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getTop ()F
      // 0cc: aload 4
      // 0ce: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getHeight ()F
      // 0d1: fadd
      // 0d2: fstore 8
      // 0d4: aload 0
      // 0d5: getfield oxxxde/ضز.renderedConfigEntries Ljava/util/List;
      // 0d8: checkcast java/lang/Iterable
      // 0db: astore 9
      // 0dd: bipush 0
      // 0de: nop
      // 0df: istore 10
      // 0e1: aload 9
      // 0e3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0e8: astore 11
      // 0ea: aload 11
      // 0ec: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f1: ifeq 1f7
      // 0f4: aload 11
      // 0f6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fb: astore 12
      // 0fd: aload 12
      // 0ff: checkcast kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item
      // 102: astore 13
      // 104: bipush 0
      // 105: nop
      // 106: istore 14
      // 108: aload 13
      // 10a: invokevirtual kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item.getValue ()Ljava/lang/Object;
      // 10d: checkcast kotakbaz/rain/ui/menu/ConfigEntryComponent
      // 110: astore 15
      // 112: aload 15
      // 114: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getDefaultHeight ()F
      // 117: fstore 16
      // 119: aload 0
      // 11a: aload 4
      // 11c: aload 13
      // 11e: invokevirtual kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item.getPosition ()F
      // 121: fload 6
      // 123: fload 16
      // 125: invokespecial oxxxde/ضز.configEntryBounds (Lkotakbaz/rain/ui/menu/ConfigContentArea;FFF)Lkotakbaz/rain/ui/menu/ConfigContentArea;
      // 128: astore 17
      // 12a: aload 17
      // 12c: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getTop ()F
      // 12f: fconst_1
      // 130: nop
      // 131: aload 13
      // 133: invokevirtual kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item.getPresence ()F
      // 136: fsub
      // 137: ldc_w 4.0
      // 13a: fmul
      // 13b: fadd
      // 13c: fstore 18
      // 13e: fload 18
      // 140: fload 16
      // 142: fadd
      // 143: fstore 19
      // 145: fload 19
      // 147: aload 4
      // 149: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getTop ()F
      // 14c: fcmpl
      // 14d: ifle 15d
      // 150: fload 18
      // 152: fload 8
      // 154: fcmpg
      // 155: ifge 15d
      // 158: bipush 1
      // 159: nop
      // 15a: goto 15f
      // 15d: bipush 0
      // 15e: nop
      // 15f: istore 20
      // 161: aload 15
      // 163: aload 0
      // 164: invokevirtual oxxxde/ضز.getAlpha ()F
      // 167: fload 5
      // 169: fmul
      // 16a: aload 13
      // 16c: invokevirtual kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item.getPresence ()F
      // 16f: fmul
      // 170: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setAlpha (F)V
      // 173: aload 15
      // 175: aload 17
      // 177: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getLeft ()F
      // 17a: fconst_1
      // 17b: nop
      // 17c: fload 5
      // 17e: fsub
      // 17f: aload 0
      // 180: getfield oxxxde/ضز.pageSlideDirection F
      // 183: fmul
      // 184: ldc_w 7.0
      // 187: fmul
      // 188: fadd
      // 189: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setX (F)V
      // 18c: aload 15
      // 18e: fload 18
      // 190: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setY (F)V
      // 193: aload 15
      // 195: fload 7
      // 197: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setWidth (F)V
      // 19a: aload 15
      // 19c: fload 16
      // 19e: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setHeight (F)V
      // 1a1: getstatic kotakbaz/rain/config/ConfigManager.INSTANCE Lkotakbaz/rain/config/ConfigManager;
      // 1a4: aload 15
      // 1a6: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getConfigName ()Ljava/lang/String;
      // 1a9: invokevirtual kotakbaz/rain/config/ConfigManager.isConfigActive (Ljava/lang/String;)Z
      // 1ac: istore 21
      // 1ae: aload 15
      // 1b0: iload 21
      // 1b2: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setSelected (Z)V
      // 1b5: aload 15
      // 1b7: iload 21
      // 1b9: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setLoaded (Z)V
      // 1bc: aload 15
      // 1be: aload 15
      // 1c0: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getConfigName ()Ljava/lang/String;
      // 1c3: aload 0
      // 1c4: getfield oxxxde/ضز.renamingConfigName Ljava/lang/String;
      // 1c7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1ca: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setRenaming (Z)V
      // 1cd: aload 15
      // 1cf: aload 15
      // 1d1: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.getRenaming ()Z
      // 1d4: ifeq 1de
      // 1d7: aload 0
      // 1d8: getfield oxxxde/ضز.renamingConfigText Ljava/lang/String;
      // 1db: goto 1e1
      // 1de: ldc_w ""
      // 1e1: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.setRenameText (Ljava/lang/String;)V
      // 1e4: iload 20
      // 1e6: ifeq 1f2
      // 1e9: aload 15
      // 1eb: iload 1
      // 1ec: iload 2
      // 1ed: nop
      // 1ee: fload 3
      // 1ef: invokevirtual kotakbaz/rain/ui/menu/ConfigEntryComponent.render (IIF)V
      // 1f2: nop
      // 1f3: nop
      // 1f4: goto 0ea
      // 1f7: nop
      // 1f8: aload 0
      // 1f9: getfield oxxxde/ضز.emptyStateAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 1fc: aload 0
      // 1fd: getfield oxxxde/ضز.configEntries Ljava/util/ArrayList;
      // 200: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 203: ifeq 20b
      // 206: fconst_1
      // 207: nop
      // 208: goto 20d
      // 20b: fconst_0
      // 20c: nop
      // 20d: ldc_w 190.0
      // 210: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 213: astore 10
      // 215: new oxxxde/ذش
      // 218: dup
      // 219: aload 10
      // 21b: invokespecial oxxxde/ذش.<init> (Loxxxde/بف;)V
      // 21e: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 221: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 224: fconst_0
      // 225: nop
      // 226: fconst_1
      // 227: nop
      // 228: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 22b: fstore 9
      // 22d: fload 9
      // 22f: ldc_w 0.001
      // 232: fcmpl
      // 233: ifle 241
      // 236: aload 0
      // 237: aload 4
      // 239: fload 5
      // 23b: fload 9
      // 23d: fmul
      // 23e: invokespecial oxxxde/ضز.renderEmptyState (Lkotakbaz/rain/ui/menu/ConfigContentArea;F)V
      // 241: getstatic oxxxde/جِ.INSTANCE Loxxxde/جِ;
      // 244: invokevirtual oxxxde/جِ.end ()V
      // 247: aload 0
      // 248: aload 0
      // 249: invokespecial oxxxde/ضز.pageTabsArea ()Lkotakbaz/rain/ui/menu/ConfigContentArea;
      // 24c: iload 1
      // 24d: iload 2
      // 24e: nop
      // 24f: invokespecial oxxxde/ضز.renderPageTabs (Lkotakbaz/rain/ui/menu/ConfigContentArea;II)V
      // 252: aload 0
      // 253: aload 4
      // 255: iload 1
      // 256: iload 2
      // 257: nop
      // 258: invokespecial oxxxde/ضز.renderSettingsPopup (Lkotakbaz/rain/ui/menu/ConfigContentArea;II)V
      // 25b: return
   }

   private fun handleConfigRenameKey(button: Int) {
      when (button) {
         32 -> {
            this.appendToConfigRename(" ")
            return
         }
         256 -> {
            this.cancelConfigRename()
            return
         }
         257, 335 -> {
            this.saveConfigRename()
            return
         }
         259 -> {
            this.renamingConfigText = StringsKt.dropLast(this.renamingConfigText, 1)
            return
         }
         261 -> {
            this.renamingConfigText = ""
            return
         }
         else -> {
            val var10000: java.lang.String = this.resolveTypedKey(button)
            if (var10000 != null) {
               if (this.isAllowedConfigNameKey(var10000)) {
                  this.appendToConfigRename(var10000)
               }
            }
         }
      }
   }

   public override fun onMouseRelease(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseRelease(mouseX, mouseY, button)
   }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (this.renamingConfigName != null) {
         this.handleConfigRenameKey(button)
      }
   }

   private fun configEntryBounds(area: ذأ, position: Float, scrollOffset: Float, entryHeight: Float): ذأ {
      val lowerIndex: Int = RangesKt.coerceAtLeast((int)((float)Math.floor((double)position)), 0)
      val fraction: Float = RangesKt.coerceIn(position - (float)lowerIndex, 0.0F, 1.0F)
      val lower: ConfigContentArea = this.configEntryBoundsAtIndex(area, lowerIndex, scrollOffset, entryHeight)
      val upper: ConfigContentArea = this.configEntryBoundsAtIndex(area, lowerIndex + 1, scrollOffset, entryHeight)
      return ConfigContentArea(lower.left + (upper.left - lower.left) * fraction, lower.top + (upper.top - lower.top) * fraction, lower.width, entryHeight)
   }

   public fun isCloudPage(): Boolean {
      return this.currentPage === ConfigPage.CLOUD
   }

   public fun resetScroll() {
      this.scroll = ScrollUtil(0.0F, 1, null)
      this.closeSettingsPopup(true)
      this.cancelConfigRename()
      this.syncEntries(true)
   }

   private fun settingsPopupButtonBounds(popup: در, index: Int): بل {
      return ConfigSettingsPopupBounds(
         popup.bounds.left + this.settingsPopupInset,
         popup.bounds.top + this.settingsPopupInset + index * (this.settingsPopupButtonHeight + this.settingsPopupButtonGap),
         RangesKt.coerceAtLeast(popup.bounds.width - this.settingsPopupInset * 2.0F, 0.0F),
         this.settingsPopupButtonHeight
      )
   }

   public override fun onMouseScroll(mouseX: Int, mouseY: Int, vertical: Float) {
      super.onMouseScroll(mouseX, mouseY, vertical)
      if (this.insideContent((float)mouseX, (float)mouseY)) {
         this.scrollWheel(vertical)
      }
   }

   private fun isAllowedConfigNameKey(keyName: String): Boolean {
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

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      val mouseXF: Float = mouseX
      val mouseYF: Float = mouseY
      val popup: ConfigSettingsPopup = activeSettingsPopup$default(this, null, 1, null)
      if (button == 0 && this.pageTabsArea().contains(mouseXF, mouseYF)) {
         val var33: Int = this.pageTabIndex(this.pageTabsArea(), mouseXF, mouseYF)
         if (var33 != null) {
            this.selectPage(if (var33.intValue() == 0) ConfigPage.LOCAL else ConfigPage.CLOUD)
         }
      } else {
         if (button == 0 && this.settingsPopupOpen) {
            var var30: Boolean
            run label140@{
               if (popup != null) {
                  val var10000: ConfigSettingsPopupBounds = popup.bounds
                  if (var10000 != null) {
                     var30 = var10000.contains(mouseXF, mouseYF)
                     return@label140
                  }
               }

               var30 = false
            }

            if (var30) {
               if (this.settingsPopupButtonBounds(popup, 0).contains(mouseXF, mouseYF)) {
                  this.startConfigRename(popup.configName)
                  closeSettingsPopup$default(this, false, 1, null)
               } else if (this.settingsPopupButtonBounds(popup, 1).contains(mouseXF, mouseYF)) {
                  if (this.currentPage === ConfigPage.CLOUD) {
                     this.onShareConfig(popup.configName)
                  } else {
                     this.onSaveToCloud(popup.configName)
                  }

                  closeSettingsPopup$default(this, false, 1, null)
               }

               return
            }
         }

         if (button == 0 && this.renamingConfigName != null) {
            val index: java.util.Iterator = this.configEntries.iterator()

            var var31: Any
            while (true) {
               if (!index.hasNext()) {
                  var31 = null
                  break
               }

               val `element$iv`: Any = index.next()
               if ((`element$iv` as ConfigEntryComponent).configName == this.renamingConfigName) {
                  var31 = `element$iv`
                  break
               }
            }

            if (var31 as ConfigEntryComponent != null && (var31 as ConfigEntryComponent).isInsideRenameEditor(mouseXF, mouseYF)) {
               return
            }

            this.cancelConfigRename()
         }

         if (!this.insideContent(mouseXF, mouseYF)) {
            if (button == 0) {
               closeSettingsPopup$default(this, false, 1, null)
            }
         } else {
            val var16: java.lang.Iterable = this.configEntries
            var var32: Boolean
            if (this.configEntries is java.util.Collection && this.configEntries.isEmpty()) {
               var32 = false
            } else {
               val var20: java.util.Iterator = var16.iterator()

               while (true) {
                  if (!var20.hasNext()) {
                     var32 = false
                     break
                  }

                  if ((var20.next() as ConfigEntryComponent).isInsideSettings(mouseXF, mouseYF)) {
                     var32 = true
                     break
                  }
               }
            }

            if (button == 0 && !var32) {
               closeSettingsPopup$default(this, false, 1, null)
            }

            for (var24 in this.configEntries) {
               (var24 as ConfigEntryComponent).onMouseClick(mouseX, mouseY, button)
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

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   private fun startConfigRename(configName: String) {
      if (!(this.renamingConfigName == configName)) {
         this.renamingConfigName = configName
         val var5: java.util.Iterator = this.configEntries.iterator()

         var var10000: Any
         while (true) {
            if (var5.hasNext()) {
               val `element$iv`: Any = var5.next()
               if (!((`element$iv` as ConfigEntryComponent).configName == configName)) {
                  continue
               }

               var10000 = `element$iv`
               break
            }

            var10000 = null
            break
         }

         var var10001: java.lang.String
         run label40@{
            val var2: ConfigEntryComponent = var10000 as ConfigEntryComponent
            if (var10000 as ConfigEntryComponent != null) {
               val var10: java.lang.String = var2.displayName
               if (var10 != null) {
                  var10001 = var10
                  return@label40
               }
            }

            var10001 = configName
         }

         this.renamingConfigText = var10001
      }
   }

   private fun renderSettingsPopup(area: ذأ, mouseX: Int, mouseY: Int) {
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
      // 001: aload 1
      // 002: invokespecial oxxxde/ضز.activeSettingsPopup (Lkotakbaz/rain/ui/menu/ConfigContentArea;)Lkotakbaz/rain/ui/menu/ConfigSettingsPopup;
      // 005: dup
      // 006: ifnonnull 00b
      // 009: pop
      // 00a: return
      // 00b: astore 4
      // 00d: aload 0
      // 00e: getfield oxxxde/ضز.settingsPopupAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 011: aload 0
      // 012: getfield oxxxde/ضز.settingsPopupOpen Z
      // 015: ifeq 01d
      // 018: fconst_1
      // 019: nop
      // 01a: goto 01f
      // 01d: fconst_0
      // 01e: nop
      // 01f: ldc_w 180.0
      // 022: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 025: astore 6
      // 027: new oxxxde/دخ
      // 02a: dup
      // 02b: aload 6
      // 02d: invokespecial oxxxde/دخ.<init> (Loxxxde/بف;)V
      // 030: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 033: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 036: fconst_0
      // 037: nop
      // 038: fconst_1
      // 039: nop
      // 03a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 03d: fstore 5
      // 03f: fload 5
      // 041: ldc_w 0.001
      // 044: fcmpg
      // 045: ifgt 056
      // 048: aload 0
      // 049: getfield oxxxde/ضز.settingsPopupOpen Z
      // 04c: ifne 055
      // 04f: aload 0
      // 050: aconst_null
      // 051: nop
      // 052: putfield oxxxde/ضز.settingsPopupConfigName Ljava/lang/String;
      // 055: return
      // 056: aload 0
      // 057: invokevirtual oxxxde/ضز.getAlpha ()F
      // 05a: fload 5
      // 05c: fmul
      // 05d: fstore 6
      // 05f: aload 4
      // 061: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 064: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getLeft ()F
      // 067: fconst_1
      // 068: nop
      // 069: fload 5
      // 06b: fsub
      // 06c: ldc_w 4.0
      // 06f: fmul
      // 070: fsub
      // 071: fstore 7
      // 073: getstatic kotakbaz/rain/config/ConfigManager.INSTANCE Lkotakbaz/rain/config/ConfigManager;
      // 076: aload 4
      // 078: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getConfigName ()Ljava/lang/String;
      // 07b: invokevirtual kotakbaz/rain/config/ConfigManager.isConfigActive (Ljava/lang/String;)Z
      // 07e: ifeq 086
      // 081: fconst_1
      // 082: nop
      // 083: goto 088
      // 086: fconst_0
      // 087: nop
      // 088: fstore 8
      // 08a: ldc_w 0.03
      // 08d: ldc_w 0.02
      // 090: fload 8
      // 092: fmul
      // 093: fadd
      // 094: fstore 9
      // 096: ldc_w 0.05
      // 099: ldc_w 0.03
      // 09c: fload 8
      // 09e: fmul
      // 09f: fadd
      // 0a0: fstore 10
      // 0a2: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0a5: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 0a8: aload 0
      // 0a9: invokevirtual oxxxde/ضز.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 0ac: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 0af: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b2: fload 6
      // 0b4: invokevirtual oxxxde/ثْ.panel (F)Ljava/awt/Color;
      // 0b7: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 0ba: ldc_w 4.0
      // 0bd: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 0c0: fload 7
      // 0c2: aload 4
      // 0c4: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 0c7: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getTop ()F
      // 0ca: aload 4
      // 0cc: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 0cf: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getWidth ()F
      // 0d2: aload 4
      // 0d4: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 0d7: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getHeight ()F
      // 0da: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 0dd: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0e0: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e3: aload 0
      // 0e4: invokevirtual oxxxde/ضز.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 0e7: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0ea: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0ed: fload 9
      // 0ef: fload 6
      // 0f1: fmul
      // 0f2: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0f5: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0f8: ldc_w 4.0
      // 0fb: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0fe: ldc_w 0.95
      // 101: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 104: fconst_1
      // 105: nop
      // 106: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 109: fload 10
      // 10b: fload 6
      // 10d: fmul
      // 10e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 111: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 114: fload 7
      // 116: aload 4
      // 118: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 11b: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getTop ()F
      // 11e: aload 4
      // 120: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 123: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getWidth ()F
      // 126: aload 4
      // 128: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 12b: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getHeight ()F
      // 12e: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 131: aload 0
      // 132: fload 7
      // 134: aload 0
      // 135: getfield oxxxde/ضز.settingsPopupInset F
      // 138: fadd
      // 139: aload 4
      // 13b: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 13e: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getTop ()F
      // 141: aload 0
      // 142: getfield oxxxde/ضز.settingsPopupInset F
      // 145: fadd
      // 146: aload 4
      // 148: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopup.getBounds ()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;
      // 14b: invokevirtual kotakbaz/rain/ui/menu/ConfigSettingsPopupBounds.getWidth ()F
      // 14e: aload 0
      // 14f: getfield oxxxde/ضز.settingsPopupInset F
      // 152: fconst_2
      // 153: nop
      // 154: fmul
      // 155: fsub
      // 156: fload 6
      // 158: iload 2
      // 159: nop
      // 15a: iload 3
      // 15b: nop
      // 15c: invokespecial oxxxde/ضز.renderSettingsPopupButtons (FFFFII)V
      // 15f: return
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

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }

   private fun renderPageTabs(area: ذأ, mouseX: Int, mouseY: Int) {
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
      // 00: aload 1
      // 01: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getWidth ()F
      // 04: fconst_0
      // 05: nop
      // 06: fcmpg
      // 07: ifle 14
      // 0a: aload 1
      // 0b: invokevirtual kotakbaz/rain/ui/menu/ConfigContentArea.getHeight ()F
      // 0e: fconst_0
      // 0f: nop
      // 10: fcmpg
      // 11: ifgt 15
      // 14: return
      // 15: aload 0
      // 16: getfield oxxxde/ضز.pageIndicatorAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 19: aload 0
      // 1a: getfield oxxxde/ضز.currentPage Lkotakbaz/rain/ui/menu/ConfigPage;
      // 1d: getstatic kotakbaz/rain/ui/menu/ConfigPage.CLOUD Lkotakbaz/rain/ui/menu/ConfigPage;
      // 20: if_acmpne 28
      // 23: fconst_1
      // 24: nop
      // 25: goto 2a
      // 28: fconst_0
      // 29: nop
      // 2a: ldc_w 220.0
      // 2d: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 30: astore 5
      // 32: new oxxxde/ذد
      // 35: dup
      // 36: aload 5
      // 38: invokespecial oxxxde/ذد.<init> (Loxxxde/بف;)V
      // 3b: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 3e: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 41: fconst_0
      // 42: nop
      // 43: fconst_1
      // 44: nop
      // 45: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 48: fstore 4
      // 4a: aload 0
      // 4b: aload 1
      // 4c: bipush 0
      // 4d: nop
      // 4e: ldc_w "Локальные"
      // 51: fconst_1
      // 52: nop
      // 53: fload 4
      // 55: fsub
      // 56: iload 2
      // 57: nop
      // 58: iload 3
      // 59: nop
      // 5a: invokespecial oxxxde/ضز.renderPageTab (Lkotakbaz/rain/ui/menu/ConfigContentArea;ILjava/lang/String;FII)V
      // 5d: aload 0
      // 5e: aload 1
      // 5f: bipush 1
      // 60: nop
      // 61: ldc_w "Клауд"
      // 64: fload 4
      // 66: iload 2
      // 67: nop
      // 68: iload 3
      // 69: nop
      // 6a: invokespecial oxxxde/ضز.renderPageTab (Lkotakbaz/rain/ui/menu/ConfigContentArea;ILjava/lang/String;FII)V
      // 6d: return
   }

   private fun insideContent(mouseX: Float, mouseY: Float): Boolean {
      val area: ConfigContentArea = this.contentArea()
      return mouseX >= area.left && mouseX <= area.left + area.width && mouseY >= area.top && mouseY <= area.top + area.height
   }

   private fun contentArea(): ذأ {
      val area: ConfigContentArea = this.baseContentArea()
      return ConfigContentArea(area.left, area.top, area.width, RangesKt.coerceAtLeast(this.pageTabsArea().top - area.top - this.getPadding(), 0.0F))
   }

   private fun baseContentArea(): ذأ {
      val left: Float = this.getX() + this.panelWidth + this.getPadding()
      val right: Float = this.getX() + this.getWidth() - this.panelWidth / 3.0F
      val top: Float = this.getY() + this.contentTopOffset
      return ConfigContentArea(
         left, top, RangesKt.coerceAtLeast(right - left, 0.0F), RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0F)
      )
   }

   private fun closeSettingsPopup(immediate: Boolean = false) {
      this.settingsPopupOpen = false
      if (immediate) {
         AnimationUtil.animate$default(this.settingsPopupAnimation, 0.0F, 0.0F, null, 4, null)
         this.settingsPopupConfigName = null
      }
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }

   private fun contentHeight(): Float {
      if (this.configEntries.isEmpty()) {
         return 0.0F
      } else {
         val rowCount: Int = (this.configEntries.size() + this.columnCount - 1) / this.columnCount
         return rowCount * (CollectionsKt.first(this.configEntries) as ConfigEntryComponent).defaultHeight + (rowCount + -1) * this.getPadding()
      }
   }

   private fun pageTabWidth(area: ذأ): Float {
      return RangesKt.coerceAtLeast((area.width - this.pageTabsGap) * 0.5F, 0.0F)
   }

   private fun cancelConfigRename() {
      this.renamingConfigName = null
      this.renamingConfigText = ""
   }

   init {
      this.panelWidth = panelWidth
      this.contentTopOffset = contentTopOffset
      this.onShareConfig = onShareConfig
      this.onSaveToCloud = onSaveToCloud
      this.onDeleteOwnedCloud = onDeleteOwnedCloud
      this.onDeleteReceivedCloud = onDeleteReceivedCloud
      this.onPageChanged = onPageChanged
      this.columnCount = 2
      this.pageTabsHeight = 30.0F
      this.pageTabButtonHeight = 22.0F
      this.pageTabsGap = 4.0F
      this.pageIndicatorAnimation = AnimationUtil(0.0F, 1, null)
      this.pageContentAnimation = AnimationUtil(1.0F)
      var var8: Byte = 2
      var var9: ArrayList = ArrayList(2)

      repeat(var8) { var10 ->
         var9.add(AnimationUtil(0.0F, 1, null))
      }

      this.pageTabHoverAnimations = var9
      this.configEntries = ArrayList<>()
      this.configListAnimations = ثّ<>(0.0F, 0.0F, 3, null)
      this.renderedConfigEntries = CollectionsKt.emptyList()
      this.emptyStateAnimation = AnimationUtil(0.0F, 1, null)
      this.configs = CollectionsKt.emptyList()
      this.currentPage = ConfigPage.LOCAL
      this.pageSlideDirection = 1.0F
      this.configStateVersion = Integer.MIN_VALUE
      this.scroll = ScrollUtil(0.0F, 1, null)
      this.settingsPopupAnimation = AnimationUtil(0.0F, 1, null)
      var8 = 2
      var9 = ArrayList(2)

      repeat(var8) { var18 ->
         var9.add(AnimationUtil(0.0F, 1, null))
      }

      this.settingsPopupButtonHoverAnimations = var9
      this.settingsPopupInset = 4.0F
      this.settingsPopupButtonHeight = 15.0F
      this.settingsPopupButtonGap = 2.0F
      this.settingsPopupButtonHorizontalPadding = 5.0F
      this.settingsPopupTextSize = 6.2F
      this.settingsPopupTextOpticalOffset = 0.8F
      this.settingsPopupIconSize = 6.4F
      this.settingsPopupIconGap = 3.0F
      this.configNameMaxLength = 24
      this.renameConfigButton = "1" to "Переименовать конфиг"
      this.shareConfigButton = "2" to "Поделится конфигом"
      this.saveCloudConfigButton = "2" to "Сохранить в Cloud"
      this.settingsPopupHeight = this.settingsPopupInset * 2.0F + this.settingsPopupButtonHeight * 2.0F + this.settingsPopupButtonGap
      this.renamingConfigText = ""
   }

   public fun showCloudPage() {
      if (this.currentPage != ConfigPage.CLOUD) {
         this.selectPage(ConfigPage.CLOUD)
      } else {
         this.pageSlideDirection = 1.0F
         AnimationUtil.animate$default(this.pageContentAnimation, 0.0F, 0.0F, null, 4, null)
         this.scroll = ScrollUtil(0.0F, 1, null)
         this.configStateVersion = Integer.MIN_VALUE
         syncEntries$default(this, false, 1, null)
      }
   }

   private fun pageTabsArea(): ذأ {
      val area: ConfigContentArea = this.baseContentArea()
      val footerHeight: Float = RangesKt.coerceAtMost(this.pageTabsHeight, area.height)
      return ConfigContentArea(area.left, area.top + area.height - footerHeight, area.width, footerHeight)
   }

   private fun renderSettingsPopupButtons(x: Float, y: Float, width: Float, popupAlpha: Float, mouseX: Int, mouseY: Int) {
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
      // 001: invokespecial oxxxde/ضز.settingsPopupButtons ()Ljava/util/List;
      // 004: checkcast java/lang/Iterable
      // 007: astore 7
      // 009: bipush 0
      // 00a: nop
      // 00b: istore 8
      // 00d: bipush 0
      // 00e: nop
      // 00f: istore 9
      // 011: aload 7
      // 013: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 018: astore 10
      // 01a: aload 10
      // 01c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 021: ifeq 20a
      // 024: aload 10
      // 026: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02b: astore 11
      // 02d: iload 9
      // 02f: iinc 9 1
      // 032: istore 12
      // 034: iload 12
      // 036: ifge 03c
      // 039: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 03c: iload 12
      // 03e: aload 11
      // 040: checkcast kotlin/Pair
      // 043: astore 13
      // 045: istore 14
      // 047: bipush 0
      // 048: nop
      // 049: istore 15
      // 04b: aload 13
      // 04d: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 050: checkcast java/lang/String
      // 053: astore 16
      // 055: aload 13
      // 057: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 05a: checkcast java/lang/String
      // 05d: astore 17
      // 05f: fload 2
      // 060: iload 14
      // 062: i2f
      // 063: aload 0
      // 064: getfield oxxxde/ضز.settingsPopupButtonHeight F
      // 067: aload 0
      // 068: getfield oxxxde/ضز.settingsPopupButtonGap F
      // 06b: fadd
      // 06c: fmul
      // 06d: fadd
      // 06e: fstore 18
      // 070: iload 5
      // 072: i2f
      // 073: fload 1
      // 074: fcmpl
      // 075: iflt 09e
      // 078: iload 5
      // 07a: i2f
      // 07b: fload 1
      // 07c: fload 3
      // 07d: fadd
      // 07e: fcmpg
      // 07f: ifgt 09e
      // 082: iload 6
      // 084: i2f
      // 085: fload 18
      // 087: fcmpl
      // 088: iflt 09e
      // 08b: iload 6
      // 08d: i2f
      // 08e: fload 18
      // 090: aload 0
      // 091: getfield oxxxde/ضز.settingsPopupButtonHeight F
      // 094: fadd
      // 095: fcmpg
      // 096: ifgt 09e
      // 099: bipush 1
      // 09a: nop
      // 09b: goto 0a0
      // 09e: bipush 0
      // 09f: nop
      // 0a0: istore 19
      // 0a2: aload 0
      // 0a3: getfield oxxxde/ضز.settingsPopupButtonHoverAnimations Ljava/util/List;
      // 0a6: iload 14
      // 0a8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ad: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 0b0: iload 19
      // 0b2: ifeq 0ba
      // 0b5: fconst_1
      // 0b6: nop
      // 0b7: goto 0bc
      // 0ba: fconst_0
      // 0bb: nop
      // 0bc: ldc_w 170.0
      // 0bf: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0c2: astore 20
      // 0c4: new oxxxde/اج
      // 0c7: dup
      // 0c8: aload 20
      // 0ca: invokespecial oxxxde/اج.<init> (Loxxxde/بف;)V
      // 0cd: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0d0: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0d3: fconst_0
      // 0d4: nop
      // 0d5: fconst_1
      // 0d6: nop
      // 0d7: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0da: fstore 21
      // 0dc: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0df: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e2: aload 0
      // 0e3: invokevirtual oxxxde/ضز.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 0e6: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e9: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0ec: ldc_w 0.035
      // 0ef: ldc_w 0.035
      // 0f2: fload 21
      // 0f4: fmul
      // 0f5: fadd
      // 0f6: fload 4
      // 0f8: fmul
      // 0f9: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0fc: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0ff: ldc_w 0.95
      // 102: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 105: ldc_w 3.0
      // 108: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 10b: fconst_1
      // 10c: nop
      // 10d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 110: ldc_w 0.06
      // 113: ldc_w 0.06
      // 116: fload 21
      // 118: fmul
      // 119: fadd
      // 11a: fload 4
      // 11c: fmul
      // 11d: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 120: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 123: fload 1
      // 124: fload 18
      // 126: fload 3
      // 127: fconst_0
      // 128: nop
      // 129: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 12c: aload 0
      // 12d: getfield oxxxde/ضز.settingsPopupButtonHeight F
      // 130: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 133: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 136: invokevirtual oxxxde/رَ.getICON2 ()Lkotakbaz/rain/client/util/render/font/Font;
      // 139: aload 16
      // 13b: aload 0
      // 13c: getfield oxxxde/ضز.settingsPopupIconSize F
      // 13f: fconst_0
      // 140: nop
      // 141: bipush 4
      // 142: nop
      // 143: aconst_null
      // 144: nop
      // 145: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 148: fstore 20
      // 14a: fload 1
      // 14b: aload 0
      // 14c: getfield oxxxde/ضز.settingsPopupButtonHorizontalPadding F
      // 14f: fadd
      // 150: fstore 22
      // 152: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 155: invokevirtual oxxxde/رَ.getICON2 ()Lkotakbaz/rain/client/util/render/font/Font;
      // 158: aload 0
      // 159: invokevirtual oxxxde/ضز.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 15c: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 15f: aload 16
      // 161: fload 22
      // 163: fload 18
      // 165: aload 0
      // 166: getfield oxxxde/ضز.settingsPopupButtonHeight F
      // 169: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 16c: invokevirtual oxxxde/رَ.getICON2 ()Lkotakbaz/rain/client/util/render/font/Font;
      // 16f: aload 0
      // 170: getfield oxxxde/ضز.settingsPopupIconSize F
      // 173: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 176: fsub
      // 177: ldc_w 0.5
      // 17a: fmul
      // 17b: fadd
      // 17c: aload 0
      // 17d: getfield oxxxde/ضز.settingsPopupIconSize F
      // 180: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 183: ldc_w 0.82
      // 186: ldc_w 0.18
      // 189: fload 21
      // 18b: fmul
      // 18c: fadd
      // 18d: fload 4
      // 18f: fmul
      // 190: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 193: fconst_0
      // 194: nop
      // 195: fconst_0
      // 196: nop
      // 197: fconst_0
      // 198: nop
      // 199: bipush 0
      // 19a: nop
      // 19b: fconst_0
      // 19c: nop
      // 19d: sipush 992
      // 1a0: aconst_null
      // 1a1: nop
      // 1a2: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1a5: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1a8: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1ab: aload 0
      // 1ac: invokevirtual oxxxde/ضز.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1af: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 1b2: aload 17
      // 1b4: fload 22
      // 1b6: fload 20
      // 1b8: fadd
      // 1b9: aload 0
      // 1ba: getfield oxxxde/ضز.settingsPopupIconGap F
      // 1bd: fadd
      // 1be: fload 18
      // 1c0: aload 0
      // 1c1: getfield oxxxde/ضز.settingsPopupButtonHeight F
      // 1c4: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1c7: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1ca: aload 0
      // 1cb: getfield oxxxde/ضز.settingsPopupTextSize F
      // 1ce: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 1d1: fsub
      // 1d2: ldc_w 0.5
      // 1d5: fmul
      // 1d6: fadd
      // 1d7: aload 0
      // 1d8: getfield oxxxde/ضز.settingsPopupTextOpticalOffset F
      // 1db: fsub
      // 1dc: aload 0
      // 1dd: getfield oxxxde/ضز.settingsPopupTextSize F
      // 1e0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1e3: ldc_w 0.82
      // 1e6: ldc_w 0.18
      // 1e9: fload 21
      // 1eb: fmul
      // 1ec: fadd
      // 1ed: fload 4
      // 1ef: fmul
      // 1f0: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1f3: fconst_0
      // 1f4: nop
      // 1f5: fconst_0
      // 1f6: nop
      // 1f7: fconst_0
      // 1f8: nop
      // 1f9: bipush 0
      // 1fa: nop
      // 1fb: fconst_0
      // 1fc: nop
      // 1fd: sipush 992
      // 200: aconst_null
      // 201: nop
      // 202: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 205: nop
      // 206: nop
      // 207: goto 01a
      // 20a: nop
      // 20b: return
   }

   private fun isShiftDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 340) == 1 || GLFW.glfwGetKey(handle, 344) == 1
   }

   private fun settingsPopupButtonContentWidth(button: Pair<String, String>): Float {
      return Font.getWidth$default(رَ.INSTANCE.ICON2, button.component1() as java.lang.String, this.settingsPopupIconSize, 0.0F, 4, null)
         + this.settingsPopupIconGap
         + Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, button.component2() as java.lang.String, this.settingsPopupTextSize, 0.0F, 4, null)
      }

   public fun scrollContentHeight(): Float {
      return this.cachedTotalHeight
   }

   private fun appendToConfigRename(value: String) {
      if (value.length() != 0 && this.renamingConfigText.length() < this.configNameMaxLength) {
         this.renamingConfigText = StringsKt.take("${this.renamingConfigText}$value", this.configNameMaxLength)
      }
   }
}
