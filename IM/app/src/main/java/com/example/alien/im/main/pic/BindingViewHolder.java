package com.example.alien.im.main.pic;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Alien on 2016/12/4.
 */

public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private T mBinding;
    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding=binding;
    }
    public T getmBinding(){
        return mBinding;
    }

}
