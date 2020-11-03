package com.example.lotto.databinding;
import com.example.lotto.R;
import com.example.lotto.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.first_lotto_num, 1);
        sViewsWithIds.put(R.id.number1, 2);
        sViewsWithIds.put(R.id.number2, 3);
        sViewsWithIds.put(R.id.number3, 4);
        sViewsWithIds.put(R.id.number4, 5);
        sViewsWithIds.put(R.id.number5, 6);
        sViewsWithIds.put(R.id.number6, 7);
        sViewsWithIds.put(R.id.sec_number1, 8);
        sViewsWithIds.put(R.id.sec_number2, 9);
        sViewsWithIds.put(R.id.sec_number3, 10);
        sViewsWithIds.put(R.id.sec_number4, 11);
        sViewsWithIds.put(R.id.sec_number5, 12);
        sViewsWithIds.put(R.id.sec_number6, 13);
        sViewsWithIds.put(R.id.lottie_wheel, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (com.airbnb.lottie.LottieAnimationView) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainActivity == variableId) {
            setMainActivity((com.example.lotto.ui.main.view.MainActivity) variable);
        }
        else if (BR.mainviewmodel == variableId) {
            setMainviewmodel((com.example.lotto.ui.main.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainActivity(@Nullable com.example.lotto.ui.main.view.MainActivity MainActivity) {
        this.mMainActivity = MainActivity;
    }
    public void setMainviewmodel(@Nullable com.example.lotto.ui.main.viewmodel.MainViewModel Mainviewmodel) {
        this.mMainviewmodel = Mainviewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainActivity
        flag 1 (0x2L): mainviewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}