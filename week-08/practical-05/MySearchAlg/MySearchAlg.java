package MySearchAlg;

public abstract class MySearchAlg<T extends Comparable> {

	abstract T search(T[] array, T ref);

	void swap(T[] array, int a, int b) {
		T tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}
