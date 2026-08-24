package oxxxde

import java.awt.Color
import java.net.URI
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Locale
import java.util.concurrent.CompletionException
import java.util.concurrent.ExecutionException
import kotlin.math.MathKt
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.sound.SoundInstance
import net.minecraft.util.Util
import org.joml.Vector4f
import org.lwjgl.glfw.GLFW
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object حز : جع, اس {
   private final val topBarHeight: Float = 27.0F
   private const val CONFIG_SHARE_MODAL_PADDING: Float = 7.0F
   private final var configKeyPopupOpen: Boolean
   private final val configKeyCancelHoverAnimation: ري
   private final var scrollBarGrabOffset: Float
   private const val AVATAR_POPUP_INFO_ACTION_ICON: String = "Z"
   private final var modelPreviewRenderingEnabled: Boolean
   private final val categoryComponents: Map<ظص, جر>
   private final var configKeyStatusText: String?
   private final var configShareRenderedModalHeight: Float
   private final var guiBackgroundProgress: Float
   private final val configCreateButtonAnimation: ري
   private const val AVATAR_POPUP_INFO_ICON: String = "S"
   private final val configKeyPopupHeightAnimation: ري
   private const val AVATAR_POPUP_SETTING_HEIGHT: Float = 18.0F
   private final val categoryIndicatorYAnim: ري
   private const val CONFIG_SHARE_MAX_ACTIVATIONS: Int = 1000
   private final val configShareModalHeightAnimation: ري
   private const val CONFIG_SHARE_BUTTON_HEIGHT: Float = 17.0F
   private final val configShareButtonTextTransition: حت
   private final var configCreateStatusText: String?
   private const val AVATAR_POPUP_ROW_TEXT_SIZE: Float = 7.0F
   private const val CONFIG_SHARE_MODAL_WIDTH: Float = 155.0F
   private final val logger: Logger = LoggerFactory.getLogger("Rain Config UI")
   private final var configKeyTextSelected: Boolean
   private const val CONFIG_KEY_POPUP_WIDTH: Float = 142.0F
   private final var configShareActivationsText: String
   private final val categoryShiftDistance: Float
   private const val OPEN_ANIMATION_DURATION: Float = 220.0F
   private final var eventServerConfirmOpen: Boolean
   private const val CONFIG_SHARE_MODAL_HEIGHT: Float = 76.0F
   private final val avatarPopupAnimation: ري
   private const val AVATAR_POPUP_HUD_SCALE_LABEL: String = "Размер худа"
   private final var avatarPopupGuiScaleDragProgress: Float?
   private const val CONFIG_KEY_LENGTH: Int = 26
   private const val CONFIG_SHARE_KEY_ROW_HEIGHT: Float = 13.0F
   private const val OPEN_START_SCALE: Float = 0.92F
   private final val configShareResultsAnimation: ري
   private final var configShareGeneratedKeys: List<بء>
   private final val configsCategoryComponent: ضز
   private final val pointsCategoryComponent: رِ
   private final var configCreatePopupOpen: Boolean
   private const val EVENT_SERVER_CONFIRM_HEIGHT: Float = 68.0F
   private final var draggingAvatarPopupGuiScale: Boolean
   private final var configShareManagedConfigId: String?
   private final val friendsCategoryComponent: طل
   private const val CONFIG_SHARE_COPY_FEEDBACK_DURATION_MS: Long = 1400L
   private const val EVENT_SERVER_CONFIRM_WIDTH: Float = 155.0F
   private const val AVATAR_POPUP_GUI_BACKGROUND_ICON: String = "f"
   private final val configShareRevokeHoverAnimations: HashMap<String, ري>
   private final var configCreateText: String
   private final val configCreateStatusTransition: حت
   private final var configShareErrorText: String?
   private final var eventServerConfirmAnarchy: Int?
   private final var configShareConfigName: String?
   private final val configKeyUploadHoverAnimation: ري
   private final var moduleSearchText: String
   private const val CONFIG_SHARE_INPUT_HEIGHT: Float = 19.0F
   private const val CONFIG_SHARE_LOADING_MODAL_HEIGHT: Float = 54.0F
   private const val CONFIG_KEY_POPUP_TITLE: String = "Активируйте ключ конфига"
   private const val CONFIG_KEY_POPUP_PADDING: Float = 7.0F
   private final val configShareActivationsFocusAnimation: ري
   private final val configShareModalAnimation: ري
   private final val configShareCopyFeedbackAnimation: ري
   private const val AVATAR_POPUP_INFO_INDEX: Int = 4
   private final var configShareSubmitting: Boolean
   private final val configCreatePopupAnimation: ري
   private final var configShareInfiniteActivations: Boolean
   private final val avatarPopupSocialsAnimation: ري
   private const val AVATAR_POPUP_GUI_SCALE_INDEX: Int = 0
   private final val openAnimation: ري
   private final val configKeyPattern: Regex = Regex("^RAIN-CONFIG-[A-HJ-NP-Z2-9]{4}-[A-HJ-NP-Z2-9]{4}-[A-HJ-NP-Z2-9]{4}$")
   private final var configCreateInputFocused: Boolean
   private const val CONFIG_CREATE_POPUP_WIDTH: Float = 142.0F
   private final var configCloudSaveExistingMode: Boolean
   private final var configKeyText: String
   private final var configCreateTextSelected: Boolean
   private final val backgroundRenderer: جخ
   private final val avatarPopupGuiScaleAnimation: ري
   private final var draggingScrollBar: Boolean
   private final val avatarPopupGuiBackgroundAnimation: ري
   private final var configKeyInputFocused: Boolean
   private final val eventsCategoryComponent: طك
   private final val avatarPopupHudScaleAnimation: ري
   private final var categoryIndicatorInitialized: Boolean
   private final val configShareCreateHoverAnimation: ري
   private final val scrollBarRenderer: جل
   private final val configShareInfinityHoverAnimation: ري
   private const val CONFIG_SHARE_TRANSITION_DURATION: Float = 240.0F
   private final val pointsSettingsCategory: ظص
   private const val AVATAR_POPUP_HEADER_TEXT_SIZE: Float = 9.0F
   private const val AVATAR_POPUP_SOCIALS_LABEL: String = "Игроки с Rain"
   private const val AVATAR_POPUP_GUI_BACKGROUND_INDEX: Int = 2
   private final val eventServerConfirmAnimation: ري
   private final val configShareCopyHoverAnimation: ري
   private const val EVENT_SERVER_CONFIRM_BUTTON_HEIGHT: Float = 17.0F
   private final val uiPadding: Float = 5.0F
   private const val AVATAR_POPUP_CLOSE_ICON: String = "i"
   private final val components: List<ام>
   private const val AVATAR_POPUP_SETTING_COUNT: Int = 5
   private const val EVENT_SERVER_CONFIRM_GAP: Float = 5.0F
   private final var configKeyRenderedPopupHeight: Float
   private final var configShareManagingExisting: Boolean
   private const val CONFIG_CREATE_POPUP_TITLE: String = "Создание конфига"
   private const val CONFIG_SHARE_MAX_KEYS: Int = 10
   private const val CONFIG_SHARE_KEY_ROW_GAP: Float = 2.0F
   private final val configCreateCancelHoverAnimation: ري
   private final var scrollBarState: خف?
   private final var configCreateUnloadPrompt: Boolean
   private final val configShareLoadingAnimation: ري
   private const val AVATAR_POPUP_INFO_VALUE: String = "Открыть"
   private final val configCreateInputFocusAnimation: ري
   private final var draggingAvatarPopupHudScale: Boolean
   private final val configShareTitleTransition: حت
   private final val configKeyPopupAnimation: ري
   private const val AVATAR_POPUP_BOOLEAN_HEIGHT: Float = 15.0F
   private final val configCreatePopupHeightAnimation: ري
   private final var closing: Boolean
   private final val eventServerConfirmCancelHoverAnimation: ري
   private const val CONFIG_SHARE_MODAL_GAP: Float = 5.0F
   private const val CONFIG_CREATE_NAME_MAX_LENGTH: Int = 24
   private final var configKeyRequestId: Int
   private const val AVATAR_POPUP_INFO_LABEL: String = "Инфо"
   private final val configShareMoreHoverAnimation: ري
   private final var configKeySubmitting: Boolean
   private const val CONFIG_KEY_POPUP_STATUS_HEIGHT: Float = 84.0F
   private final val configKeyUploadAnimation: ري
   private final var configCreateRenderedPopupHeight: Float
   private final var configCloudSaveSubmitting: Boolean
   private const val CONFIG_KEY_POPUP_GAP: Float = 5.0F
   private const val AVATAR_POPUP_SOCIALS_ICON: String = "c"
   private final var configShareRequestId: Int
   private final var searchFocused: Boolean
   private const val CONFIG_KEY_BUTTON_HEIGHT: Float = 17.0F
   private const val CONFIG_CREATE_POPUP_STATUS_HEIGHT: Float = 84.0F
   private const val AVATAR_POPUP_GUI_SCALE_MAX_VALUE_TEXT: String = "150%"
   private final val configShareInfinityAnimation: ري
   private final var configCreateCloudSaveMode: Boolean
   private const val AVATAR_POPUP_GUI_BACKGROUND_LABEL: String = "Фон гуи"
   private final var topBarTextSelected: Boolean
   private final var lastRenderedScale: Float
   private final val topBarRenderer: طا
   private const val EVENT_SERVER_CONFIRM_PADDING: Float = 7.0F
   private final var configShareInfinityProgress: Float
   private const val AVATAR_POPUP_MARGIN: Float = 6.0F
   private const val AVATAR_POPUP_GUI_SCALE_LABEL: String = "Размер гуи"
   private final var configShareFocusedField: زو?
   private const val AVATAR_POPUP_HUD_SCALE_MAX_VALUE_TEXT: String = "200%"
   private const val CONFIG_CREATE_POPUP_COMPACT_HEIGHT: Float = 77.0F
   private final var categoryContentAlpha: Float
   private final val categoryTransition: تس<ظص>
   private const val AVATAR_POPUP_INFO_URL: String = "https://rainvisuals.pro"
   private const val CONFIG_KEY_INPUT_HEIGHT: Float = 20.0F
   private final var configShareCopiedAtMs: Long
   private final var cloudLibrarySyncRequestId: Int
   private const val CONFIG_SHARE_INPUT_MAX_LENGTH: Int = 4
   private final val maxModuleSearchLength: Int = 12
   private final val avatarPopupCloseHoverAnimation: ري
   private const val AVATAR_POPUP_HUD_SCALE_ICON: String = "G"
   private final var avatarPopupOpen: Boolean
   private const val CONFIG_SHARE_MODAL_TITLE: String = "Создание клауд-конфига"
   private final val configKeyInputFocusAnimation: ري
   private const val CONFIG_KEY_POPUP_COMPACT_HEIGHT: Float = 77.0F
   private final val menuCategories: List<ظص>
   private const val AVATAR_POPUP_SOCIALS_INDEX: Int = 3
   private final var configShareCheckingExisting: Boolean
   private final val configKeyStatusTransition: حت
   private final val configShareKeyListAnimations: ثّ<String, بء>
   private final val avatarHoverAnimation: ري
   private final val configCreateConfirmHoverAnimation: ري
   private final val eventServerConfirmAcceptHoverAnimation: ري
   private const val AVATAR_POPUP_HUD_SCALE_INDEX: Int = 1
   private final var avatarPopupHudScaleDragProgress: Float?
   private const val AVATAR_POPUP_GUI_SCALE_ICON: String = "F"
   private final var configShareModalOpen: Boolean
   private const val GUI_BACKGROUND_ANIMATION_DURATION: Float = 220.0F

   public override fun shouldRemove(): Boolean {
      return closing && this.openProgress() <= 0.02F
   }

   public final val width: Float
      public final get() {
         return 365.0F
      }


   public override fun iconsPipeline(): صؤ {
      return صؤ.GUI_SPECIAL
   }

   private fun avatarPopupInfoActionBounds(bounds: طآ, metrics: تذ): طآ {
      val cardBounds: طآ = this.avatarPopupSettingBounds(bounds, metrics, 4)
      val padding: Float = metrics.scaled(6.0F)
      val totalWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "Открыть", metrics.scaled(6.2F), 0.0F, 4, null)
         + metrics.scaled(3.0F)
         + جً.getWidth$default(رَ.INSTANCE.getICON(), "Z", metrics.scaled(6.2F), 0.0F, 4, null)
         val hitPadding: Float = metrics.scaled(5.0F)
      return طآ(cardBounds.x + cardBounds.width - padding - totalWidth - hitPadding, cardBounds.y, totalWidth + hitPadding * 2.0F, cardBounds.height)
   }

   private fun avatarPopupGuiBackgroundBounds(bounds: طآ, metrics: تذ): طآ {
      return this.avatarPopupSettingBounds(bounds, metrics, 2)
   }

   private fun renderConfigShareCreateButton(bounds: طآ, alpha: Float, hoverProgress: Float) {
      val uiAlpha: Int = RangesKt.coerceIn(MathKt.roundToInt(alpha * 255.0F), 0, 255)
      val whiteLevel: Int = RangesKt.coerceIn(MathKt.roundToInt(255.0F - 10.0F * hoverProgress), 0, 255)
      val var10000: java.lang.String
      if (configShareSubmitting) {
         var10000 = "..."
      } else if (configShareErrorText != null) {
         var10000 = configShareErrorText
      } else {
         var10000 = "Создать"
      }

      val textSize: Float = 6.2F
      val textY: Float = bounds.y + (bounds.height - 6.2F) * 0.46F
      ذر.INSTANCE
         .getBASIC_RECT()
         .priority(this.textPipeline())
         .color(Color(whiteLevel, whiteLevel, whiteLevel, uiAlpha))
         .round(3.5F)
         .border(1.0F, Color(whiteLevel, whiteLevel, whiteLevel, uiAlpha))
         .draw(bounds.x, bounds.y, bounds.width, bounds.height)

      for (`element$iv` in configShareButtonTextTransition.update(var10000)) {
         جً.drawCenteredText$default(
            رَ.INSTANCE.getGS_MEDIUM().priority(INSTANCE.textPipeline()),
            (`element$iv` as ذإ).text,
            bounds.x + bounds.width * 0.5F,
            textY + (`element$iv` as ذإ).offsetY,
            textSize,
            Color(0, 0, 0, RangesKt.coerceIn(MathKt.roundToInt((float)uiAlpha * (`element$iv` as ذإ).alpha), 0, 255)),
            0.0F,
            32,
            null
         )
      }
   }

   public fun renderedScale(): Float {
      return lastRenderedScale
   }

   private fun saveConfigToCloud(configName: String) {
      if (!configCloudSaveSubmitting) {
         val origin: دة = اك.INSTANCE.getCloudOrigin(configName)
         if (origin != null && !origin.owned) {
            if (configCreatePopupOpen && configCreateCloudSaveMode) {
               configCreateStatusText = "Чужой конфиг нельзя сохранить"
            }
         } else {
            val popupRequest: Boolean = configCreatePopupOpen && configCreateCloudSaveMode && StringsKt.equals(configCreateText, configName, true)
            if (popupRequest) {
               configCloudSaveSubmitting = true
               configCreateStatusText = null
            }

            خه.INSTANCE.saveOwned(configName).whenComplete({ p0: Any, p1: Any ->
               `$tmp0`(p0, p1)
            })
         }
      }
   }

   private fun handleConfigShareMouseClick(mouseX: Float, mouseY: Float, button: Int) {
      if (button == 0) {
         val modal: طآ = configShareModalBounds$default(this, 0.0F, 1, null)
         if (configShareCheckingExisting) {
            if (!modal.contains(mouseX, mouseY)) {
               this.closeConfigShareModal()
            }
         } else if (!configShareGeneratedKeys.isEmpty()) {
            if (configShareManagingExisting && this.configShareMoreButtonBounds(modal).contains(mouseX, mouseY)) {
               this.showConfigShareCreationForm()
            } else if (!configShareManagingExisting || !this.revokeCloudKeyAt(mouseX, mouseY, modal)) {
               if (this.configShareCopyButtonBounds(modal).contains(mouseX, mouseY)) {
                  this.copyGeneratedConfigKeys()
               } else if (!modal.contains(mouseX, mouseY)) {
                  this.closeConfigShareModal()
               }
            }
         } else {
            if (configShareInfinityButtonBounds$default(this, modal, 0.0F, 2, null).contains(mouseX, mouseY)) {
               configShareInfiniteActivations = !configShareInfiniteActivations
               configShareErrorText = null
               configShareFocusedField = null
            } else if (!configShareInfiniteActivations && this.configShareActivationsInputBounds(modal).contains(mouseX, mouseY)) {
               configShareFocusedField = زو.ACTIVATIONS
            } else if (this.configShareCreateButtonBounds(modal).contains(mouseX, mouseY)) {
               this.createGeneratedConfigKeys()
            } else if (modal.contains(mouseX, mouseY)) {
               configShareFocusedField = null
            } else {
               this.closeConfigShareModal()
            }
         }
      }
   }

   private fun commitAvatarPopupGuiScaleDrag(mouseX: Float? = null) {
      if (mouseX != null && avatarPopupOpen) {
         val progress: Float = currentScale$default(this, 0.0F, 1, null)
         val previousValue: ظص = categoryTransition.current
         val var10000: ام = CollectionsKt.firstOrNull(components)
         val sidebarPadding: Float = if (var10000 != null) var10000.getPadding() else uiPadding
         val layout: زْ = زْ(
            this.x,
            this.y,
            this.width,
            this.height,
            this.panelWidth,
            uiPadding,
            topBarHeight,
            sidebarPadding,
            components.size(),
            this.isConfigCategory(previousValue),
            this.isPointsCategory(previousValue),
            false,
            2048,
            null
         )
         val metrics: تذ = this.avatarPopupMetrics(progress)
         this.updateAvatarPopupGuiScalePreview(
            mouseX, this.avatarPopupGuiScaleSliderBounds(this.avatarPopupSettingBounds(this.avatarPopupBounds(layout, progress, metrics), metrics, 0), metrics)
         )
      }

      val var11: Float = if (avatarPopupGuiScaleDragProgress != null) avatarPopupGuiScaleDragProgress else سر.INSTANCE.scaleProgress()
      val var12: Float = سر.INSTANCE.scalePercent()
      سر.INSTANCE.setScaleProgress(var11)
      if (سر.INSTANCE.scalePercent() != var12) {
         ضك.getMc().getSoundManager().play(PositionedSoundInstance.ui(زد.INSTANCE.getSLIDER(), 1.0F, 1.0F) as SoundInstance)
      }

      draggingAvatarPopupGuiScale = false
      avatarPopupGuiScaleDragProgress = null
   }

   private fun handleModuleSearchInput(button: Int) {
      if (this.isCtrlDown() && button == 65) {
         this.selectTopBarText(moduleSearchText)
      } else {
         when (button) {
            32 -> {
               this.commitModuleSearch(" ")
               return
            }
            257, 335 -> {
               searchFocused = false
               topBarTextSelected = false
               return
            }
            259 -> {
               if (topBarTextSelected) {
                  this.updateModuleSearchText("")
                  return
               }

               if (moduleSearchText.length() > 0) {
                  this.updateModuleSearchText(StringsKt.dropLast(moduleSearchText, 1))
               }

               return
            }
            261 -> {
               this.updateModuleSearchText("")
               return
            }
            else -> {
               val var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
               if (var10000 != null) {
                  if (var10000.length() == 1) {
                     val var10001: java.lang.String = var10000.toLowerCase(Locale.ROOT)
                     this.commitModuleSearch(var10001)
                  }
               }
            }
         }
      }
   }

   private fun appendConfigKey(value: String) {
      if (value.length() != 0) {
         configKeyStatusText = null
         if (configKeyTextSelected) {
            configKeyText = ""
            configKeyTextSelected = false
         }

         if (configKeyText.length() < 26) {
            val var12: java.lang.String = configKeyText
            val `$this$filterTo$iv$iv`: java.lang.CharSequence = value
            val `destination$iv$iv`: Appendable = StringBuilder()
            var `index$iv$iv`: Int = 0

            for (var8 in `$this$filterTo$iv$iv`.length()..`index$iv$iv`) {
               val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(`index$iv$iv`)
               if (this.isAllowedConfigKeyChar(`element$iv$iv`)) {
                  `destination$iv$iv`.append(`element$iv$iv`)
               }
            }

            configKeyText = StringsKt.take("$var12${(`destination$iv$iv` as StringBuilder).toString()}", 26)
         }
      }
   }

   private fun configCloudSaveValidationError(): String? {
      val configName: java.lang.String = StringsKt.trim(configCreateText).toString()
      if (configName.length() == 0) {
         return "Введите название"
      } else if (configCloudSaveSubmitting) {
         return "Сохранение уже выполняется"
      } else if (!اك.INSTANCE.isValidName(configName)) {
         return "Неверное название"
      } else {
         val var5: java.util.Iterator = اك.INSTANCE.getVisibleConfigs().iterator()

         var var10000: Any
         while (true) {
            if (var5.hasNext()) {
               val `element$iv`: Any = var5.next()
               if (!StringsKt.equals((`element$iv` as صٌ).name, configName, true)) {
                  continue
               }

               var10000 = `element$iv`
               break
            }

            var10000 = null
            break
         }

         val existing: صٌ = var10000 as صٌ
         if (configCloudSaveExistingMode) {
            val var9: java.lang.String
            if (existing == null) {
               var9 = "Конфиг не найден"
            } else {
               val var10: دة = existing.getCloudOrigin()
               var9 = if (var10 != null && !var10.owned) "Чужой Cloud-конфиг" else null
            }

            return var9
         } else {
            return if (existing != null && existing.getCloudOrigin() == null)
               null
               else
               (
                  if (existing != null)
                     "Такой конфиг уже есть в Cloud"
                     else
                     (if (اك.INSTANCE.canCreate(configName) && اك.INSTANCE.canCreateFromCurrent()) null else "Нельзя создать конфиг")
               )
            }
      }
   }

   private fun avatarPopupSocialsBounds(bounds: طآ, metrics: تذ): طآ {
      return this.avatarPopupSettingBounds(bounds, metrics, 3)
   }

   private fun handleConfigShareKey(button: Int) {
      if (button == 256) {
         this.closeConfigShareModal()
      } else if (!configShareCheckingExisting) {
         if (!configShareGeneratedKeys.isEmpty()) {
            if (this.isCtrlDown() && button == 67) {
               this.copyGeneratedConfigKeys()
            }
         } else if (button == 258) {
            configShareFocusedField = if (configShareInfiniteActivations) null else زو.ACTIVATIONS
         } else if (configShareFocusedField === زو.ACTIVATIONS) {
            if (this.isCtrlDown() && button == 86) {
               val var22: java.lang.String = GLFW.glfwGetClipboardString(ضك.getMc().getWindow().getHandle())
               if (var22 != null) {
                  val var17: java.lang.CharSequence = var22
                  val var18: Appendable = StringBuilder()
                  var var20: Int = 0

                  for (var9 in var17.length()..var20) {
                     val `element$iv$iv`: Char = var17.charAt(var20)
                     if (Character.isDigit(`element$iv$iv`)) {
                        var18.append(`element$iv$iv`)
                     }
                  }

                  this.appendToConfigShareActivations((var18 as StringBuilder).toString())
               }
            } else {
               when (button) {
                  257, 335 -> {
                     this.createGeneratedConfigKeys()
                     return
                  }
                  259 -> {
                     this.updateConfigShareActivations(StringsKt.dropLast(configShareActivationsText, 1))
                     return
                  }
                  261 -> {
                     this.updateConfigShareActivations("")
                     return
                  }
                  else -> {
                     val var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
                     if (var10000 != null) {
                        val `$this$all$iv`: java.lang.CharSequence = var10000
                        var `$this$filterTo$iv$iv`: Int = 0

                        while (true) {
                           if (`$this$filterTo$iv$iv` >= `$this$all$iv`.length()) {
                              var21 = true
                              break
                           }

                           if (!Character.isDigit(`$this$all$iv`.charAt(`$this$filterTo$iv$iv`))) {
                              var21 = false
                              break
                           }

                           `$this$filterTo$iv$iv`++
                        }

                        if (var21) {
                           this.appendToConfigShareActivations(var10000)
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private fun configCreateInputBounds(popup: طآ): طآ {
      val divider: طآ = this.configCreateDividerBounds(popup)
      return طآ(popup.x + 7.0F, divider.y + divider.height + 5.0F, popup.width - 14.0F, 20.0F)
   }

   private fun updateAvatarPopupHudScalePreview(mouseX: Float, sliderBounds: طآ) {
      if (!(sliderBounds.width <= 0.0F)) {
         val progress: Float = this.avatarPopupHudScaleProgress(mouseX, sliderBounds)
         val previousValue: Float = سر.INSTANCE.hudScalePercent()
         avatarPopupHudScaleDragProgress = progress
         سر.INSTANCE.setHudScaleProgress(progress)
         if (سر.INSTANCE.hudScalePercent() != previousValue) {
            ضك.getMc().getSoundManager().play(PositionedSoundInstance.ui(زد.INSTANCE.getSLIDER(), 1.0F, 1.0F) as SoundInstance)
         }
      }
   }

   private fun submitConfigCreate() {
      if (!StringsKt.isBlank(configCreateText)) {
         when (ظْ.$EnumSwitchMapping$0[اك.INSTANCE.create(configCreateText).ordinal()]) {
            1 -> {
               this.closeConfigCreatePopup(true)
               configsCategoryComponent.resetScroll()
            }
            2 -> configCreateStatusText = "Такой конфиг уже есть"
            3 -> configCreateStatusText = "Неверное название"
            4 -> {
               configCreateUnloadPrompt = true
               configCreateInputFocused = false
               configCreateTextSelected = false
               configCreateStatusText = null
            }
            5 -> configCreateStatusText = "Не удалось сохранить"
            else -> throw NoWhenBranchMatchedException()
         }
      }
   }

   private fun applyScrollBarDrag(setScrollProgress: (Float, Boolean) -> Unit, mouseY: Float) {
      if (scrollBarState != null) {
         val state: خف = scrollBarState
         if (scrollBarState.canScroll) {
            val travel: Float = RangesKt.coerceAtLeast(state.trackHeight - state.thumbHeight, 0.0F)
            if (travel <= 0.0F) {
               setScrollProgress(0.0F, true)
            } else {
               setScrollProgress(RangesKt.coerceIn(mouseY - state.trackY - scrollBarGrabOffset, 0.0F, travel) / travel, true)
            }
         }
      }
   }

   private fun selectTopBarText(value: String) {
      topBarTextSelected = value.length() > 0
   }

   private fun isUsableCloudKey(key: شق): Boolean {
      return !key.revoked && (key.remainingActivations == null || key.remainingActivations > 0)
   }

   private fun renderConfigKeyInput(bounds: طآ, alpha: Float) {
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
      // 000: getstatic oxxxde/حز.configKeyText Ljava/lang/String;
      // 003: checkcast java/lang/CharSequence
      // 006: invokeinterface java/lang/CharSequence.length ()I 1
      // 00b: ifle 013
      // 00e: bipush 1
      // 00f: nop
      // 010: goto 015
      // 013: bipush 0
      // 014: nop
      // 015: istore 3
      // 016: getstatic oxxxde/حز.configKeyInputFocused Z
      // 019: ifeq 027
      // 01c: getstatic oxxxde/حز.configKeyPopupOpen Z
      // 01f: ifeq 027
      // 022: bipush 1
      // 023: nop
      // 024: goto 029
      // 027: bipush 0
      // 028: nop
      // 029: istore 4
      // 02b: getstatic oxxxde/حز.configKeyInputFocusAnimation Loxxxde/ري;
      // 02e: iload 4
      // 030: ifeq 038
      // 033: fconst_1
      // 034: nop
      // 035: goto 03a
      // 038: fconst_0
      // 039: nop
      // 03a: ldc_w 190.0
      // 03d: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 040: astore 6
      // 042: new oxxxde/سم
      // 045: dup
      // 046: aload 6
      // 048: invokespecial oxxxde/سم.<init> (Loxxxde/بف;)V
      // 04b: checkcast oxxxde/شل
      // 04e: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 051: fconst_0
      // 052: nop
      // 053: fconst_1
      // 054: nop
      // 055: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 058: fstore 5
      // 05a: ldc_w 6.3
      // 05d: fstore 6
      // 05f: aload 1
      // 060: invokevirtual oxxxde/طآ.getX ()F
      // 063: ldc_w 5.0
      // 066: fadd
      // 067: fstore 7
      // 069: aload 1
      // 06a: invokevirtual oxxxde/طآ.getY ()F
      // 06d: aload 1
      // 06e: invokevirtual oxxxde/طآ.getHeight ()F
      // 071: fload 6
      // 073: fsub
      // 074: ldc_w 0.46
      // 077: fmul
      // 078: fadd
      // 079: fstore 8
      // 07b: aload 1
      // 07c: invokevirtual oxxxde/طآ.getWidth ()F
      // 07f: ldc_w 10.0
      // 082: fsub
      // 083: fconst_0
      // 084: nop
      // 085: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 088: fstore 9
      // 08a: ldc_w "Введите ключ.."
      // 08d: astore 10
      // 08f: iload 3
      // 090: nop
      // 091: ifeq 0a2
      // 094: aload 0
      // 095: getstatic oxxxde/حز.configKeyText Ljava/lang/String;
      // 098: fload 9
      // 09a: fload 6
      // 09c: invokespecial oxxxde/حز.trimConfigKeyToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 09f: goto 0af
      // 0a2: iload 4
      // 0a4: ifeq 0ad
      // 0a7: ldc_w ""
      // 0aa: goto 0af
      // 0ad: aload 10
      // 0af: astore 11
      // 0b1: iload 3
      // 0b2: nop
      // 0b3: ifeq 0c4
      // 0b6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b9: ldc_w 0.8
      // 0bc: fload 2
      // 0bd: fmul
      // 0be: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0c1: goto 0cf
      // 0c4: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0c7: ldc_w 0.48
      // 0ca: fload 2
      // 0cb: fmul
      // 0cc: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 0cf: astore 12
      // 0d1: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0d4: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 0d7: aload 0
      // 0d8: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0db: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 0de: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0e1: ldc_w 0.025
      // 0e4: ldc_w 0.025
      // 0e7: fload 5
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: fload 2
      // 0ec: fmul
      // 0ed: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0f0: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 0f3: ldc_w 0.95
      // 0f6: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 0f9: ldc_w 3.5
      // 0fc: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 0ff: fconst_1
      // 100: nop
      // 101: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 104: ldc_w 0.07
      // 107: ldc_w 0.06
      // 10a: fload 5
      // 10c: fmul
      // 10d: fadd
      // 10e: fload 2
      // 10f: fmul
      // 110: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 113: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 116: aload 1
      // 117: invokevirtual oxxxde/طآ.getX ()F
      // 11a: aload 1
      // 11b: invokevirtual oxxxde/طآ.getY ()F
      // 11e: aload 1
      // 11f: invokevirtual oxxxde/طآ.getWidth ()F
      // 122: aload 1
      // 123: invokevirtual oxxxde/طآ.getHeight ()F
      // 126: invokevirtual oxxxde/جء.draw (FFFF)V
      // 129: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 12c: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 12f: aload 11
      // 131: fload 6
      // 133: fconst_0
      // 134: nop
      // 135: bipush 4
      // 136: nop
      // 137: aconst_null
      // 138: nop
      // 139: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 13c: fstore 13
      // 13e: iload 4
      // 140: ifeq 19a
      // 143: getstatic oxxxde/حز.configKeyTextSelected Z
      // 146: ifeq 19a
      // 149: aload 11
      // 14b: checkcast java/lang/CharSequence
      // 14e: invokeinterface java/lang/CharSequence.length ()I 1
      // 153: ifle 15b
      // 156: bipush 1
      // 157: nop
      // 158: goto 15d
      // 15b: bipush 0
      // 15c: nop
      // 15d: ifeq 19a
      // 160: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 163: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 166: aload 0
      // 167: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 16a: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 16d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 170: ldc_w 0.16
      // 173: fload 2
      // 174: fmul
      // 175: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 178: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 17b: fconst_2
      // 17c: nop
      // 17d: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 180: fload 7
      // 182: ldc_w 1.5
      // 185: fsub
      // 186: fload 8
      // 188: fconst_2
      // 189: nop
      // 18a: fsub
      // 18b: fload 13
      // 18d: ldc_w 3.0
      // 190: fadd
      // 191: fload 6
      // 193: ldc_w 4.0
      // 196: fadd
      // 197: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 19a: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 19d: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1a0: aload 0
      // 1a1: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1a4: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1a7: aload 11
      // 1a9: fload 7
      // 1ab: fload 8
      // 1ad: fload 6
      // 1af: aload 12
      // 1b1: fconst_0
      // 1b2: nop
      // 1b3: fconst_0
      // 1b4: nop
      // 1b5: fconst_0
      // 1b6: nop
      // 1b7: bipush 0
      // 1b8: nop
      // 1b9: fconst_0
      // 1ba: nop
      // 1bb: sipush 992
      // 1be: aconst_null
      // 1bf: nop
      // 1c0: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1c3: iload 4
      // 1c5: ifeq 1e4
      // 1c8: getstatic oxxxde/حز.configKeyTextSelected Z
      // 1cb: ifne 1e4
      // 1ce: invokestatic java/lang/System.currentTimeMillis ()J
      // 1d1: ldc2_w 450
      // 1d4: ldiv
      // 1d5: ldc2_w 2
      // 1d8: lrem
      // 1d9: lconst_0
      // 1da: nop
      // 1db: lcmp
      // 1dc: ifne 1e4
      // 1df: bipush 1
      // 1e0: nop
      // 1e1: goto 1e6
      // 1e4: bipush 0
      // 1e5: nop
      // 1e6: istore 14
      // 1e8: iload 14
      // 1ea: ifne 1ee
      // 1ed: return
      // 1ee: fload 7
      // 1f0: fload 13
      // 1f2: fadd
      // 1f3: ldc_w 0.8
      // 1f6: fadd
      // 1f7: fstore 15
      // 1f9: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1fc: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1ff: aload 0
      // 200: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 203: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 206: ldc_w "|"
      // 209: fload 15
      // 20b: fload 8
      // 20d: fload 6
      // 20f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 212: ldc_w 0.88
      // 215: fload 2
      // 216: fmul
      // 217: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 21a: fconst_0
      // 21b: nop
      // 21c: fconst_0
      // 21d: nop
      // 21e: fconst_0
      // 21f: nop
      // 220: bipush 0
      // 221: nop
      // 222: fconst_0
      // 223: nop
      // 224: sipush 992
      // 227: aconst_null
      // 228: nop
      // 229: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 22c: return
   }

   public override fun textPipeline(): صؤ {
      return صؤ.GUI_TEXT
   }

   private fun avatarPopupGuiScaleSliderHitBounds(cardBounds: طآ, metrics: تذ): طآ {
      val sliderBounds: طآ = this.avatarPopupGuiScaleSliderBounds(cardBounds, metrics)
      val hitPadding: Float = metrics.scaled(5.0F)
      return طآ(sliderBounds.x - hitPadding, sliderBounds.y - hitPadding, sliderBounds.width + hitPadding * 2.0F, sliderBounds.height + hitPadding * 2.0F)
   }

   private fun handleConfigCreateInput(button: Int) {
      if (button == 256) {
         closeConfigCreatePopup$default(this, false, 1, null)
      } else if (configCreateUnloadPrompt) {
         when (button) {
            257, 335 -> this.submitCloudConfigUnload()
            else -> {}
         }
      } else if (configCreateInputFocused) {
         if (this.isCtrlDown()) {
            when (button) {
               65 -> {
                  configCreateTextSelected = configCreateText.length() > 0
                  return
               }
               67 -> {
                  if (configCreateTextSelected && configCreateText.length() > 0) {
                     GLFW.glfwSetClipboardString(ضك.getMc().getWindow().getHandle(), configCreateText)
                  }

                  return
               }
               86 -> {
                  val var31: java.lang.String = GLFW.glfwGetClipboardString(ضك.getMc().getWindow().getHandle())
                  if (var31 == null) {
                     return
                  }

                  val var21: java.lang.CharSequence = var31
                  val var23: Appendable = StringBuilder()
                  var var27: Int = 0

                  for (var10 in var21.length()..var27) {
                     val `element$iv$iv`: Char = var21.charAt(var27)
                     if (this.isAllowedConfigCreateChar(`element$iv$iv`)) {
                        var23.append(`element$iv$iv`)
                     }
                  }

                  this.appendConfigCreateText((var23 as StringBuilder).toString())
                  return
               }
               else -> {}
            }
         }

         when (button) {
            32 -> {
               this.appendConfigCreateText(" ")
               return
            }
            257, 335 -> {
               if (configCreateCloudSaveMode) {
                  this.submitConfigCloudSave()
               } else {
                  this.submitConfigCreate()
               }

               return
            }
            259 -> {
               configCreateStatusText = null
               if (configCreateTextSelected) {
                  configCreateText = ""
                  configCreateTextSelected = false
               } else {
                  configCreateText = StringsKt.dropLast(configCreateText, 1)
               }

               return
            }
            261 -> {
               configCreateStatusText = null
               configCreateText = ""
               configCreateTextSelected = false
               return
            }
            else -> {
               var var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
               if (var10000 != null) {
                  run label156@{
                     if (this.isShiftDown()) {
                        val `$this$all$iv`: java.lang.CharSequence = var10000
                        var `$this$filterTo$iv$iv`: Int = 0

                        while (true) {
                           if (`$this$filterTo$iv$iv` >= `$this$all$iv`.length()) {
                              var28 = true
                              break
                           }

                           if (!Character.isLetter(`$this$all$iv`.charAt(`$this$filterTo$iv$iv`))) {
                              var28 = false
                              break
                           }

                           `$this$filterTo$iv$iv`++
                        }

                        if (var28) {
                           var10000 = var10000.toUpperCase(Locale.ROOT)
                           return@label156
                        }
                     }

                     var10000 = var10000
                  }

                  val var16: java.lang.CharSequence = var10000
                  var var20: Int = 0

                  while (true) {
                     if (var20 >= var16.length()) {
                        var30 = true
                        break
                     }

                     if (!this.isAllowedConfigCreateChar(var16.charAt(var20))) {
                        var30 = false
                        break
                     }

                     var20++
                  }

                  if (var30) {
                     this.appendConfigCreateText(var10000)
                  }
               }
            }
         }
      }
   }

   private fun avatarPopupBounds(layout: زْ, scale: Float, metrics: تذ = this.avatarPopupMetrics(scale)): طآ {
      val avatar: طآ = this.avatarBounds(layout)
      val centerX: Float = this.x + this.width * 0.5F
      val centerY: Float = this.y + this.height * 0.5F
      val avatarScreenX: Float = centerX + (avatar.x - centerX) * scale
      val avatarScreenY: Float = centerY + (avatar.y - centerY) * scale
      val avatarScreenSize: Float = avatar.width * scale
      val gap: Float = metrics.scaled(6.0F)
      return طآ(
         RangesKt.coerceIn(
            avatarScreenX - metrics.width - gap - metrics.scaled(5.0F),
            gap,
            RangesKt.coerceAtLeast((float)ضك.getMc().getWindow().getScaledWidth() - metrics.width - gap, gap)
         ),
         RangesKt.coerceIn(
            avatarScreenY + avatarScreenSize - metrics.height,
            gap,
            RangesKt.coerceAtLeast((float)ضك.getMc().getWindow().getScaledHeight() - metrics.height - gap, gap)
         ),
         metrics.width,
         metrics.height
      )
   }

   private fun openProgress(): Float {
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
      // 00: getstatic oxxxde/حز.closing Z
      // 03: ifeq 0b
      // 06: fconst_0
      // 07: nop
      // 08: goto 0d
      // 0b: fconst_1
      // 0c: nop
      // 0d: fstore 1
      // 0e: getstatic oxxxde/حز.openAnimation Loxxxde/ري;
      // 11: fload 1
      // 12: ldc_w 220.0
      // 15: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 18: astore 2
      // 19: new oxxxde/خد
      // 1c: dup
      // 1d: aload 2
      // 1e: nop
      // 1f: invokespecial oxxxde/خد.<init> (Loxxxde/بف;)V
      // 22: checkcast oxxxde/شل
      // 25: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 28: fconst_0
      // 29: nop
      // 2a: fconst_1
      // 2b: nop
      // 2c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 2f: freturn
   }

   private fun eventServerConfirmAcceptBounds(modal: طآ): طآ {
      return طآ(modal.x + 7.0F, modal.y + modal.height - 7.0F - 17.0F, (modal.width - 14.0F - 5.0F) * 0.5F, 17.0F)
   }

   private fun appendToConfigShareActivations(value: String) {
      if (value.length() != 0) {
         if (configShareActivationsText.length() < 4) {
            val var13: java.lang.String = configShareActivationsText
            val `$this$filterTo$iv$iv`: java.lang.CharSequence = value
            val `destination$iv$iv`: Appendable = StringBuilder()
            var `index$iv$iv`: Int = 0

            for (var9 in `$this$filterTo$iv$iv`.length()..`index$iv$iv`) {
               val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(`index$iv$iv`)
               if (Character.isDigit(`element$iv$iv`)) {
                  `destination$iv$iv`.append(`element$iv$iv`)
               }
            }

            this.updateConfigShareActivations(StringsKt.take("$var13${(`destination$iv$iv` as StringBuilder).toString()}", 4))
         }
      }
   }

   private fun openConfigCloudSavePopup() {
      closeConfigKeyPopup$default(this, false, 1, null)
      if (configCreatePopupOpen && configCreateCloudSaveMode) {
         closeConfigCreatePopup$default(this, false, 1, null)
      } else {
         configCreatePopupOpen = true
         configCreateCloudSaveMode = true
         configCloudSaveExistingMode = false
         configCloudSaveSubmitting = false
         configCreateUnloadPrompt = اك.INSTANCE.isCloudConfigActive()
         configCreateInputFocused = false
         configCreateTextSelected = false
         configCreateText = ""
         configCreateStatusText = null
         logger.info("Cloud config create popup opened")
      }
   }

   private fun renderConfigKeyButton(bounds: طآ, text: String, enabled: Boolean, alpha: Float, whiteWhenEnabled: Boolean = false, hoverProgress: Float = 0.0F) {
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
      // 000: ldc_w 6.2
      // 003: fstore 7
      // 005: iload 5
      // 007: ifeq 03a
      // 00a: getstatic oxxxde/حز.configKeyUploadAnimation Loxxxde/ري;
      // 00d: iload 3
      // 00e: nop
      // 00f: ifeq 017
      // 012: fconst_1
      // 013: nop
      // 014: goto 019
      // 017: fconst_0
      // 018: nop
      // 019: ldc_w 220.0
      // 01c: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 01f: astore 9
      // 021: new oxxxde/ضص
      // 024: dup
      // 025: aload 9
      // 027: invokespecial oxxxde/ضص.<init> (Loxxxde/بف;)V
      // 02a: checkcast oxxxde/شل
      // 02d: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 030: fconst_0
      // 031: nop
      // 032: fconst_1
      // 033: nop
      // 034: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 037: goto 03c
      // 03a: fconst_0
      // 03b: nop
      // 03c: fstore 8
      // 03e: iload 5
      // 040: ifeq 049
      // 043: ldc_w 0.025
      // 046: goto 057
      // 049: iload 3
      // 04a: nop
      // 04b: ifeq 054
      // 04e: ldc_w 0.065
      // 051: goto 057
      // 054: ldc_w 0.025
      // 057: ldc_w 0.025
      // 05a: fload 6
      // 05c: fmul
      // 05d: fadd
      // 05e: fstore 9
      // 060: iload 5
      // 062: ifeq 06b
      // 065: ldc_w 0.055
      // 068: goto 079
      // 06b: iload 3
      // 06c: nop
      // 06d: ifeq 076
      // 070: ldc_w 0.11
      // 073: goto 079
      // 076: ldc_w 0.055
      // 079: ldc_w 0.05
      // 07c: fload 6
      // 07e: fmul
      // 07f: fadd
      // 080: fstore 10
      // 082: iload 5
      // 084: ifeq 08d
      // 087: ldc_w 0.42
      // 08a: goto 09b
      // 08d: iload 3
      // 08e: nop
      // 08f: ifeq 098
      // 092: ldc_w 0.86
      // 095: goto 09b
      // 098: ldc_w 0.42
      // 09b: ldc_w 0.1
      // 09e: fload 6
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: fstore 11
      // 0a4: fload 4
      // 0a6: ldc_w 255.0
      // 0a9: fmul
      // 0aa: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 0ad: bipush 0
      // 0ae: nop
      // 0af: sipush 255
      // 0b2: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 0b5: istore 12
      // 0b7: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0ba: fload 9
      // 0bc: fload 4
      // 0be: fmul
      // 0bf: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0c2: astore 13
      // 0c4: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0c7: fload 10
      // 0c9: fload 4
      // 0cb: fmul
      // 0cc: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0cf: astore 14
      // 0d1: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0d4: fload 11
      // 0d6: fload 4
      // 0d8: fmul
      // 0d9: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0dc: astore 15
      // 0de: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0e1: aload 15
      // 0e3: new java/awt/Color
      // 0e6: dup
      // 0e7: bipush 0
      // 0e8: nop
      // 0e9: bipush 0
      // 0ea: nop
      // 0eb: bipush 0
      // 0ec: nop
      // 0ed: iload 12
      // 0ef: invokespecial java/awt/Color.<init> (IIII)V
      // 0f2: fload 8
      // 0f4: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0f7: astore 16
      // 0f9: aload 1
      // 0fa: invokevirtual oxxxde/طآ.getX ()F
      // 0fd: aload 1
      // 0fe: invokevirtual oxxxde/طآ.getWidth ()F
      // 101: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 104: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 107: aload 2
      // 108: nop
      // 109: fload 7
      // 10b: fconst_0
      // 10c: nop
      // 10d: bipush 4
      // 10e: nop
      // 10f: aconst_null
      // 110: nop
      // 111: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 114: fsub
      // 115: ldc_w 0.5
      // 118: fmul
      // 119: fadd
      // 11a: fstore 17
      // 11c: aload 1
      // 11d: invokevirtual oxxxde/طآ.getY ()F
      // 120: aload 1
      // 121: invokevirtual oxxxde/طآ.getHeight ()F
      // 124: fload 7
      // 126: fsub
      // 127: ldc_w 0.46
      // 12a: fmul
      // 12b: fadd
      // 12c: fstore 18
      // 12e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 131: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 134: aload 0
      // 135: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 138: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 13b: aload 13
      // 13d: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 140: ldc_w 0.95
      // 143: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 146: ldc_w 3.5
      // 149: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 14c: fconst_1
      // 14d: nop
      // 14e: aload 14
      // 150: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 153: aload 1
      // 154: invokevirtual oxxxde/طآ.getX ()F
      // 157: aload 1
      // 158: invokevirtual oxxxde/طآ.getY ()F
      // 15b: aload 1
      // 15c: invokevirtual oxxxde/طآ.getWidth ()F
      // 15f: aload 1
      // 160: invokevirtual oxxxde/طآ.getHeight ()F
      // 163: invokevirtual oxxxde/جء.draw (FFFF)V
      // 166: fload 8
      // 168: ldc_w 0.001
      // 16b: fcmpl
      // 16c: ifle 1f0
      // 16f: ldc_w 255.0
      // 172: ldc_w 10.0
      // 175: fload 6
      // 177: fmul
      // 178: fsub
      // 179: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 17c: bipush 0
      // 17d: nop
      // 17e: sipush 255
      // 181: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 184: istore 19
      // 186: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 189: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 18c: aload 0
      // 18d: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 190: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 193: new java/awt/Color
      // 196: dup
      // 197: iload 19
      // 199: iload 19
      // 19b: iload 19
      // 19d: iload 12
      // 19f: i2f
      // 1a0: fload 8
      // 1a2: fmul
      // 1a3: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 1a6: bipush 0
      // 1a7: nop
      // 1a8: sipush 255
      // 1ab: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1ae: invokespecial java/awt/Color.<init> (IIII)V
      // 1b1: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 1b4: ldc_w 3.5
      // 1b7: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 1ba: fconst_1
      // 1bb: nop
      // 1bc: new java/awt/Color
      // 1bf: dup
      // 1c0: iload 19
      // 1c2: iload 19
      // 1c4: iload 19
      // 1c6: iload 12
      // 1c8: i2f
      // 1c9: fload 8
      // 1cb: fmul
      // 1cc: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 1cf: bipush 0
      // 1d0: nop
      // 1d1: sipush 255
      // 1d4: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1d7: invokespecial java/awt/Color.<init> (IIII)V
      // 1da: invokevirtual oxxxde/ضِ.border (FLjava/awt/Color;)Loxxxde/ضِ;
      // 1dd: aload 1
      // 1de: invokevirtual oxxxde/طآ.getX ()F
      // 1e1: aload 1
      // 1e2: invokevirtual oxxxde/طآ.getY ()F
      // 1e5: aload 1
      // 1e6: invokevirtual oxxxde/طآ.getWidth ()F
      // 1e9: aload 1
      // 1ea: invokevirtual oxxxde/طآ.getHeight ()F
      // 1ed: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 1f0: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1f3: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1f6: aload 0
      // 1f7: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1fa: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1fd: aload 2
      // 1fe: nop
      // 1ff: fload 17
      // 201: fload 18
      // 203: fload 7
      // 205: aload 16
      // 207: fconst_0
      // 208: nop
      // 209: fconst_0
      // 20a: nop
      // 20b: fconst_0
      // 20c: nop
      // 20d: bipush 0
      // 20e: nop
      // 20f: fconst_0
      // 210: nop
      // 211: sipush 992
      // 214: aconst_null
      // 215: nop
      // 216: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 219: return
   }

   private fun revokeCloudKeyAt(mouseX: Float, mouseY: Float, modal: طآ): Boolean {
      val var8: java.util.Iterator = CollectionsKt.getIndices(configShareGeneratedKeys).iterator()

      var var10000: Any
      while (true) {
         if (var8.hasNext()) {
            val `element$iv`: Any = var8.next()
            if (!INSTANCE.configShareRevokeButtonBounds(INSTANCE.configShareGeneratedKeyBounds(modal, (`element$iv` as java.lang.Number).intValue()))
               .contains(mouseX, mouseY)) {
               continue
            }

            var10000 = (Integer)`element$iv`
            break
         }

         var10000 = null
         break
      }

      var10000 = var10000
      if (var10000 != null) {
         val generated: بء = configShareGeneratedKeys.get(var10000)
         if (StringsKt.isBlank(generated.id)) {
            return true
         } else {
            configShareRequestId++
            val var13: Int = configShareRequestId
            خه.INSTANCE.revokeKey(generated.id).whenComplete({ p0: Any, p1: Any ->
               `$tmp0`(p0, p1)
            })
            return true
         }
      } else {
         return false
      }
   }

   private fun configCreateDividerBounds(popup: طآ): طآ {
      return طآ(popup.x + 7.0F, popup.y + 7.0F + 15.0F, popup.width - 14.0F, 1.0F)
   }

   private fun configKeyUploadButtonBounds(popup: طآ): طآ {
      val input: طآ = this.configKeyInputBounds(popup)
      return طآ(popup.x + 7.0F, input.y + input.height + 5.0F, (popup.width - 14.0F - 5.0F) * 0.5F, 17.0F)
   }

   private fun renderAvatarPopupSocialsSetting(x: Float, y: Float, width: Float, metrics: تذ, alpha: Float) {
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
      // 000: fload 5
      // 002: fconst_0
      // 003: nop
      // 004: fconst_1
      // 005: nop
      // 006: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 009: fstore 6
      // 00b: aload 4
      // 00d: ldc_w 6.0
      // 010: invokevirtual oxxxde/تذ.scaled (F)F
      // 013: fstore 7
      // 015: aload 4
      // 017: ldc_w 7.8
      // 01a: invokevirtual oxxxde/تذ.scaled (F)F
      // 01d: fstore 8
      // 01f: aload 4
      // 021: ldc_w 6.7
      // 024: invokevirtual oxxxde/تذ.scaled (F)F
      // 027: fstore 9
      // 029: aload 0
      // 02a: aload 4
      // 02c: invokespecial oxxxde/حز.avatarPopupSettingTextYOffset (Loxxxde/تذ;)F
      // 02f: fstore 10
      // 031: fload 1
      // 032: fload 7
      // 034: fadd
      // 035: fstore 11
      // 037: fload 2
      // 038: aload 4
      // 03a: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 03d: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 040: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 043: fload 8
      // 045: invokevirtual oxxxde/جً.getHeight (F)F
      // 048: fsub
      // 049: ldc_w 0.5
      // 04c: fmul
      // 04d: fadd
      // 04e: fstore 12
      // 050: fload 11
      // 052: fload 8
      // 054: fadd
      // 055: aload 4
      // 057: ldc_w 4.6
      // 05a: invokevirtual oxxxde/تذ.scaled (F)F
      // 05d: fadd
      // 05e: fstore 13
      // 060: fload 2
      // 061: aload 4
      // 063: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 066: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 069: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 06c: fload 9
      // 06e: invokevirtual oxxxde/جً.getHeight (F)F
      // 071: fsub
      // 072: ldc_w 0.5
      // 075: fmul
      // 076: fadd
      // 077: fload 10
      // 079: fsub
      // 07a: fstore 14
      // 07c: getstatic oxxxde/حز.avatarPopupSocialsAnimation Loxxxde/ري;
      // 07f: getstatic oxxxde/حغ.INSTANCE Loxxxde/حغ;
      // 082: invokevirtual oxxxde/حغ.isEnabled ()Z
      // 085: ifeq 08d
      // 088: fconst_1
      // 089: nop
      // 08a: goto 08f
      // 08d: fconst_0
      // 08e: nop
      // 08f: ldc_w 220.0
      // 092: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 095: astore 16
      // 097: new oxxxde/حء
      // 09a: dup
      // 09b: aload 16
      // 09d: invokespecial oxxxde/حء.<init> (Loxxxde/بف;)V
      // 0a0: checkcast oxxxde/شل
      // 0a3: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0a6: fconst_0
      // 0a7: nop
      // 0a8: fconst_1
      // 0a9: nop
      // 0aa: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0ad: fstore 15
      // 0af: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0b2: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 0b5: aload 0
      // 0b6: invokevirtual oxxxde/حز.iconsPipeline ()Loxxxde/صؤ;
      // 0b9: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 0bc: fload 8
      // 0be: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 0c1: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0c4: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 0c7: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 0ca: fload 6
      // 0cc: ldc_w 0.92
      // 0cf: fmul
      // 0d0: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 0d3: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 0d6: ldc_w "c"
      // 0d9: fload 11
      // 0db: fload 12
      // 0dd: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 0e0: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0e3: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 0e6: aload 0
      // 0e7: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0ea: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 0ed: fload 9
      // 0ef: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 0f2: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0f5: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 0f8: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 0fb: fload 6
      // 0fd: ldc_w 0.94
      // 100: fmul
      // 101: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 104: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 107: ldc_w "Игроки с Rain"
      // 10a: fload 13
      // 10c: fload 14
      // 10e: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 111: aload 4
      // 113: ldc_w 15.0
      // 116: invokevirtual oxxxde/تذ.scaled (F)F
      // 119: fstore 16
      // 11b: getstatic oxxxde/سأ.INSTANCE Loxxxde/سأ;
      // 11e: fload 1
      // 11f: fload 2
      // 120: aload 4
      // 122: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 125: fload 16
      // 127: fsub
      // 128: ldc_w 0.5
      // 12b: fmul
      // 12c: fadd
      // 12d: fload 3
      // 12e: fload 16
      // 130: aload 4
      // 132: ldc_w 5.0
      // 135: invokevirtual oxxxde/تذ.scaled (F)F
      // 138: fload 15
      // 13a: fload 6
      // 13c: fconst_1
      // 13d: nop
      // 13e: aload 0
      // 13f: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 142: invokevirtual oxxxde/سأ.render (FFFFFFFFLoxxxde/صؤ;)V
      // 145: return
   }

   private fun renderAvatarPopupDivider(x: Float, rowY: Float, rowHeight: Float, metrics: تذ, alpha: Float) {
      val dividerHeight: Float = rowHeight / 2.5F
      val var10000: جء = ذر.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline())
      val var10001: بح = بح.INSTANCE
      val var10002: Color = Color.WHITE
      var10000.color(var10001.setAlpha(var10002, 0.39F * alpha))
         .mix(0.9F)
         .round(0.0F)
         .draw(x, rowY + rowHeight / 2.0F - dividerHeight / 2.0F, metrics.rowDividerWidth(), dividerHeight)
      }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (!closing) {
         if (eventServerConfirmOpen) {
            this.handleEventServerConfirmKey(button)
         } else if (configShareModalOpen) {
            this.handleConfigShareKey(button)
         } else {
            val currentCategory: ظص = categoryTransition.current
            if (configCreatePopupOpen) {
               this.handleConfigCreateInput(button)
            } else if (configKeyPopupOpen && configKeyInputFocused) {
               this.handleConfigKeyInput(button)
            } else if (searchFocused) {
               this.handleModuleSearchInput(button)
            } else {
               val scale: Float = currentScale$default(this, 0.0F, 1, null)
               val transformedMouseX: Int = this.unscaleMouseX(mouseX, scale)
               val transformedMouseY: Int = this.unscaleMouseY(mouseY, scale)
               if (this.isConfigCategory(currentCategory)) {
                  configsCategoryComponent.onKeyPress(transformedMouseX, transformedMouseY, button)
               } else if (this.isPointsCategory(currentCategory)) {
                  pointsCategoryComponent.onKeyPress(transformedMouseX, transformedMouseY, button)
               } else if (this.isFriendsCategory(currentCategory)) {
                  friendsCategoryComponent.onKeyPress(transformedMouseX, transformedMouseY, button)
               } else if (this.isEventsCategory(currentCategory)) {
                  eventsCategoryComponent.onKeyPress(transformedMouseX, transformedMouseY, button)
               } else if (currentCategory != null) {
                  val var10000: جر = categoryComponents.get(currentCategory)
                  if (var10000 != null) {
                     var10000.onKeyPress(transformedMouseX, transformedMouseY, button)
                  }
               }
            }
         }
      }
   }

   private fun appendConfigCreateText(value: String) {
      if (value.length() != 0) {
         if (configCreateTextSelected) {
            configCreateText = ""
            configCreateTextSelected = false
         }

         if (configCreateText.length() < 24) {
            val var12: java.lang.String = configCreateText
            val `$this$filterTo$iv$iv`: java.lang.CharSequence = value
            val `destination$iv$iv`: Appendable = StringBuilder()
            var `index$iv$iv`: Int = 0

            for (var8 in `$this$filterTo$iv$iv`.length()..`index$iv$iv`) {
               val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(`index$iv$iv`)
               if (this.isAllowedConfigCreateChar(`element$iv$iv`)) {
                  `destination$iv$iv`.append(`element$iv$iv`)
               }
            }

            configCreateText = StringsKt.take("$var12${(`destination$iv$iv` as StringBuilder).toString()}", 24)
            configCreateStatusText = null
         }
      }
   }

   public override fun onMouseRelease(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseRelease(mouseX, mouseY, button)
      if (!closing && !configShareModalOpen && !eventServerConfirmOpen) {
         if (button == 0 && draggingAvatarPopupGuiScale) {
            this.commitAvatarPopupGuiScaleDrag((float)mouseX)
         } else if (button == 0 && draggingAvatarPopupHudScale) {
            this.commitAvatarPopupHudScaleDrag((float)mouseX)
         } else if (button == 0 && draggingScrollBar) {
            draggingScrollBar = false
            scrollBarGrabOffset = 0.0F
         } else {
            val scale: Float = currentScale$default(this, 0.0F, 1, null)
            val transformedMouseX: Int = this.unscaleMouseX(mouseX, scale)
            val transformedMouseY: Int = this.unscaleMouseY(mouseY, scale)
            val currentCategory: ظص = categoryTransition.current
            if (this.isConfigCategory(currentCategory)) {
               configsCategoryComponent.onMouseRelease(transformedMouseX, transformedMouseY, button)
            } else if (this.isPointsCategory(currentCategory)) {
               pointsCategoryComponent.onMouseRelease(transformedMouseX, transformedMouseY, button)
            } else if (this.isFriendsCategory(currentCategory)) {
               friendsCategoryComponent.onMouseRelease(transformedMouseX, transformedMouseY, button)
            } else if (this.isEventsCategory(currentCategory)) {
               eventsCategoryComponent.onMouseRelease(transformedMouseX, transformedMouseY, button)
            } else if (currentCategory != null) {
               val var10000: جر = categoryComponents.get(currentCategory)
               if (var10000 != null) {
                  var10000.onMouseRelease(transformedMouseX, transformedMouseY, button)
               }
            }
         }
      }
   }

   private fun tryStartAvatarPopupGuiScaleDrag(popupBounds: طآ, metrics: تذ, mouseX: Float, mouseY: Float): Boolean {
      val cardBounds: طآ = this.avatarPopupSettingBounds(popupBounds, metrics, 0)
      if (!this.avatarPopupGuiScaleSliderHitBounds(cardBounds, metrics).contains(mouseX, mouseY)) {
         return false
      } else {
         draggingAvatarPopupGuiScale = true
         this.updateAvatarPopupGuiScalePreview(mouseX, this.avatarPopupGuiScaleSliderBounds(cardBounds, metrics))
         return true
      }
   }

   private fun animatedGeneratedConfigKeyBounds(modal: طآ, position: Float): طآ {
      val divider: طآ = this.configShareDividerBounds(modal)
      return طآ(modal.x + 7.0F, divider.y + divider.height + 5.0F + position * 15.0F, modal.width - 14.0F, 13.0F)
   }

   private fun closeConfigCreatePopup(clearInput: Boolean = false) {
      configCreatePopupOpen = false
      configCreateCloudSaveMode = false
      configCloudSaveExistingMode = false
      configCloudSaveSubmitting = false
      configCreateUnloadPrompt = false
      configCreateInputFocused = false
      configCreateTextSelected = false
      if (clearInput) {
         configCreateText = ""
         configCreateStatusText = null
         ري.animate$default(configCreateButtonAnimation, 0.0F, 0.0F, null, 4, null)
      }
   }

   private fun configShareCopyButtonBounds(modal: طآ): طآ {
      val lastRow: طآ = this.configShareGeneratedKeyBounds(modal, RangesKt.coerceAtLeast(configShareGeneratedKeys.size() - 1, 0))
      return طآ(
         modal.x + 7.0F,
         lastRow.y + lastRow.height + 5.0F,
         if (configShareManagingExisting) (modal.width - 14.0F - 5.0F) * 0.5F else modal.width - 14.0F,
         17.0F
      )
   }

   private fun renderConfigShareCopyButton(bounds: طآ, alpha: Float, hoverProgress: Float) {
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
      // 000: fload 2
      // 001: ldc_w 255.0
      // 004: fmul
      // 005: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 008: bipush 0
      // 009: nop
      // 00a: sipush 255
      // 00d: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 010: istore 4
      // 012: ldc_w 255.0
      // 015: ldc_w 10.0
      // 018: fload 3
      // 019: fmul
      // 01a: fsub
      // 01b: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 01e: bipush 0
      // 01f: nop
      // 020: sipush 255
      // 023: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 026: istore 5
      // 028: invokestatic java/lang/System.currentTimeMillis ()J
      // 02b: lstore 6
      // 02d: getstatic oxxxde/حز.configShareCopiedAtMs J
      // 030: lconst_0
      // 031: nop
      // 032: lcmp
      // 033: ifle 048
      // 036: lload 6
      // 038: getstatic oxxxde/حز.configShareCopiedAtMs J
      // 03b: lsub
      // 03c: ldc2_w 1400
      // 03f: lcmp
      // 040: ifge 048
      // 043: bipush 1
      // 044: nop
      // 045: goto 04a
      // 048: bipush 0
      // 049: nop
      // 04a: istore 8
      // 04c: getstatic oxxxde/حز.configShareCopyFeedbackAnimation Loxxxde/ري;
      // 04f: iload 8
      // 051: ifeq 059
      // 054: fconst_1
      // 055: nop
      // 056: goto 05b
      // 059: fconst_0
      // 05a: nop
      // 05b: ldc_w 180.0
      // 05e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 061: astore 10
      // 063: new oxxxde/سو
      // 066: dup
      // 067: aload 10
      // 069: invokespecial oxxxde/سو.<init> (Loxxxde/بف;)V
      // 06c: checkcast oxxxde/شل
      // 06f: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 072: fconst_0
      // 073: nop
      // 074: fconst_1
      // 075: nop
      // 076: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 079: fstore 9
      // 07b: ldc_w "Скопировать"
      // 07e: astore 10
      // 080: ldc_w "Скопировано!"
      // 083: astore 11
      // 085: ldc_w 6.2
      // 088: fstore 12
      // 08a: aload 1
      // 08b: invokevirtual oxxxde/طآ.getY ()F
      // 08e: aload 1
      // 08f: invokevirtual oxxxde/طآ.getHeight ()F
      // 092: fload 12
      // 094: fsub
      // 095: ldc_w 0.46
      // 098: fmul
      // 099: fadd
      // 09a: fstore 13
      // 09c: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 09f: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 0a2: aload 0
      // 0a3: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0a6: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 0a9: new java/awt/Color
      // 0ac: dup
      // 0ad: iload 5
      // 0af: iload 5
      // 0b1: iload 5
      // 0b3: iload 4
      // 0b5: invokespecial java/awt/Color.<init> (IIII)V
      // 0b8: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 0bb: ldc_w 3.5
      // 0be: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 0c1: fconst_1
      // 0c2: nop
      // 0c3: new java/awt/Color
      // 0c6: dup
      // 0c7: iload 5
      // 0c9: iload 5
      // 0cb: iload 5
      // 0cd: iload 4
      // 0cf: invokespecial java/awt/Color.<init> (IIII)V
      // 0d2: invokevirtual oxxxde/ضِ.border (FLjava/awt/Color;)Loxxxde/ضِ;
      // 0d5: aload 1
      // 0d6: invokevirtual oxxxde/طآ.getX ()F
      // 0d9: aload 1
      // 0da: invokevirtual oxxxde/طآ.getY ()F
      // 0dd: aload 1
      // 0de: invokevirtual oxxxde/طآ.getWidth ()F
      // 0e1: aload 1
      // 0e2: invokevirtual oxxxde/طآ.getHeight ()F
      // 0e5: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 0e8: fload 9
      // 0ea: ldc_w 0.999
      // 0ed: fcmpg
      // 0ee: ifge 167
      // 0f1: iload 4
      // 0f3: i2f
      // 0f4: fconst_1
      // 0f5: nop
      // 0f6: fload 9
      // 0f8: fsub
      // 0f9: fmul
      // 0fa: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 0fd: bipush 0
      // 0fe: nop
      // 0ff: sipush 255
      // 102: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 105: istore 14
      // 107: aload 1
      // 108: invokevirtual oxxxde/طآ.getX ()F
      // 10b: aload 1
      // 10c: invokevirtual oxxxde/طآ.getWidth ()F
      // 10f: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 112: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 115: aload 10
      // 117: fload 12
      // 119: fconst_0
      // 11a: nop
      // 11b: bipush 4
      // 11c: nop
      // 11d: aconst_null
      // 11e: nop
      // 11f: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 122: fsub
      // 123: ldc_w 0.5
      // 126: fmul
      // 127: fadd
      // 128: fstore 15
      // 12a: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 12d: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 130: aload 0
      // 131: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 134: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 137: aload 10
      // 139: fload 15
      // 13b: fload 13
      // 13d: fload 9
      // 13f: ldc_w 3.0
      // 142: fmul
      // 143: fsub
      // 144: fload 12
      // 146: new java/awt/Color
      // 149: dup
      // 14a: bipush 0
      // 14b: nop
      // 14c: bipush 0
      // 14d: nop
      // 14e: bipush 0
      // 14f: nop
      // 150: iload 14
      // 152: invokespecial java/awt/Color.<init> (IIII)V
      // 155: fconst_0
      // 156: nop
      // 157: fconst_0
      // 158: nop
      // 159: fconst_0
      // 15a: nop
      // 15b: bipush 0
      // 15c: nop
      // 15d: fconst_0
      // 15e: nop
      // 15f: sipush 992
      // 162: aconst_null
      // 163: nop
      // 164: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 167: fload 9
      // 169: ldc_w 0.001
      // 16c: fcmpl
      // 16d: ifle 1e6
      // 170: iload 4
      // 172: i2f
      // 173: fload 9
      // 175: fmul
      // 176: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 179: bipush 0
      // 17a: nop
      // 17b: sipush 255
      // 17e: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 181: istore 14
      // 183: aload 1
      // 184: invokevirtual oxxxde/طآ.getX ()F
      // 187: aload 1
      // 188: invokevirtual oxxxde/طآ.getWidth ()F
      // 18b: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 18e: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 191: aload 11
      // 193: fload 12
      // 195: fconst_0
      // 196: nop
      // 197: bipush 4
      // 198: nop
      // 199: aconst_null
      // 19a: nop
      // 19b: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 19e: fsub
      // 19f: ldc_w 0.5
      // 1a2: fmul
      // 1a3: fadd
      // 1a4: fstore 15
      // 1a6: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1a9: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1ac: aload 0
      // 1ad: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1b0: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1b3: aload 11
      // 1b5: fload 15
      // 1b7: fload 13
      // 1b9: fconst_1
      // 1ba: nop
      // 1bb: fload 9
      // 1bd: fsub
      // 1be: ldc_w 3.0
      // 1c1: fmul
      // 1c2: fadd
      // 1c3: fload 12
      // 1c5: new java/awt/Color
      // 1c8: dup
      // 1c9: bipush 0
      // 1ca: nop
      // 1cb: bipush 0
      // 1cc: nop
      // 1cd: bipush 0
      // 1ce: nop
      // 1cf: iload 14
      // 1d1: invokespecial java/awt/Color.<init> (IIII)V
      // 1d4: fconst_0
      // 1d5: nop
      // 1d6: fconst_0
      // 1d7: nop
      // 1d8: fconst_0
      // 1d9: nop
      // 1da: bipush 0
      // 1db: nop
      // 1dc: fconst_0
      // 1dd: nop
      // 1de: sipush 992
      // 1e1: aconst_null
      // 1e2: nop
      // 1e3: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1e6: return
   }

   private fun configKeyPopupBounds(layout: زْ): طآ {
      return طآ(
         layout.topBarConfigAuxButtonX + layout.topBarConfigButtonSize - 142.0F,
         layout.topBarY + layout.topBarHeight + 5.0F,
         142.0F,
         configKeyRenderedPopupHeight
      )
   }

   private fun renderAvatarPopupGuiScaleSetting(x: Float, y: Float, width: Float, metrics: تذ, alpha: Float, mouseX: Int, mouseY: Int) {
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
      // 000: new oxxxde/طآ
      // 003: dup
      // 004: fload 1
      // 005: fload 2
      // 006: fload 3
      // 007: aload 4
      // 009: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 00c: invokespecial oxxxde/طآ.<init> (FFFF)V
      // 00f: astore 8
      // 011: aload 0
      // 012: aload 8
      // 014: aload 4
      // 016: invokespecial oxxxde/حز.avatarPopupGuiScaleSliderBounds (Loxxxde/طآ;Loxxxde/تذ;)Loxxxde/طآ;
      // 019: astore 9
      // 01b: getstatic oxxxde/حز.draggingAvatarPopupGuiScale Z
      // 01e: ifeq 03b
      // 021: aload 0
      // 022: iload 6
      // 024: i2f
      // 025: aload 9
      // 027: invokespecial oxxxde/حز.updateAvatarPopupGuiScalePreview (FLoxxxde/طآ;)V
      // 02a: aload 0
      // 02b: invokespecial oxxxde/حز.isLeftMousePressed ()Z
      // 02e: ifne 03b
      // 031: aload 0
      // 032: aconst_null
      // 033: nop
      // 034: bipush 1
      // 035: nop
      // 036: aconst_null
      // 037: nop
      // 038: invokestatic oxxxde/حز.commitAvatarPopupGuiScaleDrag$default (Loxxxde/حز;Ljava/lang/Float;ILjava/lang/Object;)V
      // 03b: fload 5
      // 03d: fconst_0
      // 03e: nop
      // 03f: fconst_1
      // 040: nop
      // 041: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 044: fstore 10
      // 046: aload 4
      // 048: ldc_w 6.0
      // 04b: invokevirtual oxxxde/تذ.scaled (F)F
      // 04e: fstore 11
      // 050: aload 4
      // 052: ldc_w 7.8
      // 055: invokevirtual oxxxde/تذ.scaled (F)F
      // 058: fstore 12
      // 05a: aload 4
      // 05c: ldc_w 6.7
      // 05f: invokevirtual oxxxde/تذ.scaled (F)F
      // 062: fstore 13
      // 064: aload 4
      // 066: ldc_w 6.2
      // 069: invokevirtual oxxxde/تذ.scaled (F)F
      // 06c: fstore 14
      // 06e: aload 0
      // 06f: aload 4
      // 071: invokespecial oxxxde/حز.avatarPopupSettingTextYOffset (Loxxxde/تذ;)F
      // 074: fstore 15
      // 076: fload 1
      // 077: fload 11
      // 079: fadd
      // 07a: fstore 16
      // 07c: fload 2
      // 07d: aload 4
      // 07f: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 082: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 085: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 088: fload 12
      // 08a: invokevirtual oxxxde/جً.getHeight (F)F
      // 08d: fsub
      // 08e: ldc_w 0.5
      // 091: fmul
      // 092: fadd
      // 093: fstore 17
      // 095: fload 16
      // 097: fload 12
      // 099: fadd
      // 09a: aload 4
      // 09c: ldc_w 4.6
      // 09f: invokevirtual oxxxde/تذ.scaled (F)F
      // 0a2: fadd
      // 0a3: fstore 18
      // 0a5: fload 2
      // 0a6: aload 4
      // 0a8: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 0ab: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0ae: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 0b1: fload 13
      // 0b3: invokevirtual oxxxde/جً.getHeight (F)F
      // 0b6: fsub
      // 0b7: ldc_w 0.5
      // 0ba: fmul
      // 0bb: fadd
      // 0bc: fload 15
      // 0be: fsub
      // 0bf: fstore 19
      // 0c1: aload 0
      // 0c2: invokespecial oxxxde/حز.avatarPopupGuiScaleValueText ()Ljava/lang/String;
      // 0c5: astore 20
      // 0c7: aload 9
      // 0c9: invokevirtual oxxxde/طآ.getX ()F
      // 0cc: aload 9
      // 0ce: invokevirtual oxxxde/طآ.getWidth ()F
      // 0d1: fadd
      // 0d2: aload 4
      // 0d4: ldc_w 5.0
      // 0d7: invokevirtual oxxxde/تذ.scaled (F)F
      // 0da: fadd
      // 0db: fstore 21
      // 0dd: fload 2
      // 0de: aload 4
      // 0e0: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 0e3: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0e6: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 0e9: fload 14
      // 0eb: invokevirtual oxxxde/جً.getHeight (F)F
      // 0ee: fsub
      // 0ef: ldc_w 0.5
      // 0f2: fmul
      // 0f3: fadd
      // 0f4: fload 15
      // 0f6: fsub
      // 0f7: fstore 22
      // 0f9: getstatic oxxxde/حز.avatarPopupGuiScaleDragProgress Ljava/lang/Float;
      // 0fc: dup
      // 0fd: ifnull 106
      // 100: invokevirtual java/lang/Float.floatValue ()F
      // 103: goto 10d
      // 106: pop
      // 107: getstatic oxxxde/سر.INSTANCE Loxxxde/سر;
      // 10a: invokevirtual oxxxde/سر.scaleProgress ()F
      // 10d: fstore 23
      // 10f: getstatic oxxxde/حز.avatarPopupGuiScaleAnimation Loxxxde/ري;
      // 112: fload 23
      // 114: ldc_w 120.0
      // 117: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 11a: astore 25
      // 11c: new oxxxde/جآ
      // 11f: dup
      // 120: aload 25
      // 122: invokespecial oxxxde/جآ.<init> (Loxxxde/بف;)V
      // 125: checkcast oxxxde/شل
      // 128: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 12b: fconst_0
      // 12c: nop
      // 12d: fconst_1
      // 12e: nop
      // 12f: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 132: fstore 24
      // 134: aload 9
      // 136: invokevirtual oxxxde/طآ.getWidth ()F
      // 139: fload 24
      // 13b: fmul
      // 13c: fstore 25
      // 13e: aload 0
      // 13f: aload 8
      // 141: aload 4
      // 143: invokespecial oxxxde/حز.avatarPopupGuiScaleSliderHitBounds (Loxxxde/طآ;Loxxxde/تذ;)Loxxxde/طآ;
      // 146: iload 6
      // 148: i2f
      // 149: iload 7
      // 14b: i2f
      // 14c: invokevirtual oxxxde/طآ.contains (FF)Z
      // 14f: istore 26
      // 151: aload 4
      // 153: getstatic oxxxde/حز.draggingAvatarPopupGuiScale Z
      // 156: ifne 15e
      // 159: iload 26
      // 15b: ifeq 164
      // 15e: ldc_w 5.3
      // 161: goto 167
      // 164: ldc_w 4.7
      // 167: invokevirtual oxxxde/تذ.scaled (F)F
      // 16a: fstore 27
      // 16c: aload 9
      // 16e: invokevirtual oxxxde/طآ.getX ()F
      // 171: fload 25
      // 173: fadd
      // 174: fload 27
      // 176: ldc_w 0.5
      // 179: fmul
      // 17a: fsub
      // 17b: aload 9
      // 17d: invokevirtual oxxxde/طآ.getX ()F
      // 180: fload 27
      // 182: ldc_w 0.5
      // 185: fmul
      // 186: fsub
      // 187: aload 9
      // 189: invokevirtual oxxxde/طآ.getX ()F
      // 18c: aload 9
      // 18e: invokevirtual oxxxde/طآ.getWidth ()F
      // 191: fadd
      // 192: fload 27
      // 194: ldc_w 0.5
      // 197: fmul
      // 198: fsub
      // 199: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 19c: fstore 28
      // 19e: aload 9
      // 1a0: invokevirtual oxxxde/طآ.getY ()F
      // 1a3: aload 9
      // 1a5: invokevirtual oxxxde/طآ.getHeight ()F
      // 1a8: ldc_w 0.5
      // 1ab: fmul
      // 1ac: fadd
      // 1ad: fload 27
      // 1af: ldc_w 0.5
      // 1b2: fmul
      // 1b3: fsub
      // 1b4: fstore 29
      // 1b6: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1b9: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 1bc: aload 0
      // 1bd: invokevirtual oxxxde/حز.iconsPipeline ()Loxxxde/صؤ;
      // 1c0: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1c3: fload 12
      // 1c5: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 1c8: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1cb: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 1ce: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 1d1: fload 10
      // 1d3: ldc_w 0.92
      // 1d6: fmul
      // 1d7: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 1da: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 1dd: ldc_w "F"
      // 1e0: fload 16
      // 1e2: fload 17
      // 1e4: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 1e7: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1ea: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1ed: aload 0
      // 1ee: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1f1: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1f4: fload 13
      // 1f6: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 1f9: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1fc: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 1ff: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 202: fload 10
      // 204: ldc_w 0.94
      // 207: fmul
      // 208: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 20b: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 20e: ldc_w "Размер гуи"
      // 211: fload 18
      // 213: fload 19
      // 215: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 218: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 21b: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 21e: aload 0
      // 21f: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 222: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 225: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 228: ldc_w 0.08
      // 22b: fload 10
      // 22d: fmul
      // 22e: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 231: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 234: aload 4
      // 236: ldc_w 0.8
      // 239: invokevirtual oxxxde/تذ.scaled (F)F
      // 23c: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 23f: aload 9
      // 241: invokevirtual oxxxde/طآ.getX ()F
      // 244: aload 9
      // 246: invokevirtual oxxxde/طآ.getY ()F
      // 249: aload 9
      // 24b: invokevirtual oxxxde/طآ.getWidth ()F
      // 24e: aload 9
      // 250: invokevirtual oxxxde/طآ.getHeight ()F
      // 253: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 256: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 259: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 25c: aload 0
      // 25d: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 260: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 263: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 266: ldc_w 0.28
      // 269: getstatic oxxxde/حز.draggingAvatarPopupGuiScale Z
      // 26c: ifeq 275
      // 26f: ldc_w 0.12
      // 272: goto 277
      // 275: fconst_0
      // 276: nop
      // 277: fadd
      // 278: fload 10
      // 27a: fmul
      // 27b: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 27e: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 281: aload 4
      // 283: ldc_w 0.8
      // 286: invokevirtual oxxxde/تذ.scaled (F)F
      // 289: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 28c: aload 9
      // 28e: invokevirtual oxxxde/طآ.getX ()F
      // 291: aload 9
      // 293: invokevirtual oxxxde/طآ.getY ()F
      // 296: fload 25
      // 298: aload 9
      // 29a: invokevirtual oxxxde/طآ.getHeight ()F
      // 29d: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 2a0: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 2a3: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 2a6: aload 0
      // 2a7: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 2aa: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 2ad: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2b0: ldc_w 0.72
      // 2b3: getstatic oxxxde/حز.draggingAvatarPopupGuiScale Z
      // 2b6: ifne 2be
      // 2b9: iload 26
      // 2bb: ifeq 2c4
      // 2be: ldc_w 0.18
      // 2c1: goto 2c6
      // 2c4: fconst_0
      // 2c5: nop
      // 2c6: fadd
      // 2c7: fload 10
      // 2c9: fmul
      // 2ca: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 2cd: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 2d0: fload 27
      // 2d2: ldc_w 3.0
      // 2d5: fdiv
      // 2d6: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 2d9: fload 28
      // 2db: fload 29
      // 2dd: fload 27
      // 2df: fload 27
      // 2e1: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 2e4: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 2e7: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 2ea: aload 0
      // 2eb: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 2ee: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 2f1: fload 14
      // 2f3: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 2f6: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 2f9: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 2fc: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 2ff: fload 10
      // 301: ldc_w 0.82
      // 304: fmul
      // 305: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 308: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 30b: aload 20
      // 30d: fload 21
      // 30f: fload 22
      // 311: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 314: return
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (!closing) {
         if (eventServerConfirmOpen) {
            this.handleEventServerConfirmMouseClick((float)mouseX, (float)mouseY, button)
         } else if (configShareModalOpen) {
            this.handleConfigShareMouseClick((float)mouseX, (float)mouseY, button)
         } else {
            val scale: Float = currentScale$default(this, 0.0F, 1, null)
            val transformedMouseX: Int = this.unscaleMouseX(mouseX, scale)
            val transformedMouseY: Int = this.unscaleMouseY(mouseY, scale)
            val var10000: ام = CollectionsKt.firstOrNull(components)
            val sidebarPadding: Float = if (var10000 != null) var10000.getPadding() else uiPadding
            val currentCategory: ظص = categoryTransition.current
            val configMode: Boolean = this.isConfigCategory(currentCategory)
            val configCloudMode: Boolean = configMode && configsCategoryComponent.isCloudPage()
            val pointsMode: Boolean = this.isPointsCategory(currentCategory)
            val friendsMode: Boolean = this.isFriendsCategory(currentCategory)
            val eventsMode: Boolean = this.isEventsCategory(currentCategory)
            val layout: زْ = زْ(
               this.x,
               this.y,
               this.width,
               this.height,
               this.panelWidth,
               uiPadding,
               topBarHeight,
               sidebarPadding,
               components.size(),
               configMode,
               pointsMode,
               configCloudMode
            )
            val mouseXF: Float = transformedMouseX
            val mouseYF: Float = transformedMouseY
            val inSearchInput: Boolean = layout.isInsideTopBarSearchInput(mouseXF, (float)transformedMouseY)
            val inConfigCreateAction: Boolean = configMode && layout.isInsideTopBarConfigCreateAction(mouseXF, (float)transformedMouseY)
            val inConfigAuxAction: Boolean = configMode && configCloudMode && layout.isInsideTopBarConfigAuxAction(mouseXF, mouseYF)
            val inFolderAction: Boolean = configMode && !configCloudMode && layout.isInsideTopBarFolderAction(mouseXF, mouseYF)
            if (button == 0) {
               if (this.avatarBounds(layout).contains(mouseXF, mouseYF)) {
                  closeConfigKeyPopup$default(this, false, 1, null)
                  closeConfigCreatePopup$default(this, false, 1, null)
                  avatarPopupOpen = !avatarPopupOpen
                  searchFocused = false
                  topBarTextSelected = false
                  this.clearCategoryInputFocus()
                  return
               }

               if (avatarPopupOpen) {
                  val state: تذ = this.avatarPopupMetrics(scale)
                  val category: طآ = this.avatarPopupBounds(layout, scale, state)
                  if (this.avatarPopupCloseBounds(category, state).contains((float)mouseX, (float)mouseY)) {
                     avatarPopupOpen = false
                     draggingAvatarPopupGuiScale = false
                     avatarPopupGuiScaleDragProgress = null
                     draggingAvatarPopupHudScale = false
                     avatarPopupHudScaleDragProgress = null
                     return
                  }

                  if (this.tryStartAvatarPopupGuiScaleDrag(category, state, (float)mouseX, (float)mouseY)) {
                     return
                  }

                  if (this.tryStartAvatarPopupHudScaleDrag(category, state, (float)mouseX, (float)mouseY)) {
                     return
                  }

                  if (this.avatarPopupGuiBackgroundBounds(category, state).contains((float)mouseX, (float)mouseY)) {
                     سر.INSTANCE.toggleGuiBackground()
                     return
                  }

                  if (this.avatarPopupSocialsBounds(category, state).contains((float)mouseX, (float)mouseY)) {
                     حغ.INSTANCE.toggle()
                     return
                  }

                  if (this.avatarPopupInfoActionBounds(category, state).contains((float)mouseX, (float)mouseY)) {
                     this.openRainVisualsSite()
                     return
                  }

                  if (category.contains((float)mouseX, (float)mouseY)) {
                     return
                  }

                  draggingAvatarPopupGuiScale = false
                  avatarPopupGuiScaleDragProgress = null
                  draggingAvatarPopupHudScale = false
                  avatarPopupHudScaleDragProgress = null
                  avatarPopupOpen = false
               }

               if (inConfigCreateAction) {
                  if (configCloudMode) {
                     this.openConfigCloudSavePopup()
                     searchFocused = false
                     topBarTextSelected = false
                     this.clearCategoryInputFocus()
                     return
                  }

                  if (configCreatePopupOpen) {
                     closeConfigCreatePopup$default(this, false, 1, null)
                  } else {
                     configCreatePopupOpen = true
                     configCreateCloudSaveMode = false
                     configCloudSaveExistingMode = false
                     configCreateUnloadPrompt = اك.INSTANCE.isCloudConfigActive()
                     configCreateInputFocused = false
                     configCreateTextSelected = false
                     configCreateStatusText = null
                  }

                  closeConfigKeyPopup$default(this, false, 1, null)
                  searchFocused = false
                  topBarTextSelected = false
                  this.clearCategoryInputFocus()
                  return
               }

               if (inConfigAuxAction) {
                  closeConfigCreatePopup$default(this, false, 1, null)
                  if (configKeyPopupOpen) {
                     closeConfigKeyPopup$default(this, false, 1, null)
                  } else {
                     configKeyPopupOpen = true
                     configKeySubmitting = false
                  }

                  configKeyInputFocused = false
                  configKeyTextSelected = false
                  configKeyStatusText = null
                  searchFocused = false
                  topBarTextSelected = false
                  this.clearCategoryInputFocus()
                  return
               }

               if (configMode && configCreatePopupOpen) {
                  val var29: طآ = this.configCreatePopupBounds(layout)
                  if (var29.contains(mouseXF, mouseYF)) {
                     if (!configCreateUnloadPrompt && !configCloudSaveExistingMode && this.configCreateInputBounds(var29).contains(mouseXF, mouseYF)) {
                        configCreateInputFocused = true
                        configCreateTextSelected = false
                        configCreateStatusText = null
                     } else if (this.configCreateConfirmButtonBounds(var29).contains(mouseXF, mouseYF)) {
                        if (configCreateUnloadPrompt) {
                           this.submitCloudConfigUnload()
                        } else if (configCreateCloudSaveMode) {
                           this.submitConfigCloudSave()
                        } else {
                           this.submitConfigCreate()
                        }
                     } else if (this.configCreateCancelButtonBounds(var29).contains(mouseXF, mouseYF)) {
                        this.closeConfigCreatePopup(true)
                     } else {
                        configCreateInputFocused = false
                        configCreateTextSelected = false
                     }

                     return
                  }

                  closeConfigCreatePopup$default(this, false, 1, null)
               }

               if (configMode && configKeyPopupOpen) {
                  val var30: طآ = this.configKeyPopupBounds(layout)
                  if (var30.contains(mouseXF, mouseYF)) {
                     if (this.configKeyInputBounds(var30).contains(mouseXF, mouseYF)) {
                        configKeyInputFocused = true
                        configKeyTextSelected = false
                     } else if (this.configKeyUploadButtonBounds(var30).contains(mouseXF, mouseYF)) {
                        this.submitConfigKey()
                     } else if (this.configKeyCancelButtonBounds(var30).contains(mouseXF, mouseYF)) {
                        this.closeConfigKeyPopup(true)
                     } else {
                        configKeyInputFocused = false
                        configKeyTextSelected = false
                     }

                     return
                  }

                  closeConfigKeyPopup$default(this, false, 1, null)
               }

               if (inFolderAction) {
                  closeConfigKeyPopup$default(this, false, 1, null)
                  closeConfigCreatePopup$default(this, false, 1, null)
                  searchFocused = false
                  topBarTextSelected = false
                  this.clearCategoryInputFocus()
                  this.openConfigFolder()
                  return
               }

               searchFocused = inSearchInput
               topBarTextSelected = false
               if (inSearchInput) {
                  this.clearCategoryInputFocus()
                  return
               }
            }

            for (pointsComponent in components) {
               val friendsComponent: ام = pointsComponent as ام
               if (transformedMouseX >= (pointsComponent as ام).getX()
                  && transformedMouseX <= (pointsComponent as ام).getX() + (pointsComponent as ام).getWidth()
                  && transformedMouseY >= (pointsComponent as ام).getY()
                  && transformedMouseY <= (pointsComponent as ام).getY() + (pointsComponent as ام).getHeight()) {
                  if (categoryTransition.select(friendsComponent.getCategory())) {
                     closeConfigKeyPopup$default(INSTANCE, false, 1, null)
                     closeConfigCreatePopup$default(INSTANCE, false, 1, null)
                     if (INSTANCE.isConfigCategory(friendsComponent.getCategory())) {
                        configsCategoryComponent.resetScroll()
                     } else if (INSTANCE.isPointsCategory(friendsComponent.getCategory())) {
                        pointsCategoryComponent.resetScroll()
                     } else if (INSTANCE.isFriendsCategory(friendsComponent.getCategory())) {
                        friendsCategoryComponent.resetScroll()
                     } else if (INSTANCE.isEventsCategory(friendsComponent.getCategory())) {
                        eventsCategoryComponent.resetScroll()
                     } else {
                        val var45: جر = categoryComponents.get(friendsComponent.getCategory())
                        if (var45 != null) {
                           var45.resetScroll()
                        }
                     }

                     INSTANCE.clearCategoryInputFocus()
                     draggingScrollBar = false
                     scrollBarGrabOffset = 0.0F
                  }

                  return
               }
            }

            if (button == 0 && categoryContentAlpha > 0.5F) {
               val var32: خف = scrollBarState
               val var46: جر = if (currentCategory != null) categoryComponents.get(currentCategory) else null
               val var37: ضز = if (configMode) configsCategoryComponent else null
               val var40: رِ = if (pointsMode) pointsCategoryComponent else null
               val var42: طل = if (friendsMode) friendsCategoryComponent else null
               val var44: طك = if (eventsMode) eventsCategoryComponent else null
               if (scrollBarState != null
                  && (var46 != null || var37 != null || var40 != null || var42 != null || (if (eventsMode) eventsCategoryComponent else null) != null)
                  && scrollBarState.contains(mouseXF, mouseYF)) {
                  if (var32.canScroll) {
                     val travel: Float = RangesKt.coerceAtLeast(var32.trackHeight - var32.thumbHeight, 0.0F)
                     if (travel > 0.0F) {
                        if (var32.thumbContains(mouseXF, mouseYF)) {
                           draggingScrollBar = true
                           scrollBarGrabOffset = RangesKt.coerceIn(mouseYF - var32.thumbY, 0.0F, var32.thumbHeight)
                        } else {
                           val local: Float = RangesKt.coerceIn(mouseYF - var32.trackY - var32.thumbHeight * 0.5F, 0.0F, travel)
                           if (var37 != null) {
                              var37.setScrollProgress(local / travel, true)
                           } else if (var40 != null) {
                              var40.setScrollProgress(local / travel, true)
                           } else if (var42 != null) {
                              var42.setScrollProgress(local / travel, true)
                           } else if (var44 != null) {
                              var44.setScrollProgress(local / travel, true)
                           } else if (var46 != null) {
                              var46.setScrollProgress(local / travel, true)
                           }

                           draggingScrollBar = true
                           scrollBarGrabOffset = var32.thumbHeight * 0.5F
                        }
                     }
                  }

                  return
               }
            }

            if (!(categoryContentAlpha <= 0.5F)) {
               if (configMode) {
                  configsCategoryComponent.onMouseClick(transformedMouseX, transformedMouseY, button)
               } else if (pointsMode) {
                  pointsCategoryComponent.onMouseClick(transformedMouseX, transformedMouseY, button)
               } else if (friendsMode) {
                  friendsCategoryComponent.onMouseClick(transformedMouseX, transformedMouseY, button)
               } else if (eventsMode) {
                  eventsCategoryComponent.onMouseClick(transformedMouseX, transformedMouseY, button)
               } else if (currentCategory != null) {
                  val var47: جر = categoryComponents.get(currentCategory)
                  if (var47 != null) {
                     var47.onMouseClick(transformedMouseX, transformedMouseY, button)
                  }
               }
            }
         }
      }
   }

   private fun renderConfigCreatePopup(layout: زْ, configMode: Boolean, openProgress: Float, mouseX: Float, mouseY: Float) {
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
      // 000: iload 2
      // 001: nop
      // 002: ifne 02f
      // 005: getstatic oxxxde/حز.configCreatePopupAnimation Loxxxde/ري;
      // 008: fconst_0
      // 009: nop
      // 00a: fconst_0
      // 00b: nop
      // 00c: aconst_null
      // 00d: nop
      // 00e: bipush 4
      // 00f: nop
      // 010: aconst_null
      // 011: nop
      // 012: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 015: pop
      // 016: ldc_w 77.0
      // 019: putstatic oxxxde/حز.configCreateRenderedPopupHeight F
      // 01c: getstatic oxxxde/حز.configCreatePopupHeightAnimation Loxxxde/ري;
      // 01f: ldc_w 77.0
      // 022: fconst_0
      // 023: nop
      // 024: aconst_null
      // 025: nop
      // 026: bipush 4
      // 027: nop
      // 028: aconst_null
      // 029: nop
      // 02a: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 02d: pop
      // 02e: return
      // 02f: getstatic oxxxde/حز.configCreatePopupAnimation Loxxxde/ري;
      // 032: getstatic oxxxde/حز.configCreatePopupOpen Z
      // 035: ifeq 03d
      // 038: fconst_1
      // 039: nop
      // 03a: goto 03f
      // 03d: fconst_0
      // 03e: nop
      // 03f: ldc_w 180.0
      // 042: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 045: astore 7
      // 047: new oxxxde/حة
      // 04a: dup
      // 04b: aload 7
      // 04d: invokespecial oxxxde/حة.<init> (Loxxxde/بف;)V
      // 050: checkcast oxxxde/شل
      // 053: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 056: fconst_0
      // 057: nop
      // 058: fconst_1
      // 059: nop
      // 05a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 05d: fstore 6
      // 05f: fload 6
      // 061: ldc_w 0.001
      // 064: fcmpg
      // 065: ifgt 069
      // 068: return
      // 069: fload 3
      // 06a: fload 6
      // 06c: fmul
      // 06d: fstore 7
      // 06f: getstatic oxxxde/حز.configCreateStatusText Ljava/lang/String;
      // 072: ifnonnull 07b
      // 075: ldc_w 77.0
      // 078: goto 07e
      // 07b: ldc_w 84.0
      // 07e: fstore 8
      // 080: getstatic oxxxde/حز.configCreatePopupHeightAnimation Loxxxde/ري;
      // 083: fload 8
      // 085: ldc_w 180.0
      // 088: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 08b: astore 9
      // 08d: new oxxxde/صح
      // 090: dup
      // 091: aload 9
      // 093: invokespecial oxxxde/صح.<init> (Loxxxde/بف;)V
      // 096: checkcast oxxxde/شل
      // 099: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 09c: putstatic oxxxde/حز.configCreateRenderedPopupHeight F
      // 09f: aload 0
      // 0a0: aload 1
      // 0a1: invokespecial oxxxde/حز.configCreatePopupBounds (Loxxxde/زْ;)Loxxxde/طآ;
      // 0a4: astore 9
      // 0a6: aload 9
      // 0a8: fconst_0
      // 0a9: nop
      // 0aa: aload 9
      // 0ac: invokevirtual oxxxde/طآ.getY ()F
      // 0af: fconst_1
      // 0b0: nop
      // 0b1: fload 6
      // 0b3: fsub
      // 0b4: ldc_w 4.0
      // 0b7: fmul
      // 0b8: fsub
      // 0b9: fconst_0
      // 0ba: nop
      // 0bb: fconst_0
      // 0bc: nop
      // 0bd: bipush 13
      // 0bf: aconst_null
      // 0c0: nop
      // 0c1: invokestatic oxxxde/طآ.copy$default (Loxxxde/طآ;FFFFILjava/lang/Object;)Loxxxde/طآ;
      // 0c4: astore 10
      // 0c6: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0c9: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 0cc: aload 0
      // 0cd: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0d0: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 0d3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0d6: fload 7
      // 0d8: invokevirtual oxxxde/ثْ.panel (F)Ljava/awt/Color;
      // 0db: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 0de: ldc_w 5.0
      // 0e1: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 0e4: aload 10
      // 0e6: invokevirtual oxxxde/طآ.getX ()F
      // 0e9: aload 10
      // 0eb: invokevirtual oxxxde/طآ.getY ()F
      // 0ee: aload 10
      // 0f0: invokevirtual oxxxde/طآ.getWidth ()F
      // 0f3: aload 10
      // 0f5: invokevirtual oxxxde/طآ.getHeight ()F
      // 0f8: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 0fb: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0fe: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 101: aload 0
      // 102: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 105: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 108: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 10b: ldc_w 0.04
      // 10e: fload 7
      // 110: fmul
      // 111: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 114: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 117: ldc_w 0.95
      // 11a: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 11d: ldc_w 5.0
      // 120: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 123: fconst_1
      // 124: nop
      // 125: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 128: ldc_w 0.08
      // 12b: fload 7
      // 12d: fmul
      // 12e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 131: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 134: aload 10
      // 136: invokevirtual oxxxde/طآ.getX ()F
      // 139: aload 10
      // 13b: invokevirtual oxxxde/طآ.getY ()F
      // 13e: aload 10
      // 140: invokevirtual oxxxde/طآ.getWidth ()F
      // 143: aload 10
      // 145: invokevirtual oxxxde/طآ.getHeight ()F
      // 148: invokevirtual oxxxde/جء.draw (FFFF)V
      // 14b: nop
      // 14c: getstatic oxxxde/حز.configCreateUnloadPrompt Z
      // 14f: ifeq 158
      // 152: ldc_w "Клауд-конфиг загружен"
      // 155: goto 173
      // 158: getstatic oxxxde/حز.configCloudSaveExistingMode Z
      // 15b: ifeq 164
      // 15e: ldc_w "Сохранить в Cloud"
      // 161: goto 173
      // 164: getstatic oxxxde/حز.configCreateCloudSaveMode Z
      // 167: ifeq 170
      // 16a: ldc_w "Создание Cloud-конфига"
      // 16d: goto 173
      // 170: ldc_w "Создание конфига"
      // 173: astore 11
      // 175: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 178: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 17b: aload 0
      // 17c: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 17f: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 182: aload 11
      // 184: aload 10
      // 186: invokevirtual oxxxde/طآ.getX ()F
      // 189: aload 10
      // 18b: invokevirtual oxxxde/طآ.getWidth ()F
      // 18e: ldc_w 0.5
      // 191: fmul
      // 192: fadd
      // 193: aload 10
      // 195: invokevirtual oxxxde/طآ.getY ()F
      // 198: ldc_w 7.0
      // 19b: fadd
      // 19c: ldc_w 0.4
      // 19f: fsub
      // 1a0: ldc_w 8.0
      // 1a3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1a6: ldc_w 0.9
      // 1a9: fload 7
      // 1ab: fmul
      // 1ac: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1af: fconst_0
      // 1b0: nop
      // 1b1: bipush 32
      // 1b3: aconst_null
      // 1b4: nop
      // 1b5: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 1b8: aload 0
      // 1b9: aload 10
      // 1bb: invokespecial oxxxde/حز.configCreateDividerBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 1be: astore 12
      // 1c0: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1c3: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 1c6: aload 0
      // 1c7: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1ca: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 1cd: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1d0: ldc_w 0.1
      // 1d3: fload 7
      // 1d5: fmul
      // 1d6: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1d9: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 1dc: ldc_w 0.5
      // 1df: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 1e2: aload 12
      // 1e4: invokevirtual oxxxde/طآ.getX ()F
      // 1e7: aload 12
      // 1e9: invokevirtual oxxxde/طآ.getY ()F
      // 1ec: aload 12
      // 1ee: invokevirtual oxxxde/طآ.getWidth ()F
      // 1f1: aload 12
      // 1f3: invokevirtual oxxxde/طآ.getHeight ()F
      // 1f6: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 1f9: getstatic oxxxde/حز.configCreateUnloadPrompt Z
      // 1fc: ifeq 254
      // 1ff: aload 0
      // 200: aload 10
      // 202: invokespecial oxxxde/حز.configCreateInputBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 205: astore 13
      // 207: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 20a: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 20d: aload 0
      // 20e: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 211: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 214: ldc_w "Сначала выгрузите его"
      // 217: aload 13
      // 219: invokevirtual oxxxde/طآ.getX ()F
      // 21c: aload 13
      // 21e: invokevirtual oxxxde/طآ.getWidth ()F
      // 221: ldc_w 0.5
      // 224: fmul
      // 225: fadd
      // 226: aload 13
      // 228: invokevirtual oxxxde/طآ.getY ()F
      // 22b: aload 13
      // 22d: invokevirtual oxxxde/طآ.getHeight ()F
      // 230: ldc_w 6.1
      // 233: fsub
      // 234: ldc_w 0.46
      // 237: fmul
      // 238: fadd
      // 239: ldc_w 6.1
      // 23c: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 23f: ldc_w 0.72
      // 242: fload 7
      // 244: fmul
      // 245: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 248: fconst_0
      // 249: nop
      // 24a: bipush 32
      // 24c: aconst_null
      // 24d: nop
      // 24e: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 251: goto 260
      // 254: aload 0
      // 255: aload 0
      // 256: aload 10
      // 258: invokespecial oxxxde/حز.configCreateInputBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 25b: fload 7
      // 25d: invokespecial oxxxde/حز.renderConfigCreateInput (Loxxxde/طآ;F)V
      // 260: aload 0
      // 261: aload 10
      // 263: invokespecial oxxxde/حز.configCreateConfirmButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 266: astore 13
      // 268: aload 0
      // 269: aload 10
      // 26b: invokespecial oxxxde/حز.configCreateCancelButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 26e: astore 14
      // 270: getstatic oxxxde/حز.configCreateConfirmHoverAnimation Loxxxde/ري;
      // 273: aload 13
      // 275: fload 4
      // 277: fload 5
      // 279: invokevirtual oxxxde/طآ.contains (FF)Z
      // 27c: ifeq 284
      // 27f: fconst_1
      // 280: nop
      // 281: goto 286
      // 284: fconst_0
      // 285: nop
      // 286: ldc_w 170.0
      // 289: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 28c: astore 16
      // 28e: new oxxxde/خك
      // 291: dup
      // 292: aload 16
      // 294: invokespecial oxxxde/خك.<init> (Loxxxde/بف;)V
      // 297: checkcast oxxxde/شل
      // 29a: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 29d: fconst_0
      // 29e: nop
      // 29f: fconst_1
      // 2a0: nop
      // 2a1: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 2a4: fstore 15
      // 2a6: getstatic oxxxde/حز.configCreateCancelHoverAnimation Loxxxde/ري;
      // 2a9: aload 14
      // 2ab: fload 4
      // 2ad: fload 5
      // 2af: invokevirtual oxxxde/طآ.contains (FF)Z
      // 2b2: ifeq 2ba
      // 2b5: fconst_1
      // 2b6: nop
      // 2b7: goto 2bc
      // 2ba: fconst_0
      // 2bb: nop
      // 2bc: ldc_w 170.0
      // 2bf: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 2c2: astore 17
      // 2c4: new oxxxde/دف
      // 2c7: dup
      // 2c8: aload 17
      // 2ca: invokespecial oxxxde/دف.<init> (Loxxxde/بف;)V
      // 2cd: checkcast oxxxde/شل
      // 2d0: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 2d3: fconst_0
      // 2d4: nop
      // 2d5: fconst_1
      // 2d6: nop
      // 2d7: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 2da: fstore 16
      // 2dc: aload 0
      // 2dd: aload 13
      // 2df: nop
      // 2e0: getstatic oxxxde/حز.configCreateUnloadPrompt Z
      // 2e3: ifeq 2eb
      // 2e6: bipush 1
      // 2e7: nop
      // 2e8: goto 2fc
      // 2eb: getstatic oxxxde/حز.configCreateCloudSaveMode Z
      // 2ee: ifeq 2f8
      // 2f1: aload 0
      // 2f2: invokespecial oxxxde/حز.canSubmitConfigCloudSave ()Z
      // 2f5: goto 2fc
      // 2f8: aload 0
      // 2f9: invokespecial oxxxde/حز.canSubmitConfigCreate ()Z
      // 2fc: fload 7
      // 2fe: fload 15
      // 300: nop
      // 301: getstatic oxxxde/حز.configCreateUnloadPrompt Z
      // 304: ifeq 30d
      // 307: ldc_w "Выгрузить"
      // 30a: goto 33a
      // 30d: getstatic oxxxde/حز.configCreateCloudSaveMode Z
      // 310: ifeq 31f
      // 313: getstatic oxxxde/حز.configCloudSaveSubmitting Z
      // 316: ifeq 31f
      // 319: ldc_w "Сохранение"
      // 31c: goto 33a
      // 31f: getstatic oxxxde/حز.configCloudSaveExistingMode Z
      // 322: ifeq 32b
      // 325: ldc_w "Повторить"
      // 328: goto 33a
      // 32b: getstatic oxxxde/حز.configCreateCloudSaveMode Z
      // 32e: ifeq 337
      // 331: ldc_w "Создать"
      // 334: goto 33a
      // 337: ldc_w "Создать"
      // 33a: invokespecial oxxxde/حز.renderConfigCreateConfirmButton (Loxxxde/طآ;ZFFLjava/lang/String;)V
      // 33d: aload 0
      // 33e: aload 14
      // 340: ldc_w "Отмена"
      // 343: bipush 1
      // 344: nop
      // 345: fload 7
      // 347: bipush 0
      // 348: nop
      // 349: fload 16
      // 34b: bipush 16
      // 34d: aconst_null
      // 34e: nop
      // 34f: invokestatic oxxxde/حز.renderConfigKeyButton$default (Loxxxde/حز;Loxxxde/طآ;Ljava/lang/String;ZFZFILjava/lang/Object;)V
      // 352: getstatic oxxxde/حز.configCreateStatusTransition Loxxxde/حت;
      // 355: getstatic oxxxde/حز.configCreateStatusText Ljava/lang/String;
      // 358: invokevirtual oxxxde/حت.update (Ljava/lang/String;)Ljava/util/List;
      // 35b: astore 17
      // 35d: aload 0
      // 35e: aload 10
      // 360: invokespecial oxxxde/حز.configCreateCancelButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 363: astore 18
      // 365: aload 10
      // 367: invokevirtual oxxxde/طآ.getHeight ()F
      // 36a: ldc_w 77.0
      // 36d: fsub
      // 36e: ldc_w 7.0
      // 371: fdiv
      // 372: fconst_0
      // 373: nop
      // 374: fconst_1
      // 375: nop
      // 376: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 379: fstore 19
      // 37b: aload 17
      // 37d: checkcast java/lang/Iterable
      // 380: astore 20
      // 382: bipush 0
      // 383: nop
      // 384: istore 21
      // 386: aload 20
      // 388: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 38d: astore 22
      // 38f: aload 22
      // 391: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 396: ifeq 40b
      // 399: aload 22
      // 39b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3a0: astore 23
      // 3a2: aload 23
      // 3a4: checkcast oxxxde/ذإ
      // 3a7: astore 24
      // 3a9: bipush 0
      // 3aa: nop
      // 3ab: istore 25
      // 3ad: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 3b0: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 3b3: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 3b6: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 3b9: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 3bc: aload 24
      // 3be: invokevirtual oxxxde/ذإ.getText ()Ljava/lang/String;
      // 3c1: aload 10
      // 3c3: invokevirtual oxxxde/طآ.getX ()F
      // 3c6: aload 10
      // 3c8: invokevirtual oxxxde/طآ.getWidth ()F
      // 3cb: ldc_w 0.5
      // 3ce: fmul
      // 3cf: fadd
      // 3d0: aload 18
      // 3d2: invokevirtual oxxxde/طآ.getY ()F
      // 3d5: aload 18
      // 3d7: invokevirtual oxxxde/طآ.getHeight ()F
      // 3da: fadd
      // 3db: ldc_w 2.2
      // 3de: fadd
      // 3df: aload 24
      // 3e1: invokevirtual oxxxde/ذإ.getOffsetY ()F
      // 3e4: fadd
      // 3e5: ldc_w 5.3
      // 3e8: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3eb: ldc_w 0.72
      // 3ee: fload 7
      // 3f0: fmul
      // 3f1: fload 19
      // 3f3: fmul
      // 3f4: aload 24
      // 3f6: invokevirtual oxxxde/ذإ.getAlpha ()F
      // 3f9: fmul
      // 3fa: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 3fd: fconst_0
      // 3fe: nop
      // 3ff: bipush 32
      // 401: aconst_null
      // 402: nop
      // 403: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 406: nop
      // 407: nop
      // 408: goto 38f
      // 40b: nop
      // 40c: return
   }

   private fun createGeneratedConfigKeys() {
      if (!configShareSubmitting) {
         if (configShareConfigName != null) {
            run label53@{
               val configName: java.lang.String = configShareConfigName
               val var10000: Int
               if (configShareInfiniteActivations) {
                  var10000 = null
               } else {
                  val requestId: Int = StringsKt.toIntOrNull(configShareActivationsText)
                  if (requestId == null) {
                     return@label53
                  }

                  val `$this$createGeneratedConfigKeys_u24lambda_u241`: Int = requestId.intValue()
                  val var4: Int = if (1 <= `$this$createGeneratedConfigKeys_u24lambda_u241` && `$this$createGeneratedConfigKeys_u24lambda_u241` < 1001)
                     requestId
                     else
                     null
                     if ((
                        if (1 <= `$this$createGeneratedConfigKeys_u24lambda_u241` && `$this$createGeneratedConfigKeys_u24lambda_u241` < 1001)
                           requestId
                           else
                           null
                     )
                     == null) {
                     return@label53
                  }

                  var10000 = var4
               }

               configShareFocusedField = null
               configShareCopiedAtMs = 0L
               ري.animate$default(configShareCopyFeedbackAnimation, 0.0F, 0.0F, null, 4, null)
               configShareErrorText = null
               configShareSubmitting = true
               configShareRequestId++
               val var8: Int = configShareRequestId
               خه.INSTANCE.createShare(configName, var10000).whenComplete({ p0: Any, p1: Any ->
                  `$tmp0`(p0, p1)
               })
               return
            }

            val var9: حز = this
            configShareErrorText = "Количество активаций: от 1 до 1000"
         }
      }
   }

   private fun avatarBounds(layout: زْ): طآ {
      if (layout.avatarSize <= 0.0F) {
         return طآ(layout.avatarX, layout.avatarY, 0.0F, 0.0F)
      } else {
         val size: Float = RangesKt.coerceAtLeast(MathKt.roundToInt(layout.avatarSize), 1)
         return طآ(
            MathKt.roundToInt(layout.avatarX + layout.avatarSize * 0.5F - size * 0.5F),
            MathKt.roundToInt(layout.avatarY + layout.avatarSize * 0.5F - size * 0.5F),
            size,
            size
         )
      }
   }

   private fun openExistingConfigCloudSave(configName: String) {
      closeConfigKeyPopup$default(this, false, 1, null)
      configCreatePopupOpen = true
      configCreateCloudSaveMode = true
      configCloudSaveExistingMode = true
      configCloudSaveSubmitting = false
      configCreateUnloadPrompt = false
      configCreateInputFocused = false
      configCreateTextSelected = false
      configCreateText = configName
      configCreateStatusText = null
      this.saveConfigToCloud(configName)
   }

   private fun configShareDividerBounds(modal: طآ): طآ {
      return طآ(modal.x + 7.0F, modal.y + 7.0F + 15.0F, modal.width - 14.0F, 1.0F)
   }

   private fun closeEventServerConfirm() {
      eventServerConfirmOpen = false
   }

   private fun configShareTargetModalHeight(): Float {
      label16@
      if (configShareCheckingExisting) {
         return 54.0F
      } else {
         return if (configShareGeneratedKeys.isEmpty())
            76.0F
            else
            28.0F + (configShareGeneratedKeys.size() * 13.0F + RangesKt.coerceAtLeast(configShareGeneratedKeys.size() - 1, 0) * 2.0F) + 5.0F + 17.0F + 7.0F
         }
   }

   private fun isPointsCategory(category: ظص?): Boolean {
      return category == ظن.getPOINTS()
   }

   private fun canSubmitConfigKey(): Boolean {
      val var10000: Regex = configKeyPattern
      val var10001: java.lang.String = StringsKt.trim(configKeyText).toString().toUpperCase(Locale.ROOT)
      return var10000 matches var10001 as java.lang.CharSequence && !configKeySubmitting
   }

   private fun avatarPopupMetrics(scale: Float): تذ {
      val safeScale: Float = RangesKt.coerceAtLeast(scale, 0.01F)
      val margin: Float = 6.0F * safeScale
      val headerTextSize: Float = 9.0F * safeScale
      val rowTextSize: Float = 7.0F * safeScale
      val rowHeight: Float = 7.0F * safeScale + margin * 1.2F
      val headerHeight: Float = headerTextSize + margin * 2.2F
      val settingHeight: Float = 18.0F * safeScale
      val settingGap: Float = 4.0F * safeScale
      val gapBetweenColumns: Float = margin * 3.0F
      val leadingSize: Float = rowTextSize + safeScale
      val leadingGap: Float = 6.0F * safeScale
      val rows: java.util.List = this.avatarPopupRows()
      val rowsHeight: java.util.Iterator = rows.iterator()
      val var10000: java.lang.Float
      if (!rowsHeight.hasNext()) {
         var10000 = null
      } else {
         val bodyHeight: جغ = rowsHeight.next() as جغ
         var var22: Float = جً.getWidth$default(رَ.INSTANCE.getICON(), bodyHeight.icon, leadingSize, 0.0F, 4, null)
            + leadingGap
            + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), bodyHeight.text, rowTextSize, 0.0F, 4, null)
            + gapBetweenColumns
            + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), bodyHeight.value, rowTextSize, 0.0F, 4, null)

         while (rowsHeight.hasNext()) {
            val var24: جغ = rowsHeight.next() as جغ
            var22 = Math.max(
               var22,
               جً.getWidth$default(رَ.INSTANCE.getICON(), var24.icon, leadingSize, 0.0F, 4, null)
                  + leadingGap
                  + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), var24.text, rowTextSize, 0.0F, 4, null)
                  + gapBetweenColumns
                  + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), var24.value, rowTextSize, 0.0F, 4, null)
            )
         }

         var10000 = var22
      }

      return تذ(
         safeScale,
         Math.max(headerTextSize * 11.0F, Math.max((var10000 ?: 0.0F) + margin, 140.0F * safeScale)),
         headerHeight
            + (
               settingHeight * 5
                  + settingGap * RangesKt.coerceAtLeast(4, 0)
                  + margin * 1.5F
                  + (if (rows.isEmpty()) 0.0F else rows.size() * rowHeight + margin * 0.4F)
            ),
         headerHeight,
         rowHeight,
         margin,
         headerTextSize,
         rowTextSize,
         settingHeight,
         settingGap,
         6.0F * safeScale,
         5.5F * safeScale
      )
   }

   private fun clearCategoryInputFocus() {
      configsCategoryComponent.clearInputFocus()
      pointsCategoryComponent.clearInputFocus()
      friendsCategoryComponent.clearInputFocus()
   }

   private fun appendModuleSearch(value: String) {
      if (value.length() != 0) {
         if (moduleSearchText.length() < maxModuleSearchLength) {
            this.updateModuleSearchText(StringsKt.take("${moduleSearchText}$value", maxModuleSearchLength))
         }
      }
   }

   private final val moduleStartOffset: Float
      private final get() {
         return this.panelWidth / 5.0F + topBarHeight + uiPadding
      }


   private fun isConfigCategory(category: ظص?): Boolean {
      return category == ظن.getCONFIGS()
   }

   private fun avatarPopupGuiScaleValueText(): String {
      return "${MathKt.roundToInt(
         if (avatarPopupGuiScaleDragProgress != null) سر.INSTANCE.scalePercentForProgress(avatarPopupGuiScaleDragProgress) else سر.INSTANCE.scalePercent()
      )}%"
   }

   private fun unwrapAsyncError(error: Throwable): Throwable {
      var cause: java.lang.Throwable = error

      while ((cause is CompletionException || cause is ExecutionException) && cause.getCause() != null) {
         val var10000: java.lang.Throwable = cause.getCause()
         cause = var10000
      }

      return cause
   }

   private fun avatarPopupHudScaleValueText(): String {
      return "${MathKt.roundToInt(
         if (avatarPopupHudScaleDragProgress != null)
            سر.INSTANCE.hudScalePercentForProgress(avatarPopupHudScaleDragProgress)
            else
            سر.INSTANCE.hudScalePercent()
      )}%"
   }

   private fun configShareActivationsInputBounds(modal: طآ): طآ {
      val row: طآ = this.configShareInputRowBounds(modal)
      return طآ(row.x, row.y, RangesKt.coerceAtLeast(row.width - 24.0F, 0.0F), 19.0F)
   }

   private fun configCreatePopupBounds(layout: زْ): طآ {
      return طآ(
         (if (configCreateCloudSaveMode) layout.topBarConfigCreateButtonX else layout.topBarConfigCreateButtonX) + layout.topBarConfigButtonSize - 142.0F,
         layout.topBarY + layout.topBarHeight + 5.0F,
         142.0F,
         configCreateRenderedPopupHeight
      )
   }

   private fun configKeyInputBounds(popup: طآ): طآ {
      val divider: طآ = this.configKeyDividerBounds(popup)
      return طآ(popup.x + 7.0F, divider.y + divider.height + 5.0F, popup.width - 14.0F, 20.0F)
   }

   private fun showConfigShareCreationForm() {
      val var1: Int = configShareRequestId++
      configShareGeneratedKeys = CollectionsKt.emptyList()
      configShareManagingExisting = false
      configShareCheckingExisting = false
      configShareActivationsText = ""
      configShareInfiniteActivations = false
      configShareErrorText = null
      configShareFocusedField = null
      ري.animate$default(configShareResultsAnimation, 0.0F, 0.0F, null, 4, null)
   }

   private fun renderConfigCreateInput(bounds: طآ, alpha: Float) {
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
      // 000: getstatic oxxxde/حز.configCreateText Ljava/lang/String;
      // 003: checkcast java/lang/CharSequence
      // 006: invokeinterface java/lang/CharSequence.length ()I 1
      // 00b: ifle 013
      // 00e: bipush 1
      // 00f: nop
      // 010: goto 015
      // 013: bipush 0
      // 014: nop
      // 015: istore 3
      // 016: getstatic oxxxde/حز.configCreateInputFocused Z
      // 019: ifeq 027
      // 01c: getstatic oxxxde/حز.configCreatePopupOpen Z
      // 01f: ifeq 027
      // 022: bipush 1
      // 023: nop
      // 024: goto 029
      // 027: bipush 0
      // 028: nop
      // 029: istore 4
      // 02b: getstatic oxxxde/حز.configCreateInputFocusAnimation Loxxxde/ري;
      // 02e: iload 4
      // 030: ifeq 038
      // 033: fconst_1
      // 034: nop
      // 035: goto 03a
      // 038: fconst_0
      // 039: nop
      // 03a: ldc_w 190.0
      // 03d: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 040: astore 6
      // 042: new oxxxde/زة
      // 045: dup
      // 046: aload 6
      // 048: invokespecial oxxxde/زة.<init> (Loxxxde/بف;)V
      // 04b: checkcast oxxxde/شل
      // 04e: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 051: fconst_0
      // 052: nop
      // 053: fconst_1
      // 054: nop
      // 055: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 058: fstore 5
      // 05a: ldc_w 6.3
      // 05d: fstore 6
      // 05f: aload 1
      // 060: invokevirtual oxxxde/طآ.getX ()F
      // 063: ldc_w 5.0
      // 066: fadd
      // 067: fstore 7
      // 069: aload 1
      // 06a: invokevirtual oxxxde/طآ.getY ()F
      // 06d: aload 1
      // 06e: invokevirtual oxxxde/طآ.getHeight ()F
      // 071: fload 6
      // 073: fsub
      // 074: ldc_w 0.46
      // 077: fmul
      // 078: fadd
      // 079: fstore 8
      // 07b: aload 1
      // 07c: invokevirtual oxxxde/طآ.getWidth ()F
      // 07f: ldc_w 10.0
      // 082: fsub
      // 083: fconst_0
      // 084: nop
      // 085: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 088: fstore 9
      // 08a: iload 3
      // 08b: nop
      // 08c: ifeq 09d
      // 08f: aload 0
      // 090: getstatic oxxxde/حز.configCreateText Ljava/lang/String;
      // 093: fload 9
      // 095: fload 6
      // 097: invokespecial oxxxde/حز.trimConfigKeyToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 09a: goto 0ab
      // 09d: iload 4
      // 09f: ifeq 0a8
      // 0a2: ldc_w ""
      // 0a5: goto 0ab
      // 0a8: ldc_w "Название конфига.."
      // 0ab: astore 10
      // 0ad: iload 3
      // 0ae: nop
      // 0af: ifeq 0c0
      // 0b2: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b5: ldc_w 0.8
      // 0b8: fload 2
      // 0b9: fmul
      // 0ba: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0bd: goto 0cb
      // 0c0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0c3: ldc_w 0.48
      // 0c6: fload 2
      // 0c7: fmul
      // 0c8: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 0cb: astore 11
      // 0cd: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0d0: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 0d3: aload 0
      // 0d4: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0d7: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 0da: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0dd: ldc_w 0.025
      // 0e0: ldc_w 0.025
      // 0e3: fload 5
      // 0e5: fmul
      // 0e6: fadd
      // 0e7: fload 2
      // 0e8: fmul
      // 0e9: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0ec: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 0ef: ldc_w 0.95
      // 0f2: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 0f5: ldc_w 3.5
      // 0f8: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 0fb: fconst_1
      // 0fc: nop
      // 0fd: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 100: ldc_w 0.07
      // 103: ldc_w 0.06
      // 106: fload 5
      // 108: fmul
      // 109: fadd
      // 10a: fload 2
      // 10b: fmul
      // 10c: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 10f: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 112: aload 1
      // 113: invokevirtual oxxxde/طآ.getX ()F
      // 116: aload 1
      // 117: invokevirtual oxxxde/طآ.getY ()F
      // 11a: aload 1
      // 11b: invokevirtual oxxxde/طآ.getWidth ()F
      // 11e: aload 1
      // 11f: invokevirtual oxxxde/طآ.getHeight ()F
      // 122: invokevirtual oxxxde/جء.draw (FFFF)V
      // 125: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 128: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 12b: aload 10
      // 12d: fload 6
      // 12f: fconst_0
      // 130: nop
      // 131: bipush 4
      // 132: nop
      // 133: aconst_null
      // 134: nop
      // 135: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 138: fstore 12
      // 13a: iload 4
      // 13c: ifeq 196
      // 13f: getstatic oxxxde/حز.configCreateTextSelected Z
      // 142: ifeq 196
      // 145: aload 10
      // 147: checkcast java/lang/CharSequence
      // 14a: invokeinterface java/lang/CharSequence.length ()I 1
      // 14f: ifle 157
      // 152: bipush 1
      // 153: nop
      // 154: goto 159
      // 157: bipush 0
      // 158: nop
      // 159: ifeq 196
      // 15c: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 15f: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 162: aload 0
      // 163: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 166: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 169: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 16c: ldc_w 0.16
      // 16f: fload 2
      // 170: fmul
      // 171: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 174: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 177: fconst_2
      // 178: nop
      // 179: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 17c: fload 7
      // 17e: ldc_w 1.5
      // 181: fsub
      // 182: fload 8
      // 184: fconst_2
      // 185: nop
      // 186: fsub
      // 187: fload 12
      // 189: ldc_w 3.0
      // 18c: fadd
      // 18d: fload 6
      // 18f: ldc_w 4.0
      // 192: fadd
      // 193: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 196: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 199: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 19c: aload 0
      // 19d: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1a0: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1a3: aload 10
      // 1a5: fload 7
      // 1a7: fload 8
      // 1a9: fload 6
      // 1ab: aload 11
      // 1ad: fconst_0
      // 1ae: nop
      // 1af: fconst_0
      // 1b0: nop
      // 1b1: fconst_0
      // 1b2: nop
      // 1b3: bipush 0
      // 1b4: nop
      // 1b5: fconst_0
      // 1b6: nop
      // 1b7: sipush 992
      // 1ba: aconst_null
      // 1bb: nop
      // 1bc: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1bf: iload 4
      // 1c1: ifeq 1e0
      // 1c4: getstatic oxxxde/حز.configCreateTextSelected Z
      // 1c7: ifne 1e0
      // 1ca: invokestatic java/lang/System.currentTimeMillis ()J
      // 1cd: ldc2_w 450
      // 1d0: ldiv
      // 1d1: ldc2_w 2
      // 1d4: lrem
      // 1d5: lconst_0
      // 1d6: nop
      // 1d7: lcmp
      // 1d8: ifne 1e0
      // 1db: bipush 1
      // 1dc: nop
      // 1dd: goto 1e2
      // 1e0: bipush 0
      // 1e1: nop
      // 1e2: istore 13
      // 1e4: iload 13
      // 1e6: ifeq 223
      // 1e9: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1ec: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1ef: aload 0
      // 1f0: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1f3: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1f6: ldc_w "|"
      // 1f9: fload 7
      // 1fb: fload 12
      // 1fd: fadd
      // 1fe: ldc_w 0.8
      // 201: fadd
      // 202: fload 8
      // 204: fload 6
      // 206: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 209: ldc_w 0.88
      // 20c: fload 2
      // 20d: fmul
      // 20e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 211: fconst_0
      // 212: nop
      // 213: fconst_0
      // 214: nop
      // 215: fconst_0
      // 216: nop
      // 217: bipush 0
      // 218: nop
      // 219: fconst_0
      // 21a: nop
      // 21b: sipush 992
      // 21e: aconst_null
      // 21f: nop
      // 220: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 223: return
   }

   private fun openRainVisualsSite() {
      Util.getOperatingSystem().open(URI.create("https://rainvisuals.pro"))
   }

   private fun eventServerConfirmBounds(): طآ {
      return طآ(ضك.getMc().getWindow().getScaledWidth() * 0.5F - 77.5F, ضك.getMc().getWindow().getScaledHeight() * 0.5F - 34.0F, 155.0F, 68.0F)
   }

   private fun renderAvatarPopupHudScaleSetting(x: Float, y: Float, width: Float, metrics: تذ, alpha: Float, mouseX: Int, mouseY: Int) {
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
      // 000: new oxxxde/طآ
      // 003: dup
      // 004: fload 1
      // 005: fload 2
      // 006: fload 3
      // 007: aload 4
      // 009: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 00c: invokespecial oxxxde/طآ.<init> (FFFF)V
      // 00f: astore 8
      // 011: aload 0
      // 012: aload 8
      // 014: aload 4
      // 016: invokespecial oxxxde/حز.avatarPopupHudScaleSliderBounds (Loxxxde/طآ;Loxxxde/تذ;)Loxxxde/طآ;
      // 019: astore 9
      // 01b: getstatic oxxxde/حز.draggingAvatarPopupHudScale Z
      // 01e: ifeq 03b
      // 021: aload 0
      // 022: iload 6
      // 024: i2f
      // 025: aload 9
      // 027: invokespecial oxxxde/حز.updateAvatarPopupHudScalePreview (FLoxxxde/طآ;)V
      // 02a: aload 0
      // 02b: invokespecial oxxxde/حز.isLeftMousePressed ()Z
      // 02e: ifne 03b
      // 031: aload 0
      // 032: aconst_null
      // 033: nop
      // 034: bipush 1
      // 035: nop
      // 036: aconst_null
      // 037: nop
      // 038: invokestatic oxxxde/حز.commitAvatarPopupHudScaleDrag$default (Loxxxde/حز;Ljava/lang/Float;ILjava/lang/Object;)V
      // 03b: fload 5
      // 03d: fconst_0
      // 03e: nop
      // 03f: fconst_1
      // 040: nop
      // 041: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 044: fstore 10
      // 046: aload 4
      // 048: ldc_w 6.0
      // 04b: invokevirtual oxxxde/تذ.scaled (F)F
      // 04e: fstore 11
      // 050: aload 4
      // 052: ldc_w 7.8
      // 055: invokevirtual oxxxde/تذ.scaled (F)F
      // 058: fstore 12
      // 05a: aload 4
      // 05c: ldc_w 6.7
      // 05f: invokevirtual oxxxde/تذ.scaled (F)F
      // 062: fstore 13
      // 064: aload 4
      // 066: ldc_w 6.2
      // 069: invokevirtual oxxxde/تذ.scaled (F)F
      // 06c: fstore 14
      // 06e: aload 0
      // 06f: aload 4
      // 071: invokespecial oxxxde/حز.avatarPopupSettingTextYOffset (Loxxxde/تذ;)F
      // 074: fstore 15
      // 076: fload 1
      // 077: fload 11
      // 079: fadd
      // 07a: fstore 16
      // 07c: fload 2
      // 07d: aload 4
      // 07f: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 082: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 085: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 088: fload 12
      // 08a: invokevirtual oxxxde/جً.getHeight (F)F
      // 08d: fsub
      // 08e: ldc_w 0.5
      // 091: fmul
      // 092: fadd
      // 093: fstore 17
      // 095: fload 16
      // 097: fload 12
      // 099: fadd
      // 09a: aload 4
      // 09c: ldc_w 4.6
      // 09f: invokevirtual oxxxde/تذ.scaled (F)F
      // 0a2: fadd
      // 0a3: fstore 18
      // 0a5: fload 2
      // 0a6: aload 4
      // 0a8: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 0ab: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0ae: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 0b1: fload 13
      // 0b3: invokevirtual oxxxde/جً.getHeight (F)F
      // 0b6: fsub
      // 0b7: ldc_w 0.5
      // 0ba: fmul
      // 0bb: fadd
      // 0bc: fload 15
      // 0be: fsub
      // 0bf: fstore 19
      // 0c1: aload 0
      // 0c2: invokespecial oxxxde/حز.avatarPopupHudScaleValueText ()Ljava/lang/String;
      // 0c5: astore 20
      // 0c7: aload 9
      // 0c9: invokevirtual oxxxde/طآ.getX ()F
      // 0cc: aload 9
      // 0ce: invokevirtual oxxxde/طآ.getWidth ()F
      // 0d1: fadd
      // 0d2: aload 4
      // 0d4: ldc_w 5.0
      // 0d7: invokevirtual oxxxde/تذ.scaled (F)F
      // 0da: fadd
      // 0db: fstore 21
      // 0dd: fload 2
      // 0de: aload 4
      // 0e0: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 0e3: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0e6: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 0e9: fload 14
      // 0eb: invokevirtual oxxxde/جً.getHeight (F)F
      // 0ee: fsub
      // 0ef: ldc_w 0.5
      // 0f2: fmul
      // 0f3: fadd
      // 0f4: fload 15
      // 0f6: fsub
      // 0f7: fstore 22
      // 0f9: getstatic oxxxde/حز.avatarPopupHudScaleDragProgress Ljava/lang/Float;
      // 0fc: dup
      // 0fd: ifnull 106
      // 100: invokevirtual java/lang/Float.floatValue ()F
      // 103: goto 10d
      // 106: pop
      // 107: getstatic oxxxde/سر.INSTANCE Loxxxde/سر;
      // 10a: invokevirtual oxxxde/سر.hudScaleProgress ()F
      // 10d: fstore 23
      // 10f: getstatic oxxxde/حز.avatarPopupHudScaleAnimation Loxxxde/ري;
      // 112: fload 23
      // 114: ldc_w 120.0
      // 117: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 11a: astore 25
      // 11c: new oxxxde/ش
      // 11f: dup
      // 120: aload 25
      // 122: invokespecial oxxxde/ش.<init> (Loxxxde/بف;)V
      // 125: checkcast oxxxde/شل
      // 128: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 12b: fconst_0
      // 12c: nop
      // 12d: fconst_1
      // 12e: nop
      // 12f: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 132: fstore 24
      // 134: aload 9
      // 136: invokevirtual oxxxde/طآ.getWidth ()F
      // 139: fload 24
      // 13b: fmul
      // 13c: fstore 25
      // 13e: aload 0
      // 13f: aload 8
      // 141: aload 4
      // 143: invokespecial oxxxde/حز.avatarPopupHudScaleSliderHitBounds (Loxxxde/طآ;Loxxxde/تذ;)Loxxxde/طآ;
      // 146: iload 6
      // 148: i2f
      // 149: iload 7
      // 14b: i2f
      // 14c: invokevirtual oxxxde/طآ.contains (FF)Z
      // 14f: istore 26
      // 151: aload 4
      // 153: getstatic oxxxde/حز.draggingAvatarPopupHudScale Z
      // 156: ifne 15e
      // 159: iload 26
      // 15b: ifeq 164
      // 15e: ldc_w 5.3
      // 161: goto 167
      // 164: ldc_w 4.7
      // 167: invokevirtual oxxxde/تذ.scaled (F)F
      // 16a: fstore 27
      // 16c: aload 9
      // 16e: invokevirtual oxxxde/طآ.getX ()F
      // 171: fload 25
      // 173: fadd
      // 174: fload 27
      // 176: ldc_w 0.5
      // 179: fmul
      // 17a: fsub
      // 17b: aload 9
      // 17d: invokevirtual oxxxde/طآ.getX ()F
      // 180: fload 27
      // 182: ldc_w 0.5
      // 185: fmul
      // 186: fsub
      // 187: aload 9
      // 189: invokevirtual oxxxde/طآ.getX ()F
      // 18c: aload 9
      // 18e: invokevirtual oxxxde/طآ.getWidth ()F
      // 191: fadd
      // 192: fload 27
      // 194: ldc_w 0.5
      // 197: fmul
      // 198: fsub
      // 199: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 19c: fstore 28
      // 19e: aload 9
      // 1a0: invokevirtual oxxxde/طآ.getY ()F
      // 1a3: aload 9
      // 1a5: invokevirtual oxxxde/طآ.getHeight ()F
      // 1a8: ldc_w 0.5
      // 1ab: fmul
      // 1ac: fadd
      // 1ad: fload 27
      // 1af: ldc_w 0.5
      // 1b2: fmul
      // 1b3: fsub
      // 1b4: fstore 29
      // 1b6: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1b9: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 1bc: aload 0
      // 1bd: invokevirtual oxxxde/حز.iconsPipeline ()Loxxxde/صؤ;
      // 1c0: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1c3: fload 12
      // 1c5: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 1c8: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1cb: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 1ce: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 1d1: fload 10
      // 1d3: ldc_w 0.92
      // 1d6: fmul
      // 1d7: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 1da: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 1dd: ldc_w "G"
      // 1e0: fload 16
      // 1e2: fload 17
      // 1e4: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 1e7: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1ea: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1ed: aload 0
      // 1ee: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1f1: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1f4: fload 13
      // 1f6: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 1f9: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1fc: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 1ff: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 202: fload 10
      // 204: ldc_w 0.94
      // 207: fmul
      // 208: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 20b: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 20e: ldc_w "Размер худа"
      // 211: fload 18
      // 213: fload 19
      // 215: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 218: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 21b: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 21e: aload 0
      // 21f: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 222: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 225: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 228: ldc_w 0.08
      // 22b: fload 10
      // 22d: fmul
      // 22e: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 231: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 234: aload 4
      // 236: ldc_w 0.8
      // 239: invokevirtual oxxxde/تذ.scaled (F)F
      // 23c: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 23f: aload 9
      // 241: invokevirtual oxxxde/طآ.getX ()F
      // 244: aload 9
      // 246: invokevirtual oxxxde/طآ.getY ()F
      // 249: aload 9
      // 24b: invokevirtual oxxxde/طآ.getWidth ()F
      // 24e: aload 9
      // 250: invokevirtual oxxxde/طآ.getHeight ()F
      // 253: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 256: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 259: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 25c: aload 0
      // 25d: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 260: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 263: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 266: ldc_w 0.28
      // 269: getstatic oxxxde/حز.draggingAvatarPopupHudScale Z
      // 26c: ifeq 275
      // 26f: ldc_w 0.12
      // 272: goto 277
      // 275: fconst_0
      // 276: nop
      // 277: fadd
      // 278: fload 10
      // 27a: fmul
      // 27b: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 27e: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 281: aload 4
      // 283: ldc_w 0.8
      // 286: invokevirtual oxxxde/تذ.scaled (F)F
      // 289: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 28c: aload 9
      // 28e: invokevirtual oxxxde/طآ.getX ()F
      // 291: aload 9
      // 293: invokevirtual oxxxde/طآ.getY ()F
      // 296: fload 25
      // 298: aload 9
      // 29a: invokevirtual oxxxde/طآ.getHeight ()F
      // 29d: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 2a0: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 2a3: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 2a6: aload 0
      // 2a7: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 2aa: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 2ad: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2b0: ldc_w 0.72
      // 2b3: getstatic oxxxde/حز.draggingAvatarPopupHudScale Z
      // 2b6: ifne 2be
      // 2b9: iload 26
      // 2bb: ifeq 2c4
      // 2be: ldc_w 0.18
      // 2c1: goto 2c6
      // 2c4: fconst_0
      // 2c5: nop
      // 2c6: fadd
      // 2c7: fload 10
      // 2c9: fmul
      // 2ca: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 2cd: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 2d0: fload 27
      // 2d2: ldc_w 3.0
      // 2d5: fdiv
      // 2d6: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 2d9: fload 28
      // 2db: fload 29
      // 2dd: fload 27
      // 2df: fload 27
      // 2e1: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 2e4: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 2e7: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 2ea: aload 0
      // 2eb: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 2ee: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 2f1: fload 14
      // 2f3: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 2f6: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 2f9: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 2fc: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 2ff: fload 10
      // 301: ldc_w 0.82
      // 304: fmul
      // 305: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 308: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 30b: aload 20
      // 30d: fload 21
      // 30f: fload 22
      // 311: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 314: return
   }

   private fun isFriendsCategory(category: ظص?): Boolean {
      return category == ظن.getFRIENDS()
   }

   private fun avatarPopupHudScaleSliderBounds(cardBounds: طآ, metrics: تذ): طآ {
      val padding: Float = metrics.scaled(6.0F)
      val valueWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "200%", metrics.scaled(6.2F), 0.0F, 4, null)
      val valueGap: Float = metrics.scaled(4.0F)
      val sliderWidth: Float = metrics.scaled(30.0F)
      val sliderHeight: Float = metrics.scaled(2.7F)
      return طآ(
         cardBounds.x + cardBounds.width - padding - valueWidth - valueGap - sliderWidth,
         cardBounds.y + (cardBounds.height - sliderHeight) * 0.5F,
         RangesKt.coerceAtLeast(sliderWidth, 0.0F),
         sliderHeight
      )
   }

   private fun configKeyCancelButtonBounds(popup: طآ): طآ {
      val upload: طآ = this.configKeyUploadButtonBounds(popup)
      return طآ(upload.x + upload.width + 5.0F, upload.y, upload.width, upload.height)
   }

   private fun handleConfigPageChanged(cloudPage: Boolean) {
      closeConfigCreatePopup$default(this, false, 1, null)
      closeConfigKeyPopup$default(this, false, 1, null)
      searchFocused = false
      topBarTextSelected = false
      draggingScrollBar = false
      scrollBarGrabOffset = 0.0F
      if (cloudPage) {
         اك.INSTANCE.refreshVisibleConfigsNow()
         this.synchronizeOwnedCloudConfigs()
      }
   }

   private fun requestEventAnarchyJoin(anarchy: Int) {
      if (ضه.INSTANCE.isFunTime()) {
         val var10000: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
         if (var10000 != null) {
            var10000.sendChatCommand("an$anarchy")
         }
      } else {
         eventServerConfirmAnarchy = anarchy
         eventServerConfirmOpen = true
         ري.animate$default(eventServerConfirmAcceptHoverAnimation, 0.0F, 0.0F, null, 4, null)
         ري.animate$default(eventServerConfirmCancelHoverAnimation, 0.0F, 0.0F, null, 4, null)
         avatarPopupOpen = false
         searchFocused = false
         topBarTextSelected = false
         this.clearCategoryInputFocus()
      }
   }

   private fun updateAvatarPopupGuiScalePreview(mouseX: Float, sliderBounds: طآ) {
      if (!(sliderBounds.width <= 0.0F)) {
         avatarPopupGuiScaleDragProgress = this.avatarPopupGuiScaleProgress(mouseX, sliderBounds)
      }
   }

   private fun isCtrlDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 341) == 1 || GLFW.glfwGetKey(handle, 345) == 1
   }

   private fun configShareRevokeButtonBounds(row: طآ): طآ {
      return طآ(row.x + row.width - 11.0F, row.y, 11.0F, row.height)
   }

   private fun renderAvatarPopupInfoSetting(x: Float, y: Float, width: Float, metrics: تذ, alpha: Float) {
      val lineAlpha: Float = RangesKt.coerceIn(alpha, 0.0F, 1.0F)
      val padding: Float = metrics.scaled(6.0F)
      val iconSize: Float = metrics.scaled(7.8F)
      val labelSize: Float = metrics.scaled(6.7F)
      val valueSize: Float = metrics.scaled(6.2F)
      val actionIconSize: Float = metrics.scaled(6.2F)
      val textYOffset: Float = this.avatarPopupSettingTextYOffset(metrics)
      val iconX: Float = x + padding
      val iconY: Float = y + (metrics.settingHeight - رَ.INSTANCE.getICON().getHeight(iconSize)) * 0.5F
      val labelX: Float = iconX + iconSize + metrics.scaled(4.6F)
      val labelY: Float = y + (metrics.settingHeight - رَ.INSTANCE.getGS_MEDIUM().getHeight(labelSize)) * 0.5F - textYOffset
      val valueWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "Открыть", valueSize, 0.0F, 4, null)
      val iconGap: Float = metrics.scaled(3.0F)
      val valueX: Float = x + width - padding - (valueWidth + iconGap + جً.getWidth$default(رَ.INSTANCE.getICON(), "Z", actionIconSize, 0.0F, 4, null))
      val valueY: Float = y + (metrics.settingHeight - رَ.INSTANCE.getGS_MEDIUM().getHeight(valueSize)) * 0.5F - textYOffset
      val actionIconY: Float = y + (metrics.settingHeight - رَ.INSTANCE.getICON().getHeight(actionIconSize)) * 0.5F
      رَ.INSTANCE
         .getICON()
         .priority(this.iconsPipeline())
         .size(iconSize)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha * 0.92F))
         .drawText("S", iconX, iconY)
         رَ.INSTANCE
         .getGS_MEDIUM()
         .priority(this.textPipeline())
         .size(labelSize)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha * 0.94F))
         .drawText("Инфо", labelX, labelY)
         رَ.INSTANCE
         .getGS_MEDIUM()
         .priority(this.textPipeline())
         .size(valueSize)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha * 0.82F))
         .drawText("Открыть", valueX, valueY)
         رَ.INSTANCE
         .getICON()
         .priority(this.iconsPipeline())
         .size(actionIconSize)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha * 0.72F))
         .drawText("Z", valueX + valueWidth + iconGap, actionIconY)
      }

   private fun isLeftMousePressed(): Boolean {
      return GLFW.glfwGetMouseButton(ضك.getMc().getWindow().getHandle(), 0) == 1
   }

   private fun configCreateConfirmButtonBounds(popup: طآ): طآ {
      val input: طآ = this.configCreateInputBounds(popup)
      return طآ(popup.x + 7.0F, input.y + input.height + 5.0F, (popup.width - 14.0F - 5.0F) * 0.5F, 17.0F)
   }

   private fun isEventsCategory(category: ظص?): Boolean {
      return category == ظن.getEVENTS()
   }

   private fun commitModuleSearch(value: String) {
      if (value.length() != 0) {
         if (topBarTextSelected) {
            this.updateModuleSearchText(StringsKt.take(value, maxModuleSearchLength))
         } else {
            this.appendModuleSearch(value)
         }
      }
   }

   private fun avatarPopupHudScaleProgress(mouseX: Float, sliderBounds: طآ): Float {
      return if (sliderBounds.width <= 0.0F) سر.INSTANCE.hudScaleProgress() else RangesKt.coerceIn((mouseX - sliderBounds.x) / sliderBounds.width, 0.0F, 1.0F)
   }

   public override fun close() {
      if (eventServerConfirmOpen) {
         this.closeEventServerConfirm()
      } else if (!closing) {
         if (!ثظ.INSTANCE.requestCloseSnapshot()) {
            closing = true
            modelPreviewRenderingEnabled = false
            configKeyPopupOpen = false
            configKeyInputFocused = false
            configKeyTextSelected = false
            configKeySubmitting = false
            configKeyStatusText = null
            var var1: Int = configKeyRequestId++
            configCreatePopupOpen = false
            configCreateCloudSaveMode = false
            configCloudSaveExistingMode = false
            configCloudSaveSubmitting = false
            configCreateUnloadPrompt = false
            configCreateInputFocused = false
            configCreateTextSelected = false
            configCreateStatusText = null
            configShareModalOpen = false
            configShareFocusedField = null
            configShareGeneratedKeys = CollectionsKt.emptyList()
            configShareInfiniteActivations = false
            configShareCopiedAtMs = 0L
            configShareSubmitting = false
            configShareCheckingExisting = false
            configShareErrorText = null
            var1 = configShareRequestId++
            configShareManagingExisting = false
            configShareManagedConfigId = null
            eventServerConfirmOpen = false
            eventServerConfirmAnarchy = null
            var1 = cloudLibrarySyncRequestId++
            avatarPopupOpen = false
            draggingAvatarPopupGuiScale = false
            avatarPopupGuiScaleDragProgress = null
            draggingAvatarPopupHudScale = false
            avatarPopupHudScaleDragProgress = null
            searchFocused = false
            topBarTextSelected = false
            draggingScrollBar = false
            scrollBarGrabOffset = 0.0F
            this.clearCategoryInputFocus()
         }
      }
   }

   private fun avatarPopupGuiScaleSliderBounds(cardBounds: طآ, metrics: تذ): طآ {
      val padding: Float = metrics.scaled(6.0F)
      val valueWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "150%", metrics.scaled(6.2F), 0.0F, 4, null)
      val valueGap: Float = metrics.scaled(4.0F)
      val sliderWidth: Float = metrics.scaled(30.0F)
      val sliderHeight: Float = metrics.scaled(2.7F)
      return طآ(
         cardBounds.x + cardBounds.width - padding - valueWidth - valueGap - sliderWidth,
         cardBounds.y + (cardBounds.height - sliderHeight) * 0.5F,
         RangesKt.coerceAtLeast(sliderWidth, 0.0F),
         sliderHeight
      )
   }

   private fun isAllowedConfigKeyChar(char: Char): Boolean {
      return Character.isLetterOrDigit(char) || char == '-'
   }

   private fun eventServerConfirmCancelBounds(modal: طآ): طآ {
      val accept: طآ = this.eventServerConfirmAcceptBounds(modal)
      return طآ(accept.x + accept.width + 5.0F, accept.y, accept.width, accept.height)
   }

   private fun cloudErrorText(error: Throwable): String {
      val cause: java.lang.Throwable = this.unwrapAsyncError(error)
      val apiError: شئ = cause as? شئ
      if ((cause as? شئ) == null) {
         val var15: java.lang.String = cause.getClass().getSimpleName()
         var var10001: java.lang.String = cause.getMessage()
         if (var10001 == null) {
            var10001 = "без описания"
         }

         return "$var15: $var10001"
      } else {
         var var10000: java.lang.String
         run label106@{
            val var5: java.lang.String = apiError.code
            when (var5.hashCode()) {
               -2047910192 -> {
                  if (var5.equals("invalid_cloud_identity")) {
                     var10000 = "Не удалось подтвердить аккаунт Cloud"
                     return@label106
                  }
               }
               -1745575786 -> {
                  if (var5.equals("rate_limit_exceeded")) {
                     var10000 = "Слишком много запросов, попробуйте через минуту"
                     return@label106
                  }
               }
               -1326222873 -> {
                  if (var5.equals("imported_cloud_config")) {
                     var10000 = "Полученный чужой конфиг нельзя публиковать повторно"
                     return@label106
                  }
               }
               -1054914010 -> {
                  if (var5.equals("own_key")) {
                     var10000 = "Данный конфиг уже есть"
                     return@label106
                  }
               }
               -926334392 -> {
                  if (var5.equals("cloud_config_limit")) {
                     var10000 = "Лимит аккаунта: максимум 10 Cloud-конфигов"
                     return@label106
                  }
               }
               -434428962 -> {
                  if (var5.equals("invalid_local_config")) {
                     var10000 = "Локальный конфиг повреждён или отсутствует"
                     return@label106
                  }
               }
               460212909 -> {
                  if (var5.equals("cloud_library_limit")) {
                     var10000 = "Библиотека полученных конфигов заполнена"
                     return@label106
                  }
               }
               506202997 -> {
                  if (var5.equals("invalid_server_response")) {
                     var10000 = "Сервер вернул повреждённый ответ"
                     return@label106
                  }
               }
               620910836 -> {
                  if (var5.equals("unauthorized")) {
                     var10000 = "Сервер отклонил подпись запроса"
                     return@label106
                  }
               }
               1299764309 -> {
                  if (var5.equals("invalid_or_exhausted_key")) {
                     var10000 = "Ключ неверный, отозван или уже использован"
                     return@label106
                  }
               }
               1615526678 -> {
                  if (var5.equals("not_found")) {
                     var10000 = "Конфиг или ключ уже удалён на сервере"
                     return@label106
                  }
               }
               1720001617 -> {
                  if (var5.equals("cloud_key_limit")) {
                     var10000 = "Слишком много активных ключей этого конфига"
                     return@label106
                  }
               }
               else -> {}
            }

            var10000 = null
         }

         if (var10000 != null) {
            return var10000
         } else {
            val var10: StringBuilder = StringBuilder()
            var10.append(apiError.code)
            var10000 = apiError.details
            if (var10000 != null) {
               var10.append(": ")
               var10.append(var10000)
            }

            val var14: Int = apiError.httpStatus
            if (var14 != null) {
               val var11: Int = var14.intValue()
               var10.append(" [HTTP ")
               var10.append(var11)
               var10.append(']')
            }

            return var10.toString()
         }
      }
   }

   private fun updateConfigShareActivations(value: String) {
      configShareErrorText = null
      if (!configShareInfiniteActivations) {
         configShareActivationsText = value
      }
   }

   private fun renderConfigShareModal(openProgress: Float, mouseX: Float, mouseY: Float) {
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
      // 000: getstatic oxxxde/حز.configShareModalAnimation Loxxxde/ري;
      // 003: getstatic oxxxde/حز.configShareModalOpen Z
      // 006: ifeq 00e
      // 009: fconst_1
      // 00a: nop
      // 00b: goto 010
      // 00e: fconst_0
      // 00f: nop
      // 010: ldc_w 220.0
      // 013: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 016: astore 5
      // 018: new oxxxde/خح
      // 01b: dup
      // 01c: aload 5
      // 01e: invokespecial oxxxde/خح.<init> (Loxxxde/بف;)V
      // 021: checkcast oxxxde/شل
      // 024: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 027: fconst_0
      // 028: nop
      // 029: fconst_1
      // 02a: nop
      // 02b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 02e: fstore 4
      // 030: fload 4
      // 032: ldc_w 0.001
      // 035: fcmpg
      // 036: ifgt 074
      // 039: getstatic oxxxde/حز.configShareModalOpen Z
      // 03c: ifne 073
      // 03f: aconst_null
      // 040: nop
      // 041: putstatic oxxxde/حز.configShareConfigName Ljava/lang/String;
      // 044: ldc_w ""
      // 047: putstatic oxxxde/حز.configShareActivationsText Ljava/lang/String;
      // 04a: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 04d: putstatic oxxxde/حز.configShareGeneratedKeys Ljava/util/List;
      // 050: bipush 0
      // 051: nop
      // 052: putstatic oxxxde/حز.configShareInfiniteActivations Z
      // 055: lconst_0
      // 056: nop
      // 057: putstatic oxxxde/حز.configShareCopiedAtMs J
      // 05a: bipush 0
      // 05b: nop
      // 05c: putstatic oxxxde/حز.configShareSubmitting Z
      // 05f: bipush 0
      // 060: nop
      // 061: putstatic oxxxde/حز.configShareCheckingExisting Z
      // 064: aconst_null
      // 065: nop
      // 066: putstatic oxxxde/حز.configShareErrorText Ljava/lang/String;
      // 069: bipush 0
      // 06a: nop
      // 06b: putstatic oxxxde/حز.configShareManagingExisting Z
      // 06e: aconst_null
      // 06f: nop
      // 070: putstatic oxxxde/حز.configShareManagedConfigId Ljava/lang/String;
      // 073: return
      // 074: fload 1
      // 075: fload 4
      // 077: fmul
      // 078: fstore 5
      // 07a: getstatic oxxxde/حز.configShareGeneratedKeys Ljava/util/List;
      // 07d: checkcast java/util/Collection
      // 080: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 085: ifne 08d
      // 088: bipush 1
      // 089: nop
      // 08a: goto 08f
      // 08d: bipush 0
      // 08e: nop
      // 08f: istore 6
      // 091: getstatic oxxxde/حز.configShareResultsAnimation Loxxxde/ري;
      // 094: iload 6
      // 096: ifeq 09e
      // 099: fconst_1
      // 09a: nop
      // 09b: goto 0a0
      // 09e: fconst_0
      // 09f: nop
      // 0a0: ldc_w 240.0
      // 0a3: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0a6: astore 8
      // 0a8: new oxxxde/ظإ
      // 0ab: dup
      // 0ac: aload 8
      // 0ae: invokespecial oxxxde/ظإ.<init> (Loxxxde/بف;)V
      // 0b1: checkcast oxxxde/شل
      // 0b4: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0b7: fconst_0
      // 0b8: nop
      // 0b9: fconst_1
      // 0ba: nop
      // 0bb: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0be: fstore 7
      // 0c0: getstatic oxxxde/حز.configShareInfinityAnimation Loxxxde/ري;
      // 0c3: iload 6
      // 0c5: ifne 0d3
      // 0c8: getstatic oxxxde/حز.configShareInfiniteActivations Z
      // 0cb: ifeq 0d3
      // 0ce: fconst_1
      // 0cf: nop
      // 0d0: goto 0d5
      // 0d3: fconst_0
      // 0d4: nop
      // 0d5: ldc_w 220.0
      // 0d8: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0db: astore 8
      // 0dd: new oxxxde/ثل
      // 0e0: dup
      // 0e1: aload 8
      // 0e3: invokespecial oxxxde/ثل.<init> (Loxxxde/بف;)V
      // 0e6: checkcast oxxxde/شل
      // 0e9: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0ec: fconst_0
      // 0ed: nop
      // 0ee: fconst_1
      // 0ef: nop
      // 0f0: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0f3: putstatic oxxxde/حز.configShareInfinityProgress F
      // 0f6: getstatic oxxxde/حز.configShareActivationsFocusAnimation Loxxxde/ري;
      // 0f9: iload 6
      // 0fb: ifne 112
      // 0fe: getstatic oxxxde/حز.configShareInfiniteActivations Z
      // 101: ifne 112
      // 104: getstatic oxxxde/حز.configShareFocusedField Loxxxde/زو;
      // 107: getstatic oxxxde/زو.ACTIVATIONS Loxxxde/زو;
      // 10a: if_acmpne 112
      // 10d: fconst_1
      // 10e: nop
      // 10f: goto 114
      // 112: fconst_0
      // 113: nop
      // 114: ldc_w 180.0
      // 117: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 11a: astore 9
      // 11c: new oxxxde/حر
      // 11f: dup
      // 120: aload 9
      // 122: invokespecial oxxxde/حر.<init> (Loxxxde/بف;)V
      // 125: checkcast oxxxde/شل
      // 128: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 12b: fconst_0
      // 12c: nop
      // 12d: fconst_1
      // 12e: nop
      // 12f: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 132: fstore 8
      // 134: getstatic oxxxde/حز.configShareModalHeightAnimation Loxxxde/ري;
      // 137: aload 0
      // 138: invokespecial oxxxde/حز.configShareTargetModalHeight ()F
      // 13b: ldc_w 240.0
      // 13e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 141: astore 9
      // 143: new oxxxde/شإ
      // 146: dup
      // 147: aload 9
      // 149: invokespecial oxxxde/شإ.<init> (Loxxxde/بف;)V
      // 14c: checkcast oxxxde/شل
      // 14f: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 152: ldc_w 60.0
      // 155: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 158: putstatic oxxxde/حز.configShareRenderedModalHeight F
      // 15b: ldc_w 32.0
      // 15e: fstore 9
      // 160: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 163: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 166: aload 0
      // 167: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 16a: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 16d: new java/awt/Color
      // 170: dup
      // 171: bipush 0
      // 172: nop
      // 173: bipush 0
      // 174: nop
      // 175: bipush 0
      // 176: nop
      // 177: ldc_w 127.5
      // 17a: fload 5
      // 17c: fmul
      // 17d: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 180: bipush 0
      // 181: nop
      // 182: sipush 255
      // 185: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 188: invokespecial java/awt/Color.<init> (IIII)V
      // 18b: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 18e: fconst_0
      // 18f: nop
      // 190: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 193: fload 9
      // 195: fneg
      // 196: fload 9
      // 198: fneg
      // 199: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 19c: invokevirtual net/minecraft/client/MinecraftClient.getWindow ()Lnet/minecraft/client/util/Window;
      // 19f: invokevirtual net/minecraft/client/util/Window.getScaledWidth ()I
      // 1a2: i2f
      // 1a3: fload 9
      // 1a5: fconst_2
      // 1a6: nop
      // 1a7: fmul
      // 1a8: fadd
      // 1a9: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 1ac: invokevirtual net/minecraft/client/MinecraftClient.getWindow ()Lnet/minecraft/client/util/Window;
      // 1af: invokevirtual net/minecraft/client/util/Window.getScaledHeight ()I
      // 1b2: i2f
      // 1b3: fload 9
      // 1b5: fconst_2
      // 1b6: nop
      // 1b7: fmul
      // 1b8: fadd
      // 1b9: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 1bc: aload 0
      // 1bd: getstatic oxxxde/حز.configShareRenderedModalHeight F
      // 1c0: invokespecial oxxxde/حز.configShareModalBounds (F)Loxxxde/طآ;
      // 1c3: astore 10
      // 1c5: aload 10
      // 1c7: fconst_0
      // 1c8: nop
      // 1c9: aload 10
      // 1cb: invokevirtual oxxxde/طآ.getY ()F
      // 1ce: fconst_1
      // 1cf: nop
      // 1d0: fload 4
      // 1d2: fsub
      // 1d3: ldc_w 5.0
      // 1d6: fmul
      // 1d7: fadd
      // 1d8: fconst_0
      // 1d9: nop
      // 1da: fconst_0
      // 1db: nop
      // 1dc: bipush 13
      // 1de: aconst_null
      // 1df: nop
      // 1e0: invokestatic oxxxde/طآ.copy$default (Loxxxde/طآ;FFFFILjava/lang/Object;)Loxxxde/طآ;
      // 1e3: astore 11
      // 1e5: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1e8: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 1eb: aload 0
      // 1ec: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1ef: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 1f2: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1f5: fload 5
      // 1f7: invokevirtual oxxxde/ثْ.panel (F)Ljava/awt/Color;
      // 1fa: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 1fd: ldc_w 5.0
      // 200: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 203: aload 11
      // 205: invokevirtual oxxxde/طآ.getX ()F
      // 208: aload 11
      // 20a: invokevirtual oxxxde/طآ.getY ()F
      // 20d: aload 11
      // 20f: invokevirtual oxxxde/طآ.getWidth ()F
      // 212: aload 11
      // 214: invokevirtual oxxxde/طآ.getHeight ()F
      // 217: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 21a: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 21d: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 220: aload 0
      // 221: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 224: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 227: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 22a: ldc_w 0.04
      // 22d: fload 5
      // 22f: fmul
      // 230: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 233: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 236: ldc_w 0.95
      // 239: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 23c: ldc_w 5.0
      // 23f: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 242: fconst_1
      // 243: nop
      // 244: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 247: ldc_w 0.08
      // 24a: fload 5
      // 24c: fmul
      // 24d: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 250: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 253: aload 11
      // 255: invokevirtual oxxxde/طآ.getX ()F
      // 258: aload 11
      // 25a: invokevirtual oxxxde/طآ.getY ()F
      // 25d: aload 11
      // 25f: invokevirtual oxxxde/طآ.getWidth ()F
      // 262: aload 11
      // 264: invokevirtual oxxxde/طآ.getHeight ()F
      // 267: invokevirtual oxxxde/جء.draw (FFFF)V
      // 26a: ldc_w 8.0
      // 26d: fstore 12
      // 26f: nop
      // 270: getstatic oxxxde/حز.configShareManagingExisting Z
      // 273: ifeq 286
      // 276: getstatic oxxxde/حز.configShareErrorText Ljava/lang/String;
      // 279: ifnull 286
      // 27c: getstatic oxxxde/حز.configShareErrorText Ljava/lang/String;
      // 27f: dup
      // 280: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 283: goto 295
      // 286: getstatic oxxxde/حز.configShareManagingExisting Z
      // 289: ifeq 292
      // 28c: ldc_w "Ключи конфига"
      // 28f: goto 295
      // 292: ldc_w "Создание клауд-конфига"
      // 295: astore 13
      // 297: getstatic oxxxde/حز.configShareTitleTransition Loxxxde/حت;
      // 29a: aload 13
      // 29c: invokevirtual oxxxde/حت.update (Ljava/lang/String;)Ljava/util/List;
      // 29f: checkcast java/lang/Iterable
      // 2a2: astore 14
      // 2a4: bipush 0
      // 2a5: nop
      // 2a6: istore 15
      // 2a8: aload 14
      // 2aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2af: astore 16
      // 2b1: aload 16
      // 2b3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b8: ifeq 327
      // 2bb: aload 16
      // 2bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c2: astore 17
      // 2c4: aload 17
      // 2c6: checkcast oxxxde/ذإ
      // 2c9: astore 18
      // 2cb: bipush 0
      // 2cc: nop
      // 2cd: istore 19
      // 2cf: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 2d2: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 2d5: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 2d8: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 2db: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 2de: aload 18
      // 2e0: invokevirtual oxxxde/ذإ.getText ()Ljava/lang/String;
      // 2e3: aload 11
      // 2e5: invokevirtual oxxxde/طآ.getX ()F
      // 2e8: aload 11
      // 2ea: invokevirtual oxxxde/طآ.getWidth ()F
      // 2ed: ldc_w 0.5
      // 2f0: fmul
      // 2f1: fadd
      // 2f2: aload 11
      // 2f4: invokevirtual oxxxde/طآ.getY ()F
      // 2f7: ldc_w 7.0
      // 2fa: fadd
      // 2fb: ldc_w 0.4
      // 2fe: fsub
      // 2ff: aload 18
      // 301: invokevirtual oxxxde/ذإ.getOffsetY ()F
      // 304: fadd
      // 305: fload 12
      // 307: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 30a: ldc_w 0.9
      // 30d: fload 5
      // 30f: fmul
      // 310: aload 18
      // 312: invokevirtual oxxxde/ذإ.getAlpha ()F
      // 315: fmul
      // 316: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 319: fconst_0
      // 31a: nop
      // 31b: bipush 32
      // 31d: aconst_null
      // 31e: nop
      // 31f: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 322: nop
      // 323: nop
      // 324: goto 2b1
      // 327: nop
      // 328: aload 0
      // 329: aload 11
      // 32b: invokespecial oxxxde/حز.configShareDividerBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 32e: astore 14
      // 330: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 333: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 336: aload 0
      // 337: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 33a: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 33d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 340: ldc_w 0.1
      // 343: fload 5
      // 345: fmul
      // 346: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 349: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 34c: ldc_w 0.5
      // 34f: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 352: aload 14
      // 354: invokevirtual oxxxde/طآ.getX ()F
      // 357: aload 14
      // 359: invokevirtual oxxxde/طآ.getY ()F
      // 35c: aload 14
      // 35e: invokevirtual oxxxde/طآ.getWidth ()F
      // 361: aload 14
      // 363: invokevirtual oxxxde/طآ.getHeight ()F
      // 366: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 369: iload 6
      // 36b: ifeq 379
      // 36e: getstatic oxxxde/حز.configShareManagingExisting Z
      // 371: ifeq 379
      // 374: bipush 1
      // 375: nop
      // 376: goto 37b
      // 379: bipush 0
      // 37a: nop
      // 37b: istore 15
      // 37d: getstatic oxxxde/حز.configShareCheckingExisting Z
      // 380: ifne 388
      // 383: iload 15
      // 385: ifeq 38d
      // 388: fconst_0
      // 389: nop
      // 38a: goto 395
      // 38d: fload 5
      // 38f: fconst_1
      // 390: nop
      // 391: fload 7
      // 393: fsub
      // 394: fmul
      // 395: fstore 16
      // 397: fload 16
      // 399: ldc_w 0.001
      // 39c: fcmpl
      // 39d: ifle 46b
      // 3a0: aload 0
      // 3a1: aload 0
      // 3a2: aload 11
      // 3a4: invokespecial oxxxde/حز.configShareActivationsInputBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 3a7: getstatic oxxxde/حز.configShareActivationsText Ljava/lang/String;
      // 3aa: ldc_w "Количество активаций.."
      // 3ad: getstatic oxxxde/حز.configShareFocusedField Loxxxde/زو;
      // 3b0: getstatic oxxxde/زو.ACTIVATIONS Loxxxde/زو;
      // 3b3: if_acmpne 3c1
      // 3b6: getstatic oxxxde/حز.configShareInfiniteActivations Z
      // 3b9: ifne 3c1
      // 3bc: bipush 1
      // 3bd: nop
      // 3be: goto 3c3
      // 3c1: bipush 0
      // 3c2: nop
      // 3c3: fload 16
      // 3c5: fconst_1
      // 3c6: nop
      // 3c7: getstatic oxxxde/حز.configShareInfinityProgress F
      // 3ca: fsub
      // 3cb: fmul
      // 3cc: fload 8
      // 3ce: fconst_1
      // 3cf: nop
      // 3d0: getstatic oxxxde/حز.configShareInfinityProgress F
      // 3d3: fsub
      // 3d4: invokespecial oxxxde/حز.renderConfigShareInput (Loxxxde/طآ;Ljava/lang/String;Ljava/lang/String;ZFFF)V
      // 3d7: aload 0
      // 3d8: aload 11
      // 3da: getstatic oxxxde/حز.configShareInfinityProgress F
      // 3dd: invokespecial oxxxde/حز.configShareInfinityButtonBounds (Loxxxde/طآ;F)Loxxxde/طآ;
      // 3e0: astore 17
      // 3e2: getstatic oxxxde/حز.configShareInfinityHoverAnimation Loxxxde/ري;
      // 3e5: aload 17
      // 3e7: fload 2
      // 3e8: fload 3
      // 3e9: invokevirtual oxxxde/طآ.contains (FF)Z
      // 3ec: ifeq 3f4
      // 3ef: fconst_1
      // 3f0: nop
      // 3f1: goto 3f6
      // 3f4: fconst_0
      // 3f5: nop
      // 3f6: ldc_w 170.0
      // 3f9: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 3fc: astore 19
      // 3fe: new oxxxde/تآ
      // 401: dup
      // 402: aload 19
      // 404: invokespecial oxxxde/تآ.<init> (Loxxxde/بف;)V
      // 407: checkcast oxxxde/شل
      // 40a: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 40d: fconst_0
      // 40e: nop
      // 40f: fconst_1
      // 410: nop
      // 411: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 414: fstore 18
      // 416: aload 0
      // 417: aload 17
      // 419: fload 16
      // 41b: fconst_1
      // 41c: nop
      // 41d: getstatic oxxxde/حز.configShareInfinityProgress F
      // 420: fload 18
      // 422: invokespecial oxxxde/حز.renderConfigShareInfinityButton (Loxxxde/طآ;FFFF)V
      // 425: aload 0
      // 426: aload 11
      // 428: invokespecial oxxxde/حز.configShareCreateButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 42b: astore 19
      // 42d: getstatic oxxxde/حز.configShareCreateHoverAnimation Loxxxde/ري;
      // 430: aload 19
      // 432: fload 2
      // 433: fload 3
      // 434: invokevirtual oxxxde/طآ.contains (FF)Z
      // 437: ifeq 43f
      // 43a: fconst_1
      // 43b: nop
      // 43c: goto 441
      // 43f: fconst_0
      // 440: nop
      // 441: ldc_w 170.0
      // 444: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 447: astore 21
      // 449: new oxxxde/خغ
      // 44c: dup
      // 44d: aload 21
      // 44f: invokespecial oxxxde/خغ.<init> (Loxxxde/بف;)V
      // 452: checkcast oxxxde/شل
      // 455: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 458: fconst_0
      // 459: nop
      // 45a: fconst_1
      // 45b: nop
      // 45c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 45f: fstore 20
      // 461: aload 0
      // 462: aload 19
      // 464: fload 16
      // 466: fload 20
      // 468: invokespecial oxxxde/حز.renderConfigShareCreateButton (Loxxxde/طآ;FF)V
      // 46b: getstatic oxxxde/حز.configShareLoadingAnimation Loxxxde/ري;
      // 46e: getstatic oxxxde/حز.configShareCheckingExisting Z
      // 471: ifeq 479
      // 474: fconst_1
      // 475: nop
      // 476: goto 47b
      // 479: fconst_0
      // 47a: nop
      // 47b: ldc_w 190.0
      // 47e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 481: astore 18
      // 483: new oxxxde/بش
      // 486: dup
      // 487: aload 18
      // 489: invokespecial oxxxde/بش.<init> (Loxxxde/بف;)V
      // 48c: checkcast oxxxde/شل
      // 48f: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 492: fconst_0
      // 493: nop
      // 494: fconst_1
      // 495: nop
      // 496: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 499: fstore 17
      // 49b: fload 17
      // 49d: ldc_w 0.001
      // 4a0: fcmpl
      // 4a1: ifle 4f9
      // 4a4: aload 0
      // 4a5: aload 11
      // 4a7: invokespecial oxxxde/حز.configShareInputRowBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 4aa: astore 18
      // 4ac: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 4af: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 4b2: aload 0
      // 4b3: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 4b6: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 4b9: ldc_w "Загрузка..."
      // 4bc: aload 18
      // 4be: invokevirtual oxxxde/طآ.getX ()F
      // 4c1: aload 18
      // 4c3: invokevirtual oxxxde/طآ.getWidth ()F
      // 4c6: ldc_w 0.5
      // 4c9: fmul
      // 4ca: fadd
      // 4cb: aload 18
      // 4cd: invokevirtual oxxxde/طآ.getY ()F
      // 4d0: aload 18
      // 4d2: invokevirtual oxxxde/طآ.getHeight ()F
      // 4d5: ldc_w 6.2
      // 4d8: fsub
      // 4d9: ldc_w 0.46
      // 4dc: fmul
      // 4dd: fadd
      // 4de: ldc_w 6.2
      // 4e1: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 4e4: ldc_w 0.72
      // 4e7: fload 5
      // 4e9: fmul
      // 4ea: fload 17
      // 4ec: fmul
      // 4ed: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 4f0: fconst_0
      // 4f1: nop
      // 4f2: bipush 32
      // 4f4: aconst_null
      // 4f5: nop
      // 4f6: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 4f9: fload 5
      // 4fb: fload 7
      // 4fd: fmul
      // 4fe: fstore 18
      // 500: fload 18
      // 502: ldc_w 0.001
      // 505: fcmpl
      // 506: ifle 526
      // 509: iload 6
      // 50b: ifne 517
      // 50e: getstatic oxxxde/حز.configShareKeyListAnimations Loxxxde/ثّ;
      // 511: invokevirtual oxxxde/ثّ.hasItems ()Z
      // 514: ifeq 526
      // 517: aload 0
      // 518: aload 11
      // 51a: fload 18
      // 51c: fload 7
      // 51e: fload 2
      // 51f: fload 3
      // 520: invokespecial oxxxde/حز.renderGeneratedConfigKeys (Loxxxde/طآ;FFFF)V
      // 523: goto 543
      // 526: iload 6
      // 528: ifne 543
      // 52b: getstatic oxxxde/حز.configShareKeyListAnimations Loxxxde/ثّ;
      // 52e: invokevirtual oxxxde/ثّ.hasItems ()Z
      // 531: ifeq 543
      // 534: getstatic oxxxde/حز.configShareKeyListAnimations Loxxxde/ثّ;
      // 537: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 53a: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.renderConfigShareModal$lambda$1 (Loxxxde/بء;)Ljava/lang/String;, (Loxxxde/بء;)Ljava/lang/String; ]
      // 53f: invokevirtual oxxxde/ثّ.update (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
      // 542: pop
      // 543: return
   }

   private fun configShareCreateButtonBounds(modal: طآ): طآ {
      val row: طآ = this.configShareInputRowBounds(modal)
      return طآ(modal.x + 7.0F, row.y + row.height + 5.0F, modal.width - 14.0F, 17.0F)
   }

   private fun renderAvatarPopupGuiBackgroundSetting(x: Float, y: Float, width: Float, metrics: تذ, alpha: Float) {
      val lineAlpha: Float = RangesKt.coerceIn(alpha, 0.0F, 1.0F)
      val padding: Float = metrics.scaled(6.0F)
      val iconSize: Float = metrics.scaled(7.8F)
      val labelSize: Float = metrics.scaled(6.7F)
      val textYOffset: Float = this.avatarPopupSettingTextYOffset(metrics)
      val iconX: Float = x + padding
      val iconY: Float = y + (metrics.settingHeight - رَ.INSTANCE.getICON().getHeight(iconSize)) * 0.5F
      val labelX: Float = iconX + iconSize + metrics.scaled(4.6F)
      val labelY: Float = y + (metrics.settingHeight - رَ.INSTANCE.getGS_MEDIUM().getHeight(labelSize)) * 0.5F - textYOffset
      val enabledProgress: Float = guiBackgroundProgress
      رَ.INSTANCE
         .getICON()
         .priority(this.iconsPipeline())
         .size(iconSize)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha * 0.92F))
         .drawText("f", iconX, iconY)
         رَ.INSTANCE
         .getGS_MEDIUM()
         .priority(this.textPipeline())
         .size(labelSize)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha * 0.94F))
         .drawText("Фон гуи", labelX, labelY)
         val booleanHeight: Float = metrics.scaled(15.0F)
      سأ.INSTANCE
         .render(
            x,
            y + (metrics.settingHeight - booleanHeight) * 0.5F,
            width,
            booleanHeight,
            metrics.scaled(5.0F),
            enabledProgress,
            lineAlpha,
            1.0F,
            this.rectPipeline()
         )
      }

   public final val y: Float
      public final get() {
         return ضك.getMc().getWindow().getScaledHeight() * 0.5F - this.height * 0.5F
      }


   private fun deleteOwnedCloudConfig(configName: String, configId: String) {
      خه.INSTANCE.revokeConfig(configId).whenComplete({ p0: Any, p1: Any ->
         `$tmp0`(p0, p1)
      })
   }

   private fun avatarPopupRows(): List<جغ> {
      return CollectionsKt.emptyList()
   }

   private fun unscaleMouseX(mouseX: Int, scale: Float): Int {
      val centerX: Float = this.x + this.width * 0.5F
      return (int)((mouseX - centerX) / scale + centerX)
   }

   private fun currentScale(openProgress: Float = this.openProgress()): Float {
      return RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(سر.INSTANCE.scale(), 0.01F) * (0.92F + 0.07999998F * openProgress), 0.01F)
   }

   public final val panelWidth: Float
      public final get() {
         return 40.0F
      }


   private fun copyGeneratedConfigKeys() {
      if (!configShareGeneratedKeys.isEmpty()) {
         GLFW.glfwSetClipboardString(
            ضك.getMc().getWindow().getHandle(),
            CollectionsKt.joinToString$default(configShareGeneratedKeys, "\n", null, null, 0, null, <unrepresentable>.INSTANCE, 30, null)
         )
         configShareCopiedAtMs = System.currentTimeMillis()
      }
   }

   private fun submitConfigKey() {
      if (!configKeySubmitting) {
         if (!this.canSubmitConfigKey()) {
            configKeyStatusText = "Неверный формат ключа"
         } else {
            val var10000: java.lang.String = StringsKt.trim(configKeyText).toString().toUpperCase(Locale.ROOT)
            configKeyText = var10000
            configKeyInputFocused = false
            configKeyTextSelected = false
            configKeyStatusText = null
            configKeySubmitting = true
            configKeyRequestId++
            val requestId: Int = configKeyRequestId
            خه.INSTANCE.redeem(var10000).whenComplete({ p0: Any, p1: Any ->
               `$tmp0`(p0, p1)
            })
         }
      }
   }

   private fun avatarPopupHudScaleSliderHitBounds(cardBounds: طآ, metrics: تذ): طآ {
      val sliderBounds: طآ = this.avatarPopupHudScaleSliderBounds(cardBounds, metrics)
      val hitPadding: Float = metrics.scaled(5.0F)
      return طآ(sliderBounds.x - hitPadding, sliderBounds.y - hitPadding, sliderBounds.width + hitPadding * 2.0F, sliderBounds.height + hitPadding * 2.0F)
   }

   private fun openConfigShareModal(configName: String) {
      configShareConfigName = configName
      configShareActivationsText = ""
      configShareGeneratedKeys = CollectionsKt.emptyList()
      configShareInfiniteActivations = false
      configShareRenderedModalHeight = 54.0F
      configShareInfinityProgress = 0.0F
      configShareCopiedAtMs = 0L
      configShareSubmitting = false
      configShareCheckingExisting = true
      configShareErrorText = null
      configShareManagingExisting = false
      configShareManagedConfigId = null
      configShareRequestId++
      val requestId: Int = configShareRequestId
      configShareFocusedField = null
      ري.animate$default(configShareModalHeightAnimation, 54.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareResultsAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareInfinityAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareActivationsFocusAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareCopyFeedbackAnimation, 0.0F, 0.0F, null, 4, null)
      configShareModalOpen = true
      closeConfigKeyPopup$default(this, false, 1, null)
      closeConfigCreatePopup$default(this, false, 1, null)
      avatarPopupOpen = false
      draggingAvatarPopupGuiScale = false
      avatarPopupGuiScaleDragProgress = null
      draggingAvatarPopupHudScale = false
      avatarPopupHudScaleDragProgress = null
      searchFocused = false
      topBarTextSelected = false
      this.loadExistingCloudKeys(configName, requestId)
   }

   public final val height: Float
      public final get() {
         return 250.0F
      }


   private fun avatarPopupGuiScaleProgress(mouseX: Float, sliderBounds: طآ): Float {
      return if (sliderBounds.width <= 0.0F) سر.INSTANCE.scaleProgress() else RangesKt.coerceIn((mouseX - sliderBounds.x) / sliderBounds.width, 0.0F, 1.0F)
   }

   private fun isShiftDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 340) == 1 || GLFW.glfwGetKey(handle, 344) == 1
   }

   private fun avatarPopupSettingTextYOffset(metrics: تذ): Float {
      return metrics.scaled(0.65F)
   }

   private fun closeConfigKeyPopup(clearInput: Boolean = false) {
      val var2: Int = configKeyRequestId++
      configKeySubmitting = false
      configKeyPopupOpen = false
      configKeyInputFocused = false
      configKeyTextSelected = false
      if (clearInput) {
         configKeyText = ""
         configKeyStatusText = null
         ري.animate$default(configKeyUploadAnimation, 0.0F, 0.0F, null, 4, null)
      }
   }

   private fun configShareMoreButtonBounds(modal: طآ): طآ {
      val copy: طآ = this.configShareCopyButtonBounds(modal)
      return طآ(copy.x + copy.width + 5.0F, copy.y, copy.width, copy.height)
   }

   public override fun rectPipeline(): صؤ {
      return صؤ.GUI_RECT
   }

   private fun submitConfigCloudSave() {
      val validationError: java.lang.String = this.configCloudSaveValidationError()
      if (validationError != null) {
         configCreateStatusText = validationError
         logger.warn("Cloud config create click rejected before save: config='{}', reason={}", StringsKt.trim(configCreateText).toString(), validationError)
      } else {
         val configName: java.lang.String = StringsKt.trim(configCreateText).toString()
         configCreateText = configName
         if (configCloudSaveExistingMode) {
            logger.info("Retrying Cloud save for existing config '{}'", configName)
            this.saveConfigToCloud(configName)
         } else {
            val var6: java.util.Iterator = اك.INSTANCE.getVisibleConfigs().iterator()

            var var10000: Any
            while (true) {
               if (!var6.hasNext()) {
                  var10000 = null
                  break
               }

               val `element$iv`: Any = var6.next()
               if (StringsKt.equals((`element$iv` as صٌ).name, configName, true) && (`element$iv` as صٌ).getCloudOrigin() == null) {
                  var10000 = `element$iv`
                  break
               }
            }

            val existingLocalConfig: صٌ = var10000 as صٌ
            if (var10000 as صٌ != null) {
               configCreateText = existingLocalConfig.name
               logger.info("Cloud config create uses existing local config '{}'", existingLocalConfig.name)
               this.saveConfigToCloud(existingLocalConfig.name)
            } else {
               logger.info("Creating local snapshot '{}' before Cloud save", configName)
               when (ظْ.$EnumSwitchMapping$0[اك.INSTANCE.create(configName).ordinal()]) {
                  1 -> {
                     this.saveConfigToCloud(configName)
                     return
                  }
                  2 -> {
                     configCreateStatusText = "Такой конфиг уже есть"
                     return
                  }
                  3 -> {
                     configCreateStatusText = "Неверное название"
                     return
                  }
                  4 -> {
                     configCreateUnloadPrompt = true
                     configCreateInputFocused = false
                     configCreateTextSelected = false
                     configCreateStatusText = null
                     return
                  }
                  5 -> {
                     configCreateStatusText = "Не удалось сохранить"
                     return
                  }
                  else -> throw NoWhenBranchMatchedException()
               }
            }
         }
      }
   }

   private fun currentTopBarCategory(category: ظص?): ظص? {
      return if (this.isPointsCategory(category) && pointsCategoryComponent.isSettingsPageOpen()) pointsSettingsCategory else category
   }

   private fun renderConfigCreateConfirmButton(bounds: طآ, enabled: Boolean, alpha: Float, hoverProgress: Float, text: String = "Создать") {
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
      // 000: getstatic oxxxde/حز.configCreateButtonAnimation Loxxxde/ري;
      // 003: iload 2
      // 004: nop
      // 005: ifeq 00d
      // 008: fconst_1
      // 009: nop
      // 00a: goto 00f
      // 00d: fconst_0
      // 00e: nop
      // 00f: ldc_w 220.0
      // 012: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 015: astore 7
      // 017: new oxxxde/شي
      // 01a: dup
      // 01b: aload 7
      // 01d: invokespecial oxxxde/شي.<init> (Loxxxde/بف;)V
      // 020: checkcast oxxxde/شل
      // 023: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 026: fconst_0
      // 027: nop
      // 028: fconst_1
      // 029: nop
      // 02a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 02d: fstore 6
      // 02f: ldc_w 255.0
      // 032: fload 3
      // 033: fmul
      // 034: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 037: bipush 0
      // 038: nop
      // 039: sipush 255
      // 03c: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 03f: istore 7
      // 041: ldc_w 6.2
      // 044: fstore 8
      // 046: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 049: ldc_w 0.42
      // 04c: fload 3
      // 04d: fmul
      // 04e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 051: astore 9
      // 053: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 056: aload 9
      // 058: new java/awt/Color
      // 05b: dup
      // 05c: bipush 0
      // 05d: nop
      // 05e: bipush 0
      // 05f: nop
      // 060: bipush 0
      // 061: nop
      // 062: iload 7
      // 064: invokespecial java/awt/Color.<init> (IIII)V
      // 067: fload 6
      // 069: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 06c: astore 10
      // 06e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 071: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 074: aload 0
      // 075: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 078: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 07b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 07e: ldc_w 0.025
      // 081: ldc_w 0.025
      // 084: fload 4
      // 086: fmul
      // 087: fadd
      // 088: fload 3
      // 089: fmul
      // 08a: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 08d: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 090: ldc_w 0.95
      // 093: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 096: ldc_w 3.5
      // 099: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 09c: fconst_1
      // 09d: nop
      // 09e: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0a1: ldc_w 0.055
      // 0a4: ldc_w 0.05
      // 0a7: fload 4
      // 0a9: fmul
      // 0aa: fadd
      // 0ab: fload 3
      // 0ac: fmul
      // 0ad: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0b0: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 0b3: aload 1
      // 0b4: invokevirtual oxxxde/طآ.getX ()F
      // 0b7: aload 1
      // 0b8: invokevirtual oxxxde/طآ.getY ()F
      // 0bb: aload 1
      // 0bc: invokevirtual oxxxde/طآ.getWidth ()F
      // 0bf: aload 1
      // 0c0: invokevirtual oxxxde/طآ.getHeight ()F
      // 0c3: invokevirtual oxxxde/جء.draw (FFFF)V
      // 0c6: fload 6
      // 0c8: ldc_w 0.001
      // 0cb: fcmpl
      // 0cc: ifle 145
      // 0cf: iload 7
      // 0d1: i2f
      // 0d2: fload 6
      // 0d4: fmul
      // 0d5: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 0d8: bipush 0
      // 0d9: nop
      // 0da: sipush 255
      // 0dd: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 0e0: istore 11
      // 0e2: ldc_w 255.0
      // 0e5: ldc_w 10.0
      // 0e8: fload 4
      // 0ea: fmul
      // 0eb: fsub
      // 0ec: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 0ef: bipush 0
      // 0f0: nop
      // 0f1: sipush 255
      // 0f4: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 0f7: istore 12
      // 0f9: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0fc: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 0ff: aload 0
      // 100: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 103: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 106: new java/awt/Color
      // 109: dup
      // 10a: iload 12
      // 10c: iload 12
      // 10e: iload 12
      // 110: iload 11
      // 112: invokespecial java/awt/Color.<init> (IIII)V
      // 115: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 118: ldc_w 3.5
      // 11b: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 11e: fconst_1
      // 11f: nop
      // 120: new java/awt/Color
      // 123: dup
      // 124: iload 12
      // 126: iload 12
      // 128: iload 12
      // 12a: iload 11
      // 12c: invokespecial java/awt/Color.<init> (IIII)V
      // 12f: invokevirtual oxxxde/ضِ.border (FLjava/awt/Color;)Loxxxde/ضِ;
      // 132: aload 1
      // 133: invokevirtual oxxxde/طآ.getX ()F
      // 136: aload 1
      // 137: invokevirtual oxxxde/طآ.getY ()F
      // 13a: aload 1
      // 13b: invokevirtual oxxxde/طآ.getWidth ()F
      // 13e: aload 1
      // 13f: invokevirtual oxxxde/طآ.getHeight ()F
      // 142: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 145: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 148: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 14b: aload 0
      // 14c: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 14f: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 152: aload 5
      // 154: aload 1
      // 155: invokevirtual oxxxde/طآ.getX ()F
      // 158: aload 1
      // 159: invokevirtual oxxxde/طآ.getWidth ()F
      // 15c: ldc_w 0.5
      // 15f: fmul
      // 160: fadd
      // 161: aload 1
      // 162: invokevirtual oxxxde/طآ.getY ()F
      // 165: aload 1
      // 166: invokevirtual oxxxde/طآ.getHeight ()F
      // 169: fload 8
      // 16b: fsub
      // 16c: ldc_w 0.46
      // 16f: fmul
      // 170: fadd
      // 171: fload 8
      // 173: aload 10
      // 175: fconst_0
      // 176: nop
      // 177: bipush 32
      // 179: aconst_null
      // 17a: nop
      // 17b: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 17e: return
   }

   private fun handleConfigKeyInput(button: Int) {
      if (this.isCtrlDown()) {
         when (button) {
            65 -> {
               configKeyTextSelected = configKeyText.length() > 0
               return
            }
            67 -> {
               if (configKeyTextSelected && configKeyText.length() > 0) {
                  GLFW.glfwSetClipboardString(ضك.getMc().getWindow().getHandle(), configKeyText)
               }

               return
            }
            86 -> {
               val var31: java.lang.String = GLFW.glfwGetClipboardString(ضك.getMc().getWindow().getHandle())
               if (var31 == null) {
                  return
               }

               val var21: java.lang.CharSequence = var31
               val var23: Appendable = StringBuilder()
               var var27: Int = 0

               for (var10 in var21.length()..var27) {
                  val `element$iv$iv`: Char = var21.charAt(var27)
                  if (this.isAllowedConfigKeyChar(`element$iv$iv`)) {
                     var23.append(`element$iv$iv`)
                  }
               }

               this.appendConfigKey((var23 as StringBuilder).toString())
               return
            }
            else -> {}
         }
      }

      when (button) {
         257, 335 -> {
            this.submitConfigKey()
            return
         }
         259 -> {
            configKeyStatusText = null
            if (configKeyTextSelected) {
               configKeyText = ""
               configKeyTextSelected = false
            } else {
               configKeyText = StringsKt.dropLast(configKeyText, 1)
            }

            return
         }
         261 -> {
            configKeyStatusText = null
            if (configKeyTextSelected) {
               configKeyText = ""
               configKeyTextSelected = false
            }

            return
         }
         else -> {
            var var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
            if (var10000 != null) {
               run label134@{
                  if (this.isShiftDown()) {
                     val `$this$all$iv`: java.lang.CharSequence = var10000
                     var `$this$filterTo$iv$iv`: Int = 0

                     while (true) {
                        if (`$this$filterTo$iv$iv` >= `$this$all$iv`.length()) {
                           var28 = true
                           break
                        }

                        if (!Character.isLetter(`$this$all$iv`.charAt(`$this$filterTo$iv$iv`))) {
                           var28 = false
                           break
                        }

                        `$this$filterTo$iv$iv`++
                     }

                     if (var28) {
                        var10000 = var10000.toUpperCase(Locale.ROOT)
                        return@label134
                     }
                  }

                  var10000 = var10000
               }

               val var16: java.lang.CharSequence = var10000
               var var20: Int = 0

               while (true) {
                  if (var20 >= var16.length()) {
                     var30 = true
                     break
                  }

                  if (!this.isAllowedConfigKeyChar(var16.charAt(var20))) {
                     var30 = false
                     break
                  }

                  var20++
               }

               if (var30) {
                  this.appendConfigKey(var10000)
               }
            }
         }
      }
   }

   private fun avatarPopupSettingBounds(bounds: طآ, metrics: تذ, index: Int): طآ {
      val contentInset: Float = this.avatarPopupContentInset(metrics)
      return طآ(
         bounds.x + contentInset,
         bounds.y + metrics.headerHeight + metrics.margin * 0.75F + index * (metrics.settingHeight + metrics.settingGap),
         metrics.width - contentInset * 2.0F,
         metrics.settingHeight
      )
   }

   private fun renderAvatarPopup(layout: زْ, openProgress: Float, scale: Float, mouseX: Int, mouseY: Int, popupProgress: Float) {
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
      // 000: fload 6
      // 002: fload 2
      // 003: fmul
      // 004: fconst_0
      // 005: fconst_1
      // 006: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 009: fstore 7
      // 00b: fload 7
      // 00d: ldc_w 0.01
      // 010: fcmpg
      // 011: ifgt 015
      // 014: return
      // 015: aload 0
      // 016: fload 3
      // 017: invokespecial oxxxde/حز.avatarPopupMetrics (F)Loxxxde/تذ;
      // 01a: astore 8
      // 01c: aload 0
      // 01d: aload 1
      // 01e: fload 3
      // 01f: aload 8
      // 021: invokespecial oxxxde/حز.avatarPopupBounds (Loxxxde/زْ;FLoxxxde/تذ;)Loxxxde/طآ;
      // 024: astore 9
      // 026: aload 9
      // 028: invokevirtual oxxxde/طآ.getX ()F
      // 02b: fstore 10
      // 02d: aload 9
      // 02f: invokevirtual oxxxde/طآ.getY ()F
      // 032: fconst_1
      // 033: fload 6
      // 035: fsub
      // 036: aload 8
      // 038: ldc_w 4.0
      // 03b: invokevirtual oxxxde/تذ.scaled (F)F
      // 03e: fmul
      // 03f: fadd
      // 040: fstore 11
      // 042: new oxxxde/طآ
      // 045: dup
      // 046: fload 10
      // 048: fload 11
      // 04a: aload 8
      // 04c: invokevirtual oxxxde/تذ.getWidth ()F
      // 04f: aload 8
      // 051: invokevirtual oxxxde/تذ.getHeight ()F
      // 054: invokespecial oxxxde/طآ.<init> (FFFF)V
      // 057: astore 12
      // 059: aload 0
      // 05a: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 05d: invokevirtual oxxxde/طغ.getPANEL_COLOR ()Ljava/awt/Color;
      // 060: fload 7
      // 062: invokespecial oxxxde/حز.hudAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 065: astore 13
      // 067: aload 0
      // 068: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 06b: invokevirtual oxxxde/طغ.getHEADER_COLOR ()Ljava/awt/Color;
      // 06e: fload 7
      // 070: invokespecial oxxxde/حز.hudAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 073: astore 14
      // 075: aload 0
      // 076: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 079: invokevirtual oxxxde/طغ.getTITLE_COLOR ()Ljava/awt/Color;
      // 07c: fload 7
      // 07e: invokespecial oxxxde/حز.hudAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 081: astore 15
      // 083: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 086: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 089: aload 0
      // 08a: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 08d: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 090: aload 13
      // 092: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 095: ldc_w 0.9
      // 098: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 09b: aload 8
      // 09d: invokevirtual oxxxde/تذ.getCornerRadius ()F
      // 0a0: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 0a3: fload 10
      // 0a5: fload 11
      // 0a7: aload 8
      // 0a9: invokevirtual oxxxde/تذ.getWidth ()F
      // 0ac: aload 8
      // 0ae: invokevirtual oxxxde/تذ.getHeight ()F
      // 0b1: invokevirtual oxxxde/جء.draw (FFFF)V
      // 0b4: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0b7: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 0ba: aload 0
      // 0bb: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 0be: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 0c1: aload 14
      // 0c3: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 0c6: ldc_w 0.9
      // 0c9: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 0cc: new org/joml/Vector4f
      // 0cf: dup
      // 0d0: aload 8
      // 0d2: invokevirtual oxxxde/تذ.getHeaderCornerRadius ()F
      // 0d5: aload 8
      // 0d7: invokevirtual oxxxde/تذ.getHeaderCornerRadius ()F
      // 0da: fconst_0
      // 0db: fconst_0
      // 0dc: invokespecial org/joml/Vector4f.<init> (FFFF)V
      // 0df: invokevirtual oxxxde/جء.round (Lorg/joml/Vector4f;)Loxxxde/جء;
      // 0e2: fload 10
      // 0e4: fload 11
      // 0e6: aload 8
      // 0e8: invokevirtual oxxxde/تذ.getWidth ()F
      // 0eb: aload 8
      // 0ed: invokevirtual oxxxde/تذ.getHeaderHeight ()F
      // 0f0: invokevirtual oxxxde/جء.draw (FFFF)V
      // 0f3: aload 8
      // 0f5: invokevirtual oxxxde/تذ.getHeaderTextSize ()F
      // 0f8: aload 8
      // 0fa: ldc_w 1.5
      // 0fd: invokevirtual oxxxde/تذ.scaled (F)F
      // 100: fsub
      // 101: fstore 16
      // 103: fload 11
      // 105: aload 8
      // 107: invokevirtual oxxxde/تذ.getHeaderHeight ()F
      // 10a: fload 16
      // 10c: fsub
      // 10d: fconst_2
      // 10e: fdiv
      // 10f: fadd
      // 110: fstore 17
      // 112: aload 0
      // 113: aload 8
      // 115: invokespecial oxxxde/حز.avatarPopupContentInset (Loxxxde/تذ;)F
      // 118: fstore 18
      // 11a: aload 0
      // 11b: aload 12
      // 11d: aload 8
      // 11f: invokespecial oxxxde/حز.avatarPopupCloseBounds (Loxxxde/طآ;Loxxxde/تذ;)Loxxxde/طآ;
      // 122: astore 19
      // 124: aload 19
      // 126: iload 4
      // 128: i2f
      // 129: iload 5
      // 12b: i2f
      // 12c: invokevirtual oxxxde/طآ.contains (FF)Z
      // 12f: istore 20
      // 131: getstatic oxxxde/حز.avatarPopupCloseHoverAnimation Loxxxde/ري;
      // 134: iload 20
      // 136: ifeq 13d
      // 139: fconst_1
      // 13a: goto 13e
      // 13d: fconst_0
      // 13e: ldc_w 180.0
      // 141: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 144: astore 22
      // 146: new oxxxde/رد
      // 149: dup
      // 14a: aload 22
      // 14c: invokespecial oxxxde/رد.<init> (Loxxxde/بف;)V
      // 14f: checkcast oxxxde/شل
      // 152: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 155: fconst_0
      // 156: fconst_1
      // 157: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 15a: fstore 21
      // 15c: aload 8
      // 15e: ldc_w 6.2
      // 161: invokevirtual oxxxde/تذ.scaled (F)F
      // 164: fstore 22
      // 166: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 169: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 16c: fload 7
      // 16e: ldc_w 0.28
      // 171: ldc_w 0.18
      // 174: fload 21
      // 176: fmul
      // 177: fadd
      // 178: fmul
      // 179: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 17c: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 17f: fload 7
      // 181: ldc_w 0.35
      // 184: ldc_w 0.35
      // 187: fload 21
      // 189: fmul
      // 18a: fadd
      // 18b: fmul
      // 18c: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 18f: fload 21
      // 191: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 194: astore 23
      // 196: aload 8
      // 198: ldc_w 13.0
      // 19b: invokevirtual oxxxde/تذ.scaled (F)F
      // 19e: fstore 24
      // 1a0: aload 8
      // 1a2: invokevirtual oxxxde/تذ.getHeaderHeight ()F
      // 1a5: fload 24
      // 1a7: fsub
      // 1a8: ldc_w 0.5
      // 1ab: fmul
      // 1ac: aload 8
      // 1ae: invokevirtual oxxxde/تذ.getMargin ()F
      // 1b1: ldc_w 0.75
      // 1b4: fmul
      // 1b5: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 1b8: fstore 25
      // 1ba: fload 10
      // 1bc: fload 25
      // 1be: fadd
      // 1bf: fstore 26
      // 1c1: fload 11
      // 1c3: fload 25
      // 1c5: fadd
      // 1c6: fstore 27
      // 1c8: aload 19
      // 1ca: invokevirtual oxxxde/طآ.getX ()F
      // 1cd: aload 19
      // 1cf: invokevirtual oxxxde/طآ.getWidth ()F
      // 1d2: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1d5: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 1d8: ldc_w "i"
      // 1db: fload 22
      // 1dd: fconst_0
      // 1de: bipush 4
      // 1df: aconst_null
      // 1e0: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 1e3: fsub
      // 1e4: ldc_w 0.5
      // 1e7: fmul
      // 1e8: fadd
      // 1e9: fstore 28
      // 1eb: aload 19
      // 1ed: invokevirtual oxxxde/طآ.getY ()F
      // 1f0: aload 19
      // 1f2: invokevirtual oxxxde/طآ.getHeight ()F
      // 1f5: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1f8: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 1fb: fload 22
      // 1fd: invokevirtual oxxxde/جً.getHeight (F)F
      // 200: fsub
      // 201: ldc_w 0.5
      // 204: fmul
      // 205: fadd
      // 206: aload 8
      // 208: ldc_w 0.2
      // 20b: invokevirtual oxxxde/تذ.scaled (F)F
      // 20e: fsub
      // 20f: fstore 29
      // 211: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 214: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 217: aload 0
      // 218: invokevirtual oxxxde/حز.iconsPipeline ()Loxxxde/صؤ;
      // 21b: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 21e: fload 22
      // 220: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 223: aload 23
      // 225: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 228: ldc_w "i"
      // 22b: fload 28
      // 22d: fload 29
      // 22f: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 232: getstatic oxxxde/شس.INSTANCE Loxxxde/شس;
      // 235: ldc_w "interface_avatar"
      // 238: invokevirtual oxxxde/شس.get (Ljava/lang/String;)Loxxxde/ض;
      // 23b: dup
      // 23c: ifnull 283
      // 23f: astore 32
      // 241: bipush 0
      // 242: istore 33
      // 244: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 247: invokevirtual oxxxde/ذر.getTEXTURE_RECT ()Loxxxde/جث;
      // 24a: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 24d: invokevirtual oxxxde/حز.iconsPipeline ()Loxxxde/صؤ;
      // 250: invokevirtual oxxxde/جث.priority (Loxxxde/صؤ;)Loxxxde/جث;
      // 253: aload 32
      // 255: invokevirtual oxxxde/ض.getTexId ()I
      // 258: invokevirtual oxxxde/جث.texture (I)Loxxxde/جث;
      // 25b: fload 26
      // 25d: fload 27
      // 25f: fload 24
      // 261: fload 24
      // 263: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 266: dup
      // 267: ldc_w "WHITE"
      // 26a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 26d: fload 24
      // 26f: ldc_w 0.5
      // 272: fmul
      // 273: fconst_0
      // 274: fconst_0
      // 275: fconst_1
      // 276: fconst_1
      // 277: ldc_w -1.0
      // 27a: fload 7
      // 27c: invokevirtual oxxxde/جث.draw (FFFFLjava/awt/Color;FFFFFFF)V
      // 27f: nop
      // 280: goto 285
      // 283: pop
      // 284: nop
      // 285: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 288: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 28b: aload 0
      // 28c: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 28f: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 292: fload 16
      // 294: invokevirtual oxxxde/جً.size (F)Loxxxde/جً;
      // 297: aload 15
      // 299: invokevirtual oxxxde/جً.color (Ljava/awt/Color;)Loxxxde/جً;
      // 29c: invokestatic oxxxde/رغ.getUsername ()Ljava/lang/String;
      // 29f: dup
      // 2a0: ldc_w "getUsername(...)"
      // 2a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2a6: fload 26
      // 2a8: fload 24
      // 2aa: fadd
      // 2ab: aload 8
      // 2ad: ldc_w 3.0
      // 2b0: invokevirtual oxxxde/تذ.scaled (F)F
      // 2b3: fadd
      // 2b4: fload 17
      // 2b6: aload 8
      // 2b8: invokevirtual oxxxde/تذ.getMargin ()F
      // 2bb: ldc_w 6.0
      // 2be: fdiv
      // 2bf: fsub
      // 2c0: invokevirtual oxxxde/جً.drawText (Ljava/lang/String;FF)V
      // 2c3: fload 11
      // 2c5: aload 8
      // 2c7: invokevirtual oxxxde/تذ.getHeaderHeight ()F
      // 2ca: fadd
      // 2cb: aload 8
      // 2cd: invokevirtual oxxxde/تذ.getMargin ()F
      // 2d0: ldc_w 0.75
      // 2d3: fmul
      // 2d4: fadd
      // 2d5: fstore 30
      // 2d7: bipush 5
      // 2d8: istore 31
      // 2da: bipush 0
      // 2db: istore 32
      // 2dd: iload 32
      // 2df: iload 31
      // 2e1: if_icmpge 3b3
      // 2e4: iload 32
      // 2e6: istore 33
      // 2e8: bipush 0
      // 2e9: istore 34
      // 2eb: fload 10
      // 2ed: fload 18
      // 2ef: fadd
      // 2f0: fstore 35
      // 2f2: fload 30
      // 2f4: iload 33
      // 2f6: i2f
      // 2f7: aload 8
      // 2f9: invokevirtual oxxxde/تذ.getSettingHeight ()F
      // 2fc: aload 8
      // 2fe: invokevirtual oxxxde/تذ.getSettingGap ()F
      // 301: fadd
      // 302: fmul
      // 303: fadd
      // 304: fstore 36
      // 306: aload 8
      // 308: invokevirtual oxxxde/تذ.getWidth ()F
      // 30b: fload 18
      // 30d: fconst_2
      // 30e: fmul
      // 30f: fsub
      // 310: fstore 37
      // 312: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 315: fload 35
      // 317: fload 36
      // 319: fload 37
      // 31b: aload 8
      // 31d: fload 7
      // 31f: invokespecial oxxxde/حز.renderAvatarPopupSettingBackground (FFFLoxxxde/تذ;F)V
      // 322: iload 33
      // 324: tableswitch 136 0 4 36 59 82 101 120
      // 348: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 34b: fload 35
      // 34d: fload 36
      // 34f: fload 37
      // 351: aload 8
      // 353: fload 7
      // 355: iload 4
      // 357: iload 5
      // 359: invokespecial oxxxde/حز.renderAvatarPopupGuiScaleSetting (FFFLoxxxde/تذ;FII)V
      // 35c: goto 3ac
      // 35f: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 362: fload 35
      // 364: fload 36
      // 366: fload 37
      // 368: aload 8
      // 36a: fload 7
      // 36c: iload 4
      // 36e: iload 5
      // 370: invokespecial oxxxde/حز.renderAvatarPopupHudScaleSetting (FFFLoxxxde/تذ;FII)V
      // 373: goto 3ac
      // 376: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 379: fload 35
      // 37b: fload 36
      // 37d: fload 37
      // 37f: aload 8
      // 381: fload 7
      // 383: invokespecial oxxxde/حز.renderAvatarPopupGuiBackgroundSetting (FFFLoxxxde/تذ;F)V
      // 386: goto 3ac
      // 389: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 38c: fload 35
      // 38e: fload 36
      // 390: fload 37
      // 392: aload 8
      // 394: fload 7
      // 396: invokespecial oxxxde/حز.renderAvatarPopupSocialsSetting (FFFLoxxxde/تذ;F)V
      // 399: goto 3ac
      // 39c: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 39f: fload 35
      // 3a1: fload 36
      // 3a3: fload 37
      // 3a5: aload 8
      // 3a7: fload 7
      // 3a9: invokespecial oxxxde/حز.renderAvatarPopupInfoSetting (FFFLoxxxde/تذ;F)V
      // 3ac: nop
      // 3ad: iinc 32 1
      // 3b0: goto 2dd
      // 3b3: aload 0
      // 3b4: fload 10
      // 3b6: fload 18
      // 3b8: fadd
      // 3b9: fload 10
      // 3bb: aload 8
      // 3bd: invokevirtual oxxxde/تذ.getWidth ()F
      // 3c0: fadd
      // 3c1: fload 18
      // 3c3: fsub
      // 3c4: fload 30
      // 3c6: aload 8
      // 3c8: invokevirtual oxxxde/تذ.settingsBlockHeight ()F
      // 3cb: fadd
      // 3cc: aload 8
      // 3ce: invokevirtual oxxxde/تذ.getMargin ()F
      // 3d1: ldc_w 0.4
      // 3d4: fmul
      // 3d5: fadd
      // 3d6: aload 8
      // 3d8: fload 7
      // 3da: invokespecial oxxxde/حز.renderAvatarPopupRows (FFFLoxxxde/تذ;F)V
      // 3dd: return
   }

   private fun updateModuleSearchText(value: String) {
      if (!(value == moduleSearchText)) {
         moduleSearchText = value
         topBarTextSelected = false

         for (`element$iv` in categoryComponents.values()) {
            (`element$iv` as جر).setSearchQuery(moduleSearchText)
         }

         pointsCategoryComponent.setSearchQuery(moduleSearchText)
         friendsCategoryComponent.setSearchQuery(moduleSearchText)
         eventsCategoryComponent.setSearchQuery(moduleSearchText)
      }
   }

   private fun closeConfigShareModal() {
      val var1: Int = configShareRequestId++
      configShareSubmitting = false
      configShareCheckingExisting = false
      configShareManagingExisting = false
      configShareManagedConfigId = null
      configShareModalOpen = false
      configShareFocusedField = null
   }

   private fun configShareInputRowBounds(modal: طآ): طآ {
      val divider: طآ = this.configShareDividerBounds(modal)
      return طآ(modal.x + 7.0F, divider.y + divider.height + 5.0F, modal.width - 14.0F, 19.0F)
   }

   private fun configShareModalBounds(modalHeight: Float = configShareRenderedModalHeight): طآ {
      return طآ(
         ضك.getMc().getWindow().getScaledWidth() * 0.5F - 77.5F, ضك.getMc().getWindow().getScaledHeight() * 0.5F - modalHeight * 0.5F, 155.0F, modalHeight
      )
   }

   private fun handleEventServerConfirmKey(button: Int) {
      when (button) {
         256 -> this.closeEventServerConfirm()
         257, 335 -> this.confirmEventServerJoin()
         else -> {}
      }
   }

   public override fun onMouseScroll(mouseX: Int, mouseY: Int, vertical: Float) {
      super.onMouseScroll(mouseX, mouseY, vertical)
      if (!closing && !configShareModalOpen && !eventServerConfirmOpen) {
         val scale: Float = currentScale$default(this, 0.0F, 1, null)
         val transformedMouseX: Int = this.unscaleMouseX(mouseX, scale)
         val transformedMouseY: Int = this.unscaleMouseY(mouseY, scale)
         if (!(categoryContentAlpha <= 0.5F)) {
            val currentCategory: ظص = categoryTransition.current
            val configMode: Boolean = this.isConfigCategory(currentCategory)
            val pointsMode: Boolean = this.isPointsCategory(currentCategory)
            val friendsMode: Boolean = this.isFriendsCategory(currentCategory)
            val eventsMode: Boolean = this.isEventsCategory(currentCategory)
            val state: خف = scrollBarState
            val mouseXF: Float = transformedMouseX
            val mouseYF: Float = transformedMouseY
            if (configMode) {
               if (scrollBarState != null && scrollBarState.contains(mouseXF, mouseYF)) {
                  configsCategoryComponent.scrollWheel(vertical)
               } else {
                  configsCategoryComponent.onMouseScroll(transformedMouseX, transformedMouseY, vertical)
               }
            } else if (pointsMode) {
               if (scrollBarState != null && scrollBarState.contains(mouseXF, mouseYF)) {
                  pointsCategoryComponent.scrollWheel(vertical)
               } else {
                  pointsCategoryComponent.onMouseScroll(transformedMouseX, transformedMouseY, vertical)
               }
            } else if (friendsMode) {
               if (scrollBarState != null && scrollBarState.contains(mouseXF, mouseYF)) {
                  friendsCategoryComponent.scrollWheel(vertical)
               } else {
                  friendsCategoryComponent.onMouseScroll(transformedMouseX, transformedMouseY, vertical)
               }
            } else if (eventsMode) {
               if (scrollBarState != null && scrollBarState.contains(mouseXF, mouseYF)) {
                  eventsCategoryComponent.scrollWheel(vertical)
               } else {
                  eventsCategoryComponent.onMouseScroll(transformedMouseX, transformedMouseY, vertical)
               }
            } else if (currentCategory != null) {
               val var10000: جر = categoryComponents.get(currentCategory)
               if (var10000 != null) {
                  if (state != null && state.contains(mouseXF, mouseYF)) {
                     var10000.scrollWheel(vertical)
                  } else {
                     var10000.onMouseScroll(transformedMouseX, transformedMouseY, vertical)
                  }
               }
            }
         }
      }
   }

   private fun configShareInfinityButtonBounds(modal: طآ, infinityProgress: Float = configShareInfinityProgress): طآ {
      val row: طآ = this.configShareInputRowBounds(modal)
      val input: طآ = this.configShareActivationsInputBounds(modal)
      val expandProgress: Float = RangesKt.coerceIn(infinityProgress, 0.0F, 1.0F)
      val compactX: Float = input.x + input.width + 5.0F
      return طآ(compactX + (row.x - compactX) * expandProgress, row.y, 19.0F + (row.width - 19.0F) * expandProgress, 19.0F)
   }

   private fun isAllowedConfigCreateChar(char: Char): Boolean {
      return char >= ' ' && !StringsKt.contains$default("\\/:*?\"<>|", char, false, 2, null)
   }

   private fun configShareGeneratedKeyBounds(modal: طآ, index: Int): طآ {
      val divider: طآ = this.configShareDividerBounds(modal)
      return طآ(modal.x + 7.0F, divider.y + divider.height + 5.0F + index * 15.0F, modal.width - 14.0F, 13.0F)
   }

   private fun renderConfigShareInput(
      bounds: طآ,
      value: String,
      placeholder: String,
      focused: Boolean,
      alpha: Float,
      focusProgress: Float,
      enabledProgress: Float
   ) {
      val textX: Float = bounds.x + 5.0F
      val textY: Float = bounds.y + (bounds.height - 6.3F) * 0.46F
      val renderedText: java.lang.String = if (value.length() > 0)
         this.trimConfigKeyToWidth(value, RangesKt.coerceAtLeast(bounds.width - 10.0F, 0.0F), 6.3F)
         else
         (if (focused) "" else placeholder)
         val textColor: Color = if (value.length() > 0)
         ثْ.INSTANCE.title(0.8F * alpha * (0.55F + 0.45F * enabledProgress))
         else
         ثْ.INSTANCE.value(0.48F * alpha * (0.55F + 0.45F * enabledProgress))
         ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(this.textPipeline())
         .color(ثْ.INSTANCE.surface((0.025F + 0.025F * focusProgress) * alpha))
         .mix(0.95F)
         .round(3.5F)
         .border(1.0F, ثْ.INSTANCE.title((0.07F + 0.06F * focusProgress) * alpha))
         .draw(bounds.x, bounds.y, bounds.width, bounds.height)
         جً.drawText$default(
         رَ.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), renderedText, textX, textY, 6.3F, textColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null
      )
      if (focused && configShareModalOpen && System.currentTimeMillis() / 450L % 2L == 0L) {
         جً.drawText$default(
            رَ.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()),
            "|",
            textX + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), renderedText, 6.3F, 0.0F, 4, null) + 0.8F,
            textY,
            6.3F,
            ثْ.INSTANCE.title(0.88F * alpha),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
      }
   }

   public override fun init() {
      ثظ.INSTANCE.onMenuOpened()
      closing = false
      configKeyPopupOpen = false
      configKeyInputFocused = false
      configKeyText = ""
      configKeyTextSelected = false
      configKeySubmitting = false
      configKeyStatusText = null
      var var1: Int = configKeyRequestId++
      configKeyRenderedPopupHeight = 77.0F
      configCreatePopupOpen = false
      configCreateCloudSaveMode = false
      configCloudSaveExistingMode = false
      configCloudSaveSubmitting = false
      configCreateUnloadPrompt = false
      configCreateInputFocused = false
      configCreateText = ""
      configCreateTextSelected = false
      configCreateStatusText = null
      configCreateRenderedPopupHeight = 77.0F
      configShareModalOpen = false
      configShareConfigName = null
      configShareFocusedField = null
      configShareActivationsText = ""
      configShareGeneratedKeys = CollectionsKt.emptyList()
      configShareInfiniteActivations = false
      configShareRenderedModalHeight = 76.0F
      configShareInfinityProgress = 0.0F
      configShareCopiedAtMs = 0L
      configShareSubmitting = false
      configShareCheckingExisting = false
      configShareErrorText = null
      configShareManagingExisting = false
      configShareManagedConfigId = null
      var1 = configShareRequestId++
      eventServerConfirmOpen = false
      eventServerConfirmAnarchy = null
      avatarPopupOpen = false
      draggingAvatarPopupGuiScale = false
      avatarPopupGuiScaleDragProgress = null
      draggingAvatarPopupHudScale = false
      avatarPopupHudScaleDragProgress = null
      ري.animate$default(openAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configKeyPopupAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configKeyPopupHeightAnimation, 77.0F, 0.0F, null, 4, null)
      ري.animate$default(configKeyUploadAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configKeyInputFocusAnimation, 0.0F, 0.0F, null, 4, null)
      configKeyStatusTransition.reset()
      ري.animate$default(configKeyUploadHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configKeyCancelHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configCreatePopupAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configCreatePopupHeightAnimation, 77.0F, 0.0F, null, 4, null)
      ري.animate$default(configCreateButtonAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configCreateInputFocusAnimation, 0.0F, 0.0F, null, 4, null)
      configCreateStatusTransition.reset()
      ري.animate$default(configCreateConfirmHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configCreateCancelHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareModalAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareModalHeightAnimation, 76.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareResultsAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareInfinityAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareActivationsFocusAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareCopyFeedbackAnimation, 0.0F, 0.0F, null, 4, null)
      configShareButtonTextTransition.reset()
      configShareTitleTransition.reset()
      ري.animate$default(configShareLoadingAnimation, 0.0F, 0.0F, null, 4, null)
      configShareKeyListAnimations.clear()
      ري.animate$default(configShareInfinityHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareCreateHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareCopyHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(configShareMoreHoverAnimation, 0.0F, 0.0F, null, 4, null)
      configShareRevokeHoverAnimations.clear()
      ري.animate$default(eventServerConfirmAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(eventServerConfirmAcceptHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(eventServerConfirmCancelHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(avatarPopupAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(avatarHoverAnimation, 0.0F, 0.0F, null, 4, null)
      ري.animate$default(avatarPopupCloseHoverAnimation, 0.0F, 0.0F, null, 4, null)
   }

   private fun renderConfigShareInfinityButton(bounds: طآ, alpha: Float, modeProgress: Float, infinityProgress: Float, hoverProgress: Float) {
      if (!(bounds.width <= 0.01F) && !(modeProgress <= 0.001F)) {
         val visibleAlpha: Float = alpha * modeProgress
         ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(this.textPipeline())
            .color(ثْ.INSTANCE.surface((0.025F + 0.025F * hoverProgress) * (alpha * modeProgress)))
            .mix(0.95F)
            .round(3.5F)
            .border(1.0F, ثْ.INSTANCE.title((0.07F + 0.05F * hoverProgress) * (alpha * modeProgress)))
            .draw(bounds.x, bounds.y, bounds.width, bounds.height)
            if (infinityProgress > 0.001F) {
            val iconSize: Int = RangesKt.coerceIn(MathKt.roundToInt(255.0F * visibleAlpha * infinityProgress), 0, 255)
            val inactiveIcon: Int = RangesKt.coerceIn(MathKt.roundToInt(255.0F - 10.0F * hoverProgress), 0, 255)
            ذر.INSTANCE
               .getBASIC_RECT()
               .priority(this.textPipeline())
               .color(Color(inactiveIcon, inactiveIcon, inactiveIcon, iconSize))
               .round(3.5F)
               .border(1.0F, Color(inactiveIcon, inactiveIcon, inactiveIcon, iconSize))
               .draw(bounds.x, bounds.y, bounds.width, bounds.height)
            }

         جً.drawCenteredText$default(
            رَ.INSTANCE.getICON2().priority(this.textPipeline()),
            "5",
            bounds.x + bounds.width * 0.5F,
            bounds.y + (bounds.height - رَ.INSTANCE.getICON2().getHeight(6.5F)) * 0.5F,
            6.5F,
            بح.INSTANCE
               .interpolateColor(
                  ثْ.INSTANCE.title(0.72F * visibleAlpha),
                  Color(0, 0, 0, RangesKt.coerceIn(MathKt.roundToInt(255.0F * visibleAlpha), 0, 255)),
                  infinityProgress
               ),
            0.0F,
            32,
            null
         )
      }
   }

   private fun avatarPopupContentInset(metrics: تذ): Float {
      return metrics.margin * 1.2F
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
      // 005: invokespecial oxxxde/جع.render (IIF)V
      // 008: aload 0
      // 009: invokespecial oxxxde/حز.openProgress ()F
      // 00c: fstore 4
      // 00e: getstatic oxxxde/حز.closing Z
      // 011: ifne 028
      // 014: getstatic oxxxde/حز.categoryTransition Loxxxde/تس;
      // 017: invokevirtual oxxxde/تس.getCurrent ()Ljava/lang/Object;
      // 01a: invokestatic oxxxde/ظن.getMODELS ()Loxxxde/ظص;
      // 01d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 020: ifeq 028
      // 023: bipush 1
      // 024: nop
      // 025: goto 02a
      // 028: bipush 0
      // 029: nop
      // 02a: putstatic oxxxde/حز.modelPreviewRenderingEnabled Z
      // 02d: aload 0
      // 02e: fload 4
      // 030: invokespecial oxxxde/حز.currentScale (F)F
      // 033: fstore 5
      // 035: fload 5
      // 037: putstatic oxxxde/حز.lastRenderedScale F
      // 03a: aload 0
      // 03b: iload 1
      // 03c: fload 5
      // 03e: invokespecial oxxxde/حز.unscaleMouseX (IF)I
      // 041: istore 6
      // 043: aload 0
      // 044: iload 2
      // 045: nop
      // 046: fload 5
      // 048: invokespecial oxxxde/حز.unscaleMouseY (IF)I
      // 04b: istore 7
      // 04d: getstatic oxxxde/حز.categoryTransition Loxxxde/تس;
      // 050: invokevirtual oxxxde/تس.getCurrent ()Ljava/lang/Object;
      // 053: checkcast oxxxde/ظص
      // 056: astore 8
      // 058: aload 0
      // 059: aload 8
      // 05b: invokespecial oxxxde/حز.isConfigCategory (Loxxxde/ظص;)Z
      // 05e: istore 9
      // 060: iload 9
      // 062: ifeq 073
      // 065: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 068: invokevirtual oxxxde/ضز.isCloudPage ()Z
      // 06b: ifeq 073
      // 06e: bipush 1
      // 06f: nop
      // 070: goto 075
      // 073: bipush 0
      // 074: nop
      // 075: istore 10
      // 077: aload 0
      // 078: aload 8
      // 07a: invokespecial oxxxde/حز.isPointsCategory (Loxxxde/ظص;)Z
      // 07d: istore 11
      // 07f: aload 0
      // 080: aload 8
      // 082: invokespecial oxxxde/حز.isFriendsCategory (Loxxxde/ظص;)Z
      // 085: istore 12
      // 087: aload 0
      // 088: aload 8
      // 08a: invokespecial oxxxde/حز.isEventsCategory (Loxxxde/ظص;)Z
      // 08d: istore 13
      // 08f: getstatic oxxxde/حز.components Ljava/util/List;
      // 092: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
      // 095: checkcast oxxxde/ام
      // 098: dup
      // 099: ifnull 0a2
      // 09c: invokevirtual oxxxde/ام.getPadding ()F
      // 09f: goto 0a6
      // 0a2: pop
      // 0a3: getstatic oxxxde/حز.uiPadding F
      // 0a6: fstore 14
      // 0a8: new oxxxde/زْ
      // 0ab: dup
      // 0ac: aload 0
      // 0ad: invokevirtual oxxxde/حز.getX ()F
      // 0b0: aload 0
      // 0b1: invokevirtual oxxxde/حز.getY ()F
      // 0b4: aload 0
      // 0b5: invokevirtual oxxxde/حز.getWidth ()F
      // 0b8: aload 0
      // 0b9: invokevirtual oxxxde/حز.getHeight ()F
      // 0bc: aload 0
      // 0bd: invokevirtual oxxxde/حز.getPanelWidth ()F
      // 0c0: getstatic oxxxde/حز.uiPadding F
      // 0c3: getstatic oxxxde/حز.topBarHeight F
      // 0c6: fload 14
      // 0c8: getstatic oxxxde/حز.components Ljava/util/List;
      // 0cb: invokeinterface java/util/List.size ()I 1
      // 0d0: iload 9
      // 0d2: iload 11
      // 0d4: iload 10
      // 0d6: invokespecial oxxxde/زْ.<init> (FFFFFFFFIZZZ)V
      // 0d9: astore 15
      // 0db: getstatic oxxxde/حز.closing Z
      // 0de: ifne 0f8
      // 0e1: aload 0
      // 0e2: aload 15
      // 0e4: invokespecial oxxxde/حز.avatarBounds (Loxxxde/زْ;)Loxxxde/طآ;
      // 0e7: iload 6
      // 0e9: i2f
      // 0ea: iload 7
      // 0ec: i2f
      // 0ed: invokevirtual oxxxde/طآ.contains (FF)Z
      // 0f0: ifeq 0f8
      // 0f3: bipush 1
      // 0f4: nop
      // 0f5: goto 0fa
      // 0f8: bipush 0
      // 0f9: nop
      // 0fa: istore 16
      // 0fc: getstatic oxxxde/حز.avatarHoverAnimation Loxxxde/ري;
      // 0ff: iload 16
      // 101: ifeq 109
      // 104: fconst_1
      // 105: nop
      // 106: goto 10b
      // 109: fconst_0
      // 10a: nop
      // 10b: ldc_w 180.0
      // 10e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 111: astore 18
      // 113: new oxxxde/ضً
      // 116: dup
      // 117: aload 18
      // 119: invokespecial oxxxde/ضً.<init> (Loxxxde/بف;)V
      // 11c: checkcast oxxxde/شل
      // 11f: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 122: fconst_0
      // 123: nop
      // 124: fconst_1
      // 125: nop
      // 126: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 129: fstore 17
      // 12b: getstatic oxxxde/حز.avatarPopupAnimation Loxxxde/ري;
      // 12e: getstatic oxxxde/حز.avatarPopupOpen Z
      // 131: ifeq 139
      // 134: fconst_1
      // 135: nop
      // 136: goto 13b
      // 139: fconst_0
      // 13a: nop
      // 13b: ldc_w 220.0
      // 13e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 141: astore 19
      // 143: new oxxxde/اط
      // 146: dup
      // 147: aload 19
      // 149: invokespecial oxxxde/اط.<init> (Loxxxde/بف;)V
      // 14c: checkcast oxxxde/شل
      // 14f: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 152: fconst_0
      // 153: nop
      // 154: fconst_1
      // 155: nop
      // 156: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 159: fstore 18
      // 15b: getstatic oxxxde/حز.avatarPopupGuiBackgroundAnimation Loxxxde/ري;
      // 15e: getstatic oxxxde/سر.INSTANCE Loxxxde/سر;
      // 161: invokevirtual oxxxde/سر.renderGuiBackground ()Z
      // 164: ifeq 16c
      // 167: fconst_1
      // 168: nop
      // 169: goto 16e
      // 16c: fconst_0
      // 16d: nop
      // 16e: ldc_w 220.0
      // 171: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 174: astore 19
      // 176: new oxxxde/دأ
      // 179: dup
      // 17a: aload 19
      // 17c: invokespecial oxxxde/دأ.<init> (Loxxxde/بف;)V
      // 17f: checkcast oxxxde/شل
      // 182: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 185: fconst_0
      // 186: nop
      // 187: fconst_1
      // 188: nop
      // 189: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 18c: putstatic oxxxde/حز.guiBackgroundProgress F
      // 18f: getstatic oxxxde/حز.categoryTransition Loxxxde/تس;
      // 192: invokevirtual oxxxde/تس.updateAndGetAlpha ()F
      // 195: putstatic oxxxde/حز.categoryContentAlpha F
      // 198: getstatic oxxxde/حز.categoryContentAlpha F
      // 19b: ldc_w 0.5
      // 19e: fcmpg
      // 19f: ifgt 1ac
      // 1a2: bipush 0
      // 1a3: nop
      // 1a4: putstatic oxxxde/حز.draggingScrollBar Z
      // 1a7: fconst_0
      // 1a8: nop
      // 1a9: putstatic oxxxde/حز.scrollBarGrabOffset F
      // 1ac: fconst_1
      // 1ad: nop
      // 1ae: getstatic oxxxde/حز.categoryContentAlpha F
      // 1b1: fsub
      // 1b2: getstatic oxxxde/حز.categoryShiftDistance F
      // 1b5: fmul
      // 1b6: fstore 19
      // 1b8: getstatic oxxxde/بد.INSTANCE Loxxxde/بد;
      // 1bb: invokevirtual oxxxde/بد.pushMatrix ()V
      // 1be: aload 0
      // 1bf: fload 4
      // 1c1: getstatic oxxxde/حز.guiBackgroundProgress F
      // 1c4: invokespecial oxxxde/حز.renderBackdrop (FF)V
      // 1c7: getstatic oxxxde/بد.INSTANCE Loxxxde/بد;
      // 1ca: aload 0
      // 1cb: invokevirtual oxxxde/حز.getX ()F
      // 1ce: aload 0
      // 1cf: invokevirtual oxxxde/حز.getWidth ()F
      // 1d2: ldc_w 0.5
      // 1d5: fmul
      // 1d6: fadd
      // 1d7: aload 0
      // 1d8: invokevirtual oxxxde/حز.getY ()F
      // 1db: aload 0
      // 1dc: invokevirtual oxxxde/حز.getHeight ()F
      // 1df: ldc_w 0.5
      // 1e2: fmul
      // 1e3: fadd
      // 1e4: fload 5
      // 1e6: invokevirtual oxxxde/بد.startScale (FFF)V
      // 1e9: getstatic oxxxde/حز.backgroundRenderer Loxxxde/جخ;
      // 1ec: aload 15
      // 1ee: fload 4
      // 1f0: fload 17
      // 1f2: fload 18
      // 1f4: invokevirtual oxxxde/جخ.render (Loxxxde/زْ;FFF)V
      // 1f7: getstatic oxxxde/حز.components Ljava/util/List;
      // 1fa: astore 21
      // 1fc: bipush 0
      // 1fd: nop
      // 1fe: istore 22
      // 200: bipush 0
      // 201: nop
      // 202: istore 23
      // 204: aload 21
      // 206: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 20b: astore 24
      // 20d: aload 24
      // 20f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 214: ifeq 243
      // 217: aload 24
      // 219: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21e: astore 25
      // 220: aload 25
      // 222: checkcast oxxxde/ام
      // 225: astore 26
      // 227: bipush 0
      // 228: nop
      // 229: istore 27
      // 22b: aload 26
      // 22d: invokevirtual oxxxde/ام.getCategory ()Loxxxde/ظص;
      // 230: aload 8
      // 232: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 235: ifeq 23d
      // 238: iload 23
      // 23a: goto 245
      // 23d: iinc 23 1
      // 240: goto 20d
      // 243: bipush -1
      // 244: nop
      // 245: istore 20
      // 247: iload 20
      // 249: iflt 300
      // 24c: getstatic oxxxde/حز.components Ljava/util/List;
      // 24f: iload 20
      // 251: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 256: checkcast oxxxde/ام
      // 259: astore 21
      // 25b: aload 15
      // 25d: iload 20
      // 25f: aload 21
      // 261: invokevirtual oxxxde/ام.getPadding ()F
      // 264: invokevirtual oxxxde/زْ.categorySlot (IF)Loxxxde/طس;
      // 267: astore 22
      // 269: getstatic oxxxde/حز.categoryIndicatorInitialized Z
      // 26c: ifne 28a
      // 26f: bipush 1
      // 270: nop
      // 271: putstatic oxxxde/حز.categoryIndicatorInitialized Z
      // 274: getstatic oxxxde/حز.categoryIndicatorYAnim Loxxxde/ري;
      // 277: aload 22
      // 279: invokevirtual oxxxde/طس.getY ()F
      // 27c: fconst_0
      // 27d: nop
      // 27e: aconst_null
      // 27f: nop
      // 280: bipush 4
      // 281: nop
      // 282: aconst_null
      // 283: nop
      // 284: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 287: goto 2a9
      // 28a: getstatic oxxxde/حز.categoryIndicatorYAnim Loxxxde/ري;
      // 28d: aload 22
      // 28f: invokevirtual oxxxde/طس.getY ()F
      // 292: ldc_w 250.0
      // 295: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 298: astore 24
      // 29a: new oxxxde/بن
      // 29d: dup
      // 29e: aload 24
      // 2a0: invokespecial oxxxde/بن.<init> (Loxxxde/بف;)V
      // 2a3: checkcast oxxxde/شل
      // 2a6: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 2a9: fstore 23
      // 2ab: aload 22
      // 2ad: invokevirtual oxxxde/طس.getSize ()F
      // 2b0: ldc_w 0.84
      // 2b3: fmul
      // 2b4: fstore 24
      // 2b6: aload 22
      // 2b8: invokevirtual oxxxde/طس.getSize ()F
      // 2bb: fload 24
      // 2bd: fsub
      // 2be: ldc_w 0.5
      // 2c1: fmul
      // 2c2: fstore 25
      // 2c4: fload 24
      // 2c6: ldc_w 0.25
      // 2c9: fmul
      // 2ca: fstore 26
      // 2cc: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 2cf: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 2d2: aload 0
      // 2d3: invokevirtual oxxxde/حز.rectPipeline ()Loxxxde/صؤ;
      // 2d6: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 2d9: fload 26
      // 2db: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 2de: aload 22
      // 2e0: invokevirtual oxxxde/طس.getX ()F
      // 2e3: ldc_w 0.75
      // 2e6: fadd
      // 2e7: fload 25
      // 2e9: fadd
      // 2ea: fload 23
      // 2ec: fload 25
      // 2ee: fadd
      // 2ef: fload 24
      // 2f1: fload 24
      // 2f3: fload 26
      // 2f5: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2f8: fload 4
      // 2fa: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 2fd: invokevirtual oxxxde/ضِ.draw (FFFFFLjava/awt/Color;)V
      // 300: getstatic oxxxde/حز.components Ljava/util/List;
      // 303: checkcast java/lang/Iterable
      // 306: astore 21
      // 308: bipush 0
      // 309: nop
      // 30a: istore 22
      // 30c: bipush 0
      // 30d: nop
      // 30e: istore 23
      // 310: aload 21
      // 312: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 317: astore 24
      // 319: aload 24
      // 31b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 320: ifeq 396
      // 323: aload 24
      // 325: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32a: astore 25
      // 32c: iload 23
      // 32e: iinc 23 1
      // 331: istore 26
      // 333: iload 26
      // 335: ifge 33b
      // 338: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 33b: iload 26
      // 33d: aload 25
      // 33f: checkcast oxxxde/ام
      // 342: astore 27
      // 344: istore 28
      // 346: bipush 0
      // 347: nop
      // 348: istore 29
      // 34a: aload 15
      // 34c: iload 28
      // 34e: aload 27
      // 350: invokevirtual oxxxde/ام.getPadding ()F
      // 353: invokevirtual oxxxde/زْ.categorySlot (IF)Loxxxde/طس;
      // 356: astore 30
      // 358: aload 27
      // 35a: fload 4
      // 35c: invokevirtual oxxxde/ام.setAlpha (F)V
      // 35f: aload 27
      // 361: aload 30
      // 363: invokevirtual oxxxde/طس.getX ()F
      // 366: invokevirtual oxxxde/ام.setX (F)V
      // 369: aload 27
      // 36b: aload 30
      // 36d: invokevirtual oxxxde/طس.getY ()F
      // 370: invokevirtual oxxxde/ام.setY (F)V
      // 373: aload 27
      // 375: aload 30
      // 377: invokevirtual oxxxde/طس.getSize ()F
      // 37a: invokevirtual oxxxde/ام.setWidth (F)V
      // 37d: aload 27
      // 37f: aload 30
      // 381: invokevirtual oxxxde/طس.getSize ()F
      // 384: invokevirtual oxxxde/ام.setHeight (F)V
      // 387: aload 27
      // 389: iload 6
      // 38b: iload 7
      // 38d: fload 3
      // 38e: invokevirtual oxxxde/ام.render (IIF)V
      // 391: nop
      // 392: nop
      // 393: goto 319
      // 396: nop
      // 397: aconst_null
      // 398: nop
      // 399: astore 21
      // 39b: bipush 0
      // 39c: nop
      // 39d: istore 22
      // 39f: bipush 0
      // 3a0: nop
      // 3a1: istore 23
      // 3a3: bipush 0
      // 3a4: nop
      // 3a5: istore 24
      // 3a7: bipush 0
      // 3a8: nop
      // 3a9: istore 25
      // 3ab: aload 8
      // 3ad: dup
      // 3ae: ifnull 60b
      // 3b1: astore 27
      // 3b3: bipush 0
      // 3b4: nop
      // 3b5: istore 28
      // 3b7: nop
      // 3b8: iload 9
      // 3ba: ifeq 42c
      // 3bd: getstatic oxxxde/حز.draggingScrollBar Z
      // 3c0: ifeq 3db
      // 3c3: getstatic oxxxde/حز.categoryContentAlpha F
      // 3c6: ldc_w 0.5
      // 3c9: fcmpl
      // 3ca: ifle 3db
      // 3cd: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 3d0: invokedynamic invoke ()Lkotlin/jvm/functions/Function2; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.render$lambda$2$0 (FZ)Lkotlin/Unit;, (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit; ]
      // 3d5: iload 7
      // 3d7: i2f
      // 3d8: invokespecial oxxxde/حز.applyScrollBarDrag (Lkotlin/jvm/functions/Function2;F)V
      // 3db: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 3de: getstatic oxxxde/حز.categoryContentAlpha F
      // 3e1: fload 4
      // 3e3: fmul
      // 3e4: invokevirtual oxxxde/ضز.setAlpha (F)V
      // 3e7: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 3ea: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 3ed: invokevirtual oxxxde/حز.getX ()F
      // 3f0: invokevirtual oxxxde/ضز.setX (F)V
      // 3f3: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 3f6: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 3f9: invokevirtual oxxxde/حز.getY ()F
      // 3fc: fload 19
      // 3fe: fadd
      // 3ff: invokevirtual oxxxde/ضز.setY (F)V
      // 402: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 405: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 408: invokevirtual oxxxde/حز.getWidth ()F
      // 40b: invokevirtual oxxxde/ضز.setWidth (F)V
      // 40e: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 411: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 414: invokevirtual oxxxde/حز.getHeight ()F
      // 417: invokevirtual oxxxde/ضز.setHeight (F)V
      // 41a: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 41d: iload 6
      // 41f: iload 7
      // 421: fload 3
      // 422: invokevirtual oxxxde/ضز.render (IIF)V
      // 425: bipush 1
      // 426: nop
      // 427: istore 22
      // 429: goto 607
      // 42c: iload 11
      // 42e: ifeq 4a0
      // 431: getstatic oxxxde/حز.draggingScrollBar Z
      // 434: ifeq 44f
      // 437: getstatic oxxxde/حز.categoryContentAlpha F
      // 43a: ldc_w 0.5
      // 43d: fcmpl
      // 43e: ifle 44f
      // 441: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 444: invokedynamic invoke ()Lkotlin/jvm/functions/Function2; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.render$lambda$2$1 (FZ)Lkotlin/Unit;, (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit; ]
      // 449: iload 7
      // 44b: i2f
      // 44c: invokespecial oxxxde/حز.applyScrollBarDrag (Lkotlin/jvm/functions/Function2;F)V
      // 44f: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 452: getstatic oxxxde/حز.categoryContentAlpha F
      // 455: fload 4
      // 457: fmul
      // 458: invokevirtual oxxxde/رِ.setAlpha (F)V
      // 45b: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 45e: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 461: invokevirtual oxxxde/حز.getX ()F
      // 464: invokevirtual oxxxde/رِ.setX (F)V
      // 467: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 46a: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 46d: invokevirtual oxxxde/حز.getY ()F
      // 470: fload 19
      // 472: fadd
      // 473: invokevirtual oxxxde/رِ.setY (F)V
      // 476: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 479: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 47c: invokevirtual oxxxde/حز.getWidth ()F
      // 47f: invokevirtual oxxxde/رِ.setWidth (F)V
      // 482: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 485: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 488: invokevirtual oxxxde/حز.getHeight ()F
      // 48b: invokevirtual oxxxde/رِ.setHeight (F)V
      // 48e: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 491: iload 6
      // 493: iload 7
      // 495: fload 3
      // 496: invokevirtual oxxxde/رِ.render (IIF)V
      // 499: bipush 1
      // 49a: nop
      // 49b: istore 23
      // 49d: goto 607
      // 4a0: iload 12
      // 4a2: ifeq 514
      // 4a5: getstatic oxxxde/حز.draggingScrollBar Z
      // 4a8: ifeq 4c3
      // 4ab: getstatic oxxxde/حز.categoryContentAlpha F
      // 4ae: ldc_w 0.5
      // 4b1: fcmpl
      // 4b2: ifle 4c3
      // 4b5: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 4b8: invokedynamic invoke ()Lkotlin/jvm/functions/Function2; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.render$lambda$2$2 (FZ)Lkotlin/Unit;, (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit; ]
      // 4bd: iload 7
      // 4bf: i2f
      // 4c0: invokespecial oxxxde/حز.applyScrollBarDrag (Lkotlin/jvm/functions/Function2;F)V
      // 4c3: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 4c6: getstatic oxxxde/حز.categoryContentAlpha F
      // 4c9: fload 4
      // 4cb: fmul
      // 4cc: invokevirtual oxxxde/طل.setAlpha (F)V
      // 4cf: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 4d2: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 4d5: invokevirtual oxxxde/حز.getX ()F
      // 4d8: invokevirtual oxxxde/طل.setX (F)V
      // 4db: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 4de: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 4e1: invokevirtual oxxxde/حز.getY ()F
      // 4e4: fload 19
      // 4e6: fadd
      // 4e7: invokevirtual oxxxde/طل.setY (F)V
      // 4ea: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 4ed: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 4f0: invokevirtual oxxxde/حز.getWidth ()F
      // 4f3: invokevirtual oxxxde/طل.setWidth (F)V
      // 4f6: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 4f9: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 4fc: invokevirtual oxxxde/حز.getHeight ()F
      // 4ff: invokevirtual oxxxde/طل.setHeight (F)V
      // 502: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 505: iload 6
      // 507: iload 7
      // 509: fload 3
      // 50a: invokevirtual oxxxde/طل.render (IIF)V
      // 50d: bipush 1
      // 50e: nop
      // 50f: istore 24
      // 511: goto 607
      // 514: iload 13
      // 516: ifeq 588
      // 519: getstatic oxxxde/حز.draggingScrollBar Z
      // 51c: ifeq 537
      // 51f: getstatic oxxxde/حز.categoryContentAlpha F
      // 522: ldc_w 0.5
      // 525: fcmpl
      // 526: ifle 537
      // 529: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 52c: invokedynamic invoke ()Lkotlin/jvm/functions/Function2; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.render$lambda$2$3 (FZ)Lkotlin/Unit;, (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit; ]
      // 531: iload 7
      // 533: i2f
      // 534: invokespecial oxxxde/حز.applyScrollBarDrag (Lkotlin/jvm/functions/Function2;F)V
      // 537: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 53a: getstatic oxxxde/حز.categoryContentAlpha F
      // 53d: fload 4
      // 53f: fmul
      // 540: invokevirtual oxxxde/طك.setAlpha (F)V
      // 543: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 546: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 549: invokevirtual oxxxde/حز.getX ()F
      // 54c: invokevirtual oxxxde/طك.setX (F)V
      // 54f: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 552: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 555: invokevirtual oxxxde/حز.getY ()F
      // 558: fload 19
      // 55a: fadd
      // 55b: invokevirtual oxxxde/طك.setY (F)V
      // 55e: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 561: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 564: invokevirtual oxxxde/حز.getWidth ()F
      // 567: invokevirtual oxxxde/طك.setWidth (F)V
      // 56a: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 56d: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 570: invokevirtual oxxxde/حز.getHeight ()F
      // 573: invokevirtual oxxxde/طك.setHeight (F)V
      // 576: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 579: iload 6
      // 57b: iload 7
      // 57d: fload 3
      // 57e: invokevirtual oxxxde/طك.render (IIF)V
      // 581: bipush 1
      // 582: nop
      // 583: istore 25
      // 585: goto 607
      // 588: getstatic oxxxde/حز.categoryComponents Ljava/util/Map;
      // 58b: aload 27
      // 58d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 592: checkcast oxxxde/جر
      // 595: dup
      // 596: ifnonnull 59d
      // 599: pop
      // 59a: goto 608
      // 59d: astore 29
      // 59f: getstatic oxxxde/حز.draggingScrollBar Z
      // 5a2: ifeq 5bf
      // 5a5: getstatic oxxxde/حز.categoryContentAlpha F
      // 5a8: ldc_w 0.5
      // 5ab: fcmpl
      // 5ac: ifle 5bf
      // 5af: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 5b2: aload 29
      // 5b4: invokedynamic invoke (Loxxxde/جر;)Lkotlin/jvm/functions/Function2; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.render$lambda$2$4 (Loxxxde/جر;FZ)Lkotlin/Unit;, (Ljava/lang/Float;Ljava/lang/Boolean;)Lkotlin/Unit; ]
      // 5b9: iload 7
      // 5bb: i2f
      // 5bc: invokespecial oxxxde/حز.applyScrollBarDrag (Lkotlin/jvm/functions/Function2;F)V
      // 5bf: aload 29
      // 5c1: getstatic oxxxde/حز.categoryContentAlpha F
      // 5c4: fload 4
      // 5c6: fmul
      // 5c7: invokevirtual oxxxde/جر.setAlpha (F)V
      // 5ca: aload 29
      // 5cc: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 5cf: invokevirtual oxxxde/حز.getX ()F
      // 5d2: invokevirtual oxxxde/جر.setX (F)V
      // 5d5: aload 29
      // 5d7: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 5da: invokevirtual oxxxde/حز.getY ()F
      // 5dd: fload 19
      // 5df: fadd
      // 5e0: invokevirtual oxxxde/جر.setY (F)V
      // 5e3: aload 29
      // 5e5: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 5e8: invokevirtual oxxxde/حز.getWidth ()F
      // 5eb: invokevirtual oxxxde/جر.setWidth (F)V
      // 5ee: aload 29
      // 5f0: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 5f3: invokevirtual oxxxde/حز.getHeight ()F
      // 5f6: invokevirtual oxxxde/جر.setHeight (F)V
      // 5f9: aload 29
      // 5fb: iload 6
      // 5fd: iload 7
      // 5ff: fload 3
      // 600: invokevirtual oxxxde/جر.render (IIF)V
      // 603: aload 29
      // 605: astore 21
      // 607: nop
      // 608: goto 60d
      // 60b: pop
      // 60c: nop
      // 60d: aload 0
      // 60e: aload 8
      // 610: invokespecial oxxxde/حز.currentTopBarCategory (Loxxxde/ظص;)Loxxxde/ظص;
      // 613: astore 26
      // 615: getstatic oxxxde/حز.topBarRenderer Loxxxde/طا;
      // 618: aload 15
      // 61a: aload 26
      // 61c: getstatic oxxxde/حز.moduleSearchText Ljava/lang/String;
      // 61f: getstatic oxxxde/حز.searchFocused Z
      // 622: getstatic oxxxde/حز.topBarTextSelected Z
      // 625: ifeq 645
      // 628: getstatic oxxxde/حز.moduleSearchText Ljava/lang/String;
      // 62b: checkcast java/lang/CharSequence
      // 62e: invokeinterface java/lang/CharSequence.length ()I 1
      // 633: ifle 63b
      // 636: bipush 1
      // 637: nop
      // 638: goto 63d
      // 63b: bipush 0
      // 63c: nop
      // 63d: ifeq 645
      // 640: bipush 1
      // 641: nop
      // 642: goto 647
      // 645: bipush 0
      // 646: nop
      // 647: fload 5
      // 649: iload 9
      // 64b: iload 10
      // 64d: iload 6
      // 64f: i2f
      // 650: iload 7
      // 652: i2f
      // 653: fload 4
      // 655: invokevirtual oxxxde/طا.render (Loxxxde/زْ;Loxxxde/ظص;Ljava/lang/String;ZZFZZFFF)V
      // 658: aload 0
      // 659: aload 15
      // 65b: iload 9
      // 65d: fload 4
      // 65f: iload 6
      // 661: i2f
      // 662: iload 7
      // 664: i2f
      // 665: invokespecial oxxxde/حز.renderConfigCreatePopup (Loxxxde/زْ;ZFFF)V
      // 668: aload 0
      // 669: aload 15
      // 66b: iload 9
      // 66d: ifeq 67a
      // 670: iload 10
      // 672: ifeq 67a
      // 675: bipush 1
      // 676: nop
      // 677: goto 67c
      // 67a: bipush 0
      // 67b: nop
      // 67c: fload 4
      // 67e: iload 6
      // 680: i2f
      // 681: iload 7
      // 683: i2f
      // 684: invokespecial oxxxde/حز.renderConfigKeyPopup (Loxxxde/زْ;ZFFF)V
      // 687: nop
      // 688: iload 23
      // 68a: ifeq 6b9
      // 68d: getstatic oxxxde/حز.scrollBarRenderer Loxxxde/جل;
      // 690: aload 15
      // 692: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 695: invokevirtual oxxxde/رِ.scrollContentHeight ()F
      // 698: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 69b: invokevirtual oxxxde/رِ.scrollViewHeight ()F
      // 69e: getstatic oxxxde/حز.pointsCategoryComponent Loxxxde/رِ;
      // 6a1: invokevirtual oxxxde/رِ.scrollOffsetValue ()F
      // 6a4: getstatic oxxxde/حز.categoryContentAlpha F
      // 6a7: fload 4
      // 6a9: fmul
      // 6aa: iload 6
      // 6ac: i2f
      // 6ad: iload 7
      // 6af: i2f
      // 6b0: getstatic oxxxde/حز.draggingScrollBar Z
      // 6b3: invokevirtual oxxxde/جل.render (Loxxxde/زْ;FFFFFFZ)Loxxxde/خف;
      // 6b6: goto 797
      // 6b9: iload 24
      // 6bb: ifeq 6ea
      // 6be: getstatic oxxxde/حز.scrollBarRenderer Loxxxde/جل;
      // 6c1: aload 15
      // 6c3: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 6c6: invokevirtual oxxxde/طل.scrollContentHeight ()F
      // 6c9: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 6cc: invokevirtual oxxxde/طل.scrollViewHeight ()F
      // 6cf: getstatic oxxxde/حز.friendsCategoryComponent Loxxxde/طل;
      // 6d2: invokevirtual oxxxde/طل.scrollOffsetValue ()F
      // 6d5: getstatic oxxxde/حز.categoryContentAlpha F
      // 6d8: fload 4
      // 6da: fmul
      // 6db: iload 6
      // 6dd: i2f
      // 6de: iload 7
      // 6e0: i2f
      // 6e1: getstatic oxxxde/حز.draggingScrollBar Z
      // 6e4: invokevirtual oxxxde/جل.render (Loxxxde/زْ;FFFFFFZ)Loxxxde/خف;
      // 6e7: goto 797
      // 6ea: iload 25
      // 6ec: ifeq 71b
      // 6ef: getstatic oxxxde/حز.scrollBarRenderer Loxxxde/جل;
      // 6f2: aload 15
      // 6f4: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 6f7: invokevirtual oxxxde/طك.scrollContentHeight ()F
      // 6fa: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 6fd: invokevirtual oxxxde/طك.scrollViewHeight ()F
      // 700: getstatic oxxxde/حز.eventsCategoryComponent Loxxxde/طك;
      // 703: invokevirtual oxxxde/طك.scrollOffsetValue ()F
      // 706: getstatic oxxxde/حز.categoryContentAlpha F
      // 709: fload 4
      // 70b: fmul
      // 70c: iload 6
      // 70e: i2f
      // 70f: iload 7
      // 711: i2f
      // 712: getstatic oxxxde/حز.draggingScrollBar Z
      // 715: invokevirtual oxxxde/جل.render (Loxxxde/زْ;FFFFFFZ)Loxxxde/خف;
      // 718: goto 797
      // 71b: iload 22
      // 71d: ifeq 74c
      // 720: getstatic oxxxde/حز.scrollBarRenderer Loxxxde/جل;
      // 723: aload 15
      // 725: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 728: invokevirtual oxxxde/ضز.scrollContentHeight ()F
      // 72b: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 72e: invokevirtual oxxxde/ضز.scrollViewHeight ()F
      // 731: getstatic oxxxde/حز.configsCategoryComponent Loxxxde/ضز;
      // 734: invokevirtual oxxxde/ضز.scrollOffsetValue ()F
      // 737: getstatic oxxxde/حز.categoryContentAlpha F
      // 73a: fload 4
      // 73c: fmul
      // 73d: iload 6
      // 73f: i2f
      // 740: iload 7
      // 742: i2f
      // 743: getstatic oxxxde/حز.draggingScrollBar Z
      // 746: invokevirtual oxxxde/جل.render (Loxxxde/زْ;FFFFFFZ)Loxxxde/خف;
      // 749: goto 797
      // 74c: aload 21
      // 74e: ifnull 77a
      // 751: getstatic oxxxde/حز.scrollBarRenderer Loxxxde/جل;
      // 754: aload 15
      // 756: aload 21
      // 758: invokevirtual oxxxde/جر.scrollContentHeight ()F
      // 75b: aload 21
      // 75d: invokevirtual oxxxde/جر.scrollViewHeight ()F
      // 760: aload 21
      // 762: invokevirtual oxxxde/جر.scrollOffsetValue ()F
      // 765: getstatic oxxxde/حز.categoryContentAlpha F
      // 768: fload 4
      // 76a: fmul
      // 76b: iload 6
      // 76d: i2f
      // 76e: iload 7
      // 770: i2f
      // 771: getstatic oxxxde/حز.draggingScrollBar Z
      // 774: invokevirtual oxxxde/جل.render (Loxxxde/زْ;FFFFFFZ)Loxxxde/خف;
      // 777: goto 797
      // 77a: getstatic oxxxde/حز.scrollBarRenderer Loxxxde/جل;
      // 77d: aload 15
      // 77f: fconst_0
      // 780: nop
      // 781: fconst_0
      // 782: nop
      // 783: fconst_0
      // 784: nop
      // 785: getstatic oxxxde/حز.categoryContentAlpha F
      // 788: fload 4
      // 78a: fmul
      // 78b: iload 6
      // 78d: i2f
      // 78e: iload 7
      // 790: i2f
      // 791: getstatic oxxxde/حز.draggingScrollBar Z
      // 794: invokevirtual oxxxde/جل.render (Loxxxde/زْ;FFFFFFZ)Loxxxde/خف;
      // 797: putstatic oxxxde/حز.scrollBarState Loxxxde/خف;
      // 79a: getstatic oxxxde/بد.INSTANCE Loxxxde/بد;
      // 79d: invokevirtual oxxxde/بد.popMatrix ()V
      // 7a0: aload 0
      // 7a1: aload 15
      // 7a3: fload 4
      // 7a5: fload 5
      // 7a7: iload 1
      // 7a8: iload 2
      // 7a9: nop
      // 7aa: fload 18
      // 7ac: invokespecial oxxxde/حز.renderAvatarPopup (Loxxxde/زْ;FFIIF)V
      // 7af: aload 0
      // 7b0: fload 4
      // 7b2: iload 1
      // 7b3: i2f
      // 7b4: iload 2
      // 7b5: nop
      // 7b6: i2f
      // 7b7: invokespecial oxxxde/حز.renderConfigShareModal (FFF)V
      // 7ba: aload 0
      // 7bb: fload 4
      // 7bd: iload 1
      // 7be: i2f
      // 7bf: iload 2
      // 7c0: nop
      // 7c1: i2f
      // 7c2: invokespecial oxxxde/حز.renderEventServerConfirm (FFF)V
      // 7c5: return
   }

   private fun deleteReceivedCloudConfig(configName: String, configId: String) {
      خه.INSTANCE.removeReceived(configId).whenComplete({ p0: Any, p1: Any ->
         `$tmp0`(p0, p1)
      })
   }

   private fun canSubmitConfigCreate(): Boolean {
      return !StringsKt.isBlank(configCreateText) && اك.INSTANCE.canCreate(configCreateText) && اك.INSTANCE.canCreateFromCurrent()
   }

   private fun hudAlpha(color: Color, factor: Float): Color {
      return بح.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0F * factor)
   }

   private fun renderEventServerConfirmButton(bounds: طآ, text: String, primary: Boolean, alpha: Float, hoverProgress: Float) {
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(this.textPipeline())
         .color(ثْ.INSTANCE.surface((0.025F + 0.025F * hoverProgress) * alpha))
         .mix(0.95F)
         .round(3.5F)
         .border(1.0F, ثْ.INSTANCE.title((0.055F + 0.05F * hoverProgress) * alpha))
         .draw(bounds.x, bounds.y, bounds.width, bounds.height)
         if (primary) {
         val textSize: Int = RangesKt.coerceIn(MathKt.roundToInt(255.0F - 10.0F * hoverProgress), 0, 255)
         val textColor: Color = Color(textSize, textSize, textSize, RangesKt.coerceIn(MathKt.roundToInt(255.0F * alpha), 0, 255))
         ذر.INSTANCE
            .getBASIC_RECT()
            .priority(this.textPipeline())
            .color(textColor)
            .round(3.5F)
            .border(1.0F, textColor)
            .draw(bounds.x, bounds.y, bounds.width, bounds.height)
         }

      جً.drawCenteredText$default(
         رَ.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()),
         text,
         bounds.x + bounds.width * 0.5F,
         bounds.y + (bounds.height - 6.2F) * 0.46F,
         6.2F,
         if (primary)
            Color(0, 0, 0, RangesKt.coerceIn(MathKt.roundToInt(255.0F * alpha), 0, 255))
            else
            ثْ.INSTANCE.title((0.86F + 0.1F * hoverProgress) * alpha),
         0.0F,
         32,
         null
      )
   }

   private fun tryStartAvatarPopupHudScaleDrag(popupBounds: طآ, metrics: تذ, mouseX: Float, mouseY: Float): Boolean {
      val cardBounds: طآ = this.avatarPopupSettingBounds(popupBounds, metrics, 1)
      if (!this.avatarPopupHudScaleSliderHitBounds(cardBounds, metrics).contains(mouseX, mouseY)) {
         return false
      } else {
         draggingAvatarPopupHudScale = true
         this.updateAvatarPopupHudScalePreview(mouseX, this.avatarPopupHudScaleSliderBounds(cardBounds, metrics))
         return true
      }
   }

   private fun handleEventServerConfirmMouseClick(mouseX: Float, mouseY: Float, button: Int) {
      if (button == 0) {
         val modal: طآ = this.eventServerConfirmBounds()
         if (this.eventServerConfirmAcceptBounds(modal).contains(mouseX, mouseY)) {
            this.confirmEventServerJoin()
         } else if (this.eventServerConfirmCancelBounds(modal).contains(mouseX, mouseY)) {
            this.closeEventServerConfirm()
         } else if (!modal.contains(mouseX, mouseY)) {
            this.closeEventServerConfirm()
         }
      }
   }

   public final val x: Float
      public final get() {
         return ضك.getMc().getWindow().getScaledWidth() * 0.5F - this.width * 0.5F
      }


   private fun renderAvatarPopupRows(x: Float, endX: Float, startY: Float, metrics: تذ, alpha: Float) {
      val rows: java.util.List = this.avatarPopupRows()
      val leadingSize: Float = metrics.rowLeadingSize()
      val leadingGap: Float = metrics.rowLeadingGap()
      val onePx: Float = metrics.scaled(1.0F)
      val badgeGap: Float = metrics.scaled(3.0F)
      val badgeRound: Float = metrics.scaled(3.0F)
      val badgeBorder: Float = metrics.scaled(1.0F)
      var currentY: Float = startY

      for (row in rows) {
         val textY: Float = currentY + (metrics.rowHeight - metrics.rowTextSize) / 2.0F
         val lineAlpha: Float = RangesKt.coerceIn(alpha, 0.0F, 1.0F)
         val leadingWidth: Float = جً.getWidth$default(رَ.INSTANCE.getICON(), row.icon, leadingSize, 0.0F, 4, null)
         val textX: Float = x + leadingWidth + leadingGap
         رَ.INSTANCE
            .getICON()
            .priority(this.iconsPipeline())
            .size(leadingSize)
            .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha))
            .drawText(row.icon, x, currentY + onePx + (metrics.rowHeight - leadingSize) / 2.0F)
            this.renderAvatarPopupDivider(
            x + leadingWidth + (leadingGap - metrics.scaled(0.5F) - metrics.rowDividerWidth()) / 2.0F, currentY + onePx, metrics.rowHeight, metrics, lineAlpha
         )
         رَ.INSTANCE
            .getGS_MEDIUM()
            .priority(this.textPipeline())
            .size(metrics.rowTextSize)
            .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha))
            .drawText(row.text, textX, textY)
            val textWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), row.value, metrics.rowTextSize, 0.0F, 4, null)
         val bgWidth: Float = RangesKt.coerceAtLeast(textWidth + badgeGap * 2.0F, textWidth + badgeGap * 2.5F)
         val bgHeight: Float = metrics.rowTextSize + badgeGap * 2.0F
         val bgX: Float = endX - textWidth - badgeGap * 2.0F
         ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(this.rectPipeline())
            .drawWithBorder(
               endX - textWidth - badgeGap * 2.0F,
               textY - badgeGap / 1.5F,
               bgWidth,
               bgHeight,
               badgeRound,
               بح.INSTANCE.setAlpha(طغ.INSTANCE.HEADER_COLOR, lineAlpha * 0.2F),
               0.9F,
               badgeBorder,
               بح.INSTANCE.setAlpha(طغ.INSTANCE.HEADER_COLOR, lineAlpha * 0.1F)
            )
            رَ.INSTANCE
            .getGS_MEDIUM()
            .priority(this.textPipeline())
            .size(metrics.rowTextSize)
            .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, lineAlpha))
            .drawText(row.value, bgX + bgWidth / 2.0F - textWidth / 2.0F, textY)
            currentY += metrics.rowHeight
      }
   }

   private fun configCreateCancelButtonBounds(popup: طآ): طآ {
      val create: طآ = this.configCreateConfirmButtonBounds(popup)
      return طآ(create.x + create.width + 5.0F, create.y, create.width, create.height)
   }

   private fun avatarPopupCloseBounds(bounds: طآ, metrics: تذ): طآ {
      val areaSize: Float = metrics.scaled(14.0F)
      return طآ(bounds.x + bounds.width - areaSize - metrics.margin * 0.75F, bounds.y + (metrics.headerHeight - areaSize) * 0.5F, areaSize, areaSize)
   }

   private fun configKeyDividerBounds(popup: طآ): طآ {
      return طآ(popup.x + 7.0F, popup.y + 7.0F + 15.0F, popup.width - 14.0F, 1.0F)
   }

   private fun eventServerConfirmDividerBounds(modal: طآ): طآ {
      return طآ(modal.x + 7.0F, modal.y + 7.0F + 15.0F, modal.width - 14.0F, 1.0F)
   }

   private fun commitAvatarPopupHudScaleDrag(mouseX: Float? = null) {
      if (mouseX != null && avatarPopupOpen) {
         val progress: Float = currentScale$default(this, 0.0F, 1, null)
         val previousValue: ظص = categoryTransition.current
         val var10000: ام = CollectionsKt.firstOrNull(components)
         val sidebarPadding: Float = if (var10000 != null) var10000.getPadding() else uiPadding
         val layout: زْ = زْ(
            this.x,
            this.y,
            this.width,
            this.height,
            this.panelWidth,
            uiPadding,
            topBarHeight,
            sidebarPadding,
            components.size(),
            this.isConfigCategory(previousValue),
            this.isPointsCategory(previousValue),
            false,
            2048,
            null
         )
         val metrics: تذ = this.avatarPopupMetrics(progress)
         this.updateAvatarPopupHudScalePreview(
            mouseX, this.avatarPopupHudScaleSliderBounds(this.avatarPopupSettingBounds(this.avatarPopupBounds(layout, progress, metrics), metrics, 1), metrics)
         )
      }

      val var11: Float = if (avatarPopupHudScaleDragProgress != null) avatarPopupHudScaleDragProgress else سر.INSTANCE.hudScaleProgress()
      val var12: Float = سر.INSTANCE.hudScalePercent()
      سر.INSTANCE.setHudScaleProgress(var11)
      if (سر.INSTANCE.hudScalePercent() != var12) {
         ضك.getMc().getSoundManager().play(PositionedSoundInstance.ui(زد.INSTANCE.getSLIDER(), 1.0F, 1.0F) as SoundInstance)
      }

      draggingAvatarPopupHudScale = false
      avatarPopupHudScaleDragProgress = null
   }

   private fun loadExistingCloudKeys(configName: String, requestId: Int) {
      var contentHash: java.lang.String
      var var10000: java.lang.String
      run label22@{
         contentHash = اك.INSTANCE.cloudPayloadHash(configName)
         val var5: دة = اك.INSTANCE.getCloudOrigin(configName)
         if (var5 != null) {
            val var6: دة = if (var5.owned) var5 else null
            if (var6 != null) {
               var10000 = var6.configId
               return@label22
            }
         }

         var10000 = null
      }

      خه.INSTANCE.listOwned().whenComplete({ p0: Any, p1: Any ->
         `$tmp0`(p0, p1)
      })
   }

   private fun synchronizeOwnedCloudConfigs() {
      cloudLibrarySyncRequestId++
      val requestId: Int = cloudLibrarySyncRequestId
      خه.INSTANCE.listLibrary().whenComplete({ p0: Any, p1: Any ->
         `$tmp0`(p0, p1)
      })
   }

   private fun renderEventServerConfirm(openProgress: Float, mouseX: Float, mouseY: Float) {
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
      // 000: getstatic oxxxde/حز.eventServerConfirmAnimation Loxxxde/ري;
      // 003: getstatic oxxxde/حز.eventServerConfirmOpen Z
      // 006: ifeq 00e
      // 009: fconst_1
      // 00a: nop
      // 00b: goto 010
      // 00e: fconst_0
      // 00f: nop
      // 010: ldc_w 220.0
      // 013: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 016: astore 5
      // 018: new oxxxde/حإ
      // 01b: dup
      // 01c: aload 5
      // 01e: invokespecial oxxxde/حإ.<init> (Loxxxde/بف;)V
      // 021: checkcast oxxxde/شل
      // 024: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 027: fconst_0
      // 028: nop
      // 029: fconst_1
      // 02a: nop
      // 02b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 02e: fstore 4
      // 030: fload 4
      // 032: ldc_w 0.001
      // 035: fcmpg
      // 036: ifgt 045
      // 039: getstatic oxxxde/حز.eventServerConfirmOpen Z
      // 03c: ifne 044
      // 03f: aconst_null
      // 040: nop
      // 041: putstatic oxxxde/حز.eventServerConfirmAnarchy Ljava/lang/Integer;
      // 044: return
      // 045: fload 1
      // 046: fload 4
      // 048: fmul
      // 049: fstore 5
      // 04b: ldc_w 32.0
      // 04e: fstore 6
      // 050: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 053: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 056: aload 0
      // 057: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 05a: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 05d: new java/awt/Color
      // 060: dup
      // 061: bipush 0
      // 062: nop
      // 063: bipush 0
      // 064: nop
      // 065: bipush 0
      // 066: nop
      // 067: ldc_w 127.5
      // 06a: fload 5
      // 06c: fmul
      // 06d: invokestatic kotlin/math/MathKt.roundToInt (F)I
      // 070: bipush 0
      // 071: nop
      // 072: sipush 255
      // 075: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 078: invokespecial java/awt/Color.<init> (IIII)V
      // 07b: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 07e: fconst_0
      // 07f: nop
      // 080: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 083: fload 6
      // 085: fneg
      // 086: fload 6
      // 088: fneg
      // 089: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 08c: invokevirtual net/minecraft/client/MinecraftClient.getWindow ()Lnet/minecraft/client/util/Window;
      // 08f: invokevirtual net/minecraft/client/util/Window.getScaledWidth ()I
      // 092: i2f
      // 093: fload 6
      // 095: fconst_2
      // 096: nop
      // 097: fmul
      // 098: fadd
      // 099: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 09c: invokevirtual net/minecraft/client/MinecraftClient.getWindow ()Lnet/minecraft/client/util/Window;
      // 09f: invokevirtual net/minecraft/client/util/Window.getScaledHeight ()I
      // 0a2: i2f
      // 0a3: fload 6
      // 0a5: fconst_2
      // 0a6: nop
      // 0a7: fmul
      // 0a8: fadd
      // 0a9: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 0ac: aload 0
      // 0ad: invokespecial oxxxde/حز.eventServerConfirmBounds ()Loxxxde/طآ;
      // 0b0: astore 7
      // 0b2: aload 7
      // 0b4: fconst_0
      // 0b5: nop
      // 0b6: aload 7
      // 0b8: invokevirtual oxxxde/طآ.getY ()F
      // 0bb: fconst_1
      // 0bc: nop
      // 0bd: fload 4
      // 0bf: fsub
      // 0c0: ldc_w 5.0
      // 0c3: fmul
      // 0c4: fadd
      // 0c5: fconst_0
      // 0c6: nop
      // 0c7: fconst_0
      // 0c8: nop
      // 0c9: bipush 13
      // 0cb: aconst_null
      // 0cc: nop
      // 0cd: invokestatic oxxxde/طآ.copy$default (Loxxxde/طآ;FFFFILjava/lang/Object;)Loxxxde/طآ;
      // 0d0: astore 8
      // 0d2: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0d5: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 0d8: aload 0
      // 0d9: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0dc: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 0df: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0e2: fload 5
      // 0e4: invokevirtual oxxxde/ثْ.panel (F)Ljava/awt/Color;
      // 0e7: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 0ea: ldc_w 5.0
      // 0ed: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 0f0: aload 8
      // 0f2: invokevirtual oxxxde/طآ.getX ()F
      // 0f5: aload 8
      // 0f7: invokevirtual oxxxde/طآ.getY ()F
      // 0fa: aload 8
      // 0fc: invokevirtual oxxxde/طآ.getWidth ()F
      // 0ff: aload 8
      // 101: invokevirtual oxxxde/طآ.getHeight ()F
      // 104: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 107: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 10a: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 10d: aload 0
      // 10e: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 111: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 114: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 117: ldc_w 0.04
      // 11a: fload 5
      // 11c: fmul
      // 11d: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 120: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 123: ldc_w 0.95
      // 126: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 129: ldc_w 5.0
      // 12c: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 12f: fconst_1
      // 130: nop
      // 131: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 134: ldc_w 0.08
      // 137: fload 5
      // 139: fmul
      // 13a: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 13d: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 140: aload 8
      // 142: invokevirtual oxxxde/طآ.getX ()F
      // 145: aload 8
      // 147: invokevirtual oxxxde/طآ.getY ()F
      // 14a: aload 8
      // 14c: invokevirtual oxxxde/طآ.getWidth ()F
      // 14f: aload 8
      // 151: invokevirtual oxxxde/طآ.getHeight ()F
      // 154: invokevirtual oxxxde/جء.draw (FFFF)V
      // 157: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 15a: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 15d: aload 0
      // 15e: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 161: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 164: ldc_w "Вы хотите перейти на FunTime?"
      // 167: aload 8
      // 169: invokevirtual oxxxde/طآ.getX ()F
      // 16c: aload 8
      // 16e: invokevirtual oxxxde/طآ.getWidth ()F
      // 171: ldc_w 0.5
      // 174: fmul
      // 175: fadd
      // 176: aload 8
      // 178: invokevirtual oxxxde/طآ.getY ()F
      // 17b: ldc_w 7.0
      // 17e: fadd
      // 17f: ldc_w 0.4
      // 182: fsub
      // 183: ldc_w 8.0
      // 186: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 189: ldc_w 0.9
      // 18c: fload 5
      // 18e: fmul
      // 18f: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 192: fconst_0
      // 193: nop
      // 194: bipush 32
      // 196: aconst_null
      // 197: nop
      // 198: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 19b: aload 0
      // 19c: aload 8
      // 19e: invokespecial oxxxde/حز.eventServerConfirmDividerBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 1a1: astore 9
      // 1a3: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1a6: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 1a9: aload 0
      // 1aa: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1ad: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 1b0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1b3: ldc_w 0.1
      // 1b6: fload 5
      // 1b8: fmul
      // 1b9: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1bc: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 1bf: ldc_w 0.5
      // 1c2: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 1c5: aload 9
      // 1c7: invokevirtual oxxxde/طآ.getX ()F
      // 1ca: aload 9
      // 1cc: invokevirtual oxxxde/طآ.getY ()F
      // 1cf: aload 9
      // 1d1: invokevirtual oxxxde/طآ.getWidth ()F
      // 1d4: aload 9
      // 1d6: invokevirtual oxxxde/طآ.getHeight ()F
      // 1d9: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 1dc: getstatic oxxxde/حز.eventServerConfirmAnarchy Ljava/lang/Integer;
      // 1df: astore 10
      // 1e1: aload 10
      // 1e3: ifnonnull 1ec
      // 1e6: ldc_w "Вы хотите перейти на FunTime?"
      // 1e9: goto 1f3
      // 1ec: aload 10
      // 1ee: invokedynamic makeConcatWithConstants (Ljava/lang/Integer;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Войти на анархию \u0001 после подключения?" ]
      // 1f3: astore 11
      // 1f5: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1f8: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 1fb: aload 0
      // 1fc: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1ff: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 202: aload 11
      // 204: aload 8
      // 206: invokevirtual oxxxde/طآ.getX ()F
      // 209: aload 8
      // 20b: invokevirtual oxxxde/طآ.getWidth ()F
      // 20e: ldc_w 0.5
      // 211: fmul
      // 212: fadd
      // 213: aload 9
      // 215: invokevirtual oxxxde/طآ.getY ()F
      // 218: aload 9
      // 21a: invokevirtual oxxxde/طآ.getHeight ()F
      // 21d: fadd
      // 21e: ldc_w 5.2
      // 221: fadd
      // 222: ldc_w 5.8
      // 225: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 228: ldc_w 0.72
      // 22b: fload 5
      // 22d: fmul
      // 22e: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 231: fconst_0
      // 232: nop
      // 233: bipush 32
      // 235: aconst_null
      // 236: nop
      // 237: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 23a: aload 0
      // 23b: aload 8
      // 23d: invokespecial oxxxde/حز.eventServerConfirmAcceptBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 240: astore 12
      // 242: aload 0
      // 243: aload 8
      // 245: invokespecial oxxxde/حز.eventServerConfirmCancelBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 248: astore 13
      // 24a: getstatic oxxxde/حز.eventServerConfirmAcceptHoverAnimation Loxxxde/ري;
      // 24d: aload 12
      // 24f: fload 2
      // 250: fload 3
      // 251: invokevirtual oxxxde/طآ.contains (FF)Z
      // 254: ifeq 25c
      // 257: fconst_1
      // 258: nop
      // 259: goto 25e
      // 25c: fconst_0
      // 25d: nop
      // 25e: ldc_w 170.0
      // 261: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 264: astore 15
      // 266: new oxxxde/ثه
      // 269: dup
      // 26a: aload 15
      // 26c: invokespecial oxxxde/ثه.<init> (Loxxxde/بف;)V
      // 26f: checkcast oxxxde/شل
      // 272: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 275: fconst_0
      // 276: nop
      // 277: fconst_1
      // 278: nop
      // 279: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 27c: fstore 14
      // 27e: getstatic oxxxde/حز.eventServerConfirmCancelHoverAnimation Loxxxde/ري;
      // 281: aload 13
      // 283: fload 2
      // 284: fload 3
      // 285: invokevirtual oxxxde/طآ.contains (FF)Z
      // 288: ifeq 290
      // 28b: fconst_1
      // 28c: nop
      // 28d: goto 292
      // 290: fconst_0
      // 291: nop
      // 292: ldc_w 170.0
      // 295: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 298: astore 16
      // 29a: new oxxxde/حس
      // 29d: dup
      // 29e: aload 16
      // 2a0: invokespecial oxxxde/حس.<init> (Loxxxde/بف;)V
      // 2a3: checkcast oxxxde/شل
      // 2a6: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 2a9: fconst_0
      // 2aa: nop
      // 2ab: fconst_1
      // 2ac: nop
      // 2ad: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 2b0: fstore 15
      // 2b2: aload 0
      // 2b3: aload 12
      // 2b5: ldc_w "Да"
      // 2b8: bipush 1
      // 2b9: nop
      // 2ba: fload 5
      // 2bc: fload 14
      // 2be: invokespecial oxxxde/حز.renderEventServerConfirmButton (Loxxxde/طآ;Ljava/lang/String;ZFF)V
      // 2c1: aload 0
      // 2c2: aload 13
      // 2c4: ldc_w "Отмена"
      // 2c7: bipush 0
      // 2c8: nop
      // 2c9: fload 5
      // 2cb: fload 15
      // 2cd: invokespecial oxxxde/حز.renderEventServerConfirmButton (Loxxxde/طآ;Ljava/lang/String;ZFF)V
      // 2d0: return
   }

   private fun submitCloudConfigUnload() {
      if (!اك.INSTANCE.unloadActiveCloudConfig()) {
         configCreateStatusText = "Не удалось сбросить настройки"
      } else {
         this.closeConfigCreatePopup(true)
         configsCategoryComponent.resetScroll()
      }
   }

   public fun canRenderModelPreviews(): Boolean {
      return modelPreviewRenderingEnabled
   }

   private fun canSubmitConfigCloudSave(): Boolean {
      return this.configCloudSaveValidationError() == null
   }

   private fun renderBackdrop(openProgress: Float, backgroundProgress: Float) {
      val overlayAlpha: Float = RangesKt.coerceIn(0.38F * openProgress * backgroundProgress, 0.0F, 1.0F)
      if (!(overlayAlpha <= 0.0F)) {
         ذر.INSTANCE
            .getBASIC_RECT()
            .priority(this.rectPipeline())
            .color(Color(0, 0, 0, RangesKt.coerceIn((int)(overlayAlpha * 255.0F), 0, 255)))
            .round(0.0F)
            .draw(-32.0F, -32.0F, (float)ضك.getMc().getWindow().getScaledWidth() + 32.0F * 2.0F, (float)ضك.getMc().getWindow().getScaledHeight() + 32.0F * 2.0F)
         }
   }

   private fun confirmEventServerJoin() {
      if (eventServerConfirmAnarchy != null) {
         val anarchy: Int = eventServerConfirmAnarchy
         eventServerConfirmOpen = false
         eventServerConfirmAnarchy = null
         زء.INSTANCE.connect(anarchy)
      }
   }

   private fun trimConfigKeyToWidth(value: String, maxWidth: Float, textSize: Float): String {
      if (جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), value, textSize, 0.0F, 4, null) <= maxWidth) {
         return value
      } else {
         var rendered: java.lang.String = value

         while (rendered.length() > 1 && جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), rendered, textSize, 0.0F, 4, null) > maxWidth) {
            rendered = StringsKt.drop(rendered, 1)
         }

         return rendered
      }
   }

   private fun unscaleMouseY(mouseY: Int, scale: Float): Int {
      val centerY: Float = this.y + this.height * 0.5F
      return (int)((mouseY - centerY) / scale + centerY)
   }

   private fun openConfigFolder() {
      Util.getOperatingSystem().open(اك.INSTANCE.configPath.toFile())
   }

   private fun renderConfigKeyPopup(layout: زْ, configMode: Boolean, openProgress: Float, mouseX: Float, mouseY: Float) {
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
      // 000: iload 2
      // 001: nop
      // 002: ifne 02f
      // 005: getstatic oxxxde/حز.configKeyPopupAnimation Loxxxde/ري;
      // 008: fconst_0
      // 009: nop
      // 00a: fconst_0
      // 00b: nop
      // 00c: aconst_null
      // 00d: nop
      // 00e: bipush 4
      // 00f: nop
      // 010: aconst_null
      // 011: nop
      // 012: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 015: pop
      // 016: ldc_w 77.0
      // 019: putstatic oxxxde/حز.configKeyRenderedPopupHeight F
      // 01c: getstatic oxxxde/حز.configKeyPopupHeightAnimation Loxxxde/ري;
      // 01f: ldc_w 77.0
      // 022: fconst_0
      // 023: nop
      // 024: aconst_null
      // 025: nop
      // 026: bipush 4
      // 027: nop
      // 028: aconst_null
      // 029: nop
      // 02a: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 02d: pop
      // 02e: return
      // 02f: getstatic oxxxde/حز.configKeyPopupAnimation Loxxxde/ري;
      // 032: getstatic oxxxde/حز.configKeyPopupOpen Z
      // 035: ifeq 03d
      // 038: fconst_1
      // 039: nop
      // 03a: goto 03f
      // 03d: fconst_0
      // 03e: nop
      // 03f: ldc_w 180.0
      // 042: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 045: astore 7
      // 047: new oxxxde/زُ
      // 04a: dup
      // 04b: aload 7
      // 04d: invokespecial oxxxde/زُ.<init> (Loxxxde/بف;)V
      // 050: checkcast oxxxde/شل
      // 053: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 056: fconst_0
      // 057: nop
      // 058: fconst_1
      // 059: nop
      // 05a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 05d: fstore 6
      // 05f: fload 6
      // 061: ldc_w 0.001
      // 064: fcmpg
      // 065: ifgt 069
      // 068: return
      // 069: fload 3
      // 06a: fload 6
      // 06c: fmul
      // 06d: fstore 7
      // 06f: getstatic oxxxde/حز.configKeyStatusText Ljava/lang/String;
      // 072: ifnonnull 07b
      // 075: ldc_w 77.0
      // 078: goto 07e
      // 07b: ldc_w 84.0
      // 07e: fstore 8
      // 080: getstatic oxxxde/حز.configKeyPopupHeightAnimation Loxxxde/ري;
      // 083: fload 8
      // 085: ldc_w 180.0
      // 088: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 08b: astore 9
      // 08d: new oxxxde/شع
      // 090: dup
      // 091: aload 9
      // 093: invokespecial oxxxde/شع.<init> (Loxxxde/بف;)V
      // 096: checkcast oxxxde/شل
      // 099: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 09c: putstatic oxxxde/حز.configKeyRenderedPopupHeight F
      // 09f: aload 0
      // 0a0: aload 1
      // 0a1: invokespecial oxxxde/حز.configKeyPopupBounds (Loxxxde/زْ;)Loxxxde/طآ;
      // 0a4: astore 9
      // 0a6: aload 9
      // 0a8: fconst_0
      // 0a9: nop
      // 0aa: aload 9
      // 0ac: invokevirtual oxxxde/طآ.getY ()F
      // 0af: fconst_1
      // 0b0: nop
      // 0b1: fload 6
      // 0b3: fsub
      // 0b4: ldc_w 4.0
      // 0b7: fmul
      // 0b8: fsub
      // 0b9: fconst_0
      // 0ba: nop
      // 0bb: fconst_0
      // 0bc: nop
      // 0bd: bipush 13
      // 0bf: aconst_null
      // 0c0: nop
      // 0c1: invokestatic oxxxde/طآ.copy$default (Loxxxde/طآ;FFFFILjava/lang/Object;)Loxxxde/طآ;
      // 0c4: astore 10
      // 0c6: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0c9: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 0cc: aload 0
      // 0cd: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0d0: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 0d3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0d6: fload 7
      // 0d8: invokevirtual oxxxde/ثْ.panel (F)Ljava/awt/Color;
      // 0db: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 0de: ldc_w 5.0
      // 0e1: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 0e4: aload 10
      // 0e6: invokevirtual oxxxde/طآ.getX ()F
      // 0e9: aload 10
      // 0eb: invokevirtual oxxxde/طآ.getY ()F
      // 0ee: aload 10
      // 0f0: invokevirtual oxxxde/طآ.getWidth ()F
      // 0f3: aload 10
      // 0f5: invokevirtual oxxxde/طآ.getHeight ()F
      // 0f8: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 0fb: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0fe: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 101: aload 0
      // 102: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 105: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 108: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 10b: ldc_w 0.04
      // 10e: fload 7
      // 110: fmul
      // 111: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 114: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 117: ldc_w 0.95
      // 11a: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 11d: ldc_w 5.0
      // 120: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 123: fconst_1
      // 124: nop
      // 125: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 128: ldc_w 0.08
      // 12b: fload 7
      // 12d: fmul
      // 12e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 131: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 134: aload 10
      // 136: invokevirtual oxxxde/طآ.getX ()F
      // 139: aload 10
      // 13b: invokevirtual oxxxde/طآ.getY ()F
      // 13e: aload 10
      // 140: invokevirtual oxxxde/طآ.getWidth ()F
      // 143: aload 10
      // 145: invokevirtual oxxxde/طآ.getHeight ()F
      // 148: invokevirtual oxxxde/جء.draw (FFFF)V
      // 14b: ldc_w 8.0
      // 14e: fstore 11
      // 150: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 153: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 156: aload 0
      // 157: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 15a: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 15d: ldc_w "Активируйте ключ конфига"
      // 160: aload 10
      // 162: invokevirtual oxxxde/طآ.getX ()F
      // 165: aload 10
      // 167: invokevirtual oxxxde/طآ.getWidth ()F
      // 16a: ldc_w 0.5
      // 16d: fmul
      // 16e: fadd
      // 16f: aload 10
      // 171: invokevirtual oxxxde/طآ.getY ()F
      // 174: ldc_w 7.0
      // 177: fadd
      // 178: ldc_w 0.4
      // 17b: fsub
      // 17c: fload 11
      // 17e: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 181: ldc_w 0.9
      // 184: fload 7
      // 186: fmul
      // 187: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 18a: fconst_0
      // 18b: nop
      // 18c: bipush 32
      // 18e: aconst_null
      // 18f: nop
      // 190: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 193: aload 0
      // 194: aload 10
      // 196: invokespecial oxxxde/حز.configKeyDividerBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 199: astore 12
      // 19b: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 19e: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 1a1: aload 0
      // 1a2: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1a5: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 1a8: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1ab: ldc_w 0.1
      // 1ae: fload 7
      // 1b0: fmul
      // 1b1: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1b4: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 1b7: ldc_w 0.5
      // 1ba: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 1bd: aload 12
      // 1bf: invokevirtual oxxxde/طآ.getX ()F
      // 1c2: aload 12
      // 1c4: invokevirtual oxxxde/طآ.getY ()F
      // 1c7: aload 12
      // 1c9: invokevirtual oxxxde/طآ.getWidth ()F
      // 1cc: aload 12
      // 1ce: invokevirtual oxxxde/طآ.getHeight ()F
      // 1d1: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 1d4: aload 0
      // 1d5: aload 0
      // 1d6: aload 10
      // 1d8: invokespecial oxxxde/حز.configKeyInputBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 1db: fload 7
      // 1dd: invokespecial oxxxde/حز.renderConfigKeyInput (Loxxxde/طآ;F)V
      // 1e0: aload 0
      // 1e1: aload 10
      // 1e3: invokespecial oxxxde/حز.configKeyUploadButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 1e6: astore 13
      // 1e8: aload 0
      // 1e9: aload 10
      // 1eb: invokespecial oxxxde/حز.configKeyCancelButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 1ee: astore 14
      // 1f0: getstatic oxxxde/حز.configKeyUploadHoverAnimation Loxxxde/ري;
      // 1f3: aload 13
      // 1f5: fload 4
      // 1f7: fload 5
      // 1f9: invokevirtual oxxxde/طآ.contains (FF)Z
      // 1fc: ifeq 204
      // 1ff: fconst_1
      // 200: nop
      // 201: goto 206
      // 204: fconst_0
      // 205: nop
      // 206: ldc_w 170.0
      // 209: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 20c: astore 16
      // 20e: new oxxxde/سف
      // 211: dup
      // 212: aload 16
      // 214: invokespecial oxxxde/سف.<init> (Loxxxde/بف;)V
      // 217: checkcast oxxxde/شل
      // 21a: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 21d: fconst_0
      // 21e: nop
      // 21f: fconst_1
      // 220: nop
      // 221: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 224: fstore 15
      // 226: getstatic oxxxde/حز.configKeyCancelHoverAnimation Loxxxde/ري;
      // 229: aload 14
      // 22b: fload 4
      // 22d: fload 5
      // 22f: invokevirtual oxxxde/طآ.contains (FF)Z
      // 232: ifeq 23a
      // 235: fconst_1
      // 236: nop
      // 237: goto 23c
      // 23a: fconst_0
      // 23b: nop
      // 23c: ldc_w 170.0
      // 23f: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 242: astore 17
      // 244: new oxxxde/شش
      // 247: dup
      // 248: aload 17
      // 24a: invokespecial oxxxde/شش.<init> (Loxxxde/بف;)V
      // 24d: checkcast oxxxde/شل
      // 250: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 253: fconst_0
      // 254: nop
      // 255: fconst_1
      // 256: nop
      // 257: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 25a: fstore 16
      // 25c: aload 0
      // 25d: aload 13
      // 25f: getstatic oxxxde/حز.configKeySubmitting Z
      // 262: ifeq 26b
      // 265: ldc_w "..."
      // 268: goto 26e
      // 26b: ldc_w "Загрузить"
      // 26e: aload 0
      // 26f: invokespecial oxxxde/حز.canSubmitConfigKey ()Z
      // 272: fload 7
      // 274: bipush 1
      // 275: nop
      // 276: fload 15
      // 278: invokespecial oxxxde/حز.renderConfigKeyButton (Loxxxde/طآ;Ljava/lang/String;ZFZF)V
      // 27b: aload 0
      // 27c: aload 14
      // 27e: ldc_w "Отмена"
      // 281: bipush 1
      // 282: nop
      // 283: fload 7
      // 285: bipush 0
      // 286: nop
      // 287: fload 16
      // 289: bipush 16
      // 28b: aconst_null
      // 28c: nop
      // 28d: invokestatic oxxxde/حز.renderConfigKeyButton$default (Loxxxde/حز;Loxxxde/طآ;Ljava/lang/String;ZFZFILjava/lang/Object;)V
      // 290: getstatic oxxxde/حز.configKeyStatusTransition Loxxxde/حت;
      // 293: getstatic oxxxde/حز.configKeyStatusText Ljava/lang/String;
      // 296: invokevirtual oxxxde/حت.update (Ljava/lang/String;)Ljava/util/List;
      // 299: astore 17
      // 29b: aload 0
      // 29c: aload 10
      // 29e: invokespecial oxxxde/حز.configKeyCancelButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 2a1: astore 18
      // 2a3: aload 10
      // 2a5: invokevirtual oxxxde/طآ.getHeight ()F
      // 2a8: ldc_w 77.0
      // 2ab: fsub
      // 2ac: ldc_w 7.0
      // 2af: fdiv
      // 2b0: fconst_0
      // 2b1: nop
      // 2b2: fconst_1
      // 2b3: nop
      // 2b4: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 2b7: fstore 19
      // 2b9: aload 17
      // 2bb: checkcast java/lang/Iterable
      // 2be: astore 20
      // 2c0: bipush 0
      // 2c1: nop
      // 2c2: istore 21
      // 2c4: aload 20
      // 2c6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2cb: astore 22
      // 2cd: aload 22
      // 2cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d4: ifeq 349
      // 2d7: aload 22
      // 2d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2de: astore 23
      // 2e0: aload 23
      // 2e2: checkcast oxxxde/ذإ
      // 2e5: astore 24
      // 2e7: bipush 0
      // 2e8: nop
      // 2e9: istore 25
      // 2eb: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 2ee: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 2f1: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 2f4: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 2f7: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 2fa: aload 24
      // 2fc: invokevirtual oxxxde/ذإ.getText ()Ljava/lang/String;
      // 2ff: aload 10
      // 301: invokevirtual oxxxde/طآ.getX ()F
      // 304: aload 10
      // 306: invokevirtual oxxxde/طآ.getWidth ()F
      // 309: ldc_w 0.5
      // 30c: fmul
      // 30d: fadd
      // 30e: aload 18
      // 310: invokevirtual oxxxde/طآ.getY ()F
      // 313: aload 18
      // 315: invokevirtual oxxxde/طآ.getHeight ()F
      // 318: fadd
      // 319: ldc_w 2.2
      // 31c: fadd
      // 31d: aload 24
      // 31f: invokevirtual oxxxde/ذإ.getOffsetY ()F
      // 322: fadd
      // 323: ldc_w 5.3
      // 326: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 329: ldc_w 0.72
      // 32c: fload 7
      // 32e: fmul
      // 32f: fload 19
      // 331: fmul
      // 332: aload 24
      // 334: invokevirtual oxxxde/ذإ.getAlpha ()F
      // 337: fmul
      // 338: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 33b: fconst_0
      // 33c: nop
      // 33d: bipush 32
      // 33f: aconst_null
      // 340: nop
      // 341: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 344: nop
      // 345: nop
      // 346: goto 2cd
      // 349: nop
      // 34a: return
   }

   private fun renderAvatarPopupSettingBackground(x: Float, y: Float, width: Float, metrics: تذ, alpha: Float) {
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(this.rectPipeline())
         .color(ثْ.INSTANCE.surface(0.035F * alpha))
         .mix(0.95F)
         .round(metrics.scaled(3.0F))
         .border(metrics.scaled(1.0F), ثْ.INSTANCE.title(0.06F * alpha))
         .draw(x, y, RangesKt.coerceAtLeast(width, 0.0F), metrics.settingHeight)
      }

   private fun renderGeneratedConfigKeys(bounds: طآ, alpha: Float, resultsProgress: Float, mouseX: Float, mouseY: Float) {
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
      // 000: getstatic oxxxde/حز.configShareKeyListAnimations Loxxxde/ثّ;
      // 003: getstatic oxxxde/حز.configShareGeneratedKeys Ljava/util/List;
      // 006: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/حز.renderGeneratedConfigKeys$lambda$0 (Loxxxde/بء;)Ljava/lang/String;, (Loxxxde/بء;)Ljava/lang/String; ]
      // 00b: invokevirtual oxxxde/ثّ.update (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
      // 00e: astore 6
      // 010: aload 6
      // 012: checkcast java/lang/Iterable
      // 015: astore 7
      // 017: bipush 0
      // 018: nop
      // 019: istore 8
      // 01b: bipush 0
      // 01c: nop
      // 01d: istore 9
      // 01f: aload 7
      // 021: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 026: astore 10
      // 028: aload 10
      // 02a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02f: ifeq 3cf
      // 032: aload 10
      // 034: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 039: astore 11
      // 03b: iload 9
      // 03d: iinc 9 1
      // 040: istore 12
      // 042: iload 12
      // 044: ifge 04a
      // 047: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 04a: iload 12
      // 04c: aload 11
      // 04e: checkcast oxxxde/جة
      // 051: astore 13
      // 053: istore 14
      // 055: bipush 0
      // 056: nop
      // 057: istore 15
      // 059: aload 13
      // 05b: invokevirtual oxxxde/جة.getValue ()Ljava/lang/Object;
      // 05e: checkcast oxxxde/بء
      // 061: astore 16
      // 063: iload 14
      // 065: i2f
      // 066: ldc_w 0.045
      // 069: fmul
      // 06a: fstore 17
      // 06c: fload 3
      // 06d: fload 17
      // 06f: fsub
      // 070: fconst_1
      // 071: nop
      // 072: fload 17
      // 074: fsub
      // 075: ldc_w 0.01
      // 078: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 07b: fdiv
      // 07c: fconst_0
      // 07d: nop
      // 07e: fconst_1
      // 07f: nop
      // 080: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 083: aload 13
      // 085: invokevirtual oxxxde/جة.getPresence ()F
      // 088: fmul
      // 089: fstore 18
      // 08b: fload 18
      // 08d: ldc_w 0.001
      // 090: fcmpg
      // 091: ifle 3cb
      // 094: fload 2
      // 095: fload 18
      // 097: fmul
      // 098: fstore 19
      // 09a: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 09d: aload 1
      // 09e: aload 13
      // 0a0: invokevirtual oxxxde/جة.getPosition ()F
      // 0a3: invokespecial oxxxde/حز.animatedGeneratedConfigKeyBounds (Loxxxde/طآ;F)Loxxxde/طآ;
      // 0a6: astore 20
      // 0a8: aload 20
      // 0aa: fconst_0
      // 0ab: nop
      // 0ac: aload 20
      // 0ae: invokevirtual oxxxde/طآ.getY ()F
      // 0b1: fconst_1
      // 0b2: nop
      // 0b3: fload 18
      // 0b5: fsub
      // 0b6: ldc_w 3.0
      // 0b9: fmul
      // 0ba: fadd
      // 0bb: fconst_0
      // 0bc: nop
      // 0bd: fconst_0
      // 0be: nop
      // 0bf: bipush 13
      // 0c1: aconst_null
      // 0c2: nop
      // 0c3: invokestatic oxxxde/طآ.copy$default (Loxxxde/طآ;FFFFILjava/lang/Object;)Loxxxde/طآ;
      // 0c6: astore 21
      // 0c8: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0cb: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 0ce: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 0d1: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 0d4: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 0d7: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0da: ldc_w 0.035
      // 0dd: fload 19
      // 0df: fmul
      // 0e0: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0e3: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 0e6: ldc_w 0.95
      // 0e9: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 0ec: ldc_w 3.0
      // 0ef: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 0f2: fconst_1
      // 0f3: nop
      // 0f4: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0f7: ldc_w 0.06
      // 0fa: fload 19
      // 0fc: fmul
      // 0fd: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 100: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 103: aload 21
      // 105: invokevirtual oxxxde/طآ.getX ()F
      // 108: aload 21
      // 10a: invokevirtual oxxxde/طآ.getY ()F
      // 10d: aload 21
      // 10f: invokevirtual oxxxde/طآ.getWidth ()F
      // 112: aload 21
      // 114: invokevirtual oxxxde/طآ.getHeight ()F
      // 117: invokevirtual oxxxde/جء.draw (FFFF)V
      // 11a: ldc_w 5.6
      // 11d: fstore 22
      // 11f: aload 21
      // 121: invokevirtual oxxxde/طآ.getY ()F
      // 124: aload 21
      // 126: invokevirtual oxxxde/طآ.getHeight ()F
      // 129: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 12c: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 12f: fload 22
      // 131: invokevirtual oxxxde/جً.getHeight (F)F
      // 134: fsub
      // 135: ldc_w 0.5
      // 138: fmul
      // 139: fadd
      // 13a: ldc_w 0.4
      // 13d: fsub
      // 13e: fstore 23
      // 140: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 143: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 146: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 149: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 14c: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 14f: aload 16
      // 151: invokevirtual oxxxde/بء.getKey ()Ljava/lang/String;
      // 154: aload 21
      // 156: invokevirtual oxxxde/طآ.getX ()F
      // 159: ldc_w 4.0
      // 15c: fadd
      // 15d: fload 23
      // 15f: fload 22
      // 161: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 164: ldc_w 0.84
      // 167: fload 19
      // 169: fmul
      // 16a: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 16d: fconst_0
      // 16e: nop
      // 16f: fconst_0
      // 170: nop
      // 171: fconst_0
      // 172: nop
      // 173: bipush 0
      // 174: nop
      // 175: fconst_0
      // 176: nop
      // 177: sipush 992
      // 17a: aconst_null
      // 17b: nop
      // 17c: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 17f: aload 16
      // 181: invokevirtual oxxxde/بء.getActivations ()Ljava/lang/Integer;
      // 184: astore 24
      // 186: aload 24
      // 188: ifnonnull 217
      // 18b: ldc_w 6.1
      // 18e: fstore 25
      // 190: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 193: invokevirtual oxxxde/رَ.getICON2 ()Loxxxde/جً;
      // 196: ldc_w "5"
      // 199: fload 25
      // 19b: fconst_0
      // 19c: nop
      // 19d: bipush 4
      // 19e: nop
      // 19f: aconst_null
      // 1a0: nop
      // 1a1: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 1a4: fstore 26
      // 1a6: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1a9: invokevirtual oxxxde/رَ.getICON2 ()Loxxxde/جً;
      // 1ac: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 1af: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 1b2: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1b5: ldc_w "5"
      // 1b8: aload 21
      // 1ba: invokevirtual oxxxde/طآ.getX ()F
      // 1bd: aload 21
      // 1bf: invokevirtual oxxxde/طآ.getWidth ()F
      // 1c2: fadd
      // 1c3: fload 26
      // 1c5: fsub
      // 1c6: ldc_w 4.0
      // 1c9: fsub
      // 1ca: getstatic oxxxde/حز.configShareManagingExisting Z
      // 1cd: ifeq 1d6
      // 1d0: ldc_w 11.0
      // 1d3: goto 1d8
      // 1d6: fconst_0
      // 1d7: nop
      // 1d8: fsub
      // 1d9: aload 21
      // 1db: invokevirtual oxxxde/طآ.getY ()F
      // 1de: aload 21
      // 1e0: invokevirtual oxxxde/طآ.getHeight ()F
      // 1e3: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1e6: invokevirtual oxxxde/رَ.getICON2 ()Loxxxde/جً;
      // 1e9: fload 25
      // 1eb: invokevirtual oxxxde/جً.getHeight (F)F
      // 1ee: fsub
      // 1ef: ldc_w 0.5
      // 1f2: fmul
      // 1f3: fadd
      // 1f4: fload 25
      // 1f6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1f9: ldc_w 0.68
      // 1fc: fload 19
      // 1fe: fmul
      // 1ff: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 202: fconst_0
      // 203: nop
      // 204: fconst_0
      // 205: nop
      // 206: fconst_0
      // 207: nop
      // 208: bipush 0
      // 209: nop
      // 20a: fconst_0
      // 20b: nop
      // 20c: sipush 992
      // 20f: aconst_null
      // 210: nop
      // 211: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 214: goto 2b6
      // 217: aload 16
      // 219: invokevirtual oxxxde/بء.getRemainingActivations ()Ljava/lang/Integer;
      // 21c: dup
      // 21d: ifnull 226
      // 220: invokevirtual java/lang/Integer.intValue ()I
      // 223: goto 22c
      // 226: pop
      // 227: aload 24
      // 229: invokevirtual java/lang/Integer.intValue ()I
      // 22c: istore 25
      // 22e: getstatic oxxxde/حز.configShareManagingExisting Z
      // 231: ifeq 240
      // 234: iload 25
      // 236: aload 24
      // 238: invokedynamic makeConcatWithConstants (ILjava/lang/Integer;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "×\u0001/\u0001" ]
      // 23d: goto 247
      // 240: aload 24
      // 242: invokedynamic makeConcatWithConstants (Ljava/lang/Integer;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "×\u0001" ]
      // 247: astore 26
      // 249: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 24c: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 24f: aload 26
      // 251: fload 22
      // 253: fconst_0
      // 254: nop
      // 255: bipush 4
      // 256: nop
      // 257: aconst_null
      // 258: nop
      // 259: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 25c: fstore 27
      // 25e: getstatic oxxxde/حز.configShareManagingExisting Z
      // 261: ifeq 26a
      // 264: ldc_w 11.0
      // 267: goto 26c
      // 26a: fconst_0
      // 26b: nop
      // 26c: fstore 28
      // 26e: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 271: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 274: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 277: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 27a: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 27d: aload 26
      // 27f: aload 21
      // 281: invokevirtual oxxxde/طآ.getX ()F
      // 284: aload 21
      // 286: invokevirtual oxxxde/طآ.getWidth ()F
      // 289: fadd
      // 28a: fload 27
      // 28c: fsub
      // 28d: ldc_w 4.0
      // 290: fsub
      // 291: fload 28
      // 293: fsub
      // 294: fload 23
      // 296: fload 22
      // 298: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 29b: ldc_w 0.62
      // 29e: fload 19
      // 2a0: fmul
      // 2a1: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 2a4: fconst_0
      // 2a5: nop
      // 2a6: fconst_0
      // 2a7: nop
      // 2a8: fconst_0
      // 2a9: nop
      // 2aa: bipush 0
      // 2ab: nop
      // 2ac: fconst_0
      // 2ad: nop
      // 2ae: sipush 992
      // 2b1: aconst_null
      // 2b2: nop
      // 2b3: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 2b6: getstatic oxxxde/حز.configShareManagingExisting Z
      // 2b9: ifeq 3ca
      // 2bc: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 2bf: aload 21
      // 2c1: invokespecial oxxxde/حز.configShareRevokeButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 2c4: astore 25
      // 2c6: getstatic oxxxde/حز.configShareRevokeHoverAnimations Ljava/util/HashMap;
      // 2c9: checkcast java/util/Map
      // 2cc: astore 27
      // 2ce: aload 16
      // 2d0: invokevirtual oxxxde/بء.getId ()Ljava/lang/String;
      // 2d3: checkcast java/lang/CharSequence
      // 2d6: astore 28
      // 2d8: aload 28
      // 2da: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 2dd: ifeq 2ec
      // 2e0: bipush 0
      // 2e1: nop
      // 2e2: istore 29
      // 2e4: aload 16
      // 2e6: invokevirtual oxxxde/بء.getKey ()Ljava/lang/String;
      // 2e9: goto 2ee
      // 2ec: aload 28
      // 2ee: astore 28
      // 2f0: nop
      // 2f1: bipush 0
      // 2f2: nop
      // 2f3: istore 29
      // 2f5: aload 27
      // 2f7: aload 28
      // 2f9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2fe: astore 30
      // 300: aload 30
      // 302: ifnonnull 329
      // 305: bipush 0
      // 306: nop
      // 307: istore 31
      // 309: new oxxxde/ري
      // 30c: dup
      // 30d: fconst_0
      // 30e: nop
      // 30f: bipush 1
      // 310: nop
      // 311: aconst_null
      // 312: nop
      // 313: invokespecial oxxxde/ري.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 316: astore 31
      // 318: aload 27
      // 31a: aload 28
      // 31c: aload 31
      // 31e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 323: pop
      // 324: aload 31
      // 326: goto 32b
      // 329: aload 30
      // 32b: nop
      // 32c: checkcast oxxxde/ري
      // 32f: aload 25
      // 331: fload 4
      // 333: fload 5
      // 335: invokevirtual oxxxde/طآ.contains (FF)Z
      // 338: ifeq 340
      // 33b: fconst_1
      // 33c: nop
      // 33d: goto 342
      // 340: fconst_0
      // 341: nop
      // 342: ldc_w 170.0
      // 345: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 348: astore 27
      // 34a: new oxxxde/طو
      // 34d: dup
      // 34e: aload 27
      // 350: invokespecial oxxxde/طو.<init> (Loxxxde/بف;)V
      // 353: checkcast oxxxde/شل
      // 356: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 359: fconst_0
      // 35a: nop
      // 35b: fconst_1
      // 35c: nop
      // 35d: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 360: fstore 26
      // 362: ldc_w 5.7
      // 365: fstore 27
      // 367: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 36a: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 36d: getstatic oxxxde/حز.INSTANCE Loxxxde/حز;
      // 370: invokevirtual oxxxde/حز.textPipeline ()Loxxxde/صؤ;
      // 373: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 376: ldc_w "i"
      // 379: aload 25
      // 37b: invokevirtual oxxxde/طآ.getX ()F
      // 37e: aload 25
      // 380: invokevirtual oxxxde/طآ.getWidth ()F
      // 383: ldc_w 0.5
      // 386: fmul
      // 387: fadd
      // 388: aload 25
      // 38a: invokevirtual oxxxde/طآ.getY ()F
      // 38d: aload 25
      // 38f: invokevirtual oxxxde/طآ.getHeight ()F
      // 392: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 395: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 398: fload 27
      // 39a: invokevirtual oxxxde/جً.getHeight (F)F
      // 39d: fsub
      // 39e: ldc_w 0.5
      // 3a1: fmul
      // 3a2: fadd
      // 3a3: fload 27
      // 3a5: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 3a8: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3ab: ldc_w 0.72
      // 3ae: fload 19
      // 3b0: fmul
      // 3b1: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 3b4: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3b7: fload 19
      // 3b9: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 3bc: fload 26
      // 3be: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 3c1: fconst_0
      // 3c2: nop
      // 3c3: bipush 32
      // 3c5: aconst_null
      // 3c6: nop
      // 3c7: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 3ca: nop
      // 3cb: nop
      // 3cc: goto 028
      // 3cf: nop
      // 3d0: fload 3
      // 3d1: ldc_w 0.25
      // 3d4: fsub
      // 3d5: ldc_w 0.75
      // 3d8: fdiv
      // 3d9: fconst_0
      // 3da: nop
      // 3db: fconst_1
      // 3dc: nop
      // 3dd: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 3e0: fstore 7
      // 3e2: fload 7
      // 3e4: ldc_w 0.001
      // 3e7: fcmpl
      // 3e8: ifle 48e
      // 3eb: aload 0
      // 3ec: aload 1
      // 3ed: invokespecial oxxxde/حز.configShareCopyButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 3f0: astore 8
      // 3f2: getstatic oxxxde/حز.configShareCopyHoverAnimation Loxxxde/ري;
      // 3f5: aload 8
      // 3f7: fload 4
      // 3f9: fload 5
      // 3fb: invokevirtual oxxxde/طآ.contains (FF)Z
      // 3fe: ifeq 406
      // 401: fconst_1
      // 402: nop
      // 403: goto 408
      // 406: fconst_0
      // 407: nop
      // 408: ldc_w 170.0
      // 40b: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 40e: astore 10
      // 410: new oxxxde/صس
      // 413: dup
      // 414: aload 10
      // 416: invokespecial oxxxde/صس.<init> (Loxxxde/بف;)V
      // 419: checkcast oxxxde/شل
      // 41c: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 41f: fconst_0
      // 420: nop
      // 421: fconst_1
      // 422: nop
      // 423: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 426: fstore 9
      // 428: aload 0
      // 429: aload 8
      // 42b: fload 2
      // 42c: fload 7
      // 42e: fmul
      // 42f: fload 9
      // 431: invokespecial oxxxde/حز.renderConfigShareCopyButton (Loxxxde/طآ;FF)V
      // 434: getstatic oxxxde/حز.configShareManagingExisting Z
      // 437: ifeq 48e
      // 43a: aload 0
      // 43b: aload 1
      // 43c: invokespecial oxxxde/حز.configShareMoreButtonBounds (Loxxxde/طآ;)Loxxxde/طآ;
      // 43f: astore 10
      // 441: getstatic oxxxde/حز.configShareMoreHoverAnimation Loxxxde/ري;
      // 444: aload 10
      // 446: fload 4
      // 448: fload 5
      // 44a: invokevirtual oxxxde/طآ.contains (FF)Z
      // 44d: ifeq 455
      // 450: fconst_1
      // 451: nop
      // 452: goto 457
      // 455: fconst_0
      // 456: nop
      // 457: ldc_w 170.0
      // 45a: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 45d: astore 12
      // 45f: new oxxxde/ن
      // 462: dup
      // 463: aload 12
      // 465: invokespecial oxxxde/ن.<init> (Loxxxde/بف;)V
      // 468: checkcast oxxxde/شل
      // 46b: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 46e: fconst_0
      // 46f: nop
      // 470: fconst_1
      // 471: nop
      // 472: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 475: fstore 11
      // 477: aload 0
      // 478: aload 10
      // 47a: ldc_w "Создать ещё"
      // 47d: bipush 1
      // 47e: nop
      // 47f: fload 2
      // 480: fload 7
      // 482: fmul
      // 483: bipush 0
      // 484: nop
      // 485: fload 11
      // 487: bipush 16
      // 489: aconst_null
      // 48a: nop
      // 48b: invokestatic oxxxde/حز.renderConfigKeyButton$default (Loxxxde/حز;Loxxxde/طآ;Ljava/lang/String;ZFZFILjava/lang/Object;)V
      // 48e: return
   }
}
