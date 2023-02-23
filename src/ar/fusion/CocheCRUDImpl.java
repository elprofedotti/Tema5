package ar.fusion;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("El metodo se llama save()");
    }

    @Override
    public void findAll() {
        System.out.println("El metodo se llama findAll()");
    }

    @Override
    public void delete() {
        System.out.println("El metodo se llama delete()");
    }
}
