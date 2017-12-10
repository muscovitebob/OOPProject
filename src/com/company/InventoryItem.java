package com.company;

import java.util.List;
import java.util.Random;

/**
 * Abstract class of Inventory Items
 * Superclass of weapons ans purses
 */
public abstract class InventoryItem {

    public int ID;
    public int value;
    public float weight;

    {
        value = 0;
        weight = 0;
    }

    /**
     * Constructor of inventory item: purse or weapon
     * Initializes item ID depending on item type:
     * Random odd long for weapons
     * Random number from fibonacci series for purses
     *
     * @param value Parameter describing value of the purse no smaller than zero
     *              | !(value < 0)
     * @param holder
     *        Monster that carries the inventory
     * @throws IllegalArgumentException If weight of the weapon is smaller than zero
     *                                  | weight < 0
     */
    public InventoryItem(int value, Monster holder) throws IllegalArgumentException {
        assert (!(value < 0));
        this.value = value;
    }

    /**
     * Sets new value of the item
     *
     * @param newValue Sets new value of the item not lower than 0
     *                 this.value = newValue
     * @pre Value of the item cannot be lower than zero
     * | !(newValue < 0)
     */
    public void setValue(int newValue) {
        assert (!(newValue < 0));
        this.value = newValue;
    }

    /**
     * Gets value of an item
     *
     * @return this.value
     */
    public int getValue() {
        return this.value;
    }
}