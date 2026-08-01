package ru.destra.gui;

import net.minecraft.client.gui.DrawContext;

public interface GuiInputElement {
   void charTyped(char var1, int var2);
   void render(DrawContext var1, int var2, int var3);
   void keyPressed(int var1, int var2, int var3);
   void mouseReleased(double var1, double var3, int var5);
   void mouseClicked(double var1, double var3, int var5);
}
