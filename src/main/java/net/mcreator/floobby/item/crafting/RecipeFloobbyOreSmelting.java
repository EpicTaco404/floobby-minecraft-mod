
package net.mcreator.floobby.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.floobby.item.ItemFloobbyGem;
import net.mcreator.floobby.block.BlockFloobbyOre;
import net.mcreator.floobby.ElementsFloobby;

@ElementsFloobby.ModElement.Tag
public class RecipeFloobbyOreSmelting extends ElementsFloobby.ModElement {
	public RecipeFloobbyOreSmelting(ElementsFloobby instance) {
		super(instance, 49);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockFloobbyOre.block, (int) (1)), new ItemStack(ItemFloobbyGem.block, (int) (1)), 7F);
	}
}
