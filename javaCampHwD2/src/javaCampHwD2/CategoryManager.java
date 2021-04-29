package javaCampHwD2;

public class CategoryManager {
	
	public void addCategory(Category category) {
		System.out.println("Category added : " +category.categoryName);
	}
	
	public void getAllCategories(Category[] categories) {
		
		for (Category category : categories) {
			System.out.println("Category : " +category.categoryName);
		}
	}

}
