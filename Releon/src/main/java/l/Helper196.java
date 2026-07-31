package l;

public enum Helper196 {
   COMBAT("textures/teremok/hud/category/combat.png"),
   MOVEMENT("textures/teremok/hud/category/movement.png"),
   RENDER("textures/teremok/hud/category/render.png"),
   PLAYER("textures/teremok/hud/category/player.png"),
   MISC("textures/teremok/hud/category/misc.png"),
   INFO("textures/teremok/hud/category/info.png"),
   SUCCESS("textures/teremok/hud/category/success.png"),
   WARNING("textures/teremok/hud/category/warning.png"),
   ERROR("textures/teremok/hud/category/error.png"),
   ITEM("textures/teremok/hud/category/item.png");

   private final String iconPath;

   private Helper196(String var3) {
      this.iconPath = var3;
   }

   public String method1653() {
      return this.iconPath;
   }
}
