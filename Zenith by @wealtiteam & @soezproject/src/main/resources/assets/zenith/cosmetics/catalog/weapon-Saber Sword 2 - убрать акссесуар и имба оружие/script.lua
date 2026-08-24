-- This catalog entry is a sword cosmetic, not a full character model. The
-- original avatar hid PLAYER and ARMOR and rendered Saber over the wearer,
-- which made equipped armor disappear as soon as the sword was selected.
models.model.root:setVisible(false)

local heldSword = models.model.ItemV
heldSword:setParentType("Item")

function events.item_render(item)
   if item.id:find("sword") then
      return heldSword
   end
end
