import java.util.List;

public interface DAO<T> {

    T getById(long id);

    List<T> getAll();

    void save(T t);
//
//    void update(T t, String[] params);
//
//    void delete(T t);
}