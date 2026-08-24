package oxxxde

import java.awt.Color
import java.util.ArrayList
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.sound.SoundInstance

// $VF: Compiled from heavy
public open class دِ : شّ, ظُ {
   public final val desc: String
   public final val category: ظص
   private final var available: () -> Boolean
   public final val settings: MutableList<رف<*>>
   private final var key: Int
   private final var visibleInGui: () -> Boolean
   private final var preferredEnabled: Boolean
   private final var enabled: Boolean
   public final val name: String

   public open fun onBindAttempt() {
   }

   open fun دِ(desc: java.lang.String, category: ظص, name: java.lang.String) {
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

   protected fun boolean(name: String, default: Boolean = false, configKey: String = name): خذ {
      val var4: خذ = خذ(name, default, configKey)
      this.settings.add(var4)
      return var4
   }

   public fun isVisibleInGui(): Boolean {
      return this.visibleInGui()
   }

   protected fun mod(name: String, modes: List<String>, defaultIndex: Int = 0, configKey: String = name): ظٍ {
      val var5: ظٍ = ظٍ(name, modes, defaultIndex, configKey)
      this.settings.add(var5)
      return var5
   }

   public override fun setKey(value: Int) {
      if (this.key != value) {
         this.key = value
         رٌ.INSTANCE.requestSave()
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

   protected fun bind(name: String, default: Int = -1, configKey: String = name): ذُ {
      val var4: ذُ = ذُ(name, configKey, configKey)
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

   protected fun color(name: String, default: Color = Color.WHITE, configKey: String = name): رت {
      val var4: رت = رت(name, configKey, configKey)
      this.settings.add(var4)
      return var4
   }

   public override fun onKey() {
      if (this.canBind() && this.canToggle() && this.isAvailable()) {
         this.toggle()
         سِ.INSTANCE.showModuleState(this, this.isEnabled())
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

   protected fun text(name: String, default: String = "", maxLength: Int = 48, configKey: String = name): عت {
      val var5: عت = عت(name, namex, maxLength, configKey)
      this.settings.add(var5)
      return var5
   }

   public fun isAvailable(): Boolean {
      return this.available()
   }

   protected fun clientColor(colorName: String = "Color", default: Color = Color.WHITE, clientColorName: String = "Client Color"): طب {
      val clientColorToggle: خذ = boolean$default(this, clientColorName, false, null, 6, null).setVisible({ 
         ظث.INSTANCE.isEnabled()
      })
      return طب(clientColorToggle, color$default(this, colorName, default, null, 4, null).setVisible({ 
         !ظث.INSTANCE.isEnabled() || !`$clientColorToggle`.getValue()
      }))
   }

   public override fun toggle() {
      this.setEnabled(!this.preferredEnabled)
   }

   private fun superEnable() {
      رظ.INSTANCE.register(this)
   }

   protected fun draggable(name: String = this.name, x: Float = 20.0F, y: Float = 20.0F): ظذ {
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

   protected fun slider(name: String, default: Float, min: Float, max: Float, step: Float = 0.0F, configKey: String = name): طُ {
      val var7: طُ = طُ(name, step, min, max, step, configKey)
      this.settings.add(var7)
      return var7
   }

   public open fun canToggle(): Boolean {
      return true
   }

   public open fun onDisable() {
   }

   fun getCategory(): ظص {
      this.category
   }

   public override fun setEnabled(value: Boolean) {
      if (this.preferredEnabled != value) {
         this.preferredEnabled = value
         this.syncEnabledState()
         رٌ.INSTANCE.requestSave()
      }
   }

   protected fun mode(name: String, modes: List<String>, defaultIndex: Int = 0, configKey: String = name): ظي {
      val var5: ظي = ظي(name, modes, defaultIndex, configKey)
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
