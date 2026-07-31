-- Make flat textures transparent (delete this part if anything is breaking)
models.model:primaryRenderType("TRANSLUCENT_CULL")
-- Move nameplate to match model position
function events.tick()
    nameplate.entity:setPos(models.model.root:getTruePos()/20)
end
-- Fix emissive rendering under 1.21.4
function removeAlpha(color, x, y)
    color = color*color.a
    color.a = 1
    return color
end
function events.entity_init()
    if client:compareVersions("1.21.4", client:getVersionName()) == 1 then
        local textureList = textures:getTextures()
        for Index, Texture in pairs(textureList) do
            if Texture:getName():match("_e$") then
                local dimensions = Texture:getDimensions()
                Texture:applyFunc(0, 0, dimensions.x, dimensions.y, removeAlpha):update()
            end
        end
    end
end