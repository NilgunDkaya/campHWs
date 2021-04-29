package javaCampHwD2;

public class AuthorManager {
	
	public void addAuthor(Author author) {
		System.out.println("Author added : " +author.name + " " +author.surname);
	}
	
	public void getAllAuthors(Author[] authors) {
		
		for (Author author : authors) {
			System.out.println("Author : " +author.name + " " +author.surname);
		}
	}
}
