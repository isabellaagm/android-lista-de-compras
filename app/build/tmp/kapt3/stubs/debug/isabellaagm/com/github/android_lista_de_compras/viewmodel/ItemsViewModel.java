package isabellaagm.com.github.android_lista_de_compras.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lisabellaagm/com/github/android_lista_de_compras/viewmodel/ItemsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "itemDao", "Lisabellaagm/com/github/android_lista_de_compras/data/ItemDao;", "itemsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lisabellaagm/com/github/android_lista_de_compras/model/ItemModel;", "getItemsLiveData", "()Landroidx/lifecycle/LiveData;", "addItem", "", "item", "", "removeItem", "app_debug"})
public final class ItemsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final isabellaagm.com.github.android_lista_de_compras.data.ItemDao itemDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<isabellaagm.com.github.android_lista_de_compras.model.ItemModel>> itemsLiveData = null;
    
    public ItemsViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<isabellaagm.com.github.android_lista_de_compras.model.ItemModel>> getItemsLiveData() {
        return null;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull
    java.lang.String item) {
    }
    
    public final void removeItem(@org.jetbrains.annotations.NotNull
    isabellaagm.com.github.android_lista_de_compras.model.ItemModel item) {
    }
}