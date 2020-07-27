public class MyTest {



	public static void main(String[] args) {
		Queue howgarts = new Queue();
		Queue secondQueue = new Queue();

		howgarts.enqueue(new Student("Cedric Diggory", 14, 1));
		howgarts.enqueue(new Student("Harry Potter", 14, 1));
		howgarts.enqueue(new Student("Hermione Granger", 12, 1));
		howgarts.enqueue(new Student("Ron Weasley", 15, 1));
		howgarts.enqueue(new Student("Fred Weasley", 16, 3));
		howgarts.enqueue(new Student("George Weasley", 16, 3));
//		howgarts.enqueue(new Student("Draco Malfoy", 15, 2));

		howgarts.displayQueue();

		howgarts.dequeue();

		howgarts.displayQueue();
		howgarts.dequeue();
		howgarts.dequeue();
		howgarts.dequeue();
		howgarts.dequeue();
		howgarts.dequeue();
		howgarts.dequeue();
		howgarts.dequeue();


		howgarts.displayQueue();

	}

}
