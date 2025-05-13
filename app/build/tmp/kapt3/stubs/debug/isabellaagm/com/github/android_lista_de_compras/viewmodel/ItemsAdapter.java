package isabellaagm.com.github.android_lista_de_compras.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lisabellaagm/com/github/android_lista_de_compras/viewmodel/ItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lisabellaagm/com/github/android_lista_de_compras/viewmodel/ItemsAdapter$ItemViewHolder;", "onItemRemoved", "Lkotlin/Function1;", "Lisabellaagm/com/github/android_lista_de_compras/model/ItemModel;", "", "(Lkotlin/jvm/functions/Function1;)V", "items", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_debug"})
public final class ItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<isabellaagm.com.github.android_lista_de_compras.viewmodel.ItemsAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<isabellaagm.com.github.android_lista_de_compras.model.ItemModel, kotlin.Unit> onItemRemoved = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<isabellaagm.com.github.android_lista_de_compras.model.ItemModel> items;
    
    public ItemsAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super isabellaagm.com.github.android_lista_de_compras.model.ItemModel, kotlin.Unit> onItemRemoved) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public isabellaagm.com.github.android_lista_de_compras.viewmodel.ItemsAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    isabellaagm.com.github.android_lista_de_compras.viewmodel.ItemsAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lisabellaagm/com/github/android_lista_de_compras/viewmodel/ItemsAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lisabellaagm/com/github/android_lista_de_compras/viewmodel/ItemsAdapter;Landroid/view/View;)V", "button", "Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "getButton", "()Landroid/widget/ImageButton;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "bind", "", "item", "Lisabellaagm/com/github/android_lista_de_compras/model/ItemModel;", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView textView = null;
        private final android.widget.ImageButton button = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final android.widget.TextView getTextView() {
            return null;
        }
        
        public final android.widget.ImageButton getButton() {
            return null;
        }
        
        /**
         * Método que preenche os dados nas views.
         * @param item O item que será exibido neste ViewHolder.
         */
        public final void bind(@org.jetbrains.annotations.NotNull
        isabellaagm.com.github.android_lista_de_compras.model.ItemModel item) {
        }
    }
}