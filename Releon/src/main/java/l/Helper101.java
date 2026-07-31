package l;

public enum Helper101 {
   DEFAULT("sf_medium"),
   REGULAR("sf_regular"),
   SEMI("sf_semibold"),
   BOLD("sf_bold"),
   BOLDED("bold"),
   MANROPEEXTRABOLD("manropeextrabold"),
   MANROPEBOLD("manropebold"),
   RICHREGULAR("rich_regular"),
   ICONRICHREG("iconrichreg"),
   INST("suisseintl"),
   ICONS("icons"),
   RELEONLOGO("releon_logo"),
   ICONSTYPENEW("icon2"),
   SOCIALS("socials"),
   GUIICONS("guiicons"),
   ICONSCATEGORY("categoryicons");

   private final String type;

   public String method921() {
      return this.type;
   }

   private Helper101(String var3) {
      this.type = var3;
   }
}
