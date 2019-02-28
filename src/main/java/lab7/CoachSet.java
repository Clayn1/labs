package lab7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import lab6.*;

public class CoachSet implements Set<AbstractCoach> {
    private static final int MAX_CAPACITY = 15;
    private AbstractCoach abstractCoach[] = new AbstractCoach[MAX_CAPACITY];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<AbstractCoach> trainIterator = iterator();
        while (trainIterator.hasNext()){
            if(o.equals(trainIterator.next())){
                return true;
            }
        }
        return false;
    }
    @Override
    public Iterator<AbstractCoach> iterator() {
        return new Iterator<AbstractCoach>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public AbstractCoach next() {
                return abstractCoach[index++];
            }

            /*@Override
            public void remove() {

            }*/
        };
    }

    @Override
    public Object[] toArray() {
        Iterator<AbstractCoach> trainIterator = iterator();
        Object[] o = new Object[size];
        int index = 0;
        while (trainIterator.hasNext()){
            o[index++] = trainIterator.next();
        }
        return o;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length >= size && a instanceof  AbstractCoach[]){
            for(int i = 0; i < a.length; i++){
                try {
                    a[i] = (T) abstractCoach[i];
                }catch (IndexOutOfBoundsException e){
                    a[i]=null;
                }
            }
        }else{
            a = (T[]) toArray();
        }
    return a;
    }
    @Override
    public boolean add(AbstractCoach addedAbstractCoach){
//        if (addedAbstractCoach.getComfort() == null ||
        if ("".equals(addedAbstractCoach.getComfort())){
            throw new WrongComfortException();
        }
        if(addedAbstractCoach.getLuggage()<0){
            throw new WrongLuggageExeption();
        }
        if(addedAbstractCoach.getUsedSeats()<0){
            throw new WrongUsedSeatsExeption();
        }
        abstractCoach[size++] = addedAbstractCoach;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Iterator<AbstractCoach> trainIterator = iterator();
        int index = 0;
            while (trainIterator.hasNext()){
                if (trainIterator.next() == o){
                    for (int _index = index; _index < size; _index++){
                        try {
                            abstractCoach[_index] = abstractCoach[_index + 1];
                        }catch (IndexOutOfBoundsException e){
                            abstractCoach[_index] = null;
                        }
                    }
                    size--;
                    return true;
                }
                index++;
            }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<AbstractCoach> trainIterator = iterator();
        Iterator<?> cIterator = c.iterator();
        while (cIterator.hasNext()){
            while (trainIterator.hasNext()){
                if(cIterator.next() == trainIterator.next()){
                    break;
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends AbstractCoach> c) {
        boolean tf = false;
        try {
            for (AbstractCoach addingAbstractCoach : c) {
                if (add(addingAbstractCoach)) {
                    tf = true;
                }
                add(addingAbstractCoach);
            }
        }catch (IndexOutOfBoundsException e){
            return false;
        }
        return tf;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean tf = false;
        Iterator<AbstractCoach> trainIterator = iterator();
        Iterator<?> cIterator = c.iterator();
        while (cIterator.hasNext()){
            while (trainIterator.hasNext()){
                if (cIterator.next() == trainIterator.next()){break;}
                remove(trainIterator.next());
                size--;
                tf = true;
            }
        }
        return tf;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean tf = false;
        Iterator<AbstractCoach> trainIterator = iterator();
        Iterator<?> cIterator = c.iterator();
        while (cIterator.hasNext()){
            while (trainIterator.hasNext()){
                if (cIterator.next().equals(trainIterator.next())){
                    remove(trainIterator.next());
                    size--;
                    tf = true;
                }
            }
        }
        return tf;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            abstractCoach[i]=null;
        }
    }
}