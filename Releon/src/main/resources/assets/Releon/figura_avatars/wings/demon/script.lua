-- Демонические крылья
local wings = models.model and models.model.Wings or nil

if wings then
    wings:setPos(0, 0, 0)
    wings:setScale(1, 1, 1)
    
    local wingAngle = 0
    
    function events.tick()
        local velocity = player:getVelocity()
        local isFlying = velocity.y < -0.1 or player:isGliding()
        
        if isFlying then
            wingAngle = wingAngle + 0.2
            local flap = math.sin(wingAngle) * 25
            wings:setRot(0, 0, 40 + flap)
        else
            wings:setRot(0, 0, 0)
            wingAngle = 0
        end
    end
    
    function events.render(delta)
        local hasElytra = player:getItem(5).id == "minecraft:elytra"
        wings:setVisible(not hasElytra)
    end
    
    -- Красное свечение для демонических крыльев
    function events.world_render(delta)
        wings:setLight(15, 0)
    end
else
    print("Demon Wings model not found!")
end
