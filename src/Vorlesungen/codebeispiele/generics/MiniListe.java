package Vorlesungen.codebeispiele.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MiniListe<E> implements Iterable<E> {

	private final E[] data;
	private int size;

	@SuppressWarnings("unchecked")
	public MiniListe(int maxSize) {
		data = (E[]) new Object[maxSize];
		// data = new E[maxSize] w�rde zum Compilerfehler f�hren
		size = 0;
	}

	public void addElement(E element) {
		if (size >= data.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		data[size++] = element;
	}

	public E elementAt(int pos) {
		if (pos >= size) {
			throw new NoSuchElementException();
		}
		return data[pos];
	}

	@Override
	public Iterator<E> iterator() {
		return new MiniListeIterator<E>();
	}

	class MiniListeIterator<E> implements Iterator<E> {
		int index;

		@Override
		public boolean hasNext() {
			return size != index;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if (index < size)
				return (E) data[index++];
			return null;

		}
	}
}
