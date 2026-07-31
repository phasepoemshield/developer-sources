package ru.destra.gui;

import net.minecraft.client.gui.DrawContext;

public interface ClickGuiElement {
   void mouseMoved(double var1, double var3, int var5);
   void charTyped(char var1, int var2);
   void render(DrawContext var1, int var2, int var3);
   void mouseClicked(double var1, double var3, int var5);
   void resize(int var1, int var2, int var3);
}
