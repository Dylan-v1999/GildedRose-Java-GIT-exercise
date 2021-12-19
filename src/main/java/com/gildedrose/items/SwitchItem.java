package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item {
    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

        if (this.sellIn >= 0 && this.quality < 50) {
            this.quality++;
        }

        if (this.sellIn < 0 && this.quality > 0) {
            this.quality--;
        }
    }
}
