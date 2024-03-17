package tokio.school;

import java.util.*;

public class Bag<T> implements Iterable<T> {

    private List<T> mochila ;

    private int limite ;
    private int posicion;

    public Bag(int limite) {

        this.limite = limite;
        mochila = new ArrayList<>();

    }

    public void setMochila(List<T> mochila) {
        this.mochila = mochila;
    }
    public T getMochila(){
        for (int i = 0; i < mochila.size(); i++) {
            System.out.println(mochila.get(i));
        }
        System.out.println("no hay objetos en la mochila ");
        return null;
    }


    public void add(Object o) {
        if (mochila.size() < limite) {
            mochila.add((T) o);
            System.out.println("se ha aniadido un objeto a la mochila. ");
            posicion++;

        } else {
            System.out.println("La mochila esta llena ");
        }
    }

    public void clear() {
        if (mochila.size() > 0) {
            mochila.clear();
            System.out.println("se ha quitado todos los objetos de la mochila ");
        }
    }

    public boolean contains(Object o) {
        System.out.println("el objeto " + o + " esta en la mochila ");
        mochila.contains(o);
        return true;

    }

    public boolean isEmpty() {
        if ( mochila.size()==0) {
            mochila.isEmpty();
            System.out.println("la mochila esta vacia. ");
            return true;
        }
            System.out.println("La mochila no esta vacia, tiene objetos guardados "
                    + mochila.toString());
       return false;
    }

    public int size() {
      return  mochila.size();
    }
    public boolean extract(){
           if(!mochila.isEmpty()){
                mochila.remove(0);
               System.out.println("se ha borrado un objeto de la mochila, actualmente hay:  "
                       + mochila.toString() + " en la mochila" );
               return true;
           }
        System.out.println("la mochila esta vacia, no se puede extraer nada ");
           return mochila.isEmpty();

            }
            public String toString(){
        return "estos son los objetos que hay en la mochila : \n " + mochila;
            }


    @Override
    public Iterator<T> iterator() {

        Iterator<T> it = new Iterator<T>() {
            Iterator it = mochila.iterator();



            @Override
            public boolean hasNext() {
                return isEmpty();
            }

            @Override
            public T next() {
                if(mochila.size() == limite){
                    return null;
                }
                return (T) it.next();
            }

        };
        return it;
    }



}



