package csc241hw04.GenericBST;

public class GenericTesting<T> {
    private T object;

    public GenericTesting(T object) {
        this.object = object;
    }

    private T getObject() {
        return object;
    }


    public static void main(String[] args) {
        GenericTesting<Integer> g1 = new GenericTesting<>(1);
        System.out.println(g1.getObject());

    }

}

