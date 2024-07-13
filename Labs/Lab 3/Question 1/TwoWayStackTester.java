public class TwoWayStackTester {

	public static void main(String Args[]) {
		TwoWayStack<String> mystacks = new TwoWayStack<String>();
		mystacks.pushBottom("bottom");
		mystacks.pushBottom("the");
		mystacks.pushBottom("through");
		mystacks.pushBottom("push");
		mystacks.pushBottom("stack");
		mystacks.pushBottom("one");
		mystacks.pushBottom("is");
		mystacks.pushBottom("This");
		mystacks.pushTop("top");
		mystacks.pushTop("the");
		mystacks.pushTop("from");
		mystacks.pushTop("stack");
		mystacks.pushTop("other");
		mystacks.pushTop("the");
		mystacks.pushTop("is");
		mystacks.pushTop("This");
		
		while(!mystacks.bottomEmpty()) {
			System.out.print(mystacks.popBottom() + " ");
		}
		System.out.println();

		while(!mystacks.topEmpty()) {
			System.out.print(mystacks.popTop() + " ");
		}
	}
}
