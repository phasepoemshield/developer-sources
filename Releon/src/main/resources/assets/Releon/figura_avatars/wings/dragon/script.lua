-- Драконьи крылья
local wings = models.model and models.model.Wings or nil

if wings then
    wings:setPos(0, 0, 0)
    wings:setScale(1.2, 1.2, 1.2) -- Драконьи крылья больше
    
    local wingAngle = 0
    local flapSpeed = 0.15
    
    function events.tick()
        local velocity = player:getVelocity()
        local isFlying = velocity.y < -0.1 or player:isGliding()
        
        if isFlying then
            wingAngle = wingAngle + flapSpeed * 2
            local flap = math.sin(wingAngle) * 20
            wings:setRot(0, 0, 35 + flap)
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
    print("Dragon Wings model not found!")
end
