-- The avatar contains a display-only duplicate in model.bbmodel. Keep only
-- the authored sword model for the held-item replacement.
models.model:setVisible(false)

local heldSword = models.sword.sword
heldSword.scabbard:setVisible(false)

-- The blade was authored point-down: its crossguard sits at y = 23.11, the long
-- edge runs from there down to the tip at y = 0.33, and the grip with the pommel
-- stands above the guard up to y = 31.94. Vanilla held items expect the opposite
-- - blade along +Y with the grip below the origin - so put the guard on the item
-- origin and flip the part once, here, instead of every frame.
--
-- The earlier pivot (y = 27.48) sat in the middle of the grip, which pushed the
-- guard and pommel out of the first-person frustum and left only a bare blade on
-- screen. Scale 0.90 gives 28.4 units overall (22.8 of blade above the hand,
-- 8.8 of grip below it), the same envelope as the other weapon entries in this
-- catalog - Saber Sword 2 measures 28.7 with 21.4 above the hand.
local itemRoot = models:newPart("SalerraItem", "ITEM")
heldSword:moveTo(itemRoot)
heldSword:setPos(0.80, -23.11, 0.88)
itemRoot:setRot(0, 0, 180)
itemRoot:setScale(0.90)

-- Figura's ITEM parent type already applies the vanilla per-mode item transform,
-- so return the part unchanged the way the other catalog weapons do. The removed
-- per-mode branch scaled first person to 0.30 and tilted it +45 against third
-- person's -45, which is what threw the sword into the corner of the screen.
function events.item_render(item)
   if item.id:find("sword") then
      return itemRoot
   end
end
