package Ch09_3_Example;


interface Printable {
	void print();
}

class papers {
	private String contents;
	public papers(String s) {
		contents = s;
		
	}
	public Printable getPrinter() {
		return new Printer();
	}
	private class Printer implements Printable {
		String contents;
		@Override
		public void print() {
			System.out.println(papers.this.contents);
		}
		
		
		
	}
}

public class UseMemberInner {
	public static void main(String[] args) {
	papers papers = new papers("Document : i am happy");
	Printable prn = papers.getPrinter();

	
}
}
