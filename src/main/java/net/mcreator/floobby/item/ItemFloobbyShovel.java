
package net.mcreator.floobby.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.floobby.ElementsFloobby;

import java.util.Set;
import java.util.HashMap;

@ElementsFloobby.ModElement.Tag
public class ItemFloobbyShovel extends ElementsFloobby.ModElement {
	@GameRegistry.ObjectHolder("floobby:floobbyshovel")
	public static final Item block = null;
	public ItemFloobbyShovel(ElementsFloobby instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("FLOOBBYSHOVEL", 20, 6280, 24f, 16f, 140)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 20);
				return ret.keySet();
			}
		}.setUnlocalizedName("floobbyshovel").setRegistryName("floobbyshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("floobby:floobbyshovel", "inventory"));
	}
}
