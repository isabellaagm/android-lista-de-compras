package isabellaagm.com.github.android_lista_de_compras.data;

/**
 * Uma classe abstrata que serve como o ponto principal de acesso ao banco de dados SQLite para o aplicativo.
 * Esta classe é anotada com @Database, listando todas as entidades que devem ser criadas no banco de dados.
 * A classe estende RoomDatabase, que é uma classe do Room Persistence Library que contém o banco de dados.
 * Dentro da classe, você define um método abstrato para cada @Dao que está associado ao banco de dados.
 *
 * @author Ewerton Carreira
 * @version 1.0
 * @since 2023-03-01
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lisabellaagm/com/github/android_lista_de_compras/data/ItemDatabase;", "Landroidx/room/RoomDatabase;", "()V", "itemDao", "Lisabellaagm/com/github/android_lista_de_compras/data/ItemDao;", "app_debug"})
@androidx.room.Database(entities = {isabellaagm.com.github.android_lista_de_compras.model.ItemModel.class}, version = 1)
public abstract class ItemDatabase extends androidx.room.RoomDatabase {
    
    public ItemDatabase() {
        super();
    }
    
    /**
     * Este método abstrato serve como um ponto de acesso para a classe DAO.
     * Quando este método é chamado, o Room irá gerar uma implementação.
     *
     * @return uma instância da classe DAO (ItemDao).
     */
    @org.jetbrains.annotations.NotNull
    public abstract isabellaagm.com.github.android_lista_de_compras.data.ItemDao itemDao();
}