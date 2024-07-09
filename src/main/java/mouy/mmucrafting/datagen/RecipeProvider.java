package mouy.mmucrafting.datagen;

import mouy.mmucrafting.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

    // New Recipes
        // Block Cutting
            // Acacia
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_BUTTON, Items.ACACIA_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_BUTTON, Items.STRIPPED_ACACIA_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_BUTTON, Items.ACACIA_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_BUTTON, Items.STRIPPED_ACACIA_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_BUTTON, Items.ACACIA_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_DOOR, Items.ACACIA_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_DOOR, Items.STRIPPED_ACACIA_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_DOOR, Items.ACACIA_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_DOOR, Items.STRIPPED_ACACIA_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_DOOR, Items.ACACIA_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_PRESSURE_PLATE, Items.ACACIA_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_PRESSURE_PLATE, Items.STRIPPED_ACACIA_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_PRESSURE_PLATE, Items.ACACIA_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_PRESSURE_PLATE, Items.STRIPPED_ACACIA_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_PRESSURE_PLATE, Items.ACACIA_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, Items.ACACIA_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, Items.STRIPPED_ACACIA_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, Items.ACACIA_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, Items.STRIPPED_ACACIA_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, Items.ACACIA_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, Items.ACACIA_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_PLANKS, Items.ACACIA_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_PLANKS, Items.STRIPPED_ACACIA_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_PLANKS, Items.ACACIA_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_PLANKS, Items.STRIPPED_ACACIA_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_SLAB, Items.ACACIA_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_SLAB, Items.STRIPPED_ACACIA_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_SLAB, Items.ACACIA_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_SLAB, Items.STRIPPED_ACACIA_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_SLAB, Items.ACACIA_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, Items.ACACIA_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, Items.STRIPPED_ACACIA_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, Items.ACACIA_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, Items.STRIPPED_ACACIA_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, Items.ACACIA_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_ACACIA_WOOD, Items.ACACIA_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_ACACIA_WOOD, Items.STRIPPED_ACACIA_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_ACACIA_WOOD, Items.ACACIA_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_ACACIA_LOG, Items.ACACIA_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_WOOD, Items.ACACIA_LOG, 1);

            // Bamboo
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_BUTTON, Items.BAMBOO_BLOCK, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_BUTTON, Items.STRIPPED_BAMBOO_BLOCK, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_BUTTON, Items.BAMBOO_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_DOOR, Items.BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_DOOR, Items.STRIPPED_BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_DOOR, Items.BAMBOO_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_PRESSURE_PLATE, Items.BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_PRESSURE_PLATE, Items.STRIPPED_BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_PRESSURE_PLATE, Items.BAMBOO_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_TRAPDOOR, Items.BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_TRAPDOOR, Items.STRIPPED_BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_TRAPDOOR, Items.BAMBOO_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BAMBOO_TRAPDOOR, Items.BAMBOO_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC, Items.BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC, Items.STRIPPED_BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC, Items.BAMBOO_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_SLAB, Items.BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_SLAB, Items.STRIPPED_BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_SLAB, Items.BAMBOO_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_SLAB, Items.BAMBOO_MOSAIC, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, Items.BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, Items.STRIPPED_BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, Items.BAMBOO_PLANKS, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, Items.BAMBOO_MOSAIC, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_PLANKS, Items.BAMBOO_BLOCK, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_PLANKS, Items.STRIPPED_BAMBOO_BLOCK, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_SLAB, Items.BAMBOO_BLOCK, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_SLAB, Items.STRIPPED_BAMBOO_BLOCK, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_SLAB, Items.BAMBOO_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_STAIRS, Items.BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_STAIRS, Items.STRIPPED_BAMBOO_BLOCK, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_STAIRS, Items.BAMBOO_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_BAMBOO_BLOCK, Items.BAMBOO_BLOCK, 1);

            // Birch
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_BUTTON, Items.BIRCH_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_BUTTON, Items.STRIPPED_BIRCH_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_BUTTON, Items.BIRCH_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_BUTTON, Items.STRIPPED_BIRCH_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_BUTTON, Items.BIRCH_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_DOOR, Items.BIRCH_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_DOOR, Items.STRIPPED_BIRCH_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_DOOR, Items.BIRCH_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_DOOR, Items.STRIPPED_BIRCH_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_DOOR, Items.BIRCH_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_PRESSURE_PLATE, Items.BIRCH_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_PRESSURE_PLATE, Items.STRIPPED_BIRCH_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_PRESSURE_PLATE, Items.BIRCH_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_PRESSURE_PLATE, Items.STRIPPED_BIRCH_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_PRESSURE_PLATE, Items.BIRCH_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, Items.BIRCH_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, Items.STRIPPED_BIRCH_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, Items.BIRCH_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, Items.STRIPPED_BIRCH_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, Items.BIRCH_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, Items.BIRCH_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_PLANKS, Items.BIRCH_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_PLANKS, Items.STRIPPED_BIRCH_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_PLANKS, Items.BIRCH_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_PLANKS, Items.STRIPPED_BIRCH_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_SLAB, Items.BIRCH_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_SLAB, Items.STRIPPED_BIRCH_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_SLAB, Items.BIRCH_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_SLAB, Items.STRIPPED_BIRCH_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_SLAB, Items.BIRCH_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, Items.BIRCH_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, Items.STRIPPED_BIRCH_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, Items.BIRCH_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, Items.STRIPPED_BIRCH_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, Items.BIRCH_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_BIRCH_WOOD, Items.BIRCH_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_BIRCH_WOOD, Items.STRIPPED_BIRCH_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_BIRCH_WOOD, Items.BIRCH_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_BIRCH_LOG, Items.BIRCH_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_WOOD, Items.BIRCH_LOG, 1);

            // Cherry
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_BUTTON, Items.CHERRY_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_BUTTON, Items.STRIPPED_CHERRY_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_BUTTON, Items.CHERRY_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_BUTTON, Items.STRIPPED_CHERRY_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_BUTTON, Items.CHERRY_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_DOOR, Items.CHERRY_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_DOOR, Items.STRIPPED_CHERRY_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_DOOR, Items.CHERRY_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_DOOR, Items.STRIPPED_CHERRY_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_DOOR, Items.CHERRY_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_PRESSURE_PLATE, Items.CHERRY_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_PRESSURE_PLATE, Items.STRIPPED_CHERRY_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_PRESSURE_PLATE, Items.CHERRY_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_PRESSURE_PLATE, Items.STRIPPED_CHERRY_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_PRESSURE_PLATE, Items.CHERRY_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, Items.CHERRY_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, Items.STRIPPED_CHERRY_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, Items.CHERRY_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, Items.STRIPPED_CHERRY_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, Items.CHERRY_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, Items.CHERRY_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_PLANKS, Items.CHERRY_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_PLANKS, Items.STRIPPED_CHERRY_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_PLANKS, Items.CHERRY_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_PLANKS, Items.STRIPPED_CHERRY_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_SLAB, Items.CHERRY_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_SLAB, Items.STRIPPED_CHERRY_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_SLAB, Items.CHERRY_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_SLAB, Items.STRIPPED_CHERRY_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_SLAB, Items.CHERRY_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, Items.CHERRY_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, Items.STRIPPED_CHERRY_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, Items.CHERRY_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, Items.STRIPPED_CHERRY_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, Items.CHERRY_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CHERRY_WOOD, Items.CHERRY_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CHERRY_WOOD, Items.STRIPPED_CHERRY_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CHERRY_WOOD, Items.CHERRY_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CHERRY_LOG, Items.CHERRY_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_WOOD, Items.CHERRY_LOG, 1);

            // Crimson
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_BUTTON, Items.CRIMSON_STEM, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_BUTTON, Items.STRIPPED_CRIMSON_STEM, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_BUTTON, Items.CRIMSON_HYPHAE, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_BUTTON, Items.STRIPPED_CRIMSON_HYPHAE, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_BUTTON, Items.CRIMSON_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_DOOR, Items.CRIMSON_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_DOOR, Items.STRIPPED_CRIMSON_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_DOOR, Items.CRIMSON_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_DOOR, Items.STRIPPED_CRIMSON_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_DOOR, Items.CRIMSON_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_PRESSURE_PLATE, Items.CRIMSON_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_PRESSURE_PLATE, Items.STRIPPED_CRIMSON_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_PRESSURE_PLATE, Items.CRIMSON_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_PRESSURE_PLATE, Items.STRIPPED_CRIMSON_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_PRESSURE_PLATE, Items.CRIMSON_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, Items.STRIPPED_CRIMSON_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, Items.STRIPPED_CRIMSON_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_PLANKS, Items.CRIMSON_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_PLANKS, Items.STRIPPED_CRIMSON_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_PLANKS, Items.CRIMSON_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_PLANKS, Items.STRIPPED_CRIMSON_HYPHAE, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_SLAB, Items.CRIMSON_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_SLAB, Items.STRIPPED_CRIMSON_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_SLAB, Items.CRIMSON_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_SLAB, Items.STRIPPED_CRIMSON_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_SLAB, Items.CRIMSON_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, Items.CRIMSON_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, Items.STRIPPED_CRIMSON_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, Items.CRIMSON_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, Items.STRIPPED_CRIMSON_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, Items.CRIMSON_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CRIMSON_HYPHAE, Items.CRIMSON_STEM, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_STEM, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CRIMSON_HYPHAE, Items.CRIMSON_HYPHAE, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CRIMSON_STEM, Items.CRIMSON_STEM, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_HYPHAE, Items.CRIMSON_STEM, 1);

            // Dark Oak
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_BUTTON, Items.DARK_OAK_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_BUTTON, Items.STRIPPED_DARK_OAK_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_BUTTON, Items.DARK_OAK_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_BUTTON, Items.STRIPPED_DARK_OAK_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_BUTTON, Items.DARK_OAK_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_DOOR, Items.DARK_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_DOOR, Items.STRIPPED_DARK_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_DOOR, Items.DARK_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_DOOR, Items.STRIPPED_DARK_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_DOOR, Items.DARK_OAK_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_PRESSURE_PLATE, Items.DARK_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_PRESSURE_PLATE, Items.STRIPPED_DARK_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_PRESSURE_PLATE, Items.DARK_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_PRESSURE_PLATE, Items.STRIPPED_DARK_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_PRESSURE_PLATE, Items.DARK_OAK_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, Items.STRIPPED_DARK_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, Items.STRIPPED_DARK_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_PLANKS, Items.DARK_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_PLANKS, Items.STRIPPED_DARK_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_PLANKS, Items.DARK_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_PLANKS, Items.STRIPPED_DARK_OAK_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_SLAB, Items.DARK_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_SLAB, Items.STRIPPED_DARK_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_SLAB, Items.DARK_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_SLAB, Items.STRIPPED_DARK_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_SLAB, Items.DARK_OAK_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, Items.DARK_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, Items.STRIPPED_DARK_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, Items.DARK_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, Items.STRIPPED_DARK_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, Items.DARK_OAK_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_DARK_OAK_WOOD, Items.DARK_OAK_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_DARK_OAK_WOOD, Items.DARK_OAK_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_DARK_OAK_LOG, Items.DARK_OAK_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_WOOD, Items.DARK_OAK_LOG, 1);

            // Jungle
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_BUTTON, Items.JUNGLE_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_BUTTON, Items.STRIPPED_JUNGLE_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_BUTTON, Items.JUNGLE_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_BUTTON, Items.STRIPPED_JUNGLE_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_BUTTON, Items.JUNGLE_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_DOOR, Items.JUNGLE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_DOOR, Items.STRIPPED_JUNGLE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_DOOR, Items.JUNGLE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_DOOR, Items.STRIPPED_JUNGLE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_DOOR, Items.JUNGLE_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_PRESSURE_PLATE, Items.JUNGLE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_PRESSURE_PLATE, Items.STRIPPED_JUNGLE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_PRESSURE_PLATE, Items.JUNGLE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_PRESSURE_PLATE, Items.STRIPPED_JUNGLE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_PRESSURE_PLATE, Items.JUNGLE_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, Items.STRIPPED_JUNGLE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, Items.STRIPPED_JUNGLE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_PLANKS, Items.JUNGLE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_PLANKS, Items.STRIPPED_JUNGLE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_PLANKS, Items.JUNGLE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_PLANKS, Items.STRIPPED_JUNGLE_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_SLAB, Items.JUNGLE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_SLAB, Items.STRIPPED_JUNGLE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_SLAB, Items.JUNGLE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_SLAB, Items.STRIPPED_JUNGLE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_SLAB, Items.JUNGLE_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, Items.JUNGLE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, Items.STRIPPED_JUNGLE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, Items.JUNGLE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, Items.STRIPPED_JUNGLE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, Items.JUNGLE_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_JUNGLE_WOOD, Items.JUNGLE_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_JUNGLE_WOOD, Items.STRIPPED_JUNGLE_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_JUNGLE_WOOD, Items.JUNGLE_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_JUNGLE_LOG, Items.JUNGLE_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_WOOD, Items.JUNGLE_LOG, 1);

            // Mangrove
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_BUTTON, Items.MANGROVE_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_BUTTON, Items.STRIPPED_MANGROVE_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_BUTTON, Items.MANGROVE_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_BUTTON, Items.STRIPPED_MANGROVE_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_BUTTON, Items.MANGROVE_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_DOOR, Items.MANGROVE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_DOOR, Items.STRIPPED_MANGROVE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_DOOR, Items.MANGROVE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_DOOR, Items.STRIPPED_MANGROVE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_DOOR, Items.MANGROVE_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_PRESSURE_PLATE, Items.MANGROVE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_PRESSURE_PLATE, Items.STRIPPED_MANGROVE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_PRESSURE_PLATE, Items.MANGROVE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_PRESSURE_PLATE, Items.STRIPPED_MANGROVE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_PRESSURE_PLATE, Items.MANGROVE_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, Items.STRIPPED_MANGROVE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, Items.STRIPPED_MANGROVE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_PLANKS, Items.MANGROVE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_PLANKS, Items.STRIPPED_MANGROVE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_PLANKS, Items.MANGROVE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_PLANKS, Items.STRIPPED_MANGROVE_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_SLAB, Items.MANGROVE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_SLAB, Items.STRIPPED_MANGROVE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_SLAB, Items.MANGROVE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_SLAB, Items.STRIPPED_MANGROVE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_SLAB, Items.MANGROVE_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, Items.MANGROVE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, Items.STRIPPED_MANGROVE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, Items.MANGROVE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, Items.STRIPPED_MANGROVE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, Items.MANGROVE_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_MANGROVE_WOOD, Items.MANGROVE_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_MANGROVE_WOOD, Items.STRIPPED_MANGROVE_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_MANGROVE_WOOD, Items.MANGROVE_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_MANGROVE_LOG, Items.MANGROVE_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_WOOD, Items.MANGROVE_LOG, 1);

            // Oak
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_BUTTON, Items.OAK_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_BUTTON, Items.STRIPPED_OAK_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_BUTTON, Items.OAK_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_BUTTON, Items.STRIPPED_OAK_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_BUTTON, Items.OAK_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_DOOR, Items.OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_DOOR, Items.STRIPPED_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_DOOR, Items.OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_DOOR, Items.STRIPPED_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_DOOR, Items.OAK_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_PRESSURE_PLATE, Items.OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_PRESSURE_PLATE, Items.STRIPPED_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_PRESSURE_PLATE, Items.OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_PRESSURE_PLATE, Items.STRIPPED_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_PRESSURE_PLATE, Items.OAK_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, Items.OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, Items.STRIPPED_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, Items.OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, Items.STRIPPED_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, Items.OAK_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, Items.OAK_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, Items.OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, Items.STRIPPED_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, Items.OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, Items.STRIPPED_OAK_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_SLAB, Items.OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_SLAB, Items.STRIPPED_OAK_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_SLAB, Items.OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_SLAB, Items.STRIPPED_OAK_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_SLAB, Items.OAK_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, Items.OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, Items.STRIPPED_OAK_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, Items.OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, Items.STRIPPED_OAK_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, Items.OAK_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_OAK_WOOD, Items.OAK_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_OAK_WOOD, Items.STRIPPED_OAK_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_OAK_WOOD, Items.OAK_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_OAK_LOG, Items.OAK_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.OAK_WOOD, Items.OAK_LOG, 1);

            // Spruce
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_BUTTON, Items.SPRUCE_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_BUTTON, Items.STRIPPED_SPRUCE_LOG, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_BUTTON, Items.SPRUCE_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_BUTTON, Items.STRIPPED_SPRUCE_WOOD, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_BUTTON, Items.SPRUCE_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_DOOR, Items.SPRUCE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_DOOR, Items.STRIPPED_SPRUCE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_DOOR, Items.SPRUCE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_DOOR, Items.STRIPPED_SPRUCE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_DOOR, Items.SPRUCE_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_PRESSURE_PLATE, Items.SPRUCE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_PRESSURE_PLATE, Items.STRIPPED_SPRUCE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_PRESSURE_PLATE, Items.SPRUCE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_PRESSURE_PLATE, Items.STRIPPED_SPRUCE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_PRESSURE_PLATE, Items.SPRUCE_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, Items.STRIPPED_SPRUCE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, Items.STRIPPED_SPRUCE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_PLANKS, Items.SPRUCE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_PLANKS, Items.STRIPPED_SPRUCE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_PLANKS, Items.SPRUCE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_PLANKS, Items.STRIPPED_SPRUCE_WOOD, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_SLAB, Items.SPRUCE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_SLAB, Items.STRIPPED_SPRUCE_LOG, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_SLAB, Items.SPRUCE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_SLAB, Items.STRIPPED_SPRUCE_WOOD, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_SLAB, Items.SPRUCE_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, Items.SPRUCE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, Items.STRIPPED_SPRUCE_LOG, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, Items.SPRUCE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, Items.STRIPPED_SPRUCE_WOOD, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, Items.SPRUCE_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_SPRUCE_WOOD, Items.SPRUCE_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_SPRUCE_WOOD, Items.STRIPPED_SPRUCE_LOG, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_SPRUCE_WOOD, Items.SPRUCE_WOOD, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_SPRUCE_LOG, Items.SPRUCE_LOG, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_WOOD, Items.SPRUCE_LOG, 1);

            // Warped
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_BUTTON, Items.WARPED_STEM, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_BUTTON, Items.STRIPPED_WARPED_STEM, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_BUTTON, Items.WARPED_HYPHAE, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_BUTTON, Items.STRIPPED_WARPED_HYPHAE, 16);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_BUTTON, Items.WARPED_PLANKS, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_DOOR, Items.WARPED_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_DOOR, Items.STRIPPED_WARPED_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_DOOR, Items.WARPED_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_DOOR, Items.STRIPPED_WARPED_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_DOOR, Items.WARPED_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_PRESSURE_PLATE, Items.WARPED_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_PRESSURE_PLATE, Items.STRIPPED_WARPED_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_PRESSURE_PLATE, Items.WARPED_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_PRESSURE_PLATE, Items.STRIPPED_WARPED_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_PRESSURE_PLATE, Items.WARPED_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, Items.WARPED_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, Items.STRIPPED_WARPED_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, Items.WARPED_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, Items.STRIPPED_WARPED_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, Items.WARPED_PLANKS, 2);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, Items.WARPED_DOOR, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, Items.WARPED_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, Items.STRIPPED_WARPED_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, Items.WARPED_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_PLANKS, Items.STRIPPED_WARPED_HYPHAE, 4);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_SLAB, Items.WARPED_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_SLAB, Items.STRIPPED_WARPED_STEM, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_SLAB, Items.WARPED_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_SLAB, Items.STRIPPED_WARPED_HYPHAE, 8);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_SLAB, Items.WARPED_PLANKS, 2);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, Items.WARPED_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, Items.STRIPPED_WARPED_STEM, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, Items.WARPED_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, Items.STRIPPED_WARPED_HYPHAE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, Items.WARPED_PLANKS, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_WARPED_HYPHAE, Items.WARPED_STEM, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_WARPED_HYPHAE, Items.STRIPPED_WARPED_STEM, 1);
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_WARPED_HYPHAE, Items.WARPED_HYPHAE, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_WARPED_STEM, Items.WARPED_STEM, 1);

            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_HYPHAE, Items.WARPED_STEM, 1);

            // Stone
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.STONE_BUTTON, Items.STONE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.STONE_PRESSURE_PLATE, Items.STONE, 2);

            // Polished Blackstone
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.POLISHED_BLACKSTONE_BUTTON, Items.POLISHED_BLACKSTONE, 4);
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, Items.POLISHED_BLACKSTONE, 2);

            // Iron
            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.IRON_TRAPDOOR, Items.IRON_DOOR, 2);

            // Copper - 1.21
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.COPPER_TRAPDOOR, Items.COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.EXPOSED_COPPER_TRAPDOOR, Items.EXPOSED_COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WEATHERED_COPPER_TRAPDOOR, Items.WEATHERED_COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.OXIDIZED_COPPER_TRAPDOOR, Items.OXIDIZED_COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WAXED_COPPER_TRAPDOOR, Items.WAXED_COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WAXED_EXPOSED_COPPER_TRAPDOOR, Items.WAXED_EXPOSED_COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WAXED_WEATHERED_COPPER_TRAPDOOR, Items.WAXED_WEATHERED_COPPER_DOOR, 2);
//            offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, Items.WAXED_OXIDIZED_COPPER_TRAPDOOR, Items.WAXED_OXIDIZED_COPPER_DOOR, 2);


        // Compact Carpet
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_WOOL)
                .input(Items.WHITE_CARPET).input(Items.WHITE_CARPET).input(Items.WHITE_CARPET)
                .input(Items.WHITE_CARPET).input(Items.WHITE_CARPET).input(Items.WHITE_CARPET)
                .input(Items.WHITE_CARPET).input(Items.WHITE_CARPET).input(Items.WHITE_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_CARPET), FabricRecipeProvider.conditionsFromItem(Items.WHITE_CARPET))
                .offerTo(exporter, "white_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_WOOL)
                .input(Items.LIGHT_GRAY_CARPET).input(Items.LIGHT_GRAY_CARPET).input(Items.LIGHT_GRAY_CARPET)
                .input(Items.LIGHT_GRAY_CARPET).input(Items.LIGHT_GRAY_CARPET).input(Items.LIGHT_GRAY_CARPET)
                .input(Items.LIGHT_GRAY_CARPET).input(Items.LIGHT_GRAY_CARPET).input(Items.LIGHT_GRAY_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_CARPET), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_CARPET))
                .offerTo(exporter, "light_gray_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_WOOL)
                .input(Items.GRAY_CARPET).input(Items.GRAY_CARPET).input(Items.GRAY_CARPET)
                .input(Items.GRAY_CARPET).input(Items.GRAY_CARPET).input(Items.GRAY_CARPET)
                .input(Items.GRAY_CARPET).input(Items.GRAY_CARPET).input(Items.GRAY_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.GRAY_CARPET), FabricRecipeProvider.conditionsFromItem(Items.GRAY_CARPET))
                .offerTo(exporter, "gray_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_WOOL)
                .input(Items.BLACK_CARPET).input(Items.BLACK_CARPET).input(Items.BLACK_CARPET)
                .input(Items.BLACK_CARPET).input(Items.BLACK_CARPET).input(Items.BLACK_CARPET)
                .input(Items.BLACK_CARPET).input(Items.BLACK_CARPET).input(Items.BLACK_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.BLACK_CARPET), FabricRecipeProvider.conditionsFromItem(Items.BLACK_CARPET))
                .offerTo(exporter, "black_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_WOOL)
                .input(Items.BROWN_CARPET).input(Items.BROWN_CARPET).input(Items.BROWN_CARPET)
                .input(Items.BROWN_CARPET).input(Items.BROWN_CARPET).input(Items.BROWN_CARPET)
                .input(Items.BROWN_CARPET).input(Items.BROWN_CARPET).input(Items.BROWN_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_CARPET), FabricRecipeProvider.conditionsFromItem(Items.BROWN_CARPET))
                .offerTo(exporter, "brown_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_WOOL)
                .input(Items.RED_CARPET).input(Items.RED_CARPET).input(Items.RED_CARPET)
                .input(Items.RED_CARPET).input(Items.RED_CARPET).input(Items.RED_CARPET)
                .input(Items.RED_CARPET).input(Items.RED_CARPET).input(Items.RED_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.RED_CARPET), FabricRecipeProvider.conditionsFromItem(Items.RED_CARPET))
                .offerTo(exporter, "red_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_WOOL)
                .input(Items.ORANGE_CARPET).input(Items.ORANGE_CARPET).input(Items.ORANGE_CARPET)
                .input(Items.ORANGE_CARPET).input(Items.ORANGE_CARPET).input(Items.ORANGE_CARPET)
                .input(Items.ORANGE_CARPET).input(Items.ORANGE_CARPET).input(Items.ORANGE_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_CARPET), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_CARPET))
                .offerTo(exporter, "orange_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_WOOL)
                .input(Items.YELLOW_CARPET).input(Items.YELLOW_CARPET).input(Items.YELLOW_CARPET)
                .input(Items.YELLOW_CARPET).input(Items.YELLOW_CARPET).input(Items.YELLOW_CARPET)
                .input(Items.YELLOW_CARPET).input(Items.YELLOW_CARPET).input(Items.YELLOW_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_CARPET), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_CARPET))
                .offerTo(exporter, "yellow_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_WOOL)
                .input(Items.LIME_CARPET).input(Items.LIME_CARPET).input(Items.LIME_CARPET)
                .input(Items.LIME_CARPET).input(Items.LIME_CARPET).input(Items.LIME_CARPET)
                .input(Items.LIME_CARPET).input(Items.LIME_CARPET).input(Items.LIME_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.LIME_CARPET), FabricRecipeProvider.conditionsFromItem(Items.LIME_CARPET))
                .offerTo(exporter, "lime_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_WOOL)
                .input(Items.GREEN_CARPET).input(Items.GREEN_CARPET).input(Items.GREEN_CARPET)
                .input(Items.GREEN_CARPET).input(Items.GREEN_CARPET).input(Items.GREEN_CARPET)
                .input(Items.GREEN_CARPET).input(Items.GREEN_CARPET).input(Items.GREEN_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.GREEN_CARPET), FabricRecipeProvider.conditionsFromItem(Items.GREEN_CARPET))
                .offerTo(exporter, "green_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_WOOL)
                .input(Items.CYAN_CARPET).input(Items.CYAN_CARPET).input(Items.CYAN_CARPET)
                .input(Items.CYAN_CARPET).input(Items.CYAN_CARPET).input(Items.CYAN_CARPET)
                .input(Items.CYAN_CARPET).input(Items.CYAN_CARPET).input(Items.CYAN_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.CYAN_CARPET), FabricRecipeProvider.conditionsFromItem(Items.CYAN_CARPET))
                .offerTo(exporter, "cyan_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_WOOL)
                .input(Items.LIGHT_BLUE_CARPET).input(Items.LIGHT_BLUE_CARPET).input(Items.LIGHT_BLUE_CARPET)
                .input(Items.LIGHT_BLUE_CARPET).input(Items.LIGHT_BLUE_CARPET).input(Items.LIGHT_BLUE_CARPET)
                .input(Items.LIGHT_BLUE_CARPET).input(Items.LIGHT_BLUE_CARPET).input(Items.LIGHT_BLUE_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_CARPET), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_CARPET))
                .offerTo(exporter, "light_blue_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_WOOL)
                .input(Items.BLUE_CARPET).input(Items.BLUE_CARPET).input(Items.BLUE_CARPET)
                .input(Items.BLUE_CARPET).input(Items.BLUE_CARPET).input(Items.BLUE_CARPET)
                .input(Items.BLUE_CARPET).input(Items.BLUE_CARPET).input(Items.BLUE_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.BLUE_CARPET), FabricRecipeProvider.conditionsFromItem(Items.BLUE_CARPET))
                .offerTo(exporter, "blue_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_WOOL)
                .input(Items.PURPLE_CARPET).input(Items.PURPLE_CARPET).input(Items.PURPLE_CARPET)
                .input(Items.PURPLE_CARPET).input(Items.PURPLE_CARPET).input(Items.PURPLE_CARPET)
                .input(Items.PURPLE_CARPET).input(Items.PURPLE_CARPET).input(Items.PURPLE_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_CARPET), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_CARPET))
                .offerTo(exporter, "purple_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_WOOL)
                .input(Items.MAGENTA_CARPET).input(Items.MAGENTA_CARPET).input(Items.MAGENTA_CARPET)
                .input(Items.MAGENTA_CARPET).input(Items.MAGENTA_CARPET).input(Items.MAGENTA_CARPET)
                .input(Items.MAGENTA_CARPET).input(Items.MAGENTA_CARPET).input(Items.MAGENTA_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_CARPET), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_CARPET))
                .offerTo(exporter, "magenta_wool_from_carpet");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_WOOL)
                .input(Items.PINK_CARPET).input(Items.PINK_CARPET).input(Items.PINK_CARPET)
                .input(Items.PINK_CARPET).input(Items.PINK_CARPET).input(Items.PINK_CARPET)
                .input(Items.PINK_CARPET).input(Items.PINK_CARPET).input(Items.PINK_CARPET)
                .group("compact_carpet")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_CARPET), FabricRecipeProvider.conditionsFromItem(Items.PINK_CARPET))
                .offerTo(exporter, "pink_wool_from_carpet");

        // Coral Block Crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BRAIN_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.BRAIN_CORAL)
                .group("coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.BRAIN_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.BRAIN_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BUBBLE_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.BUBBLE_CORAL)
                .group("coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.BUBBLE_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.BUBBLE_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.FIRE_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.FIRE_CORAL)
                .group("coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.FIRE_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.FIRE_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.HORN_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.HORN_CORAL)
                .group("coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.HORN_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.HORN_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.TUBE_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.TUBE_CORAL)
                .group("coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.TUBE_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.TUBE_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BRAIN_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.DEAD_BRAIN_CORAL)
                .group("dead_coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.DEAD_BRAIN_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.DEAD_BRAIN_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BUBBLE_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.DEAD_BUBBLE_CORAL)
                .group("dead_coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.DEAD_BUBBLE_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.DEAD_BUBBLE_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_FIRE_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.DEAD_FIRE_CORAL)
                .group("dead_coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.DEAD_FIRE_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.DEAD_FIRE_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_HORN_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.DEAD_HORN_CORAL)
                .group("dead_coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.DEAD_HORN_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.DEAD_HORN_CORAL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_TUBE_CORAL_BLOCK)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .input('a', ModTags.Items.DEAD_TUBE_CORAL)
                .group("dead_coral_block")
                .criterion(FabricRecipeProvider.hasItem(Items.DEAD_TUBE_CORAL_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.DEAD_TUBE_CORAL_BLOCK))
                .offerTo(exporter);

        // Alternate Dispenser
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DISPENSER)
                .input(Items.DROPPER)
                .input(Items.BOW)
                .criterion(hasItem(Items.DROPPER), FabricRecipeProvider.conditionsFromItem(Items.DROPPER))
                .offerTo(exporter, "dispenser_alternate");

        // Gravel
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.GRAVEL, Items.FLINT);

        // Horse Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.IRON_HORSE_ARMOR)
                .pattern("a a")
                .pattern("aba")
                .pattern("a a")
                .input('a', Items.IRON_INGOT)
                .input('b', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.SADDLE), FabricRecipeProvider.conditionsFromItem(Items.SADDLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.GOLDEN_HORSE_ARMOR)
                .pattern("a a")
                .pattern("aba")
                .pattern("a a")
                .input('a', Items.GOLD_INGOT)
                .input('b', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.SADDLE), FabricRecipeProvider.conditionsFromItem(Items.SADDLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.DIAMOND_HORSE_ARMOR)
                .pattern("a a")
                .pattern("aba")
                .pattern("a a")
                .input('a', Items.DIAMOND)
                .input('b', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.SADDLE), FabricRecipeProvider.conditionsFromItem(Items.SADDLE))
                .offerTo(exporter);

        // Name Tag
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NAME_TAG)
                .pattern(" ab")
                .pattern(" ca")
                .pattern("c  ")
                .input('a', Items.IRON_NUGGET)
                .input('b', Items.STRING)
                .input('c', Items.PAPER)
                .criterion(FabricRecipeProvider.hasItem(Items.NAME_TAG), FabricRecipeProvider.conditionsFromItem(Items.NAME_TAG))
                .offerTo(exporter);

        // Raw Ore Block Smelting & Blasting
        offerSmelting(exporter, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK,
                6.3f, 1800, "smelt_raw_ore_blocks");
        offerBlasting(exporter, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.COPPER_BLOCK,
                6.3f, 900, "smelt_raw_ore_blocks");
        offerSmelting(exporter, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK,
                6.3f, 1800, "smelt_raw_ore_blocks");
        offerBlasting(exporter, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.IRON_BLOCK,
                6.3f, 900, "smelt_raw_ore_blocks");
        offerSmelting(exporter, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK,
                6.3f, 1800, "smelt_raw_ore_blocks");
        offerBlasting(exporter, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.GOLD_BLOCK,
                6.3f, 900, "smelt_raw_ore_blocks");

        // Saddle
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.SADDLE)
                .pattern("aaa")
                .pattern("aba")
                .pattern(" c ")
                .input('a', Items.LEATHER)
                .input('b', Items.STRING)
                .input('c', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER), FabricRecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);

        // Unpackables
        offerShapelessRecipe(exporter, Items.AMETHYST_SHARD, Items.AMETHYST_BLOCK, "unpack_amethyst", 4);
        offerShapelessRecipe(exporter, Items.HONEYCOMB, Items.HONEYCOMB_BLOCK, "unpack_honeycomb", 4);
        offerShapelessRecipe(exporter, Items.NETHER_WART, Items.NETHER_WART_BLOCK, "unpack_nether_wart", 9);
        offerShapelessRecipe(exporter, Items.POINTED_DRIPSTONE, Items.DRIPSTONE_BLOCK, "unpack_dripstone", 4);
        offerShapelessRecipe(exporter, Items.QUARTZ, Items.QUARTZ_BLOCK, "unpack_quartz", 4);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ICE, 9)
            .input(Items.PACKED_ICE)
            .criterion(FabricRecipeProvider.hasItem(Items.PACKED_ICE), FabricRecipeProvider.conditionsFromItem(Items.PACKED_ICE))
            .offerTo(exporter, "unpack_packed_ice");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PACKED_ICE, 9)
            .input(Items.BLUE_ICE)
            .criterion(FabricRecipeProvider.hasItem(Items.BLUE_ICE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_ICE))
            .offerTo(exporter, "unpack_blue_ice");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STRING, 4)
                .input(ItemTags.WOOL)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);

        // Universal Dyeing
            // Candle
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.DYED_CANDLE)
                    .input('b', Items.WATER_BUCKET)
                    .criterion(FabricRecipeProvider.hasItem(Items.WATER_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                    .offerTo(exporter, "candle_universal_dyeing");

            // Concrete Powder
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "white_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "light_gray_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "gray_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "black_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "brown_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "red_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "orange_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "yellow_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "lime_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "green_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "cyan_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "light_blue_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "blue_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "purple_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "magenta_concrete_powder_universal_dyeing");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_CONCRETE_POWDER, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CONCRETE_POWDER_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_concrete_powder")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "pink_concrete_powder_universal_dyeing");

            // Glass
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.STAINED_GLASS)
                    .input('b', Items.WATER_BUCKET)
                    .criterion(FabricRecipeProvider.hasItem(Items.WATER_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                    .offerTo(exporter, "glass_universal_dyeing");

            // Glass Pane
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.STAINED_GLASS_PANE)
                    .input('b', Items.WATER_BUCKET)
                    .criterion(FabricRecipeProvider.hasItem(Items.WATER_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                    .offerTo(exporter, "glass_pane_universal_dyeing");

            // Terracotta
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.DYED_TERRACOTTA)
                    .input('b', Items.WATER_BUCKET)
                    .criterion(FabricRecipeProvider.hasItem(Items.WATER_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                    .offerTo(exporter, "terracotta_universal_dyeing");

    // Changed Recipes
        // Enchanting Table
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ENCHANTING_TABLE)
                .pattern(" a ")
                .pattern("bcb")
                .pattern("ddd")
                .input('a', Items.BOOK)
                .input('b', Items.DIAMOND)
                .input('c', Items.RED_WOOL)
                .input('d', Items.OBSIDIAN)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, "minecraft/recipes/enchanting_table");

        // Higher Yields
            // Bricks
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BRICKS, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.BRICK)
                    .criterion(FabricRecipeProvider.hasItem(Items.BRICK), FabricRecipeProvider.conditionsFromItem(Items.BRICK))
                    .offerTo(exporter, "minecraft/recipes/bricks");

            // Button
            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.ACACIA_BUTTON, 4)
                    .input(Items.ACACIA_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.ACACIA_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/acacia_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BAMBOO_BUTTON, 4)
                    .input(Items.BAMBOO_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/bamboo_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BIRCH_BUTTON, 4)
                    .input(Items.BIRCH_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.BIRCH_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/birch_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CHERRY_BUTTON, 4)
                    .input(Items.CHERRY_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.CHERRY_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/cherry_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CRIMSON_BUTTON, 4)
                    .input(Items.CRIMSON_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/crimson_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DARK_OAK_BUTTON, 4)
                    .input(Items.DARK_OAK_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/dark_oak_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.JUNGLE_BUTTON, 4)
                    .input(Items.JUNGLE_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/jungle_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.MANGROVE_BUTTON, 4)
                    .input(Items.MANGROVE_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/mangrove_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OAK_BUTTON, 4)
                    .input(Items.OAK_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/oak_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SPRUCE_BUTTON, 4)
                    .input(Items.SPRUCE_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/spruce_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.WARPED_BUTTON, 4)
                    .input(Items.WARPED_PLANKS)
                    .group("wooden_button")
                    .criterion(hasItem(Items.WARPED_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/warped_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.STONE_BUTTON, 4)
                    .input(Items.STONE)
                    .criterion(hasItem(Items.STONE), FabricRecipeProvider.conditionsFromItem(Items.STONE))
                    .offerTo(exporter, "minecraft/recipes/stone_button");

            ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.POLISHED_BLACKSTONE_BUTTON, 4)
                    .input(Items.POLISHED_BLACKSTONE)
                    .criterion(hasItem(Items.POLISHED_BLACKSTONE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE))
                    .offerTo(exporter, "minecraft/recipes/polished_blackstone_button");

            // Carpet
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.WHITE_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_WOOL), FabricRecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                    .offerTo(exporter, "minecraft/recipes/white_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.LIGHT_GRAY_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_WOOL), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_WOOL))
                    .offerTo(exporter, "minecraft/recipes/light_gray_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.GRAY_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_WOOL), FabricRecipeProvider.conditionsFromItem(Items.GRAY_WOOL))
                    .offerTo(exporter, "minecraft/recipes/gray_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.BLACK_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_WOOL), FabricRecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                    .offerTo(exporter, "minecraft/recipes/black_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.BROWN_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_WOOL), FabricRecipeProvider.conditionsFromItem(Items.BROWN_WOOL))
                    .offerTo(exporter, "minecraft/recipes/brown_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.RED_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_WOOL), FabricRecipeProvider.conditionsFromItem(Items.RED_WOOL))
                    .offerTo(exporter, "minecraft/recipes/red_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.ORANGE_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_WOOL), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_WOOL))
                    .offerTo(exporter, "minecraft/recipes/orange_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.YELLOW_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_WOOL), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_WOOL))
                    .offerTo(exporter, "minecraft/recipes/yellow_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.LIME_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_WOOL), FabricRecipeProvider.conditionsFromItem(Items.LIME_WOOL))
                    .offerTo(exporter, "minecraft/recipes/lime_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.GREEN_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_WOOL), FabricRecipeProvider.conditionsFromItem(Items.GREEN_WOOL))
                    .offerTo(exporter, "minecraft/recipes/green_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.CYAN_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_WOOL), FabricRecipeProvider.conditionsFromItem(Items.CYAN_WOOL))
                    .offerTo(exporter, "minecraft/recipes/cyan_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.LIGHT_BLUE_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_WOOL), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                    .offerTo(exporter, "minecraft/recipes/light_blue_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.BLUE_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_WOOL), FabricRecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                    .offerTo(exporter, "minecraft/recipes/blue_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.PURPLE_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_WOOL), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_WOOL))
                    .offerTo(exporter, "minecraft/recipes/purple_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.MAGENTA_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_WOOL), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_WOOL))
                    .offerTo(exporter, "minecraft/recipes/magenta_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.PINK_WOOL)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_WOOL), FabricRecipeProvider.conditionsFromItem(Items.PINK_WOOL))
                    .offerTo(exporter, "minecraft/recipes/pink_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MOSS_CARPET, 18)
                    .pattern("aa")
                    .input('a', Items.MOSS_BLOCK)
                    .group("carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.MOSS_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.MOSS_BLOCK))
                    .offerTo(exporter, "minecraft/recipes/moss_carpet");

            // Door
            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.ACACIA_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.ACACIA_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/acacia_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BAMBOO_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.BAMBOO_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/bamboo_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BIRCH_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.BIRCH_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/birch_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CHERRY_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.CHERRY_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/cherry_door");

            // 1.21+
//            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.COPPER_DOOR, 6)
//                    .pattern("aa")
//                    .pattern("aa")
//                    .pattern("aa")
//                    .input('a', Items.COPPER_INGOT)
//                    .group("metal_door")
//                    .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
//                    .offerTo(exporter, "minecraft/recipes/copper_door");


            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CRIMSON_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.CRIMSON_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/crimson_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DARK_OAK_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.DARK_OAK_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/dark_oak_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.IRON_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.IRON_INGOT)
                    .group("metal_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                    .offerTo(exporter, "minecraft/recipes/iron_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.JUNGLE_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.JUNGLE_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/jungle_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.MANGROVE_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.MANGROVE_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/mangrove_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OAK_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.OAK_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/oak_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SPRUCE_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.SPRUCE_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/spruce_door");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.WARPED_DOOR, 6)
                    .pattern("aa")
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.WARPED_PLANKS)
                    .group("wooden_door")
                    .criterion(FabricRecipeProvider.hasItem(Items.WARPED_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/warped_door");

            // Nether Bricks
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.NETHER_BRICKS, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.NETHER_BRICK)
                    .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICK), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                    .offerTo(exporter, "minecraft/recipes/nether_bricks");

            // Red Nether Bricks - Vanilla
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_NETHER_BRICKS, 2)
                    .pattern("ab")
                    .pattern("ba")
                    .input('a', Items.NETHER_BRICK)
                    .input('b', Items.NETHER_WART)
                    .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICK), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                    .offerTo(exporter, "minecraft/recipes/red_nether_bricks");

            // Pressure Plate
            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.ACACIA_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.ACACIA_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/acacia_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BAMBOO_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.BAMBOO_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/bamboo_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BIRCH_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.BIRCH_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/birch_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CHERRY_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.CHERRY_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/cherry_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CRIMSON_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.CRIMSON_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/crimson_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DARK_OAK_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.DARK_OAK_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/dark_oak_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.HEAVY_WEIGHTED_PRESSURE_PLATE, 2)
                    .pattern("aa")
                    .input('a', Items.IRON_INGOT)
                    .group("weighted_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                    .offerTo(exporter, "minecraft/recipes/heavy_weighted_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.JUNGLE_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.JUNGLE_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/jungle_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.LIGHT_WEIGHTED_PRESSURE_PLATE, 2)
                    .pattern("aa")
                    .input('a', Items.GOLD_INGOT)
                    .group("weighted_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                    .offerTo(exporter, "minecraft/recipes/light_weighted_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.MANGROVE_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.MANGROVE_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/mangrove_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OAK_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.OAK_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/oak_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.POLISHED_BLACKSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_BLACKSTONE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE))
                    .offerTo(exporter, "minecraft/recipes/polished_blackstone_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SPRUCE_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.SPRUCE_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/spruce_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.STONE_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.STONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.STONE), FabricRecipeProvider.conditionsFromItem(Items.STONE))
                    .offerTo(exporter, "minecraft/recipes/stone_pressure_plate");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.WARPED_PRESSURE_PLATE, 4)
                    .pattern("aa")
                    .input('a', Items.WARPED_PLANKS)
                    .group("wooden_pressure_plate")
                    .criterion(FabricRecipeProvider.hasItem(Items.WARPED_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/warped_pressure_plate");

            // Snow
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SNOW, 16)
                    .pattern("aa")
                    .input('a', Items.SNOW_BLOCK)
                    .criterion(FabricRecipeProvider.hasItem(Items.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.SNOW_BLOCK))
                    .offerTo(exporter, "minecraft/recipes/snow");

            // Stairs
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.OAK_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/oak_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.SPRUCE_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/spruce_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.BIRCH_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/birch_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.JUNGLE_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/jungle_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.ACACIA_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/acacia_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.DARK_OAK_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/dark_oak_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.MANGROVE_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/mangrove_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.CHERRY_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/cherry_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.BAMBOO_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/bamboo_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.CRIMSON_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/crimson_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.WARPED_PLANKS)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.WARPED_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/warped_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.BAMBOO_MOSAIC)
                    .group("wooden_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_MOSAIC), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_MOSAIC))
                    .offerTo(exporter, "minecraft/recipes/bamboo_mosaic_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.STONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.STONE), FabricRecipeProvider.conditionsFromItem(Items.STONE))
                    .offerTo(exporter, "minecraft/recipes/stone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.COBBLESTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.COBBLESTONE)
                    .group("cobblestone_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.COBBLESTONE), FabricRecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                    .offerTo(exporter, "minecraft/recipes/cobblestone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_COBBLESTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.MOSSY_COBBLESTONE)
                    .group("cobblestone_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.MOSSY_COBBLESTONE), FabricRecipeProvider.conditionsFromItem(Items.MOSSY_COBBLESTONE))
                    .offerTo(exporter, "minecraft/recipes/mossy_cobblestone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STONE_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.STONE_BRICKS)
                    .group("stone_brick_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.STONE_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.STONE_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/stone_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_STONE_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.MOSSY_STONE_BRICKS)
                    .group("stone_brick_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.MOSSY_STONE_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.MOSSY_STONE_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/mossy_stone_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRANITE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.GRANITE)
                    .criterion(FabricRecipeProvider.hasItem(Items.GRANITE), FabricRecipeProvider.conditionsFromItem(Items.GRANITE))
                    .offerTo(exporter, "minecraft/recipes/granite_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_GRANITE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.POLISHED_GRANITE)
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_GRANITE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_GRANITE))
                    .offerTo(exporter, "minecraft/recipes/polished_granite_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DIORITE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.DIORITE)
                    .criterion(FabricRecipeProvider.hasItem(Items.DIORITE), FabricRecipeProvider.conditionsFromItem(Items.DIORITE))
                    .offerTo(exporter, "minecraft/recipes/diorite_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DIORITE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.POLISHED_DIORITE)
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DIORITE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DIORITE))
                    .offerTo(exporter, "minecraft/recipes/polished_diorite_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ANDESITE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.ANDESITE)
                    .criterion(FabricRecipeProvider.hasItem(Items.ANDESITE), FabricRecipeProvider.conditionsFromItem(Items.ANDESITE))
                    .offerTo(exporter, "minecraft/recipes/andesite_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_ANDESITE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.POLISHED_ANDESITE)
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_ANDESITE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_ANDESITE))
                    .offerTo(exporter, "minecraft/recipes/polished_andesite_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.COBBLED_DEEPSLATE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.COBBLED_DEEPSLATE)
                    .criterion(FabricRecipeProvider.hasItem(Items.COBBLED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.COBBLED_DEEPSLATE))
                    .offerTo(exporter, "minecraft/recipes/cobbled_deepslate_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_DEEPSLATE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.POLISHED_DEEPSLATE)
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_DEEPSLATE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
                    .offerTo(exporter, "minecraft/recipes/polished_deepslate_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.DEEPSLATE_BRICKS)
                    .group("deepslate_brick_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.DEEPSLATE_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.DEEPSLATE_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/deepslate_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE_TILE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.DEEPSLATE_TILES)
                    .group("deepslate_tile_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.DEEPSLATE_TILES), FabricRecipeProvider.conditionsFromItem(Items.DEEPSLATE_TILES))
                    .offerTo(exporter, "minecraft/recipes/deepslate_tile_stairs");

            // 1.21+
//            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.TUFF_STAIRS, 4)
//                    .pattern("a ")
//                    .pattern("aa")
//                    .input('a', Items.TUFF)
//                    .criterion(FabricRecipeProvider.hasItem(Items.TUFF), FabricRecipeProvider.conditionsFromItem(Items.TUFF))
//                    .offerTo(exporter, "minecraft/recipes/tuff_stairs");
//
//            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_TUFF_STAIRS, 4)
//                    .pattern("a ")
//                    .pattern("aa")
//                    .input('a', Items.POLISHED_TUFF)
//                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_TUFF), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_TUFF))
//                    .offerTo(exporter, "minecraft/recipes/polished_stairs");
//
//            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.TUFF_BRICK_STAIRS, 4)
//                    .pattern("a ")
//                    .pattern("aa")
//                    .input('a', Items.TUFF_BRICKS)
//                    .group("tuff_brick_stairs")
//                    .criterion(FabricRecipeProvider.hasItem(Items.TUFF_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.TUFF_BRICKS))
//                    .offerTo(exporter, "minecraft/recipes/tuff_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.BRICKS)
                    .criterion(FabricRecipeProvider.hasItem(Items.BRICKS), FabricRecipeProvider.conditionsFromItem(Items.BRICKS))
                    .offerTo(exporter, "minecraft/recipes/brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MUD_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.MUD_BRICKS)
                    .criterion(FabricRecipeProvider.hasItem(Items.MUD_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.MUD_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/mud_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SANDSTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.SANDSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.SANDSTONE), FabricRecipeProvider.conditionsFromItem(Items.SANDSTONE))
                    .offerTo(exporter, "minecraft/recipes/sandstone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.SMOOTH_SANDSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.SMOOTH_SANDSTONE), FabricRecipeProvider.conditionsFromItem(Items.SMOOTH_SANDSTONE))
                    .offerTo(exporter, "minecraft/recipes/smooth_sandstone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_SANDSTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.RED_SANDSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_SANDSTONE), FabricRecipeProvider.conditionsFromItem(Items.RED_SANDSTONE))
                    .offerTo(exporter, "minecraft/recipes/red_sandstone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.SMOOTH_RED_SANDSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.SMOOTH_RED_SANDSTONE), FabricRecipeProvider.conditionsFromItem(Items.SMOOTH_RED_SANDSTONE))
                    .offerTo(exporter, "minecraft/recipes/smooth_red_sandstone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PRISMARINE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.PRISMARINE)
                    .criterion(FabricRecipeProvider.hasItem(Items.PRISMARINE), FabricRecipeProvider.conditionsFromItem(Items.PRISMARINE))
                    .offerTo(exporter, "minecraft/recipes/prismarine_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PRISMARINE_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.PRISMARINE_BRICKS)
                    .criterion(FabricRecipeProvider.hasItem(Items.PRISMARINE_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.PRISMARINE_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/prismarine_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DARK_PRISMARINE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.DARK_PRISMARINE)
                    .criterion(FabricRecipeProvider.hasItem(Items.DARK_PRISMARINE), FabricRecipeProvider.conditionsFromItem(Items.DARK_PRISMARINE))
                    .offerTo(exporter, "minecraft/recipes/dark_prismarine_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.NETHER_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.NETHER_BRICKS)
                    .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/nether_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_NETHER_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.RED_NETHER_BRICKS)
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_NETHER_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/red_nether_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACKSTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.BLACKSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACKSTONE), FabricRecipeProvider.conditionsFromItem(Items.BLACKSTONE))
                    .offerTo(exporter, "minecraft/recipes/blackstone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.POLISHED_BLACKSTONE)
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_BLACKSTONE), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE))
                    .offerTo(exporter, "minecraft/recipes/polished_blackstone_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.POLISHED_BLACKSTONE_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.POLISHED_BLACKSTONE_BRICKS)
                    .group("blackstone_brick_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.POLISHED_BLACKSTONE_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/polished_blackstone_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.END_STONE_BRICKS)
                    .group("endstone_brick_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.END_STONE_BRICKS), FabricRecipeProvider.conditionsFromItem(Items.END_STONE_BRICKS))
                    .offerTo(exporter, "minecraft/recipes/end_stone_brick_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPUR_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.PURPUR_BLOCK)
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPUR_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.PURPUR_BLOCK))
                    .offerTo(exporter, "minecraft/recipes/purpur_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.QUARTZ_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.QUARTZ_BLOCK)
                    .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
                    .offerTo(exporter, "minecraft/recipes/quartz_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.SMOOTH_QUARTZ)
                    .criterion(FabricRecipeProvider.hasItem(Items.SMOOTH_QUARTZ), FabricRecipeProvider.conditionsFromItem(Items.SMOOTH_QUARTZ))
                    .offerTo(exporter, "minecraft/recipes/smooth_quartz_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.CUT_COPPER)
                    .group("cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WAXED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.WAXED_CUT_COPPER)
                    .group("waxed_cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.WAXED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/waxed_cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.EXPOSED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.EXPOSED_CUT_COPPER)
                    .group("cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.EXPOSED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.EXPOSED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/exposed_cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WAXED_EXPOSED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.WAXED_EXPOSED_CUT_COPPER)
                    .group("waxed_cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.WAXED_EXPOSED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_EXPOSED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/waxed_exposed_cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WEATHERED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.WEATHERED_CUT_COPPER)
                    .group("cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.WEATHERED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WEATHERED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/weathered_cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WAXED_WEATHERED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.WAXED_WEATHERED_CUT_COPPER)
                    .group("waxed_cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.WAXED_WEATHERED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_WEATHERED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/waxed_weathered_cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.OXIDIZED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.OXIDIZED_CUT_COPPER)
                    .group("cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.OXIDIZED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.OXIDIZED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/oxidized_cut_copper_stairs");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS, 4)
                    .pattern("a ")
                    .pattern("aa")
                    .input('a', Items.WAXED_OXIDIZED_CUT_COPPER)
                    .group("waxed_cut_copper_stairs")
                    .criterion(FabricRecipeProvider.hasItem(Items.WAXED_OXIDIZED_CUT_COPPER), FabricRecipeProvider.conditionsFromItem(Items.WAXED_OXIDIZED_CUT_COPPER))
                    .offerTo(exporter, "minecraft/recipes/waxed_oxidized_cut_copper_stairs");

            // Trapdoor
            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OAK_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.OAK_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/oak_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SPRUCE_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.SPRUCE_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.SPRUCE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/spruce_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BIRCH_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.BIRCH_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/birch_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.JUNGLE_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.JUNGLE_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/jungle_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.ACACIA_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.ACACIA_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/acacia_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DARK_OAK_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.DARK_OAK_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/dark_oak_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.MANGROVE_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.MANGROVE_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/mangrove_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CHERRY_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.CHERRY_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/cherry_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BAMBOO_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.BAMBOO_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/bamboo_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.CRIMSON_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.CRIMSON_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/crimson_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.WARPED_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.WARPED_PLANKS)
                    .group("wooden_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.WARPED_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                    .offerTo(exporter, "minecraft/recipes/warped_trapdoor");

            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.IRON_TRAPDOOR, 12)
                    .pattern("aaa")
                    .pattern("aaa")
                    .input('a', Items.IRON_INGOT)
                    .group("metal_trapdoor")
                    .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                    .offerTo(exporter, "minecraft/recipes/iron_trapdoor");

            // 1.21+
//            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.COPPER_TRAPDOOR, 12)
//                    .pattern("aaa")
//                    .pattern("aaa")
//                    .input('a', Items.COPPER_INGOT)
//                    .group("metal_trapdoor")
//                    .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
//                    .offerTo(exporter, "minecraft/recipes/copper_trapdoor");

            // Wood
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.OAK_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.OAK_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.OAK_LOG), FabricRecipeProvider.conditionsFromItem(Items.OAK_LOG))
                    .offerTo(exporter, "minecraft/recipes/oak_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.SPRUCE_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.SPRUCE_LOG), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_LOG))
                    .offerTo(exporter, "minecraft/recipes/spruce_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.BIRCH_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_LOG), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_LOG))
                    .offerTo(exporter, "minecraft/recipes/birch_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.JUNGLE_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_LOG), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_LOG))
                    .offerTo(exporter, "minecraft/recipes/jungle_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.ACACIA_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_LOG), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_LOG))
                    .offerTo(exporter, "minecraft/recipes/acacia_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.DARK_OAK_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_LOG), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
                    .offerTo(exporter, "minecraft/recipes/dark_oak_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.MANGROVE_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_LOG), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_LOG))
                    .offerTo(exporter, "minecraft/recipes/mangrove_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.CHERRY_LOG)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_LOG), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_LOG))
                    .offerTo(exporter, "minecraft/recipes/cherry_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_HYPHAE, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.CRIMSON_STEM)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_STEM), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_STEM))
                    .offerTo(exporter, "minecraft/recipes/crimson_stem");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_HYPHAE, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.WARPED_STEM)
                    .group("wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.WARPED_STEM), FabricRecipeProvider.conditionsFromItem(Items.WARPED_STEM))
                    .offerTo(exporter, "minecraft/recipes/warped_stem");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_OAK_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_OAK_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_OAK_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_OAK_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_oak_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_SPRUCE_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_SPRUCE_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_SPRUCE_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_SPRUCE_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_spruce_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_BIRCH_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_BIRCH_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_BIRCH_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_BIRCH_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_birch_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_JUNGLE_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_JUNGLE_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_JUNGLE_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_JUNGLE_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_jungle_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_ACACIA_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_ACACIA_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_ACACIA_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_ACACIA_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_acacia_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_DARK_OAK_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_DARK_OAK_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_DARK_OAK_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_DARK_OAK_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_dark_oak_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_MANGROVE_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_MANGROVE_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_MANGROVE_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_MANGROVE_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_mangrove_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CHERRY_WOOD, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_CHERRY_LOG)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_CHERRY_LOG), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CHERRY_LOG))
                    .offerTo(exporter, "minecraft/recipes/stripped_cherry_wood");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_CRIMSON_HYPHAE, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_CRIMSON_STEM)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_CRIMSON_STEM), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_CRIMSON_STEM))
                    .offerTo(exporter, "minecraft/recipes/stripped_crimson_hyphae");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.STRIPPED_WARPED_HYPHAE, 4)
                    .pattern("aa")
                    .pattern("aa")
                    .input('a', Items.STRIPPED_WARPED_STEM)
                    .group("stripped_wood")
                    .criterion(FabricRecipeProvider.hasItem(Items.STRIPPED_WARPED_STEM), FabricRecipeProvider.conditionsFromItem(Items.STRIPPED_WARPED_STEM))
                    .offerTo(exporter, "minecraft/recipes/stripped_warped_hyphae");

        // Missing Blackstone and Deepslate Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, Items.BREWING_STAND)
                .pattern(" a ")
                .pattern("bbb")
                .input('a', Items.BLAZE_ROD)
                .input('b', ItemTags.STONE_CRAFTING_MATERIALS)
                .criterion(FabricRecipeProvider.hasItem(Items.BLAZE_ROD), FabricRecipeProvider.conditionsFromItem(Items.BLAZE_ROD))
                .offerTo(exporter, "minecraft/recipes/brewing_stand");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DISPENSER)
                .pattern("aaa")
                .pattern("aba")
                .pattern("aca")
                .input('a', ItemTags.STONE_CRAFTING_MATERIALS)
                .input('b', Items.BOW)
                .input('c', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.BOW), FabricRecipeProvider.conditionsFromItem(Items.BOW))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, "minecraft/recipes/dispenser");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DROPPER)
                .pattern("aaa")
                .pattern("a a")
                .pattern("aba")
                .input('a', ItemTags.STONE_CRAFTING_MATERIALS)
                .input('b', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, "minecraft/recipes/dropper");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.LEVER)
                .pattern("a")
                .pattern("b")
                .input('a', Items.STICK)
                .input('b', ItemTags.STONE_CRAFTING_MATERIALS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, "minecraft/recipes/lever");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.OBSERVER)
                .pattern("aaa")
                .pattern("bbc")
                .pattern("aaa")
                .input('a', ItemTags.STONE_CRAFTING_MATERIALS)
                .input('b', Items.REDSTONE)
                .input('c', Items.QUARTZ)
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ), FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, "minecraft/recipes/observer");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.PISTON)
                .pattern("aaa")
                .pattern("bcb")
                .pattern("bdb")
                .input('a', ItemTags.PLANKS)
                .input('b', ItemTags.STONE_CRAFTING_MATERIALS)
                .input('c', Items.IRON_INGOT)
                .input('d', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "minecraft/recipes/piston");

        // Universal Dyeing
            // Candle
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "minecraft/recipes/white_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_gray_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/gray_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "minecraft/recipes/black_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "minecraft/recipes/brown_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "minecraft/recipes/red_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "minecraft/recipes/orange_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "minecraft/recipes/yellow_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "minecraft/recipes/lime_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "minecraft/recipes/green_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "minecraft/recipes/cyan_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_blue_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/blue_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "minecraft/recipes/purple_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "minecraft/recipes/magenta_candle");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_CANDLE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CANDLE_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_candles")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "minecraft/recipes/pink_candle");

            // Stained Glass
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "minecraft/recipes/white_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_gray_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/gray_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "minecraft/recipes/black_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "minecraft/recipes/brown_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "minecraft/recipes/red_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "minecraft/recipes/orange_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "minecraft/recipes/yellow_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "minecraft/recipes/lime_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "minecraft/recipes/green_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "minecraft/recipes/cyan_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_blue_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/blue_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "minecraft/recipes/purple_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "minecraft/recipes/magenta_stained_glass");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_STAINED_GLASS, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_glass")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "minecraft/recipes/pink_stained_glass");

            // Stained Glass Pane - must be named "<color>_stained_glass_pane_from_glass_pane"
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "minecraft/recipes/white_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_gray_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/gray_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "minecraft/recipes/black_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "minecraft/recipes/brown_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "minecraft/recipes/red_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "minecraft/recipes/orange_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "minecraft/recipes/yellow_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "minecraft/recipes/lime_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "minecraft/recipes/green_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "minecraft/recipes/cyan_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_blue_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/blue_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "minecraft/recipes/purple_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "minecraft/recipes/magenta_stained_glass_pane_from_glass_pane");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_STAINED_GLASS_PANE, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.GLASS_PANE_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_glass_panes")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "minecraft/recipes/pink_stained_glass_pane_from_glass_pane");

            // Terracotta
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "minecraft/recipes/white_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_gray_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/gray_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "minecraft/recipes/black_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "minecraft/recipes/brown_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "minecraft/recipes/red_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "minecraft/recipes/orange_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "minecraft/recipes/yellow_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "minecraft/recipes/lime_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "minecraft/recipes/green_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "minecraft/recipes/cyan_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/light_blue_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/blue_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "minecraft/recipes/purple_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "minecraft/recipes/magenta_terracotta");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_TERRACOTTA, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.TERRACOTTA_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_terracotta")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "minecraft/recipes/pink_terracotta");

            // Wool - must be named "dye_<color>_wool"
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_white_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_light_gray_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_gray_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_black_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_brown_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_red_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_orange_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_yellow_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_lime_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_green_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_cyan_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_light_blue_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_blue_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_purple_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_magenta_wool");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_WOOL, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.WOOL_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_wool")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_pink_wool");

            // Carpet - must be named "dye_<color>_carpet"
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_WHITE)
                    .input('b', Items.WHITE_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_white_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_GRAY_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_LIGHT_GRAY)
                    .input('b', Items.LIGHT_GRAY_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_light_gray_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_GRAY)
                    .input('b', Items.GRAY_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_gray_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_BLACK)
                    .input('b', Items.BLACK_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLACK_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_black_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_BROWN)
                    .input('b', Items.BROWN_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_brown_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.RED_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_RED)
                    .input('b', Items.RED_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_red_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_ORANGE)
                    .input('b', Items.ORANGE_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_orange_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_YELLOW)
                    .input('b', Items.YELLOW_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_yellow_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIME_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_LIME)
                    .input('b', Items.LIME_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_lime_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_GREEN)
                    .input('b', Items.GREEN_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE), FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_green_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_CYAN)
                    .input('b', Items.CYAN_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_cyan_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_LIGHT_BLUE)
                    .input('b', Items.LIGHT_BLUE_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_light_blue_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_BLUE)
                    .input('b', Items.BLUE_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_blue_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_PURPLE)
                    .input('b', Items.PURPLE_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_purple_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_MAGENTA)
                    .input('b', Items.MAGENTA_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_magenta_carpet");

            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PINK_CARPET, 8)
                    .pattern("aaa")
                    .pattern("aba")
                    .pattern("aaa")
                    .input('a', ModTags.Items.CARPET_MINUS_PINK)
                    .input('b', Items.PINK_DYE)
                    .group("universal_dyeing_carpet")
                    .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                    .offerTo(exporter, "minecraft/recipes/dye_pink_carpet");
    }
}