package oxxxde

import java.awt.Color
import java.util.UUID
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object زب : دِ("TotemTracker", ظن.getPLAYER(), "Информация о сносе тотема противнику") {
   private final var cachedTargetId: UUID?
   private final val regularColor: Color = Color(255, 85, 85)
   private final val enchantedColor: Color = Color(85, 255, 85)
   private final var cachedTotemEnchanted: Boolean?

   public override fun onDisable() {
      this.resetCache()
   }

   fun PlayerEntity.heldTotem(): ItemStack {
      if (طث.getMainHandStack(`$this$heldTotem` as LivingEntity).isOf(Items.TOTEM_OF_UNDYING)) {
         طث.getMainHandStack(`$this$heldTotem` as LivingEntity)
      } else {
         if (طث.getOffHandStack(`$this$heldTotem` as LivingEntity).isOf(Items.TOTEM_OF_UNDYING))
            طث.getOffHandStack(`$this$heldTotem` as LivingEntity)
            else
            null
         }
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      ظً.INSTANCE.update()
      this.syncCachedTargetState()
   }

   @Commando
   @Compile
   public fun onAttack(event: ذم) {
      val var2: Entity = event.getEntity()
      if (var2 is PlayerEntity) {
         if (this.isUsableTarget(var2 as PlayerEntity)) {
            ظً.INSTANCE.track(var2 as PlayerEntity)
            this.cacheTarget(var2 as PlayerEntity)
         }
      }
   }

   fun cacheTarget(target: PlayerEntity) {
      if (!(cachedTargetId == target.getUuid())) {
         cachedTargetId = target.getUuid()
         cachedTotemEnchanted = null
      }

      val var10000: ItemStack = this.heldTotem(target)
      if (var10000 != null) {
         cachedTotemEnchanted = var10000.hasGlint()
      }
   }

   private fun resetCache() {
      cachedTargetId = null
      cachedTotemEnchanted = null
   }

   @Commando
   public fun onTotemPop(event: رك) {
      ظً.INSTANCE.update()
      this.syncCachedTargetState()
      val var10000: PlayerEntity = this.activeTarget()
      if (var10000 != null) {
         val poppedPlayer: PlayerEntity = event.getPlayer()
         if (poppedPlayer.getUuid() == var10000.getUuid()) {
            val var6: Boolean
            if (cachedTotemEnchanted != null) {
               var6 = cachedTotemEnchanted
            } else {
               val var7: ItemStack = this.heldTotem(poppedPlayer)
               val var8: java.lang.Boolean = if (var7 != null) var7.hasGlint() else null
               var6 = var8 != null && var8
            }

            سِ.INSTANCE
               .showMessage(
                  this,
                  "q",
                  CollectionsKt.listOf(
                     طإ("Вы снесли ", null, false, 6, null),
                     طإ(if (var6) "зачарованый" else "обычный", if (var6) enchantedColor else regularColor, false, 4, null),
                     طإ(" тотем игроку ${poppedPlayer.getGameProfile().name()}!", null, false, 6, null)
                  )
               )
            }
      }
   }

   private fun syncCachedTargetState() {
      val target: PlayerEntity = this.activeTarget()
      if (target == null) {
         this.resetCache()
      } else {
         this.cacheTarget(target)
      }
   }

   fun isUsableTarget(player: PlayerEntity): Boolean {
      !(player == ضك.getMc().player) && !player.isRemoved() && player.isAlive() && !player.isInvisible() && !اإ.INSTANCE.isFakePlayer(player as Entity)
   }

   fun activeTarget(): PlayerEntity {
      val var10000: PlayerEntity = ظً.INSTANCE.currentTarget()
      if (var10000 == null) {
         null
      } else {
         if (this.isUsableTarget(var10000)) var10000 else null
      }
   }

   public override fun onEnable() {
      this.resetCache()
   }
}
