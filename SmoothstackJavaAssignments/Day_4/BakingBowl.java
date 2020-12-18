/**
 * 
 */
package com.ss.sf.williamtraining.javadayfour;

import java.util.ArrayList;

/**
 * @author William
 *
 *         Virtual baking bowl that can be filled with ingredients (Strings).
 *
 */
public class BakingBowl {

	private volatile ArrayList<String> ingredients;

	private static volatile BakingBowl instance = null;

	/*
	 * Constructor for BakingBowl.
	 */
	private BakingBowl() {
		ingredients = new ArrayList<>();
	}

	/*
	 * Checks if instance is null, and either creates a new BakingBowl or returns
	 * with pre-existing.
	 */

	public static BakingBowl getInstance() {
		if (instance == null) {
			synchronized (BakingBowl.class) {
				if (instance == null) {
					instance = new BakingBowl();
				}
			}
		}
		return instance;
	}

	/*
	 * Adds new ingredient to the bowl. Returns BakingBowl to allow method chaining, if desired.
	 */

	public BakingBowl add(String newIngredient) {
		this.ingredients.add(newIngredient);
		return this;
	}

	/*
	 * Iterates through and prints BakingBowl ingredients.
	 */
	public void lookInside() {
		System.out.println("Looking inside, you see:");
		for (String ingredient : this.ingredients) {
			System.out.println(ingredient);
		}
	}
}
