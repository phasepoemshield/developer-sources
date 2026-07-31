-- Крылья бабочки
local wings = models.model and models.model.Wings or nil

if wings then
    wings:setPos(0, 0, 0)
    wings:setScale(0.8, 0.8, 0.8)
    
    local wingAngle = 0
    
    function events.tick()
        local velocity = player:getVelocity()
        local isFlying = velocity.y < -0.1 or player:isGliding()
        local isMoving = velocity:length() > 0.1
        
        if isFlying or isMoving then
            -- Быстрое трепетание как у бабочки
            wingAngle = wingAngle + 0.3
            local flap = math.sin(wingAngle) * 10
            wings:setRot(0, 0, 15 + flap)
        else
            wings:setRot(0, 0, 0)
            wingAngle = 0
        end
    end
    
    function events.render(delta)
        local hasElytra = player:getItem(5).id == "minecraft:elytra"
        wings:setVisible(not hasElytra)
    end
else
    print("Butterfly Wings model not found!")
end
