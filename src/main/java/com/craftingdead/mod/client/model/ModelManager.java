package com.craftingdead.mod.client.model;

import com.craftingdead.mod.CraftingDead;
import com.craftingdead.mod.client.ClientMod;
import com.craftingdead.mod.client.renderer.item.GunRenderer;
import com.craftingdead.mod.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModelManager {

	private final ClientMod client;
	private final BuiltinModelLoader builtinModelLoader;

	public ModelManager(ClientMod client) {
		this.client = client;
		this.builtinModelLoader = new BuiltinModelLoader();
	}

	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event) {
		ModelLoaderRegistry.registerLoader(this.builtinModelLoader);

		this.registerItemModel(ModItems.ACR,
				new GunRenderer(this.client, new ResourceLocation(CraftingDead.MOD_ID, "item/acr")));
		this.registerItemModel(ModItems.AK47,
				new GunRenderer(this.client, new ResourceLocation(CraftingDead.MOD_ID, "item/ak47")));
		this.registerItemModel(ModItems.DESERT_EAGLE,
				new GunRenderer(this.client, new ResourceLocation(CraftingDead.MOD_ID, "item/desert_eagle")));

		this.registerItemModel(ModItems.RESIDENTIAL_LOOT, "normal");
	}

	private void registerItemModel(Item item, IModel builtinModel) {
		this.builtinModelLoader.registerModel(registerItemModel(item, "normal"), builtinModel);
	}

	private ModelResourceLocation registerItemModel(Item item, String modelVariant) {
		ModelResourceLocation modelLocation = new ModelResourceLocation(item.getRegistryName(), modelVariant);
		ModelLoader.setCustomModelResourceLocation(item, 0, modelLocation);
		return modelLocation;
	}

}