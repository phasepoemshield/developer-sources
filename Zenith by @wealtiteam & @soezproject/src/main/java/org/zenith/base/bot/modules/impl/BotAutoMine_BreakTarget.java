package org.zenith.base.bot.modules.impl;

import org.zenith.module.Bot;

import org.zenith.rotation.Rotation;














import net.minecraft.util.hit.BlockHitResult;

record BotAutoMine_BreakTarget(Rotation rotation, BlockHitResult hitResult, int drillCoverage, double distanceSquared) {
}
