local zwei = models.zweisword and models.zweisword.ItemZwei or nil

function events.item_render(item, context)
    if zwei and item.id == "minecraft:netherite_sword" then
        local scale = 1
        if context:find("FIRST_PERSON") then
            scale = 0.75
        end
        return zwei:setScale(scale)
    end
end
