package mouy.mmucrafting;

import mouy.mmucrafting.datagen.ItemTagProvider;
import mouy.mmucrafting.datagen.RecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MouysMinecraftUpdateCraftingDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		fabricDataGenerator.createPack().addProvider(RecipeProvider::new);
		fabricDataGenerator.createPack().addProvider(ItemTagProvider::new);
	}
}
