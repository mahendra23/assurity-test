import { describe, test, expect, beforeAll } from '@jest/globals';
import { getCategory, Promotion, Category } from "../api/category-api-request";

describe("Category API Test", () => {

    let categoryData: Category;

    beforeAll(async () => {
        categoryData = await getCategory(6327);
        expect(categoryData.CategoryId).toBe(6327);
    });

  test("should return name of category", () => {
    expect(categoryData.Name).toBe("Carbon credits");
  });

  test("should return canRelist of category", () => {
    expect(categoryData.CanRelist).toBe(true);
  });

  test("should return promotions of category", () => {
    const filteredPromotion = categoryData.Promotions.filter(
        (promotion: Promotion) => promotion.Name === "Gallery").pop();
    expect(filteredPromotion?.Description).toBe("Good position in category");
  });
});