package com.safe.setting.app.ui.widget.pinlockview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/safe/setting/app/ui/widget/pinlockview/PinLockAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "VIEW_TYPE_DELETE", "", "VIEW_TYPE_NUMBER", "VIEW_TYPE_OK", "mCustomizationOptionsBundle", "Lcom/safe/setting/app/ui/widget/pinlockview/CustomizationOptionsBundle;", "mKeyValues", "", "onPinButtonClickListener", "Lcom/safe/setting/app/ui/widget/pinlockview/PinLockAdapter$OnPinButtonClickListener;", "pinLength", "getPinLength", "()I", "setPinLength", "(I)V", "getAdjustKeyValues", "keyValues", "getItemCount", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCustomizationOptions", "", "customizationOptionsBundle", "setOnPinButtonClickListener", "OnPinButtonClickListener", "app_release"})
public abstract class PinLockAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_NUMBER = 0;
    private final int VIEW_TYPE_DELETE = 1;
    private final int VIEW_TYPE_OK = 2;
    @org.jetbrains.annotations.Nullable()
    private com.safe.setting.app.ui.widget.pinlockview.CustomizationOptionsBundle mCustomizationOptionsBundle;
    @org.jetbrains.annotations.Nullable()
    private com.safe.setting.app.ui.widget.pinlockview.PinLockAdapter.OnPinButtonClickListener onPinButtonClickListener;
    private int pinLength = 0;
    @org.jetbrains.annotations.NotNull()
    private final int[] mKeyValues = null;
    
    public PinLockAdapter() {
        super();
    }
    
    public final int getPinLength() {
        return 0;
    }
    
    public final void setPinLength(int p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final int[] getAdjustKeyValues(int[] keyValues) {
        return null;
    }
    
    public final void setCustomizationOptions(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.widget.pinlockview.CustomizationOptionsBundle customizationOptionsBundle) {
    }
    
    public final void setOnPinButtonClickListener(@org.jetbrains.annotations.NotNull()
    com.safe.setting.app.ui.widget.pinlockview.PinLockAdapter.OnPinButtonClickListener onPinButtonClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/safe/setting/app/ui/widget/pinlockview/PinLockAdapter$OnPinButtonClickListener;", "", "onConfirmClicked", "", "onDeleteClicked", "onDeleteLongClicked", "onNumberClicked", "keyValue", "", "app_release"})
    public static abstract interface OnPinButtonClickListener {
        
        public abstract void onNumberClicked(int keyValue);
        
        public abstract void onConfirmClicked();
        
        public abstract void onDeleteClicked();
        
        public abstract void onDeleteLongClicked();
    }
}