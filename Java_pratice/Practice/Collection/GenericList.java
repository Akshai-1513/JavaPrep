package Practice.Collection;

import java.util.Iterator;
// Generics in Java provide a way to create classes, interfaces, and methods that operate on objects of various types while maintaining type safety.
public class GenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public void OurGenericlist() {
            size = 0;
            items = (T[])new Object[100];
        }

    public void add(T item){
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }


    // The iterator and the iteratalbe are interface that helps to iterate over the values in the collection.
    // If we try to iterate over the collection list it will show error.

    @Override
    public Iterator<T> iterator() {
        return new OurGenericlistIterator(this);
    }

    private class OurGenericlistIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index = 0;

        public OurGenericlistIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}