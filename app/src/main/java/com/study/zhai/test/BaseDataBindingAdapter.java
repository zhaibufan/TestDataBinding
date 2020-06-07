package com.study.zhai.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author zhaixiaofan
 * @date 2020-06-07 15:55
 */
public abstract class BaseDataBindingAdapter<M, V extends ViewDataBinding> extends RecyclerView.Adapter {

    protected Context mContext;

    protected List<M> mData;

    private LayoutInflater mInflater;

    protected BaseDataBindingAdapter(List<M> data, Context context) {
        mContext = context;
        mData = data;
        mInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public BaseBindViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        V dataBinding = DataBindingUtil.inflate(mInflater, getLayoutResId(), parent, false);
        return new BaseBindViewHolder(dataBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        V binding = DataBindingUtil.getBinding(holder.itemView);
        onBindItem(binding, mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    protected abstract int getLayoutResId();

    protected abstract void onBindItem(V mDataBinding, M m);


    class BaseBindViewHolder extends RecyclerView.ViewHolder {

        public BaseBindViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
