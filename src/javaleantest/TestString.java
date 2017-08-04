package javaleantest;

public class TestString {
	private static String path="C:\\User\\holle.txt";
	public static void main(String[] args) {
//		int end =;
//		int begin =;
		String result=path.substring(path.lastIndexOf("\\"),path.indexOf('.'));
		System.out.println(result);
	}
}
