package isabellaagm.com.github.android_lista_de_compras.model;

/**
 * Uma classe de modelo de dados que representa um item na lista de compras.
 * Esta classe é anotada com @Entity, indicando que ela representa uma tabela no banco de dados.
 * Cada instância da classe representa uma linha na tabela.
 * A classe é uma data class do Kotlin, o que significa que ela gera automaticamente métodos úteis, como equals(), hashCode() e toString().
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lisabellaagm/com/github/android_lista_de_compras/model/ItemModel;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity
public final class ItemModel {
    
    /**
     * A chave primária da tabela. Cada item na tabela terá um ID único.
     * A anotação @PrimaryKey indica que este campo é a chave primária da tabela.
     * A propriedade autoGenerate é definida como true, o que significa que o Room irá gerar automaticamente um valor único para cada novo item.
     */
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    
    /**
     * O nome do item. Este campo será preenchido pelo usuário.
     * Não há anotações especiais neste campo, então ele será uma coluna regular na tabela.
     */
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    
    public ItemModel(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        super();
    }
    
    /**
     * A chave primária da tabela. Cada item na tabela terá um ID único.
     * A anotação @PrimaryKey indica que este campo é a chave primária da tabela.
     * A propriedade autoGenerate é definida como true, o que significa que o Room irá gerar automaticamente um valor único para cada novo item.
     */
    public final int getId() {
        return 0;
    }
    
    /**
     * O nome do item. Este campo será preenchido pelo usuário.
     * Não há anotações especiais neste campo, então ele será uma coluna regular na tabela.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final isabellaagm.com.github.android_lista_de_compras.model.ItemModel copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}