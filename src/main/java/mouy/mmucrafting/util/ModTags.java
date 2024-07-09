package mouy.mmucrafting.util;

import mouy.mmucrafting.MouysMinecraftUpdateCrafting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MouysMinecraftUpdateCrafting.MOD_ID, name));
        }
    }

    public static class Items {

        // Tags
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_WHITE = createTag("concrete_powder_minus_white");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_LIGHT_GRAY = createTag("concrete_powder_minus_light_gray");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_GRAY = createTag("concrete_powder_minus_gray");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_BLACK = createTag("concrete_powder_minus_black");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_BROWN = createTag("concrete_powder_minus_brown");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_RED = createTag("concrete_powder_minus_red");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_ORANGE = createTag("concrete_powder_minus_orange");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_YELLOW = createTag("concrete_powder_minus_yellow");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_LIME = createTag("concrete_powder_minus_lime");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_GREEN = createTag("concrete_powder_minus_green");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_CYAN = createTag("concrete_powder_minus_cyan");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_LIGHT_BLUE = createTag("concrete_powder_minus_light_blue");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_BLUE = createTag("concrete_powder_minus_blue");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_PURPLE = createTag("concrete_powder_minus_purple");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_MAGENTA = createTag("concrete_powder_minus_magenta");
        public static final TagKey<Item> CONCRETE_POWDER_MINUS_PINK = createTag("concrete_powder_minus_pink");

        public static final TagKey<Item> STAINED_GLASS = createTag("stained_glass");
        public static final TagKey<Item> GLASS_MINUS_WHITE = createTag("glass_minus_white");
        public static final TagKey<Item> GLASS_MINUS_LIGHT_GRAY = createTag("glass_minus_light_gray");
        public static final TagKey<Item> GLASS_MINUS_GRAY = createTag("glass_minus_gray");
        public static final TagKey<Item> GLASS_MINUS_BLACK = createTag("glass_minus_black");
        public static final TagKey<Item> GLASS_MINUS_BROWN = createTag("glass_minus_brown");
        public static final TagKey<Item> GLASS_MINUS_RED = createTag("glass_minus_red");
        public static final TagKey<Item> GLASS_MINUS_ORANGE = createTag("glass_minus_orange");
        public static final TagKey<Item> GLASS_MINUS_YELLOW = createTag("glass_minus_yellow");
        public static final TagKey<Item> GLASS_MINUS_LIME = createTag("glass_minus_lime");
        public static final TagKey<Item> GLASS_MINUS_GREEN = createTag("glass_minus_green");
        public static final TagKey<Item> GLASS_MINUS_CYAN = createTag("glass_minus_cyan");
        public static final TagKey<Item> GLASS_MINUS_LIGHT_BLUE = createTag("glass_minus_light_blue");
        public static final TagKey<Item> GLASS_MINUS_BLUE = createTag("glass_minus_blue");
        public static final TagKey<Item> GLASS_MINUS_PURPLE = createTag("glass_minus_purple");
        public static final TagKey<Item> GLASS_MINUS_MAGENTA = createTag("glass_minus_magenta");
        public static final TagKey<Item> GLASS_MINUS_PINK = createTag("glass_minus_pink");

        public static final TagKey<Item> STAINED_GLASS_PANE = createTag("stained_glass_pane");
        public static final TagKey<Item> GLASS_PANE_MINUS_WHITE = createTag("glass_pane_minus_white");
        public static final TagKey<Item> GLASS_PANE_MINUS_LIGHT_GRAY = createTag("glass_pane_minus_light_gray");
        public static final TagKey<Item> GLASS_PANE_MINUS_GRAY = createTag("glass_pane_minus_gray");
        public static final TagKey<Item> GLASS_PANE_MINUS_BLACK = createTag("glass_pane_minus_black");
        public static final TagKey<Item> GLASS_PANE_MINUS_BROWN = createTag("glass_pane_minus_brown");
        public static final TagKey<Item> GLASS_PANE_MINUS_RED = createTag("glass_pane_minus_red");
        public static final TagKey<Item> GLASS_PANE_MINUS_ORANGE = createTag("glass_pane_minus_orange");
        public static final TagKey<Item> GLASS_PANE_MINUS_YELLOW = createTag("glass_pane_minus_yellow");
        public static final TagKey<Item> GLASS_PANE_MINUS_LIME = createTag("glass_pane_minus_lime");
        public static final TagKey<Item> GLASS_PANE_MINUS_GREEN = createTag("glass_pane_minus_green");
        public static final TagKey<Item> GLASS_PANE_MINUS_CYAN = createTag("glass_pane_minus_cyan");
        public static final TagKey<Item> GLASS_PANE_MINUS_LIGHT_BLUE = createTag("glass_pane_minus_light_blue");
        public static final TagKey<Item> GLASS_PANE_MINUS_BLUE = createTag("glass_pane_minus_blue");
        public static final TagKey<Item> GLASS_PANE_MINUS_PURPLE = createTag("glass_pane_minus_purple");
        public static final TagKey<Item> GLASS_PANE_MINUS_MAGENTA = createTag("glass_pane_minus_magenta");
        public static final TagKey<Item> GLASS_PANE_MINUS_PINK = createTag("glass_pane_minus_pink");

        public static final TagKey<Item> DYED_TERRACOTTA = createTag("dyed_terracotta");
        public static final TagKey<Item> TERRACOTTA_MINUS_WHITE = createTag("terracotta_minus_white");
        public static final TagKey<Item> TERRACOTTA_MINUS_LIGHT_GRAY = createTag("terracotta_minus_light_gray");
        public static final TagKey<Item> TERRACOTTA_MINUS_GRAY = createTag("terracotta_minus_gray");
        public static final TagKey<Item> TERRACOTTA_MINUS_BLACK = createTag("terracotta_minus_black");
        public static final TagKey<Item> TERRACOTTA_MINUS_BROWN = createTag("terracotta_minus_brown");
        public static final TagKey<Item> TERRACOTTA_MINUS_RED = createTag("terracotta_minus_red");
        public static final TagKey<Item> TERRACOTTA_MINUS_ORANGE = createTag("terracotta_minus_orange");
        public static final TagKey<Item> TERRACOTTA_MINUS_YELLOW = createTag("terracotta_minus_yellow");
        public static final TagKey<Item> TERRACOTTA_MINUS_LIME = createTag("terracotta_minus_lime");
        public static final TagKey<Item> TERRACOTTA_MINUS_GREEN = createTag("terracotta_minus_green");
        public static final TagKey<Item> TERRACOTTA_MINUS_CYAN = createTag("terracotta_minus_cyan");
        public static final TagKey<Item> TERRACOTTA_MINUS_LIGHT_BLUE = createTag("terracotta_minus_light_blue");
        public static final TagKey<Item> TERRACOTTA_MINUS_BLUE = createTag("terracotta_minus_blue");
        public static final TagKey<Item> TERRACOTTA_MINUS_PURPLE = createTag("terracotta_minus_purple");
        public static final TagKey<Item> TERRACOTTA_MINUS_MAGENTA = createTag("terracotta_minus_magenta");
        public static final TagKey<Item> TERRACOTTA_MINUS_PINK = createTag("terracotta_minus_pink");

        public static final TagKey<Item> WOOL_MINUS_WHITE = createTag("wool_minus_white");
        public static final TagKey<Item> WOOL_MINUS_LIGHT_GRAY = createTag("wool_minus_light_gray");
        public static final TagKey<Item> WOOL_MINUS_GRAY = createTag("wool_minus_gray");
        public static final TagKey<Item> WOOL_MINUS_BLACK = createTag("wool_minus_black");
        public static final TagKey<Item> WOOL_MINUS_BROWN = createTag("wool_minus_brown");
        public static final TagKey<Item> WOOL_MINUS_RED = createTag("wool_minus_red");
        public static final TagKey<Item> WOOL_MINUS_ORANGE = createTag("wool_minus_orange");
        public static final TagKey<Item> WOOL_MINUS_YELLOW = createTag("wool_minus_yellow");
        public static final TagKey<Item> WOOL_MINUS_LIME = createTag("wool_minus_lime");
        public static final TagKey<Item> WOOL_MINUS_GREEN = createTag("wool_minus_green");
        public static final TagKey<Item> WOOL_MINUS_CYAN = createTag("wool_minus_cyan");
        public static final TagKey<Item> WOOL_MINUS_LIGHT_BLUE = createTag("wool_minus_light_blue");
        public static final TagKey<Item> WOOL_MINUS_BLUE = createTag("wool_minus_blue");
        public static final TagKey<Item> WOOL_MINUS_PURPLE = createTag("wool_minus_purple");
        public static final TagKey<Item> WOOL_MINUS_MAGENTA = createTag("wool_minus_magenta");
        public static final TagKey<Item> WOOL_MINUS_PINK = createTag("wool_minus_pink");

        public static final TagKey<Item> CARPET_MINUS_WHITE = createTag("carpet_minus_white");
        public static final TagKey<Item> CARPET_MINUS_LIGHT_GRAY = createTag("carpet_minus_light_gray");
        public static final TagKey<Item> CARPET_MINUS_GRAY = createTag("carpet_minus_gray");
        public static final TagKey<Item> CARPET_MINUS_BLACK = createTag("carpet_minus_black");
        public static final TagKey<Item> CARPET_MINUS_BROWN = createTag("carpet_minus_brown");
        public static final TagKey<Item> CARPET_MINUS_RED = createTag("carpet_minus_red");
        public static final TagKey<Item> CARPET_MINUS_ORANGE = createTag("carpet_minus_orange");
        public static final TagKey<Item> CARPET_MINUS_YELLOW = createTag("carpet_minus_yellow");
        public static final TagKey<Item> CARPET_MINUS_LIME = createTag("carpet_minus_lime");
        public static final TagKey<Item> CARPET_MINUS_GREEN = createTag("carpet_minus_green");
        public static final TagKey<Item> CARPET_MINUS_CYAN = createTag("carpet_minus_cyan");
        public static final TagKey<Item> CARPET_MINUS_LIGHT_BLUE = createTag("carpet_minus_light_blue");
        public static final TagKey<Item> CARPET_MINUS_BLUE = createTag("carpet_minus_blue");
        public static final TagKey<Item> CARPET_MINUS_PURPLE = createTag("carpet_minus_purple");
        public static final TagKey<Item> CARPET_MINUS_MAGENTA = createTag("carpet_minus_magenta");
        public static final TagKey<Item> CARPET_MINUS_PINK = createTag("carpet_minus_pink");

        public static final TagKey<Item> DYED_CANDLE = createTag("dyed_candle");
        public static final TagKey<Item> CANDLE_MINUS_WHITE = createTag("candle_minus_white");
        public static final TagKey<Item> CANDLE_MINUS_LIGHT_GRAY = createTag("candle_minus_light_gray");
        public static final TagKey<Item> CANDLE_MINUS_GRAY = createTag("candle_minus_gray");
        public static final TagKey<Item> CANDLE_MINUS_BLACK = createTag("candle_minus_black");
        public static final TagKey<Item> CANDLE_MINUS_BROWN = createTag("candle_minus_brown");
        public static final TagKey<Item> CANDLE_MINUS_RED = createTag("candle_minus_red");
        public static final TagKey<Item> CANDLE_MINUS_ORANGE = createTag("candle_minus_orange");
        public static final TagKey<Item> CANDLE_MINUS_YELLOW = createTag("candle_minus_yellow");
        public static final TagKey<Item> CANDLE_MINUS_LIME = createTag("candle_minus_lime");
        public static final TagKey<Item> CANDLE_MINUS_GREEN = createTag("candle_minus_green");
        public static final TagKey<Item> CANDLE_MINUS_CYAN = createTag("candle_minus_cyan");
        public static final TagKey<Item> CANDLE_MINUS_LIGHT_BLUE = createTag("candle_minus_light_blue");
        public static final TagKey<Item> CANDLE_MINUS_BLUE = createTag("candle_minus_blue");
        public static final TagKey<Item> CANDLE_MINUS_PURPLE = createTag("candle_minus_purple");
        public static final TagKey<Item> CANDLE_MINUS_MAGENTA = createTag("candle_minus_magenta");
        public static final TagKey<Item> CANDLE_MINUS_PINK = createTag("candle_minus_pink");

        public static final TagKey<Item> BRAIN_CORAL = createTag("brain_coral");
        public static final TagKey<Item> BUBBLE_CORAL = createTag("bubble_coral");
        public static final TagKey<Item> FIRE_CORAL = createTag("fire_coral");
        public static final TagKey<Item> HORN_CORAL = createTag("horn_coral");
        public static final TagKey<Item> TUBE_CORAL = createTag("tube_coral");
        public static final TagKey<Item> DEAD_BRAIN_CORAL = createTag("dead_brain_coral");
        public static final TagKey<Item> DEAD_BUBBLE_CORAL = createTag("dead_bubble_coral");
        public static final TagKey<Item> DEAD_FIRE_CORAL = createTag("dead_fire_coral");
        public static final TagKey<Item> DEAD_HORN_CORAL = createTag("dead_horn_coral");
        public static final TagKey<Item> DEAD_TUBE_CORAL = createTag("dead_tube_coral");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MouysMinecraftUpdateCrafting.MOD_ID, name));
        }
    }
}
