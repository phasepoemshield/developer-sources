-- Кастомная катана
-- Получаем модель меча (после создания в Blockbench)
local customSword = models.model and models.model.ItemSword or nil

if customSword then
    -- Скрываем по умолчанию
    customSword:setVisible(false)
    
    -- Показываем кастомный меч вместо обычного
    function events.render(delta)
        local heldItem = player:getHeldItem()
        
        if heldItem and (
            heldItem.id == "minecraft:diamond_sword" or
            heldItem.id == "minecraft:netherite_sword" or
            heldItem.id == "minecraft:iron_sword" or
            heldItem.id == "minecraft:golden_sword"
        ) then
            -- Показываем кастомный меч
            customSword:setVisible(true)
            -- Скрываем оригинальный меч
            vanilla_model.RIGHT_ITEM:setVisible(false)
        else
            -- Показываем оригинальный предмет
            customSword:setVisible(false)
            vanilla_model.RIGHT_ITEM:setVisible(true)
        end
    end
    
    -- Анимация взмаха меча
    function events.tick()
        local swingProgress = player:getSwingTime()
        
        if swingProgress > 0 then
            -- Поворачиваем меч при ударе
            local angle = math.sin(swingProgress * math.pi) * 90
            customSword:setRot(-angle, 0, 0)
        else
            -- Возвращаем в исходное положение
            customSword:setRot(0, 0, 0)
        end
    end
    
    -- Эффект свечения при критическом ударе
    function events.world_render(delta)
        if player:getSwingTime() > 0.5 and player:getVelocity().y < 0 then
            -- Критический удар - добавляем свечение
            customSword:setLight(15, 15)
        else
            customSword:setLight(nil)
        end
    end
else
    -- Если модель не найдена, выводим предупреждение
    print("Sword model not found! Please create 'ItemSword' group in Blockbench model.")
end
