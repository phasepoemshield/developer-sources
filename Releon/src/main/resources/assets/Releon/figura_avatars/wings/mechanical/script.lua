-- Механические крылья
local wings = models.model and models.model.Wings or nil

if wings then
    wings:setPos(0, 0, 0)
    wings:setScale(1, 1, 1)
    
    local wingAngle = 0
    local deployed = false
    
    function events.tick()
        local velocity = player:getVelocity()
        local isFlying = velocity.y < -0.1 or player:isGliding()
        
        if isFlying then
            -- Плавное раскрытие механических крыльев
            if not deployed then
                deployed = true
            end
            wingAngle = math.min(wingAngle + 0.05, 1)
            wings:setRot(0, 0, 45 * wingAngle)
        else
            -- Плавное складывание
            if deployed then
                deployed = false
            end
            wingAngle = math.max(wingAngle - 0.05, 0)
            wings:setRot(0, 0, 45 * wingAngle)
        end
    end
    
    function events.render(delta)
        local hasElytra = player:getItem(5).id == "minecraft:elytra"
        wings:setVisible(not hasElytra)
    end
else
    print("Mechanical Wings model not found!")
end
