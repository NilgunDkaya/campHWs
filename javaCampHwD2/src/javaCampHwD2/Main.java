package javaCampHwD2;

public class Main {

	public static void main(String[] args) {
		
		Author author = new Author(1, "Engin", "Demiroð");
		
		Category category = new Category(1, "Programlama");
		
		Course courseDotNetAngular = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", category, author);
		Course courseJavaReact = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", category, author);
		Course[] courses = {courseDotNetAngular, courseJavaReact};
		
		// Main Classta Kurs Listeleme
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		// Ýþ Sýnýfý ile Eðitmen Ekleme
		AuthorManager authorManager = new AuthorManager();
		authorManager.addAuthor(author);
		
		
		// Ýþ Sýnýfý ile Kategori Ekleme
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category);
		
		
		// Ýþ Sýnýfý ile Kurs Ekleme
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(courseDotNetAngular);
		courseManager.addCourse(courseJavaReact);
		
		// Ýþ Sýnýfý ile Kurs Listeleme
		courseManager.getAllCourses(courses);
		
	}
}
