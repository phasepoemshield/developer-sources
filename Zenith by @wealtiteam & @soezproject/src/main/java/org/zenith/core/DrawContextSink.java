package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Interface;


import net.minecraft.client.gui.DrawContext;

public interface DrawContextSink {
   boolean zenith_betterMinecraft_isClosingAnimation();

   void zenith_betterMinecraft_popScaleIfNeeded(DrawContext var1);

   void zenith_betterMinecraft_finishClosingAnimation();
}
