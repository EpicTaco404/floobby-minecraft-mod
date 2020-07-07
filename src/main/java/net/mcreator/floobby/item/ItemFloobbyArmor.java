
package net.mcreator.floobby.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.floobby.ElementsFloobby;

@ElementsFloobby.ModElement.Tag
public class ItemFloobbyArmor extends ElementsFloobby.ModElement {
	@GameRegistry.ObjectHolder("floobby:floobbyarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("floobby:floobbyarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("floobby:floobbyarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("floobby:floobbyarmorboots")
	public static final Item boots = null;
	public ItemFloobbyArmor(ElementsFloobby instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FLOOBBYARMOR", "floobby:floobby", 150, new int[]{20, 60, 50, 20}, 90,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("floobbyarmorhelmet")
				.setRegistryName("floobbyarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("floobbyarmorbody")
				.setRegistryName("floobbyarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("floobbyarmorlegs")
				.setRegistryName("floobbyarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("floobbyarmorboots")
				.setRegistryName("floobbyarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("floobby:floobbyarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("floobby:floobbyarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("floobby:floobbyarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("floobby:floobbyarmorboots", "inventory"));
	}
}
