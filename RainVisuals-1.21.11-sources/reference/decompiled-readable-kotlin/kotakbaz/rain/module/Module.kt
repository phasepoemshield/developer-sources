package kotakbaz.rain.module

import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.Rain
import kotakbaz.rain.client.extensions.Category
import kotakbaz.rain.module.setting.ClientColorSetting
import kotakbaz.rain.module.setting.ModSetting
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BindSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotakbaz.rain.module.setting.settings.TextSetting
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.sound.SoundInstance
import oxxxde.ثٌ
import oxxxde.خذ
import oxxxde.دِ
import oxxxde.ذُ
import oxxxde.رت
import oxxxde.رظ
import oxxxde.رف
import oxxxde.زد
import oxxxde.شّ
import oxxxde.ضك
import oxxxde.طب
import oxxxde.طُ
import oxxxde.ظث
import oxxxde.ظذ
import oxxxde.ظص
import oxxxde.ظي
import oxxxde.ظٍ
import oxxxde.ظُ
import oxxxde.عت

// $VF: Compiled from heavy
public open class Module(name: String, category: ظص, desc: String) : شّ, ظُ {
   public final val desc: String
   private Category category;
   private final var available: () -> Boolean
   public final val settings: MutableList<رف<*>>
   private final var key: Int
   private final var visibleInGui: () -> Boolean
   private final var preferredEnabled: Boolean
   private final var enabled: Boolean
   public final val name: String

   public open fun onBindAttempt() {
   }

   init {
      this.name = name
      this.category = category
      this.desc = desc
      this.key = -1
      this.visibleInGui = { 
         true
      }
      this.available = { 
         true
      }
      this.settings = ArrayList<>()
   }

   protected fun boolean(name: String, default: Boolean = ..., configKey: String = ...): خذ {
      val var4: BooleanSetting = BooleanSetting(name, default, configKey)
      this.settings.add(var4)
      return var4
   }

   public fun isVisibleInGui(): Boolean {
      return this.visibleInGui()
   }

   protected fun mod(name: String, modes: List<String>, defaultIndex: Int = ..., configKey: String = ...): ظٍ {
      val var5: ModSetting = ModSetting(name, modes, defaultIndex, configKey)
      this.settings.add(var5)
      return var5
   }

   public override fun setKey(value: Int) {
      if (this.key != value) {
         this.key = value
         Rain.INSTANCE.requestSave()
      }
   }

   public open fun setVisibleInGui(condition: () -> Boolean): دِ {
      this.visibleInGui = condition
      return this
   }

   public open fun addAvailabilityCondition(condition: () -> Boolean): دِ {
      this.available = { 
         `$previous`() && `$condition`()
      }
      this.syncEnabledState()
      return this
   }

   private fun superDisable() {
      رظ.INSTANCE.unregister(this)
   }

   protected fun bind(name: String, default: Int = ..., configKey: String = ...): ذُ {
      val var4: BindSetting = BindSetting(name, configKey, configKey)
      this.settings.add(var4)
      return var4
   }

   private fun playToggleSound(enabled: Boolean) {
      if (ضك.getMc().player != null) {
         ضك.getMc()
            .getSoundManager()
            .play(PositionedSoundInstance.ui(if (enabled) زد.INSTANCE.getMODULE_ENABLE() else زد.INSTANCE.getMODULE_DISABLE(), 1.0F, 1.0F) as SoundInstance)
         }
   }

   protected fun color(name: String, default: Color = ..., configKey: String = ...): رت {
      val var4: ColorSetting = ColorSetting(name, configKey, configKey)
      this.settings.add(var4)
      return var4
   }

   public override fun onKey() {
      if (this.canBind() && this.canToggle() && this.isAvailable()) {
         this.toggle()
         RainMainMenuScreen$Link.INSTANCE.showModuleState(this, this.isEnabled())
      }
   }

   public open fun addVisibleInGuiCondition(condition: () -> Boolean): دِ {
      this.visibleInGui = { 
         `$previous`() && `$condition`()
      }
      return this
   }

   public open fun onEnable() {
   }

   protected fun text(name: String, default: String = ..., maxLength: Int = ..., configKey: String = ...): عت {
      val var5: TextSetting = TextSetting(name, namex, maxLength, configKey)
      this.settings.add(var5)
      return var5
   }

   public fun isAvailable(): Boolean {
      return this.available()
   }

   protected fun clientColor(colorName: String = ..., default: Color = ..., clientColorName: String = ...): طب {
      val clientColorToggle: BooleanSetting = boolean$default(this, clientColorName, false, null, 6, null).setVisible({ 
         ظث.INSTANCE.isEnabled()
      })
      return ClientColorSetting(clientColorToggle, color$default(this, colorName, default, null, 4, null).setVisible({ 
         !ظث.INSTANCE.isEnabled() || !`$clientColorToggle`.getValue()
      }))
   }

   public override fun toggle() {
      this.setEnabled(!this.preferredEnabled)
   }

   private fun superEnable() {
      رظ.INSTANCE.register(this)
   }

   protected fun draggable(name: String = ..., x: Float = ..., y: Float = ...): ظذ {
      return ثٌ.INSTANCE.create(this, name, x, y)
   }

   public open fun canBind(): Boolean {
      return true
   }

   public override fun getKey(): Int {
      return this.key
   }

   public open fun setAvailable(condition: () -> Boolean): دِ {
      this.available = condition
      this.syncEnabledState()
      return this
   }

   protected fun slider(name: String, default: Float, min: Float, max: Float, step: Float = ..., configKey: String = ...): طُ {
      val var7: SliderSetting = SliderSetting(name, step, min, max, step, configKey)
      this.settings.add(var7)
      return var7
   }

   public open fun canToggle(): Boolean {
      return true
   }

   public open fun onDisable() {
   }

   public final val category: ظص

   public override fun setEnabled(value: Boolean) {
      if (this.preferredEnabled != value) {
         this.preferredEnabled = value
         this.syncEnabledState()
         Rain.INSTANCE.requestSave()
      }
   }

   protected fun mode(name: String, modes: List<String>, defaultIndex: Int = ..., configKey: String = ...): ظي {
      val var5: ModeSetting = ModeSetting(name, modes, defaultIndex, configKey)
      this.settings.add(var5)
      return var5
   }

   public fun isPreferredEnabled(): Boolean {
      return this.preferredEnabled
   }

   public fun syncEnabledState() {
      val shouldBeEnabled: Boolean = this.preferredEnabled && this.isAvailable()
      if (shouldBeEnabled != this.enabled) {
         this.enabled = shouldBeEnabled
         if (shouldBeEnabled) {
            this.superEnable()
            this.onEnable()
            this.playToggleSound(true)
         } else {
            this.superDisable()
            this.onDisable()
            this.playToggleSound(false)
         }
      }
   }

   public override fun isEnabled(): Boolean {
      return this.enabled
   }
}
