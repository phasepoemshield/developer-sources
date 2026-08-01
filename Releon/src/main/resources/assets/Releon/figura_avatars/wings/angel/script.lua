-- Ангельские крылья с анимацией
-- Получаем модель крыльев (после создания в Blockbench)
local wings = models.model and models.model.Wings or nil

if wings then
    -- Начальная позиция
    wings:setPos(0, 0, 0)
    wings:setScale(1, 1, 1)
    
    -- Анимация крыльев
    local wingAngle = 0
    local flapSpeed = 0.1
    
    function events.tick()
        local velocity = player:getVelocity()
        local isFlying = velocity.y < -0.1 or player:isGliding()
        local isMoving = velocity:length() > 0.1
        
        if isFlying then
            -- Раскрываем крылья при полёте
            wingAngle = wingAngle + flapSpeed * 2
            local flap = math.sin(wingAngle) * 15
            wings:setRot(0, 0, 30 + flap)
        elseif isMoving then
            -- Лёгкое движение при ходьбе
            wingAngle = wingAngle + flapSpeed
            local flap = math.sin(wingAngle) * 5
            wings:setRot(0, 0, flap)
        else
            -- Складываем крылья в покое
            wings:setRot(0, 0, 0)
            wingAngle = 0
        end
    end
    
    -- Скрываем крылья когда надета элитра
    function events.render(delta)
        local hasElytra = player:getItem(5).id == "minecraft:elytra"
        wings:setVisible(not hasElytra)
    end
    
    -- Свечение крыльев (опционально)
    function events.world_render(delta)
        if player:isGlowing() then
            wings:setLight(15, 15)
        else
            wings:setLight(nil)
        end
    end
else
    -- Если модель не найдена, выводим предупреждение
    print("Wings model not found! Please create 'Wings' group in Blockbench model.")
end
