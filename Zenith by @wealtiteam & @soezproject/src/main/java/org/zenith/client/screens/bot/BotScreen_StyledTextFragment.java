package org.zenith.client.screens.bot;

import org.zenith.module.Bot;

import org.zenith.base.font.Font;
import org.zenith.core.BotFeatureRegistry;














import net.minecraft.text.Style;
import net.minecraft.text.Text;

record BotScreen_StyledTextFragment(String value, Style style) {

   public Text asText() {
      return Text.literal(this.value).setStyle(this.style);
   }

   public float width(Font var1) {
      return var1.width(this.asText());
   }

   public boolean isLineBreak() {
      return "\n".equals(this.value) || "\r".equals(this.value);
   }

   public boolean isWhitespace() {
      return !this.value.isEmpty() && !this.isLineBreak() ? Character.isWhitespace(this.value.codePointAt(0)) : false;
   }
}
