package isabellaagm.com.github.android_lista_de_compras.data;

/**
 * Uma classe de Objeto de Acesso a Dados (DAO) para gerenciar operações de banco de dados relacionadas ao ItemModel.
 * Esta classe fornece métodos para realizar operações como inserir, deletar e buscar todos os itens do banco de dados.
 *
 * @author Ewerton Carreira
 * @version 1.0
 * @since 2023-03-01
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lisabellaagm/com/github/android_lista_de_compras/data/ItemDao;", "", "delete", "", "item", "Lisabellaagm/com/github/android_lista_de_compras/model/ItemModel;", "getAll", "Landroidx/lifecycle/LiveData;", "", "insert", "app_debug"})
@androidx.room.Dao
public abstract interface ItemDao {
    
    /**
     * Este método busca todos os itens do banco de dados.
     * Ele usa uma consulta SQL definida com a anotação @Query para buscar os dados.
     * O método retorna um objeto LiveData contendo uma lista de ItemModel.
     * LiveData é parte da biblioteca Android Architecture Components, que nos permite construir objetos de dados que notificam as views quando o banco de dados subjacente muda.
     *
     * @return objeto LiveData contendo uma lista de ItemModel.
     */
    @androidx.room.Query(value = "SELECT * FROM ItemModel")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<isabellaagm.com.github.android_lista_de_compras.model.ItemModel>> getAll();
    
    /**
     * Este método insere um item no banco de dados.
     * A anotação @Insert é parte da biblioteca Room Persistence, que fornece uma camada de abstração sobre o SQLite.
     * O método recebe um objeto ItemModel como parâmetro, que é inserido no banco de dados.
     *
     * @param item O objeto ItemModel a ser inserido no banco de dados.
     */
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    isabellaagm.com.github.android_lista_de_compras.model.ItemModel item);
    
    /**
     * Este método deleta um item do banco de dados.
     * A anotação @Delete é parte da biblioteca Room Persistence, que fornece uma camada de abstração sobre o SQLite.
     * O método recebe um objeto ItemModel como parâmetro, que é deletado do banco de dados.
     *
     * @param item O objeto ItemModel a ser deletado do banco de dados.
     */
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    isabellaagm.com.github.android_lista_de_compras.model.ItemModel item);
}