-- Огненный меч
local customSword = models.model and models.model.ItemSword or nil

if customSword then
    customSword:setVisible(false)
    
    function events.render(delta)
        local heldItem = player:getHeldItem()
        
        if heldItem and (
            heldItem.id == "minecraft:diamond_sword" or
            heldItem.id == "minecraft:netherite_sword" or
            heldItem.id == "minecraft:iron_sword"
        ) then
            customSword:setVisible(true)
            vanilla_model.RIGHT_ITEM:setVisible(false)
        else
            customSword:setVisible(false)
            vanilla_model.RIGHT_ITEM:setVisible(true)
        end
    end
    
    function events.tick()
        local swingProgress = player:getSwingTime()
        
        if swingProgress > 0 then
            local angle = math.sin(swingProgress * math.pi) * 90
            customSword:setRot(-angle, 0, 0)
        else
            customSword:setRot(0, 0, 0)
        end
    end
    
    -- Огненное свечение
    function events.world_render(delta)
        customSword:setLight(15, 0)
    end
else
    print("Fire Sword model not found!")
end
