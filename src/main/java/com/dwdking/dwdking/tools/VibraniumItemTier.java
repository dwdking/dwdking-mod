package com.dwdking.dwdking.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum VibraniumItemTier implements IItemTier {
    ;

    @Override
    public int getMaxUses() {
        return 0;
    }

    @Override
    public float getEfficiency() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getHarvestLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }


//    VIBRANIUM(9999, 9999, 99.0F, 99.0F, 15, () -> {
//        return Ingredient.fromItems(RegistryHandler.VIBRANIUM);
//    });
//
//    private final int harvestLevel;
//
//    private final int maxUses;
//
//    private final float efficiency;
//
//    private final float attachDamage;
//
//    private final int enchantability;
//
//    private final Supplier<Ingredient> repairMaterial;
//
//    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attachDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
//        this.harvestLevel = harvestLevel;
//        this.maxUses = maxUses;
//        this.efficiency = efficiency;
//        this.attachDamage = attachDamage;
//        this.enchantability = enchantability;
//        this.repairMaterial = repairMaterial;
//    }
//
//    @Override
//    public int getMaxUses() {
//        return maxUses;
//    }
//
//    @Override
//    public float getEfficiency() {
//        return efficiency;
//    }
//
//    @Override
//    public float getAttackDamage() {
//        return attachDamage;
//    }
//
//    @Override
//    public int getHarvestLevel() {
//        return harvestLevel;
//    }
//
//    @Override
//    public int getEnchantability() {
//        return enchantability;
//    }
//
//    @Override
//    public Ingredient getRepairMaterial() {
//        return repairMaterial.get();
//    }
}
