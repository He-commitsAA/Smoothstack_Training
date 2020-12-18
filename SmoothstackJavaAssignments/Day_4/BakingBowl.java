/**
 * 
 */
package com.ss.sf.williamtraining.javadayfour;

import java.util.ArrayList;

/**
 * @author William
 *
 *
 *         Virtual baking bowl that can be filled with ingredients (Strings).
 *         Useful as singleton because if multiple chefs are adding to a baking
 *         bowl, you don't want to end up with one bowl with just flour and
 *         another bowl with eggs and milk, etc.
 */
public class BakingBowl {

	private ArrayList<String> ingredients;

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
			synchronized (BakingBowl .class) {
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
	 * Iterates through BakingBowl and prints all ingredients inside.
	 */
	public void lookInside() {
		System.out.println("Looking inside, you see:");
		for (String ingredient : this.ingredients) {
			System.out.println(ingredient);
		}
	}
}