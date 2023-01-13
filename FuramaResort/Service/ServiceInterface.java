package FuramaResort.Service;

import java.util.List;

public interface ServiceInterface<E> {
    List<E> findAll();
    void create(E e);
}
