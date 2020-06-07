package com.study.zhai.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.study.zhai.test.databinding.ViewPager2ItemBinding;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author zhaixiaofan
 * @date 2020-06-07 11:35
 */
public class MyAdapter extends BaseDataBindingAdapter<VpItemBean, ViewPager2ItemBinding> {

    public MyAdapter(List<VpItemBean> data, Context context) {
        super(data, context);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.view_pager2_item;
    }

    @Override
    protected void onBindItem(ViewPager2ItemBinding binding, VpItemBean vpItemBean) {
        binding.setItemData(vpItemBean);
        binding.setClickEvent(new EventListener());
    }

    public class EventListener {
        public void toOtherAPP(View view) {
            Toast.makeText(mContext, "jjj", Toast.LENGTH_SHORT).show();
        }

        public void toOtherAPP2(View view) {
            Toast.makeText(mContext, "ddd", Toast.LENGTH_SHORT).show();
        }
    }
}
