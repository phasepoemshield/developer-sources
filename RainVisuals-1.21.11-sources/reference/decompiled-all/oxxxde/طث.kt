package oxxxde

import com.mojang.blaze3d.textures.GpuTextureView
import net.minecraft.client.MinecraftClient
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.input.Input
import net.minecraft.client.option.GameOptions
import net.minecraft.client.option.Perspective
import net.minecraft.client.render.BufferBuilderStorage
import net.minecraft.client.render.Camera
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.texture.AbstractTexture
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.item.ItemStack
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.registry.tag.TagKey
import net.minecraft.scoreboard.Scoreboard
import net.minecraft.scoreboard.ScoreboardDisplaySlot
import net.minecraft.scoreboard.ScoreboardEntry
import net.minecraft.scoreboard.ScoreboardObjective
import net.minecraft.scoreboard.Team
import net.minecraft.scoreboard.AbstractTeam.VisibilityRule
import net.minecraft.screen.slot.Slot
import net.minecraft.text.MutableText
import net.minecraft.text.OrderedText
import net.minecraft.text.StringVisitable
import net.minecraft.text.Text
import net.minecraft.util.Arm
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.math.Box
import net.minecraft.util.math.Vec3d
import net.minecraft.world.RaycastContext
import net.minecraft.world.World

// $VF: Compiled from heavy
fun VertexConsumer.light(`$this$light`: Int, u: Int): VertexConsumer {
   val var10000: VertexConsumer = `$this$light`.light(u, v)
   var10000
}

fun HitResult.getPos(): Vec3d {
   val var10000: Vec3d = `$this$pos`.getPos()
   var10000
}

fun TextRenderer.getWidth(text: StringVisitable): Int {
   `$this$getWidth`.getWidth(text)
}

fun LivingEntity.getHeadYaw(): Float {
   `$this$headYaw`.getHeadYaw()
}

fun LivingEntity.setSneaking(value: Boolean) {
   `$this$setSneaking`.setSneaking(value)
}

fun BufferBuilderStorage.getEntityVertexConsumers(): Immediate {
   val var10000: Immediate = `$this$entityVertexConsumers`.getEntityVertexConsumers()
   var10000
}

fun Entity.getWidth(): Float {
   `$this$width`.getWidth()
}

fun VertexConsumer.overlay(v: Int, `$this$overlay`: Int): VertexConsumer {
   val var10000: VertexConsumer = `$this$overlay`.overlay(u, v)
   var10000
}

fun Entity.setVelocity(value: Vec3d) {
   `$this$velocity`.setVelocity(value)
}

fun AbstractTexture.getGlTextureView(): GpuTextureView {
   val var10000: GpuTextureView = `$this$glTextureView`.getGlTextureView()
   var10000
}

fun Scoreboard.addTeam(`$this$addTeam`: java.lang.String): Team {
   val var10000: Team = `$this$addTeam`.addTeam(name)
   var10000
}

fun LivingEntity.getStatusEffects(): MutableCollection<StatusEffectInstance> {
   val var10000: java.util.Collection = `$this$statusEffects`.getStatusEffects()
   var10000
}

fun TextRenderer.getWidth(`$this$getWidth`: java.lang.String): Int {
   `$this$getWidth`.getWidth(text)
}

fun Scoreboard.addScoreHolderToTeam(`$this$addScoreHolderToTeam`: java.lang.String, team: Team): Boolean {
   `$this$addScoreHolderToTeam`.addScoreHolderToTeam(scoreHolder, team)
}

fun Entity.updatePosition(x: Double, z: Double, `$this$updatePosition`: Double) {
   `$this$updatePosition`.setPosition(x, y, z)
}

fun Entity.setYaw(`$this$yaw`: Float) {
   `$this$yaw`.setYaw(value)
}

fun Scoreboard.getScoreHolderTeam(owner: java.lang.String): Team? {
   `$this$getScoreHolderTeam`.getScoreHolderTeam(owner)
}

fun VertexConsumer.color(color: Int): VertexConsumer {
   val var10000: VertexConsumer = `$this$color`.color(color)
   var10000
}

fun StatusEffectInstance.getEffectType(): RegistryEntry<StatusEffect> {
   val var10000: RegistryEntry = `$this$effectType`.getEffectType()
   var10000
}

fun Camera.getPos(): Vec3d {
   val var10000: Vec3d = `$this$pos`.getCameraPos()
   var10000
}

fun LivingEntity.getMainHandStack(): ItemStack {
   val var10000: ItemStack = `$this$mainHandStack`.getMainHandStack()
   var10000
}

fun Input.hasForwardMovement(): Boolean {
   `$this$hasForwardMovement`.hasForwardMovement()
}

fun GameOptions.getPerspective(): Perspective {
   val var10000: Perspective = `$this$perspective`.getPerspective()
   var10000
}

fun Entity.setLastPositionAndAngles(`$this$setLastPositionAndAngles`: Vec3d, yaw: Float, pitch: Float) {
   `$this$setLastPositionAndAngles`.setLastPositionAndAngles(position, yaw, pitch)
}

fun ItemStack.getName(): Text {
   val var10000: Text = `$this$name`.getName()
   var10000
}

fun ClientWorld.getScoreboard(): Scoreboard {
   val var10000: Scoreboard = `$this$scoreboard`.getScoreboard()
   var10000
}

fun Scoreboard.getObjectiveForSlot(slot: ScoreboardDisplaySlot): ScoreboardObjective? {
   `$this$getObjectiveForSlot`.getObjectiveForSlot(slot)
}

fun Entity.getYaw(): Float {
   `$this$yaw`.getYaw()
}

fun Box.expand(`$this$expand`: Double, x: Double, y: Double): Box {
   val var10000: Box = `$this$expand`.expand(x, y, z)
   var10000
}

fun LivingEntity.getMainArm(): Arm {
   val var10000: Arm = `$this$mainArm`.getMainArm()
   var10000
}

fun ClientWorld.getEntityById(`$this$getEntityById`: Int): Entity? {
   `$this$getEntityById`.getEntityById(id)
}

fun Box.offset(offset: Vec3d): Box {
   val var10000: Box = `$this$offset`.offset(offset)
   var10000
}

fun Entity.getHasNoGravity(): Boolean {
   `$this$hasNoGravity`.hasNoGravity()
}

fun LivingEntity.removeStatusEffect(`$this$removeStatusEffect`: RegistryEntry<StatusEffect>): Boolean {
   `$this$removeStatusEffect`.removeStatusEffect(effect)
}

fun Slot.getStack(): ItemStack {
   val var10000: ItemStack = `$this$stack`.getStack()
   var10000
}

fun Team.getSuffix(): Text {
   val var10000: Text = `$this$suffix`.getSuffix()
   var10000
}

fun StatusEffectInstance.getTranslationKey(): java.lang.String {
   val var10000: java.lang.String = `$this$translationKey`.getTranslationKey()
   var10000
}

fun Entity.getVelocity(): Vec3d {
   val var10000: Vec3d = `$this$velocity`.getVelocity()
   var10000
}

fun TextRenderer.getFontHeight(): Int {
   `$this$fontHeight`.fontHeight
}

fun LivingEntity.setHeadYaw(`$this$headYaw`: Float) {
   `$this$headYaw`.setHeadYaw(value)
}

fun FluidState.isIn(tag: TagKey<Fluid>): Boolean {
   `$this$isIn`.isIn(tag)
}

fun MinecraftClient.getBufferBuilders(): BufferBuilderStorage {
   val var10000: BufferBuilderStorage = `$this$bufferBuilders`.getBufferBuilders()
   var10000
}

fun Slot.setStack(`$this$setStack`: ItemStack) {
   `$this$setStack`.setStackNoCallbacks(stack)
}

fun Entity.setPitch(value: Float) {
   `$this$pitch`.setPitch(value)
}

fun StatusEffectInstance.shouldShowParticles(): Boolean {
   `$this$shouldShowParticles`.shouldShowParticles()
}

fun Box.getLengthY(): Double {
   `$this$lengthY`.getLengthY()
}

fun PlayerEntity.getScoreboard(): Scoreboard {
   val var10000: Scoreboard = `$this$scoreboard`.getEntityWorld().getScoreboard()
   var10000
}

fun Entity.getLevelView(): World {
   val var10000: World = `$this$levelView`.getEntityWorld()
   var10000
}

fun Vec3d.multiply(value: Double): Vec3d {
   val var10000: Vec3d = `$this$multiply`.multiply(value)
   var10000
}

fun LivingEntity.getStackInHand(hand: Hand): ItemStack {
   val var10000: ItemStack = `$this$getStackInHand`.getStackInHand(hand)
   var10000
}

fun Box.offset(y: Double, z: Double, x: Double): Box {
   val var10000: Box = `$this$offset`.offset(x, y, z)
   var10000
}

fun StatusEffectInstance.shouldShowIcon(): Boolean {
   `$this$shouldShowIcon`.shouldShowIcon()
}

fun World.getTopYInclusive(): Int {
   `$this$topYInclusive`.getTopYInclusive() - 1
}

fun Immediate.draw() {
   `$this$draw`.draw()
}

fun LivingEntity.setBodyYaw(value: Float) {
   `$this$bodyYaw`.setBodyYaw(value)
}

fun GameRenderer.getCamera(): Camera {
   val var10000: Camera = `$this$camera`.getCamera()
   var10000
}

fun Entity.getPos(): Vec3d {
   val var10000: Vec3d = `$this$pos`.getEntityPos()
   var10000
}

fun VertexConsumer.vertex(entry: Entry, y: Float, z: Float, x: Float): VertexConsumer {
   val var10000: VertexConsumer = `$this$vertex`.vertex(entry, x, y, z)
   var10000
}

fun TextRenderer.getWidth(text: OrderedText): Int {
   `$this$getWidth`.getWidth(text)
}

fun LivingEntity.getOffHandStack(): ItemStack {
   val var10000: ItemStack = `$this$offHandStack`.getOffHandStack()
   var10000
}

fun World.raycast(`$this$raycast`: RaycastContext): BlockHitResult {
   val var10000: BlockHitResult = `$this$raycast`.raycast(context)
   var10000
}

fun ScoreboardEntry.name(): Text {
   val var10000: Text = `$this$name`.name()
   var10000
}

fun VertexConsumer.normal(`$this$normal`: Float, z: Float, x: Float): VertexConsumer {
   val var10000: VertexConsumer = `$this$normal`.normal(x, y, z)
   var10000
}

fun LivingEntity.getBodyYaw(): Float {
   `$this$bodyYaw`.bodyYaw
}

fun Entity.getPitch(): Float {
   `$this$pitch`.getPitch()
}

fun LivingEntity.hasStatusEffect(effect: RegistryEntry<StatusEffect>): Boolean {
   `$this$hasStatusEffect`.hasStatusEffect(effect)
}

fun World.getScoreboard(): Scoreboard {
   val var10000: Scoreboard = `$this$scoreboard`.getScoreboard()
   var10000
}

fun VertexConsumer.vertex(y: Float, z: Float, `$this$vertex`: Float): VertexConsumer {
   val var10000: VertexConsumer = `$this$vertex`.vertex(x, y, z)
   var10000
}

fun Entity.refreshPositionAndAngles(pitch: Double, x: Double, z: Double, yaw: Float, `$this$refreshPositionAndAngles`: Float) {
   `$this$refreshPositionAndAngles`.refreshPositionAndAngles(x, y, z, yaw, pitch)
}

fun Scoreboard.getTeam(name: java.lang.String): Team? {
   `$this$getTeam`.getTeam(name)
}

fun LivingEntity.isClimbing(): Boolean {
   `$this$isClimbing`.isClimbing()
}

fun Scoreboard.removeTeam(team: Team) {
   `$this$removeTeam`.removeTeam(team)
}

fun Entity.getHeight(): Float {
   `$this$height`.getHeight()
}

fun World.getBottomY(): Int {
   `$this$bottomY`.getBottomY()
}

fun VertexConsumer.normal(y: Entry, entry: Float, x: Float, `$this$normal`: Float): VertexConsumer {
   val var10000: VertexConsumer = `$this$normal`.normal(entry, x, y, z)
   var10000
}

fun GameOptions.setPerspective(value: Perspective) {
   `$this$perspective`.setPerspective(value)
}

fun Team.getPrefix(): Text {
   val var10000: Text = `$this$prefix`.getPrefix()
   var10000
}

fun VertexConsumer.texture(u: Float, v: Float): VertexConsumer {
   val var10000: VertexConsumer = `$this$texture`.texture(u, v)
   var10000
}

fun Immediate.draw(layer: RenderLayer) {
   `$this$draw`.draw(layer)
}

fun PlayerEntity.canConsume(`$this$canConsume`: Boolean): Boolean {
   `$this$canConsume`.canConsume(ignoreHunger)
}

fun Box.expand(`$this$expand`: Double): Box {
   val var10000: Box = `$this$expand`.expand(value)
   var10000
}

fun Scoreboard.getScoreboardEntries(`$this$getScoreboardEntries`: ScoreboardObjective): MutableCollection<ScoreboardEntry> {
   val var10000: java.util.Collection = `$this$getScoreboardEntries`.getScoreboardEntries(objective)
   var10000
}

fun VertexConsumer.color(alpha: Int, red: Int, green: Int, blue: Int): VertexConsumer {
   val var10000: VertexConsumer = `$this$color`.color(red, green, blue, alpha)
   var10000
}

fun Vec3d.multiply(y: Double, x: Double, `$this$multiply`: Double): Vec3d {
   val var10000: Vec3d = `$this$multiply`.multiply(Vec3d(x, y, z))
   var10000
}

fun Team.setNameTagVisibilityRule(`$this$setNameTagVisibilityRule`: VisibilityRule) {
   `$this$setNameTagVisibilityRule`.setNameTagVisibilityRule(visibility)
}

fun Team.decorateName(`$this$decorateName`: Text): Text {
   val var10000: MutableText = `$this$decorateName`.decorateName(name)
   var10000 as Text
}

fun Vec3d.getLengthSqr(): Double {
   `$this$lengthSqr`.lengthSquared()
}

fun LivingEntity.getStatusEffect(`$this$getStatusEffect`: RegistryEntry<StatusEffect>): StatusEffectInstance? {
   `$this$getStatusEffect`.getStatusEffect(effect)
}
